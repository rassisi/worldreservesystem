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
package org.eclipse.rcpl.internal.config;

import org.eclipse.rcpl.model.IConfig;

/**
 * @author ramin
 * 
 */
public class RcplConfig implements IConfig {

	public static final String MAJOR_VERSION = "1"; //$NON-NLS-1$

	public static final String MINOR_VERSION = "0"; //$NON-NLS-1$

	public static final String PATCH_VERSION = "2 (2)"; //$NON-NLS-1$

	public static final String MAJOR_VERSION_BROWSER = "1"; //$NON-NLS-1$

	public static final String MINOR_VERSION_BROWSER = "0"; //$NON-NLS-1$

	public static final String PATCH_VERSION_BROWSER = "8 (1)"; //$NON-NLS-1$

	public static final String WELCOME_TEXT;

	@Override
	public double getDefaultZoom() {
		return 1.0;
	}

	static {
		WELCOME_TEXT = "welcome_to_joffice";
	}

	public static String OOXML_OFFICE_TITLE;

	static {
		OOXML_OFFICE_TITLE = "RCPL";
		INSTANCE = new RcplConfig();
	}

	public static RcplConfig INSTANCE;

	public static String BUILD_VERSION;

	public static int rulerWidth = 19;

	public static int horizontalRulerWidth = 22;

	public static int rulerDistance = 7;

	public static int rulerAlpha = 80;

	public static int[] rulerColor = new int[] { 255, 255, 200 };

	public static int pageDistance = 50;

	public static int pageShadow = 4;

	public static int pageInfoWidth = 40;

	public static int pageInfoCollapsedWidth = rulerWidth;

	// rulers

	public static int pageInfoDistance = 4;

	public static int pageInfoWidthTotal = pageInfoWidth + 2 * pageInfoDistance;

	public static int pageInfoHeight = 800;

	public static int pageInfoAlpha = 80;

	public static int startY = 10;

	public static int firstPageLocationX = 80;

	public static int firstPageLocationY = 80;

	// page info bar

	public static int colorPaletteWidth = 45;

	public static int colorPaletteDistance = 4;

	public static int[] noDitteringColors = new int[] { 0xFFFFFF, 0xFFFFCC, 0xFFFF99, 0xFFFF66, 0xFFFF33, 0xFFFF00,
			0xCCFFFF, 0xCCFFCC, 0xCCFF99, 0xCCFF66, 0xCCFF33, 0xCCFF00, 0x99FFFF, 0x99FFCC, 0x99FF99, 0x66FFFF,
			0x99FF66, 0x99FF33, 0x66FFCC, 0xFFCCFF, 0x99FF00, 0x33FFFF, 0xFFCCCC, 0x33FFCC, 0x00FFFF, 0x66FF99,
			0xFFCC99, 0x66FF66, 0x66FF33, 0x00FFCC, 0x66FF00, 0x33FF99, 0xFFCC66, 0xFFCC33, 0xCCCCFF, 0x33FF66,
			0x33FF33, 0x00FF99, 0xFFCC00, 0x33FF00, 0x00FF66, 0x00FF33, 0x00FF00, 0xCCCCCC, 0xCCCC99, 0x99CCFF,
			0xCCCC66, 0xCCCC00, 0xCCCC33, 0x99CCCC, 0xFF99FF, 0x99CC99, 0x66CCFF, 0xFF99CC, 0x99CC66, 0x66CCCC,
			0x99CC33, 0x00CCFF, 0x33CCFF, 0x99CC00, 0xFF9999, 0x66CC99, 0xFF9966, 0x66CC66, 0x33CCCC, 0xCC99FF,
			0x00CCCC, 0xFF9933, 0xFF9900, 0x66CC33, 0x66CC00, 0x33CC99, 0x00CC99, 0xCC99CC, 0x33CC66, 0x00CC66,
			0xCC9999, 0xFF66FF, 0x33CC33, 0x33CC00, 0xCC9966, 0x00CC33, 0x9999FF, 0x00CC00, 0xCC9933, 0xCC9900,
			0xFF66CC, 0x9999CC, 0xFF6699, 0x999999, 0x6699FF, 0xFF6666, 0xCC66FF, 0x999966, 0x6699CC, 0x999933,
			0xFFCC33, 0xFF6600, 0xFF33FF, 0x3399FF, 0x999900, 0x669999, 0xCC66CC, 0x0099FF, 0xFF33CC, 0x3399CC,
			0xCC6699, 0x669966, 0xFF00FF, 0x339999, 0x669933, 0x669900, 0xFF3399, 0x0099CC, 0x9966FF, 0xCC6666,
			0x009999, 0xCC6633, 0xCC6600, 0x339966, 0xFF00CC, 0xFF3366, 0x009966, 0xCC33FF, 0xFF3333, 0x339933,
			0x009933, 0x9966CC, 0xFF3300, 0xFF0099, 0x339900, 0x009900, 0x6666FF, 0xCC33CC, 0xFF0066, 0x996699,
			0xFF0033, 0xFF0000, 0xCC00FF, 0xCC3399, 0x996666, 0x6666CC, 0x996633, 0x996600, 0x3366FF, 0xCC3366,
			0xCC00CC, 0x9933FF, 0x0066FF, 0x666699, 0xCC3333, 0xCC3300, 0x3366CC, 0xCC0099, 0x9933CC, 0x666666,
			0x666633, 0x0066CC, 0x9900FF, 0x666600, 0xCC0066, 0x336699, 0x993399, 0xCC0033, 0x6633FF, 0x336666,
			0x006699, 0xCC0000, 0x993366, 0x9900CC, 0x336633, 0x006666, 0x336600, 0x6633CC, 0x3333FF, 0x006633,
			0x993333, 0x993300, 0x6600FF, 0x990099, 0x006600, 0x0033FF, 0x663399, 0x009966, 0x3333CC, 0x663366,
			0x6600CC, 0x990033, 0x0033CC, 0x990000, 0x3300FF, 0x663333, 0x663300, 0x660099, 0x0000FF, 0x333399,
			0x3300CC, 0x003399, 0x333300, 0x660066, 0x333333, 0x003366, 0x0000CC, 0x660033, 0x333300, 0x660000,
			0x330099, 0x003333, 0x003300, 0x000099, 0x330066, 0x330033, 0x000066, 0x330000, 0x000033, 0x000000, };

