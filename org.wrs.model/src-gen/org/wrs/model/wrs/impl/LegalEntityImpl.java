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
import org.wrs.model.wrs.BusinessAccount;
import org.wrs.model.wrs.LegalEntity;
import org.wrs.model.wrs.LegalEntityType;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.LegalEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LegalEntityImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LegalEntityImpl#getBusinessAccounts <em>Business Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegalEntityImpl extends HumanEntityImpl implements LegalEntity {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LegalEntityType TYPE_EDEFAULT = LegalEntityType.COMPANY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.LEGAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityType getType() {
		return (LegalEntityType) eDynamicGet(WrsPackage.LEGAL_ENTITY__TYPE, WrsPackage.Literals.LEGAL_ENTITY__TYPE,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LegalEntityType newType) {
		eDynamicSet(WrsPackage.LEGAL_ENTITY__TYPE, WrsPackage.Literals.LEGAL_ENTITY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractAccount> getAccounts() {
		return (EList<AbstractAccount>) eDynamicGet(WrsPackage.LEGAL_ENTITY__ACCOUNTS,
				WrsPackage.Literals.LEGAL_ENTITY__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BusinessAccount> getBusinessAccounts() {
		return (EList<BusinessAccount>) eDynamicGet(WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS,
				WrsPackage.Literals.LEGAL_ENTITY__BUSINESS_ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.LEGAL_ENTITY__ACCOUNTS:
			return ((InternalEList<?>) getAccounts()).basicRemove(otherEnd, msgs);
		case WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS:
			return ((InternalEList<?>) getBusinessAccounts()).basicRemove(otherEnd, msgs);
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
		case WrsPackage.LEGAL_ENTITY__TYPE:
			return getType();
		case WrsPackage.LEGAL_ENTITY__ACCOUNTS:
			return getAccounts();
		case WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS:
			return getBusinessAccounts();
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
		case WrsPackage.LEGAL_ENTITY__TYPE:
			setType((LegalEntityType) newValue);
			return;
		case WrsPackage.LEGAL_ENTITY__ACCOUNTS:
			getAccounts().clear();
			getAccounts().addAll((Collection<? extends AbstractAccount>) newValue);
			return;
		case WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS:
			getBusinessAccounts().clear();
			getBusinessAccounts().addAll((Collection<? extends BusinessAccount>) newValue);
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
		case WrsPackage.LEGAL_ENTITY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case WrsPackage.LEGAL_ENTITY__ACCOUNTS:
			getAccounts().clear();
			return;
		case WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS:
			getBusinessAccounts().clear();
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
		case WrsPackage.LEGAL_ENTITY__TYPE:
			return getType() != TYPE_EDEFAULT;
		case WrsPackage.LEGAL_ENTITY__ACCOUNTS:
			return !getAccounts().isEmpty();
		case WrsPackage.LEGAL_ENTITY__BUSINESS_ACCOUNTS:
			return !getBusinessAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegalEntityImpl
