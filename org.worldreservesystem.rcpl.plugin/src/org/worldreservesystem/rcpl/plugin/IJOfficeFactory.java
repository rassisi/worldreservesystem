package org.worldreservesystem.rcpl.plugin;

import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IDocumentProvider;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.ISVG;
import org.eclipse.rcpl.IShape;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.ITextBox;

public interface IJOfficeFactory extends IRcplFactory {

	IBorder createBorder();

	IDrawingFigure createDrawing(IDrawing drawing, boolean mode);

	ISVG createSVG(boolean newSVG);

	ILayoutFigure createPictFigure(IPict lo);

	ILayoutFigure createPictFigure(IShape lo);

	ILayoutFigure createTextBoxFigure(ITextBox lo);

	ILayoutFigure createTableFigure(ITable ipict, double width);

	IParagraphFigure createParagraphFigure(IParagraph paragraph);

	@Override
	IStyleTemplate createStyleTemplate();

	IDocumentProvider createDocumentProvider();

}
