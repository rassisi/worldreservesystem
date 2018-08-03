/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.GenesisAccount;
import org.wrs.model.wrs.SupplyControl;
import org.wrs.model.wrs.TransferVaults;
import org.wrs.model.wrs.Treasury;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.SupplyControlImpl#getGenesisAccount <em>Genesis Account</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.SupplyControlImpl#getTransferVaults <em>Transfer Vaults</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.SupplyControlImpl#getTreasury <em>Treasury</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyControlImpl extends CDOObjectImpl implements SupplyControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.SUPPLY_CONTROL;
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
	public GenesisAccount getGenesisAccount() {
		return (GenesisAccount) eDynamicGet(WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT,
				WrsPackage.Literals.SUPPLY_CONTROL__GENESIS_ACCOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenesisAccount(GenesisAccount newGenesisAccount, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newGenesisAccount, WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenesisAccount(GenesisAccount newGenesisAccount) {
		eDynamicSet(WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT, WrsPackage.Literals.SUPPLY_CONTROL__GENESIS_ACCOUNT,
				newGenesisAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferVaults getTransferVaults() {
		return (TransferVaults) eDynamicGet(WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS,
				WrsPackage.Literals.SUPPLY_CONTROL__TRANSFER_VAULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferVaults basicGetTransferVaults() {
		return (TransferVaults) eDynamicGet(WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS,
				WrsPackage.Literals.SUPPLY_CONTROL__TRANSFER_VAULTS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferVaults(TransferVaults newTransferVaults) {
		eDynamicSet(WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS, WrsPackage.Literals.SUPPLY_CONTROL__TRANSFER_VAULTS,
				newTransferVaults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury getTreasury() {
		return (Treasury) eDynamicGet(WrsPackage.SUPPLY_CONTROL__TREASURY, WrsPackage.Literals.SUPPLY_CONTROL__TREASURY,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treasury basicGetTreasury() {
		return (Treasury) eDynamicGet(WrsPackage.SUPPLY_CONTROL__TREASURY, WrsPackage.Literals.SUPPLY_CONTROL__TREASURY,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreasury(Treasury newTreasury) {
		eDynamicSet(WrsPackage.SUPPLY_CONTROL__TREASURY, WrsPackage.Literals.SUPPLY_CONTROL__TREASURY, newTreasury);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT:
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT:
			return getGenesisAccount();
		case WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS:
			if (resolve)
				return getTransferVaults();
			return basicGetTransferVaults();
		case WrsPackage.SUPPLY_CONTROL__TREASURY:
			if (resolve)
				return getTreasury();
			return basicGetTreasury();
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT:
			setGenesisAccount((GenesisAccount) newValue);
			return;
		case WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS:
			setTransferVaults((TransferVaults) newValue);
			return;
		case WrsPackage.SUPPLY_CONTROL__TREASURY:
			setTreasury((Treasury) newValue);
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT:
			setGenesisAccount((GenesisAccount) null);
			return;
		case WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS:
			setTransferVaults((TransferVaults) null);
			return;
		case WrsPackage.SUPPLY_CONTROL__TREASURY:
			setTreasury((Treasury) null);
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS_ACCOUNT:
			return getGenesisAccount() != null;
		case WrsPackage.SUPPLY_CONTROL__TRANSFER_VAULTS:
			return basicGetTransferVaults() != null;
		case WrsPackage.SUPPLY_CONTROL__TREASURY:
			return basicGetTreasury() != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyControlImpl
