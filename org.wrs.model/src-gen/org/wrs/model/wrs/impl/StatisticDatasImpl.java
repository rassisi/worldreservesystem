/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wrs.model.wrs.StatisticDatas;
import org.wrs.model.wrs.Statistics;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistic Datas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.StatisticDatasImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticDatasImpl extends MinimalEObjectImpl.Container implements StatisticDatas {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected Statistics children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticDatasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.STATISTIC_DATAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics getChildren() {
		if (children != null && children.eIsProxy()) {
			InternalEObject oldChildren = (InternalEObject) children;
			children = (Statistics) eResolveProxy(oldChildren);
			if (children != oldChildren) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.STATISTIC_DATAS__CHILDREN,
							oldChildren, children));
			}
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics basicGetChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildren(Statistics newChildren) {
		Statistics oldChildren = children;
		children = newChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.STATISTIC_DATAS__CHILDREN, oldChildren,
					children));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			if (resolve)
				return getChildren();
			return basicGetChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			setChildren((Statistics) newValue);
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
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			setChildren((Statistics) null);
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
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			return children != null;
		}
		return super.eIsSet(featureID);
	}

} //StatisticDatasImpl
