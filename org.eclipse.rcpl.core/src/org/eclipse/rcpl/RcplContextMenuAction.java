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

package org.eclipse.rcpl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.internal.services.RcplActionListener;
import org.eclipse.rcpl.internal.services.RcplActionProvider;

/**
 * @author ramin
 * 
 */
public class RcplContextMenuAction implements RcplActionProvider {

	private JOAction action;
	private ILayoutFigure figure;
	private List<RcplActionListener> actionListeners = new ArrayList<RcplActionListener>();

	private IEditor editorFigure;

	/**
	 * @param figure
	 * @param action
	 */
	public RcplContextMenuAction(IEditor editorFigure, ILayoutFigure figure, JOAction action) {
		// super(action.getText());
		// this.action = action;
		// this.figure = figure;
		// this.editorFigure = editorFigure;
		// setImageDescriptor(getImageDescriptor(action));
		// if (action.getKey().indexOf("/edit_") != -1 //$NON-NLS-1$
		// || action.getKey().indexOf("/delete_") != -1 //$NON-NLS-1$
		// || action.getKey().indexOf("/insert_") != -1 //$NON-NLS-1$
		// || action.getKey().indexOf("/z_order_") != -1) { //$NON-NLS-1$
		// addActionListener(JO.service.getContextMenuGeneralService());
		// } else {
		// JOService.addActionProvider(this, action.getKey());
		// }
	}

	@Override
	public void addActionListener(RcplActionListener actionListener) {
		// TODO Auto-generated method stub

	}

}
