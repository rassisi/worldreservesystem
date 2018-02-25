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

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 * @author ramin
 * 
 */
public class JOAboutHomePage implements IHomePage {

	private IHomePage homePage;

	public JOAboutHomePage(RcplUic uic, String image) {
		uic.getHomepages().add(this);
		homePage = Rcpl.getFactory().createDefaultHomePage(uic, "about", image);
		Label l = new Label("(c) Ramin Assisi 2013-2014, support@raminassisi.com");
		l.setAlignment(Pos.CENTER);
		homePage.getContentPane().getChildren().add(l);
	}

	@Override
	public Node getNode() {
		return homePage.getNode();
	}

	@Override
	public Pane getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRow() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}
}
