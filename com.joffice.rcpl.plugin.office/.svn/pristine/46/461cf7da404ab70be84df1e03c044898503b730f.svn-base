package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSectionMark;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOSectionType;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertySectionType<T extends JOSectionType> extends
		JOProperty<JOSectionType> implements IObverserObvervable {

	private CTSectType type;

	/**
	 * @param xmlParent
	 * @param xmlObject
	 */
	public JOPropertySectionType(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject) {
		super(layoutObject, xmlParent, xmlObject,
				"word/actions/paragraph/sectionType"); //$NON-NLS-1$
	}

	@Override
	public JOSectionType get() {
		if (data == null) {
			set(xmlObject);
			STSectionMark.Enum sectType = type.getVal();
			if (sectType.equals(STSectionMark.CONTINUOUS)) {
				return JOSectionType.CONTINUOUS;
			} else if (sectType.equals(STSectionMark.EVEN_PAGE)) {
				return JOSectionType.EVEN;
			} else if (sectType.equals(STSectionMark.NEXT_COLUMN)) {
				return JOSectionType.NEXT_COLUMN;
			} else if (sectType.equals(STSectionMark.NEXT_PAGE)) {
				return JOSectionType.NEXT_PAGE;
			} else if (sectType.equals(STSectionMark.ODD_PAGE)) {
				return JOSectionType.ODD;
			}
		}
		return (JOSectionType) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		type = (CTSectType) xmlObject;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public JOProperty<JOSectionType> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
