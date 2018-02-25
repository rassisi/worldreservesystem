package com.joffice.rcpl.plugin.office.application.test;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.RcplFont;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;

import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.databinding.types.JOParagraphProperties;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ParagraphTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// JOParagraph paragraph = new JOParagraphProperties(null,
		// (CTExtensionList) null, null);
		//
		// IStyle style = new JOStyle(0, 0, IColor.BLACK, IColor.LIGHT_GRAY);
		// style.setFont(new JOFont("New Times Roman", 18, Rcpl.BOLD |
		// Rcpl.ITALIC));
		//
		// paragraph.setStyle(style);
		// paragraph.setWidthPixel(500);
		//
		// IStyle style_1 = new JOStyle(0, 1, IColor.RED, IColor.BLUE);
		// style_1.setFont(new JOFont("Arial", 72, 0));
		//
		// IStyle style_2 = new JOStyle(1, 1, IColor.RED, IColor.BLUE);
		// style_2.setFont(new JOFont("Arial", 32, 0));
		//
		// IStyle style_3 = new JOStyle(2, 2, IColor.GREEN, IColor.YELLOW);
		// style_3.setFont(new JOFont("Arial", 20, 0));
		//
		// IStyle[] styles = new IStyle[] { style_1, style_2, style_3 };
		// paragraph.setStyles(styles);

		// IParagraphFigure f = (IParagraphFigure) paragraph.getLayoutFigure();
		//
		// paragraph.setText("123456789 123456789 123456789 123456789 123456789
		// 123456789 123456789");
		//
		// f.showOutline(true);

		Pane pane = new Pane();
		pane.setStyle("-fx-background-color: white;");
		// pane.getChildren().add(f.getNode());

		Scene scene = new Scene(pane, 600, 850);

		stage.setScene(scene);

		stage.centerOnScreen();
		stage.show();
	}
}
