/**
 */
package org.wrs.wrs.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wrs.wrs.WrsFactory;
import org.wrs.wrs.WrsPackage;
import org.wrs.wrs.wrs;

/**
 * This is the item provider adapter for a {@link org.wrs.wrs.wrs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class wrsItemProvider extends IdentityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wrsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSupplycontrolPropertyDescriptor(object);
			addRegisteredasstetsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Supplycontrol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplycontrolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_supplycontrol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_supplycontrol_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__SUPPLYCONTROL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Registeredasstets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegisteredasstetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_registeredasstets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_registeredasstets_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__REGISTEREDASSTETS,
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WrsPackage.Literals.WRS__TRANSFERVAULTS);
			childrenFeatures.add(WrsPackage.Literals.WRS__MAINVAULT);
			childrenFeatures.add(WrsPackage.Literals.WRS__IDENTITIES);
			childrenFeatures.add(WrsPackage.Literals.WRS__WALLETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns wrs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/wrs"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((wrs)object).getUUID();
		return label == null || label.length() == 0 ?
			getString("_UI_wrs_type") :
			getString("_UI_wrs_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(wrs.class)) {
			case WrsPackage.WRS__TRANSFERVAULTS:
			case WrsPackage.WRS__MAINVAULT:
			case WrsPackage.WRS__IDENTITIES:
			case WrsPackage.WRS__WALLETS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__TRANSFERVAULTS,
				 WrsFactory.eINSTANCE.createTransferVaults()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__MAINVAULT,
				 WrsFactory.eINSTANCE.createTreasury()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__IDENTITIES,
				 WrsFactory.eINSTANCE.createIdentities()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__WALLETS,
				 WrsFactory.eINSTANCE.createAccounts()));
	}

}
