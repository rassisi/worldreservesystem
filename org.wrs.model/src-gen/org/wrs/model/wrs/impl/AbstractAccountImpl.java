/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.Asset;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.Transaction;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractAccountImpl extends CDOObjectImpl implements AbstractAccount {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.ABSTRACT_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Asset> getAssets() {
		return (EList<Asset>) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__ASSETS,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__ASSETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		return (Transaction) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetTransaction() {
		return (Transaction) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		eDynamicSet(WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION, WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTION,
				newTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		return (Identity) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__BELONGS_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity basicGetBelongsTo() {
		return (Identity) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__BELONGS_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		eDynamicSet(WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO, WrsPackage.Literals.ABSTRACT_ACCOUNT__BELONGS_TO,
				newBelongsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			return getAssets();
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			if (resolve)
				return getTransaction();
			return basicGetTransaction();
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			if (resolve)
				return getBelongsTo();
			return basicGetBelongsTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			getAssets().clear();
			getAssets().addAll((Collection<? extends Asset>) newValue);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			setTransaction((Transaction) newValue);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			setBelongsTo((Identity) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			getAssets().clear();
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			setTransaction((Transaction) null);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			setBelongsTo((Identity) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			return !getAssets().isEmpty();
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			return basicGetTransaction() != null;
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			return basicGetBelongsTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractAccountImpl
