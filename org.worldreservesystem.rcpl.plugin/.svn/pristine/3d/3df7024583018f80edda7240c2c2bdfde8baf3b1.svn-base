/******************************************************************************
 *    Ramin Assisi
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EStyleType;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IEmu;
import org.eclipse.rcpl.IEmuProperty2;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.JOFontScheme;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.util.JOUtil2;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinMiterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinRound;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineCap;
import org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;

import com.joffice.rcpl.plugin.office.JOBorder;
import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyFactory;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyIndent;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyOnOff;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTextAlign;
import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;
import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;
import com.joffice.rcpl.plugin.office.databinding2.JODXAProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20ThPointProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOLineSpacingProperty;
import com.joffice.rcpl.plugin.office.internal.model.word.JOWordDocument;

/**
 * @author ramin
 * 
 */
public class JOStyleTemplate implements IStyleTemplate {

	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOStyleTemplate.class);

	private CTOfficeArtExtensionList themeArts;
	private CTStyleMatrix themeStyleMatrix;
	private JOFontScheme themeFontScheme;

	private Hashtable<String, XmlObject> templateXml = new Hashtable<String, XmlObject>();

	private String name;

	private JOWordDocument dotxDocument;

	public JOStyleTemplate() {

	}

	public JOStyleTemplate(File file) {
		loadTemplateDocument(file);
	}

	public JOStyleTemplate(String templateName) {
		loadTemplateDocument(JOUtil2.loadTemplateDocumentToFile(templateName, false));
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	private File templateFile2;

	public void setTemplateFile(File templateFile) {
		this.templateFile2 = templateFile;
	}

	public File getTemplateFile() {
		return this.templateFile2;
	}

	private List<IStyle> styles = new ArrayList<IStyle>();

	public void addStyle(JOStyle style) {
		styles.add(style);
	}

	public IStyle getStyle(int index) {
		return styles.get(index);
	}

	public int getStyleCount() {
		return styles.size();
	}

	private JOStyle defaultStyle;

	private IStyle normalStyle;

	/**
	 * @param id
	 * @return
	 */
	@Override
	public IStyle findStyle(String id) {
		if ("Normal".equals(id) && normalStyle != null) {
			return normalStyle;
		}
		for (IStyle st : styles) {
			if (st.getId().equals(id)) {
				if (normalStyle == null && "Normal".equals(id)) {
					normalStyle = st;
				}
				return st;
			}
		}
		return null;
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public IStyle findStyleByName(String styleName) {
		for (IStyle st : styles) {
			if (st.getFont().getName().equals(styleName)) {
				return st;
			}
		}
		return null;
	}

	/**
	 * @return
	 */
	@Override
	public IStyle getDefaultStyle() {
		if (normalStyle == null) {
			normalStyle = findStyle("Normal");
		}
		return normalStyle;
	}

	public void setDefaultStyle(JOStyle defaultStyle) {
		this.defaultStyle = defaultStyle;
	}

	private STPenAlignment.Enum penAlgnt;

	public STPenAlignment.Enum getPenAlgnt() {
		return penAlgnt;
	}

	public void setPenAlgnt(STPenAlignment.Enum penAlgnt) {
		this.penAlgnt = penAlgnt;
	}

	public CTLineJoinBevel getBevel() {
		return bevel;
	}

	public void setBevel(CTLineJoinBevel bevel) {
		this.bevel = bevel;
	}

	public STLineCap.Enum getCap() {
		return cap;
	}

	public void setCap(STLineCap.Enum cap) {
		this.cap = cap;
	}

	public CTDashStopList getCustDash() {
		return custDash;
	}

	public void setCustDash(CTDashStopList custDash) {
		this.custDash = custDash;
	}

	public CTOfficeArtExtensionList getExtLst() {
		return extLst;
	}

	public void setExtLst(CTOfficeArtExtensionList extLst) {
		this.extLst = extLst;
	}

	public CTGradientFillProperties getGradFill() {
		return gradFill;
	}

	public void setGradFill(CTGradientFillProperties gradFill) {
		this.gradFill = gradFill;
	}

	public CTLineEndProperties getHeadEnd() {
		return headEnd;
	}

	public void setHeadEnd(CTLineEndProperties headEnd) {
		this.headEnd = headEnd;
	}

	public CTLineJoinMiterProperties getMiter() {
		return miter;
	}

	public void setMiter(CTLineJoinMiterProperties miter) {
		this.miter = miter;
	}

	public CTNoFillProperties getNoFill() {
		return noFill;
	}

	public void setNoFill(CTNoFillProperties noFill) {
		this.noFill = noFill;
	}

	public CTPatternFillProperties getFill() {
		return fill;
	}

	public void setFill(CTPatternFillProperties fill) {
		this.fill = fill;
	}

	public CTPresetLineDashProperties getPrstDash() {
		return prstDash;
	}

	public void setPrstDash(CTPresetLineDashProperties prstDash) {
		this.prstDash = prstDash;
	}

	public CTLineJoinRound getRound() {
		return round;
	}

	public void setRound(CTLineJoinRound round) {
		this.round = round;
	}

	public CTSolidColorFillProperties getSolidFill() {
		return solidFill;
	}

	public void setSolidFill(CTSolidColorFillProperties solidFill) {
		this.solidFill = solidFill;
	}

	public CTLineEndProperties getTailEnd() {
		return tailEnd;
	}

	public void setTailEnd(CTLineEndProperties tailEnd) {
		this.tailEnd = tailEnd;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	private CTLineJoinBevel bevel;
	private STLineCap.Enum cap;
	private CTDashStopList custDash;
	private CTOfficeArtExtensionList extLst;
	private CTGradientFillProperties gradFill;
	private CTLineEndProperties headEnd;
	private CTLineJoinMiterProperties miter;
	private CTNoFillProperties noFill;
	private CTPatternFillProperties fill;
	private CTPresetLineDashProperties prstDash;
	private CTLineJoinRound round;
	private CTSolidColorFillProperties solidFill;
	private CTLineEndProperties tailEnd;
	private int w;
	// private XWPFDocument xml;
	private CTStyle[] styleArray;
	private CTPPrDefault ctpPrDefault;
	private CTRPrDefault ctrPrDefault;

	/**
	 * @param templateFile
	 */
	@Override
	public void loadTemplateDocument(File templateFile) {

		try {

			RCPLModel.log(this, "loadTemplateDocument");
			dotxDocument = new JOWordDocument(templateFile, false, true, null, false);
			RCPLModel.log(this, "setXML");

			dotxDocument.setXml(new XWPFDocument(POIXMLDocument.openPackage(templateFile.toString())));
			RCPLModel.log(this, "processSection");
			dotxDocument.processSection();
			setTemplateFile(templateFile);
			String templateFileNme = templateFile.getName();
			int pos = templateFileNme.indexOf("."); //$NON-NLS-1$
			if (pos != -1) {
				templateFileNme = templateFileNme.substring(0, pos);
			}
			setName(templateFileNme);
			RCPLModel.log(this, "loadTemplateDocument");
			loadTemplateDocument((XWPFDocument) dotxDocument.getXml());
			if (templateFile.getName().endsWith("dotx")) { //$NON-NLS-1$
				createObjects();
			}
			// } catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		} catch (Exception e) {
			RCPLModel.logError(e);
		}

	}

	/**
	 * @param xml
	 */
	@Override
	@SuppressWarnings("deprecation")
	public void loadTemplateDocument(XWPFDocument poiDoc) {
		if (dotxDocument == null) {
			dotxDocument = new JOWordDocument(poiDoc, false, true, null, false);
		}

		// this.xml = poiDoc;
		try {

			// OOXMLStyle noStyle = new OOXMLStyle("nostyle", "No Style");
			// noStyle.font = OOXMLFontProvider.loadSystemFont();
			// addStyle(noStyle);

			CTFontsList fontsList = JOUtil2.getFontTable(poiDoc);

			CTFont[] fonts2 = fontsList.getFontArray();

			for (CTFont ctFont : fonts2) {
				ctFont.getName();
			}

			CTOfficeStyleSheet theme = JOUtil2.getThemes(poiDoc);
			CTBaseStyles themeStyles = theme.getThemeElements();

			Rcpl.colorProvider().createColorScheme(themeStyles.getClrScheme());

			themeArts = themeStyles.getExtLst();
			themeStyleMatrix = themeStyles.getFmtScheme();

			CTLineProperties[] lineStyles = themeStyles.getFmtScheme().getLnStyleLst().getLnArray();

			for (CTLineProperties ctLineProperties : lineStyles) {
				penAlgnt = ctLineProperties.getAlgn();
				bevel = ctLineProperties.getBevel();
				cap = ctLineProperties.getCap();
				custDash = ctLineProperties.getCustDash();
				extLst = ctLineProperties.getExtLst();
				gradFill = ctLineProperties.getGradFill();
				headEnd = ctLineProperties.getHeadEnd();
				miter = ctLineProperties.getMiter();
				noFill = ctLineProperties.getNoFill();
				fill = ctLineProperties.getPattFill();
				prstDash = ctLineProperties.getPrstDash();
				round = ctLineProperties.getRound();
				solidFill = ctLineProperties.getSolidFill();
				tailEnd = ctLineProperties.getTailEnd();
				w = ctLineProperties.getW();
			}

			themeStyles.getFmtScheme().getName();

			themeFontScheme = new JOFontScheme(themeStyles.getFontScheme());

			CTStyles templateStyles = poiDoc.getStyle();
			CTDocDefaults docDefaults = templateStyles.getDocDefaults();
			ctpPrDefault = docDefaults.getPPrDefault();
			ctrPrDefault = docDefaults.getRPrDefault();

			// ---------- STYLES -----------------------------------------------

			styleArray = templateStyles.getStyleArray();

			for (CTStyle ctStyle : styleArray) {

				String id = ctStyle.getStyleId();

				// System. out.("*********** id: " + id);
				// if ("NormaleTabelle".equals(id) ||
				// "NormaleTabelle".equals(ctStyle.getName())) {
				// System.out.println();
				// }

				JOStyle style = new JOStyle(ctStyle, this);
				CTString basedOn = ctStyle.getBasedOn();
				if (basedOn != null) {
					IStyle basedOnStyle = getParagraphStyleById(basedOn.getVal());
					if (basedOnStyle != null) {
						basedOnStyle.copyAttributesTo(style);
						style.setBasedOnStyle(basedOnStyle);
					}
				}

				CTString nextSt = ctStyle.getNext();
				if (nextSt != null) {
					IStyle nextStyle = getParagraphStyleById(nextSt.getVal());
					// JOStyle.copyAttributes(nextStyle, style);
					style.setNextStyle(nextStyle);
				}
				ctStyle.getPersonal();
				ctStyle.getPersonalCompose();
				ctStyle.getPersonalReply();
				ctStyle.getAliases();
				ctStyle.getAutoRedefine();
				ctStyle.getCustomStyle();
				ctStyle.getDefault();
				ctStyle.getHidden();
				ctStyle.getLink();
				ctStyle.getTblStylePrArray();
				ctStyle.getTcPr();
				ctStyle.getTrPr();

				if (ctStyle.getTblPr() != null) {

					CTTblCellMar tcMargin = ctStyle.getTblPr().getTblCellMar();
					if (tcMargin != null) {
						IEmuProperty2 bottom = new JODXAProperty(null, ctStyle.getTblPr(), tcMargin, "Bottom",
								new String[] { "bottomMargin" }, EValueType.MEASUREMENT);
						style.setCellMarginBottom(bottom);
						IEmuProperty2 top = new JODXAProperty(null, ctStyle.getTblPr(), tcMargin, "Top",
								new String[] { "topMargin" }, EValueType.MEASUREMENT);
						style.setCellMarginTop(top);
						IEmuProperty2 left = new JODXAProperty(null, ctStyle.getTblPr(), tcMargin, "Left",
								new String[] { "leftMargin" }, EValueType.MEASUREMENT);
						style.setCellMarginLeft(left);
						IEmuProperty2 right = new JODXAProperty(null, ctStyle.getTblPr(), tcMargin, "Right",
								new String[] { "rightMargin" }, EValueType.MEASUREMENT);
						style.setCellMarginRight(right);
					}

				}

				// style.setLocked(ctStyle.getLocked() != null);
				// style.setqFormat(ctStyle.getQFormat() != null);
				// style.setSemiHidden(ctStyle.getSemiHidden() != null);
				style.setType(EStyleType.create(ctStyle.getType()));

				// if (ctStyle.getUiPriority() != null) {
				// style.setUiPriority(ctStyle.getUiPriority().getVal());
				// style.setUnhideWhenUsed(ctStyle.getUnhideWhenUsed() != null);
				// }
				// ---------- Paragraph Styles ---------------------------------

				pPr(ctStyle.getPPr(), ctpPrDefault, style);

				// ---------- Rich Text (Run) Properties -----------------------

				rPr(ctStyle, ctrPrDefault, style);

				if (ctStyle.isSetDefault()) {
					if (defaultStyle == null) {
						defaultStyle = style;
					}
				}

				style.updateFont();
				addStyle(style);

			}

			CTLatentStyles latentStyles = templateStyles.getLatentStyles();
			CTLsdException[] lsdExceptions = latentStyles.getLsdExceptionArray();

			for (CTLsdException ctLsdException : lsdExceptions) {
				ctLsdException.getQFormat();
				String ctLsdExceptionName = ctLsdException.getName();
				JOStyle style = (JOStyle) getParagraphStyleByName(ctLsdExceptionName);
				if (style != null) {
					// style.setUiPriority(ctLsdException.getUiPriority());
					// style.setLocked(ctLsdException.getLocked() != null);
					// style.setqFormat(ctLsdException.getQFormat() != null);
					// style.setSemiHidden(ctLsdException.getSemiHidden() !=
					// null);
					// style.setUnhideWhenUsed(ctLsdException.getUnhideWhenUsed()
					// != null);
				}
			}

		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		} catch (XmlException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}

		createObjects();

	}

	@Override
	public IStyle createClonedStyle(IStyle paragraphStyle) {
		IStyle style = new JOStyle(paragraphStyle.getId(), paragraphStyle.getName(), this);
		for (CTStyle ctStyle : styleArray) {
			if (paragraphStyle.getId().equals(ctStyle.getStyleId())) {
				pPr(ctStyle.getPPr(), ctpPrDefault, style);
				rPr(ctStyle, ctrPrDefault, style);
				break;
			}
		}
		return style;
	}

	/**
	 * @param ctStyle
	 * @param ctpPrDefault
	 * @param style
	 */
	private void pPr(CTPPr ctpPr, CTPPrDefault prDefault, IStyle style) {

		if (ctpPr == null && prDefault != null) {
			ctpPr = prDefault.getPPr();
		}
		if (ctpPr != null) {
			if (ctpPr.getSpacing() != null) {
				CTSpacing spacing = ctpPr.getSpacing();
				if (spacing != null) {
					style.setSpacingBefore(
							new JOEmu20ThPointProperty(null, ctpPr, spacing, "Before", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					style.setSpacingAfter(
							new JOEmu20ThPointProperty(null, ctpPr, spacing, "After", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					style.setSpacingLine(
							new JOLineSpacingProperty(null, ctpPr, spacing, "Line", null, EValueType.MEASUREMENT)); //$NON-NLS-1$

					double spl = (Double) style.getSpacingLine().get();

					if (spl > 0) {
						System.out.println();
					}
				}
			}

			CTParaRPr ctParaRPr = ctpPr.getRPr();
			if (ctParaRPr != null) {
				style.setFonts(ctParaRPr.getRFonts());
				CTHpsMeasure charStyleHpsMeasure = ctParaRPr.getSz();
				if (charStyleHpsMeasure != null && charStyleHpsMeasure.getVal() != null) {
					float h1 = charStyleHpsMeasure.getVal().floatValue();
					style.getFont().setHeight(h1 / 2.0f);
				}
			}

			// style.setDjustRightInd(ctpPr.getAdjustRightInd());
			// style.setAutoSpaceDE(ctpPr.getAutoSpaceDE());
			// style.setAutoSpaceDN(ctpPr.getAutoSpaceDN());
			// style.setBidi(ctpPr.getBidi());
			// style.setCnfStyle(ctpPr.getCnfStyle());
			// style.setContextualSpacing(ctpPr.getContextualSpacing());
			// style.setDivId(ctpPr.getDivId());
			// style.setFramePr(ctpPr.getFramePr());

			if (ctpPr.getInd() != null) {
				style.setIndent(new JOPropertyIndent<JOIndent>(null, ctpPr, ctpPr.getInd(), "indent", true)); //$NON-NLS-1$
			}

			if (ctpPr.getJc() != null) {
				style.setTextAlignment(new JOPropertyTextAlign<JOAlignment>(null, ctpPr, ctpPr.getJc(), null));
			}
			// style.setKeepLines(ctpPr.getKeepLines());
			// style.setKeepNext(ctpPr.getKeepNext());
			// style.setKinsoku(ctpPr.getKinsoku());
			// style.setMirrorIdents(ctpPr.getMirrorIndents());
			// style.setNumPr(ctpPr.getNumPr());
			//
			// style.setOutlineLvl(ctpPr.getOutlineLvl());

			// style.setOverflowPunct(ctpPr.getOverflowPunct());
			if (ctpPr.getPageBreakBefore() != null) {
				style.setPageBreakBefore(new JOPropertyOnOff<Boolean>(null, ctpPr, ctpPr.getPageBreakBefore(), true));
			}

			if (ctpPr.getPBdr() != null) {
				style.setBorder(new JOBorder(null, ctpPr.getPBdr()));
			}

			// style.setpBdr(ctpPr.getPBdr());
			// style.setpPrChange(ctpPr.getPPrChange());

			// ---------- RICH TEXT PROPERTIES -----------------------------

			// style.setParaRPr(ctpPr.getRPr());

			if (ctpPr.getRPr() != null) {
				style.setBold(ctpPr.getRPr().getB() != null);
				ctpPr.getRPr().getBCs();
				// style.setBorder(ctpPr.getRPr().getBdr());
				// style.setCaps(ctpPr.getRPr().getCaps());
				style.setForeground(Rcpl.colorProvider().get(ctpPr.getRPr().getColor()));
				ctpPr.getRPr().getCs();
				ctpPr.getRPr().getDel();
				ctpPr.getRPr().getDstrike();
				ctpPr.getRPr().getEastAsianLayout();
				ctpPr.getRPr().getEffect();
				ctpPr.getRPr().getEm();
				ctpPr.getRPr().getEmboss();
				ctpPr.getRPr().getFitText();
				ctpPr.getRPr().getHighlight();
				ctpPr.getRPr().getI();
				ctpPr.getRPr().getICs();
				ctpPr.getRPr().getImprint();
				ctpPr.getRPr().getIns();
				ctpPr.getRPr().getKern();
				ctpPr.getRPr().getLang();
				ctpPr.getRPr().getMoveFrom();
				ctpPr.getRPr().getMoveTo();
				ctpPr.getRPr().getNoProof();
				ctpPr.getRPr().getOMath();
				ctpPr.getRPr().getOutline();
				ctpPr.getRPr().getPosition();
				ctpPr.getRPr().getRFonts();
				ctpPr.getRPr().getRPrChange();
				ctpPr.getRPr().getRPrChange();
				ctpPr.getRPr().getRStyle();
				ctpPr.getRPr().getRtl();
				ctpPr.getRPr().getShadow();
				ctpPr.getRPr().getShd();
				ctpPr.getRPr().getSmallCaps();
				ctpPr.getRPr().getSnapToGrid();
				ctpPr.getRPr().getSpacing();
				ctpPr.getRPr().getSpecVanish();
				ctpPr.getRPr().getStrike();
				ctpPr.getRPr().getSz();
				ctpPr.getRPr().getSzCs();
				ctpPr.getRPr().getU();
				ctpPr.getRPr().getVanish();
				ctpPr.getRPr().getVertAlign();
				ctpPr.getRPr().getW();
				ctpPr.getRPr().getWebHidden();
			}
			// style.setpStyle(ctpPr.getPStyle());
			// style.setSectPr(ctpPr.getSectPr());
			// style.setShd(ctpPr.getShd());
			// style.setSnapToGrid(ctpPr.getSnapToGrid());
			// style.setSuppressAutoHyphens(ctpPr.getSuppressAutoHyphens());
			// style.setSuppressLineNumbers(ctpPr.getSuppressLineNumbers());
			// style.setSuppressOverlap(ctpPr.getSuppressOverlap());
			style.setTabs(JOPropertyFactory.create(null, ctpPr, ctpPr.getTabs(), true));
			// style.setTextAlignment(ctpPr.getTextAlignment());
			// style.setTextBoxTightWrap(ctpPr.getTextboxTightWrap());
			// style.setTextDirection(ctpPr.getTextDirection());
			// style.setTopLinePunct(ctpPr.getTopLinePunct());
			// style.setWidowControl(ctpPr.getWidowControl());
			// style.setWordWrap(ctpPr.getWordWrap());

		}

	}

	// private Hashtable<String, CTPicture> templatePics = new Hashtable<String,
	// CTPicture>();
	//
	// private Hashtable<String, CTTbl> templateTables = new Hashtable<String,
	// CTTbl>();
	//
	// private Hashtable<String, CTDrawing> templateDrawings = new
	// Hashtable<String, CTDrawing>();
	//
	// private Hashtable<String, CTSimpleField> templateFields = new
	// Hashtable<String, CTSimpleField>();

	// public CTPicture getTemplatePicObject(String name) {
	// return templatePics.get(name);
	// }
	//
	// public CTSimpleField getTemplateFieldObject(String name) {
	// return templateFields.get(name);
	// }
	//
	// public CTTbl getTemplateTableObject(String name) {
	// return templateTables.get(name);
	// }
	//
	// public CTDrawing getTemplateDrawingObject(String name) {
	// return templateDrawings.get(name);
	// }

	/**
	 * 
	 */
	@SuppressWarnings("deprecation")
	private void createObjects() {
		List<String> tableNames = new ArrayList<String>();
		List<XWPFParagraph> paragraphs = ((XWPFDocument) dotxDocument.getXml()).getParagraphs();
		for (XWPFParagraph p : paragraphs) {
			String s = p.getText();
			CTR[] ctrs = p.getCTP().getRArray();
			if (s.startsWith("field_")) { //$NON-NLS-1$
				CTSimpleField[] ctFields = p.getCTP().getFldSimpleArray();
				if (ctFields != null && ctFields.length > 0) {
					templateXml.put(s, ctFields[0]);
				} else {
					templateXml.put(s, p.getCTP());
				}

			} else if (s.startsWith("table_")) { //$NON-NLS-1$
				tableNames.add(s);
			} else if (s.startsWith("shape_")) { //$NON-NLS-1$
				if (ctrs != null && ctrs.length > 0) {
					CTPicture pics[] = ctrs[0].getPictArray();
					if (pics != null && pics.length > 0) {
						templateXml.put(s, pics[0]);
					}
				}
			} else if (s.startsWith("textbox_")) { //$NON-NLS-1$
				if (ctrs != null && ctrs.length > 0) {
					CTPicture pics[] = ctrs[0].getPictArray();
					if (pics != null && pics.length > 0) {
						templateXml.put(s, pics[0]);
					}
				}
			} else if (s.startsWith("image_")) { //$NON-NLS-1$
				if (ctrs != null && ctrs.length > 0) {
					CTDrawing[] drawings = ctrs[0].getDrawingArray();
					if (drawings != null && drawings.length > 0) {
						templateXml.put(s, drawings[0]);
					}
				}
			}

			int pos = s.indexOf("\n"); //$NON-NLS-1$
			if (pos != -1) {
				s = s.substring(0, pos);
			}

		}

		Iterator<XWPFTable> it = ((XWPFDocument) dotxDocument.getXml()).getTablesIterator();
		int i = 0;
		while (it.hasNext()) {
			XWPFTable t = it.next();
			try {
				if (i < tableNames.size()) {
					templateXml.put(tableNames.get(i++), t.getCTTbl());
				}
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
				break;
			}
		}

	}

	/**
	 * read the Richtext Properties
	 * 
	 * @param ctStyle
	 * @param ctrPrDefault
	 * @param style
	 */
	@SuppressWarnings({ "unused" })
	private void rPr(CTStyle ctStyle, CTRPrDefault ctrPrDefault, IStyle style) {
		CTRPr ctrPr = ctStyle.getRPr();

		if (ctrPr == null && ctrPrDefault != null) {
			// ctrPr = ctrPrDefault.getRPr();
		}

		// if (ctrPr.getB() != null) {
		// style.fontStyle |= SWT.BOLD;
		// }
		// if (ctrPr.getI() != null) {
		// style.fontStyle |= SWT.BOLD;
		// }

		if (ctrPr != null) {
			style.setFonts(ctrPr.getRFonts());
			CTSignedTwipsMeasure spacing = ctrPr.getSpacing();

			CTHpsMeasure charStyleHpsMeasure = ctrPr.getSz();
			if (charStyleHpsMeasure != null && charStyleHpsMeasure.getVal() != null) {

				float h1 = charStyleHpsMeasure.getVal().floatValue();
				float fontHeight = h1 / 2.0f;
				style.getFont().setHeight(fontHeight);
			}

			// style.setTextEffect(ctrPr.getEffect() != null ? ctrPr.getEffect()
			// .getVal() : null);
			//
			// style.setBcs(ctrPr.getBCs());
			// style.setCaps(ctrPr.getCaps());
			// style.setCs(ctrPr.getCs());
			// style.setStrikeThrough(ctrPr.getStrike() != null ? new JOBoolean(
			// null, ctStyle, ctrPr, "Strike", //$NON-NLS-1$
			// new String[] { "word/actions/font/strikethrough" }) //$NON-NLS-1$
			// : null);
			// style.setEmboss(ctrPr.getEmboss());
			// style.setImprint(ctrPr.getImprint());
			// style.setNoProof(ctrPr.getNoProof());
			// style.setOMath(ctrPr.getOMath());
			// style.setOutline(ctrPr.getOutline());
			// style.setRtl(ctrPr.getRtl());
			// style.setCtShd(ctrPr.getShd());
			// style.setShadow(ctrPr.getShadow());
			// style.setSmallCaps(ctrPr.getSmallCaps());
			// style.setSnapToGrip(ctrPr.getSnapToGrid());
			// style.setBorder(ctrPr.getBdr());
			// style.setUnderline(ctrPr.getU() != null ? ctrPr.getU().getVal()
			// : null);
			// style.setTextScale(ctrPr.getW());
			// style.setPrChange(ctrPr.getRPrChange());
			// style.setEm(ctrPr.getEm() != null ? ctrPr.getEm().getVal() :
			// null);
			style.setBold(ctrPr.getB() != null);
			style.setItalic(ctrPr.getI() != null);
			if (Rcpl.colorProvider().get(ctrPr.getColor()) != null) {
				style.setForeground(Rcpl.colorProvider().get(ctrPr.getColor()));
			}
			// style.setHighlightColor(ctrPr.getHighlight() != null ? new
			// JOColorProperty(
			// null, ctStyle, ctrPr, "Highlight", new String[] {}, true,
			// //$NON-NLS-1$
			// null) : null);
		}

	}

	public static void sortStyles(List<IStyle> styles) {
		// Collections.sort(styles, new Comparator<IStyle>() {
		// @Override
		// public int compare(IStyle o1, IStyle o2) {
		//
		// if (o1.getType().equals(EStyleType.PARAGRAPH)
		// && o1.getType().equals(EStyleType.CHARACTER)) {
		// return 1;
		// }
		//
		// try {
		// int o1Prio = o1.getUiPriority().intValue();
		// int o2Prio = o2.getUiPriority().intValue();
		// return o1Prio - o2Prio;
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		// if (o1.getType().equals(EStyleType.CHARACTER)) {
		// return 1;
		// }
		// if (o1.getType().equals(EStyleType.TABLE)) {
		// return 1;
		// }
		// if (o1.getType().equals(EStyleType.NUMBERING)) {
		// return 1;
		// }
		// return 0;
		// }
		// });
	}

	/**
	 * @param name
	 * @return
	 */
	@Override
	public IStyle getParagraphStyleById(String id) {
		for (IStyle paragraphStyle : styles) {
			if (paragraphStyle.getId().equals(id)) {
				return paragraphStyle;
			}
		}

		if (this != Rcpl.globalStyleTemplate()) {
			return Rcpl.globalStyleTemplate().getParagraphStyleById(id);
		}
		return null;
	}

	/**
	 * @param name2
	 * @return
	 */
	public IStyle getParagraphStyleByName(String name2) {
		for (IStyle paragraphStyle : styles) {
			if (paragraphStyle.getName().equals(name2)) {
				return paragraphStyle;
			}
		}
		return null;
	}

	/**
	 * @return
	 */
	public CTOfficeArtExtensionList getThemeArts() {
		return themeArts;
	}

	/**
	 * @return
	 */
	public CTStyleMatrix getThemeStyleMatrix() {
		return themeStyleMatrix;
	}

	@Override
	public List<IStyle> getStyles() {
		return styles;
	}

	public XWPFDocument getXml() {
		return ((XWPFDocument) dotxDocument.getXml());
	}

	// public void setXml(XWPFDocument xml) {
	// this.xml = xml;
	// }

	// public Hashtable<String, CTDrawing> getTemplateDrawings() {
	// return templateDrawings;
	// }

	public JOFontScheme getThemeFontScheme() {
		return themeFontScheme;
	}

	@Override
	public XmlObject getTemplateXml(String id) {
		return templateXml.get(id);
	}

	public JOWordDocument getDotxDocument() {
		return dotxDocument;
	}

	// public Hashtable<String, CTSimpleField> getTemplateFields() {
	// return templateFields;
	// }

}
