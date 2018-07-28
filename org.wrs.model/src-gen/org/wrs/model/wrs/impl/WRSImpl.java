/**
 */
package org.wrs.model.wrs.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.Accounts;
import org.wrs.model.wrs.Countries;
import org.wrs.model.wrs.Identities;
import org.wrs.model.wrs.Nodes;
import org.wrs.model.wrs.RegisteredAssets;
import org.wrs.model.wrs.StatisticDatas;
import org.wrs.model.wrs.SupplyControl;
import org.wrs.model.wrs.TransactionConditions;
import org.wrs.model.wrs.Transactions;
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
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getRegisteredasstets <em>Registeredasstets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getWorldeconomy <em>Worldeconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getTransactionconditions <em>Transactionconditions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getStatisticDatas <em>Statistic Datas</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WRSImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WRSImpl extends CDOObjectImpl implements WRS {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
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
	public Treasury basicGetMainvault() {
		return (Treasury) eDynamicGet(WrsPackage.WRS__MAINVAULT, WrsPackage.Literals.WRS__MAINVAULT, false, true);
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
	public Accounts getAccounts() {
		return (Accounts) eDynamicGet(WrsPackage.WRS__ACCOUNTS, WrsPackage.Literals.WRS__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccounts(Accounts newAccounts, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAccounts, WrsPackage.WRS__ACCOUNTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccounts(Accounts newAccounts) {
		eDynamicSet(WrsPackage.WRS__ACCOUNTS, WrsPackage.Literals.WRS__ACCOUNTS, newAccounts);
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
	public Countries getCountries() {
		return (Countries) eDynamicGet(WrsPackage.WRS__COUNTRIES, WrsPackage.Literals.WRS__COUNTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountries(Countries newCountries, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newCountries, WrsPackage.WRS__COUNTRIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountries(Countries newCountries) {
		eDynamicSet(WrsPackage.WRS__COUNTRIES, WrsPackage.Literals.WRS__COUNTRIES, newCountries);
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
	public Identities getIdentities() {
		return (Identities) eDynamicGet(WrsPackage.WRS__IDENTITIES, WrsPackage.Literals.WRS__IDENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentities(Identities newIdentities, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newIdentities, WrsPackage.WRS__IDENTITIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentities(Identities newIdentities) {
		eDynamicSet(WrsPackage.WRS__IDENTITIES, WrsPackage.Literals.WRS__IDENTITIES, newIdentities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactions getTransactions() {
		return (Transactions) eDynamicGet(WrsPackage.WRS__TRANSACTIONS, WrsPackage.Literals.WRS__TRANSACTIONS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactions(Transactions newTransactions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTransactions, WrsPackage.WRS__TRANSACTIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactions(Transactions newTransactions) {
		eDynamicSet(WrsPackage.WRS__TRANSACTIONS, WrsPackage.Literals.WRS__TRANSACTIONS, newTransactions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConditions getTransactionconditions() {
		return (TransactionConditions) eDynamicGet(WrsPackage.WRS__TRANSACTIONCONDITIONS,
				WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionconditions(TransactionConditions newTransactionconditions,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newTransactionconditions, WrsPackage.WRS__TRANSACTIONCONDITIONS,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionconditions(TransactionConditions newTransactionconditions) {
		eDynamicSet(WrsPackage.WRS__TRANSACTIONCONDITIONS, WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS,
				newTransactionconditions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticDatas getStatisticDatas() {
		return (StatisticDatas) eDynamicGet(WrsPackage.WRS__STATISTIC_DATAS, WrsPackage.Literals.WRS__STATISTIC_DATAS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatisticDatas(StatisticDatas newStatisticDatas, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newStatisticDatas, WrsPackage.WRS__STATISTIC_DATAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticDatas(StatisticDatas newStatisticDatas) {
		eDynamicSet(WrsPackage.WRS__STATISTIC_DATAS, WrsPackage.Literals.WRS__STATISTIC_DATAS, newStatisticDatas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(WrsPackage.WRS__NAME, WrsPackage.Literals.WRS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(WrsPackage.WRS__NAME, WrsPackage.Literals.WRS__NAME, newName);
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
		case WrsPackage.WRS__SUPPLYCONTROL:
			return basicSetSupplycontrol(null, msgs);
		case WrsPackage.WRS__ACCOUNTS:
			return basicSetAccounts(null, msgs);
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return basicSetRegisteredasstets(null, msgs);
		case WrsPackage.WRS__WORLDECONOMY:
			return basicSetWorldeconomy(null, msgs);
		case WrsPackage.WRS__COUNTRIES:
			return basicSetCountries(null, msgs);
		case WrsPackage.WRS__NODES:
			return basicSetNodes(null, msgs);
		case WrsPackage.WRS__IDENTITIES:
			return basicSetIdentities(null, msgs);
		case WrsPackage.WRS__TRANSACTIONS:
			return basicSetTransactions(null, msgs);
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			return basicSetTransactionconditions(null, msgs);
		case WrsPackage.WRS__STATISTIC_DATAS:
			return basicSetStatisticDatas(null, msgs);
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
			if (resolve)
				return getMainvault();
			return basicGetMainvault();
		case WrsPackage.WRS__SUPPLYCONTROL:
			return getSupplycontrol();
		case WrsPackage.WRS__ACCOUNTS:
			return getAccounts();
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return getRegisteredasstets();
		case WrsPackage.WRS__WORLDECONOMY:
			return getWorldeconomy();
		case WrsPackage.WRS__COUNTRIES:
			return getCountries();
		case WrsPackage.WRS__NODES:
			return getNodes();
		case WrsPackage.WRS__IDENTITIES:
			return getIdentities();
		case WrsPackage.WRS__TRANSACTIONS:
			return getTransactions();
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			return getTransactionconditions();
		case WrsPackage.WRS__STATISTIC_DATAS:
			return getStatisticDatas();
		case WrsPackage.WRS__NAME:
			return getName();
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
		case WrsPackage.WRS__ACCOUNTS:
			setAccounts((Accounts) newValue);
			return;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			setRegisteredasstets((RegisteredAssets) newValue);
			return;
		case WrsPackage.WRS__WORLDECONOMY:
			setWorldeconomy((WorldEconomy) newValue);
			return;
		case WrsPackage.WRS__COUNTRIES:
			setCountries((Countries) newValue);
			return;
		case WrsPackage.WRS__NODES:
			setNodes((Nodes) newValue);
			return;
		case WrsPackage.WRS__IDENTITIES:
			setIdentities((Identities) newValue);
			return;
		case WrsPackage.WRS__TRANSACTIONS:
			setTransactions((Transactions) newValue);
			return;
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			setTransactionconditions((TransactionConditions) newValue);
			return;
		case WrsPackage.WRS__STATISTIC_DATAS:
			setStatisticDatas((StatisticDatas) newValue);
			return;
		case WrsPackage.WRS__NAME:
			setName((String) newValue);
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
		case WrsPackage.WRS__ACCOUNTS:
			setAccounts((Accounts) null);
			return;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			setRegisteredasstets((RegisteredAssets) null);
			return;
		case WrsPackage.WRS__WORLDECONOMY:
			setWorldeconomy((WorldEconomy) null);
			return;
		case WrsPackage.WRS__COUNTRIES:
			setCountries((Countries) null);
			return;
		case WrsPackage.WRS__NODES:
			setNodes((Nodes) null);
			return;
		case WrsPackage.WRS__IDENTITIES:
			setIdentities((Identities) null);
			return;
		case WrsPackage.WRS__TRANSACTIONS:
			setTransactions((Transactions) null);
			return;
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			setTransactionconditions((TransactionConditions) null);
			return;
		case WrsPackage.WRS__STATISTIC_DATAS:
			setStatisticDatas((StatisticDatas) null);
			return;
		case WrsPackage.WRS__NAME:
			setName(NAME_EDEFAULT);
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
			return basicGetMainvault() != null;
		case WrsPackage.WRS__SUPPLYCONTROL:
			return getSupplycontrol() != null;
		case WrsPackage.WRS__ACCOUNTS:
			return getAccounts() != null;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return getRegisteredasstets() != null;
		case WrsPackage.WRS__WORLDECONOMY:
			return getWorldeconomy() != null;
		case WrsPackage.WRS__COUNTRIES:
			return getCountries() != null;
		case WrsPackage.WRS__NODES:
			return getNodes() != null;
		case WrsPackage.WRS__IDENTITIES:
			return getIdentities() != null;
		case WrsPackage.WRS__TRANSACTIONS:
			return getTransactions() != null;
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			return getTransactionconditions() != null;
		case WrsPackage.WRS__STATISTIC_DATAS:
			return getStatisticDatas() != null;
		case WrsPackage.WRS__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
