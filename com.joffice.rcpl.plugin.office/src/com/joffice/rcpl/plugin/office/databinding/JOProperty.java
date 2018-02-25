package com.joffice.rcpl.plugin.office.databinding;

import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;

import com.joffice.rcpl.plugin.office.JORegistry;

/**
 * @author ramin
 * 
 */
public abstract class JOProperty<T> implements IObverserObvervable, IJOProperty {

	protected XmlObject xmlObject;

	protected XmlObject xmlParent;

	protected List<IObverserObvervable> dataBindingObjects;

	protected boolean template;

	protected ILayoutObject layoutObject;

	protected IDocument document;

	/**
	 * cached data
	 */
	protected Object data;

	protected String key;

	public JOProperty(IDocument document, XmlObject xmlParent, XmlObject xmlObject, String key) {
		this(document, null, xmlParent, xmlObject, key, false);
	}

	/**
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOProperty(ILayoutObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, String key) {
		this(null, layoutObject, xmlParent, xmlObject, key, false);
	}

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOProperty(IDocument document, ILayoutObject layoutObject, XmlObject xmlParent, XmlObject xmlObject,
			String key, boolean immutable) {
		this.xmlObject = xmlObject;
		this.xmlParent = xmlParent;
		this.key = key;
		this.template = immutable;
		this.layoutObject = layoutObject;
		this.document = document;

		// set(xmlObject);
		// if (!immutable) {
		// JORegistry.addDatabindingObject(this);
		// bindDataToFigures();
		// }
	}

	/**
	 * // * //
	 */
	// @SuppressWarnings("rawtypes")
	// public void bindDataToFigures() {
	// // if(immutable){
	// // return;
	// // }
	// List<IObverserObvervable> dataBindingObjects = JORegistry
	// .getDatabindingFigures(key);
	// for (IObverserObvervable observerObversable : dataBindingObjects) {
	// if (this instanceof J OValueTabs
	// && getKey().equals(observerObversable.getKey())
	// && observerObversable instanceof Figure) {
	//
	// }
	//
	// // if (observerObversable instanceof OOXMLToolComposite
	// // && !(observerObversable instanceof OOXMLToolGroupComposite)) {
	// //
	// // }
	// if (observerObversable != this) {
	// if (getKey().equals(observerObversable.getKey())) {
	// observerObversable.addDataBinding(this);
	// }
	// }
	// }
	// }

	@Override
	public abstract T get();

	public abstract void set(XmlObject xmlObject);

	/**
	 * @param data
	 */
	public void addSibling(Object data) {
	}

	@Override
	public String getKey() {
		return key;
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
	public abstract JOProperty<T> createCopyFromTemplate(ILayoutObject layoutObject);

	public XmlObject getXmlParent() {
		return xmlParent;
	}

	public boolean isTemplate() {
		return template;
	}

	public ILayoutObject getLayoutObject() {
		return layoutObject;
	}

	@Override
	public abstract void update(ILayoutObject layoutObject, Object data);

	@Override
	public void update(IJOProperty dataBindingFigure, Object data) {
		// do nothing
	}

	@Override
	public void notifyDataBindingObjects(IJOProperty dataBindingFigure, Object arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyDataBindingObjects(Object arg) {
		// do nothing
	}

}
