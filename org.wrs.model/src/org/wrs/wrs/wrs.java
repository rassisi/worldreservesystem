/**
 */
package org.wrs.wrs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wrs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.wrs#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link org.wrs.wrs.wrs#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link org.wrs.wrs.wrs#getIdentities <em>Identities</em>}</li>
 *   <li>{@link org.wrs.wrs.wrs#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link org.wrs.wrs.wrs#getWallets <em>Wallets</em>}</li>
 *   <li>{@link org.wrs.wrs.wrs#getRegisteredasstets <em>Registeredasstets</em>}</li>
 * </ul>
 *
 * @see org.wrs.wrs.WrsPackage#getwrs()
 * @model
 * @generated
 */
public interface wrs extends Identity {
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
	 * @see org.wrs.wrs.WrsPackage#getwrs_Transfervaults()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransferVaults getTransfervaults();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.wrs#getTransfervaults <em>Transfervaults</em>}' containment reference.
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
	 * @see #setMainvault(Treasury)
	 * @see org.wrs.wrs.WrsPackage#getwrs_Mainvault()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Treasury getMainvault();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.wrs#getMainvault <em>Mainvault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainvault</em>' containment reference.
	 * @see #getMainvault()
	 * @generated
	 */
	void setMainvault(Treasury value);

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
	 * @see org.wrs.wrs.WrsPackage#getwrs_Identities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identities getIdentities();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.wrs#getIdentities <em>Identities</em>}' containment reference.
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
	 * @see org.wrs.wrs.WrsPackage#getwrs_Supplycontrol()
	 * @model required="true"
	 * @generated
	 */
	SupplyControl getSupplycontrol();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.wrs#getSupplycontrol <em>Supplycontrol</em>}' reference.
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
	 * @see #setWallets(Accounts)
	 * @see org.wrs.wrs.WrsPackage#getwrs_Wallets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Accounts getWallets();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.wrs#getWallets <em>Wallets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallets</em>' containment reference.
	 * @see #getWallets()
	 * @generated
	 */
	void setWallets(Accounts value);

	/**
	 * Returns the value of the '<em><b>Registeredasstets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registeredasstets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registeredasstets</em>' reference.
	 * @see #setRegisteredasstets(RegisteredAssets)
	 * @see org.wrs.wrs.WrsPackage#getwrs_Registeredasstets()
	 * @model required="true"
	 * @generated
	 */
	RegisteredAssets getRegisteredasstets();

	/**
	 * Sets the value of the '{@link org.wrs.wrs.wrs#getRegisteredasstets <em>Registeredasstets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registeredasstets</em>' reference.
	 * @see #getRegisteredasstets()
	 * @generated
	 */
	void setRegisteredasstets(RegisteredAssets value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createIdentity();

} // wrs
