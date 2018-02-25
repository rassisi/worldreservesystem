package com.joffice.rcpl.plugin.office.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellFill;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IColorProvider;
import org.eclipse.rcpl.IWorkbookPart;
import org.eclipse.rcpl.RcplColor;
import org.eclipse.rcpl.internal.resources.JOColorProvider;
import org.eclipse.rcpl.util.JOUtil2;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex;
import org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal;
import org.openxmlformats.schemas.drawingml.x2006.main.STSystemColorVal;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHighlightColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;

import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOWorkbookPart;

import javafx.scene.paint.Color;

/**
 * Provides access Color Resources
 */
public final class JOOfficeColorProvider extends JOColorProvider implements IColorProvider {

	public static IColorProvider INSTANCE = new JOColorProvider();

	/**
	 * @author ramin
	 * 
	 */
	public static class BackgroundSettings {
		private Object control;

		private double brightness;

		public BackgroundSettings(Object controlOrFigure, double brightness) {
			this.control = controlOrFigure;
			this.brightness = brightness;
		}

		public double getBrightness() {
			return brightness;
		}

		public Object getControl() {
			return control;
		}
	}

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOColorProvider.class);

	private static HashMap<String, IColor> colorRegistry = null;

	private static int[] INDEXED_COLOORS = {

			0x00000000, // 0
			0x00FFFFFF, // 1
			0x00FF0000, // 2
			0x0000FF00, // 3
			0x000000FF, // 4
			0x00FFFF00, // 5
			0x00FF00FF, // 6
			0x0000FFFF, // 7
			0x00000000, // 8
			0x00FFFFFF, // 9
			0x00FF0000, // 10
			0x0000FF00, // 11
			0x000000FF, // 12
			0x00FFFF00, // 13
			0x00FF00FF, // 14
			0x0000FFFF, // 15
			0x00800000, // 16
			0x00008000, // 17
			0x00000080, // 18
			0x00808000, // 19
			0x00800080, // 20
			0x00008080, // 21
			0x00C0C0C0, // 22
			0x00808080, // 23
			0x009999FF, // 24
			0x00993366, // 25
			0x00FFFFCC, // 26
			0x00CCFFFF, // 27
			0x00660066, // 28
			0x00FF8080, // 29
			0x000066CC, // 30
			0x00CCCCFF, // 31
			0x00000080, // 32
			0x00FF00FF, // 33
			0x00FFFF00, // 34
			0x0000FFFF, // 35
			0x00800080, // 36
			0x00800000, // 37
			0x00008080, // 38
			0x000000FF, // 39
			0x0000CCFF, // 40
			0x00CCFFFF, // 41
			0x00CCFFCC, // 42
			0x00FFFF99, // 43
			0x0099CCFF, // 44
			0x00FF99CC, // 45
			0x00CC99FF, // 46
			0x00FFCC99, // 47
			0x003366FF, // 48
			0x0033CCCC, // 49
			0x0099CC00, // 50
			0x00FFCC00, // 51
			0x00FF9900, // 52
			0x00FF6600, // 53
			0x00666699, // 54
			0x00969696, // 55
			0x00003366, // 56
			0x00339966, // 57
			0x00003300, // 58
			0x00333300, // 59
			0x00993300, // 60
			0x00993366, // 61
			0x00333399, // 62
			0x00333333, // 63
			-1, // System Foreground n/a
			-1, // System Background
	};

	private static List<BackgroundSettings> backgroundSettingList = new ArrayList<BackgroundSettings>();

	public static IColor accent1;

	public static IColor accent2;

	public static IColor accent3;

	public static IColor accent4;

	public static IColor accent5;

	public static IColor accent6;

	public static IColor background1;

	public static IColor background2;

	public static IColor dk2;

	public static IColor folHLink;

	public static IColor hLink;

	public static IColor lt1;

	public static IColor lt2;

	public static IColor textColor1;

	// ---------- spreadsheet colors -------------------------------------------

	public static IColor textColor2;

	public static IColor get(CTColor ctColor) {
		if (ctColor.getSrgbClr() != null) {
			byte[] bytes = ctColor.getSrgbClr().getVal();
			return INSTANCE.get(bytes);
		}
		if (ctColor.getSysClr() != null) {
			// STSystemColorVal.Enum sysColor = ctColor.getSysClr().getVal();
			// if(STSystemColorVal.WINDOW.equals(sysColor)){
			// return Display.getDefault().getSystemColor(SWT.color_)
			// }

			byte[] bytes = ctColor.getSysClr().getLastClr();
			return INSTANCE.get(bytes);
		}
		return IColor.RED;
	}

	/**
	 * Loads the colors
	 */
	public static void loadColors() {
		String colorMainOfficeColor = JOUtil2.getString(COLOR_MAIN_OFFICE_COLOR);
		if (colorMainOfficeColor != null) {
			colorRegistry.put(COLOR_MAIN_OFFICE_COLOR, string2Color(colorMainOfficeColor));
		} else {
			// colorRegistry.put(COLOR_MAIN_OFFICE_COLOR, new JORGB(220, 220,
			// 220));
			colorRegistry.put(COLOR_MAIN_OFFICE_COLOR, new RcplColor(164, 196, 246));

		}
	}

	/**
	 * @param rgbString
	 * @return
	 */
	public static IColor string2Color(String rgbString) {
		try {
			String[] cols = rgbString.split(","); //$NON-NLS-1$
			IColor result = new RcplColor(Integer.valueOf(cols[0].trim()), Integer.valueOf(cols[1].trim()),
					Integer.valueOf(cols[2].trim()));
			return result;
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * @param b
	 * @return
	 */
	private static int toInt(byte b) {
		int result = b;
		if (b < 0) {
			result = (b & 0x7f) + 128;
		}
		return result;
	}

	public IColor getOutlineColor = get(1.1);

	public IColor getOutlineShadowColor = get(0.6);

	public IColor getOutlineTextColor = get(0.3);

	private IColor transparentColor;

	public static IColor dk1;

	/**
	 * @param color
	 * @return
	 */
	@Override
	public String colorToHexString(IColor color) {
		if (color == null) {
			return "000000"; //$NON-NLS-1$
		}
		String hexR = Integer.toHexString((int) color.getRed());
		String hexG = Integer.toHexString((int) color.getGreen());
		String hexB = Integer.toHexString((int) color.getBlue());
		if (hexR.length() == 1) {
			hexR = "0" + hexR; //$NON-NLS-1$
		}
		if (hexG.length() == 1) {
			hexG = "0" + hexG; //$NON-NLS-1$
		}
		if (hexB.length() == 1) {
			hexB = "0" + hexB; //$NON-NLS-1$
		}
		return hexR + hexG + hexB;
	}

	/**
	 * Initializes the {@link ColorRegistry}
	 */
	private void createColorRegistry() {
		colorRegistry = new HashMap<String, IColor>();
		loadColors();
	}

	@Override
	public void createColorScheme(CTColorScheme ctColorScheme) {
		accent1 = get(ctColorScheme.getAccent1());
		accent2 = get(ctColorScheme.getAccent2());
		accent3 = get(ctColorScheme.getAccent3());
		accent4 = get(ctColorScheme.getAccent4());
		accent5 = get(ctColorScheme.getAccent5());
		accent6 = get(ctColorScheme.getAccent6());
		dk1 = get(ctColorScheme.getDk1());
		dk2 = get(ctColorScheme.getDk2());
		folHLink = get(ctColorScheme.getFolHlink());
		hLink = get(ctColorScheme.getHlink());
		lt1 = get(ctColorScheme.getLt1());
		lt2 = get(ctColorScheme.getLt2());
		textColor1 = get(ctColorScheme.getAccent1());
		textColor2 = get(ctColorScheme.getAccent2());
		background1 = get(ctColorScheme.getDk1());
		background2 = get(ctColorScheme.getDk2());
	}

	/**
	 * @param bytes
	 * @return
	 */
	@Override
	public IColor get(byte[] bytes) {

		if (bytes == null) {
			// LOGGER.error("Color Triple wrong");
			return null;
		}
		if (bytes.length == 4) {
			return get(toInt(bytes[bytes.length - 3]), toInt(bytes[bytes.length - 2]), toInt(bytes[bytes.length - 1]));
		}
		if (bytes.length == 3) {
			return get(toInt(bytes[bytes.length - 3]), toInt(bytes[bytes.length - 2]), toInt(bytes[bytes.length - 1]));
		}
		return null;
	}

	/**
	 * @param color
	 * @param brightness
	 * @return
	 */
	@Override
	public IColor get(Color color, double brightness) {
		return get(color, (float) brightness);
	}

	/**
	 * @param bg
	 * @return
	 */
	@Override
	public IColor get(CTBackground bg) {
		Object o = bg.getColor();
		if (o instanceof byte[]) {
			return get((byte[]) o);
		}
		if (bg.getThemeColor() != null) {
			return getThemeColor(null, bg.getThemeColor());
		}
		if (bg.getThemeShade() != null) {
		}

		return null;
	}

	@Override
	public IColor get(CTColorMapping colorMapping, CTSolidColorFillProperties fillProperties) {
		if (fillProperties != null) {
			CTHslColor ctHslColor = fillProperties.getHslClr();
			if (ctHslColor != null) {

			}
			CTPresetColor ctPresetColor = fillProperties.getPrstClr();
			if (ctPresetColor != null) {

			}
			CTSchemeColor ctSchemeColor = fillProperties.getSchemeClr();
			if (ctSchemeColor != null) {
				return getThemeColor(colorMapping, ctSchemeColor);
			}
			CTScRgbColor ctScRgbColor = fillProperties.getScrgbClr();
			if (ctScRgbColor != null) {
				return get(ctScRgbColor);
			}
			CTSRgbColor ctSRgbColor = fillProperties.getSrgbClr();
			if (ctSRgbColor != null) {
				return get(ctSRgbColor);
			}
			CTSystemColor ctSystemColor = fillProperties.getSysClr();
			if (ctSystemColor != null) {
				return get(ctSystemColor);
			}
		}
		return null;
	}

	@Override
	public IColor get(CTHighlight bg) {
		if (bg != null) {
			STHighlightColor.Enum en = bg.getVal();
			if (en.equals(STHighlightColor.BLACK)) {
				return IColor.BLACK;
			} else if (en.equals(STHighlightColor.WHITE)) {
				return IColor.WHITE;
			} else if (en.equals(STHighlightColor.RED)) {
				return IColor.RED;
			} else if (en.equals(STHighlightColor.BLUE)) {
				return IColor.BLUE;
			} else if (en.equals(STHighlightColor.YELLOW)) {
				return IColor.YELLOW;
			} else if (en.equals(STHighlightColor.DARK_RED)) {
				return get(139, 0, 0);
			} else if (en.equals(STHighlightColor.GREEN)) {
				return IColor.GREEN;
			} else if (en.equals(STHighlightColor.DARK_BLUE)) {
				return IColor.DARK_BLUE;
			} else if (en.equals(STHighlightColor.DARK_YELLOW)) {
				return get(Color.DARKSLATEGRAY);
			} else if (en.equals(STHighlightColor.DARK_GREEN)) {
				return get(javafx.scene.paint.Color.DARKGREEN);
			} else if (en.equals(STHighlightColor.CYAN)) {
				return get(Color.CYAN);
			} else if (en.equals(STHighlightColor.DARK_CYAN)) {
				return get(Color.DARKCYAN);
			} else if (en.equals(STHighlightColor.DARK_GRAY)) {
				return get(Color.DARKGREY);
			} else if (en.equals(STHighlightColor.DARK_MAGENTA)) {
				return get(Color.DARKMAGENTA);
			} else if (en.equals(STHighlightColor.DARK_RED)) {
				return get(Color.DARKRED);
			} else if (en.equals(STHighlightColor.DARK_YELLOW)) {
				return get(Color.DARKGOLDENROD);
			} else if (en.equals(STHighlightColor.LIGHT_GRAY)) {
				return get(Color.LIGHTGRAY);
			} else if (en.equals(STHighlightColor.MAGENTA)) {
				return get(Color.MAGENTA);
			}
		}
		return null;
	}

	@Override
	public IColor get(CTHslColor ctHslColor) {
		if (ctHslColor == null) {
			return null;
		}
		// TODO:
		// ctHslColor.get

		return get(100, 100, 100);
	}

	@Override
	public IColor get(CTPresetColor ctPresetColor) {
		if (ctPresetColor == null) {
			return null;
		}
		// TODO:
		// ctHslColor.get

		return get(100, 100, 100);
	}

	/**
	 * @param ctRgbColor
	 * @return
	 */
	@Override
	public IColor get(CTRgbColor ctRgbColor) {
		byte[] bytes = ctRgbColor.getRgb();
		return get(bytes);
	}

	/**
	 * @param ctScrgbColor
	 * @return
	 */
	@Override
	public IColor get(CTScRgbColor ctScrgbColor) {
		if (ctScrgbColor == null) {
			return null;
		}
		int r = ctScrgbColor.getR();
		int g = ctScrgbColor.getG();
		int b = ctScrgbColor.getB();

		return get(r, g, b);
	}

	/**
	 * @param bg
	 * @return
	 */
	@Override
	public IColor get(CTShd bg) {
		if (bg == null) {
			return null;
		}
		STShd.Enum val = bg.getVal();

		// Object color = bg.get();

		Object fill = bg.getFill();

		if (fill instanceof byte[]) {
			return get((byte[]) fill);
		}

		STThemeColor.Enum themeColor = bg.getThemeColor();
		if (themeColor != null) {
			return getThemeColor(null, themeColor);
		}
		STThemeColor.Enum themeFill = bg.getThemeFill();
		if (themeFill != null) {
			return getThemeColor(null, themeFill);
		}

		// byte[] themeFillShade = bg.getThemeFillShade();
		// byte[] themeFillTint = bg.getThemeFillTint();
		// byte[] themeShade = bg.getThemeShade();
		// byte[] themeTint = bg.getThemeTint();

		if (val.equals(STShd.CLEAR)) {

		}

		return null;
	}

	@Override
	public IColor get(CTSolidColorFillProperties fill) {
		IColor c = get(fill.getScrgbClr());
		if (c != null) {
			return c;
		}
		c = get(fill.getSrgbClr());
		if (c != null) {
			return c;
		}
		c = get(fill.getSysClr());
		if (c != null) {
			return c;
		}
		c = get(fill.getHslClr());
		if (c != null) {
			return c;
		}
		c = get(fill.getPrstClr());
		if (c != null) {
			return c;
		}
		c = getThemeColor(null, fill.getSchemeClr());
		if (c != null) {
			return c;
		}
		return null;
	}

	/**
	 * @param ctSrgbColor
	 * @return
	 */
	@Override
	public IColor get(CTSRgbColor ctSrgbColor) {
		if (ctSrgbColor == null) {
			return null;
		}
		byte[] bytes = ctSrgbColor.getVal();
		return get(bytes);
	}

	@Override
	public IColor get(CTSystemColor ctSystemColor) {
		if (ctSystemColor == null) {
			return null;
		}
		STSystemColorVal.Enum sysColor = ctSystemColor.getVal();

		// Color c;
		// if (sysColor.equals(STSystemColorVal.ACTIVE_BORDER)) {
		// c = Display.getDefault().getSystemColor(
		// SWT.COLOR_TITLE_INACTIVE_BACKGROUND);
		// } else if (sysColor.equals(STSystemColorVal.ACTIVE_CAPTION)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.APP_WORKSPACE)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.BACKGROUND)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.BTN_FACE)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.BTN_HIGHLIGHT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.BTN_SHADOW)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.BTN_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.CAPTION_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.GRADIENT_ACTIVE_CAPTION))
		// {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if
		// (sysColor.equals(STSystemColorVal.GRADIENT_INACTIVE_CAPTION)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.GRAY_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.HIGHLIGHT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.HIGHLIGHT_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.HOT_LIGHT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.INACTIVE_BORDER)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.INACTIVE_CAPTION)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.INACTIVE_CAPTION_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.INFO_BK)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.INFO_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.MENU)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.MENU_BAR)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.MENU_HIGHLIGHT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.MENU_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.SCROLL_BAR)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.WINDOW)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.WINDOW_FRAME)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.WINDOW_TEXT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.X_3_D_DK_SHADOW)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else if (sysColor.equals(STSystemColorVal.X_3_D_LIGHT)) {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		// } else {
		// c = Display.getDefault().getSystemColor(SWT.COLOR_RED);
		// }
		// return getFromSwt(c);

		return IColor.RED;
	}

	@Override
	public IColor get(double brightness) {
		return get(COLOR_MAIN_OFFICE_COLOR, (float) brightness);
	}

	/**
	 * @param r
	 * @param g
	 * @param b
	 * @return the {@link Color}
	 */
	@Override
	public IColor get(double r, double g, double b) {
		if (colorRegistry == null) {
			createColorRegistry();
		}
		String symbolicName = "" + r + g + b;
		IColor color = colorRegistry.get(symbolicName);
		if (color == null) {
			colorRegistry.put(symbolicName, new RcplColor(r, g, b));
			return colorRegistry.get(symbolicName);
		}
		return color;
	}

	@Override
	public IColor get(float brightness) {

		return get(COLOR_MAIN_OFFICE_COLOR, brightness);
	}

	@Override
	public IColor get(IColor color, double brightness) {
		String symbolicName = "" + color.hashCode() + brightness;
		IColor color2 = colorRegistry.get(symbolicName);
		if (color2 == null) {
			colorRegistry.put(symbolicName, transformRGB(color, brightness));
			return colorRegistry.get(symbolicName);
		}
		return color2;
	}

	@Override
	public IColor get(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor charStyleCtColor) {
		if (charStyleCtColor != null) {
			Object val = charStyleCtColor.getVal();
			if (val instanceof byte[]) {
				byte[] b = (byte[]) val;
				return get(b);
			}
		}
		return null;
	}

	@Override
	public IColor get(int brightness) {
		return get(COLOR_MAIN_OFFICE_COLOR, brightness);
	}

	@Override
	public IColor get(int[] bytes) {
		if (bytes == null || bytes.length != 3) {
			// LOGGER.error("Color Triple wrong");
			return null;
		}
		return get(bytes[0], bytes[1], bytes[2]);
	}

	/**
	 * @param awtColor
	 * @return
	 */
	@Override
	public IColor get(java.awt.Color awtColor) {
		IColor result = get(awtColor.getRed(), awtColor.getGreen(), awtColor.getBlue());
		return result;
	}

	@Override
	public IColor get(javafx.scene.paint.Color fxColor) {
		return new RcplColor(fxColor);
	}

	/**
	 * @param workbook
	 * @param ctColor
	 * @return
	 */
	public IColor get(IWorkbookPart workbook, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor ctColor) {
		if (ctColor != null) {
			double brightness = 1;
			if (ctColor.isSetTint()) {
				double tInt = ctColor.getTint();
				tInt /= 2;
				brightness += tInt;
			}
			IColor c = null;
			byte[] bytes = ctColor.getRgb();
			if (bytes != null) {
				c = get(bytes);
			} else if (ctColor.isSetTheme()) {
				int themeIndex = (int) ctColor.getTheme();
				c = getThemeColorFromStyleDocument(workbook, themeIndex);
			} else if (ctColor.isSetIndexed()) {
				int indexed = (int) ctColor.getIndexed();
				c = getIndexedColor(workbook, indexed, true);
			}
			if (brightness != 1) {
				c = get(c, (float) brightness);
			}
			return c;
		}
		return null;
	}

	/**
	 * @param xSSFColor
	 * @return
	 */
	public IColor get(IWorkbookPart workbook, XSSFColor xSSFColor, boolean background) {
		try {

			xSSFColor.getCTColor();

			double tInt = xSSFColor.getTint();

			if (xSSFColor.getRgb() != null) {
				return get(xSSFColor.getRgb());
			}
			if (xSSFColor.getCTColor() != null) {
				// try {
				// if (xSSFColor.getRgbWithTint() != null) {
				// System. out.);
				// }
				// } catch (Exception ex) {
				// // LOGGER.error("", ex); //$NON-NLS-1$
				// }

			}
			if (xSSFColor.getARGBHex() != null) {
				// System. out.();
			}

			int index = xSSFColor.getIndexed();

			IColor c = getIndexedColor(workbook, index, background);
			if (tInt != 0) {
				// System. out.();

			}
			return c;
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
			return IColor.RED;
		}

	}

	/**
	 * Retrieve a Color instance for a specific id from the
	 * {@link ColorRegistry}. The first call to this method will initialize the
	 * ColorRegstry.
	 * 
	 * @param id
	 *            id of the font to be retrieved. Preferably use constants from
	 *            ColorProvider.
	 * @return the {@link Color} instance for the provided id.
	 */
	@Override
	public IColor get(String value) {

		if (value == null) {
			return null;
		}
		try {
			if (colorRegistry == null) {
				createColorRegistry();
			}
			if (value.startsWith("#")) { //$NON-NLS-1$
				int red = Integer.parseInt(value.substring(1, 3), 16);
				int green = Integer.parseInt(value.substring(3, 5), 16);
				int blue = Integer.parseInt(value.substring(5, 7), 16);
				return get(red, green, blue);
			} else if (value.toLowerCase().startsWith("white")) { //$NON-NLS-1$
				return IColor.WHITE;
			} else if (value.toLowerCase().startsWith("lightGray")) { //$NON-NLS-1$
				return IColor.LIGHT_GRAY;
			} else if (value.toLowerCase().startsWith("gray")) { //$NON-NLS-1$
				return IColor.GRAY;
			} else if (value.toLowerCase().startsWith("darkGray")) { //$NON-NLS-1$
				return IColor.GRAY;
			} else if (value.toLowerCase().startsWith("black")) { //$NON-NLS-1$
				return IColor.BLACK;
			} else if (value.toLowerCase().startsWith("red")) { //$NON-NLS-1$
				return IColor.RED;
			} else if (value.toLowerCase().startsWith("orange")) { //$NON-NLS-1$
				return IColor.ORANGE;
			} else if (value.toLowerCase().startsWith("yellow")) { //$NON-NLS-1$
				return IColor.YELLOW;
			} else if (value.toLowerCase().startsWith("green")) { //$NON-NLS-1$
				return IColor.GREEN;
			} else if (value.toLowerCase().startsWith("lightGreen")) { //$NON-NLS-1$
				return IColor.LIGHT_GRAY;
			} else if (value.toLowerCase().startsWith("darkGreen")) { //$NON-NLS-1$
				return IColor.GREEN;
			} else if (value.toLowerCase().startsWith("cyan")) { //$NON-NLS-1$
				return IColor.CYAN;
			} else if (value.toLowerCase().startsWith("lightBlue")) { //$NON-NLS-1$
				return IColor.LIGHT_GRAY;
			} else if (value.toLowerCase().startsWith("blue")) { //$NON-NLS-1$
				return IColor.BLUE;
			} else if (value.toLowerCase().startsWith("darkBlue")) { //$NON-NLS-1$
				return IColor.DARK_BLUE;
			} else {
				return colorRegistry.get(value);
			}
		} catch (Exception ex) {
			return IColor.RED;
		}
	}

	@Override
	public IColor get(String key, double brightness) {
		return null;
	}

	/**
	 * @param id
	 * @param brightness
	 * @return
	 */
	@Override
	public IColor get(String id, float brightness) {
		IColor result = null;
		if (brightness == 1.0) {
			result = get(id);
		} else {
			String newId = id + brightness;
			result = get(newId);
			if (result == null) {
				IColor cOriginal = get(id);
				if (cOriginal != null) {
					IColor rgb = transformRGB(cOriginal, brightness);
					colorRegistry.put(newId, rgb);
					result = colorRegistry.get(newId);
				}
			}
		}
		return result;
	}

	@Override
	public IColor get(STSystemColorVal.Enum sysColor) {

		String s = sysColor.toString();

		if (s.equals("windowText")) { //$NON-NLS-1$
			return get(200, 200, 200);
		}
		int sysCol = sysColor.intValue();
		// try {
		// return getFromSwt(Display.getDefault().getSystemColor(sysCol));
		// } catch (Exception ex) {
		// return IColor.RED;
		// }

		return IColor.RED;

	}

	// public IColor getThemeColor(STThemeColor.Enum themeColor) {
	// return getThemeColor(null, themeColor);
	// }

	@Override
	public IColor get(XSSFColor xSSFColor) {
		return get(xSSFColor.getRgb());
	}

	@Override
	public IColor getBrightColor(double brightness) {
		return getBrightColor(COLOR_MAIN_OFFICE_COLOR, (float) brightness);
	}

	@Override
	public IColor getBrightColor(String id, float brightness) {
		IColor result = null;
		if (brightness == 1.0) {
			result = get(id + "bright"); //$NON-NLS-1$
		} else {
			String newId = id + brightness + "bright"; //$NON-NLS-1$
			result = get(newId);
			if (result == null) {
				IColor cOriginal = get(id);
				if (cOriginal != null) {
					IColor rgb = transformRGB(cOriginal, brightness);

					double red = 0;
					double green = 0;
					double blue = 0;
					if (rgb.getBlue() > 0) {
						blue = 255 / rgb.getBlue() * rgb.getBlue();
					}
					if (rgb.getGreen() > 0) {
						green = 255 / rgb.getGreen() * rgb.getGreen();
					}
					if (rgb.getRed() > 0) {
						red = 255 / rgb.getRed() * rgb.getRed();
					}
					colorRegistry.put(newId, new RcplColor(red, green, blue));
					result = colorRegistry.get(newId);
				}
			}
		}
		return result;
	}

	/**
	 * @param brightness
	 *            makes the color brighter when its too dark
	 * @return
	 */
	@Override
	public IColor getBrighterColor(double brightness) {
		IColor c = get(brightness);
		// if (isDark()) {
		// javafx.scene.paint.Color col = c.getFx().brighter();
		// return get(col);
		// }
		return c;
	}

	@Override
	public byte[] getBytesFromCOLOR(IColor color) {
		byte[] result = new byte[3];
		result[0] = (byte) color.getRed();
		result[1] = (byte) color.getGreen();
		result[2] = (byte) color.getBlue();
		return result;
	}

	@Override
	public IColor getDefaultShapeColor() {
		return get(108, 174, 255);
	}

	@Override
	public IColor getFgColor() {
		// if (isDark()) {
		// return ColorConstants.white;
		// }
		return get(0.3);
	}

	/**
	 * @param workbook
	 * @param ctFill
	 * @param index
	 * @return
	 */
	public IColor[] getFillColors(IWorkbookPart workbook, CTFill ctFill, int index) {
		IColor[] fillColors = new IColor[2];
		try {
			CTPatternFill ctPatternFill = ctFill.getPatternFill();
			fillColors[0] = get(workbook, ctPatternFill.getFgColor());

			if (fillColors[0] == null) {
				switch (index) {
				case 0:
					fillColors[0] = IColor.BLUE;
					break;
				default:
					fillColors[0] = IColor.BLACK;
					break;

				}
			}

			fillColors[1] = get(workbook, ctPatternFill.getBgColor());
			if (fillColors[1] == null) {
				switch (index) {
				case 0:
					fillColors[1] = IColor.GREEN;
					break;
				default:
					fillColors[1] = IColor.ORANGE;
					break;

				}
			}

			return fillColors;
		} catch (Exception ex) {
			return fillColors;
		}

	}

	@Override
	public IColor getFromSwt(Object color) {
		Color c = (Color) color;
		return new RcplColor(c);
	}

	@Override
	public IColor getFromSwt(Object color, double brightness) {
		return get(getFromSwt(color), brightness);
	}

	@Override
	public javafx.scene.paint.Color getFx(IColor color) {
		return new javafx.scene.paint.Color(color.getRed(), color.getGreen(), color.getBlue(), color.getOpacity());
	}

	@Override
	public STHighlightColor.Enum getHighlightColor(IColor bg) {
		if (bg != null) {
			if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.WHITE)) {
				return STHighlightColor.WHITE;
			} else if (bg.equals(IColor.RED)) {
				return STHighlightColor.RED;
			} else if (bg.equals(IColor.BLUE)) {
				return STHighlightColor.BLUE;
			} else if (bg.equals(IColor.YELLOW)) {
				return STHighlightColor.YELLOW;
			} else if (bg.equals(get(139, 0, 0))) {
				return STHighlightColor.CYAN;
			} else if (bg.equals(IColor.CYAN)) {
				return STHighlightColor.GREEN;
			} else if (bg.equals(IColor.DARK_BLUE)) {
				return STHighlightColor.DARK_BLUE;
			} else if (bg.equals(get(255, 209, 42))) {
				return STHighlightColor.DARK_BLUE;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			} else if (bg.equals(IColor.BLACK)) {
				return STHighlightColor.BLACK;
			}
		}
		return null;
	}

	/**
	 * @param highlightColor
	 * @return
	 */
	@Override
	public IColor getHighlightColor(int highlightColor) {
		switch (highlightColor) {
		case STHighlightColor.INT_BLACK:
			return IColor.BLACK;
		case STHighlightColor.INT_BLUE:
			return IColor.BLUE;
		case STHighlightColor.INT_CYAN:
			return IColor.CYAN;
		case STHighlightColor.INT_DARK_BLUE:
			return IColor.DARK_BLUE;
		case STHighlightColor.INT_DARK_CYAN:
			return IColor.RED;
		case STHighlightColor.INT_DARK_GRAY:
			return IColor.RED;
		case STHighlightColor.INT_DARK_GREEN:
			return IColor.GREEN;
		case STHighlightColor.INT_DARK_MAGENTA:
			return IColor.RED;
		case STHighlightColor.INT_DARK_RED:
			return IColor.RED;
		case STHighlightColor.INT_DARK_YELLOW:
			return IColor.RED;
		case STHighlightColor.INT_GREEN:
			return IColor.GREEN;
		case STHighlightColor.INT_LIGHT_GRAY:
			return IColor.LIGHT_GRAY;
		case STHighlightColor.INT_MAGENTA:
			return IColor.RED;
		case STHighlightColor.INT_NONE:
			return IColor.RED;
		case STHighlightColor.INT_RED:
			return IColor.RED;
		case STHighlightColor.INT_WHITE:
			return IColor.WHITE;
		case STHighlightColor.INT_YELLOW:
			return IColor.YELLOW;
		default:
			return IColor.WHITE;
		}
	}

	/**
	 * @param doc
	 * @param index
	 * @return
	 */
	public IColor getIndexedColor(IWorkbookPart workbook, int index, boolean background) {

		if (index == 64) {
			if (background) {
				return get(230, 230, 230);
			}
			return IColor.BLACK;
		}

		IColor c = getIndexedColorFromStylesDocument(workbook, index);

		if (c != null) {
			return c;
		}

		// if (!background) {
		// return ColorConstants.black;
		// }

		// System. out.("index=" + index);

		IndexedColors[] indexedColors = IndexedColors.values();
		for (IndexedColors indexedColor : indexedColors) {

			if (indexedColor.getIndex() == (index)) {

				switch (index) {
				case 8:
				case 15:
				case 26:
				case 9:
				case 17:
				case 58:
				case 42:
				case 62:
				case 54:
					break;
				default:

				}
				switch (indexedColor) {
				case BLACK:
					return IColor.BLACK;
				case WHITE:
					return IColor.WHITE;
				case RED:
					return IColor.RED;
				case BRIGHT_GREEN:
					return get(102, 255, 0);
				case BLUE:
					return IColor.BLUE;
				case YELLOW:
					return IColor.YELLOW;
				case PINK:
					return get(255, 192, 203);
				case TURQUOISE:
					return get(48, 213, 200);
				case DARK_RED:
					return get(139, 0, 0);
				case GREEN:
					return IColor.GREEN;
				case DARK_BLUE:
					return IColor.DARK_BLUE;
				case DARK_YELLOW:
					return get(255, 209, 42);
				case VIOLET:
					return get(143, 0, 255);
				case TEAL:
					return get(0, 128, 128);
				case GREY_25_PERCENT:
					return get(190, 190, 190);
				case GREY_50_PERCENT:
					return get(128, 128, 128);
				case CORNFLOWER_BLUE:
					return get(100, 149, 237);
				case MAROON:
					return get(128, 0, 0);
				case LEMON_CHIFFON:
					return get(255, 250, 205);
				case ORCHID:
					return get(218, 112, 214);
				case CORAL:
					return get(255, 127, 80);
				case ROYAL_BLUE:
					return get(65, 105, 225);
				case LIGHT_CORNFLOWER_BLUE:
					return get(154, 206, 236);
				case SKY_BLUE:
					return get(135, 206, 235);
				case LIGHT_TURQUOISE:
					return get(0, 255, 239);
				case LIGHT_GREEN:
					return IColor.BLACK;
				case LIGHT_YELLOW:
					return get(255, 255, 224);
				case PALE_BLUE:
					return get(175, 238, 238);
				case ROSE:
					return get(255, 0, 127);
				case LAVENDER:
					return get(230, 230, 250);
				case TAN:
					return get(210, 180, 140);
				case LIGHT_BLUE:
					return getFromSwt(IColor.BLACK);
				case AQUA:
					return get(0, 255, 255);
				case LIME:
					return get(191, 255, 0);
				case GOLD:
					return get(212, 175, 55);
				case LIGHT_ORANGE:
					return get(255, 204, 153);
				case ORANGE:
					return getFromSwt(IColor.BLACK);
				case BLUE_GREY:
					return get(102, 153, 204);
				case GREY_40_PERCENT:
					return get(150, 150, 150);
				case DARK_TEAL:
					return get(0, 90, 90);
				case SEA_GREEN:
					return get(46, 139, 87);
				case DARK_GREEN:
					return getFromSwt(IColor.BLACK);
				case OLIVE_GREEN:
					return get(128, 128, 0);
				case BROWN:
					return get(150, 75, 0);
				case PLUM:
					return get(142, 69, 133);
				case INDIGO:
					return get(0, 65, 106);
				case GREY_80_PERCENT:
					return get(45, 45, 45);
				case AUTOMATIC:
					if (background) {
						return get(230, 230, 230);
					}
					return IColor.BLACK;
				}

			}

			// Hashtable<Integer, HSSFColor> ct = HSSFColor.getIndexHash();

			// Object o = ct.get(index);
			// if (o instanceof HSSFColor) {
			// index++;
			// HSSFColor hSSFColor = (HSSFColor) o;
			// String s = hSSFColor.getHexString();
			// short[] triplet = hSSFColor.getTriplet();
			// return get(triplet[0], triplet[1], triplet[2]);
			// }
		}

		// return Display.getDefault().getSystemColor(index);

		if (!background) {
			return IColor.BLACK;
		}

		switch (index) {
		case 27:
			return get(214, 244, 217);
		}
		if (background) {
			return IColor.WHITE;
		}

		if (index == 64) {
			// system foreground
			return IColor.BLACK;
		} else if (index == 65) {
			// system background
			return IColor.WHITE;
		} else if (index < 65) {
			// System. out.("c index = " + index);
			// if (index == 54) {
			// System. out.();
			// }
			int cv = INDEXED_COLOORS[index];
			int r = (cv & 0xff0000) >> 16;
			int g = (cv & 0x00ff00) >> 8;
			int b = (cv & 0xff);
			return get(r, g, b);
		} else {
			return IColor.RED;
		}

		// ThemesTable themesTable =
		// doc.getWorkbook().getPoiWorkbook().getTheme();
		// XSSFColor xSSFColor = themesTable.getThemeColor(index);
		// if (xSSFColor == null) {
		// return ColorConstants.lightGray;
		// }
		// return get(doc, xSSFColor);
	}

	/**
	 * @param stylesTable
	 * @param index
	 * @return
	 */
	public IColor getIndexedColorFromStylesDocument(IWorkbookPart workbook, int index) {
		try {
			StylesTable stylesTable = ((JOWorkbookPart) workbook).getStylesTable();
			if (stylesTable.getCTStylesheet().getColors() != null) {
				CTIndexedColors ctIndexedColors = stylesTable.getCTStylesheet().getColors().getIndexedColors();
				CTRgbColor ctRgbColor = ctIndexedColors.getRgbColorArray(index);
				IColor c = get(ctRgbColor);
				return c;
			}
		} catch (Exception ex) {
			return null;
		}
		return null;
	}

	@Override
	public IColor getOutlineColor() {
		return get(1);
	}

	@Override
	public IColor getOutlineShadowColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getOutlineTextColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getSelectedParagraphColor() {
		return IColor.ORANGE;
	}

	@Override
	public IColor getSignalColor() {
		return IColor.ORANGE;
	}

	/**
	 * @param workbook
	 * @param index
	 * @return
	 */
	/**
	 * @param workbook
	 * @param index
	 * @return
	 */
	public IColor[] getStyleFillColors(IWorkbookPart workbook, int index) {
		IColor[] fillColors = new IColor[2];
		try {
			StylesTable stylesTable = ((JOWorkbookPart) workbook).getStylesTable();
			XSSFCellFill xSSFCellFill = stylesTable.getFillAt(index);
			XSSFColor bg = xSSFCellFill.getFillBackgroundColor();
			XSSFColor fg = xSSFCellFill.getFillBackgroundColor();

			if (bg != null) {
				// System. out.();
			}
			CTFill ctFill = xSSFCellFill.getCTFill();
			return getFillColors(workbook, ctFill, index);
		} catch (Exception ex) {
			return fillColors;
		}
	}

	@Override
	public IColor getTextSelectionColorBackground() {
		return get(1.1);
	}

	// ///////////////////////////////////////////////////////////////////
	// /////////////////////// Private From Here /////////////////////////
	// ///////////////////////////////////////////////////////////////////

	@Override
	public IColor getTextSelectionColorForground(IColor fg) {
		if (isDark(fg)) {
			return IColor.WHITE;
		}
		return fg;
	}

	@Override
	public IColor getThemeColor(CTColorMapping colorMapping, CTSchemeColor schemeColor) {

		if (schemeColor == null) {
			return null;
		}
		// if(schemeColor.equals(CTSchemeColor.))
		STSchemeColorVal.Enum en = schemeColor.getVal();

		if (en.equals(STSchemeColorVal.ACCENT_1)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent1;
		} else if (en.equals(STSchemeColorVal.ACCENT_2)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent2;
		} else if (en.equals(STSchemeColorVal.ACCENT_3)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent3();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent3;
		} else if (en.equals(STSchemeColorVal.ACCENT_4)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent4();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent4;
		} else if (en.equals(STSchemeColorVal.ACCENT_5)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent5();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent5;
		} else if (en.equals(STSchemeColorVal.ACCENT_6)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent6();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent6;
		} else if (en.equals(STSchemeColorVal.BG_1)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getBg1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return background1;
		} else if (en.equals(STSchemeColorVal.BG_2)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getBg2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return background2;
		} else if (en.equals(STSchemeColorVal.DK_1)) {
			return dk1;
		} else if (en.equals(STSchemeColorVal.DK_2)) {
			return dk2;
		} else if (en.equals(STSchemeColorVal.HLINK)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getHlink();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return hLink;
		} else if (en.equals(STSchemeColorVal.FOL_HLINK)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getFolHlink();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return folHLink;
		} else if (en.equals(STSchemeColorVal.LT_1)) {
			return lt1;
		} else if (en.equals(STSchemeColorVal.LT_2)) {
			return lt2;
		} else if (en.equals(STSchemeColorVal.PH_CLR)) {
			return new RcplColor(255, 0, 0);
		} else if (en.equals(STSchemeColorVal.TX_1)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getTx1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return textColor1;
		} else if (en.equals(STSchemeColorVal.TX_2)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getTx2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return textColor2;
		}
		return null;

	}

	@Override
	public IColor getThemeColor(CTColorMapping colorMapping, STThemeColor.Enum themeColor) {
		if (themeColor.equals(STThemeColor.ACCENT_1)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent1;
		}
		if (themeColor.equals(STThemeColor.ACCENT_2)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent2;
		}
		if (themeColor.equals(STThemeColor.ACCENT_3)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent3();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent3;
		}
		if (themeColor.equals(STThemeColor.ACCENT_4)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent4();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent4;
		}
		if (themeColor.equals(STThemeColor.ACCENT_5)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent5();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent5;
		}
		if (themeColor.equals(STThemeColor.ACCENT_6)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getAccent6();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent6;
		}
		if (themeColor.equals(STThemeColor.BACKGROUND_1)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getBg1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return background1;
		}
		if (themeColor.equals(STThemeColor.BACKGROUND_2)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getBg2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return background2;
		}
		if (themeColor.equals(STThemeColor.FOLLOWED_HYPERLINK)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getFolHlink();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return folHLink;
		}
		if (themeColor.equals(STThemeColor.HYPERLINK)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getHlink();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return hLink;
		}
		if (themeColor.equals(STThemeColor.LIGHT_1)) {
			return lt1;
		}
		if (themeColor.equals(STThemeColor.LIGHT_2)) {
			return lt2;
		}
		if (themeColor.equals(STThemeColor.DARK_1)) {
			return dk1;
		}
		if (themeColor.equals(STThemeColor.DARK_2)) {
			return dk2;
		}
		if (themeColor.equals(STThemeColor.TEXT_1)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getTx1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return textColor1;
		}
		if (themeColor.equals(STThemeColor.TEXT_2)) {
			if (colorMapping != null) {
				STColorSchemeIndex.Enum stSchemeIndex = colorMapping.getTx2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return textColor2;
		}
		return IColor.GRAY;
	}

	/**
	 * @param colorMapping
	 * @param schemeColor
	 * @return
	 */
	@Override
	public IColor getThemeColor(CTColorSchemeMapping colorMapping, STThemeColor themeColor) {

		if (themeColor == null) {
			return null;
		}
		org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum stSchemeIndex;

		if (themeColor.enumValue().equals(STThemeColor.ACCENT_1)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getAccent1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent1;
		} else if (themeColor.enumValue().equals(STThemeColor.ACCENT_2)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getAccent2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent2;
		} else if (themeColor.enumValue().equals(STThemeColor.ACCENT_3)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getAccent3();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent3;
		} else if (themeColor.enumValue().equals(STThemeColor.ACCENT_4)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getAccent4();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent4;
		} else if (themeColor.enumValue().equals(STThemeColor.ACCENT_5)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getAccent5();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent5;
		} else if (themeColor.enumValue().equals(STThemeColor.ACCENT_6)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getAccent6();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return accent6;
		} else if (themeColor.enumValue().equals(STThemeColor.BACKGROUND_1)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getBg1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return background1;
		} else if (themeColor.enumValue().equals(STThemeColor.BACKGROUND_2)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getBg2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return background2;
		} else if (themeColor.enumValue().equals(STThemeColor.DARK_1)) {
			return dk1;
		} else if (themeColor.enumValue().equals(STThemeColor.DARK_2)) {
			return dk2;
		} else if (themeColor.enumValue().equals(STThemeColor.HYPERLINK)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getHyperlink();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return hLink;
		} else if (themeColor.enumValue().equals(STThemeColor.FOLLOWED_HYPERLINK)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getFollowedHyperlink();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return folHLink;
		} else if (themeColor.enumValue().equals(STThemeColor.LIGHT_1)) {
			return lt1;
		} else if (themeColor.enumValue().equals(STThemeColor.LIGHT_2)) {
			return lt2;
		} else if (themeColor.enumValue().equals(STThemeColor.TEXT_1)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getT1();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return textColor1;
		} else if (themeColor.enumValue().equals(STThemeColor.TEXT_2)) {
			if (colorMapping != null) {
				stSchemeIndex = colorMapping.getT2();
				IColor c = schemeIndexToChemeColor(stSchemeIndex);
				if (c != null) {
					return c;
				}
			}
			return textColor2;
		}
		return IColor.RED;

	}

	/**
	 * @param workbook
	 * @param index
	 * @return
	 */
	public IColor getThemeColorFromStyleDocument(IWorkbookPart workbook, int index) {
		ThemesTable themesTable = ((JOWorkbookPart) workbook).getThemesTable();
		if (themesTable != null) {
			try {
				XSSFColor themeColor = themesTable.getThemeColor(index);
				// org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor
				// ctColor = themeColor
				// .getCTColor();
				IColor fillColor = get(themeColor);
				return fillColor;
			} catch (Exception ex) {
				return null;
			}
		}
		return null;
	}

	@Override
	public IColor getToolTipColor() {
		return get(250, 250, 0);
	}

	/**
	 * @return
	 */
	@Override
	public IColor getTransparentColor() {
		if (transparentColor == null) {
			// transparentColor = get(255, 51, 204);
			transparentColor = get(250, 250, 250);
		}
		return transparentColor;
	}

	@Override
	public boolean isDark() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDark(IColor c) {
		if (c == null) {
			return false;
		}
		double red = c.getRed();
		double green = c.getGreen();
		double blue = c.getBlue();
		double brightness = red + green + blue;
		return brightness < (3 * 128);
	}

	@Override
	public Object loadSwt(IColor color) {
		// return new Color(null, (int) color.getRed(), (int) color.getGreen(),
		// (int) color.getBlue());

		return null;
	}

	private IColor schemeIndexToChemeColor(
			org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum stSchemeIndex) {
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_1)) {
			return accent1;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_2)) {
			return accent2;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_3)) {
			return accent3;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_4)) {
			return accent4;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_5)) {
			return accent5;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_6)) {
			return accent6;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.DK_1)) {
			return dk1;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.DK_2)) {
			return dk2;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.FOL_HLINK)) {
			return folHLink;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.HLINK)) {
			return hLink;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.LT_1)) {
			return lt1;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.LT_2)) {
			return lt2;
		}
		return null;
	}

	private IColor schemeIndexToChemeColor(STColorSchemeIndex.Enum stSchemeIndex) {
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_1)) {
			return accent1;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_2)) {
			return accent2;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_3)) {
			return accent3;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_4)) {
			return accent4;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_5)) {
			return accent5;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.ACCENT_6)) {
			return accent6;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.DK_1)) {
			return dk1;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.DK_2)) {
			return dk2;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.FOL_HLINK)) {
			return folHLink;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.HLINK)) {
			return hLink;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.LT_1)) {
			return lt1;
		}
		if (stSchemeIndex.equals(STColorSchemeIndex.LT_2)) {
			return lt2;
		}
		return null;
	}

	@Override
	public void setMainOfficeColor(IColor newColor) {
		colorRegistry = new HashMap<String, IColor>();
		colorRegistry.put(COLOR_MAIN_OFFICE_COLOR, newColor);
		JOUtil2.set(COLOR_MAIN_OFFICE_COLOR, newColor.getRed() + "," + newColor.getGreen() + "," + newColor.getBlue()); //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * @param red
	 * @param green
	 * @param blue
	 */
	@Override
	public void setMainOfficeColor(int red, int green, int blue) {
		colorRegistry = new HashMap<String, IColor>();
		colorRegistry.put(COLOR_MAIN_OFFICE_COLOR, new RcplColor(red, green, blue));
		JOUtil2.set(COLOR_MAIN_OFFICE_COLOR, red + "," + green + "," + blue); //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * @param rgb
	 * @param brightness
	 * @return
	 */
	private IColor transformRGB(IColor rgb, double brightness) {
		int red = (int) (Math.min(255, (rgb.getRed() * brightness)));
		int green = (int) (Math.min(255, (rgb.getGreen() * brightness)));
		int blue = (int) (Math.min(255, (rgb.getBlue() * brightness)));
		return new RcplColor(red, green, blue);
	}

}
