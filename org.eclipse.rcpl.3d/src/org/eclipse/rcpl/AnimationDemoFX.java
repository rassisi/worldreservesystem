package org.eclipse.rcpl;

import javafx.animation.*;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AnimationDemoFX extends Application {
	@Override
	public void start(Stage stage) {
		Group group_for_ball = new Group();

		stage.setTitle("AnimationDemoFX.java");

		Scene scene = new Scene(group_for_ball, 600, 500);

		scene.setFill(Color.LIGHTYELLOW);

		Circle blinking_ball = new Circle(300, 250, 64, Color.CYAN);

		group_for_ball.getChildren().add(blinking_ball);

		stage.setScene(scene);
		stage.show();

		Timeline timeline = new Timeline();

		timeline.setCycleCount(Animation.INDEFINITE);

		// The following EventHandler specifies what will be done
		// after the animation specified by the KeyFrame is finished.
		// The arrow token -> identifies a Lambda expression.

		EventHandler<ActionEvent> on_finished = (ActionEvent event) -> {
			if (blinking_ball.getFill() == Color.CYAN) {
				blinking_ball.setFill(Color.TRANSPARENT);
			} else {
				blinking_ball.setFill(Color.CYAN);
			}

			System.out.print("\n on_finished executed. ");
		};

		// Next we specify a KeyFrame whose execution takes 1 second.
		// The EventHandler will be executed after that.
		// No actual modification of values is specified by this KeyFrame.
		// This can thus be considered a misuse of a KeyFrame.

		KeyFrame keyframe = new KeyFrame(Duration.millis(1000), on_finished);

		timeline.getKeyFrames().add(keyframe);

		timeline.play();
	}

	public static void main(String[] command_line_parameters) {
		launch(command_line_parameters);
	}
}

/*
 * NOTES:
 * 
 * 
 * // Here is an alternative way to specify an EventHandler:
 * 
 * EventHandler<ActionEvent> on_finished = new EventHandler<ActionEvent>() {
 * public void handle(ActionEvent t) { if ( blinking_ball.getFill() ==
 * Color.CYAN ) { blinking_ball.setFill( Color.TRANSPARENT ) ; } else {
 * blinking_ball.setFill( Color.CYAN ) ; }
 * 
 * System.out.print( " jee " ) ; } };
 * 
 * 
 * The following were useful pages when I developed this program:
 * 
 * https://docs.oracle.com/javase/8/javafx/api/javafx/animation/Timeline.html
 * 
 * http://docs.oracle.com/javase/8/javafx/visual-effects-tutorial/basics.htm#
 * BEIIDFJC
 * 
 * https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Circle.html
 * 
 * http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 * 
 * 
 * 
 * A NOTE RELATED TO HUMAN PHYSIOLOGY:
 * 
 * This program can be used to demonstrate the strange behaviour of our sight
 * system. If you watch the blinking ball from a short distance, you'll notice
 * that when the ball disappears from the screen you see a kind of shadow of the
 * ball. The color of the shadowish ball seems to be close to magenta, which is
 * a kind of opposite color to cyan, the color of the 'real' ball. The reason
 * for seeing this kind of shadow of the ball is in our eyes. Our sight system
 * is such that the sight cells inside our eyes remember the object (i.e. the
 * ball) that disappears, but they produce the opposite color for the
 * disappeared object. (This nice feature in this program was discovered by
 * professor Matti Weckström from the University of Oulu.)
 * 
 */