	private static Object[] themeColors;

	private final static Object[] themeColors2 = new Object[] { new int[] { 255, 255, 255, 0, 0 },
			new int[] { 242, 242, 242, 0, 0 }, new int[] { 216, 216, 216, 0, 0 }, new int[] { 191, 191, 191, 0, 0 },
			new int[] { 165, 165, 165, 0, 0 }, new int[] { 127, 127, 127, 0, 0 },

			new int[] { 0, 0, 0, 0, 0 }, new int[] { 127, 127, 127, 0, 0 }, new int[] { 89, 89, 89, 0, 0 },
			new int[] { 63, 63, 63, 0, 0 }, new int[] { 38, 38, 38, 0, 0 }, new int[] { 12, 12, 12, 0, 0 },

			new int[] { 238, 236, 225, 0, 0 }, new int[] { 221, 217, 195, 0, 0 }, new int[] { 196, 189, 151, 0, 0 },
			new int[] { 147, 137, 83, 0, 0 }, new int[] { 73, 68, 41, 0, 0 }, new int[] { 29, 27, 16, 0, 0 },

			new int[] { 31, 73, 125, 0, 0 }, new int[] { 198, 217, 240, 0, 0 }, new int[] { 141, 179, 226, 0, 0 },
			new int[] { 84, 141, 212, 0, 0 }, new int[] { 23, 54, 93, 0, 0 }, new int[] { 15, 36, 62, 0, 0 },

			new int[] { 79, 129, 189, 0, 0 }, new int[] { 219, 229, 241, 0, 0 }, new int[] { 184, 204, 228, 0, 0 },
			new int[] { 149, 179, 215, 0, 0 }, new int[] { 54, 96, 146, 0, 0 }, new int[] { 36, 64, 97, 0, 0 },

			new int[] { 192, 80, 77, 0, 0 }, new int[] { 242, 220, 219, 0, 0 }, new int[] { 229, 185, 183, 0, 0 },
			new int[] { 217, 150, 148, 0, 0 }, new int[] { 149, 55, 52, 0, 0 }, new int[] { 99, 36, 35, 0, 0 },

			new int[] { 155, 187, 89, 0, 0 }, new int[] { 235, 241, 221, 0, 0 }, new int[] { 215, 227, 188, 0, 0 },
			new int[] { 195, 214, 155, 0, 0 }, new int[] { 118, 146, 60, 0, 0 }, new int[] { 79, 97, 40, 0, 0 },

			new int[] { 128, 100, 162, 0, 0 }, new int[] { 229, 224, 236, 0, 0 }, new int[] { 204, 193, 217, 0, 0 },
			new int[] { 178, 162, 199, 0, 0 }, new int[] { 95, 73, 122, 0, 0 }, new int[] { 63, 49, 81, 0, 0 },

			new int[] { 75, 172, 198, 0, 0 }, new int[] { 219, 238, 243, 0, 0 }, new int[] { 183, 221, 232, 0, 0 },
			new int[] { 146, 205, 220, 0, 0 }, new int[] { 49, 133, 155, 0, 0 }, new int[] { 32, 88, 103, 0, 0 },

			new int[] { 247, 150, 70, 0, 0 }, new int[] { 253, 234, 218, 0, 0 }, new int[] { 251, 213, 181, 0, 0 },
			new int[] { 250, 192, 143, 0, 0 }, new int[] { 227, 108, 9, 0, 0 }, new int[] { 151, 72, 6, 0, 0 }, };

