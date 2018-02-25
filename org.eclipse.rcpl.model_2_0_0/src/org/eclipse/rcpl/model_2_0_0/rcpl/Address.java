/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getHousenumber <em>Housenumber</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getBuildings <em>Buildings</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress_City()
	 * @model
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' reference.
	 * @see #setStreet(Street)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress_Street()
	 * @model
	 * @generated
	 */
	Street getStreet();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getStreet <em>Street</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' reference.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(Street value);

	/**
	 * Returns the value of the '<em><b>Housenumber</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.HouseNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Housenumber</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housenumber</em>' reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress_Housenumber()
	 * @model
	 * @generated
	 */
	EList<HouseNumber> getHousenumber();

	/**
	 * Returns the value of the '<em><b>Buildings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.Building}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildings</em>' reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress_Buildings()
	 * @model
	 * @generated
	 */
	EList<Building> getBuildings();

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rcpl.model_2_0_0.rcpl.AddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AddressType
	 * @see #setAddressType(AddressType)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getAddress_AddressType()
	 * @model
	 * @generated
	 */
	AddressType getAddressType();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AddressType
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(AddressType value);

} // Address
