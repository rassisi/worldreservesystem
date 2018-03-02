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
package org.eclipse.rcpl.homepages;

import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.Rcpl;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Separator;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * @author ramin
 * 
 */
public abstract class JOAbstractHomePage implements IHomePage {

	private VBox vBox;

	protected IRcplUic uic;

	private int row = 0;

	private StackPane contentPane;

	private Text titleText;

	private HBox imageViewPane;

	public JOAbstractHomePage(final IRcplUic uic, String title, String image, Pane controlPane) {
		uic.getHomepages().add(this);
		this.uic = uic;

		vBox = new VBox();
		vBox.setId("homeHeader");

		vBox.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				uic.showErrorPage();
			}
		});

		vBox.setOnSwipeLeft(new EventHandler<SwipeEvent>() {

			@Override
			public void handle(SwipeEvent event) {
				uic.showOverviewPage();
			}
		});
		// if (!Rcpl.isMobile())
		{

			HBox header = new HBox();
			header.setPrefHeight(80);
			imageViewPane = new HBox();
			header.getChildren().add(imageViewPane);
			HBox.setMargin(imageViewPane, new Insets(15, 0, 0, 20));

			setImage(image);

			header.setStyle("-fx-background-color: white");
			TextFlow samplesHeaderTextFlow = new TextFlow();
			vBox.setEffect(new InnerShadow());
			InnerShadow is = new InnerShadow();
			is.setOffsetX(2.0f);
			is.setOffsetY(2.0f);

			// titleText = new Text(title.substring(0, 1).toUpperCase());
			// samplesHeaderTextFlow.getChildren().add(titleText);
			// titleText.setCache(true);
			// titleText.setFont(Font.font(null, FontWeight.NORMAL, 28));
			// titleText.setId("homeHeaderText");
			// titleText.setEffect(is);

			titleText = new Text(title.substring(1).toUpperCase());
			samplesHeaderTextFlow.getChildren().add(titleText);
			titleText.setCache(true);
			titleText.setFont(Font.font(null, FontWeight.NORMAL, 20));
			titleText.setId("homeHeaderText");
			titleText.setEffect(is);
			samplesHeaderTextFlow.layout();

			HBox.setMargin(samplesHeaderTextFlow, new Insets(12, 0, 0, 20));

			header.getChildren().add(samplesHeaderTextFlow);

			// samplesHeader.setPadding(new Insets(10, 0, 0, 30));

			int headerHeight = 80;
			header.setPrefHeight(headerHeight);
			header.setMinHeight(headerHeight);
			header.setMaxHeight(headerHeight);

			header.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					Rcpl.UIC.expandAllToolBars();
				}
			});
			vBox.getChildren().add(header);
		}

		// ---------- SEPARATOR --------------------------------------

		Separator separator = new Separator(Orientation.HORIZONTAL);
		vBox.getChildren().add(separator);

		// ---------- CONTENT PANE -----------------------------------

		if (controlPane != null) {
			vBox.getChildren().add(controlPane);
		}
		contentPane = new StackPane();
		vBox.getChildren().add(contentPane);
		VBox.setVgrow(contentPane, Priority.SOMETIMES);
		createContent(contentPane);
	}

	@Override
	public Node getNode() {
		return vBox;
	}

	protected abstract void createContent(StackPane contentPane);

	@Override
	public StackPane getContentPane() {
		return contentPane;
	}

	@Override
	public int getRow() {
		return row;
	}

	@Override
	public void refresh() {
	}

	@Override
	public void setTitle(String title) {
		titleText.setText(title);

	}

	@Override
	public void setImage(String image) {
		if (image != null) {
			Node imageView = Rcpl.resources().getImage(image, 32, 32).getNode();
			imageViewPane.getChildren().clear();
			imageViewPane.getChildren().add(imageView);
		}

	}

}
