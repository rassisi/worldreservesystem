package com.joffice.rcpl.plugin.office.internal.model.spreadsheet;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.ICell;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.util.JOUtil2;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;
import com.joffice.rcpl.plugin.office.databinding2.JOAlignmentProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOBorderProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOColorProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOIndentationProperty;
import com.joffice.rcpl.plugin.office.figures.spreadsheet.JOCellFigure;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.resources.JOOfficeColorProvider;

public class JOCell extends JOObject implements ICell {

	public enum CellType {
		DEFAULT, NUMBER;
	}

	// ---------- new databinding 2 --------------------------------------------

	private JOBorderProperty topBorder;
	private JOBorderProperty bottomBorder;
	private JOBorderProperty leftBorder;
	private JOBorderProperty rightBorder;
	private JOColorProperty topBorderColor;
	private JOColorProperty bottomBorderColor;
	private JOColorProperty leftBorderColor;
	private JOColorProperty rightBorderColor;
	private JOAlignmentProperty horizontalAlignment;
	private JOAlignmentProperty verticalAlignment;

	private IColor fillColorFg;
	private IColor fillColorBg;

	FillPatternType fillPatternType;

	private IColor foregroundColor;

	// -------------------------------------------------------------------------

	@SuppressWarnings("unused")
	private String value;

	private String formulaString;

	private CellType type;

	private CTCell cell;

	@SuppressWarnings("unused")
	private long cm;
	@SuppressWarnings("unused")
	private CTExtensionList extensionList;
	private CTCellFormula formula;
	@SuppressWarnings("unused")
	private CTRst is;
	@SuppressWarnings("unused")
	private boolean ph;
	private String r;
	@SuppressWarnings("unused")
	private long s;
	@SuppressWarnings("unused")
	private STCellType.Enum typ;
	@SuppressWarnings("unused")
	private long vm;
	private int row;
	private int column;
	private JOParagraph paragraph;
	private XSSFCell poiCell;
	private boolean spreadsheet;

	private IColor negativeColor;

	private JOIndentationProperty indentation;

	private int cellType;

	private String dataFormatString;

	private XSSFRow poiRow;

	private AlignType markBorderLimit;

	private JOCell leadMergeCell;

	private boolean wrap;

	private int xPixel;

	private int yPixel;

	private JOSheetPart sheet;

	/**
	 * @param document
	 * @param poiCell
	 * @param anchorObject
	 * @param parent
	 * @param xmlObject
	 * @param childObject
	 * @param width
	 * @param height
	 * @param row
	 * @param column
	 */
	public JOCell(IDocument document, XSSFCell poiCell, JOObject anchorObject, XmlObject parent, XmlObject xmlObject,
			boolean childObject, int row, int column, XSSFRow poiRow, JOSheetPart sheet) {
		super(document, anchorObject, parent, xmlObject, childObject, false, -1);
		this.row = row;
		this.column = column;
		this.poiCell = poiCell;
		this.poiRow = poiRow;
		this.sheet = sheet;
		spreadsheet = true;
		if (poiCell != null && xmlObject != null) {
			updateFromXml();
		} else {
		}
	}

	public JOSheetPart getSpreadsheet() {
		return sheet;
	}

	public JOWorkbookPart getWorkbook() {
		return getSpreadsheet().getWorkbook();
	}

	/**
	 * @param value
	 * @param dataFormatString
	 * @return
	 */
	public String getFormatedValue() {

		try {
			switch (cellType) {
			case Cell.CELL_TYPE_BLANK:
				return ""; //$NON-NLS-1$
			case Cell.CELL_TYPE_BOOLEAN:
				return "" + poiCell.getBooleanCellValue(); //$NON-NLS-1$
			case Cell.CELL_TYPE_ERROR:
				return poiCell.getErrorCellString();
			case Cell.CELL_TYPE_FORMULA:
				// value = poiCell.getCellFormula();
				// value = poiCell.getStringCellValue();
				return getFormatedNumericValue(poiCell.getRawValue());
			case Cell.CELL_TYPE_NUMERIC:
				return getFormatedNumericValue("" + poiCell.getNumericCellValue()); //$NON-NLS-1$
			case Cell.CELL_TYPE_STRING:
				return poiCell.getStringCellValue();
			}
		} catch (Exception ex) {
			return poiCell.getRawValue();
		}
		return poiCell.getRawValue();
	}

