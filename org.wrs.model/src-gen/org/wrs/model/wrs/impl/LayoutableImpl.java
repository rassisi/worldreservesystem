/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.model.wrs.Layoutable;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layoutable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.LayoutableImpl#getX <em>X</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LayoutableImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LayoutableImpl#getW <em>W</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LayoutableImpl#getH <em>H</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LayoutableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.LayoutableImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LayoutableImpl extends CDOObjectImpl implements Layoutable {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final double W_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final double H_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.LAYOUTABLE;
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
	public String getX() {
		return (String) eDynamicGet(WrsPackage.LAYOUTABLE__X, WrsPackage.Literals.LAYOUTABLE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		eDynamicSet(WrsPackage.LAYOUTABLE__X, WrsPackage.Literals.LAYOUTABLE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return (Double) eDynamicGet(WrsPackage.LAYOUTABLE__Y, WrsPackage.Literals.LAYOUTABLE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		eDynamicSet(WrsPackage.LAYOUTABLE__Y, WrsPackage.Literals.LAYOUTABLE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getW() {
		return (Double) eDynamicGet(WrsPackage.LAYOUTABLE__W, WrsPackage.Literals.LAYOUTABLE__W, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(double newW) {
		eDynamicSet(WrsPackage.LAYOUTABLE__W, WrsPackage.Literals.LAYOUTABLE__W, newW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getH() {
		return (Double) eDynamicGet(WrsPackage.LAYOUTABLE__H, WrsPackage.Literals.LAYOUTABLE__H, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(double newH) {
		eDynamicSet(WrsPackage.LAYOUTABLE__H, WrsPackage.Literals.LAYOUTABLE__H, newH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(WrsPackage.LAYOUTABLE__NAME, WrsPackage.Literals.LAYOUTABLE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(WrsPackage.LAYOUTABLE__NAME, WrsPackage.Literals.LAYOUTABLE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String) eDynamicGet(WrsPackage.LAYOUTABLE__ID, WrsPackage.Literals.LAYOUTABLE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(WrsPackage.LAYOUTABLE__ID, WrsPackage.Literals.LAYOUTABLE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.LAYOUTABLE__X:
			return getX();
		case WrsPackage.LAYOUTABLE__Y:
			return getY();
		case WrsPackage.LAYOUTABLE__W:
			return getW();
		case WrsPackage.LAYOUTABLE__H:
			return getH();
		case WrsPackage.LAYOUTABLE__NAME:
			return getName();
		case WrsPackage.LAYOUTABLE__ID:
			return getId();
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
		case WrsPackage.LAYOUTABLE__X:
			setX((String) newValue);
			return;
		case WrsPackage.LAYOUTABLE__Y:
			setY((Double) newValue);
			return;
		case WrsPackage.LAYOUTABLE__W:
			setW((Double) newValue);
			return;
		case WrsPackage.LAYOUTABLE__H:
			setH((Double) newValue);
			return;
		case WrsPackage.LAYOUTABLE__NAME:
			setName((String) newValue);
			return;
		case WrsPackage.LAYOUTABLE__ID:
			setId((String) newValue);
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
		case WrsPackage.LAYOUTABLE__X:
			setX(X_EDEFAULT);
			return;
		case WrsPackage.LAYOUTABLE__Y:
			setY(Y_EDEFAULT);
			return;
		case WrsPackage.LAYOUTABLE__W:
			setW(W_EDEFAULT);
			return;
		case WrsPackage.LAYOUTABLE__H:
			setH(H_EDEFAULT);
			return;
		case WrsPackage.LAYOUTABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WrsPackage.LAYOUTABLE__ID:
			setId(ID_EDEFAULT);
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
		case WrsPackage.LAYOUTABLE__X:
			return X_EDEFAULT == null ? getX() != null : !X_EDEFAULT.equals(getX());
		case WrsPackage.LAYOUTABLE__Y:
			return getY() != Y_EDEFAULT;
		case WrsPackage.LAYOUTABLE__W:
			return getW() != W_EDEFAULT;
		case WrsPackage.LAYOUTABLE__H:
			return getH() != H_EDEFAULT;
		case WrsPackage.LAYOUTABLE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case WrsPackage.LAYOUTABLE__ID:
			return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} //LayoutableImpl
