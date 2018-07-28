/**
 */
package wrs;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wrs.Countries#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see wrs.WrsPackage#getCountries()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Countries extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(Country)
	 * @see wrs.WrsPackage#getCountries_Country()
	 * @model containment="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link wrs.Countries#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // Countries
