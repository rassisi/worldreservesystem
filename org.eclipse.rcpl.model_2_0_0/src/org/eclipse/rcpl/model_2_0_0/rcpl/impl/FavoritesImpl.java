/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.rcpl.model_2_0_0.rcpl.Favorites;
import org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Favorites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesImpl#getDefaultSetId <em>Default Set Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FavoritesImpl extends LayoutableImpl implements Favorites {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FavoritesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.FAVORITES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FavoritesGroup> getChildren() {
		return (EList<FavoritesGroup>)eGet(RcplPackage.Literals.FAVORITES__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSetId() {
		return (String)eGet(RcplPackage.Literals.FAVORITES__DEFAULT_SET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSetId(String newDefaultSetId) {
		eSet(RcplPackage.Literals.FAVORITES__DEFAULT_SET_ID, newDefaultSetId);
	}

} //FavoritesImpl
