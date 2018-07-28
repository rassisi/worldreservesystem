/**
 */
package org.wrs.model.wrs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.wrs.model.wrs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wrs.model.wrs.WrsPackage
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrsSwitch<Adapter> modelSwitch = new WrsSwitch<Adapter>() {
		@Override
		public Adapter caseWRS(WRS object) {
			return createWRSAdapter();
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
		public Adapter caseCountry(Country object) {
			return createCountryAdapter();
		}

		@Override
		public Adapter caseFiatCurrency(FiatCurrency object) {
			return createFiatCurrencyAdapter();
		}

		@Override
		public Adapter caseIdentity(Identity object) {
			return createIdentityAdapter();
		}

		@Override
		public Adapter caseThing(Thing object) {
			return createThingAdapter();
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
		public Adapter caseAbstractAccount(AbstractAccount object) {
			return createAbstractAccountAdapter();
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
		public Adapter caseCountries(Countries object) {
			return createCountriesAdapter();
		}

		@Override
		public Adapter caseNodes(Nodes object) {
			return createNodesAdapter();
		}

		@Override
		public Adapter caseIdentities(Identities object) {
			return createIdentitiesAdapter();
		}

		@Override
		public Adapter caseTransactions(Transactions object) {
			return createTransactionsAdapter();
		}

		@Override
		public Adapter caseAbstractTransaction(AbstractTransaction object) {
			return createAbstractTransactionAdapter();
		}

		@Override
		public Adapter caseNodeAccount(NodeAccount object) {
			return createNodeAccountAdapter();
		}

		@Override
		public Adapter caseTransactionConditions(TransactionConditions object) {
			return createTransactionConditionsAdapter();
		}

		@Override
		public Adapter caseTransactionCondition(TransactionCondition object) {
			return createTransactionConditionAdapter();
		}

		@Override
		public Adapter caseSignedInput(SignedInput object) {
			return createSignedInputAdapter();
		}

		@Override
		public Adapter caseStatistics(Statistics object) {
			return createStatisticsAdapter();
		}

		@Override
		public Adapter caseStatisticDatas(StatisticDatas object) {
			return createStatisticDatasAdapter();
		}

		@Override
		public Adapter caseCountryRegion(CountryRegion object) {
			return createCountryRegionAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.WRS <em>WRS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.WRS
	 * @generated
	 */
	public Adapter createWRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Treasury <em>Treasury</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Treasury
	 * @generated
	 */
	public Adapter createTreasuryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.TransferVault
	 * @generated
	 */
	public Adapter createTransferVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Genesis
	 * @generated
	 */
	public Adapter createGenesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.WorldEconomy
	 * @generated
	 */
	public Adapter createWorldEconomyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.NationalEconomies
	 * @generated
	 */
	public Adapter createNationalEconomiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.FiatCurrency
	 * @generated
	 */
	public Adapter createFiatCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.LegalEntity
	 * @generated
	 */
	public Adapter createLegalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.SupplyControl
	 * @generated
	 */
	public Adapter createSupplyControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Accounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Accounts
	 * @generated
	 */
	public Adapter createAccountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.RegisteredAssets <em>Registered Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.RegisteredAssets
	 * @generated
	 */
	public Adapter createRegisteredAssetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.AbstractAccount <em>Abstract Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.AbstractAccount
	 * @generated
	 */
	public Adapter createAbstractAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.TransactionCollection
	 * @generated
	 */
	public Adapter createTransactionCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.NetworkEngine <em>Network Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.NetworkEngine
	 * @generated
	 */
	public Adapter createNetworkEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Countries
	 * @generated
	 */
	public Adapter createCountriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Nodes
	 * @generated
	 */
	public Adapter createNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Identities
	 * @generated
	 */
	public Adapter createIdentitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Transactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Transactions
	 * @generated
	 */
	public Adapter createTransactionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.AbstractTransaction <em>Abstract Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.AbstractTransaction
	 * @generated
	 */
	public Adapter createAbstractTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.NodeAccount <em>Node Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.NodeAccount
	 * @generated
	 */
	public Adapter createNodeAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.TransactionConditions <em>Transaction Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.TransactionConditions
	 * @generated
	 */
	public Adapter createTransactionConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.TransactionCondition <em>Transaction Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.TransactionCondition
	 * @generated
	 */
	public Adapter createTransactionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.SignedInput <em>Signed Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.SignedInput
	 * @generated
	 */
	public Adapter createSignedInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.Statistics
	 * @generated
	 */
	public Adapter createStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.StatisticDatas <em>Statistic Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.StatisticDatas
	 * @generated
	 */
	public Adapter createStatisticDatasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wrs.model.wrs.CountryRegion <em>Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wrs.model.wrs.CountryRegion
	 * @generated
	 */
	public Adapter createCountryRegionAdapter() {
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
