package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;

import schemasMicrosoftComVml.CTLine;
import schemasMicrosoftComVml.CTRect;
import schemasMicrosoftComVml.CTRoundRect;
import schemasMicrosoftComVml.CTShape;
import schemasMicrosoftComVml.CTShapetype;

import com.joffice.rcpl.plugin.office.JOObject;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyOpacity<T extends Double> extends JOProperty<Double>
		implements IObverserObvervable {

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOPropertyOpacity(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, String key) {
		super(layoutObject, xmlParent, xmlObject, key);
	}

	@Override
	public Double get() {
		if (data == null) {
			if (xmlObject instanceof CTRoundRect) {
				data = Double.valueOf(((CTRoundRect) xmlObject).getOpacity());
			} else if (xmlObject instanceof CTRect) {
				data = Double.valueOf(((CTRect) xmlObject).getOpacity());
			} else if (xmlObject instanceof CTLine) {
				data = Double.valueOf(((CTLine) xmlObject).getOpacity());
			} else if (xmlObject instanceof CTShape) {
				data = Double.valueOf(((CTShape) xmlObject).getOpacity());
			} else if (xmlObject instanceof CTShapetype) {
				data = Double.valueOf(((CTShapetype) xmlObject).getOpacity());
			} else {
				data = Double.valueOf(1);
			}
		}
		return (Double) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public JOProperty<Double> createCopyFromTemplate(ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
