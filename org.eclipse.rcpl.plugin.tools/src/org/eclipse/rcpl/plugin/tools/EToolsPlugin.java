package org.eclipse.rcpl.plugin.tools;

import org.eclipse.fxrcplight.IRcplApplication;
import org.eclipse.fxrcplight.JOAbstractMigration;
import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.RcplPlugin;
import org.eclipse.rcpl.navigator.EViewController;
import org.eclipse.rcpl.plugin.tools.parts.EToolsMigration;
import org.eclipse.rcpl.plugin.tools.parts.EToolsPluginController;

/**
 * @author Ramin
 * 
 */
@RcplPlugin
public class EToolsPlugin extends AbstractRcplPlugin implements IRcplPlugin {

	public static final String USE_CASE_ID = "USE_CASE_TOOLS";

	public EToolsPlugin() {
		// super(USE_CASE_ID);
	}

	@Override
	public EToolsPluginController getController() {
		return (EToolsPluginController) super.getController();
	}

	@Override
	public void init() {
		super.init();
	}

	@Override
	public String getDisplayName() {
		return "Setup Tools";
	}

	@Override
	protected EViewController createController() {
		return new EToolsPluginController();
	}

	@Override
	protected JOAbstractMigration getMigration() {
		return new EToolsMigration(this);
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
