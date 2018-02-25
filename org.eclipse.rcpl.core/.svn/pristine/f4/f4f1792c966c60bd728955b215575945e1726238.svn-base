package org.eclipse.rcpl;


public enum EnPageSize {

	CUSTOM("actions/page/page_size_custom", 0.0, 0.0, 0, 0, 0, 0, "Custom"), //$NON-NLS-1$

	LETTER("actions/page/page_size_letter", 0.0, 0.0, 8.5, 11.0, 0, 1, "Letter"), //$NON-NLS-1$

	LEGAL("actions/page/page_size_legal", 21.59, 35.56, 0.0, 0.0, 0, 1, "Legal"), //$NON-NLS-1$

	SIZE_11_X_17_INCH("actions/page/page_size_11x17inch", 0.0, 0.0, 11.0, 17.0, //$NON-NLS-1$
			0, 1, "11 x 17 Inch"),

	A5("actions/page/page_size_a5", 14.8, 21.0, 0.0, 0.0, 0, 1, ""), //$NON-NLS-1$

	A4("actions/page/page_size_a4", 21.0, 29.7, 0.0, 0.0, 2.54, 0, ""), //$NON-NLS-1$

	A3("actions/page/page_size_a3", 29.7, 42.0, 0.0, 0.0, 2.54, 0, ""), //$NON-NLS-1$

	A3_PLUS("actions/page/page_size_a3_plus", 32.9, 48.3, 0.0, 0.0, 2.54, 0, //$NON-NLS-1$
			""),

	B5("actions/page/page_size_b5", 18.2, 25.7, 0.0, 0.0, 2.54, 0, ""),

	B4("actions/page/page_size_b4", 25.7, 36.4, 0.0, 0.0, 2.54, 0, ""), //$NON-NLS-1$

	SIZE_4X6_INCH("actions/page/page_size_4x6inch", 0.0, 0.0, 4.0, 6.0, 0, 1, //$NON-NLS-1$
			""),

	SIZE_4X8_INCH("actions/page/page_size_4x8inch", 0.0, 0.0, 4.0, 8.0, 0, 1, //$NON-NLS-1$
			""),

	SIZE_5X7_INCH("actions/page/page_size_5x7inch", 0.0, 0.0, 5.0, 7.0, 0, 1, //$NON-NLS-1$
			""),

	SIZE_8X10_INCH("actions/page/page_size_8x10inch", 0.0, 0.0, 8.0, 10.0, 0, //$NON-NLS-1$
			1, ""),

	SIZE_10X12_INCH("actions/page/page_size_10x12inch", 0.0, 0.0, 10.0, 12.0, //$NON-NLS-1$
			0, 1, ""),

	SIZE_14X17_INCH("actions/page/page_size_14x17inch", 0.0, 0.0, 14.0, 17.0, //$NON-NLS-1$
			0, 1, ""),

	SIZE_2L_89X127_MM("actions/page/page_size_2l_89x128mm", 8.9, 12.7, 0.0, //$NON-NLS-1$
			0.0, 0, 1, ""),

	HAGAKI("actions/page/page_size_hagaki", 10.0, 14.8, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	COMM_ENV("actions/page/page_size_comm_env", 10.48, 24.13, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	DL_ENV("actions/page/page_size_dl_env", 11.0, 22.0, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	CHOUKEI_3("actions/page/page_size_choukei_3", 12.0, 23.5, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	CHOUKEI_4("actions/page/page_size_choukei_4", 9.0, 20.5, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	YOUKEI_4("actions/page/page_size_youkei_4", 10.5, 23.5, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	YOUKEI_6("actions/page/page_size_youkei_6", 9.8, 19.0, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	ART_LETTER_MARGIN_35("actions/page/page_size_art_letter_35", 21.59, 27.83, //$NON-NLS-1$
			0.0, 0.0, 0, 1, ""),

	ART_A4_MARGIN_35("actions/page/page_size_art_a4_35", 21.0, 29.59, 0.0, 0.0, //$NON-NLS-1$
			2.54, 0, ""),

	ART_A3_MARGIN_35("actions/page/page_size_art_a3_35", 29.7, 41.89, 0.0, 0.0, //$NON-NLS-1$
			2.54, 0, ""),

	ART_A3_PLUS(
			"actions/page/page_size_art_a3_plus", 32.9, 48.19, 0.0, 0.0, 2.54, //$NON-NLS-1$
			0, ""),

	CDR_TRAY_E("actions/page/page_size_cdr_tray_e", 17.2, 27.5, 0.0, 0.0, 0, 1, //$NON-NLS-1$
			""),

	;

	private String key;
	private double cmWidth;
	private double cmHeight;
	private double inchWidth;
	private double inchHeight;
	private String displayName;
	private double cmMargin;
	private double inchMargin;

	/**
	 * @param cmWidth
	 * @param cmHeight
	 * @param inchWidth
	 * @param inchHeight
	 * @param displayName
	 */
	EnPageSize(String key, double cmWidth, double cmHeight, double inchWidth,
			double inchHeight, double cmMargin, double inchMargin,
			String displayName) {
		this.cmWidth = cmWidth;
		this.cmHeight = cmHeight;
		this.inchWidth = inchWidth;
		this.inchHeight = inchHeight;
		this.displayName = displayName;
		this.cmMargin = cmMargin;
		this.inchMargin = inchMargin;
		this.key = key;
	}

	@SuppressWarnings("rawtypes")
	public Enum[] getValues() {
		return values();
	}

	/**
	 * @return
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @return
	 */
	public double getCmWidth() {
		return cmWidth;
	}

	/**
	 * @return
	 */
	public double getCmHeight() {
		return cmHeight;
	}

	/**
	 * @return
	 */
	public double getInchWidth() {
		return inchWidth;
	}

	/**
	 * @return
	 */
	public double getInchHeight() {
		return inchHeight;
	}

	/**
	 * @return
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return
	 */
	public double getCmMargin() {
		return cmMargin;
	}

	/**
	 * @return
	 */
	public double getInchMargin() {
		return inchMargin;
	}

	/**
	 * @param index
	 * @return
	 */
	public static EnPageSize valueOf(int index) {
		int i = 0;
		for (EnPageSize pz : values()) {
			if (i == index) {
				return pz;
			}
			i++;
		}
		return null;
	}
}
