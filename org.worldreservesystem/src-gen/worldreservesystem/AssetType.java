/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Asset Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see worldreservesystem.WorldreservesystemPackage#getAssetType()
 * @model
 * @generated
 */
public enum AssetType implements Enumerator {
	/**
	 * The '<em><b>GOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLD_VALUE
	 * @generated
	 * @ordered
	 */
	GOLD(0, "GOLD", "GOLD"),

	/**
	 * The '<em><b>SILVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILVER_VALUE
	 * @generated
	 * @ordered
	 */
	SILVER(1, "SILVER", "SILVER"),

	/**
	 * The '<em><b>CRYPTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTO_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTO(2, "CRYPTO", "CRYPTO"),

	/**
	 * The '<em><b>UDOLLAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDOLLAR_VALUE
	 * @generated
	 * @ordered
	 */
	UDOLLAR(3, "UDOLLAR", "UDOLLAR"),

	/**
	 * The '<em><b>MATERIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	MATERIAL(4, "MATERIAL", "MATERIAL"),

	/**
	 * The '<em><b>INTELLECTUAL PROPERTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTELLECTUAL_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	INTELLECTUAL_PROPERTY(5, "INTELLECTUAL_PROPERTY", "INTELLECTUAL_PROPERTY");

	/**
	 * The '<em><b>GOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOLD_VALUE = 0;

	/**
	 * The '<em><b>SILVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SILVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SILVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SILVER_VALUE = 1;

	/**
	 * The '<em><b>CRYPTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRYPTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRYPTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTO_VALUE = 2;

	/**
	 * The '<em><b>UDOLLAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UDOLLAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UDOLLAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UDOLLAR_VALUE = 3;

	/**
	 * The '<em><b>MATERIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MATERIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATERIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_VALUE = 4;

	/**
	 * The '<em><b>INTELLECTUAL PROPERTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTELLECTUAL PROPERTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTELLECTUAL_PROPERTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTELLECTUAL_PROPERTY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Asset Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssetType[] VALUES_ARRAY = new AssetType[] { GOLD, SILVER, CRYPTO, UDOLLAR, MATERIAL,
			INTELLECTUAL_PROPERTY, };

	/**
	 * A public read-only list of all the '<em><b>Asset Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Asset Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetType get(int value) {
		switch (value) {
		case GOLD_VALUE:
			return GOLD;
		case SILVER_VALUE:
			return SILVER;
		case CRYPTO_VALUE:
			return CRYPTO;
		case UDOLLAR_VALUE:
			return UDOLLAR;
		case MATERIAL_VALUE:
			return MATERIAL;
		case INTELLECTUAL_PROPERTY_VALUE:
			return INTELLECTUAL_PROPERTY;
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
	private AssetType(int value, String name, String literal) {
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

} //AssetType
