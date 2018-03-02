package com.joffice.rcpl.plugin.office.homepages;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.homepages.JONewHomePage;

import com.joffice.rcpl.plugin.office.application.JOUic;

public class JOOfficeSamplesHomePage extends JONewHomePage {

	public JOOfficeSamplesHomePage(RcplUic uic, String image) {
		super(uic, image);
	}

	@Override
	protected void createContent() {
		GridPane gridPane = new GridPane();
		homePage.getContentPane().getChildren().add(gridPane);
		int row = homePage.getRow();

		gridPane.setVgap(10);
		gridPane.setHgap(10);
		StackPane.setMargin(gridPane, new Insets(50, 0, 0, 50));

		Label label = new Label("Word Sample");
		label.setPadding(new Insets(0, 0, 0, 150));
		GridPane.setHalignment(label, HPos.RIGHT);
		gridPane.add(label, 0, row);
		Button b = new Button("Load");
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				((JOUic) uic).actionOpenExample_1(event);
			}
		});
		gridPane.add(b, 1, row++);

		label = new Label("Spreadsheet Sample");
		GridPane.setHalignment(label, HPos.RIGHT);
		label.setPadding(new Insets(0, 0, 0, 150));
		gridPane.add(label, 0, row);
		b = new Button("Load");
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				((JOUic) uic).actionOpenExample_2(event);
			}
		});
		gridPane.add(b, 1, row++);

		label = new Label("Presentation Sample");
		GridPane.setHalignment(label, HPos.RIGHT);
		label.setPadding(new Insets(0, 0, 0, 150));
		gridPane.add(label, 0, row);
		b = new Button("Load");
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				((JOUic) uic).actionOpenExample_3(event);
			}
		});
		gridPane.add(b, 1, row++);

	}
}
