package com.joffice.rcpl.plugin.office.databinding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.JORegistry;

/**
 * @author ramin
 * 
 */
public class JOInteger implements IObverserObvervable {

	protected XmlObject xmlObject;

	protected XmlObject xmlParent;

	protected List<IObverserObvervable> dataBindingObjects;

	protected boolean template;

	protected JOObject layoutObject;

	protected IDocument document;

	/**
	 * cached data
	 */
	protected Object data;

	protected String methodName;

	public JOInteger(IDocument document, XmlObject xmlParent, XmlObject xmlObject, String methodName) {
		this(document, null, xmlParent, xmlObject, methodName, false);
	}

	/**
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOInteger(JOObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, String methodName) {
		this(null, layoutObject, xmlParent, xmlObject, methodName, false);
	}

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOInteger(IDocument document, JOObject layoutObject, XmlObject xmlParent, XmlObject xmlObject,
			String methodName, boolean immutable) {
		this.xmlObject = xmlObject;
		this.xmlParent = xmlParent;
		this.methodName = methodName;
		this.template = immutable;
		this.layoutObject = layoutObject;
		this.document = document;

		// set(xmlObject);
		// if (!immutable) {
		// JORegistry.addDatabindingObject(this);
		// bindDataToFigures();
		// }
	}

	public Integer get() {
		try {
			if (xmlObject == null) {
				return 0;
			}
			Method method = xmlObject.getClass().getMethod("get" + methodName);
			data = method.invoke(xmlObject);
			return (Integer) data;

		} catch (SecurityException e) {

		} catch (NoSuchMethodException e) {

		} catch (IllegalArgumentException e) {

		} catch (IllegalAccessException e) {

		} catch (InvocationTargetException e) {

		}
		return 0;
	}

	/**
	 * @param data
	 */
	public void addSibling(Object data) {
	}

	@Override
	public String getKey() {
		return methodName;
	}

	public XmlObject getXmlObject() {
		return xmlObject;
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			JORegistry.removeDatabindingObject(this);
		} finally {
			super.finalize();
		}
	}

	// @Override
	// public void addDataBinding(IObverserObvervable dataBindingObject) {
	// getDataBindingObjects().add(dataBindingObject);
	// }

	/**
	 * @return
	 */
	public List<IObverserObvervable> getDataBindingObjects() {
		if (dataBindingObjects == null) {
			dataBindingObjects = new ArrayList<IObverserObvervable>();
		}
		return dataBindingObjects;
	}

	// @Override
	// public void notifyDataBindingObjects(this, Object arg) {
	// for (IObverserObvervable o : getDataBindingObjects()) {
	// o.update(this, data);
	// }
	// }

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

	public XmlObject getXmlParent() {
		return xmlParent;
	}

	public boolean isTemplate() {
		return template;
	}

	public JOObject getLayoutObject() {
		return layoutObject;
	}

	// @Override
	// public abstract void update(JOObject layoutObject, Object data);

	// @Override
	// public void update(JOProperty2<?> dataBindingFigure, Object data) {
	// // do nothing
	// }
	//
	// @Override
	// public void notifyDataBindingObjects(JOProperty2<?> dataBindingFigure,
	// Object arg) {
	// // TODO Auto-generated method stub
	//
	// }

	@Override
	public void notifyDataBindingObjects(Object arg) {
		// do nothing
	}

	@Override
	public void notifyDataBindingObjects(IJOProperty dataBindingFigure, Object arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ILayoutObject dataBindingObject, Object data) {
	}

	@Override
	public void update(IJOProperty dataBindingFigure, Object data) {
	}

}
