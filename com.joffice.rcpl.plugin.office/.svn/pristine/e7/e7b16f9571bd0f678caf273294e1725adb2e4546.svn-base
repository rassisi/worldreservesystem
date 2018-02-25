package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IObverserObvervable;

import com.joffice.rcpl.plugin.office.JOObject;

/**
 * @author ramin
 * 
 * @param <T>
 */
@SuppressWarnings("hiding")
public abstract class JOPropertyBoolean<Boolean> extends JOProperty<Boolean>
		implements IObverserObvervable {

	public JOPropertyBoolean(JOObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, String key) {
		super(layoutObject, xmlParent, xmlObject, key);
	}

	public JOPropertyBoolean(JOObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, String key,boolean immutable) {
		super(null, layoutObject, xmlParent, xmlObject, key, immutable);
	}

	// @Override
	// public Boolean get() {
	// if (data == null) {
	// }
	// return (Boolean) data;
	// }

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

}
