/**
 */
package org.wrs.model.wrs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
public class WRSImpl extends MinimalEObjectImpl.Container implements WRS {
	/**
	 * The cached value of the '{@link #getMainvault() <em>Mainvault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainvault()
	 * @generated
	 * @ordered
	 */
	protected Treasury mainvault;

	/**
	 * The cached value of the '{@link #getSupplycontrol() <em>Supplycontrol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplycontrol()
	 * @generated
	 * @ordered
	 */
	protected SupplyControl supplycontrol;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected Accounts accounts;

	/**
	 * The cached value of the '{@link #getRegisteredasstets() <em>Registeredasstets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredasstets()
	 * @generated
	 * @ordered
	 */
	protected RegisteredAssets registeredasstets;

	/**
	 * The cached value of the '{@link #getWorldeconomy() <em>Worldeconomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldeconomy()
	 * @generated
	 * @ordered
	 */
	protected WorldEconomy worldeconomy;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected Countries countries;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected Nodes nodes;

	/**
	 * The cached value of the '{@link #getIdentities() <em>Identities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentities()
	 * @generated
	 * @ordered
	 */
	protected Identities identities;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected Transactions transactions;

	/**
	 * The cached value of the '{@link #getTransactionconditions() <em>Transactionconditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionconditions()
	 * @generated
	 * @ordered
	 */
	protected TransactionConditions transactionconditions;

