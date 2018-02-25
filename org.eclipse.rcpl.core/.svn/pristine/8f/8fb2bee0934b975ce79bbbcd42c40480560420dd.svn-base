/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package org.eclipse.rcpl;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType;

public enum EStyleType {

	CHARACTER("Character"),

	NUMBERING("Numbering"),

	PARAGRAPH("Paragraph"),

	TABLE("Table");

	private String displayName;

	private EStyleType(String displayName) {
		this.displayName = displayName;
	}

	public static EStyleType create(STStyleType.Enum styleType) {
		if (styleType.equals(STStyleType.CHARACTER)) {
			return CHARACTER;
		} else if (styleType.equals(STStyleType.NUMBERING)) {
			return NUMBERING;
		} else if (styleType.equals(STStyleType.PARAGRAPH)) {
			return PARAGRAPH;
		} else if (styleType.equals(STStyleType.TABLE)) {
			return TABLE;
		}
		return null;
	}

	public String getDisplayName() {
		return displayName;
	}

}
