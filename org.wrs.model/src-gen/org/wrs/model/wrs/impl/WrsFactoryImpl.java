/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wrs.model.wrs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrsFactoryImpl extends EFactoryImpl implements WrsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrsFactory init() {
		try {
			WrsFactory theWrsFactory = (WrsFactory) EPackage.Registry.INSTANCE.getEFactory(WrsPackage.eNS_URI);
			if (theWrsFactory != null) {
				return theWrsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WrsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WrsPackage.WRS:
			return (EObject) createWRS();
		case WrsPackage.TREASURY:
			return (EObject) createTreasury();
		case WrsPackage.TRANSFER_VAULT:
			return (EObject) createTransferVault();
		case WrsPackage.GENESIS_ACCOUNT:
			return (EObject) createGenesisAccount();
		case WrsPackage.ASSET:
			return (EObject) createAsset();
		case WrsPackage.WORLD_ECONOMY:
			return (EObject) createWorldEconomy();
		case WrsPackage.NATIONAL_ECONOMY:
			return (EObject) createNationalEconomy();
		case WrsPackage.COUNTRY:
			return (EObject) createCountry();
		case WrsPackage.FIAT_CURRENCY:
			return (EObject) createFiatCurrency();
		case WrsPackage.THING:
			return (EObject) createThing();
		case WrsPackage.INDIVIDUAL:
			return (EObject) createIndividual();
		case WrsPackage.LEGAL_ENTITY:
			return (EObject) createLegalEntity();
		case WrsPackage.PRIVATE_ACCOUNT:
			return (EObject) createPrivateAccount();
		case WrsPackage.SUPPLY_CONTROL:
			return (EObject) createSupplyControl();
		case WrsPackage.ACCOUNTS:
			return (EObject) createAccounts();
		case WrsPackage.TRANSACTION:
			return (EObject) createTransaction();
		case WrsPackage.REGISTERED_ASSETS:
			return (EObject) createRegisteredAssets();
		case WrsPackage.TRANSACTION_COLLECTION:
			return (EObject) createTransactionCollection();
		case WrsPackage.NODE:
			return (EObject) createNode();
		case WrsPackage.NETWORK_ENGINE:
			return (EObject) createNetworkEngine();
		case WrsPackage.COUNTRIES:
			return (EObject) createCountries();
		case WrsPackage.NODES:
			return (EObject) createNodes();
		case WrsPackage.IDENTITIES:
			return (EObject) createIdentities();
		case WrsPackage.ALL_TRANSACTIONS:
			return (EObject) createAllTransactions();
		case WrsPackage.ABSTRACT_TRANSACTION:
			return (EObject) createAbstractTransaction();
		case WrsPackage.NODE_ACCOUNT:
			return (EObject) createNodeAccount();
		case WrsPackage.ALL_TRANSACTION_CONDITIONS:
			return (EObject) createAllTransactionConditions();
		case WrsPackage.TRANSACTION_CONDITION:
			return (EObject) createTransactionCondition();
		case WrsPackage.SIGNED_INPUT:
			return (EObject) createSignedInput();
		case WrsPackage.STATISTICS:
			return (EObject) createStatistics();
		case WrsPackage.STATISTIC_DATAS:
			return (EObject) createStatisticDatas();
		case WrsPackage.COUNTRY_REGION:
			return (EObject) createCountryRegion();
		case WrsPackage.STATISTICS_SOURCE:
			return (EObject) createStatisticsSource();
		case WrsPackage.REGIONAL_ECONOMY:
			return (EObject) createregionalEconomy();
		case WrsPackage.TRANSFER_VAULTS:
			return (EObject) createTransferVaults();
		case WrsPackage.TRANSACTIONS:
			return (EObject) createTransactions();
		case WrsPackage.REGION_IDENTITIES:
			return (EObject) createRegionIdentities();
		case WrsPackage.LAYOUTABLE_CONTAINER:
			return (EObject) createLayoutableContainer();
		case WrsPackage.BUSINESS_ACCOUNT:
			return (EObject) createBusinessAccount();
		case WrsPackage.THING_ACCOUNT:
			return (EObject) createThingAccount();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case WrsPackage.ASSET_TYPE:
			return createAssetTypeFromString(eDataType, initialValue);
		case WrsPackage.LEGAL_ENTITY_TYPE:
			return createLegalEntityTypeFromString(eDataType, initialValue);
		case WrsPackage.INPUT_VALUE_TYPE:
			return createInputValueTypeFromString(eDataType, initialValue);
		case WrsPackage.ACCOUNT_TYPE:
			return createAccountTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case WrsPackage.ASSET_TYPE:
			return convertAssetTypeToString(eDataType, instanceValue);
		case WrsPackage.LEGAL_ENTITY_TYPE:
			return convertLegalEntityTypeToString(eDataType, instanceValue);
		case WrsPackage.INPUT_VALUE_TYPE:
			return convertInputValueTypeToString(eDataType, instanceValue);
		case WrsPackage.ACCOUNT_TYPE:
			return convertAccountTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WRS createWRS() {
		WRSImpl wrs = new WRSImpl();
		return wrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury createTreasury() {
		TreasuryImpl treasury = new TreasuryImpl();
		return treasury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferVault createTransferVault() {
		TransferVaultImpl transferVault = new TransferVaultImpl();
		return transferVault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenesisAccount createGenesisAccount() {
		GenesisAccountImpl genesisAccount = new GenesisAccountImpl();
		return genesisAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldEconomy createWorldEconomy() {
		WorldEconomyImpl worldEconomy = new WorldEconomyImpl();
		return worldEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalEconomy createNationalEconomy() {
		NationalEconomyImpl nationalEconomy = new NationalEconomyImpl();
		return nationalEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiatCurrency createFiatCurrency() {
		FiatCurrencyImpl fiatCurrency = new FiatCurrencyImpl();
		return fiatCurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity createLegalEntity() {
		LegalEntityImpl legalEntity = new LegalEntityImpl();
		return legalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateAccount createPrivateAccount() {
		PrivateAccountImpl privateAccount = new PrivateAccountImpl();
		return privateAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl createSupplyControl() {
		SupplyControlImpl supplyControl = new SupplyControlImpl();
		return supplyControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accounts createAccounts() {
		AccountsImpl accounts = new AccountsImpl();
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAssets createRegisteredAssets() {
		RegisteredAssetsImpl registeredAssets = new RegisteredAssetsImpl();
		return registeredAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCollection createTransactionCollection() {
		TransactionCollectionImpl transactionCollection = new TransactionCollectionImpl();
		return transactionCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEngine createNetworkEngine() {
		NetworkEngineImpl networkEngine = new NetworkEngineImpl();
		return networkEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countries createCountries() {
		CountriesImpl countries = new CountriesImpl();
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes createNodes() {
		NodesImpl nodes = new NodesImpl();
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identities createIdentities() {
		IdentitiesImpl identities = new IdentitiesImpl();
		return identities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTransactions createAllTransactions() {
		AllTransactionsImpl allTransactions = new AllTransactionsImpl();
		return allTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactions createTransactions() {
		TransactionsImpl transactions = new TransactionsImpl();
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionIdentities createRegionIdentities() {
		RegionIdentitiesImpl regionIdentities = new RegionIdentitiesImpl();
		return regionIdentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutableContainer createLayoutableContainer() {
		LayoutableContainerImpl layoutableContainer = new LayoutableContainerImpl();
		return layoutableContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAccount createBusinessAccount() {
		BusinessAccountImpl businessAccount = new BusinessAccountImpl();
		return businessAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingAccount createThingAccount() {
		ThingAccountImpl thingAccount = new ThingAccountImpl();
		return thingAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransaction createAbstractTransaction() {
		AbstractTransactionImpl abstractTransaction = new AbstractTransactionImpl();
		return abstractTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAccount createNodeAccount() {
		NodeAccountImpl nodeAccount = new NodeAccountImpl();
		return nodeAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTransactionConditions createAllTransactionConditions() {
		AllTransactionConditionsImpl allTransactionConditions = new AllTransactionConditionsImpl();
		return allTransactionConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCondition createTransactionCondition() {
		TransactionConditionImpl transactionCondition = new TransactionConditionImpl();
		return transactionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInput createSignedInput() {
		SignedInputImpl signedInput = new SignedInputImpl();
		return signedInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics createStatistics() {
		StatisticsImpl statistics = new StatisticsImpl();
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticDatas createStatisticDatas() {
		StatisticDatasImpl statisticDatas = new StatisticDatasImpl();
		return statisticDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryRegion createCountryRegion() {
		CountryRegionImpl countryRegion = new CountryRegionImpl();
		return countryRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsSource createStatisticsSource() {
		StatisticsSourceImpl statisticsSource = new StatisticsSourceImpl();
		return statisticsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public regionalEconomy createregionalEconomy() {
		regionalEconomyImpl regionalEconomy = new regionalEconomyImpl();
		return regionalEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferVaults createTransferVaults() {
		TransferVaultsImpl transferVaults = new TransferVaultsImpl();
		return transferVaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType createAssetTypeFromString(EDataType eDataType, String initialValue) {
		AssetType result = AssetType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityType createLegalEntityTypeFromString(EDataType eDataType, String initialValue) {
		LegalEntityType result = LegalEntityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegalEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValueType createInputValueTypeFromString(EDataType eDataType, String initialValue) {
		InputValueType result = InputValueType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountType createAccountTypeFromString(EDataType eDataType, String initialValue) {
		AccountType result = AccountType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrsPackage getWrsPackage() {
		return (WrsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WrsPackage getPackage() {
		return WrsPackage.eINSTANCE;
	}

} //WrsFactoryImpl
