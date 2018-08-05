package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.ILogin;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.ui.controler.RcplUic;

import com.joffice.rcpl.addon.office.application.JOApplicationStarter;

/**
 * @author Ramin
 *
 */
public class WrsApplicationStarter extends JOApplicationStarter {

	public WrsApplicationStarter(IRcplApplicationProvider applicationProvider) {
		super(applicationProvider);
	}

	@Override
	protected RcplUic createUIC(ILogin login) {
		return new WrsUic(this);
	}

}
