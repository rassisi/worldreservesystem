/******************************************************************************
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal.model.word;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IFocusable;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.ITableCell;
import org.eclipse.rcpl.ITableFigure;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20ThPointProperty;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXTableFigure;
import com.joffice.rcpl.plugin.office.internal.JOfficeFactory;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;
import com.joffice.rcpl.plugin.office.poi.extension.XWPFDocumentCustom;

import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JOTable extends JOObject implements IFocusable, ITable {

	private CTTbl table;
	private CTTblCellMar tblCellMar;
	private int numberOfRows = 0;
	private int numberOfColumns = 0;
	private ITableCell[][] cells = new ITableCell[0][0];
	private int pageBreakBeforeRow = -1;
	private int pageBreakAfterRow = -1;
	private double rowHeight = 0;
	private double rowWidth = 0;
	private double rowHeightAtLeast = 0;
	private STHeightRule.Enum heightRule = STHeightRule.AUTO;
	private boolean autoWidth = false;

	private double cellWidth;
	private double cellMarginLeft = 0;
	private double cellMarginRight = 0;
	private double cellMarginTop = 0;
	private double cellMarginBottom = 0;
	private double cellHeight = 0;
	private double maxParWidth = -1;
	private int spanAdvance = 0;
	private CTShortHexNumber tblLook;
	private JOStyle tableStyle;
	private String tableStyleName;

	@SuppressWarnings("unused")
	private JOEmu20ThPoint indent;

	private CTBorder insideHBorder;

	private CTBorder insideVBorder;

	private CTBorder topBorder;

	private CTBorder bottomBorder;

	private CTBorder leftBorder;

	private CTBorder rightBorder;

	private double leftBorderWidth = 1;

	private double rightBorderWidth = 1;

	private double insideVBorderWidth = 1;

	private double insideHBorderWidth = 1;

	private double topBorderWidth = 1;

	private double bottomBorderWidth = 1;

	private double tableLineWidth = 1;

	private List<JOFXTableFigure> tails;

	double totalTableHeight = 0;

	private boolean tblLoookAllBorders = false;

	/**
	 * @param document
	 * @param paragraph
	 */
	public JOTable(IDocument document, JOObject anchorObject, CTTbl table, boolean childObject, boolean isRoot,
			int index) {
		super(document, anchorObject, null, table, childObject, isRoot, -1);
		this.table = table;
		double totalColumnSpaceSize = (getSection().getNumberOfcolumns() - 1) * getSection().getColumnSpace();
		double w = ((getSection().getClientPageWidth() - totalColumnSpaceSize) / getSection().getNumberOfcolumns());
		setWidthPixel(w);

		initTable();

		CTTblBorders tableBorders = getTable().getTblPr().getTblBorders();
		if (tableBorders != null) {
			insideHBorder = tableBorders.getInsideH();
			if (insideHBorder != null && insideHBorder.getSz() != null) {
				insideHBorderWidth = insideHBorder.getSz().doubleValue();
			}
			insideVBorder = tableBorders.getInsideV();
			if (insideVBorder != null && insideVBorder.getSz() != null) {
				insideVBorderWidth = insideVBorder.getSz().doubleValue();
			}
			leftBorder = tableBorders.getLeft();
			if (leftBorder != null && leftBorder.getSz() != null) {
				leftBorderWidth = leftBorder.getSz().doubleValue();
			}
			topBorder = tableBorders.getTop();
			if (topBorder != null && topBorder.getSz() != null) {
				topBorderWidth = topBorder.getSz().doubleValue();
			}
			bottomBorder = tableBorders.getBottom();
			if (bottomBorder != null && bottomBorder.getSz() != null) {
				bottomBorderWidth = bottomBorder.getSz().doubleValue();
			}
			rightBorder = tableBorders.getRight();
			if (rightBorder != null && rightBorder.getSz() != null) {
				rightBorderWidth = rightBorder.getSz().doubleValue();
			}
		}

		if (getTableStyle() != null && getTableStyle().getId().equals("TableGrid")) { //$NON-NLS-1$
			// tblLoookAllBorders = true;
		}

		if (getTableStyleName() != null && getTableStyleName().equals("TableGrid")) { //$NON-NLS-1$
			// tblLoookAllBorders = true;
		}
	}

	public List<JOFXTableFigure> getTails() {
		return tails;
	}

	@Override
	protected void init() {
		super.init();
	}

	private void initTable() {
		loadTableProperties();
		loadTableParagraphProperties();
		loadCells();
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		ITableFigure fig = (ITableFigure) new JOfficeFactory().createTableFigure(this, getWidthPixel());
		return fig;
	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private void loadTableProperties() {
		CTTblPr tblPr = table.getTblPr();

		CTJc ctJc = tblPr.getJc();
		CTShd ctShd = tblPr.getShd();
		CTTblBorders ctTblBorders = tblPr.getTblBorders();
		CTTblCellMar ctTblCellMar = tblPr.getTblCellMar();

		if (ctTblCellMar != null) {
			double bottomW = ctTblCellMar.getBottom().getW().doubleValue();
			double topW = ctTblCellMar.getTop().getW().doubleValue();
			double leftW = ctTblCellMar.getLeft().getW().doubleValue();
			double rightW = ctTblCellMar.getRight().getW().doubleValue();

			System.out.println();
		}

		CTTblWidth ctTblWidth = tblPr.getTblCellSpacing();

		CTTblLayoutType ctTblLayoutType = tblPr.getTblLayout();
		CTShortHexNumber ctTblLook = tblPr.getTblLook();
		CTTblOverlap ctTblOverlap = tblPr.getTblOverlap();

		CTTblPPr tblpPr = tblPr.getTblpPr();

		if (tblpPr != null) {
			tblpPr.getBottomFromText();
			tblpPr.getLeftFromText();
			tblpPr.getRightFromText();
			tblpPr.getTblpX();
			tblpPr.getTblpXSpec();
			tblpPr.getTblpY();
			tblpPr.getTblpYSpec();
			tblpPr.getTopFromText();
			STVAnchor.Enum en = tblpPr.getVertAnchor();
			switch (en.intValue()) {
			case STVAnchor.INT_MARGIN:
				break;
			}
		}

		tblPr.getTblPrChange();

		CTString tblStyle = tblPr.getTblStyle();

		CTDecimalNumber ctColBandSize = tblPr.getTblStyleColBandSize();
		CTDecimalNumber ctRowBandSize = tblPr.getTblStyleRowBandSize();

		CTString tStyle = tblPr.getTblStyle();

		if (tStyle != null) {
			tableStyleName = tStyle.getVal();
		}

		tableStyle = (JOStyle) getStyle(tStyle);

		// ---------- indent ---------------------------------------------------

		CTTblWidth ind = tblPr.getTblInd();
		if (ind != null) {
			indent = new JOEmu20ThPoint(ind.getW());
		}

		CTTblWidth tblw = tblPr.getTblW();
		if (tblw != null && tblw.getW() != null) {
			STTblWidth.Enum en = tblw.getType();
			if (en.equals(STTblWidth.AUTO)) {
				autoWidth = true;
			} else if (en.equals(STTblWidth.DXA)) {
				setWidth(new JOEmu20ThPointProperty(this, tblPr, tblw, "W", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
			} else if (en.equals(STTblWidth.NIL)) {
				setWidth(new JOEmu20ThPointProperty(this, tblPr, tblw, "W", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
			} else if (en.equals(STTblWidth.PCT)) {
				// TODO:
				// size.x = ((double) size.x * );
				setWidthPixel(getWidthPixel() * tblw.getW().doubleValue() / 5000.0);
			}
		}

		tblLook = tblPr.getTblLook();

		if (tblLook != null) {
			byte[] tblLookBytes = tblLook.getVal();
		}

		CTTblBorders tableBorders = tblPr.getTblBorders();

	}

	/**
	 * 
	 */
	private void loadTableParagraphProperties() {
		CTTblPPr tblPPr = table.getTblPr().getTblpPr();
		if (tblPPr != null) {
			if (tblPPr.getBottomFromText() != null) {
				bottomFromText = tblPPr.getBottomFromText().doubleValue();
			}
			if (tblPPr.getHorzAnchor() != null) {
				STHAnchor.Enum en = tblPPr.getHorzAnchor();
				if (en.equals(STHAnchor.MARGIN)) {
					hAnchor = ILayoutAnchor.MARGIN;
				} else if (en.equals(STHAnchor.PAGE)) {
					hAnchor = ILayoutAnchor.PAGE;
				} else if (en.equals(STHAnchor.TEXT)) {
					hAnchor = ILayoutAnchor.TEXT;
				}
			}
			if (tblPPr.getLeftFromText() != null) {
				leftFromText = tblPPr.getLeftFromText().doubleValue();
			}
			if (tblPPr.getRightFromText() != null) {
				rightFromText = tblPPr.getRightFromText().doubleValue();
			}
			if (tblPPr.getTblpX() != null) {
				x = new JOEmu20ThPointProperty(this, table.getTblPr(), table.getTblPr().getTblpPr(), "TblpX", null, //$NON-NLS-1$
						EValueType.MEASUREMENT);
			}
			if (tblPPr.getTblpXSpec() != null) {
				xAlign = getAlign(tblPPr.getTblpXSpec());
			}
			if (tblPPr.getTblpY() != null) {
				y = new JOEmu20ThPointProperty(this, table.getTblPr(), tblPPr, "TblpY", null, EValueType.MEASUREMENT); //$NON-NLS-1$
				y.get();
			}
			if (yAlign != null) {
				yAlign = getAlign(tblPPr.getTblpYSpec());
			}
			if (tblPPr.getTopFromText() != null) {
				topFromText = tblPPr.getTopFromText().doubleValue();
			}
			if (tblPPr.getVertAnchor() != null) {
				STVAnchor.Enum en = tblPPr.getVertAnchor();
				if (en.equals(STVAnchor.MARGIN)) {
					vAnchor = ILayoutAnchor.MARGIN;
				} else if (en.equals(STVAnchor.PAGE)) {
					vAnchor = ILayoutAnchor.PAGE;
				} else if (en.equals(STVAnchor.TEXT)) {
					vAnchor = ILayoutAnchor.TEXT;
				}
			}

			XmlObject[] tblCellMargins = selectPath(table, "w", //$NON-NLS-1$
					Rcpl.NS_WORD, "tblCellMar"); //$NON-NLS-1$

			if (tblCellMargins != null && tblCellMargins.length > 0) {
				tblCellMar = (CTTblCellMar) tblCellMargins[0];
			}

		}
	}

	/**
	 * create all cells
	 */
	@SuppressWarnings("deprecation")
	private void loadCells() {
		CTRow[] rows = table.getTrArray();
		calculateRowsAnColumns(rows);
		for (int rowCount = 0; rowCount < rows.length; rowCount++) {
			CTRow row = rows[rowCount];
			loadRowProperties(row);
			CTTc[] columns = rows[rowCount].getTcArray();
			spanAdvance = 0;
			for (int col = 0; col < columns.length; col++) {
				CTTc ctTc = columns[col];
				loadCellProperties(ctTc);
				List<IParagraph> cellParagraphs = loadCellParagraphs(ctTc, rowCount);
				List<JOTable> cellTables = loadCellTables(ctTc, rowCount);
				calculateHeights(rowCount, col);
				createCell(ctTc, rowCount, col, cellParagraphs, cellTables);
			}
			height.get().increasePixel(rowHeight);
			if (rowWidth > getWidthPixel()) {
				setWidthPixel(rowWidth);
			}
		}

		for (int row = 0; row < cells.length; row++) {
			for (int col = 0; col < cells[row].length; col++) {
				if (cells[row][col] != null && cells[row][col].getvMerge() == 1) {
					int vSpan = 2;
					for (int row2 = row + 1; row2 < cells.length; row2++, vSpan++) {
						int vMerge = cells[row2][col].getvMerge();
						if (vMerge == 0) {
							if (cells[row2][col] != null) {
								cells[row2][col].setvMerge(2);
							}
						} else {
							break;
						}
					}
					cells[row][col].setvSpan(vSpan);
				}
			}
		}

		setHeightPixel(Math.max(21, calculateTotalHeight()));
	}

	/**
	 * @return
	 */
	private int calculateTotalHeight() {
		ITableCell[][] cells = getCells();
		int totalTableHeight = 0;
		for (int row = 0; row < cells.length; row++) {
			ITableCell[] columns = cells[row];
			double rowHeight = 0;
			for (int col = 0; col < columns.length; col++) {
				ITableCell cell = columns[col];
				if (cell != null) {
					int h = 0;
					for (int i = 0; i < cell.getParagraphCount(); i++) {
						IParagraph p = cell.getParagraph(i);
						if (i > 0) {
							h += p.getSpacingBeforePixel();
						}
						h += p.getHeightPixel() + p.getCellMarginTop() + p.getCellMarginBottom();
						if (i < cell.getParagraphCount() - 1) {
							h += p.getSpacingAfterPixel();
						}
					}

					for (int i = 0; i < cell.getTableCount(); i++) {
						ITable t = cell.getTable(i);
						if (i > 0) {
							h += t.getSpacingBeforePixel();
						}
						// h += p.getSize().y + p.getCellMarginTop()
						// + p.getCellMarginBottom();
						if (i < cell.getTableCount() - 1) {
							h += t.getSpacingAfterPixel();
						}
					}
					cell.setHeightPixel(h);
					rowHeight = Math.max(rowHeight, cell.getHeightPixel());
					if (cell.getSpan() > 1) {
						col += (cell.getSpan() - 1);
					}
				} else {
					RCPLModel.logError("Cell is null!"); //$NON-NLS-1$
				}
			}
			totalTableHeight += rowHeight;
		}
		return totalTableHeight + 2;
	}

	/**
	 * @param rowCount
	 * @param col
	 */
	private void calculateHeights(int rowCount, int col) {
		if (cellHeight > rowHeight) {
			if (col > 0) {
				for (int j = col - 1; j >= 0; j--) {
					if (cells[rowCount][j] != null) {
						cells[rowCount][j].setHeightPixel(cellHeight);
					} else {
						// LOGGER.error("Cell = null!"); //$NON-NLS-1$
					}
				}
			}
			rowHeight = cellHeight;
		} else {
			cellHeight = rowHeight;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.JOObject#isPageBreakBefore()
	 */
	@Override
	public boolean isPageBreakBefore() {
		// TODO:
		// page break an jeder row muss moeglich sein
		if (pageBreakBeforeRow != -1) {
			return true;
		}
		return false;
	}

	/**
	 * @param ctTc
	 * @param rowCount
	 * @param col
	 */
	private void createCell(CTTc ctTc, int rowCount, int col, List<IParagraph> cellParagraphs,
			List<JOTable> cellTables) {
		CTTcPr tcPr = ctTc.getTcPr();

		CTHMerge ctHMerge = tcPr.getHMerge();

		if (ctHMerge != null) {
		}

		// CTCellMergeTrackChange ctCellMergeTrackChange = tcPr.getCellMerge();

		if (tcPr.getGridSpan() != null) {
			int span = tcPr.getGridSpan().getVal().intValue();
			for (int i = 0; i < span; spanAdvance++, i++) {
				JOTableCell cell = new JOTableCell(getDocument(), this, ctTc, rowCount, col);
				cells[rowCount][col + spanAdvance] = cell;
				if (i == 0) {
					cell.setSpan(span);
					for (IParagraph p : cellParagraphs) {
						cell.addParagraph(p);
						p.setTableCell(cell);
					}
					for (JOTable t : cellTables) {
						cell.addTable(t);
					}
				}
				cell.setWidthPixel(cellWidth);
				cell.setHeightPixel(cellHeight);
				if (autoWidth) {
					cell.setWidthPixel(maxParWidth);
				}
			}
			if (span > 0) {
				spanAdvance--;
			}
		} else {
			JOTableCell cell = new JOTableCell(getDocument(), this, ctTc, rowCount, col);
			cells[rowCount][col + spanAdvance] = cell;
			cell.setWidthPixel(cellWidth);
			cell.setHeightPixel(cellHeight);

			CTVMerge ctVMerge = tcPr.getVMerge();
			if (ctVMerge != null) {
				STMerge.Enum val = ctVMerge.getVal();
				if (val != null) {
					if (val.equals(STMerge.CONTINUE)) {
						cell.setvMerge(2);
					} else if (val.equals(STMerge.RESTART)) {
						cell.setvMerge(1);
					}
				} else {
					cell.setvMerge(3);
				}
			}

			if (autoWidth) {
				cell.setWidthPixel(maxParWidth);
			}
			for (IParagraph p : cellParagraphs) {
				cell.addParagraph(p);
				p.setTableCell(cell);
			}
			for (JOTable t : cellTables) {
				cell.addTable(t);
			}
		}
	}

	/**
	 * @param rows
	 */
	@SuppressWarnings("deprecation")
	private void calculateRowsAnColumns(CTRow[] rows) {
		numberOfRows = rows.length;
		for (CTRow ctRow : rows) {
			CTTc[] columns = ctRow.getTcArray();
			int numberOfRowCols = 0;
			for (CTTc ctTc : columns) {
				CTDecimalNumber gridSpan = ctTc.getTcPr().getGridSpan();
				if (gridSpan != null) {
					numberOfRowCols += gridSpan.getVal().intValue();
				} else {
					numberOfRowCols++;
				}
				numberOfColumns = Math.max(numberOfRowCols, numberOfColumns);
			}
		}

		cells = new JOTableCell[numberOfRows][numberOfColumns];
		// setWidthPixel(getWidthPixel());
	}

	/**
	 * @param row
	 */
	@SuppressWarnings("deprecation")
	private void loadRowProperties(CTRow row) {
		rowWidth = getWidthPixel();
		rowHeight = 0;
		rowHeightAtLeast = 0;
		heightRule = STHeightRule.AUTO;
		if (row.getTrPr() != null && row.getTrPr().getTrHeightArray() != null) {
			CTHeight[] rowHeights = row.getTrPr().getTrHeightArray();
			// TODO : why many???
			if (rowHeights != null && rowHeights.length > 0) {

				for (CTHeight ctHeight : rowHeights) {

					if (ctHeight.getHRule() != null) {
						heightRule = rowHeights[0].getHRule();
						if (heightRule != null) {
							if (heightRule.equals(STHeightRule.AT_LEAST)) {
								// rowHeightAtLeast = OOXMLConversion
								// .pointsToPixel(ctHeight.getVal()
								// .doubleValue() / 20.0);
							} else if (heightRule.equals(STHeightRule.EXACT)) {
								rowHeight = JOConversion.pointsToPixel(ctHeight.getVal().doubleValue() / 20.0);
							} else if (heightRule.equals(STHeightRule.AUTO)) {

							}
						}
					} else {
						rowHeight += JOConversion.pointsToPixel(ctHeight.getVal().doubleValue() / 20.0);
					}

				}

			}
		}
	}

	/**
	 * @param ctTc
	 */
	@SuppressWarnings("deprecation")
	private void loadCellProperties(CTTc ctTc) {
		try {

			CTTcPr tcPr = ctTc.getTcPr();

			cellHeight = 0;
			autoWidth = false;
			cellWidth = (getWidthPixel() / numberOfColumns);
			cellMarginLeft = 0;
			cellMarginRight = 0;
			cellMarginTop = 0;
			cellMarginBottom = 0;

			if (tblLook != null) {
				cellMarginBottom = 1;
				cellMarginTop = 1;
				cellMarginLeft = 1;
				cellMarginRight = 1;
			}

			if (tcPr != null) {

				CTTblWidth w = tcPr.getTcW();
				if (w != null) {
					STTblWidth.Enum widthType = w.getType();
					if (widthType.equals(STTblWidth.AUTO)) {
						autoWidth = true;
					} else if (widthType.equals(STTblWidth.DXA)) {
						// int lineWith = 1;
						cellWidth = (w.getW().doubleValue() / JOConversion.getTransFormFactor());
						CTTcMar tcMar = tcPr.getTcMar();
						if (tcMar != null) {
							// left
							if (tcMar.getLeft() != null) {
								cellMarginLeft = tcMar.getLeft().getW().doubleValue() / 20.0;
							} else if (tblCellMar != null && tblCellMar.getLeft() != null) {
								cellMarginLeft = tblCellMar.getLeft().getW().doubleValue() / 20.0;
							}
							// right
							if (tcMar.getRight() != null) {
								cellMarginRight = tcMar.getRight().getW().doubleValue() / 20.0;
							} else if (tblCellMar != null && tblCellMar.getRight() != null) {
								cellMarginRight = tblCellMar.getRight().getW().doubleValue() / 20.0;
							}
							// top
							if (tcMar.getTop() != null) {
								cellMarginTop = tcMar.getTop().getW().doubleValue() / 20.0;
							} else if (tblCellMar != null && tblCellMar.getTop() != null) {
								cellMarginTop = tblCellMar.getTop().getW().doubleValue() / 20.0;
							}
							// bottom
							if (tcMar.getBottom() != null) {
								cellMarginBottom = tcMar.getBottom().getW().doubleValue() / 20.0;
							} else if (tblCellMar != null && tblCellMar.getBottom() != null) {
								cellMarginBottom = tblCellMar.getBottom().getW().doubleValue() / 20.0;
							}
						}
					} else if (widthType.equals(STTblWidth.NIL)) {

					} else if (widthType.equals(STTblWidth.PCT)) {
						cellWidth = (getWidthPixel() * w.getW().doubleValue() / 5000);
					}
				}
			}
			ctTc.getAltChunkArray();
			ctTc.getBookmarkEndArray();
			ctTc.getBookmarkStartArray();
			ctTc.getCommentRangeEndArray();
			ctTc.getCommentRangeStartArray();
			ctTc.getCustomXmlArray();
			ctTc.getCustomXmlDelRangeEndArray();
			ctTc.getCustomXmlDelRangeStartArray();
			ctTc.getCustomXmlInsRangeEndArray();
			ctTc.getCustomXmlInsRangeStartArray();
			ctTc.getCustomXmlMoveFromRangeEndArray();
			ctTc.getCustomXmlMoveFromRangeStartArray();
			ctTc.getCustomXmlMoveToRangeEndArray();
			ctTc.getCustomXmlMoveToRangeStartArray();
			ctTc.getDelArray();
			ctTc.getInsArray();
			ctTc.getMoveFromArray();
			ctTc.getMoveFromRangeEndArray();
			ctTc.getCustomXmlMoveToRangeStartArray();
			ctTc.getOMathArray();
			ctTc.getOMathParaArray();

			ctTc.getPermEndArray();
			ctTc.getPermStartArray();
			ctTc.getProofErrArray();
			ctTc.getSdtArray();
			ctTc.getTblArray();

		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	@SuppressWarnings({ "deprecation" })
	private List<IParagraph> loadCellParagraphs(CTTc ctTc, int rowCount) {
		CTP[] ctps = ctTc.getPArray();
		List<IParagraph> cellParagraphs = new ArrayList<IParagraph>();
		maxParWidth = -1;
		double lastParWidth = -1;

		// ---------- paragraphs in cells ------------------------------

		double afterPixel = 0;

		double cHeight = 0;

		for (CTP ctp : ctps) {

			double w = cellWidth;
			double mL = 0;
			double mR = 0;
			if (cellMarginLeft > 0) {
				mL = JOConversion.pointsToPixel(cellMarginLeft);
				w -= mL;
			}
			if (cellMarginRight > 0) {
				mR = JOConversion.pointsToPixel(cellMarginRight);
				w -= mR;
			}

			// last one
			if (ctp == ctps[ctps.length - 1]) {
				w -= 10;
			}

			IParagraph par = new JOParagraph(getDocument(), this, ctTc, ctp, w, 0, mL, mR,
					JOConversion.pointsToPixelDouble(cellMarginTop), JOConversion.pointsToPixelDouble(cellMarginBottom),
					null, true, false, null, null, false, 0, null);
			if (par.isPageBreakBefore()) {
				// pageBreakBeforeRow = rowCount;
			}

			// if (par.isPageBreakBefore()) {
			// pageBreakBeforeRow = rowCount;
			// }

			if (heightRule.equals(STHeightRule.AT_LEAST)) {
				cHeight += par.getHeightPixel();
				cHeight += par.getSpacingBeforePixel();
				cHeight += par.getSpacingAfterPixel();
				if (cHeight < rowHeightAtLeast) {
					setCellHeight(rowHeightAtLeast);
				}
			} else if (heightRule.equals(STHeightRule.EXACT)) {
			} else if (heightRule.equals(STHeightRule.AUTO)) {
				cHeight += par.getHeightPixel();
				if (cellParagraphs.isEmpty()) {
					cHeight += par.getSpacingBeforePixel();
				} else if (afterPixel > 0) {
					cHeight += afterPixel;
				}
				afterPixel = par.getSpacingAfterPixel();

			}
			setCellHeight(cHeight);
			cellParagraphs.add(par);
			maxParWidth = Math.max(lastParWidth, par.getWidthPixel());
			lastParWidth = par.getWidthPixel();
		}

		return cellParagraphs;
	}

	/**
	 * @param ctTc
	 * @param rowCount
	 * @return
	 */
	@SuppressWarnings({ "deprecation" })
	private List<JOTable> loadCellTables(CTTc ctTc, int rowCount) {
		CTTbl[] tables = ctTc.getTblArray();
		List<JOTable> cellTables = new ArrayList<JOTable>();
		maxParWidth = -1;
		double lastParWidth = -1;

		// ---------- paragraphs in cells ------------------------------

		for (CTTbl table : tables) {
			double w = cellWidth;
			double mL = 0;
			double mR = 0;
			if (cellMarginLeft > 0) {
				mL = JOConversion.pointsToPixel(cellMarginLeft);
				w -= mL;
			}
			if (cellMarginRight > 0) {
				mR = JOConversion.pointsToPixel(cellMarginRight);
				w -= mR;
			}

			JOTable t = new JOTable(getDocument(), this, table, true, false, 0);
			if (t.isPageBreakBefore()) {
				// pageBreakBeforeRow = rowCount;
			}

			// if (par.isPageBreakBefore()) {
			// pageBreakBeforeRow = rowCount;
			// }

			if (heightRule.equals(STHeightRule.AT_LEAST)) {
				cellHeight += t.getHeightPixel();
				cellHeight += t.getSpacingBeforePixel();
				cellHeight += t.getSpacingAfterPixel();
				if (cellHeight < rowHeightAtLeast) {
					cellHeight = rowHeightAtLeast;
				}
			} else if (heightRule.equals(STHeightRule.EXACT)) {
			} else if (heightRule.equals(STHeightRule.AUTO)) {
				cellHeight += t.getHeightPixel();
				cellHeight += t.getSpacingBeforePixel();
				cellHeight += t.getSpacingAfterPixel();
			}
			cellTables.add(t);
			maxParWidth = Math.max(lastParWidth, t.getWidthPixel());
			lastParWidth = t.getWidthPixel();
		}
		return cellTables;
	}

	public CTTbl getTable() {
		return table;
	}

	@Override
	public void updateFromXml() {
	}

	@Override
	public ITableCell[][] getCells() {
		return cells;
	}

	public int getPageBreakBeforeRow() {
		return pageBreakBeforeRow;
	}

	public void setPageBreakBeforeRow(int pageBreakBeforeRow) {
		this.pageBreakBeforeRow = pageBreakBeforeRow;
	}

	public int getPageBreakAfterRow() {
		return pageBreakAfterRow;
	}

	public void setPageBreakAfterRow(int pageBreakAfterRow) {
		this.pageBreakAfterRow = pageBreakAfterRow;
	}

	public CTShortHexNumber getTblLook() {
		return tblLook;
	}

	public void setTblLook(CTShortHexNumber tblLook) {
		this.tblLook = tblLook;
	}

	@Override
	public void boundsChanged2(Rectangle2D newBounds) {

		double x1 = 0;
		double y1 = 0;
		Rectangle2D r = newBounds; // .getCopy();

		double x = getPage().getX2();
		try {
			if (getVAnchor() == ILayoutAnchor.PAGE) {

				y1 = r.getMinY() - getPage().getY2();
				// TODO
			} else if (getVAnchor() == ILayoutAnchor.COLUMN) {
				y1 = r.getMinY() - getPage().getY2();
			} else if (getVAnchor() == ILayoutAnchor.MARGIN) {
				y1 = r.getMinY() - (getPage().getY2() + getSection().getTopMarginPixel(getPage().getPageNumber()));
			} else if (getVAnchor() == ILayoutAnchor.PARAGRAPH || getVAnchor() == ILayoutAnchor.TEXT) {
				y1 = r.getMinY() - getLayoutFigure().getY2();
			}

			if (getHAnchor() == ILayoutAnchor.PAGE) {
				x1 = r.getMinX() - getPage().getX2();
			} else if (getHAnchor() == ILayoutAnchor.COLUMN) {
				x1 = r.getMinX() - getPage().getX2();
			} else if (getHAnchor() == ILayoutAnchor.MARGIN) {
				x1 = r.getMinX() - (getPage().getX2() + getSection().getLeftMargin());
			} else if (getHAnchor() == ILayoutAnchor.PARAGRAPH || getHAnchor() == ILayoutAnchor.TEXT) {
				x1 = r.getMinX() - getLayoutFigure().getX2();
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}

		setDirtyContent(true);

		setXPixel(x1);
		setYPixel(y1);

		// if (vml != null) {
		// setX(new JOEmuPixel(x1));
		// setY(new JOEmuPixel(y1));
		// getWidthPixel() = newBounds.width;
		// getHeightPixel() = newBounds.height;
		// r.x = x1;
		// r.y = y1;
		// vml.updateBounds(r);
		// }

	}

	@Override
	public void setXPixel(double x1) {
		if (x == null) {
			x = new JOEmu20ThPointProperty(this, table.getTblPr(), table.getTblPr().getTblpPr(), "TblpX", null, //$NON-NLS-1$
					EValueType.MEASUREMENT);
		}
		super.setXPixel(x1);
	}

	@Override
	public void setYPixel(double y1) {
		if (y == null) {
			y = new JOEmu20ThPointProperty(this, table.getTblPr(), table.getTblPr().getTblpPr(), "TblpY", null, //$NON-NLS-1$
					EValueType.MEASUREMENT);
		}
		super.setYPixel(y1);
	}

	@Override
	public boolean dispose() {
		super.dispose();

		List<ILayoutObject> rootObjects = getDocument().getRootObjects();

		int tableIndex = 0;
		// for (ILayoutObject iLayoutObject : rootObjects) {
		// if (iLayoutObject instanceof ITable) {
		// if (iLayoutObject == this) {
		// break;
		// }
		// tableIndex++;
		// }
		// }

		ILayoutObject layoutObject;
		if (getPreviousRootObject() != null) {
			layoutObject = getPreviousRootObject();
		} else {
			layoutObject = getNextRootObject();
		}

		if (getPoiDocument() != null && getPoiDocument().getDocument() != null) {

			List<CTTbl> tblList = getPoiDocument().getDocument().getBody().getTblList();

			for (CTTbl ctTbl : tblList) {
				if (xmlObject.equals(ctTbl)) {
					break;
				}
				tableIndex++;
			}

			try {
				getPoiDocument().getDocument().getBody().removeTbl(tableIndex);
			} catch (Exception ex) {
				RCPLModel.logError(ex);
			}
		}
		if (getPage() != null) {
			getPage().remove(getLayoutFigure());
		}
		if (layoutObject != null) {
			layoutObject.setDirtyLayout(true);
			if (layoutObject.getDocument() != null && layoutObject.getDocument().getEditor() != null) {
				layoutObject.getDocument().getEditor().layoutDocument();
			}
		}
		return false;
	}

	/**
	 * @return
	 */
	private XWPFDocumentCustom getPoiDocument() {
		return (XWPFDocumentCustom) getDocument().getXml();
	}

	@Override
	public String getDisplayName() {
		return "Table";
	}

	public void setIndent(JOEmu20ThPoint indent) {
		this.indent = indent;
	}

	@Override
	public JOStyle getTableStyle() {
		return tableStyle;
	}

	public void setTableStyle(JOStyle tableStyle) {
		this.tableStyle = tableStyle;
	}

	public String getTableStyleName() {
		return tableStyleName;
	}

	@Override
	public JOEmu20ThPointProperty getSpacingBefore() {
		JOEmu20ThPointProperty sp = super.getSpacingBefore();
		if (sp == null) {
			if (tableStyle != null) {
				return (JOEmu20ThPointProperty) tableStyle.getSpacingBefore();
			}
		}
		return sp;
	}

	@Override
	public JOEmu20ThPointProperty getSpacingAfter() {
		JOEmu20ThPointProperty sp = super.getSpacingAfter();
		if (sp == null) {
			if (tableStyle != null) {
				return (JOEmu20ThPointProperty) tableStyle.getSpacingAfter();
			}
		}
		return sp;
	}

	public double getTotalHeight() {
		return getHeightPixel();
	}

	public double getTableWidth() {
		return getWidthPixel();
	}

	/**
	 * @param left
	 * @param number
	 */
	@SuppressWarnings("deprecation")
	public void addColumns(boolean left, int number) {
		double startWidth = getWidthPixel();
		CTRow lastRow = table.getTrArray()[table.getTrArray().length - 1];
		IParagraphFigure pf = getDocument().getEditor().getSelectedParagraph().getLayoutFigure();
		JOTableCell cell = (JOTableCell) pf.getParagraph().getTableCell();
		CTTc ctTcTemplate = null;
		int index = 0;
		if (cell != null) {
			ctTcTemplate = lastRow.getTcArray(cell.getColumn());
			if (left) {
				index = cell.getColumn();
			} else {
				index = cell.getColumn() + 1;
			}
		} else {
			ctTcTemplate = lastRow.getTcArray(0);
		}
		CTRow[] rows = table.getTrArray();
		for (CTRow ctRow : rows) {
			CTTc ctTc;
			if (cell != null) {
				ctTc = ctRow.insertNewTc(index);
			} else {
				ctTc = ctRow.addNewTc();
			}
			ctTc.set(ctTcTemplate);
			CTP[] pArray = ctTc.getPArray();
			if (pArray != null) {
				for (CTP ctp : pArray) {
					CTR[] runs = ctp.getRArray();
					if (runs != null) {
						ctp.setRArray(null);
					}
				}
			}
		}

		double additionalWidth = cells[0][index].getWidthPixel();
		initTable();
		double fac = (startWidth + additionalWidth) / startWidth;

		rows = table.getTrArray();
		for (CTRow ctRow : rows) {
			CTTc[] ctTc = ctRow.getTcArray();
			for (CTTc ctTc2 : ctTc) {
				CTTblWidth w = ctTc2.getTcPr().getTcW();
				BigInteger w0 = w.getW();
				ctTc2.getTcPr().getTcW().setW(BigInteger.valueOf((long) (w0.doubleValue() / fac)));
			}
		}

		initTable();

		getLayoutFigure().loadCells();
		setDirtyLayout(true);
	}

	/**
	 * 
	 */
	public void deleteRows() {
		IParagraphFigure pf = getDocument().getEditor().getSelectedParagraph().getLayoutFigure();
		JOTableCell cell = (JOTableCell) pf.getParagraph().getTableCell();
		if (cell != null) {
			int row = cell.getRow();
			table.removeTr(row);
			initTable();
			getLayoutFigure().loadCells();
			setDirtyLayout(true);
		}
	}

	/**
	 * 
	 */
	@SuppressWarnings("deprecation")
	public void addRow(boolean below) {
		CTRow lastRow = table.getTrArray()[table.getTrArray().length - 1];
		IParagraphFigure pf = getDocument().getEditor().getSelectedParagraph().getLayoutFigure();
		JOTableCell cell = (JOTableCell) pf.getParagraph().getTableCell();
		CTRow newRow;
		if (cell != null) {
			int index;
			if (below) {
				index = cell.getRow() + 1;
			} else {
				index = cell.getRow();
			}
			newRow = table.insertNewTr(index);
		} else {
			newRow = table.addNewTr();
		}
		newRow.set(lastRow);
		CTTc[] ctTcArray = newRow.getTcArray();
		for (CTTc ctTc : ctTcArray) {
			CTP[] pArray = ctTc.getPArray();
			if (pArray != null) {
				for (CTP ctp : pArray) {
					CTR[] runs = ctp.getRArray();
					if (runs != null) {
						ctp.setRArray(null);
					}
				}
			}
		}
		initTable();
		getLayoutFigure().loadCells();
		// Rectangle2D realBounds = getLayoutFigure().getBounds2D();
		// realBounds = JOUtil2.setHeight(realBounds, getHeightPixel());
		// getLayoutFigure().setBounds(realBounds);

		setDirtyLayout(true);
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	public double getTableLineWidth() {
		return tableLineWidth;
	}

	public double getTotalTableHeight() {
		return totalTableHeight;
	}

	public void setTotalTableHeight(double totalTableHeight) {
		this.totalTableHeight = totalTableHeight;
	}

	public boolean isTblLoookAllBorders() {
		return tblLoookAllBorders;
	}

	public CTBorder getTopBorder() {
		return topBorder;
	}

	public CTBorder getBottomBorder() {
		return bottomBorder;
	}

	public CTBorder getLeftBorder() {
		return leftBorder;
	}

	public CTBorder getRightBorder() {
		return rightBorder;
	}

	public CTBorder getInsideHBorder() {
		return insideHBorder;
	}

	public CTBorder getInsideVBorder() {
		return insideVBorder;
	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getWidthPixel() {
		if (width == null) {
			return getPage().getEditWidth();
		}
		return super.getWidthPixel();
	}

	private void setCellHeight(double height) {
		this.cellHeight = height;
	}

	@Override
	public boolean isDirtyLayout() {
		return super.isDirtyLayout();
	}

	@Override
	public void setDirtyLayout(boolean dirty) {
		super.setDirtyLayout(dirty);
	}

	public double getLeftBorderWidth() {
		return leftBorderWidth;
	}

	public double getRightBorderWidth() {
		return rightBorderWidth;
	}

	public double getInsideVBorderWidth() {
		return insideVBorderWidth;
	}

	public double getInsideHBorderWidth() {
		return insideHBorderWidth;
	}

	public double getTopBorderWidth() {
		return topBorderWidth;
	}

	public double getBottomBorderWidth() {
		return bottomBorderWidth;
	}

	@Override
	public ITableFigure getLayoutFigure() {
		return (ITableFigure) super.getLayoutFigure();
	}
}
