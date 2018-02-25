package org.eclipse.rcpl;

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
