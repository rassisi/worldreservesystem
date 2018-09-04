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

import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.application.AbstractApplicationProvider;
import org.eclipse.rcpl.application.AbstractRcplApplication;
import org.eclipse.rcpl.model.ISessionFacory;
import org.eclipse.rcpl.model.RcplModel;
import org.wrs.rcpl.ui.factories.WrsSessionFactory;

/**
 * @author ramin
 *
 */
public class WrsApplication extends AbstractRcplApplication {

	private final static String APPLICATION_ID = "wrs";

	public static void main(String[] args) {
		AbstractApplicationProvider.init(args);
		launch(args);
	}

	@Override
	protected IRcplApplicationProvider createApplicationProvider() {
		return new WrsApplicationProvider(this);
	}

	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication) {
		return new WrsApplicationStarter(getApplicationProvider());
	}

	@Override
	protected boolean isMobile() {
		return false;
	}

	@Override
	protected Class<? extends RcplModel> getRcplModel() {
		return WrsModel.class;
	}

	@Override
	protected ISessionFacory createSessionFactory() {
		ISessionFacory factory = new WrsSessionFactory();
		return factory;
	}

	@Override
	public String getId() {
		return APPLICATION_ID;
	}

	@Override
	protected void doInitApplication() {

	}

}
