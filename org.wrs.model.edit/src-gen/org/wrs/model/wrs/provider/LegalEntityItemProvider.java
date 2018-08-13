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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wrs.model.wrs.LegalEntity;
import org.wrs.model.wrs.WrsFactory;
import org.wrs.model.wrs.WrsPackage;

/**
 * This is the item provider adapter for a {@link org.wrs.model.wrs.LegalEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LegalEntityItemProvider extends HumanEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addBusinessAccountsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LegalEntity_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LegalEntity_type_feature",
								"_UI_LegalEntity_type"),
						WrsPackage.Literals.LEGAL_ENTITY__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Business Accounts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessAccountsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LegalEntity_businessAccounts_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LegalEntity_businessAccounts_feature",
								"_UI_LegalEntity_type"),
						WrsPackage.Literals.LEGAL_ENTITY__BUSINESS_ACCOUNTS, true, false, true, null, null, null));
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
			childrenFeatures.add(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS);
			childrenFeatures.add(WrsPackage.Literals.LEGAL_ENTITY__BUSINESS_ACCOUNTS);
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
	 * This returns LegalEntity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LegalEntity"));
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
		String label = ((LegalEntity) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_LegalEntity_type")
				: getString("_UI_LegalEntity_type") + " " + label;
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

		switch (notification.getFeatureID(LegalEntity.class)) {
		case WrsPackage.LEGAL_ENTITY__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case WrsPackage.LEGAL_ENTITY__ACCOUNTS:
		case WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS:
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

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS,
				WrsFactory.eINSTANCE.createTreasury()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS,
				WrsFactory.eINSTANCE.createTransferVault()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS,
				WrsFactory.eINSTANCE.createGenesisAccount()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS,
				WrsFactory.eINSTANCE.createPrivateAccount()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS,
				WrsFactory.eINSTANCE.createNodeAccount()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS,
				WrsFactory.eINSTANCE.createBusinessAccount()));

		newChildDescriptors.add(createChildParameter(WrsPackage.Literals.LEGAL_ENTITY__BUSINESS_ACCOUNTS,
				WrsFactory.eINSTANCE.createBusinessAccount()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS
				|| childFeature == WrsPackage.Literals.LEGAL_ENTITY__BUSINESS_ACCOUNTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
