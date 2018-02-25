/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory
 * @model kind="package"
 * @generated
 */
public interface RcplPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rcpl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rcpl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rcpl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RcplPackage eINSTANCE = org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.LayoutableImpl <em>Layoutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.LayoutableImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getLayoutable()
	 * @generated
	 */
	int LAYOUTABLE = 0;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT_X = 0;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT_Y = 1;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT_WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT_HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__ID = 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__IMAGE = 7;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__TOOL_TIP = 8;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__CREATE_DATE = 9;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__BEGIN_DATE = 10;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__END_DATE = 11;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LEAF = 12;

	/**
	 * The number of structural features of the '<em>Layoutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Layoutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLImpl <em>RCPL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getRCPL()
	 * @generated
	 */
	int RCPL = 1;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>All Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_PLUGINS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Perspectives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_PERSPECTIVES = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_PREFERENCES = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_TOOLS = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Favorites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_FAVORITES = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__VERSION_MAJOR = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__VERSION_MINOR = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Version Maintenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__VERSION_MAINTENANCE = LAYOUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__BUILD_NUMBER = LAYOUTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Version Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__VERSION_DESCRIPTION = LAYOUTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>All Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_RESOURCES = LAYOUTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Persons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__ALL_PERSONS = LAYOUTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Linked Rcpls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL__LINKED_RCPLS = LAYOUTABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>RCPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>RCPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectivesImpl <em>Perspectives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectivesImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPerspectives()
	 * @generated
	 */
	int PERSPECTIVES = 2;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perspectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Perspectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVES_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl <em>Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPerspective()
	 * @generated
	 */
	int PERSPECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Side Tool Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__SIDE_TOOL_BAR = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Tool Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__TOP_TOOL_BAR = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quick Tool Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__QUICK_TOOL_BAR = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quick Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__QUICK_TOOLS = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__KEY = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__VALUE = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__TYPE = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginsImpl <em>Logins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginsImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getLogins()
	 * @generated
	 */
	int LOGINS = 5;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGINS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginImpl <em>Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getLogin()
	 * @generated
	 */
	int LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__COUNTRY = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__PASSWORD = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rcpl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__RCPL = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__USER_ID = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__PERSON = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__DOMAINS = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesImpl <em>Favorites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFavorites()
	 * @generated
	 */
	int FAVORITES = 7;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES__DEFAULT_SET_ID = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Favorites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Favorites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoriteImpl <em>Favorite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoriteImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFavorite()
	 * @generated
	 */
	int FAVORITE = 8;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LINK = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__URI = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__URL = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__CREATION_DATE = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__DOCUMENT_CREATION_DATE = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__RATING = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Used Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__LAST_USED_DATE = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__FREQUENCY = LAYOUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__PASSWORD = LAYOUTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__FORMAT = LAYOUTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Show On Tool Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE__SHOW_ON_TOOL_BAR = LAYOUTABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Favorite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Favorite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl <em>Favorites Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFavoritesGroup()
	 * @generated
	 */
	int FAVORITES_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__GROUPS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Favorites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__FAVORITES = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Favorites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP__LINKED_FAVORITES = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Favorites Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Favorites Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAVORITES_GROUP_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferencesImpl <em>Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferencesImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPreferences()
	 * @generated
	 */
	int PREFERENCES = 10;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__SYSTEM = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginsImpl <em>Plugins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginsImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPlugins()
	 * @generated
	 */
	int PLUGINS = 11;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plugins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plugins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 12;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Bundle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__BUNDLE_ID = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__CLASS_NAME = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ROLES = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__USERS = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__GROUPS = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Perspective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__IS_PERSPECTIVE = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__READ_ONLY = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Perspective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__DEFAULT_PERSPECTIVE = LAYOUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PERSPECTIVES = LAYOUTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl <em>Abstract Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getAbstractTool()
	 * @generated
	 */
	int ABSTRACT_TOOL = 13;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__X = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__Y = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__WIDTH = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__HEIGHT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__GRID_X = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__GRID_Y = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Span X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__SPAN_X = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Span Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__SPAN_Y = LAYOUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__LABELED = LAYOUTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Not Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__NOT_IMPLEMENTED = LAYOUTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL__SERVICE = LAYOUTABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Abstract Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Abstract Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOL_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 14;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_X = ABSTRACT_TOOL__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_Y = ABSTRACT_TOOL__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_WIDTH = ABSTRACT_TOOL__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LAYOUT_HEIGHT = ABSTRACT_TOOL__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = ABSTRACT_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = ABSTRACT_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__IMAGE = ABSTRACT_TOOL__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TOOL_TIP = ABSTRACT_TOOL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CREATE_DATE = ABSTRACT_TOOL__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__BEGIN_DATE = ABSTRACT_TOOL__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__END_DATE = ABSTRACT_TOOL__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LEAF = ABSTRACT_TOOL__LEAF;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__X = ABSTRACT_TOOL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__Y = ABSTRACT_TOOL__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__WIDTH = ABSTRACT_TOOL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__HEIGHT = ABSTRACT_TOOL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Grid X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__GRID_X = ABSTRACT_TOOL__GRID_X;

	/**
	 * The feature id for the '<em><b>Grid Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__GRID_Y = ABSTRACT_TOOL__GRID_Y;

	/**
	 * The feature id for the '<em><b>Span X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__SPAN_X = ABSTRACT_TOOL__SPAN_X;

	/**
	 * The feature id for the '<em><b>Span Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__SPAN_Y = ABSTRACT_TOOL__SPAN_Y;

	/**
	 * The feature id for the '<em><b>Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LABELED = ABSTRACT_TOOL__LABELED;

	/**
	 * The feature id for the '<em><b>Not Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NOT_IMPLEMENTED = ABSTRACT_TOOL__NOT_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__SERVICE = ABSTRACT_TOOL__SERVICE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__FORMAT = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TYPE = ABSTRACT_TOOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = ABSTRACT_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolGroupImpl <em>Tool Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolGroupImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getToolGroup()
	 * @generated
	 */
	int TOOL_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LAYOUT_X = ABSTRACT_TOOL__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LAYOUT_Y = ABSTRACT_TOOL__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LAYOUT_WIDTH = ABSTRACT_TOOL__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LAYOUT_HEIGHT = ABSTRACT_TOOL__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__NAME = ABSTRACT_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__ID = ABSTRACT_TOOL__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__IMAGE = ABSTRACT_TOOL__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TOOL_TIP = ABSTRACT_TOOL__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__CREATE_DATE = ABSTRACT_TOOL__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__BEGIN_DATE = ABSTRACT_TOOL__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__END_DATE = ABSTRACT_TOOL__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LEAF = ABSTRACT_TOOL__LEAF;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__X = ABSTRACT_TOOL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__Y = ABSTRACT_TOOL__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__WIDTH = ABSTRACT_TOOL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__HEIGHT = ABSTRACT_TOOL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Grid X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__GRID_X = ABSTRACT_TOOL__GRID_X;

	/**
	 * The feature id for the '<em><b>Grid Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__GRID_Y = ABSTRACT_TOOL__GRID_Y;

	/**
	 * The feature id for the '<em><b>Span X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__SPAN_X = ABSTRACT_TOOL__SPAN_X;

	/**
	 * The feature id for the '<em><b>Span Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__SPAN_Y = ABSTRACT_TOOL__SPAN_Y;

	/**
	 * The feature id for the '<em><b>Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__LABELED = ABSTRACT_TOOL__LABELED;

	/**
	 * The feature id for the '<em><b>Not Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__NOT_IMPLEMENTED = ABSTRACT_TOOL__NOT_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__SERVICE = ABSTRACT_TOOL__SERVICE;

	/**
	 * The feature id for the '<em><b>Tool Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TOOL_GROUPS = ABSTRACT_TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__GRID = ABSTRACT_TOOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__FORMAT = ABSTRACT_TOOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TOOLS = ABSTRACT_TOOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP__TYPE = ABSTRACT_TOOL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tool Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tool Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_GROUP_OPERATION_COUNT = ABSTRACT_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolsImpl <em>Tools</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolsImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getTools()
	 * @generated
	 */
	int TOOLS = 16;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Toolgroup Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__TOOLGROUP_CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS__TOOL_CHILDREN = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tools</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tools</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolsImpl <em>Quick Tools</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolsImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getQuickTools()
	 * @generated
	 */
	int QUICK_TOOLS = 17;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Quick Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS__QUICK_TOOLS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quick Tools</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quick Tools</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOLS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.TopToolBarImpl <em>Top Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.TopToolBarImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getTopToolBar()
	 * @generated
	 */
	int TOP_TOOL_BAR = 18;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Tool Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR__TOOL_GROUPS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Top Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_TOOL_BAR_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.SideToolBarImpl <em>Side Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.SideToolBarImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getSideToolBar()
	 * @generated
	 */
	int SIDE_TOOL_BAR = 19;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Tool Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR__TOOL_GROUPS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Side Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Side Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDE_TOOL_BAR_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolBarImpl <em>Quick Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolBarImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getQuickToolBar()
	 * @generated
	 */
	int QUICK_TOOL_BAR = 20;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Tool Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR__TOOL_GROUPS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quick Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quick Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_TOOL_BAR_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FolderImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 21;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FOLDERS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__RESOURCES = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LINKED_RESOURCES = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourceImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 22;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URI = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TEMPLATE = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LINKED_RESOURCES = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Perspective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MAIN_PERSPECTIVE = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 23;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MIDDLE_NAME = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESSES = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonGroupImpl <em>Person Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonGroupImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPersonGroup()
	 * @generated
	 */
	int PERSON_GROUP = 24;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Persongroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__PERSONGROUPS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__PERSONS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LINKED_PERSONS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Linked Persongroups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP__LINKED_PERSONGROUPS = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_GROUP_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourcesImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 25;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceGroupImpl <em>Preference Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceGroupImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPreferenceGroup()
	 * @generated
	 */
	int PREFERENCE_GROUP = 26;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__PREFERENCES = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__LINKED_PREFERENCES = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preferencegroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP__PREFERENCEGROUPS = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_GROUP_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonsImpl <em>Persons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonsImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPersons()
	 * @generated
	 */
	int PERSONS = 27;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLTemplatesImpl <em>RCPL Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLTemplatesImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getRCPLTemplates()
	 * @generated
	 */
	int RCPL_TEMPLATES = 28;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES__CHILDREN = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RCPL Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RCPL Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCPL_TEMPLATES_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.JPersonImpl <em>JPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.JPersonImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getJPerson()
	 * @generated
	 */
	int JPERSON = 29;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__LAYOUT_X = PERSON__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__LAYOUT_Y = PERSON__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__LAYOUT_WIDTH = PERSON__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__LAYOUT_HEIGHT = PERSON__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__DESCRIPTION = PERSON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__IMAGE = PERSON__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__TOOL_TIP = PERSON__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__CREATE_DATE = PERSON__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__BEGIN_DATE = PERSON__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__END_DATE = PERSON__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__LEAF = PERSON__LEAF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__MIDDLE_NAME = PERSON__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON__ADDRESSES = PERSON__ADDRESSES;

	/**
	 * The number of structural features of the '<em>JPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPERSON_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.NPersonImpl <em>NPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.NPersonImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getNPerson()
	 * @generated
	 */
	int NPERSON = 30;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__LAYOUT_X = PERSON__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__LAYOUT_Y = PERSON__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__LAYOUT_WIDTH = PERSON__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__LAYOUT_HEIGHT = PERSON__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__DESCRIPTION = PERSON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__IMAGE = PERSON__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__TOOL_TIP = PERSON__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__CREATE_DATE = PERSON__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__BEGIN_DATE = PERSON__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__END_DATE = PERSON__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__LEAF = PERSON__LEAF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__MIDDLE_NAME = PERSON__MIDDLE_NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON__ADDRESSES = PERSON__ADDRESSES;

	/**
	 * The number of structural features of the '<em>NPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPERSON_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 31;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Street</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Housenumber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__HOUSENUMBER = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__BUILDINGS = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDRESS_TYPE = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.CountryImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 32;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CITIES = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worldregions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__WORLDREGIONS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.CityImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 33;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Streets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__STREETS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.GeoImpl <em>Geo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.GeoImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getGeo()
	 * @generated
	 */
	int GEO = 34;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__COUNTRIES = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worldregions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__WORLDREGIONS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Geo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Geo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.WorldRegionImpl <em>World Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.WorldRegionImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getWorldRegion()
	 * @generated
	 */
	int WORLD_REGION = 35;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The number of structural features of the '<em>World Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>World Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_REGION_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.StreetImpl <em>Street</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.StreetImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getStreet()
	 * @generated
	 */
	int STREET = 36;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Housenumbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__HOUSENUMBERS = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__BUILDINGS = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.HouseNumberImpl <em>House Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.HouseNumberImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getHouseNumber()
	 * @generated
	 */
	int HOUSE_NUMBER = 37;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The number of structural features of the '<em>House Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>House Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_NUMBER_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.BuildingImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 38;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ContactImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 39;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Phones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__PHONES = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PhoneImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPhone()
	 * @generated
	 */
	int PHONE = 40;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__LAYOUT_X = LAYOUTABLE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__LAYOUT_Y = LAYOUTABLE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Layout Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__LAYOUT_WIDTH = LAYOUTABLE__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__LAYOUT_HEIGHT = LAYOUTABLE__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NAME = LAYOUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__DESCRIPTION = LAYOUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__ID = LAYOUTABLE__ID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__IMAGE = LAYOUTABLE__IMAGE;

	/**
	 * The feature id for the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__TOOL_TIP = LAYOUTABLE__TOOL_TIP;

	/**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__CREATE_DATE = LAYOUTABLE__CREATE_DATE;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__BEGIN_DATE = LAYOUTABLE__BEGIN_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__END_DATE = LAYOUTABLE__END_DATE;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__LEAF = LAYOUTABLE__LEAF;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NUMBER = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_OPERATION_COUNT = LAYOUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainsImpl <em>Domains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainsImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getDomains()
	 * @generated
	 */
	int DOMAINS = 41;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Domains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainImpl
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 42;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__HOST = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PORT = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolType <em>Tool Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolType
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getToolType()
	 * @generated
	 */
	int TOOL_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FontStyles <em>Font Styles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FontStyles
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFontStyles()
	 * @generated
	 */
	int FONT_STYLES = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolBarReplacementPolicy <em>Tool Bar Replacement Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolBarReplacementPolicy
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getToolBarReplacementPolicy()
	 * @generated
	 */
	int TOOL_BAR_REPLACEMENT_POLICY = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.GroupType <em>Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.GroupType
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 46;


	/**
	 * The meta object id for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AddressType
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 47;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable <em>Layoutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layoutable</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable
	 * @generated
	 */
	EClass getLayoutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutX <em>Layout X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout X</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutX()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_LayoutX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutY <em>Layout Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Y</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutY()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_LayoutY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutWidth <em>Layout Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Width</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutWidth()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_LayoutWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutHeight <em>Layout Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Height</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getLayoutHeight()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_LayoutHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getName()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getDescription()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getId()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getImage()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getToolTip <em>Tool Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Tip</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getToolTip()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_ToolTip();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getCreateDate <em>Create Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Date</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getCreateDate()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_CreateDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getBeginDate <em>Begin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Date</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getBeginDate()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_BeginDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#getEndDate()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Layoutable#isLeaf()
	 * @see #getLayoutable()
	 * @generated
	 */
	EAttribute getLayoutable_Leaf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL <em>RCPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RCPL</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL
	 * @generated
	 */
	EClass getRCPL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPlugins <em>All Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Plugins</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPlugins()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllPlugins();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPerspectives <em>All Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Perspectives</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPerspectives()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllPerspectives();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPreferences <em>All Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Preferences</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPreferences()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllTools <em>All Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Tools</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllTools()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllTools();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllFavorites <em>All Favorites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Favorites</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllFavorites()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllFavorites();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMajor <em>Version Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Major</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMajor()
	 * @see #getRCPL()
	 * @generated
	 */
	EAttribute getRCPL_VersionMajor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMinor <em>Version Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Minor</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMinor()
	 * @see #getRCPL()
	 * @generated
	 */
	EAttribute getRCPL_VersionMinor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMaintenance <em>Version Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Maintenance</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMaintenance()
	 * @see #getRCPL()
	 * @generated
	 */
	EAttribute getRCPL_VersionMaintenance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getBuildNumber <em>Build Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Number</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getBuildNumber()
	 * @see #getRCPL()
	 * @generated
	 */
	EAttribute getRCPL_BuildNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionDescription <em>Version Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Description</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionDescription()
	 * @see #getRCPL()
	 * @generated
	 */
	EAttribute getRCPL_VersionDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllResources <em>All Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Resources</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllResources()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllResources();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPersons <em>All Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Persons</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPersons()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_AllPersons();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getLinkedRcpls <em>Linked Rcpls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Rcpls</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getLinkedRcpls()
	 * @see #getRCPL()
	 * @generated
	 */
	EReference getRCPL_LinkedRcpls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspectives</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspectives
	 * @generated
	 */
	EClass getPerspectives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspectives#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspectives#getChildren()
	 * @see #getPerspectives()
	 * @generated
	 */
	EReference getPerspectives_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspective
	 * @generated
	 */
	EClass getPerspective();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getSideToolBar <em>Side Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getSideToolBar()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_SideToolBar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getTopToolBar <em>Top Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getTopToolBar()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_TopToolBar();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getQuickToolBar <em>Quick Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quick Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getQuickToolBar()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_QuickToolBar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getQuickTools <em>Quick Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quick Tools</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Perspective#getQuickTools()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_QuickTools();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preference#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preference#getKey()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preference#getValue()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preference#getType()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Logins <em>Logins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logins</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Logins
	 * @generated
	 */
	EClass getLogins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Logins#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Logins#getChildren()
	 * @see #getLogins()
	 * @generated
	 */
	EReference getLogins_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login
	 * @generated
	 */
	EClass getLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login#getCountry()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login#getPassword()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_Password();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login#getRcpl <em>Rcpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rcpl</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login#getRcpl()
	 * @see #getLogin()
	 * @generated
	 */
	EReference getLogin_Rcpl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login#getUserId()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_UserId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login#getPerson()
	 * @see #getLogin()
	 * @generated
	 */
	EReference getLogin_Person();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Login#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domains</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Login#getDomains()
	 * @see #getLogin()
	 * @generated
	 */
	EReference getLogin_Domains();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorites <em>Favorites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Favorites</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorites
	 * @generated
	 */
	EClass getFavorites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getChildren()
	 * @see #getFavorites()
	 * @generated
	 */
	EReference getFavorites_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getDefaultSetId <em>Default Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Set Id</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getDefaultSetId()
	 * @see #getFavorites()
	 * @generated
	 */
	EAttribute getFavorites_DefaultSetId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite <em>Favorite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Favorite</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite
	 * @generated
	 */
	EClass getFavorite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getLink()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getURI()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_URI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getURL()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_URL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getCreationDate()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getDocumentCreationDate <em>Document Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Creation Date</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getDocumentCreationDate()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_DocumentCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getRating()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_Rating();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getLastUsedDate <em>Last Used Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Used Date</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getLastUsedDate()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_LastUsedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getFrequency()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getPassword()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#getFormat()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#isShowOnToolBar <em>Show On Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show On Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Favorite#isShowOnToolBar()
	 * @see #getFavorite()
	 * @generated
	 */
	EAttribute getFavorite_ShowOnToolBar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup <em>Favorites Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Favorites Group</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup
	 * @generated
	 */
	EClass getFavoritesGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup#getGroups()
	 * @see #getFavoritesGroup()
	 * @generated
	 */
	EReference getFavoritesGroup_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup#getFavorites <em>Favorites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Favorites</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup#getFavorites()
	 * @see #getFavoritesGroup()
	 * @generated
	 */
	EReference getFavoritesGroup_Favorites();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup#getLinkedFavorites <em>Linked Favorites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Favorites</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup#getLinkedFavorites()
	 * @see #getFavoritesGroup()
	 * @generated
	 */
	EReference getFavoritesGroup_LinkedFavorites();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preferences</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preferences
	 * @generated
	 */
	EClass getPreferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preferences#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preferences#getChildren()
	 * @see #getPreferences()
	 * @generated
	 */
	EReference getPreferences_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Preferences#isSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Preferences#isSystem()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_System();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugins</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugins
	 * @generated
	 */
	EClass getPlugins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugins#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugins#getChildren()
	 * @see #getPlugins()
	 * @generated
	 */
	EReference getPlugins_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getBundleId <em>Bundle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Id</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getBundleId()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_BundleId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getClassName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_ClassName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getRoles()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Roles();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Users</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getUsers()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Users();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Groups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getGroups()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Groups();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#isIsPerspective <em>Is Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Perspective</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#isIsPerspective()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_IsPerspective();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#isReadOnly()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_ReadOnly();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getDefaultPerspective <em>Default Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Perspective</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getDefaultPerspective()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_DefaultPerspective();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perspectives</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Plugin#getPerspectives()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Perspectives();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tool</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool
	 * @generated
	 */
	EClass getAbstractTool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getX()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getY()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getWidth()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getHeight()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getGridX <em>Grid X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid X</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getGridX()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_GridX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getGridY <em>Grid Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Y</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getGridY()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_GridY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getSpanX <em>Span X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span X</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getSpanX()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_SpanX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getSpanY <em>Span Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Y</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getSpanY()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_SpanY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#isLabeled <em>Labeled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labeled</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#isLabeled()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Labeled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#isNotImplemented <em>Not Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Implemented</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#isNotImplemented()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_NotImplemented();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool#getService()
	 * @see #getAbstractTool()
	 * @generated
	 */
	EAttribute getAbstractTool_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Tool#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Tool#getFormat()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Tool#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Tool#getType()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup <em>Tool Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Group</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup
	 * @generated
	 */
	EClass getToolGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getToolGroups <em>Tool Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Groups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getToolGroups()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_ToolGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getTools()
	 * @see #getToolGroup()
	 * @generated
	 */
	EReference getToolGroup_Tools();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#isGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#isGrid()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Grid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getType()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getFormat()
	 * @see #getToolGroup()
	 * @generated
	 */
	EAttribute getToolGroup_Format();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Tools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Tools
	 * @generated
	 */
	EClass getTools();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Tools#getToolgroupChildren <em>Toolgroup Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolgroup Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Tools#getToolgroupChildren()
	 * @see #getTools()
	 * @generated
	 */
	EReference getTools_ToolgroupChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Tools#getToolChildren <em>Tool Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Tools#getToolChildren()
	 * @see #getTools()
	 * @generated
	 */
	EReference getTools_ToolChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.QuickTools <em>Quick Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quick Tools</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.QuickTools
	 * @generated
	 */
	EClass getQuickTools();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.QuickTools#getQuickTools <em>Quick Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quick Tools</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.QuickTools#getQuickTools()
	 * @see #getQuickTools()
	 * @generated
	 */
	EReference getQuickTools_QuickTools();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar <em>Top Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar
	 * @generated
	 */
	EClass getTopToolBar();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar#getToolGroups <em>Tool Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tool Groups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar#getToolGroups()
	 * @see #getTopToolBar()
	 * @generated
	 */
	EReference getTopToolBar_ToolGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar <em>Side Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Side Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar
	 * @generated
	 */
	EClass getSideToolBar();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar#getToolGroups <em>Tool Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tool Groups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar#getToolGroups()
	 * @see #getSideToolBar()
	 * @generated
	 */
	EReference getSideToolBar_ToolGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.QuickToolBar <em>Quick Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quick Tool Bar</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.QuickToolBar
	 * @generated
	 */
	EClass getQuickToolBar();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.QuickToolBar#getToolGroups <em>Tool Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tool Groups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.QuickToolBar#getToolGroups()
	 * @see #getQuickToolBar()
	 * @generated
	 */
	EReference getQuickToolBar_ToolGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Folder#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Folder#getFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Folders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Folder#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Folder#getResources()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Resources();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Folder#getLinkedResources <em>Linked Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Resources</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Folder#getLinkedResources()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_LinkedResources();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resource#getUri()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resource#isTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resource#isTemplate()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Template();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resource#getLinkedResources <em>Linked Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Resources</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resource#getLinkedResources()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_LinkedResources();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resource#getMainPerspective <em>Main Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Perspective</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resource#getMainPerspective()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_MainPerspective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Person#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Person#getMiddleName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addresses</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Person#getAddresses()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Addresses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup <em>Person Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Group</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup
	 * @generated
	 */
	EClass getPersonGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getPersongroups <em>Persongroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persongroups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getPersongroups()
	 * @see #getPersonGroup()
	 * @generated
	 */
	EReference getPersonGroup_Persongroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getPersons()
	 * @see #getPersonGroup()
	 * @generated
	 */
	EReference getPersonGroup_Persons();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getLinkedPersons <em>Linked Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Persons</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getLinkedPersons()
	 * @see #getPersonGroup()
	 * @generated
	 */
	EReference getPersonGroup_LinkedPersons();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getLinkedPersongroups <em>Linked Persongroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Persongroups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup#getLinkedPersongroups()
	 * @see #getPersonGroup()
	 * @generated
	 */
	EReference getPersonGroup_LinkedPersongroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Resources#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Resources#getChildren()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup <em>Preference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference Group</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup
	 * @generated
	 */
	EClass getPreferenceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferences</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getPreferences()
	 * @see #getPreferenceGroup()
	 * @generated
	 */
	EReference getPreferenceGroup_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getLinkedPreferences <em>Linked Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Preferences</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getLinkedPreferences()
	 * @see #getPreferenceGroup()
	 * @generated
	 */
	EReference getPreferenceGroup_LinkedPreferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getPreferencegroups <em>Preferencegroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferencegroups</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getPreferencegroups()
	 * @see #getPreferenceGroup()
	 * @generated
	 */
	EReference getPreferenceGroup_Preferencegroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Persons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persons</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Persons
	 * @generated
	 */
	EClass getPersons();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Persons#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Persons#getChildren()
	 * @see #getPersons()
	 * @generated
	 */
	EReference getPersons_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPLTemplates <em>RCPL Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RCPL Templates</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPLTemplates
	 * @generated
	 */
	EClass getRCPLTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPLTemplates#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RCPLTemplates#getChildren()
	 * @see #getRCPLTemplates()
	 * @generated
	 */
	EReference getRCPLTemplates_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.JPerson <em>JPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPerson</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.JPerson
	 * @generated
	 */
	EClass getJPerson();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.NPerson <em>NPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NPerson</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.NPerson
	 * @generated
	 */
	EClass getNPerson();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Street</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Street();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getHousenumber <em>Housenumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Housenumber</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address#getHousenumber()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Housenumber();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buildings</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address#getBuildings()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Buildings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Address#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Address#getAddressType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddressType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Country#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Country#getCities()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Cities();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Country#getWorldregions <em>Worldregions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Worldregions</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Country#getWorldregions()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Worldregions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.City#getStreets <em>Streets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streets</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.City#getStreets()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Streets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Geo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Geo
	 * @generated
	 */
	EClass getGeo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Geo#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Geo#getCountries()
	 * @see #getGeo()
	 * @generated
	 */
	EReference getGeo_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Geo#getWorldregions <em>Worldregions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worldregions</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Geo#getWorldregions()
	 * @see #getGeo()
	 * @generated
	 */
	EReference getGeo_Worldregions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.WorldRegion <em>World Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Region</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.WorldRegion
	 * @generated
	 */
	EClass getWorldRegion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Street
	 * @generated
	 */
	EClass getStreet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Street#getHousenumbers <em>Housenumbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Housenumbers</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Street#getHousenumbers()
	 * @see #getStreet()
	 * @generated
	 */
	EReference getStreet_Housenumbers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Street#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Street#getBuildings()
	 * @see #getStreet()
	 * @generated
	 */
	EReference getStreet_Buildings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.HouseNumber <em>House Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Number</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.HouseNumber
	 * @generated
	 */
	EClass getHouseNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Contact#getPhones <em>Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phones</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Contact#getPhones()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Phones();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Phone#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Phone#getNumber()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Number();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Domains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domains</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Domains
	 * @generated
	 */
	EClass getDomains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Domains#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Domains#getChildren()
	 * @see #getDomains()
	 * @generated
	 */
	EReference getDomains_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Domain#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Domain#getHost()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Domain#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Domain#getPort()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Domain#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.Domain#getResource()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Resource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tool Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolType
	 * @generated
	 */
	EEnum getToolType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FontStyles <em>Font Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Styles</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FontStyles
	 * @generated
	 */
	EEnum getFontStyles();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolBarReplacementPolicy <em>Tool Bar Replacement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tool Bar Replacement Policy</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolBarReplacementPolicy
	 * @generated
	 */
	EEnum getToolBarReplacementPolicy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rcpl.model_2_0_0.rcpl.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.GroupType
	 * @generated
	 */
	EEnum getGroupType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AddressType
	 * @generated
	 */
	EEnum getAddressType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RcplFactory getRcplFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.LayoutableImpl <em>Layoutable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.LayoutableImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getLayoutable()
		 * @generated
		 */
		EClass LAYOUTABLE = eINSTANCE.getLayoutable();

		/**
		 * The meta object literal for the '<em><b>Layout X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__LAYOUT_X = eINSTANCE.getLayoutable_LayoutX();

		/**
		 * The meta object literal for the '<em><b>Layout Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__LAYOUT_Y = eINSTANCE.getLayoutable_LayoutY();

		/**
		 * The meta object literal for the '<em><b>Layout Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__LAYOUT_WIDTH = eINSTANCE.getLayoutable_LayoutWidth();

		/**
		 * The meta object literal for the '<em><b>Layout Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__LAYOUT_HEIGHT = eINSTANCE.getLayoutable_LayoutHeight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__NAME = eINSTANCE.getLayoutable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__DESCRIPTION = eINSTANCE.getLayoutable_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__ID = eINSTANCE.getLayoutable_Id();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__IMAGE = eINSTANCE.getLayoutable_Image();

		/**
		 * The meta object literal for the '<em><b>Tool Tip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__TOOL_TIP = eINSTANCE.getLayoutable_ToolTip();

		/**
		 * The meta object literal for the '<em><b>Create Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__CREATE_DATE = eINSTANCE.getLayoutable_CreateDate();

		/**
		 * The meta object literal for the '<em><b>Begin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__BEGIN_DATE = eINSTANCE.getLayoutable_BeginDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__END_DATE = eINSTANCE.getLayoutable_EndDate();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUTABLE__LEAF = eINSTANCE.getLayoutable_Leaf();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLImpl <em>RCPL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getRCPL()
		 * @generated
		 */
		EClass RCPL = eINSTANCE.getRCPL();

		/**
		 * The meta object literal for the '<em><b>All Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_PLUGINS = eINSTANCE.getRCPL_AllPlugins();

		/**
		 * The meta object literal for the '<em><b>All Perspectives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_PERSPECTIVES = eINSTANCE.getRCPL_AllPerspectives();

		/**
		 * The meta object literal for the '<em><b>All Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_PREFERENCES = eINSTANCE.getRCPL_AllPreferences();

		/**
		 * The meta object literal for the '<em><b>All Tools</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_TOOLS = eINSTANCE.getRCPL_AllTools();

		/**
		 * The meta object literal for the '<em><b>All Favorites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_FAVORITES = eINSTANCE.getRCPL_AllFavorites();

		/**
		 * The meta object literal for the '<em><b>Version Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCPL__VERSION_MAJOR = eINSTANCE.getRCPL_VersionMajor();

		/**
		 * The meta object literal for the '<em><b>Version Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCPL__VERSION_MINOR = eINSTANCE.getRCPL_VersionMinor();

		/**
		 * The meta object literal for the '<em><b>Version Maintenance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCPL__VERSION_MAINTENANCE = eINSTANCE.getRCPL_VersionMaintenance();

		/**
		 * The meta object literal for the '<em><b>Build Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCPL__BUILD_NUMBER = eINSTANCE.getRCPL_BuildNumber();

		/**
		 * The meta object literal for the '<em><b>Version Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCPL__VERSION_DESCRIPTION = eINSTANCE.getRCPL_VersionDescription();

		/**
		 * The meta object literal for the '<em><b>All Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_RESOURCES = eINSTANCE.getRCPL_AllResources();

		/**
		 * The meta object literal for the '<em><b>All Persons</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__ALL_PERSONS = eINSTANCE.getRCPL_AllPersons();

		/**
		 * The meta object literal for the '<em><b>Linked Rcpls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL__LINKED_RCPLS = eINSTANCE.getRCPL_LinkedRcpls();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectivesImpl <em>Perspectives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectivesImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPerspectives()
		 * @generated
		 */
		EClass PERSPECTIVES = eINSTANCE.getPerspectives();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVES__CHILDREN = eINSTANCE.getPerspectives_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl <em>Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPerspective()
		 * @generated
		 */
		EClass PERSPECTIVE = eINSTANCE.getPerspective();

		/**
		 * The meta object literal for the '<em><b>Side Tool Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__SIDE_TOOL_BAR = eINSTANCE.getPerspective_SideToolBar();

		/**
		 * The meta object literal for the '<em><b>Top Tool Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__TOP_TOOL_BAR = eINSTANCE.getPerspective_TopToolBar();

		/**
		 * The meta object literal for the '<em><b>Quick Tool Bar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__QUICK_TOOL_BAR = eINSTANCE.getPerspective_QuickToolBar();

		/**
		 * The meta object literal for the '<em><b>Quick Tools</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__QUICK_TOOLS = eINSTANCE.getPerspective_QuickTools();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPreference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__KEY = eINSTANCE.getPreference_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__VALUE = eINSTANCE.getPreference_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__TYPE = eINSTANCE.getPreference_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginsImpl <em>Logins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginsImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getLogins()
		 * @generated
		 */
		EClass LOGINS = eINSTANCE.getLogins();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGINS__CHILDREN = eINSTANCE.getLogins_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginImpl <em>Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.LoginImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getLogin()
		 * @generated
		 */
		EClass LOGIN = eINSTANCE.getLogin();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__COUNTRY = eINSTANCE.getLogin_Country();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__PASSWORD = eINSTANCE.getLogin_Password();

		/**
		 * The meta object literal for the '<em><b>Rcpl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN__RCPL = eINSTANCE.getLogin_Rcpl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__USER_ID = eINSTANCE.getLogin_UserId();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN__PERSON = eINSTANCE.getLogin_Person();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN__DOMAINS = eINSTANCE.getLogin_Domains();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesImpl <em>Favorites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFavorites()
		 * @generated
		 */
		EClass FAVORITES = eINSTANCE.getFavorites();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAVORITES__CHILDREN = eINSTANCE.getFavorites_Children();

		/**
		 * The meta object literal for the '<em><b>Default Set Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITES__DEFAULT_SET_ID = eINSTANCE.getFavorites_DefaultSetId();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoriteImpl <em>Favorite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoriteImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFavorite()
		 * @generated
		 */
		EClass FAVORITE = eINSTANCE.getFavorite();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__LINK = eINSTANCE.getFavorite_Link();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__URI = eINSTANCE.getFavorite_URI();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__URL = eINSTANCE.getFavorite_URL();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__CREATION_DATE = eINSTANCE.getFavorite_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Document Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__DOCUMENT_CREATION_DATE = eINSTANCE.getFavorite_DocumentCreationDate();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__RATING = eINSTANCE.getFavorite_Rating();

		/**
		 * The meta object literal for the '<em><b>Last Used Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__LAST_USED_DATE = eINSTANCE.getFavorite_LastUsedDate();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__FREQUENCY = eINSTANCE.getFavorite_Frequency();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__PASSWORD = eINSTANCE.getFavorite_Password();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__FORMAT = eINSTANCE.getFavorite_Format();

		/**
		 * The meta object literal for the '<em><b>Show On Tool Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAVORITE__SHOW_ON_TOOL_BAR = eINSTANCE.getFavorite_ShowOnToolBar();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl <em>Favorites Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FavoritesGroupImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFavoritesGroup()
		 * @generated
		 */
		EClass FAVORITES_GROUP = eINSTANCE.getFavoritesGroup();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAVORITES_GROUP__GROUPS = eINSTANCE.getFavoritesGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Favorites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAVORITES_GROUP__FAVORITES = eINSTANCE.getFavoritesGroup_Favorites();

		/**
		 * The meta object literal for the '<em><b>Linked Favorites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAVORITES_GROUP__LINKED_FAVORITES = eINSTANCE.getFavoritesGroup_LinkedFavorites();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferencesImpl <em>Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferencesImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPreferences()
		 * @generated
		 */
		EClass PREFERENCES = eINSTANCE.getPreferences();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCES__CHILDREN = eINSTANCE.getPreferences_Children();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__SYSTEM = eINSTANCE.getPreferences_System();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginsImpl <em>Plugins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginsImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPlugins()
		 * @generated
		 */
		EClass PLUGINS = eINSTANCE.getPlugins();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGINS__CHILDREN = eINSTANCE.getPlugins_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PluginImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Bundle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__BUNDLE_ID = eINSTANCE.getPlugin_BundleId();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__CLASS_NAME = eINSTANCE.getPlugin_ClassName();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__ROLES = eINSTANCE.getPlugin_Roles();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__USERS = eINSTANCE.getPlugin_Users();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__GROUPS = eINSTANCE.getPlugin_Groups();

		/**
		 * The meta object literal for the '<em><b>Is Perspective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__IS_PERSPECTIVE = eINSTANCE.getPlugin_IsPerspective();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__READ_ONLY = eINSTANCE.getPlugin_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Perspective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__DEFAULT_PERSPECTIVE = eINSTANCE.getPlugin_DefaultPerspective();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__PERSPECTIVES = eINSTANCE.getPlugin_Perspectives();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl <em>Abstract Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getAbstractTool()
		 * @generated
		 */
		EClass ABSTRACT_TOOL = eINSTANCE.getAbstractTool();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__X = eINSTANCE.getAbstractTool_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__Y = eINSTANCE.getAbstractTool_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__WIDTH = eINSTANCE.getAbstractTool_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__HEIGHT = eINSTANCE.getAbstractTool_Height();

		/**
		 * The meta object literal for the '<em><b>Grid X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__GRID_X = eINSTANCE.getAbstractTool_GridX();

		/**
		 * The meta object literal for the '<em><b>Grid Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__GRID_Y = eINSTANCE.getAbstractTool_GridY();

		/**
		 * The meta object literal for the '<em><b>Span X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__SPAN_X = eINSTANCE.getAbstractTool_SpanX();

		/**
		 * The meta object literal for the '<em><b>Span Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__SPAN_Y = eINSTANCE.getAbstractTool_SpanY();

		/**
		 * The meta object literal for the '<em><b>Labeled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__LABELED = eINSTANCE.getAbstractTool_Labeled();

		/**
		 * The meta object literal for the '<em><b>Not Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__NOT_IMPLEMENTED = eINSTANCE.getAbstractTool_NotImplemented();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TOOL__SERVICE = eINSTANCE.getAbstractTool_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__FORMAT = eINSTANCE.getTool_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TYPE = eINSTANCE.getTool_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolGroupImpl <em>Tool Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolGroupImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getToolGroup()
		 * @generated
		 */
		EClass TOOL_GROUP = eINSTANCE.getToolGroup();

		/**
		 * The meta object literal for the '<em><b>Tool Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_GROUP__TOOL_GROUPS = eINSTANCE.getToolGroup_ToolGroups();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_GROUP__TOOLS = eINSTANCE.getToolGroup_Tools();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_GROUP__GRID = eINSTANCE.getToolGroup_Grid();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_GROUP__TYPE = eINSTANCE.getToolGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_GROUP__FORMAT = eINSTANCE.getToolGroup_Format();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolsImpl <em>Tools</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ToolsImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getTools()
		 * @generated
		 */
		EClass TOOLS = eINSTANCE.getTools();

		/**
		 * The meta object literal for the '<em><b>Toolgroup Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLS__TOOLGROUP_CHILDREN = eINSTANCE.getTools_ToolgroupChildren();

		/**
		 * The meta object literal for the '<em><b>Tool Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLS__TOOL_CHILDREN = eINSTANCE.getTools_ToolChildren();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolsImpl <em>Quick Tools</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolsImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getQuickTools()
		 * @generated
		 */
		EClass QUICK_TOOLS = eINSTANCE.getQuickTools();

		/**
		 * The meta object literal for the '<em><b>Quick Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUICK_TOOLS__QUICK_TOOLS = eINSTANCE.getQuickTools_QuickTools();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.TopToolBarImpl <em>Top Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.TopToolBarImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getTopToolBar()
		 * @generated
		 */
		EClass TOP_TOOL_BAR = eINSTANCE.getTopToolBar();

		/**
		 * The meta object literal for the '<em><b>Tool Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_TOOL_BAR__TOOL_GROUPS = eINSTANCE.getTopToolBar_ToolGroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.SideToolBarImpl <em>Side Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.SideToolBarImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getSideToolBar()
		 * @generated
		 */
		EClass SIDE_TOOL_BAR = eINSTANCE.getSideToolBar();

		/**
		 * The meta object literal for the '<em><b>Tool Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIDE_TOOL_BAR__TOOL_GROUPS = eINSTANCE.getSideToolBar_ToolGroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolBarImpl <em>Quick Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.QuickToolBarImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getQuickToolBar()
		 * @generated
		 */
		EClass QUICK_TOOL_BAR = eINSTANCE.getQuickToolBar();

		/**
		 * The meta object literal for the '<em><b>Tool Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUICK_TOOL_BAR__TOOL_GROUPS = eINSTANCE.getQuickToolBar_ToolGroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.FolderImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__FOLDERS = eINSTANCE.getFolder_Folders();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__RESOURCES = eINSTANCE.getFolder_Resources();

		/**
		 * The meta object literal for the '<em><b>Linked Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__LINKED_RESOURCES = eINSTANCE.getFolder_LinkedResources();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourceImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__URI = eINSTANCE.getResource_Uri();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TEMPLATE = eINSTANCE.getResource_Template();

		/**
		 * The meta object literal for the '<em><b>Linked Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LINKED_RESOURCES = eINSTANCE.getResource_LinkedResources();

		/**
		 * The meta object literal for the '<em><b>Main Perspective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MAIN_PERSPECTIVE = eINSTANCE.getResource_MainPerspective();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MIDDLE_NAME = eINSTANCE.getPerson_MiddleName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonGroupImpl <em>Person Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonGroupImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPersonGroup()
		 * @generated
		 */
		EClass PERSON_GROUP = eINSTANCE.getPersonGroup();

		/**
		 * The meta object literal for the '<em><b>Persongroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_GROUP__PERSONGROUPS = eINSTANCE.getPersonGroup_Persongroups();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_GROUP__PERSONS = eINSTANCE.getPersonGroup_Persons();

		/**
		 * The meta object literal for the '<em><b>Linked Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_GROUP__LINKED_PERSONS = eINSTANCE.getPersonGroup_LinkedPersons();

		/**
		 * The meta object literal for the '<em><b>Linked Persongroups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_GROUP__LINKED_PERSONGROUPS = eINSTANCE.getPersonGroup_LinkedPersongroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ResourcesImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__CHILDREN = eINSTANCE.getResources_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceGroupImpl <em>Preference Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PreferenceGroupImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPreferenceGroup()
		 * @generated
		 */
		EClass PREFERENCE_GROUP = eINSTANCE.getPreferenceGroup();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCE_GROUP__PREFERENCES = eINSTANCE.getPreferenceGroup_Preferences();

		/**
		 * The meta object literal for the '<em><b>Linked Preferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCE_GROUP__LINKED_PREFERENCES = eINSTANCE.getPreferenceGroup_LinkedPreferences();

		/**
		 * The meta object literal for the '<em><b>Preferencegroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCE_GROUP__PREFERENCEGROUPS = eINSTANCE.getPreferenceGroup_Preferencegroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonsImpl <em>Persons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PersonsImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPersons()
		 * @generated
		 */
		EClass PERSONS = eINSTANCE.getPersons();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONS__CHILDREN = eINSTANCE.getPersons_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLTemplatesImpl <em>RCPL Templates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RCPLTemplatesImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getRCPLTemplates()
		 * @generated
		 */
		EClass RCPL_TEMPLATES = eINSTANCE.getRCPLTemplates();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCPL_TEMPLATES__CHILDREN = eINSTANCE.getRCPLTemplates_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.JPersonImpl <em>JPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.JPersonImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getJPerson()
		 * @generated
		 */
		EClass JPERSON = eINSTANCE.getJPerson();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.NPersonImpl <em>NPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.NPersonImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getNPerson()
		 * @generated
		 */
		EClass NPERSON = eINSTANCE.getNPerson();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.AddressImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Housenumber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__HOUSENUMBER = eINSTANCE.getAddress_Housenumber();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__BUILDINGS = eINSTANCE.getAddress_Buildings();

		/**
		 * The meta object literal for the '<em><b>Address Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDRESS_TYPE = eINSTANCE.getAddress_AddressType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.CountryImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__CITIES = eINSTANCE.getCountry_Cities();

		/**
		 * The meta object literal for the '<em><b>Worldregions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__WORLDREGIONS = eINSTANCE.getCountry_Worldregions();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.CityImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Streets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__STREETS = eINSTANCE.getCity_Streets();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.GeoImpl <em>Geo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.GeoImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getGeo()
		 * @generated
		 */
		EClass GEO = eINSTANCE.getGeo();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO__COUNTRIES = eINSTANCE.getGeo_Countries();

		/**
		 * The meta object literal for the '<em><b>Worldregions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO__WORLDREGIONS = eINSTANCE.getGeo_Worldregions();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.WorldRegionImpl <em>World Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.WorldRegionImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getWorldRegion()
		 * @generated
		 */
		EClass WORLD_REGION = eINSTANCE.getWorldRegion();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.StreetImpl <em>Street</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.StreetImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getStreet()
		 * @generated
		 */
		EClass STREET = eINSTANCE.getStreet();

		/**
		 * The meta object literal for the '<em><b>Housenumbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET__HOUSENUMBERS = eINSTANCE.getStreet_Housenumbers();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREET__BUILDINGS = eINSTANCE.getStreet_Buildings();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.HouseNumberImpl <em>House Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.HouseNumberImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getHouseNumber()
		 * @generated
		 */
		EClass HOUSE_NUMBER = eINSTANCE.getHouseNumber();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.BuildingImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.ContactImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Phones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__PHONES = eINSTANCE.getContact_Phones();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.PhoneImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getPhone()
		 * @generated
		 */
		EClass PHONE = eINSTANCE.getPhone();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__NUMBER = eINSTANCE.getPhone_Number();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainsImpl <em>Domains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainsImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getDomains()
		 * @generated
		 */
		EClass DOMAINS = eINSTANCE.getDomains();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINS__CHILDREN = eINSTANCE.getDomains_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.DomainImpl
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__HOST = eINSTANCE.getDomain_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__PORT = eINSTANCE.getDomain_Port();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__RESOURCE = eINSTANCE.getDomain_Resource();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolType <em>Tool Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolType
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getToolType()
		 * @generated
		 */
		EEnum TOOL_TYPE = eINSTANCE.getToolType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.FontStyles <em>Font Styles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.FontStyles
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getFontStyles()
		 * @generated
		 */
		EEnum FONT_STYLES = eINSTANCE.getFontStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolBarReplacementPolicy <em>Tool Bar Replacement Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.ToolBarReplacementPolicy
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getToolBarReplacementPolicy()
		 * @generated
		 */
		EEnum TOOL_BAR_REPLACEMENT_POLICY = eINSTANCE.getToolBarReplacementPolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.GroupType <em>Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.GroupType
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getGroupType()
		 * @generated
		 */
		EEnum GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.AddressType <em>Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.AddressType
		 * @see org.eclipse.rcpl.model_2_0_0.rcpl.impl.RcplPackageImpl#getAddressType()
		 * @generated
		 */
		EEnum ADDRESS_TYPE = eINSTANCE.getAddressType();

	}

} //RcplPackage
