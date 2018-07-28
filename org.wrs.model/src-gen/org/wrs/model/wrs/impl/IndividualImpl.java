/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.wrs.model.wrs.Individual;
import org.wrs.model.wrs.LegalEntity;
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
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends IdentityImpl implements Individual {
	/**
	 * The cached value of the '{@link #getWorksFor() <em>Works For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksFor()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalEntity> worksFor;

	/**
	 * The cached value of the '{@link #getLegalPartnerOf() <em>Legal Partner Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalPartnerOf()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalEntity> legalPartnerOf;

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
	public EList<LegalEntity> getWorksFor() {
		if (worksFor == null) {
			worksFor = new EObjectResolvingEList<LegalEntity>(LegalEntity.class, this,
					WrsPackage.INDIVIDUAL__WORKS_FOR);
		}
		return worksFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegalEntity> getLegalPartnerOf() {
		if (legalPartnerOf == null) {
			legalPartnerOf = new EObjectResolvingEList<LegalEntity>(LegalEntity.class, this,
					WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF);
		}
		return legalPartnerOf;
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
			getLegalPartnerOf().addAll((Collection<? extends LegalEntity>) newValue);
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
			return worksFor != null && !worksFor.isEmpty();
		case WrsPackage.INDIVIDUAL__LEGAL_PARTNER_OF:
			return legalPartnerOf != null && !legalPartnerOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
