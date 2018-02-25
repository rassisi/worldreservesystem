package org.eclipse.rcpl.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.joffice.JOImage;

public class FXTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		final VBox st = new VBox();

		JOImage img = new JOImage("300/textart_20");
		Image image = img.getFx();
		if (image != null) {
			st.getChildren().add(img.getImageView());
			Scene scene = new Scene(st, 600, 850);
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();
		}
	}
}
