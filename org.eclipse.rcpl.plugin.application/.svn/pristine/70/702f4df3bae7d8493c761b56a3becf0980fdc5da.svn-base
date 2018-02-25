package com.joffice.rcpl.plugin.demo.homepages;

import java.util.HashMap;

import org.eclipse.fxrcplight.IDocument;
import org.eclipse.fxrcplight.IRcplUic;
import org.eclipse.fxrcplight.homepages.JOAbstractHomePage;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class JODocumentHomePage extends JOAbstractHomePage {

	private IDocument document = null;

	private StackPane contentPane;

	public JODocumentHomePage(IRcplUic uic, String title, String documentTemplate,
			String image, HashMap<String, String> wordReplacements,
			Pane controlPane) {
		super(uic, title, image, controlPane);


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
