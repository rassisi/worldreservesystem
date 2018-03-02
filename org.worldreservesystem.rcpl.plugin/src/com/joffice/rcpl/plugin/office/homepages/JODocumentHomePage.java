package com.joffice.rcpl.plugin.office.homepages;

import java.util.HashMap;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.homepages.JOAbstractHomePage;

import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class JODocumentHomePage extends JOAbstractHomePage {

	private IDocument document = null;

	private StackPane contentPane;

	public JODocumentHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			HashMap<String, String> wordReplacements, Pane controlPane) {
		super(uic, title, image, controlPane);
		IEditor f = Rcpl.getFactory().createEditor(new Tab(), false);
//		document = new JODocumentProvider().createTemplateDocument(documentTemplate, wordReplacements, false);
//		document.setReadOnly();
		f.setDocument(document);
		contentPane.getChildren().add(f.getMainPane());
		document.setEditorFigure(f);
		document.getRootObject(0).setDirtyLayout(true);
		f.layoutDocument();
		contentPane.layout();
	}

	@Override
	protected void createContent(StackPane contentPane) {
		this.contentPane = contentPane;
	}

	@Override
	public Node getNode() {
		super.getNode().setUserData(this);
		return super.getNode();
	}

	public IDocument getDocument() {
		return document;
	}

}
