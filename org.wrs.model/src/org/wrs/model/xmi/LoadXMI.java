package org.wrs.model.xmi;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.wrs.model.wrs.impl.WrsPackageImpl;

public class LoadXMI {

	public void load() {
		// Initialize the model
		WrsPackageImpl.init();
		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI("wrs.xmi"), true);

		Iterator i = resource.getAllContents();

		while (i.hasNext()) {
			System.out.println(i.next().getClass().getName());
		}
	}

	public static void main(String[] args) {
		LoadXMI test = new LoadXMI();
		test.load();
	}
}