/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.InputValueType;
import org.wrs.model.wrs.SignedInput;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.SignedInputImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.SignedInputImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.SignedInputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.SignedInputImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignedInputImpl extends CDOObjectImpl implements SignedInput {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InputValueType TYPE_EDEFAULT = InputValueType.DATE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignedInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.SIGNED_INPUT;
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
	public String getVariableName() {
		return (String) eDynamicGet(WrsPackage.SIGNED_INPUT__VARIABLE_NAME,
				WrsPackage.Literals.SIGNED_INPUT__VARIABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		eDynamicSet(WrsPackage.SIGNED_INPUT__VARIABLE_NAME, WrsPackage.Literals.SIGNED_INPUT__VARIABLE_NAME,
				newVariableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getIdentity() {
		return (Identity) eDynamicGet(WrsPackage.SIGNED_INPUT__IDENTITY, WrsPackage.Literals.SIGNED_INPUT__IDENTITY,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity basicGetIdentity() {
		return (Identity) eDynamicGet(WrsPackage.SIGNED_INPUT__IDENTITY, WrsPackage.Literals.SIGNED_INPUT__IDENTITY,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Identity newIdentity) {
		eDynamicSet(WrsPackage.SIGNED_INPUT__IDENTITY, WrsPackage.Literals.SIGNED_INPUT__IDENTITY, newIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String) eDynamicGet(WrsPackage.SIGNED_INPUT__VALUE, WrsPackage.Literals.SIGNED_INPUT__VALUE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(WrsPackage.SIGNED_INPUT__VALUE, WrsPackage.Literals.SIGNED_INPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValueType getType() {
		return (InputValueType) eDynamicGet(WrsPackage.SIGNED_INPUT__TYPE, WrsPackage.Literals.SIGNED_INPUT__TYPE, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InputValueType newType) {
		eDynamicSet(WrsPackage.SIGNED_INPUT__TYPE, WrsPackage.Literals.SIGNED_INPUT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.SIGNED_INPUT__VARIABLE_NAME:
			return getVariableName();
		case WrsPackage.SIGNED_INPUT__IDENTITY:
			if (resolve)
				return getIdentity();
			return basicGetIdentity();
		case WrsPackage.SIGNED_INPUT__VALUE:
			return getValue();
		case WrsPackage.SIGNED_INPUT__TYPE:
			return getType();
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
		case WrsPackage.SIGNED_INPUT__VARIABLE_NAME:
			setVariableName((String) newValue);
			return;
		case WrsPackage.SIGNED_INPUT__IDENTITY:
			setIdentity((Identity) newValue);
			return;
		case WrsPackage.SIGNED_INPUT__VALUE:
			setValue((String) newValue);
			return;
		case WrsPackage.SIGNED_INPUT__TYPE:
			setType((InputValueType) newValue);
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
		case WrsPackage.SIGNED_INPUT__VARIABLE_NAME:
			setVariableName(VARIABLE_NAME_EDEFAULT);
			return;
		case WrsPackage.SIGNED_INPUT__IDENTITY:
			setIdentity((Identity) null);
			return;
		case WrsPackage.SIGNED_INPUT__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case WrsPackage.SIGNED_INPUT__TYPE:
			setType(TYPE_EDEFAULT);
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
		case WrsPackage.SIGNED_INPUT__VARIABLE_NAME:
			return VARIABLE_NAME_EDEFAULT == null ? getVariableName() != null
					: !VARIABLE_NAME_EDEFAULT.equals(getVariableName());
		case WrsPackage.SIGNED_INPUT__IDENTITY:
			return basicGetIdentity() != null;
		case WrsPackage.SIGNED_INPUT__VALUE:
			return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		case WrsPackage.SIGNED_INPUT__TYPE:
			return getType() != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SignedInputImpl
