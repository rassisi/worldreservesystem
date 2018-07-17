/**
 */
package org.wrs.wrs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.wrs.wrs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wrs.wrs.WrsPackage
 * @generated
 */
public class WrsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WrsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WrsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrsSwitch<Adapter> modelSwitch =
		new WrsSwitch<Adapter>() {
			@Override
			public Adapter casewrs(wrs object) {
				return createwrsAdapter();
			}
			@Override
			public Adapter caseTreasury(Treasury object) {
				return createTreasuryAdapter();
			}
			@Override
			public Adapter caseTransferVault(TransferVault object) {
				return createTransferVaultAdapter();
			}
			@Override
			public Adapter caseTransferVaults(TransferVaults object) {
				return createTransferVaultsAdapter();
			}
			@Override
			public Adapter caseGenesis(Genesis object) {
				return createGenesisAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseWorldEconomy(WorldEconomy object) {
				return createWorldEconomyAdapter();
			}
			@Override
			public Adapter caseNationalEconomies(NationalEconomies object) {
				return createNationalEconomiesAdapter();
			}
			@Override
			public Adapter caseNation(Nation object) {
				return createNationAdapter();
			}
			@Override
			public Adapter caseFiatCurrency(FiatCurrency object) {
				return createFiatCurrencyAdapter();
			}
			@Override
			public Adapter caseAccountants(Accountants object) {
				return createAccountantsAdapter();
			}
			@Override
			public Adapter caseAccountant(Accountant object) {
				return createAccountantAdapter();
			}
			@Override
			public Adapter caseIdentity(Identity object) {
				return createIdentityAdapter();
			}
			@Override
			public Adapter caseMaterial(Material object) {
				return createMaterialAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseLegalEntity(LegalEntity object) {
				return createLegalEntityAdapter();
			}
			@Override
			public Adapter caseIdentities(Identities object) {
				return createIdentitiesAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseSupplyControl(SupplyControl object) {
				return createSupplyControlAdapter();
			}
			@Override
			public Adapter caseAccounts(Accounts object) {
				return createAccountsAdapter();
			}
			@Override
			public Adapter caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseRegisteredAssets(RegisteredAssets object) {
				return createRegisteredAssetsAdapter();
			}
			@Override
			public Adapter caseAbstractVault(AbstractVault object) {
				return createAbstractVaultAdapter();
			}
			@Override
			public Adapter caseTransactionCollection(TransactionCollection object) {
				return createTransactionCollectionAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNetworkEngine(NetworkEngine object) {
				return createNetworkEngineAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.wrs <em>wrs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.wrs
	 * @generated
	 */
	public Adapter createwrsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Treasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Treasury
	 * @generated
	 */
	public Adapter createTreasuryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.TransferVault
	 * @generated
	 */
	public Adapter createTransferVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.TransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.TransferVaults
	 * @generated
	 */
	public Adapter createTransferVaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Genesis
	 * @generated
	 */
	public Adapter createGenesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.WorldEconomy
	 * @generated
	 */
	public Adapter createWorldEconomyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.NationalEconomies
	 * @generated
	 */
	public Adapter createNationalEconomiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Nation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Nation
	 * @generated
	 */
	public Adapter createNationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.FiatCurrency
	 * @generated
	 */
	public Adapter createFiatCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Accountants <em>Accountants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Accountants
	 * @generated
	 */
	public Adapter createAccountantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Accountant <em>Accountant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Accountant
	 * @generated
	 */
	public Adapter createAccountantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.LegalEntity
	 * @generated
	 */
	public Adapter createLegalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Identities
	 * @generated
	 */
	public Adapter createIdentitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.SupplyControl
	 * @generated
	 */
	public Adapter createSupplyControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Accounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Accounts
	 * @generated
	 */
	public Adapter createAccountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.RegisteredAssets <em>Registered Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.RegisteredAssets
	 * @generated
	 */
	public Adapter createRegisteredAssetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.AbstractVault <em>Abstract Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.AbstractVault
	 * @generated
	 */
	public Adapter createAbstractVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.TransactionCollection
	 * @generated
	 */
	public Adapter createTransactionCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.wrs.NetworkEngine <em>Network Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.wrs.NetworkEngine
	 * @generated
	 */
	public Adapter createNetworkEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WrsAdapterFactory
