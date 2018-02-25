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

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CutToClipboardCommand;
import org.eclipse.rcpl.navigator.RcplNavigatorPlugin;

public class CutHandler {

	Command command;

	public CutHandler() {
	}

	public boolean canExecute(List<?> selection) {
		try {
			if (selection != null) {
				command = CutToClipboardCommand.create(RcplNavigatorPlugin.getDefault().getManager().getEditingDomain(),
						selection);
				return command.canExecute();
			}
		} catch (Exception ex) {

		}
		return false;
	}

	public void execute() {
		if (command != null && command.canExecute())
			RcplNavigatorPlugin.getDefault().getManager().getEditingDomain().getCommandStack().execute(command);
	}

}
