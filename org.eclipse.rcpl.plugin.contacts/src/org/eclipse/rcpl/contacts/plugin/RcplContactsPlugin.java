package org.eclipse.rcpl.contacts.plugin;

import org.eclipse.fxrcplight.EViewController;
import org.eclipse.fxrcplight.IApplicationStarter;
import org.eclipse.fxrcplight.IRcplApplication;
import org.eclipse.fxrcplight.IRcplPlugin;
import org.eclipse.fxrcplight.JOAbstractMigration;
import org.eclipse.fxrcplight.AbstractRcplPlugin;
import org.eclipse.fxrcplight.RcplPlugin;
import org.eclipse.rcpl.ui.parts.contacts.EContactsMigration;
import org.eclipse.rcpl.ui.parts.contacts.EContactsPluginController;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class RcplContactsPlugin extends AbstractRcplPlugin implements IRcplPlugin {

	public static final String ID = "USE_CASE_CONTACTS";

	public RcplContactsPlugin() {
		super(ID);
	}

	@Override
	protected EViewController createController() {
		return new EContactsPluginController();
	}

	public EContactsPluginController getController() {
		return (EContactsPluginController) super.getController();
	}

	@Override
	public String getDisplayName() {
		return "Contacts";
	}

	@Override
	protected JOAbstractMigration getMigration() {
		return new EContactsMigration(this);
	}

	@Override
	public IApplicationStarter createApplicationStarter(IRcplApplication application) {
		return null;
	}

	@Override
	public boolean isCustomApplication() {
		return false;
	}

}