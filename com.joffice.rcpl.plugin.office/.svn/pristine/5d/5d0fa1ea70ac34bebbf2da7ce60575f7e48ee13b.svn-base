package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOCell;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOSpreadsheetDocument;

/**
 * @author ramin
 * 
 */
public class JOIndentationProperty extends JOProperty2 {

	private ILayoutObject layoutObject;

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOIndentationProperty(ILayoutObject joObject, Object parent,
			Object object, String methodName, String[] dataBindingKeys,
			ILayoutObject layoutObject) {
		super(joObject, parent, object, methodName, dataBindingKeys,
				EValueType.MEASUREMENT);
		this.layoutObject = layoutObject;
	}

	@Override
	public JOEmu get() {
		Object result = getValue();
		if (object instanceof XSSFCellStyle && result instanceof Short) {
			Short x = (Short) result;
			JOCell cell = (JOCell) layoutObject;
			int indentationWidth = ((JOSpreadsheetDocument) cell.getDocument())
					.getWorkbook().getIndentationWidth();
			int intValue = x.intValue();
			data = new JOEmuPixel(intValue * indentationWidth);
		}
		return (JOEmu) data;
	}

	@Override
	public Method setMethod() {
		return null;
	}

	public ILayoutObject getLayoutObject() {
		return layoutObject;
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
