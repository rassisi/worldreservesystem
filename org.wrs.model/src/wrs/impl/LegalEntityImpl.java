/**
 */
package wrs.impl;

import org.eclipse.emf.ecore.EClass;

import wrs.LegalEntity;
import wrs.LegalEntityType;
import wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wrs.impl.LegalEntityImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegalEntityImpl extends IdentityImpl implements LegalEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.LEGAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityType getType() {
		return (LegalEntityType)eGet(WrsPackage.Literals.LEGAL_ENTITY__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LegalEntityType newType) {
		eSet(WrsPackage.Literals.LEGAL_ENTITY__TYPE, newType);
	}

} //LegalEntityImpl
