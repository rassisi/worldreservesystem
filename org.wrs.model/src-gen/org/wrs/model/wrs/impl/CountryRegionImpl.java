/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.wrs.model.wrs.CountryRegion;
import org.wrs.model.wrs.RegionIdentities;
import org.wrs.model.wrs.WrsPackage;
import org.wrs.model.wrs.regionalEconomy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.CountryRegionImpl#getRegionaleconomy <em>Regionaleconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.CountryRegionImpl#getRegionidentities <em>Regionidentities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryRegionImpl extends LayoutableImpl implements CountryRegion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.COUNTRY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public regionalEconomy getRegionaleconomy() {
		return (regionalEconomy) eDynamicGet(WrsPackage.COUNTRY_REGION__REGIONALECONOMY,
				WrsPackage.Literals.COUNTRY_REGION__REGIONALECONOMY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionaleconomy(regionalEconomy newRegionaleconomy, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newRegionaleconomy, WrsPackage.COUNTRY_REGION__REGIONALECONOMY,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionaleconomy(regionalEconomy newRegionaleconomy) {
		eDynamicSet(WrsPackage.COUNTRY_REGION__REGIONALECONOMY, WrsPackage.Literals.COUNTRY_REGION__REGIONALECONOMY,
				newRegionaleconomy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionIdentities getRegionidentities() {
		return (RegionIdentities) eDynamicGet(WrsPackage.COUNTRY_REGION__REGIONIDENTITIES,
				WrsPackage.Literals.COUNTRY_REGION__REGIONIDENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionidentities(RegionIdentities newRegionidentities, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newRegionidentities, WrsPackage.COUNTRY_REGION__REGIONIDENTITIES,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionidentities(RegionIdentities newRegionidentities) {
		eDynamicSet(WrsPackage.COUNTRY_REGION__REGIONIDENTITIES, WrsPackage.Literals.COUNTRY_REGION__REGIONIDENTITIES,
				newRegionidentities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.COUNTRY_REGION__REGIONALECONOMY:
			return basicSetRegionaleconomy(null, msgs);
		case WrsPackage.COUNTRY_REGION__REGIONIDENTITIES:
			return basicSetRegionidentities(null, msgs);
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
		case WrsPackage.COUNTRY_REGION__REGIONALECONOMY:
			return getRegionaleconomy();
		case WrsPackage.COUNTRY_REGION__REGIONIDENTITIES:
			return getRegionidentities();
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
		case WrsPackage.COUNTRY_REGION__REGIONALECONOMY:
			setRegionaleconomy((regionalEconomy) newValue);
			return;
		case WrsPackage.COUNTRY_REGION__REGIONIDENTITIES:
			setRegionidentities((RegionIdentities) newValue);
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
		case WrsPackage.COUNTRY_REGION__REGIONALECONOMY:
			setRegionaleconomy((regionalEconomy) null);
			return;
		case WrsPackage.COUNTRY_REGION__REGIONIDENTITIES:
			setRegionidentities((RegionIdentities) null);
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
		case WrsPackage.COUNTRY_REGION__REGIONALECONOMY:
			return getRegionaleconomy() != null;
		case WrsPackage.COUNTRY_REGION__REGIONIDENTITIES:
			return getRegionidentities() != null;
		}
		return super.eIsSet(featureID);
	}

} //CountryRegionImpl
