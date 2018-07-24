package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.application.DefaultApplicationStarter;
import org.eclipse.rcpl.login.RcplLogin;
import org.eclipse.rcpl.ui.controler.RcplUic;

/**
 * @author Ramin
 *
 */
public class WrsApplicationStarter extends DefaultApplicationStarter {

	public WrsApplicationStarter(IRcplApplicationProvider applicationProvider) {
		super(applicationProvider);
	}

	@Override
	protected RcplUic createUIC(RcplLogin login) {
		return new WrsUic(this);
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
