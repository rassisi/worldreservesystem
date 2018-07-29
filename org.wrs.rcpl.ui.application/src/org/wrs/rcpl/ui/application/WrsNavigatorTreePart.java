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

package org.wrs.rcpl.ui.application;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rcpl.INavigatorTreeManager;
import org.eclipse.rcpl.ITreePart;
import org.eclipse.rcpl.model.client.RcplSession;
import org.eclipse.rcpl.navigator.treeparts.DefaultNavigatorContextMenuProvider;
import org.eclipse.rcpl.navigator.treeparts.DefaultNavigatorTreePart;
import org.eclipse.rcpl.navigator.treeparts.DefaultTreeContextMenuProvider;

/**
 * @author ramin
 *
 */
public class WrsNavigatorTreePart extends DefaultNavigatorTreePart implements ITreePart {

	public WrsNavigatorTreePart() {
		init(null, true);
	}

	@Override
	protected DefaultTreeContextMenuProvider createContextMenuProvider() {
		return new DefaultNavigatorContextMenuProvider(this);
	}

	@Override
	public EditingDomain getEditingDomain() {
		return getApplicationTreeManager().getEditingDomain();
	}

	@Override
	protected INavigatorTreeManager getTreeManager() {
		return getApplicationTreeManager();
	}

	@Override
	public EObject getRoot() {
		return RcplSession.getDefault().getApplicationRootObject();
	}

}
