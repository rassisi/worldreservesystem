package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.IWindowAdvisor;
import org.eclipse.rcpl.RcplLogin;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.application.RcplApplicationStarter;
import org.eclipse.rcpl.application.RcplWindowAdvisor;
import org.eclipse.rcpl.model.RCPLModel;


import javafx.stage.Stage;

public class WrsApplicationStarter extends RcplApplicationStarter {

	public WrsApplicationStarter(IRcplApplicationProvider applicationProvider) {
		super(applicationProvider);
	}

	@Override
	protected RcplUic createUIC(RcplLogin login) {
		return new WrsUic(this);
	}

	@Override
	public boolean start(RcplLogin login, Stage primaryStage) {
		RCPLModel.mobileProvider.appendLog("register Services");



		RCPLModel.mobileProvider.appendLog("super.start(login, primaryStage)");

		return super.start(login, primaryStage);
	}

	@Override
	protected IWindowAdvisor createWindowAdvisor() {
		return new RcplWindowAdvisor(getRcplApplicationProvider(),
				getClass().getResource("/css/default.css").toExternalForm());
	}

	@Override
	protected IToolFactory createToolFactory() {
		return new WrsToolFactory();
	}

	@Override
	protected IRcplFactory createRcplFactory() {
		return new WrsFactory();
	}
}
