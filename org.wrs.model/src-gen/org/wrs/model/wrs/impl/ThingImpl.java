/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.Thing;
import org.wrs.model.wrs.ThingAccount;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.ThingImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.ThingImpl#getThingAccounts <em>Thing Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends IdentityImpl implements Thing {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		return (Identity) eDynamicGet(WrsPackage.THING__BELONGS_TO, WrsPackage.Literals.THING__BELONGS_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity basicGetBelongsTo() {
		return (Identity) eDynamicGet(WrsPackage.THING__BELONGS_TO, WrsPackage.Literals.THING__BELONGS_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		eDynamicSet(WrsPackage.THING__BELONGS_TO, WrsPackage.Literals.THING__BELONGS_TO, newBelongsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ThingAccount> getThingAccounts() {
		return (EList<ThingAccount>) eDynamicGet(WrsPackage.THING__THING_ACCOUNTS,
				WrsPackage.Literals.THING__THING_ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.THING__THING_ACCOUNTS:
			return ((InternalEList<?>) getThingAccounts()).basicRemove(otherEnd, msgs);
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
		case WrsPackage.THING__BELONGS_TO:
			if (resolve)
				return getBelongsTo();
			return basicGetBelongsTo();
		case WrsPackage.THING__THING_ACCOUNTS:
			return getThingAccounts();
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
		case WrsPackage.THING__BELONGS_TO:
			setBelongsTo((Identity) newValue);
			return;
		case WrsPackage.THING__THING_ACCOUNTS:
			getThingAccounts().clear();
			getThingAccounts().addAll((Collection<? extends ThingAccount>) newValue);
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
		case WrsPackage.THING__BELONGS_TO:
			setBelongsTo((Identity) null);
			return;
		case WrsPackage.THING__THING_ACCOUNTS:
			getThingAccounts().clear();
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
		case WrsPackage.THING__BELONGS_TO:
			return basicGetBelongsTo() != null;
		case WrsPackage.THING__THING_ACCOUNTS:
			return !getThingAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThingImpl
