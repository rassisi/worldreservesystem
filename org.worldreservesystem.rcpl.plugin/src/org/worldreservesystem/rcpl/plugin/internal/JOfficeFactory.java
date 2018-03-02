package org.worldreservesystem.rcpl.plugin.internal;

import java.util.HashMap;

import org.eclipse.rcpl.BasicFactory;
import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IDocumentProvider;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.ISVG;
import org.eclipse.rcpl.IShape;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.ITextBox;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.worldreservesystem.rcpl.plugin.IJOfficeFactory;
import org.worldreservesystem.rcpl.plugin.tools.JOfficeRibbonGroup;

import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;

/**
 * @author ramin
 * 
 */
public class JOfficeFactory extends BasicFactory implements IJOfficeFactory {

	@Override
	public IDrawingFigure createDrawing(IDrawing drawing, boolean mode) {
		return null;//new JOFXDrawingFigure(drawing);
	}

	@Override
	public ISVG createSVG(boolean newSVG) {
		return null;
	}

	@Override
	public ILayoutFigure createPictFigure(IPict lo) {
		return null;//new JOFXPictFigure(lo);
	}

	@Override
	public ILayoutFigure createPictFigure(IShape lo) {
		return null;//new JOFXShapeFigure(lo);
	}

	@Override
	public ILayoutFigure createTextBoxFigure(ITextBox tb) {
		return null;//new JOFXTextBoxFigure(tb);
	}

	@Override
	public ILayoutFigure createTableFigure(ITable ipict, double width) {
		return null;//new JOFXTableFigure(ipict, width);
	}

	@Override
	public Node createRibbonGroup(ToolGroup group, IRcplPlugin useCase, boolean first, boolean dialogButton) {
		return new JOfficeRibbonGroup(group, first, dialogButton).get();
	}

	@Override
	public IParagraphFigure createParagraphFigure(IParagraph paragraph) {
		return null;//new JOParagraphFigure(paragraph);
	}



	@Override
	public IEditor createEditor(Tab tab, boolean isBrowser) {
		return null;//new JOEditorFigure(tab, isBrowser);
	}

	@Override
	public IHomePage createDocumentHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane) {
		return null;//new JODocumentHomePage(uic, title, documentTemplate, image, wordReplacements, controlPane);
	}

	@Override
	public IStyleTemplate createStyleTemplate() {
		return null;//new JOStyleTemplate("Default.dotx");
	}

	@Override
	public IDocumentProvider createDocumentProvider() {
		return null;//new JODocumentProvider();
	}

	@Override
	public IBorder createBorder() {
		return null;//new com.joffice.rcpl.plugin.office.databinding.types.JOBorder();
	}

}
