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

package org.worldreservesystem.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.INavigatorAddon;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplAddon;
import org.eclipse.rcpl.model.cdo.client.RcplSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorMigration;
import org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorAddon;
import org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorTreePart;

import javafx.scene.layout.Pane;

/**
 * @author Ramin
 * 
 */
@RcplAddon
public class NavigatorAddon extends DefaultNavigatorAddon implements INavigatorAddon {

	public NavigatorAddon() {
		super();
	}

	@Override
	protected DefaultNavigatorTreePart createPart(Tool tool) {
		// Pane detailPane, Tool tool, EObject eObject, boolean showRoot
		return new NavigatorTreePart(null, tool, null, true);
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
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication) {
		return null;
	}

	@Override
	protected IRcplPluginControler createController() {
		return null;
	}

	@Override
	public DefaultNavigatorTreePart create(Pane detailPane, Tool tool, EObject root, boolean showRoot) {

		if (root == null) {
			RCPL rcpl = RcplSession.getDefault().getRcpl();
			if (rcpl != null) {
				root = rcpl.getAllResources();
			}
		}
		return new NavigatorTreePart(detailPane, tool, root, showRoot);

	}

}
