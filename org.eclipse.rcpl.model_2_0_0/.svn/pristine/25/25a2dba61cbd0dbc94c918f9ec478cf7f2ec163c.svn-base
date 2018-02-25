package org.eclipse.rcpl.model;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;

public class ModelPlugin implements BundleActivator {

	public final static String VERSION = "0.1.1.2";

	private static final String F_META_AREA = ".metadata"; //$NON-NLS-1$
	private static final String F_PLUGIN_DATA = ".plugins"; //$NON-NLS-1$

	private static ModelPlugin instance;

	private BundleContext context;

	@SuppressWarnings("rawtypes")
	private ServiceTracker locationServiceTracker;

	private IPath stateLocation;

	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;
		this.context = context;

		// Platform.getBundle("org.eclipse.emf.cdo.server").start();

		// EclipseStarter.

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		this.context = null;
		instance = null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IPath getStateLocation() {
		try {
			if (stateLocation == null) {
				Filter filter = context.createFilter(Location.INSTANCE_FILTER);
				if (locationServiceTracker == null) {
					locationServiceTracker = new ServiceTracker(context, filter, null);
					locationServiceTracker.open();
				}
				Location location = (Location) locationServiceTracker.getService();
				if (location != null) {
					IPath path = new Path(location.getURL().getPath());
					stateLocation = path.append(F_META_AREA).append(F_PLUGIN_DATA)
							.append(context.getBundle().getSymbolicName());
					stateLocation.toFile().mkdirs();
				}
			}
		} catch (InvalidSyntaxException e) {
			// ignore this. It should never happen as we have tested the above
			// format.
		}
		return stateLocation;
	}

	public static ModelPlugin getInstance() {
		return instance;
	}

}
