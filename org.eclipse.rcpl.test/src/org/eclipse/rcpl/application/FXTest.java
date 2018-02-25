package org.eclipse.rcpl.application;

import org.eclipse.rcpl.images.RcplImage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		final VBox st = new VBox();

		RcplImage img = new RcplImage("300/textart_20", 300,300);
		Image image = img.getImage();
		if (image != null) {
			st.getChildren().add(new ImageView(image));
			Scene scene = new Scene(st, 600, 850);
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();
		}
	}
}
