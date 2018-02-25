/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tool Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolType()
 * @model
 * @generated
 */
public enum ToolType implements Enumerator {
	/**
	 * The '<em><b>BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON(0, "BUTTON", "BUTTON"),

	/**
	 * The '<em><b>TOGGLEBUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGGLEBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	TOGGLEBUTTON(1, "TOGGLEBUTTON", "TOGGLEBUTTON"),

	/**
	 * The '<em><b>TEXTFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTFIELD(2, "TEXTFIELD", "TEXTFIELD"),

	/**
	 * The '<em><b>PASSWORDFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORDFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	PASSWORDFIELD(3, "PASSWORDFIELD", "PASSWORDFIELD"),

	/**
	 * The '<em><b>DATEFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATEFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	DATEFIELD(4, "DATEFIELD", "DATEFIELD"),

	/**
	 * The '<em><b>DATEANDTIMEFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATEANDTIMEFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	DATEANDTIMEFIELD(5, "DATEANDTIMEFIELD", "DATEANDTIMEFIELD"),

	/**
	 * The '<em><b>SPLITMENUBUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLITMENUBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	SPLITMENUBUTTON(6, "SPLITMENUBUTTON", "SPLITMENUBUTTON"),

	/**
	 * The '<em><b>RADIOBUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	RADIOBUTTON(7, "RADIOBUTTON", "RADIOBUTTON"),

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(8, "CHECKBOX", "CHECKBOX"),

	/**
	 * The '<em><b>COMBO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	COMBO(9, "COMBO", "COMBO"),

	/**
	 * The '<em><b>NAVIGATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATOR_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATOR(10, "NAVIGATOR", "NAVIGATOR"),

	/**
	 * The '<em><b>COLOR CHOOSER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_CHOOSER_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_CHOOSER(11, "COLOR_CHOOSER", "COLOR_CHOOSER"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(12, "OTHER", "OTHER"),

	/**
	 * The '<em><b>CHOICEBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICEBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHOICEBOX(13, "CHOICEBOX", "CHOICEBOX"),

	/**
	 * The '<em><b>HTMLEDITOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTMLEDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	HTMLEDITOR(14, "HTMLEDITOR", "HTMLEDITOR"),

	/**
	 * The '<em><b>HYPERLINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERLINK_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERLINK(15, "HYPERLINK", "HYPERLINK"),

	/**
	 * The '<em><b>IMAGEVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGEVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGEVIEW(16, "IMAGEVIEW", "IMAGEVIEW"),

	/**
	 * The '<em><b>LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(17, "LABEL", "LABEL"),

	/**
	 * The '<em><b>LISTVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LISTVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	LISTVIEW(18, "LISTVIEW", "LISTVIEW"),

	/**
	 * The '<em><b>SEPARATOR VERTICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATOR_VERTICAL(19, "SEPARATOR_VERTICAL", "SEPARATOR_VERTICAL"),

	/**
	 * The '<em><b>MENUBAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENUBAR_VALUE
	 * @generated
	 * @ordered
	 */
	MENUBAR(20, "MENUBAR", "MENUBAR"),

	/**
	 * The '<em><b>SEPARATOR HORIZONTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATOR_HORIZONTAL(21, "SEPARATOR_HORIZONTAL", "SEPARATOR_HORIZONTAL"),

	/**
	 * The '<em><b>PROGRESSINDICATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRESSINDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRESSINDICATOR(22, "PROGRESSINDICATOR", "PROGRESSINDICATOR"),

	/**
	 * The '<em><b>PROGRESSBAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRESSBAR_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRESSBAR(23, "PROGRESSBAR", "PROGRESSBAR"),

	/**
	 * The '<em><b>MENUBUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENUBUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	MENUBUTTON(24, "MENUBUTTON", "MENUBUTTON"),

	/**
	 * The '<em><b>WEBVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	WEBVIEW(25, "WEBVIEW", "WEBVIEW"),

	/**
	 * The '<em><b>TEXTAREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTAREA_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTAREA(26, "TEXTAREA", "TEXTAREA"),

	/**
	 * The '<em><b>SLIDER VERTICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDER_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDER_VERTICAL(27, "SLIDER_VERTICAL", "SLIDER_VERTICAL"),

	/**
	 * The '<em><b>SLIDER HORIZONTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDER_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDER_HORIZONTAL(28, "SLIDER_HORIZONTAL", "SLIDER_HORIZONTAL"),

	/**
	 * The '<em><b>GRIDPANE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRIDPANE_VALUE
	 * @generated
	 * @ordered
	 */
	GRIDPANE(29, "GRIDPANE", "GRIDPANE"),

