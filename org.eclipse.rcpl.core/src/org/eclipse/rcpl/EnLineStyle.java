package org.eclipse.rcpl;

/**
 * @author ramin
 *
 */
public enum EnLineStyle {

	CUSTOM("actions/page/page_size_custom", 0.0, 0.0, 0, 0, "Custom Page Size"),

	LETTER("actions/page/page_size_letter", 0.0, 0.0, 8.5, 11.0, "Letter");
	;

	private String key;
	private double cmWidth;
	private double cmHeight;
	private double inchWidth;
	private double inchHeight;
	private String displayName;

	/**
	 * @param cmWidth
	 * @param cmHeight
	 * @param inchWidth
	 * @param inchHeight
	 * @param displayName
	 */
	EnLineStyle(String key, double cmWidth, double cmHeight, double inchWidth,
			double inchHeight, String displayName) {
		this.cmWidth = cmWidth;
		this.cmHeight = cmHeight;
		this.inchWidth = inchWidth;
		this.inchHeight = inchHeight;
		this.displayName = displayName;
		this.key = key;
	}

	@SuppressWarnings("rawtypes")
	public Enum[] getValues() {
		return values();
	}

	public String getKey() {
		return key;
	}

	public double getCmWidth() {
		return cmWidth;
	}

	public double getCmHeight() {
		return cmHeight;
	}

	public double getInchWidth() {
		return inchWidth;
	}

	public double getInchHeight() {
		return inchHeight;
	}

	public String getDisplayName() {
		return displayName;
	}

}
