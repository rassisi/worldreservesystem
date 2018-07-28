/**
 */
package org.wrs.wrs;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.Country#getFiatcurrency <em>Fiatcurrency</em>}</li>
 *   <li>{@link org.wrs.wrs.Country#getNationaleconomies <em>Nationaleconomies</em>}</li>
 *   <li>{@link org.wrs.wrs.Country#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see org.wrs.wrs.WrsPackage#getCountry()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Country extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Fiatcurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiatcurrency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiatcurrency</em>' containment reference.
	 * @see #setFiatcurrency(FiatCurrency)
	 * @see org.wrs.wrs.WrsPackage#getCountry_Fiatcurrency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FiatCurrency getFiatcurrency();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.Country#getFiatcurrency <em>Fiatcurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiatcurrency</em>' containment reference.
	 * @see #getFiatcurrency()
	 * @generated
	 */
	void setFiatcurrency(FiatCurrency value);

	/**
	 * Returns the value of the '<em><b>Nationaleconomies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationaleconomies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationaleconomies</em>' containment reference.
	 * @see #setNationaleconomies(NationalEconomies)
	 * @see org.wrs.wrs.WrsPackage#getCountry_Nationaleconomies()
	 * @model containment="true"
	 * @generated
	 */
	NationalEconomies getNationaleconomies();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.Country#getNationaleconomies <em>Nationaleconomies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationaleconomies</em>' containment reference.
	 * @see #getNationaleconomies()
	 * @generated
	 */
	void setNationaleconomies(NationalEconomies value);

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.wrs.CountryRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' reference list.
	 * @see org.wrs.wrs.WrsPackage#getCountry_Regions()
	 * @model
	 * @generated
	 */
	EList<CountryRegion> getRegions();

} // Country
