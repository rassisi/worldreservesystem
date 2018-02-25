package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IProperty2;
import org.eclipse.rcpl.model.RCPLModel;

/**
 * @author ramin
 * 
 */
public abstract class JOProperty2 implements IProperty2 {

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOProperty2.class);

	protected Object object;

	protected Object parent;

	protected boolean template;

	/**
	 * cached data
	 */
	protected Object data;

	protected String methodName;

	protected Method getMethod;

	protected Method setMethod;

	protected ILayoutObject joObject;

	protected String[] dataBindingKeys;

	protected EValueType valueType;

	@SuppressWarnings("rawtypes")
	protected Class[] argTypes;

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOProperty2(ILayoutObject joObject, Object parent, Object object, String methodName,
			String[] dataBindingKeys, EValueType valueType) {
		this.joObject = joObject;
		this.object = object;
		this.parent = parent;
		this.methodName = methodName;
		this.dataBindingKeys = dataBindingKeys;
		this.valueType = valueType;
		if (dataBindingKeys != null && joObject != null && joObject.getDocument() != null) {
			joObject.getDocument().bind(this);
		}
	}

	/**
	 * @return
	 */
	@Override
	public abstract Object get();

	@SuppressWarnings("rawtypes")
	protected Class[] getArgTypes() {
		return argTypes;
	}

	/**
	 * @return
	 */
	public Object getValue() {
		if (object == null || methodName == null || methodName.length() == 0) {
			return null;
		}
		if (getMethod() == null) {
			return null;
		}
		try {
			data = getMethod().invoke(object);
		} catch (IllegalArgumentException e) {
			RCPLModel.logError(e);
		} catch (IllegalAccessException e) {
			RCPLModel.logError(e);
		} catch (InvocationTargetException e) {
			RCPLModel.logError(e);
		}
		return data;
	}

	/**
	 * @param data
	 */
	public boolean set(Object data) {
		try {
			if (object == null) {
				createObject();
			}
			Object arg = objectToXml(data);
			setMethod().invoke(object, arg);
			if (joObject != null) {
				joObject.setDirtyContent(true);
				joObject.updateFromXml();
			}
			data = null;
			return true;
		} catch (IllegalArgumentException e) {
			RCPLModel.logError(e);
		} catch (IllegalAccessException e) {
			RCPLModel.logError(e);
		} catch (InvocationTargetException e) {
			RCPLModel.logError(e);
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		return false;
	}

	/**
	 * @return
	 */
	public boolean isSet() {
		get();
		return data != null;
	}

	/**
	 * 
	 */
	protected abstract void createObject();

	/**
	 * @param dat
	 * @return
	 */
	protected Object objectToXml(Object dat) {
		return dat;
	}

	/**
	 * @return
	 */
	private Method getMethod() {
		if (getMethod == null) {
			try {
				getMethod = object.getClass().getMethod("get" + methodName);//$NON-NLS-1$
			} catch (SecurityException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (NoSuchMethodException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
		return getMethod;
	}

	/**
	 * @return
	 */
	public Method setMethod() {
		if (setMethod == null) {
			try {
				setMethod = object.getClass().getMethod("set" + methodName, //$NON-NLS-1$
						getArgTypes());
			} catch (SecurityException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (NoSuchMethodException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
		return setMethod;
	}

	/**
	 * @return
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * This method creates a copy if the value is a template and thatswhy
	 * immutable. After that the layoutObject has to be updated from XML.
	 * 
	 * @example if (isTemplate()) {<br/>
	 *          if (((CTPPr) xmlParent).getInd() != null) {<br/>
	 *          ((CTPPr) xmlParent).unsetInd();<br/>
	 *          }<br/>
	 *          xmlObject = ((CTPPr)xmlParent).addNewInd();<br/>
	 *          xmlObject.set(getXmlObject());<br/>
	 *          template = false;<br/>
	 *          }<br/>
	 */
	// public abstract JOInteger<T> createCopyFromTemplate(JOObject
	// layoutObject);

	public Object getParent() {
		return parent;
	}

	/**
	 * @return
	 */
	public boolean isTemplate() {
		return template;
	}

	/**
	 * @return
	 */
	public String[] getDataBindingKeys() {
		return dataBindingKeys;
	}

	/**
	 * @return
	 */
	public EValueType getValueType() {
		return valueType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "object: " + object.toString() + " method: " + methodName; //$NON-NLS-1$//$NON-NLS-2$
	}

	public String getMethodName() {
		return methodName;
	}

	public ILayoutObject getJoObject() {
		return joObject;
	}

}
