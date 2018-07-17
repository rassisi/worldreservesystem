package com.joffice.rcpl.plugin.office.databinding2;

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
public class JOEmuInsetProperty extends JOProperty2 {

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOEmuInsetProperty.class);

	private JOEmu left;
	private JOEmu top;
	private JOEmu right;
	private JOEmu bottom;

	// public static JOEmuInsetProperty create(XmlObject xO, String methodName)
	// {
	// if (xO == null) {
	// return null;
	// }
	// return new JOEmuInsetProperty((IDocument) null, null, xO, methodName);
	// }

	/**
	 * @param xmlObject
	 * @param key
	 */
	public JOEmuInsetProperty(ILayoutObject joObject, XmlObject xmlParent, XmlObject xmlObject, String methodName,
			String[] dataBindingKeys) {
		super(joObject, xmlParent, xmlObject, methodName, dataBindingKeys, EValueType.MEASURMENT_ALWAYS_POINTS);
	}

	@Override
	public double[] get() {
		getValue();
		if (data == null) {
			data = "0.0pt,0.0pt,0.0pt,0.0pt"; //$NON-NLS-1$
		} else if (data instanceof Integer) {
			data = new JOEmuPoint((Long) data);
		} else if (data instanceof Long) {
			data = new JOEmuPoint((Long) data);
		} else if (data instanceof BigInteger) {
			data = new JOEmuPoint((BigInteger) data);
		} else if (data instanceof String) {
			String[] split = ((String) data).split(","); //$NON-NLS-1$
			left = new JOEmuPoint(split[0]);
			if (split.length > 1) {
				top = new JOEmuPoint(split[1]);
			} else {
				top = new JOEmu(0);
			}
			if (split.length > 2) {
				right = new JOEmuPoint(split[2]);
			} else {
				right = new JOEmu(0);
			}
			if (split.length > 3) {
				bottom = new JOEmuPoint(split[3]);
			} else {
				bottom = new JOEmu(0);
			}
		}
		return new double[] { top.toPixel(), left.toPixel(), bottom.toPixel(), right.toPixel() };

	}

	// /*
	// * (non-Javadoc)
	// *
	// * @see
	// com.joffice.rcpl.plugin.office.rcp.databinding2.JOEmuProperty#set(double)
	// */
	// @Override
	// public void set(JOEmuInsetProperty pixel) {
	// if (data == null) {
	// get();
	// }
	// ((JOEmuPoint) data).setPixel(pixel);
	// try {
	// getSetMethod()
	// .invoke(object, ((JOEmuPoint) data).toPoints());
	// } catch (IllegalArgumentException e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// } catch (IllegalAccessException e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// } catch (InvocationTargetException e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// }
	// }

	@Override
	public Method setMethod() {
		if (setMethod == null) {
			try {
				Class<?>[] argTypes = new Class[] { String.class };
				setMethod = object.getClass().getDeclaredMethod("set" + methodName, //$NON-NLS-1$
						argTypes);
			} catch (SecurityException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (NoSuchMethodException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
		return setMethod;
	}

	/**
	 * @return
	 */
	public double getLeft() {
		get();
		if (left == null) {
			return 0;
		}
		return left.toPixel();
	}

	/**
	 * @return
	 */
	public double getTop() {
		get();
		if (top == null) {
			return 0;
		}
		return top.toPixel();
	}

	/**
	 * @return
	 */
	public double getRight() {
		get();
		if (right == null) {
			return 0;
		}
		return right.toPixel();
	}

	/**
	 * @return
	 */
	public double getBottom() {
		get();
		if (bottom == null) {
			return 0;
		}
		return bottom.toPixel();
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
