/**
 */
package org.wrs.wrs.tests;

import junit.textui.TestRunner;

import org.wrs.wrs.WrsFactory;
import org.wrs.wrs.wrs;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>wrs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.wrs.wrs.wrs#createIdentity() <em>Create Identity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class wrsTest extends IdentityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(wrsTest.class);
	}

	/**
	 * Constructs a new wrs test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wrsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this wrs test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected wrs getFixture() {
		return (wrs)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WrsFactory.eINSTANCE.createwrs());
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

	/**
	 * Tests the '{@link org.wrs.wrs.wrs#createIdentity() <em>Create Identity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wrs.wrs.wrs#createIdentity()
	 * @generated
	 */
	public void testCreateIdentity() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //wrsTest