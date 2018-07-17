/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.ecore.EClass;

import org.wrs.wrs.Account;
import org.wrs.wrs.Identity;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.AccountImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.AccountImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends AbstractVaultImpl implements Account {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicKey() {
		return (String)eGet(WrsPackage.Literals.ACCOUNT__PUBLIC_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(String newPublicKey) {
		eSet(WrsPackage.Literals.ACCOUNT__PUBLIC_KEY, newPublicKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		return (Identity)eGet(WrsPackage.Literals.ACCOUNT__BELONGS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		eSet(WrsPackage.Literals.ACCOUNT__BELONGS_TO, newBelongsTo);
	}

} //AccountImpl