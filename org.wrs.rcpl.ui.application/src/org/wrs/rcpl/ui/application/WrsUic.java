package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.application.RcplApplicationStarter;
import org.eclipse.rcpl.login.RcplLogin;

import com.joffice.rcpl.addon.office.application.JOUic;

/**
 * @author ramin
 *
 */
public class WrsUic extends JOUic {

	public WrsUic(RcplApplicationStarter rcp) {
		super(rcp);
	}

	@Override
	public boolean initSession(RcplLogin login) {
		boolean result = super.initSession(login);
		if (result) {
//			WRS wrs = (WRS) RcplSession.getDefault().getApplicationRootObject();
//
//			System.out.println(wrs);

		}
		return result;
	}
}
