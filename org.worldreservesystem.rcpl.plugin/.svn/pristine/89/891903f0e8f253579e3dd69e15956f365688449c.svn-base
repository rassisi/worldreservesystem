package com.joffice.rcpl.plugin.office.internal.model.word;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFTextParagraph;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.ISelectable;
import org.eclipse.rcpl.ISelectionShape;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.ITableCell;
import org.eclipse.rcpl.DelayedExecution;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.util.JOUtil;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.util.JOUtil2;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHighlightColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalAlignRun;
import org.w3c.dom.Node;

import com.joffice.rcpl.plugin.office.JOBorder;
import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyFactory;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyIndent;
import com.joffice.rcpl.plugin.office.databinding.JOPropertySectionType;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTabs;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTextAlign;
import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;
import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;
import com.joffice.rcpl.plugin.office.databinding.types.JOSectionType;
import com.joffice.rcpl.plugin.office.databinding.types.JOTabArray;
import com.joffice.rcpl.plugin.office.databinding2.JOBoolean;
import com.joffice.rcpl.plugin.office.databinding2.JOColorProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20ThPointProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOLineSpacingProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOStringProperty;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXAbstractFigure;
import com.joffice.rcpl.plugin.office.internal.JOStyleTemplate;
import com.joffice.rcpl.plugin.office.internal.JOfficeFactory;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawing;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOShape;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlideMasterPart;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOCell;
import com.joffice.rcpl.plugin.office.poi.extension.XWPFDocumentCustom;

import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;

/**
 * @author ramin
 * 
 */
public class JOParagraph extends JOObject implements ISelectable, IParagraph {

	public static final int WIDTH_EXTENT = 0;

	// ---------- new databinding 2 -------------------------------------------

	private JOStringProperty bulletCharacter;

	// ---------- new oberserver properties ------------------------------------

	private JOPropertyTabs<JOTabArray> tabs;

	private JOPropertyTextAlign<JOAlignment> alignment;

	// ---------- old properties -----------------------------------------------

	protected JOEmuProperty marginLeft;

	protected JOEmuProperty marginRight;

	private StringBuilder textBuffer = new StringBuilder();

	private List<IStyle> characterStyles;

	private double cellMarginLeft = 0;

	private double cellMarginRight = 0;

	private double cellMarginTop = 0;

	private double cellMarginBottom = 0;

	private ITableCell tableCell;

	private JOCell cell;

	private boolean transparent;

	private boolean inTextBox;

	private Rectangle2D textBounds;

	private List<IDrawing> drawings;

	private boolean startNewSection;

	private boolean hasInLineDrawing = false;

	private int totalIdentPixel;

	private JONumbering numbering;

	private XWPFParagraph poiParagraph;

	private XSSFTextParagraph poiPresentationParagraph;

	private boolean hasDrawing;

	private CTP ctp;

	private CTTextParagraph ctt;

	private int caretTextRunOffset = 0;

	private double textBoundsHeight;

	private IStyle templateStyle;

	private IParagraphFigure overflowParagraphFigure;

	private boolean loaded;

	private boolean overflowActive;

	private int caretOffset;

	/**
	 * @param document
	 * @param paragraph
	 */
	public JOParagraph(IDocument document, JOObject parentObject, XmlObject xmlParent, XmlObject xmlObject,
			double width, double height, double cellMarginLeft, double cellMarginRight, double cellMarginTop,
			double cellMarginBottom, JOTableCell tableCell, boolean childObject, boolean inTextBox, JOSection section,
			IStyle style, boolean isRootObject, int index, XWPFParagraph poiParagraph

	) {
		super(document, parentObject, xmlParent, xmlObject, childObject, isRootObject, index);
		this.section = section;
		this.loaded = false;
		this.poiParagraph = poiParagraph;
		if (getXmlObject() instanceof CTP) {
			this.ctp = (CTP) getXmlObject();
		}

		setStyle(style);

		this.cellMarginBottom = cellMarginBottom;
		this.cellMarginLeft = cellMarginLeft;
		this.cellMarginRight = cellMarginRight;
		this.cellMarginTop = cellMarginTop;
		this.tableCell = tableCell;

		templateStyle = Rcpl.globalStyleTemplate().getDefaultStyle();

		// templateStyle = getDocument().getStyleTemplate().getDefaultStyle();
		templateStyle.setTemplateStyle();

		if (width > 0) {
			this.width.set(width);
		}
		if (tableCell != null) {
			containerTable = tableCell.getTable();
		}

		this.inTextBox = inTextBox;
		this.isRootObject = isRootObject || parentObject == null;

		updateFromXml(false);

		loaded = true;
	}

	@Override
	public void activate() {
		new DelayedExecution(30) {
			@Override
			protected void execute() {
				getLayoutFigure().activate(-1, -1);
			}
		};
	}

	/**
	 * @param OOXMLStyle
	 */
	@Override
	public void addStyle(IStyle style) {

		if (characterStyles == null) {
			characterStyles = new ArrayList<IStyle>();
		}
		characterStyles.add(style);

		// List<IStyle> newStyledRanges = new ArrayList<>();
		// IStyle actualStyle = null;
		// for (int i = 0; i < textBuffer.length(); i++) {
		// List<IStyle> styles = findCharacterStyleAtOffset(i);
		// if (styles != null && styles.size() == 1) {
		// if (actualStyle == null) {
		// actualStyle = styles.get(0).clone();
		// newStyledRanges.add(actualStyle);
		// actualStyle.setStart(i);
		// actualStyle.setLength(1);
		// } else if (styles.size() == 2) {
		// actualStyle = styles.get(0).clone();
		// newStyledRanges.add(actualStyle);
		// actualStyle.setStart(i);
		// actualStyle.setLength(1);
		//
		// }
		// }
		//
		// }

	}

	@SuppressWarnings("deprecation")
	public void append(JOParagraph par) {
		Rcpl.profile();
		if (xmlObject instanceof CTP) {
			if (par.getXmlObject() instanceof CTP) {
				CTP src = (CTP) par.getXmlObject();
				CTP dest = (CTP) xmlObject;
				CTR[] srcRuns = src.getRArray();
				for (CTR srcRun : srcRuns) {
					CTR destRun = dest.addNewR();
					destRun.set(srcRun);
				}
			}
			setDirtyContent(true);
			updateFromXml(false);
			par.dispose();

		}
		Rcpl.profileEnd();
	}

	@Override
	public void applyBackground(int start, int length, IColor color) {
		// TODO Auto-generated method stub

	}

	// public void setStyle(IStyle style) {
	// IStyle style = par.findCharacterStyleAtOffset(par.getCaretOffset());
	// }

	@Override
	public void applyBold(int start, int length, boolean bold) {
		List<IStyle> stylesToApply = collectStylesToApply(start, length);
		for (IStyle iStyle : stylesToApply) {
			iStyle.setBold(bold);
		}
	}

	@Override
	public void applyForeground(int start, int length, IColor color) {
		List<IStyle> stylesToApply = collectStylesToApply(start, length);
		for (IStyle iStyle : stylesToApply) {
			iStyle.setForeground(color);
		}
	}

	@Override
	public void applyHeight(int start, int length, double height) {
		List<IStyle> stylesToApply = collectStylesToApply(start, length);
		for (IStyle iStyle : stylesToApply) {
			iStyle.setHeight(height);
		}
	}

	@Override
	public void applyFontName(int start, int length, String fontName) {
		List<IStyle> stylesToApply = collectStylesToApply(start, length);
		for (IStyle iStyle : stylesToApply) {
			iStyle.getFont().setName(fontName);
		}
	}

	@Override
	public void applyItalic(int start, int length, boolean italic) {
		List<IStyle> stylesToApply = collectStylesToApply(start, length);
		for (IStyle iStyle : stylesToApply) {
			iStyle.setItalic(italic);
		}
	}

	@Override
	public void applyUnderline(int start, int length, boolean underline) {
		Rcpl.profile();
		// List<IStyle> stylesToApply = collectStylesToApply(start, length);
		// for (IStyle iStyle : stylesToApply) {
		// // iStyle.setun
		// }
		Rcpl.profileEnd();
	}

	@Override
	public void clearRunStyles() {
		characterStyles = null;
	}

	@SuppressWarnings("unused")
	private void clearStyledRanges() {
		Rcpl.profile();
		if (characterStyles != null) {
			characterStyles.clear();
		}
		Rcpl.profileEnd();
	}

	private List<IStyle> collectStylesToApply(int start, int length) {
		List<IStyle> stylesToApply = new ArrayList<IStyle>();

		for (int offset = start; offset < start + length; offset++) {
			List<IStyle> styles = findCharacterStyleAtOffset(offset);
			if (styles != null && !styles.isEmpty()) {
				IStyle style = styles.get(0);
				if (style.getStart() < offset) {
					IStyle st1 = style.copy();
					st1.setLength(offset - st1.getStart());
					addStyle(st1);
					style.setStart(offset + 1);
					style.setLength(style.getLength() - 1 - st1.getLength());
				} else {
					style.setStart(offset + 1);
					style.setLength(style.getLength() - 1);
				}
				// if (style.getLength() == 0) {
				// characterStyles.remove(style);
				// }
				IStyle newStyle = style.copy();
				newStyle.setStart(offset);
				newStyle.setLength(1);
				addStyle(newStyle);
				stylesToApply.add(newStyle);

			} else {
				IStyle newStyle = getStyle().copy();
				newStyle.setStart(offset);
				newStyle.setLength(1);
				addStyle(newStyle);
				stylesToApply.add(newStyle);
			}
		}

		if (getTextBuffer().length() > 0 && stylesToApply.size() == 0) {
			IStyle newStyle = getStyle().copy();
			newStyle.setStart(0);
			newStyle.setLength(getTextBuffer().length());
			addStyle(newStyle);
			stylesToApply.add(newStyle);
		}

		return stylesToApply;
	}

	@Override
	public boolean commit() {

		if (!isDirtyContent()) {
			return true;
		}

		// ----------- spreadsheet -----------------------------------------

		if (getCell() != null) {
			return commitSpreadsheetParagraph();
		}

		// ---------- word -------------------------------------------------

		else if (getXmlObject() instanceof CTP) {
			return commitWordParagraph();
		}

		// ---------- spreadsheet ------------------------------------------

		else if (getXmlObject() instanceof CTTextParagraph) {
			return commitPresentationParagraph();
		}

		return false;
	}

