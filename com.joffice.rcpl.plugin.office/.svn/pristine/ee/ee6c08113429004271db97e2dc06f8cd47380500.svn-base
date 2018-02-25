package com.joffice.rcpl.plugin.office;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

/**
 * @author ramin
 *
 */
public class ZoomableScrollPane3 {

	private Group group;

	private ScrollPane scroller;

	/**
	 * @param node
	 */
	public ZoomableScrollPane3(Node node) {
		super();

		group = new Group(node);

		// final double SCALE_DELTA = 1.1;
		final AnchorPane zoomPane = new AnchorPane();

		// AnchorPane.setAlignment(node, Pos.TOP_LEFT);
		zoomPane.getChildren().add(group);

		scroller = new ScrollPane();
		final Group scrollContent = new Group(zoomPane);
		scroller.setContent(scrollContent);

	}

	public void scale(double scale) {

		group.setScaleX(scale);
		group.setScaleY(scale);

	}

	public ScrollPane getNode() {
		return scroller;
	}

}