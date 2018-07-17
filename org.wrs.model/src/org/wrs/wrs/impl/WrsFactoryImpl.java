/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wrs.wrs.*;

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
			WrsFactory theWrsFactory = (WrsFactory)EPackage.Registry.INSTANCE.getEFactory(WrsPackage.eNS_URI);
			if (theWrsFactory != null) {
				return theWrsFactory;
			}
		}
		catch (Exception exception) {
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
			case WrsPackage.WRS: return (EObject)createwrs();
			case WrsPackage.TREASURY: return (EObject)createTreasury();
			case WrsPackage.TRANSFER_VAULT: return (EObject)createTransferVault();
			case WrsPackage.TRANSFER_VAULTS: return (EObject)createTransferVaults();
			case WrsPackage.GENESIS: return (EObject)createGenesis();
			case WrsPackage.ASSET: return (EObject)createAsset();
			case WrsPackage.WORLD_ECONOMY: return (EObject)createWorldEconomy();
			case WrsPackage.NATIONAL_ECONOMIES: return (EObject)createNationalEconomies();
			case WrsPackage.NATION: return (EObject)createNation();
			case WrsPackage.FIAT_CURRENCY: return (EObject)createFiatCurrency();
			case WrsPackage.ACCOUNTANTS: return (EObject)createAccountants();
			case WrsPackage.ACCOUNTANT: return (EObject)createAccountant();
			case WrsPackage.MATERIAL: return (EObject)createMaterial();
			case WrsPackage.INDIVIDUAL: return (EObject)createIndividual();
			case WrsPackage.LEGAL_ENTITY: return (EObject)createLegalEntity();
			case WrsPackage.IDENTITIES: return (EObject)createIdentities();
			case WrsPackage.ACCOUNT: return (EObject)createAccount();
			case WrsPackage.SUPPLY_CONTROL: return (EObject)createSupplyControl();
			case WrsPackage.ACCOUNTS: return (EObject)createAccounts();
			case WrsPackage.TRANSACTION: return (EObject)createTransaction();
			case WrsPackage.REGISTERED_ASSETS: return (EObject)createRegisteredAssets();
			case WrsPackage.ABSTRACT_VAULT: return (EObject)createAbstractVault();
			case WrsPackage.TRANSACTION_COLLECTION: return (EObject)createTransactionCollection();
			case WrsPackage.NODE: return (EObject)createNode();
			case WrsPackage.NETWORK_ENGINE: return (EObject)createNetworkEngine();
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
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wrs createwrs() {
		wrsImpl wrs = new wrsImpl();
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
	public TransferVaults createTransferVaults() {
		TransferVaultsImpl transferVaults = new TransferVaultsImpl();
		return transferVaults;
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
	public Nation createNation() {
		NationImpl nation = new NationImpl();
		return nation;
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
	public Accountants createAccountants() {
		AccountantsImpl accountants = new AccountantsImpl();
		return accountants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accountant createAccountant() {
		AccountantImpl accountant = new AccountantImpl();
		return accountant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
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
	public Identities createIdentities() {
		IdentitiesImpl identities = new IdentitiesImpl();
		return identities;
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
	public AbstractVault createAbstractVault() {
		AbstractVaultImpl abstractVault = new AbstractVaultImpl();
		return abstractVault;
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
	public AssetType createAssetTypeFromString(EDataType eDataType, String initialValue) {
		AssetType result = AssetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public WrsPackage getWrsPackage() {
		return (WrsPackage)getEPackage();
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
