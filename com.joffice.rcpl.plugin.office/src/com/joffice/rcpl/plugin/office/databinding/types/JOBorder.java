package com.joffice.rcpl.plugin.office.databinding.types;

import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IColor;

/**
 * @author ramin
 * 
 */
public class JOBorder implements IBorder {

	public JOEmu lineWidth;
	public IColor color;

	public double getLineWidthPixel() {
		if (lineWidth != null) {
			return lineWidth.toPixel();
		}
		return 1;
	}

	public IColor getColor() {
		if (color != null) {
			return color;
		}
		return IColor.BLACK;
	}

	@Override
	public void setLineWidth(double width) {
		if (lineWidth != null) {
			lineWidth.setPixel(width);
		}
	}
}
