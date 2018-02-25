package org.eclipse.rcpl.plugin.tools.parts;

public class EToolsModelFactory {

	public EToolsModelManager newInstance() {
		return new EToolsModelManagerImpl();
	}
}
