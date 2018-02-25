/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class RCPLItemProvider extends LayoutableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RCPLItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionMajorPropertyDescriptor(object);
			addVersionMinorPropertyDescriptor(object);
			addVersionMaintenancePropertyDescriptor(object);
			addBuildNumberPropertyDescriptor(object);
			addVersionDescriptionPropertyDescriptor(object);
			addLinkedRcplsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version Major feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVersionMajorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RCPL_versionMajor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RCPL_versionMajor_feature", "_UI_RCPL_type"),
				 RcplPackage.Literals.RCPL__VERSION_MAJOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Minor feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVersionMinorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RCPL_versionMinor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RCPL_versionMinor_feature", "_UI_RCPL_type"),
				 RcplPackage.Literals.RCPL__VERSION_MINOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Maintenance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVersionMaintenancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RCPL_versionMaintenance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RCPL_versionMaintenance_feature", "_UI_RCPL_type"),
				 RcplPackage.Literals.RCPL__VERSION_MAINTENANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build Number feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBuildNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RCPL_buildNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RCPL_buildNumber_feature", "_UI_RCPL_type"),
				 RcplPackage.Literals.RCPL__BUILD_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVersionDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RCPL_versionDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RCPL_versionDescription_feature", "_UI_RCPL_type"),
				 RcplPackage.Literals.RCPL__VERSION_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Rcpls feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLinkedRcplsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RCPL_linkedRcpls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RCPL_linkedRcpls_feature", "_UI_RCPL_type"),
				 RcplPackage.Literals.RCPL__LINKED_RCPLS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_PLUGINS);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_PERSPECTIVES);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_PREFERENCES);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_TOOLS);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_FAVORITES);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_RESOURCES);
			childrenFeatures.add(RcplPackage.Literals.RCPL__ALL_PERSONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Address.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return RCPLModel.resources.getSvgImage(getClass().getSimpleName().replaceAll("ItemProvider", ""), 16, 16)
				.getNode();
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RCPL.class)) {
			case RcplPackage.RCPL__VERSION_MAJOR:
			case RcplPackage.RCPL__VERSION_MINOR:
			case RcplPackage.RCPL__VERSION_MAINTENANCE:
			case RcplPackage.RCPL__BUILD_NUMBER:
			case RcplPackage.RCPL__VERSION_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RcplPackage.RCPL__ALL_PLUGINS:
			case RcplPackage.RCPL__ALL_PERSPECTIVES:
			case RcplPackage.RCPL__ALL_PREFERENCES:
			case RcplPackage.RCPL__ALL_TOOLS:
			case RcplPackage.RCPL__ALL_FAVORITES:
			case RcplPackage.RCPL__ALL_RESOURCES:
			case RcplPackage.RCPL__ALL_PERSONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_PLUGINS,
				 RcplFactory.eINSTANCE.createPlugins()));

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_PERSPECTIVES,
				 RcplFactory.eINSTANCE.createPerspectives()));

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_PREFERENCES,
				 RcplFactory.eINSTANCE.createPreferences()));

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_TOOLS,
				 RcplFactory.eINSTANCE.createTools()));

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_FAVORITES,
				 RcplFactory.eINSTANCE.createFavorites()));

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_RESOURCES,
				 RcplFactory.eINSTANCE.createResources()));

		newChildDescriptors.add
			(createChildParameter
				(RcplPackage.Literals.RCPL__ALL_PERSONS,
				 RcplFactory.eINSTANCE.createPersons()));
	}

}
