package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;

/**
 * @author ramin
 * 
 */
public class JOEmuPointProperty extends JOEmuProperty {

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOEmuPointProperty.class);

	// public static JOEmuPointProperty create(XmlObject xO, String methodName)
	// {
	// if (xO == null) {
	// return null;
	// }
	// return new JOEmuPointProperty(null, xO, methodName);
	// }

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOEmuPointProperty(ILayoutObject joObject, XmlObject xmlParent, XmlObject xmlObject, String methodName,
			String[] dataBindingKeys) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys, EValueType.MEASURMENT_ALWAYS_POINTS);
	}

	@Override
	public JOEmu get() {
		getValue();
		if (data == null) {
			data = new JOEmuPoint(0);
		} else if (data instanceof Integer) {
			data = new JOEmuPoint((Long) data);
		} else if (data instanceof Long) {
			data = new JOEmuPoint((Long) data);
		} else if (data instanceof BigInteger) {
			data = new JOEmuPoint((BigInteger) data);
		} else if (data instanceof String) {
			data = new JOEmuPoint((String) data);
		}
		return (JOEmu) data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.joffice.rcpl.plugin.office.rcp.databinding2.JOEmuProperty#set(double)
	 */
	@Override
	public boolean set(double pixel) {
		double oldPixel = get().toPixel();
		if (pixel != oldPixel) {
			((JOEmuPoint) data).setPixel(pixel);
			try {
				setMethod().invoke(object, ((JOEmuPoint) data).toPoints());
				return true;
			} catch (IllegalArgumentException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (IllegalAccessException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (InvocationTargetException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
		return false;
	}

	@SuppressWarnings("hiding")
	@Override
	public Method setMethod() {
		if (setMethod == null) {
			// if (object instanceof CTPositiveSize2D)
			try {
				// CTTblPPr tp = (CTTblPPr)object;
				Class<?>[] argTypes = new Class[] { long.class };
				setMethod = object.getClass().getDeclaredMethod("set" + methodName, //$NON-NLS-1$
						argTypes);
			} catch (SecurityException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (NoSuchMethodException e) {

				Class<?>[] argTypes = new Class[] { BigInteger.class };
				try {
					setMethod = object.getClass().getDeclaredMethod("set" + methodName, //$NON-NLS-1$
							argTypes);
				} catch (SecurityException e1) {
					// LOGGER.error("", e); //$NON-NLS-1$
				} catch (NoSuchMethodException e1) {
					// LOGGER.error("", e); //$NON-NLS-1$
				}

			}
		}
		return setMethod;
	}

}
