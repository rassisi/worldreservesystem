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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @web http://zoranpavlovic.blogspot.com/
 */
public class RcplLoginTest extends Application {

	String user = "JavaFX2";
	String pw = "password";
	String checkUser, checkPw;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		RcplLogin login = new RcplLogin(null);

		// Adding BorderPane to the scene and loading CSS
		Scene scene = new Scene(login.getNode());
		scene.getStylesheets().add(
				getClass().getClassLoader().getResource("com/joffice/ui/internal/dialogs/login.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.titleProperty()
				.bind(scene.widthProperty().asString().concat(" : ").concat(scene.heightProperty().asString()));
		// primaryStage.setResizable(false);
		primaryStage.show();
	}
}