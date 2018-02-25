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

import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplUic;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * @author ramin
 * 
 */
public class JONewHomePage implements IHomePage {

	protected IHomePage homePage;

	protected RcplUic uic;

	public JONewHomePage(final RcplUic uic, String image) {
		uic.getHomepages().add(this);
		homePage = Rcpl.getFactory().createDefaultHomePage(uic, "New Document", image);
		this.uic = uic;
		createContent();
	}

	protected void createContent() {

	}

	@Override
	public Node getNode() {
		return homePage.getNode();
	}

	@Override
	public Pane getContentPane() {
		return homePage.getContentPane();
	}

	@Override
	public int getRow() {
		return homePage.getRow();
	}

	@Override
	public void refresh() {
		homePage.refresh();
	}
}
