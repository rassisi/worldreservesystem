package org.eclipse.rcpl.model.cdo.client;

public enum JOKey {

	FILE_DIALOG_DIR(null, null),

	STAGE_X(null, null),

	STAGE_Y(null, null),

	SHOW_OUTLINE(null, null),

	HOME_TAB(null, null),

	MAX_PROGRESS(null, null),

	TOOL_SIDEBAR_WIDTH(null, null),

	TOOL_SIDEBAR_HEIGHT(null, null),

	LAST_OPENED_DOCUMENT(null, null),

	PREFERENCES_THEME("Theme", "folder"),

	PREFERENCES_LANGUAGE("Language", "folder"),

	PREFERENCES_LOCALE("Locale", "folder"),

	PREFERENCES_HELP("Help", "help"),

	;

	private final String name;

	private final String image;

	JOKey(String name, String image) {
		this.name = name;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

}
