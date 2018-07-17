/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.wrs.FiatCurrency;
import org.wrs.wrs.Nation;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.NationImpl#getFiatcurrency <em>Fiatcurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NationImpl extends CDOObjectImpl implements Nation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.NATION;
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
	public FiatCurrency getFiatcurrency() {
		return (FiatCurrency)eGet(WrsPackage.Literals.NATION__FIATCURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiatcurrency(FiatCurrency newFiatcurrency) {
		eSet(WrsPackage.Literals.NATION__FIATCURRENCY, newFiatcurrency);
	}

} //NationImpl
