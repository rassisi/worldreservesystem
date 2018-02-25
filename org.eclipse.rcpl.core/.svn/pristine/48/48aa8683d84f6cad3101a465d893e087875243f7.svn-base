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

package org.eclipse.rcpl.internal.services;

import org.eclipse.rcpl.ICommand;

/**
 * @author eclipse
 * 
 */
public class RcplCommandService extends RcplService {

	public RcplCommandService() {
	}

	@Override
	public Object doExecute(ICommand command) throws Exception {

		switch (command.getCommandId()) {
		case undo:
			getEditor(command).undo();
			return true;
		case redo:
			getEditor(command).redo();
			return true;
		default:
			break;
		}

		return false;
	}

}
