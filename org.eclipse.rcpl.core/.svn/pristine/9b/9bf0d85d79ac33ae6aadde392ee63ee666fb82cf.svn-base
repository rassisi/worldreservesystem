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

import org.eclipse.emf.common.util.EList;
import org.eclipse.rcpl.DelayedExecution;
import org.eclipse.rcpl.IButton;
import org.eclipse.rcpl.IButtonListener;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.INavigatorPlugin;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.ISideToolBar;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.tools.ColorTool;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.GroupType;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolType;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;
import javafx.util.Duration;

/**
 * @author ramin
 *
 */
public class RcplSideToolBar implements ISideToolBar {

	class AccordionColorTitlePane extends TitledPane {
		private Pane pane;
		private Rectangle rect;
		private ToolGroup toolGroup;

		AccordionColorTitlePane(ToolGroup toolGroup, Node node, int hierarchy) {
			super(toolGroup.getName(), node);
			this.toolGroup = toolGroup;
			titlePaneRegistry.put(toolGroup.getId(), this);
			setTextAlignment(TextAlignment.CENTER);
			setGraphicTextGap(10);
			setAnimated(false);
			if (hierarchy == 0) {
				setText("");
				setUnderline(true);
			} else if (hierarchy > 1) {
				setPadding(new Insets(0, 0, 0, 20));
			}

			if (hierarchy == 0) {

				setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						double y = event.getY();

						if (y < 40) {
							collapseToolPane();
						}
					}
				});
			}

		}

		public ToolGroup getToolGroup() {
			return toolGroup;
		}

		void setColor(Tool colorTool, Color color, boolean update) {
			if (rect == null) {
				pane = new HBox();
				rect = new Rectangle();
				pane.getChildren().add(rect);
				HBox.setMargin(rect, new Insets(8));
				rect.setWidth(40);
				rect.setHeight(16);
				Effect e = new DropShadow();
				rect.setEffect(e);
				setGraphic(pane);
				if (update) {

					// String format = colorTool.getFormat();
					// colorTool.getColorToolColor().setRed(color.getRed());
					// colorTool.getColorToolColor().setGreen(color.getGreen());
					// colorTool.getColorToolColor().setBlue(color.getBlue());
				}
			}
			rect.setFill(color);
		}
	}

	private HashMap<String, AccordionColorTitlePane> titlePaneRegistry = new HashMap<String, AccordionColorTitlePane>();

	private StackPane toolbarStack;

	private StackPane toolPaneStack;

	private HashMap<String, VBox> toolPaneStackRegistry = new HashMap<String, VBox>();

	private HashMap<String, ToolBar> toolbarRegistry = new HashMap<String, ToolBar>();

	boolean startMenu;

	double lastMinWidth = 0;

	double lastMaxWidth = 0;

	private boolean toolsGroupSelected = false;

	private boolean startMenuSelected = false;

	Node firstNode;

	private HBox parent;

	int count = 0;

	private String activeGroupId = "";

	private Pane activeToolPane;

	private List<Object> processedList = new ArrayList<Object>();

	public RcplSideToolBar(HBox parent) {
		this.parent = parent;
		init();
	}

	private IEditor editor;

	/**
	 * Nur die Groupbuttons sind zu sehen
	 */
	@Override
	public void collapseToolPane() {
		parent.setMaxWidth(WIDTH_COLLAPSED);
		parent.setMinWidth(WIDTH_COLLAPSED);
		parent.setPrefWidth(WIDTH_COLLAPSED);
		BorderPane.setMargin(Rcpl.UIC.getMainBottomArea(), new Insets(0, 0, 0, WIDTH_COLLAPSED_BOTTOM));
		activeGroupId = null;
		toolPaneStack.getChildren().clear();
	}

	private ITool createColorTool(final Tool eTool, Pane flowPane, final AccordionColorTitlePane titlePane) {

		final ColorTool ct = new ColorTool(eTool);

		return ct;
	}

	/**
	 * @param groupId
	 */
	private void expandToolPane(String groupId) {

		try {
			try {
				Pane pane = toolPaneStackRegistry.get(getKey(getPerspectiveId(), groupId));
				toolPaneStack.getChildren().clear();
				toolPaneStack.getChildren().add(pane);
				pane.setVisible(true);

			} catch (Exception ex) {
				RCPLModel.logError(ex);
			}

			if ("images".equals(groupId)) {
				parent.setMaxWidth(WIDTH_EXPANDED_IMAGES);
				parent.setMinWidth(WIDTH_EXPANDED_IMAGES);
				parent.setPrefWidth(WIDTH_EXPANDED_IMAGES);
			} else {
				parent.setMaxWidth(WIDTH_EXPANDED_1);
				parent.setMinWidth(WIDTH_EXPANDED_1);
				parent.setPrefWidth(WIDTH_EXPANDED_1);
			}

		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	private String getPerspectiveId() {
		return Rcpl.UIC.getPerspective().getId();
	}

	/**
	 * To get a ToolBar for a perspective
	 * 
	 * @param perspective
	 * @param pluginId
	 * @return
	 */
	private String getKey(String perspective) {
		return "PERSPECTIVE_" + perspective;
	}

	/**
	 * To get a tool pane
	 * 
	 * @param perspective
	 * @param pluginId
	 * @param id
	 * @return
	 */
	private String getKey(String perspective, String groupId) {
		return "PERSPECTIVE_GROUP_ID_" + perspective + groupId;
	}

	private void expandAccordion() {
		try {
			if (activeToolPane != null) {
				for (Node n : activeToolPane.getChildren()) {

					if (n instanceof Accordion) {

						final Accordion acc = (Accordion) n;
						for (TitledPane p : acc.getPanes()) {
							if (p instanceof AccordionColorTitlePane) {
								final AccordionColorTitlePane ap = (AccordionColorTitlePane) p;

								Platform.runLater(new Runnable() {
									@Override
									public void run() {
										ap.setExpanded(true);
										// always expand first child

										acc.layout();

										if (!ap.getToolGroup().getToolGroups().isEmpty()) {

											final AccordionColorTitlePane tp1 = getTitlePane(
													ap.getToolGroup().getToolGroups().get(0));
											if (tp1 != null) {
												new DelayedExecution(10) {
													@Override
													protected void execute() {
														tp1.setExpanded(true);
														tp1.layout();

													};
												};
												if (!tp1.getToolGroup().getToolGroups().isEmpty()) {

													final AccordionColorTitlePane tp2 = getTitlePane(
															tp1.getToolGroup().getToolGroups().get(0));
													if (tp2 != null) {

														new DelayedExecution(10) {
															@Override
															protected void execute() {
																tp2.setExpanded(true);
																tp2.layout();

															};
														};

													}

													if (tp2 != null && !tp2.getToolGroup().getToolGroups().isEmpty()) {

														final AccordionColorTitlePane tp3 = getTitlePane(
																tp2.getToolGroup().getToolGroups().get(0));
														if (tp3 != null) {

															new DelayedExecution(300) {
																@Override
																protected void execute() {
																	tp3.setExpanded(true);
																	tp3.layout();

																};
															};

														}

													}

												}
											}

										}

									}
								});

							}

							break;

						}
						// ToolGroup g = (ToolGroup) n.getUserData();
						// String gid = g.getToolId();
						break;
					}
				}
			}
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}

	}

	@Override
	public void expandHierarchy2() {
	}

	public Node getFirstNode() {
		return firstNode;
	}

	private AccordionColorTitlePane getTitlePane(ToolGroup group) {
		return titlePaneRegistry.get(group.getId());
	}

	private EList<ToolGroup> getToolGroups(Perspective perspective) {
		return perspective.getSideToolBar().getToolGroups();
	}

	private boolean groupHasAccordionItems(ToolGroup toolGroup) {

		for (ToolGroup t : toolGroup.getToolGroups()) {
			if (t.getType() == null || GroupType.ACCORDIONITEM.equals(t.getType())) {
				return true;
			}
		}

		return false;
	}

	@Override
	public void init() {
		this.parent.getChildren().clear();
		toolbarStack = new StackPane();
		HBox.setMargin(toolbarStack, new Insets(0, 0, 0, -6));
		toolPaneStack = new StackPane();
		this.parent.getChildren().addAll(toolbarStack, toolPaneStack);
	}

	public boolean isStartMenuSelected() {
		return startMenuSelected;
	}

	public boolean isToolsGroupSelected() {
		return toolsGroupSelected;
	}

	/**
	 * Create all accordions
	 * 
	 * @param toolGroup
	 * @param accordion
	 * @param titlePane
	 */
	private void createAccordion(ToolGroup toolGroup, Accordion accordion, AccordionColorTitlePane titlePane,
			int hierarchy) {

		// ---------- If there are no top level groups then process only Tools -

		if (!groupHasAccordionItems(toolGroup)) {
			processTools(toolGroup, accordion, hierarchy);
			return;
		}

		// ---------- creae new accordion & request Focus ----------------------

		if (!toolGroup.getToolGroups().isEmpty()) {
			Accordion newAccordion = new Accordion() {
				@Override
				public void requestFocus() {
					try {
						super.requestFocus();
					} catch (Exception ex) {
						RCPLModel.logError(ex);
					}
				};
			};
			titlePane = new AccordionColorTitlePane(toolGroup, newAccordion, hierarchy);
			updateImage(toolGroup, titlePane, hierarchy);
			accordion.getPanes().add(titlePane);
			accordion = newAccordion;
		}

		// ---------- process all groups ---------------------------------------

		for (ToolGroup accordionGroup : toolGroup.getToolGroups()) {
			if (accordionGroup.getType() == null || GroupType.ACCORDIONITEM.equals(accordionGroup.getType())) {
				createAccordion(accordionGroup, accordion, titlePane, hierarchy + 1);
			}
		}

	}

	/**
	 * @param toolGroupToolBar
	 * @param perspectiveType
	 * @param toolGroup
	 */
	private void processMainToolGroupButtons(final ToolBar toolGroupToolBar, final Perspective perspectiveType,
			final ToolGroup toolGroup) {

		String imageName = toolGroup.getImage();

		IButton b = Rcpl.getFactory().createButton(toolGroup.getId(), toolGroup.getName(), toolGroup.getToolTip(),
				imageName, false, null, false);

		if (!Rcpl.isBigDisplay()) {
			b.setWidth(16);
			b.setHeight(16);

		} else {
			b.setWidth(18);
			b.setHeight(18);
		}

		b.setButtonListener(new IButtonListener() {

			@Override
			public void doAction() {
				try {

					String groupId0 = toolGroup.getId();

					if ("logout".equals(groupId0)) {
						Rcpl.UIC.actionLogout();
						return;
					}

					if (groupId0.equals(activeGroupId)) {
						collapseToolPane();
					} else {
						showSideTools(groupId0, true);
					}
				} catch (Throwable ex) {
					RCPLModel.logError(ex);
				}
			}
		});

		Tooltip toolTip = new Tooltip(toolGroup.getToolTip() != null ? toolGroup.getToolTip() : toolGroup.getName());
		toolTip.setId("joffice_tooltip");

		toolGroupToolBar.getItems().add(b.getNode());

	}

	private void processPerspectiveGroups(String perspectiveId) {
		Perspective perspective = JOSession.getDefault().findPerspective(perspectiveId);
		if (perspective != null) {
			ToolBar groupsToolBar = new ToolBar();
			if (JOSession.PERSPECTIVE_OVERVIEW.getId().equals(perspectiveId)) {
				StackPane.setMargin(groupsToolBar, new Insets(40, 0, 0, 0));
			}
			groupsToolBar.setOrientation(Orientation.VERTICAL);
			groupsToolBar.setMinWidth(WIDTH_COLLAPSED);
			groupsToolBar.setId("groupVBox");
			toolbarRegistry.put(getKey(perspectiveId), groupsToolBar);
			processToolGroups(perspective, groupsToolBar, false);
		}
	}

	private void processTool(final Tool tool, Pane pane, final AccordionColorTitlePane titlePane) {

		try {
			String image = tool.getImage();
			if (image == null || image.length() == 0) {
				image = tool.getId();
			}

			final ITool node;

			if ("fontName".equals(tool.getId())) {
				node = Rcpl.getToolFactory().createTool(tool);
			} else if ("fontSize".equals(tool.getId())) {
				node = Rcpl.getToolFactory().createTool(tool);
			} else {
				switch (tool.getType()) {
				case COLOR_CHOOSER:
					node = createColorTool(tool, pane, titlePane);
					break;

				case OTHER:
					node = Rcpl.getToolFactory().createTool(tool);
					break;
				default:
					node = Rcpl.getToolFactory().createTool(tool);
					break;
				}
			}

			final ITool nodeCreated = node;
			if (node != null) {
				if (pane instanceof GridPane) {
					int x = tool.getGridX();
					int y = tool.getGridY();
					int spanX = tool.getSpanX();
					int spanY = tool.getSpanY();
					if (tool.isLabeled()) {
						Label label = new Label(tool.getName());
						((GridPane) pane).add(label, x, y, 1, 1);
						x++;
					}

					try {
						((GridPane) pane).add(node.getNode(), x, y, spanX, spanY);
					} catch (Exception ex) {
						RCPLModel.logError(ex);
					}
					GridPane.setMargin(node.getNode(), new Insets(5));
				} else {
					FlowPane.setMargin(node.getNode(), new Insets(3));
					try {
						pane.getChildren().add(node.getNode());
					} catch (Exception ex) {
						RCPLModel.logError(ex);
					}
				}
				node.getNode().setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						if (nodeCreated instanceof ListView<?>) {
							if (arg0.getClickCount() == 2) {
								Rcpl.service().execute(Rcpl.getFactory().createCommand(getEditor(), node));
							}
						}
					}
				});
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	private void processToolGroups(final List<ToolGroup> toolGroups, final Perspective perspective, boolean startMenu) {

		this.startMenu = startMenu;

		final double screenHeight = Screen.getPrimary().getBounds().getHeight();

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				for (ToolGroup toolGroup_0 : toolGroups) {

					EList<ToolGroup> mainGroups = toolGroup_0.getToolGroups();
					if (mainGroups.isEmpty()) {
						continue;
					}

					try {
						VBox sideToolsVbox = new VBox(2);
						sideToolsVbox.setPrefHeight(100);
						sideToolsVbox.setPrefWidth(304);

						toolPaneStackRegistry.put(getKey(perspective.getId(), toolGroup_0.getId()), sideToolsVbox);

						sideToolsVbox.setPrefHeight(screenHeight);

						// ---------- accordion -----------

						Accordion accordion = new Accordion();

						accordion.expandedPaneProperty().addListener(new ChangeListener<TitledPane>() {
							@Override
							public void changed(ObservableValue<? extends TitledPane> property,
									final TitledPane oldPane, final TitledPane newPane) {
								if (oldPane != null)
									oldPane.setCollapsible(true);
								if (newPane != null)
									Platform.runLater(new Runnable() {
										@Override
										public void run() {
											newPane.setCollapsible(false);
										}
									});
							}
						});

						accordion.setUserData(toolGroup_0);
						accordion.setId("sideBarAccordion");
						accordion.setPrefHeight(screenHeight);
						accordion.setPrefWidth(WIDTH_EXPANDED_1);
						sideToolsVbox.getChildren().add(accordion);

						createAccordion(toolGroup_0, accordion, null, 0);

						toolGroup_0.setReady(true);
					} catch (Exception ex) {
						RCPLModel.logError(ex);
					}
				}

				// selectFirstGroup(perspective, useCase, toolGroups, false);
			}
		});

	}

	/**
	 * @param perspective
	 * @param startMenu
	 * @return
	 */
	protected void processToolGroups(final Perspective perspective, ToolBar toolBar, boolean startMenu) {
		List<ToolGroup> toolGroups = getToolGroups(perspective);
		for (ToolGroup toolGroup : toolGroups) {
			processMainToolGroupButtons(toolBar, perspective, toolGroup);
		}
		processToolGroups(toolGroups, perspective, startMenu);
	}

	private void processTools(ToolGroup toolGroup, Accordion accordion, int hierarchy) {

		try {
			final StackPane stackPane = new StackPane();

			AccordionColorTitlePane titlePane = new AccordionColorTitlePane(toolGroup, stackPane, hierarchy);

			updateImage(toolGroup, titlePane, hierarchy);
			accordion.getPanes().add(titlePane);
			ScrollPane scrollPane = new ScrollPane();
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			StackPane.setMargin(scrollPane, new Insets(0));
			stackPane.getChildren().add(scrollPane);

			if (toolGroup.getTools().size() == 1 && ToolType.NAVIGATOR.equals(toolGroup.getTools().get(0).getType())) {

				try {
					INavigatorPlugin navigatorPlugin = Rcpl.UIC.getNavigator();

					if (navigatorPlugin != null) {
						navigatorPlugin.setTool(toolGroup.getTools().get(0));
						scrollPane.setContent(navigatorPlugin.getNode());
					}
				} catch (Throwable ex) {
					RCPLModel.logError(ex);
				}
				return;
			}

			Pane pane;
			VBox vBox2 = new VBox();

			if (toolGroup.isGrid()) {
				GridPane gridPane = new GridPane();
				// gridPane.setStyle("-fx-background-color:green");
				// gridPane.setId("accordeonItemPaneId");
				vBox2.getChildren().add(gridPane);
				VBox.setMargin(gridPane, new Insets(MARGIN_BOX_1));
				VBox.setVgrow(gridPane, Priority.ALWAYS);
				pane = gridPane;
			} else {
				FlowPane toolFlowPane = new FlowPane();
				// toolFlowPane.setStyle("-fx-background-color: orange");
				toolFlowPane.setHgap(3);
				toolFlowPane.setVgap(3);
				// toolFlowPane.setId("accordeonItemPaneId");
				vBox2.getChildren().add(toolFlowPane);
				VBox.setMargin(toolFlowPane, new Insets(MARGIN_BOX_1));
				VBox.setVgrow(toolFlowPane, Priority.ALWAYS);
				pane = toolFlowPane;
			}

			scrollPane.setContent(vBox2);
			// scrollPane.setStyle("-fx-background-color: gold");

			for (ToolGroup g : toolGroup.getToolGroups()) {
				if (GroupType.GRIDPANE.equals(g.getType())) {
					GridPane gp = new GridPane();
					gp.setId("verticalGradientPane");
					if (toolGroup.isGrid()) {
						int x = g.getGridX();
						int y = g.getGridY();
						int spanX = g.getSpanX();
						int spanY = g.getSpanY();
						((GridPane) pane).add(gp, x, y, spanX, spanY);
						GridPane.setMargin(gp, new Insets(5));
						GridPane.setHgrow(gp, Priority.ALWAYS);
						// ((GridPane) gp).setGridLinesVisible(true);
					} else {
						pane.getChildren().add(gp);
					}
					for (Tool t : g.getTools()) {
						processTool(t, gp, titlePane);
					}
				}
			}

			for (Tool tool : toolGroup.getTools()) {
				processTool(tool, pane, titlePane);
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	public void selectFirstGroup(final String perspective, IRcplPlugin useCase, EList<ToolGroup> tools,
			boolean restoreTab) {
		if (!tools.isEmpty()) {
			for (ToolGroup t : tools) {
				showSideTools(t.getId(), restoreTab);
				break;
			}
		}
	}

	public void setStartMenuSelected(boolean startMenuSelected) {
		this.startMenuSelected = startMenuSelected;
	}

	@Override
	public void showGroup(String groupId, boolean collapse) {

		// System.out.println("Show " + groupId + " Group");
		//
		// try {
		//
		// if (groupId != null) {
		// ToolBar n = toolbarRegistry.get(getKey(groupId));
		// // toolbarStack.getChildren().clear();
		// if (n != null) {
		// toolbarStack.getChildren().remove(n);
		// toolbarStack.getChildren().add(n);
		// // if (!toolbarStack.getChildren().contains(n)) {
		// // toolbarStack.getChildren().add(n);
		// // }
		// n.setVisible(true);
		// }
		// }
		//
		// } catch (Throwable ex) {
		// RCPLModel.logError(ex);
		// }
	}

	@Override
	public void showPerspective(Perspective perspective, boolean collapse) {
		System.out.println("Show " + perspective.getId() + " Perspective");
		boolean isPerspectivesOverview = JOSession.PERSPECTIVE_OVERVIEW.getId().equals(perspective.getId());
		Rcpl.UIC.showStartMenuButton(!isPerspectivesOverview);
		try {
			if (!processedList.contains(perspective.getId())) {
				processedList.add(perspective.getId());
				processPerspectiveGroups(perspective.getId());
			}

			ToolBar n = toolbarRegistry.get(getKey(perspective.getId()));
			toolbarStack.getChildren().clear();
			if (n != null) {
				toolbarStack.getChildren().add(n);
				n.setVisible(true);
			}
			collapseToolPane();

		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	/**
	 * This method shows all perspectives & general tools - log off
	 * 
	 */
	@Override
	public void showHomeTools() {
		showPerspective(JOSession.PERSPECTIVE_OVERVIEW, true);
	}

	@Override
	public void showSideTools() {
		String id = activeGroupId;
		activeGroupId = "";
		showSideTools(id, true);
	}

	private boolean showSideTools(final String groupId, boolean restoreTab) {

		try {
			if (groupId == null || groupId.length() == 0) {
				return false;
			}
			if (!JOSession.PERSPECTIVE_OVERVIEW.getId().equals(Rcpl.UIC.getPerspective().getId())) {
				if (restoreTab) {
					Rcpl.UIC.showTabPane();
					Rcpl.UIC.restoreTab();
				}
			}

			Pane pane = toolPaneStackRegistry.get(getKey(Rcpl.UIC.getPerspective().getId(), groupId));
			if (pane != null) {
				pane.setVisible(true);
				activeToolPane = pane;
				activeGroupId = groupId;

				final Timeline timeline = new Timeline(
						new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent actionEvent) {
								expandAccordion();
								expandToolPane(groupId);

							}
						}));
				timeline.setCycleCount(1);
				timeline.play();

				return true;
			} else {
				activeToolPane = null;
			}
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
		return false;
	}

	private void updateImage(ToolGroup toolGroup, AccordionColorTitlePane titlePane, int hierarchy) {
		try {
			if (titlePane != null) {
				String iconName = toolGroup.getImage();
				if (iconName == null) {
					iconName = toolGroup.getId();
				}
				String imageName = iconName;

				double width;
				double height;

				switch (hierarchy) {
				case 0:
					width = 32;
					height = 32;
					break;
				case 1:
					width = 24;
					height = 24;
					break;
				default:
					width = 16;
					height = 16;
					break;
				}

				HBox hBox = new HBox();
				hBox.setAlignment(Pos.CENTER);

				Node image = Rcpl.resources().getImage(imageName, width, height).getNode();

				if (image != null) {
					hBox.getChildren().add(image);
				} else {

				}

				if (hierarchy == 0) {
					hBox.setMinHeight(50);
					Text headerText = new Text(toolGroup.getName());
					InnerShadow is = new InnerShadow();
					is.setOffsetX(2.0f);
					is.setOffsetY(2.0f);
					headerText.setEffect(is);
					headerText.setFont(Font.font(null, FontWeight.BOLD, 22));
					HBox.setMargin(headerText, new Insets(0, 0, 0, 20));
					hBox.getChildren().add(headerText);
					headerText.setOpacity(0.8);

					String format = toolGroup.getFormat();
					if (!toolGroup.getTools().isEmpty() && format != null && format.indexOf("{HEADER}") != -1) {
						if (!ToolType.NAVIGATOR.equals(toolGroup.getTools().get(0).getType())) {
							ITool n = Rcpl.getToolFactory().createTool(toolGroup.getTools().get(0));
							if (n instanceof ComboBox<?>) {
								((ComboBox<?>) n).setEditable(true);
							}
							HBox.setMargin(n.getNode(), new Insets(0, 0, 0, 10));
							hBox.getChildren().add(n.getNode());
						}
					}

					headerText.setFill(Color.WHITE);

				}

				titlePane.setGraphic(hBox);
			}
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	public IEditor getEditor() {
		return editor;
	}

	@Override
	public void setEditor(IEditor editor) {
		this.editor = editor;
	}

}
