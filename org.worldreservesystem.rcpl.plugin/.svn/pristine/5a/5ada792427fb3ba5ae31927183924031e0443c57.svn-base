package com.joffice.rcpl.plugin.office;

import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;

import com.joffice.rcpl.plugin.office.application.JOApplicationStarter;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class JORcplPlugin extends AbstractRcplPlugin implements IRcplPlugin {

	public JORcplPlugin() {
	}

	@Override
	public String getDisplayName() {
		return "JOffice";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return null; // new EContactsMigration(this);
	}

	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication) {
		return new JOApplicationStarter(rcplApplication);
	}

	@Override
	public boolean isCustomApplication() {
		return true;
	}

	@Override
	protected IRcplPluginControler createController() {
		return null;
	}

}
