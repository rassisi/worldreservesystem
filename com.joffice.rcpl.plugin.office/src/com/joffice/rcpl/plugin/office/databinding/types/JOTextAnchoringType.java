package com.joffice.rcpl.plugin.office.databinding.types;

import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;

/**
 * @author ramin
 * 
 */
public class JOTextAnchoringType {

	public enum Enum {
		BOTTOM, DIST, JUST, CENTER, TOP;
	}

	public Enum type = Enum.TOP;

	public static final JOTextAnchoringType defaultType = new JOTextAnchoringType(Enum.TOP);

	public JOTextAnchoringType(Enum type) {
		this.type = type;
	}
	
	public JOTextAnchoringType(STTextAnchoringType.Enum typ) {
		if (typ.equals(STTextAnchoringType.B)) {
			type = Enum.BOTTOM;
		} else if (typ.equals(STTextAnchoringType.CTR)) {
			type = Enum.CENTER;
		} else if (typ.equals(STTextAnchoringType.DIST)) {
			type = Enum.DIST;
		} else if (typ.equals(STTextAnchoringType.JUST)) {
			type = Enum.JUST;
		} else if (typ.equals(STTextAnchoringType.T)) {
			type = Enum.TOP;
		}

	}
}
