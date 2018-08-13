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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.LayoutableImpl <em>Layoutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.LayoutableImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLayoutable()
	 * @generated
	 */
	int LAYOUTABLE = 36;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AbstractAccountImpl <em>Abstract Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AbstractAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAbstractAccount()
	 * @generated
	 */
	int ABSTRACT_ACCOUNT = 18;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransferVaultImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransferVault()
	 * @generated
	 */
	int TRANSFER_VAULT = 2;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.WorldEconomyImpl <em>World Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.WorldEconomyImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getWorldEconomy()
	 * @generated
	 */
	int WORLD_ECONOMY = 5;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.NationalEconomyImpl <em>National Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.NationalEconomyImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNationalEconomy()
	 * @generated
	 */
	int NATIONAL_ECONOMY = 6;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.FiatCurrencyImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getFiatCurrency()
	 * @generated
	 */
	int FIAT_CURRENCY = 8;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__Y = 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__W = 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__H = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__ID = 5;

	/**
	 * The number of structural features of the '<em>Layoutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Layoutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Mainvault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__MAINVAULT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supplycontrol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__SUPPLYCONTROL = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__ALL_ACCOUNTS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registeredasstets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__REGISTEREDASSTETS = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Worldeconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__WORLDECONOMY = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__NODES = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alldentities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__ALLDENTITIES = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__ALL_TRANSACTIONS = LAYOUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Transaction Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__ALL_TRANSACTION_CONDITIONS = LAYOUTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transfervaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__TRANSFERVAULTS = LAYOUTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Genesis Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS__GENESIS_ACCOUNT = LAYOUTABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>WRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Create Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS___CREATE_IDENTITY = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>WRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__ASSETS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__TRANSACTION = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__TRANSACTIONS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__X = ABSTRACT_ACCOUNT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__Y = ABSTRACT_ACCOUNT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__W = ABSTRACT_ACCOUNT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__H = ABSTRACT_ACCOUNT__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__NAME = ABSTRACT_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREASURY__TRANSACTIONS = ABSTRACT_ACCOUNT__TRANSACTIONS;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__X = ABSTRACT_ACCOUNT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__Y = ABSTRACT_ACCOUNT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__W = ABSTRACT_ACCOUNT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__H = ABSTRACT_ACCOUNT__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__NAME = ABSTRACT_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULT__TRANSACTIONS = ABSTRACT_ACCOUNT__TRANSACTIONS;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.GenesisAccountImpl <em>Genesis Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.GenesisAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getGenesisAccount()
	 * @generated
	 */
	int GENESIS_ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__X = ABSTRACT_ACCOUNT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__Y = ABSTRACT_ACCOUNT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__W = ABSTRACT_ACCOUNT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__H = ABSTRACT_ACCOUNT__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__NAME = ABSTRACT_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT__TRANSACTIONS = ABSTRACT_ACCOUNT__TRANSACTIONS;

	/**
	 * The number of structural features of the '<em>Genesis Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Genesis Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS_ACCOUNT_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_TYPE = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MATERIALS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___REGISTER = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Nationaleconomies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__NATIONALECONOMIES = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statisticssource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__STATISTICSSOURCE = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statistic Datas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__STATISTIC_DATAS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY__COUNTRIES = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>World Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>World Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_ECONOMY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY__ID = LAYOUTABLE__ID;

	/**
	 * The number of structural features of the '<em>National Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>National Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_ECONOMY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Fiatcurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__FIATCURRENCY = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nationaleconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NATIONALECONOMY = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__REGIONS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY__ID = LAYOUTABLE__ID;

	/**
	 * The number of structural features of the '<em>Fiat Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fiat Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIAT_CURRENCY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__UUID = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__ALL_NODES = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__X = IDENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__Y = IDENTITY__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__W = IDENTITY__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__H = IDENTITY__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ID = IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>All Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ALL_NODES = IDENTITY__ALL_NODES;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BELONGS_TO = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thing Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__THING_ACCOUNTS = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.HumanEntityImpl <em>Human Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.HumanEntityImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getHumanEntity()
	 * @generated
	 */
	int HUMAN_ENTITY = 35;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__X = IDENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__Y = IDENTITY__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__W = IDENTITY__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__H = IDENTITY__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__ID = IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>All Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__ALL_NODES = IDENTITY__ALL_NODES;

	/**
	 * The feature id for the '<em><b>Worldeconomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY__WORLDECONOMY = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Human Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Human Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_ENTITY_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__X = HUMAN_ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__Y = HUMAN_ENTITY__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__W = HUMAN_ENTITY__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__H = HUMAN_ENTITY__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAME = HUMAN_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ID = HUMAN_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__UUID = HUMAN_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>All Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ALL_NODES = HUMAN_ENTITY__ALL_NODES;

	/**
	 * The feature id for the '<em><b>Worldeconomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__WORLDECONOMY = HUMAN_ENTITY__WORLDECONOMY;

	/**
	 * The feature id for the '<em><b>Works For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__WORKS_FOR = HUMAN_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legal Partner Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__LEGAL_PARTNER_OF = HUMAN_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__PRIVATE_ACCOUNTS = HUMAN_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = HUMAN_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = HUMAN_ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__X = HUMAN_ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__Y = HUMAN_ENTITY__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__W = HUMAN_ENTITY__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__H = HUMAN_ENTITY__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__NAME = HUMAN_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__ID = HUMAN_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__UUID = HUMAN_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>All Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__ALL_NODES = HUMAN_ENTITY__ALL_NODES;

	/**
	 * The feature id for the '<em><b>Worldeconomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__WORLDECONOMY = HUMAN_ENTITY__WORLDECONOMY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__TYPE = HUMAN_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__ACCOUNTS = HUMAN_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__BUSINESS_ACCOUNTS = HUMAN_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = HUMAN_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = HUMAN_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.PrivateAccountImpl <em>Private Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.PrivateAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getPrivateAccount()
	 * @generated
	 */
	int PRIVATE_ACCOUNT = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__X = ABSTRACT_ACCOUNT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__Y = ABSTRACT_ACCOUNT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__W = ABSTRACT_ACCOUNT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__H = ABSTRACT_ACCOUNT__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__NAME = ABSTRACT_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT__TRANSACTIONS = ABSTRACT_ACCOUNT__TRANSACTIONS;

	/**
	 * The number of structural features of the '<em>Private Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ACCOUNT_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Genesis Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__GENESIS_ACCOUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transfer Vaults</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__TRANSFER_VAULTS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Treasury</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL__TREASURY = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supply Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Supply Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_CONTROL_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.LayoutableContainerImpl <em>Layoutable Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.LayoutableContainerImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLayoutableContainer()
	 * @generated
	 */
	int LAYOUTABLE_CONTAINER = 41;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER__ID = LAYOUTABLE__ID;

	/**
	 * The number of structural features of the '<em>Layoutable Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Layoutable Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_CONTAINER_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION__ID = LAYOUTABLE__ID;

	/**
	 * The number of structural features of the '<em>Abstract Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSACTION_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__X = ABSTRACT_TRANSACTION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__Y = ABSTRACT_TRANSACTION__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__W = ABSTRACT_TRANSACTION__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__H = ABSTRACT_TRANSACTION__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NAME = ABSTRACT_TRANSACTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ID = ABSTRACT_TRANSACTION__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ASSETS = ABSTRACT_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA = ABSTRACT_TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nano Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NANO_TIME = ABSTRACT_TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AMOUNT = ABSTRACT_TRANSACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transactioncondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTIONCONDITION = ABSTRACT_TRANSACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = ABSTRACT_TRANSACTION_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registered Assets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Registered Assets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSETS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__X = ABSTRACT_TRANSACTION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__Y = ABSTRACT_TRANSACTION__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__W = ABSTRACT_TRANSACTION__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__H = ABSTRACT_TRANSACTION__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__NAME = ABSTRACT_TRANSACTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__ID = ABSTRACT_TRANSACTION__ID;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION__TRANSACTIONS = ABSTRACT_TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transaction Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_COLLECTION_FEATURE_COUNT = ABSTRACT_TRANSACTION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WEIGHT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networkengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NETWORKENGINE = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ACCOUNTS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE__ID = LAYOUTABLE__ID;

	/**
	 * The number of structural features of the '<em>Network Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENGINE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITIES_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AllTransactionsImpl <em>All Transactions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AllTransactionsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAllTransactions()
	 * @generated
	 */
	int ALL_TRANSACTIONS = 25;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Transactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Transactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTIONS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransactionsImpl <em>Transactions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransactionsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransactions()
	 * @generated
	 */
	int TRANSACTIONS = 39;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__X = ABSTRACT_ACCOUNT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__Y = ABSTRACT_ACCOUNT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__W = ABSTRACT_ACCOUNT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__H = ABSTRACT_ACCOUNT__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__NAME = ABSTRACT_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ACCOUNT__TRANSACTIONS = ABSTRACT_ACCOUNT__TRANSACTIONS;

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
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.AllTransactionConditionsImpl <em>All Transaction Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.AllTransactionConditionsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAllTransactionConditions()
	 * @generated
	 */
	int ALL_TRANSACTION_CONDITIONS = 28;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Transaction Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Transaction Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRANSACTION_CONDITIONS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__FORMULA = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signed Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION__SIGNED_INPUTS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transaction Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transaction Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONDITION_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__VARIABLE_NAME = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__IDENTITY = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__VALUE = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT__TYPE = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signed Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Signed Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INPUT_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Statisticssource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__STATISTICSSOURCE = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statistic Datas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statistic Datas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_DATAS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Regionaleconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__REGIONALECONOMY = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regionidentities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION__REGIONIDENTITIES = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Country Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Country Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_REGION_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Webservice Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE__WEBSERVICE_URL = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statistics Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statistics Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_SOURCE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.regionalEconomyImpl <em>regional Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.regionalEconomyImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getregionalEconomy()
	 * @generated
	 */
	int REGIONAL_ECONOMY = 37;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY__X = LAYOUTABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY__Y = LAYOUTABLE__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY__W = LAYOUTABLE__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY__H = LAYOUTABLE__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY__ID = LAYOUTABLE__ID;

	/**
	 * The number of structural features of the '<em>regional Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>regional Economy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_ECONOMY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.TransferVaultsImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransferVaults()
	 * @generated
	 */
	int TRANSFER_VAULTS = 38;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transfer Vaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfer Vaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_VAULTS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.RegionIdentitiesImpl <em>Region Identities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.RegionIdentitiesImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getRegionIdentities()
	 * @generated
	 */
	int REGION_IDENTITIES = 40;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__X = LAYOUTABLE_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__Y = LAYOUTABLE_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__W = LAYOUTABLE_CONTAINER__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__H = LAYOUTABLE_CONTAINER__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__NAME = LAYOUTABLE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__ID = LAYOUTABLE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES__CHILDREN = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Region Identities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES_FEATURE_COUNT = LAYOUTABLE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Region Identities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_IDENTITIES_OPERATION_COUNT = LAYOUTABLE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.BusinessAccountImpl <em>Business Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.BusinessAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getBusinessAccount()
	 * @generated
	 */
	int BUSINESS_ACCOUNT = 42;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__X = ABSTRACT_ACCOUNT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__Y = ABSTRACT_ACCOUNT__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__W = ABSTRACT_ACCOUNT__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__H = ABSTRACT_ACCOUNT__H;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__NAME = ABSTRACT_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__ASSETS = ABSTRACT_ACCOUNT__ASSETS;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__TRANSACTION = ABSTRACT_ACCOUNT__TRANSACTION;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT__TRANSACTIONS = ABSTRACT_ACCOUNT__TRANSACTIONS;

	/**
	 * The number of structural features of the '<em>Business Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACCOUNT_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.impl.ThingAccountImpl <em>Thing Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.impl.ThingAccountImpl
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getThingAccount()
	 * @generated
	 */
	int THING_ACCOUNT = 43;

	/**
	 * The number of structural features of the '<em>Thing Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ACCOUNT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Thing Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.AssetType <em>Asset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.AssetType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.LegalEntityType <em>Legal Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.LegalEntityType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLegalEntityType()
	 * @generated
	 */
	int LEGAL_ENTITY_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.InputValueType <em>Input Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.InputValueType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getInputValueType()
	 * @generated
	 */
	int INPUT_VALUE_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.wrs.model.wrs.AccountType <em>Account Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.model.wrs.AccountType
	 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAccountType()
	 * @generated
	 */
	int ACCOUNT_TYPE = 47;

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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getMainvault <em>Mainvault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainvault</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getAllAccounts <em>All Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Accounts</em>'.
	 * @see org.wrs.model.wrs.WRS#getAllAccounts()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_AllAccounts();

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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getAlldentities <em>Alldentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alldentities</em>'.
	 * @see org.wrs.model.wrs.WRS#getAlldentities()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Alldentities();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getAllTransactions <em>All Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Transactions</em>'.
	 * @see org.wrs.model.wrs.WRS#getAllTransactions()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_AllTransactions();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getAllTransactionConditions <em>All Transaction Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Transaction Conditions</em>'.
	 * @see org.wrs.model.wrs.WRS#getAllTransactionConditions()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_AllTransactionConditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getTransfervaults <em>Transfervaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfervaults</em>'.
	 * @see org.wrs.model.wrs.WRS#getTransfervaults()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_Transfervaults();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WRS#getGenesisAccount <em>Genesis Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Genesis Account</em>'.
	 * @see org.wrs.model.wrs.WRS#getGenesisAccount()
	 * @see #getWRS()
	 * @generated
	 */
	EReference getWRS_GenesisAccount();

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
	 * Returns the meta object for class '{@link org.wrs.model.wrs.GenesisAccount <em>Genesis Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genesis Account</em>'.
	 * @see org.wrs.model.wrs.GenesisAccount
	 * @generated
	 */
	EClass getGenesisAccount();

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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WorldEconomy#getStatisticDatas <em>Statistic Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic Datas</em>'.
	 * @see org.wrs.model.wrs.WorldEconomy#getStatisticDatas()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_StatisticDatas();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.WorldEconomy#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Countries</em>'.
	 * @see org.wrs.model.wrs.WorldEconomy#getCountries()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_Countries();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.NationalEconomy <em>National Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Economy</em>'.
	 * @see org.wrs.model.wrs.NationalEconomy
	 * @generated
	 */
	EClass getNationalEconomy();

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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.Country#getNationaleconomy <em>Nationaleconomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nationaleconomy</em>'.
	 * @see org.wrs.model.wrs.Country#getNationaleconomy()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Nationaleconomy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Country#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
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
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.Identity#getAllNodes <em>All Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Nodes</em>'.
	 * @see org.wrs.model.wrs.Identity#getAllNodes()
	 * @see #getIdentity()
	 * @generated
	 */
	EReference getIdentity_AllNodes();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Thing#getThingAccounts <em>Thing Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thing Accounts</em>'.
	 * @see org.wrs.model.wrs.Thing#getThingAccounts()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_ThingAccounts();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Individual#getPrivateAccounts <em>Private Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private Accounts</em>'.
	 * @see org.wrs.model.wrs.Individual#getPrivateAccounts()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_PrivateAccounts();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.LegalEntity#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see org.wrs.model.wrs.LegalEntity#getAccounts()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EReference getLegalEntity_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.LegalEntity#getBusinessAccounts <em>Business Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Accounts</em>'.
	 * @see org.wrs.model.wrs.LegalEntity#getBusinessAccounts()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EReference getLegalEntity_BusinessAccounts();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.PrivateAccount <em>Private Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Account</em>'.
	 * @see org.wrs.model.wrs.PrivateAccount
	 * @generated
	 */
	EClass getPrivateAccount();

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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.SupplyControl#getGenesisAccount <em>Genesis Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Genesis Account</em>'.
	 * @see org.wrs.model.wrs.SupplyControl#getGenesisAccount()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_GenesisAccount();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.SupplyControl#getTransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfer Vaults</em>'.
	 * @see org.wrs.model.wrs.SupplyControl#getTransferVaults()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_TransferVaults();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.SupplyControl#getTreasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treasury</em>'.
	 * @see org.wrs.model.wrs.SupplyControl#getTreasury()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_Treasury();

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
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Accounts#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
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
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Transaction#getNanoTime <em>Nano Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nano Time</em>'.
	 * @see org.wrs.model.wrs.Transaction#getNanoTime()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_NanoTime();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Transaction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.wrs.model.wrs.Transaction#getAmount()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Amount();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.Transaction#getTransactioncondition <em>Transactioncondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transactioncondition</em>'.
	 * @see org.wrs.model.wrs.Transaction#getTransactioncondition()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Transactioncondition();

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
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.AbstractAccount#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transaction</em>'.
	 * @see org.wrs.model.wrs.AbstractAccount#getTransaction()
	 * @see #getAbstractAccount()
	 * @generated
	 */
	EReference getAbstractAccount_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.AbstractAccount#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transactions</em>'.
	 * @see org.wrs.model.wrs.AbstractAccount#getTransactions()
	 * @see #getAbstractAccount()
	 * @generated
	 */
	EReference getAbstractAccount_Transactions();

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
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.TransactionCollection#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see org.wrs.model.wrs.TransactionCollection#getTransactions()
	 * @see #getTransactionCollection()
	 * @generated
	 */
	EReference getTransactionCollection_Transactions();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Node#getNodeAccounts <em>Node Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Accounts</em>'.
	 * @see org.wrs.model.wrs.Node#getNodeAccounts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NodeAccounts();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Countries#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.Countries#getChildren()
	 * @see #getCountries()
	 * @generated
	 */
	EReference getCountries_Children();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.Nodes#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
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
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.Identities#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.Identities#getChildren()
	 * @see #getIdentities()
	 * @generated
	 */
	EReference getIdentities_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.AllTransactions <em>All Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Transactions</em>'.
	 * @see org.wrs.model.wrs.AllTransactions
	 * @generated
	 */
	EClass getAllTransactions();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.AllTransactions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.AllTransactions#getChildren()
	 * @see #getAllTransactions()
	 * @generated
	 */
	EReference getAllTransactions_Children();

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
	 * Returns the meta object for class '{@link org.wrs.model.wrs.RegionIdentities <em>Region Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Identities</em>'.
	 * @see org.wrs.model.wrs.RegionIdentities
	 * @generated
	 */
	EClass getRegionIdentities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.RegionIdentities#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.RegionIdentities#getChildren()
	 * @see #getRegionIdentities()
	 * @generated
	 */
	EReference getRegionIdentities_Children();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.LayoutableContainer <em>Layoutable Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layoutable Container</em>'.
	 * @see org.wrs.model.wrs.LayoutableContainer
	 * @generated
	 */
	EClass getLayoutableContainer();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.BusinessAccount <em>Business Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Account</em>'.
	 * @see org.wrs.model.wrs.BusinessAccount
	 * @generated
	 */
	EClass getBusinessAccount();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.ThingAccount <em>Thing Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Account</em>'.
	 * @see org.wrs.model.wrs.ThingAccount
	 * @generated
	 */
	EClass getThingAccount();

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
	 * Returns the meta object for class '{@link org.wrs.model.wrs.AllTransactionConditions <em>All Transaction Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Transaction Conditions</em>'.
	 * @see org.wrs.model.wrs.AllTransactionConditions
	 * @generated
	 */
	EClass getAllTransactionConditions();

	/**
	 * Returns the meta object for the reference list '{@link org.wrs.model.wrs.AllTransactionConditions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.AllTransactionConditions#getChildren()
	 * @see #getAllTransactionConditions()
	 * @generated
	 */
	EReference getAllTransactionConditions_Children();

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
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.Statistics#getStatisticssource <em>Statisticssource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statisticssource</em>'.
	 * @see org.wrs.model.wrs.Statistics#getStatisticssource()
	 * @see #getStatistics()
	 * @generated
	 */
	EReference getStatistics_Statisticssource();

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
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.StatisticDatas#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.CountryRegion#getRegionaleconomy <em>Regionaleconomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regionaleconomy</em>'.
	 * @see org.wrs.model.wrs.CountryRegion#getRegionaleconomy()
	 * @see #getCountryRegion()
	 * @generated
	 */
	EReference getCountryRegion_Regionaleconomy();

	/**
	 * Returns the meta object for the containment reference '{@link org.wrs.model.wrs.CountryRegion#getRegionidentities <em>Regionidentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regionidentities</em>'.
	 * @see org.wrs.model.wrs.CountryRegion#getRegionidentities()
	 * @see #getCountryRegion()
	 * @generated
	 */
	EReference getCountryRegion_Regionidentities();

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
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.StatisticsSource#getWebserviceUrl <em>Webservice Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webservice Url</em>'.
	 * @see org.wrs.model.wrs.StatisticsSource#getWebserviceUrl()
	 * @see #getStatisticsSource()
	 * @generated
	 */
	EAttribute getStatisticsSource_WebserviceUrl();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.HumanEntity <em>Human Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Entity</em>'.
	 * @see org.wrs.model.wrs.HumanEntity
	 * @generated
	 */
	EClass getHumanEntity();

	/**
	 * Returns the meta object for the reference '{@link org.wrs.model.wrs.HumanEntity#getWorldeconomy <em>Worldeconomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worldeconomy</em>'.
	 * @see org.wrs.model.wrs.HumanEntity#getWorldeconomy()
	 * @see #getHumanEntity()
	 * @generated
	 */
	EReference getHumanEntity_Worldeconomy();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.Layoutable <em>Layoutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layoutable</em>'.
	 * @see org.wrs.model.wrs.Layoutable
	 * @generated
	 */
	EClass getLayoutable();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Layoutable#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.wrs.model.wrs.Layoutable#getX()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_X();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Layoutable#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.wrs.model.wrs.Layoutable#getY()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Layoutable#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see org.wrs.model.wrs.Layoutable#getW()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_W();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Layoutable#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.wrs.model.wrs.Layoutable#getH()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_H();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Layoutable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wrs.model.wrs.Layoutable#getName()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.wrs.model.wrs.Layoutable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wrs.model.wrs.Layoutable#getId()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Id();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.regionalEconomy <em>regional Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>regional Economy</em>'.
	 * @see org.wrs.model.wrs.regionalEconomy
	 * @generated
	 */
	EClass getregionalEconomy();

	/**
	 * Returns the meta object for class '{@link org.wrs.model.wrs.TransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vaults</em>'.
	 * @see org.wrs.model.wrs.TransferVaults
	 * @generated
	 */
	EClass getTransferVaults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wrs.model.wrs.TransferVaults#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wrs.model.wrs.TransferVaults#getChildren()
	 * @see #getTransferVaults()
	 * @generated
	 */
	EReference getTransferVaults_Children();

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
	 * Returns the meta object for enum '{@link org.wrs.model.wrs.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Type</em>'.
	 * @see org.wrs.model.wrs.AccountType
	 * @generated
	 */
	EEnum getAccountType();

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
		 * The meta object literal for the '<em><b>Mainvault</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>All Accounts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__ALL_ACCOUNTS = eINSTANCE.getWRS_AllAccounts();

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
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__NODES = eINSTANCE.getWRS_Nodes();

		/**
		 * The meta object literal for the '<em><b>Alldentities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__ALLDENTITIES = eINSTANCE.getWRS_Alldentities();

		/**
		 * The meta object literal for the '<em><b>All Transactions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__ALL_TRANSACTIONS = eINSTANCE.getWRS_AllTransactions();

		/**
		 * The meta object literal for the '<em><b>All Transaction Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__ALL_TRANSACTION_CONDITIONS = eINSTANCE.getWRS_AllTransactionConditions();

		/**
		 * The meta object literal for the '<em><b>Transfervaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__TRANSFERVAULTS = eINSTANCE.getWRS_Transfervaults();

		/**
		 * The meta object literal for the '<em><b>Genesis Account</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRS__GENESIS_ACCOUNT = eINSTANCE.getWRS_GenesisAccount();

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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.GenesisAccountImpl <em>Genesis Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.GenesisAccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getGenesisAccount()
		 * @generated
		 */
		EClass GENESIS_ACCOUNT = eINSTANCE.getGenesisAccount();

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
		 * The meta object literal for the '<em><b>Statistic Datas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_ECONOMY__STATISTIC_DATAS = eINSTANCE.getWorldEconomy_StatisticDatas();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_ECONOMY__COUNTRIES = eINSTANCE.getWorldEconomy_Countries();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.NationalEconomyImpl <em>National Economy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.NationalEconomyImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getNationalEconomy()
		 * @generated
		 */
		EClass NATIONAL_ECONOMY = eINSTANCE.getNationalEconomy();

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
		 * The meta object literal for the '<em><b>Nationaleconomy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__NATIONALECONOMY = eINSTANCE.getCountry_Nationaleconomy();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>All Nodes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY__ALL_NODES = eINSTANCE.getIdentity_AllNodes();

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
		 * The meta object literal for the '<em><b>Thing Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__THING_ACCOUNTS = eINSTANCE.getThing_ThingAccounts();

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
		 * The meta object literal for the '<em><b>Private Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__PRIVATE_ACCOUNTS = eINSTANCE.getIndividual_PrivateAccounts();

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
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY__ACCOUNTS = eINSTANCE.getLegalEntity_Accounts();

		/**
		 * The meta object literal for the '<em><b>Business Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY__BUSINESS_ACCOUNTS = eINSTANCE.getLegalEntity_BusinessAccounts();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.PrivateAccountImpl <em>Private Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.PrivateAccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getPrivateAccount()
		 * @generated
		 */
		EClass PRIVATE_ACCOUNT = eINSTANCE.getPrivateAccount();

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
		 * The meta object literal for the '<em><b>Genesis Account</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CONTROL__GENESIS_ACCOUNT = eINSTANCE.getSupplyControl_GenesisAccount();

		/**
		 * The meta object literal for the '<em><b>Transfer Vaults</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CONTROL__TRANSFER_VAULTS = eINSTANCE.getSupplyControl_TransferVaults();

		/**
		 * The meta object literal for the '<em><b>Treasury</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY_CONTROL__TREASURY = eINSTANCE.getSupplyControl_Treasury();

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
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DATA = eINSTANCE.getTransaction_Data();

		/**
		 * The meta object literal for the '<em><b>Nano Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__NANO_TIME = eINSTANCE.getTransaction_NanoTime();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__AMOUNT = eINSTANCE.getTransaction_Amount();

		/**
		 * The meta object literal for the '<em><b>Transactioncondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__TRANSACTIONCONDITION = eINSTANCE.getTransaction_Transactioncondition();

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
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACCOUNT__TRANSACTION = eINSTANCE.getAbstractAccount_Transaction();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACCOUNT__TRANSACTIONS = eINSTANCE.getAbstractAccount_Transactions();

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
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_COLLECTION__TRANSACTIONS = eINSTANCE.getTransactionCollection_Transactions();

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
		 * The meta object literal for the '<em><b>Node Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_ACCOUNTS = eINSTANCE.getNode_NodeAccounts();

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
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRIES__CHILDREN = eINSTANCE.getCountries_Children();

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
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITIES__CHILDREN = eINSTANCE.getIdentities_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AllTransactionsImpl <em>All Transactions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AllTransactionsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAllTransactions()
		 * @generated
		 */
		EClass ALL_TRANSACTIONS = eINSTANCE.getAllTransactions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_TRANSACTIONS__CHILDREN = eINSTANCE.getAllTransactions_Children();

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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.RegionIdentitiesImpl <em>Region Identities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.RegionIdentitiesImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getRegionIdentities()
		 * @generated
		 */
		EClass REGION_IDENTITIES = eINSTANCE.getRegionIdentities();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_IDENTITIES__CHILDREN = eINSTANCE.getRegionIdentities_Children();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.LayoutableContainerImpl <em>Layoutable Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.LayoutableContainerImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLayoutableContainer()
		 * @generated
		 */
		EClass LAYOUTABLE_CONTAINER = eINSTANCE.getLayoutableContainer();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.BusinessAccountImpl <em>Business Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.BusinessAccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getBusinessAccount()
		 * @generated
		 */
		EClass BUSINESS_ACCOUNT = eINSTANCE.getBusinessAccount();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.ThingAccountImpl <em>Thing Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.ThingAccountImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getThingAccount()
		 * @generated
		 */
		EClass THING_ACCOUNT = eINSTANCE.getThingAccount();

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
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.AllTransactionConditionsImpl <em>All Transaction Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.AllTransactionConditionsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAllTransactionConditions()
		 * @generated
		 */
		EClass ALL_TRANSACTION_CONDITIONS = eINSTANCE.getAllTransactionConditions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_TRANSACTION_CONDITIONS__CHILDREN = eINSTANCE.getAllTransactionConditions_Children();

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
		 * The meta object literal for the '<em><b>Statisticssource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS__STATISTICSSOURCE = eINSTANCE.getStatistics_Statisticssource();

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
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Regionaleconomy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_REGION__REGIONALECONOMY = eINSTANCE.getCountryRegion_Regionaleconomy();

		/**
		 * The meta object literal for the '<em><b>Regionidentities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_REGION__REGIONIDENTITIES = eINSTANCE.getCountryRegion_Regionidentities();

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
		 * The meta object literal for the '<em><b>Webservice Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS_SOURCE__WEBSERVICE_URL = eINSTANCE.getStatisticsSource_WebserviceUrl();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.HumanEntityImpl <em>Human Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.HumanEntityImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getHumanEntity()
		 * @generated
		 */
		EClass HUMAN_ENTITY = eINSTANCE.getHumanEntity();

		/**
		 * The meta object literal for the '<em><b>Worldeconomy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_ENTITY__WORLDECONOMY = eINSTANCE.getHumanEntity_Worldeconomy();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.LayoutableImpl <em>Layoutable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.LayoutableImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getLayoutable()
		 * @generated
		 */
		EClass LAYOUTABLE = eINSTANCE.getLayoutable();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__X = eINSTANCE.getLayoutable_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__Y = eINSTANCE.getLayoutable_Y();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__W = eINSTANCE.getLayoutable_W();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__H = eINSTANCE.getLayoutable_H();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__NAME = eINSTANCE.getLayoutable_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__ID = eINSTANCE.getLayoutable_Id();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.regionalEconomyImpl <em>regional Economy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.regionalEconomyImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getregionalEconomy()
		 * @generated
		 */
		EClass REGIONAL_ECONOMY = eINSTANCE.getregionalEconomy();

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.impl.TransferVaultsImpl
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getTransferVaults()
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

		/**
		 * The meta object literal for the '{@link org.wrs.model.wrs.AccountType <em>Account Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wrs.model.wrs.AccountType
		 * @see org.wrs.model.wrs.impl.WrsPackageImpl#getAccountType()
		 * @generated
		 */
		EEnum ACCOUNT_TYPE = eINSTANCE.getAccountType();

	}

} //WrsPackage
