/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wrs.model.wrs.Individual;
import org.wrs.model.wrs.LegalEntity;
import org.wrs.model.wrs.PrivateAccount;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.IndividualImpl#getWorksFor <em>Works For</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.IndividualImpl#getLegalPartnerOf <em>Legal Partner Of</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.IndividualImpl#getPrivateAccounts <em>Private Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends HumanEntityImpl implements Individual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LegalEntity> getWorksFor() {
		return (EList<LegalEntity>) eDynamicGet(WrsPackage.INDIVIDUAL__WORKS_FOR,
				WrsPackage.Literals.INDIVIDUAL__WORKS_FOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Individual> getLegalPartnerOf() {
		return (EList<Individual>) eDynamicGet(WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF,
				WrsPackage.Literals.INDIVIDUAL__LEGAL_PARTNER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PrivateAccount> getPrivateAccounts() {
		return (EList<PrivateAccount>) eDynamicGet(WrsPackage.INDIVIDUAL__PRIVATE_ACCOUNTS,
				WrsPackage.Literals.INDIVIDUAL__PRIVATE_ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.INDIVIDUAL__PRIVATE_ACCOUNTS:
			return ((InternalEList<?>) getPrivateAccounts()).basicRemove(otherEnd, msgs);
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
		case WrsPackage.INDIVIDUAL__WORKS_FOR:
			return getWorksFor();
		case WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF:
			return getLegalPartnerOf();
		case WrsPackage.INDIVIDUAL__PRIVATE_ACCOUNTS:
			return getPrivateAccounts();
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
		case WrsPackage.INDIVIDUAL__WORKS_FOR:
			getWorksFor().clear();
			getWorksFor().addAll((Collection<? extends LegalEntity>) newValue);
			return;
		case WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF:
			getLegalPartnerOf().clear();
			getLegalPartnerOf().addAll((Collection<? extends Individual>) newValue);
			return;
		case WrsPackage.INDIVIDUAL__PRIVATE_ACCOUNTS:
			getPrivateAccounts().clear();
			getPrivateAccounts().addAll((Collection<? extends PrivateAccount>) newValue);
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
		case WrsPackage.INDIVIDUAL__WORKS_FOR:
			getWorksFor().clear();
			return;
		case WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF:
			getLegalPartnerOf().clear();
			return;
		case WrsPackage.INDIVIDUAL__PRIVATE_ACCOUNTS:
			getPrivateAccounts().clear();
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
		case WrsPackage.INDIVIDUAL__WORKS_FOR:
			return !getWorksFor().isEmpty();
		case WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF:
			return !getLegalPartnerOf().isEmpty();
		case WrsPackage.INDIVIDUAL__PRIVATE_ACCOUNTS:
			return !getPrivateAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
