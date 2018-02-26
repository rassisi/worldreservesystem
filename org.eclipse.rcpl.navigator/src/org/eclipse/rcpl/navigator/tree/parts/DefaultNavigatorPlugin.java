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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.INavigatorPlugin;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.scene.layout.Pane;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class DefaultNavigatorPlugin extends AbstractRcplPlugin implements INavigatorPlugin{

	@Override
	public void setTool(Tool tool) {
		super.setTool(tool);
		DefaultNavigatorTreePart part = new DefaultNavigatorTreePart(tool, true);
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
	public DefaultTreeTreePart create(Pane detailPane, Tool tool, EObject root, boolean showRoot) {

		if (root == null) {
			RCPL rcpl = JOSession.getDefault().getRcpl();
			if (rcpl != null) {
				root = rcpl.getAllResources();
			}
		}
		return new DefaultTreeTreePart(detailPane, tool, root, showRoot);

	}
}
