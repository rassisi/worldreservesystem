package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.ILogin;
import org.eclipse.rcpl.application.AbstractApplicationStarter;

import com.joffice.rcpl.addon.office.application.JOUic;

/**
 * @author ramin
 *
 */
public class WrsUic extends JOUic {

	public WrsUic(AbstractApplicationStarter rcp) {
		super(rcp);
	}

	@Override
	public boolean initSession(ILogin login) {
		boolean result = super.initSession(login);
		if (result) {
//			WRS wrs = (WRS) RcplSession.getDefault().getApplicationRootObject();
//
//			System.out.println(wrs);

		}
		return result;
	}
}
