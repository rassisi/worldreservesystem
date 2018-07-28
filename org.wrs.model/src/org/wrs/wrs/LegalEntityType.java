/**
 */
package org.wrs.wrs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Legal Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wrs.wrs.WrsPackage#getLegalEntityType()
 * @model
 * @generated
 */
public enum LegalEntityType implements Enumerator {
	/**
	 * The '<em><b>COMPANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPANY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPANY(0, "COMPANY", "COMPANY"),

	/**
	 * The '<em><b>ACCOUNTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTANT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNTANT(1, "ACCOUNTANT", "ACCOUNTANT"),

	/**
	 * The '<em><b>CHARITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARITY_VALUE
	 * @generated
	 * @ordered
	 */
	CHARITY(2, "CHARITY", "CHARITY");

	/**
	 * The '<em><b>COMPANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPANY_VALUE = 0;

	/**
	 * The '<em><b>ACCOUNTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCOUNTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTANT_VALUE = 1;

	/**
	 * The '<em><b>CHARITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Legal Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LegalEntityType[] VALUES_ARRAY =
		new LegalEntityType[] {
			COMPANY,
			ACCOUNTANT,
			CHARITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Legal Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LegalEntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Legal Entity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegalEntityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegalEntityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legal Entity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegalEntityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegalEntityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legal Entity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegalEntityType get(int value) {
		switch (value) {
			case COMPANY_VALUE: return COMPANY;
			case ACCOUNTANT_VALUE: return ACCOUNTANT;
			case CHARITY_VALUE: return CHARITY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LegalEntityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LegalEntityType
