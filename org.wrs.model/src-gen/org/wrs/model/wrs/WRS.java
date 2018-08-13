/**
 */
package org.wrs.model.wrs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.WRS#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getAllAccounts <em>All Accounts</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getRegisteredasstets <em>Registeredasstets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getWorldeconomy <em>Worldeconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getAlldentities <em>Alldentities</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getAllTransactions <em>All Transactions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getAllTransactionConditions <em>All Transaction Conditions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WRS#getGenesisAccount <em>Genesis Account</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getWRS()
 * @model
 * @generated
 */
public interface WRS extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Mainvault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainvault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainvault</em>' containment reference.
	 * @see #setMainvault(Treasury)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Mainvault()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Treasury getMainvault();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getMainvault <em>Mainvault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainvault</em>' containment reference.
	 * @see #getMainvault()
	 * @generated
	 */
	void setMainvault(Treasury value);

	/**
	 * Returns the value of the '<em><b>Supplycontrol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplycontrol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplycontrol</em>' containment reference.
	 * @see #setSupplycontrol(SupplyControl)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Supplycontrol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SupplyControl getSupplycontrol();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getSupplycontrol <em>Supplycontrol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplycontrol</em>' containment reference.
	 * @see #getSupplycontrol()
	 * @generated
	 */
	void setSupplycontrol(SupplyControl value);

	/**
	 * Returns the value of the '<em><b>All Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Accounts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Accounts</em>' containment reference.
	 * @see #setAllAccounts(Accounts)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_AllAccounts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Accounts getAllAccounts();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getAllAccounts <em>All Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Accounts</em>' containment reference.
	 * @see #getAllAccounts()
	 * @generated
	 */
	void setAllAccounts(Accounts value);

	/**
	 * Returns the value of the '<em><b>Registeredasstets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registeredasstets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registeredasstets</em>' containment reference.
	 * @see #setRegisteredasstets(RegisteredAssets)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Registeredasstets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegisteredAssets getRegisteredasstets();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getRegisteredasstets <em>Registeredasstets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registeredasstets</em>' containment reference.
	 * @see #getRegisteredasstets()
	 * @generated
	 */
	void setRegisteredasstets(RegisteredAssets value);

	/**
	 * Returns the value of the '<em><b>Worldeconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worldeconomy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worldeconomy</em>' containment reference.
	 * @see #setWorldeconomy(WorldEconomy)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Worldeconomy()
	 * @model containment="true"
	 * @generated
	 */
	WorldEconomy getWorldeconomy();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getWorldeconomy <em>Worldeconomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worldeconomy</em>' containment reference.
	 * @see #getWorldeconomy()
	 * @generated
	 */
	void setWorldeconomy(WorldEconomy value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference.
	 * @see #setNodes(Nodes)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	Nodes getNodes();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(Nodes value);

	/**
	 * Returns the value of the '<em><b>Alldentities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alldentities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alldentities</em>' containment reference.
	 * @see #setAlldentities(Identities)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Alldentities()
	 * @model containment="true"
	 * @generated
	 */
	Identities getAlldentities();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getAlldentities <em>Alldentities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alldentities</em>' containment reference.
	 * @see #getAlldentities()
	 * @generated
	 */
	void setAlldentities(Identities value);

	/**
	 * Returns the value of the '<em><b>All Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Transactions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Transactions</em>' containment reference.
	 * @see #setAllTransactions(AllTransactions)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_AllTransactions()
	 * @model containment="true"
	 * @generated
	 */
	AllTransactions getAllTransactions();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getAllTransactions <em>All Transactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Transactions</em>' containment reference.
	 * @see #getAllTransactions()
	 * @generated
	 */
	void setAllTransactions(AllTransactions value);

	/**
	 * Returns the value of the '<em><b>All Transaction Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Transaction Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Transaction Conditions</em>' containment reference.
	 * @see #setAllTransactionConditions(AllTransactionConditions)
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_AllTransactionConditions()
	 * @model containment="true"
	 * @generated
	 */
	AllTransactionConditions getAllTransactionConditions();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getAllTransactionConditions <em>All Transaction Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Transaction Conditions</em>' containment reference.
	 * @see #getAllTransactionConditions()
	 * @generated
	 */
	void setAllTransactionConditions(AllTransactionConditions value);

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
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_Transfervaults()
	 * @model containment="true"
	 * @generated
	 */
	TransferVaults getTransfervaults();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getTransfervaults <em>Transfervaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfervaults</em>' containment reference.
	 * @see #getTransfervaults()
	 * @generated
	 */
	void setTransfervaults(TransferVaults value);

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
	 * @see org.wrs.model.wrs.WrsPackage#getWRS_GenesisAccount()
	 * @model containment="true"
	 * @generated
	 */
	GenesisAccount getGenesisAccount();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WRS#getGenesisAccount <em>Genesis Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genesis Account</em>' containment reference.
	 * @see #getGenesisAccount()
	 * @generated
	 */
	void setGenesisAccount(GenesisAccount value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createIdentity();

} // WRS
