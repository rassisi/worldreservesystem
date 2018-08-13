/**
 */
package org.wrs.model.wrs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.wrs.model.wrs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.wrs.model.wrs.WrsPackage
 * @generated
 */
public class WrsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WrsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrsSwitch() {
		if (modelPackage == null) {
			modelPackage = WrsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case WrsPackage.WRS: {
			WRS wrs = (WRS) theEObject;
			T result = caseWRS(wrs);
			if (result == null)
				result = caseLayoutable(wrs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TREASURY: {
			Treasury treasury = (Treasury) theEObject;
			T result = caseTreasury(treasury);
			if (result == null)
				result = caseAbstractAccount(treasury);
			if (result == null)
				result = caseLayoutable(treasury);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TRANSFER_VAULT: {
			TransferVault transferVault = (TransferVault) theEObject;
			T result = caseTransferVault(transferVault);
			if (result == null)
				result = caseAbstractAccount(transferVault);
			if (result == null)
				result = caseLayoutable(transferVault);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.GENESIS_ACCOUNT: {
			GenesisAccount genesisAccount = (GenesisAccount) theEObject;
			T result = caseGenesisAccount(genesisAccount);
			if (result == null)
				result = caseAbstractAccount(genesisAccount);
			if (result == null)
				result = caseLayoutable(genesisAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.ASSET: {
			Asset asset = (Asset) theEObject;
			T result = caseAsset(asset);
			if (result == null)
				result = caseLayoutable(asset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.WORLD_ECONOMY: {
			WorldEconomy worldEconomy = (WorldEconomy) theEObject;
			T result = caseWorldEconomy(worldEconomy);
			if (result == null)
				result = caseLayoutable(worldEconomy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.NATIONAL_ECONOMY: {
			NationalEconomy nationalEconomy = (NationalEconomy) theEObject;
			T result = caseNationalEconomy(nationalEconomy);
			if (result == null)
				result = caseLayoutable(nationalEconomy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.COUNTRY: {
			Country country = (Country) theEObject;
			T result = caseCountry(country);
			if (result == null)
				result = caseLayoutable(country);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.FIAT_CURRENCY: {
			FiatCurrency fiatCurrency = (FiatCurrency) theEObject;
			T result = caseFiatCurrency(fiatCurrency);
			if (result == null)
				result = caseLayoutable(fiatCurrency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.IDENTITY: {
			Identity identity = (Identity) theEObject;
			T result = caseIdentity(identity);
			if (result == null)
				result = caseLayoutable(identity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.THING: {
			Thing thing = (Thing) theEObject;
			T result = caseThing(thing);
			if (result == null)
				result = caseIdentity(thing);
			if (result == null)
				result = caseLayoutable(thing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.INDIVIDUAL: {
			Individual individual = (Individual) theEObject;
			T result = caseIndividual(individual);
			if (result == null)
				result = caseHumanEntity(individual);
			if (result == null)
				result = caseIdentity(individual);
			if (result == null)
				result = caseLayoutable(individual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.LEGAL_ENTITY: {
			LegalEntity legalEntity = (LegalEntity) theEObject;
			T result = caseLegalEntity(legalEntity);
			if (result == null)
				result = caseHumanEntity(legalEntity);
			if (result == null)
				result = caseIdentity(legalEntity);
			if (result == null)
				result = caseLayoutable(legalEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.PRIVATE_ACCOUNT: {
			PrivateAccount privateAccount = (PrivateAccount) theEObject;
			T result = casePrivateAccount(privateAccount);
			if (result == null)
				result = caseAbstractAccount(privateAccount);
			if (result == null)
				result = caseLayoutable(privateAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.SUPPLY_CONTROL: {
			SupplyControl supplyControl = (SupplyControl) theEObject;
			T result = caseSupplyControl(supplyControl);
			if (result == null)
				result = caseLayoutable(supplyControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.ACCOUNTS: {
			Accounts accounts = (Accounts) theEObject;
			T result = caseAccounts(accounts);
			if (result == null)
				result = caseLayoutableContainer(accounts);
			if (result == null)
				result = caseLayoutable(accounts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TRANSACTION: {
			Transaction transaction = (Transaction) theEObject;
			T result = caseTransaction(transaction);
			if (result == null)
				result = caseAbstractTransaction(transaction);
			if (result == null)
				result = caseLayoutable(transaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.REGISTERED_ASSETS: {
			RegisteredAssets registeredAssets = (RegisteredAssets) theEObject;
			T result = caseRegisteredAssets(registeredAssets);
			if (result == null)
				result = caseLayoutableContainer(registeredAssets);
			if (result == null)
				result = caseLayoutable(registeredAssets);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.ABSTRACT_ACCOUNT: {
			AbstractAccount abstractAccount = (AbstractAccount) theEObject;
			T result = caseAbstractAccount(abstractAccount);
			if (result == null)
				result = caseLayoutable(abstractAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TRANSACTION_COLLECTION: {
			TransactionCollection transactionCollection = (TransactionCollection) theEObject;
			T result = caseTransactionCollection(transactionCollection);
			if (result == null)
				result = caseAbstractTransaction(transactionCollection);
			if (result == null)
				result = caseLayoutable(transactionCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseLayoutable(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.NETWORK_ENGINE: {
			NetworkEngine networkEngine = (NetworkEngine) theEObject;
			T result = caseNetworkEngine(networkEngine);
			if (result == null)
				result = caseLayoutable(networkEngine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.COUNTRIES: {
			Countries countries = (Countries) theEObject;
			T result = caseCountries(countries);
			if (result == null)
				result = caseLayoutableContainer(countries);
			if (result == null)
				result = caseLayoutable(countries);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.NODES: {
			Nodes nodes = (Nodes) theEObject;
			T result = caseNodes(nodes);
			if (result == null)
				result = caseLayoutableContainer(nodes);
			if (result == null)
				result = caseLayoutable(nodes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.IDENTITIES: {
			Identities identities = (Identities) theEObject;
			T result = caseIdentities(identities);
			if (result == null)
				result = caseLayoutableContainer(identities);
			if (result == null)
				result = caseLayoutable(identities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.ALL_TRANSACTIONS: {
			AllTransactions allTransactions = (AllTransactions) theEObject;
			T result = caseAllTransactions(allTransactions);
			if (result == null)
				result = caseLayoutableContainer(allTransactions);
			if (result == null)
				result = caseLayoutable(allTransactions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.ABSTRACT_TRANSACTION: {
			AbstractTransaction abstractTransaction = (AbstractTransaction) theEObject;
			T result = caseAbstractTransaction(abstractTransaction);
			if (result == null)
				result = caseLayoutable(abstractTransaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.NODE_ACCOUNT: {
			NodeAccount nodeAccount = (NodeAccount) theEObject;
			T result = caseNodeAccount(nodeAccount);
			if (result == null)
				result = caseAbstractAccount(nodeAccount);
			if (result == null)
				result = caseLayoutable(nodeAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.ALL_TRANSACTION_CONDITIONS: {
			AllTransactionConditions allTransactionConditions = (AllTransactionConditions) theEObject;
			T result = caseAllTransactionConditions(allTransactionConditions);
			if (result == null)
				result = caseLayoutableContainer(allTransactionConditions);
			if (result == null)
				result = caseLayoutable(allTransactionConditions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TRANSACTION_CONDITION: {
			TransactionCondition transactionCondition = (TransactionCondition) theEObject;
			T result = caseTransactionCondition(transactionCondition);
			if (result == null)
				result = caseLayoutable(transactionCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.SIGNED_INPUT: {
			SignedInput signedInput = (SignedInput) theEObject;
			T result = caseSignedInput(signedInput);
			if (result == null)
				result = caseLayoutable(signedInput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.STATISTICS: {
			Statistics statistics = (Statistics) theEObject;
			T result = caseStatistics(statistics);
			if (result == null)
				result = caseLayoutable(statistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.STATISTIC_DATAS: {
			StatisticDatas statisticDatas = (StatisticDatas) theEObject;
			T result = caseStatisticDatas(statisticDatas);
			if (result == null)
				result = caseLayoutableContainer(statisticDatas);
			if (result == null)
				result = caseLayoutable(statisticDatas);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.COUNTRY_REGION: {
			CountryRegion countryRegion = (CountryRegion) theEObject;
			T result = caseCountryRegion(countryRegion);
			if (result == null)
				result = caseLayoutable(countryRegion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.STATISTICS_SOURCE: {
			StatisticsSource statisticsSource = (StatisticsSource) theEObject;
			T result = caseStatisticsSource(statisticsSource);
			if (result == null)
				result = caseLayoutable(statisticsSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.HUMAN_ENTITY: {
			HumanEntity humanEntity = (HumanEntity) theEObject;
			T result = caseHumanEntity(humanEntity);
			if (result == null)
				result = caseIdentity(humanEntity);
			if (result == null)
				result = caseLayoutable(humanEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.LAYOUTABLE: {
			Layoutable layoutable = (Layoutable) theEObject;
			T result = caseLayoutable(layoutable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.REGIONAL_ECONOMY: {
			regionalEconomy regionalEconomy = (regionalEconomy) theEObject;
			T result = caseregionalEconomy(regionalEconomy);
			if (result == null)
				result = caseLayoutable(regionalEconomy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TRANSFER_VAULTS: {
			TransferVaults transferVaults = (TransferVaults) theEObject;
			T result = caseTransferVaults(transferVaults);
			if (result == null)
				result = caseLayoutableContainer(transferVaults);
			if (result == null)
				result = caseLayoutable(transferVaults);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.TRANSACTIONS: {
			Transactions transactions = (Transactions) theEObject;
			T result = caseTransactions(transactions);
			if (result == null)
				result = caseLayoutableContainer(transactions);
			if (result == null)
				result = caseLayoutable(transactions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.REGION_IDENTITIES: {
			RegionIdentities regionIdentities = (RegionIdentities) theEObject;
			T result = caseRegionIdentities(regionIdentities);
			if (result == null)
				result = caseLayoutableContainer(regionIdentities);
			if (result == null)
				result = caseLayoutable(regionIdentities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.LAYOUTABLE_CONTAINER: {
			LayoutableContainer layoutableContainer = (LayoutableContainer) theEObject;
			T result = caseLayoutableContainer(layoutableContainer);
			if (result == null)
				result = caseLayoutable(layoutableContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.BUSINESS_ACCOUNT: {
			BusinessAccount businessAccount = (BusinessAccount) theEObject;
			T result = caseBusinessAccount(businessAccount);
			if (result == null)
				result = caseAbstractAccount(businessAccount);
			if (result == null)
				result = caseLayoutable(businessAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WrsPackage.THING_ACCOUNT: {
			ThingAccount thingAccount = (ThingAccount) theEObject;
			T result = caseThingAccount(thingAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WRS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WRS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWRS(WRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treasury</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treasury</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreasury(Treasury object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Vault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Vault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferVault(TransferVault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Genesis Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Genesis Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenesisAccount(GenesisAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World Economy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World Economy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldEconomy(WorldEconomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Economy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Economy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalEconomy(NationalEconomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fiat Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fiat Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiatCurrency(FiatCurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentity(Identity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntity(LegalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateAccount(PrivateAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyControl(SupplyControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccounts(Accounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Assets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Assets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredAssets(RegisteredAssets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAccount(AbstractAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionCollection(TransactionCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkEngine(NetworkEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountries(Countries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodes(Nodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentities(Identities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Transactions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Transactions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllTransactions(AllTransactions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactions(Transactions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Identities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Identities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionIdentities(RegionIdentities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layoutable Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layoutable Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutableContainer(LayoutableContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessAccount(BusinessAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingAccount(ThingAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransaction(AbstractTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeAccount(NodeAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Transaction Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Transaction Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllTransactionConditions(AllTransactionConditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionCondition(TransactionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedInput(SignedInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatistics(Statistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistic Datas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistic Datas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticDatas(StatisticDatas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryRegion(CountryRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistics Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistics Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticsSource(StatisticsSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanEntity(HumanEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layoutable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layoutable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutable(Layoutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>regional Economy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>regional Economy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseregionalEconomy(regionalEconomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Vaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Vaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferVaults(TransferVaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WrsSwitch