	/**
	 * @param paragraph
	 * @param st
	 * @return
	 */
	@SuppressWarnings("deprecation")
	private boolean commitPresentationParagraph() {
		Rcpl.profile();

		// ---------- remove first all runs ----------------------------

		CTTextParagraph ctp = (CTTextParagraph) getXmlObject();

		if (ctp == null) {
			// LOGGER.error("CTP == null"); //$NON-NLS-1$
			return false;
		}

		// ---------- delete runs --------------------------------

		CTRegularTextRun[] runs = ctp.getRArray();
		int rCount = runs.length;

		// List<CTDrawing> drawingArrays = new
		// ArrayList<CTDrawing>();
		// for (int i = 0; i < rCount; i++) {
		// if (runs[i].getDrawingArray() != null
		// && runs[i].getDrawingArray().length > 0) {
		// for (CTDrawing drawing : runs[i].getDrawingArray()) {
		// drawingArrays.add(drawing);
		// }
		// }
		// }

		List<CTRegularTextRun> runsToDelete = new ArrayList<CTRegularTextRun>();
		// List<CTRegularTextRun> runsToDeleteLater = new
		// ArrayList<CTRegularTextRun>();
		for (int i = 0; i < rCount; i++) {
			runsToDelete.add(runs[i]);
		}

		for (CTRegularTextRun run : runsToDelete) {
			int index = JOUtil2.getIndex(run, true);
			ctp.removeR(index);
		}

		// ---------- rebuild the runs ---------------------------------

		int alignment = getLineAlignment(0);
		switch (alignment) {
		case Rcpl.LEFT:
			setAlignment(ParagraphAlignment.LEFT);
			break;
		case Rcpl.CENTER:
			setAlignment(ParagraphAlignment.CENTER);
			break;
		case Rcpl.RIGHT:
			setAlignment(ParagraphAlignment.RIGHT);
			break;
		}
		if (getJustify()) {
			setAlignment(ParagraphAlignment.DISTRIBUTE);
		}

		int offset = 0;
		// int drawingIndex = 0;

		for (IStyle styleRange : getCharaterStyles()) {
			JOStyle style = (JOStyle) styleRange;
			if (styleRange.getStart() > offset) {
				CTRegularTextRun run = ((CTTextParagraph) getXmlObject()).addNewR();
				setText(run, textBuffer.substring(offset, styleRange.getStart()));
			}

			// ---------- styles ---------------------------------------

			CTRegularTextRun run = ((CTTextParagraph) getXmlObject()).addNewR();
			// if (style.isBold()) {
			// paragraph.setBold(run, style.isBold());
			// }
			// if (style.isItalic()) {
			// paragraph.setItalic(run, style.isItalic());
			// }
			// if (style.isUnderline()) {
			// paragraph.setUnderline(run,
			// UnderlinePatterns.SINGLE);
			// }

			// ---------- font -----------------------------------------

			IFont f = style.getFont();
			String fName = f.getName(); //
			// data.lfPitchAndFamily;
			CTTextCharacterProperties ctrPr = run.getRPr();
			if (ctrPr == null) {
				ctrPr = run.addNewRPr();
			}
			CTTextFont textFont;
			if (ctrPr.isSetLatin()) {
				textFont = ctrPr.getLatin();
			} else {
				textFont = ctrPr.addNewLatin();
			}
			textFont.setTypeface(fName);

			// ---------- font size ------------------------------------

			setFontSize(run, f.getHeight() * RCPLModel.FONT_HEIGHT_FACTOR);

			// ---------- fg color -------------------------------------

			if (style.getForeGround() != null) {
				CTColor color = CTColor.Factory.newInstance();
				color.setVal(Rcpl.colorProvider().getBytesFromCOLOR(style.getForeGround()));
			}

			// ---------- text fragment --------------------------------

			String txt = textBuffer.substring(styleRange.getStart(), styleRange.getStart() + styleRange.getLength());

			// ---------- image wieder anheften ------------------------

			setText(run, txt);
			offset = style.start + style.length;

		}

		if (offset < textBuffer.length()) {
			if (poiParagraph != null) {
				CTR run = createRun();
				setText(run, textBuffer.substring(offset, textBuffer.length()));
			} else {
				CTRegularTextRun run = createRunDrawing();
				setText(run, textBuffer.substring(offset, textBuffer.length()));
			}

		}
		setDirtyContent(false);
		Rcpl.profileEnd();

		return true;
	}

	/**
	 * @param paragraph
	 * @param st
	 * @return
	 */
	private boolean commitSpreadsheetParagraph() {
		Rcpl.profile();

		try {
			XSSFCell poiCell = getCell().getPoiCell();

			switch (poiCell.getCellType()) {
			case Cell.CELL_TYPE_BLANK:
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				break;
			case Cell.CELL_TYPE_ERROR:
				break;
			case Cell.CELL_TYPE_FORMULA:
				String s = textBuffer.toString();
				XSSFCellStyle style = poiCell.getCellStyle();
				poiCell.setCellFormula(s);
				poiCell.setCellStyle(style);
				getCell().getWorkbook().recalculate();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				s = textBuffer.toString();
				double value;
				try {
					style = poiCell.getCellStyle();
					value = Double.valueOf(s);
					poiCell.setCellValue(value);
					poiCell.setCellStyle(style);
					getCell().getWorkbook().recalculate();
				} catch (Exception ex0) {

				}
				break;
			case Cell.CELL_TYPE_STRING:
				try {
					style = poiCell.getCellStyle();
				} catch (Exception ex) {
					style = null;
				}
				XSSFRichTextString richTextString = new XSSFRichTextString();
				XSSFCellStyle cellStyle = poiCell.getCellStyle();
				XSSFFont xssfFont = cellStyle.getFont();
				richTextString.append(textBuffer.toString(), xssfFont);
				poiCell.setCellValue(richTextString);
				if (style != null) {
					poiCell.setCellStyle(style);
				}
				break;
			}
			setDirtyContent(false);
		} catch (Exception ex) {
			// LOGGER.error("", ex);
		}
		Rcpl.profileEnd();
		return true;
	}

	/**
	 * @param paragraph
	 * @param st
	 * @return
	 */
	@SuppressWarnings("deprecation")
	private boolean commitWordParagraph() {
		try {

			// ---------- remove first all runs ----------------------------

			CTP ctp = (CTP) getXmlObject();

			if (ctp == null) {
				// LOGGER.error("CTP == null"); //$NON-NLS-1$
				return false;
			}

			// ---------- delete runs --------------------------------------

			CTR[] runs = new CTR[0];

			try {
				runs = ctp.getRArray();
			} catch (Exception ex) {
				// TODO?? (orphaned)
				// LOGGER.error("", ex);
				return false;
			}

			int rCount = runs.length;

			List<CTR> drawingArrays = new ArrayList<CTR>();

			for (int i = 0; i < rCount; i++) {
				if (runs[i].getDrawingArray() != null && runs[i].getDrawingArray().length > 0) {
					drawingArrays.add(runs[i]);
				} else if (runs[i].getPictArray() != null && runs[i].getPictArray().length > 0) {
				} else {
					int index = JOUtil2.getIndex(runs[i], true);
					ctp.removeR(index);
				}
			}

			commitWordParagraphProperties();

			// ---------- delete hyperlinks --------------------------------

			CTHyperlink[] hyperlinks = ctp.getHyperlinkArray();
			for (CTHyperlink hLink : hyperlinks) {
				int index = JOUtil2.getIndex(hLink, true);
				ctp.removeHyperlink(index);
			}

			// ---------- rebuild the runs ---------------------------------

			// int alignment = paragraph.getStyle().getLineAlignment(0);
			// switch (alignment) {
			// case JO.LEFT:
			// paragraph.setAlignment(ParagraphAlignment.LEFT);
			// break;
			// case JO.CENTER:
			// paragraph.setAlignment(ParagraphAlignment.CENTER);
			// break;
			// case JO.RIGHT:
			// paragraph.setAlignment(ParagraphAlignment.RIGHT);
			// break;
			// }
			// if (paragraph.getStyle().getJustify()) {
			// paragraph.setAlignment(ParagraphAlignment.DISTRIBUTE);
			// }

			// p1.setBorderBottom(Borders.SINGLE);
			// p1.setBorderTop(Borders.DOUBLE);
			// p1.setBorderRight(Borders.DOUBLE);
			// p1.setBorderLeft(Borders.DOUBLE);
			// p1.setBorderBetween(Borders.SINGLE);
			// p1.setVerticalAlignment(TextAlignment.TOP);

			int offset = 0;
			// int drawingIndex = 0;

			for (IStyle style : getCharaterStyles()) {
				if (offset < 0) {
					// LOGGER.error("offset<0");
					continue;
				}
				if (style.getStart() > offset) {
					CTR run = createRun();
					// TODO:!!!
					String s = textBuffer.toString();
					int off1 = Math.max(0, offset);
					int off2 = Math.min(textBuffer.length() - 1, style.getStart());
					setText(run, textBuffer.substring(off1, off2));
				}

				// ---------- styles -----------------------------------

				CTR run = createRun();
				if (style.isBold()) {
					setBold(run, style.isBold());
				}
				if (style.isItalic()) {
					setItalic(run, style.isItalic());
				}
				if (style.isUnderline()) {
					setUnderline(run, UnderlinePatterns.SINGLE);
				}
				if (style.isStrikeThrough()) { // || style.getst) {
					CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
					CTOnOff bold = pr.isSetStrike() ? pr.getStrike() : pr.addNewStrike();
					bold.setVal(style.isStrikeThrough() ? STOnOff.TRUE : STOnOff.FALSE);
				}

				if (style.isSubScript()) {
					CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
					CTVerticalAlignRun vAlign = pr.isSetVertAlign() ? pr.getVertAlign() : pr.addNewVertAlign();
					vAlign.setVal(STVerticalAlignRun.SUBSCRIPT);
				}

				if (style.isSuperScript()) {
					CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
					CTVerticalAlignRun vAlign = pr.isSetVertAlign() ? pr.getVertAlign() : pr.addNewVertAlign();
					vAlign.setVal(STVerticalAlignRun.SUPERSCRIPT);
				}

				// ---------- font -----------------------------------------

				String fName = style.getFont().getName();
				CTRPr ctrPr = run.getRPr();
				if (ctrPr == null) {
					ctrPr = run.addNewRPr();
				}
				CTFonts fonts;
				if (ctrPr.isSetRFonts()) {
					fonts = ctrPr.getRFonts();
				} else {
					fonts = ctrPr.addNewRFonts();
				}
				fonts.setAscii(fName);

				// ---------- font size ------------------------------------

				setFontSize(run, style.getFont().getHeight());

				// ---------- fg color -------------------------------------

				if (style.getForeGround() != null) {
					CTColor color = CTColor.Factory.newInstance();
					color.setVal(Rcpl.colorProvider().getBytesFromCOLOR(style.getForeGround()));
					ctrPr.setColor(color);
				}
				if (style.getBackground() != null) {
					STHighlightColor.Enum en = Rcpl.colorProvider().getHighlightColor(style.getBackground());
					if (en != null) {
						en = STHighlightColor.YELLOW;
					}

					CTHighlight highlight;
					if (ctrPr.isSetHighlight()) {
						highlight = ctrPr.getHighlight();
						highlight.setVal(en);
					} else {
						highlight = CTHighlight.Factory.newInstance();
						highlight.setVal(en);
						ctrPr.setHighlight(highlight);
					}
				} else {
					if (ctrPr.isSetHighlight()) {
						ctrPr.unsetHighlight();
					}
				}

				// ---------- shading --------------------------------------

				if (getStyle().getShading() != null) {
					CTPPr ppr;
					if (!ctp.isSetPPr()) {
						ppr = ctp.addNewPPr();
					} else {
						ppr = ctp.getPPr();
					}
					CTShd shd;
					if (!ppr.isSetShd()) {
						shd = ppr.addNewShd();
					} else {
						shd = ppr.getShd();
					}
					shd.setVal(STShd.CLEAR);
					shd.setColor("auto"); //$NON-NLS-1$
					// shd.setFill(JOColorProvider.getBytesFromCOLOR(paragraphStyle
					// .getShading()));
				} else {
					if (ctp.isSetPPr() && ctp.getPPr().isSetShd()) {
						ctp.getPPr().unsetShd();
					}
				}

				// ---------- text fragment --------------------------------

				int end = style.getStart() + style.getLength();
				if (end >= textBuffer.length()) {
					end = textBuffer.length() - 1;
				}

				String txt = textBuffer.toString();

				try {
					txt = textBuffer.substring(style.getStart(), end);
				} catch (Exception ex) {
					// TODO:??
					//
				}
				// ---------- image wieder anheften ------------------------

				if (txt.equals(Rcpl.OBJECT_PLACEHOLDER)) {
					if (style.getDrawing() != null) {
						XmlObject xmlO = style.getDrawing().getXmlObject();
						CTDrawing ctDrawing = (CTDrawing) xmlO;

						CTDrawing newCTDrawing = CTDrawing.Factory.newInstance();
						// CTDrawing oldDrawing = drawingArrays
						// .get(drawingIndex++);
						newCTDrawing.set(ctDrawing);
						run.setDrawingArray(new CTDrawing[] { newCTDrawing });
						// style.getDrawing().setXmlObject(newCTDrawing);

						if (!drawingArrays.isEmpty()) {
							CTR drawingRun = drawingArrays.get(0);
							int index = JOUtil2.getIndex(drawingRun, true);
							ctp.removeR(index);
							drawingArrays.remove(0);
						}
					} else {
						RCPLModel.logError("JOParagraph.commitWordParagraph(): Drawing missing");
					}

				} else {
					setText(run, txt);
				}

				// paragraph.setText(run, txt);

				offset = style.getStart() + style.getLength();

			}

			if (offset < textBuffer.length()) {
				CTR run = createRun();
				setText(run, textBuffer.substring(offset, textBuffer.length()));
			}
			setDirtyContent(false);
			Rcpl.profileEnd();
			return true;
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return false;
		}
	}

