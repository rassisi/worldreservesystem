package com.joffice.rcpl.plugin.office.databinding.types;

public class JOSize {

	private JOEmu width;
	private JOEmu height;
	private boolean landscape;

	/**
	 * @param width
	 * @param height
	 */
	public JOSize(JOEmu width, JOEmu height, boolean landscape) {
		this.width = width;
		this.height = height;
		this.landscape = landscape;
	}

	public JOEmu getWidth() {
		return width;
	}

	public void setWidth(JOEmu width) {
		this.width = width;
	}

	public JOEmu getHeight() {
		return height;
	}

	public void setHeight(JOEmu height) {
		this.height = height;
	}

	public double getWidthPixel() {
		double w = width.toPixel();
		if (w == 0 && width.value != null && width.value.longValue() > 0) {
			w = 1;
		}
		return w;
	}

	public double getHeightPixel() {
		return height.toPixel();
	}

	public boolean isLandscape() {
		return landscape;
	}

	public void setLandscape(boolean landscape) {
		this.landscape = landscape;
	}

}
