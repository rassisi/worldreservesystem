/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.Genesis#getMainvault <em>Mainvault</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getGenesis()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Genesis extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Mainvault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainvault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainvault</em>' reference.
	 * @see #setMainvault(MainVault)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getGenesis_Mainvault()
	 * @model required="true"
	 * @generated
	 */
	MainVault getMainvault();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Genesis#getMainvault <em>Mainvault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainvault</em>' reference.
	 * @see #getMainvault()
	 * @generated
	 */
	void setMainvault(MainVault value);

} // Genesis
