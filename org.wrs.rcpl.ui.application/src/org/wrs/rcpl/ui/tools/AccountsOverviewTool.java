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

package org.wrs.rcpl.ui.tools;

import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.model.client.RcplSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.WRS;

import javafx.scene.layout.GridPane;

/**
 * @author ramin
 *
 */
/**
 * @author ramin
 *
 */
public class AccountsOverviewTool extends RcplTool {

	public AccountsOverviewTool(Tool tool) {
		super(tool);
	}

	@Override
	public GridPane createNode() {
		GridPane gp = new GridPane();
		gp.setId("redBorder");

		Identity me = findMe();
		if (me != null) {

		}

		return gp;
	}

	@Override
	public GridPane getNode() {
		return (GridPane) super.getNode();
	}

	private Identity findMe() {
		WRS wrs = (WRS) RcplSession.getDefault().getApplicationRootObject();
		Identity myIdentity = null;

		for (Identity identity : wrs.getAlldentities().getChildren()) {

			String name = identity.getName();

			if ("Ramin Assisi".contentEquals(name)) {
				myIdentity = identity;
				break;
			}
			System.out.println();

		}

		return myIdentity;
	}

}
