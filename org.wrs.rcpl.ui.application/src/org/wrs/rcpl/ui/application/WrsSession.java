package org.wrs.rcpl.ui.application;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.rcpl.model.client.AbstractSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.provider.RcplItemProviderAdapterFactory;
import org.wrs.model.wrs.WrsFactory;
import org.wrs.model.wrs.WrsPackage;
import org.wrs.model.wrs.provider.WrsItemProviderAdapterFactory;

/**
 * @author ramin
 *
 * @param <WRS>
 */
public class WrsSession<WRS> extends AbstractSession<EObject> {

	@Override
	protected void addAdapterFactories(ComposedAdapterFactory composedAdapterFactory) {
		composedAdapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		composedAdapterFactory.addAdapterFactory(new RcplItemProviderAdapterFactory());
		composedAdapterFactory.addAdapterFactory(new WrsItemProviderAdapterFactory());
		composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	@Override
	protected void registerApplicationPackages(CDOSession cdoSession) {
		cdoSession.getPackageRegistry().putEPackage(WrsPackage.eINSTANCE);
	}

	@Override
	protected void createInitialApplicationModel(EList<EObject> contents) {
		org.wrs.model.wrs.WRS wrs = WrsFactory.eINSTANCE.createWRS();
		contents.add(wrs);
		wrs.getGenesisAccount();
		commit();
	}

}
