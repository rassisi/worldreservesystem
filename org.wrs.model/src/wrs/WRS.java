/**
 */
package wrs;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wrs.WRS#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link wrs.WRS#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link wrs.WRS#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link wrs.WRS#getRegisteredasstets <em>Registeredasstets</em>}</li>
 *   <li>{@link wrs.WRS#getWorldeconomy <em>Worldeconomy</em>}</li>
 *   <li>{@link wrs.WRS#getCountries <em>Countries</em>}</li>
 *   <li>{@link wrs.WRS#getNodes <em>Nodes</em>}</li>
 *   <li>{@link wrs.WRS#getIdentities <em>Identities</em>}</li>
 *   <li>{@link wrs.WRS#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link wrs.WRS#getTransactionconditions <em>Transactionconditions</em>}</li>
 *   <li>{@link wrs.WRS#getStatisticDatas <em>Statistic Datas</em>}</li>
 * </ul>
 *
 * @see wrs.WrsPackage#getWRS()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface WRS extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Mainvault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainvault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainvault</em>' reference.
	 * @see #setMainvault(Treasury)
	 * @see wrs.WrsPackage#getWRS_Mainvault()
	 * @model required="true"
	 * @generated
	 */
	Treasury getMainvault();

	/**
	 * Sets the value of the '{@link wrs.WRS#getMainvault <em>Mainvault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainvault</em>' reference.
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
	 * @see wrs.WrsPackage#getWRS_Supplycontrol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SupplyControl getSupplycontrol();

	/**
	 * Sets the value of the '{@link wrs.WRS#getSupplycontrol <em>Supplycontrol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplycontrol</em>' containment reference.
	 * @see #getSupplycontrol()
	 * @generated
	 */
	void setSupplycontrol(SupplyControl value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference.
	 * @see #setAccounts(Accounts)
	 * @see wrs.WrsPackage#getWRS_Accounts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Accounts getAccounts();

	/**
	 * Sets the value of the '{@link wrs.WRS#getAccounts <em>Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounts</em>' containment reference.
	 * @see #getAccounts()
	 * @generated
	 */
	void setAccounts(Accounts value);

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
	 * @see wrs.WrsPackage#getWRS_Registeredasstets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegisteredAssets getRegisteredasstets();

	/**
	 * Sets the value of the '{@link wrs.WRS#getRegisteredasstets <em>Registeredasstets</em>}' containment reference.
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
	 * @see wrs.WrsPackage#getWRS_Worldeconomy()
	 * @model containment="true"
	 * @generated
	 */
	WorldEconomy getWorldeconomy();

	/**
	 * Sets the value of the '{@link wrs.WRS#getWorldeconomy <em>Worldeconomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worldeconomy</em>' containment reference.
	 * @see #getWorldeconomy()
	 * @generated
	 */
	void setWorldeconomy(WorldEconomy value);

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference.
	 * @see #setCountries(Countries)
	 * @see wrs.WrsPackage#getWRS_Countries()
	 * @model containment="true"
	 * @generated
	 */
	Countries getCountries();

	/**
	 * Sets the value of the '{@link wrs.WRS#getCountries <em>Countries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Countries</em>' containment reference.
	 * @see #getCountries()
	 * @generated
	 */
	void setCountries(Countries value);

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
	 * @see wrs.WrsPackage#getWRS_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	Nodes getNodes();

	/**
	 * Sets the value of the '{@link wrs.WRS#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(Nodes value);

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
	 * @see wrs.WrsPackage#getWRS_Identities()
	 * @model containment="true"
	 * @generated
	 */
	Identities getIdentities();

	/**
	 * Sets the value of the '{@link wrs.WRS#getIdentities <em>Identities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identities</em>' containment reference.
	 * @see #getIdentities()
	 * @generated
	 */
	void setIdentities(Identities value);

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' containment reference.
	 * @see #setTransactions(Transactions)
	 * @see wrs.WrsPackage#getWRS_Transactions()
	 * @model containment="true"
	 * @generated
	 */
	Transactions getTransactions();

	/**
	 * Sets the value of the '{@link wrs.WRS#getTransactions <em>Transactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactions</em>' containment reference.
	 * @see #getTransactions()
	 * @generated
	 */
	void setTransactions(Transactions value);

	/**
	 * Returns the value of the '<em><b>Transactionconditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactionconditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactionconditions</em>' containment reference.
	 * @see #setTransactionconditions(TransactionConditions)
	 * @see wrs.WrsPackage#getWRS_Transactionconditions()
	 * @model containment="true"
	 * @generated
	 */
	TransactionConditions getTransactionconditions();

	/**
	 * Sets the value of the '{@link wrs.WRS#getTransactionconditions <em>Transactionconditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactionconditions</em>' containment reference.
	 * @see #getTransactionconditions()
	 * @generated
	 */
	void setTransactionconditions(TransactionConditions value);

	/**
	 * Returns the value of the '<em><b>Statistic Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistic Datas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic Datas</em>' containment reference.
	 * @see #setStatisticDatas(StatisticDatas)
	 * @see wrs.WrsPackage#getWRS_StatisticDatas()
	 * @model containment="true"
	 * @generated
	 */
	StatisticDatas getStatisticDatas();

	/**
	 * Sets the value of the '{@link wrs.WRS#getStatisticDatas <em>Statistic Datas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic Datas</em>' containment reference.
	 * @see #getStatisticDatas()
	 * @generated
	 */
	void setStatisticDatas(StatisticDatas value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createIdentity();

} // WRS