	public static Object[] standardColors = new Object[] { new int[] { 192, 0, 0, 0, 0 }, new int[] { 255, 0, 0, 0, 0 },
			new int[] { 255, 192, 0, 0, 0 }, new int[] { 255, 255, 0, 0, 0 }, new int[] { 146, 208, 80, 0, 0 },
			new int[] { 0, 176, 80, 0, 0 }, new int[] { 0, 176, 240, 0, 0 }, new int[] { 0, 112, 192, 0, 0 },
			new int[] { 0, 32, 96, 0, 0 }, new int[] { 255, 255, 255, 0, 0 },

	};

	private static Object[] editorColors;

	static {

		if (editorColors == null) {
			editorColors = new Object[] {

					new int[] { 220, 220, 220, 0, 0 }, // 1

					new int[] { 160, 160, 160, 0, 0 }, // 2

					new int[] { 90, 90, 90, 0, 0 }, // 3

					new int[] { 55, 55, 55, 0, 0 }, // 4

					new int[] { 20, 20, 20, 0, 0 }, // 5

					// -------------------------------------------

					new int[] { 164, 196, 246, 0, 0 }, // MS Office 6

					new int[] { 67, 149, 209, 0, 0 }, // 7

					new int[] { 153, 217, 234, 0, 0 }, // 8

					new int[] { 122, 204, 200, 0, 0 }, // 9

					new int[] { 199, 178, 153, 0, 0 }, // 10

					// -------------------------------------------

					new int[] { 13, 104, 107, 0, 0 }, // 11

					new int[] { 44, 169, 0, 0, 0 }, // 12

					new int[] { 217, 213, 111, 0, 0 }, // 13

					new int[] { 130, 202, 133, 0, 0 }, // 14

					new int[] { 116, 164, 2, 0, 0 }, // 15

					// -------------------------------------------

					new int[] { 196, 223, 155, 0, 0 }, // 16

					new int[] { 132, 135, 28, 0, 0 }, // 17

					new int[] { 0, 118, 163, 0, 0 },

					new int[] { 255, 244, 104, 0, 0 },

					new int[] { 255, 247, 153, 0, 0 },

					// -------------------------------------------

					new int[] { 255, 194, 14, 0, 0 },

					new int[] { 235, 97, 25, 0, 0 },

					new int[] { 251, 175, 93, 0, 0 },

					new int[] { 229, 115, 0, 0, 0 },

					new int[] { 193, 64, 0, 0, 0 },

					// -------------------------------------------

					new int[] { 158, 107, 82, 0, 0 },

					new int[] { 140, 98, 57, 0, 0 },

					new int[] { 184, 40, 50, 0, 0 },

					new int[] { 216, 81, 113, 0, 0 },

					new int[] { 254, 223, 236, 0, 0 },

					// -------------------------------------------

					new int[] { 86, 63, 127, 0, 0 },

					new int[] { 161, 134, 190, 0, 0 },

					new int[] { 217, 207, 229, 0, 0 },

					new int[] { 70, 70, 70, 0, 0 },

					new int[] { 10, 59, 118, 0, 0 },

			};
		}
	}

	public static int[] preferenceColor_1 = (int[]) editorColors[5];

	// color palette

	public static int[] preferenceColor_2 = (int[]) editorColors[1];

	public static int[] preferenceColor_3 = (int[]) editorColors[15];

	// colors

	// theme colors

	public static int DEFAULT_CELL_WIDTH = 60;

	public static int DEFAULT_CELL_HEIGHT = 20;

	public static int GRID_DISTANCE = 5;

	public static int DEFAULT_HEADER_WIDTH = DEFAULT_CELL_WIDTH - 1;

	public static int DEFAULT_HEADER_HEIGHT = DEFAULT_CELL_HEIGHT - 1;

	public static int[] FONT_SIZES = new int[] { 8, 9, 10, 11, 12, 14, 16, 18, 20, 22, 24, 26, 28, 36, 48, 72 };

