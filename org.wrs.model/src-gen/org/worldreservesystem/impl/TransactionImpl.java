/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.worldreservesystem.AbstractVault;
import org.worldreservesystem.Asset;
import org.worldreservesystem.Transaction;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.TransactionImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.TransactionImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.TransactionImpl#getData <em>Data</em>}</li>
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
		return WorldreservesystemPackage.Literals.TRANSACTION;
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
		return (Asset) eGet(WorldreservesystemPackage.Literals.TRANSACTION__ASSETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssets(Asset newAssets) {
		eSet(WorldreservesystemPackage.Literals.TRANSACTION__ASSETS, newAssets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractVault> getTransactions() {
		return (EList<AbstractVault>) eGet(WorldreservesystemPackage.Literals.TRANSACTION__TRANSACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return (String) eGet(WorldreservesystemPackage.Literals.TRANSACTION__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		eSet(WorldreservesystemPackage.Literals.TRANSACTION__DATA, newData);
	}

} //TransactionImpl