	/**
	 * The cached value of the '{@link #getStatisticDatas() <em>Statistic Datas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticDatas()
	 * @generated
	 * @ordered
	 */
	protected StatisticDatas statisticDatas;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
		if (mainvault != null && mainvault.eIsProxy()) {
			InternalEObject oldMainvault = (InternalEObject) mainvault;
			mainvault = (Treasury) eResolveProxy(oldMainvault);
			if (mainvault != oldMainvault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.WRS__MAINVAULT, oldMainvault,
							mainvault));
			}
		}
		return mainvault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury basicGetMainvault() {
		return mainvault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainvault(Treasury newMainvault) {
		Treasury oldMainvault = mainvault;
		mainvault = newMainvault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__MAINVAULT, oldMainvault, mainvault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl getSupplycontrol() {
		return supplycontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplycontrol(SupplyControl newSupplycontrol, NotificationChain msgs) {
		SupplyControl oldSupplycontrol = supplycontrol;
		supplycontrol = newSupplycontrol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.WRS__SUPPLYCONTROL, oldSupplycontrol, newSupplycontrol);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplycontrol(SupplyControl newSupplycontrol) {
		if (newSupplycontrol != supplycontrol) {
			NotificationChain msgs = null;
			if (supplycontrol != null)
				msgs = ((InternalEObject) supplycontrol).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__SUPPLYCONTROL, null, msgs);
			if (newSupplycontrol != null)
				msgs = ((InternalEObject) newSupplycontrol).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__SUPPLYCONTROL, null, msgs);
			msgs = basicSetSupplycontrol(newSupplycontrol, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__SUPPLYCONTROL, newSupplycontrol,
					newSupplycontrol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accounts getAccounts() {
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccounts(Accounts newAccounts, NotificationChain msgs) {
		Accounts oldAccounts = accounts;
		accounts = newAccounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__ACCOUNTS,
					oldAccounts, newAccounts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccounts(Accounts newAccounts) {
		if (newAccounts != accounts) {
			NotificationChain msgs = null;
			if (accounts != null)
				msgs = ((InternalEObject) accounts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__ACCOUNTS, null, msgs);
			if (newAccounts != null)
				msgs = ((InternalEObject) newAccounts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__ACCOUNTS, null, msgs);
			msgs = basicSetAccounts(newAccounts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__ACCOUNTS, newAccounts, newAccounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAssets getRegisteredasstets() {
		return registeredasstets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredasstets(RegisteredAssets newRegisteredasstets, NotificationChain msgs) {
		RegisteredAssets oldRegisteredasstets = registeredasstets;
		registeredasstets = newRegisteredasstets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.WRS__REGISTEREDASSTETS, oldRegisteredasstets, newRegisteredasstets);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredasstets(RegisteredAssets newRegisteredasstets) {
		if (newRegisteredasstets != registeredasstets) {
			NotificationChain msgs = null;
			if (registeredasstets != null)
				msgs = ((InternalEObject) registeredasstets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__REGISTEREDASSTETS, null, msgs);
			if (newRegisteredasstets != null)
				msgs = ((InternalEObject) newRegisteredasstets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__REGISTEREDASSTETS, null, msgs);
			msgs = basicSetRegisteredasstets(newRegisteredasstets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__REGISTEREDASSTETS,
					newRegisteredasstets, newRegisteredasstets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldEconomy getWorldeconomy() {
		return worldeconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorldeconomy(WorldEconomy newWorldeconomy, NotificationChain msgs) {
		WorldEconomy oldWorldeconomy = worldeconomy;
		worldeconomy = newWorldeconomy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__WORLDECONOMY,
					oldWorldeconomy, newWorldeconomy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldeconomy(WorldEconomy newWorldeconomy) {
		if (newWorldeconomy != worldeconomy) {
			NotificationChain msgs = null;
			if (worldeconomy != null)
				msgs = ((InternalEObject) worldeconomy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__WORLDECONOMY, null, msgs);
			if (newWorldeconomy != null)
				msgs = ((InternalEObject) newWorldeconomy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__WORLDECONOMY, null, msgs);
			msgs = basicSetWorldeconomy(newWorldeconomy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__WORLDECONOMY, newWorldeconomy,
					newWorldeconomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countries getCountries() {
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountries(Countries newCountries, NotificationChain msgs) {
		Countries oldCountries = countries;
		countries = newCountries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__COUNTRIES,
					oldCountries, newCountries);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountries(Countries newCountries) {
		if (newCountries != countries) {
			NotificationChain msgs = null;
			if (countries != null)
				msgs = ((InternalEObject) countries).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__COUNTRIES, null, msgs);
			if (newCountries != null)
				msgs = ((InternalEObject) newCountries).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__COUNTRIES, null, msgs);
			msgs = basicSetCountries(newCountries, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__COUNTRIES, newCountries,
					newCountries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs) {
		Nodes oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__NODES,
					oldNodes, newNodes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Nodes newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject) nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__NODES,
						null, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject) newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__NODES,
						null, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identities getIdentities() {
		return identities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentities(Identities newIdentities, NotificationChain msgs) {
		Identities oldIdentities = identities;
		identities = newIdentities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__IDENTITIES,
					oldIdentities, newIdentities);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentities(Identities newIdentities) {
		if (newIdentities != identities) {
			NotificationChain msgs = null;
			if (identities != null)
				msgs = ((InternalEObject) identities).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__IDENTITIES, null, msgs);
			if (newIdentities != null)
				msgs = ((InternalEObject) newIdentities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__IDENTITIES, null, msgs);
			msgs = basicSetIdentities(newIdentities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__IDENTITIES, newIdentities,
					newIdentities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactions getTransactions() {
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactions(Transactions newTransactions, NotificationChain msgs) {
		Transactions oldTransactions = transactions;
		transactions = newTransactions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__TRANSACTIONS,
					oldTransactions, newTransactions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactions(Transactions newTransactions) {
		if (newTransactions != transactions) {
			NotificationChain msgs = null;
			if (transactions != null)
				msgs = ((InternalEObject) transactions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__TRANSACTIONS, null, msgs);
			if (newTransactions != null)
				msgs = ((InternalEObject) newTransactions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__TRANSACTIONS, null, msgs);
			msgs = basicSetTransactions(newTransactions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__TRANSACTIONS, newTransactions,
					newTransactions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConditions getTransactionconditions() {
		return transactionconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionconditions(TransactionConditions newTransactionconditions,
			NotificationChain msgs) {
		TransactionConditions oldTransactionconditions = transactionconditions;
		transactionconditions = newTransactionconditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.WRS__TRANSACTIONCONDITIONS, oldTransactionconditions, newTransactionconditions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionconditions(TransactionConditions newTransactionconditions) {
		if (newTransactionconditions != transactionconditions) {
			NotificationChain msgs = null;
			if (transactionconditions != null)
				msgs = ((InternalEObject) transactionconditions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__TRANSACTIONCONDITIONS, null, msgs);
			if (newTransactionconditions != null)
				msgs = ((InternalEObject) newTransactionconditions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__TRANSACTIONCONDITIONS, null, msgs);
			msgs = basicSetTransactionconditions(newTransactionconditions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__TRANSACTIONCONDITIONS,
					newTransactionconditions, newTransactionconditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticDatas getStatisticDatas() {
		return statisticDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatisticDatas(StatisticDatas newStatisticDatas, NotificationChain msgs) {
		StatisticDatas oldStatisticDatas = statisticDatas;
		statisticDatas = newStatisticDatas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WrsPackage.WRS__STATISTIC_DATAS, oldStatisticDatas, newStatisticDatas);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticDatas(StatisticDatas newStatisticDatas) {
		if (newStatisticDatas != statisticDatas) {
			NotificationChain msgs = null;
			if (statisticDatas != null)
				msgs = ((InternalEObject) statisticDatas).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__STATISTIC_DATAS, null, msgs);
			if (newStatisticDatas != null)
				msgs = ((InternalEObject) newStatisticDatas).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WrsPackage.WRS__STATISTIC_DATAS, null, msgs);
			msgs = basicSetStatisticDatas(newStatisticDatas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__STATISTIC_DATAS, newStatisticDatas,
					newStatisticDatas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.WRS__NAME, oldName, name));
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
			return mainvault != null;
		case WrsPackage.WRS__SUPPLYCONTROL:
			return supplycontrol != null;
		case WrsPackage.WRS__ACCOUNTS:
			return accounts != null;
		case WrsPackage.WRS__REGISTEREDASSTETS:
			return registeredasstets != null;
		case WrsPackage.WRS__WORLDECONOMY:
			return worldeconomy != null;
		case WrsPackage.WRS__COUNTRIES:
			return countries != null;
		case WrsPackage.WRS__NODES:
			return nodes != null;
		case WrsPackage.WRS__IDENTITIES:
			return identities != null;
		case WrsPackage.WRS__TRANSACTIONS:
			return transactions != null;
		case WrsPackage.WRS__TRANSACTIONCONDITIONS:
			return transactionconditions != null;
		case WrsPackage.WRS__STATISTIC_DATAS:
			return statisticDatas != null;
		case WrsPackage.WRS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WRSImpl
