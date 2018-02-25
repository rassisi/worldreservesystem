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
package org.eclipse.rcpl;

import java.io.File;
import java.util.HashMap;

import org.eclipse.rcpl.app.toolcontrols.RcplSideToolBar;
import org.eclipse.rcpl.app.toolcontrols.RcplTopToolBar;
import org.eclipse.rcpl.homepages.JOContactUsHomePage;
import org.eclipse.rcpl.homepages.JODefaultHomePage;
import org.eclipse.rcpl.homepages.JOHTMLHomePage;
import org.eclipse.rcpl.homepages.JOHTMLReadOnlyHomePage;
import org.eclipse.rcpl.homepages.JOOverviewHomePage;
import org.eclipse.rcpl.homepages.JOPreferencesHomePage;
import org.eclipse.rcpl.homepages.JOWebHomePage;
import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.internal.impl.RcplToolFactory;
import org.eclipse.rcpl.internal.resources.JOColorProvider;
import org.eclipse.rcpl.internal.resources.JOResources;
import org.eclipse.rcpl.internal.services.RcplService;
import org.eclipse.rcpl.internal.tools.JORibbonGroup;
import org.eclipse.rcpl.internal.tools.UndoRedoTool;
import org.eclipse.rcpl.model.IResources;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar;

import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 * 
 */
public class BasicFactory implements IRcplFactory {

	// public IResizableStackPane createResizableStackPane(Stage stage) {
	// return new ResizableStackPane(stage);
	// }

	@Override
	public IButton createButton(String id, String name, String toolTip, String imageName, boolean toggle,
			IButtonListener buttonListener, boolean systemButton) {
		IButton b = new JOButton(id, name, toolTip, imageName, toggle);
		b.setButtonListener(buttonListener);
		if (systemButton) {
			b.setSystemButton();
		}
		return b;
	}

	public final static int NO_TOOLBAR = 1;

	public final static int NO_STATUSBAR = 1 << 1;

	public final static int NO_TABS = 1 << 2;

	public final static int ECLIPSE = 1 << 3;

	public final static int ONLY_BROWSER = 1 << 4;

	public final static int ONLY_OFFICE = 1 << 5;

	public final static int NO_STARTBUTTON = 1 << 6;

	public final static int NO_QUICKTOOLS = 1 << 7;

	public final static int NO_DOWNLOADS = 1 << 8;

	public final static int NO_UPDATES = 1 << 9;

	public final static int NO_MAINPAGE = 1 << 10;

	@Override
	public IUndoRedoListener createUndoRedoTool() {
		return new UndoRedoTool();
	}

	@Override
	public ICommand createCommand(IEditor editor, EnCommandId commandId, ILayoutObject layoutObject, Object[] oldData,
			Object... newData) {
		return new RcplCommand(editor, commandId, layoutObject, null, oldData, newData);
	}

	@Override
	public ICommand createCommand(IEditor editor, ITool tool) {
		ILayoutObject l = null;
		if (editor != null) {
			l = editor.getSelectedLayoutObject();
		}
		return createCommand(editor, tool, l, new Object[0], new Object[0]);
	}

	@Override
	public ICommand createCommand(IEditor editor, ITool tool, ILayoutObject layoutObject, Object[] oldData,
			Object... newData) {

		try {
			String sId = tool.getTool().getService();
			EnServiceId serviceId = EnServiceId.DEFAULT_SERVICE;

			if (sId != null) {
				serviceId = EnServiceId.valueOf(sId);
			}
			if (serviceId == null) {
				serviceId = EnServiceId.DEFAULT_SERVICE;
			}
			EnCommandId commandId = null;

			String id = tool.getTool().getId();
			try {
				commandId = EnCommandId.valueOf(id);
			} catch (Exception ex) {
				commandId = EnCommandId.NO_COMMAND;
			}

			switch (tool.getTool().getType()) {
			case BUTTON:
				break;
			case CHECKBOX:
				break;
			case CHOICEBOX:
				break;
			case COLOR_CHOOSER:
				break;
			case COMBO:
				break;
			case DATEANDTIMEFIELD:
				break;
			case DATEFIELD:
				break;
			case FLOWPANE:
				break;
			case GRIDPANE:
				break;
			case HTMLEDITOR:
				break;
			case HYPERLINK:
				break;
			case IMAGEVIEW:
				break;
			case LABEL:
				break;
			case LISTVIEW:
				break;
			case MENUBAR:
				break;
			case MENUBUTTON:
				break;
			case NAVIGATOR:
				break;
			case OTHER:
				break;
			case PASSWORDFIELD:
				break;
			case PROGRESSBAR:
				break;
			case PROGRESSINDICATOR:
				break;
			case RADIOBUTTON:
				break;
			case SEPARATOR_HORIZONTAL:
				break;
			case SEPARATOR_VERTICAL:
				break;
			case SLIDER_HORIZONTAL:
				break;
			case SLIDER_VERTICAL:
				break;
			case SPLITMENUBUTTON:
				break;
			case TEXTAREA:
				break;
			case TEXTFIELD:
				break;
			case TOGGLEBUTTON:
				JOButton b = (JOButton) tool.getTool().getData();
				newData = new Object[] { b.isSelected() };
				oldData = new Object[] { !b.isSelected() };
				break;
			case WEBVIEW:
				break;
			default:
				break;
			}

			return new RcplCommand(editor, commandId, layoutObject, tool, oldData, newData);
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return null;
		}
	}

