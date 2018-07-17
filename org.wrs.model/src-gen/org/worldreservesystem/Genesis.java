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
 *   <li>{@link org.worldreservesystem.Genesis#getTreasury <em>Treasury</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getGenesis()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Genesis extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Treasury</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treasury</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treasury</em>' reference.
	 * @see #setTreasury(Treasury)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getGenesis_Treasury()
	 * @model required="true"
	 * @generated
	 */
	Treasury getTreasury();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Genesis#getTreasury <em>Treasury</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treasury</em>' reference.
	 * @see #getTreasury()
	 * @generated
	 */
	void setTreasury(Treasury value);

} // Genesis