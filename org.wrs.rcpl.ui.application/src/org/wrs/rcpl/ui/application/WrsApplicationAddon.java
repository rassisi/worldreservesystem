package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.AbstractRcplAddon;
import org.eclipse.rcpl.IRcplAddon;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplAddon;

/**
 * @author Ramin
 * 
 */
@RcplAddon
public class WrsApplicationAddon extends AbstractRcplAddon implements IRcplAddon {

	public WrsApplicationAddon() {
	}

	@Override
	public String getDisplayName() {
		return "World Reserve Systems";
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		return null;
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
