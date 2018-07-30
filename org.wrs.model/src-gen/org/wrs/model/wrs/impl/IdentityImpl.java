/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.IdentityImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.IdentityImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IdentityImpl extends LayoutableImpl implements Identity {
	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.IDENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUUID() {
		return (String) eDynamicGet(WrsPackage.IDENTITY__UUID, WrsPackage.Literals.IDENTITY__UUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUUID(String newUUID) {
		eDynamicSet(WrsPackage.IDENTITY__UUID, WrsPackage.Literals.IDENTITY__UUID, newUUID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractAccount> getAccounts() {
		return (EList<AbstractAccount>) eDynamicGet(WrsPackage.IDENTITY__ACCOUNTS,
				WrsPackage.Literals.IDENTITY__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.IDENTITY__ACCOUNTS:
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
		case WrsPackage.IDENTITY__UUID:
			return getUUID();
		case WrsPackage.IDENTITY__ACCOUNTS:
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
		case WrsPackage.IDENTITY__UUID:
			setUUID((String) newValue);
			return;
		case WrsPackage.IDENTITY__ACCOUNTS:
			getAccounts().clear();
			getAccounts().addAll((Collection<? extends AbstractAccount>) newValue);
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
		case WrsPackage.IDENTITY__UUID:
			setUUID(UUID_EDEFAULT);
			return;
		case WrsPackage.IDENTITY__ACCOUNTS:
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
		case WrsPackage.IDENTITY__UUID:
			return UUID_EDEFAULT == null ? getUUID() != null : !UUID_EDEFAULT.equals(getUUID());
		case WrsPackage.IDENTITY__ACCOUNTS:
			return !getAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IdentityImpl
