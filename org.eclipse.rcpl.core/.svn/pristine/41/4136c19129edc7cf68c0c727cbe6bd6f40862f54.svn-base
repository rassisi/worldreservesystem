package org.eclipse.rcpl.navigator;

import org.eclipse.rcpl.navigator.tree.model.manager.UCEmfTreeModelManagerImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class RcplNavigatorPlugin  implements BundleActivator {

	private static BundleContext context;

	private static RcplNavigatorPlugin INSTANCE;

	static BundleContext getContext() {
		return context;
	}

	public RcplNavigatorPlugin() {
		INSTANCE = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		RcplNavigatorPlugin.context = bundleContext;
		manager = new UCEmfTreeModelManagerImpl();

		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		RcplNavigatorPlugin.context = null;
	}



	public static RcplNavigatorPlugin getDefault() {
		return INSTANCE;
	}


	
	
	private UCModelManager manager;

	public UCModelManager getManager() {
		return manager;
	}	
}
