/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.Transaction#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.worldreservesystem.Transaction#getFrom <em>From</em>}</li>
 *   <li>{@link org.worldreservesystem.Transaction#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getTransaction()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Transaction extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference.
	 * @see #setAssets(Asset)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getTransaction_Assets()
	 * @model
	 * @generated
	 */
	Asset getAssets();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Transaction#getAssets <em>Assets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assets</em>' reference.
	 * @see #getAssets()
	 * @generated
	 */
	void setAssets(Asset value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractVault)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getTransaction_From()
	 * @model
	 * @generated
	 */
	AbstractVault getFrom();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Transaction#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractVault value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractVault)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getTransaction_To()
	 * @model
	 * @generated
	 */
	AbstractVault getTo();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Transaction#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractVault value);

} // Transaction
