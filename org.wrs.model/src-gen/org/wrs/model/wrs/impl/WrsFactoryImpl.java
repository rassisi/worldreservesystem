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
			return createWRS();
		case WrsPackage.TREASURY:
			return createTreasury();
		case WrsPackage.TRANSFER_VAULT:
			return createTransferVault();
		case WrsPackage.GENESIS:
			return createGenesis();
		case WrsPackage.ASSET:
			return createAsset();
		case WrsPackage.WORLD_ECONOMY:
			return createWorldEconomy();
		case WrsPackage.NATIONAL_ECONOMIES:
			return createNationalEconomies();
		case WrsPackage.COUNTRY:
			return createCountry();
		case WrsPackage.FIAT_CURRENCY:
			return createFiatCurrency();
		case WrsPackage.THING:
			return createThing();
		case WrsPackage.INDIVIDUAL:
			return createIndividual();
		case WrsPackage.LEGAL_ENTITY:
			return createLegalEntity();
		case WrsPackage.ACCOUNT:
			return createAccount();
		case WrsPackage.SUPPLY_CONTROL:
			return createSupplyControl();
		case WrsPackage.ACCOUNTS:
			return createAccounts();
		case WrsPackage.TRANSACTION:
			return createTransaction();
		case WrsPackage.REGISTERED_ASSETS:
			return createRegisteredAssets();
		case WrsPackage.ABSTRACT_ACCOUNT:
			return createAbstractAccount();
		case WrsPackage.TRANSACTION_COLLECTION:
			return createTransactionCollection();
		case WrsPackage.NODE:
			return createNode();
		case WrsPackage.NETWORK_ENGINE:
			return createNetworkEngine();
		case WrsPackage.COUNTRIES:
			return createCountries();
		case WrsPackage.NODES:
			return createNodes();
		case WrsPackage.IDENTITIES:
			return createIdentities();
		case WrsPackage.TRANSACTIONS:
			return createTransactions();
		case WrsPackage.ABSTRACT_TRANSACTION:
			return createAbstractTransaction();
		case WrsPackage.NODE_ACCOUNT:
			return createNodeAccount();
		case WrsPackage.TRANSACTION_CONDITIONS:
			return createTransactionConditions();
		case WrsPackage.TRANSACTION_CONDITION:
			return createTransactionCondition();
		case WrsPackage.SIGNED_INPUT:
			return createSignedInput();
		case WrsPackage.STATISTICS:
			return createStatistics();
		case WrsPackage.STATISTIC_DATAS:
			return createStatisticDatas();
		case WrsPackage.COUNTRY_REGION:
			return createCountryRegion();
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
	public Genesis createGenesis() {
		GenesisImpl genesis = new GenesisImpl();
		return genesis;
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
	public NationalEconomies createNationalEconomies() {
		NationalEconomiesImpl nationalEconomies = new NationalEconomiesImpl();
		return nationalEconomies;
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
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
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
	public AbstractAccount createAbstractAccount() {
		AbstractAccountImpl abstractAccount = new AbstractAccountImpl();
		return abstractAccount;
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
	public Transactions createTransactions() {
		TransactionsImpl transactions = new TransactionsImpl();
		return transactions;
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
	public TransactionConditions createTransactionConditions() {
		TransactionConditionsImpl transactionConditions = new TransactionConditionsImpl();
		return transactionConditions;
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
