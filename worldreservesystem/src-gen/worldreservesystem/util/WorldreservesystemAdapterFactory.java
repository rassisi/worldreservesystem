/**
 */
package worldreservesystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import worldreservesystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see worldreservesystem.WorldreservesystemPackage
 * @generated
 */
public class WorldreservesystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorldreservesystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldreservesystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorldreservesystemPackage.eINSTANCE;
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
	protected WorldreservesystemSwitch<Adapter> modelSwitch = new WorldreservesystemSwitch<Adapter>() {
		@Override
		public Adapter caseWorldReserveSystem(WorldReserveSystem object) {
			return createWorldReserveSystemAdapter();
		}

		@Override
		public Adapter caseMainVault(MainVault object) {
			return createMainVaultAdapter();
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
		public Adapter caseNewEClass17(NewEClass17 object) {
			return createNewEClass17Adapter();
		}

		@Override
		public Adapter caseIdentities(Identities object) {
			return createIdentitiesAdapter();
		}

		@Override
		public Adapter caseWallet(Wallet object) {
			return createWalletAdapter();
		}

		@Override
		public Adapter caseSupplyControl(SupplyControl object) {
			return createSupplyControlAdapter();
		}

		@Override
		public Adapter caseWallets(Wallets object) {
			return createWalletsAdapter();
		}

		@Override
		public Adapter caseTransaction(Transaction object) {
			return createTransactionAdapter();
		}

		@Override
		public Adapter caseRegisteredAsstets(RegisteredAsstets object) {
			return createRegisteredAsstetsAdapter();
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
	 * Creates a new adapter for an object of class '{@link worldreservesystem.WorldReserveSystem <em>World Reserve System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.WorldReserveSystem
	 * @generated
	 */
	public Adapter createWorldReserveSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.MainVault <em>Main Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.MainVault
	 * @generated
	 */
	public Adapter createMainVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.TransferVault <em>Transfer Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.TransferVault
	 * @generated
	 */
	public Adapter createTransferVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.TransferVaults <em>Transfer Vaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.TransferVaults
	 * @generated
	 */
	public Adapter createTransferVaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Genesis <em>Genesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Genesis
	 * @generated
	 */
	public Adapter createGenesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.WorldEconomy <em>World Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.WorldEconomy
	 * @generated
	 */
	public Adapter createWorldEconomyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.NationalEconomies <em>National Economies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.NationalEconomies
	 * @generated
	 */
	public Adapter createNationalEconomiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Nation <em>Nation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Nation
	 * @generated
	 */
	public Adapter createNationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.FiatCurrency <em>Fiat Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.FiatCurrency
	 * @generated
	 */
	public Adapter createFiatCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Accountants <em>Accountants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Accountants
	 * @generated
	 */
	public Adapter createAccountantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Accountant <em>Accountant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Accountant
	 * @generated
	 */
	public Adapter createAccountantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.LegalEntity
	 * @generated
	 */
	public Adapter createLegalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.NewEClass17 <em>New EClass17</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.NewEClass17
	 * @generated
	 */
	public Adapter createNewEClass17Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Identities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Identities
	 * @generated
	 */
	public Adapter createIdentitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Wallet
	 * @generated
	 */
	public Adapter createWalletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.SupplyControl <em>Supply Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.SupplyControl
	 * @generated
	 */
	public Adapter createSupplyControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Wallets <em>Wallets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Wallets
	 * @generated
	 */
	public Adapter createWalletsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.RegisteredAsstets <em>Registered Asstets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.RegisteredAsstets
	 * @generated
	 */
	public Adapter createRegisteredAsstetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.AbstractVault <em>Abstract Vault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.AbstractVault
	 * @generated
	 */
	public Adapter createAbstractVaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link worldreservesystem.TransactionCollection <em>Transaction Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see worldreservesystem.TransactionCollection
	 * @generated
	 */
	public Adapter createTransactionCollectionAdapter() {
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

} //WorldreservesystemAdapterFactory
