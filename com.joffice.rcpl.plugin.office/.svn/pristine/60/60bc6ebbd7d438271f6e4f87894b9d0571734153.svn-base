package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

import com.joffice.rcpl.plugin.office.JOObject;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyOnOff<T extends Boolean> extends JOPropertyBoolean<Boolean>
		implements IObverserObvervable {

	public JOPropertyOnOff(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, boolean immutable) {
		super(layoutObject, xmlParent, xmlObject,
				"word/actions/shape/stroked", immutable); //$NON-NLS-1$
	}

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 */
	public JOPropertyOnOff(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject) {
		super(layoutObject, xmlParent, xmlObject, "word/actions/shape/stroked"); //$NON-NLS-1$
	}

	@Override
	public Boolean get() {
		if (data == null) {
			if (xmlObject != null) {
				CTOnOff onOff = (CTOnOff) xmlObject;
				if (onOff != null) {
					STOnOff.Enum en = onOff.getVal();
					if (en != null) {
						if (en.equals(STOnOff.TRUE) || en.equals(STOnOff.ON)
								|| en.equals(STOnOff.X_1)) {
							data = Boolean.TRUE;
						} else {
							data = Boolean.FALSE;
						}
					} else {
						data = Boolean.TRUE;
					}
				}
			}
		}
		if (data == null) {
			return false;
		}
		return (Boolean) data;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JOProperty<Boolean> createCopyFromTemplate(ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}


}
