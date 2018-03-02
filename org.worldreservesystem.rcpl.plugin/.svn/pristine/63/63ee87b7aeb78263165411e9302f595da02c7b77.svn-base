package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyLeftInset<T extends Double> extends
		JOPropertyInteger<Double> implements IObverserObvervable {

	/**
	 * @param xmlObject
	 */
	public JOPropertyLeftInset(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject) {
		super(layoutObject, xmlParent, xmlObject, "word/actions/shape/stroked"); //$NON-NLS-1$
		get();
	}

	@Override
	public Double get() {
		if (data == null) {
			if (xmlObject instanceof CTTextBodyProperties) {
				data = ((CTTextBodyProperties) xmlObject).getLIns();
			}
		}
		if (data == null) {
			return Double.valueOf(0);
		}
		return ((Integer) data).doubleValue();
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
		// TODO Auto-generated method stub

	}

	public double toPixel() {
		if (data == null) {
			return 0;
		}
		return JOConversion.emu2Pixel(((Integer) data).doubleValue());
	}

	@Override
	public JOProperty<Double> createCopyFromTemplate(ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
