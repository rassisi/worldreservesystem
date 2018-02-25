/*******************************************************************************
 * Copyright (c) 2009 Siemens AG and others.
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

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.rcpl.plugin.tools.UCToolsPlugin;
import org.eclipse.rcpl.plugin.tools.parts.EToolsTreePart;

public class RedoHandler {

	// private Command command;

	private EToolsTreePart eToolsTreePart;

	public RedoHandler(EToolsTreePart eToolsTreePart) {
		this.eToolsTreePart = eToolsTreePart;
	}

	@CanExecute
	public boolean canUndo() {
		CommandStack commandStack = UCToolsPlugin.getDefault()
				.getToolsManager().getEditingDomain().getCommandStack();
		return commandStack.canRedo();
	}

	@Execute
	public void undo() {
		eToolsTreePart.getUseCase().getController().unbindAll();
		CommandStack commandStack = UCToolsPlugin.getDefault()
				.getToolsManager().getEditingDomain().getCommandStack();
		if (commandStack.canRedo())
			commandStack.redo();
	}
}
