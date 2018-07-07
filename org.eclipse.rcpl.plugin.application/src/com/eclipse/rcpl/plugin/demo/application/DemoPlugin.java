package com.eclipse.rcpl.plugin.demo.application;

import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;
import org.eclipse.rcpl.navigator.EViewController;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class DemoPlugin extends AbstractRcplPlugin implements IRcplPlugin {

	public static final String ID = "DEMO_APPLICATION";





	@Override
	public String getDisplayName() {
		return "Demo Application";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return null; // new EContactsMigration(this);
	}



	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication) {
		return new DemoApplicationStarter(rcplApplication);
	}



	@Override
	protected EViewController createController() {
		return null;
	}
	
	@Override
	public boolean isCustomApplication() {
		return false;
	}


}
