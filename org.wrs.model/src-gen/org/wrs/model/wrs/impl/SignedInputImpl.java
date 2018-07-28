/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
public class SignedInputImpl extends MinimalEObjectImpl.Container implements SignedInput {
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
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Identity identity;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InputValueType type = TYPE_EDEFAULT;

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
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.SIGNED_INPUT__VARIABLE_NAME,
					oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getIdentity() {
		if (identity != null && identity.eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject) identity;
			identity = (Identity) eResolveProxy(oldIdentity);
			if (identity != oldIdentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.SIGNED_INPUT__IDENTITY,
							oldIdentity, identity));
			}
		}
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Identity newIdentity) {
		Identity oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.SIGNED_INPUT__IDENTITY, oldIdentity,
					identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.SIGNED_INPUT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InputValueType newType) {
		InputValueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.SIGNED_INPUT__TYPE, oldType, type));
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
			return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
		case WrsPackage.SIGNED_INPUT__IDENTITY:
			return identity != null;
		case WrsPackage.SIGNED_INPUT__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case WrsPackage.SIGNED_INPUT__TYPE:
			return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SignedInputImpl
