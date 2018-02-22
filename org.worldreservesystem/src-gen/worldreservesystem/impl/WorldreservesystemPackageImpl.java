/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import worldreservesystem.AbstractVault;
import worldreservesystem.Accountant;
import worldreservesystem.Accountants;
import worldreservesystem.Asset;
import worldreservesystem.AssetType;
import worldreservesystem.FiatCurrency;
import worldreservesystem.Genesis;
import worldreservesystem.Identities;
import worldreservesystem.Identity;
import worldreservesystem.Individual;
import worldreservesystem.LegalEntity;
import worldreservesystem.MainVault;
import worldreservesystem.Material;
import worldreservesystem.Nation;
import worldreservesystem.NationalEconomies;
import worldreservesystem.NewEClass17;
import worldreservesystem.RegisteredAsstets;
import worldreservesystem.SupplyControl;
import worldreservesystem.Transaction;
import worldreservesystem.TransactionCollection;
import worldreservesystem.TransferVault;
import worldreservesystem.TransferVaults;
import worldreservesystem.Wallet;
import worldreservesystem.Wallets;
import worldreservesystem.WorldEconomy;
import worldreservesystem.WorldReserveSystem;
import worldreservesystem.WorldreservesystemFactory;
import worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorldreservesystemPackageImpl extends EPackageImpl implements WorldreservesystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldReserveSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainVaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferVaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferVaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldEconomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalEconomiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fiatCurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass17EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registeredAsstetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see worldreservesystem.WorldreservesystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorldreservesystemPackageImpl() {
		super(eNS_URI, WorldreservesystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WorldreservesystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorldreservesystemPackage init() {
		if (isInited)
			return (WorldreservesystemPackage) EPackage.Registry.INSTANCE
					.getEPackage(WorldreservesystemPackage.eNS_URI);

		// Obtain or create and register package
		WorldreservesystemPackageImpl theWorldreservesystemPackage = (WorldreservesystemPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof WorldreservesystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new WorldreservesystemPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWorldreservesystemPackage.createPackageContents();

		// Initialize created meta-data
		theWorldreservesystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorldreservesystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorldreservesystemPackage.eNS_URI, theWorldreservesystemPackage);
		return theWorldreservesystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorldReserveSystem() {
		return worldReserveSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldReserveSystem_Transfervaults() {
		return (EReference) worldReserveSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldReserveSystem_Mainvault() {
		return (EReference) worldReserveSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldReserveSystem_Identities() {
		return (EReference) worldReserveSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldReserveSystem_Supplycontrol() {
		return (EReference) worldReserveSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldReserveSystem_Wallets() {
		return (EReference) worldReserveSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldReserveSystem_Registeredasstets() {
		return (EReference) worldReserveSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainVault() {
		return mainVaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferVault() {
		return transferVaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferVaults() {
		return transferVaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferVaults_Children() {
		return (EReference) transferVaultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenesis() {
		return genesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenesis_Mainvault() {
		return (EReference) genesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_AssetType() {
		return (EAttribute) assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Materials() {
		return (EReference) assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAsset__Register() {
		return assetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorldEconomy() {
		return worldEconomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorldEconomy_Nationaleconomies() {
		return (EReference) worldEconomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNationalEconomies() {
		return nationalEconomiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNationalEconomies_Children() {
		return (EReference) nationalEconomiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNation() {
		return nationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNation_Fiatcurrency() {
		return (EReference) nationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiatCurrency() {
		return fiatCurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountants() {
		return accountantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountants_Children() {
		return (EReference) accountantsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountant() {
		return accountantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentity_UUID() {
		return (EAttribute) identityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterial_BelongsTo() {
		return (EReference) materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalEntity() {
		return legalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass17() {
		return newEClass17EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentities() {
		return identitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentities_Children() {
		return (EReference) identitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallet() {
		return walletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_PublicKey() {
		return (EAttribute) walletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_BelongsTo() {
		return (EReference) walletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyControl() {
		return supplyControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyControl_Genesis() {
		return (EReference) supplyControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallets() {
		return walletsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallets_Children() {
		return (EReference) walletsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Assets() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_From() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_To() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredAsstets() {
		return registeredAsstetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredAsstets_Children() {
		return (EReference) registeredAsstetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractVault() {
		return abstractVaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVault_Assets() {
		return (EReference) abstractVaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionCollection() {
		return transactionCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssetType() {
		return assetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldreservesystemFactory getWorldreservesystemFactory() {
		return (WorldreservesystemFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		worldReserveSystemEClass = createEClass(WORLD_RESERVE_SYSTEM);
		createEReference(worldReserveSystemEClass, WORLD_RESERVE_SYSTEM__TRANSFERVAULTS);
		createEReference(worldReserveSystemEClass, WORLD_RESERVE_SYSTEM__MAINVAULT);
		createEReference(worldReserveSystemEClass, WORLD_RESERVE_SYSTEM__IDENTITIES);
		createEReference(worldReserveSystemEClass, WORLD_RESERVE_SYSTEM__SUPPLYCONTROL);
		createEReference(worldReserveSystemEClass, WORLD_RESERVE_SYSTEM__WALLETS);
		createEReference(worldReserveSystemEClass, WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS);

		mainVaultEClass = createEClass(MAIN_VAULT);

		transferVaultEClass = createEClass(TRANSFER_VAULT);

		transferVaultsEClass = createEClass(TRANSFER_VAULTS);
		createEReference(transferVaultsEClass, TRANSFER_VAULTS__CHILDREN);

		genesisEClass = createEClass(GENESIS);
		createEReference(genesisEClass, GENESIS__MAINVAULT);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ASSET_TYPE);
		createEReference(assetEClass, ASSET__MATERIALS);
		createEOperation(assetEClass, ASSET___REGISTER);

		worldEconomyEClass = createEClass(WORLD_ECONOMY);
		createEReference(worldEconomyEClass, WORLD_ECONOMY__NATIONALECONOMIES);

		nationalEconomiesEClass = createEClass(NATIONAL_ECONOMIES);
		createEReference(nationalEconomiesEClass, NATIONAL_ECONOMIES__CHILDREN);

		nationEClass = createEClass(NATION);
		createEReference(nationEClass, NATION__FIATCURRENCY);

		fiatCurrencyEClass = createEClass(FIAT_CURRENCY);

		accountantsEClass = createEClass(ACCOUNTANTS);
		createEReference(accountantsEClass, ACCOUNTANTS__CHILDREN);

		accountantEClass = createEClass(ACCOUNTANT);

		identityEClass = createEClass(IDENTITY);
		createEAttribute(identityEClass, IDENTITY__UUID);

		materialEClass = createEClass(MATERIAL);
		createEReference(materialEClass, MATERIAL__BELONGS_TO);

		individualEClass = createEClass(INDIVIDUAL);

		legalEntityEClass = createEClass(LEGAL_ENTITY);

		newEClass17EClass = createEClass(NEW_ECLASS17);

		identitiesEClass = createEClass(IDENTITIES);
		createEReference(identitiesEClass, IDENTITIES__CHILDREN);

		walletEClass = createEClass(WALLET);
		createEAttribute(walletEClass, WALLET__PUBLIC_KEY);
		createEReference(walletEClass, WALLET__BELONGS_TO);

		supplyControlEClass = createEClass(SUPPLY_CONTROL);
		createEReference(supplyControlEClass, SUPPLY_CONTROL__GENESIS);

		walletsEClass = createEClass(WALLETS);
		createEReference(walletsEClass, WALLETS__CHILDREN);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__ASSETS);
		createEReference(transactionEClass, TRANSACTION__FROM);
		createEReference(transactionEClass, TRANSACTION__TO);

		registeredAsstetsEClass = createEClass(REGISTERED_ASSTETS);
		createEReference(registeredAsstetsEClass, REGISTERED_ASSTETS__CHILDREN);

		abstractVaultEClass = createEClass(ABSTRACT_VAULT);
		createEReference(abstractVaultEClass, ABSTRACT_VAULT__ASSETS);

		transactionCollectionEClass = createEClass(TRANSACTION_COLLECTION);

		// Create enums
		assetTypeEEnum = createEEnum(ASSET_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		worldReserveSystemEClass.getESuperTypes().add(this.getIdentity());
		mainVaultEClass.getESuperTypes().add(this.getAbstractVault());
		transferVaultEClass.getESuperTypes().add(this.getAbstractVault());
		materialEClass.getESuperTypes().add(this.getIdentity());
		individualEClass.getESuperTypes().add(this.getIdentity());
		legalEntityEClass.getESuperTypes().add(this.getIdentity());
		walletEClass.getESuperTypes().add(this.getAbstractVault());

		// Initialize classes, features, and operations; add parameters
		initEClass(worldReserveSystemEClass, WorldReserveSystem.class, "WorldReserveSystem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorldReserveSystem_Transfervaults(), this.getTransferVaults(), null, "transfervaults", null,
				1, 1, WorldReserveSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldReserveSystem_Mainvault(), this.getMainVault(), null, "mainvault", null, 1, 1,
				WorldReserveSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldReserveSystem_Identities(), this.getIdentities(), null, "identities", null, 1, 1,
				WorldReserveSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldReserveSystem_Supplycontrol(), this.getSupplyControl(), null, "supplycontrol", null, 1,
				1, WorldReserveSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldReserveSystem_Wallets(), this.getWallets(), null, "wallets", null, 1, 1,
				WorldReserveSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldReserveSystem_Registeredasstets(), this.getRegisteredAsstets(), null,
				"registeredasstets", null, 1, 1, WorldReserveSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainVaultEClass, MainVault.class, "MainVault", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferVaultEClass, TransferVault.class, "TransferVault", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferVaultsEClass, TransferVaults.class, "TransferVaults", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferVaults_Children(), this.getTransferVault(), null, "children", null, 0, -1,
				TransferVaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genesisEClass, Genesis.class, "Genesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenesis_Mainvault(), this.getMainVault(), null, "mainvault", null, 1, 1, Genesis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_AssetType(), this.getAssetType(), "assetType", "UDOLLAR", 0, 1, Asset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Materials(), this.getMaterial(), null, "materials", null, 0, -1, Asset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAsset__Register(), null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(worldEconomyEClass, WorldEconomy.class, "WorldEconomy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorldEconomy_Nationaleconomies(), this.getNationalEconomies(), null, "nationaleconomies",
				null, 1, 1, WorldEconomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationalEconomiesEClass, NationalEconomies.class, "NationalEconomies", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNationalEconomies_Children(), this.getNation(), null, "children", null, 0, -1,
				NationalEconomies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationEClass, Nation.class, "Nation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNation_Fiatcurrency(), this.getFiatCurrency(), null, "fiatcurrency", null, 1, 1, Nation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fiatCurrencyEClass, FiatCurrency.class, "FiatCurrency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountantsEClass, Accountants.class, "Accountants", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountants_Children(), this.getAccountant(), null, "children", null, 0, -1,
				Accountants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountantEClass, Accountant.class, "Accountant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityEClass, Identity.class, "Identity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_UUID(), ecorePackage.getEString(), "UUID", null, 0, 1, Identity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterial_BelongsTo(), this.getIdentity(), null, "belongsTo", null, 0, 1, Material.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(legalEntityEClass, LegalEntity.class, "LegalEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(newEClass17EClass, NewEClass17.class, "NewEClass17", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(identitiesEClass, Identities.class, "Identities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentities_Children(), this.getIdentity(), null, "children", null, 0, -1, Identities.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walletEClass, Wallet.class, "Wallet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWallet_PublicKey(), ecorePackage.getEString(), "publicKey", null, 0, 1, Wallet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_BelongsTo(), this.getIdentity(), null, "belongsTo", null, 0, 1, Wallet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplyControlEClass, SupplyControl.class, "SupplyControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupplyControl_Genesis(), this.getGenesis(), null, "genesis", null, 1, 1, SupplyControl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walletsEClass, Wallets.class, "Wallets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWallets_Children(), this.getWallet(), null, "children", null, 0, -1, Wallets.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Assets(), this.getAsset(), null, "assets", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_From(), this.getAbstractVault(), null, "from", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_To(), this.getAbstractVault(), null, "to", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registeredAsstetsEClass, RegisteredAsstets.class, "RegisteredAsstets", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegisteredAsstets_Children(), this.getAsset(), null, "children", null, 0, -1,
				RegisteredAsstets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractVaultEClass, AbstractVault.class, "AbstractVault", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractVault_Assets(), this.getAsset(), null, "assets", null, 0, -1, AbstractVault.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionCollectionEClass, TransactionCollection.class, "TransactionCollection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(assetTypeEEnum, AssetType.class, "AssetType");
		addEEnumLiteral(assetTypeEEnum, AssetType.GOLD);
		addEEnumLiteral(assetTypeEEnum, AssetType.SILVER);
		addEEnumLiteral(assetTypeEEnum, AssetType.CRYPTO);
		addEEnumLiteral(assetTypeEEnum, AssetType.UDOLLAR);
		addEEnumLiteral(assetTypeEEnum, AssetType.MATERIAL);
		addEEnumLiteral(assetTypeEEnum, AssetType.INTELLECTUAL_PROPERTY);

		// Create resource
		createResource(eNS_URI);
	}

} //WorldreservesystemPackageImpl
