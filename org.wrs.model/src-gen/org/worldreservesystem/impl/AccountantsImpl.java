/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.worldreservesystem.Accountant;
import org.worldreservesystem.Accountants;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accountants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.AccountantsImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountantsImpl extends CDOObjectImpl implements Accountants {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountantsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.ACCOUNTANTS;
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
	public EList<Accountant> getChildren() {
		return (EList<Accountant>) eGet(WorldreservesystemPackage.Literals.ACCOUNTANTS__CHILDREN, true);
	}

} //AccountantsImpl
