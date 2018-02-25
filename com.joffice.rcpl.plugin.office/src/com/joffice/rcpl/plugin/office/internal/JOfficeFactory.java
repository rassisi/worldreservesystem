package com.joffice.rcpl.plugin.office.internal;

import java.io.File;
import java.util.HashMap;

import org.eclipse.rcpl.BasicFactory;
import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IDocumentProvider;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.IJOfficeFactory;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.IPictFigure;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.ISVG;
import org.eclipse.rcpl.IShape;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.ITextBox;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;

import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXDrawingFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXPictFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXShapeFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXTextBoxFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXTableFigure;
import com.joffice.rcpl.plugin.office.homepages.JODocumentHomePage;
import com.joffice.rcpl.plugin.office.internal.figures.JOEditorFigure;
import com.joffice.rcpl.plugin.office.internal.impl.JODocumentProvider;
import com.joffice.rcpl.plugin.office.tools.JOfficeRibbonGroup;

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
		return new JOFXDrawingFigure(drawing);
	}

	@Override
	public ISVG createSVG(boolean newSVG) {
		return null;
	}

	@Override
	public ILayoutFigure createPictFigure(IPict lo) {
		return new JOFXPictFigure(lo);
	}

	@Override
	public ILayoutFigure createPictFigure(IShape lo) {
		return new JOFXShapeFigure(lo);
	}

	@Override
	public ILayoutFigure createTextBoxFigure(ITextBox tb) {
		return new JOFXTextBoxFigure(tb);
	}

	@Override
	public ILayoutFigure createTableFigure(ITable ipict, double width) {
		return new JOFXTableFigure(ipict, width);
	}

	@Override
	public Node createRibbonGroup(ToolGroup group, IRcplPlugin useCase, boolean first, boolean dialogButton) {
		return new JOfficeRibbonGroup(group, first, dialogButton).get();
	}

	@Override
	public IParagraphFigure createParagraphFigure(IParagraph paragraph) {
		return new JOParagraphFigure(paragraph);
	}

	@Override
	public JOEditorFigure createEditor(File file, Tab tab, HashMap<String, String> wordReplacements, boolean onePage) {
		return new JOEditorFigure(file, tab, wordReplacements, onePage);
	}

	@Override
	public IEditor createEditor(Tab tab, boolean isBrowser) {
		return new JOEditorFigure(tab, isBrowser);
	}

	@Override
	public IHomePage createDocumentHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane) {
		return new JODocumentHomePage(uic, title, documentTemplate, image, wordReplacements, controlPane);
	}

	@Override
	public IStyleTemplate createStyleTemplate() {
		return new JOStyleTemplate("Default.dotx");
	}

	@Override
	public IDocumentProvider createDocumentProvider() {
		return new JODocumentProvider();
	}

	@Override
	public IBorder createBorder() {
		return new com.joffice.rcpl.plugin.office.databinding.types.JOBorder();
	}

}
