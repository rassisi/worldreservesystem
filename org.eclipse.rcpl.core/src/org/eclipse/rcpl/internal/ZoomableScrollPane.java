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

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.transform.Scale;

public class ZoomableScrollPane extends ScrollPane {
	Group zoomGroup;
	Scale scaleTransform;
	Node content;

	public ZoomableScrollPane() {
	}

	public void setNode(Node content) {
		this.content = content;
		Group contentGroup = new Group();
		zoomGroup = new Group();
		contentGroup.getChildren().add(zoomGroup);
		zoomGroup.getChildren().add(content);
		setContent(contentGroup);
	}

	public void setScale(double scale) {

		super.setScaleX(scale);
		super.setScaleY(scale);

		// scaleTransform = new Scale(scale, scale, 0, 0);
		// if (!zoomGroup.getTransforms().isEmpty()) {
		// zoomGroup.getTransforms().remove(0);
		// }
		// zoomGroup.getTransforms().add(scaleTransform);
	}
}