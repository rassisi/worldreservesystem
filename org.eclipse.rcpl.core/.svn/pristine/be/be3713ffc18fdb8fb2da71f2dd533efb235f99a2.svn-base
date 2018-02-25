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

import org.eclipse.rcpl.IRcplUic;

import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;

public class JOWebHomePage extends JOAbstractHomePage {

	private WebView webView;

	public JOWebHomePage(IRcplUic uic, String title, String url, String image) {
		super(uic, title, image, null);
		webView.getEngine().load(url);
	}

	@Override
	protected void createContent(StackPane contentPane) {
		webView = new WebView();
		contentPane.getChildren().add(webView);
	}

	@Override
	public void refresh() {
		webView.getEngine().reload();
	}
}
