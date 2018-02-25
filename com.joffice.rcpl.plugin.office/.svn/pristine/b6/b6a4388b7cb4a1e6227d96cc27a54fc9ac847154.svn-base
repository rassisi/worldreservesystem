package com.joffice.rcpl.plugin.office;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IToolGroupFigure;

import com.joffice.rcpl.plugin.office.databinding.JOProperty;

/**
 * @author ramin
 * 
 */
public class JORegistry {

	/**
	 * 
	 */
	private static Hashtable<String, ArrayList<IObverserObvervable>> databindingObjects = new Hashtable<String, ArrayList<IObverserObvervable>>();

	/**
	 * @param databindingObject
	 */
	@SuppressWarnings("unchecked")
	public static void addDatabindingObject(
			IObverserObvervable databindingObject, IResourceEntry entry) {
		if (databindingObject != null && entry.getKey() != null) {
			Object o = databindingObjects.get(entry.getKey());
			if (o instanceof ArrayList<?>) {
				((ArrayList<IObverserObvervable>) o).add(databindingObject);
			} else {
				ArrayList<IObverserObvervable> newArrayList = new ArrayList<IObverserObvervable>();
				newArrayList.add(databindingObject);
				databindingObjects.put(entry.getKey(), newArrayList);
			}
		}
	}

	/**
	 * @param databindingObject
	 */
	@SuppressWarnings("unchecked")
	public static void removeDatabindingObject(
			IObverserObvervable databindingObject) {
		Object o = databindingObjects.get(databindingObject.getKey());
		if (o instanceof ArrayList<?>) {
			((ArrayList<IObverserObvervable>) o).remove(databindingObject);
		}
	}

	/**
	 * @param key
	 * @return
	 */
	public static List<IObverserObvervable> getDatabindingFigures(String key) {
		List<IObverserObvervable> dos = getDatabindingObjects(key);
		List<IObverserObvervable> dof = new ArrayList<IObverserObvervable>();
		for (IObverserObvervable joObverserObvervable : dos) {
			// if (joObverserObvervable instanceof IFigure) {
			if (!(joObverserObvervable instanceof IToolGroupFigure)) {
				dof.add(joObverserObvervable);
			}
			// }
		}
		return dof;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<IObverserObvervable> getDatabindingProperties(
			ILayoutObject layoutObject) {
		List<IObverserObvervable> dof = new ArrayList<IObverserObvervable>();
		Enumeration en = databindingObjects.elements();
		while (en.hasMoreElements()) {
			Object o = en.nextElement();
			if (o instanceof ArrayList) {
				ArrayList<IObverserObvervable> list = (ArrayList<IObverserObvervable>) o;
				for (IObverserObvervable joObserv : list) {
					if (joObserv instanceof JOProperty<?>) {
						ILayoutObject l = ((JOProperty<?>) joObserv)
								.getLayoutObject();
						if (l == layoutObject) {
							dof.add(joObserv);
						}
					}
				}
			}
		}

		return dof;
	}

	/**
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<IObverserObvervable> getDatabindingObjects(String key) {
		Object o = databindingObjects.get(key);
		if (o instanceof ArrayList<?>) {
			return (List<IObverserObvervable>) o;
		}
		return new ArrayList<IObverserObvervable>();
	}

}
