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

import org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;

/**
 * @author ramin
 * 
 */
public class JOFontScheme {

	private CTTextFont minorFontsLatin;
	private CTTextFont minorFontsCs;
	private CTTextFont minorFontsEa;
//	private CTSupplementalFont[] minorFontsSupplemental;

	private CTTextFont majorFontsLatin;
	private CTTextFont majorFontsCs;
	private CTTextFont majorFontsEa;
//	private CTSupplementalFont[] majorFontsSupplemental;

	@SuppressWarnings("deprecation")
	public JOFontScheme(CTFontScheme themeFontScheme) {

		minorFontsCs = themeFontScheme.getMinorFont().getCs();
		minorFontsEa = themeFontScheme.getMinorFont().getEa();
//		minorFontsSupplemental = themeFontScheme.getMinorFont().getFontArray();
		minorFontsLatin = themeFontScheme.getMinorFont().getLatin();

		majorFontsLatin = themeFontScheme.getMajorFont().getLatin();
		majorFontsCs = themeFontScheme.getMajorFont().getCs();
		majorFontsEa = themeFontScheme.getMajorFont().getEa();
//		majorFontsSupplemental = themeFontScheme.getMajorFont().getFontArray();

	}

	public CTTextFont getMinorFontsLatin() {
		return minorFontsLatin;
	}

	public CTTextFont getMinorFontsCs() {
		return minorFontsCs;
	}

	public CTTextFont getMinorFontsEa() {
		return minorFontsEa;
	}

//	public CTSupplementalFont[] getMinorFontsSupplemental() {
//		return minorFontsSupplemental;
//	}

	public CTTextFont getMajorFontsLatin() {
		return majorFontsLatin;
	}

	public CTTextFont getMajorFontsCs() {
		return majorFontsCs;
	}

	public CTTextFont getMajorFontsEa() {
		return majorFontsEa;
	}

//	public CTSupplementalFont[] getMajorFontsSupplemental() {
//		return majorFontsSupplemental;
//	}

}
