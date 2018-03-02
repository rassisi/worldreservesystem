package com.joffice.rcpl.plugin.office.internal.figures;

import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IPage;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

/**
 * @author ramin
 *
 */
public class ScrollInfoPane {

	private HBox pane1;

	private VBox pane;

	private Label labelPageNumber;

	private Pane parentPane;

	private IPage page;

	private double prefWidth = 100;
	private double prefHeight = 40;

	public ScrollInfoPane(IEditor editor, Pane parentPane) {
		pane1 = new HBox();
		pane1.setPickOnBounds(false);
		pane = new VBox();
		pane1.getChildren().add(pane);
		pane.setPickOnBounds(false);

		HBox.setMargin(pane, new Insets(0, 10, 0, 0));

		pane.setStyle("-fx-background-color:yellow;");
		labelPageNumber = new Label();
		labelPageNumber.setPickOnBounds(false);
		labelPageNumber.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		labelPageNumber.setTextFill(Color.DARKBLUE);
		VBox.setMargin(labelPageNumber, new Insets(5));
		pane.getChildren().add(labelPageNumber);

		pane1.setMinSize(prefWidth, prefHeight);
		pane1.setPrefSize(prefWidth, prefHeight);
		pane1.setMaxSize(prefWidth, prefHeight);
		// pane.setOpacity(0);
		this.parentPane = parentPane;
	}

	public void updateOpacity() {
		// pane.setOpacity(0.7);
	}

	public void fade() {
		FadeTransition ft = new FadeTransition(Duration.millis(3000), pane);

		ft.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				pane.setVisible(false);
			}
		});
		ft.setFromValue(0.7);
		ft.setToValue(0.0);
		pane.setVisible(true);
		ft.play();
	}

	public void setPage(IPage page) {
		labelPageNumber.setText("Page " + page.getPageNumber());
		this.page = page;
	}

	public Node getNode() {
		return pane1;
	}

	public IPage getPage() {
		return page;
	}

}
