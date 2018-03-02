package com.joffice.rcpl.plugin.office.databinding.types;

import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType;

/**
 * @author ramin
 * 
 */
public class JOPlaceholderType {

	public final static JOPlaceholderType UNDEFINED = new JOPlaceholderType();

	public enum Enum {

		@SuppressWarnings("hiding")
		UNDEFINED("Undefined"), //$NON-NLS-1$,;
		BODY("Body"), //$NON-NLS-1$,;
		CHART("Chart"), //$NON-NLS-1$,;
		CLIP_ART("Clip Art"), //$NON-NLS-1$,;
		CTR_TITLE("Centered Title"), //$NON-NLS-1$,;
		DGM("DGM"), //$NON-NLS-1$,;
		DT("Date"), //$NON-NLS-1$,;
		FTR("Footer"), //$NON-NLS-1$,;
		HDR("Undefined"), //$NON-NLS-1$,;
		MEDIA("Media"), //$NON-NLS-1$,;
		OBJ("Object"), //$NON-NLS-1$,;
		PIC("Picture"), //$NON-NLS-1$,;
		SLD_IMG("Image"), //$NON-NLS-1$,;
		SLD_NUM("Slide Number"), //$NON-NLS-1$,;
		SUB_TITLE("Sub Title"), //$NON-NLS-1$,;
		TBL("Table"), //$NON-NLS-1$,;
		TITLE("Title"), //$NON-NLS-1$,;
		TEXT("Text"); //$NON-NLS-1$,;

		String displayName;

		private Enum(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayName() {
			return displayName;
		}

	};

	public Enum type = Enum.UNDEFINED;

	/**
	 * undefined shape type
	 */
	public JOPlaceholderType() {
	}

	public JOPlaceholderType(CTPlaceholder ctPlaceHolder) {
		if (ctPlaceHolder.getType() != null) {
			if (ctPlaceHolder.getType().equals(STPlaceholderType.BODY)) {
				type = Enum.BODY;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.CHART)) {
				type = Enum.CHART;
			} else if (ctPlaceHolder.getType().equals(
					STPlaceholderType.CLIP_ART)) {
				type = Enum.CLIP_ART;
			} else if (ctPlaceHolder.getType().equals(
					STPlaceholderType.CTR_TITLE)) {
				type = Enum.CTR_TITLE;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.DGM)) {
				type = Enum.DGM;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.DT)) {
				type = Enum.DT;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.FTR)) {
				type = Enum.FTR;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.HDR)) {
				type = Enum.HDR;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.MEDIA)) {
				type = Enum.MEDIA;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.OBJ)) {
				type = Enum.OBJ;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.PIC)) {
				type = Enum.PIC;
			} else if (ctPlaceHolder.getType()
					.equals(STPlaceholderType.SLD_IMG)) {
				type = Enum.SLD_IMG;
			} else if (ctPlaceHolder.getType()
					.equals(STPlaceholderType.SLD_NUM)) {
				type = Enum.SLD_NUM;
			} else if (ctPlaceHolder.getType().equals(
					STPlaceholderType.SUB_TITLE)) {
				type = Enum.SUB_TITLE;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.TBL)) {
				type = Enum.TBL;
			} else if (ctPlaceHolder.getType().equals(STPlaceholderType.TITLE)) {
				type = Enum.TITLE;
			}
		}

	}

	@Override
	public String toString() {
		return type.toString();
	}

}
