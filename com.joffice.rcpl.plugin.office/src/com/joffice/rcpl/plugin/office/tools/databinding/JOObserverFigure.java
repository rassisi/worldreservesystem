package com.joffice.rcpl.plugin.office.tools.databinding;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;

import com.joffice.rcpl.plugin.office.JOObject;

/**
 * @author ramin
 * 
 */
public abstract class JOObserverFigure implements IObverserObvervable {
	//
	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOObserverFigure.class);

	protected List<JOObject> dataBindingObjects;

	// public JOObserverFigure(JOResourceEntry entry) {
	// if (entry != null) {
	// JORegistry.addDatabindingObject(this, entry);
	// }
	// }

	public void addDataBinding(JOObject dataBindingObject) {
		addDataBinding(dataBindingObject, true);
	}

	public void addDataBinding(JOObject dataBindingObject, boolean clear) {
		if (clear) {
			getDataBindingObjects().clear();
			dataBindingObjects = null;
		}
		getDataBindingObjects().add(dataBindingObject);
	}

	/**
	 * @return
	 */
	private List<JOObject> getDataBindingObjects() {
		if (dataBindingObjects == null) {
			dataBindingObjects = new ArrayList<JOObject>();
		}
		return dataBindingObjects;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.IObverserObvervable#
	 * notifyDataBindingObjects(java.lang.Object )
	 */
	@Override
	public void notifyDataBindingObjects(Object data) {
		// Object[] dataBindings = getDataBindingObjects().toArray();
		// for (Object object : dataBindings) {
		// JOObject layoutObject = (JOObject) object;
		// Method getter = layoutObject.getGetter(getEntry().getKey());
		// if (getter != null) {
		// try {
		// Object result = getter.invoke(layoutObject, (Object[]) null);
		// if (result == null) {
		// result = layoutObject.createValue(getEntry().getKey());
		// if (result instanceof IObverserObvervable) {
		// ((IObverserObvervable) result).update(layoutObject, data);
		// } else {
		// // LOGGER.error("wrong class or null");
		// // //$NON-NLS-1$
		// }
		// } else if (result instanceof IObverserObvervable) {
		// if (((JOProperty<?>) result).isTemplate()) {
		// result = ((JOProperty<?>)
		// result).createCopyFromTemplate(layoutObject);
		// }
		// ((IObverserObvervable) result).update(layoutObject, data);
		// } else {
		// // LOGGER.error("wrong class"); //$NON-NLS-1$
		// }
		// } catch (IllegalArgumentException e) {
		// // LOGGER.error("", e); //$NON-NLS-1$
		// } catch (IllegalAccessException e) {
		// // LOGGER.error("", e); //$NON-NLS-1$
		// } catch (InvocationTargetException e) {
		// // LOGGER.error("", e); //$NON-NLS-1$
		// }
		// }
		// }
	}

	@Override
	public abstract void update(ILayoutObject layoutObject, Object data);

}
