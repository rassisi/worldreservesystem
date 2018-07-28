/**
 */
package org.wrs.wrs.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
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
public class wrsItemProvider extends CDOItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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
			addWorldeconomyPropertyDescriptor(object);
			addCountriesPropertyDescriptor(object);
			addNodesPropertyDescriptor(object);
			addIdentitiesPropertyDescriptor(object);
			addTransactionsPropertyDescriptor(object);
			addTransactionconditionsPropertyDescriptor(object);
			addStatisticDatasPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Worldeconomy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorldeconomyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_worldeconomy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_worldeconomy_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__WORLDECONOMY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Countries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_countries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_countries_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__COUNTRIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_nodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_nodes_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__NODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_identities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_identities_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__IDENTITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_transactions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_transactions_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__TRANSACTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transactionconditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionconditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_transactionconditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_transactionconditions_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Statistic Datas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatisticDatasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_wrs_statisticDatas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_wrs_statisticDatas_feature", "_UI_wrs_type"),
				 WrsPackage.Literals.WRS__STATISTIC_DATAS,
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
			childrenFeatures.add(WrsPackage.Literals.WRS__SUPPLYCONTROL);
			childrenFeatures.add(WrsPackage.Literals.WRS__ACCOUNTS);
			childrenFeatures.add(WrsPackage.Literals.WRS__REGISTEREDASSTETS);
			childrenFeatures.add(WrsPackage.Literals.WRS__WORLDECONOMY);
			childrenFeatures.add(WrsPackage.Literals.WRS__COUNTRIES);
			childrenFeatures.add(WrsPackage.Literals.WRS__NODES);
			childrenFeatures.add(WrsPackage.Literals.WRS__IDENTITIES);
			childrenFeatures.add(WrsPackage.Literals.WRS__TRANSACTIONS);
			childrenFeatures.add(WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS);
			childrenFeatures.add(WrsPackage.Literals.WRS__STATISTIC_DATAS);
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
		return getString("_UI_wrs_type");
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
			case WrsPackage.WRS__SUPPLYCONTROL:
			case WrsPackage.WRS__ACCOUNTS:
			case WrsPackage.WRS__REGISTEREDASSTETS:
			case WrsPackage.WRS__WORLDECONOMY:
			case WrsPackage.WRS__COUNTRIES:
			case WrsPackage.WRS__NODES:
			case WrsPackage.WRS__IDENTITIES:
			case WrsPackage.WRS__TRANSACTIONS:
			case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			case WrsPackage.WRS__STATISTIC_DATAS:
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
				(WrsPackage.Literals.WRS__SUPPLYCONTROL,
				 WrsFactory.eINSTANCE.createSupplyControl()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__ACCOUNTS,
				 WrsFactory.eINSTANCE.createAccounts()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__REGISTEREDASSTETS,
				 WrsFactory.eINSTANCE.createRegisteredAssets()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__WORLDECONOMY,
				 WrsFactory.eINSTANCE.createWorldEconomy()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__COUNTRIES,
				 WrsFactory.eINSTANCE.createCountries()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__NODES,
				 WrsFactory.eINSTANCE.createNodes()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__IDENTITIES,
				 WrsFactory.eINSTANCE.createIdentities()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__TRANSACTIONS,
				 WrsFactory.eINSTANCE.createTransactions()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS,
				 WrsFactory.eINSTANCE.createTransactionConditions()));

		newChildDescriptors.add
			(createChildParameter
				(WrsPackage.Literals.WRS__STATISTIC_DATAS,
				 WrsFactory.eINSTANCE.createStatisticDatas()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OrgEditPlugin.INSTANCE;
	}

}
