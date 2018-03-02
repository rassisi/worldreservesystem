package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;

/**
 * @author ramin
 * 
 */
public class JOLineSpacingProperty extends JOProperty2 {

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOLineSpacingProperty(ILayoutObject joObject, XmlObject xmlParent, XmlObject xmlObject, String methodName,
			String[] dataBindingKeys, EValueType valueType) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys, valueType);
	}

	@Override
	public Double get() {
		getValue();
		if (data == null) {
			data = new Double(0);
		} else if (data instanceof BigInteger) {
			BigInteger b = (BigInteger) data;
			data = b.doubleValue() / 255.0;
		}
		return (Double) data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.joffice.rcpl.plugin.office.rcp.databinding2.JOEmuProperty#set(double)
	 */
	public boolean set(double lineSpacing) {
		double oldLineSpacing = get();
		if (lineSpacing != oldLineSpacing) {
			((JOEmu) data).setDouble(lineSpacing * 255.0);
			try {
				setMethod().invoke(object, BigInteger.valueOf((long) (lineSpacing * 255.0)));
				return true;
			} catch (IllegalArgumentException e) {
				RCPLModel.logError(e);
			} catch (IllegalAccessException e) {
				RCPLModel.logError(e);
			} catch (InvocationTargetException e) {
				RCPLModel.logError(e);
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
				RCPLModel.logError(e);
			} catch (NoSuchMethodException e) {
				Class<?>[] argTypes = new Class[] { BigInteger.class };
				try {
					setMethod = object.getClass().getDeclaredMethod("set" + methodName, //$NON-NLS-1$
							argTypes);
				} catch (SecurityException e1) {
					RCPLModel.logError(e1);
				} catch (NoSuchMethodException e1) {
					RCPLModel.logError(e1);
				}
			}
		}
		return setMethod;
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
