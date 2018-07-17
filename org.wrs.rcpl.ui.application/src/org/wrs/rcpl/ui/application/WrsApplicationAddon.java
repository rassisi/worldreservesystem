package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.AbstractRcplAddon;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplAddon;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class WrsApplicationAddon extends AbstractRcplAddon implements IRcplAddon {

	public WrsApplicationAddon() {
	}

	@Override
	public String getDisplayName() {
		return "World Reserve Systems";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return null; // new EContactsMigration(this);
	}

	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication) {
		return new WrsApplicationStarter(rcplApplication);
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
