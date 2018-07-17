/**
 */
package org.wrs.wrs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.wrs.wrs.FiatCurrency;
import org.wrs.wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fiat Currency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiatCurrencyTest extends TestCase {

	/**
	 * The fixture for this Fiat Currency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiatCurrency fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FiatCurrencyTest.class);
	}

	/**
	 * Constructs a new Fiat Currency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiatCurrencyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fiat Currency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FiatCurrency fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fiat Currency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiatCurrency getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WrsFactory.eINSTANCE.createFiatCurrency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FiatCurrencyTest