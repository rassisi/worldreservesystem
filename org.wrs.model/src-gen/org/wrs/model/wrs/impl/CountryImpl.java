/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.Country;
import org.wrs.model.wrs.CountryRegion;
import org.wrs.model.wrs.FiatCurrency;
import org.wrs.model.wrs.NationalEconomy;
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
 *   <li>{@link org.wrs.model.wrs.impl.CountryImpl#getNationaleconomy <em>Nationaleconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.CountryImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends CDOObjectImpl implements Country {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiatCurrency getFiatcurrency() {
		return (FiatCurrency) eDynamicGet(WrsPackage.COUNTRY__FIATCURRENCY, WrsPackage.Literals.COUNTRY__FIATCURRENCY,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiatcurrency(FiatCurrency newFiatcurrency, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newFiatcurrency, WrsPackage.COUNTRY__FIATCURRENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiatcurrency(FiatCurrency newFiatcurrency) {
		eDynamicSet(WrsPackage.COUNTRY__FIATCURRENCY, WrsPackage.Literals.COUNTRY__FIATCURRENCY, newFiatcurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalEconomy getNationaleconomy() {
		return (NationalEconomy) eDynamicGet(WrsPackage.COUNTRY__NATIONALECONOMY,
				WrsPackage.Literals.COUNTRY__NATIONALECONOMY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNationaleconomy(NationalEconomy newNationaleconomy, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newNationaleconomy, WrsPackage.COUNTRY__NATIONALECONOMY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationaleconomy(NationalEconomy newNationaleconomy) {
		eDynamicSet(WrsPackage.COUNTRY__NATIONALECONOMY, WrsPackage.Literals.COUNTRY__NATIONALECONOMY,
				newNationaleconomy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CountryRegion> getRegions() {
		return (EList<CountryRegion>) eDynamicGet(WrsPackage.COUNTRY__REGIONS, WrsPackage.Literals.COUNTRY__REGIONS,
				true, true);
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
		case WrsPackage.COUNTRY__NATIONALECONOMY:
			return basicSetNationaleconomy(null, msgs);
		case WrsPackage.COUNTRY__REGIONS:
			return ((InternalEList<?>) getRegions()).basicRemove(otherEnd, msgs);
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
		case WrsPackage.COUNTRY__NATIONALECONOMY:
			return getNationaleconomy();
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
		case WrsPackage.COUNTRY__NATIONALECONOMY:
			setNationaleconomy((NationalEconomy) newValue);
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
		case WrsPackage.COUNTRY__NATIONALECONOMY:
			setNationaleconomy((NationalEconomy) null);
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
			return getFiatcurrency() != null;
		case WrsPackage.COUNTRY__NATIONALECONOMY:
			return getNationaleconomy() != null;
		case WrsPackage.COUNTRY__REGIONS:
			return !getRegions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CountryImpl
