/*******************************************************************************
 * Copyright (c) 2003 - 2018 Ramin Assisi and others.
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
import org.eclipse.rcpl.homepages.AbstractHomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 * 
 */
public class AccountHomePage extends AbstractHomePage {

	public AccountHomePage(IRcplUic uic, HomePage modelHomePage) {
		super(uic, modelHomePage);
	}

	@Override
	public Node getNode() {
		return super.getNode();
	}

	@Override
	protected void doCreateContent(StackPane contentPane) {
		// TODO Auto-generated method stub

	}

}
