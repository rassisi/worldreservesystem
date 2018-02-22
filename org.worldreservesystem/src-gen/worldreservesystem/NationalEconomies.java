/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>National Economies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.NationalEconomies#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getNationalEconomies()
 * @model
 * @generated
 */
public interface NationalEconomies extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link worldreservesystem.Nation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see worldreservesystem.WorldreservesystemPackage#getNationalEconomies_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nation> getChildren();

} // NationalEconomies
