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

package org.eclipse.rcpl.navigator.tree.handlers;

import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Preferences;
import org.eclipse.rcpl.navigator.tree.parts.DefaultTreeTreePart;

/**
 * @author ramin
 *
 */
public class DeletePreferencesHandler extends JOAbstractDeleteHandler<Preferences> {

	public DeletePreferencesHandler(DefaultTreeTreePart treePart) {
		super(treePart);
	}

	@Override
	public boolean canExecute() {
		if (treePart.getSelectedObject() == JOSession.getDefault().getRcpl().getAllPreferences()) {
			return false;
		}
		return true;
	}

	@Override
	public String getImage() {
		return "delete";
	}

	@Override
	public String getText() {
		return "Delete Preferences";
	}

}
