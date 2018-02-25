package org.eclipse.rcpl;

import java.util.List;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;

/**
 * @author ramin
 *
 */
public interface IPage extends ILayoutFigure {

	void clipFigures();

	@Override
	void dispose();

	Rectangle2D getEditRect();

	double getEditWidth();

	double getHeaderMargin();

	ILineal getHLineal();

	List<ILayoutObject> getLayoutObjects();

	double getMarginBottom();

	double getMarginLeft();

	double getMarginRight();

	double getMarginTop();

	int getPageNumber();

	Group getParagraphGroup();

	ISection getSection();

	ILineal getVLineal();

	boolean isEmpty();

	boolean isEven();

	boolean isOdd();

	void repaint();

	void setDirty(boolean dirty);

	void setEnableShadow(boolean showShadow);

	@Override
	void setFill(Color color);

	void setOpacity(double opac);

	void setSection(ISection section);

	void showRootParagraphs(boolean show);

	void zOrder();
}
