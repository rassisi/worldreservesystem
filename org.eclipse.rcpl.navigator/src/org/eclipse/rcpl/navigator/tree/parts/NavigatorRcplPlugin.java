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

package org.eclipse.rcpl.navigator.tree.parts;

import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class NavigatorRcplPlugin extends AbstractRcplPlugin {

	@Override
	public void setTool(Tool tool) {
		super.setTool(tool);
		NavigatorTreePart part = new NavigatorTreePart(tool, true);
		getNode().setCenter(part.getNode());
	}

	@Override
	public void init() {
		super.init();
	}

	@Override
	public String getDisplayName() {
		return "Setup Tools";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return new EEmfMigration(this);
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

}