	// /**
	// * @param s
	// */
	// public void createAllCharacterLayouts(String s, JOSWTAbstractStyledText
	// st,
	// int offset) {
	// st.setFont(getJOStyle().font);
	// try {
	// boolean numberingFake = false;
	// if (s.length() == 0 && getNumbering() != null) {
	// s = "X"; //$NON-NLS-1$
	// st.setText("X"); //$NON-NLS-1$
	// numberingFake = true;
	// }
	// correctVerticalAlignment(st);
	// if (offset == -1 || layoutInfo.getCharacterLayouts() == null) {
	// offset = createOrCopyCharacterLayouts(st, s);
	// } else {
	// createOrCopyCharacterLayouts(st, s);
	// }
	// calculateAllCharacterPositions(offset, s, st);
	// if (s.indexOf("\n") == -1) { //$NON-NLS-1$
	// correctFirstCharacterInLine(offset, s);
	// }
	// correctIndentAndMargins(s);
	// if (numberingFake) {
	// s = ""; //$NON-NLS-1$
	// st.setText(""); //$NON-NLS-1$
	// }
	// } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// saveCharacterLayout();
	// }

	// }
	// }

	// System.arraycopy(layoutInfo.getCharacterLayouts(),
	// offset, newCharacterLayout, offset + 1,
	// s.length() - offset - 1);
	// layoutInfo.setCharacterLayouts(newCharacterLayout);
	// }
	// } else if (s.length() < layoutInfo.getCharacterLayouts().length) {
	// offset = st.getCaretOffset();
	// JOCharacterLayout[] newCharacterLayout = new JOCharacterLayout[s
	// .length()];
	//
	// System.arraycopy(layoutInfo.getCharacterLayouts(), 0,
	// newCharacterLayout, 0, offset);
	//
	// //
	// System.arraycopy(layoutInfo.getCharacterLayouts(), 0,
	// newCharacterLayout, 0, s.length());
	// layoutInfo.setCharacterLayouts(newCharacterLayout);
	//
	// // createCharacterLayoutArray(s.length());
	// // saveCharacterLayout();
	// // offset--;
	// // getParagraph().layoutInfo.getCharacterLayouts()[offset].dirty
	// // =
	// // true;
	// } else {
	// // System. out.();
	// }
	// } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// offset = 0;
	// createCharacterLayoutArray(s.length());
	// }
	// }
	// return offset;
	// }
	//
	// /**
	// * @param length
	// */
	// public void createCharacterLayoutArray(int length) {
	// layoutInfo.setCharacterLayouts(new JOCharacterLayout[length]);
	// for (int i = 0; i < layoutInfo.getCharacterLayouts().length; i++) {
	// layoutInfo.getCharacterLayouts()[i] = new JOCharacterLayout();
	// }
	// }

	// @SuppressWarnings({ "hiding", "deprecation" })
	// private void saveCharacterLayout() {
	// String layoutString = layoutInfo.getString();
	// if (getXmlObject() instanceof CTP) {
	// CTP ctp = (CTP) getXmlObject();
	// CTSimpleField ctSimpleField = null;
	// CTSimpleField[] ctSimpleFields = ctp.getFldSimpleArray();
	// for (CTSimpleField f : ctSimpleFields) {
	// String instr = f.getInstr();
	// if (instr.startsWith("jocl=")) { //$NON-NLS-1$
	// ctSimpleField = f;
	// break;
	// }
	// }
	// if (ctSimpleField == null) {
	// ctSimpleField = ctp.addNewFldSimple();
	// }
	// ctSimpleField.setInstr("jocl=" + layoutString); //$NON-NLS-1$
	// }
	// }

	/**
	 * 
	 */
	private void commitWordParagraphProperties() {
		Rcpl.profile();

		CTParaRPr cTParaRPr;

		if (!getStyle().isTemplateStyle()) {
			cTParaRPr = getCTParaRPr();
			if (getStyle().isBold() && (templateStyle == null || !templateStyle.isBold())) {
				if (cTParaRPr.getB() == null) {
					cTParaRPr.addNewB();
				}
			}
			if (getStyle().isItalic() && (templateStyle == null || !templateStyle.isItalic())) {
				if (cTParaRPr.getI() == null) {
					cTParaRPr.addNewI();
				}
			}

			if (getStyle().isUnderline() && (templateStyle == null || !templateStyle.isUnderline())) {
				// cTParaRPr.
				// setUnderline(run, UnderlinePatterns.SINGLE);
			}

			CTFonts fonts;
			if (cTParaRPr.isSetRFonts()) {
				fonts = cTParaRPr.getRFonts();
			} else {
				fonts = cTParaRPr.addNewRFonts();
			}
			fonts.setAscii(getStyle().getFont().getName());

			BigInteger bint = new BigInteger("" + (int) getStyle().getFont().getHeight()); //$NON-NLS-1$

			CTHpsMeasure ctSize = cTParaRPr.isSetSz() ? cTParaRPr.getSz() : cTParaRPr.addNewSz();
			ctSize.setVal(bint.multiply(new BigInteger("2"))); //$NON-NLS-1$

			if (getStyle().getId() != null) {
				if (getCTPPr().getPStyle() != null) {
					getCTPPr().getPStyle().setVal(getStyle().getId());
				} else {
					CTString s = CTString.Factory.newInstance();
					s.setVal(getStyle().getId());
					getCTPPr().setPStyle(s);
				}
			}

		}

		//
		// if (ctFonts != null) {
		//
		// boolean minorFont = true;
		// String fontName = null;
		//
		// if (ctFonts.getHAnsiTheme() != null) {
		// int hAnsiTheme = ctFonts.getHAnsiTheme().intValue();
		// switch (hAnsiTheme) {
		// case STTheme.INT_MAJOR_ASCII:
		// minorFont = false;
		// break;
		// case STTheme.INT_MAJOR_BIDI:
		// minorFont = false;
		// break;
		// case STTheme.INT_MAJOR_EAST_ASIA:
		// minorFont = false;
		// break;
		// case STTheme.INT_MAJOR_H_ANSI:
		// minorFont = false;
		// break;
		// case STTheme.INT_MINOR_ASCII:
		// break;
		// case STTheme.INT_MINOR_BIDI:
		// break;
		// case STTheme.INT_MINOR_EAST_ASIA:
		// break;
		// case STTheme.INT_MINOR_H_ANSI:
		// break;
		//
		// }
		// }
		//
		// String ascii = ctFonts.getAscii();
		//
		// // String eastAsia = ctFonts.getEastAsia();
		//
		// String hAnsi = ctFonts.getHAnsi();
		//
		// STHint.Enum en = ctFonts.getHint();
		// if (en != null) {
		// if (en.equals(STHint.CS)) {
		// } else if (en.equals(STHint.DEFAULT)) {
		// } else if (en.equals(STHint.EAST_ASIA)) {
		// }
		// }
		//
		// if (hAnsi != null) {
		// fontName = hAnsi;
		// } else if (ascii != null) {
		// fontName = ascii;
		// }
		//
		// if (fontName == null) {
		// fontName = getDefaultFontName(minorFont);
		// }
		//
		// setFont(JO.fontProvider.loadFont(fontName, getFont().getHeight(),
		// getFont().getStyle()));
		//
		Rcpl.profileEnd();
	}

