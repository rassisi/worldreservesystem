/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic Datas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.StatisticDatas#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getStatisticDatas()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StatisticDatas extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference.
	 * @see #setChildren(Statistics)
	 * @see org.wrs.model.wrs.WrsPackage#getStatisticDatas_Children()
	 * @model
	 * @generated
	 */
	Statistics getChildren();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.StatisticDatas#getChildren <em>Children</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' reference.
	 * @see #getChildren()
	 * @generated
	 */
	void setChildren(Statistics value);

} // StatisticDatas
