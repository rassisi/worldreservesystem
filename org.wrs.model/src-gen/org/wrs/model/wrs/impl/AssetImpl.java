/**
 */
package org.wrs.model.wrs.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.wrs.model.wrs.Asset;
import org.wrs.model.wrs.AssetType;
import org.wrs.model.wrs.Thing;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.AssetImpl#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.AssetImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends LayoutableImpl implements Asset {
	/**
	 * The default value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected static final AssetType ASSET_TYPE_EDEFAULT = AssetType.UDOLLAR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetType getAssetType() {
		return (AssetType) eDynamicGet(WrsPackage.ASSET__ASSET_TYPE, WrsPackage.Literals.ASSET__ASSET_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetType(AssetType newAssetType) {
		eDynamicSet(WrsPackage.ASSET__ASSET_TYPE, WrsPackage.Literals.ASSET__ASSET_TYPE, newAssetType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Thing> getMaterials() {
		return (EList<Thing>) eDynamicGet(WrsPackage.ASSET__MATERIALS, WrsPackage.Literals.ASSET__MATERIALS, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void register() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.ASSET__ASSET_TYPE:
			return getAssetType();
		case WrsPackage.ASSET__MATERIALS:
			return getMaterials();
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
		case WrsPackage.ASSET__ASSET_TYPE:
			setAssetType((AssetType) newValue);
			return;
		case WrsPackage.ASSET__MATERIALS:
			getMaterials().clear();
			getMaterials().addAll((Collection<? extends Thing>) newValue);
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
		case WrsPackage.ASSET__ASSET_TYPE:
			setAssetType(ASSET_TYPE_EDEFAULT);
			return;
		case WrsPackage.ASSET__MATERIALS:
			getMaterials().clear();
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
		case WrsPackage.ASSET__ASSET_TYPE:
			return getAssetType() != ASSET_TYPE_EDEFAULT;
		case WrsPackage.ASSET__MATERIALS:
			return !getMaterials().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WrsPackage.ASSET___REGISTER:
			register();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssetImpl
