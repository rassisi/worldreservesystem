package org.eclipse.rcpl.model_2_0_0;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class JOfficeModelGeneratedPlugin implements BundleActivator {

	private static BundleContext context;

	public static IImageProvider imageProvider;

	public static ITextProvider textProvider;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		JOfficeModelGeneratedPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		JOfficeModelGeneratedPlugin.context = null;
	}

}
