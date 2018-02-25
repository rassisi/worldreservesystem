package org.eclipse.rcpl.application;

import org.eclipse.rcpl.images.RcplImage;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import javafx.application.Application;
import javafx.scene.Node;
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

		JOSession.getDefault("https://github.com/rassisi/worldreservesystem/raw/master/org.worldreservesystem.doc/");
		RcplImage img = new RcplImage("word", 300,300);
		Node imageView = img.getNode();
		if (imageView != null) {
			st.getChildren().add(imageView);
			Scene scene = new Scene(st, 600, 850);
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();
		}
	}
}
