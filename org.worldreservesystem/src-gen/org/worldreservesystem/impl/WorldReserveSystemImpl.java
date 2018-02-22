/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.ecore.EClass;

import org.worldreservesystem.Identities;
import org.worldreservesystem.MainVault;
import org.worldreservesystem.RegisteredAsstets;
import org.worldreservesystem.SupplyControl;
import org.worldreservesystem.TransferVaults;
import org.worldreservesystem.Wallets;
import org.worldreservesystem.WorldReserveSystem;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Reserve System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.WorldReserveSystemImpl#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.WorldReserveSystemImpl#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.WorldReserveSystemImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.WorldReserveSystemImpl#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.WorldReserveSystemImpl#getWallets <em>Wallets</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.WorldReserveSystemImpl#getRegisteredasstets <em>Registeredasstets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldReserveSystemImpl extends IdentityImpl implements WorldReserveSystem {
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
		return (TransferVaults) eGet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfervaults(TransferVaults newTransfervaults) {
		eSet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__TRANSFERVAULTS, newTransfervaults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainVault getMainvault() {
		return (MainVault) eGet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__MAINVAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainvault(MainVault newMainvault) {
		eSet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__MAINVAULT, newMainvault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identities getIdentities() {
		return (Identities) eGet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__IDENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentities(Identities newIdentities) {
		eSet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__IDENTITIES, newIdentities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyControl getSupplycontrol() {
		return (SupplyControl) eGet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplycontrol(SupplyControl newSupplycontrol) {
		eSet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__SUPPLYCONTROL, newSupplycontrol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallets getWallets() {
		return (Wallets) eGet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__WALLETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallets(Wallets newWallets) {
		eSet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__WALLETS, newWallets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredAsstets getRegisteredasstets() {
		return (RegisteredAsstets) eGet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredasstets(RegisteredAsstets newRegisteredasstets) {
		eSet(WorldreservesystemPackage.Literals.WORLD_RESERVE_SYSTEM__REGISTEREDASSTETS, newRegisteredasstets);
	}

} //WorldReserveSystemImpl
