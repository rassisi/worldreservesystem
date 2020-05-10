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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rcpl.IModelManager;
import org.eclipse.rcpl.detailpages.AbstractModelManagerImpl;
import org.eclipse.rcpl.model.client.RcplSession;
import org.wrs.model.wrs.provider.WrsItemProviderAdapterFactory;

/**
 * @author ramin
 *
 */
public class WrsNavigatorTreeManagerImpl extends AbstractModelManagerImpl implements IModelManager {

	public WrsNavigatorTreeManagerImpl() {

		System.out.println();
	}

	@Override
	public EObject getRoot() {
		return RcplSession.getDefault().getRcpl();
	}

	@Override
	public Resource getResource() {
		return RcplSession.getDefault().getRcplResource();
	}

	@Override
	public AdapterFactory[] createAdapterFactories() {
		return new AdapterFactory[] { new WrsItemProviderAdapterFactory() };
	}

}
