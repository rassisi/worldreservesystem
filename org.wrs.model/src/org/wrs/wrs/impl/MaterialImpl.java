/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.ecore.EClass;

import org.wrs.wrs.Identity;
import org.wrs.wrs.Material;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.MaterialImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialImpl extends IdentityImpl implements Material {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		return (Identity)eGet(WrsPackage.Literals.MATERIAL__BELONGS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		eSet(WrsPackage.Literals.MATERIAL__BELONGS_TO, newBelongsTo);
	}

} //MaterialImpl
