package org.eclipse.rcpl;

/**
 * @author ramin
 *
 */
public enum EnCommandId {

	NO_COMMAND(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	delete(EnServiceId.PICTURE_SERVICE, "delete", "", ""),

	toFront(EnServiceId.PICTURE_SERVICE, "to_front", "", ""),

	toBack(EnServiceId.PICTURE_SERVICE, "to_back", "", ""),

	toFrontOneLevel(EnServiceId.PICTURE_SERVICE, "to_front_one_level", "", ""),

	toBackOneLevel(EnServiceId.PICTURE_SERVICE, "to_back_one_level", "", ""),

	showHLineal(EnServiceId.PARAGRAPH_SERVICE, "h_lineal", "H", "H"),

	showVLineal(EnServiceId.PARAGRAPH_SERVICE, "v_lineal", "V", "V"),

	showTwoPages(EnServiceId.LAYOUT_SERVICE, "two_pages", "", "Show two Pages"),

	align_left(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Left"),

	align_center(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Center"),

	align_right(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Right"),

	align_justify(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Justify"),

	align_text_left(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Left"),

	align_text_center(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Center"),

	align_text_right(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Right"),

	align_text_justify(EnServiceId.PARAGRAPH_SERVICE, null, "", "Align Justify"),

	undo(EnServiceId.COMMAND_SERVICE, null, "Undo", ""),

	redo(EnServiceId.COMMAND_SERVICE, null, "Redo", ""),

	insertDrawing(EnServiceId.PICTURE_SERVICE, "image", "", ""),

	insertTable(EnServiceId.TABLE_SERVICE, "table", "Insert Table", "Insert Table"),

	insertTextbox(EnServiceId.INSERT_SERVICE, "textbox", "Insert Textbox", "Insert Textbox"),

	textStyleListTool(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	foregroundColor(EnServiceId.COLOR_SERVICE, "color", "", "Foreground Color"),

	backgroundColor(EnServiceId.COLOR_SERVICE, "color", "", "Background Color"),

	fontName(EnServiceId.PARAGRAPH_SERVICE, null, "", "Font Name"),

	fontSize(EnServiceId.PARAGRAPH_SERVICE, null, "", "Font Size"),

	bold(EnServiceId.PARAGRAPH_SERVICE, null, "", "Bold"),

	italic(EnServiceId.PARAGRAPH_SERVICE, null, "", "Italic"),

	underline(EnServiceId.PARAGRAPH_SERVICE, null, "", "Underline"),

	strikethrough(EnServiceId.PARAGRAPH_SERVICE, null, "", "Strikethrough"),

	showStartMenu(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	layout(EnServiceId.LAYOUT_SERVICE, null, "", ""),

	layoutPages(EnServiceId.LAYOUT_SERVICE, null, "", ""),

	showRulers(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	characterStyle(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowOverview(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowTutorials(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowDonation(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowSamples(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowNew(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowWhatsNew(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowAbout(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowPreferences(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	collapse_all(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	USE_CASE(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	showOutline(EnServiceId.PARAGRAPH_SERVICE, "paragraph", "", "Show Outline"),

	updateParagraph(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	expandAfter(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	expandBefore(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	splitParagraph(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	setStyle(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	INSERT_PARAGRAPH(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	insertText(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	CONTACT_US(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	homeShowTemplates(EnServiceId.PARAGRAPH_SERVICE, null, "", ""),

	style_normal(EnServiceId.PARAGRAPH_SERVICE, null, "N", "Normal"),

	style_title(EnServiceId.PARAGRAPH_SERVICE, null, "T", "Title"),

	style_heading_1(EnServiceId.PARAGRAPH_SERVICE, null, "H1", "Header 1"),

	style_heading_2(EnServiceId.PARAGRAPH_SERVICE, null, "H2", "Header 2"),

	style_heading_3(EnServiceId.PARAGRAPH_SERVICE, null, "H3", "Header 3"),

	style_heading_4(EnServiceId.PARAGRAPH_SERVICE, null, "H4", "Header 4"),

	style_heading_5(EnServiceId.PARAGRAPH_SERVICE, null, "H5", "Header 5"),

	zoom_in(EnServiceId.EDITOR_SERVICE, null, "Zoom In", "Zoom In"),

	zoom_out(EnServiceId.EDITOR_SERVICE, null, "Zoom out", "Zoom out"),

	select(EnServiceId.EDITOR_SERVICE, null, "Select", "Select"),

	showTools(EnServiceId.EDITOR_SERVICE, "tools", "Show Tools", "Show Tools"),

	editMode(EnServiceId.EDITOR_SERVICE, "edit", "Edit Mode", "Edit Mode"),

	save(EnServiceId.EDITOR_SERVICE, null, "Save", "Save"),

	save_as(EnServiceId.EDITOR_SERVICE, null, "Save", "Save As..."),

	open(EnServiceId.EDITOR_SERVICE, "open", "Open Document", "Open Document..."),

	open_last_document(EnServiceId.EDITOR_SERVICE, null, "Open Last Document", "Open Last Document"),

	test_layout(EnServiceId.EDITOR_SERVICE, "setup", "Test Layout", "Test Layout"),

	test_z_order(EnServiceId.EDITOR_SERVICE, "setup", "Test Z-Order", "Test Z-Order"),

	// ---------- TABLES --------------------------------------

	tableInsertRowsAbove(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableInsertRowsBelow(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableInsertColumnsLeft(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableInsertColumnsRight(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableDeleteCells(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableDeleteColumns(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableDeleteRows(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableDeleteTable(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableMergeCells(EnServiceId.TABLE_SERVICE, null, "", ""),

	tableSplitCells(EnServiceId.TABLE_SERVICE, null, "", ""),

	;

	private final String image;
	private final String displayName;
	private final String toolTip;
	private final EnServiceId serviceId;

	EnCommandId(EnServiceId serviceId, String image, String displayName, String toolTip) {

		this.image = image;
		this.displayName = displayName;
		this.toolTip = toolTip;
		this.serviceId = serviceId;
	}

	public String getDisplayName() {
		if (displayName == null) {
			return getId();
		}
		return displayName;
	}

	public String getId() {
		return name();
	}

	public String getImage() {
		if (image == null) {
			return getId();
		}
		return image;
	}

	public String getToolTip() {
		if (toolTip == null) {
			return getId();
		}
		return toolTip;
	}

	public EnServiceId getServiceId() {
		return serviceId;
	}

}
