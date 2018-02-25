package org.eclipse.rcpl;

import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author ramin
 *
 */
public interface ILayoutFigure extends IPane {

	void dispose();

	void updateRootLocation();

	void setFill(Color color);

	void deActivate();

	Canvas getCanvas();

	void add(ILayoutFigure layoutFigure);

	void clipFigure();

	void detach();

	double getColumnX();

	List<ILayoutFigure> getFigureChildren();

	ILayoutFigure getFx();

	List<ILayoutFigure> getLayoutFigures();

	ILayoutObject getLayoutObject();

	Pane getNode();

	double getOverflowExcess();

	double getOverflowHeight(LayoutData layoutData);

	Point2D getOverflowLocation();

	IPage getPage();

	@Override
	Pane getPane();

	ILayoutFigure getParentFigure();

	double getRemaining();

	/**
	 * Coordinates of the editor
	 * 
	 */
	double getX2();

	/**
	 * Coordinates of the editor
	 *
	 */
	double getY2();

	boolean isCloned();

	boolean isInFooter();

	boolean isInHeader();

	boolean isOverflowFigure();

	void refresh();

	void refreshOutline();

	void remove(ILayoutFigure layoutFigure);

	void setCloned(boolean cloned);

	void setColumnX(double x);

	void setInFooter(boolean inFooter);

	void setInHeader(boolean inHeader);

	boolean setLocation(double x, double y);

	void setOverflowExcess(double excess, double remaining);

	void setOverflowFigure(boolean overflow);

	void setPage(IPage page);

	void setParentFigure(ILayoutFigure figure);

	void setPict(IPict pict);

	void setStyle(String style);

	void setTextBox(boolean textBox);

	void setVisible(boolean visible);

	void setZOrder(JOAction action);

	void showOutline(boolean show);

	void updateAnchorPosition();

	void updateFx();

	void updateLocation();

	void updateSelection(Rectangle selectionRectangle);

}
