package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.IServiceFactory;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.application.AbstractRcplApplication;
import org.wrs.rcpl.ui.factories.WrsFactory;
import org.wrs.rcpl.ui.factories.WrsToolFactory;
import org.wrs.rcpl.ui.images.WrsImages;

import com.joffice.rcpl.addon.office.application.JOApplicationProvider;

/**
 * @author ramin
 *
 */
public class WrsApplicationProvider extends JOApplicationProvider {

	public WrsApplicationProvider(AbstractRcplApplication rcplApplication) {
		super(rcplApplication);
	}

	@Override
	public String getName() {
		return "My TERRA Wallet by World Reserve System";
	}

	@Override
	public String getImage() {
		return "wrs";
	}

	@Override
	protected IToolFactory createToolFactory() {
		return new WrsToolFactory();
	}

	@Override
	protected IRcplFactory createRcplFactory() {
		return new WrsFactory();
	}

	@Override
	public Class<?> getApplicationResourceBaseClass() {
		return WrsImages.class;
	}

	@Override
	protected IServiceFactory createServiceFactory() {
		return super.createServiceFactory();
	}
}
