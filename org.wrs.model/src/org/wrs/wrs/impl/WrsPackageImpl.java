/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.wrs.wrs.AbstractVault;
import org.wrs.wrs.Account;
import org.wrs.wrs.Accountant;
import org.wrs.wrs.Accountants;
import org.wrs.wrs.Accounts;
import org.wrs.wrs.Asset;
import org.wrs.wrs.AssetType;
import org.wrs.wrs.FiatCurrency;
import org.wrs.wrs.Genesis;
import org.wrs.wrs.Identities;
import org.wrs.wrs.Identity;
import org.wrs.wrs.Individual;
import org.wrs.wrs.LegalEntity;
import org.wrs.wrs.Material;
import org.wrs.wrs.Nation;
import org.wrs.wrs.NationalEconomies;
import org.wrs.wrs.NetworkEngine;
import org.wrs.wrs.Node;
import org.wrs.wrs.RegisteredAssets;
import org.wrs.wrs.SupplyControl;
import org.wrs.wrs.Transaction;
import org.wrs.wrs.TransactionCollection;
import org.wrs.wrs.TransferVault;
import org.wrs.wrs.TransferVaults;
import org.wrs.wrs.Treasury;
import org.wrs.wrs.WorldEconomy;
import org.wrs.wrs.WrsFactory;
import org.wrs.wrs.WrsPackage;
import org.wrs.wrs.wrs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrsPackageImpl extends EPackageImpl implements WrsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treasuryEClass = null;

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
	private EClass identitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

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
	private EClass accountsEClass = null;

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
	private EClass registeredAssetsEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEngineEClass = null;

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
	 * @see org.wrs.wrs.WrsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WrsPackageImpl() {
		super(eNS_URI, WrsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WrsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WrsPackage init() {
		if (isInited) return (WrsPackage)EPackage.Registry.INSTANCE.getEPackage(WrsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWrsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WrsPackageImpl theWrsPackage = registeredWrsPackage instanceof WrsPackageImpl ? (WrsPackageImpl)registeredWrsPackage : new WrsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWrsPackage.createPackageContents();

		// Initialize created meta-data
		theWrsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWrsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WrsPackage.eNS_URI, theWrsPackage);
		return theWrsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwrs() {
		return wrsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwrs_Transfervaults() {
		return (EReference)wrsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwrs_Mainvault() {
		return (EReference)wrsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwrs_Identities() {
		return (EReference)wrsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwrs_Supplycontrol() {
		return (EReference)wrsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwrs_Wallets() {
		return (EReference)wrsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwrs_Registeredasstets() {
		return (EReference)wrsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwrs__CreateIdentity() {
		return wrsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreasury() {
		return treasuryEClass;
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
		return (EReference)transferVaultsEClass.getEStructuralFeatures().get(0);
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
	public EReference getGenesis_Treasury() {
		return (EReference)genesisEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Materials() {
		return (EReference)assetEClass.getEStructuralFeatures().get(1);
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
		return (EReference)worldEconomyEClass.getEStructuralFeatures().get(0);
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
		return (EReference)nationalEconomiesEClass.getEStructuralFeatures().get(0);
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
		return (EReference)nationEClass.getEStructuralFeatures().get(0);
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
		return (EReference)accountantsEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)identityEClass.getEStructuralFeatures().get(0);
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
		return (EReference)materialEClass.getEStructuralFeatures().get(0);
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
	public EClass getIdentities() {
		return identitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentities_Children() {
		return (EReference)identitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_PublicKey() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_BelongsTo() {
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
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
		return (EReference)supplyControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccounts() {
		return accountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccounts_Children() {
		return (EReference)accountsEClass.getEStructuralFeatures().get(0);
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
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Transactions() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Data() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredAssets() {
		return registeredAssetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredAssets_Children() {
		return (EReference)registeredAssetsEClass.getEStructuralFeatures().get(0);
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
		return (EReference)abstractVaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVault_Transaction() {
		return (EReference)abstractVaultEClass.getEStructuralFeatures().get(1);
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
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Wrs() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Weight() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Networkengine() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkEngine() {
		return networkEngineEClass;
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
	public WrsFactory getWrsFactory() {
		return (WrsFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wrsEClass = createEClass(WRS);
		createEReference(wrsEClass, WRS__TRANSFERVAULTS);
		createEReference(wrsEClass, WRS__MAINVAULT);
		createEReference(wrsEClass, WRS__IDENTITIES);
		createEReference(wrsEClass, WRS__SUPPLYCONTROL);
		createEReference(wrsEClass, WRS__WALLETS);
		createEReference(wrsEClass, WRS__REGISTEREDASSTETS);
		createEOperation(wrsEClass, WRS___CREATE_IDENTITY);

		treasuryEClass = createEClass(TREASURY);

		transferVaultEClass = createEClass(TRANSFER_VAULT);

		transferVaultsEClass = createEClass(TRANSFER_VAULTS);
		createEReference(transferVaultsEClass, TRANSFER_VAULTS__CHILDREN);

		genesisEClass = createEClass(GENESIS);
		createEReference(genesisEClass, GENESIS__TREASURY);

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

		identitiesEClass = createEClass(IDENTITIES);
		createEReference(identitiesEClass, IDENTITIES__CHILDREN);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__PUBLIC_KEY);
		createEReference(accountEClass, ACCOUNT__BELONGS_TO);

		supplyControlEClass = createEClass(SUPPLY_CONTROL);
		createEReference(supplyControlEClass, SUPPLY_CONTROL__GENESIS);

		accountsEClass = createEClass(ACCOUNTS);
		createEReference(accountsEClass, ACCOUNTS__CHILDREN);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__ASSETS);
		createEReference(transactionEClass, TRANSACTION__TRANSACTIONS);
		createEAttribute(transactionEClass, TRANSACTION__DATA);

		registeredAssetsEClass = createEClass(REGISTERED_ASSETS);
		createEReference(registeredAssetsEClass, REGISTERED_ASSETS__CHILDREN);

		abstractVaultEClass = createEClass(ABSTRACT_VAULT);
		createEReference(abstractVaultEClass, ABSTRACT_VAULT__ASSETS);
		createEReference(abstractVaultEClass, ABSTRACT_VAULT__TRANSACTION);

		transactionCollectionEClass = createEClass(TRANSACTION_COLLECTION);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__WRS);
		createEAttribute(nodeEClass, NODE__WEIGHT);
		createEReference(nodeEClass, NODE__NETWORKENGINE);

		networkEngineEClass = createEClass(NETWORK_ENGINE);

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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wrsEClass.getESuperTypes().add(this.getIdentity());
		treasuryEClass.getESuperTypes().add(this.getAbstractVault());
		transferVaultEClass.getESuperTypes().add(this.getAbstractVault());
		materialEClass.getESuperTypes().add(this.getIdentity());
		individualEClass.getESuperTypes().add(this.getIdentity());
		legalEntityEClass.getESuperTypes().add(this.getIdentity());
		accountEClass.getESuperTypes().add(this.getAbstractVault());

		// Initialize classes, features, and operations; add parameters
		initEClass(wrsEClass, wrs.class, "wrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwrs_Transfervaults(), this.getTransferVaults(), null, "transfervaults", null, 1, 1, wrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwrs_Mainvault(), this.getTreasury(), null, "mainvault", null, 1, 1, wrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwrs_Identities(), this.getIdentities(), null, "identities", null, 1, 1, wrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwrs_Supplycontrol(), this.getSupplyControl(), null, "supplycontrol", null, 1, 1, wrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwrs_Wallets(), this.getAccounts(), null, "wallets", null, 1, 1, wrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwrs_Registeredasstets(), this.getRegisteredAssets(), null, "registeredasstets", null, 1, 1, wrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getwrs__CreateIdentity(), null, "createIdentity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(treasuryEClass, Treasury.class, "Treasury", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferVaultEClass, TransferVault.class, "TransferVault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferVaultsEClass, TransferVaults.class, "TransferVaults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferVaults_Children(), this.getTransferVault(), null, "children", null, 0, -1, TransferVaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genesisEClass, Genesis.class, "Genesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenesis_Treasury(), this.getTreasury(), null, "treasury", null, 1, 1, Genesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_AssetType(), this.getAssetType(), "assetType", "UDOLLAR", 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Materials(), this.getMaterial(), null, "materials", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAsset__Register(), null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(worldEconomyEClass, WorldEconomy.class, "WorldEconomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorldEconomy_Nationaleconomies(), this.getNationalEconomies(), null, "nationaleconomies", null, 1, 1, WorldEconomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationalEconomiesEClass, NationalEconomies.class, "NationalEconomies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNationalEconomies_Children(), this.getNation(), null, "children", null, 0, -1, NationalEconomies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationEClass, Nation.class, "Nation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNation_Fiatcurrency(), this.getFiatCurrency(), null, "fiatcurrency", null, 1, 1, Nation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fiatCurrencyEClass, FiatCurrency.class, "FiatCurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountantsEClass, Accountants.class, "Accountants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountants_Children(), this.getAccountant(), null, "children", null, 0, -1, Accountants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountantEClass, Accountant.class, "Accountant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityEClass, Identity.class, "Identity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_UUID(), ecorePackage.getEString(), "UUID", null, 0, 1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterial_BelongsTo(), this.getIdentity(), null, "belongsTo", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(legalEntityEClass, LegalEntity.class, "LegalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identitiesEClass, Identities.class, "Identities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentities_Children(), this.getIdentity(), null, "children", null, 0, -1, Identities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_PublicKey(), ecorePackage.getEString(), "publicKey", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_BelongsTo(), this.getIdentity(), null, "belongsTo", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplyControlEClass, SupplyControl.class, "SupplyControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupplyControl_Genesis(), this.getGenesis(), null, "genesis", null, 1, 1, SupplyControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountsEClass, Accounts.class, "Accounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccounts_Children(), this.getAccount(), null, "children", null, 0, -1, Accounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Assets(), this.getAsset(), null, "assets", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Transactions(), this.getAbstractVault(), null, "transactions", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Data(), ecorePackage.getEString(), "data", "", 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registeredAssetsEClass, RegisteredAssets.class, "RegisteredAssets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegisteredAssets_Children(), this.getAsset(), null, "children", null, 0, -1, RegisteredAssets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractVaultEClass, AbstractVault.class, "AbstractVault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractVault_Assets(), this.getAsset(), null, "assets", null, 0, -1, AbstractVault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVault_Transaction(), this.getTransaction(), null, "transaction", null, 0, 1, AbstractVault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionCollectionEClass, TransactionCollection.class, "TransactionCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Wrs(), this.getwrs(), null, "wrs", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Networkengine(), this.getNetworkEngine(), null, "networkengine", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEngineEClass, NetworkEngine.class, "NetworkEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(assetTypeEEnum, AssetType.class, "AssetType");
		addEEnumLiteral(assetTypeEEnum, AssetType.GOLD);
		addEEnumLiteral(assetTypeEEnum, AssetType.SILVER);
		addEEnumLiteral(assetTypeEEnum, AssetType.CRYPTO);
		addEEnumLiteral(assetTypeEEnum, AssetType.TRUST);
		addEEnumLiteral(assetTypeEEnum, AssetType.PHYSICAL);
		addEEnumLiteral(assetTypeEEnum, AssetType.INTELLECTUAL_PROPERTY);
		addEEnumLiteral(assetTypeEEnum, AssetType.UDOLLAR);

		// Create resource
		createResource(eNS_URI);
	}

} //WrsPackageImpl