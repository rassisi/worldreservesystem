/**
 */
package org.wrs.model.wrs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Statistics#getStatisticssource <em>Statisticssource</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getStatistics()
 * @model
 * @generated
 */
public interface Statistics extends Layoutable {

	/**
	 * Returns the value of the '<em><b>Statisticssource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statisticssource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statisticssource</em>' reference.
	 * @see #setStatisticssource(StatisticsSource)
	 * @see org.wrs.model.wrs.WrsPackage#getStatistics_Statisticssource()
	 * @model
	 * @generated
	 */
	StatisticsSource getStatisticssource();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Statistics#getStatisticssource <em>Statisticssource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statisticssource</em>' reference.
	 * @see #getStatisticssource()
	 * @generated
	 */
	void setStatisticssource(StatisticsSource value);
} // Statistics
