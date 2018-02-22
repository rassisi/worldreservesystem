/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import worldreservesystem.Identities;
import worldreservesystem.MainVault;
import worldreservesystem.RegisteredAsstets;
import worldreservesystem.SupplyControl;
import worldreservesystem.TransferVaults;
import worldreservesystem.Wallets;
import worldreservesystem.WorldReserveSystem;
import worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Reserve System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.impl.WorldReserveSystemImpl#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link worldreservesystem.impl.WorldReserveSystemImpl#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link worldreservesystem.impl.WorldReserveSystemImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link worldreservesystem.impl.WorldReserveSystemImpl#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link worldreservesystem.impl.WorldReserveSystemImpl#getWallets <em>Wallets</em>}</li>
 *   <li>{@link worldreservesystem.impl.WorldReserveSystemImpl#getRegisteredasstets <em>Registeredasstets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldReserveSystemImpl extends IdentityImpl implements WorldReserveSystem {
	/**
	 * The cached value of the '{@link #getTransfervaults() <em>Transfervaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfervaults()
	 * @generated
	 * @ordered
	 */
	protected TransferVaults transfervaults;

	/**
	 * The cached value of the '{@link #getMainvault() <em>Mainvault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainvault()
	 * @generated
	 * @ordered
	 */
	protected MainVault mainvault;

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
	 * The cached value of the '{@link #getSupplycontrol() <em>Supplycontrol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplycontrol()
	 * @generated
	 * @ordered
	 */
	protected SupplyControl supplycontrol;

	/**
	 * The cached value of the '{@link #getWallets() <em>Wallets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallets()
	 * @generated
	 * @ordered
	 */
	protected Wallets wallets;

	/**
	 * The cached value of the '{@link #getRegisteredasstets() <em>Registeredasstets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredasstets()
	 * @generated
	 * @ordered
	 */
	protected RegisteredAsstets registeredasstets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldReserveSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferVaults getTransfervaults() {
		return transfervaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransfervaults(TransferVaults newTransfervaults, NotificationChain msgs) {
		TransferVaults oldTransfervaults = transfervaults;
		transfervaults = newTransfervaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS, oldTransfervaults,
					newTransfervaults);
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
	public void setTransfervaults(TransferVaults newTransfervaults) {
		if (newTransfervaults != transfervaults) {
			NotificationChain msgs = null;
			if (transfervaults != null)
				msgs = ((InternalEObject) transfervaults).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS, null,
						msgs);
			if (newTransfervaults != null)
				msgs = ((InternalEObject) newTransfervaults).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS, null,
						msgs);
			msgs = basicSetTransfervaults(newTransfervaults, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS, newTransfervaults,
					newTransfervaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainVault getMainvault() {
		return mainvault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainvault(MainVault newMainvault, NotificationChain msgs) {
		MainVault oldMainvault = mainvault;
		mainvault = newMainvault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT, oldMainvault, newMainvault);
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
	public void setMainvault(MainVault newMainvault) {
		if (newMainvault != mainvault) {
			NotificationChain msgs = null;
			if (mainvault != null)
				msgs = ((InternalEObject) mainvault).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT, null, msgs);
			if (newMainvault != null)
				msgs = ((InternalEObject) newMainvault).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT, null, msgs);
			msgs = basicSetMainvault(newMainvault, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT, newMainvault, newMainvault));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES, oldIdentities, newIdentities);
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
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES, null,
						msgs);
			if (newIdentities != null)
				msgs = ((InternalEObject) newIdentities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES, null,
						msgs);
			msgs = basicSetIdentities(newIdentities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES, newIdentities, newIdentities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl getSupplycontrol() {
		if (supplycontrol != null && supplycontrol.eIsProxy()) {
			InternalEObject oldSupplycontrol = (InternalEObject) supplycontrol;
			supplycontrol = (SupplyControl) eResolveProxy(oldSupplycontrol);
			if (supplycontrol != oldSupplycontrol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL, oldSupplycontrol,
							supplycontrol));
			}
		}
		return supplycontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl basicGetSupplycontrol() {
		return supplycontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplycontrol(SupplyControl newSupplycontrol) {
		SupplyControl oldSupplycontrol = supplycontrol;
		supplycontrol = newSupplycontrol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL, oldSupplycontrol, supplycontrol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallets getWallets() {
		return wallets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallets(Wallets newWallets, NotificationChain msgs) {
		Wallets oldWallets = wallets;
		wallets = newWallets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS, oldWallets, newWallets);
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
	public void setWallets(Wallets newWallets) {
		if (newWallets != wallets) {
			NotificationChain msgs = null;
			if (wallets != null)
				msgs = ((InternalEObject) wallets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS, null, msgs);
			if (newWallets != null)
				msgs = ((InternalEObject) newWallets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS, null, msgs);
			msgs = basicSetWallets(newWallets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS, newWallets, newWallets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAsstets getRegisteredasstets() {
		if (registeredasstets != null && registeredasstets.eIsProxy()) {
			InternalEObject oldRegisteredasstets = (InternalEObject) registeredasstets;
			registeredasstets = (RegisteredAsstets) eResolveProxy(oldRegisteredasstets);
			if (registeredasstets != oldRegisteredasstets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS, oldRegisteredasstets,
							registeredasstets));
			}
		}
		return registeredasstets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAsstets basicGetRegisteredasstets() {
		return registeredasstets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredasstets(RegisteredAsstets newRegisteredasstets) {
		RegisteredAsstets oldRegisteredasstets = registeredasstets;
		registeredasstets = newRegisteredasstets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS, oldRegisteredasstets,
					registeredasstets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS:
			return basicSetTransfervaults(null, msgs);
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT:
			return basicSetMainvault(null, msgs);
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES:
			return basicSetIdentities(null, msgs);
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS:
			return basicSetWallets(null, msgs);
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
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS:
			return getTransfervaults();
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT:
			return getMainvault();
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES:
			return getIdentities();
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL:
			if (resolve)
				return getSupplycontrol();
			return basicGetSupplycontrol();
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS:
			return getWallets();
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS:
			if (resolve)
				return getRegisteredasstets();
			return basicGetRegisteredasstets();
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
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS:
			setTransfervaults((TransferVaults) newValue);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT:
			setMainvault((MainVault) newValue);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES:
			setIdentities((Identities) newValue);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL:
			setSupplycontrol((SupplyControl) newValue);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS:
			setWallets((Wallets) newValue);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS:
			setRegisteredasstets((RegisteredAsstets) newValue);
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
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS:
			setTransfervaults((TransferVaults) null);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT:
			setMainvault((MainVault) null);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES:
			setIdentities((Identities) null);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL:
			setSupplycontrol((SupplyControl) null);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS:
			setWallets((Wallets) null);
			return;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS:
			setRegisteredasstets((RegisteredAsstets) null);
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
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS:
			return transfervaults != null;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__MAINVAULT:
			return mainvault != null;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__IDENTITIES:
			return identities != null;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL:
			return supplycontrol != null;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__WALLETS:
			return wallets != null;
		case WorldreservesystemPackage.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS:
			return registeredasstets != null;
		}
		return super.eIsSet(featureID);
	}

} //WorldReserveSystemImpl
