package org.eclipse.rcpl.ui.parts.contacts;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;

public interface EContactsModelManager {

	public static EContactsModelFactory FACTORY = new EContactsModelFactory();

	AdapterFactory getAdapterFactory();

	EditingDomain getEditingDomain();

}