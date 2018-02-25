/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package org.eclipse.rcpl;

import org.eclipse.rcpl.model.IImage;

/**
 * 
 * @author ramin
 * 
 *         All figure classes must be instantiable via default constructor for
 *         subclass checking
 * 
 */
public enum JOAction {

	// ---------- special actions ----------------------------------------------

	PARAGRAPH_STYLES("actions/paragraph_styles", "word/actions/paragraph/styles", IParagraphFigure.class, //$NON-NLS-1$ //$NON-NLS-2$
			"ParagraphStyles", 3),

	// ---------- edit actions -------------------------------------------------

	// EDIT_FONT(
	// "actions/edit_font", "word/actions/groups/font", JOParagraphFigure.class,
	// Messages.JOAction_EditFont, 3), //$NON-NLS-1$
	// EDIT_PARAGRAPH(
	// "actions/edit_paragraph", "word/actions/groups/paragraph",
	// JOParagraphFigure.class, "Edit Paragraph", 3), //$NON-NLS-1$

	EDIT_PICTURE("actions/edit_picture", "word/actions/groups/images", IDrawingFigure.class, "EditPicture", 3), //$NON-NLS-1$ //$NON-NLS-2$

	EDIT_SHAPE("actions/edit_shape", "word/actions/groups/shapes", IPictFigure.class, "EditShape", 3), //$NON-NLS-1$ //$NON-NLS-2$

	EDIT_TEXTBOX("actions/edit_textbox", "word/actions/groups/textbox", IPictFigure.class, "EditTextBox", 3), //$NON-NLS-1$ //$NON-NLS-2$

	EDIT_TEXTBOX2("actions/edit_textbox", "word/actions/groups/textbox", ITextBoxFigure.class, "JOAction_8", 3), //$NON-NLS-1$ //$NON-NLS-2$

	EDIT_PAGE("actions/edit_page", "word/actions/groups/page", IPage.class, "EditPage", 3), //$NON-NLS-1$ //$NON-NLS-2$

	// ---------- insert actions -----------------------------------------------

	ADD_PICTURE("actions/images/insert_picture", "word/actions/groups/images", IPage.class, "InsertPicture", 2), //$NON-NLS-1$ //$NON-NLS-2$
	ADD_TEXTBOX("actions/insert/insert_textbox", "word/actions/groups/images", IPage.class, "InsertTextbox", 2), //$NON-NLS-1$ //$NON-NLS-2$

	SPREADSHEET_INSERT("actions/insert_spreadsheet", "spreadsheet/actions/groups/textbox", //$NON-NLS-1$ //$NON-NLS-2$
			ISpreadsheetWorkbookFigure.class, "InsertSpreadsheet", 1),

	ADD_PRESENTATION_SLIDE("actions/insert/insert_slide", "word/actions/groups/images", IPage.class, "InsertSlide", 2), //$NON-NLS-1$ //$NON-NLS-2$

	// ---------- other actions ------------------------------------------------

	SEPARATOR("", "", null, "", 3), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	SEPARATOR2("", "", null, "", 3), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	Z_ORDER_BRING_TOFRONT2("actions/z_order_bring_to_front", null, IMovableLayoutFigure.class, "BringToFront", 3), //$NON-NLS-1$
	Z_ORDER_SEND_TO_BACK2("actions/z_order_send_to_back", null, IMovableLayoutFigure.class, "SendToBack", 3), //$NON-NLS-1$
	Z_ORDER_BRING_FORWARD2("actions/z_order_bring_forward", null, IMovableLayoutFigure.class, "BringForward", 3), //$NON-NLS-1$
	Z_ORDER_SEND_BACKWARD2("actions/z_order_send_backward", null, IMovableLayoutFigure.class, "SendBackward", 3), //$NON-NLS-1$
	Z_ORDER_BRING_IN_FRONT_OF_TEXT2("actions/z_order_bring_in_front_of_text", null, IMovableLayoutFigure.class, //$NON-NLS-1$
			"BringInFrontOfText", 3), Z_ORDER_SEND_BEHIND_TEXT2("actions/z_order_send_behind_text", null, //$NON-NLS-2$
					IMovableLayoutFigure.class, "SendBehindText", 3),

	SEPARATOR3("", "", null, "", 3), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

	// ---------- delete actions -----------------------------------------------

	DELETE_PICTURE("actions/delete_picture", "word/actions/groups/images", IDrawingFigure.class, "DeletePicture", 1), //$NON-NLS-1$ //$NON-NLS-2$
	DELETE_TEXTBOX("actions/delete_textbox", "word/actions/groups/textbox", IPictFigure.class, "DeleteTextbox", 1), //$NON-NLS-1$ //$NON-NLS-2$
	DELETE_TEXTBOX2("actions/delete_textbox", "word/actions/groups/textbox", ITextBoxFigure.class, "DeleteTextbox", 1), //$NON-NLS-1$ //$NON-NLS-2$
	DELETE_TABLE("actions/delete_table", "word/actions/groups/tables", ITableFigure.class, "DeleteTable", 1), //$NON-NLS-1$ //$NON-NLS-2$
	DELETE_SHAPE("actions/delete_shape", "word/actions/groups/shapes", IPictFigure.class, "DeleteShape", 1), //$NON-NLS-1$ //$NON-NLS-2$
	DELETE_PRESENTATION_SLIDE("actions/delete_presentatation_slide", "word/actions/groups/shapes", IPictFigure.class, //$NON-NLS-1$ //$NON-NLS-2$
			"DeleteSlide", 1),

	;

	public final static int DELETE = 1;
	public final static int INSERT = 2;
	public final static int OTHER = 3;

	private int type;
	private String key;
	private String text;
	private String group;
	private Class<?> figureClass;

	/**
	 * @param key
	 * @param group
	 * @param figureClass
	 * @param text
	 */
	private JOAction(String key, String group, Class<?> figureClass, String text, int type) {
		this.key = key;
		this.type = type;
		this.text = text;
		this.group = group;
		this.figureClass = figureClass;
	}

	public boolean isDeleteAction() {
		return type == DELETE;
	}

	public boolean isInsertAction() {
		return type == INSERT;
	}

	public String getKey() {
		return key;
	}

	public String getText() {
		return text;
	}

	public String getGroup() {
		return group;
	}

	public Class<?> getFigureClass() {
		return figureClass;
	}

	/**
	 * @return
	 */
	public IImage getImage() {
		String imageName = getKey().substring(8, getKey().length());
		if (getKey().indexOf("delete_") != -1) { //$NON-NLS-1$
			imageName = "delete"; //$NON-NLS-1$
		}
		return Rcpl.resources().getImage(imageName, 16, 16);
	}
}
