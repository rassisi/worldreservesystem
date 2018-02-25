package org.eclipse.rcpl.contacts.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.rcpl.contacts.plugin.OsgiContactsPlugin;

public class RedoHandler {

	@CanExecute
	public boolean canUndo() {
		CommandStack commandStack = OsgiContactsPlugin.getEditingDomain()
				.getCommandStack();
		return commandStack.canRedo();
	}

	@Execute
	public void undo() {
		CommandStack commandStack = OsgiContactsPlugin.getEditingDomain()
				.getCommandStack();
		if (commandStack.canRedo())
			commandStack.redo();
	}
}
