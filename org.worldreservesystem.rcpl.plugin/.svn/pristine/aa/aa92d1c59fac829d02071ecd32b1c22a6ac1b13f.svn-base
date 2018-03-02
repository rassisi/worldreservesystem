package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;

import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;

/**
 * @author ramin
 * 
 */
public class JOAlignmentProperty extends JOProperty2 {

	/**
	 * @param document
	 * @param layoutObject
	 * @param parent
	 * @param object
	 * @param methodName
	 * @param immutable
	 */
	public JOAlignmentProperty(ILayoutObject joObject, Object parent,
			Object object, String methodName, String[] dataBindingKeys) {
		super(joObject, parent, object, methodName, dataBindingKeys,
				EValueType.ALIGNMENT);
	}

	@Override
	public JOAlignment get() {
		Object result = getValue();
		if (result instanceof STVerticalJc.Enum) {
			STVerticalJc.Enum v = (STVerticalJc.Enum) result;
			JOAlignment alignment = new JOAlignment(v);
			data = alignment;
		} else if (result instanceof HorizontalAlignment) {
			JOAlignment alignment = new JOAlignment(
					(HorizontalAlignment) result);
			data = alignment;
		} else if (result instanceof VerticalAlignment) {

			JOAlignment alignment = new JOAlignment((VerticalAlignment) result);
			data = alignment;
		}
		return (JOAlignment) data;
	}

	@Override
	public Method setMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
