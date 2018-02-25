package org.eclipse.rcpl;

import javafx.scene.paint.Color;

import org.apache.poi.xssf.usermodel.XSSFColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHighlightColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;

public interface IColorProvider {

	Object loadSwt(IColor color);

	public final static String COLOR_MAIN_OFFICE_COLOR = "MAIN_OFFICE_COLOR"; //$NON-NLS-1$

	Color getFx(IColor color);

	IColor get(Color color);

	IColor get(int[] color);

	IColor get(byte[] bytes);

	IColor getFromSwt(Object color);

	IColor getFromSwt(Object color, double brightness);

	IColor get(double red, double green, double blue);

	IColor get(String key, double brightness);

	IColor get(double brightness);

	IColor get(IColor color, double brightness);

	boolean isDark();

	IColor getFgColor();

	public IColor getThemeColor(CTColorMapping colorMapping,
			CTSchemeColor schemeColor);

	public IColor get(CTColorMapping colorMapping,
			CTSolidColorFillProperties fillProperties);

	String colorToHexString(IColor color);

	IColor getToolTipColor();

	public IColor get(CTBackground bg);

	public IColor get(CTHighlight bg);

	public IColor get(CTHslColor ctHslColor);

	public IColor get(CTPresetColor ctPresetColor);

	public IColor get(CTRgbColor ctRgbColor);

	public IColor get(CTScRgbColor ctScrgbColor);

	public IColor get(CTShd bg);

	public IColor get(CTSolidColorFillProperties fill);

	public IColor get(CTSRgbColor ctSrgbColor);

	public IColor get(CTSystemColor ctSystemColor);

	public IColor get(int brightness);

	public IColor get(java.awt.Color awtColor);

	public IColor get(String value);

	public IColor get(String id, float brightness);

	public IColor get(STSystemColorVal.Enum sysColor);

	public IColor get(XSSFColor xSSFColor);

	public IColor getBrightColor(double brightness);

	public IColor getBrightColor(String id, float brightness);

	public IColor getBrighterColor(double brightness);

	public IColor getDefaultShapeColor();

	public STHighlightColor.Enum getHighlightColor(IColor bg);

	public IColor getHighlightColor(int highlightColor);

	public IColor getOutlineColor();

	public IColor getSelectedParagraphColor();

	public IColor getSignalColor();

	public IColor getTextSelectionColorBackground();

	public IColor getTextSelectionColorForground(IColor fg);

	public IColor getThemeColor(CTColorMapping colorMapping,
			STThemeColor.Enum themeColor);

	// ///////////////////////////////////////////////////////////////////
	// /////////////////////// Private From Here /////////////////////////
	// ///////////////////////////////////////////////////////////////////

	/**
	 * @param colorMapping
	 * @param schemeColor
	 * @return
	 */
	public IColor getThemeColor(CTColorSchemeMapping colorMapping,
			STThemeColor themeColor);

	/**
	 * @return
	 */
	public IColor getTransparentColor();;

	byte[] getBytesFromCOLOR(IColor color);

	void createColorScheme(CTColorScheme ctColorScheme);

	IColor getOutlineShadowColor();

	IColor getOutlineTextColor();

	IColor get(
			org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor charStyleCtColor);
}
