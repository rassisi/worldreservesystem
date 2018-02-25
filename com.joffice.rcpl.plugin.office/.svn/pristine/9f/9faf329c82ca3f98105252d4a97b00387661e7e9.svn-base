package com.joffice.rcpl.plugin.office.databinding2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IEmuProperty2;
import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;

/**
 * @author ramin
 * 
 */
public class JODXAProperty extends JOProperty2 implements IEmuProperty2 {

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOEmuProperty.class);

	// public static JOEmuProperty create(XmlObject xO, String methodName) {
	// if (xO == null) {
	// return null;
	// }
	// return new JOEmuProperty(null, xO, methodName);
	// }

	public JODXAProperty() {
		super(null, null, null, null, null, null);
		data = new JOEmu();
	}

	public JODXAProperty(String value) {
		super(null, null, null, null, null, null);
		data = new JOEmu(value);
	}

	public JODXAProperty(JOEmu value) {
		super(null, null, null, null, null, null);
		data = value;
	}

	public JODXAProperty(double value) {
		super(null, null, null, null, null, null);
		data = new JOEmu(value);
	}

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JODXAProperty(ILayoutObject joObject, XmlObject xmlParent, XmlObject xmlObject, String methodName,
			String[] dataBindingKeys, EValueType valueType) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys, valueType);
	}

	@Override
	public JOEmu get() {
		if (object == null) {
			if (data != null) {
				return (JOEmu) data;
			}
			return new JOEmu();
		}
		Object result = getValue();
		if (result == null) {
			data = new JOEmu();

		} else if (result instanceof CTTblWidth) {
			data = new JOEmu20ThPoint(((CTTblWidth) result).getW());
		} else if (result instanceof Integer) {
			data = new JOEmu((Integer) result);
		} else if (result instanceof Long) {
			if (object instanceof CTPoint2D) {
				data = new JOEmu((Long) result);
			} else if (object instanceof CTPositiveSize2D) {
				data = new JOEmu((Long) result);
			} else {
				data = new JOEmu((Long) result);
			}
		} else if (result instanceof BigInteger) {
			data = new JOEmu((BigInteger) result);
		}
		return (JOEmu) data;
	}

	/**
	 * @param pixel
	 */
	public boolean set(double pixel) {
		double oldPixel = get().toPixel();
		if (oldPixel != pixel) {
			((JOEmu) data).setPixel(pixel);
			if (object != null) {
				try {
					setMethod().invoke(object, (Long) ((JOEmu) data).toLong());
				} catch (IllegalArgumentException e) {
					try {
						setMethod().invoke(object, (double) ((JOEmu) data).toLong());
						return true;
					} catch (IllegalArgumentException e1) {
						// LOGGER.error("", e1); //$NON-NLS-1$
					} catch (IllegalAccessException e1) {
						// LOGGER.error("", e1); //$NON-NLS-1$
					} catch (InvocationTargetException e1) {
						// LOGGER.error("", e1); //$NON-NLS-1$
					}
				} catch (IllegalAccessException e) {
					// LOGGER.error("", e); //$NON-NLS-1$
				} catch (InvocationTargetException e) {
					// LOGGER.error("", e); //$NON-NLS-1$
				}
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.joffice.rcpl.plugin.office.rcp.databinding2.JOProperty2#getSetMethod(
	 * )
	 */
	@Override
	public Method setMethod() {
		if (object == null) {
			return null;
		}
		if (setMethod == null) {
			try {
				setMethod = object.getClass().getDeclaredMethod("set" + methodName, //$NON-NLS-1$
						new Class[] { long.class });
			} catch (SecurityException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (NoSuchMethodException e) {
				try {
					setMethod = object.getClass().getDeclaredMethod("set" + methodName, //$NON-NLS-1$
							new Class[] { int.class });
				} catch (SecurityException e1) {
					// LOGGER.error("", e1); //$NON-NLS-1$
				} catch (NoSuchMethodException e1) {
					// LOGGER.error("", e1); //$NON-NLS-1$
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
