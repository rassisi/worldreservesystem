package org.worldreservesystem.rcpl.plugin.homepages;

import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.homepages.JONewHomePage;
import org.eclipse.rcpl.model.RCPLModel;
import org.worldreservesystem.rcpl.plugin.application.JOUic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class JOOfficeNewHomePage extends JONewHomePage {

	public JOOfficeNewHomePage(RcplUic uic, String image) {
		super(uic, image);
	}

	@Override
	protected void createContent() {

		GridPane gridPane = new GridPane();
		homePage.getContentPane().getChildren().add(gridPane);

		int row = homePage.getRow();
		int buttonWidth = 300;

		if (!Rcpl.isBigDisplay()) {
			gridPane.setVgap(5);
			gridPane.setHgap(5);
			StackPane.setMargin(gridPane, new Insets(5, 0, 0, 5));
			buttonWidth = 10;
		} else {
			gridPane.setVgap(30);
			gridPane.setHgap(30);
			StackPane.setMargin(gridPane, new Insets(50, 0, 0, 100));
		}

		Button b;

		// b = new Button("Open Document");
		// b.setAlignment(Pos.CENTER_LEFT);
		// b.setGraphic(Rcpl.resources().getImage("open").getFx());
		// b.setPrefWidth(buttonWidth);
		// b.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// ((JOUic) uic).actionOpen();
		// }
		// });

		// gridPane.add(b, 0, row++);

		// b = new Button("Open Last Document");
		// b.setAlignment(Pos.CENTER_LEFT);
		// b.setGraphic(Rcpl.resources().getImage("open_last_document").getFx());
		// b.setPrefWidth(buttonWidth);
		// b.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// ((JOUic) uic).actionOpenLast();
		// }
		// });
		// gridPane.add(b, 0, row++);
		//
		// b = new Button("Open Contacts");
		// b.setAlignment(Pos.CENTER_LEFT);
		// b.setGraphic(Rcpl.resources().getImage("users").getFx());
		// b.setPrefWidth(buttonWidth);
		// b.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// uic.showPerspective(JOModel.USE_CASE_CONTACTS_ID, true);
		// }
		// });
		// gridPane.add(b, 0, row++);

		// if (uic.findRcplPlugins(IRcplPlugin.USECASE_IT_CLASS) != null) {
		// b = new Button("IT");
		// b.setGraphic(Rcpl.resources().getImage("it").getFx());
		// b.setPrefWidth(buttonWidth);
		// b.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// uic.showPerspective(JOModel.USE_CASE_IT_ID, true);
		// }
		// });
		// gridPane.add(b, 0, row++);
		// }

		// if (uic.findRcplPlugins(IRcplPlugin.USECASE_IT_CLASS) != null) {
		// b = new Button("TOOLS");
		// b.setGraphic(Rcpl.resources().getImage("it").getFx());
		// b.setPrefWidth(buttonWidth);
		// b.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// uic.showPerspective(JOModel.USE_CASE_TOOLS_ID, true);
		// }
		// });
		// gridPane.add(b, 0, row++);
		// }

		b = new Button("New Word Document");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImage("word_2", 64, 48).getNode());
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				RCPLModel.log(this, "((JOUic) uic).actionAddWordTab()");
				((JOUic) uic).actionAddWordTab();

			}
		});

		row = 0;
		int col = 0;
		gridPane.add(b, col, row++);

		b = new Button("New Spreadsheet Tab");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImage("spreadsheet", 64, 48).getNode());
		b.setPrefWidth(buttonWidth);

		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				((JOUic) uic).actionAddSpreadsheetTab();
			}
		});
		gridPane.add(b, col, row++);

		b = new Button("New Presentation Tab");
		b.setAlignment(Pos.CENTER_LEFT);
		b.setGraphic(Rcpl.resources().getImage("presentation", 64, 48).getNode());
		b.setPrefWidth(buttonWidth);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				((JOUic) uic).actionAddPresentationTab();
			}
		});
		gridPane.add(b, col, row++);

		// b = new Button("New Browser Tab");
		// b.setGraphic(JO.resources
		// .getImageView("ca_webbrowser"));
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
