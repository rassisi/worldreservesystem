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
package org.wordreservesystem.rcpl.application;

import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.application.RcplApplicationProvider;
import org.eclipse.rcpl.model.RCPLModel;
import org.worldreservesystem.core.WRS;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author ramin
 *
 */
public class WRSRcplApplication extends Application {

	public static void main(String[] args) {
		RcplApplicationProvider.init(args);
		launch(args);
	}

	@Override
	public void start(final Stage primaryStage) {
		Rcpl.rcplApplicationProvider = new RcplApplicationProvider(this);
		RCPLModel.modelClass = WRS.class;
		RCPLModel.XMIName = "rcpl";
		Rcpl.setMobile(false);
//		Rcpl.rcplApplicationProvider.registerRcplPluginClass("com.joffice.rcpl.plugin.office.JORcplPlugin");
		Rcpl.rcplApplicationProvider
//			.registerRcplPluginClass("org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorPlugin");
		
		.registerRcplPluginClass("org.worldreservesystem.navigator.NavigatorPlugin");
		Rcpl.rcplApplicationProvider.start(primaryStage);

	}
}
