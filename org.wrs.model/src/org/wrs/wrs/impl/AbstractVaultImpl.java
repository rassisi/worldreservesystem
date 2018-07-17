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
 * An implementation of the model object '<em><b>Abstract Vault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.AbstractVaultImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.AbstractVaultImpl#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractVaultImpl extends CDOObjectImpl implements AbstractVault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.ABSTRACT_VAULT;
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
		return (EList<Asset>)eGet(WrsPackage.Literals.ABSTRACT_VAULT__ASSETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		return (Transaction)eGet(WrsPackage.Literals.ABSTRACT_VAULT__TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		eSet(WrsPackage.Literals.ABSTRACT_VAULT__TRANSACTION, newTransaction);
	}

} //AbstractVaultImpl
