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
import org.eclipse.rcpl.homepages.DefaultOverviewHomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsOverviewHomePage extends DefaultOverviewHomePage {

	/**
	 * @param uic
	 * @param title
	 * @param image
	 */
	public WrsOverviewHomePage(IRcplUic uic, HomePage modelHomePage, Pane pane) {
		super(uic, modelHomePage, pane);
	}

	@Override
	protected void doCreateContent(StackPane contentPane) {

	}

	@Override
	public Node getNode() {
		super.getNode().setUserData(this);
		return super.getNode();
	}

}
