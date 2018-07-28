/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.wrs.model.wrs.Country;
import org.wrs.model.wrs.CountryRegion;
import org.wrs.model.wrs.FiatCurrency;
import org.wrs.model.wrs.NationalEconomies;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.CountryImpl#getFiatcurrency <em>Fiatcurrency</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.CountryImpl#getNationaleconomies <em>Nationaleconomies</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.CountryImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
	/**
	 * The cached value of the '{@link #getFiatcurrency() <em>Fiatcurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiatcurrency()
	 * @generated
	 * @ordered
	 */
	protected FiatCurrency fiatcurrency;

	/**
	 * The cached value of the '{@link #getNationaleconomies() <em>Nationaleconomies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaleconomies()
	 * @generated
	 * @ordered
	 */
	protected NationalEconomies nationaleconomies;

	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<CountryRegion> regions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiatCurrency getFiatcurrency() {
		return fiatcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiatcurrency(FiatCurrency newFiatcurrency, NotificationChain msgs) {
		FiatCurrency oldFiatcurrency = fiatcurrency;
		fiatcurrency = newFiatcurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.COUNTRY__FIATCURRENCY, oldFiatcurrency, newFiatcurrency);
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
	public void setFiatcurrency(FiatCurrency newFiatcurrency) {
		if (newFiatcurrency != fiatcurrency) {
			NotificationChain msgs = null;
			if (fiatcurrency != null)
				msgs = ((InternalEObject) fiatcurrency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.COUNTRY__FIATCURRENCY, null, msgs);
			if (newFiatcurrency != null)
				msgs = ((InternalEObject) newFiatcurrency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.COUNTRY__FIATCURRENCY, null, msgs);
			msgs = basicSetFiatcurrency(newFiatcurrency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.COUNTRY__FIATCURRENCY, newFiatcurrency,
					newFiatcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalEconomies getNationaleconomies() {
		return nationaleconomies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNationaleconomies(NationalEconomies newNationaleconomies, NotificationChain msgs) {
		NationalEconomies oldNationaleconomies = nationaleconomies;
		nationaleconomies = newNationaleconomies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.COUNTRY__NATIONALECONOMIES, oldNationaleconomies, newNationaleconomies);
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
	public void setNationaleconomies(NationalEconomies newNationaleconomies) {
		if (newNationaleconomies != nationaleconomies) {
			NotificationChain msgs = null;
			if (nationaleconomies != null)
				msgs = ((InternalEObject) nationaleconomies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.COUNTRY__NATIONALECONOMIES, null, msgs);
			if (newNationaleconomies != null)
				msgs = ((InternalEObject) newNationaleconomies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.COUNTRY__NATIONALECONOMIES, null, msgs);
			msgs = basicSetNationaleconomies(newNationaleconomies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.COUNTRY__NATIONALECONOMIES,
					newNationaleconomies, newNationaleconomies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountryRegion> getRegions() {
		if (regions == null) {
			regions = new EObjectResolvingEList<CountryRegion>(CountryRegion.class, this, WrsPackage.COUNTRY__REGIONS);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.COUNTRY__FIATCURRENCY:
			return basicSetFiatcurrency(null, msgs);
		case WrsPackage.COUNTRY__NATIONALECONOMIES:
			return basicSetNationaleconomies(null, msgs);
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
		case WrsPackage.COUNTRY__FIATCURRENCY:
			return getFiatcurrency();
		case WrsPackage.COUNTRY__NATIONALECONOMIES:
			return getNationaleconomies();
		case WrsPackage.COUNTRY__REGIONS:
			return getRegions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.COUNTRY__FIATCURRENCY:
			setFiatcurrency((FiatCurrency) newValue);
			return;
		case WrsPackage.COUNTRY__NATIONALECONOMIES:
			setNationaleconomies((NationalEconomies) newValue);
			return;
		case WrsPackage.COUNTRY__REGIONS:
			getRegions().clear();
			getRegions().addAll((Collection<? extends CountryRegion>) newValue);
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
		case WrsPackage.COUNTRY__FIATCURRENCY:
			setFiatcurrency((FiatCurrency) null);
			return;
		case WrsPackage.COUNTRY__NATIONALECONOMIES:
			setNationaleconomies((NationalEconomies) null);
			return;
		case WrsPackage.COUNTRY__REGIONS:
			getRegions().clear();
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
		case WrsPackage.COUNTRY__FIATCURRENCY:
			return fiatcurrency != null;
		case WrsPackage.COUNTRY__NATIONALECONOMIES:
			return nationaleconomies != null;
		case WrsPackage.COUNTRY__REGIONS:
			return regions != null && !regions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CountryImpl
