package org.wrs.rcpl.ui.application;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.rcpl.model.client.AbstractSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.provider.RcplItemProviderAdapterFactory;
import org.wrs.model.wrs.provider.WrsItemProviderAdapterFactory;

public class WrsSession extends AbstractSession {

	@Override
	protected void addAdapterFactories(ComposedAdapterFactory composedAdapterFactory) {
		composedAdapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		composedAdapterFactory.addAdapterFactory(new RcplItemProviderAdapterFactory());
		composedAdapterFactory.addAdapterFactory(new WrsItemProviderAdapterFactory());
		composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

}
