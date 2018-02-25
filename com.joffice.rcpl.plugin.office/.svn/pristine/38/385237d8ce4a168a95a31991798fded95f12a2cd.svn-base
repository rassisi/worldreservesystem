package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;

/**
 * @author ramin
 * 
 * @param <T>
 */
@SuppressWarnings("rawtypes")
public class JOPropertyTextAlign<T extends JOAlignment> extends JOProperty
		implements IObverserObvervable {

	/**
	 * @param xmlObject
	 */
	public JOPropertyTextAlign(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, Object defaultValue) {
		super(layoutObject, xmlParent, xmlObject, "text_align"); //$NON-NLS-1$
		if (defaultValue != null) {
			data = defaultValue;
		}
	}

	@Override
	public JOAlignment get() {
		if (data == null) {
			if (xmlObject instanceof CTTextParagraphProperties) {
				STTextAlignType.Enum type = ((CTTextParagraphProperties) xmlObject)
						.getAlgn();
				data = new JOAlignment(type);
			} else if (xmlObject instanceof CTJc) {
				CTJc type = (CTJc) xmlObject;
				data = new JOAlignment(type);
			}
		}
		return (JOAlignment) data;
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

	@Override
	public void set(XmlObject xmlObject) {
		// TODO Auto-generated method stub

	}

}
