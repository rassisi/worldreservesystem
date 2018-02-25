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

package org.eclipse.rcpl.internal.tools;

import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.scene.control.ListView;

/**
 * @author ramin
 *
 */
/**
 * @author ramin
 *
 */
public class JOListTool extends RcplTool {

	public JOListTool(Tool tool) {
		super(tool);
	}

	@Override
	public ListView<String> createNode() {
		return new ListView<String>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ListView<String> getNode() {
		return (ListView<String>) super.getNode();
	}

}
