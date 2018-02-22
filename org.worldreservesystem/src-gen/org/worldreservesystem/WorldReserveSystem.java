/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Reserve System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.WorldReserveSystem#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link org.worldreservesystem.WorldReserveSystem#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link org.worldreservesystem.WorldReserveSystem#getIdentities <em>Identities</em>}</li>
 *   <li>{@link org.worldreservesystem.WorldReserveSystem#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link org.worldreservesystem.WorldReserveSystem#getWallets <em>Wallets</em>}</li>
 *   <li>{@link org.worldreservesystem.WorldReserveSystem#getRegisteredasstets <em>Registeredasstets</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem()
 * @model
 * @generated
 */
public interface WorldReserveSystem extends Identity {
	/**
	 * Returns the value of the '<em><b>Transfervaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfervaults</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfervaults</em>' containment reference.
	 * @see #setTransfervaults(TransferVaults)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem_Transfervaults()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransferVaults getTransfervaults();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.WorldReserveSystem#getTransfervaults <em>Transfervaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfervaults</em>' containment reference.
	 * @see #getTransfervaults()
	 * @generated
	 */
	void setTransfervaults(TransferVaults value);

	/**
	 * Returns the value of the '<em><b>Mainvault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainvault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainvault</em>' containment reference.
	 * @see #setMainvault(MainVault)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem_Mainvault()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MainVault getMainvault();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.WorldReserveSystem#getMainvault <em>Mainvault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainvault</em>' containment reference.
	 * @see #getMainvault()
	 * @generated
	 */
	void setMainvault(MainVault value);

	/**
	 * Returns the value of the '<em><b>Identities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identities</em>' containment reference.
	 * @see #setIdentities(Identities)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem_Identities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identities getIdentities();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.WorldReserveSystem#getIdentities <em>Identities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identities</em>' containment reference.
	 * @see #getIdentities()
	 * @generated
	 */
	void setIdentities(Identities value);

	/**
	 * Returns the value of the '<em><b>Supplycontrol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplycontrol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplycontrol</em>' reference.
	 * @see #setSupplycontrol(SupplyControl)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem_Supplycontrol()
	 * @model required="true"
	 * @generated
	 */
	SupplyControl getSupplycontrol();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.WorldReserveSystem#getSupplycontrol <em>Supplycontrol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplycontrol</em>' reference.
	 * @see #getSupplycontrol()
	 * @generated
	 */
	void setSupplycontrol(SupplyControl value);

	/**
	 * Returns the value of the '<em><b>Wallets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallets</em>' containment reference.
	 * @see #setWallets(Wallets)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem_Wallets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Wallets getWallets();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.WorldReserveSystem#getWallets <em>Wallets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallets</em>' containment reference.
	 * @see #getWallets()
	 * @generated
	 */
	void setWallets(Wallets value);

	/**
	 * Returns the value of the '<em><b>Registeredasstets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registeredasstets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registeredasstets</em>' reference.
	 * @see #setRegisteredasstets(RegisteredAsstets)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getWorldReserveSystem_Registeredasstets()
	 * @model required="true"
	 * @generated
	 */
	RegisteredAsstets getRegisteredasstets();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.WorldReserveSystem#getRegisteredasstets <em>Registeredasstets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registeredasstets</em>' reference.
	 * @see #getRegisteredasstets()
	 * @generated
	 */
	void setRegisteredasstets(RegisteredAsstets value);

} // WorldReserveSystem
