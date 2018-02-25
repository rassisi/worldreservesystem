/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl.internal;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.ScrollEvent;

/**
 */
public class ZoomableScrollPane2 extends ScrollPane {

	private static final double MAX_SCALE = 2.5d;
	private static final double MIN_SCALE = .5d;

	public ZoomableScrollPane2() {
		init();
	}

	private class ZoomHandler implements EventHandler<ScrollEvent> {

		private Node nodeToZoom;

		private ZoomHandler(Node nodeToZoom) {
			this.nodeToZoom = nodeToZoom;
		}

		@Override
		public void handle(ScrollEvent scrollEvent) {
			if (scrollEvent.isControlDown()) {
				final double scale = calculateScale(scrollEvent);
				nodeToZoom.setScaleX(scale);
				nodeToZoom.setScaleY(scale);
				scrollEvent.consume();
			}
		}

		private double calculateScale(ScrollEvent scrollEvent) {
			double scale = nodeToZoom.getScaleX() + scrollEvent.getDeltaY() / 100;

			if (scale <= MIN_SCALE) {
				scale = MIN_SCALE;
			} else if (scale >= MAX_SCALE) {
				scale = MAX_SCALE;
			}
			return scale;
		}

	}

	private Group innerGroup;

	// private ZoomHandler zoomHandler;

	public void init() {
		innerGroup = new Group();
		Group outerGroup = new Group(innerGroup);
		setContent(outerGroup);
		// zoomHandler = new ZoomHandler(innerGroup);
		// addEventFilter(ScrollEvent.ANY, zoomHandler);

	}

	public void setScale(double scale) {
		innerGroup.setScaleX(scale);
		innerGroup.setScaleY(scale);
	}

	public void setNode(Node node) {
		innerGroup.getChildren().add(node);
	}

	public Group getInnerGroup() {
		return innerGroup;
	}

}