/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Countries#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getCountries()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Countries extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getCountries_Country()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountry();

} // Countries