	/**
	 * @param value
	 * @return
	 */
	private String getFormatedNumericValue(String value) {

		try {
			if (dataFormatString != null) {
				if (dataFormatString.equals("General")) { //$NON-NLS-1$

				} else if (dataFormatString.indexOf("%") != -1) { //$NON-NLS-1$
					try {
						double d = Double.valueOf(value);
						long result = Math.round(d * 100);
						return result + " %"; //$NON-NLS-1$
					} catch (Exception ex) {
						return value;
					}
				} else if (dataFormatString.indexOf(";") != -1) { //$NON-NLS-1$

					if (cellType == Cell.CELL_TYPE_NUMERIC || cellType == Cell.CELL_TYPE_FORMULA) {
						String subFormat1 = ""; //$NON-NLS-1$
						String subFormat2 = ""; //$NON-NLS-1$
						String subFormat3 = ""; //$NON-NLS-1$
						int decimalPlaces = 0;
						String[] formats = dataFormatString.split(";"); //$NON-NLS-1$
						if (formats.length < 3) {
							String positiveFormat = formats[0].trim();
							if (positiveFormat.startsWith("\\")) { //$NON-NLS-1$
								positiveFormat = positiveFormat.substring(1, positiveFormat.length());
							}
							if (positiveFormat.endsWith("\\")) { //$NON-NLS-1$
								positiveFormat = positiveFormat.substring(0, positiveFormat.length() - 1);
							}
							int pos = positiveFormat.indexOf("]"); //$NON-NLS-1$
							if (pos != -1) {
								subFormat1 = positiveFormat.substring(2, pos);
								pos = subFormat1.indexOf("-"); //$NON-NLS-1$
								if (pos != -1) {
									subFormat1 = subFormat1.substring(0, pos);
								}
							}
							pos = positiveFormat.indexOf("#"); //$NON-NLS-1$
							if (pos != -1) {
								if (subFormat1.length() == 0) {
									subFormat1 = positiveFormat.substring(0, pos);
								}
								subFormat2 = positiveFormat.substring(pos, positiveFormat.length());
							}
							pos = subFormat2.lastIndexOf("#"); //$NON-NLS-1$
							if (pos != -1) {
								subFormat2 = subFormat2.substring(0, pos + 1);

								subFormat3 = positiveFormat.substring(pos + 2, positiveFormat.length());

								pos = subFormat3.indexOf("_"); //$NON-NLS-1$
								if (pos != -1) {
									subFormat3 = subFormat3.substring(0, pos);
								}

								pos = subFormat2.indexOf(","); //$NON-NLS-1$
								if (pos != -1) {
									decimalPlaces = subFormat2.split(",")[1] //$NON-NLS-1$
											.length();
								}
							}
						}

						float f = Float.valueOf(value);
						if (f == 0 && subFormat3.length() > 0) {
							return subFormat3;
						}
						if (decimalPlaces > 0) {
							JOUtil2.round(f, decimalPlaces);

							for (int i = 0; i < decimalPlaces; i++) {
								f *= 10;
							}
							int cutted = (int) f;

							f = cutted;
							for (int i = 0; i < decimalPlaces; i++) {
								f /= 10;
							}

							value = "" + f; //$NON-NLS-1$
							while (value.split("\\.")[1].length() < decimalPlaces) { //$NON-NLS-1$
								value += "0"; //$NON-NLS-1$
							}

						} else {
							value = "" + (int) f; //$NON-NLS-1$
						}

						if (subFormat1.length() > 0) {
							value = subFormat1 + " " + value; //$NON-NLS-1$
						}
					}
				}
			}
		} catch (Exception ex) {
			return value + " JOCell_FormatError";
		}
		return value;
	}

	public boolean isSpreadsheet() {
		return spreadsheet;
	}

	@Override
	public boolean dispose() {
		return false;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		if (layoutFigure == null) {
			layoutFigure = new JOCellFigure(this);
		}
		return layoutFigure;
	}

