package org.eclipse.rcpl.fx.zoom;

import org.eclipse.rcpl.model.RCPLModel;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class ZScrollPane2 extends ScrollPane {

	private Group zoomGroup;

	private double zoom = 1.0;

	public ZScrollPane2() {
		super();
		createZoomPane();
		setPickOnBounds(false);
	}

	public void add(Node... nodes) {
		for (Node node : nodes) {
			StackPane.setAlignment(node, Pos.TOP_LEFT);
		}
		zoomPane.getChildren().addAll(nodes);
	}

	public void remove(Node... nodes) {
		zoomPane.getChildren().removeAll(nodes);
	}

	private StackPane zoomPane;

	private void createZoomPane() {
		zoomGroup = new Group();
		zoomPane = new StackPane();
		zoomPane.setPickOnBounds(false);
		zoomGroup.getChildren().add(zoomPane);
		setContent(zoomGroup);

	}

	@Override
	protected void layoutChildren() {
		try {
			super.layoutChildren();
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	public Group getZoomGroup() {
		return zoomGroup;
	}

	private boolean firstTimeZoom = true;

	public void zoom(double zoom) {
		this.zoom = zoom;
		zoomPane.setScaleX(zoom);
		zoomPane.setScaleY(zoom);
	}

	public double getZoom() {
		return zoom;
	}

	public boolean isFirstTimeZoom() {
		return firstTimeZoom;
	}

}