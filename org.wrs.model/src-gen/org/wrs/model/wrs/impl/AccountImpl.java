/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wrs.model.wrs.Account;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.AccountImpl#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends AbstractAccountImpl implements Account {
	/**
	 * The default value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String publicKey = PUBLIC_KEY_EDEFAULT;

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
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(String newPublicKey) {
		String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.ACCOUNT__PUBLIC_KEY, oldPublicKey,
					publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.ACCOUNT__PUBLIC_KEY:
			return getPublicKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.ACCOUNT__PUBLIC_KEY:
			setPublicKey((String) newValue);
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
		case WrsPackage.ACCOUNT__PUBLIC_KEY:
			setPublicKey(PUBLIC_KEY_EDEFAULT);
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
		case WrsPackage.ACCOUNT__PUBLIC_KEY:
			return PUBLIC_KEY_EDEFAULT == null ? publicKey != null : !PUBLIC_KEY_EDEFAULT.equals(publicKey);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (publicKey: ");
		result.append(publicKey);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
