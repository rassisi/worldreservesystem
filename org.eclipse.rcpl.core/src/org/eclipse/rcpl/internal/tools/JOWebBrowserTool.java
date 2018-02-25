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

import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;

/**
 * @author ramin
 *
 */
public class JOWebBrowserTool extends RcplTool {

	public JOWebBrowserTool(Tool tool) {
		super(tool);
		WebView wv = new WebView();
		getNode().getChildren().add(wv);
		wv.getEngine().load(tool.getFormat());
	}

	@Override
	public StackPane createNode() {
		return new StackPane();
	}

	@Override
	public StackPane getNode() {
		return (StackPane) super.getNode();
	}
}
