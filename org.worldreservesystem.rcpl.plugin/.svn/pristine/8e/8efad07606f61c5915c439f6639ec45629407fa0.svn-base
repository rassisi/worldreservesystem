package com.joffice.rcpl.plugin.office.databinding.types;

import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.IAlignment;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;

/**
 * @author ramin
 * 
 */
public class JOAlignment implements IAlignment {

	public AlignType type = AlignType.LEFT;

	public JOAlignment(AlignType type) {
		this.type = type;
	}

	public JOAlignment(STVerticalJc.Enum vJc) {
		if (vJc.equals(STVerticalJc.CENTER)) {
			type = AlignType.CENTER;
		} else if (vJc.equals(STVerticalJc.BOTH)) {
			type = AlignType.BOTH;
		} else if (vJc.equals(STVerticalJc.BOTTOM)) {
			type = AlignType.BOTTOM;
		} else if (vJc.equals(STVerticalJc.TOP)) {
			type = AlignType.TOP;
		} else {
			type = AlignType.TOP;
		}
	}

	public JOAlignment(HorizontalAlignment horizontalAlignment) {
		switch (horizontalAlignment) {
		case CENTER:
			type = AlignType.CENTER;
			break;
		case DISTRIBUTED:
			type = AlignType.DISTRIBUTE;
			break;
		case CENTER_SELECTION:
			type = AlignType.CENTER_SELECTION;
			break;
		case FILL:
			type = AlignType.FILL;
			break;
		case GENERAL:
			type = AlignType.GENERAL;
			break;
		case JUSTIFY:
			type = AlignType.JUST;
			break;
		case LEFT:
			type = AlignType.LEFT;
			break;
		case RIGHT:
			type = AlignType.RIGHT;
			break;
		default:
			type = AlignType.LEFT;
			break;
		}
	}

	public JOAlignment(VerticalAlignment verticalAlignment) {
		switch (verticalAlignment) {
		case CENTER:
			type = AlignType.CENTER;
			break;
		case DISTRIBUTED:
			type = AlignType.DISTRIBUTE;
			break;
		case JUSTIFY:
			type = AlignType.JUST;
			break;
		case BOTTOM:
			type = AlignType.BOTTOM;
			break;
		case TOP:
			type = AlignType.TOP;
			break;
		default:
			type = AlignType.LEFT;
			break;
		}
	}

	public JOAlignment(CTJc typ) {
		if (typ.getVal().equals(STJc.BOTH)) {
			type = AlignType.BOTH;
		} else if (typ.getVal().equals(STJc.CENTER)) {
			type = AlignType.CENTER;
		} else if (typ.getVal().equals(STJc.DISTRIBUTE)) {
			type = AlignType.DISTRIBUTE;
		} else if (typ.getVal().equals(STJc.HIGH_KASHIDA)) {
			type = AlignType.HIGH_KASHIDA;
		} else if (typ.getVal().equals(STJc.LEFT)) {
			type = AlignType.LEFT;
		} else if (typ.getVal().equals(STJc.LOW_KASHIDA)) {
			type = AlignType.LOW_KASHIDA;
		} else if (typ.getVal().equals(STJc.MEDIUM_KASHIDA)) {
			type = AlignType.MEDIUM_KASHIDA;
		} else if (typ.getVal().equals(STJc.NUM_TAB)) {
			type = AlignType.NUM_TAB;
		} else if (typ.getVal().equals(STJc.RIGHT)) {
			type = AlignType.RIGHT;
		} else if (typ.getVal().equals(STJc.THAI_DISTRIBUTE)) {
			type = AlignType.THAI_DISTRIBUTE;
		}
	}

	public JOAlignment(STTextAlignType.Enum typ) {
		if (typ.equals(STTextAlignType.CTR)) {
			type = AlignType.CENTER;
		} else if (typ.equals(STTextAlignType.DIST)) {
			type = AlignType.DISTRIBUTE;
		} else if (typ.equals(STTextAlignType.JUST)) {
			type = AlignType.JUST;
		} else if (typ.equals(STTextAlignType.JUST_LOW)) {
			type = AlignType.JUST_LOW;
		} else if (typ.equals(STTextAlignType.L)) {
			type = AlignType.LEFT;
		} else if (typ.equals(STTextAlignType.R)) {
			type = AlignType.RIGHT;
		}
	}

	public JOAlignment(STTextFontAlignType.Enum typ) {
		if (typ != null) {
			if (typ.equals(STTextFontAlignType.AUTO)) {
				type = AlignType.LEFT;
			} else if (typ.equals(STTextFontAlignType.B)) {
				type = AlignType.BOTTOM;
			} else if (typ.equals(STTextFontAlignType.BASE)) {
				type = AlignType.LEFT;
			} else if (typ.equals(STTextFontAlignType.CTR)) {
				type = AlignType.CENTER;
			} else if (typ.equals(STTextFontAlignType.T)) {
				type = AlignType.TOP;
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AlignType) {
			return type.equals(obj);
		}
		if (obj instanceof JOAlignment) {
			return type.equals(((JOAlignment) obj).type);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public AlignType getType() {
		return type;
	}

}
