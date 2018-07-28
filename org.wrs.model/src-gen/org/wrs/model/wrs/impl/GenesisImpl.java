/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wrs.model.wrs.Genesis;
import org.wrs.model.wrs.Treasury;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.GenesisImpl#getTreasury <em>Treasury</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenesisImpl extends MinimalEObjectImpl.Container implements Genesis {
	/**
	 * The cached value of the '{@link #getTreasury() <em>Treasury</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreasury()
	 * @generated
	 * @ordered
	 */
	protected Treasury treasury;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.GENESIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury getTreasury() {
		if (treasury != null && treasury.eIsProxy()) {
			InternalEObject oldTreasury = (InternalEObject) treasury;
			treasury = (Treasury) eResolveProxy(oldTreasury);
			if (treasury != oldTreasury) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.GENESIS__TREASURY, oldTreasury,
							treasury));
			}
		}
		return treasury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury basicGetTreasury() {
		return treasury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreasury(Treasury newTreasury) {
		Treasury oldTreasury = treasury;
		treasury = newTreasury;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.GENESIS__TREASURY, oldTreasury, treasury));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.GENESIS__TREASURY:
			if (resolve)
				return getTreasury();
			return basicGetTreasury();
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
		case WrsPackage.GENESIS__TREASURY:
			setTreasury((Treasury) newValue);
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
		case WrsPackage.GENESIS__TREASURY:
			setTreasury((Treasury) null);
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
		case WrsPackage.GENESIS__TREASURY:
			return treasury != null;
		}
		return super.eIsSet(featureID);
	}

} //GenesisImpl
