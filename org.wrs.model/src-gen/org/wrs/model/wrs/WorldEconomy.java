/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}</li>
 *   <li>{@link org.wrs.model.wrs.WorldEconomy#getStatisticssource <em>Statisticssource</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getWorldEconomy()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface WorldEconomy extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nationaleconomies</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.NationalEconomies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationaleconomies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationaleconomies</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getWorldEconomy_Nationaleconomies()
	 * @model required="true"
	 * @generated
	 */
	EList<NationalEconomies> getNationaleconomies();

	/**
	 * Returns the value of the '<em><b>Statisticssource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statisticssource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statisticssource</em>' containment reference.
	 * @see #setStatisticssource(StatisticsSource)
	 * @see org.wrs.model.wrs.WrsPackage#getWorldEconomy_Statisticssource()
	 * @model containment="true"
	 * @generated
	 */
	StatisticsSource getStatisticssource();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.WorldEconomy#getStatisticssource <em>Statisticssource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statisticssource</em>' containment reference.
	 * @see #getStatisticssource()
	 * @generated
	 */
	void setStatisticssource(StatisticsSource value);

} // WorldEconomy
