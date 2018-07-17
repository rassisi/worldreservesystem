/**
 */
package org.wrs.wrs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wrs.wrs.WrsFactory
 * @model kind="package"
 * @generated
 */
public interface WrsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wrs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.wrs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.wrs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrsPackage eINSTANCE = org.wrs.wrs.impl.WrsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.IdentityImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__UUID = 0;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.wrsImpl <em>wrs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.wrsImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getwrs()
	 * @generated
	 */
	int WRS = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Transfervaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__TRANSFERVAULTS = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mainvault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__MAINVAULT = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__IDENTITIES = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supplycontrol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__SUPPLYCONTROL = IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wallets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__WALLETS = IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Registeredasstets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__REGISTEREDASSTETS = IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>wrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS___CREATE_IDENTITY = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>wrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.AbstractVaultImpl <em>Abstract Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.AbstractVaultImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAbstractVault()
	 * @generated
	 */
	int ABSTRACT_VAULT = 22;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT__ASSETS = 0;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT__TRANSACTION = 1;

	/**
	 * The number of structural features of the '<em>Abstract Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.TreasuryImpl <em>Treasury</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.TreasuryImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getTreasury()
	 * @generated
	 */
	int TREASURY = 1;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__ASSETS = ABSTRACT_VAULT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__TRANSACTION = ABSTRACT_VAULT__TRANSACTION;

	/**
	 * The number of structural features of the '<em>Treasury</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY_FEATURE_COUNT = ABSTRACT_VAULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Treasury</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY_OPERATION_COUNT = ABSTRACT_VAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.TransferVaultImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransferVault()
	 * @generated
	 */
	int TRANSFER_VAULT = 2;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__ASSETS = ABSTRACT_VAULT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__TRANSACTION = ABSTRACT_VAULT__TRANSACTION;

	/**
	 * The number of structural features of the '<em>Transfer Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT_FEATURE_COUNT = ABSTRACT_VAULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transfer Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT_OPERATION_COUNT = ABSTRACT_VAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.TransferVaultsImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransferVaults()
	 * @generated
	 */
	int TRANSFER_VAULTS = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Transfer Vaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transfer Vaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.GenesisImpl <em>Genesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.GenesisImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getGenesis()
	 * @generated
	 */
	int GENESIS = 4;

	/**
	 * The feature id for the '<em><b>Treasury</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS__TREASURY = 0;

	/**
	 * The number of structural features of the '<em>Genesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Genesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.AssetImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 5;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MATERIALS = 1;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___REGISTER = 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.WorldEconomyImpl <em>World Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.WorldEconomyImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getWorldEconomy()
	 * @generated
	 */
	int WORLD_ECONOMY = 6;

	/**
	 * The feature id for the '<em><b>Nationaleconomies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__NATIONALECONOMIES = 0;

	/**
	 * The number of structural features of the '<em>World Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>World Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.NationalEconomiesImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getNationalEconomies()
	 * @generated
	 */
	int NATIONAL_ECONOMIES = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMIES__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>National Economies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>National Economies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.NationImpl <em>Nation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.NationImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getNation()
	 * @generated
	 */
	int NATION = 8;

	/**
	 * The feature id for the '<em><b>Fiatcurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION__FIATCURRENCY = 0;

	/**
	 * The number of structural features of the '<em>Nation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.FiatCurrencyImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getFiatCurrency()
	 * @generated
	 */
	int FIAT_CURRENCY = 9;

	/**
	 * The number of structural features of the '<em>Fiat Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fiat Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.AccountantsImpl <em>Accountants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.AccountantsImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccountants()
	 * @generated
	 */
	int ACCOUNTANTS = 10;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTANTS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Accountants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTANTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accountants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTANTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.AccountantImpl <em>Accountant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.AccountantImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccountant()
	 * @generated
	 */
	int ACCOUNTANT = 11;

	/**
	 * The number of structural features of the '<em>Accountant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTANT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Accountant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.MaterialImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__BELONGS_TO = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.IndividualImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__UUID = IDENTITY__UUID;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.LegalEntityImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getLegalEntity()
	 * @generated
	 */
	int LEGAL_ENTITY = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__UUID = IDENTITY__UUID;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.IdentitiesImpl <em>Identities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.IdentitiesImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getIdentities()
	 * @generated
	 */
	int IDENTITIES = 16;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Identities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.AccountImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 17;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ASSETS = ABSTRACT_VAULT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TRANSACTION = ABSTRACT_VAULT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PUBLIC_KEY = ABSTRACT_VAULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BELONGS_TO = ABSTRACT_VAULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = ABSTRACT_VAULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = ABSTRACT_VAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.SupplyControlImpl <em>Supply Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.SupplyControlImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getSupplyControl()
	 * @generated
	 */
	int SUPPLY_CONTROL = 18;

	/**
	 * The feature id for the '<em><b>Genesis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__GENESIS = 0;

	/**
	 * The number of structural features of the '<em>Supply Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supply Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.AccountsImpl <em>Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.AccountsImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccounts()
	 * @generated
	 */
	int ACCOUNTS = 19;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.TransactionImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 20;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ASSETS = 0;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA = 2;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.RegisteredAssetsImpl <em>Registered Assets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.RegisteredAssetsImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getRegisteredAssets()
	 * @generated
	 */
	int REGISTERED_ASSETS = 21;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Registered Assets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Registered Assets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.TransactionCollectionImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransactionCollection()
	 * @generated
	 */
	int TRANSACTION_COLLECTION = 23;

	/**
	 * The number of structural features of the '<em>Transaction Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transaction Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.NodeImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 24;

	/**
	 * The feature id for the '<em><b>Wrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WRS = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Networkengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NETWORKENGINE = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.impl.NetworkEngineImpl <em>Network Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.impl.NetworkEngineImpl
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getNetworkEngine()
	 * @generated
	 */
	int NETWORK_ENGINE = 25;

	/**
	 * The number of structural features of the '<em>Network Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Network Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.wrs.AssetType <em>Asset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.AssetType
	 * @see org.wrs.wrs.impl.WrsPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.wrs <em>wrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>wrs</em>'.
	 * @see org.wrs.wrs.wrs
	 * @generated
	 */
	EClass getwrs();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.wrs#getTransfervaults <em>Transfervaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfervaults</em>'.
	 * @see org.wrs.wrs.wrs#getTransfervaults()
	 * @see #getwrs()
	 * @generated
	 */
	EReference getwrs_Transfervaults();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.wrs#getMainvault <em>Mainvault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainvault</em>'.
	 * @see org.wrs.wrs.wrs#getMainvault()
	 * @see #getwrs()
	 * @generated
	 */
	EReference getwrs_Mainvault();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.wrs#getIdentities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identities</em>'.
	 * @see org.wrs.wrs.wrs#getIdentities()
	 * @see #getwrs()
	 * @generated
	 */
	EReference getwrs_Identities();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.wrs#getSupplycontrol <em>Supplycontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplycontrol</em>'.
	 * @see org.wrs.wrs.wrs#getSupplycontrol()
	 * @see #getwrs()
	 * @generated
	 */
	EReference getwrs_Supplycontrol();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.wrs#getWallets <em>Wallets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wallets</em>'.
	 * @see org.wrs.wrs.wrs#getWallets()
	 * @see #getwrs()
	 * @generated
	 */
	EReference getwrs_Wallets();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.wrs#getRegisteredasstets <em>Registeredasstets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registeredasstets</em>'.
	 * @see org.wrs.wrs.wrs#getRegisteredasstets()
	 * @see #getwrs()
	 * @generated
	 */
	EReference getwrs_Registeredasstets();

	/**
	 * Returns the meta object for the '{@link org.wrs.wrs.wrs#createIdentity() <em>Create Identity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Identity</em>' operation.
	 * @see org.wrs.wrs.wrs#createIdentity()
	 * @generated
	 */
	EOperation getwrs__CreateIdentity();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Treasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treasury</em>'.
	 * @see org.wrs.wrs.Treasury
	 * @generated
	 */
	EClass getTreasury();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vault</em>'.
	 * @see org.wrs.wrs.TransferVault
	 * @generated
	 */
	EClass getTransferVault();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.TransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vaults</em>'.
	 * @see org.wrs.wrs.TransferVaults
	 * @generated
	 */
	EClass getTransferVaults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.wrs.TransferVaults#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.wrs.TransferVaults#getChildren()
	 * @see #getTransferVaults()
	 * @generated
	 */
	EReference getTransferVaults_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genesis</em>'.
	 * @see org.wrs.wrs.Genesis
	 * @generated
	 */
	EClass getGenesis();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.Genesis#getTreasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treasury</em>'.
	 * @see org.wrs.wrs.Genesis#getTreasury()
	 * @see #getGenesis()
	 * @generated
	 */
	EReference getGenesis_Treasury();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.wrs.wrs.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.wrs.Asset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see org.wrs.wrs.Asset#getAssetType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetType();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.wrs.Asset#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Materials</em>'.
	 * @see org.wrs.wrs.Asset#getMaterials()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Materials();

	/**
	 * Returns the meta object for the '{@link org.wrs.wrs.Asset#register() <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see org.wrs.wrs.Asset#register()
	 * @generated
	 */
	EOperation getAsset__Register();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Economy</em>'.
	 * @see org.wrs.wrs.WorldEconomy
	 * @generated
	 */
	EClass getWorldEconomy();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nationaleconomies</em>'.
	 * @see org.wrs.wrs.WorldEconomy#getNationaleconomies()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_Nationaleconomies();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Economies</em>'.
	 * @see org.wrs.wrs.NationalEconomies
	 * @generated
	 */
	EClass getNationalEconomies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.wrs.NationalEconomies#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.wrs.NationalEconomies#getChildren()
	 * @see #getNationalEconomies()
	 * @generated
	 */
	EReference getNationalEconomies_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Nation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nation</em>'.
	 * @see org.wrs.wrs.Nation
	 * @generated
	 */
	EClass getNation();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.Nation#getFiatcurrency <em>Fiatcurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fiatcurrency</em>'.
	 * @see org.wrs.wrs.Nation#getFiatcurrency()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Fiatcurrency();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiat Currency</em>'.
	 * @see org.wrs.wrs.FiatCurrency
	 * @generated
	 */
	EClass getFiatCurrency();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Accountants <em>Accountants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accountants</em>'.
	 * @see org.wrs.wrs.Accountants
	 * @generated
	 */
	EClass getAccountants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.wrs.Accountants#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.wrs.Accountants#getChildren()
	 * @see #getAccountants()
	 * @generated
	 */
	EReference getAccountants_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Accountant <em>Accountant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accountant</em>'.
	 * @see org.wrs.wrs.Accountant
	 * @generated
	 */
	EClass getAccountant();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.wrs.wrs.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.wrs.Identity#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.wrs.wrs.Identity#getUUID()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_UUID();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see org.wrs.wrs.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.Material#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.wrs.wrs.Material#getBelongsTo()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_BelongsTo();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see org.wrs.wrs.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see org.wrs.wrs.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identities</em>'.
	 * @see org.wrs.wrs.Identities
	 * @generated
	 */
	EClass getIdentities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.wrs.Identities#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.wrs.Identities#getChildren()
	 * @see #getIdentities()
	 * @generated
	 */
	EReference getIdentities_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.wrs.wrs.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.wrs.Account#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see org.wrs.wrs.Account#getPublicKey()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_PublicKey();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.Account#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.wrs.wrs.Account#getBelongsTo()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_BelongsTo();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Control</em>'.
	 * @see org.wrs.wrs.SupplyControl
	 * @generated
	 */
	EClass getSupplyControl();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.SupplyControl#getGenesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Genesis</em>'.
	 * @see org.wrs.wrs.SupplyControl#getGenesis()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_Genesis();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Accounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounts</em>'.
	 * @see org.wrs.wrs.Accounts
	 * @generated
	 */
	EClass getAccounts();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.wrs.Accounts#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.wrs.wrs.Accounts#getChildren()
	 * @see #getAccounts()
	 * @generated
	 */
	EReference getAccounts_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.wrs.wrs.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.Transaction#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assets</em>'.
	 * @see org.wrs.wrs.Transaction#getAssets()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Assets();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.wrs.Transaction#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see org.wrs.wrs.Transaction#getTransactions()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Transactions();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.wrs.Transaction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.wrs.wrs.Transaction#getData()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Data();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.RegisteredAssets <em>Registered Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Assets</em>'.
	 * @see org.wrs.wrs.RegisteredAssets
	 * @generated
	 */
	EClass getRegisteredAssets();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.wrs.RegisteredAssets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.wrs.wrs.RegisteredAssets#getChildren()
	 * @see #getRegisteredAssets()
	 * @generated
	 */
	EReference getRegisteredAssets_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.AbstractVault <em>Abstract Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Vault</em>'.
	 * @see org.wrs.wrs.AbstractVault
	 * @generated
	 */
	EClass getAbstractVault();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.wrs.AbstractVault#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see org.wrs.wrs.AbstractVault#getAssets()
	 * @see #getAbstractVault()
	 * @generated
	 */
	EReference getAbstractVault_Assets();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.AbstractVault#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see org.wrs.wrs.AbstractVault#getTransaction()
	 * @see #getAbstractVault()
	 * @generated
	 */
	EReference getAbstractVault_Transaction();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Collection</em>'.
	 * @see org.wrs.wrs.TransactionCollection
	 * @generated
	 */
	EClass getTransactionCollection();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.wrs.wrs.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.wrs.Node#getWrs <em>Wrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wrs</em>'.
	 * @see org.wrs.wrs.Node#getWrs()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Wrs();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.wrs.Node#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.wrs.wrs.Node#getWeight()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.wrs.Node#getNetworkengine <em>Networkengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkengine</em>'.
	 * @see org.wrs.wrs.Node#getNetworkengine()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Networkengine();

	/**
	 * Returns the meta object for class '{@link org.wrs.wrs.NetworkEngine <em>Network Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Engine</em>'.
	 * @see org.wrs.wrs.NetworkEngine
	 * @generated
	 */
	EClass getNetworkEngine();

	/**
	 * Returns the meta object for enum '{@link org.wrs.wrs.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Type</em>'.
	 * @see org.wrs.wrs.AssetType
	 * @generated
	 */
	EEnum getAssetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WrsFactory getWrsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.wrsImpl <em>wrs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.wrsImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getwrs()
		 * @generated
		 */
		EClass WRS = eINSTANCE.getwrs();

		/**
		 * The meta object literal for the '<em><b>Transfervaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__TRANSFERVAULTS = eINSTANCE.getwrs_Transfervaults();

		/**
		 * The meta object literal for the '<em><b>Mainvault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__MAINVAULT = eINSTANCE.getwrs_Mainvault();

		/**
		 * The meta object literal for the '<em><b>Identities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__IDENTITIES = eINSTANCE.getwrs_Identities();

		/**
		 * The meta object literal for the '<em><b>Supplycontrol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__SUPPLYCONTROL = eINSTANCE.getwrs_Supplycontrol();

		/**
		 * The meta object literal for the '<em><b>Wallets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__WALLETS = eINSTANCE.getwrs_Wallets();

		/**
		 * The meta object literal for the '<em><b>Registeredasstets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__REGISTEREDASSTETS = eINSTANCE.getwrs_Registeredasstets();

		/**
		 * The meta object literal for the '<em><b>Create Identity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRS___CREATE_IDENTITY = eINSTANCE.getwrs__CreateIdentity();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.TreasuryImpl <em>Treasury</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.TreasuryImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getTreasury()
		 * @generated
		 */
		EClass TREASURY = eINSTANCE.getTreasury();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.TransferVaultImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransferVault()
		 * @generated
		 */
		EClass TRANSFER_VAULT = eINSTANCE.getTransferVault();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.TransferVaultsImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransferVaults()
		 * @generated
		 */
		EClass TRANSFER_VAULTS = eINSTANCE.getTransferVaults();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_VAULTS__CHILDREN = eINSTANCE.getTransferVaults_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.GenesisImpl <em>Genesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.GenesisImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getGenesis()
		 * @generated
		 */
		EClass GENESIS = eINSTANCE.getGenesis();

		/**
		 * The meta object literal for the '<em><b>Treasury</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENESIS__TREASURY = eINSTANCE.getGenesis_Treasury();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.AssetImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_TYPE = eINSTANCE.getAsset_AssetType();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__MATERIALS = eINSTANCE.getAsset_Materials();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___REGISTER = eINSTANCE.getAsset__Register();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.WorldEconomyImpl <em>World Economy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.WorldEconomyImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getWorldEconomy()
		 * @generated
		 */
		EClass WORLD_ECONOMY = eINSTANCE.getWorldEconomy();

		/**
		 * The meta object literal for the '<em><b>Nationaleconomies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_ECONOMY__NATIONALECONOMIES = eINSTANCE.getWorldEconomy_Nationaleconomies();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.NationalEconomiesImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getNationalEconomies()
		 * @generated
		 */
		EClass NATIONAL_ECONOMIES = eINSTANCE.getNationalEconomies();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATIONAL_ECONOMIES__CHILDREN = eINSTANCE.getNationalEconomies_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.NationImpl <em>Nation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.NationImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getNation()
		 * @generated
		 */
		EClass NATION = eINSTANCE.getNation();

		/**
		 * The meta object literal for the '<em><b>Fiatcurrency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION__FIATCURRENCY = eINSTANCE.getNation_Fiatcurrency();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.FiatCurrencyImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getFiatCurrency()
		 * @generated
		 */
		EClass FIAT_CURRENCY = eINSTANCE.getFiatCurrency();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.AccountantsImpl <em>Accountants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.AccountantsImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccountants()
		 * @generated
		 */
		EClass ACCOUNTANTS = eINSTANCE.getAccountants();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTANTS__CHILDREN = eINSTANCE.getAccountants_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.AccountantImpl <em>Accountant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.AccountantImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccountant()
		 * @generated
		 */
		EClass ACCOUNTANT = eINSTANCE.getAccountant();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.IdentityImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY__UUID = eINSTANCE.getIdentity_UUID();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.MaterialImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__BELONGS_TO = eINSTANCE.getMaterial_BelongsTo();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.IndividualImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.LegalEntityImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.IdentitiesImpl <em>Identities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.IdentitiesImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getIdentities()
		 * @generated
		 */
		EClass IDENTITIES = eINSTANCE.getIdentities();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITIES__CHILDREN = eINSTANCE.getIdentities_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.AccountImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PUBLIC_KEY = eINSTANCE.getAccount_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__BELONGS_TO = eINSTANCE.getAccount_BelongsTo();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.SupplyControlImpl <em>Supply Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.SupplyControlImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getSupplyControl()
		 * @generated
		 */
		EClass SUPPLY_CONTROL = eINSTANCE.getSupplyControl();

		/**
		 * The meta object literal for the '<em><b>Genesis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CONTROL__GENESIS = eINSTANCE.getSupplyControl_Genesis();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.AccountsImpl <em>Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.AccountsImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAccounts()
		 * @generated
		 */
		EClass ACCOUNTS = eINSTANCE.getAccounts();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTS__CHILDREN = eINSTANCE.getAccounts_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.TransactionImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__ASSETS = eINSTANCE.getTransaction_Assets();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__TRANSACTIONS = eINSTANCE.getTransaction_Transactions();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DATA = eINSTANCE.getTransaction_Data();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.RegisteredAssetsImpl <em>Registered Assets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.RegisteredAssetsImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getRegisteredAssets()
		 * @generated
		 */
		EClass REGISTERED_ASSETS = eINSTANCE.getRegisteredAssets();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_ASSETS__CHILDREN = eINSTANCE.getRegisteredAssets_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.AbstractVaultImpl <em>Abstract Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.AbstractVaultImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAbstractVault()
		 * @generated
		 */
		EClass ABSTRACT_VAULT = eINSTANCE.getAbstractVault();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VAULT__ASSETS = eINSTANCE.getAbstractVault_Assets();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VAULT__TRANSACTION = eINSTANCE.getAbstractVault_Transaction();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.TransactionCollectionImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getTransactionCollection()
		 * @generated
		 */
		EClass TRANSACTION_COLLECTION = eINSTANCE.getTransactionCollection();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.NodeImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Wrs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__WRS = eINSTANCE.getNode_Wrs();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__WEIGHT = eINSTANCE.getNode_Weight();

		/**
		 * The meta object literal for the '<em><b>Networkengine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NETWORKENGINE = eINSTANCE.getNode_Networkengine();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.impl.NetworkEngineImpl <em>Network Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.impl.NetworkEngineImpl
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getNetworkEngine()
		 * @generated
		 */
		EClass NETWORK_ENGINE = eINSTANCE.getNetworkEngine();

		/**
		 * The meta object literal for the '{@link org.wrs.wrs.AssetType <em>Asset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.wrs.AssetType
		 * @see org.wrs.wrs.impl.WrsPackageImpl#getAssetType()
		 * @generated
		 */
		EEnum ASSET_TYPE = eINSTANCE.getAssetType();

	}

} //WrsPackage
