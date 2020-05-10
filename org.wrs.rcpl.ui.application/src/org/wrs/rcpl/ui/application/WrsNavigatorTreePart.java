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

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rcpl.IModelManager;
import org.eclipse.rcpl.ITreePart;
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
	protected IModelManager getTreeManager() {
		return getApplicationTreeManager();
	}

//	@Override
//	protected boolean adaptDetailPane(EObject eObject) {
//		boolean adapted = super.adaptDetailPane(eObject);
//		if (detailPane == null) {
//			IDetailPage detailPage = Rcpl.UIC().getDetailPage(eObject.getClass().getName());
//
//			if (detailPage == null) {
//				if (eObject instanceof Account) {
//					this.detailPane = new WrsMyAccountDetailPage();
//				}
//			}
//		}
//	}

}
