/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Transactions#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getTransactions()
 * @model
 * @generated
 */
public interface Transactions extends LayoutableContainer {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.AbstractTransaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getTransactions_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTransaction> getChildren();

} // Transactions
