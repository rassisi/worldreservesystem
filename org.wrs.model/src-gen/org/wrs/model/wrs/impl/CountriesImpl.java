/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wrs.model.wrs.Countries;
import org.wrs.model.wrs.Country;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Countries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.CountriesImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountriesImpl extends MinimalEObjectImpl.Container implements Countries {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.COUNTRIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Country newCountry, NotificationChain msgs) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.COUNTRIES__COUNTRY, oldCountry, newCountry);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject) country).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.COUNTRIES__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject) newCountry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.COUNTRIES__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.COUNTRIES__COUNTRY, newCountry,
					newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.COUNTRIES__COUNTRY:
			return basicSetCountry(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.COUNTRIES__COUNTRY:
			return getCountry();
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
		case WrsPackage.COUNTRIES__COUNTRY:
			setCountry((Country) newValue);
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
		case WrsPackage.COUNTRIES__COUNTRY:
			setCountry((Country) null);
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
		case WrsPackage.COUNTRIES__COUNTRY:
			return country != null;
		}
		return super.eIsSet(featureID);
	}

} //CountriesImpl
