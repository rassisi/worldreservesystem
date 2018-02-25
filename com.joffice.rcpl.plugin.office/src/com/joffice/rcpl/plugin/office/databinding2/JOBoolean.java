package com.joffice.rcpl.plugin.office.databinding2;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageOrientation;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalAlignRun;

import schemasMicrosoftComVml.STTrueFalse;

/**
 * @author ramin
 * 
 */
public class JOBoolean extends JOProperty2 {

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOBoolean.class);

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOBoolean(ILayoutObject joObject, XmlObject xmlParent,
			XmlObject xmlObject, String methodName, String[] dataBindingKeys) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys,
				EValueType.BOOLEAN);
		if (xmlObject instanceof CTPageSz) {
			argTypes = new Class[] { STPageOrientation.Enum.class };
		} else {
			argTypes = new Class[] { Boolean.class };
		}
	}

	@Override
	public Boolean get() {
		try {
			getValue();
			if (data instanceof Boolean) {
				return (Boolean) data;
			} else if (data instanceof STPageOrientation.Enum) {
				return ((STPageOrientation.Enum) data)
						.equals(STPageOrientation.LANDSCAPE);
			} else if (data instanceof STTrueFalse.Enum) {
				return ((STTrueFalse.Enum) data).equals(STTrueFalse.T)
						|| ((STTrueFalse.Enum) data).equals(STTrueFalse.TRUE);
			} else if (data instanceof CTVerticalAlignRun) {
				return ((CTVerticalAlignRun) data).getVal().equals(
						STVerticalAlignRun.SUBSCRIPT)
						|| ((CTVerticalAlignRun) data).getVal().equals(
								STVerticalAlignRun.SUPERSCRIPT);
			} else if (data instanceof CTOnOff) {
				return true;
			}
		} catch (Exception ex) {
//			LOGGER.error("", ex); //$NON-NLS-1$
		}
		return false;
	}

	@Override
	protected Object objectToXml(Object dat) {
		if (dat instanceof Boolean) {
			Boolean b = (Boolean) dat;
			if (object instanceof CTPageSz) {
				if (b) {
					return STPageOrientation.LANDSCAPE;
				}
				return STPageOrientation.PORTRAIT;
			}

			if (object instanceof CTRPr) {
				if (b) {
					if (dataBindingKeys[0].indexOf("subscript") != -1) { //$NON-NLS-1$
						return STVerticalAlignRun.SUBSCRIPT;
					}
					return STVerticalAlignRun.SUPERSCRIPT;
				}
				return STVerticalAlignRun.BASELINE;
			}

			return b;
		}
		return null;
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}
}
