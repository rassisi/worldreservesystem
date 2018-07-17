/**
 */
package org.wrs.wrs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.wrs.wrs.Nation;
import org.wrs.wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NationTest extends TestCase {

	/**
	 * The fixture for this Nation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NationTest.class);
	}

	/**
	 * Constructs a new Nation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Nation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nation getFixture() {
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
		setFixture(WrsFactory.eINSTANCE.createNation());
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

} //NationTest
