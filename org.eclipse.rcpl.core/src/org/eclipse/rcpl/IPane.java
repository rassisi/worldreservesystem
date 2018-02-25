package org.eclipse.rcpl;

import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

/**
 * @author ramin
 *
 */
public interface IPane {

	double getWidth();

	double getHeight();

	void setWidth(double width);

	void setHeight(double height);

	Point2D getCenter();

	Pane getPane();

}
