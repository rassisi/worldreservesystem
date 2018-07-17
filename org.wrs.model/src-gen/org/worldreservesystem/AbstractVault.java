/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Vault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.AbstractVault#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.worldreservesystem.AbstractVault#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getAbstractVault()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AbstractVault extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link org.worldreservesystem.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see org.worldreservesystem.WorldreservesystemPackage#getAbstractVault_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getAbstractVault_Transaction()
	 * @model
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.AbstractVault#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

} // AbstractVault
