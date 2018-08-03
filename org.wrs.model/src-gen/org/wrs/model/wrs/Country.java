/**
 */
package org.wrs.model.wrs;

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
 *   <li>{@link org.wrs.model.wrs.Country#getFiatcurrency <em>Fiatcurrency</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Country#getNationaleconomy <em>Nationaleconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Country#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getCountry()
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
	 * @see org.wrs.model.wrs.WrsPackage#getCountry_Fiatcurrency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FiatCurrency getFiatcurrency();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Country#getFiatcurrency <em>Fiatcurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiatcurrency</em>' containment reference.
	 * @see #getFiatcurrency()
	 * @generated
	 */
	void setFiatcurrency(FiatCurrency value);

	/**
	 * Returns the value of the '<em><b>Nationaleconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationaleconomy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationaleconomy</em>' containment reference.
	 * @see #setNationaleconomy(NationalEconomy)
	 * @see org.wrs.model.wrs.WrsPackage#getCountry_Nationaleconomy()
	 * @model containment="true"
	 * @generated
	 */
	NationalEconomy getNationaleconomy();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Country#getNationaleconomy <em>Nationaleconomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationaleconomy</em>' containment reference.
	 * @see #getNationaleconomy()
	 * @generated
	 */
	void setNationaleconomy(NationalEconomy value);

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.CountryRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getCountry_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CountryRegion> getRegions();

} // Country
