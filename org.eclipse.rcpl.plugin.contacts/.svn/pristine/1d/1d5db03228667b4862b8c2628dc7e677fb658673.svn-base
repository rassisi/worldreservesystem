package org.eclipse.rcpl.contacts.plugin;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rcpl.ui.parts.contacts.EContactsModelManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author ramin
 *
 */
public class OsgiContactsPlugin implements BundleActivator {

	private static BundleContext context;

	private static OsgiContactsPlugin instance;

	private EContactsModelManager modelManager;

	static BundleContext getContext() {
		return context;
	}

	public OsgiContactsPlugin() {
		instance = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		OsgiContactsPlugin.context = bundleContext;
//		JO.UIC.registerRcplPlugin(RcplContactsPlugin.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		OsgiContactsPlugin.context = null;
	}

	public static OsgiContactsPlugin getDefault() {

		// This is for Standalone
		if (instance == null) {
			instance = new OsgiContactsPlugin();
		}
		return instance;
	}

	public EContactsModelManager getModelManager() {
		if (modelManager == null) {
			modelManager = EContactsModelManager.FACTORY.newInstance();
		}
		return modelManager;
	}

	public static EditingDomain getEditingDomain() {
		return getDefault().getModelManager().getEditingDomain();
	}
}
