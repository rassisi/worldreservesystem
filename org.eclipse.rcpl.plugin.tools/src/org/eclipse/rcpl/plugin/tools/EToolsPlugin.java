package org.eclipse.rcpl.plugin.tools;

import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.IRcplPluginControler;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.RcplPlugin;
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
	public IApplicationStarter createApplicationStarter(IRcplApplicationProvider application) {
		return null;
	}

	@Override
	public boolean isCustomApplication() {
		return false;
	}

	@Override
	protected RcplAbstractMigration getMigration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IRcplPluginControler createController() {
		// TODO Auto-generated method stub
		return null;
	}


}
