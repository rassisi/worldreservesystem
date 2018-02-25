package org.eclipse.rcpl.emf.util;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.Property;

/**
 * Factory to create FX-Properties backed by an {@link EObject}s
 * {@link EStructuralFeature}
 */
public class EMFEditFXProperties {

	/**
	 * Returns a {@link Property} for the given {@link EStructuralFeature}
	 * 
	 * @param editingDomain
	 *            the editing domain
	 * @param eObject
	 *            the object
	 * @param feature
	 *            the feature instance the property is created for
	 * @param <T>
	 *            the property type
	 * @return a value property for the given {@link EStructuralFeature}
	 */
	public static <T> Property<T> value(EditingDomain editingDomain, EObject eObject, EStructuralFeature feature) {
		return new EObjectProperty<T>(editingDomain, eObject, feature);
	}

	// public static <T> ObservableList<T> list(EditingDomain editingDomain,
	// Notifier owner, EList<T> list) {
	// throw new UnsupportedOperationException("Not implemented");
	// }
	//
	// public static <T> ObservableList<T> list(EditingDomain editingDomain,
	// EObject eObject,
	// EStructuralFeature feature) {
	// throw new UnsupportedOperationException("Not implemented");
	// }
	//
	// static class EObjectObservableList<T> extends ListPropertyBase<T> {
	//
	// EObject eObject;
	// EStructuralFeature feature;
	// EditingDomain editingDomain;
	//
	// public Object getBean() {
	// return eObject;
	// }
	//
	// public String getName() {
	// return feature.getName();
	// }
	//
	// //FIXME Java8
	// // Default methods NOT YET supported by JDT-Core
	// // @Override
	// public void forEach(Consumer<? super T> action) {
	// super.forEach(action);
	// }
	//
	// // @Override
	// public Spliterator<T> spliterator() {
	// return super.spliterator();
	// }
	//
	// }

	static class EObjectProperty<T> extends ObjectPropertyBase<T> {

		private final EObject eObject;

		private final EStructuralFeature feature;

		private final EditingDomain editingDomain;

		public EObjectProperty(EditingDomain editingDomain, EObject eObject, EStructuralFeature feature) {
			super();
			this.eObject = eObject;
			this.feature = feature;
			this.editingDomain = editingDomain;

			eObject.eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					fireValueChangedEvent();
				}
			});
		}

		@Override
		protected void fireValueChangedEvent() {
			super.fireValueChangedEvent();
		}

		@Override
		public void setValue(T newValue) {
			Command command = SetCommand.create(this.editingDomain, this.eObject, this.feature, newValue);
			if (command.canExecute())
				this.editingDomain.getCommandStack().execute(command);
		}

		@Override
		@SuppressWarnings("unchecked")
		public T getValue() {
			return (T) this.eObject.eGet(this.feature);
		}

		@Override
		public Object getBean() {
			return this.eObject;
		}

		@Override
		public String getName() {
			return this.feature.getName();
		}

	}

}
