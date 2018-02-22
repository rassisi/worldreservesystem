/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.worldreservesystem.Identities;
import org.worldreservesystem.Identity;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.IdentitiesImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentitiesImpl extends CDOObjectImpl implements Identities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.IDENTITIES;
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
	public EList<Identity> getChildren() {
		return (EList<Identity>) eGet(WorldreservesystemPackage.Literals.IDENTITIES__CHILDREN, true);
	}

} //IdentitiesImpl
