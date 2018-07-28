/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Accounts#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getAccounts()
 * @model
 * @generated
 */
public interface Accounts extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.AbstractAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getAccounts_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractAccount> getChildren();

} // Accounts
