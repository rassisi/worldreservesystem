/**
 */
package org.wrs.model.wrs;

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
 * @see org.wrs.model.wrs.WrsFactory
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
	String eNS_URI = "http://wrs/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wrs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrsPackage eINSTANCE = org.wrs.model.wrs.impl.WrsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.WRSImpl <em>WRS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.WRSImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getWRS()
	 * @generated
	 */
	int WRS = 0;

	/**
	 * The feature id for the '<em><b>Mainvault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__MAINVAULT = 0;

	/**
	 * The feature id for the '<em><b>Supplycontrol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__SUPPLYCONTROL = 1;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__ACCOUNTS = 2;

	/**
	 * The feature id for the '<em><b>Registeredasstets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__REGISTEREDASSTETS = 3;

	/**
	 * The feature id for the '<em><b>Worldeconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__WORLDECONOMY = 4;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__COUNTRIES = 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__NODES = 6;

	/**
	 * The feature id for the '<em><b>Identities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__IDENTITIES = 7;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__TRANSACTIONS = 8;

	/**
	 * The feature id for the '<em><b>Transactionconditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__TRANSACTIONCONDITIONS = 9;

	/**
	 * The feature id for the '<em><b>Statistic Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__STATISTIC_DATAS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__NAME = 11;

	/**
	 * The number of structural features of the '<em>WRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Create Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS___CREATE_IDENTITY = 0;

	/**
	 * The number of operations of the '<em>WRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AbstractAccountImpl <em>Abstract Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AbstractAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAbstractAccount()
	 * @generated
	 */
	int ABSTRACT_ACCOUNT = 18;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__ASSETS = 0;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__BELONGS_TO = 2;

	/**
	 * The number of structural features of the '<em>Abstract Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TreasuryImpl <em>Treasury</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TreasuryImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTreasury()
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
	int TREASURY__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__BELONGS_TO = ABSTRACT_ACCOUNT__BELONGS_TO;

	/**
	 * The number of structural features of the '<em>Treasury</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Treasury</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransferVaultImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransferVault()
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
	int TRANSFER_VAULT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__BELONGS_TO = ABSTRACT_ACCOUNT__BELONGS_TO;

	/**
	 * The number of structural features of the '<em>Transfer Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transfer Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.GenesisImpl <em>Genesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.GenesisImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getGenesis()
	 * @generated
	 */
	int GENESIS = 3;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AssetImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 4;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.WorldEconomyImpl <em>World Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.WorldEconomyImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getWorldEconomy()
	 * @generated
	 */
	int WORLD_ECONOMY = 5;

	/**
	 * The feature id for the '<em><b>Nationaleconomies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__NATIONALECONOMIES = 0;

	/**
	 * The feature id for the '<em><b>Statisticssource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__STATISTICSSOURCE = 1;

	/**
	 * The number of structural features of the '<em>World Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>World Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.NationalEconomiesImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNationalEconomies()
	 * @generated
	 */
	int NATIONAL_ECONOMIES = 6;

	/**
	 * The number of structural features of the '<em>National Economies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>National Economies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.CountryImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 7;

	/**
	 * The feature id for the '<em><b>Fiatcurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__FIATCURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Nationaleconomies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NATIONALECONOMIES = 1;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__REGIONS = 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.FiatCurrencyImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getFiatCurrency()
	 * @generated
	 */
	int FIAT_CURRENCY = 8;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.IdentityImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 9;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.ThingImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getThing()
	 * @generated
	 */
	int THING = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BELONGS_TO = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.IndividualImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Works For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__WORKS_FOR = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legal Partner Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__LEGAL_PARTNER_OF = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.LegalEntityImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLegalEntity()
	 * @generated
	 */
	int LEGAL_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__TYPE = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 13;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BELONGS_TO = ABSTRACT_ACCOUNT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PUBLIC_KEY = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.SupplyControlImpl <em>Supply Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.SupplyControlImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getSupplyControl()
	 * @generated
	 */
	int SUPPLY_CONTROL = 14;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AccountsImpl <em>Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AccountsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAccounts()
	 * @generated
	 */
	int ACCOUNTS = 15;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AbstractTransactionImpl <em>Abstract Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AbstractTransactionImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAbstractTransaction()
	 * @generated
	 */
	int ABSTRACT_TRANSACTION = 26;

	/**
	 * The number of structural features of the '<em>Abstract Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransactionImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 16;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ASSETS = ABSTRACT_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTIONS = ABSTRACT_TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA = ABSTRACT_TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = ABSTRACT_TRANSACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = ABSTRACT_TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.RegisteredAssetsImpl <em>Registered Assets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.RegisteredAssetsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getRegisteredAssets()
	 * @generated
	 */
	int REGISTERED_ASSETS = 17;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransactionCollectionImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactionCollection()
	 * @generated
	 */
	int TRANSACTION_COLLECTION = 19;

	/**
	 * The number of structural features of the '<em>Transaction Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION_FEATURE_COUNT = ABSTRACT_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transaction Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION_OPERATION_COUNT = ABSTRACT_TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.NodeImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 20;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Networkengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NETWORKENGINE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.NetworkEngineImpl <em>Network Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.NetworkEngineImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNetworkEngine()
	 * @generated
	 */
	int NETWORK_ENGINE = 21;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.CountriesImpl <em>Countries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.CountriesImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getCountries()
	 * @generated
	 */
	int COUNTRIES = 22;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__COUNTRY = 0;

	/**
	 * The number of structural features of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.NodesImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNodes()
	 * @generated
	 */
	int NODES = 23;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.IdentitiesImpl <em>Identities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.IdentitiesImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getIdentities()
	 * @generated
	 */
	int IDENTITIES = 24;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransactionsImpl <em>Transactions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransactionsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactions()
	 * @generated
	 */
	int TRANSACTIONS = 25;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Transactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.NodeAccountImpl <em>Node Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.NodeAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNodeAccount()
	 * @generated
	 */
	int NODE_ACCOUNT = 27;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__BELONGS_TO = ABSTRACT_ACCOUNT__BELONGS_TO;

	/**
	 * The number of structural features of the '<em>Node Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransactionConditionsImpl <em>Transaction Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransactionConditionsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactionConditions()
	 * @generated
	 */
	int TRANSACTION_CONDITIONS = 28;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITIONS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Transaction Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transaction Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransactionConditionImpl <em>Transaction Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransactionConditionImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactionCondition()
	 * @generated
	 */
	int TRANSACTION_CONDITION = 29;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__FORMULA = 0;

	/**
	 * The feature id for the '<em><b>Signed Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__SIGNED_INPUTS = 1;

	/**
	 * The number of structural features of the '<em>Transaction Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transaction Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.SignedInputImpl <em>Signed Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.SignedInputImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getSignedInput()
	 * @generated
	 */
	int SIGNED_INPUT = 30;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__IDENTITY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Signed Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Signed Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.StatisticsImpl <em>Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.StatisticsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getStatistics()
	 * @generated
	 */
	int STATISTICS = 31;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.StatisticDatasImpl <em>Statistic Datas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.StatisticDatasImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getStatisticDatas()
	 * @generated
	 */
	int STATISTIC_DATAS = 32;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Statistic Datas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statistic Datas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.CountryRegionImpl <em>Country Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.CountryRegionImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getCountryRegion()
	 * @generated
	 */
	int COUNTRY_REGION = 33;

	/**
	 * The number of structural features of the '<em>Country Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Country Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.StatisticsSourceImpl <em>Statistics Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.StatisticsSourceImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getStatisticsSource()
	 * @generated
	 */
	int STATISTICS_SOURCE = 34;

	/**
	 * The number of structural features of the '<em>Statistics Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statistics Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.AssetType <em>Asset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.AssetType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.LegalEntityType <em>Legal Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.LegalEntityType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLegalEntityType()
	 * @generated
	 */
	int LEGAL_ENTITY_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.InputValueType <em>Input Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.InputValueType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getInputValueType()
	 * @generated
	 */
	int INPUT_VALUE_TYPE = 37;

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.WRS <em>WRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WRS</em>'.
	 * @see org.wrs.model.wrs.WRS
	 * @generated
	 */
	EClass getWRS();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.WRS#getMainvault <em>Mainvault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mainvault</em>'.
	 * @see org.wrs.model.wrs.WRS#getMainvault()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Mainvault();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getSupplycontrol <em>Supplycontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplycontrol</em>'.
	 * @see org.wrs.model.wrs.WRS#getSupplycontrol()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Supplycontrol();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accounts</em>'.
	 * @see org.wrs.model.wrs.WRS#getAccounts()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Accounts();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getRegisteredasstets <em>Registeredasstets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registeredasstets</em>'.
	 * @see org.wrs.model.wrs.WRS#getRegisteredasstets()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Registeredasstets();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getWorldeconomy <em>Worldeconomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worldeconomy</em>'.
	 * @see org.wrs.model.wrs.WRS#getWorldeconomy()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Worldeconomy();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Countries</em>'.
	 * @see org.wrs.model.wrs.WRS#getCountries()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Countries();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes</em>'.
	 * @see org.wrs.model.wrs.WRS#getNodes()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getIdentities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identities</em>'.
	 * @see org.wrs.model.wrs.WRS#getIdentities()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Identities();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transactions</em>'.
	 * @see org.wrs.model.wrs.WRS#getTransactions()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Transactions();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getTransactionconditions <em>Transactionconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transactionconditions</em>'.
	 * @see org.wrs.model.wrs.WRS#getTransactionconditions()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Transactionconditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getStatisticDatas <em>Statistic Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic Datas</em>'.
	 * @see org.wrs.model.wrs.WRS#getStatisticDatas()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_StatisticDatas();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.WRS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wrs.model.wrs.WRS#getName()
	 * @see #getWRS()
	 * @generated
	 */
	EAttribute getWRS_Name();

	/**
	 * Returns the meta object for the '{@link org.wrs.model.wrs.WRS#createIdentity() <em>Create Identity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Identity</em>' operation.
	 * @see org.wrs.model.wrs.WRS#createIdentity()
	 * @generated
	 */
	EOperation getWRS__CreateIdentity();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Treasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treasury</em>'.
	 * @see org.wrs.model.wrs.Treasury
	 * @generated
	 */
	EClass getTreasury();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vault</em>'.
	 * @see org.wrs.model.wrs.TransferVault
	 * @generated
	 */
	EClass getTransferVault();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genesis</em>'.
	 * @see org.wrs.model.wrs.Genesis
	 * @generated
	 */
	EClass getGenesis();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.Genesis#getTreasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treasury</em>'.
	 * @see org.wrs.model.wrs.Genesis#getTreasury()
	 * @see #getGenesis()
	 * @generated
	 */
	EReference getGenesis_Treasury();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.wrs.model.wrs.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Asset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see org.wrs.model.wrs.Asset#getAssetType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetType();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Asset#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Materials</em>'.
	 * @see org.wrs.model.wrs.Asset#getMaterials()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Materials();

	/**
	 * Returns the meta object for the '{@link org.wrs.model.wrs.Asset#register() <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see org.wrs.model.wrs.Asset#register()
	 * @generated
	 */
	EOperation getAsset__Register();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Economy</em>'.
	 * @see org.wrs.model.wrs.WorldEconomy
	 * @generated
	 */
	EClass getWorldEconomy();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nationaleconomies</em>'.
	 * @see org.wrs.model.wrs.WorldEconomy#getNationaleconomies()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_Nationaleconomies();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WorldEconomy#getStatisticssource <em>Statisticssource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statisticssource</em>'.
	 * @see org.wrs.model.wrs.WorldEconomy#getStatisticssource()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_Statisticssource();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Economies</em>'.
	 * @see org.wrs.model.wrs.NationalEconomies
	 * @generated
	 */
	EClass getNationalEconomies();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.wrs.model.wrs.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.Country#getFiatcurrency <em>Fiatcurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fiatcurrency</em>'.
	 * @see org.wrs.model.wrs.Country#getFiatcurrency()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Fiatcurrency();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.Country#getNationaleconomies <em>Nationaleconomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nationaleconomies</em>'.
	 * @see org.wrs.model.wrs.Country#getNationaleconomies()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Nationaleconomies();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Country#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regions</em>'.
	 * @see org.wrs.model.wrs.Country#getRegions()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Regions();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiat Currency</em>'.
	 * @see org.wrs.model.wrs.FiatCurrency
	 * @generated
	 */
	EClass getFiatCurrency();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.wrs.model.wrs.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Identity#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.wrs.model.wrs.Identity#getUUID()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_UUID();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see org.wrs.model.wrs.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.Thing#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.wrs.model.wrs.Thing#getBelongsTo()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_BelongsTo();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see org.wrs.model.wrs.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Individual#getWorksFor <em>Works For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works For</em>'.
	 * @see org.wrs.model.wrs.Individual#getWorksFor()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_WorksFor();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Individual#getLegalPartnerOf <em>Legal Partner Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Legal Partner Of</em>'.
	 * @see org.wrs.model.wrs.Individual#getLegalPartnerOf()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_LegalPartnerOf();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see org.wrs.model.wrs.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.LegalEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wrs.model.wrs.LegalEntity#getType()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Type();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.wrs.model.wrs.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Account#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see org.wrs.model.wrs.Account#getPublicKey()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_PublicKey();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Control</em>'.
	 * @see org.wrs.model.wrs.SupplyControl
	 * @generated
	 */
	EClass getSupplyControl();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.SupplyControl#getGenesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Genesis</em>'.
	 * @see org.wrs.model.wrs.SupplyControl#getGenesis()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_Genesis();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Accounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounts</em>'.
	 * @see org.wrs.model.wrs.Accounts
	 * @generated
	 */
	EClass getAccounts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Accounts#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.Accounts#getChildren()
	 * @see #getAccounts()
	 * @generated
	 */
	EReference getAccounts_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.wrs.model.wrs.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.Transaction#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assets</em>'.
	 * @see org.wrs.model.wrs.Transaction#getAssets()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Assets();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Transaction#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see org.wrs.model.wrs.Transaction#getTransactions()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Transactions();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Transaction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.wrs.model.wrs.Transaction#getData()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Data();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.RegisteredAssets <em>Registered Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Assets</em>'.
	 * @see org.wrs.model.wrs.RegisteredAssets
	 * @generated
	 */
	EClass getRegisteredAssets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.RegisteredAssets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.RegisteredAssets#getChildren()
	 * @see #getRegisteredAssets()
	 * @generated
	 */
	EReference getRegisteredAssets_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.AbstractAccount <em>Abstract Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Account</em>'.
	 * @see org.wrs.model.wrs.AbstractAccount
	 * @generated
	 */
	EClass getAbstractAccount();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.AbstractAccount#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see org.wrs.model.wrs.AbstractAccount#getAssets()
	 * @see #getAbstractAccount()
	 * @generated
	 */
	EReference getAbstractAccount_Assets();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.AbstractAccount#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see org.wrs.model.wrs.AbstractAccount#getTransaction()
	 * @see #getAbstractAccount()
	 * @generated
	 */
	EReference getAbstractAccount_Transaction();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.AbstractAccount#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.wrs.model.wrs.AbstractAccount#getBelongsTo()
	 * @see #getAbstractAccount()
	 * @generated
	 */
	EReference getAbstractAccount_BelongsTo();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Collection</em>'.
	 * @see org.wrs.model.wrs.TransactionCollection
	 * @generated
	 */
	EClass getTransactionCollection();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.wrs.model.wrs.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Node#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.wrs.model.wrs.Node#getWeight()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.Node#getNetworkengine <em>Networkengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkengine</em>'.
	 * @see org.wrs.model.wrs.Node#getNetworkengine()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Networkengine();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.NetworkEngine <em>Network Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Engine</em>'.
	 * @see org.wrs.model.wrs.NetworkEngine
	 * @generated
	 */
	EClass getNetworkEngine();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countries</em>'.
	 * @see org.wrs.model.wrs.Countries
	 * @generated
	 */
	EClass getCountries();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.Countries#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see org.wrs.model.wrs.Countries#getCountry()
	 * @see #getCountries()
	 * @generated
	 */
	EReference getCountries_Country();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see org.wrs.model.wrs.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Nodes#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.Nodes#getChildren()
	 * @see #getNodes()
	 * @generated
	 */
	EReference getNodes_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identities</em>'.
	 * @see org.wrs.model.wrs.Identities
	 * @generated
	 */
	EClass getIdentities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Identities#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.Identities#getChildren()
	 * @see #getIdentities()
	 * @generated
	 */
	EReference getIdentities_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Transactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactions</em>'.
	 * @see org.wrs.model.wrs.Transactions
	 * @generated
	 */
	EClass getTransactions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Transactions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.Transactions#getChildren()
	 * @see #getTransactions()
	 * @generated
	 */
	EReference getTransactions_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.AbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transaction</em>'.
	 * @see org.wrs.model.wrs.AbstractTransaction
	 * @generated
	 */
	EClass getAbstractTransaction();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.NodeAccount <em>Node Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Account</em>'.
	 * @see org.wrs.model.wrs.NodeAccount
	 * @generated
	 */
	EClass getNodeAccount();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.TransactionConditions <em>Transaction Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Conditions</em>'.
	 * @see org.wrs.model.wrs.TransactionConditions
	 * @generated
	 */
	EClass getTransactionConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.TransactionConditions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.TransactionConditions#getChildren()
	 * @see #getTransactionConditions()
	 * @generated
	 */
	EReference getTransactionConditions_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.TransactionCondition <em>Transaction Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Condition</em>'.
	 * @see org.wrs.model.wrs.TransactionCondition
	 * @generated
	 */
	EClass getTransactionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.TransactionCondition#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.wrs.model.wrs.TransactionCondition#getFormula()
	 * @see #getTransactionCondition()
	 * @generated
	 */
	EAttribute getTransactionCondition_Formula();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.TransactionCondition#getSignedInputs <em>Signed Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signed Inputs</em>'.
	 * @see org.wrs.model.wrs.TransactionCondition#getSignedInputs()
	 * @see #getTransactionCondition()
	 * @generated
	 */
	EReference getTransactionCondition_SignedInputs();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.SignedInput <em>Signed Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Input</em>'.
	 * @see org.wrs.model.wrs.SignedInput
	 * @generated
	 */
	EClass getSignedInput();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.SignedInput#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.wrs.model.wrs.SignedInput#getVariableName()
	 * @see #getSignedInput()
	 * @generated
	 */
	EAttribute getSignedInput_VariableName();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.SignedInput#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identity</em>'.
	 * @see org.wrs.model.wrs.SignedInput#getIdentity()
	 * @see #getSignedInput()
	 * @generated
	 */
	EReference getSignedInput_Identity();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.SignedInput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.wrs.model.wrs.SignedInput#getValue()
	 * @see #getSignedInput()
	 * @generated
	 */
	EAttribute getSignedInput_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.SignedInput#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.wrs.model.wrs.SignedInput#getType()
	 * @see #getSignedInput()
	 * @generated
	 */
	EAttribute getSignedInput_Type();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics</em>'.
	 * @see org.wrs.model.wrs.Statistics
	 * @generated
	 */
	EClass getStatistics();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.StatisticDatas <em>Statistic Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Datas</em>'.
	 * @see org.wrs.model.wrs.StatisticDatas
	 * @generated
	 */
	EClass getStatisticDatas();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.StatisticDatas#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Children</em>'.
	 * @see org.wrs.model.wrs.StatisticDatas#getChildren()
	 * @see #getStatisticDatas()
	 * @generated
	 */
	EReference getStatisticDatas_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.CountryRegion <em>Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Region</em>'.
	 * @see org.wrs.model.wrs.CountryRegion
	 * @generated
	 */
	EClass getCountryRegion();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.StatisticsSource <em>Statistics Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics Source</em>'.
	 * @see org.wrs.model.wrs.StatisticsSource
	 * @generated
	 */
	EClass getStatisticsSource();

	/**
	 * Returns the meta object for enum '{@link org.wrs.model.wrs.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Type</em>'.
	 * @see org.wrs.model.wrs.AssetType
	 * @generated
	 */
	EEnum getAssetType();

	/**
	 * Returns the meta object for enum '{@link org.wrs.model.wrs.LegalEntityType <em>Legal Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legal Entity Type</em>'.
	 * @see org.wrs.model.wrs.LegalEntityType
	 * @generated
	 */
	EEnum getLegalEntityType();

	/**
	 * Returns the meta object for enum '{@link org.wrs.model.wrs.InputValueType <em>Input Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Value Type</em>'.
	 * @see org.wrs.model.wrs.InputValueType
	 * @generated
	 */
	EEnum getInputValueType();

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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.WRSImpl <em>WRS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.WRSImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getWRS()
		 * @generated
		 */
		EClass WRS = eINSTANCE.getWRS();

		/**
		 * The meta object literal for the '<em><b>Mainvault</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__MAINVAULT = eINSTANCE.getWRS_Mainvault();

		/**
		 * The meta object literal for the '<em><b>Supplycontrol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__SUPPLYCONTROL = eINSTANCE.getWRS_Supplycontrol();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__ACCOUNTS = eINSTANCE.getWRS_Accounts();

		/**
		 * The meta object literal for the '<em><b>Registeredasstets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__REGISTEREDASSTETS = eINSTANCE.getWRS_Registeredasstets();

		/**
		 * The meta object literal for the '<em><b>Worldeconomy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__WORLDECONOMY = eINSTANCE.getWRS_Worldeconomy();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__COUNTRIES = eINSTANCE.getWRS_Countries();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__NODES = eINSTANCE.getWRS_Nodes();

		/**
		 * The meta object literal for the '<em><b>Identities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__IDENTITIES = eINSTANCE.getWRS_Identities();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__TRANSACTIONS = eINSTANCE.getWRS_Transactions();

		/**
		 * The meta object literal for the '<em><b>Transactionconditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__TRANSACTIONCONDITIONS = eINSTANCE.getWRS_Transactionconditions();

		/**
		 * The meta object literal for the '<em><b>Statistic Datas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__STATISTIC_DATAS = eINSTANCE.getWRS_StatisticDatas();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRS__NAME = eINSTANCE.getWRS_Name();

		/**
		 * The meta object literal for the '<em><b>Create Identity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRS___CREATE_IDENTITY = eINSTANCE.getWRS__CreateIdentity();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TreasuryImpl <em>Treasury</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TreasuryImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTreasury()
		 * @generated
		 */
		EClass TREASURY = eINSTANCE.getTreasury();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransferVaultImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransferVault()
		 * @generated
		 */
		EClass TRANSFER_VAULT = eINSTANCE.getTransferVault();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.GenesisImpl <em>Genesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.GenesisImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getGenesis()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AssetImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAsset()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.WorldEconomyImpl <em>World Economy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.WorldEconomyImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getWorldEconomy()
		 * @generated
		 */
		EClass WORLD_ECONOMY = eINSTANCE.getWorldEconomy();

		/**
		 * The meta object literal for the '<em><b>Nationaleconomies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_ECONOMY__NATIONALECONOMIES = eINSTANCE.getWorldEconomy_Nationaleconomies();

		/**
		 * The meta object literal for the '<em><b>Statisticssource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_ECONOMY__STATISTICSSOURCE = eINSTANCE.getWorldEconomy_Statisticssource();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.NationalEconomiesImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNationalEconomies()
		 * @generated
		 */
		EClass NATIONAL_ECONOMIES = eINSTANCE.getNationalEconomies();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.CountryImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Fiatcurrency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__FIATCURRENCY = eINSTANCE.getCountry_Fiatcurrency();

		/**
		 * The meta object literal for the '<em><b>Nationaleconomies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__NATIONALECONOMIES = eINSTANCE.getCountry_Nationaleconomies();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__REGIONS = eINSTANCE.getCountry_Regions();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.FiatCurrencyImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getFiatCurrency()
		 * @generated
		 */
		EClass FIAT_CURRENCY = eINSTANCE.getFiatCurrency();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.IdentityImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getIdentity()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.ThingImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__BELONGS_TO = eINSTANCE.getThing_BelongsTo();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.IndividualImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Works For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__WORKS_FOR = eINSTANCE.getIndividual_WorksFor();

		/**
		 * The meta object literal for the '<em><b>Legal Partner Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__LEGAL_PARTNER_OF = eINSTANCE.getIndividual_LegalPartnerOf();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.LegalEntityImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY__TYPE = eINSTANCE.getLegalEntity_Type();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAccount()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.SupplyControlImpl <em>Supply Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.SupplyControlImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getSupplyControl()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AccountsImpl <em>Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AccountsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAccounts()
		 * @generated
		 */
		EClass ACCOUNTS = eINSTANCE.getAccounts();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTS__CHILDREN = eINSTANCE.getAccounts_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransactionImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransaction()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.RegisteredAssetsImpl <em>Registered Assets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.RegisteredAssetsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getRegisteredAssets()
		 * @generated
		 */
		EClass REGISTERED_ASSETS = eINSTANCE.getRegisteredAssets();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_ASSETS__CHILDREN = eINSTANCE.getRegisteredAssets_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AbstractAccountImpl <em>Abstract Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AbstractAccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAbstractAccount()
		 * @generated
		 */
		EClass ABSTRACT_ACCOUNT = eINSTANCE.getAbstractAccount();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACCOUNT__ASSETS = eINSTANCE.getAbstractAccount_Assets();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACCOUNT__TRANSACTION = eINSTANCE.getAbstractAccount_Transaction();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACCOUNT__BELONGS_TO = eINSTANCE.getAbstractAccount_BelongsTo();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransactionCollectionImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactionCollection()
		 * @generated
		 */
		EClass TRANSACTION_COLLECTION = eINSTANCE.getTransactionCollection();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.NodeImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.NetworkEngineImpl <em>Network Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.NetworkEngineImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNetworkEngine()
		 * @generated
		 */
		EClass NETWORK_ENGINE = eINSTANCE.getNetworkEngine();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.CountriesImpl <em>Countries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.CountriesImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getCountries()
		 * @generated
		 */
		EClass COUNTRIES = eINSTANCE.getCountries();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRIES__COUNTRY = eINSTANCE.getCountries_Country();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.NodesImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNodes()
		 * @generated
		 */
		EClass NODES = eINSTANCE.getNodes();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES__CHILDREN = eINSTANCE.getNodes_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.IdentitiesImpl <em>Identities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.IdentitiesImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getIdentities()
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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransactionsImpl <em>Transactions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransactionsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactions()
		 * @generated
		 */
		EClass TRANSACTIONS = eINSTANCE.getTransactions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTIONS__CHILDREN = eINSTANCE.getTransactions_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AbstractTransactionImpl <em>Abstract Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AbstractTransactionImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAbstractTransaction()
		 * @generated
		 */
		EClass ABSTRACT_TRANSACTION = eINSTANCE.getAbstractTransaction();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.NodeAccountImpl <em>Node Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.NodeAccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNodeAccount()
		 * @generated
		 */
		EClass NODE_ACCOUNT = eINSTANCE.getNodeAccount();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransactionConditionsImpl <em>Transaction Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransactionConditionsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactionConditions()
		 * @generated
		 */
		EClass TRANSACTION_CONDITIONS = eINSTANCE.getTransactionConditions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_CONDITIONS__CHILDREN = eINSTANCE.getTransactionConditions_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransactionConditionImpl <em>Transaction Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransactionConditionImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactionCondition()
		 * @generated
		 */
		EClass TRANSACTION_CONDITION = eINSTANCE.getTransactionCondition();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_CONDITION__FORMULA = eINSTANCE.getTransactionCondition_Formula();

		/**
		 * The meta object literal for the '<em><b>Signed Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_CONDITION__SIGNED_INPUTS = eINSTANCE.getTransactionCondition_SignedInputs();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.SignedInputImpl <em>Signed Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.SignedInputImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getSignedInput()
		 * @generated
		 */
		EClass SIGNED_INPUT = eINSTANCE.getSignedInput();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNED_INPUT__VARIABLE_NAME = eINSTANCE.getSignedInput_VariableName();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNED_INPUT__IDENTITY = eINSTANCE.getSignedInput_Identity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNED_INPUT__VALUE = eINSTANCE.getSignedInput_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNED_INPUT__TYPE = eINSTANCE.getSignedInput_Type();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.StatisticsImpl <em>Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.StatisticsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getStatistics()
		 * @generated
		 */
		EClass STATISTICS = eINSTANCE.getStatistics();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.StatisticDatasImpl <em>Statistic Datas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.StatisticDatasImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getStatisticDatas()
		 * @generated
		 */
		EClass STATISTIC_DATAS = eINSTANCE.getStatisticDatas();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC_DATAS__CHILDREN = eINSTANCE.getStatisticDatas_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.CountryRegionImpl <em>Country Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.CountryRegionImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getCountryRegion()
		 * @generated
		 */
		EClass COUNTRY_REGION = eINSTANCE.getCountryRegion();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.StatisticsSourceImpl <em>Statistics Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.StatisticsSourceImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getStatisticsSource()
		 * @generated
		 */
		EClass STATISTICS_SOURCE = eINSTANCE.getStatisticsSource();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.AssetType <em>Asset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.AssetType
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAssetType()
		 * @generated
		 */
		EEnum ASSET_TYPE = eINSTANCE.getAssetType();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.LegalEntityType <em>Legal Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.LegalEntityType
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLegalEntityType()
		 * @generated
		 */
		EEnum LEGAL_ENTITY_TYPE = eINSTANCE.getLegalEntityType();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.InputValueType <em>Input Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.InputValueType
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getInputValueType()
		 * @generated
		 */
		EEnum INPUT_VALUE_TYPE = eINSTANCE.getInputValueType();

	}

} //WrsPackage
