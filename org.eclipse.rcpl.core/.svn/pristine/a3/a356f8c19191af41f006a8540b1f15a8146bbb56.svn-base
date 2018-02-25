package org.eclipse.rcpl.application;

import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class DefaultRcplPlugin extends AbstractRcplPlugin implements IRcplPlugin {

	public DefaultRcplPlugin() {
	}

	@Override
	public String getDisplayName() {
		return "Default RCPL Plugin";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return null; // new EContactsMigration(this);
	}

	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication) {
		return new DefaultApplicationStarter(rcplApplication);
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
