package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import com.joffice.rcpl.addon.office.internal.impl.JOToolFactory;

/**
 * @author ramin
 *
 */
public class WrsToolFactory extends JOToolFactory {

	@Override
	public ITool createTool(final Tool eTool) {

		switch (eTool.getType()) {

		default:
			return super.createTool(eTool);
		}

	}

}