	@Override
	public void updateFromXml() {
		JOWorkbookPart workbook = sheet.getWorkbook();
		cell = (CTCell) getXmlObject();
		dataFormatString = poiCell.getCellStyle().getDataFormatString();
		cellType = poiCell.getCellType();

		// try {
		// } catch (Exception ex) {
		// value = poiCell.getRawValue();
		// }

		if (poiCell.getCellStyle() != null) {
			indentation = new JOIndentationProperty(null, poiCell, poiCell.getCellStyle(), "Indention", null, this); //$NON-NLS-1$
		}

		double w = getWidthPixel();

		if (indentation != null) {
			w -= indentation.get().toPixel() - 2;
		}

		setStyle(new JOStyle());

		cm = cell.getCm();
		extensionList = cell.getExtLst();
		formula = cell.getF();
		if (formula != null) {
			formulaString = formula.getStringValue();
		}

		is = cell.getIs();
		ph = cell.getPh();
		r = cell.getR();
		s = cell.getS();
		typ = cell.getT();
		vm = cell.getVm();

		XSSFCellStyle xSSFCellStyle = poiCell.getCellStyle();

		wrap = xSSFCellStyle.getWrapText();

		if (xSSFCellStyle != null) {
			if (xSSFCellStyle.getVerticalAlignmentEnum() != null) {
				verticalAlignment = new JOAlignmentProperty(null, poiCell, poiCell.getCellStyle(),
						"VerticalAlignmentEnum", null); //$NON-NLS-1$
			}

			if (xSSFCellStyle.getAlignmentEnum() != null) {
				horizontalAlignment = new JOAlignmentProperty(null, poiCell, poiCell.getCellStyle(), "AlignmentEnum", //$NON-NLS-1$
						null);
			}
			if (!xSSFCellStyle.getBorderBottomEnum().equals(BorderStyle.NONE)) {
				bottomBorder = new JOBorderProperty(null, poiCell, xSSFCellStyle, "BorderBottomEnum", null); //$NON-NLS-1$
				bottomBorderColor = new JOColorProperty(null, poiCell, xSSFCellStyle, "BottomBorderColor", null, false, //$NON-NLS-1$
						getWorkbook());
			}
			if (!xSSFCellStyle.getBorderTopEnum().equals(BorderStyle.NONE)) {
				topBorder = new JOBorderProperty(null, poiCell, xSSFCellStyle, "BorderTopEnum", null); //$NON-NLS-1$
				topBorderColor = new JOColorProperty(null, poiCell, xSSFCellStyle, "TopBorderColor", null, false, //$NON-NLS-1$
						getWorkbook());
			}
			if (!xSSFCellStyle.getBorderLeftEnum().equals(BorderStyle.NONE)) {
				leftBorder = new JOBorderProperty(null, poiCell, xSSFCellStyle, "BorderLeftEnum", null); //$NON-NLS-1$
				leftBorderColor = new JOColorProperty(null, poiCell, xSSFCellStyle, "LeftBorderColor", null, false, //$NON-NLS-1$
						getWorkbook());
			}
			if (!xSSFCellStyle.getBorderRightEnum().equals(BorderStyle.NONE)) {
				rightBorder = new JOBorderProperty(null, poiCell, xSSFCellStyle, "BorderBottomEnum", null); //$NON-NLS-1$
				rightBorderColor = new JOColorProperty(null, poiCell, xSSFCellStyle, "RightBorderColor", null, false, //$NON-NLS-1$
						getWorkbook());
			}

			CTXf cTXf = xSSFCellStyle.getStyleXf();
			CTXf cTXfCore = xSSFCellStyle.getCoreXf();

			// ---------- fill background --------------------------------------

			if (cTXfCore.isSetFillId() && cTXfCore.isSetApplyFill()) {
				int fillId = (int) cTXfCore.getFillId();
				IColor[] fillColors = new JOOfficeColorProvider().getStyleFillColors(workbook, fillId);
				fillColorFg = fillColors[0];
				fillColorBg = fillColors[1];
			}

			if (fillColorFg == null) {
				if (cTXf.isSetFillId() && cTXf.isSetApplyFill()) {
					int fillId = (int) cTXfCore.getFillId();
					IColor[] fillColors = new JOOfficeColorProvider().getStyleFillColors(workbook, fillId);
					fillColorFg = fillColors[0];
					fillColorBg = fillColors[1];
				}
			}
			// if (fillColorFg == null) {
			// try {
			// int fillId = (int) cell.getS();
			//
			//
			// Color[] fillColors = JOColorProvider.getStyleFillColors(
			// workbook, fillId);
			// fillColorFg = fillColors[0];
			// fillColorBg = fillColors[1];
			//
			//
			// if(fillColorFg!=null){
			// fillColorFg = ColorConstants.blue;
			// }
			//
			//
			//
			// // StylesTable stylesTable = workbook.getStylesTable();
			// // CTDxf ctDxf = stylesTable.getDxf(fillId);
			// // fillColors = JOColorProvider.getFillColors(
			// // workbook, ctDxf.getFill(), fillId);
			// // fillColorBg = fillColors[0];
			// // fillColorFg = fillColors[1];
			//
			//
			//
			// } catch (Exception ex) {
			// }
			// }

			String dateFormatString = xSSFCellStyle.getDataFormatString();

			// XSSFColor foregroundColor2 = xSSFCellStyle
			// .getFillForegroundXSSFColor();

			fillPatternType = xSSFCellStyle.getFillPatternEnum();

			XSSFFont xssfFont = xSSFCellStyle.getFont();
			if (xssfFont != null) {
				int fontHeight = xssfFont.getFontHeight() / 20;
				String fontName = xssfFont.getFontName();
				int fgIndex = xssfFont.getColor();
				foregroundColor = new JOOfficeColorProvider().getIndexedColor(getWorkbook(), fgIndex, true);

				getStyle().setFont(Rcpl.fontProvider().loadFont(fontName, fontHeight, 0));
				if (xssfFont.getBold()) {
					getStyle().setBold(true);
				}
				if (xssfFont.getItalic()) {
					getStyle().setItalic(true);
				}

				if (foregroundColor.equals(IColor.WHITE) && (fillColorFg == null || fillColorFg.equals(IColor.WHITE))) {

					foregroundColor = IColor.BLACK;
				}

				if (foregroundColor != null) {
					getStyle().setForeground(foregroundColor);
				}
			}

			boolean hidden = xSSFCellStyle.getHidden();
			short indentation = xSSFCellStyle.getIndention();
			short index = xSSFCellStyle.getIndex();
			XSSFColor leftBorderColor2 = xSSFCellStyle.getLeftBorderXSSFColor();
			boolean locked = xSSFCellStyle.getLocked();
			XSSFColor rightBorderColor2 = xSSFCellStyle.getRightBorderXSSFColor();
			short Rotation = xSSFCellStyle.getRotation();
			CTXf ctxf = xSSFCellStyle.getStyleXf();
			XSSFColor topBorderColor2 = xSSFCellStyle.getTopBorderXSSFColor();
			VerticalAlignment verticalAlignment = xSSFCellStyle.getVerticalAlignmentEnum();

			if (poiCell.getRawValue() != null) {
				paragraph = new JOParagraph(getDocument(), this, getXmlParent(), cell, w, getHeightPixel(), 0.0, 0.0,
						0.0, 0.0, null, true, false, null, getStyle(), false, 0, null);
			}

		}
	}

