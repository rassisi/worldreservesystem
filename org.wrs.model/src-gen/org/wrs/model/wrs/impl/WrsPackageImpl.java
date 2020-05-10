/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.AbstractTransaction;
import org.wrs.model.wrs.AccountType;
import org.wrs.model.wrs.Accounts;
import org.wrs.model.wrs.AllTransactionConditions;
import org.wrs.model.wrs.AllTransactions;
import org.wrs.model.wrs.Asset;
import org.wrs.model.wrs.AssetType;
import org.wrs.model.wrs.BusinessAccount;
import org.wrs.model.wrs.Countries;
import org.wrs.model.wrs.Country;
import org.wrs.model.wrs.CountryRegion;
import org.wrs.model.wrs.FiatCurrency;
import org.wrs.model.wrs.GenesisAccount;
import org.wrs.model.wrs.HumanEntity;
import org.wrs.model.wrs.Identities;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.Individual;
import org.wrs.model.wrs.InputValueType;
import org.wrs.model.wrs.Layoutable;
import org.wrs.model.wrs.LayoutableContainer;
import org.wrs.model.wrs.LegalEntity;
import org.wrs.model.wrs.LegalEntityType;
import org.wrs.model.wrs.NationalEconomy;
import org.wrs.model.wrs.NetworkEngine;
import org.wrs.model.wrs.Node;
import org.wrs.model.wrs.NodeAccount;
import org.wrs.model.wrs.Nodes;
import org.wrs.model.wrs.PrivateAccount;
import org.wrs.model.wrs.RegionIdentities;
import org.wrs.model.wrs.RegisteredAssets;
import org.wrs.model.wrs.SignedInput;
import org.wrs.model.wrs.StatisticDatas;
import org.wrs.model.wrs.Statistics;
import org.wrs.model.wrs.StatisticsSource;
import org.wrs.model.wrs.SupplyControl;
import org.wrs.model.wrs.Thing;
import org.wrs.model.wrs.ThingAccount;
import org.wrs.model.wrs.Transaction;
import org.wrs.model.wrs.TransactionCollection;
import org.wrs.model.wrs.TransactionCondition;
import org.wrs.model.wrs.Transactions;
import org.wrs.model.wrs.TransferVault;
import org.wrs.model.wrs.TransferVaults;
import org.wrs.model.wrs.Treasury;
import org.wrs.model.wrs.WorldEconomy;
import org.wrs.model.wrs.WrsFactory;
import org.wrs.model.wrs.WrsPackage;
import org.wrs.model.wrs.regionalEconomy;

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
	private EClass genesisAccountEClass = null;

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
	private EClass nationalEconomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

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
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

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
	private EClass privateAccountEClass = null;

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
	private EClass abstractAccountEClass = null;

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
	private EClass countriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesEClass = null;

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
	private EClass allTransactionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionIdentitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutableContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allTransactionConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticDatasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticsSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalEconomyEClass = null;

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
	private EEnum assetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legalEntityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accountTypeEEnum = null;

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
	 * @see org.wrs.model.wrs.WrsPackage#eNS_URI
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
		if (isInited)
			return (WrsPackage) EPackage.Registry.INSTANCE.getEPackage(WrsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWrsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WrsPackageImpl theWrsPackage = registeredWrsPackage instanceof WrsPackageImpl
				? (WrsPackageImpl) registeredWrsPackage
				: new WrsPackageImpl();

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
	@Override
	public EClass getWRS() {
		return wrsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Mainvault() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Supplycontrol() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_AllAccounts() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Registeredasstets() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Worldeconomy() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Nodes() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Alldentities() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_AllTransactions() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_AllTransactionConditions() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_Transfervaults() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWRS_GenesisAccount() {
		return (EReference) wrsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWRS__CreateIdentity() {
		return wrsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreasury() {
		return treasuryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferVault() {
		return transferVaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenesisAccount() {
		return genesisAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_AssetType() {
		return (EAttribute) assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Materials() {
		return (EReference) assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsset__Register() {
		return assetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorldEconomy() {
		return worldEconomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorldEconomy_Nationaleconomies() {
		return (EReference) worldEconomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorldEconomy_Statisticssource() {
		return (EReference) worldEconomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorldEconomy_StatisticDatas() {
		return (EReference) worldEconomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorldEconomy_Countries() {
		return (EReference) worldEconomyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNationalEconomy() {
		return nationalEconomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_Fiatcurrency() {
		return (EReference) countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_Nationaleconomy() {
		return (EReference) countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountry_Regions() {
		return (EReference) countryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiatCurrency() {
		return fiatCurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentity_UUID() {
		return (EAttribute) identityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentity_AllNodes() {
		return (EReference) identityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_BelongsTo() {
		return (EReference) thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_ThingAccounts() {
		return (EReference) thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividual_WorksFor() {
		return (EReference) individualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividual_LegalPartnerOf() {
		return (EReference) individualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividual_PrivateAccounts() {
		return (EReference) individualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegalEntity() {
		return legalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegalEntity_Type() {
		return (EAttribute) legalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalEntity_Accounts() {
		return (EReference) legalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegalEntity_BusinessAccounts() {
		return (EReference) legalEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateAccount() {
		return privateAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplyControl() {
		return supplyControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupplyControl_GenesisAccount() {
		return (EReference) supplyControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupplyControl_TransferVaults() {
		return (EReference) supplyControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupplyControl_Treasury() {
		return (EReference) supplyControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccounts() {
		return accountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccounts_Children() {
		return (EReference) accountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransaction_Assets() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_Data() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_NanoTime() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransaction_Amount() {
		return (EAttribute) transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransaction_Transactioncondition() {
		return (EReference) transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegisteredAssets() {
		return registeredAssetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegisteredAssets_Children() {
		return (EReference) registeredAssetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractAccount() {
		return abstractAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractAccount_Assets() {
		return (EReference) abstractAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractAccount_Transaction() {
		return (EReference) abstractAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractAccount_Transactions() {
		return (EReference) abstractAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionCollection() {
		return transactionCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionCollection_Transactions() {
		return (EReference) transactionCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Weight() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Networkengine() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_NodeAccounts() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkEngine() {
		return networkEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountries() {
		return countriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountries_Children() {
		return (EReference) countriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodes() {
		return nodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodes_Children() {
		return (EReference) nodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentities() {
		return identitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentities_Children() {
		return (EReference) identitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllTransactions() {
		return allTransactionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllTransactions_Children() {
		return (EReference) allTransactionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactions() {
		return transactionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactions_Children() {
		return (EReference) transactionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionIdentities() {
		return regionIdentitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegionIdentities_Children() {
		return (EReference) regionIdentitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayoutableContainer() {
		return layoutableContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessAccount() {
		return businessAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThingAccount() {
		return thingAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTransaction() {
		return abstractTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeAccount() {
		return nodeAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllTransactionConditions() {
		return allTransactionConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllTransactionConditions_Children() {
		return (EReference) allTransactionConditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionCondition() {
		return transactionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionCondition_Formula() {
		return (EAttribute) transactionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionCondition_SignedInputs() {
		return (EReference) transactionConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignedInput() {
		return signedInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignedInput_VariableName() {
		return (EAttribute) signedInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignedInput_Identity() {
		return (EReference) signedInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignedInput_Value() {
		return (EAttribute) signedInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignedInput_Type() {
		return (EAttribute) signedInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatistics() {
		return statisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatistics_Statisticssource() {
		return (EReference) statisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticDatas() {
		return statisticDatasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatisticDatas_Children() {
		return (EReference) statisticDatasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountryRegion() {
		return countryRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountryRegion_Regionaleconomy() {
		return (EReference) countryRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountryRegion_Regionidentities() {
		return (EReference) countryRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatisticsSource() {
		return statisticsSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatisticsSource_WebserviceUrl() {
		return (EAttribute) statisticsSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHumanEntity() {
		return humanEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanEntity_Worldeconomy() {
		return (EReference) humanEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayoutable() {
		return layoutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayoutable_X() {
		return (EAttribute) layoutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayoutable_Y() {
		return (EAttribute) layoutableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayoutable_W() {
		return (EAttribute) layoutableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayoutable_H() {
		return (EAttribute) layoutableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayoutable_Name() {
		return (EAttribute) layoutableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayoutable_Id() {
		return (EAttribute) layoutableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getregionalEconomy() {
		return regionalEconomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferVaults() {
		return transferVaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferVaults_Children() {
		return (EReference) transferVaultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetType() {
		return assetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLegalEntityType() {
		return legalEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInputValueType() {
		return inputValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccountType() {
		return accountTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WrsFactory getWrsFactory() {
		return (WrsFactory) getEFactoryInstance();
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
		wrsEClass = createEClass(WRS);
		createEReference(wrsEClass, WRS__MAINVAULT);
		createEReference(wrsEClass, WRS__SUPPLYCONTROL);
		createEReference(wrsEClass, WRS__ALL_ACCOUNTS);
		createEReference(wrsEClass, WRS__REGISTEREDASSTETS);
		createEReference(wrsEClass, WRS__WORLDECONOMY);
		createEReference(wrsEClass, WRS__NODES);
		createEReference(wrsEClass, WRS__ALLDENTITIES);
		createEReference(wrsEClass, WRS__ALL_TRANSACTIONS);
		createEReference(wrsEClass, WRS__ALL_TRANSACTION_CONDITIONS);
		createEReference(wrsEClass, WRS__TRANSFERVAULTS);
		createEReference(wrsEClass, WRS__GENESIS_ACCOUNT);
		createEOperation(wrsEClass, WRS___CREATE_IDENTITY);

		treasuryEClass = createEClass(TREASURY);

		transferVaultEClass = createEClass(TRANSFER_VAULT);

		genesisAccountEClass = createEClass(GENESIS_ACCOUNT);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ASSET_TYPE);
		createEReference(assetEClass, ASSET__MATERIALS);
		createEOperation(assetEClass, ASSET___REGISTER);

		worldEconomyEClass = createEClass(WORLD_ECONOMY);
		createEReference(worldEconomyEClass, WORLD_ECONOMY__NATIONALECONOMIES);
		createEReference(worldEconomyEClass, WORLD_ECONOMY__STATISTICSSOURCE);
		createEReference(worldEconomyEClass, WORLD_ECONOMY__STATISTIC_DATAS);
		createEReference(worldEconomyEClass, WORLD_ECONOMY__COUNTRIES);

		nationalEconomyEClass = createEClass(NATIONAL_ECONOMY);

		countryEClass = createEClass(COUNTRY);
		createEReference(countryEClass, COUNTRY__FIATCURRENCY);
		createEReference(countryEClass, COUNTRY__NATIONALECONOMY);
		createEReference(countryEClass, COUNTRY__REGIONS);

		fiatCurrencyEClass = createEClass(FIAT_CURRENCY);

		identityEClass = createEClass(IDENTITY);
		createEAttribute(identityEClass, IDENTITY__UUID);
		createEReference(identityEClass, IDENTITY__ALL_NODES);

		thingEClass = createEClass(THING);
		createEReference(thingEClass, THING__BELONGS_TO);
		createEReference(thingEClass, THING__THING_ACCOUNTS);

		individualEClass = createEClass(INDIVIDUAL);
		createEReference(individualEClass, INDIVIDUAL__WORKS_FOR);
		createEReference(individualEClass, INDIVIDUAL__LEGAL_PARTNER_OF);
		createEReference(individualEClass, INDIVIDUAL__PRIVATE_ACCOUNTS);

		legalEntityEClass = createEClass(LEGAL_ENTITY);
		createEAttribute(legalEntityEClass, LEGAL_ENTITY__TYPE);
		createEReference(legalEntityEClass, LEGAL_ENTITY__ACCOUNTS);
		createEReference(legalEntityEClass, LEGAL_ENTITY__BUSINESS_ACCOUNTS);

		privateAccountEClass = createEClass(PRIVATE_ACCOUNT);

		supplyControlEClass = createEClass(SUPPLY_CONTROL);
		createEReference(supplyControlEClass, SUPPLY_CONTROL__GENESIS_ACCOUNT);
		createEReference(supplyControlEClass, SUPPLY_CONTROL__TRANSFER_VAULTS);
		createEReference(supplyControlEClass, SUPPLY_CONTROL__TREASURY);

		accountsEClass = createEClass(ACCOUNTS);
		createEReference(accountsEClass, ACCOUNTS__CHILDREN);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__ASSETS);
		createEAttribute(transactionEClass, TRANSACTION__DATA);
		createEAttribute(transactionEClass, TRANSACTION__NANO_TIME);
		createEAttribute(transactionEClass, TRANSACTION__AMOUNT);
		createEReference(transactionEClass, TRANSACTION__TRANSACTIONCONDITION);

		registeredAssetsEClass = createEClass(REGISTERED_ASSETS);
		createEReference(registeredAssetsEClass, REGISTERED_ASSETS__CHILDREN);

		abstractAccountEClass = createEClass(ABSTRACT_ACCOUNT);
		createEReference(abstractAccountEClass, ABSTRACT_ACCOUNT__ASSETS);
		createEReference(abstractAccountEClass, ABSTRACT_ACCOUNT__TRANSACTION);
		createEReference(abstractAccountEClass, ABSTRACT_ACCOUNT__TRANSACTIONS);

		transactionCollectionEClass = createEClass(TRANSACTION_COLLECTION);
		createEReference(transactionCollectionEClass, TRANSACTION_COLLECTION__TRANSACTIONS);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__WEIGHT);
		createEReference(nodeEClass, NODE__NETWORKENGINE);
		createEReference(nodeEClass, NODE__NODE_ACCOUNTS);

		networkEngineEClass = createEClass(NETWORK_ENGINE);

		countriesEClass = createEClass(COUNTRIES);
		createEReference(countriesEClass, COUNTRIES__CHILDREN);

		nodesEClass = createEClass(NODES);
		createEReference(nodesEClass, NODES__CHILDREN);

		identitiesEClass = createEClass(IDENTITIES);
		createEReference(identitiesEClass, IDENTITIES__CHILDREN);

		allTransactionsEClass = createEClass(ALL_TRANSACTIONS);
		createEReference(allTransactionsEClass, ALL_TRANSACTIONS__CHILDREN);

		abstractTransactionEClass = createEClass(ABSTRACT_TRANSACTION);

		nodeAccountEClass = createEClass(NODE_ACCOUNT);

		allTransactionConditionsEClass = createEClass(ALL_TRANSACTION_CONDITIONS);
		createEReference(allTransactionConditionsEClass, ALL_TRANSACTION_CONDITIONS__CHILDREN);

		transactionConditionEClass = createEClass(TRANSACTION_CONDITION);
		createEAttribute(transactionConditionEClass, TRANSACTION_CONDITION__FORMULA);
		createEReference(transactionConditionEClass, TRANSACTION_CONDITION__SIGNED_INPUTS);

		signedInputEClass = createEClass(SIGNED_INPUT);
		createEAttribute(signedInputEClass, SIGNED_INPUT__VARIABLE_NAME);
		createEReference(signedInputEClass, SIGNED_INPUT__IDENTITY);
		createEAttribute(signedInputEClass, SIGNED_INPUT__VALUE);
		createEAttribute(signedInputEClass, SIGNED_INPUT__TYPE);

		statisticsEClass = createEClass(STATISTICS);
		createEReference(statisticsEClass, STATISTICS__STATISTICSSOURCE);

		statisticDatasEClass = createEClass(STATISTIC_DATAS);
		createEReference(statisticDatasEClass, STATISTIC_DATAS__CHILDREN);

		countryRegionEClass = createEClass(COUNTRY_REGION);
		createEReference(countryRegionEClass, COUNTRY_REGION__REGIONALECONOMY);
		createEReference(countryRegionEClass, COUNTRY_REGION__REGIONIDENTITIES);

		statisticsSourceEClass = createEClass(STATISTICS_SOURCE);
		createEAttribute(statisticsSourceEClass, STATISTICS_SOURCE__WEBSERVICE_URL);

		humanEntityEClass = createEClass(HUMAN_ENTITY);
		createEReference(humanEntityEClass, HUMAN_ENTITY__WORLDECONOMY);

		layoutableEClass = createEClass(LAYOUTABLE);
		createEAttribute(layoutableEClass, LAYOUTABLE__X);
		createEAttribute(layoutableEClass, LAYOUTABLE__Y);
		createEAttribute(layoutableEClass, LAYOUTABLE__W);
		createEAttribute(layoutableEClass, LAYOUTABLE__H);
		createEAttribute(layoutableEClass, LAYOUTABLE__NAME);
		createEAttribute(layoutableEClass, LAYOUTABLE__ID);

		regionalEconomyEClass = createEClass(REGIONAL_ECONOMY);

		transferVaultsEClass = createEClass(TRANSFER_VAULTS);
		createEReference(transferVaultsEClass, TRANSFER_VAULTS__CHILDREN);

		transactionsEClass = createEClass(TRANSACTIONS);
		createEReference(transactionsEClass, TRANSACTIONS__CHILDREN);

		regionIdentitiesEClass = createEClass(REGION_IDENTITIES);
		createEReference(regionIdentitiesEClass, REGION_IDENTITIES__CHILDREN);

		layoutableContainerEClass = createEClass(LAYOUTABLE_CONTAINER);

		businessAccountEClass = createEClass(BUSINESS_ACCOUNT);

		thingAccountEClass = createEClass(THING_ACCOUNT);

		// Create enums
		assetTypeEEnum = createEEnum(ASSET_TYPE);
		legalEntityTypeEEnum = createEEnum(LEGAL_ENTITY_TYPE);
		inputValueTypeEEnum = createEEnum(INPUT_VALUE_TYPE);
		accountTypeEEnum = createEEnum(ACCOUNT_TYPE);
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
		wrsEClass.getESuperTypes().add(this.getLayoutable());
		treasuryEClass.getESuperTypes().add(this.getAbstractAccount());
		transferVaultEClass.getESuperTypes().add(this.getAbstractAccount());
		genesisAccountEClass.getESuperTypes().add(this.getAbstractAccount());
		assetEClass.getESuperTypes().add(this.getLayoutable());
		worldEconomyEClass.getESuperTypes().add(this.getLayoutable());
		nationalEconomyEClass.getESuperTypes().add(this.getLayoutable());
		countryEClass.getESuperTypes().add(this.getLayoutable());
		fiatCurrencyEClass.getESuperTypes().add(this.getLayoutable());
		identityEClass.getESuperTypes().add(this.getLayoutable());
		thingEClass.getESuperTypes().add(this.getIdentity());
		individualEClass.getESuperTypes().add(this.getHumanEntity());
		legalEntityEClass.getESuperTypes().add(this.getHumanEntity());
		privateAccountEClass.getESuperTypes().add(this.getAbstractAccount());
		supplyControlEClass.getESuperTypes().add(this.getLayoutable());
		accountsEClass.getESuperTypes().add(this.getLayoutableContainer());
		transactionEClass.getESuperTypes().add(this.getAbstractTransaction());
		registeredAssetsEClass.getESuperTypes().add(this.getLayoutableContainer());
		abstractAccountEClass.getESuperTypes().add(this.getLayoutable());
		transactionCollectionEClass.getESuperTypes().add(this.getAbstractTransaction());
		nodeEClass.getESuperTypes().add(this.getLayoutable());
		networkEngineEClass.getESuperTypes().add(this.getLayoutable());
		countriesEClass.getESuperTypes().add(this.getLayoutableContainer());
		nodesEClass.getESuperTypes().add(this.getLayoutableContainer());
		identitiesEClass.getESuperTypes().add(this.getLayoutableContainer());
		allTransactionsEClass.getESuperTypes().add(this.getLayoutableContainer());
		abstractTransactionEClass.getESuperTypes().add(this.getLayoutable());
		nodeAccountEClass.getESuperTypes().add(this.getAbstractAccount());
		allTransactionConditionsEClass.getESuperTypes().add(this.getLayoutableContainer());
		transactionConditionEClass.getESuperTypes().add(this.getLayoutable());
		signedInputEClass.getESuperTypes().add(this.getLayoutable());
		statisticsEClass.getESuperTypes().add(this.getLayoutable());
		statisticDatasEClass.getESuperTypes().add(this.getLayoutableContainer());
		countryRegionEClass.getESuperTypes().add(this.getLayoutable());
		statisticsSourceEClass.getESuperTypes().add(this.getLayoutable());
		humanEntityEClass.getESuperTypes().add(this.getIdentity());
		regionalEconomyEClass.getESuperTypes().add(this.getLayoutable());
		transferVaultsEClass.getESuperTypes().add(this.getLayoutableContainer());
		transactionsEClass.getESuperTypes().add(this.getLayoutableContainer());
		regionIdentitiesEClass.getESuperTypes().add(this.getLayoutableContainer());
		layoutableContainerEClass.getESuperTypes().add(this.getLayoutable());
		businessAccountEClass.getESuperTypes().add(this.getAbstractAccount());

		// Initialize classes, features, and operations; add parameters
		initEClass(wrsEClass, org.wrs.model.wrs.WRS.class, "WRS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWRS_Mainvault(), this.getTreasury(), null, "mainvault", null, 1, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_Supplycontrol(), this.getSupplyControl(), null, "supplycontrol", null, 1, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_AllAccounts(), this.getAccounts(), null, "allAccounts", null, 1, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_Registeredasstets(), this.getRegisteredAssets(), null, "registeredasstets", null, 1, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_Worldeconomy(), this.getWorldEconomy(), null, "worldeconomy", null, 0, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_Nodes(), this.getNodes(), null, "nodes", null, 0, 1, org.wrs.model.wrs.WRS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_Alldentities(), this.getIdentities(), null, "Alldentities", null, 0, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_AllTransactions(), this.getAllTransactions(), null, "AllTransactions", null, 0, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_AllTransactionConditions(), this.getAllTransactionConditions(), null,
				"AllTransactionConditions", null, 0, 1, org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_Transfervaults(), this.getTransferVaults(), null, "transfervaults", null, 0, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWRS_GenesisAccount(), this.getGenesisAccount(), null, "genesisAccount", null, 0, 1,
				org.wrs.model.wrs.WRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWRS__CreateIdentity(), null, "createIdentity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(treasuryEClass, Treasury.class, "Treasury", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferVaultEClass, TransferVault.class, "TransferVault", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(genesisAccountEClass, GenesisAccount.class, "GenesisAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_AssetType(), this.getAssetType(), "assetType", "UDOLLAR", 0, 1, Asset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Materials(), this.getThing(), null, "materials", null, 0, -1, Asset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAsset__Register(), null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(worldEconomyEClass, WorldEconomy.class, "WorldEconomy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorldEconomy_Nationaleconomies(), this.getNationalEconomy(), null, "nationaleconomies", null,
				1, -1, WorldEconomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldEconomy_Statisticssource(), this.getStatisticsSource(), null, "statisticssource", null,
				0, 1, WorldEconomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldEconomy_StatisticDatas(), this.getStatisticDatas(), null, "statisticDatas", null, 0, 1,
				WorldEconomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorldEconomy_Countries(), this.getCountries(), null, "countries", null, 0, 1,
				WorldEconomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationalEconomyEClass, NationalEconomy.class, "NationalEconomy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountry_Fiatcurrency(), this.getFiatCurrency(), null, "fiatcurrency", null, 1, 1,
				Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_Nationaleconomy(), this.getNationalEconomy(), null, "nationaleconomy", null, 0, 1,
				Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_Regions(), this.getCountryRegion(), null, "regions", null, 0, -1, Country.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fiatCurrencyEClass, FiatCurrency.class, "FiatCurrency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityEClass, Identity.class, "Identity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_UUID(), ecorePackage.getEString(), "UUID", null, 0, 1, Identity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentity_AllNodes(), this.getNodes(), null, "AllNodes", null, 0, 1, Identity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThing_BelongsTo(), this.getIdentity(), null, "belongsTo", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_ThingAccounts(), this.getThingAccount(), null, "thingAccounts", null, 0, -1,
				Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividual_WorksFor(), this.getLegalEntity(), null, "worksFor", null, 0, -1, Individual.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_LegalPartnerOf(), this.getIndividual(), null, "legalPartnerOf", null, 0, -1,
				Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_PrivateAccounts(), this.getPrivateAccount(), null, "privateAccounts", null, 0, -1,
				Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legalEntityEClass, LegalEntity.class, "LegalEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalEntity_Type(), this.getLegalEntityType(), "type", null, 0, 1, LegalEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalEntity_Accounts(), this.getAbstractAccount(), null, "accounts", null, 0, -1,
				LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalEntity_BusinessAccounts(), this.getBusinessAccount(), null, "businessAccounts", null, 0,
				-1, LegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateAccountEClass, PrivateAccount.class, "PrivateAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(supplyControlEClass, SupplyControl.class, "SupplyControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupplyControl_GenesisAccount(), this.getGenesisAccount(), null, "genesisAccount", null, 0, 1,
				SupplyControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplyControl_TransferVaults(), this.getTransferVaults(), null, "transferVaults", null, 0, 1,
				SupplyControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplyControl_Treasury(), this.getTreasury(), null, "treasury", null, 0, 1,
				SupplyControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountsEClass, Accounts.class, "Accounts", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccounts_Children(), this.getAbstractAccount(), null, "children", null, 0, -1, Accounts.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Assets(), this.getAsset(), null, "assets", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Data(), ecorePackage.getEString(), "data", "", 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_NanoTime(), ecorePackage.getEDouble(), "nanoTime", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, Transaction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Transactioncondition(), this.getTransactionCondition(), null,
				"transactioncondition", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registeredAssetsEClass, RegisteredAssets.class, "RegisteredAssets", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegisteredAssets_Children(), this.getAsset(), null, "children", null, 0, -1,
				RegisteredAssets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAccountEClass, AbstractAccount.class, "AbstractAccount", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAccount_Assets(), this.getAsset(), null, "assets", null, 0, -1, AbstractAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAccount_Transaction(), this.getTransaction(), null, "transaction", null, 0, -1,
				AbstractAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAccount_Transactions(), this.getTransactions(), null, "transactions", null, 0, 1,
				AbstractAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionCollectionEClass, TransactionCollection.class, "TransactionCollection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionCollection_Transactions(), this.getTransaction(), null, "transactions", null, 0,
				-1, TransactionCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Networkengine(), this.getNetworkEngine(), null, "networkengine", null, 1, 1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_NodeAccounts(), this.getNodeAccount(), null, "nodeAccounts", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEngineEClass, NetworkEngine.class, "NetworkEngine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(countriesEClass, Countries.class, "Countries", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountries_Children(), this.getCountry(), null, "children", null, 0, -1, Countries.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesEClass, Nodes.class, "Nodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodes_Children(), this.getNode(), null, "children", null, 0, -1, Nodes.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(identitiesEClass, Identities.class, "Identities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentities_Children(), this.getIdentity(), null, "children", null, 0, -1, Identities.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allTransactionsEClass, AllTransactions.class, "AllTransactions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllTransactions_Children(), this.getAbstractTransaction(), null, "children", null, 0, -1,
				AllTransactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTransactionEClass, AbstractTransaction.class, "AbstractTransaction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeAccountEClass, NodeAccount.class, "NodeAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(allTransactionConditionsEClass, AllTransactionConditions.class, "AllTransactionConditions",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllTransactionConditions_Children(), this.getTransactionCondition(), null, "children", null,
				0, -1, AllTransactionConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionConditionEClass, TransactionCondition.class, "TransactionCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionCondition_Formula(), ecorePackage.getEString(), "formula", null, 0, 1,
				TransactionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionCondition_SignedInputs(), this.getSignedInput(), null, "signedInputs", null, 0, -1,
				TransactionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signedInputEClass, SignedInput.class, "SignedInput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignedInput_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1,
				SignedInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInput_Identity(), this.getIdentity(), null, "identity", null, 0, 1, SignedInput.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignedInput_Value(), ecorePackage.getEString(), "value", null, 0, 1, SignedInput.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignedInput_Type(), this.getInputValueType(), "type", null, 0, 1, SignedInput.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticsEClass, Statistics.class, "Statistics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatistics_Statisticssource(), this.getStatisticsSource(), null, "statisticssource", null, 0,
				1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticDatasEClass, StatisticDatas.class, "StatisticDatas", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatisticDatas_Children(), this.getStatistics(), null, "children", null, 0, -1,
				StatisticDatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryRegionEClass, CountryRegion.class, "CountryRegion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountryRegion_Regionaleconomy(), this.getregionalEconomy(), null, "regionaleconomy", null, 0,
				1, CountryRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountryRegion_Regionidentities(), this.getRegionIdentities(), null, "regionidentities", null,
				0, 1, CountryRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticsSourceEClass, StatisticsSource.class, "StatisticsSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatisticsSource_WebserviceUrl(), ecorePackage.getEString(), "webserviceUrl", null, 0, 1,
				StatisticsSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(humanEntityEClass, HumanEntity.class, "HumanEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanEntity_Worldeconomy(), this.getWorldEconomy(), null, "worldeconomy", null, 0, 1,
				HumanEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutableEClass, Layoutable.class, "Layoutable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutable_X(), ecorePackage.getEString(), "x", null, 0, 1, Layoutable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutable_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Layoutable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutable_W(), ecorePackage.getEDouble(), "w", null, 0, 1, Layoutable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutable_H(), ecorePackage.getEDouble(), "h", null, 0, 1, Layoutable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layoutable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Layoutable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalEconomyEClass, regionalEconomy.class, "regionalEconomy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferVaultsEClass, TransferVaults.class, "TransferVaults", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferVaults_Children(), this.getTransferVault(), null, "children", null, 0, -1,
				TransferVaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionsEClass, Transactions.class, "Transactions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactions_Children(), this.getAbstractTransaction(), null, "children", null, 0, -1,
				Transactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionIdentitiesEClass, RegionIdentities.class, "RegionIdentities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionIdentities_Children(), this.getIdentity(), null, "children", null, 0, -1,
				RegionIdentities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutableContainerEClass, LayoutableContainer.class, "LayoutableContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessAccountEClass, BusinessAccount.class, "BusinessAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingAccountEClass, ThingAccount.class, "ThingAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(assetTypeEEnum, AssetType.class, "AssetType");
		addEEnumLiteral(assetTypeEEnum, AssetType.GOLD);
		addEEnumLiteral(assetTypeEEnum, AssetType.SILVER);
		addEEnumLiteral(assetTypeEEnum, AssetType.CRYPTO);
		addEEnumLiteral(assetTypeEEnum, AssetType.TERRA);
		addEEnumLiteral(assetTypeEEnum, AssetType.PHYSICAL);
		addEEnumLiteral(assetTypeEEnum, AssetType.INTELLECTUAL_PROPERTY);
		addEEnumLiteral(assetTypeEEnum, AssetType.UDOLLAR);

		initEEnum(legalEntityTypeEEnum, LegalEntityType.class, "LegalEntityType");
		addEEnumLiteral(legalEntityTypeEEnum, LegalEntityType.COMPANY);
		addEEnumLiteral(legalEntityTypeEEnum, LegalEntityType.ACCOUNTANT);
		addEEnumLiteral(legalEntityTypeEEnum, LegalEntityType.CHARITY);

		initEEnum(inputValueTypeEEnum, InputValueType.class, "InputValueType");
		addEEnumLiteral(inputValueTypeEEnum, InputValueType.DATE);
		addEEnumLiteral(inputValueTypeEEnum, InputValueType.NUMBER);
		addEEnumLiteral(inputValueTypeEEnum, InputValueType.BOOLEAN);
		addEEnumLiteral(inputValueTypeEEnum, InputValueType.TEXT);

		initEEnum(accountTypeEEnum, AccountType.class, "AccountType");
		addEEnumLiteral(accountTypeEEnum, AccountType.PRIVATE);
		addEEnumLiteral(accountTypeEEnum, AccountType.BUSINESS);

		// Create resource
		createResource(eNS_URI);
	}

} //WrsPackageImpl
