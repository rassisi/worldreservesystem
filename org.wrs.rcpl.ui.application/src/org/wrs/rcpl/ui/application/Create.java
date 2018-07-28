package org.wrs.rcpl.ui.application;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.wrs.wrs.Accounts;
import org.wrs.wrs.WrsFactory;
import org.wrs.wrs.wrs;
import org.wrs.wrs.impl.WrsPackageImpl;

public class Create {
	public void create() {
		WrsPackageImpl.init();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI("mymodel.xmi"));
		wrs w = WrsFactory.eINSTANCE.createwrs();
		resource.getContents().add(w);

		Accounts accounts = WrsFactory.eINSTANCE.createAccounts();
		w.setAccounts(accounts);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load() {
		// Initialize the model
		WrsPackageImpl.init();
		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("person", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI("mymodel.xmi"), true);

	}

	public static void main(String[] args) {
		Create test = new Create();
		test.create();
//		test.load();
	}
}