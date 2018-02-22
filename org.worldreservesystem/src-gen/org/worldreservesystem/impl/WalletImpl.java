/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.ecore.EClass;

import org.worldreservesystem.Identity;
import org.worldreservesystem.Wallet;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.WalletImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.WalletImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WalletImpl extends AbstractVaultImpl implements Wallet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WalletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.WALLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicKey() {
		return (String) eGet(WorldreservesystemPackage.Literals.WALLET__PUBLIC_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(String newPublicKey) {
		eSet(WorldreservesystemPackage.Literals.WALLET__PUBLIC_KEY, newPublicKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		return (Identity) eGet(WorldreservesystemPackage.Literals.WALLET__BELONGS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		eSet(WorldreservesystemPackage.Literals.WALLET__BELONGS_TO, newBelongsTo);
	}

} //WalletImpl
