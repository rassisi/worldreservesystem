/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.worldreservesystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldreservesystemFactoryImpl extends EFactoryImpl implements WorldreservesystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorldreservesystemFactory init() {
		try {
			WorldreservesystemFactory theWorldreservesystemFactory = (WorldreservesystemFactory) EPackage.Registry.INSTANCE
					.getEFactory(WorldreservesystemPackage.eNS_URI);
			if (theWorldreservesystemFactory != null) {
				return theWorldreservesystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorldreservesystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldreservesystemFactoryImpl() {
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
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM:
			return (EObject) createWorldReserveSystem();
		case WorldreservesystemPackage.MAIN_VAULT:
			return (EObject) createMainVault();
		case WorldreservesystemPackage.TRANSFER_VAULT:
			return (EObject) createTransferVault();
		case WorldreservesystemPackage.TRANSFER_VAULTS:
			return (EObject) createTransferVaults();
		case WorldreservesystemPackage.GENESIS:
			return (EObject) createGenesis();
		case WorldreservesystemPackage.ASSET:
			return (EObject) createAsset();
		case WorldreservesystemPackage.WORLD_ECONOMY:
			return (EObject) createWorldEconomy();
		case WorldreservesystemPackage.NATIONAL_ECONOMIES:
			return (EObject) createNationalEconomies();
		case WorldreservesystemPackage.NATION:
			return (EObject) createNation();
		case WorldreservesystemPackage.FIAT_CURRENCY:
			return (EObject) createFiatCurrency();
		case WorldreservesystemPackage.ACCOUNTANTS:
			return (EObject) createAccountants();
		case WorldreservesystemPackage.ACCOUNTANT:
			return (EObject) createAccountant();
		case WorldreservesystemPackage.MATERIAL:
			return (EObject) createMaterial();
		case WorldreservesystemPackage.INDIVIDUAL:
			return (EObject) createIndividual();
		case WorldreservesystemPackage.LEGAL_ENTITY:
			return (EObject) createLegalEntity();
		case WorldreservesystemPackage.NEW_ECLASS17:
			return (EObject) createNewEClass17();
		case WorldreservesystemPackage.IDENTITIES:
			return (EObject) createIdentities();
		case WorldreservesystemPackage.WALLET:
			return (EObject) createWallet();
		case WorldreservesystemPackage.SUPPLY_CONTROL:
			return (EObject) createSupplyControl();
		case WorldreservesystemPackage.WALLETS:
			return (EObject) createWallets();
		case WorldreservesystemPackage.TRANSACTION:
			return (EObject) createTransaction();
		case WorldreservesystemPackage.REGISTERED_ASSTETS:
			return (EObject) createRegisteredAsstets();
		case WorldreservesystemPackage.ABSTRACT_VAULT:
			return (EObject) createAbstractVault();
		case WorldreservesystemPackage.TRANSACTION_COLLECTION:
			return (EObject) createTransactionCollection();
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
		case WorldreservesystemPackage.ASSET_TYPE:
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
		case WorldreservesystemPackage.ASSET_TYPE:
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
	public WorldReserveSystem createWorldReserveSystem() {
		WorldReserveSystemImpl worldReserveSystem = new WorldReserveSystemImpl();
		return worldReserveSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainVault createMainVault() {
		MainVaultImpl mainVault = new MainVaultImpl();
		return mainVault;
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
	public NewEClass17 createNewEClass17() {
		NewEClass17Impl newEClass17 = new NewEClass17Impl();
		return newEClass17;
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
	public Wallet createWallet() {
		WalletImpl wallet = new WalletImpl();
		return wallet;
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
	public Wallets createWallets() {
		WalletsImpl wallets = new WalletsImpl();
		return wallets;
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
	public RegisteredAsstets createRegisteredAsstets() {
		RegisteredAsstetsImpl registeredAsstets = new RegisteredAsstetsImpl();
		return registeredAsstets;
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
	public WorldreservesystemPackage getWorldreservesystemPackage() {
		return (WorldreservesystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorldreservesystemPackage getPackage() {
		return WorldreservesystemPackage.eINSTANCE;
	}

} //WorldreservesystemFactoryImpl
