package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.Method;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;

/**
 * @author ramin
 * 
 */
public class JODouble extends JOProperty2 {

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JODouble(ILayoutObject joObject, XmlObject xmlParent,
			XmlObject xmlObject, String methodName, String[] dataBindingKeys,
			EValueType valueType) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys,
				valueType);
	}

	@Override
	public Double get() {
		getValue();
		if (object == null) {
			return 0.0;
		}
		return (Double) data;
	}

	@Override
	public Method setMethod() {
		return null;
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
