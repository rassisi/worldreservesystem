/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getWorldEconomy()
 * @model
 * @generated
 */
public interface WorldEconomy extends EObject {
	/**
	 * Returns the value of the '<em><b>Nationaleconomies</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.NationalEconomies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationaleconomies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationaleconomies</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getWorldEconomy_Nationaleconomies()
	 * @model required="true"
	 * @generated
	 */
	EList<NationalEconomies> getNationaleconomies();

} // WorldEconomy
