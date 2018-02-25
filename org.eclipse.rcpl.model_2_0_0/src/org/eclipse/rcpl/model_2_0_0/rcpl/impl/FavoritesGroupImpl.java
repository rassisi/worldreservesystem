/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.rcpl.model_2_0_0.rcpl.Favorite;
import org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Favorites Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl#getFavorites <em>Favorites</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl#getLinkedFavorites <em>Linked Favorites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FavoritesGroupImpl extends LayoutableImpl implements FavoritesGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FavoritesGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.FAVORITES_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FavoritesGroup> getGroups() {
		return (EList<FavoritesGroup>)eGet(RcplPackage.Literals.FAVORITES_GROUP__GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Favorite> getFavorites() {
		return (EList<Favorite>)eGet(RcplPackage.Literals.FAVORITES_GROUP__FAVORITES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Favorite> getLinkedFavorites() {
		return (EList<Favorite>)eGet(RcplPackage.Literals.FAVORITES_GROUP__LINKED_FAVORITES, true);
	}

} //FavoritesGroupImpl
