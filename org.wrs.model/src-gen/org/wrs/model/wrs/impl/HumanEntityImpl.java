/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wrs.model.wrs.Account;
import org.wrs.model.wrs.HumanEntity;
import org.wrs.model.wrs.WorldEconomy;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.HumanEntityImpl#getWorldeconomy <em>Worldeconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.HumanEntityImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HumanEntityImpl extends IdentityImpl implements HumanEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.HUMAN_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldEconomy getWorldeconomy() {
		return (WorldEconomy) eDynamicGet(WrsPackage.HUMAN_ENTITY__WORLDECONOMY,
				WrsPackage.Literals.HUMAN_ENTITY__WORLDECONOMY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldEconomy basicGetWorldeconomy() {
		return (WorldEconomy) eDynamicGet(WrsPackage.HUMAN_ENTITY__WORLDECONOMY,
				WrsPackage.Literals.HUMAN_ENTITY__WORLDECONOMY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldeconomy(WorldEconomy newWorldeconomy) {
		eDynamicSet(WrsPackage.HUMAN_ENTITY__WORLDECONOMY, WrsPackage.Literals.HUMAN_ENTITY__WORLDECONOMY,
				newWorldeconomy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Account> getAccounts() {
		return (EList<Account>) eDynamicGet(WrsPackage.HUMAN_ENTITY__ACCOUNTS,
				WrsPackage.Literals.HUMAN_ENTITY__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.HUMAN_ENTITY__ACCOUNTS:
			return ((InternalEList<?>) getAccounts()).basicRemove(otherEnd, msgs);
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
		case WrsPackage.HUMAN_ENTITY__WORLDECONOMY:
			if (resolve)
				return getWorldeconomy();
			return basicGetWorldeconomy();
		case WrsPackage.HUMAN_ENTITY__ACCOUNTS:
			return getAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.HUMAN_ENTITY__WORLDECONOMY:
			setWorldeconomy((WorldEconomy) newValue);
			return;
		case WrsPackage.HUMAN_ENTITY__ACCOUNTS:
			getAccounts().clear();
			getAccounts().addAll((Collection<? extends Account>) newValue);
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
		case WrsPackage.HUMAN_ENTITY__WORLDECONOMY:
			setWorldeconomy((WorldEconomy) null);
			return;
		case WrsPackage.HUMAN_ENTITY__ACCOUNTS:
			getAccounts().clear();
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
		case WrsPackage.HUMAN_ENTITY__WORLDECONOMY:
			return basicGetWorldeconomy() != null;
		case WrsPackage.HUMAN_ENTITY__ACCOUNTS:
			return !getAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HumanEntityImpl
