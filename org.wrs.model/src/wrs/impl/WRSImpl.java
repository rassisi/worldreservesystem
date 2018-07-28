/**
 */
package wrs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import wrs.Accounts;
import wrs.Countries;
import wrs.Identities;
import wrs.Nodes;
import wrs.RegisteredAssets;
import wrs.StatisticDatas;
import wrs.SupplyControl;
import wrs.TransactionConditions;
import wrs.Transactions;
import wrs.Treasury;
import wrs.WRS;
import wrs.WorldEconomy;
import wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WRS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wrs.impl.WRSImpl#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getRegisteredasstets <em>Registeredasstets</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getWorldeconomy <em>Worldeconomy</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getTransactionconditions <em>Transactionconditions</em>}</li>
 *   <li>{@link wrs.impl.WRSImpl#getStatisticDatas <em>Statistic Datas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WRSImpl extends CDOObjectImpl implements WRS {
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
		return (Treasury)eGet(WrsPackage.Literals.WRS__MAINVAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainvault(Treasury newMainvault) {
		eSet(WrsPackage.Literals.WRS__MAINVAULT, newMainvault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl getSupplycontrol() {
		return (SupplyControl)eGet(WrsPackage.Literals.WRS__SUPPLYCONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplycontrol(SupplyControl newSupplycontrol) {
		eSet(WrsPackage.Literals.WRS__SUPPLYCONTROL, newSupplycontrol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accounts getAccounts() {
		return (Accounts)eGet(WrsPackage.Literals.WRS__ACCOUNTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccounts(Accounts newAccounts) {
		eSet(WrsPackage.Literals.WRS__ACCOUNTS, newAccounts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAssets getRegisteredasstets() {
		return (RegisteredAssets)eGet(WrsPackage.Literals.WRS__REGISTEREDASSTETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredasstets(RegisteredAssets newRegisteredasstets) {
		eSet(WrsPackage.Literals.WRS__REGISTEREDASSTETS, newRegisteredasstets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldEconomy getWorldeconomy() {
		return (WorldEconomy)eGet(WrsPackage.Literals.WRS__WORLDECONOMY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldeconomy(WorldEconomy newWorldeconomy) {
		eSet(WrsPackage.Literals.WRS__WORLDECONOMY, newWorldeconomy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countries getCountries() {
		return (Countries)eGet(WrsPackage.Literals.WRS__COUNTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountries(Countries newCountries) {
		eSet(WrsPackage.Literals.WRS__COUNTRIES, newCountries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes getNodes() {
		return (Nodes)eGet(WrsPackage.Literals.WRS__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Nodes newNodes) {
		eSet(WrsPackage.Literals.WRS__NODES, newNodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identities getIdentities() {
		return (Identities)eGet(WrsPackage.Literals.WRS__IDENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentities(Identities newIdentities) {
		eSet(WrsPackage.Literals.WRS__IDENTITIES, newIdentities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactions getTransactions() {
		return (Transactions)eGet(WrsPackage.Literals.WRS__TRANSACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactions(Transactions newTransactions) {
		eSet(WrsPackage.Literals.WRS__TRANSACTIONS, newTransactions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConditions getTransactionconditions() {
		return (TransactionConditions)eGet(WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionconditions(TransactionConditions newTransactionconditions) {
		eSet(WrsPackage.Literals.WRS__TRANSACTIONCONDITIONS, newTransactionconditions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticDatas getStatisticDatas() {
		return (StatisticDatas)eGet(WrsPackage.Literals.WRS__STATISTIC_DATAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticDatas(StatisticDatas newStatisticDatas) {
		eSet(WrsPackage.Literals.WRS__STATISTIC_DATAS, newStatisticDatas);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WrsPackage.WRS___CREATE_IDENTITY:
				createIdentity();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //WRSImpl
