/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

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
 * @see org.worldreservesystem.WorldreservesystemFactory
 * @model kind="package"
 * @generated
 */
public interface WorldreservesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org.worldreservesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.worldreservesystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.worldreservesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorldreservesystemPackage eINSTANCE = org.worldreservesystem.impl.WorldreservesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.worldreservesystem.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.IdentityImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentity()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.WorldReserveSystemImpl <em>World Reserve System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.WorldReserveSystemImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldReserveSystem()
	 * @generated
	 */
	int WORLD_RESERVE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__UUID = IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Transfervaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__TRANSFERVAULTS = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mainvault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__MAINVAULT = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__IDENTITIES = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supplycontrol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__SUPPLYCONTROL = IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wallets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__WALLETS = IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Registeredasstets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS = IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>World Reserve System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM___CREATE_IDENTITY = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>World Reserve System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.worldreservesystem.impl.AbstractVaultImpl <em>Abstract Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.AbstractVaultImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAbstractVault()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.TreasuryImpl <em>Treasury</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.TreasuryImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTreasury()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.TransferVaultImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVault()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.TransferVaultsImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVaults()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.GenesisImpl <em>Genesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.GenesisImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getGenesis()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.AssetImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAsset()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.WorldEconomyImpl <em>World Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.WorldEconomyImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldEconomy()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.NationalEconomiesImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNationalEconomies()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.NationImpl <em>Nation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.NationImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNation()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.FiatCurrencyImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getFiatCurrency()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.AccountantsImpl <em>Accountants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.AccountantsImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountants()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.AccountantImpl <em>Accountant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.AccountantImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountant()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.MaterialImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getMaterial()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.IndividualImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getIndividual()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.LegalEntityImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getLegalEntity()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.IdentitiesImpl <em>Identities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.IdentitiesImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentities()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.AccountImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccount()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.SupplyControlImpl <em>Supply Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.SupplyControlImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getSupplyControl()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.AccountsImpl <em>Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.AccountsImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccounts()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.TransactionImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransaction()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.RegisteredAsstetsImpl <em>Registered Asstets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.RegisteredAsstetsImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getRegisteredAsstets()
	 * @generated
	 */
	int REGISTERED_ASSTETS = 21;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSTETS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Registered Asstets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSTETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Registered Asstets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_ASSTETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.worldreservesystem.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.TransactionCollectionImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransactionCollection()
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
	 * The meta object id for the '{@link org.worldreservesystem.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.NodeImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 24;

	/**
	 * The feature id for the '<em><b>Worldreservesystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WORLDRESERVESYSTEM = 0;

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
	 * The meta object id for the '{@link org.worldreservesystem.impl.NetworkEngineImpl <em>Network Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.impl.NetworkEngineImpl
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNetworkEngine()
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
	 * The meta object id for the '{@link org.worldreservesystem.AssetType <em>Asset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.worldreservesystem.AssetType
	 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 26;

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.WorldReserveSystem <em>World Reserve System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Reserve System</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem
	 * @generated
	 */
	EClass getWorldReserveSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.WorldReserveSystem#getTransfervaults <em>Transfervaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfervaults</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem#getTransfervaults()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Transfervaults();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.WorldReserveSystem#getMainvault <em>Mainvault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainvault</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem#getMainvault()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Mainvault();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.WorldReserveSystem#getIdentities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identities</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem#getIdentities()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Identities();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.WorldReserveSystem#getSupplycontrol <em>Supplycontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplycontrol</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem#getSupplycontrol()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Supplycontrol();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.WorldReserveSystem#getWallets <em>Wallets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wallets</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem#getWallets()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Wallets();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.WorldReserveSystem#getRegisteredasstets <em>Registeredasstets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registeredasstets</em>'.
	 * @see org.worldreservesystem.WorldReserveSystem#getRegisteredasstets()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Registeredasstets();

	/**
	 * Returns the meta object for the '{@link org.worldreservesystem.WorldReserveSystem#createIdentity() <em>Create Identity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Identity</em>' operation.
	 * @see org.worldreservesystem.WorldReserveSystem#createIdentity()
	 * @generated
	 */
	EOperation getWorldReserveSystem__CreateIdentity();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Treasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treasury</em>'.
	 * @see org.worldreservesystem.Treasury
	 * @generated
	 */
	EClass getTreasury();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vault</em>'.
	 * @see org.worldreservesystem.TransferVault
	 * @generated
	 */
	EClass getTransferVault();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.TransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vaults</em>'.
	 * @see org.worldreservesystem.TransferVaults
	 * @generated
	 */
	EClass getTransferVaults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.worldreservesystem.TransferVaults#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.worldreservesystem.TransferVaults#getChildren()
	 * @see #getTransferVaults()
	 * @generated
	 */
	EReference getTransferVaults_Children();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genesis</em>'.
	 * @see org.worldreservesystem.Genesis
	 * @generated
	 */
	EClass getGenesis();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.Genesis#getTreasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treasury</em>'.
	 * @see org.worldreservesystem.Genesis#getTreasury()
	 * @see #getGenesis()
	 * @generated
	 */
	EReference getGenesis_Treasury();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.worldreservesystem.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.worldreservesystem.Asset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see org.worldreservesystem.Asset#getAssetType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetType();

	/**
	 * Returns the meta object for the reference list '{@link org.worldreservesystem.Asset#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Materials</em>'.
	 * @see org.worldreservesystem.Asset#getMaterials()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Materials();

	/**
	 * Returns the meta object for the '{@link org.worldreservesystem.Asset#register() <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see org.worldreservesystem.Asset#register()
	 * @generated
	 */
	EOperation getAsset__Register();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Economy</em>'.
	 * @see org.worldreservesystem.WorldEconomy
	 * @generated
	 */
	EClass getWorldEconomy();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nationaleconomies</em>'.
	 * @see org.worldreservesystem.WorldEconomy#getNationaleconomies()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_Nationaleconomies();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Economies</em>'.
	 * @see org.worldreservesystem.NationalEconomies
	 * @generated
	 */
	EClass getNationalEconomies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.worldreservesystem.NationalEconomies#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.worldreservesystem.NationalEconomies#getChildren()
	 * @see #getNationalEconomies()
	 * @generated
	 */
	EReference getNationalEconomies_Children();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Nation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nation</em>'.
	 * @see org.worldreservesystem.Nation
	 * @generated
	 */
	EClass getNation();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.Nation#getFiatcurrency <em>Fiatcurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fiatcurrency</em>'.
	 * @see org.worldreservesystem.Nation#getFiatcurrency()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Fiatcurrency();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiat Currency</em>'.
	 * @see org.worldreservesystem.FiatCurrency
	 * @generated
	 */
	EClass getFiatCurrency();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Accountants <em>Accountants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accountants</em>'.
	 * @see org.worldreservesystem.Accountants
	 * @generated
	 */
	EClass getAccountants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.worldreservesystem.Accountants#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.worldreservesystem.Accountants#getChildren()
	 * @see #getAccountants()
	 * @generated
	 */
	EReference getAccountants_Children();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Accountant <em>Accountant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accountant</em>'.
	 * @see org.worldreservesystem.Accountant
	 * @generated
	 */
	EClass getAccountant();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.worldreservesystem.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.worldreservesystem.Identity#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.worldreservesystem.Identity#getUUID()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_UUID();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see org.worldreservesystem.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.Material#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.worldreservesystem.Material#getBelongsTo()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_BelongsTo();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see org.worldreservesystem.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see org.worldreservesystem.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identities</em>'.
	 * @see org.worldreservesystem.Identities
	 * @generated
	 */
	EClass getIdentities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.worldreservesystem.Identities#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.worldreservesystem.Identities#getChildren()
	 * @see #getIdentities()
	 * @generated
	 */
	EReference getIdentities_Children();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.worldreservesystem.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.worldreservesystem.Account#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see org.worldreservesystem.Account#getPublicKey()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_PublicKey();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.Account#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.worldreservesystem.Account#getBelongsTo()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_BelongsTo();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Control</em>'.
	 * @see org.worldreservesystem.SupplyControl
	 * @generated
	 */
	EClass getSupplyControl();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.SupplyControl#getGenesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Genesis</em>'.
	 * @see org.worldreservesystem.SupplyControl#getGenesis()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_Genesis();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Accounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounts</em>'.
	 * @see org.worldreservesystem.Accounts
	 * @generated
	 */
	EClass getAccounts();

	/**
	 * Returns the meta object for the reference list '{@link org.worldreservesystem.Accounts#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.worldreservesystem.Accounts#getChildren()
	 * @see #getAccounts()
	 * @generated
	 */
	EReference getAccounts_Children();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.worldreservesystem.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.Transaction#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assets</em>'.
	 * @see org.worldreservesystem.Transaction#getAssets()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Assets();

	/**
	 * Returns the meta object for the reference list '{@link org.worldreservesystem.Transaction#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see org.worldreservesystem.Transaction#getTransactions()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Transactions();

	/**
	 * Returns the meta object for the attribute '{@link org.worldreservesystem.Transaction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.worldreservesystem.Transaction#getData()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Data();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.RegisteredAsstets <em>Registered Asstets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Asstets</em>'.
	 * @see org.worldreservesystem.RegisteredAsstets
	 * @generated
	 */
	EClass getRegisteredAsstets();

	/**
	 * Returns the meta object for the reference list '{@link org.worldreservesystem.RegisteredAsstets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.worldreservesystem.RegisteredAsstets#getChildren()
	 * @see #getRegisteredAsstets()
	 * @generated
	 */
	EReference getRegisteredAsstets_Children();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.AbstractVault <em>Abstract Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Vault</em>'.
	 * @see org.worldreservesystem.AbstractVault
	 * @generated
	 */
	EClass getAbstractVault();

	/**
	 * Returns the meta object for the reference list '{@link org.worldreservesystem.AbstractVault#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see org.worldreservesystem.AbstractVault#getAssets()
	 * @see #getAbstractVault()
	 * @generated
	 */
	EReference getAbstractVault_Assets();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.AbstractVault#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see org.worldreservesystem.AbstractVault#getTransaction()
	 * @see #getAbstractVault()
	 * @generated
	 */
	EReference getAbstractVault_Transaction();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Collection</em>'.
	 * @see org.worldreservesystem.TransactionCollection
	 * @generated
	 */
	EClass getTransactionCollection();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.worldreservesystem.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.worldreservesystem.Node#getWorldreservesystem <em>Worldreservesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worldreservesystem</em>'.
	 * @see org.worldreservesystem.Node#getWorldreservesystem()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Worldreservesystem();

	/**
	 * Returns the meta object for the attribute '{@link org.worldreservesystem.Node#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.worldreservesystem.Node#getWeight()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.worldreservesystem.Node#getNetworkengine <em>Networkengine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networkengine</em>'.
	 * @see org.worldreservesystem.Node#getNetworkengine()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Networkengine();

	/**
	 * Returns the meta object for class '{@link org.worldreservesystem.NetworkEngine <em>Network Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Engine</em>'.
	 * @see org.worldreservesystem.NetworkEngine
	 * @generated
	 */
	EClass getNetworkEngine();

	/**
	 * Returns the meta object for enum '{@link org.worldreservesystem.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Type</em>'.
	 * @see org.worldreservesystem.AssetType
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
	WorldreservesystemFactory getWorldreservesystemFactory();

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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.WorldReserveSystemImpl <em>World Reserve System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.WorldReserveSystemImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldReserveSystem()
		 * @generated
		 */
		EClass WORLD_RESERVE_SYSTEM = eINSTANCE.getWorldReserveSystem();

		/**
		 * The meta object literal for the '<em><b>Transfervaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_RESERVE_SYSTEM__TRANSFERVAULTS = eINSTANCE.getWorldReserveSystem_Transfervaults();

		/**
		 * The meta object literal for the '<em><b>Mainvault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_RESERVE_SYSTEM__MAINVAULT = eINSTANCE.getWorldReserveSystem_Mainvault();

		/**
		 * The meta object literal for the '<em><b>Identities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_RESERVE_SYSTEM__IDENTITIES = eINSTANCE.getWorldReserveSystem_Identities();

		/**
		 * The meta object literal for the '<em><b>Supplycontrol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_RESERVE_SYSTEM__SUPPLYCONTROL = eINSTANCE.getWorldReserveSystem_Supplycontrol();

		/**
		 * The meta object literal for the '<em><b>Wallets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_RESERVE_SYSTEM__WALLETS = eINSTANCE.getWorldReserveSystem_Wallets();

		/**
		 * The meta object literal for the '<em><b>Registeredasstets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS = eINSTANCE.getWorldReserveSystem_Registeredasstets();

		/**
		 * The meta object literal for the '<em><b>Create Identity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORLD_RESERVE_SYSTEM___CREATE_IDENTITY = eINSTANCE.getWorldReserveSystem__CreateIdentity();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.TreasuryImpl <em>Treasury</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.TreasuryImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTreasury()
		 * @generated
		 */
		EClass TREASURY = eINSTANCE.getTreasury();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.TransferVaultImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVault()
		 * @generated
		 */
		EClass TRANSFER_VAULT = eINSTANCE.getTransferVault();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.TransferVaultsImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVaults()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.GenesisImpl <em>Genesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.GenesisImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getGenesis()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.AssetImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAsset()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.WorldEconomyImpl <em>World Economy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.WorldEconomyImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldEconomy()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.NationalEconomiesImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNationalEconomies()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.NationImpl <em>Nation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.NationImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNation()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.FiatCurrencyImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getFiatCurrency()
		 * @generated
		 */
		EClass FIAT_CURRENCY = eINSTANCE.getFiatCurrency();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.AccountantsImpl <em>Accountants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.AccountantsImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountants()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.AccountantImpl <em>Accountant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.AccountantImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountant()
		 * @generated
		 */
		EClass ACCOUNTANT = eINSTANCE.getAccountant();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.IdentityImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentity()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.MaterialImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getMaterial()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.IndividualImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.LegalEntityImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.IdentitiesImpl <em>Identities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.IdentitiesImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentities()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.AccountImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccount()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.SupplyControlImpl <em>Supply Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.SupplyControlImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getSupplyControl()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.AccountsImpl <em>Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.AccountsImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAccounts()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.TransactionImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransaction()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.RegisteredAsstetsImpl <em>Registered Asstets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.RegisteredAsstetsImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getRegisteredAsstets()
		 * @generated
		 */
		EClass REGISTERED_ASSTETS = eINSTANCE.getRegisteredAsstets();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_ASSTETS__CHILDREN = eINSTANCE.getRegisteredAsstets_Children();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.AbstractVaultImpl <em>Abstract Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.AbstractVaultImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAbstractVault()
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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.TransactionCollectionImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getTransactionCollection()
		 * @generated
		 */
		EClass TRANSACTION_COLLECTION = eINSTANCE.getTransactionCollection();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.NodeImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Worldreservesystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__WORLDRESERVESYSTEM = eINSTANCE.getNode_Worldreservesystem();

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
		 * The meta object literal for the '{@link org.worldreservesystem.impl.NetworkEngineImpl <em>Network Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.impl.NetworkEngineImpl
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getNetworkEngine()
		 * @generated
		 */
		EClass NETWORK_ENGINE = eINSTANCE.getNetworkEngine();

		/**
		 * The meta object literal for the '{@link org.worldreservesystem.AssetType <em>Asset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.worldreservesystem.AssetType
		 * @see org.worldreservesystem.impl.WorldreservesystemPackageImpl#getAssetType()
		 * @generated
		 */
		EEnum ASSET_TYPE = eINSTANCE.getAssetType();

	}

} //WorldreservesystemPackage
