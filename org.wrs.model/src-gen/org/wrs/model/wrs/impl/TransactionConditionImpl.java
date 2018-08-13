/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wrs.model.wrs.SignedInput;
import org.wrs.model.wrs.TransactionCondition;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionConditionImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.TransactionConditionImpl#getSignedInputs <em>Signed Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionConditionImpl extends LayoutableImpl implements TransactionCondition {
	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.TRANSACTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return (String) eDynamicGet(WrsPackage.TRANSACTION_CONDITION__FORMULA,
				WrsPackage.Literals.TRANSACTION_CONDITION__FORMULA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		eDynamicSet(WrsPackage.TRANSACTION_CONDITION__FORMULA, WrsPackage.Literals.TRANSACTION_CONDITION__FORMULA,
				newFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SignedInput> getSignedInputs() {
		return (EList<SignedInput>) eDynamicGet(WrsPackage.TRANSACTION_CONDITION__SIGNED_INPUTS,
				WrsPackage.Literals.TRANSACTION_CONDITION__SIGNED_INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.TRANSACTION_CONDITION__SIGNED_INPUTS:
			return ((InternalEList<?>) getSignedInputs()).basicRemove(otherEnd, msgs);
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
		case WrsPackage.TRANSACTION_CONDITION__FORMULA:
			return getFormula();
		case WrsPackage.TRANSACTION_CONDITION__SIGNED_INPUTS:
			return getSignedInputs();
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
		case WrsPackage.TRANSACTION_CONDITION__FORMULA:
			setFormula((String) newValue);
			return;
		case WrsPackage.TRANSACTION_CONDITION__SIGNED_INPUTS:
			getSignedInputs().clear();
			getSignedInputs().addAll((Collection<? extends SignedInput>) newValue);
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
		case WrsPackage.TRANSACTION_CONDITION__FORMULA:
			setFormula(FORMULA_EDEFAULT);
			return;
		case WrsPackage.TRANSACTION_CONDITION__SIGNED_INPUTS:
			getSignedInputs().clear();
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
		case WrsPackage.TRANSACTION_CONDITION__FORMULA:
			return FORMULA_EDEFAULT == null ? getFormula() != null : !FORMULA_EDEFAULT.equals(getFormula());
		case WrsPackage.TRANSACTION_CONDITION__SIGNED_INPUTS:
			return !getSignedInputs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionConditionImpl
