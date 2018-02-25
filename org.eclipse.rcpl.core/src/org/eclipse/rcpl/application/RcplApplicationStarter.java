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
package org.eclipse.rcpl.application;

import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.IWindowAdvisor;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplLogin;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * @author ramin
 *
 */
public abstract class RcplApplicationStarter implements IApplicationStarter {

	private final IRcplApplicationProvider applicationProvider;

	private IRcplUic uic = null;

	private IWindowAdvisor windowAdvisor;

	public RcplApplicationStarter(IRcplApplicationProvider applicationProvider) {
		this.applicationProvider = applicationProvider;
	}

	/**
	 * @param login
	 * @param task
	 * @param primaryStage
	 * @return
	 */
	@Override
	public boolean start(final RcplLogin login, final Stage primaryStage) {
		JOSession.getDefault().STANDALONE = true;
		Rcpl.setFactory(createRcplFactory());
		Rcpl.setToolFactory(createToolFactory());
		Rcpl.progressMessage("Collapse All");
		login.getController().collapseAll();
		RCPLModel.configuration = new RcplConfig();

		Rcpl.progressMessage("Create UIC");
		uic = createUIC(login);

		Rcpl.progressMessage("Init Session");

		if (!uic.initSession(login)) {
			Rcpl.progressMessage("Init Session failed");
			return false;
		}

		Rcpl.progressMessage("Bind Plugins to Model");
		applicationProvider.bindPluginsToModel();

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				uic.createContent();
				if (Rcpl.isMobile()) {
					uic.addtoApplicationStack(applicationProvider.getMainContentGroup());
				} else {
					windowAdvisor = createWindowAdvisor();
					windowAdvisor.start();
					windowAdvisor.openMainWindow();
				}
				uic.showOverviewPage();
				uic.updateStartMenuButton();
				RCPLModel.log(this, "User dir: " + RCPLModel.mobileProvider.getApplicationDir().toString());

			}
		});

		return true;
	}

	protected abstract IWindowAdvisor createWindowAdvisor();

	protected abstract IToolFactory createToolFactory();

	protected abstract IRcplFactory createRcplFactory();

	protected IRcplUic createUIC(RcplLogin login) {
		return new RcplUic(this);
	}

	public IRcplApplicationProvider getRcplApplicationProvider() {
		return applicationProvider;
	}

}
