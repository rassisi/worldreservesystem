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

import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.homepages.DefaultWhatsNewHomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 * 
 */
public class WrsWhatsNewHomePage extends DefaultWhatsNewHomePage implements IHomePage {

	public WrsWhatsNewHomePage(IRcplUic uic, HomePage modelHomePage) {
		super(uic, modelHomePage);
	}

	@Override
	protected void doCreateContent(StackPane contentPane) {
		Label l = new Label("Default What�s New Page");
		l.setAlignment(Pos.CENTER);
		getContentPane().getChildren().add(l);
	}

}
