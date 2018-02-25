package org.eclipse.rcpl;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * @author ramin
 *
 */
public interface IParagraphFigure extends ILayoutFigure {

	void updateHeightAndLayoutAndWait();

	void layoutChildrenSpecial(IPage page, double x);

	void processMouseEvent(MouseEvent event);

	void processKeyEvent(KeyEvent event);

	double getFirstLineHeight();

	void activate(double x, double y);

	Rectangle2D calculateCaret();

	Rectangle2D calculateCaret(int offset);

	@Override
	void deActivate();

	Node getActualText();

	@Override
	IParagraphFigure getFx();

	@Override
	IParagraph getLayoutObject();

	IParagraph getParagraph();

	int getSelectionEnd();

	int getSelectionLength();

	int getSelectionStart();

	boolean hasSelection();

	void insertText(IParagraph p, String c);

	void resetSelection();

	void selectAll();

	@Override
	void setParentFigure(ILayoutFigure node);

	void setText(String text, IStyle style, IStyle[] styles, double width);

	@Override
	void setVisible(boolean visible);

	@Override
	void setWidth(double w);

	void unselect();

	void updateCaret();

	@Override
	void updateLocation();

	void updateSelection();

	void updateTools();

}