	@Override
	public JOStyle getStyle() {
		return (JOStyle) super.getStyle();
	}

	@Override
	public boolean isPageBreakBefore() {
		// TODO Auto-generated method stub
		return false;
	}

	public CellType getType() {
		return type;
	}

	public void setType(CellType type) {
		this.type = type;
	}

	public JOParagraph getParagraph() {
		return paragraph;
	}

	private int horizontalSpan = 1;

	private int verticalSpan = 1;

	private boolean hidden;

	@Override
	public double getWidthPixel() {
		int n = sheet.getPoiSheet().getNumMergedRegions();
		for (int i = 0; i < n; i++) {
			CellRangeAddress cellRangeAddress = sheet.getPoiSheet().getMergedRegion(i);
			int c1 = cellRangeAddress.getFirstColumn();
			int c2 = cellRangeAddress.getLastColumn();
			int r1 = cellRangeAddress.getFirstRow();

			if (c1 == column && r1 == row) {
				double w = sheet.getColumns()[column].width;
				for (int c = column + 1; c <= c2; c++) {
					w += sheet.getColumns()[c].width;
					if (sheet.getCells()[r1][c] != null && sheet.getCells()[r1][c].getParagraph() != null) {
						sheet.getCells()[r1][c].getParagraph().getLayoutFigure().setVisible(false);
					}
				}
				return w;
			}

		}

		return sheet.getColumns()[column].width;
	}

