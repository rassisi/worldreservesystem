/**
 */
package worldreservesystem;

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
 * @see worldreservesystem.WorldreservesystemFactory
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
	String eNAME = "worldreservesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/worldreservesystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "worldreservesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorldreservesystemPackage eINSTANCE = worldreservesystem.impl.WorldreservesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.IdentityImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentity()
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
	 * The meta object id for the '{@link worldreservesystem.impl.WorldReserveSystemImpl <em>World Reserve System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.WorldReserveSystemImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldReserveSystem()
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
	 * The number of operations of the '<em>World Reserve System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_RESERVE_SYSTEM_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.AbstractVaultImpl <em>Abstract Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.AbstractVaultImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAbstractVault()
	 * @generated
	 */
	int ABSTRACT_VAULT = 23;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT__ASSETS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.MainVaultImpl <em>Main Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.MainVaultImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getMainVault()
	 * @generated
	 */
	int MAIN_VAULT = 1;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_VAULT__ASSETS = ABSTRACT_VAULT__ASSETS;

	/**
	 * The number of structural features of the '<em>Main Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_VAULT_FEATURE_COUNT = ABSTRACT_VAULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Vault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_VAULT_OPERATION_COUNT = ABSTRACT_VAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.TransferVaultImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVault()
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
	 * The meta object id for the '{@link worldreservesystem.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.TransferVaultsImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVaults()
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
	 * The meta object id for the '{@link worldreservesystem.impl.GenesisImpl <em>Genesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.GenesisImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getGenesis()
	 * @generated
	 */
	int GENESIS = 4;

	/**
	 * The feature id for the '<em><b>Mainvault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENESIS__MAINVAULT = 0;

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
	 * The meta object id for the '{@link worldreservesystem.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.AssetImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAsset()
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
	 * The meta object id for the '{@link worldreservesystem.impl.WorldEconomyImpl <em>World Economy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.WorldEconomyImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldEconomy()
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
	 * The meta object id for the '{@link worldreservesystem.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.NationalEconomiesImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getNationalEconomies()
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
	 * The meta object id for the '{@link worldreservesystem.impl.NationImpl <em>Nation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.NationImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getNation()
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
	 * The meta object id for the '{@link worldreservesystem.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.FiatCurrencyImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getFiatCurrency()
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
	 * The meta object id for the '{@link worldreservesystem.impl.AccountantsImpl <em>Accountants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.AccountantsImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountants()
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
	 * The meta object id for the '{@link worldreservesystem.impl.AccountantImpl <em>Accountant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.AccountantImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountant()
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
	 * The meta object id for the '{@link worldreservesystem.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.MaterialImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getMaterial()
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
	 * The meta object id for the '{@link worldreservesystem.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.IndividualImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getIndividual()
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
	 * The meta object id for the '{@link worldreservesystem.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.LegalEntityImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getLegalEntity()
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
	 * The meta object id for the '{@link worldreservesystem.impl.NewEClass17Impl <em>New EClass17</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.NewEClass17Impl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getNewEClass17()
	 * @generated
	 */
	int NEW_ECLASS17 = 16;

	/**
	 * The number of structural features of the '<em>New EClass17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS17_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS17_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.IdentitiesImpl <em>Identities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.IdentitiesImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentities()
	 * @generated
	 */
	int IDENTITIES = 17;

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
	 * The meta object id for the '{@link worldreservesystem.impl.WalletImpl <em>Wallet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.WalletImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWallet()
	 * @generated
	 */
	int WALLET = 18;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__ASSETS = ABSTRACT_VAULT__ASSETS;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__PUBLIC_KEY = ABSTRACT_VAULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__BELONGS_TO = ABSTRACT_VAULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_FEATURE_COUNT = ABSTRACT_VAULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_OPERATION_COUNT = ABSTRACT_VAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.SupplyControlImpl <em>Supply Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.SupplyControlImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getSupplyControl()
	 * @generated
	 */
	int SUPPLY_CONTROL = 19;

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
	 * The meta object id for the '{@link worldreservesystem.impl.WalletsImpl <em>Wallets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.WalletsImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWallets()
	 * @generated
	 */
	int WALLETS = 20;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLETS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Wallets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wallets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link worldreservesystem.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.TransactionImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 21;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ASSETS = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TO = 2;

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
	 * The meta object id for the '{@link worldreservesystem.impl.RegisteredAsstetsImpl <em>Registered Asstets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.RegisteredAsstetsImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getRegisteredAsstets()
	 * @generated
	 */
	int REGISTERED_ASSTETS = 22;

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
	 * The meta object id for the '{@link worldreservesystem.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.impl.TransactionCollectionImpl
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransactionCollection()
	 * @generated
	 */
	int TRANSACTION_COLLECTION = 24;

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
	 * The meta object id for the '{@link worldreservesystem.AssetType <em>Asset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see worldreservesystem.AssetType
	 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 25;

	/**
	 * Returns the meta object for class '{@link worldreservesystem.WorldReserveSystem <em>World Reserve System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Reserve System</em>'.
	 * @see worldreservesystem.WorldReserveSystem
	 * @generated
	 */
	EClass getWorldReserveSystem();

	/**
	 * Returns the meta object for the containment reference '{@link worldreservesystem.WorldReserveSystem#getTransfervaults <em>Transfervaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfervaults</em>'.
	 * @see worldreservesystem.WorldReserveSystem#getTransfervaults()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Transfervaults();

	/**
	 * Returns the meta object for the containment reference '{@link worldreservesystem.WorldReserveSystem#getMainvault <em>Mainvault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainvault</em>'.
	 * @see worldreservesystem.WorldReserveSystem#getMainvault()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Mainvault();

	/**
	 * Returns the meta object for the containment reference '{@link worldreservesystem.WorldReserveSystem#getIdentities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identities</em>'.
	 * @see worldreservesystem.WorldReserveSystem#getIdentities()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Identities();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.WorldReserveSystem#getSupplycontrol <em>Supplycontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplycontrol</em>'.
	 * @see worldreservesystem.WorldReserveSystem#getSupplycontrol()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Supplycontrol();

	/**
	 * Returns the meta object for the containment reference '{@link worldreservesystem.WorldReserveSystem#getWallets <em>Wallets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wallets</em>'.
	 * @see worldreservesystem.WorldReserveSystem#getWallets()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Wallets();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.WorldReserveSystem#getRegisteredasstets <em>Registeredasstets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registeredasstets</em>'.
	 * @see worldreservesystem.WorldReserveSystem#getRegisteredasstets()
	 * @see #getWorldReserveSystem()
	 * @generated
	 */
	EReference getWorldReserveSystem_Registeredasstets();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.MainVault <em>Main Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Vault</em>'.
	 * @see worldreservesystem.MainVault
	 * @generated
	 */
	EClass getMainVault();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vault</em>'.
	 * @see worldreservesystem.TransferVault
	 * @generated
	 */
	EClass getTransferVault();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.TransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Vaults</em>'.
	 * @see worldreservesystem.TransferVaults
	 * @generated
	 */
	EClass getTransferVaults();

	/**
	 * Returns the meta object for the containment reference list '{@link worldreservesystem.TransferVaults#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see worldreservesystem.TransferVaults#getChildren()
	 * @see #getTransferVaults()
	 * @generated
	 */
	EReference getTransferVaults_Children();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genesis</em>'.
	 * @see worldreservesystem.Genesis
	 * @generated
	 */
	EClass getGenesis();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.Genesis#getMainvault <em>Mainvault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mainvault</em>'.
	 * @see worldreservesystem.Genesis#getMainvault()
	 * @see #getGenesis()
	 * @generated
	 */
	EReference getGenesis_Mainvault();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see worldreservesystem.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link worldreservesystem.Asset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see worldreservesystem.Asset#getAssetType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetType();

	/**
	 * Returns the meta object for the reference list '{@link worldreservesystem.Asset#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Materials</em>'.
	 * @see worldreservesystem.Asset#getMaterials()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Materials();

	/**
	 * Returns the meta object for the '{@link worldreservesystem.Asset#register() <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see worldreservesystem.Asset#register()
	 * @generated
	 */
	EOperation getAsset__Register();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Economy</em>'.
	 * @see worldreservesystem.WorldEconomy
	 * @generated
	 */
	EClass getWorldEconomy();

	/**
	 * Returns the meta object for the containment reference '{@link worldreservesystem.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nationaleconomies</em>'.
	 * @see worldreservesystem.WorldEconomy#getNationaleconomies()
	 * @see #getWorldEconomy()
	 * @generated
	 */
	EReference getWorldEconomy_Nationaleconomies();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Economies</em>'.
	 * @see worldreservesystem.NationalEconomies
	 * @generated
	 */
	EClass getNationalEconomies();

	/**
	 * Returns the meta object for the containment reference list '{@link worldreservesystem.NationalEconomies#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see worldreservesystem.NationalEconomies#getChildren()
	 * @see #getNationalEconomies()
	 * @generated
	 */
	EReference getNationalEconomies_Children();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Nation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nation</em>'.
	 * @see worldreservesystem.Nation
	 * @generated
	 */
	EClass getNation();

	/**
	 * Returns the meta object for the containment reference '{@link worldreservesystem.Nation#getFiatcurrency <em>Fiatcurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fiatcurrency</em>'.
	 * @see worldreservesystem.Nation#getFiatcurrency()
	 * @see #getNation()
	 * @generated
	 */
	EReference getNation_Fiatcurrency();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiat Currency</em>'.
	 * @see worldreservesystem.FiatCurrency
	 * @generated
	 */
	EClass getFiatCurrency();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Accountants <em>Accountants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accountants</em>'.
	 * @see worldreservesystem.Accountants
	 * @generated
	 */
	EClass getAccountants();

	/**
	 * Returns the meta object for the containment reference list '{@link worldreservesystem.Accountants#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see worldreservesystem.Accountants#getChildren()
	 * @see #getAccountants()
	 * @generated
	 */
	EReference getAccountants_Children();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Accountant <em>Accountant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accountant</em>'.
	 * @see worldreservesystem.Accountant
	 * @generated
	 */
	EClass getAccountant();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see worldreservesystem.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link worldreservesystem.Identity#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see worldreservesystem.Identity#getUUID()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_UUID();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see worldreservesystem.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.Material#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see worldreservesystem.Material#getBelongsTo()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_BelongsTo();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see worldreservesystem.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see worldreservesystem.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.NewEClass17 <em>New EClass17</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass17</em>'.
	 * @see worldreservesystem.NewEClass17
	 * @generated
	 */
	EClass getNewEClass17();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identities</em>'.
	 * @see worldreservesystem.Identities
	 * @generated
	 */
	EClass getIdentities();

	/**
	 * Returns the meta object for the containment reference list '{@link worldreservesystem.Identities#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see worldreservesystem.Identities#getChildren()
	 * @see #getIdentities()
	 * @generated
	 */
	EReference getIdentities_Children();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallet</em>'.
	 * @see worldreservesystem.Wallet
	 * @generated
	 */
	EClass getWallet();

	/**
	 * Returns the meta object for the attribute '{@link worldreservesystem.Wallet#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see worldreservesystem.Wallet#getPublicKey()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_PublicKey();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.Wallet#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see worldreservesystem.Wallet#getBelongsTo()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_BelongsTo();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply Control</em>'.
	 * @see worldreservesystem.SupplyControl
	 * @generated
	 */
	EClass getSupplyControl();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.SupplyControl#getGenesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Genesis</em>'.
	 * @see worldreservesystem.SupplyControl#getGenesis()
	 * @see #getSupplyControl()
	 * @generated
	 */
	EReference getSupplyControl_Genesis();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Wallets <em>Wallets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallets</em>'.
	 * @see worldreservesystem.Wallets
	 * @generated
	 */
	EClass getWallets();

	/**
	 * Returns the meta object for the reference list '{@link worldreservesystem.Wallets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see worldreservesystem.Wallets#getChildren()
	 * @see #getWallets()
	 * @generated
	 */
	EReference getWallets_Children();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see worldreservesystem.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.Transaction#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assets</em>'.
	 * @see worldreservesystem.Transaction#getAssets()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Assets();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.Transaction#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see worldreservesystem.Transaction#getFrom()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_From();

	/**
	 * Returns the meta object for the reference '{@link worldreservesystem.Transaction#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see worldreservesystem.Transaction#getTo()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_To();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.RegisteredAsstets <em>Registered Asstets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Asstets</em>'.
	 * @see worldreservesystem.RegisteredAsstets
	 * @generated
	 */
	EClass getRegisteredAsstets();

	/**
	 * Returns the meta object for the reference list '{@link worldreservesystem.RegisteredAsstets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see worldreservesystem.RegisteredAsstets#getChildren()
	 * @see #getRegisteredAsstets()
	 * @generated
	 */
	EReference getRegisteredAsstets_Children();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.AbstractVault <em>Abstract Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Vault</em>'.
	 * @see worldreservesystem.AbstractVault
	 * @generated
	 */
	EClass getAbstractVault();

	/**
	 * Returns the meta object for the reference list '{@link worldreservesystem.AbstractVault#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see worldreservesystem.AbstractVault#getAssets()
	 * @see #getAbstractVault()
	 * @generated
	 */
	EReference getAbstractVault_Assets();

	/**
	 * Returns the meta object for class '{@link worldreservesystem.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Collection</em>'.
	 * @see worldreservesystem.TransactionCollection
	 * @generated
	 */
	EClass getTransactionCollection();

	/**
	 * Returns the meta object for enum '{@link worldreservesystem.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Type</em>'.
	 * @see worldreservesystem.AssetType
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
		 * The meta object literal for the '{@link worldreservesystem.impl.WorldReserveSystemImpl <em>World Reserve System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.WorldReserveSystemImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldReserveSystem()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.MainVaultImpl <em>Main Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.MainVaultImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getMainVault()
		 * @generated
		 */
		EClass MAIN_VAULT = eINSTANCE.getMainVault();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.TransferVaultImpl <em>Transfer Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.TransferVaultImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVault()
		 * @generated
		 */
		EClass TRANSFER_VAULT = eINSTANCE.getTransferVault();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.TransferVaultsImpl <em>Transfer Vaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.TransferVaultsImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransferVaults()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.GenesisImpl <em>Genesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.GenesisImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getGenesis()
		 * @generated
		 */
		EClass GENESIS = eINSTANCE.getGenesis();

		/**
		 * The meta object literal for the '<em><b>Mainvault</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENESIS__MAINVAULT = eINSTANCE.getGenesis_Mainvault();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.AssetImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAsset()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.WorldEconomyImpl <em>World Economy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.WorldEconomyImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWorldEconomy()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.NationalEconomiesImpl <em>National Economies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.NationalEconomiesImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getNationalEconomies()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.NationImpl <em>Nation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.NationImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getNation()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.FiatCurrencyImpl <em>Fiat Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.FiatCurrencyImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getFiatCurrency()
		 * @generated
		 */
		EClass FIAT_CURRENCY = eINSTANCE.getFiatCurrency();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.AccountantsImpl <em>Accountants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.AccountantsImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountants()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.AccountantImpl <em>Accountant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.AccountantImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAccountant()
		 * @generated
		 */
		EClass ACCOUNTANT = eINSTANCE.getAccountant();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.IdentityImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentity()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.MaterialImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getMaterial()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.IndividualImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.LegalEntityImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.NewEClass17Impl <em>New EClass17</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.NewEClass17Impl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getNewEClass17()
		 * @generated
		 */
		EClass NEW_ECLASS17 = eINSTANCE.getNewEClass17();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.IdentitiesImpl <em>Identities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.IdentitiesImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getIdentities()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.WalletImpl <em>Wallet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.WalletImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWallet()
		 * @generated
		 */
		EClass WALLET = eINSTANCE.getWallet();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__PUBLIC_KEY = eINSTANCE.getWallet_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__BELONGS_TO = eINSTANCE.getWallet_BelongsTo();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.SupplyControlImpl <em>Supply Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.SupplyControlImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getSupplyControl()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.WalletsImpl <em>Wallets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.WalletsImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getWallets()
		 * @generated
		 */
		EClass WALLETS = eINSTANCE.getWallets();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLETS__CHILDREN = eINSTANCE.getWallets_Children();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.TransactionImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransaction()
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
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__FROM = eINSTANCE.getTransaction_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__TO = eINSTANCE.getTransaction_To();

		/**
		 * The meta object literal for the '{@link worldreservesystem.impl.RegisteredAsstetsImpl <em>Registered Asstets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.RegisteredAsstetsImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getRegisteredAsstets()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.AbstractVaultImpl <em>Abstract Vault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.AbstractVaultImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAbstractVault()
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
		 * The meta object literal for the '{@link worldreservesystem.impl.TransactionCollectionImpl <em>Transaction Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.impl.TransactionCollectionImpl
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getTransactionCollection()
		 * @generated
		 */
		EClass TRANSACTION_COLLECTION = eINSTANCE.getTransactionCollection();

		/**
		 * The meta object literal for the '{@link worldreservesystem.AssetType <em>Asset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see worldreservesystem.AssetType
		 * @see worldreservesystem.impl.WorldreservesystemPackageImpl#getAssetType()
		 * @generated
		 */
		EEnum ASSET_TYPE = eINSTANCE.getAssetType();

	}

} //WorldreservesystemPackage