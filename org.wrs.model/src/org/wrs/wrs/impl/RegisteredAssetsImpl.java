/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.wrs.Asset;
import org.wrs.wrs.RegisteredAssets;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registered Assets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.RegisteredAssetsImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredAssetsImpl extends CDOObjectImpl implements RegisteredAssets {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredAssetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.REGISTERED_ASSETS;
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
	@SuppressWarnings("unchecked")
	public EList<Asset> getChildren() {
		return (EList<Asset>)eGet(WrsPackage.Literals.REGISTERED_ASSETS__CHILDREN, true);
	}

} //RegisteredAssetsImpl
