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
package org.wrs.rcpl.ui.homepages;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.INavigatorAddon;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.homepages.DefaultOverviewHomePage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePageType;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * @author ramin
 *
 */
public class WrsOverviewHomePage extends DefaultOverviewHomePage {

	private IDocument document = null;

	private MediaPlayer internalMediaPlay;

	protected MediaView internalMediaView;

	String[] homeImages = new String[] {

			"http://apod.nasa.gov/apod/image/1308/skylab_nasa_960.jpg",

			"http://apod.nasa.gov/apod/image/1308/skylab_nasa_960.jpg",

			// //
			// "http://www.youtube.com/watch?v=FG0fTKAqZ5g&feature=player_embedded#t=72",
			//
			// "http://apod.nasa.gov/apod/image/0806/M51HST-GendlerS_800.jpg",
			//
			// //
			// "http://apod.nasa.gov/apod/image/1312/horsehead_chumack_1800.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1401/cubesats_iss038_960.jpg",
			//
			// //
			// "http://apod.nasa.gov/apod/image/1401/iss013e49644clevels.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1312/mandelbox077_leys_960.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1312/p1769716276metsavainio950c.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1310/orionwisps_colombari_960.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1310/carina_fenyes_960.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1308/ngc3370_hst_900.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1307/ngc6384_hst_1265.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1305/richat_aster_960.jpg",
			//
			// "http://apod.nasa.gov/apod/image/1304/NGC1788_davis950.jpg",

	};

	private StackPane detailsArea;

	/**
	 * @param uic
	 * @param title
	 * @param image
	 */
	public WrsOverviewHomePage(IRcplUic uic, HomePage modelHomePage, Pane pane) {
		super(uic, modelHomePage, pane);
	}

	/**
	 * @param detailNode
	 */
	@Override
	public void setDetailNode(Node detailNode) {
		detailsArea.getChildren().clear();
		if (detailNode != null) {
			detailsArea.getChildren().add(detailNode);
		}
	}

	@Override
	public void hideSplash() {
		detailsArea.setBackground(null);
	}

	/**
	 * @param imageIndex
	 */
	private void showSplash(int imageIndex) {

		if (homeImages == null) {
			return;
		}
		try {
			int randomImageIndex;

			if (imageIndex >= 0) {
				randomImageIndex = imageIndex;
			} else {

				randomImageIndex = (int) (Math.random() * homeImages.length);

			}

			String mediaUrl = homeImages[randomImageIndex];
			if (mediaUrl.indexOf("youtube") != -1) {

				Media media = new Media(mediaUrl);
				javafx.scene.media.MediaPlayer mediaPlayer = new javafx.scene.media.MediaPlayer(media);
				internalMediaPlay.setAutoPlay(true);
				internalMediaView = new MediaView();
				internalMediaView.setMediaPlayer(mediaPlayer);
				internalMediaView.setVisible(true);

				// internalHomeWebView.setVisible(false);
				// // homeWebView.getEngine().load(mediaUrl);
				// internalHomeImageView.setVisible(false);

			} else {
				// homeWebView.setVisible(false);
				// mediaView.setVisible(false);
				Image image = new Image(mediaUrl);
				// homeImageView.setImage(image);

				detailsArea.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.LEFT, 0, false, Side.TOP, 0, false),
						new BackgroundSize(10, 10, true, true, false, true))));
				// homeImageView.setFitWidth(homeStackPane.getWidth() -
				// 100);
				// homeImageView.setVisible(false);

				if (Rcpl.isMobile()) {
					detailsArea.setOnSwipeLeft(new EventHandler<SwipeEvent>() {

						@Override
						public void handle(SwipeEvent event) {
							uic.showErrorPage();
						}
					});
				} else {
					detailsArea.setOnMouseClicked(new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent event) {
							uic.showErrorPage();
						}
					});
				}

			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	@Override
	protected void doCreateContent(StackPane contentPane) {

		SplitPane splitPane = new SplitPane();
		getContentPane().getChildren().add(splitPane);

		INavigatorAddon navigatorAddon = Rcpl.UIC.getNavigator(null);

		if (navigatorAddon != null) {
			Node n = navigatorAddon.createPart(detailsArea, null, false).getNode();
			if (n != null) {
				splitPane.getItems().add(n);
			}
		}

		detailsArea = new StackPane();
		splitPane.getItems().add(detailsArea);
		splitPane.setDividerPositions(0.3f);

		uic.getTopToolBarControl().show((String) null);

		if (!Rcpl.isMobile()) {
			showSplash(1);
		}

		if (Rcpl.isMobile()) {
			VBox vBox = new VBox();
			vBox.setSpacing(5);

			vBox.setSpacing(5);
			Button b = new Button("New");
			b.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					uic.showHomePage(HomePageType.NEW);
				}
			});
			b.setPrefWidth(100);
			vBox.getChildren().add(b);

			b = new Button("Samples");
			b.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					uic.showHomePage(HomePageType.OVERVIEW);
				}
			});
			b.setPrefWidth(100);
			vBox.getChildren().add(b);

			setDetailNode(vBox);

		}

	}

	@Override
	public Node getNode() {
		super.getNode().setUserData(this);
		return super.getNode();
	}

	@Override
	public IDocument getDocument() {
		return document;
	}

}
