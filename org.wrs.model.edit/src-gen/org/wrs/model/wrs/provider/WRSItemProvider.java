/**
 */
package org.wrs.model.wrs.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wrs.model.wrs.WRS;
import org.wrs.model.wrs.WrsFactory;
import org.wrs.model.wrs.WrsPackage;

/**
 * This is the item provider adapter for a {@link org.wrs.model.wrs.WRS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WRSItemProvider extends IdentityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WRSItemProvider(AdapterFactory adapterFactory) {
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

			addMainvaultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mainvault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainvaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_WRS_mainvault_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_WRS_mainvault_feature", "_UI_WRS_type"),
						WrsPackage.Literals.WRS__MAINVAULT, true, false, true, null, null, null));
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
			childrenFeatures.add(WrsPackage.Literals.WRS__SUPPLYCONTROL);
			childrenFeatures.add(WrsPackage.Literals.WRS__ALL_ACCOUNTS);
			childrenFeatures.add(WrsPackage.Literals.WRS__REGISTEREDASSTETS);
			childrenFeatures.add(WrsPackage.Literals.WRS__WORLDECONOMY);
			childrenFeatures.add(WrsPackage.Literals.WRS__COUNTRIES);
			childrenFeatures.add(WrsPackage.Literals.WRS__NODES);
			childrenFeatures.add(WrsPackage.Literals.WRS__IDENTITIES);
			childrenFeatures.add(WrsPackage.Literals.WRS__TRANSACTIONS);
			childrenFeatures.add(WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS);
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
	 * This returns WRS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WRS"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WRS) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_WRS_type")
				: getString("_UI_WRS_type") + " " + label;
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

		switch (notification.getFeatureID(WRS.class)) {
		case WrsPackage.WRS__SUPPLYCONTROL:
		case WrsPackage.WRS__ALL_ACCOUNTS:
		case WrsPackage.WRS__REGISTEREDASSTETS:
		case WrsPackage.WRS__WORLDECONOMY:
		case WrsPackage.WRS__COUNTRIES:
		case WrsPackage.WRS__NODES:
		case WrsPackage.WRS__IDENTITIES:
		case WrsPackage.WRS__TRANSACTIONS:
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
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

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.WRS__SUPPLYCONTROL,
				WrsFactory.eINSTANCE.createSupplyControl()));

		newChildDescriptors.add(
				createChildParameter(WrsPackage.Literals.WRS__ALL_ACCOUNTS, WrsFactory.eINSTANCE.createAccounts()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.WRS__REGISTEREDASSTETS,
				WrsFactory.eINSTANCE.createRegisteredAssets()));

		newChildDescriptors.add(
				createChildParameter(WrsPackage.Literals.WRS__WORLDECONOMY, WrsFactory.eINSTANCE.createWorldEconomy()));

		newChildDescriptors
				.add(createChildParameter(WrsPackage.Literals.WRS__COUNTRIES, WrsFactory.eINSTANCE.createCountries()));

		newChildDescriptors
				.add(createChildParameter(WrsPackage.Literals.WRS__NODES, WrsFactory.eINSTANCE.createNodes()));

		newChildDescriptors.add(
				createChildParameter(WrsPackage.Literals.WRS__IDENTITIES, WrsFactory.eINSTANCE.createIdentities()));

		newChildDescriptors.add(
				createChildParameter(WrsPackage.Literals.WRS__TRANSACTIONS, WrsFactory.eINSTANCE.createTransactions()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS,
				WrsFactory.eINSTANCE.createTransactionConditions()));
	}

}
