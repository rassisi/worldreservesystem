package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;

/**
 * @author ramin
 * 
 */
public class JOEmu20ThPointProperty extends JOEmuProperty {

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOEmu20ThPointProperty(ILayoutObject joObject, XmlObject xmlParent, XmlObject xmlObject, String methodName,
			String[] dataBindingKeys, EValueType valueType) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys, valueType);
	}

	@Override
	public JOEmu get() {
		Object result = getValue();
		if (result == null) {
			data = new JOEmu20ThPoint(0);
		} else if (result instanceof Integer) {
			data = new JOEmu20ThPoint((Long) result);
		} else if (result instanceof Long) {
			data = new JOEmu20ThPoint((Long) result);
		} else if (result instanceof BigInteger) {
			data = new JOEmu20ThPoint((BigInteger) result);
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
			((JOEmu20ThPoint) data).setPixel(pixel);
			try {
				setMethod().invoke(object, ((JOEmu20ThPoint) data).to20ThPoint());
				joObject.setDirtyContent(true);
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
