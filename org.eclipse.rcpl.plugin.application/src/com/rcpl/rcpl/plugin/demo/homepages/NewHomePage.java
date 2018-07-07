package com.rcpl.rcpl.plugin.demo.homepages;

import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.homepages.JONewHomePage;
import org.eclipse.rcpl.model.RCPLModel;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class NewHomePage extends JONewHomePage {

	public NewHomePage(RcplUic uic, String image) {
		super(uic, image);
	}

	@Override
	protected void createContent() {

		GridPane gridPane = new GridPane();
		homePage.getContentPane().getChildren().add(gridPane);

		int row = homePage.getRow();

		gridPane.setVgap(30);
		gridPane.setHgap(30);
		StackPane.setMargin(gridPane, new Insets(50, 0, 0, 100));

		int buttonWidth = 300;
		Button b = new Button("Open Document");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImage("64_48/open", 64,48).getNode());
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				((JOUic) uic).actionOpen();
			}
		});

		gridPane.add(b, 0, row++);

		b = new Button("Open Last Document");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImage("64_48/open_last_document", 64,48).getNode());
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				((JOUic) uic).actionOpenLast();
			}
		});
		gridPane.add(b, 0, row++);

		b = new Button("Open Contacts");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImageView("64_48/users"));
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				((RcplUic) uic).showPerspective(RCPLModel.USE_CASE_CONTACTS_ID, true);
			}
		});
		gridPane.add(b, 0, row++);

		if (uic.findRcplPlugins(IRcplPlugin.USECASE_IT_CLASS) != null) {
			b = new Button("IT");
			b.setGraphic(Rcpl.resources().getImageView("64_48/it"));
			b.setPrefWidth(buttonWidth);
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					((RcplUic) uic).showPerspective(RCPLModel.USE_CASE_IT_ID, true);
				}
			});
			gridPane.add(b, 0, row++);
		}

		if (uic.findRcplPlugins(IRcplPlugin.USECASE_IT_CLASS) != null) {
			b = new Button("TOOLS");
			b.setGraphic(Rcpl.resources().getImageView("64_48/it"));
			b.setPrefWidth(buttonWidth);
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					((RcplUic) uic).showPerspective(RCPLModel.USE_CASE_TOOLS_ID, true);
				}
			});
			gridPane.add(b, 0, row++);
		}
		b = new Button("New Word Document");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImageView("64_48/word_2"));
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				event.consume();
//				((JOUic) uic).actionAddWordTab();

			}
		});

		row = 0;
		int col = 1;
		gridPane.add(b, col, row++);

		b = new Button("New Spreadsheet Tab");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImageView("64_48/spreadsheet"));
		b.setPrefWidth(buttonWidth);

		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				((JOUic) uic).actionAddSpreadsheetTab();
			}
		});
		gridPane.add(b, col, row++);

		b = new Button("New Presentation Tab");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImageView("64_48/presentation"));
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				((JOUic) uic).actionAddPresentationTab();
			}
		});
		gridPane.add(b, col, row++);

		// b = new Button("New Browser Tab");
		// b.setGraphic(JO.resources
		// .getImageView("64_48/ca_webbrowser"));
		//
		// b.setPrefWidth(buttonWidth);
		// b.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// ((JOUIC) uic).actionAddWebBrowserTab();
		// }
		// });
		// gridPane.add(b, col, row++); }
	}
}
