/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.wrs.model.wrs.WrsPackage
 * @generated
 */
public interface WrsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrsFactory eINSTANCE = org.wrs.model.wrs.impl.WrsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WRS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WRS</em>'.
	 * @generated
	 */
	WRS createWRS();

	/**
	 * Returns a new object of class '<em>Treasury</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Treasury</em>'.
	 * @generated
	 */
	Treasury createTreasury();

	/**
	 * Returns a new object of class '<em>Transfer Vault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer Vault</em>'.
	 * @generated
	 */
	TransferVault createTransferVault();

	/**
	 * Returns a new object of class '<em>Genesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genesis</em>'.
	 * @generated
	 */
	Genesis createGenesis();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>World Economy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World Economy</em>'.
	 * @generated
	 */
	WorldEconomy createWorldEconomy();

	/**
	 * Returns a new object of class '<em>National Economy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Economy</em>'.
	 * @generated
	 */
	NationalEconomy createNationalEconomy();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Fiat Currency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fiat Currency</em>'.
	 * @generated
	 */
	FiatCurrency createFiatCurrency();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual</em>'.
	 * @generated
	 */
	Individual createIndividual();

	/**
	 * Returns a new object of class '<em>Legal Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Entity</em>'.
	 * @generated
	 */
	LegalEntity createLegalEntity();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Supply Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Control</em>'.
	 * @generated
	 */
	SupplyControl createSupplyControl();

	/**
	 * Returns a new object of class '<em>Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accounts</em>'.
	 * @generated
	 */
	Accounts createAccounts();

	/**
	 * Returns a new object of class '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction</em>'.
	 * @generated
	 */
	Transaction createTransaction();

	/**
	 * Returns a new object of class '<em>Registered Assets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registered Assets</em>'.
	 * @generated
	 */
	RegisteredAssets createRegisteredAssets();

	/**
	 * Returns a new object of class '<em>Transaction Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Collection</em>'.
	 * @generated
	 */
	TransactionCollection createTransactionCollection();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Network Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Engine</em>'.
	 * @generated
	 */
	NetworkEngine createNetworkEngine();

	/**
	 * Returns a new object of class '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Countries</em>'.
	 * @generated
	 */
	Countries createCountries();

	/**
	 * Returns a new object of class '<em>Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodes</em>'.
	 * @generated
	 */
	Nodes createNodes();

	/**
	 * Returns a new object of class '<em>Identities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identities</em>'.
	 * @generated
	 */
	Identities createIdentities();

	/**
	 * Returns a new object of class '<em>Transactions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transactions</em>'.
	 * @generated
	 */
	Transactions createTransactions();

	/**
	 * Returns a new object of class '<em>Abstract Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Transaction</em>'.
	 * @generated
	 */
	AbstractTransaction createAbstractTransaction();

	/**
	 * Returns a new object of class '<em>Node Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Account</em>'.
	 * @generated
	 */
	NodeAccount createNodeAccount();

	/**
	 * Returns a new object of class '<em>Transaction Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Conditions</em>'.
	 * @generated
	 */
	TransactionConditions createTransactionConditions();

	/**
	 * Returns a new object of class '<em>Transaction Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Condition</em>'.
	 * @generated
	 */
	TransactionCondition createTransactionCondition();

	/**
	 * Returns a new object of class '<em>Signed Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signed Input</em>'.
	 * @generated
	 */
	SignedInput createSignedInput();

	/**
	 * Returns a new object of class '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistics</em>'.
	 * @generated
	 */
	Statistics createStatistics();

	/**
	 * Returns a new object of class '<em>Statistic Datas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistic Datas</em>'.
	 * @generated
	 */
	StatisticDatas createStatisticDatas();

	/**
	 * Returns a new object of class '<em>Country Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Region</em>'.
	 * @generated
	 */
	CountryRegion createCountryRegion();

	/**
	 * Returns a new object of class '<em>Statistics Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistics Source</em>'.
	 * @generated
	 */
	StatisticsSource createStatisticsSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WrsPackage getWrsPackage();

} //WrsFactory
