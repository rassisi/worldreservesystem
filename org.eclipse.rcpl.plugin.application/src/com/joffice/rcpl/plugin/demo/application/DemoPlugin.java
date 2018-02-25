package com.joffice.rcpl.plugin.demo.application;

import org.eclipse.fxrcplight.AbstractRcplPlugin;
import org.eclipse.fxrcplight.EViewController;
import org.eclipse.fxrcplight.IApplicationStarter;
import org.eclipse.fxrcplight.IRcplApplication;
import org.eclipse.fxrcplight.IRcplPlugin;
import org.eclipse.fxrcplight.JOAbstractMigration;
import org.eclipse.fxrcplight.RcplPlugin;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class DemoPlugin extends AbstractRcplPlugin implements IRcplPlugin {

	public static final String ID = "DEMO_APPLICATION";

	public DemoPlugin() {
		super(ID);
	}



	@Override
	public String getDisplayName() {
		return "Demo Application";
	}

	@Override
	protected JOAbstractMigration getMigration() {
		return null; // new EContactsMigration(this);
	}



	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplication rcplApplication) {
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
