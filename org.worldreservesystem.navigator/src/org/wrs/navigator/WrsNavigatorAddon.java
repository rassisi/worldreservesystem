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

package org.wrs.navigator;

import org.eclipse.rcpl.INavigatorAddon;
import org.eclipse.rcpl.INavigatorTreeManager;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.ITreePart;
import org.eclipse.rcpl.RcplAddon;
import org.eclipse.rcpl.migration.RcplAbstractMigration;
import org.eclipse.rcpl.navigator.addon.AbstractNavigatorAddon;
import org.eclipse.rcpl.navigator.tree.model.manager.UCEmfTreeModelManagerImpl;
import org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorMigration;

/**
 * @author Ramin
 * 
 */
@RcplAddon
public class WrsNavigatorAddon extends AbstractNavigatorAddon implements INavigatorAddon {

	public WrsNavigatorAddon() {
		super();
	}

	@Override
	public String getDisplayName() {
		return "Setup Tools";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return new DefaultNavigatorMigration(this);
	}

	@Override
	public boolean isCustomApplication() {
		return false;
	}

	@Override
	protected IRcplPluginControler createController() {
		return null;
	}

	@Override
	public ITreePart createTreePart() {
		return new WrsNavigatorTreePart();
	}

	@Override
	public INavigatorTreeManager createNavigatorTreemanager() {
		return new UCEmfTreeModelManagerImpl();
	}

}
