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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.ITreePart;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.homepages.AbstractNavigatorHomePage;
import org.eclipse.rcpl.model.client.RcplSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;
import org.wrs.model.wrs.WRS;

import javafx.scene.Node;

/**
 * @author ramin
 *
 */
public class WrsOverviewHomePage extends AbstractNavigatorHomePage {

	/**
	 * @param uic
	 * @param title
	 * @param image
	 */
	public WrsOverviewHomePage(IRcplUic uic, HomePage modelHomePage) {
		super(uic, modelHomePage);
	}

	@Override
	public Node getNode() {
		super.getNode().setUserData(this);
		return super.getNode();
	}

	@Override
	protected EObject getRoot() {
		WRS wrs = (WRS) RcplSession.getDefault().getApplicationRootObject();
		if (wrs != null) {
			return wrs.getWorldeconomy();
		}
		return null;
	}

	@Override
	protected ITreePart getTreePart() {
		return Rcpl.UIC().getApplicationTreepart();
	}

}
