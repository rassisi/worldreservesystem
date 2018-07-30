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
import org.wrs.model.wrs.TransactionCondition;
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
 *   <li>{@link org.wrs.model.wrs.impl.TransactionImpl#getNanoTime <em>Nano Time</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionImpl#getTransactioncondition <em>Transactioncondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends AbstractTransactionImpl implements Transaction {
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
	 * The default value of the '{@link #getNanoTime() <em>Nano Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNanoTime()
	 * @generated
	 * @ordered
	 */
	protected static final double NANO_TIME_EDEFAULT = 0.0;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

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
		return (Asset) eDynamicGet(WrsPackage.TRANSACTION__ASSETS, WrsPackage.Literals.TRANSACTION__ASSETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAssets() {
		return (Asset) eDynamicGet(WrsPackage.TRANSACTION__ASSETS, WrsPackage.Literals.TRANSACTION__ASSETS, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssets(Asset newAssets) {
		eDynamicSet(WrsPackage.TRANSACTION__ASSETS, WrsPackage.Literals.TRANSACTION__ASSETS, newAssets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractAccount> getTransactions() {
		return (EList<AbstractAccount>) eDynamicGet(WrsPackage.TRANSACTION__TRANSACTIONS,
				WrsPackage.Literals.TRANSACTION__TRANSACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return (String) eDynamicGet(WrsPackage.TRANSACTION__DATA, WrsPackage.Literals.TRANSACTION__DATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		eDynamicSet(WrsPackage.TRANSACTION__DATA, WrsPackage.Literals.TRANSACTION__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNanoTime() {
		return (Double) eDynamicGet(WrsPackage.TRANSACTION__NANO_TIME, WrsPackage.Literals.TRANSACTION__NANO_TIME, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNanoTime(double newNanoTime) {
		eDynamicSet(WrsPackage.TRANSACTION__NANO_TIME, WrsPackage.Literals.TRANSACTION__NANO_TIME, newNanoTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmount() {
		return (Double) eDynamicGet(WrsPackage.TRANSACTION__AMOUNT, WrsPackage.Literals.TRANSACTION__AMOUNT, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(double newAmount) {
		eDynamicSet(WrsPackage.TRANSACTION__AMOUNT, WrsPackage.Literals.TRANSACTION__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCondition getTransactioncondition() {
		return (TransactionCondition) eDynamicGet(WrsPackage.TRANSACTION__TRANSACTIONCONDITION,
				WrsPackage.Literals.TRANSACTION__TRANSACTIONCONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactioncondition(TransactionCondition newTransactioncondition,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTransactioncondition,
				WrsPackage.TRANSACTION__TRANSACTIONCONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactioncondition(TransactionCondition newTransactioncondition) {
		eDynamicSet(WrsPackage.TRANSACTION__TRANSACTIONCONDITION, WrsPackage.Literals.TRANSACTION__TRANSACTIONCONDITION,
				newTransactioncondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.TRANSACTION__TRANSACTIONCONDITION:
			return basicSetTransactioncondition(null, msgs);
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
		case WrsPackage.TRANSACTION__ASSETS:
			if (resolve)
				return getAssets();
			return basicGetAssets();
		case WrsPackage.TRANSACTION__TRANSACTIONS:
			return getTransactions();
		case WrsPackage.TRANSACTION__DATA:
			return getData();
		case WrsPackage.TRANSACTION__NANO_TIME:
			return getNanoTime();
		case WrsPackage.TRANSACTION__AMOUNT:
			return getAmount();
		case WrsPackage.TRANSACTION__TRANSACTIONCONDITION:
			return getTransactioncondition();
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
		case WrsPackage.TRANSACTION__NANO_TIME:
			setNanoTime((Double) newValue);
			return;
		case WrsPackage.TRANSACTION__AMOUNT:
			setAmount((Double) newValue);
			return;
		case WrsPackage.TRANSACTION__TRANSACTIONCONDITION:
			setTransactioncondition((TransactionCondition) newValue);
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
		case WrsPackage.TRANSACTION__NANO_TIME:
			setNanoTime(NANO_TIME_EDEFAULT);
			return;
		case WrsPackage.TRANSACTION__AMOUNT:
			setAmount(AMOUNT_EDEFAULT);
			return;
		case WrsPackage.TRANSACTION__TRANSACTIONCONDITION:
			setTransactioncondition((TransactionCondition) null);
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
			return basicGetAssets() != null;
		case WrsPackage.TRANSACTION__TRANSACTIONS:
			return !getTransactions().isEmpty();
		case WrsPackage.TRANSACTION__DATA:
			return DATA_EDEFAULT == null ? getData() != null : !DATA_EDEFAULT.equals(getData());
		case WrsPackage.TRANSACTION__NANO_TIME:
			return getNanoTime() != NANO_TIME_EDEFAULT;
		case WrsPackage.TRANSACTION__AMOUNT:
			return getAmount() != AMOUNT_EDEFAULT;
		case WrsPackage.TRANSACTION__TRANSACTIONCONDITION:
			return getTransactioncondition() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
