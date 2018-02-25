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
package org.eclipse.rcpl;

import org.eclipse.rcpl.images.RcplImage;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Simple draggable area for rotation
 */
public class WindowRotateButton extends ImageView {

	private IPane stack;

	public WindowRotateButton(final IPane stack) {

		this.stack = stack;

		WindowRotateButton.this.setFitHeight(20);
		WindowRotateButton.this.setFitWidth(20);

		Image img = ((ImageView) Rcpl.resources().getImage("rotate", 20, 20).getNode()).getImage();
		setImage(img);

		setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				((Node) event.getSource()).setCursor(Cursor.OPEN_HAND);
			}
		});

		setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				((Node) event.getSource()).setCursor(Cursor.DEFAULT);
			}
		});

		setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				Point2D target = new Point2D(e.getSceneX(), e.getSceneY());
				Point2D center = WindowRotateButton.this.stack.getCenter();
				double angle = calcRotationAngleInDegrees(center, target);

				if (e.isControlDown()) {
					int a = (int) angle / 10 * 10;
					angle = a;
				}

				stack.getPane().setRotate(angle);

				e.consume();

			}
		});
	}

	private double calcRotationAngleInDegrees(Point2D centerPt, Point2D targetPt) {
		double theta = Math.atan2(targetPt.getY() - centerPt.getY(), targetPt.getX() - centerPt.getX());
		theta += Math.PI / 2.0;
		double angle = Math.toDegrees(theta) - 342;
		if (angle < 0) {
			angle += 360;
		}
		return angle;
	}

}
