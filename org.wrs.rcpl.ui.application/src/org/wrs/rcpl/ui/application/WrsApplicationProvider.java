package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.application.RcplApplication;

import com.joffice.rcpl.addon.office.application.JOApplicationProvider;

/**
 * @author ramin
 *
 */
public class WrsApplicationProvider extends JOApplicationProvider {

	public WrsApplicationProvider(RcplApplication rcplApplication) {
		super(rcplApplication);
	}

	@Override
	public String getName() {
		return "My TERRA Wallet by World Reserve System";
	}

	@Override
	public String getImage() {
		return "wrs";
	}

}
