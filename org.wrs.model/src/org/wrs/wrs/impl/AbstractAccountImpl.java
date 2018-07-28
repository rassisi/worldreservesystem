/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.wrs.AbstractAccount;
import org.wrs.wrs.Asset;
import org.wrs.wrs.Identity;
import org.wrs.wrs.Transaction;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.AbstractAccountImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.AbstractAccountImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.AbstractAccountImpl#getBelongsTo <em>Belongs To</em>}</li>
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
		return (EList<Asset>)eGet(WrsPackage.Literals.ABSTRACT_ACCOUNT__ASSETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		return (Transaction)eGet(WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		eSet(WrsPackage.Literals.ABSTRACT_ACCOUNT__TRANSACTION, newTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		return (Identity)eGet(WrsPackage.Literals.ABSTRACT_ACCOUNT__BELONGS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		eSet(WrsPackage.Literals.ABSTRACT_ACCOUNT__BELONGS_TO, newBelongsTo);
	}

} //AbstractAccountImpl
