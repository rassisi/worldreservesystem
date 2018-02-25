package org.eclipse.rcpl.model;

import java.io.File;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;

/**
 * @author ramin
 *
 */
public interface IImage {

	Image getImage();

	Node getNode();

	Node getCopyNode();

	Rectangle2D getBounds();

	boolean isSvg();

	boolean isGray();

	void setGray(boolean gray);

	double getWidth();

	double getHeight();

	void setWidth(double width);

	void setHeight(double height);

	void setSvg(boolean svg);

	File getPngFile();

}
