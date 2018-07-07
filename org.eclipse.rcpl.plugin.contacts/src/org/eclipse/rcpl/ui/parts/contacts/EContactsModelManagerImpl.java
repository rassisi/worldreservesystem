package org.eclipse.rcpl.ui.parts.contacts;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.provider.RcplItemProviderAdapterFactory;

/**
 * @author Ramin
 * 
 */
public class EContactsModelManagerImpl implements EContactsModelManager {

	public static EditingDomain editingDomain;

	public static ComposedAdapterFactory adapterFactory;

	public EContactsModelManagerImpl() {
		if (adapterFactory == null) {
			adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			adapterFactory
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new RcplItemProviderAdapterFactory());

			adapterFactory
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		}

	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public EditingDomain getEditingDomain() {
		if (editingDomain == null) {
			{
				BasicCommandStack commandStack = new BasicCommandStack();
				editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
						commandStack);
			}

			try {
				editingDomain.getResourceSet().getResources()
						.add(JOSession.getDefault().getResource());
			} catch (Exception ex) {
				// System. out.println();
			}

		}
		return editingDomain;
	}

}
