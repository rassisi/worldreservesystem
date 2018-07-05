package org.eclipse.rcpl;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClipMorph extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("ImageView clip shape animation demonstration");

		// create a node whose clip we would like to perform an animated
		// transform on.
		Image logoImage = new Image("http://fxexperience.com/wp-content/uploads/2010/06/logo.png");
		ImageView logo = new ImageView(logoImage);
		final double xMax = logoImage.getWidth();
		final double yMax = logoImage.getHeight();
		final double arcMax = Math.min(xMax / 2, yMax / 2);
		final Rectangle clip = new Rectangle(0, 0, xMax, yMax);
		logo.setClip(clip);

		// create some controls to manage the transform.
		final Slider fromX = new Slider(0, xMax, 0);
		final Slider toX = new Slider(0, xMax, xMax * 1 / 4);
		final Slider fromWidth = new Slider(0, xMax, xMax);
		final Slider toWidth = new Slider(0, xMax, xMax * 1 / 2);
		final Slider fromY = new Slider(0, yMax, 0);
		final Slider toY = new Slider(0, yMax, yMax * 1 / 4);
		final Slider fromHeight = new Slider(0, yMax, yMax);
		final Slider toHeight = new Slider(0, yMax, yMax * 1 / 2);
		final Slider fromArcWidth = new Slider(0, arcMax, 0);
		final Slider toArcWidth = new Slider(0, arcMax, arcMax * 1 / 2);
		final Slider fromArcHeight = new Slider(0, arcMax, 0);
		final Slider toArcHeight = new Slider(0, arcMax, arcMax * 1 / 2);

		// create a button to run the clip animation and an indicator to show
		// it's progression.
		final Button animateButton = new Button("Animate Clip");
		final ProgressIndicator animationIndicator = new ProgressIndicator();
		animationIndicator.maxHeightProperty().bind(animateButton.heightProperty());

		final HBox animationControl = new HBox();

//		animationControl.
//		anim
//				
//				
//				HBox.bu.spacing(10).children(animateButton, animationIndicator)
//				.build();
		animationIndicator.setVisible(false);
		animationControl.setAlignment(Pos.CENTER);

		// layout the controls.
		final VBox controls = new VBox();

//				VBoxBuilder.create().spacing(5).children(createLabeledSlider("From X         ", fromX),
//				createLabeledSlider("  To X         ", toX), createLabeledSlider("From Width     ", fromWidth),
//				createLabeledSlider("  To Width     ", toWidth), createLabeledSlider("From Y         ", fromY),
//				createLabeledSlider("  To Y         ", toY), createLabeledSlider("From Height    ", fromHeight),
//				createLabeledSlider("  To Height    ", toHeight), createLabeledSlider("From ArcWidth  ", fromArcWidth),
//				createLabeledSlider("  To ArcWidth  ", toArcWidth),
//				createLabeledSlider("From ArcHeight ", fromArcHeight),
//				createLabeledSlider("  To ArcHeight ", toArcHeight), animationControl).build();
		controls.setAlignment(Pos.CENTER);
		VBox.setMargin(animationControl, new Insets(15));
		controls.setMaxWidth(Region.USE_PREF_SIZE);

		// add the ability of the animation button to run the animation.
		animateButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				controls.setDisable(true);
				Timeline clipAnimation = new Timeline();
				clipAnimation.getKeyFrames().addAll(new KeyFrame(Duration.seconds(0), new EventHandler<ActionEvent>() { // start
																														// animation
					@Override
					public void handle(ActionEvent event) {
						controls.setDisable(true);
						animationIndicator.setVisible(true);
					}
				}, new KeyValue(clip.xProperty(), fromX.getValue()),
						new KeyValue(clip.widthProperty(), fromWidth.getValue()),
						new KeyValue(clip.yProperty(), fromY.getValue()),
						new KeyValue(clip.heightProperty(), fromHeight.getValue()),
						new KeyValue(clip.arcWidthProperty(), fromArcWidth.getValue()),
						new KeyValue(clip.arcHeightProperty(), fromArcHeight.getValue())),
						new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>() { // finish
																							// animation
							@Override
							public void handle(ActionEvent event) {
								controls.setDisable(false);
								animationIndicator.setVisible(false);
							}
						}, new KeyValue(clip.xProperty(), toX.getValue()),
								new KeyValue(clip.widthProperty(), toWidth.getValue()),
								new KeyValue(clip.yProperty(), toY.getValue()),
								new KeyValue(clip.heightProperty(), toHeight.getValue()),
								new KeyValue(clip.arcWidthProperty(), toArcWidth.getValue()),
								new KeyValue(clip.arcHeightProperty(), toArcHeight.getValue())));

				clipAnimation.play();
			}
		});

		// layout the Scene.
		VBox layout = new VBox();
		layout.setAlignment(Pos.TOP_CENTER);
		Pane logoPane = new StackPane(); // StackPaneBuilder.create().children(logo).build();
		layout.getChildren().addAll(controls, logoPane);
		VBox.setVgrow(logoPane, Priority.ALWAYS);
		layout.setStyle("-fx-background-color: slategray; -fx-padding: 30; -fx-font-size: 16px;");
		Scene scene = new Scene(layout, 800, 650);

		// show the scene.
		stage.setScene(scene);
		stage.show();
	}

	private Pane createLabeledSlider(String text, Slider slider) {
		final Label label = new Label(text);
		label.setStyle(
				"-fx-text-fill: whitesmoke; -fx-font-weight: bold; -fx-font-family: monospace; -fx-font-size: 12px;");
		slider.setPrefWidth(200);

		return new HBox(); // HBoxBuilder.create().children(label,
							// slider).alignment(Pos.BASELINE_CENTER).build();
	}
}
