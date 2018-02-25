/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl.homepages;

import java.util.HashMap;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.util.JOUtil2;

public class JOHTMLReadOnlyHomePage extends JOAbstractHomePage {

	private IDocument document = null;

	private StackPane contentPane;

	public JOHTMLReadOnlyHomePage(IRcplUic uic, String title, String documentTemplate, String image,
			final HashMap<String, String> wordReplacements, Pane controlPane) {
		super(uic, title, image, controlPane);

		final WebView webView = new WebView();

		final WebEngine webengine = webView.getEngine();

		// URL url = JOTemplates.class.getResource(documentTemplate);
		// webengine.load(url.toExternalForm());

		// String htmlText = webView.getEngine().getDocument().getTextContent();

		// String htmlText = new JODocumentProvider().createHtmlDocument(
		// documentTemplate, wordReplacements)

		String htmlText = JOUtil2.loadTemplateHTMLDocument(documentTemplate, wordReplacements, true);

		// .replaceAll(
		// new String(new byte[] { (byte) 63 }), "&uuml;")

		;

		// int pos = htmlText.indexOf("Auftrag f");
		//
		// if (pos != -1) {
		// String s = htmlText.substring(pos + 9, pos + 10);
		//
		// byte[] bytes = s.getBytes(Charset.forName("UTF-8"));
		// int x = s.getBytes()[0];
		//
		// if (x == 63) {
		// htmlText = htmlText.substring(0, pos) + "&uuml;"
		// + htmlText.substring(pos + 10, htmlText.length());
		// }
		//
		// }
		if (htmlText != null) {
			for (String key : wordReplacements.keySet()) {
				String replacement = wordReplacements.get(key);
				htmlText = htmlText.replaceAll(key, replacement);
			}
			webView.getEngine().loadContent(htmlText);
		}

		contentPane.getChildren().add(webView);

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
