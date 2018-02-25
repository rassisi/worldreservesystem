/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.Accounts#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getAccounts()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Accounts extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.worldreservesystem.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.worldreservesystem.WorldreservesystemPackage#getAccounts_Children()
	 * @model
	 * @generated
	 */
	EList<Account> getChildren();

} // Accounts