	@Override
	public double getHeightPixel() {
		int n = sheet.getPoiSheet().getNumMergedRegions();
		for (int i = 0; i < n; i++) {
			CellRangeAddress cellRangeAddress = sheet.getPoiSheet().getMergedRegion(i);
			int c1 = cellRangeAddress.getFirstColumn();
			int r1 = cellRangeAddress.getFirstRow();
			int r2 = cellRangeAddress.getLastRow();

			if (c1 == column && r1 == row) {
				double h = sheet.getRows()[row].height;
				for (int r = row + 1; r <= r2; r++) {
					h += sheet.getRows()[r].height;
					if (sheet.getCells()[r][c1] != null && sheet.getCells()[r][c1].getParagraph() != null) {
						sheet.getCells()[r][c1].getParagraph().getLayoutFigure().setVisible(false);
					}
				}
				return h;
			}

		}
		return sheet.getRows()[row].height;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public XSSFCell getPoiCell() {
		return poiCell;
	}

	public JOIndentationProperty getIndentation() {
		return indentation;
	}

	public XSSFRow getPoiRow() {
		return poiRow;
	}

	public JOBorderProperty getTopBorder() {
		return topBorder;
	}

	public JOBorderProperty getBottomBorder() {
		return bottomBorder;
	}

	public JOBorderProperty getLeftBorder() {
		return leftBorder;
	}

	public JOBorderProperty getRightBorder() {
		return rightBorder;
	}

	public JOColorProperty getTopBorderColor() {
		return topBorderColor;
	}

	public JOColorProperty getBottomBorderColor() {
		return bottomBorderColor;
	}

	public JOColorProperty getLeftBorderColor() {
		return leftBorderColor;
	}

	public JOColorProperty getRightBorderColor() {
		return rightBorderColor;
	}

	public JOAlignmentProperty getHorizontalAlignment() {
		return horizontalAlignment;
	}

	public JOAlignmentProperty getVerticalAlignment() {
		return verticalAlignment;
	}

	public IColor getNegativeColor() {
		return negativeColor;
	}

	public AlignType getMarkBorderLimit() {
		return markBorderLimit;
	}

	public void setMarkBorderLimit(AlignType markBorderLimit) {
		this.markBorderLimit = markBorderLimit;
	}

	public IColor getFillColorFg() {
		return fillColorFg;
	}

	public IColor getFillColorBg() {
		return fillColorBg;
	}

	public int getHorizontalSpan() {
		return horizontalSpan;
	}

	public void setHorizontalSpan(int horizontalSpan) {
		this.horizontalSpan = horizontalSpan;
	}

	public int getVerticalSpan() {
		return verticalSpan;
	}

	public void setVerticalSpan(int verticalSpan) {
		this.verticalSpan = verticalSpan;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public JOCell getLeadMergeCell() {
		return leadMergeCell;
	}

	public void setLeadMergeCell(JOCell leadMergeCell) {
		this.leadMergeCell = leadMergeCell;
	}

	public String getLogicName() {
		return r;
	}

	@Override
	public String toString() {
		return getLogicName() + (isHidden() ? " hidden;" : ""); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public boolean isWrap() {
		return wrap;
	}

	public String getFormulaString() {
		return formulaString;
	}

	public int getxPixel() {
		return xPixel;
	}

	public void setxPixel(int xPixel) {
		this.xPixel = xPixel;
	}

	public int getyPixel() {
		return yPixel;
	}

	public void setyPixel(int yPixel) {
		this.yPixel = yPixel;
	}

	public void setFillColorFg(IColor fillColorFg) {
		this.fillColorFg = fillColorFg;
	}

	public void setFillColorBg(IColor fillColorBg) {
		this.fillColorBg = fillColorBg;
	}

	public void setForegroundColor(IColor foregroundColor) {
		this.foregroundColor = foregroundColor;
	}

	public JOSheetPart getSheet() {
		return sheet;
	}

	@Override
	public void setPage(IPage page) {
		// TODO Auto-generated method stub

	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
