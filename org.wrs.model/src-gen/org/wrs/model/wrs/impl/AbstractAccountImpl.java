/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.Asset;
import org.wrs.model.wrs.Transaction;
import org.wrs.model.wrs.Transactions;
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
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractAccountImpl extends LayoutableImpl implements AbstractAccount {
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
	@SuppressWarnings("unchecked")
	public EList<Transaction> getTransaction() {
		return (EList<Transaction>) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactions getTransactions() {
		return (Transactions) eDynamicGet(WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS,
				WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactions(Transactions newTransactions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTransactions, WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactions(Transactions newTransactions) {
		eDynamicSet(WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS, WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTIONS,
				newTransactions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS:
			return basicSetTransactions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			return getTransaction();
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS:
			return getTransactions();
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
			getTransaction().clear();
			getTransaction().addAll((Collection<? extends Transaction>) newValue);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS:
			setTransactions((Transactions) newValue);
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
			getTransaction().clear();
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS:
			setTransactions((Transactions) null);
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
			return !getTransaction().isEmpty();
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTIONS:
			return getTransactions() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractAccountImpl
