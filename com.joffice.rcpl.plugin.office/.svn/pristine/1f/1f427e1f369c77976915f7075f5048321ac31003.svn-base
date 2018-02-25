package com.joffice.rcpl.plugin.office.internal.figures;

import java.io.File;
import java.util.HashMap;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.Rcpl;

import com.joffice.rcpl.plugin.office.internal.impl.JODocumentProvider;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

;

public class EditorTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");

		// new JOPointToPixelCalculator().init();

		// String path2 =
		// "C:/data/ws/joffice_migration_1/com.wwindows.office.build/web/joffice.eu/examples/docx/ecma_376_fundamentals_4.docx";

		final StackPane root = new StackPane();

		IDocument document = new JODocumentProvider().createTemplateDocument("blank_A4.docx",
				(HashMap<String, String>) null, false);
		JOEditorFigure f;
		f = new JOEditorFigure(new Tab(), false);
		f.setDocument(document);

		final FileChooser fileChooser = new FileChooser();

		File file = fileChooser.showOpenDialog(primaryStage);

		f = (JOEditorFigure) Rcpl.getFactory().createEditor(file, new Tab(), null, false);

		// document = JOAbstractDocument.load(file, false);
		// f = new JOEditorFigure(document, false);
		root.getChildren().add(f.getMainPane());
		root.layout();
		// f.setDirtyLayout(null);

		primaryStage.setScene(new Scene(root, 1000, 800));
		primaryStage.show();

	}
}
