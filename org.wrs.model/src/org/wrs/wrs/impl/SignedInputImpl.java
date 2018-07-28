/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.wrs.Identity;
import org.wrs.wrs.InputValueType;
import org.wrs.wrs.SignedInput;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.SignedInputImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.SignedInputImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.SignedInputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.SignedInputImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignedInputImpl extends CDOObjectImpl implements SignedInput {
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
		return (String)eGet(WrsPackage.Literals.SIGNED_INPUT__VARIABLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		eSet(WrsPackage.Literals.SIGNED_INPUT__VARIABLE_NAME, newVariableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getIdentity() {
		return (Identity)eGet(WrsPackage.Literals.SIGNED_INPUT__IDENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Identity newIdentity) {
		eSet(WrsPackage.Literals.SIGNED_INPUT__IDENTITY, newIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(WrsPackage.Literals.SIGNED_INPUT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(WrsPackage.Literals.SIGNED_INPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValueType getType() {
		return (InputValueType)eGet(WrsPackage.Literals.SIGNED_INPUT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InputValueType newType) {
		eSet(WrsPackage.Literals.SIGNED_INPUT__TYPE, newType);
	}

} //SignedInputImpl
