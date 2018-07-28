/**
 */
package wrs;

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
 *   <li>{@link wrs.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}</li>
 * </ul>
 *
 * @see wrs.WrsPackage#getWorldEconomy()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface WorldEconomy extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nationaleconomies</b></em>' reference list.
	 * The list contents are of type {@link wrs.NationalEconomies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationaleconomies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationaleconomies</em>' reference list.
	 * @see wrs.WrsPackage#getWorldEconomy_Nationaleconomies()
	 * @model required="true"
	 * @generated
	 */
	EList<NationalEconomies> getNationaleconomies();

} // WorldEconomy
