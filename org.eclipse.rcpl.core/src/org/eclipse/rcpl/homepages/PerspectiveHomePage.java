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
public class PerspectiveHomePage implements IHomePage {

	protected IHomePage homePage;

	public PerspectiveHomePage(final RcplUic uic) {
		uic.getHomepages().add(this);
		homePage = Rcpl.getFactory().createDefaultHomePage(uic, "Test", null);
		createdContent();

	}

	protected void createdContent() {

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

	@Override
	public void setTitle(String title) {
		homePage.setTitle(title);
	}

	@Override
	public void setImage(String image) {
		setImage(image);
	}

}