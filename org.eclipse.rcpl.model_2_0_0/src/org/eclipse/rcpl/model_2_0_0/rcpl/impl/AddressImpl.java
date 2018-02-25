/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.rcpl.model_2_0_0.rcpl.Address;
import org.eclipse.rcpl.model_2_0_0.rcpl.AddressType;
import org.eclipse.rcpl.model_2_0_0.rcpl.Building;
import org.eclipse.rcpl.model_2_0_0.rcpl.City;
import org.eclipse.rcpl.model_2_0_0.rcpl.Country;
import org.eclipse.rcpl.model_2_0_0.rcpl.HouseNumber;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Street;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl#getHousenumber <em>Housenumber</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl#getBuildings <em>Buildings</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends LayoutableImpl implements Address {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		return (Country)eGet(RcplPackage.Literals.ADDRESS__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		eSet(RcplPackage.Literals.ADDRESS__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCity() {
		return (City)eGet(RcplPackage.Literals.ADDRESS__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(City newCity) {
		eSet(RcplPackage.Literals.ADDRESS__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Street getStreet() {
		return (Street)eGet(RcplPackage.Literals.ADDRESS__STREET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(Street newStreet) {
		eSet(RcplPackage.Literals.ADDRESS__STREET, newStreet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HouseNumber> getHousenumber() {
		return (EList<HouseNumber>)eGet(RcplPackage.Literals.ADDRESS__HOUSENUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Building> getBuildings() {
		return (EList<Building>)eGet(RcplPackage.Literals.ADDRESS__BUILDINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getAddressType() {
		return (AddressType)eGet(RcplPackage.Literals.ADDRESS__ADDRESS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressType(AddressType newAddressType) {
		eSet(RcplPackage.Literals.ADDRESS__ADDRESS_TYPE, newAddressType);
	}

} //AddressImpl
