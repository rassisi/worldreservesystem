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

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Simple draggable area for the bottom right of a window to support resizing.
 */
public class WindowResizeButton extends Region {
	private double dragOffsetX, dragOffsetY, startX, startY, startMaxX, startMaxY;

	final static double stageMinimumWidth = 590;
	final static double stageMinimumHeight = 300;

	private Stage stage;

	private IPane stack;

	private double ratio;

	final private IEditor editor;

	private double startWidth;

	private double startHeight;

	public WindowResizeButton(IEditor editor, final Cursor type, final Stage stage, final IPane stack) {
		this.stage = stage;
		this.stack = stack;
		this.editor = editor;

		if (Cursor.SE_RESIZE.equals(type)) {
			WindowResizeButton.this.setId("window-resize-button");
			WindowResizeButton.this.setPrefSize(11, 11);
		} else {
			WindowResizeButton.this.setId("window-resize-button-not-visible");
			WindowResizeButton.this.setPrefSize(11, 11);
		}
		setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				((Node) event.getSource()).setCursor(type);
				if (Cursor.N_RESIZE.equals(type)) {
					Rcpl.UIC.expandAllToolBars();
				}
			}
		});
		setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				((Node) event.getSource()).setCursor(Cursor.DEFAULT);
			}
		});

		setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				if (stage != null) {
					if (Cursor.SE_RESIZE.equals(type)) {
						dragOffsetX = (stage.getX() + stage.getWidth()) - e.getScreenX();
						dragOffsetY = (stage.getY() + stage.getHeight()) - e.getScreenY();

					} else if (Cursor.NE_RESIZE.equals(type)) {
						dragOffsetX = (stage.getX() + stage.getWidth()) - e.getScreenX();
						dragOffsetY = (stage.getY()) - e.getScreenY();
						startMaxY = stage.getY() + stage.getHeight();

					} else if (Cursor.N_RESIZE.equals(type)) {
						dragOffsetX = (stage.getX()) - e.getScreenX();
						dragOffsetY = (stage.getY()) - e.getScreenY();
						startMaxY = stage.getY() + stage.getHeight();

					} else if (Cursor.NW_RESIZE.equals(type)) {
						dragOffsetX = (stage.getX()) - e.getScreenX();
						dragOffsetY = (stage.getY()) - e.getScreenY();
						startMaxY = stage.getY() + stage.getHeight();
					} else if (Cursor.SW_RESIZE.equals(type)) {
						dragOffsetX = (stage.getX()) - e.getScreenX();
						dragOffsetY = (stage.getY()) + stage.getHeight() - e.getScreenY();
						startMaxY = stage.getY() + stage.getHeight();
					}

				} else {
					startWidth = stack.getWidth();
					startHeight = stack.getHeight();
					dragOffsetX = e.getSceneX();
					dragOffsetY = e.getSceneY();

				}

				ratio = stack.getWidth() / stack.getHeight();
				e.consume();
			}
		});

		setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				if (stage != null) {
					ObservableList<Screen> screens = Screen.getScreensForRectangle(stage.getX(), stage.getY(), 1, 1);
					final Screen screen;
					if (screens.size() > 0) {
						screen = Screen.getScreensForRectangle(stage.getX(), stage.getY(), 1, 1).get(0);
					} else {
						screen = Screen.getScreensForRectangle(0, 0, 1, 1).get(0);
					}
					Rectangle2D visualBounds = screen.getVisualBounds();

					double maxX;
					double maxY;
					double minY;

					double w = 0;
					double h = 0;

					if (Cursor.SE_RESIZE.equals(type)) {
						maxX = Math.min(visualBounds.getMaxX(), e.getScreenX() + dragOffsetX);
						maxY = Math.min(visualBounds.getMaxY(), e.getScreenY() - dragOffsetY);
						w = Math.max(stageMinimumWidth, maxX - stage.getX());
						h = Math.max(stageMinimumHeight, maxY - stage.getY()) + 10;
						update(w, h);
					} else if (Cursor.S_RESIZE.equals(type)) {
						maxY = Math.min(visualBounds.getMaxY(), e.getScreenY() - dragOffsetY);
						h = Math.max(stageMinimumHeight, maxY - stage.getY()) + 3;
						update(w, h);
					} else if (Cursor.NE_RESIZE.equals(type)) {
						maxX = Math.min(visualBounds.getMaxX(), e.getScreenX() + dragOffsetX);
						minY = Math.max(visualBounds.getMinY(), e.getScreenY() - dragOffsetY);
						h = Math.max(stageMinimumHeight, startMaxY - stage.getY());
						w = Math.max(stageMinimumWidth, maxX - stage.getX());
						update(w, h);
						stage.setY(minY - 10);

					} else if (Cursor.N_RESIZE.equals(type)) {
						minY = Math.max(visualBounds.getMinY(), e.getScreenY() - dragOffsetY);
						h = Math.max(stageMinimumHeight, startMaxY - stage.getY());
						update(w, h);
						stage.setY(minY - 6);
					} else if (Cursor.E_RESIZE.equals(type)) {
						maxX = Math.min(visualBounds.getMaxX(), e.getScreenX() + dragOffsetX);
						w = Math.max(stageMinimumWidth, maxX - stage.getX());
						update(w, h);
					} else if (Cursor.W_RESIZE.equals(type)) {
						maxX = Math.min(visualBounds.getMaxX(), e.getScreenX() + dragOffsetX);
						w = Math.max(stageMinimumWidth, maxX - stage.getX());
						update(w, h);
					}

				} else {
					double scale = WindowResizeButton.this.editor.getScale();

					double diffX = (e.getSceneX() - dragOffsetX - 2) / scale;
					double diffY = (e.getSceneY() - dragOffsetY) / scale;
					double w = startWidth + diffX;
					double h = startHeight + diffY;
					w = Math.max(1, w);
					h = Math.max(1, h);
					if (e.isControlDown()) {
						h = w / ratio;
					}
					update(w, h);
				}

				e.consume();

			}
		});
	}

	private void update(final double w, final double h) {

		if (stage != null) {
			if (w > 10) {
				stage.setWidth(w);
			}
			if (h > 10) {
				stage.setHeight(h);
			}
		}

		if (w > 0) {
			stack.setWidth(w);
		}
		if (h > 0) {
			stack.setHeight(h);
		}

		// Platform.runLater(new Runnable() {
		//
		// @Override
		// public void run() {
		// }
		// });

	}

}
