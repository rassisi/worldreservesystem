package com.joffice.rcpl.plugin.demo.application;

import org.eclipse.fxrcplight.IRcplApplication;
import org.eclipse.fxrcplight.IWindowAdvisor;
import org.eclipse.fxrcplight.JOLogin;
import org.eclipse.fxrcplight.JOProgressTask;
import org.eclipse.fxrcplight.RcplUic;
import org.eclipse.fxrcplight.application.RcplApplicationStarter;
import org.eclipse.fxrcplight.application.RcplWindowAdvisor;

public class DemoApplicationStarter extends RcplApplicationStarter {

	public DemoApplicationStarter(IRcplApplication application) {
		super(application);
	}

	@Override
	protected RcplUic createUIC(JOLogin login, JOProgressTask task) {
		return new DemoUic(this, task, login.getProgressBar().getProgressBar(),
				login.getProgressBar().getProgressMessage());
	}

	@Override
	protected IWindowAdvisor createWindowAdvisor() {
		return new RcplWindowAdvisor(getRcplApplication(), getClass().getResource("/css/default.css").toExternalForm());
	}
}
