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

import java.io.IOException;
import java.net.URL;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.homepages.DefaultContactUsHomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class WrsContactUsHomePage extends DefaultContactUsHomePage {

	@FXML
	private ComboBox<String> comboBoxCategory;

	@FXML
	private TextArea textAreaMessage;

	private IDocument document = null;

	public WrsContactUsHomePage(IRcplUic uic, HomePage modelHomePage, Pane pane) {
		super(uic, modelHomePage, pane);

	}

	@Override
	@FXML
	public void send() {
		// String message = textAreaMessage.getText();
		// new ContactUsClient().contactUs(message);
		textAreaMessage.setText("");
//		uic.showHomePage(EnCommandId.);
	}

	@Override
	public IDocument getDocument() {
		return document;
	}

	@Override
	protected void doCreateContent(StackPane contentPane) {
		URL location = getClass().getResource("ContactUs.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		fxmlLoader.setController(this);
		BorderPane bp;
		try {
			bp = fxmlLoader.load();
			contentPane.getChildren().add(bp);
			comboBoxCategory.getItems().addAll("Support", "General");
		} catch (IOException e) {
			// ignore
		}
	}

}