	/**
	 * The '<em><b>FLOWPANE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWPANE_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWPANE(30, "FLOWPANE", "FLOWPANE");

	/**
	 * The '<em><b>BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_VALUE = 0;

	/**
	 * The '<em><b>TOGGLEBUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGGLEBUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGGLEBUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOGGLEBUTTON_VALUE = 1;

	/**
	 * The '<em><b>TEXTFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTFIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTFIELD_VALUE = 2;

	/**
	 * The '<em><b>PASSWORDFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSWORDFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSWORDFIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSWORDFIELD_VALUE = 3;

	/**
	 * The '<em><b>DATEFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATEFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATEFIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATEFIELD_VALUE = 4;

	/**
	 * The '<em><b>DATEANDTIMEFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATEANDTIMEFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATEANDTIMEFIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATEANDTIMEFIELD_VALUE = 5;

	/**
	 * The '<em><b>SPLITMENUBUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPLITMENUBUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPLITMENUBUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPLITMENUBUTTON_VALUE = 6;

	/**
	 * The '<em><b>RADIOBUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIOBUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOBUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIOBUTTON_VALUE = 7;

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECKBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 8;

	/**
	 * The '<em><b>COMBO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMBO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMBO_VALUE = 9;

	/**
	 * The '<em><b>NAVIGATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAVIGATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVIGATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATOR_VALUE = 10;

	/**
	 * The '<em><b>COLOR CHOOSER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR CHOOSER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_CHOOSER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_CHOOSER_VALUE = 11;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 12;

	/**
	 * The '<em><b>CHOICEBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHOICEBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOICEBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHOICEBOX_VALUE = 13;

	/**
	 * The '<em><b>HTMLEDITOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HTMLEDITOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HTMLEDITOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTMLEDITOR_VALUE = 14;

	/**
	 * The '<em><b>HYPERLINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HYPERLINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYPERLINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYPERLINK_VALUE = 15;

	/**
	 * The '<em><b>IMAGEVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGEVIEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGEVIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGEVIEW_VALUE = 16;

	/**
	 * The '<em><b>LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 17;

	/**
	 * The '<em><b>LISTVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LISTVIEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LISTVIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LISTVIEW_VALUE = 18;

	/**
	 * The '<em><b>SEPARATOR VERTICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATOR VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_VERTICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATOR_VERTICAL_VALUE = 19;

	/**
	 * The '<em><b>MENUBAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENUBAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENUBAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENUBAR_VALUE = 20;

	/**
	 * The '<em><b>SEPARATOR HORIZONTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATOR HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_HORIZONTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATOR_HORIZONTAL_VALUE = 21;

	/**
	 * The '<em><b>PROGRESSINDICATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROGRESSINDICATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRESSINDICATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROGRESSINDICATOR_VALUE = 22;

	/**
	 * The '<em><b>PROGRESSBAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROGRESSBAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRESSBAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROGRESSBAR_VALUE = 23;

	/**
	 * The '<em><b>MENUBUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENUBUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENUBUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENUBUTTON_VALUE = 24;

	/**
	 * The '<em><b>WEBVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEBVIEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEBVIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEBVIEW_VALUE = 25;

	/**
	 * The '<em><b>TEXTAREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTAREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTAREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTAREA_VALUE = 26;

	/**
	 * The '<em><b>SLIDER VERTICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLIDER VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLIDER_VERTICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLIDER_VERTICAL_VALUE = 27;

	/**
	 * The '<em><b>SLIDER HORIZONTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLIDER HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLIDER_HORIZONTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLIDER_HORIZONTAL_VALUE = 28;

	/**
	 * The '<em><b>GRIDPANE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRIDPANE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRIDPANE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRIDPANE_VALUE = 29;

	/**
	 * The '<em><b>FLOWPANE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOWPANE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOWPANE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOWPANE_VALUE = 30;

	/**
	 * An array of all the '<em><b>Tool Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ToolType[] VALUES_ARRAY =
		new ToolType[] {
			BUTTON,
			TOGGLEBUTTON,
			TEXTFIELD,
			PASSWORDFIELD,
			DATEFIELD,
			DATEANDTIMEFIELD,
			SPLITMENUBUTTON,
			RADIOBUTTON,
			CHECKBOX,
			COMBO,
			NAVIGATOR,
			COLOR_CHOOSER,
			OTHER,
			CHOICEBOX,
			HTMLEDITOR,
			HYPERLINK,
			IMAGEVIEW,
			LABEL,
			LISTVIEW,
			SEPARATOR_VERTICAL,
			MENUBAR,
			SEPARATOR_HORIZONTAL,
			PROGRESSINDICATOR,
			PROGRESSBAR,
			MENUBUTTON,
			WEBVIEW,
			TEXTAREA,
			SLIDER_VERTICAL,
			SLIDER_HORIZONTAL,
			GRIDPANE,
			FLOWPANE,
		};

	/**
	 * A public read-only list of all the '<em><b>Tool Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ToolType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tool Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToolType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToolType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tool Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToolType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToolType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tool Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToolType get(int value) {
		switch (value) {
			case BUTTON_VALUE: return BUTTON;
			case TOGGLEBUTTON_VALUE: return TOGGLEBUTTON;
			case TEXTFIELD_VALUE: return TEXTFIELD;
			case PASSWORDFIELD_VALUE: return PASSWORDFIELD;
			case DATEFIELD_VALUE: return DATEFIELD;
			case DATEANDTIMEFIELD_VALUE: return DATEANDTIMEFIELD;
			case SPLITMENUBUTTON_VALUE: return SPLITMENUBUTTON;
			case RADIOBUTTON_VALUE: return RADIOBUTTON;
			case CHECKBOX_VALUE: return CHECKBOX;
			case COMBO_VALUE: return COMBO;
			case NAVIGATOR_VALUE: return NAVIGATOR;
			case COLOR_CHOOSER_VALUE: return COLOR_CHOOSER;
			case OTHER_VALUE: return OTHER;
			case CHOICEBOX_VALUE: return CHOICEBOX;
			case HTMLEDITOR_VALUE: return HTMLEDITOR;
			case HYPERLINK_VALUE: return HYPERLINK;
			case IMAGEVIEW_VALUE: return IMAGEVIEW;
			case LABEL_VALUE: return LABEL;
			case LISTVIEW_VALUE: return LISTVIEW;
			case SEPARATOR_VERTICAL_VALUE: return SEPARATOR_VERTICAL;
			case MENUBAR_VALUE: return MENUBAR;
			case SEPARATOR_HORIZONTAL_VALUE: return SEPARATOR_HORIZONTAL;
			case PROGRESSINDICATOR_VALUE: return PROGRESSINDICATOR;
			case PROGRESSBAR_VALUE: return PROGRESSBAR;
			case MENUBUTTON_VALUE: return MENUBUTTON;
			case WEBVIEW_VALUE: return WEBVIEW;
			case TEXTAREA_VALUE: return TEXTAREA;
			case SLIDER_VERTICAL_VALUE: return SLIDER_VERTICAL;
			case SLIDER_HORIZONTAL_VALUE: return SLIDER_HORIZONTAL;
			case GRIDPANE_VALUE: return GRIDPANE;
			case FLOWPANE_VALUE: return FLOWPANE;
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
	private ToolType(int value, String name, String literal) {
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
	
} //ToolType
