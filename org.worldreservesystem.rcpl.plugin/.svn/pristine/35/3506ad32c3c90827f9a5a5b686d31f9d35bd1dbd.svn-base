package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.ILayoutObject;

import com.joffice.rcpl.plugin.office.databinding.types.JOBorder;

/**
 * @author ramin
 * 
 */
public class JOMarginProperty extends JOProperty2 {

	// public static JOBorderProperty create(XmlObject xO, String methodName) {
	// if (xO == null) {
	// return null;
	// }
	// return new JOBorderProperty(null, xO, methodName);
	// }

	/**
	 * @param document
	 * @param layoutObject
	 * @param parent
	 * @param object
	 * @param methodName
	 * @param immutable
	 */
	public JOMarginProperty(ILayoutObject joObject, Object parent,
			Object object, String methodName, String[] dataBindingKeys) {
		super(joObject, parent, object, methodName, dataBindingKeys,
				EValueType.ENUM);
	}

	@Override
	public IBorder get() {
		if (data == null) {
			Object result = getValue();
			if (result instanceof BorderStyle) {
				IBorder border = new JOBorder();
				BorderStyle style = (BorderStyle) result;
				if (style.equals(BorderStyle.THIN)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.DASH_DOT)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.DASH_DOT_DOT)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.DASHED)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.DOTTED)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.DOUBLE)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.HAIR)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.MEDIUM)) {
					border.setLineWidth(2);
				} else if (style.equals(BorderStyle.MEDIUM_DASH_DOT)) {
					border.setLineWidth(2);
				} else if (style.equals(BorderStyle.MEDIUM_DASH_DOT_DOTC)) {
					border.setLineWidth(2);
				} else if (style.equals(BorderStyle.MEDIUM_DASHED)) {
					border.setLineWidth(2);
				} else if (style.equals(BorderStyle.SLANTED_DASH_DOT)) {
					border.setLineWidth(1);
				} else if (style.equals(BorderStyle.THICK)) {
					border.setLineWidth(3);
				} else if (style.equals(BorderStyle.NONE)) {
					border.setLineWidth(1);
				}
				data = border;
			}
		}
		return (IBorder) data;
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
