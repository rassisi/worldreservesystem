package org.eclipse.rcpl.internal.fx.figures;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SVGButtonTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");

		// JOSVG joSVG = new JOSVG();

		JOButton b = new JOButton("save", "save", "", "16/save", false);

		// WebView webView = joSVG.createPng("http://localhost/svg/save.svg",
		// null, 16d, 16d);
		//
		// // webView.setScaleX(0.2);
		// // webView.setScaleY(0.2);
		//
		double w = 256;
		double h = 256;
		// //
		// webView.setPrefWidth(w);
		// webView.setMaxWidth(w);
		// webView.setMinHeight(h);
		// webView.setPrefHeight(h);
		// webView.setMaxHeight(h);

		StackPane st = new StackPane();
		st.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));
		st.getChildren().add(b.getNode());

		primaryStage.setScene(new Scene(st, w, h));
		primaryStage.show();
	}

}
