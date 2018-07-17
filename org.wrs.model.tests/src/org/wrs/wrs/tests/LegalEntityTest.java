/**
 */
package org.wrs.wrs.tests;

import junit.textui.TestRunner;

import org.wrs.wrs.LegalEntity;
import org.wrs.wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegalEntityTest extends IdentityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegalEntityTest.class);
	}

	/**
	 * Constructs a new Legal Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Legal Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LegalEntity getFixture() {
		return (LegalEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WrsFactory.eINSTANCE.createLegalEntity());
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

} //LegalEntityTest
