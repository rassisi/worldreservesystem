/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.Asset;
import org.wrs.model.wrs.Transaction;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends AbstractTransactionImpl implements Transaction {
	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected Asset assets;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAccount> transactions;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAssets() {
		if (assets != null && assets.eIsProxy()) {
			InternalEObject oldAssets = (InternalEObject) assets;
			assets = (Asset) eResolveProxy(oldAssets);
			if (assets != oldAssets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.TRANSACTION__ASSETS, oldAssets,
							assets));
			}
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAssets() {
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssets(Asset newAssets) {
		Asset oldAssets = assets;
		assets = newAssets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.TRANSACTION__ASSETS, oldAssets, assets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAccount> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectResolvingEList<AbstractAccount>(AbstractAccount.class, this,
					WrsPackage.TRANSACTION__TRANSACTIONS);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.TRANSACTION__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.TRANSACTION__ASSETS:
			if (resolve)
				return getAssets();
			return basicGetAssets();
		case WrsPackage.TRANSACTION__TRANSACTIONS:
			return getTransactions();
		case WrsPackage.TRANSACTION__DATA:
			return getData();
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
		case WrsPackage.TRANSACTION__ASSETS:
			setAssets((Asset) newValue);
			return;
		case WrsPackage.TRANSACTION__TRANSACTIONS:
			getTransactions().clear();
			getTransactions().addAll((Collection<? extends AbstractAccount>) newValue);
			return;
		case WrsPackage.TRANSACTION__DATA:
			setData((String) newValue);
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
		case WrsPackage.TRANSACTION__ASSETS:
			setAssets((Asset) null);
			return;
		case WrsPackage.TRANSACTION__TRANSACTIONS:
			getTransactions().clear();
			return;
		case WrsPackage.TRANSACTION__DATA:
			setData(DATA_EDEFAULT);
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
		case WrsPackage.TRANSACTION__ASSETS:
			return assets != null;
		case WrsPackage.TRANSACTION__TRANSACTIONS:
			return transactions != null && !transactions.isEmpty();
		case WrsPackage.TRANSACTION__DATA:
			return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
