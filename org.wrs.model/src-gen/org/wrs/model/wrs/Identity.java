/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Identity#getUUID <em>UUID</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getIdentity()
 * @model abstract="true"
 * @generated
 */
public interface Identity extends EObject {
	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see org.wrs.model.wrs.WrsPackage#getIdentity_UUID()
	 * @model
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Identity#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

} // Identity
