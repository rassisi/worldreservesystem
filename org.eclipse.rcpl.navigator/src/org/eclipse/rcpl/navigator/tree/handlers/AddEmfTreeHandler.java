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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.rcpl.model_2_0_0.rcpl.Favorite;
import org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.navigator.RcplNavigatorPlugin;
import org.eclipse.rcpl.navigator.tree.parts.EEmfTreeTreePart;

public class AddEmfTreeHandler {

	private EEmfTreeTreePart eEmfTreeTreePart;

	public AddEmfTreeHandler(EEmfTreeTreePart eEmfTreeTreePart) {
		this.eEmfTreeTreePart = eEmfTreeTreePart;
	}

	public void execute() {
		if (eEmfTreeTreePart.getSelectedObject() instanceof ToolGroup) {
			Tool tool = RcplFactory.eINSTANCE.createTool();
			ToolGroup rootGroup = ((ToolGroup) eEmfTreeTreePart.getSelectedObject());
			Command command = AddCommand.create(RcplNavigatorPlugin.getDefault().getManager().getEditingDomain(),
					rootGroup, RcplPackage.Literals.TOOL_GROUP, tool);
			if (command != null && command.canExecute())
				RcplNavigatorPlugin.getDefault().getManager().getEditingDomain().getCommandStack().execute(command);
		} else if (eEmfTreeTreePart.getSelectedObject() instanceof FavoritesGroup) {
			Favorite item = RcplFactory.eINSTANCE.createFavorite();
			FavoritesGroup rootGroup = ((FavoritesGroup) eEmfTreeTreePart.getSelectedObject());
			Command command = AddCommand.create(RcplNavigatorPlugin.getDefault().getManager().getEditingDomain(),
					rootGroup, RcplPackage.Literals.FAVORITE, item);
			if (command != null && command.canExecute())
				RcplNavigatorPlugin.getDefault().getManager().getEditingDomain().getCommandStack().execute(command);
		}

	}
}
