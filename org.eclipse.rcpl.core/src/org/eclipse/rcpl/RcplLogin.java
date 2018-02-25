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

import java.io.IOException;
import java.net.URL;

import org.eclipse.rcpl.model.RCPLModel;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

/**
 * @author ramin
 *
 */
public class RcplLogin {

	private BorderPane node;

	private RcplLoginController controller;

	IRcplApplicationProvider applicationProvider;

	/**
	 * @param applicationProvider
	 */
	public RcplLogin(IRcplApplicationProvider applicationProvider) {
		this.applicationProvider = applicationProvider;
		URL location = getClass().getResource("/org/eclipse/rcpl/login.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		controller = new RcplLoginController(this);
		fxmlLoader.setController(controller);

		try {
			node = (BorderPane) fxmlLoader.load();
			double height = 300;
			node.setPrefHeight(height);
			node.setMinHeight(height);
			node.setMaxHeight(height);
			controller.init();
			double width = 400;
			node.setPrefWidth(width);
			node.setMinWidth(width);
			node.setMaxWidth(width);

			// IImage image = new
			// SVGImage("https://openclipart.org/download/61741/Ladybird.svg");
			// image.setWidth(40);
			// image.setHeight(40);
			//
			// WebView wv = (WebView) image.getFx();
			//
			// controller.getLogoArea().getChildren().add(wv);

			if (applicationProvider.isLoginDebug()) {
				Platform.runLater(new Runnable() {

					@Override
					public void run() {
						controller.handleGuest();
					}
				});
			}
		} catch (IOException e) {
			// cannot happen
		}

	}

	public RcplLoginController getController() {
		return controller;
	}

	public void reset() {
		controller.reset();
	}

	// protected void handleRegister() {
	// JOSession.getDefault().userId = getController().getUserID();
	// new JOSession();
	// JOSession.getDefault().requestRegistration(getController().getPassword());
	// getController().displayMessage(
	// "You will receive shortly an E-mail to verify you account. Meanwile you
	// can login the demo account.");
	// getController().collapse2(false);
	// };

	public void enableButtons() {
		controller.enableButtons();
	}

	public BorderPane getNode() {
		return node;
	}

	public IRcplApplicationProvider getApplicationProvider() {
		return applicationProvider;
	}

}