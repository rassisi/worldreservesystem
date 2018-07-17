/**
 */
package org.wrs.wrs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.wrs.wrs.Accounts;
import org.wrs.wrs.Identities;
import org.wrs.wrs.RegisteredAssets;
import org.wrs.wrs.SupplyControl;
import org.wrs.wrs.TransferVaults;
import org.wrs.wrs.Treasury;
import org.wrs.wrs.WrsPackage;
import org.wrs.wrs.wrs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wrs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.wrsImpl#getTransfervaults <em>Transfervaults</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.wrsImpl#getMainvault <em>Mainvault</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.wrsImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.wrsImpl#getSupplycontrol <em>Supplycontrol</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.wrsImpl#getWallets <em>Wallets</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.wrsImpl#getRegisteredasstets <em>Registeredasstets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class wrsImpl extends IdentityImpl implements wrs {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected wrsImpl() {
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
	public TransferVaults getTransfervaults() {
		return (TransferVaults)eGet(WrsPackage.Literals.WRS__TRANSFERVAULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfervaults(TransferVaults newTransfervaults) {
		eSet(WrsPackage.Literals.WRS__TRANSFERVAULTS, newTransfervaults);
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
	public Accounts getWallets() {
		return (Accounts)eGet(WrsPackage.Literals.WRS__WALLETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallets(Accounts newWallets) {
		eSet(WrsPackage.Literals.WRS__WALLETS, newWallets);
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

} //wrsImpl
