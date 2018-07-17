/**
 */
package org.wrs.wrs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.wrs.wrs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.wrs.wrs.WrsPackage
 * @generated
 */
public class WrsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WrsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrsSwitch() {
		if (modelPackage == null) {
			modelPackage = WrsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WrsPackage.WRS: {
				wrs wrs = (wrs)theEObject;
				T result = casewrs(wrs);
				if (result == null) result = caseIdentity(wrs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.TREASURY: {
				Treasury treasury = (Treasury)theEObject;
				T result = caseTreasury(treasury);
				if (result == null) result = caseAbstractVault(treasury);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.TRANSFER_VAULT: {
				TransferVault transferVault = (TransferVault)theEObject;
				T result = caseTransferVault(transferVault);
				if (result == null) result = caseAbstractVault(transferVault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.TRANSFER_VAULTS: {
				TransferVaults transferVaults = (TransferVaults)theEObject;
				T result = caseTransferVaults(transferVaults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.GENESIS: {
				Genesis genesis = (Genesis)theEObject;
				T result = caseGenesis(genesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.WORLD_ECONOMY: {
				WorldEconomy worldEconomy = (WorldEconomy)theEObject;
				T result = caseWorldEconomy(worldEconomy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.NATIONAL_ECONOMIES: {
				NationalEconomies nationalEconomies = (NationalEconomies)theEObject;
				T result = caseNationalEconomies(nationalEconomies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.NATION: {
				Nation nation = (Nation)theEObject;
				T result = caseNation(nation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.FIAT_CURRENCY: {
				FiatCurrency fiatCurrency = (FiatCurrency)theEObject;
				T result = caseFiatCurrency(fiatCurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.ACCOUNTANTS: {
				Accountants accountants = (Accountants)theEObject;
				T result = caseAccountants(accountants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.ACCOUNTANT: {
				Accountant accountant = (Accountant)theEObject;
				T result = caseAccountant(accountant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.IDENTITY: {
				Identity identity = (Identity)theEObject;
				T result = caseIdentity(identity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.MATERIAL: {
				Material material = (Material)theEObject;
				T result = caseMaterial(material);
				if (result == null) result = caseIdentity(material);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseIdentity(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.LEGAL_ENTITY: {
				LegalEntity legalEntity = (LegalEntity)theEObject;
				T result = caseLegalEntity(legalEntity);
				if (result == null) result = caseIdentity(legalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.IDENTITIES: {
				Identities identities = (Identities)theEObject;
				T result = caseIdentities(identities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseAbstractVault(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.SUPPLY_CONTROL: {
				SupplyControl supplyControl = (SupplyControl)theEObject;
				T result = caseSupplyControl(supplyControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.ACCOUNTS: {
				Accounts accounts = (Accounts)theEObject;
				T result = caseAccounts(accounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.TRANSACTION: {
				Transaction transaction = (Transaction)theEObject;
				T result = caseTransaction(transaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.REGISTERED_ASSETS: {
				RegisteredAssets registeredAssets = (RegisteredAssets)theEObject;
				T result = caseRegisteredAssets(registeredAssets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.ABSTRACT_VAULT: {
				AbstractVault abstractVault = (AbstractVault)theEObject;
				T result = caseAbstractVault(abstractVault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.TRANSACTION_COLLECTION: {
				TransactionCollection transactionCollection = (TransactionCollection)theEObject;
				T result = caseTransactionCollection(transactionCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrsPackage.NETWORK_ENGINE: {
				NetworkEngine networkEngine = (NetworkEngine)theEObject;
				T result = caseNetworkEngine(networkEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>wrs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>wrs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewrs(wrs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treasury</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treasury</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreasury(Treasury object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Vault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Vault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferVault(TransferVault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Vaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Vaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferVaults(TransferVaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Genesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Genesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenesis(Genesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World Economy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World Economy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldEconomy(WorldEconomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Economies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Economies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalEconomies(NationalEconomies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNation(Nation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fiat Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fiat Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiatCurrency(FiatCurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accountants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accountants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountants(Accountants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accountant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accountant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountant(Accountant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentity(Identity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalEntity(LegalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentities(Identities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyControl(SupplyControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccounts(Accounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Assets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Assets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredAssets(RegisteredAssets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Vault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Vault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVault(AbstractVault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionCollection(TransactionCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkEngine(NetworkEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WrsSwitch
