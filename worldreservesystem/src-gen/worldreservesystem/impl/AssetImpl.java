/**
 */
package worldreservesystem.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import worldreservesystem.Asset;
import worldreservesystem.AssetType;
import worldreservesystem.Material;
import worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.impl.AssetImpl#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link worldreservesystem.impl.AssetImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
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
	 * The cached value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected AssetType assetType = ASSET_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Material> materials;

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
		return WorldreservesystemPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType getAssetType() {
		return assetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetType(AssetType newAssetType) {
		AssetType oldAssetType = assetType;
		assetType = newAssetType == null ? ASSET_TYPE_EDEFAULT : newAssetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorldreservesystemPackage.ASSET__ASSET_TYPE,
					oldAssetType, assetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Material> getMaterials() {
		if (materials == null) {
			materials = new EObjectResolvingEList<Material>(Material.class, this,
					WorldreservesystemPackage.ASSET__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		case WorldreservesystemPackage.ASSET__ASSET_TYPE:
			return getAssetType();
		case WorldreservesystemPackage.ASSET__MATERIALS:
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
		case WorldreservesystemPackage.ASSET__ASSET_TYPE:
			setAssetType((AssetType) newValue);
			return;
		case WorldreservesystemPackage.ASSET__MATERIALS:
			getMaterials().clear();
			getMaterials().addAll((Collection<? extends Material>) newValue);
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
		case WorldreservesystemPackage.ASSET__ASSET_TYPE:
			setAssetType(ASSET_TYPE_EDEFAULT);
			return;
		case WorldreservesystemPackage.ASSET__MATERIALS:
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
		case WorldreservesystemPackage.ASSET__ASSET_TYPE:
			return assetType != ASSET_TYPE_EDEFAULT;
		case WorldreservesystemPackage.ASSET__MATERIALS:
			return materials != null && !materials.isEmpty();
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
		case WorldreservesystemPackage.ASSET___REGISTER:
			register();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assetType: ");
		result.append(assetType);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
