/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Transaction Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.AllTransactionConditions#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getAllTransactionConditions()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AllTransactionConditions extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.TransactionCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getAllTransactionConditions_Children()
	 * @model
	 * @generated
	 */
	EList<TransactionCondition> getChildren();

} // AllTransactionConditions