	@Override
	public int getCaretOffset() {
		return caretOffset;
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		return new JOfficeFactory().createParagraphFigure(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.joffice.rcpl.plugin.office.rcp.OOXMLLayoutObject#createFigureImage()
	 */

	/**
	 * @param style
	 */
	private void createOOXMLStyleRanges(CTR ctr, String txt, int rangeStart, String hyperText) {
		Rcpl.profile();
		if (txt.length() > 0) {
			IStyle newStyle = getStyle().copy();
			newStyle.setStart(textBuffer.indexOf(txt));
			newStyle.setLength(txt.length());
			newStyle.setCtr(ctr);
			newStyle.setHyperText(hyperText);
			addStyle(newStyle);
		}
		Rcpl.profileEnd();
	}

	@Override
	public CTR createRun() {
		return ctp.addNewR();
	}

	public CTRegularTextRun createRunDrawing() {
		return ctt.addNewR();
	}

	@SuppressWarnings({ "deprecation" })
	@Override
	public boolean dispose() {
		try {
			if (isDisposed()) {
				return true;
			}
			setDisposed(true);
			super.dispose();
			if (getOverflowParagraphFigure() != null) {
				getOverflowParagraphFigure().dispose();
			}
			if (getPoiDocument() != null) {
				getPoiDocument().removeParagraph(poiParagraph);
				CTP[] ps = getPoiDocument().getDocument().getBody().getPArray();
				int index = 0;
				for (CTP ctp : ps) {
					if (ctp == getXmlObject()) {
						getPoiDocument().getDocument().getBody().removeP(index);
						break;
					}
					index++;
				}
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		getDocument().setDirty(true);
		JOObject[] obs = getChildList().toArray(new JOObject[getChildList().size()]);
		for (JOObject joObject : obs) {
			joObject.dispose();
		}
		refreshAllIndexes();
		getEditorFigure().updateOutline();
		return true;
	}

	private void refreshAllIndexes() {
		if (getEditorFigure() == null || getEditorFigure().getDocument() == null) {
			return;
		}
		try {
			for (ILayoutObject p : getEditorFigure().getDocument().getRootObjects()) {
				p.getLayoutFigure().refreshOutline();
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	@Override
	public IStyle findCharacterStyleAtOffset() {
		List<IStyle> result = findCharacterStyleAtOffset(getCaretOffset());
		if (!result.isEmpty()) {
			return result.get(0);
		}
		return getStyle();
	}

	@Override
	public List<IStyle> findCharacterStyleAtOffset(int offset) {
		List<IStyle> result = new ArrayList<IStyle>();
		try {
			if (offset <= (textBuffer.length() - 1)) {
				String s = textBuffer.substring(0, offset);
				String[] splits = s.split("[\n\t]"); //$NON-NLS-1$
				int offset2 = offset - splits.length + 1;
				if (characterStyles != null) {
					for (IStyle st : characterStyles) {
						if (offset2 >= st.getStart() && offset2 < st.getStart() + st.getLength()) {
							result.add(st);
						}
					}
				}
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		if (result.isEmpty()) {
			result.add(getStyle());
		}
		return result;
	}

	/**
	 * @return
	 */
	@Override
	public JOAlignment getAlignment() {
		if (alignment != null) {
			return alignment.get();
		}
		if (cell != null && cell.getHorizontalAlignment() != null) {
			return cell.getHorizontalAlignment().get();
		}
		return null;
	}

	@Override
	public IColor getBackgroundColor() {
		Rcpl.profile();
		if (getOoxmlCtShd() != null) {
			Object o = getOoxmlCtShd().getFill();
			if (o instanceof byte[]) {
				Rcpl.profileEnd();
				return Rcpl.colorProvider().get((byte[]) o);
			}
		} else if (getTableCell() != null) {
			if (((JOTableCell) getTableCell()).getFillColor() != null) {
				return ((JOTableCell) getTableCell()).getFillColor().get();
			}
		}
		if (getDocument().getBackground() != null) {
			Rcpl.profileEnd();
			return getDocument().getBackground().get();
		}

		Rcpl.profileEnd();
		return null;
	}

	public JOStringProperty getBulletCharacter() {
		return bulletCharacter;
	}

	// public void updateStyledTextSize(final OOXMLStyledText st) {
	// OOXML.profile();
	// org.eclipse.draw2d.geometry.Rectangle relativeBounds =
	// getRelativeBounds();
	// int w = size.x + relativeBounds.width;
	// int h = size.y + relativeBounds.height;
	// if (getPict() != null && getTableCell() == null) {
	// w = getPict().getWidth();
	// }
	// st.setSize((int) w, (int) h);
	// OOXML.profileEnd();
	// }

	public int getCaretTextRunOffset() {
		return caretTextRunOffset;
	}

	@Override
	public JOCell getCell() {
		return cell;
	}

	@Override
	public double getCellMarginBottom() {
		return cellMarginBottom;
	}

	@Override
	public double getCellMarginLeft() {
		return cellMarginLeft;
	}

	public double getCellMarginRight() {
		return cellMarginRight;
	}

	@Override
	public double getCellMarginTop() {
		return cellMarginTop;
	}

	@Override
	public IStyle[] getCharaterStyles() {
		if (characterStyles == null) {
			return new IStyle[0];
		}
		return characterStyles.toArray(new IStyle[characterStyles.size()]);
	}

	@Override
	public IStyle[] getCharaterStyles(int fromIndex, int toIndex) {
		if (characterStyles == null) {
			return new IStyle[0];
		}
		return characterStyles.subList(fromIndex, toIndex).toArray(new IStyle[characterStyles.size()]);
	}

	/**
	 * @return
	 */
	@Override
	public int getCharCount() {
		return textBuffer.length();
	}

	CTParaRPr getCTParaRPr() {
		CTPPr ctpPr = ctp.getPPr();
		CTParaRPr cTParaRPr = null;

		if (ctpPr == null) {
			ctpPr = ctp.addNewPPr();
		}
		cTParaRPr = ctpPr.getRPr();
		if (cTParaRPr == null) {
			cTParaRPr = ctpPr.addNewRPr();
		}

		return cTParaRPr;
	}

	/**
	 * @return
	 */
	CTPPr getCTPPr() {
		CTPPr ctpPr = ctp.getPPr();
		if (ctpPr == null) {
			ctpPr = ctp.addNewPPr();
		}
		return ctpPr;
	}

	@Override
	public String getDisplayName() {
		return "Paragraph";
	}

	@Override
	public List<IDrawing> getDrawings() {
		return drawings;
	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */

	@Override
	public boolean getJustify() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLineAlignment(int line) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public JOEmuProperty getMarginLeft() {
		return marginLeft;
	}

	@Override
	public JOEmuProperty getMarginRight() {
		return marginRight;
	}

	/**
	 * @return
	 */
	@Override
	public JOParagraph getNextParagraph() {
		try {
			int index = getDocument().layoutObjectIndexOf(this);
			if (index >= getDocument().layoutObjectsSize() - 1) {
				return null;
			}
			ILayoutObject next = getDocument().getLayoutObject(index + 1);
			while (!(next instanceof JOParagraph)) {
				next = getDocument().getLayoutObject(++index);
				if (next == null) {
					break;
				}
			}

			return (JOParagraph) next;
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return null;
		}
	}

	/**
	 * @return
	 */
	@Override
	public JOParagraph getNextRootParagraph() {
		Rcpl.profile();
		try {
			// int size = getDocument().getRootObjectsSize();
			int index = getDocument().getRootObjectIndex(this);
			if (index >= (getDocument().getRootObjectsSize() - 1)) {
				return null;
			}
			ILayoutObject next = getDocument().getRootObject(index + 1);
			while (!(next instanceof JOParagraph)) {
				next = getDocument().getRootObject(++index);
				if (next == null) {
					break;
				}
			}
			Rcpl.profileEnd();
			return (JOParagraph) next;
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
			Rcpl.profileEnd();
			return null;
		}
	}

	public JONumbering getNumbering() {
		return numbering;
	}

	@Override
	public IPage getPage() {
		IPage page = super.getPage();
		if (page == null && containerTable != null) {
			page = containerTable.getPage();
		}
		return page;
	}

	private XWPFDocumentCustom getPoiDocument() {
		return (XWPFDocumentCustom) getDocument().getXml();
	}

	/**
	 * @return
	 */
	public JOParagraph getPreviousParagraph() {
		Rcpl.profile();
		try {
			int index = getDocument().getParagraphs().indexOf(this);
			if (index <= 0) {
				return null;
			}
			ILayoutObject prev = getDocument().getParagraphs().get(index - 1);
			while (!(prev instanceof JOParagraph)) {
				prev = getDocument().getParagraphs().get(--index);
				if (prev == null) {
					break;
				}
			}
			Rcpl.profileEnd();
			return (JOParagraph) prev;
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
			Rcpl.profileEnd();
			return null;
		}
	}

	/**
	 * @return
	 */
	@Override
	public JOParagraph getPreviousRootParagraph() {

		try {
			int index = getDocument().getRootObjectIndex(getRootObject());
			if (index <= 0) {
				return null;
			}
			ILayoutObject prev = getDocument().getRootObject(index - 1);
			while (!(prev instanceof JOParagraph)) {
				prev = getDocument().getRootObject(--index);
				if (prev == null) {
					break;
				}
			}

			return (JOParagraph) prev;
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return null;
		}
	}

	// /**
	// * @return
	// */
	// public Rectangle2D getRelativeBounds() {
	// Rcpl.profile();
	//
	// double y = 0;
	// double x = 0;
	// double height = 0;
	// double width = 0;
	// if (getBorder() != null) {
	// if (getBorder().getDistanceTop() != null) {
	// y += getBorder().getLineWidthTop().toPixel() * 2;
	// height -= getBorder().getLineWidthTop().toPixel();
	// }
	// if (getBorder().getDistanceBottom() != null) {
	// height -= getBorder().getLineWidthBottom().toPixel();
	// y += getBorder().getLineWidthBottom().toPixel();
	// }
	// if (getBorder().getDistanceLeft() != null) {
	// x += getBorder().getLineWidthLeft().toPixel();
	// width -= getBorder().getLineWidthLeft().toPixel();
	// }
	// if (getBorder().getDistanceRight() != null) {
	// width -= getBorder().getLineWidthRight().toPixel();
	// }
	// }
	// Rcpl.profileEnd();
	// return new Rectangle2D(x, y, width, height);
	// }

	@Override
	public JOBorder getBorder() {
		return (JOBorder) super.getBorder();
	}

	@Override
	public int getSelectionEnd() {
		ISelectionShape sel = getEditorFigure().getSelectionEndShape();
		if (!sel.isVisible()) {
			return -1;
		}
		if (sel.getParagraph() == this) {
			return sel.getCharacterIndex();
		}

		if (sel.getParagraph() == null) {
			return -1;
		}

		if (sel.getParagraph().getIndex() < getIndex()) {
			return -1;
		}
		return getTextBuffer().length();
	}

	@Override
	public int getSelectionLength() {
		return getSelectionEnd() - getSelectionStart();
	}

	@Override
	public int getSelectionStart() {

		if (getTableCell() != null) {
			IParagraph prev = getPreviousRootParagraph();
			if (prev != null && prev.hasSelection()) {
				return 0;
			}
		}

		ISelectionShape sel = getEditorFigure().getSelectionStartShape();
		if (!sel.isVisible()) {
			return -1;
		}
		if (sel.getParagraph() == this) {
			return sel.getCharacterIndex();
		}
		if (sel.getParagraph() == null) {
			return -1;
		}
		if (sel.getParagraph().getIndex() > getIndex()) {
			return -1;
		}
		return 0;
	}

	@Override
	public JOEmu20ThPointProperty getSpacingAfter() {
		JOEmu20ThPointProperty sp = super.getSpacingAfter();
		if (sp == null) {
			return (JOEmu20ThPointProperty) getStyle().getSpacingAfter();
		}
		return sp;
	}

	@Override
	public JOEmu20ThPointProperty getSpacingBefore() {
		JOEmu20ThPointProperty sp = super.getSpacingBefore();
		if (sp == null) {
			return (JOEmu20ThPointProperty) getStyle().getSpacingBefore();
		}
		return sp;
	}

	@Override
	public IStyle getStyle() {
		if (style == null) {
			style = Rcpl.globalStyleTemplate().findStyle("Normal");
		}
		return style;
	}

	@Override
	public ITableCell getTableCell() {
		return tableCell;
	}

	// public void setWidth(int width) {
	// this.width = width;
	// }

	/**
	 * @return
	 */
	@Override
	public JOPropertyTabs<JOTabArray> getTabs() {
		if (tabs != null) {
			return tabs;
		}
		return ((JOStyle) getStyle()).getTabs();
	}

	public Rectangle2D getTextBounds() {
		return textBounds;
	}

	@Override
	public double getTextBoundsHeight() {
		return textBoundsHeight;
	}

	@Override
	public StringBuilder getTextBuffer() {
		return textBuffer;
	}

	public int getTotalIdentPixel() {
		return totalIdentPixel;
	}

	@Override
	public boolean hasCell() {
		return cell != null;
	}

	@Override
	public boolean hasDrawing() {
		return hasDrawing;
	}

	@Override
	public boolean hasSelection() {
		int s1 = getSelectionStart();
		int s2 = getSelectionEnd();
		return s1 > -1 && s2 > -1 && s1 != s2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.OOXMLLayoutObject#init()
	 */
	protected void init(boolean onlyStyledTextElements) {
		super.init();
		textBuffer = new StringBuilder();
		characterStyles = null;
		transparent = false;
		transparent = true;
		tableCell = null;
		transparent = false;
		inTextBox = false;
		if (!onlyStyledTextElements) {
			drawings = null;
		}
		startNewSection = false;
		hasInLineDrawing = false;
	}

	/**
	 * @param width
	 */
	private void initSpreadsheetParagraph() {
		Rcpl.profile();
		cell = (JOCell) getParent();
		setStyle(cell.getStyle());
		getStyle().setStart(0);
		textBuffer.setLength(0);
		textBuffer.append(cell.getFormatedValue());
		getStyle().setLength(textBuffer.length());
		addStyle(getStyle());
		try {
			XSSFRichTextString xSSFRichTextString = cell.getPoiCell().getRichStringCellValue();
			int l = xSSFRichTextString.length();

			for (int i = 0; i < l; i++) {
				// int index = xSSFRichTextString.getIndexOfFormattingRun(i);
				// XSSFFont font = xSSFRichTextString.getFontAtIndex(i);
				// XSSFFont runFont = xSSFRichTextString
				// .getFontOfFormattingRun(index);
				// int runLength = xSSFRichTextString
				// .getLengthOfFormattingRun(index);
				// String string = xSSFRichTextString.getString();
			}
		} catch (Exception ex) {
			// // LOGGER.error("", ex); //$NON-NLS-1$
		}

		Rcpl.profileEnd();
		return;

	}

	@Override
	public boolean isAllSelected() {
		return hasSelection() && getSelectionStart() == 0 && getSelectionEnd() == textBuffer.length();
	}

	/**
	 * @return
	 */
	public boolean isFirstParagraph() {
		return ((JOWordDocument) getDocument()).getFirstParagraph() == this;
	}

	public boolean isHasInLineDrawing() {
		return hasInLineDrawing;
	}

	@Override
	public void setCaretOffset(int caretOffset) {
		this.caretOffset = caretOffset;
	}

	public boolean isInTextBox() {
		return inTextBox;
	}

	/**
	 * @return
	 */
	public boolean isLastParagraph() {
		JOParagraph nextP = getNextRootParagraph();
		return nextP == null;
	}

	@Override
	public boolean isPageBreakAfter() {
		Rcpl.profile();
		if (isStartNewSection() && getSection() != null) {
			JOPropertySectionType<JOSectionType> type = ((JOSection) getSection()).getSectionType();
			if (type != null && type.get().equals(JOSectionType.NEXT_COLUMN)) {
			} else if (type != null && type.get().equals(JOSectionType.NEXT_PAGE)) {
				return true;
			} else if (type != null && type.get().equals(JOSectionType.EVEN)) {
				return true;
			} else if (type != null && type.get().equals(JOSectionType.ODD)) {
				return true;
			} else if (type != null && type.get().equals(JOSectionType.CONTINUOUS)) {
				return false;
			} else {
				return true;
			}
		}
		Rcpl.profileEnd();
		return super.isPageBreakAfter();
	}

	@Override
	public boolean isPageBreakAfterToNextColumn() {
		Rcpl.profile();
		if (isStartNewSection()) {
			JOPropertySectionType<JOSectionType> type = ((JOSection) getSection()).getSectionType();
			if (type != null && type.get().equals(JOSectionType.NEXT_COLUMN)) {
				return true;
			}
		}
		Rcpl.profileEnd();
		return false;
	}

	/**
	 * @return
	 */
	@Override
	public boolean isPageBreakBefore() {
		Rcpl.profile();
		if (super.isPageBreakBefore()) {
			Rcpl.profileEnd();
			return true;
		}
		if (getStyle().getPageBreakBefore() != null) {
			return (Boolean) getStyle().getPageBreakBefore().get();
		}
		Rcpl.profileEnd();
		return false;
	}

	@Override
	public boolean isStartNewSection() {
		return startNewSection;
	}

	public boolean isTransparent() {
		if (tableCell != null && ((JOTableCell) tableCell).getFillColor() == null) {
			transparent = true;
		}
		return transparent;
	}

	private void readDrawing(CTR ctr, int[] rangeStart, String hyperText, CTDrawing ctDrawing) {
		JODrawing drawing = new JODrawing(getDocument(), this, ctr, ctDrawing, false);
		hasDrawing = true;
		if (drawings == null) {
			drawings = new ArrayList<IDrawing>();
		}
		drawings.add(drawing);
		drawing.setInTextBox(isInTextBox());
		// double pz = getZOrder();
		// double dz = drawing.getZOrder();

		setZOrder(drawing.getZOrder());

		ILayoutAnchor vAnchor = drawing.getVAnchor();
		if (vAnchor != null && vAnchor.equals(ILayoutAnchor.TEXT)) {
			IStyle style2 = getDocument().getStyleTemplate().createClonedStyle(getStyle());
			style2.setHyperText(hyperText);
			style2.setCtr(ctr);
			style2.setStart(rangeStart[0]);
			rangeStart[0] += 1;
			if (drawing.getImage() != null) {
				hasInLineDrawing = true;
				style2.setDrawing(drawing);
				if (drawing.getImage() != null) {
					double width = drawing.getWidthPixel();
					style2.setDrawing(drawing);
					style2.setImage(drawing.getImage(), width, drawing.getHeightPixel());
					drawing.setAsCharacter(true);
				}
			} else {
				// LOGGER.warn("Drawing without image"); //$NON-NLS-1$
			}
			// if (!textBuffer.toString().endsWith(Rcpl.OBJECT_PLACEHOLDER))
			{
				textBuffer.append(Rcpl.OBJECT_PLACEHOLDER);
			}
			addStyle(style2);
		} else {
			add(drawing);
		}
	}

	/**
	 * @param xmlObject
	 */
	private void readPresentationRun(XmlObject xmlObject) {
		Rcpl.profile();
		if (xmlObject instanceof CTRegularTextRun) {
			CTRegularTextRun run = (CTRegularTextRun) xmlObject;
			String t = run.getT();
			int start = textBuffer.length();
			textBuffer.append(run.getT());
			CTTextCharacterProperties ctCharacterProperties = run.getRPr();
			if (ctCharacterProperties != null) {
				IStyle style = getStyle().copy();
				JOShape shape = (JOShape) getParent();
				JOSlideMasterPart slideMaster = shape.getSlide().getSlideMaster();
				CTColorMapping colorMapping = slideMaster.getCtColorMapping();
				// style.setCharacterProperties(new
				// JOPropertyCharacterProperties<JOCharacterProperties>(
				// this, run, run.getRPr(),
				// "character_properties", colorMapping)); //$NON-NLS-1$
				style.setStart(start);
				style.setLength(t.length());
				addStyle(style);
			}
		} else if (xmlObject instanceof CTTextLineBreak) {
			textBuffer.append("\n"); //$NON-NLS-1$
		}
		Rcpl.profileEnd();
	}

	/**
	 * 
	 */
	private void readXmlParagraphProperties() {
		Rcpl.profile();
		if (getXmlObject() instanceof CTP) {
			readXmlParagraphPropertiesWord();
		} else if (getXmlObject() instanceof CTTextParagraph) {
			readXmlParagraphPropertiesPresentation();
		}
		Rcpl.profileEnd();
	}

	/**
	 * 
	 */
	private void readXmlParagraphPropertiesPresentation() {
		Rcpl.profile();
		CTTextParagraph ctTextParagraph = (CTTextParagraph) getXmlObject();
		if (ctTextParagraph.getPPr() != null) {
			STTextAlignType.Enum textAlign = ctTextParagraph.getPPr().getAlgn();
			if (textAlign != null) {
				alignment = new JOPropertyTextAlign<JOAlignment>(this, ctTextParagraph, ctTextParagraph.getPPr(), null);
				alignment.get();
			}
			// int indent = ctTextParagraph.getPPr().getIndent();
			// int marginLeft = ctTextParagraph.getPPr().getMarL();
			// int marginRight = ctTextParagraph.getPPr().getMarR();

			// ---------- bullets ----------------------------------------------

			ctTextParagraph.getPPr().getBuAutoNum();
			ctTextParagraph.getPPr().getBuBlip();
			ctTextParagraph.getPPr().getBuChar();
			ctTextParagraph.getPPr().getBuClr();
			ctTextParagraph.getPPr().getBuClrTx();
			ctTextParagraph.getPPr().getBuFont();
			ctTextParagraph.getPPr().getBuFontTx();
			ctTextParagraph.getPPr().getBuNone();
			ctTextParagraph.getPPr().getBuSzPct();
			ctTextParagraph.getPPr().getBuSzPts();
			ctTextParagraph.getPPr().getBuSzTx();
			ctTextParagraph.getPPr().getBuSzTx();

			ctTextParagraph.getPPr().getDefRPr();
			ctTextParagraph.getPPr().getDefTabSz();
			ctTextParagraph.getPPr().getEaLnBrk();
			ctTextParagraph.getPPr().getExtLst();
			ctTextParagraph.getPPr().getFontAlgn();
			ctTextParagraph.getPPr().getHangingPunct();
			ctTextParagraph.getPPr().getLatinLnBrk();
			ctTextParagraph.getPPr().getLnSpc();
			ctTextParagraph.getPPr().getRtl();
			ctTextParagraph.getPPr().getSpcAft();
			ctTextParagraph.getPPr().getSpcBef();
			ctTextParagraph.getPPr().getTabLst();
		}
		Rcpl.profileEnd();
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private void readXmlParagraphPropertiesWord() {
		Rcpl.profile();
		try {

			fillColorProperty = new JOColorProperty(this, ctp, ctp.getPPr(), "Shd", //$NON-NLS-1$
					new String[] { "word/actions/paragraph/shading" }, //$NON-NLS-1$
					true, null);

			CTPPr ctpPr = ((CTP) getXmlObject()).getPPr();

			if (ctpPr != null) {

				tabs = JOPropertyFactory.create(this, ctpPr, ctpPr.getTabs(), false);

				CTSectPr ctSectPr = ctpPr.getSectPr();

				if (ctSectPr != null) {
					JOSection newSection = new JOSection(this, this, getXmlObject(), ctSectPr, false);
					setSection(newSection);
					startNewSection = true;
				}

				// ---------- bullets & numbering ------------------------------

				CTNumPr numPr = ctpPr.getNumPr();
				if (numPr != null) {
					CTDecimalNumber level = numPr.getIlvl();
					numPr.getIns();
					// CTTrackChangeNumbering ctTrackChangeNumbering = numPr
					// .getNumberingChange();
					// ctTrackChangeNumbering.getAuthor()
					if (((JOWordDocument) getDocument()).getNumberingDocument() != null) {
						CTDecimalNumber numId = numPr.getNumId();
						numbering = ((JOWordDocument) getDocument()).getNumberingDocument().getNumberingPart()
								.findNumbering(numId.getVal(), JONumbering.TYPE_NUM);
						if (numbering != null) {
							numbering.setLevel(level.getVal().intValue());
						}
					} else {
						numbering = new JONumbering(getDocument(), this, ctpPr, ctpPr.getNumPr(), true, null);
					}

				}

				// ---------- styles -------------------------------------------

				IStyle st = getStyle(ctpPr.getPStyle());
				if (st != null) {
					templateStyle = st;
					templateStyle.setTemplateStyle();
				}
				style = templateStyle.copy();

				CTParaRPr ctPararPr = ctpPr.getRPr();
				if (ctPararPr != null) {
					style.setBold(ctPararPr.getB() != null);
					style.setItalic(ctPararPr.getI() != null);
					style.setFonts(ctPararPr.getRFonts());
					CTHpsMeasure charStyleHpsMeasure = ctPararPr.getSz();
					if (charStyleHpsMeasure != null && charStyleHpsMeasure.getVal() != null) {

						float widthPercentage = 1f;
						if (ctPararPr.getW() != null) {
							widthPercentage = ctPararPr.getW().getVal() / 100f;
						}
						double h = (charStyleHpsMeasure.getVal().floatValue() / 2.0f) * widthPercentage;
						setFontSize(style, h);
					}
				}

				// ---------- frame --------------------------------------------

				CTFramePr frame = ctpPr.getFramePr();
				if (frame != null) {
				}
				// ---------- Shadow & Fill ------------------------------------

				// if (ctpPr.getShd() != null) {
				fillColorProperty = new JOColorProperty(this, getXmlObject(), ctpPr, "Shd", //$NON-NLS-1$
						new String[] { "word/actions/paragraph/shading" }, //$NON-NLS-1$
						true, null);

				// ---------- spacing ------------------------------------------

				CTSpacing ctSpacing = ctpPr.getSpacing();
				if (ctSpacing != null) {
					ctSpacing.getLineRule();
					getStyle().setSpacingBefore(
							new JOEmu20ThPointProperty(this, ctpPr, ctSpacing, "Before", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					getStyle().setSpacingAfter(
							new JOEmu20ThPointProperty(this, ctpPr, ctSpacing, "After", null, EValueType.MEASUREMENT)); //$NON-NLS-1$

					getStyle().setSpacingLine(
							new JOLineSpacingProperty(this, ctpPr, ctSpacing, "Line", null, EValueType.MEASUREMENT)); //$NON-NLS-1$

				}

				// ---------- cnf style ----------------------------------------

				CTCnf ctCnf = ctpPr.getCnfStyle();
				if (ctCnf != null) {
					// String formatTemplate = ctCnf.getVal();
				}

				// ---------- borders ------------------------------------------

				if (ctpPr.getPBdr() != null) {
					border = new JOBorder(this, ctpPr.getPBdr());
				} else {
					border = style.getBorder();
				}

				// ---------- page break ---------------------------------------

				if (ctpPr.getPageBreakBefore() != null) {
					setPageBreakBefore(new JOBoolean(this, getXmlObject(), ctpPr, "PageBreakBefore", null)); //$NON-NLS-1$
				}

				// ---------- text alignment -----------------------------------

				if (ctpPr.getTextAlignment() != null) {
					alignment = new JOPropertyTextAlign<JOAlignment>(null, ctpPr, ctpPr.getTextAlignment(), null);
				} else {
					alignment = (JOPropertyTextAlign<JOAlignment>) getStyle().getTextAlignment();
				}

				// ---------- alignment ----------------------------------------

				if (ctpPr.getJc() != null) {
					alignment = new JOPropertyTextAlign<JOAlignment>(null, ctpPr, ctpPr.getJc(), null);
				} else {

					alignment = ((JOPropertyTextAlign<JOAlignment>) getStyle().getTextAlignment());

					// if (getJOStyle().getTextAlignment() != null) {
					// alignment = getJOStyle().getTextAlignment();
					//
					// // new JOPropertyTextAlign<JOAlignment>(null,
					// // ctpPr, getJOStyle().getJc(), null);
					// // alignment.get();
					// }
				}

			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		Rcpl.profileEnd();
	}

	/**
	 * @param ctPicture
	 */
	private void readXmlPict(CTR ctr, CTPicture ctPicture) {
		JOPict pict = new JOPict(getDocument(), this, ctr, ctPicture, false);
		pict.setSection((JOSection) getSection());
		setZOrder(pict.getZOrder());
		add(pict);
	}

	/**
	 * @param ctr
	 * @param onlyStyledTextElements
	 * @param rangeStart
	 * @param fontheight
	 */
	@SuppressWarnings({ "deprecation" })
	private boolean readXmlRun(CTR ctr, boolean onlyStyledTextElements, int[] rangeStart, float[] fontheight,
			String hyperText) {

		CTEmpty[] tabArray = ctr.getTabArray();
		if (tabArray != null && tabArray.length > 0) {
			textBuffer.append("\t"); //$NON-NLS-1$
		}

		if (onlyStyledTextElements) {
			if (ctr.getDrawingArray() != null && ctr.getDrawingArray().length > 0) {
				return false;
			}
			if (ctr.getPictArray() != null && ctr.getPictArray().length > 0) {
				return false;
			}
		}

		// ---------- invisible parts like hyperlinks ----------------------

		// CTText[] ctTexts = ctr.getInstrTextArray();
		// for (CTText text2 : ctTexts) {
		// // "INSTR{" + text2.getStringValue() + "}";
		// }

		// ---------- page breaks ------------------------------------------

		CTBr[] brArray = ctr.getBrArray();

		if (brArray != null && brArray.length > 0) {
			for (CTBr ctBr : brArray) {
				STBrType.Enum brType = ctBr.getType();
				if (brType != null) {
					if (brType.equals(STBrType.COLUMN)) {
						columnBreak = true;
					} else if (brType.equals(STBrType.PAGE)) {
						setPageBreakAfter(true);

						// setPageBreakBefore(new JOPropertyOnOff<Boolean>(this,
						// ctrBr,
						// ctpPr.getPageBreakBefore()));

					} else if (brType.equals(STBrType.TEXT_WRAPPING)) {
						textBuffer.append("\n"); //$NON-NLS-1$
					}
				} else {
					textBuffer.append("\n"); //$NON-NLS-1$
					// TODO: ???
					// pageBreakBefore = true;
				}
			}
		}

		// ---------- text fragments ---------------------------------------

		CTText[] cTextFragmentArray = ctr.getTArray();
		String t = ""; //$NON-NLS-1$
		if (cTextFragmentArray.length > 0) {
			t = cTextFragmentArray[0].getStringValue();
		}
		textBuffer.append(t);

		// CTObject[] ctObjects = ctr.getObjectArray();
		// for (CTObject object : ctObjects) {
		//
		// }

		// CTEmpty[] bBreakArray = ctr.getLastRenderedPageBreakArray();
		// for (CTEmpty empty : bBreakArray) {
		// renderedPageBreak = true;
		// }

		// CTEmpty[] annotationRefArray = ctr.getAnnotationRefArray();
		// CTMarkup[] commentReferenceArray = ctr.getCommentReferenceArray();
		// CTEmpty[] continuationsSeparatorARRAY = ctr
		// .getContinuationSeparatorArray();
		// CTEmpty[] crArray = ctr.getCrArray();
		// for (CTEmpty ctEmpty : crArray) {
		// }
		// CTEmpty[] dayLongArray = ctr.getDayLongArray();
		// CTEmpty[] dayShortArray = ctr.getDayShortArray();
		// CTText[] delInstrTextArray = ctr.getDelInstrTextArray();
		ctr.getDelTextArray();
		ctr.getDelTextArray();

		// ---------- drawings -------------------------------------------------

		if (!onlyStyledTextElements) {
			CTDrawing[] ctDrawings = ctr.getDrawingArray();
			for (CTDrawing ctDrawing : ctDrawings) {
				readDrawing(ctr, rangeStart, hyperText, ctDrawing);
			}
		}

		List<CTPicture> pictures = ctr.getPictList();

		ctr.getEndnoteRefArray();

		Node drawing = JOUtil.findNode(ctr.getDomNode(), "w:drawing");

		if (drawing != null) {

			try {
				CTDrawing ctDrawing = CTDrawing.Factory.parse(drawing);
				readDrawing(ctr, rangeStart, hyperText, ctDrawing);
			} catch (XmlException e) {
				// TODO Auto-generated catch block

			}
		}

		// for (String key : map.keySet()) {
		// System. out("key: " + key + " value: " + map.get(key));
		// }

		ctr.getFootnoteRefArray();
		ctr.getFootnoteReferenceArray();
		ctr.getInstrTextArray();

		// CTEmpty[] lastRenderedPageBreakArray = ctr
		// .getLastRenderedPageBreakArray();

		ctr.getMonthLongArray();
		ctr.getMonthShortArray();
		ctr.getNoBreakHyphenArray();
		ctr.getObjectArray();
		ctr.getPgNumArray();

		// ---------- pictures ---------------------------------------------

		if (!onlyStyledTextElements) {
			CTPicture[] pictArray = ctr.getPictArray();
			for (CTPicture ctPicture : pictArray) {
				readXmlPict(ctr, ctPicture);
			}
		}

		// CTPTab[] pTabArray = ctr.getPtabArray();
		// CTRPr rPr = ctr.getRPr();
		ctr.getRsidDel();
		ctr.getRsidRPr();
		ctr.getRubyArray();
		ctr.getSeparatorArray();
		ctr.getSoftHyphenArray();
		ctr.getSymArray();
		ctr.getTabArray();
		ctr.getTArray();
		ctr.getYearLongArray();
		ctr.getYearShortArray();

		// ---------- fields -----------------------------------------------

		CTFldChar[] fldCharArray = ctr.getFldCharArray();
		if (fldCharArray != null) {
			for (CTFldChar fldChar : fldCharArray) {
				CTText fldData = fldChar.getFldData();
				if (fldData != null) {
				}
				CTFFData ctFFData = fldChar.getFfData();
				if (ctFFData != null) {
				}
			}
		}

		int length = t.length();

		// ---------- Formatting found ---------------------------------

		CTRPr ctrPr = ctr.getRPr();
		if (ctrPr != null) {

			CTString rStyle = ctrPr.getRStyle();

			IStyle newStyle = null;

			if (rStyle != null) {
				JOStyle rS = (JOStyle) getStyle(rStyle);
				if (rS != null) {
					newStyle = ((JOStyleTemplate) rS.getStyleTemplate()).createClonedStyle(rS);
				} else {
					// // LOGGER.error("Style not found"); //$NON-NLS-1$
					newStyle = getDocument().getStyleTemplate().createClonedStyle(getStyle());
				}
			} else {
				newStyle = getDocument().getStyleTemplate().createClonedStyle(getStyle());
			}

			newStyle.setCtr(ctr);
			newStyle.setHyperText(hyperText);

			// OOXMLStyle characterStyle = null;

			// CTString charStyle = ctrPr.getRStyle();
			// if (charStyle != null) {
			// String id = charStyle.getVal();
			// characterStyle = getDocument().getStyleTemplate()
			// .getstyleById(id);
			// if (characterStyle != null) {
			// characterStyle.setStyleTemplate(getDocument()
			// .getStyleTemplate());
			// } else {
			// characterStyle = OOXMLOfficePane.globalStyleTemplate
			// .getstyleById(id);
			// if (characterStyle != null) {
			// characterStyle
			// .setStyleTemplate(OOXMLOfficePane.globalStyleTemplate);
			// }
			// }
			// if (characterStyle != null) {
			// newOOXMLStyleRange.font = characterStyle.font;
			// }
			// }

			// newOOXMLStyleRange.setTextEffect(ctrPr.getEffect() != null ?
			// ctrPr
			// .getEffect().getVal() : null);

			// newOOXMLStyleRange.setBcs(ctrPr.getBCs());
			// newOOXMLStyleRange.setCaps(ctrPr.getCaps());
			// newOOXMLStyleRange.setCs(ctrPr.getCs());

			// newOOXMLStyleRange
			// .setStrikeThrough(ctrPr.getStrike() != null ? new JOBoolean(
			// this, ctr, ctrPr, "Strike", //$NON-NLS-1$
			// new String[] { "word/actions/font/strikethrough" }) //$NON-NLS-1$
			// : null);
			// newOOXMLStyleRange.setEmboss(ctrPr.getEmboss());
			// newOOXMLStyleRange.setImprint(ctrPr.getImprint());
			// newOOXMLStyleRange.setNoProof(ctrPr.getNoProof());
			// newOOXMLStyleRange.setOMath(ctrPr.getOMath());
			// newOOXMLStyleRange.setOutline(ctrPr.getOutline());
			// newOOXMLStyleRange.setRtl(ctrPr.getRtl());
			// newOOXMLStyleRange.setCtShd(ctrPr.getShd());
			// newOOXMLStyleRange.setShadow(ctrPr.getShadow());
			// newOOXMLStyleRange.setSmallCaps(ctrPr.getSmallCaps());
			// newOOXMLStyleRange.setSnapToGrip(ctrPr.getSnapToGrid());
			// newOOXMLStyleRange.setBorder(ctrPr.getBdr());
			// newOOXMLStyleRange.setUnderline(ctrPr.getU() != null ?
			// ctrPr.getU()
			// .getVal() : null);
			// newOOXMLStyleRange.setTextScale(ctrPr.getW());

			// order important

			newStyle.setBold(ctrPr.getB() != null);
			newStyle.setItalic(ctrPr.getI() != null);
			newStyle.setFonts(ctrPr.getRFonts());

			float widthPercentage = 1f;
			if (ctrPr.getW() != null) {
				widthPercentage = ctrPr.getW().getVal() / 100f;
			}

			CTHpsMeasure charStyleHpsMeasure = ctrPr.getSz();
			if (charStyleHpsMeasure != null && charStyleHpsMeasure.getVal() != null) {
				fontheight[0] = (int) (charStyleHpsMeasure.getVal().floatValue() / 2.0f) * widthPercentage;
				setFontSize(newStyle, fontheight[0]);
			} else {
				// if (characterStyle != null
				// && characterStyle.getFont() != null) {
				// newOOXMLStyleRange.font = characterStyle.getFont();
				fontheight[0] = (float) newStyle.getFont().getHeight();
				// }
				//
				// else if (style != null
				// && style.getFont() != null) {
				// newOOXMLStyleRange.font = style.getFont();
				// fontheight =
				// newOOXMLStyleRange.font.getFontData()[0].height;
				// }
			}
			// newOOXMLStyleRange.setPrChange(ctrPr.getRPrChange());
			//
			// newOOXMLStyleRange.setEm(ctrPr.getEm() != null ? ctrPr.getEm()
			// .getVal() : null);

			if (ctrPr.getColor() != null) {
				newStyle.setForeground(Rcpl.colorProvider().get(ctrPr.getColor()));
			}

			if (ctrPr.getHighlight() != null) {
				// newOOXMLStyleRange
				// .setHighlightColor(new JOColorProperty(
				// this,
				// ctr,
				// ctrPr,
				// "Highlight", //$NON-NLS-1$
				// new String[] { "actions/font/set_highlight" }, true, null));
				// //$NON-NLS-1$
			}
			if (length > 0) {
				newStyle.setLength(length);
				newStyle.setStart(rangeStart[0]);
				addStyle(newStyle);

			} else if (tabArray != null && tabArray.length > 0) {
				newStyle.setLength(1);
				newStyle.setStart(rangeStart[0]);
				addStyle(newStyle);
			}
			newStyle.updateFont();

			// ---------- vertival align (needs font) --------------------------

			CTVerticalAlignRun vAlign = ctrPr.getVertAlign();
			if (vAlign != null) {
				// if (vAlign.getVal().equals(STVerticalAlignRun.SUPERSCRIPT)) {
				// newOOXMLStyleRange.setVertivalAlign(new JOBoolean(this,
				// ctr, ctrPr, "VertAlign", //$NON-NLS-1$
				// new String[] { "word/actions/font/superscript" }));
				// //$NON-NLS-1$
				// } else if
				// (vAlign.getVal().equals(STVerticalAlignRun.SUBSCRIPT)) {
				// newOOXMLStyleRange.setVertivalAlign(new JOBoolean(this,
				// ctr, ctrPr, "VertAlign", //$NON-NLS-1$
				// new String[] { "word/actions/font/subscript" }));
				// //$NON-NLS-1$
				// }
			}

		} else {

			// no format found

			createOOXMLStyleRanges(ctr, t, rangeStart[0], hyperText);

		}

		// CTSdtRun[] ctsdtRun = ctp.getSdtArray();
		// for (CTSdtRun sdtRun : ctsdtRun) {
		// // sdtRun.getSdtContent().get
		// }

		rangeStart[0] += length;

		return true;
	}

	/**
	 * 
	 */
	@SuppressWarnings({ "deprecation" })
	private void readXmlRuns(List<XmlObject> runs, boolean onlyStyledTextElements) {
		Rcpl.profile();

		int[] rangeStart = new int[] { 0 };
		float[] fontheight = new float[] { 11.0f };

		// ---------- Rich Text Fragments ----------------------------------

		for (int index = 0; index < runs.size(); index++) {
			XmlObject xmlObject = runs.get(index);
			CTR ctr = null;
			if (xmlObject instanceof CTR) {
				ctr = (CTR) xmlObject;
				if (!readXmlRun(ctr, onlyStyledTextElements, rangeStart, fontheight, null)) {
					continue;
				}
			} else if (xmlObject instanceof CTHyperlink) {
				CTHyperlink hyperlink = ((CTHyperlink) xmlObject);
				String hyperText = hyperlink.getTooltip();
				CTR[] hrs = ((CTHyperlink) xmlObject).getRArray();
				for (CTR ctr2 : hrs) {
					if (!readXmlRun(ctr2, onlyStyledTextElements, rangeStart, fontheight, hyperText)) {
						continue;
					}
				}
			} else if (xmlObject instanceof CTSimpleField) {
				CTSimpleField simpleField = (CTSimpleField) xmlObject;
				CTR[] fieldRuns = simpleField.getRArray();
				for (int indexFieldRun = 0; indexFieldRun < fieldRuns.length; indexFieldRun++) {
					if (!readXmlRun(fieldRuns[indexFieldRun], onlyStyledTextElements, rangeStart, fontheight, null)) {
						continue;
					}
				}
			} else if (xmlObject instanceof CTRegularTextRun || xmlObject instanceof CTTextLineBreak) {
				readPresentationRun(xmlObject);
			}
		}
		Rcpl.profileEnd();

	}

	/**
	 * 
	 */
	@Override
	public void removeChildren() {
		JOObject[] chs = getChildren();
		for (JOObject joObject : chs) {
			try {
				ILayoutFigure parent = joObject.getLayoutFigure().getParentFigure();
				if (parent != null) {
					parent.remove(joObject.getLayoutFigure());
				} else {
					ILayoutFigure fxo = ((JOFXAbstractFigure) joObject.getLayoutFigure().getFx()).getParentFigure();
					if (fxo instanceof IPage) {
						((IPage) fxo).remove(joObject.getLayoutFigure().getFx());
					}
				}
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
		}

		if (drawings != null) {
			for (IDrawing d : drawings) {
				ILayoutFigure parent = d.getLayoutFigure().getParentFigure();
				if (parent != null) {
					parent.remove(d.getLayoutFigure());
				}
			}
		}
		drawings = new ArrayList<IDrawing>();
		getChildList().clear();
	}

	@Override
	public boolean selectAll() {
		getLayoutFigure().selectAll();
		return true;
	}

	/**
	 * @param alignment
	 */
	public void setAlignment(JOPropertyTextAlign<JOAlignment> alignment) {
		this.alignment = alignment;
	}

	@Override
	public void setAlignment(ParagraphAlignment align) {
		Rcpl.profile();
		if (getXmlObject() instanceof CTP) {
			CTPPr pr = ((CTP) getXmlObject()).getPPr();
			if (pr == null) {
				pr = ((CTP) getXmlObject()).addNewPPr();
			}
			CTJc jc = pr.isSetJc() ? pr.getJc() : pr.addNewJc();
			STJc.Enum en = STJc.Enum.forInt(align.getValue());
			jc.setVal(en);
		}
		Rcpl.profileEnd();
	}

	@Override
	public void setBold(boolean bold) {
		IStyle newStyle = getStyle().copy();
		newStyle.setBold(bold);
		setStyle(newStyle);
		setDirtyContent(true);
		getLayoutFigure().updateFx();
	}

	public void setBold(CTR run, boolean value) {
		Rcpl.profile();
		CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
		CTOnOff bold = pr.isSetB() ? pr.getB() : pr.addNewB();
		bold.setVal(value ? STOnOff.TRUE : STOnOff.FALSE);
		Rcpl.profileEnd();
	}

	public void setBulletCharacter(JOStringProperty bulletCharacter) {
		this.bulletCharacter = bulletCharacter;
	}

	public void setCaretTextRunOffset(int caretTextRunOffset) {
		if (caretTextRunOffset == 0) {
			// System. out.();
		}
		this.caretTextRunOffset = caretTextRunOffset;
	}

	public void setCellMarginBottom(double cellMarginBottom) {
		this.cellMarginBottom = cellMarginBottom;
	}

	public void setCellMarginLeft(double cellMarginLeft) {
		this.cellMarginLeft = cellMarginLeft;
	}

	public void setCellMarginRight(double cellMarginRight) {
		this.cellMarginRight = cellMarginRight;
	}

	public void setCellMarginTop(double cellMarginTop) {
		this.cellMarginTop = cellMarginTop;
	}

	@Override
	public void setDirtyContent(boolean dirty) {
		super.setDirtyContent(dirty);
		if (dirty) {
			if (getVAnchorObject() instanceof JOShape) {
				JOShape shape = (JOShape) getVAnchorObject();
				shape.getSlide().setDirty(dirty);
			}
		}
	}

	public void setDrawings(List<IDrawing> drawings) {
		this.drawings = drawings;
	}

	public void setFontSize(CTParaRPr ctParaRPr, double size) {
		Rcpl.profile();
		BigInteger bint = new BigInteger("" + (int) size); //$NON-NLS-1$
		CTHpsMeasure ctSize = ctParaRPr.isSetSz() ? ctParaRPr.getSz() : ctParaRPr.addNewSz();
		ctSize.setVal(bint.multiply(new BigInteger("2"))); //$NON-NLS-1$
		Rcpl.profileEnd();
	}

	public void setFontSize(CTR run, double size) {
		Rcpl.profile();
		BigInteger bint = new BigInteger("" + (int) size); //$NON-NLS-1$
		CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
		CTHpsMeasure ctSize = pr.isSetSz() ? pr.getSz() : pr.addNewSz();
		ctSize.setVal(bint.multiply(new BigInteger("2"))); //$NON-NLS-1$
		Rcpl.profileEnd();
	}

	public void setFontSize(CTRegularTextRun run, double size) {
		CTTextCharacterProperties pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
		pr.setSz((int) (size * 100));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.IParagraph#setFontSize(double)
	 */
	@Override
	public void setFontSize(double fontSize) {
		IStyle newStyle = getStyle().copy();
		IFont newFont = newStyle.getFont().copy();
		newFont.setHeight(fontSize);
		newStyle.setFont(newFont);
		newStyle.setHeight(fontSize);
		setStyle(newStyle);
		setDirtyContent(true);
		getLayoutFigure().updateFx();
		if (getOverflowParagraphFigure() != null) {
			getOverflowParagraphFigure().updateFx();
		}
		if (getDocument().isLayouted()) {
			getLayoutFigure().updateHeightAndLayoutAndWait();
		}
	}

	@Override
	public void setFontName(String fontName) {
		IStyle newStyle = getStyle().copy();
		IFont newFont = newStyle.getFont().copy();
		newFont.setName(fontName);
		newStyle.setFont(newFont);
		setStyle(newStyle);
		setDirtyContent(true);
		getLayoutFigure().updateFx();
		if (getOverflowParagraphFigure() != null) {
			getOverflowParagraphFigure().updateFx();
		}
		if (getDocument().isLayouted()) {
			getLayoutFigure().updateHeightAndLayoutAndWait();
		}
	}

	/**
	 * @param range
	 */
	private void setFontSize(IStyle range, double height) {
		IStyle style;
		if (range != null) {
			style = range;
			IFont font = style.getFont();
			style.setFont(Rcpl.fontProvider().loadFont(font, height));
		}
		if (getDocument().isLayouted()) {
			getLayoutFigure().updateHeightAndLayoutAndWait();
		}
	}

	public void setInTextBox(boolean inTextBox) {
		this.inTextBox = inTextBox;
	}

	@Override
	public void setItalic(boolean italic) {
		IStyle newStyle = getStyle().copy();
		newStyle.setItalic(italic);
		setStyle(newStyle);
		setDirtyContent(true);
		getLayoutFigure().updateFx();
		if (getOverflowParagraphFigure() != null) {
			getOverflowParagraphFigure().updateFx();
		}
	}

	public void setItalic(CTR run, boolean value) {
		CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
		CTOnOff italic = pr.isSetI() ? pr.getI() : pr.addNewI();
		italic.setVal(value ? STOnOff.TRUE : STOnOff.FALSE);
	}

	@Override
	public void setMarginLeft(JOEmuProperty marginLeft) {
		this.marginLeft = marginLeft;
	}

	@Override
	public void setMarginRight(JOEmuProperty marginRight) {
		this.marginRight = marginRight;
	}

	public void setNumbering(JONumbering numbering) {
		this.numbering = numbering;
	}

	public void setPageBreakBefore(JOBoolean pageBreakBefore) {
		this.pageBreakBefore = pageBreakBefore;
	}

	@Override
	public void setSelectionEnd(int selectionEnd) {
		// this.selectionEnd = selectionEnd;

	}

	@Override
	public void setSelectionStart(int selectionStart) {
		// this.selectionStart = selectionStart;

	}

	@Override
	public void setStyle(IStyle style) {
		if (style == null) {
			this.style = Rcpl.globalStyleTemplate().findStyle("Normal");
		} else {
			this.style = style;
		}
		characterStyles = null;
	}

	@Override
	public void setTableCell(ITableCell tableCell) {
		this.tableCell = tableCell;
	}

	public void setTabs(JOPropertyTabs<JOTabArray> tabs) {
		this.tabs = tabs;
	}

	@SuppressWarnings("deprecation")
	public void setText(CTR run, String value) {
		setText(run, value, run.getTArray().length);
	}

	public void setText(CTR run, String value, int pos) {
		Rcpl.profile();
		if (pos > run.sizeOfTArray())
			throw new ArrayIndexOutOfBoundsException("value too long"); //$NON-NLS-1$
		CTText t = (pos < run.sizeOfTArray() && pos >= 0) ? run.getTArray(pos) : run.addNewT();
		t.setStringValue(value);
		Rcpl.profileEnd();
	}

	public void setText(CTRegularTextRun run, String value) {
		run.setT(value);
	}

	/**
	 * @param text
	 */
	@Override
	@SuppressWarnings("deprecation")
	public void setText(String text) {
		Rcpl.profile();
		try {
			if (getXmlObject() instanceof CTP) {
				CTR[] runs = ((CTP) getXmlObject()).getRArray();
				for (int i = 0; i < runs.length; i++) {
					((CTP) getXmlObject()).removeR(0);
				}
				CTR run = ((CTP) getXmlObject()).addNewR();
				setText(run, text);

			} else if (getXmlObject() instanceof CTTextParagraph) {
				CTRegularTextRun[] runs = ((CTTextParagraph) getXmlObject()).getRArray();
				for (int i = 0; i < runs.length; i++) {
					((CTTextParagraph) getXmlObject()).removeR(0);
				}

				CTR run = ((CTP) getXmlObject()).addNewR();
				setText(run, text);
			}
			setDirtyContent(true);
			updateFromXml();
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		update();
		Rcpl.profileEnd();
	}

	public void setTextBounds(Rectangle2D textBounds) {
		this.textBounds = textBounds;
	}

	@Override
	public void setTextBoundsHeight(double textBoundsHeight) {
		this.textBoundsHeight = textBoundsHeight;
	}

	public void setTransparent(boolean transparent) {
		this.transparent = transparent;
	}

	@Override
	public void setUnderline(boolean underline) {
		Rcpl.profile();
		IStyle newStyle = getStyle().copy();
		newStyle.setUnderline(underline);
		setStyle(newStyle);
		setDirtyContent(true);
		getLayoutFigure().updateFx();
		Rcpl.profileEnd();
	}

	public void setUnderline(CTR run, UnderlinePatterns value) {
		Rcpl.profile();
		CTRPr pr = run.isSetRPr() ? run.getRPr() : run.addNewRPr();
		CTUnderline underline = (pr.getU() == null) ? pr.addNewU() : pr.getU();
		underline.setVal(STUnderline.Enum.forInt(value.getValue()));
		Rcpl.profileEnd();
	}

	@Override
	public String toString() {
		String dirtyString = ""; //$NON-NLS-1$
		String boundsString = ""; //$NON-NLS-1$
		if (dirtyLayout) {
			dirtyString = "drtLay "; //$NON-NLS-1$
		}
		if (layoutFigure != null) {

			boundsString = "bounds: " + layoutFigure.getHeight() + " ";//$NON-NLS-1$ //$NON-NLS-2$
		}
		String result = (isRootObject() ? "root object " : "") + " t: \"" + textBuffer + "\"  n: " //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				+ getDocument().getParagraphs().indexOf(this) + "  " + dirtyString + boundsString //$NON-NLS-1$
				+ " rPgBrk: " + renderedPageBreak //$NON-NLS-1$
				+ " brkBef: " + isPageBreakBefore() + " brkAft: " //$NON-NLS-1$ //$NON-NLS-2$
				+ isPageBreakAfter();

		return result;
	}

	@Override
	public void unselect() {
		getLayoutFigure().unselect();
	}

	@Override
	public void update() {
		getLayoutFigure().getFx().updateFx();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.OOXMLLayoutObject#updateFromXml()
	 */
	@Override
	public void updateFromXml() {
		updateFromXml(false);
	}

	@Override
	@SuppressWarnings({ "deprecation" })
	public void updateFromXml(boolean onlyStyledTextElements) {

		clearRunStyles();

		// ---------- paragraph in a spreadsheet -------------------------------

		if (getParent() != null && getParent() instanceof JOCell) {
			initSpreadsheetParagraph();
			return;
		}

		try {
			if (isDirtyContent()) {

				init(onlyStyledTextElements);

				// ---------- WORD PARAGRAPH -----------------------------

				if (getXmlObject() instanceof CTP) {
					CTPPr ctpPr = ((CTP) getXmlObject()).getPPr();
					if (ctpPr != null) {
						CTInd ind = ctpPr.getInd();
						if (ind != null) {

							valueIndent = new JOPropertyIndent<JOIndent>(this, ctpPr, ind, "indent", false); //$NON-NLS-1$

							totalIdentPixel = valueIndent.calulculateTotalIndentPixel();

							// - totalIdentPixel);
						}
					}
				}

				// ---------- spreadsheet --------------------------------------

				// if (getAnchorObject() instanceof JOCell) {
				// JOCell joCell = (JOCell) getAnchorObject();
				// JOSheetPart spreadSheet = joCell.getSheet();
				// }

				if (getTableCell() != null) {
					transparent = ((JOTableCell) getTableCell()).getFillColor() == null;
				}

				// ---------- format for the whole paragraph -------------------

				readXmlParagraphProperties();

				updateWidth();

				List<XmlObject> runs = new ArrayList<XmlObject>();

				if (getXmlObject() instanceof CTP) {
					CTP ctp = (CTP) getXmlObject();
					if (ctp.getRArray() != null) {
						for (XmlObject o : ctp.getRArray()) {
							runs.add(o);
						}
					}
					if (ctp.getHyperlinkArray() != null) {
						for (XmlObject o : ctp.getHyperlinkArray()) {
							runs.add(o);
						}
					}

					CTSimpleField[] fields = ctp.getFldSimpleArray();
					if (fields != null && fields.length > 0) {
						for (XmlObject o : ctp.getFldSimpleArray()) {
							runs.add(o);
						}
					}

				}

				// ---------- DRAWING PARAGRAPH -----------------------

				else if (getXmlObject() instanceof CTTextParagraph) {
					ctt = (CTTextParagraph) getXmlObject();

					CTTextBody ctTextBody = (CTTextBody) getXmlParent();

					CTTextBodyProperties ctTextBodyProperties = ctTextBody.getBodyPr();
					if (ctTextBodyProperties != null) {

						ctTextBodyProperties.getAnchor();
						ctTextBodyProperties.getAnchorCtr();
						ctTextBodyProperties.getBIns();
						ctTextBodyProperties.getCompatLnSpc();
						ctTextBodyProperties.getExtLst();
						ctTextBodyProperties.getFlatTx();
						ctTextBodyProperties.getForceAA();
						ctTextBodyProperties.getFromWordArt();
						ctTextBodyProperties.getHorzOverflow();
						// int lIns = ctTextBodyProperties.getLIns();

						ctTextBodyProperties.getNoAutofit();
						ctTextBodyProperties.getNormAutofit();
						ctTextBodyProperties.getNumCol();
						ctTextBodyProperties.getPrstTxWarp();
						ctTextBodyProperties.getRIns();
						ctTextBodyProperties.getRot();
						ctTextBodyProperties.getRtlCol();
						ctTextBodyProperties.getScene3D();
						ctTextBodyProperties.getSp3D();
						ctTextBodyProperties.getSpAutoFit();
						ctTextBodyProperties.getSpcCol();
						ctTextBodyProperties.getSpcFirstLastPara();
						ctTextBodyProperties.getTIns();
						ctTextBodyProperties.getUpright();
						ctTextBodyProperties.getVert();
						ctTextBodyProperties.getVertOverflow();
						ctTextBodyProperties.getWrap();

					}
					CTTextParagraph ctp = (CTTextParagraph) getXmlObject();
					if (ctp.getRArray() != null) {
						for (XmlObject o : ctp.getRArray()) {
							runs.add(o);
						}
					}
					CTTextLineBreak[] lineBreaks = ctp.getBrArray();
					if (lineBreaks != null) {
						for (XmlObject o : ctp.getBrArray()) {
							runs.add(o);
						}
					}
				}

				JOUtil2.sortXmlObjects(runs);
				readXmlRuns(runs, onlyStyledTextElements);
				setDirtyContent(false);
				updateParagraphSize();
				setDirtyContent(false);
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

	}

	/**
	 * @param b
	 */

	private boolean updateParagraphSize() {

		double width = getWidthPixel();
		double height = getLayoutFigure().getHeight();

		if (getBorder() != null) {
			if (getBorder().getDistanceLeft() != null) {
				width += getBorder().getLineWidthLeft().toPixel();
			}
			if (getBorder().getDistanceRight() != null) {
				width += getBorder().getLineWidthRight().toPixel();
			}

			if (getBorder().getDistanceTop() != null) {
				height += getBorder().getLineWidthTop().toPixel();
			}
			if (getBorder().getDistanceBottom() != null) {
				height += getBorder().getLineWidthBottom().toPixel();
			}
		}

		if (getLayoutFigure() != null) {

			setHeightPixel(height);
			Rectangle2D r = getLayoutBounds();
			setLayoutBounds(new Rectangle2D(r.getMinX(), r.getMinY(), width, height));

			setXPixel(r.getMinX());
			setYPixel(r.getMinY());
		}

		return true;

	}

	public double updateWidth() {
		if (isRootObject) {
			double totalColumnSpaceSize = (((JOSection) getSection()).getNumberOfcolumns() - 1)
					* ((JOSection) getSection()).getColumnSpace();
			if (getXmlObject() instanceof CTP) {
				double newWidth = (((JOSection) getSection()).getClientPageWidth() - totalColumnSpaceSize)
						/ ((JOSection) getSection()).getNumberOfcolumns();
				double w = getWidthPixel();
				if (newWidth != w) {
					if (getHeightPixel() > 0) {
						width.set(newWidth);
						updateParagraphSize();
					} else {
						width.set(newWidth);
					}
					if (w != 0) {
						setDirtyContent(true);
					}
				}
			}
		}
		return width.get().toPixel();
	}

	@Override
	public void resetSelection() {
	}

	private double heightPixel;

	/**
	 * @param height
	 */
	@Override
	public void setHeightPixel(double height) {
		this.heightPixel = height;
	}

	@Override
	public double getHeightPixel() {

		double height = getTextBoundsHeight();

		if (height == 0) {
			return heightPixel;
		}
		if (getBorder() != null) {
			if (getBorder().getDistanceTop() != null) {
				height += getBorder().getLineWidthTop().toPixel();
			}
			if (getBorder().getDistanceBottom() != null) {
				height += getBorder().getLineWidthBottom().toPixel();
			}
		}
		return height;
	}

	/**
	 * This method should not be used! Onlay for safety
	 * 
	 * @return
	 */
	@Override
	public JOEmuProperty getHeight() {
		JOEmuProperty p = new JOEmuProperty();
		p.get().setPixel(getHeightPixel());
		return p;
	}

	@Override
	public Rectangle2D getLayoutBounds() {
		return super.getLayoutBounds();
	}

	@Override
	public void setLayoutBounds(Rectangle2D layoutBounds) {
		super.setLayoutBounds(layoutBounds);
	}

	private double xPixel;

	private double yPixel;

	@Override
	public double getXPixel() {
		return xPixel;
	}

	@Override
	public double getYPixel() {
		return yPixel;
	}

	@Override
	public void setXPixel(double x) {
		xPixel = x;
	}

	@Override
	public void setYPixel(double y) {
		xPixel = y;
	}

	@Override
	public IParagraphFigure getLayoutFigure() {
		return (IParagraphFigure) super.getLayoutFigure();
	}

	@Override
	public void detachOverflowFigure() {
		if (overflowParagraphFigure != null) {
			overflowParagraphFigure.detach();
			overflowParagraphFigure = null;
		}
	}

	@Override
	public void createOverflowFigure() {
		if (overflowParagraphFigure != null) {
			overflowParagraphFigure.detach();
		}
		overflowParagraphFigure = new JOParagraphFigure(this, true);
		updateOverflowClipping();
	}

	@Override
	public void updateOverflowClipping() {
		if (overflowParagraphFigure != null) {
			Rectangle r = new Rectangle(0, getLayoutFigure().getRemaining(), getWidthPixel(),
					getLayoutFigure().getOverflowExcess());
			overflowParagraphFigure.getPane().setClip(r);
		}

	}

	@Override
	public IParagraphFigure getOverflowParagraphFigure() {
		return overflowParagraphFigure;
	}

	@Override
	public boolean isLoaded() {
		return loaded;
	}

	@Override
	public boolean isOverflowActive() {
		return overflowActive;
	}

	@Override
	public void setOverflowActive(boolean overflowActive) {
		this.overflowActive = overflowActive;
	}

	@Override
	public void advanceCaretOffset() {
		caretOffset++;
		setCaretOffset(caretOffset);
	}

	@Override
	public void backCaretOffset() {
		if (caretOffset > 0) {
			caretOffset--;
			setCaretOffset(caretOffset);
		}
	}

}
