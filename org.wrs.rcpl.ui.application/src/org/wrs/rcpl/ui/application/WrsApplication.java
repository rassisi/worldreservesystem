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
package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.application.RcplApplication;
import org.eclipse.rcpl.application.RcplApplicationProvider;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.RcplSession;

/**
 * @author ramin
 *
 */
public class WrsApplication extends RcplApplication {

	public static void main(String[] args) {
		RcplApplicationProvider.init(args);
		launch(args);
	}

	@Override
	protected void initApplication() {
		RcplSession.addAdditionalCodebases(
				"https://raw.githubusercontent.com/rassisi/worldreservesystem/master/org.wrs.resources/svg/");
		Rcpl.rcplApplicationProvider = new RcplApplicationProvider(this);
		Rcpl.setMobile(false);
		RCPLModel.modelClass = WrsModel.class;
		RCPLModel.XMIName = "wrs";
		Rcpl.rcplApplicationProvider.registerRcplAddonClass(WrsApplicationAddon.class.getName());
		Rcpl.rcplApplicationProvider
				.registerRcplAddonClass("org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorPlugin");
	}
}
