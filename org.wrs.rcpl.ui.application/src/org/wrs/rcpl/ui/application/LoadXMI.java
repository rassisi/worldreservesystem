package org.wrs.rcpl.ui.application;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import wrs.impl.WrsPackageImpl;

public class LoadXMI {

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
		LoadXMI test = new LoadXMI();
		test.load();
	}
}