/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Vaults</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * New documentation note
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.TransferVaults#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getTransferVaults()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TransferVaults extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.worldreservesystem.TransferVault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.worldreservesystem.WorldreservesystemPackage#getTransferVaults_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferVault> getChildren();

} // TransferVaults
