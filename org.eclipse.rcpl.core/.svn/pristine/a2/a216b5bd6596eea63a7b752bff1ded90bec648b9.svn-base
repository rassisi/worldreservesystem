/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl;

import javafx.scene.paint.Color;

/**
 * @author ramin
 *
 */
public class RcplColor implements IColor {

	private Color fxColor;

	private JORGB rgb;

	private double opacity;

	private class JORGB {
		public double red = 204;
		public double green = 204;
		public double blue = 204;

		public JORGB(double red, double green, double blue) {
			this.red = red;
			this.green = green;
			this.blue = blue;

		}
	}

	public RcplColor(Color fxColor) {

		this(fxColor.getRed() * 255.0, fxColor.getGreen() * 255.0, fxColor.getBlue() * 255.0, fxColor.getOpacity());

		if (Color.WHITE.equals(fxColor)) {

		}

		this.fxColor = fxColor;
	}

	public static IColor getColor(Color fxColor) {
		return new RcplColor(fxColor.getRed(), fxColor.getGreen(), fxColor.getBlue());
	}

	public RcplColor(double red, double green, double blue) {
		this(red, green, blue, 1);
	}

	public RcplColor(double red, double green, double blue, double opacity) {
		rgb = new JORGB(red, green, blue);
		this.opacity = opacity;
	}

	@Override
	public Color getFx() {
		if (fxColor != null) {
			return fxColor;
		}
		try {
			fxColor = Color.rgb((int) rgb.red, (int) rgb.green, (int) rgb.blue, opacity);
		} catch (Exception e) {
			fxColor = Color.RED;
		}
		return fxColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(opacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rgb == null) ? 0 : rgb.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RcplColor other = (RcplColor) obj;
		if (Double.doubleToLongBits(opacity) != Double.doubleToLongBits(other.opacity))
			return false;
		if (rgb == null) {
			if (other.rgb != null)
				return false;
		} else if (!rgb.equals(other.rgb))
			return false;
		return true;
	}

	@Override
	public double getOpacity() {
		return opacity;
	}

	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}

	@Override
	public double getRed() {
		return rgb.red;
	}

	@Override
	public double getGreen() {
		return rgb.green;
	}

	@Override
	public double getBlue() {
		return rgb.blue;
	}

	@Override
	public IColor copy() {
		IColor c = new RcplColor(rgb.red, rgb.green, rgb.blue, opacity);
		return c;
	}

}
