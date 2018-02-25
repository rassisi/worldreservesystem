/******************************************************************************
 * Copyright (c) 2007-2013 Ramin Assisi
 */
package com.joffice.rcpl.plugin.office;

import org.eclipse.rcpl.EStyleType;
import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IEmuProperty2;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.IProperty2;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.RcplGlyphMetrics;
import org.eclipse.rcpl.EnShading;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme;

import com.joffice.rcpl.plugin.office.databinding.JOPropertyCharacterProperties;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyIndent;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTabs;
import com.joffice.rcpl.plugin.office.databinding.types.JOCharacterProperties;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;
import com.joffice.rcpl.plugin.office.databinding.types.JOTabArray;
import com.joffice.rcpl.plugin.office.databinding2.JOBoolean;
import com.joffice.rcpl.plugin.office.internal.JOStyleTemplate;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;

import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JOStyle implements IStyle {

	private String name;

	private String id;

	private boolean templateStyle;

	// ---------- new databinding 2 --------------------------------------------

	IProperty2 spacingBefore;
	IProperty2 spacingAfter;
	IProperty2 spacingLine;

	IEmuProperty2 cellMarginLeft;
	IEmuProperty2 cellMarginRight;
	IEmuProperty2 cellMarginTop;
	IEmuProperty2 cellMarginBottom;

	// private JOColorProperty highlightColor;
	private JOBoolean strikeThrough;

	// ---------- new JOProperty properties ------------------------------------

	// private JOBoolean verticalAlign;
	private Object tabs;
	private IJOProperty pageBreakBefore;
	protected IJOProperty indent;

	// -------------------------------------------------------------------------

	//
	private JOPropertyCharacterProperties<JOCharacterProperties> characterProperties;
	private EStyleType type;
	private IStyleTemplate styleTemplate;
	private IStyle basedOnStyle;
	private IJOProperty textAlignment;
	private boolean superScript;
	private boolean subScript;
	private IDrawing drawing;
	private IImage image;
	private CTR ctr;
	private String hyperText;
	private IStyle nextStyle;
	public IColor fg = IColor.BLACK;
	public IColor bg = IColor.WHITE;
	public int start;
	public int length;
	EnShading shading;
	public IFont font;
	public RcplGlyphMetrics metrics;
	private boolean underline;
	private CTOnOff keepNext;
	private IBorder border;

	//
	// public IColor borderColor;
	//
	// public IColor strikeoutColor = IColor.BLACK;
	//
	// public IColor underlineColor = IColor.BLACK;
	//

	//
	// private STEm.Enum Em;
	//
	// private boolean strikeout;
	//
	// private CTString ctString;
	//
	// private CTTextEffect effect;
	//
	// private CTBorder styleBorder;
	//
	// private CTUnderline styleUnderline;
	//
	// private CTTextScale styleTextScale;
	//
	// private CTHpsMeasure styleHpsMeasure;
	//
	// // private CTRPrChange prChange;
	// private CTEm ctEm;

	// ---------- GETTER & SETTER ----------------------------------------------

	//
	// private CTOnOff kinsoku;
	//
	// private CTOnOff mirrorIdents;
	//
	// private CTNumPr numPr;
	//
	// private CTDecimalNumber outlineLvl;
	//
	// private CTOnOff overflowPunct;
	//
	// private CTPBdr pBdr;
	//
	// private CTPPrChange pPrChange;
	//
	// private CTParaRPr paraRPr;
	//
	// private CTString pStyle;
	//
	// private CTSectPr sectPr;
	//
	// private CTShd shd;
	//
	// private CTOnOff snapToGrid;
	//
	// private CTOnOff suppressAutoHyphens;
	//
	// private CTOnOff suppressLineNumbers;
	//
	// private CTOnOff suppressOverlap;
	//
	// private CTTextboxTightWrap textBoxTightWrap;
	//
	// private CTTextDirection textDirection;
	//
	// private CTOnOff topLinePunct;
	//
	// private CTOnOff widowControl;
	//
	// private CTOnOff wordWrap;
	//
	// public int borderStyle;
	//
	// public int underlineStyle;
	//
	// public Object data;
	//
	// public boolean rise;
	//
	// ParagraphAlignment alignment;
	//
	// private IFont originalFont;
	//
	// private JOStyle style;
	//
	// private CTOnOff italic;
	// private CTOnOff bold;

	//
	//
	// private int lineHeight;
	//
	// private STUnderline.Enum underline2 = STUnderline.NONE;
	//
	// private CTOnOff bcs;
	//
	// private CTOnOff caps;
	// private CTOnOff cs;
	// private CTOnOff emboss;
	// private CTOnOff imprint;
	// private CTOnOff noProof;
	// private CTOnOff oMath;
	// private CTOnOff outline;
	// private CTOnOff rtl;
	// private CTOnOff shadow;
	// private CTOnOff smallCaps;
	// private CTOnOff snapToGrip;
	// private CTBorder border;
	// private STTextEffect.Enum textEffect;
	// private CTTextScale textScale;
	// private CTRPrChange PrChange;
	// private CTShd ctShd;
	// private BigInteger uiPriority;
	// private boolean locked;
	// private boolean qFormat;
	//
	// private boolean semiHidden;
	//
	// private boolean unhideWhenUsed;
	//
	//
	// private int fontStyle;
	//
	// private CTFonts rFonts;
	//
	// private CTColor ctColor;
	//
	// private boolean defaultStyle;
	//
	//
	// boolean characterStyle = false;
	//
	// boolean numberingStyle = false;
	//
	// boolean paragraphStyle = false;
	//
	// private CTOnOff djustRightInd;
	//
	// private CTOnOff autoSpaceDE;
	//
	// private CTOnOff autoSpaceDN;
	//
	// private CTOnOff bidi;
	//
	// private CTCnf cnfStyle;
	//
	// private CTOnOff contextualSpacing;
	//
	// private CTDecimalNumber divId;
	//
	// private CTFramePr framePr;
	//
	// private CTJc jc;
	//
	// private CTOnOff keepLines;
	//

	public JOStyle() {
		this("", ""); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @param ctStyle
	 * @param styleTemplate
	 */
	public JOStyle(CTStyle ctStyle, JOStyleTemplate styleTemplate) {
		this.name = ctStyle.getName().getVal();
		this.id = ctStyle.getStyleId();
		this.styleTemplate = styleTemplate;

		STStyleType.Enum type = ctStyle.getType();

		if (type.equals(STStyleType.CHARACTER)) {
			this.type = EStyleType.CHARACTER;
		} else if (type.equals(STStyleType.PARAGRAPH)) {
			this.type = EStyleType.PARAGRAPH;
		} else if (type.equals(STStyleType.NUMBERING)) {
			this.type = EStyleType.NUMBERING;
		}

		getFont();
	}

	/**
	 * @param start
	 * @param length
	 * @param foreground
	 * @param background
	 */
	public JOStyle(int start, int length, IColor fg, IColor bg) {
		this.name = ""; //$NON-NLS-1$
		this.id = ""; //$NON-NLS-1$
		this.start = start;
		this.length = length;
		if (fg == null) {
			fg = IColor.BLACK;
		}
		this.fg = fg;
		if (bg != null) {
			bg = IColor.WHITE;
		}
		this.bg = bg;
		getFont();
	}

	/**
	 * @param name
	 */
	public JOStyle(String id, String name) {
		this.name = name;
		this.id = id;
		getFont();
		// foreground = IColor.BLACK;
		// background = IColor.WHITE;
	}

	/**
	 * @param id
	 * @param name
	 * @param start
	 * @param length
	 * @param foreground
	 * @param background
	 * @param fontStyle
	 */
	public JOStyle(String id, String name, int start, int length, IColor fg, IColor bg, int fontStyle) {
		this.start = start;
		this.length = length;
		this.fg = fg;
		this.bg = bg;
		getFont().setStyle(fontStyle);
	}

	/**
	 * @param name
	 */
	public JOStyle(String id, String name, JOStyleTemplate styleTemplate) {
		this.name = name;
		this.id = id;
		this.styleTemplate = styleTemplate;
		getFont();
	}

	@Override
	public JOStyle copy() {
		JOStyle newStyle = new JOStyle();
		copy(this, newStyle);
		return newStyle;
	}

	// public ParagraphAlignment getAlignment() {
	// return alignment;
	// }

	// public CTOnOff getAutoSpaceDE() {
	// return autoSpaceDE;
	// }
	//
	// public CTOnOff getAutoSpaceDN() {
	// return autoSpaceDN;
	// }

	public void copy(JOStyle src, JOStyle dest) {
		copyAttributes(src, dest);
		dest.setId(src.getId());
		dest.setName(src.getName());
	}

	public void copyAttributes(IStyle src0, IStyle dest0) {
		if (src0 == null) {
			// TODO:
			return;
		}

		JOStyle src = (JOStyle) src0;

		JOStyle dest = (JOStyle) dest0;

		// ---------- compatibility with SWT -----------------------------------

		dest.setHeight(src.getFont().getHeight());
		dest.superScript = src.superScript;
		dest.subScript = src.subScript;
		dest.fg = src.fg.copy();
		dest.bg = src.bg.copy();
		dest.font = src.font.copy();
		dest.border = src.border;
		dest.drawing = src.drawing;
		dest.image = src.image;
		dest.start = src.start;
		dest.length = src.length;
		dest.metrics = src.metrics;
		dest.underline = src.underline;
		dest.setHyperText(src.getHyperText());
		dest.setStyleTemplate(src.getStyleTemplate());
		dest.setCharacterProperties(src.getCharacterProperties());
		dest.setBorder(src.getBorder());
		dest.setForeground(copyColor(src.getForeGround()));
		dest.setBackground(copyColor(src.getBackground()));
		dest.setIndent(src.getIndent());
		dest.textAlignment = src.textAlignment;
		dest.setHyperText(src.getHyperText());
		dest.setKeepNext(src.getKeepNext());
		dest.shading = src.shading;
		dest.setSpacingAfter(src.getSpacingAfter());
		dest.setSpacingBefore(src.getSpacingBefore());
		dest.setSpacingLine(src.getSpacingLine());
		dest.tabs = src.tabs;
		dest.setPageBreakBefore(src.getPageBreakBefore());

		dest.setCellMarginBottom(src.getCellMarginBottom());
		dest.setCellMarginTop(src.getCellMarginTop());
		dest.setCellMarginLeft(src.getCellMarginLeft());
		dest.setCellMarginRight(src.getCellMarginRight());

		// dest.underlineColor = copyColor(src.underlineColor);
		// dest.underlineStyle = src.underlineStyle;
		// dest.strikeout = src.strikeout;
		// if (src.getStrikeThrough() != null) {
		// dest.setStrikeThrough(src.getStrikeThrough());
		// }
		// if (src.getVerticalAlign() != null) {
		// dest.setVertivalAlign(src.getVerticalAlign());
		// }
		// dest.strikeoutColor = copyColor(src.strikeoutColor);
		// dest.borderStyle = src.borderStyle;
		// dest.borderColor = copyColor(src.borderColor);
		// dest.rise = src.rise;
		// dest.data = src.data;

		// ---------- addition attributes --------------------------------------

		// dest.setAutoSpaceDE(src.getAutoSpaceDE());
		// dest.setAutoSpaceDN(src.getAutoSpaceDN());
		// dest.setBcs(src.getBcs());

		// dest.setBcs(src.getBcs());
		// dest.setBidi(src.getBidi());
		// dest.setBold(src.getBol);
		// dest.setCaps(src.getCaps());
		// dest.setCnfStyle(src.getCnfStyle());
		// dest.setContextualSpacing(src.getContextualSpacing());
		// dest.setCs(src.getCs());
		// dest.setCtColor(src.getCtColor());
		// dest.setCtEm(src.getCtEm());
		// dest.setCtr(src.getCtr());
		// dest.setCtShd(src.getCtShd());
		// dest.setCtString(src.getCtString());
		// dest.setDivId(src.getDivId());
		// dest.setDjustRightInd(src.getDjustRightInd());
		// dest.setEffect(src.getEffect());
		// dest.setEm(src.getEm());
		// dest.setEmboss(src.getEmboss());
		// dest.setFramePr(src.getFramePr());
		// dest.setHighlightColor(src.getHighlightColor());
		// dest.setImprint(src.getImprint());

		// dest.setKeepLines(src.getKeepLines());
		// dest.setKinsoku(src.getKinsoku());
		// dest.setLocked(src.getloc);
		// dest.setMirrorIdents(src.getMirrorIdents());
		// dest.setNoProof(src.getNoProof());
		// dest.setNumPr(src.getNumPr());
		// dest.setoMath(src.getoMath());
		// dest.setOMath(src.getoMath());
		// dest.setOutline(src.getOutline());
		// dest.setOutlineLvl(src.getOutlineLvl());
		// dest.setOverflowPunct(src.getOverflowPunct());
		// dest.setpBdr(src.getpBdr());
		// dest.setpPrChange(src.getpPrChange());
		// dest.setParaRPr(src.getParaRPr());
		// dest.setPrChange(src.getPrChange());
		// dest.setqFormat(src.get);
		// dest.setrFonts(src.getrFonts());
		// dest.setRtl(src.getRtl());
		// dest.setSectPr(src.getSectPr());
		// dest.setSemiHidden(src.getse);
		// dest.borderColor = copyColor(src.borderColor);
		// dest.borderStyle = src.borderStyle;
		// dest.setShd(src.getShd());
		// dest.setSmallCaps(src.getSmallCaps());
		// dest.setSnapToGrid(src.getSnapToGrid());
		// dest.setSnapToGrip(src.getSnapToGrip());

		// dest.setStyleBorder(src.getStyleBorder());
		// dest.setStyleHpsMeasure(src.getStyleHpsMeasure());
		// dest.setStyleTextScale(src.getStyleTextScale());
		// dest.setStyleUnderline(src.getStyleUnderline());
		// dest.setSuppressAutoHyphens(src.getSuppressAutoHyphens());
		// dest.setSuppressLineNumbers(src.getSuppressLineNumbers());
		// dest.setSuppressOverlap(src.getSuppressOverlap());
		// dest.setUiPriority(src.getUiPriority());
		// dest.setUnhideWhenUsed(src.getun);
		// dest.setWidowControl(src.getWidowControl());
		// dest.setWordWrap(src.getWordWrap());

		// TODO:
		// dest.set(src.get);
		// dest.set(src.get);
		// dest.set(src.get);
		// dest.set(src.get);
	}

	//
	// public CTOnOff getBcs() {
	// return bcs;
	// }

	// public CTOnOff getBidi() {
	// return bidi;
	// }
	//
	// public CTBorder getBorder() {
	// return border;
	// }
	//
	// public CTOnOff getCaps() {
	// return caps;
	// }

	@Override
	public void copyAttributesTo(IStyle dest0) {
		copyAttributes(this, dest0);
	}

	private IColor copyColor(IColor color) {
		if (color == null) {
			return null;
		}
		return color.copy();
	}

	//
	// public CTShd getCtShd() {
	// return ctShd;
	// }
	//
	// public CTString getCtString() {
	// return ctString;
	// }

	@Override
	public IColor getBackground() {
		return bg;
	}

	@Override
	public IStyle getBasedOnStyle() {
		return basedOnStyle;
	}

	// public CTDecimalNumber getDivId() {
	// return divId;
	// }

	// private Color bgColor = ColorConstants.white;
	//
	// public Color getBgColor() {
	// return bgColor;
	// }
	//
	// public void setBgColor(Color bgColor) {
	// this.bgColor = bgColor;
	// }

	// public Color getFgColor() {
	// return fgColor;
	// }
	//
	// public void setFgColor(Color fgColor) {
	// this.fgColor = fgColor;
	// }

	// private Color fgColor = ColorConstants.black;

	// public CTOnOff getDjustRightInd() {
	// return djustRightInd;
	// }

	@Override
	public IBorder getBorder() {
		return border;
	}

	// public CTTextEffect getEffect() {
	// return effect;
	// }
	//
	// public STEm.Enum getEm() {
	// return Em;
	// }

	// public CTOnOff getEmboss() {
	// return emboss;
	// }

	/**
	 * @return
	 */
	public JOPropertyCharacterProperties<JOCharacterProperties> getCharacterProperties() {
		return characterProperties;
	}

	//
	// public CTCnf getCnfStyle() {
	// return cnfStyle;
	// }
	//
	// public CTOnOff getContextualSpacing() {
	// return contextualSpacing;
	// }
	//
	// public CTOnOff getCs() {
	// return cs;
	// }
	//
	// public CTColor getCtColor() {
	// return ctColor;
	// }
	//
	// public CTEm getCtEm() {
	// return ctEm;
	// }
	//
	@Override
	public CTR getCtr() {
		return ctr;
	}

	// public CTFramePr getFramePr() {
	// return framePr;
	// }

	//
	private float getDefaultFontHeight(boolean minorFont) {
		if (minorFont) {
			return 11;
		}
		return 11;
	}

	/**
	 * @param minorFont
	 * @return
	 */
	private String getDefaultFontName(boolean minorFont) {
		try {
			if (getStyleTemplate() == null) {
				return Rcpl.fontProvider().getSystemFontName();
			}
			if (minorFont) {
				if (((JOStyleTemplate) getStyleTemplate()).getThemeFontScheme() != null
						&& ((JOStyleTemplate) getStyleTemplate()).getThemeFontScheme().getMinorFontsLatin() != null) {
					return ((JOStyleTemplate) getStyleTemplate()).getThemeFontScheme().getMinorFontsLatin()
							.getTypeface();
				}
				return Rcpl.fontProvider().getSystemFontName();
			}
			if (((JOStyleTemplate) getStyleTemplate()).getThemeFontScheme().getMajorFontsLatin() != null) {
				return ((JOStyleTemplate) getStyleTemplate()).getThemeFontScheme().getMajorFontsLatin().getTypeface();
			}
			return Rcpl.fontProvider().getSystemFontName();
		} catch (Exception ex) {
			return Rcpl.fontProvider().getSystemFontName();
		}
	}

	/**
	 * @return
	 */
	@Override
	public IDrawing getDrawing() {
		return drawing;
	}

	//
	// public CTOnOff getImprint() {
	// return imprint;
	// }

	@Override
	public IFont getFont() {
		if (font == null) {
			font = Rcpl.fontProvider().loadFont(getDefaultFontName(true), getDefaultFontHeight(false), 0);
		}
		return font;
	}

	//
	// public CTJc getJc() {
	// return jc;
	// }

	/**
	 * @return
	 */
	// public double getFontHeight() {
	// if (styleHpsMeasure != null && styleHpsMeasure.getVal() != null) {
	// return styleHpsMeasure.getVal().floatValue() / 2;
	// }
	// return getFont().getHeight();
	// }

	@Override
	public IColor getForeGround() {
		return fg;
	}

	// public JOColorProperty getHighlightColor() {
	// return highlightColor;
	// }
	//
	@Override
	public String getHyperText() {
		return hyperText;
	}

	//
	// public int getLevel() {
	// if (outlineLvl != null && outlineLvl.getVal() != null) {
	// return outlineLvl.getVal().intValue();
	// }
	// return -1;
	// }

	// @Override
	// public int getLineAlignment(int line) {
	// // TODO Auto-generated method stub
	// return 0;
	// }
	//
	// public int getLineHeight() {
	// return lineHeight;
	// }
	//
	// public CTOnOff getMirrorIdents() {
	// return mirrorIdents;
	// }

	@Override
	public String getId() {
		return id;
	}

	@Override
	public IImage getImage() {
		return image;
	}

	// public CTOnOff getNoProof() {
	// return noProof;
	// }
	//
	// public CTNumPr getNumPr() {
	// return numPr;
	// }
	//
	// public CTOnOff getoMath() {
	// return oMath;
	// }

	// public CTOnOff getOutline() {
	// return outline;
	// }
	//
	// public CTDecimalNumber getOutlineLvl() {
	// return outlineLvl;
	// }
	//
	// public CTOnOff getOverflowPunct() {
	// return overflowPunct;
	// }

	/**
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public JOPropertyIndent<JOIndent> getIndent() {
		return (JOPropertyIndent<JOIndent>) indent;
	}

	// @Override
	// public boolean getJustify() {
	// // TODO Auto-generated method stub
	// return false;
	// }
	//
	// public CTOnOff getKeepLines() {
	// return keepLines;
	// }
	//
	@Override
	public CTOnOff getKeepNext() {
		return keepNext;
	}

	//
	// public CTOnOff getKinsoku() {
	// return kinsoku;
	// }
	//
	@Override
	public int getLength() {
		return length;
	}

	@Override
	public String getName() {
		if (name == null) {
			return id;
		}
		return name;
	}

	//
	// public double getSpacingAfterPixel() {
	// if (spacingAfter != null) {
	// return spacingAfter.get().toPixel();
	// }
	// return 0;
	// }
	//

	//
	// public double getSpacingBeforePixel() {
	// if (spacingBefore != null) {
	// return spacingBefore.get().toPixel();
	// }
	// return 0;
	// }

	@Override
	public IStyle getNextStyle() {
		return nextStyle;
	}

	/**
	 * @return
	 */
	@Override
	public IJOProperty getPageBreakBefore() {
		return pageBreakBefore;
	}

	// public JOStyle getStyle() {
	// return style;
	// }
	//
	// public CTBorder getStyleBorder() {
	// return styleBorder;
	// }
	//
	// public CTHpsMeasure getStyleHpsMeasure() {
	// return styleHpsMeasure;
	// }

	//
	// public CTParaRPr getParaRPr() {
	// return paraRPr;
	// }
	//
	// public CTPBdr getpBdr() {
	// return pBdr;
	// }
	//
	// public CTPPrChange getpPrChange() {
	// return pPrChange;
	// }
	//
	// public CTRPrChange getPrChange() {
	// return PrChange;
	// }
	//
	// public CTString getpStyle() {
	// return pStyle;
	// }
	//
	// public CTFonts getrFonts() {
	// return rFonts;
	// }
	//
	// public CTFonts getRFonts() {
	// return rFonts;
	// }
	//
	// public CTOnOff getRtl() {
	// return rtl;
	// }
	//
	// public CTSectPr getSectPr() {
	// return sectPr;
	// }
	//
	@Override
	public EnShading getShading() {
		return shading;
	}

	//
	// public CTOnOff getShadow() {
	// return shadow;
	// }
	//
	// public CTShd getShd() {
	// return shd;
	// }
	//
	// public CTOnOff getSmallCaps() {
	// return smallCaps;
	// }
	//
	// public CTOnOff getSnapToGrid() {
	// return snapToGrid;
	// }
	//
	// public CTOnOff getSnapToGrip() {
	// return snapToGrip;
	// }
	//
	@Override
	public IProperty2 getSpacingAfter() {
		return spacingAfter;
	}

	//
	// public CTTextboxTightWrap getTextBoxTightWrap() {
	// return textBoxTightWrap;
	// }
	//
	// public CTTextDirection getTextDirection() {
	// return textDirection;
	// }
	//
	// public STTextEffect.Enum getTextEffect() {
	// return textEffect;
	// }
	//
	// public CTTextScale getTextScale() {
	// return textScale;
	// }
	//
	// public CTOnOff getTopLinePunct() {
	// return topLinePunct;
	// }
	//
	@Override
	public EStyleType getType() {
		return type;
	}

	//
	// public BigInteger getUiPriority() {
	// if (uiPriority == null) {
	// return BigInteger.ZERO;
	// }
	// return uiPriority;
	// }
	//
	// public STUnderline.Enum getUnderline() {
	// return underline2;
	// }
	//
	// public STUnderline.Enum getUnderline2() {
	// return underline2;
	// }

	// /**
	// * @return
	// */
	// public JOBoolean getVerticalAlign() {
	// return verticalAlign;
	// }
	//
	// public CTOnOff getWidowControl() {
	// return widowControl;
	// }
	//
	// public CTOnOff getWordWrap() {
	// return wordWrap;
	// }
	//
	// public boolean isBcs() {
	// return bcs != null;
	// }

	@Override
	public IProperty2 getSpacingBefore() {
		return spacingBefore;
	}

	@Override
	public int getStart() {
		return start;
	}

	/**
	 * @return
	 */
	public JOBoolean getStrikeThrough() {
		return strikeThrough;
	}

	public IStyleTemplate getStyleTemplate() {
		if (styleTemplate == null) {
			styleTemplate = Rcpl.globalStyleTemplate();
		}
		return styleTemplate;
	}

	// public CTTextScale getStyleTextScale() {
	// return styleTextScale;
	// }
	//
	// public CTUnderline getStyleUnderline() {
	// return styleUnderline;
	// }
	//
	// public CTOnOff getSuppressAutoHyphens() {
	// return suppressAutoHyphens;
	// }
	//
	// public CTOnOff getSuppressLineNumbers() {
	// return suppressLineNumbers;
	// }
	//
	// public CTOnOff getSuppressOverlap() {
	// return suppressOverlap;
	// }
	//
	@Override
	@SuppressWarnings("unchecked")
	public JOPropertyTabs<JOTabArray> getTabs() {
		return (JOPropertyTabs<JOTabArray>) tabs;
	}

	@Override
	public IJOProperty getTextAlignment() {
		return textAlignment;
	}

	@Override
	public boolean isBold() {
		return getFont().isBold();
	}

	// public boolean isCaps() {
	// return caps != null;
	// }
	//
	// public boolean isCharacterStyle() {
	// return characterStyle;
	// }
	//
	// public boolean isCs() {
	// return cs != null;
	// }
	//
	// public boolean isDefaultStyle() {
	// return defaultStyle;
	// }
	//
	// public boolean isEmboss() {
	// return emboss != null;
	// }
	//
	// public boolean isH1() {
	// return getLevel() == 0;
	// }
	//
	// public boolean isH2() {
	// return getLevel() == 1;
	// }
	//
	// public boolean isH3() {
	// return getLevel() == 2;
	// }
	//
	// @Override
	// public boolean isH4() {
	// // TODO Auto-generated method stub
	// return false;
	// }
	//
	// public boolean isImprint() {
	// return imprint != null;
	// }
	//
	@Override
	public boolean isItalic() {
		return getFont().isItalic();
	}

	//
	// public boolean isLocked() {
	// return locked;
	// }
	//
	// public boolean isNoProof() {
	// return noProof != null;
	// }
	//
	// public boolean isNumberingStyle() {
	// return numberingStyle;
	// }
	//
	// public boolean isoMath() {
	// return oMath != null;
	// }
	//
	// public boolean isOMath() {
	// return oMath != null;
	// }
	//
	// public boolean isOutline() {
	// return outline != null;
	// }
	//
	// /**
	// * @return
	// */
	// public boolean isPageBreakBefore() {
	// if (pageBreakBefore != null) {
	// return pageBreakBefore.get();
	// }
	// return false;
	// }
	//
	// public boolean isParagraphStyle() {
	// return paragraphStyle;
	// }
	//
	// public boolean isqFormat() {
	// return qFormat;
	// }
	//
	// public boolean isRtl() {
	// return rtl != null;
	// }
	//
	// public boolean isSemiHidden() {
	// return semiHidden;
	// }
	//
	// public boolean isShadow() {
	// return shadow != null;
	// }
	//
	// public boolean isSmallCaps() {
	// return smallCaps != null;
	// }
	//
	// public boolean isSnapToGrip() {
	// return snapToGrip != null;
	// }
	//
	@Override
	public boolean isStrikeThrough() {
		if (strikeThrough == null) {
			return false;
		}
		return strikeThrough.get();
	}

	/**
	 * @return
	 */
	@Override
	public boolean isSubScript() {
		return subScript;
	}

	// if (verticalAlign == null) {
	// return false;
	// }
	// if (verticalAlign.getDataBindingKeys()[0].indexOf("subscript") == -1) {
	// //$NON-NLS-1$
	// return false;
	// }
	// return verticalAlign.get();
	// }
	//
	/**
	 * @return
	 */
	@Override
	public boolean isSuperScript() {
		return superScript;
	}

	// public void setEffect(CTTextEffect effect) {
	// this.effect = effect;
	// }

	// if (verticalAlign == null) {
	// return false;
	// }
	// if (verticalAlign.getDataBindingKeys()[0].indexOf("superscript") == -1) {
	// //$NON-NLS-1$
	// return false;
	// }
	// return verticalAlign.get();
	// }
	//
	@Override
	public boolean isUnderline() {
		return underline;
	}

	//
	// public boolean isUnhideWhenUsed() {
	// return unhideWhenUsed;
	// }
	//
	// public void setAlignment(ParagraphAlignment alignment) {
	// this.alignment = alignment;
	// }
	//
	// public void setAutoSpaceDE(CTOnOff autoSpaceDE) {
	// this.autoSpaceDE = autoSpaceDE;
	// }
	//
	// public void setAutoSpaceDN(CTOnOff autoSpaceDN) {
	// this.autoSpaceDN = autoSpaceDN;
	// }
	//
	@Override
	public void setBackground(IColor color) {
		bg = color;
	}

	//
	@Override
	public void setBasedOnStyle(IStyle basedOnStyle) {
		this.basedOnStyle = basedOnStyle;
	}

	//
	// public void setBcs(CTOnOff Bcs) {
	// this.bcs = Bcs;
	// }
	//
	// public void setBidi(CTOnOff bidi) {
	// this.bidi = bidi;
	// }
	//
	@Override
	public void setBold(boolean bold) {
		if (bold) {
			getFont().setStyle(getFont().getStyle() | Rcpl.BOLD);
		} else {
			getFont().setStyle(getFont().getStyle() & ~Rcpl.BOLD);
		}
		updateFont();
	}

	@Override
	public void setBorder(IBorder border) {
		this.border = border;
	}

	// /**
	// * @param charStyleCtColor
	// */
	// public void setForegroundColor(CTColor charStyleCtColor) {
	// if (charStyleCtColor != null) {
	// Object val = charStyleCtColor.getVal();
	// if (val instanceof byte[]) {
	// byte[] b = (byte[]) val;
	// fg = JO.colorProvider.get(b);
	// }
	// }
	// }

	// public void setFramePr(CTFramePr framePr) {
	// this.framePr = framePr;
	// }
	//

	//
	// public void setBold(CTOnOff bold) {
	// if (bold != null) {
	// setBold(true);
	// }
	// updateFont();
	// }
	//
	// public void setBorder(CTBorder Border) {
	// if (Border != null) {
	// this.border = Border;
	// }
	// }
	//
	// public void setCaps(CTOnOff Caps) {
	// this.caps = Caps;
	// }
	//
	/**
	 * @param characterProperties
	 */
	public void setCharacterProperties(JOPropertyCharacterProperties<JOCharacterProperties> characterProperties) {
		this.characterProperties = characterProperties;
		if (characterProperties != null) {
			if (characterProperties.get().bold) {
				setBold(true);
			}
			if (characterProperties.get().italic) {
				setItalic(true);
			}
			if (characterProperties.get().fgColor != null) {
				fg = characterProperties.get().fgColor;
			}
			if (characterProperties.get().getFontSize() > 0) {
				font = Rcpl.fontProvider().loadFont(font, characterProperties.get().getFontSize());
			}
		}
	}

	//
	// public void setCnfStyle(CTCnf cnfStyle) {
	// this.cnfStyle = cnfStyle;
	// }
	//
	// public void setContextualSpacing(CTOnOff contextualSpacing) {
	// this.contextualSpacing = contextualSpacing;
	// }
	//
	// public void setCs(CTOnOff Cs) {
	// this.cs = Cs;
	// }
	//
	// public void setCtColor(CTColor ctColor) {
	// this.ctColor = ctColor;
	// }
	//
	// public void setCtEm(CTEm ctEm) {
	// this.ctEm = ctEm;
	// }
	//
	@Override
	public void setCtr(CTR ctr) {
		this.ctr = ctr;
	}

	//
	// public void setCtShd(CTShd ooxmlCtShd) {
	// this.ctShd = ooxmlCtShd;
	// }
	//
	// // public CTTextAlignment getTextAlignment() {
	// // return textAlignment;
	// // }
	// //
	// // public void setTextAlignment(CTTextAlignment textAlignment) {
	// // this.textAlignment = textAlignment;
	// // }
	//
	// public void setCtString(CTString ctString) {
	// this.ctString = ctString;
	// }
	//
	// public void setDefaultStyle(boolean defaultStyle) {
	// this.defaultStyle = defaultStyle;
	// }
	//
	// public void setDivId(CTDecimalNumber divId) {
	// this.divId = divId;
	// }
	//
	// public void setDjustRightInd(CTOnOff djustRightInd) {
	// this.djustRightInd = djustRightInd;
	// }
	//
	/**
	 * @param drawing
	 */
	@Override
	public void setDrawing(IDrawing drawing) {
		drawing.setStyle(this);
		if (drawing.getImage() != null) {
			double leftEffect = JOConversion.emu2Pixel(drawing.getEmuEffectExtentLeft());
			double rightEffect = JOConversion.emu2Pixel(drawing.getEmuEffectExtentRight());
			double topEffect = JOConversion.emu2Pixel(drawing.getEmuEffectExtentTop());
			double bottomEffect = JOConversion.emu2Pixel(drawing.getEmuEffectExtentBottom());

			double h = ((JOEmu) drawing.getHeight().get()).toPixel() + topEffect + bottomEffect;
			double w = ((JOEmu) drawing.getWidth().get()).toPixel() + leftEffect + rightEffect;
			metrics = new RcplGlyphMetrics(h, 0, w);
		}
		this.drawing = drawing;
	}

	//
	// public void setEm(STEm.Enum Em) {
	// if (Em != null) {
	// this.Em = Em;
	// }
	// }
	//
	// public void setEmboss(CTOnOff Emboss) {
	// this.emboss = Emboss;
	// }
	//
	@Override
	public void setFont(IFont font) {
		this.font = font;
	}

	// public void setImprint(CTOnOff Imprint) {
	// this.imprint = Imprint;
	// }

	public void setFontHeight(float fontHeight) {
		setFont(Rcpl.fontProvider().loadFont(getFont().getName(), fontHeight, getFont().getStyle()));
	}

	/**
	 * @param ctFonts
	 */
	@Override
	public void setFonts(CTFonts ctFonts) {
		if (ctFonts != null) {

			boolean minorFont = true;
			String fontName = null;

			if (ctFonts.getHAnsiTheme() != null) {
				int hAnsiTheme = ctFonts.getHAnsiTheme().intValue();
				switch (hAnsiTheme) {
				case STTheme.INT_MAJOR_ASCII:
					minorFont = false;
					break;
				case STTheme.INT_MAJOR_BIDI:
					minorFont = false;
					break;
				case STTheme.INT_MAJOR_EAST_ASIA:
					minorFont = false;
					break;
				case STTheme.INT_MAJOR_H_ANSI:
					minorFont = false;
					break;
				case STTheme.INT_MINOR_ASCII:
					break;
				case STTheme.INT_MINOR_BIDI:
					break;
				case STTheme.INT_MINOR_EAST_ASIA:
					break;
				case STTheme.INT_MINOR_H_ANSI:
					break;

				}
			}

			String ascii = ctFonts.getAscii();

			// String eastAsia = ctFonts.getEastAsia();

			String hAnsi = ctFonts.getHAnsi();

			STHint.Enum en = ctFonts.getHint();
			if (en != null) {
				if (en.equals(STHint.CS)) {
				} else if (en.equals(STHint.DEFAULT)) {
				} else if (en.equals(STHint.EAST_ASIA)) {
				}
			}

			if (hAnsi != null) {
				fontName = hAnsi;
			} else if (ascii != null) {
				fontName = ascii;
			}

			if (fontName == null) {
				fontName = getDefaultFontName(minorFont);
			}

			setFont(Rcpl.fontProvider().loadFont(fontName, getFont().getHeight(), getFont().getStyle()));
		}

	}

	@Override
	public void setForeground(IColor color) {
		fg = color;
	}

	@Override
	public void setHeight(double height) {
		font.setHeight(height);
		updateFont();
	}

	//
	// /**
	// * @param highlightColor
	// */
	// public void setHighlightColor(JOColorProperty highlightColor) {
	// this.highlightColor = highlightColor;
	// // this is to force that styleRanges are properly copied.
	// try {
	// if (highlightColor != null) {
	// bg = highlightColor.get();
	// }
	// } catch (Exception ex) {
	// this.highlightColor = null;
	// this.bg = IColor.WHITE;
	// }
	// }
	//
	@Override
	public void setHyperText(String hyperText) {
		this.hyperText = hyperText;
	}

	//
	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void setImage(IImage image) {
		setImage(image, -1, -1);
	}

	/**
	 * @param image
	 */
	@Override
	public void setImage(IImage image, double width, double height) {
		this.image = image;
		length = 1;
		if (width == -1) {
			Rectangle2D rect = image.getBounds();
			metrics = new RcplGlyphMetrics(rect.getHeight(), 0, rect.getWidth());
		} else {
			// JORectangle rect = image.getBounds();
			metrics = new RcplGlyphMetrics(height, 0, width);
		}
	}

	//
	// public void setShadow(CTOnOff Shadow) {
	// this.shadow = Shadow;
	// }

	//
	/**
	 * @param indent
	 */
	@Override
	public void setIndent(IJOProperty indent) {
		this.indent = indent;
	}

	@Override
	public void setItalic(boolean italic) {
		if (italic) {
			getFont().setStyle(getFont().getStyle() | Rcpl.ITALIC);
		} else {
			getFont().setStyle(getFont().getStyle() & ~Rcpl.ITALIC);
		}
		// if (italic) {
		// fontStyle |= JO.ITALIC;
		// } else {
		// fontStyle &= ~JO.ITALIC;
		// }
		updateFont();
	}

	//
	// public void setItalic(CTOnOff italic) {
	// if (italic != null) {
	// setItalic(true);
	// }
	// updateFont();
	// }
	//
	// public void setJc(CTJc jc) {
	// this.jc = jc;
	// }
	//
	// public void setKeepLines(CTOnOff keepLines) {
	// this.keepLines = keepLines;
	// }
	//
	@Override
	public void setKeepNext(CTOnOff keepNext) {
		this.keepNext = keepNext;
	}

	//
	// public void setKinsoku(CTOnOff kinsoku) {
	// this.kinsoku = kinsoku;
	// }
	//
	@Override
	public void setLength(int length) {
		this.length = length;
	}

	//
	// public void setLineHeight(int lineHeight) {
	// this.lineHeight = lineHeight;
	// }
	//
	// public void setLocked(boolean locked) {
	// this.locked = locked;
	// }
	//
	// public void setMirrorIdents(CTOnOff mirrorIdents) {
	// this.mirrorIdents = mirrorIdents;
	// }
	//
	public void setName(String name) {
		this.name = name;
	}

	//
	public void setNextStyle(IStyle nextStyle) {
		this.nextStyle = nextStyle;
	}

	//
	// public void setNoProof(CTOnOff NoProof) {
	// this.noProof = NoProof;
	// }
	//
	// public void setNumPr(CTNumPr numPr) {
	// this.numPr = numPr;
	// }
	//
	// public void setoMath(CTOnOff oMath) {
	// this.oMath = oMath;
	// }
	//
	// public void setOMath(CTOnOff OMath) {
	// this.oMath = OMath;
	// }
	//
	// public void setOutline(CTOnOff Outline) {
	// this.outline = Outline;
	// }
	//
	// public void setOutlineLvl(CTDecimalNumber outlineLvl) {
	// this.outlineLvl = outlineLvl;
	// }
	//
	// public void setOverflowPunct(CTOnOff overflowPunct) {
	// this.overflowPunct = overflowPunct;
	// }
	//
	// /**
	// * @param pageBreakBefore
	// */
	@Override
	public void setPageBreakBefore(IJOProperty pageBreakBefore) {
		this.pageBreakBefore = pageBreakBefore;
	}

	//
	// /**
	// * @param Underline
	// */
	// public void setUnderline(STUnderline.Enum underline2) {
	// if (underline2 != null) {
	// this.underline2 = underline2;
	// if (underline2.equals(STUnderline.DOUBLE)) {
	// fontStyle |= JO.UNDERLINE_DOUBLE;
	// } else if (underline2.equals(STUnderline.DASH)) {
	// fontStyle |= JO.UNDERLINE_SQUIGGLE;
	// } else if (underline2.equals(STUnderline.DOTTED)) {
	// fontStyle |= JO.UNDERLINE_SQUIGGLE;
	// } else {
	// fontStyle |= JO.UNDERLINE_SINGLE;
	// }
	// underline = true;
	// }
	// }
	//
	// public void setUnderline2(STUnderline.Enum underline2) {
	// this.underline2 = underline2;
	// }
	//
	// public void setUnhideWhenUsed(boolean unhideWhenUsed) {
	// this.unhideWhenUsed = unhideWhenUsed;
	// }
	//
	// /**
	// * @param subScript
	// */
	// public void setVertivalAlign(JOBoolean verticalAlign) {
	// this.verticalAlign = verticalAlign;
	// if (verticalAlign != null) {
	// if (verticalAlign.get()) {
	// if (originalFont == null) {
	// originalFont = font;
	// font = JO.fontProvider.loadHalfSizeFont(font);
	// }
	// }
	// }
	// }
	//
	// public void setWidowControl(CTOnOff widowControl) {
	// this.widowControl = widowControl;
	// }
	//
	// public void setWordWrap(CTOnOff wordWrap) {
	// this.wordWrap = wordWrap;
	// }

	//
	// public void setParaRPr(CTParaRPr paraRPr) {
	// this.paraRPr = paraRPr;
	// }
	//
	// public void setpBdr(CTPBdr pBdr) {
	// this.pBdr = pBdr;
	// }
	//
	// public void setpPrChange(CTPPrChange pPrChange) {
	// this.pPrChange = pPrChange;
	// }
	//
	// public void setPrChange(CTRPrChange PrChange) {
	// this.PrChange = PrChange;
	// }
	//
	// public void setpStyle(CTString pStyle) {
	// this.pStyle = pStyle;
	// }
	//
	// public void setqFormat(boolean qFormat) {
	// this.qFormat = qFormat;
	// }
	//
	// public void setrFonts(CTFonts rFonts) {
	// this.rFonts = rFonts;
	// }
	//
	// public void setRFonts(CTFonts fonts) {
	// rFonts = fonts;
	// }
	//
	// public void setRtl(CTOnOff Rtl) {
	// this.rtl = Rtl;
	// }
	//
	// public void setSectPr(CTSectPr sectPr) {
	// this.sectPr = sectPr;
	// }
	//
	// public void setSemiHidden(boolean semiHidden) {
	// this.semiHidden = semiHidden;
	// }
	//
	@Override
	public void setShading(EnShading shading) {
		this.shading = shading;
	}

	// public void setShd(CTShd shd) {
	// this.shd = shd;
	// }
	//
	// public void setSmallCaps(CTOnOff SmallCaps) {
	// this.smallCaps = SmallCaps;
	// }
	//
	// public void setSnapToGrid(CTOnOff snapToGrid) {
	// this.snapToGrid = snapToGrid;
	// }
	//
	// public void setSnapToGrip(CTOnOff SnapToGrip) {
	// this.snapToGrip = SnapToGrip;
	// }
	//
	@Override
	public void setSpacingAfter(IProperty2 spacingAfter) {
		this.spacingAfter = spacingAfter;
	}

	//
	@Override
	public void setSpacingBefore(IProperty2 spacingBefore) {
		this.spacingBefore = spacingBefore;
	}

	//
	@Override
	public void setStart(int start) {
		this.start = start;

	}

	//
	// public void setStrikeThrough(boolean strike) {
	// strikeout = strike;
	// }
	//
	// /**
	// * @param strikeThrough
	// */
	// public void setStrikeThrough(JOBoolean strikeThrough) {
	// this.strikeThrough = strikeThrough;
	// strikeout = isStrikeThrough();
	// }
	//
	// public void setStyle(JOStyle style) {
	// this.style = style;
	// }
	//
	// public void setStyleBorder(CTBorder styleBorder) {
	// this.styleBorder = styleBorder;
	// }
	//
	// public void setStyleHpsMeasure(CTHpsMeasure styleHpsMeasure) {
	// this.styleHpsMeasure = styleHpsMeasure;
	// }
	//
	public void setStyleTemplate(IStyleTemplate styleTemplate) {
		this.styleTemplate = styleTemplate;
	}

	// public void setStyleTextScale(CTTextScale styleTextScale) {
	// this.styleTextScale = styleTextScale;
	// }
	//
	// public void setStyleUnderline(CTUnderline styleUnderline) {
	// this.styleUnderline = styleUnderline;
	// }
	//
	// public void setSubScript(boolean subScript) {
	// this.subScript = subScript;
	// if (originalFont == null) {
	// originalFont = font;
	// font = JO.fontProvider.loadHalfSizeFont(font);
	// }
	// }
	//
	// public void setSuperScript(boolean superScript) {
	// this.superScript = superScript;
	// if (originalFont == null) {
	// originalFont = font;
	// font = JO.fontProvider.loadHalfSizeFont(font);
	// }
	// }
	//
	// public void setSuppressAutoHyphens(CTOnOff suppressAutoHyphens) {
	// this.suppressAutoHyphens = suppressAutoHyphens;
	// }
	//
	// public void setSuppressLineNumbers(CTOnOff suppressLineNumbers) {
	// this.suppressLineNumbers = suppressLineNumbers;
	// }
	//
	// public void setSuppressOverlap(CTOnOff suppressOverlap) {
	// this.suppressOverlap = suppressOverlap;
	// }
	//
	@Override
	public void setTabs(Object tabs) {
		this.tabs = tabs;
	}

	@Override
	public void setTextAlignment(IJOProperty alignment) {
		this.textAlignment = alignment;

	}

	//
	// public void setTextBoxTightWrap(CTTextboxTightWrap textBoxTightWrap) {
	// this.textBoxTightWrap = textBoxTightWrap;
	// }
	//
	// public void setTextDirection(CTTextDirection textDirection) {
	// this.textDirection = textDirection;
	// }
	//
	// public void setTextEffect(STTextEffect.Enum TextEffect) {
	// if (TextEffect != null) {
	// this.textEffect = TextEffect;
	// }
	// }
	//
	// public void setTextScale(CTTextScale TextScale) {
	// this.textScale = TextScale;
	// }
	//
	// public void setTopLinePunct(CTOnOff topLinePunct) {
	// this.topLinePunct = topLinePunct;
	// }
	//
	public void setType(EStyleType type) {
		this.type = type;
	}

	//
	// public void setUiPriority(BigInteger uiPriority) {
	// this.uiPriority = uiPriority;
	// }
	//
	@Override
	public void setUnderline(boolean underline) {
		// if (underline) {
		// getFont().get |= JO.UNDERLINE_SINGLE;
		// this.underline = true;
		//
		// } else {
		// fontStyle &= ~JO.UNDERLINE_SINGLE;
		// this.underline = false;
		// this.underline2 = null;
		// }
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("style id: " + getId() == null ? "" : getId()); //$NON-NLS-1$//$NON-NLS-2$
		buffer.append("; "); //$NON-NLS-1$
		buffer.append("start: " + start); //$NON-NLS-1$
		buffer.append("; "); //$NON-NLS-1$
		buffer.append("length: " + length); //$NON-NLS-1$
		buffer.append("; "); //$NON-NLS-1$
		buffer.append("font: "); //$NON-NLS-1$

		if (isBold()) {
			buffer.append("bold,"); //$NON-NLS-1$
		}
		if (isItalic()) {
			buffer.append("italic,"); //$NON-NLS-1$
		}
		if (underline) {
			buffer.append("underline,"); //$NON-NLS-1$
		}
		if (isStrikeThrough()) {
			buffer.append("strikeThrough,"); //$NON-NLS-1$
		}

		buffer.append(",h=" + //$NON-NLS-1$

		getFont().getHeight()); // $NON-NLS-1$
		buffer.append(",n=" + getFont().getName()); //$NON-NLS-1$
		buffer.append("; "); //$NON-NLS-1$
		// if (image != null) {
		// buffer.append(" image=true;"); //$NON-NLS-1$
		// }
		if (drawing != null) {
			buffer.append(" drawing=true;"); //$NON-NLS-1$
		}
		return buffer.toString();
	}

	/**
	 * 
	 */
	@Override
	public void updateFont() {
		font = Rcpl.fontProvider().loadFont(getFont().getName(), getFont().getHeight(), getFont().getStyle());
	}

	@Override
	public void setTemplateStyle() {
		templateStyle = true;
	}

	@Override
	public boolean isTemplateStyle() {
		return templateStyle;
	}

	@Override
	public IProperty2 getSpacingLine() {
		return spacingLine;
	}

	@Override
	public void setSpacingLine(IProperty2 spacingLine) {
		this.spacingLine = spacingLine;
	}

	@Override
	public IEmuProperty2 getCellMarginLeft() {
		return cellMarginLeft;
	}

	@Override
	public void setCellMarginLeft(IEmuProperty2 cellMarginLeft) {
		this.cellMarginLeft = cellMarginLeft;
	}

	public IEmuProperty2 getCellMarginRight() {
		return cellMarginRight;
	}

	@Override
	public void setCellMarginRight(IEmuProperty2 cellMarginRight) {
		this.cellMarginRight = cellMarginRight;
	}

	@Override
	public IEmuProperty2 getCellMarginTop() {
		return cellMarginTop;
	}

	@Override
	public void setCellMarginTop(IEmuProperty2 cellMarginTop) {
		this.cellMarginTop = cellMarginTop;
	}

	@Override
	public IEmuProperty2 getCellMarginBottom() {
		return cellMarginBottom;
	}

	@Override
	public void setCellMarginBottom(IEmuProperty2 cellMarginBottom) {
		this.cellMarginBottom = cellMarginBottom;
	}

	@Override
	public double getCellMarginLeftPixel() {
		if (cellMarginLeft != null) {
			return cellMarginLeft.get().toPixel();
		}
		return 0;
	}

	@Override
	public double getCellMarginRightPixel() {
		if (cellMarginRight != null) {
			return cellMarginRight.get().toPixel();
		}
		return 0;
	}

	@Override
	public double getCellMarginTopPixel() {
		if (cellMarginTop != null) {
			return cellMarginTop.get().toPixel();
		}
		return 0;
	}

	@Override
	public double getCellMarginBottomPixel() {
		if (cellMarginBottom != null) {
			return cellMarginBottom.get().toPixel();
		}
		return 0;
	}

}