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
package org.wrs.rcpl.ui.homepages;

import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.homepages.DefaultWebHomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;

/**
 * @author Ramin
 *
 */
public class WrsWebHomePage extends DefaultWebHomePage {

	private WebView webView;

	public WrsWebHomePage(IRcplUic uic, HomePage modelHomePage, Pane pane, String url) {
		super(uic, modelHomePage, pane, "");
		webView.getEngine().load(url);
	}

	@Override
	protected void doCreateContent(StackPane contentPane) {
		webView = new WebView();
		contentPane.getChildren().add(webView);
	}

	@Override
	public void refresh() {
		webView.getEngine().reload();
	}

}
