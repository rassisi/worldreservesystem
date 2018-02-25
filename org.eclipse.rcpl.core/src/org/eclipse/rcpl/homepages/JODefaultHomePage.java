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

public class JODefaultHomePage extends JOAbstractHomePage {

	public JODefaultHomePage(IRcplUic uic, String title, String image) {
		super(uic, title, image, null);
	}

	@Override
	protected void createContent(StackPane contentPane) {
	}

}
