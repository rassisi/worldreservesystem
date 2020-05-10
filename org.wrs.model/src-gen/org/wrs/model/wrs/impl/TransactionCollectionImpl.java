/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.wrs.model.wrs.Transaction;
import org.wrs.model.wrs.TransactionCollection;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionCollectionImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionCollectionImpl extends AbstractTransactionImpl implements TransactionCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.TRANSACTION_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transaction> getTransactions() {
		return (EList<Transaction>) eDynamicGet(WrsPackage.TRANSACTION_COLLECTION__TRANSACTIONS,
				WrsPackage.Literals.TRANSACTION_COLLECTION__TRANSACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.TRANSACTION_COLLECTION__TRANSACTIONS:
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
		case WrsPackage.TRANSACTION_COLLECTION__TRANSACTIONS:
			getTransactions().clear();
			getTransactions().addAll((Collection<? extends Transaction>) newValue);
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
		case WrsPackage.TRANSACTION_COLLECTION__TRANSACTIONS:
			getTransactions().clear();
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
		case WrsPackage.TRANSACTION_COLLECTION__TRANSACTIONS:
			return !getTransactions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionCollectionImpl
