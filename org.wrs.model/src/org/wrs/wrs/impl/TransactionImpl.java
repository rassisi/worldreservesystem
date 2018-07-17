/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.wrs.AbstractVault;
import org.wrs.wrs.Asset;
import org.wrs.wrs.Transaction;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.TransactionImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.TransactionImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.TransactionImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends CDOObjectImpl implements Transaction {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAssets() {
		return (Asset)eGet(WrsPackage.Literals.TRANSACTION__ASSETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssets(Asset newAssets) {
		eSet(WrsPackage.Literals.TRANSACTION__ASSETS, newAssets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractVault> getTransactions() {
		return (EList<AbstractVault>)eGet(WrsPackage.Literals.TRANSACTION__TRANSACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return (String)eGet(WrsPackage.Literals.TRANSACTION__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		eSet(WrsPackage.Literals.TRANSACTION__DATA, newData);
	}

} //TransactionImpl
