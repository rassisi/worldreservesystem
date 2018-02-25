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

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ColorPicker;

/**
 * @author ramin
 *
 */
public class ColorTool extends RcplTool {

	@Override
	public ColorPicker getNode() {
		return (ColorPicker) super.getNode();
	}

	public ColorTool(Tool eTool) {
		super(eTool);
		eTool.setData(this);

		getNode().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ICommand command = Rcpl.getFactory().createCommand(getEditor(), ColorTool.this);
				Rcpl.service().execute(command);
			}
		});

	}

	@Override
	public Node createNode() {
		return new ColorPicker();
	}

}
