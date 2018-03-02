package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.Method;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;

/**
 * @author ramin
 * 
 */
public class JOStringProperty extends JOProperty2 {
	//
	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOStringProperty.class);

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOStringProperty(ILayoutObject joObject, Object parent, Object object, String methodName,
			String[] dataBindingKeys, EValueType valueType) {
		super(joObject, parent, object, methodName, dataBindingKeys, valueType);
		argTypes = new Class[] { String.class };
	}

	@Override
	public String get() {
		try {
			if (object == null) {
				return null;
			}
			Object result = getValue();
			if (result == null) {
				data = ""; //$NON-NLS-1$
			} else {
				data = result;
			}
			return (String) data;
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public Method setMethod() {
		return super.setMethod();
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