	@Override
	public Node createRibbonGroup(ToolGroup group, IRcplPlugin useCase, boolean first, boolean dialogButton) {
		return new JORibbonGroup(group, first, dialogButton).get();
	}

	@Override
	public ISideToolBar createSideToolBar(HBox parent) {
		return new RcplSideToolBar(parent);
	}

	@Override
	public ITopToolbar createTopToolBar(StackPane stackPane) {
		return new RcplTopToolBar(stackPane);
	}

	@Override
	public IHomePage createDefaultHomePage(IRcplUic uic, String title, String image) {
		return new JODefaultHomePage(uic, title, image);
	}

	@Override
	public IHomePage createWebHomePage(IRcplUic uic, String title, String url, String image) {
		return new JOWebHomePage(uic, title, url, image);
	}

	@Override
	public Perspective createPerspective(String id, String name, String image) {
		Perspective perspective = RcplFactory.eINSTANCE.createPerspective();
		perspective.setId(id);
		perspective.setName(name);
		perspective.setImage(image);
		SideToolBar st = RcplFactory.eINSTANCE.createSideToolBar();
		TopToolBar tt = RcplFactory.eINSTANCE.createTopToolBar();
		perspective.setSideToolBar(st);
		perspective.setTopToolBar(tt);
		getJOffice().getAllPerspectives().getChildren().add(perspective);
		return perspective;
	}

	private RCPL getJOffice() {
		return JOSession.getDefault().getRcpl();
	}

	@Override
	public IButton createButton(ToolGroup g, boolean toggle, boolean systemButton, IButtonListener buttonListener) {
		return createButton(g.getId(), g.getName(), g.getToolTip(), g.getImage(), toggle, buttonListener, systemButton);
	}

	@Override
	public IHomePage createHTMLHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane) {
		return new JOHTMLHomePage(uic, title, documentTemplate, image, wordReplacements, controlPane);

	}

	@Override
	public IHomePage createHTMLReadOnlyHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane) {
		return new JOHTMLReadOnlyHomePage(uic, title, documentTemplate, image, wordReplacements, controlPane);

	}

	@Override
	public IHomePage createOverviewHomePage(IRcplUic uic, String title, String image) {
		return new JOOverviewHomePage(uic, title, image);
	}

	@Override
	public IHomePage createPreferencesHomePage(IRcplUic uic, String title, String image) {
		return new JOPreferencesHomePage(uic, title, image);
	}

	@Override
	public IHomePage createContactUsHomePage(IRcplUic uic, String title, String image) {
		return new JOContactUsHomePage(uic, title, image);
	}

	@Override
	public IResources createResources() {
		return new JOResources();
	}

	@Override
	public IColorProvider createColorProvider() {
		return new JOColorProvider();
	}

	@Override
	public IFontProvider createFontProvider() {
		return new RcplFontProvider();
	}

	@Override
	public IService createService() {
		return new RcplService();
	}

	@Override
	public IToolFactory createOfficeToolFactory() {
		return new RcplToolFactory();
	}

	@Override
	public IEditor createEditor(File file, Tab tab, HashMap<String, String> wordReplacements, boolean onePage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEditor createEditor(Tab tab, boolean isBrowser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHomePage createDocumentHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStyleTemplate createStyleTemplate() {
		return null;
	}
}
