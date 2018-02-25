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

package org.eclipse.rcpl.navigator.tree.details;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.homepages.JOAbstractHomePage;

/**
 * @author ramin
 *
 */
public abstract class JOAbstractEmfTreeDetailsPage extends JOAbstractHomePage {

	private EObject root;

	private GridPane detailsPane;

	public JOAbstractEmfTreeDetailsPage(EObject root, String title, String image) {
		super(Rcpl.UIC, title, image, null);
		this.root = root;
		createDetailsPane();

	}

	@Override
	protected void createContent(StackPane contentPane) {
		detailsPane = new GridPane();
		contentPane.getChildren().add(detailsPane);

	}

	protected abstract void createDetailsPane();

	public EObject getRoot() {
		return root;
	}

}
