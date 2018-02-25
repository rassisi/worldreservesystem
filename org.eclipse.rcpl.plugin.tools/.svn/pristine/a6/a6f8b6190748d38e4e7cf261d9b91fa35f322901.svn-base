/*******************************************************************************
 * Copyright (c) 2009, 2010 Siemens AG and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Tödter - initial implementation
 ******************************************************************************/

package org.eclipse.rcpl.plugin.tools.handlers;

import java.util.List;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.rcpl.plugin.tools.UCToolsPlugin;
import org.eclipse.rcpl.plugin.tools.parts.EToolsTreePart;

public class CopyHandler {

	private Command command;
	private EToolsTreePart eToolsTreePart;

	public CopyHandler(EToolsTreePart eToolsTreePart) {
		this.eToolsTreePart = eToolsTreePart;
	}

	@CanExecute
	public boolean canExecute(@Optional List<?> selection) {
		if (selection != null) {
			command = CopyToClipboardCommand.create(UCToolsPlugin.getDefault()
					.getToolsManager().getEditingDomain(), selection);
			return command.canExecute();
		}
		return false;
	}

	@Execute
	public void execute() {
		if (command != null && command.canExecute())
			UCToolsPlugin.getDefault().getToolsManager().getEditingDomain()
					.getCommandStack().execute(command);
	}

}
