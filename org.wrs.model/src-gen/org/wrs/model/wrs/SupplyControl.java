/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.SupplyControl#getGenesisAccount <em>Genesis Account</em>}</li>
 *   <li>{@link org.wrs.model.wrs.SupplyControl#getTransferVaults <em>Transfer Vaults</em>}</li>
 *   <li>{@link org.wrs.model.wrs.SupplyControl#getTreasury <em>Treasury</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getSupplyControl()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SupplyControl extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Genesis Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genesis Account</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genesis Account</em>' containment reference.
	 * @see #setGenesisAccount(GenesisAccount)
	 * @see org.wrs.model.wrs.WrsPackage#getSupplyControl_GenesisAccount()
	 * @model containment="true"
	 * @generated
	 */
	GenesisAccount getGenesisAccount();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SupplyControl#getGenesisAccount <em>Genesis Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genesis Account</em>' containment reference.
	 * @see #getGenesisAccount()
	 * @generated
	 */
	void setGenesisAccount(GenesisAccount value);

	/**
	 * Returns the value of the '<em><b>Transfer Vaults</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Vaults</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Vaults</em>' reference.
	 * @see #setTransferVaults(TransferVaults)
	 * @see org.wrs.model.wrs.WrsPackage#getSupplyControl_TransferVaults()
	 * @model
	 * @generated
	 */
	TransferVaults getTransferVaults();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SupplyControl#getTransferVaults <em>Transfer Vaults</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Vaults</em>' reference.
	 * @see #getTransferVaults()
	 * @generated
	 */
	void setTransferVaults(TransferVaults value);

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
	 * @see org.wrs.model.wrs.WrsPackage#getSupplyControl_Treasury()
	 * @model
	 * @generated
	 */
	Treasury getTreasury();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SupplyControl#getTreasury <em>Treasury</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treasury</em>' reference.
	 * @see #getTreasury()
	 * @generated
	 */
	void setTreasury(Treasury value);

} // SupplyControl
