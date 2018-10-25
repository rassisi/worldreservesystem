package org.wrs.rcpl.ui.factories;

import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.wrs.rcpl.ui.tools.AccountsOverviewTool;

import com.joffice.rcpl.addon.office.internal.impl.factories.JOToolFactory;

/**
 * @author ramin
 *
 */
public class WrsToolFactory extends JOToolFactory {

	private final static String ACCOUNTS_OVERVIEW = "ACCOUNTS_OVERVIEW";

	@Override
	public ITool createTool(final Tool eTool, Object... data) {

		switch (eTool.getType()) {
		case OTHER:
			if (ACCOUNTS_OVERVIEW.equals(eTool.getId())) {
				return new AccountsOverviewTool(eTool);
			}
			break;
		default:
		}

		return super.createTool(eTool);

	}

}
