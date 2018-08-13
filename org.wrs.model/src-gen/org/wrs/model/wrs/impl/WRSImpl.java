/**
 */
package org.wrs.model.wrs.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.wrs.model.wrs.Accounts;
import org.wrs.model.wrs.AllTransactionConditions;
import org.wrs.model.wrs.AllTransactions;
import org.wrs.model.wrs.GenesisAccount;
import org.wrs.model.wrs.Identities;
import org.wrs.model.wrs.Nodes;
import org.wrs.model.wrs.RegisteredAssets;
import org.wrs.model.wrs.SupplyControl;
import org.wrs.model.wrs.TransferVaults;
import org.wrs.model.wrs.Treasury;
import org.wrs.model.wrs.WRS;
import org.wrs.model.wrs.WorldEconomy;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WRS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getAllAccounts <em>All Accounts</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getRegisteredasstets <em>Registeredasstets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getWorldeconomy <em>Worldeconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getAlldentities <em>Alldentities</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getAllTransactions <em>All Transactions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getAllTransactionConditions <em>All Transaction Conditions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getGenesisAccount <em>Genesis Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WRSImpl extends LayoutableImpl implements WRS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.WRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury getMainvault() {
		return (Treasury) eDynamicGet(WrsPackage.WRS__MAINVAULT, WrsPackage.Literals.WRS__MAINVAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainvault(Treasury newMainvault, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newMainvault, WrsPackage.WRS__MAINVAULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainvault(Treasury newMainvault) {
		eDynamicSet(WrsPackage.WRS__MAINVAULT, WrsPackage.Literals.WRS__MAINVAULT, newMainvault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl getSupplycontrol() {
		return (SupplyControl) eDynamicGet(WrsPackage.WRS__SUPPLYCONTROL, WrsPackage.Literals.WRS__SUPPLYCONTROL, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplycontrol(SupplyControl newSupplycontrol, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newSupplycontrol, WrsPackage.WRS__SUPPLYCONTROL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplycontrol(SupplyControl newSupplycontrol) {
		eDynamicSet(WrsPackage.WRS__SUPPLYCONTROL, WrsPackage.Literals.WRS__SUPPLYCONTROL, newSupplycontrol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accounts getAllAccounts() {
		return (Accounts) eDynamicGet(WrsPackage.WRS__ALL_ACCOUNTS, WrsPackage.Literals.WRS__ALL_ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllAccounts(Accounts newAllAccounts, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAllAccounts, WrsPackage.WRS__ALL_ACCOUNTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllAccounts(Accounts newAllAccounts) {
		eDynamicSet(WrsPackage.WRS__ALL_ACCOUNTS, WrsPackage.Literals.WRS__ALL_ACCOUNTS, newAllAccounts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAssets getRegisteredasstets() {
		return (RegisteredAssets) eDynamicGet(WrsPackage.WRS__REGISTEREDASSTETS,
				WrsPackage.Literals.WRS__REGISTEREDASSTETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredasstets(RegisteredAssets newRegisteredasstets, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newRegisteredasstets, WrsPackage.WRS__REGISTEREDASSTETS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredasstets(RegisteredAssets newRegisteredasstets) {
		eDynamicSet(WrsPackage.WRS__REGISTEREDASSTETS, WrsPackage.Literals.WRS__REGISTEREDASSTETS,
				newRegisteredasstets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldEconomy getWorldeconomy() {
		return (WorldEconomy) eDynamicGet(WrsPackage.WRS__WORLDECONOMY, WrsPackage.Literals.WRS__WORLDECONOMY, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorldeconomy(WorldEconomy newWorldeconomy, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newWorldeconomy, WrsPackage.WRS__WORLDECONOMY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldeconomy(WorldEconomy newWorldeconomy) {
		eDynamicSet(WrsPackage.WRS__WORLDECONOMY, WrsPackage.Literals.WRS__WORLDECONOMY, newWorldeconomy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes getNodes() {
		return (Nodes) eDynamicGet(WrsPackage.WRS__NODES, WrsPackage.Literals.WRS__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newNodes, WrsPackage.WRS__NODES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Nodes newNodes) {
		eDynamicSet(WrsPackage.WRS__NODES, WrsPackage.Literals.WRS__NODES, newNodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identities getAlldentities() {
		return (Identities) eDynamicGet(WrsPackage.WRS__ALLDENTITIES, WrsPackage.Literals.WRS__ALLDENTITIES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlldentities(Identities newAlldentities, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAlldentities, WrsPackage.WRS__ALLDENTITIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlldentities(Identities newAlldentities) {
		eDynamicSet(WrsPackage.WRS__ALLDENTITIES, WrsPackage.Literals.WRS__ALLDENTITIES, newAlldentities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTransactions getAllTransactions() {
		return (AllTransactions) eDynamicGet(WrsPackage.WRS__ALL_TRANSACTIONS,
				WrsPackage.Literals.WRS__ALL_TRANSACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllTransactions(AllTransactions newAllTransactions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAllTransactions, WrsPackage.WRS__ALL_TRANSACTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllTransactions(AllTransactions newAllTransactions) {
		eDynamicSet(WrsPackage.WRS__ALL_TRANSACTIONS, WrsPackage.Literals.WRS__ALL_TRANSACTIONS, newAllTransactions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTransactionConditions getAllTransactionConditions() {
		return (AllTransactionConditions) eDynamicGet(WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS,
				WrsPackage.Literals.WRS__ALL_TRANSACTION_CONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllTransactionConditions(AllTransactionConditions newAllTransactionConditions,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAllTransactionConditions,
				WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllTransactionConditions(AllTransactionConditions newAllTransactionConditions) {
		eDynamicSet(WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS, WrsPackage.Literals.WRS__ALL_TRANSACTION_CONDITIONS,
				newAllTransactionConditions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferVaults getTransfervaults() {
		return (TransferVaults) eDynamicGet(WrsPackage.WRS__TRANSFERVAULTS, WrsPackage.Literals.WRS__TRANSFERVAULTS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransfervaults(TransferVaults newTransfervaults, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTransfervaults, WrsPackage.WRS__TRANSFERVAULTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfervaults(TransferVaults newTransfervaults) {
		eDynamicSet(WrsPackage.WRS__TRANSFERVAULTS, WrsPackage.Literals.WRS__TRANSFERVAULTS, newTransfervaults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenesisAccount getGenesisAccount() {
		return (GenesisAccount) eDynamicGet(WrsPackage.WRS__GENESIS_ACCOUNT, WrsPackage.Literals.WRS__GENESIS_ACCOUNT,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenesisAccount(GenesisAccount newGenesisAccount, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newGenesisAccount, WrsPackage.WRS__GENESIS_ACCOUNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenesisAccount(GenesisAccount newGenesisAccount) {
		eDynamicSet(WrsPackage.WRS__GENESIS_ACCOUNT, WrsPackage.Literals.WRS__GENESIS_ACCOUNT, newGenesisAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createIdentity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.WRS__MAINVAULT:
			return basicSetMainvault(null, msgs);
		case WrsPackage.WRS__SUPPLYCONTROL:
			return basicSetSupplycontrol(null, msgs);
		case WrsPackage.WRS__ALL_ACCOUNTS:
			return basicSetAllAccounts(null, msgs);
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return basicSetRegisteredasstets(null, msgs);
		case WrsPackage.WRS__WORLDECONOMY:
			return basicSetWorldeconomy(null, msgs);
		case WrsPackage.WRS__NODES:
			return basicSetNodes(null, msgs);
		case WrsPackage.WRS__ALLDENTITIES:
			return basicSetAlldentities(null, msgs);
		case WrsPackage.WRS__ALL_TRANSACTIONS:
			return basicSetAllTransactions(null, msgs);
		case WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS:
			return basicSetAllTransactionConditions(null, msgs);
		case WrsPackage.WRS__TRANSFERVAULTS:
			return basicSetTransfervaults(null, msgs);
		case WrsPackage.WRS__GENESIS_ACCOUNT:
			return basicSetGenesisAccount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.WRS__MAINVAULT:
			return getMainvault();
		case WrsPackage.WRS__SUPPLYCONTROL:
			return getSupplycontrol();
		case WrsPackage.WRS__ALL_ACCOUNTS:
			return getAllAccounts();
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return getRegisteredasstets();
		case WrsPackage.WRS__WORLDECONOMY:
			return getWorldeconomy();
		case WrsPackage.WRS__NODES:
			return getNodes();
		case WrsPackage.WRS__ALLDENTITIES:
			return getAlldentities();
		case WrsPackage.WRS__ALL_TRANSACTIONS:
			return getAllTransactions();
		case WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS:
			return getAllTransactionConditions();
		case WrsPackage.WRS__TRANSFERVAULTS:
			return getTransfervaults();
		case WrsPackage.WRS__GENESIS_ACCOUNT:
			return getGenesisAccount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.WRS__MAINVAULT:
			setMainvault((Treasury) newValue);
			return;
		case WrsPackage.WRS__SUPPLYCONTROL:
			setSupplycontrol((SupplyControl) newValue);
			return;
		case WrsPackage.WRS__ALL_ACCOUNTS:
			setAllAccounts((Accounts) newValue);
			return;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			setRegisteredasstets((RegisteredAssets) newValue);
			return;
		case WrsPackage.WRS__WORLDECONOMY:
			setWorldeconomy((WorldEconomy) newValue);
			return;
		case WrsPackage.WRS__NODES:
			setNodes((Nodes) newValue);
			return;
		case WrsPackage.WRS__ALLDENTITIES:
			setAlldentities((Identities) newValue);
			return;
		case WrsPackage.WRS__ALL_TRANSACTIONS:
			setAllTransactions((AllTransactions) newValue);
			return;
		case WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS:
			setAllTransactionConditions((AllTransactionConditions) newValue);
			return;
		case WrsPackage.WRS__TRANSFERVAULTS:
			setTransfervaults((TransferVaults) newValue);
			return;
		case WrsPackage.WRS__GENESIS_ACCOUNT:
			setGenesisAccount((GenesisAccount) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WrsPackage.WRS__MAINVAULT:
			setMainvault((Treasury) null);
			return;
		case WrsPackage.WRS__SUPPLYCONTROL:
			setSupplycontrol((SupplyControl) null);
			return;
		case WrsPackage.WRS__ALL_ACCOUNTS:
			setAllAccounts((Accounts) null);
			return;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			setRegisteredasstets((RegisteredAssets) null);
			return;
		case WrsPackage.WRS__WORLDECONOMY:
			setWorldeconomy((WorldEconomy) null);
			return;
		case WrsPackage.WRS__NODES:
			setNodes((Nodes) null);
			return;
		case WrsPackage.WRS__ALLDENTITIES:
			setAlldentities((Identities) null);
			return;
		case WrsPackage.WRS__ALL_TRANSACTIONS:
			setAllTransactions((AllTransactions) null);
			return;
		case WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS:
			setAllTransactionConditions((AllTransactionConditions) null);
			return;
		case WrsPackage.WRS__TRANSFERVAULTS:
			setTransfervaults((TransferVaults) null);
			return;
		case WrsPackage.WRS__GENESIS_ACCOUNT:
			setGenesisAccount((GenesisAccount) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WrsPackage.WRS__MAINVAULT:
			return getMainvault() != null;
		case WrsPackage.WRS__SUPPLYCONTROL:
			return getSupplycontrol() != null;
		case WrsPackage.WRS__ALL_ACCOUNTS:
			return getAllAccounts() != null;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return getRegisteredasstets() != null;
		case WrsPackage.WRS__WORLDECONOMY:
			return getWorldeconomy() != null;
		case WrsPackage.WRS__NODES:
			return getNodes() != null;
		case WrsPackage.WRS__ALLDENTITIES:
			return getAlldentities() != null;
		case WrsPackage.WRS__ALL_TRANSACTIONS:
			return getAllTransactions() != null;
		case WrsPackage.WRS__ALL_TRANSACTION_CONDITIONS:
			return getAllTransactionConditions() != null;
		case WrsPackage.WRS__TRANSFERVAULTS:
			return getTransfervaults() != null;
		case WrsPackage.WRS__GENESIS_ACCOUNT:
			return getGenesisAccount() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WrsPackage.WRS___CREATE_IDENTITY:
			createIdentity();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //WRSImpl
