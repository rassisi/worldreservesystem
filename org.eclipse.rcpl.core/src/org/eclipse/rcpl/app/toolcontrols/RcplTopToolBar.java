/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl.app.toolcontrols;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.ITopToolbar;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOKey;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class RcplTopToolBar implements ITopToolbar {

	private HashMap<String, HBox> toolPaneRegistry = new HashMap<String, HBox>();

	private static final int EDITOR_TOP_BAR_HEIGHT = 122;

	// private static final int BROWSER_TOP_BAR_HEIGHT = 63; // 40;

	private IEditor editor;

	public RcplTopToolBar(StackPane parent) {
		Rcpl.topToolbar = this;
		init();
	}

	@Override
	public void init() {
		toolPaneRegistry.clear();
		Rcpl.UIC.getMainTopStack().getChildren().clear();

		try {
			if (JOSession.getDefault().getRcpl() != null) {
				for (Perspective p : JOSession.getDefault().getRcpl().getAllPerspectives().getChildren()) {

					IRcplPlugin useCase = null;
					if ("USECASE".equals(p.getId())) {
						for (IRcplPlugin u : Rcpl.rcplApplicationProvider.getRcplPlugins()) {
							if (u.getEmfModel() != null) {
								if (u.getEmfModel().getDefaultPerspective() == p) {
									useCase = u;
									break;
								}
							}
						}
					}
					if (useCase == null) {
						processTopBarMainGroups(p.getId(), useCase);
					}
				}
			}
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}

		processTopBarHomeGroups();
	}

	@Override
	public void expandAll() {
		if (collapsed) {
			collapse(false);
			Rcpl.UIC.expandLeftAra(true);
		}

	}

	public void registerToolPane(String perspectiveId, HBox flowPane) {
		toolPaneRegistry.put(perspectiveId, flowPane);
	}

	public HBox getToolPane(String perspective) {
		return toolPaneRegistry.get(perspective);
	}

	private List<Node> homeRibbons = new ArrayList<Node>();

	private boolean inHomeRibbonChange = false;

	/**
	 * Home Tab
	 */
	private void processTopBarHomeGroups() {
		final HBox pane = new HBox();

		pane.setPrefWidth(0);
		pane.setMinWidth(0);

		pane.setId("topBarHBox");
		Rcpl.UIC.getMainTopStack().getChildren().add(pane);

		registerToolPane(JOKey.HOME_TAB.name(), pane);

		createCustomRibbonGroup(pane, "My Cloud", "Show Documents in the Cloud", EnCommandId.homeShowOverview.name(),
				"internet_cloud", true, null);

		createCustomRibbonGroup(pane, "New", "New Document", "homeShowNew", "office_new", false, null);
		createCustomRibbonGroup(pane, "Samples", "Show Samples Page", EnCommandId.homeShowSamples.name(),
				"office_samples", false, null);

		if (Rcpl.isBigDisplay()) {
			if (!Rcpl.isMobile()) {
				createCustomRibbonGroup(pane, "What's New", "What's New", EnCommandId.homeShowWhatsNew.name(),
						"office_whatsnew", false, null);
			}
			createCustomRibbonGroup(pane, "Preferences", "Preferences", EnCommandId.homeShowPreferences.name(),
					"office_preferences", false, null);
			createCustomRibbonGroup(pane, "Contact Us", "Contact Us", EnCommandId.CONTACT_US.name(), "contact_us",
					false, null);
			if (!Rcpl.isMobile()) {
				createCustomRibbonGroup(pane, "Donation", "Show Donation Page", EnCommandId.homeShowDonation.name(),
						"donation", false, null);
			}
			createCustomRibbonGroup(pane, "Help", "Show Help Page", EnCommandId.homeShowTutorials.name(), "office_help",
					false, null);
			createCustomRibbonGroup(pane, "About", "About", EnCommandId.homeShowAbout.name(), "joffice", false, null);
		}

		pane.boundsInParentProperty().addListener(new ChangeListener<Bounds>() {

			@Override
			public void changed(ObservableValue<? extends Bounds> observable, Bounds oldValue, Bounds newValue) {

				if (inHomeRibbonChange) {
					return;
				}

				inHomeRibbonChange = true;

				double ribbonWidth = homeRibbons.get(0).getBoundsInParent().getWidth() + 6;

				pane.getChildren().clear();

				double x = 25;

				for (Node n : homeRibbons) {
					x += ribbonWidth;
					if (x <= newValue.getWidth()) {
						pane.getChildren().add(n);
						pane.layout();
						x += 12;
					}

				}
				inHomeRibbonChange = false;

			}
		});
	}

	private void processTopBarMainGroups(String type, IRcplPlugin useCase) {
		HBox pane = new HBox();
		Perspective perspective = JOSession.getDefault().findPerspective(type);
		pane.setId("topBarHBox");
		pane.setPadding(new Insets(3, 0, 0, 7));
		// Rcpl.UIC.getMainTopStack().getChildren().add(pane);
		// Rcpl.UIC.getMainTopStack().layout();
		registerToolPane(type, pane);
		processTopBar(pane, perspective.getTopToolBar(), useCase);
	}

	private void createCustomRibbonGroup(HBox pane, String name, String toolTip, String toolId, String toolImage,
			boolean firstGroup, IRcplPlugin useCase) {
		ToolGroup group = null;

		try {
			group = RcplFactory.eINSTANCE.createToolGroup();
			group.setName(name);
			Tool t = RcplFactory.eINSTANCE.createTool();
			t.setId(toolId);
			t.setImage(toolImage);
			group.getTools().add(t);
		} catch (Throwable ex) {
			RCPLModel.logError(ex);

		}
		Node ng = Rcpl.getFactory().createRibbonGroup(group, useCase, firstGroup, false);
		pane.getChildren().add(ng);

		homeRibbons.add(ng);

	}

	@Override
	public void processTopBarMainGroups(IRcplPlugin useCase) {
		if (useCase.getEmfModel() != null) {
			// !!!
			// if (new JOMigration().getUseCaseTopBar(useCase) != null) {
			// HBox pane = new HBox();
			// pane.setId("topBarHBox");
			// JO.UIC.getMainTopStack().getChildren().add(pane);
			// JO.UIC.getMainTopStack().layout();
			// registerToolPane(useCase.getId(), pane);
			// // !!!
			// // processTopBar(pane,
			// // new JOMigration().getUseCaseTopBar(useCase), useCase);
			// }
		}
	}

	private void processTopBar(HBox pane, TopToolBar topToolBar, IRcplPlugin useCase) {
		List<ToolGroup> toolGroups = topToolBar.getToolGroups();

		boolean first = true;
		for (AbstractTool eAbstractTool : toolGroups) {
			String id = eAbstractTool.getId();
			if ("topBar/URL_ADDRESS_TOOL_COMPONENT".equals(id)) {
				ITool toolNode = null;
				toolNode = Rcpl.getToolFactory().createURLAddressTool((ToolGroup) eAbstractTool);
				if (toolNode != null) {
					pane.getChildren().add(toolNode.getNode());
					HBox.setMargin(toolNode.getNode(), new Insets(0, 14, 0, 0));
				}
			} else {
				Node toolNode = null;
				toolNode = Rcpl.getFactory().createRibbonGroup((ToolGroup) eAbstractTool, useCase, first, true);
				if (toolNode != null) {
					pane.getChildren().add(toolNode);
					HBox.setMargin(toolNode, new Insets(3, 10, 7, 0));
				}
			}
			first = false;
		}
	}

	private boolean collapsed = false;

	double savedHeight = -1;

	HBox mainTopArea = null;

	@Override
	public void collapse(boolean collapse) {

		collapsed = collapse;

		if (collapse) {
			mainTopArea = null;
			Rcpl.UIC.setTopContent(null);
		} else {
			if (mainTopArea != null) {
				Rcpl.UIC.setTopContent(mainTopArea);
			}
			mainTopArea = null;
		}

		updateHeight();

		// if (PerspectiveType.WEB.equals(activePerspectiveType)) {
		// savedHeight = BROWSER_TOP_BAR_HEIGHT;
		// } else if (PerspectiveType.SETTINGS.equals(activePerspectiveType)) {
		// savedHeight = EDITOR_TOP_BAR_HEIGHT;
		// } else {
		// savedHeight = EDITOR_TOP_BAR_HEIGHT;
		// }

	}

	@Override
	public void updateUseCaseHeight() {
		savedHeight = EDITOR_TOP_BAR_HEIGHT;
		Rcpl.UIC.setTopAreaHeight(savedHeight);
	}

	@Override
	public void updateHeight() {

		// String persp = Rcpl.UIC.getPerspective().getId();

		// if ("MAIN_PERSPECTIVE".equals(persp)) {
		// savedHeight = EDITOR_TOP_BAR_HEIGHT;
		// } else
		//

		hideAll();

		{

			if (Rcpl.UIC.getPerspective() != null) {

				hideAll();
				// if
				// ("PRESENTATION".equals(Rcpl.UIC.getActivePerspectiveType()))
				// {
				// savedHeight = EDITOR_TOP_BAR_HEIGHT;
				// } else if
				// ("SETTINGS".equals(Rcpl.UIC.getActivePerspectiveType())) {
				// savedHeight = EDITOR_TOP_BAR_HEIGHT;
				// } else if
				// ("SPREADSHEET".equals(Rcpl.UIC.getActivePerspectiveType())) {
				// savedHeight = EDITOR_TOP_BAR_HEIGHT;
				// } else if ("WEB".equals(Rcpl.UIC.getActivePerspectiveType()))
				// {
				// savedHeight = EDITOR_TOP_BAR_HEIGHT;
				// } else if
				// ("WORD".equals(Rcpl.UIC.getActivePerspectiveType())) {
				// savedHeight = EDITOR_TOP_BAR_HEIGHT;
				// } else if
				// ("USECASE".equals(Rcpl.UIC.getActivePerspectiveType())) {
				// savedHeight = EDITOR_TOP_BAR_HEIGHT;
				// }

			}

			savedHeight = 30;
		}
		Rcpl.UIC.setTopAreaHeight(savedHeight);
	}

	@Override
	public void show(final String perspective) {

		// javafx.application.Platform.runLater(new Runnable() {
		//
		// @Override
		// public void run() {
		// String key = null;
		// if (perspective == null) {
		// key = JOKey.HOME_TAB.name();
		// if (key != null) {
		// Rcpl.UIC.getMainTopStack().getChildren().clear();
		//
		// Node n = toolPaneRegistry.get(key);
		// if (n != null) {
		// Rcpl.UIC.getMainTopStack().getChildren().add(n);
		// }
		// }
		// collapsed = true;
		// collapse(false);
		// } else {
		// Rcpl.UIC.setActivePerspectiveType(perspective);
		// if (perspective != null) {
		// key = perspective;
		// }
		// updateHeight();
		// }
		//
		// }
		// });
	}

	@Override
	public void hideAll() {
		if (Platform.isFxApplicationThread()) {
			Rcpl.UIC.getMainTopStack().getChildren().clear();
			savedHeight = 30;
			Rcpl.UIC.setTopAreaHeight(savedHeight);
		} else {
			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					Rcpl.UIC.getMainTopStack().getChildren().clear();
					savedHeight = 30;
					Rcpl.UIC.setTopAreaHeight(savedHeight);
				}
			});
		}
	}

	@Override
	public void show(final IRcplPlugin rcplPlugin) {
		// javafx.application.Platform.runLater(new Runnable() {
		//
		// @Override
		// public void run() {
		// Rcpl.UIC.getMainTopStack().getChildren().clear();
		// Node n = toolPaneRegistry.get(rcplPlugin.getId());
		// if (n != null) {
		// Rcpl.UIC.setActivePerspectiveType("USECASE");
		// Rcpl.UIC.setActiveUseCaseId(rcplPlugin.getId());
		// Rcpl.UIC.getMainTopStack().getChildren().add(n);
		// }
		// collapsed = true;
		// collapse(false);
		// updateUseCaseHeight();
		// }
		// });
	}

	public boolean isCollapsed() {
		return collapsed;
	}

	public IEditor getEditor() {
		return editor;
	}

	@Override
	public void setEditor(IEditor editor) {
		this.editor = editor;
	}

}
