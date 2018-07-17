/**
 */
package org.wrs.wrs;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>National Economies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.NationalEconomies#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.wrs.WrsPackage#getNationalEconomies()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface NationalEconomies extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.wrs.Nation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.wrs.wrs.WrsPackage#getNationalEconomies_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nation> getChildren();

} // NationalEconomies
