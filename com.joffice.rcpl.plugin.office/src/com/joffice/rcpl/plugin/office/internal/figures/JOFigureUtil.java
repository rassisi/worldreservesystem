/******************************************************************************
 *    Ramin Assisi
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal.figures;

import javafx.geometry.Rectangle2D;

/**
 * @author Ramin
 * 
 */
public class JOFigureUtil {

	// public static Point getOffset(IFigure figure) {
	//
	// int offsetX = 0;
	// int offsetY = 0;
	//
	// IFigure parent = figure.getParent();
	// while (parent != null) {
	// Rectangle rect = parent.getBounds();
	// offsetX += rect.x;
	// offsetY += rect.y;
	// parent = parent.getParent();
	// }
	//
	// return new Point(offsetX, offsetY);
	//
	// }

	// public static Color officeColor_frame_bright = (Color) JO.colorProvider
	// .get(230, 238, 246).getSwt();
	// public static Color officeColor_frame_dark = (Color)
	// JO.colorProvider.get(
	// 161, 189, 213).getSwt();
	// public static Color officeColor_standard_fg = (Color)
	// JO.colorProvider.get(
	// 109, 106, 182).getSwt();
	// public static Color officeColor_standard_bg = (Color)
	// JO.colorProvider.get(
	// 208, 224, 240).getSwt();
	// public static Color officeColor_standard_bg_dark = (Color)
	// JO.colorProvider
	// .get(230, 238, 246).getSwt();
	// public static Color officeColor_nearly_white = (Color) JO.colorProvider
	// .get(254, 254, 255).getSwt();

	// public static final Color[] shadowColors;

	// static {
	// shadowColors = new Color[8];
	// Color targetColor = officeColor_standard_bg;
	// int targetRed = targetColor.getRed();
	// int targetGreen = targetColor.getGreen();
	// int targetBlue = targetColor.getBlue();
	// int diffR = targetRed / 8;
	// int diffG = targetGreen / 8;
	// int diffB = targetBlue / 8;
	// for (int i = shadowColors.length - 1; i >= 0; i--) {
	// shadowColors[i] = (Color)JO.colorProvider.get(targetRed, targetGreen,
	// targetBlue);
	// // diffR +=2;
	// // diffG +=2;
	// // diffB +=2;
	//
	// targetRed -= diffR;
	// if (targetRed < 0) {
	// targetRed = 0;
	// }
	// targetGreen -= diffG;
	// if (targetGreen < 0) {
	// targetGreen = 0;
	// }
	// targetBlue -= diffB;
	// if (targetBlue < 0) {
	// targetBlue = 0;
	// }
	// }
	// };

	public static boolean isPortrait(Rectangle2D r) {
		return r.getHeight() > r.getWidth();
	}

	public static boolean isLandscape(Rectangle2D r) {
		return !isPortrait(r);
	}

}
