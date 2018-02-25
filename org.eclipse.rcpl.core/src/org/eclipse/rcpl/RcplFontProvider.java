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

import javafx.scene.text.Font;

/**
 * Provides access Font Resources
 */
public final class RcplFontProvider implements IFontProvider {

	@Override
	public IFont loadFont(IFont font, double size) {
		return loadFont(font.getName(), size, font.getStyle());
	}

	@Override
	public IFont loadFont(IFont font, String fontName) {
		return loadFont(fontName, font.getHeight(), font.getStyle());
	}

	@Override
	public IFont loadFont(String fontName, double size, int style) {
		IFont f = new RcplFont(fontName, size, style);
		return f;
	}

	private static IFont systemFont;

	private static String systemFontName;

	@Override
	public String getSystemFontName() {
		if (systemFontName == null) {
			systemFontName = loadSystemFont().getName();
		}
		return systemFontName;
	}

	public IFont loadH2Font() {
		return loadFont(getSystemFontName(), 12, Rcpl.BOLD);
	}

	@Override
	public IFont loadSystemFont() {
		if (systemFont == null) {
			Font f = new Font(11);
			return new RcplFont(f.getName(), f.getSize(), 0);
		}
		return systemFont;
	}

	public IFont loadH1Font() {
		return loadFont(getSystemFontName(), 14, Rcpl.BOLD);
	}

	public IFont loadSmallFont() {
		return loadFont(getSystemFontName(), 7, 0);
	}

	@Override
	public IFont loadFont(double size) {
		return loadFont(getSystemFontName(), (int) size, Rcpl.NORMAL);
	}

	public IFont loadFont(int size, int style) {
		return loadFont(getSystemFontName(), size, style);
	}

	public IFont loadLargerFont() {
		return loadFont(getSystemFontName(), 14, Rcpl.NORMAL);
	}

	public IFont loadMidiumFont() {
		return loadFont(getSystemFontName(), 10, Rcpl.NORMAL);
	}

	/**
	 * needed for subscript and superscript
	 * 
	 * @param src
	 * @return
	 */
	@Override
	public IFont loadHalfSizeFont(IFont src) {
		return loadFont(src.getName(), (src.getHeight() * 2) / 3, src.getStyle());
	}

	/**
	 * @param src
	 * @param size
	 * @return
	 */
	public IFont loadFont(IFont src, int size) {
		return loadFont(src.getName(), size, src.getStyle());
	}

	@Override
	public String getDefaultFontName(boolean minorFont) {
		return getSystemFontName();
	}

}
