package org.eclipse.rcpl;

import java.io.File;
import java.util.HashMap;

import org.eclipse.rcpl.model.IResources;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;

import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 * 
 */
public interface IRcplFactory {

	IStyleTemplate createStyleTemplate();

	IButton createButton(String id, String name, String toolTip, String imageName, boolean toggle,
			IButtonListener buttonListener, boolean systemButton);

	IButton createButton(ToolGroup g, boolean toggle, boolean systemButton, IButtonListener buttonListener);

	Node createRibbonGroup(ToolGroup group, IRcplPlugin useCase, boolean first, boolean dialogButton);

	ICommand createCommand(IEditor editor, ITool tool);

	IUndoRedoListener createUndoRedoTool();

	IEditor createEditor(File file, Tab tab, HashMap<String, String> wordReplacements, boolean onePage);

	IEditor createEditor(Tab tab, boolean isBrowser);

	ISideToolBar createSideToolBar(HBox hbox);

	ITopToolbar createTopToolBar(StackPane stackPane);

	IHomePage createDefaultHomePage(IRcplUic uic, String title, String image);

	IHomePage createDocumentHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane);

	IHomePage createHTMLHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane);

	IHomePage createHTMLReadOnlyHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane);

	IHomePage createWebHomePage(IRcplUic uic, String title, String url, String image);

	IHomePage createOverviewHomePage(IRcplUic uic, String title, String image);

	IHomePage createPreferencesHomePage(IRcplUic uic, String title, String image);

	IHomePage createContactUsHomePage(IRcplUic uic, String title, String image);

	Perspective createPerspective(String id, String name, String image);

	IResources createResources();

	IColorProvider createColorProvider();

	IFontProvider createFontProvider();

	IService createService();

	ICommand createCommand(IEditor editor, EnCommandId commandId, ILayoutObject layoutObject, Object[] oldData,
			Object... newData);

	ICommand createCommand(IEditor editor, ITool tool, ILayoutObject layoutObject, Object[] oldData, Object... newData);

	IToolFactory createOfficeToolFactory();

}