	public static double TOOL_BACKGROUND_COLOR_BRIGHTNESS = 0.95;

	public static Object[] getEditorColors() {
		return editorColors;
	}

	/**
	 * @param version
	 * @return
	 */
	public static int getFullVersion(String version) {
		String[] splits = version.split("\\."); //$NON-NLS-1$
		int major = 0;
		int minor = 0;
		int patch = 0;
		int patch2 = 0;
		try {
			major = Integer.valueOf(splits[0]);
		} catch (Exception ex) {
		}
		try {
			minor = Integer.valueOf(splits[1]);
		} catch (Exception ex) {
		}
		try {
			String[] splits2 = splits[2].split(" "); //$NON-NLS-1$
			patch = Integer.valueOf(splits2[0]);
			String p2 = splits2[1];
			p2 = p2.substring(1, p2.length() - 1);
			patch2 = Integer.valueOf(p2);
		} catch (Exception ex) {
		}

		try {
		} catch (Exception ex) {
		}

		return getVersion(major, minor, patch, patch2);
	}

	/**
	 * @return
	 */
	public static int getMajorVersion() {
		return Integer.valueOf(MAJOR_VERSION);
	}

	/**
	 * @return
	 */
	public static int getMinorVersion() {
		return Integer.valueOf(MINOR_VERSION);
	}

	/**
	 * @return
	 */
	public static int getPatchVersion_1() {
		String[] splits = PATCH_VERSION.split(" "); //$NON-NLS-1$
		return Integer.valueOf(splits[0]);
	}

	/**
	 * @return
	 */
	public static int getPatchVersion_2() {
		String[] splits = PATCH_VERSION.split(" "); //$NON-NLS-1$
		String s = splits[1];
		if (s.startsWith("(")) { //$NON-NLS-1$
			s = s.substring(1, s.length());
		}
		if (s.endsWith(")")) { //$NON-NLS-1$
			s = s.substring(0, s.length() - 1);
		}

		return Integer.valueOf(s);
	}

	public static Object[] getThemeColors() {

		if (themeColors == null) {
			themeColors = new Object[noDitteringColors.length + themeColors2.length];
			int index = 0;
			for (; index < noDitteringColors.length; index++) {
				int red = noDitteringColors[index] >> 16 & 0xFF;
				int green = noDitteringColors[index] >> 8 & 0xFF;
				int blue = noDitteringColors[index] & 0xFF;
				themeColors[index] = new int[] { red, green, blue, 0, 0 };
			}
			for (int index2 = 0; index < themeColors.length; index++, index2++) {
				themeColors[index] = themeColors2[index2];
			}
		}

		return themeColors;
	}

	/**
	 * @return
	 */
	public static int getVersion() {
		return getVersion(getMajorVersion(), getMinorVersion(), getPatchVersion_1(), getPatchVersion_2());
	}

	/**
	 * @param major
	 * @param minor
	 * @param patch1
	 * @param patch2
	 * @return
	 */
	public static int getVersion(int major, int minor, int patch1, int patch2) {
		return major * 1000000 + minor * 10000 + patch1 * 100 + patch2;
	}

	/**
	 * @param version
	 * @return
	 */
	public static int getVersion(String version) {
		String[] splits = version.split("\\."); //$NON-NLS-1$
		int major = 0;
		int minor = 0;
		int patch = 0;
		try {
			major = Integer.valueOf(splits[0]);
		} catch (Exception ex) {
		}
		try {
			minor = Integer.valueOf(splits[1]);
		} catch (Exception ex) {
		}
		try {
			String[] splits2 = splits[2].split(" "); //$NON-NLS-1$
			patch = Integer.valueOf(splits2[0]);
		} catch (Exception ex) {
		}
		return getVersion(major, minor, patch, 0);
	}

	/**
	 * @return
	 */
	public static String getVersionString() {
		StringBuffer msg = new StringBuffer();

		msg.append("Version " + RcplConfig.MAJOR_VERSION + "." //$NON-NLS-1$//$NON-NLS-2$
				+ RcplConfig.MINOR_VERSION + "." //$NON-NLS-1$
				+ RcplConfig.PATCH_VERSION);
		if (RcplConfig.BUILD_VERSION != null) {

			String s1 = RcplConfig.BUILD_VERSION;
			if (s1.length() > 2) {
				String s2 = s1.substring(2, s1.length());
				s1 = s1.substring(0, 2);
				msg.append("." + s1 + "." + s2); //$NON-NLS-1$ //$NON-NLS-2$
			} else {
				msg.append("." + RcplConfig.BUILD_VERSION); //$NON-NLS-1$
			}
		}

		return msg.toString();
	}
}
