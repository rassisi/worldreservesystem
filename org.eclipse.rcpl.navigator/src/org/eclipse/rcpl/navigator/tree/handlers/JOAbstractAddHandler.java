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
import org.eclipse.rcpl.navigator.tree.parts.DefaultTreeTreePart;

public abstract class JOAbstractAddHandler<T> extends JOAbstractEmfHandler<T> {

	public JOAbstractAddHandler(DefaultTreeTreePart treePart) {
		super(treePart);
	}

	public void execute() {
		try {
			@SuppressWarnings({ "unchecked", "unused" })
			T test = (T) treePart.getSelectedObject();
		} catch (ClassCastException e) {
			return;
		}
		Command command = AddCommand.create(treePart.getEditingDomain(),
				treePart.getSelectedObject(), newObjectClass(), createObject());
		if (command != null && command.canExecute())
			treePart.getEditingDomain().getCommandStack().execute(command);

	}

}
