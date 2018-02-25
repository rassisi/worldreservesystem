/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.City#getStreets <em>Streets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getCity()
 * @model
 * @generated
 */
public interface City extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Streets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.Street}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streets</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getCity_Streets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Street> getStreets();

} // City
