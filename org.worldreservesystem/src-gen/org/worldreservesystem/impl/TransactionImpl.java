/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

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
 *   <li>{@link org.worldreservesystem.impl.TransactionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.TransactionImpl#getTo <em>To</em>}</li>
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
	public AbstractVault getFrom() {
		return (AbstractVault) eGet(WorldreservesystemPackage.Literals.TRANSACTION__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(AbstractVault newFrom) {
		eSet(WorldreservesystemPackage.Literals.TRANSACTION__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVault getTo() {
		return (AbstractVault) eGet(WorldreservesystemPackage.Literals.TRANSACTION__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(AbstractVault newTo) {
		eSet(WorldreservesystemPackage.Literals.TRANSACTION__TO, newTo);
	}

} //TransactionImpl
