/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.wrs.wrs.Individual;
import org.wrs.wrs.LegalEntity;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.IndividualImpl#getWorksFor <em>Works For</em>}</li>
 *   <li>{@link org.wrs.wrs.impl.IndividualImpl#getLegalPartnerOf <em>Legal Partner Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends IdentityImpl implements Individual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LegalEntity> getWorksFor() {
		return (EList<LegalEntity>)eGet(WrsPackage.Literals.INDIVIDUAL__WORKS_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LegalEntity> getLegalPartnerOf() {
		return (EList<LegalEntity>)eGet(WrsPackage.Literals.INDIVIDUAL__LEGAL_PARTNER_OF, true);
	}

} //IndividualImpl
