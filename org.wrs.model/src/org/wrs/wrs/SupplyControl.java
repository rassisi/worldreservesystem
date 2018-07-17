/**
 */
package org.wrs.wrs;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.SupplyControl#getGenesis <em>Genesis</em>}</li>
 * </ul>
 *
 * @see org.wrs.wrs.WrsPackage#getSupplyControl()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SupplyControl extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Genesis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genesis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genesis</em>' reference.
	 * @see #setGenesis(Genesis)
	 * @see org.wrs.wrs.WrsPackage#getSupplyControl_Genesis()
	 * @model required="true"
	 * @generated
	 */
	Genesis getGenesis();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.SupplyControl#getGenesis <em>Genesis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genesis</em>' reference.
	 * @see #getGenesis()
	 * @generated
	 */
	void setGenesis(Genesis value);

} // SupplyControl
