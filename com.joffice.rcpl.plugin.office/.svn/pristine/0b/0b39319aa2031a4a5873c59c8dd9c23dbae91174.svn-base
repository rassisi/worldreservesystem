package com.joffice.rcpl.plugin.office.internal.model.spreadsheet;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;

import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;
import com.joffice.rcpl.plugin.office.internal.JOAbstractPart;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawing;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawingDocument;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawingPart;

/**
 * @author ramin
 * 
 */
public class JOSheetPart extends JOAbstractPart {

	private XSSFSheet poiSheet;

	public static final int MAXCELL = 1000;

	private JOCell[][] cells;

	private JORow[] rows;
	private JOColumn[] columns;

	private int rowNum;

	private int colNum;

	private List<JODrawing> drawings;

	public JORow[] getRows() {
		return rows;
	}

	public JOColumn[] getColumns() {
		return columns;
	}

	private JOWorkbookPart workbookPart;

	/**
	 * @param document
	 * @param anchorObject
	 * @param poiSheet
	 * @param parent
	 * @param xmlObject
	 * @param childObject
	 */
	public JOSheetPart(JOSpreadsheetDocument document, JOWorkbookPart part, XSSFSheet poiSheet,
			PackagePart packagePart) {
		super(document, packagePart, poiSheet, part);
	}

	@Override
	protected void init(Object poiObject, Object parent) {
		this.poiSheet = (XSSFSheet) poiObject;
		this.workbookPart = (JOWorkbookPart) parent;
		// int MAXCELL = 1000;
		drawings = new ArrayList<JODrawing>();
		cells = new JOCell[MAXCELL][MAXCELL];
		rows = new JORow[MAXCELL];
		columns = new JOColumn[MAXCELL];
	}

	@SuppressWarnings({ "deprecation", "unused" })
	@Override
	public void updateFromXml() {

		// if (isDirtyContent())
		{
			JOSpreadsheetDocument doc = (JOSpreadsheetDocument) document;

			// poiSheet.add

			CTWorksheet ctWorksheet = poiSheet.getCTWorksheet();

			ctWorksheet.getAutoFilter();
			ctWorksheet.getCellWatches();
			ctWorksheet.getColBreaks();
			ctWorksheet.getColsArray();
			ctWorksheet.getConditionalFormattingArray();
			ctWorksheet.getControls();
			ctWorksheet.getCustomProperties();
			ctWorksheet.getCustomSheetViews();
			ctWorksheet.getDataConsolidate();
			ctWorksheet.getDataValidations();
			ctWorksheet.getDimension();
			if (ctWorksheet.getDrawing() != null) {
				for (POIXMLDocumentPart dr : poiSheet.getRelations()) {
					if (dr instanceof XSSFDrawing) {
						CTDrawing ctDrawing = ((XSSFDrawing) dr).getCTDrawing();
						XmlObject[] oArray1 = ctDrawing.selectPath("./*"); //$NON-NLS-1$
						for (XmlObject obj1 : oArray1) {
							XmlObject[] oArray2 = obj1.selectPath("./*"); //$NON-NLS-1$
							for (XmlObject obj2 : oArray2) {
								String obj2Name = obj2.getDomNode().getNodeName();
								if (obj2Name.equals("xdr:twoCellAnchor")) { //$NON-NLS-1$
									CTTwoCellAnchor ctTwoCellAnchor = ctDrawing.addNewTwoCellAnchor();
									ctTwoCellAnchor.set(obj2);
									JODrawingDocument drawingDocument = new JODrawingDocument(false);
									drawingDocument.setEditorFigure(getWorkbook().getDocument().getEditor());
									JODrawingPart drawingPart = new JODrawingPart(drawingDocument, dr.getPackagePart());
									JODrawing drawing = new JODrawing(drawingDocument, null, ctDrawing, ctTwoCellAnchor,
											true);
									drawings.add(drawing);
								} else if (obj2Name.equals("xdr:oneCellAnchor")) { //$NON-NLS-1$
									CTOneCellAnchor ctOneCellAnchor = ctDrawing.addNewOneCellAnchor();
									ctOneCellAnchor.set(obj2);
									JODrawing drawing = new JODrawing(doc, null, ctDrawing, ctOneCellAnchor, true);
									drawings.add(drawing);
								} else if (obj2Name.equals("xdr:absoluteAnchor")) { //$NON-NLS-1$
									CTAbsoluteAnchor ctAbsoluteAnchor = ctDrawing.addNewAbsoluteAnchor();
									ctAbsoluteAnchor.set(obj2);
									JODrawing drawing = new JODrawing(doc, null, ctDrawing, ctAbsoluteAnchor, true);
									drawings.add(drawing);
								}
							}
						}
					}
				}
			}

			ctWorksheet.getExtLst();
			ctWorksheet.getHeaderFooter();
			ctWorksheet.getHyperlinks();
			ctWorksheet.getIgnoredErrors();
			ctWorksheet.getLegacyDrawing();
			ctWorksheet.getLegacyDrawingHF();
			ctWorksheet.getMergeCells();
			ctWorksheet.getOleObjects();
			ctWorksheet.getPageMargins();
			ctWorksheet.getPageSetup();
			ctWorksheet.getPhoneticPr();
			ctWorksheet.getPicture();
			ctWorksheet.getPrintOptions();
			ctWorksheet.getProtectedRanges();
			ctWorksheet.getRowBreaks();
			ctWorksheet.getScenarios();
			ctWorksheet.getSheetCalcPr();
			ctWorksheet.getSheetData();
			ctWorksheet.getSheetFormatPr();
			ctWorksheet.getSheetPr();
			ctWorksheet.getSheetProtection();
			ctWorksheet.getSheetViews();
			ctWorksheet.getSmartTags();
			ctWorksheet.getSortState();
			ctWorksheet.getWebPublishItems();
			ctWorksheet.getTableParts();

			try {
				int y = 0;
				for (int i = 0; i < rows.length; i++) {
					XSSFRow row = getPoiSheet().getRow(i);
					try {
						rows[i] = new JORow();
						rows[i].y = y;
						if (row != null) {
							double h = new JOEmuPoint(row.getHeightInPoints()).toPixel();
							rows[i].height = h;
							y += h;
						} else {
							rows[i].height = RcplConfig.DEFAULT_CELL_HEIGHT;
							y += RcplConfig.DEFAULT_CELL_HEIGHT;
						}

					} catch (Exception ex) {
						rows[i].height = RcplConfig.DEFAULT_CELL_HEIGHT;
						y += RcplConfig.DEFAULT_CELL_HEIGHT;
					}
				}

				int x = 0;
				for (int i = 0; i < columns.length; i++) {
					columns[i] = new JOColumn();
					columns[i].x = x;
					try {
						double w = getPoiSheet().getColumnWidth(i) / 256.0
								* doc.getWorkbook().getMaxFontCharacterWidth();
						columns[i].width = (int) w;
						x += (int) w;
					} catch (Exception ex) {
						columns[i].width = RcplConfig.DEFAULT_CELL_WIDTH;
						x += RcplConfig.DEFAULT_CELL_WIDTH;
					}
				}

				rowNum = getPoiSheet().getLastRowNum() + 1;

				XSSFRow firstPoiRow = getPoiSheet().getRow(0);

				if (firstPoiRow != null) {
					colNum = 0;
					colNum = firstPoiRow.getLastCellNum();
					// JO.officePane
					// .setProgressMessage(Messages.JOSheetPart_LoadCells);
					// JO.officePane.setProgressMaximum(rowNum * colNum);

					rowNum = Math.min(1000, rowNum);
					colNum = Math.min(1000, colNum);

					for (int row = 0; row < rowNum; row++) {
						double h = rows[row].height;
						XSSFRow poiRow = getPoiSheet().getRow(row);
						if (poiRow != null) {
							short lastCellNum = poiRow.getLastCellNum();
							if (lastCellNum > colNum) {
								colNum = lastCellNum;
							}
							for (int col = 0; col <= lastCellNum; col++) {
								double w = columns[col].width;
								XSSFCell cell = poiRow.getCell(col);
								if (cell != null) {
									JOCell c = new JOCell(document, cell, null, null, cell.getCTCell(), false, row, col,
											poiRow, this);
									cells[row][col] = c;
									// JO.officePane.updateProgressBar();
								}
							}
						}
					}

					for (int row = 0; row < rowNum; row++) {
						JOCell[] joRow = cells[row];
						for (int col = 0; col < colNum; col++) {
							JOCell cell = cells[row][col];
							if (cell != null) {
								if (cell.getParagraph() != null) {
									if (cell.getRightBorder() != null) {
										if (col == colNum - 1) {
											cell.setMarkBorderLimit(AlignType.RIGHT);
										} else if (cells[row][col + 1] != null) {
											if (cells[row][col + 1].getParagraph() != null) {
												if (cells[row][col + 1].getLeftBorder() == null) {
													cell.setMarkBorderLimit(AlignType.RIGHT);
												}
											}
										}
									}

									if (cell.getBottomBorder() != null) {
										if (row == rowNum - 1) {
											cell.setMarkBorderLimit(AlignType.BOTTOM);
										} else if (cells[row + 1][col] != null) {
											if (cells[row + 1][col].getParagraph() != null) {
												if (cells[row + 1][col].getTopBorder() == null) {
													cell.setMarkBorderLimit(AlignType.BOTTOM);
												}
											}
										}
									}

								}
							}
						}
					}

					int n = getPoiSheet().getNumMergedRegions();
					for (int i = 0; i < n; i++) {
						CellRangeAddress cellRangeAddress = getPoiSheet().getMergedRegion(i);
						int c1 = cellRangeAddress.getFirstColumn();
						int c2 = cellRangeAddress.getLastColumn();
						int r1 = cellRangeAddress.getFirstRow();
						int r2 = cellRangeAddress.getLastRow();
						int hSpan = 1;
						int vSpan = 1;
						// if (cells[r1][c1] == null) {
						// cells[r1][c1] = new JOCell(getDocument(), null,
						// this, null, null, true, r1, c1, null);
						// }

						JOCell leadingMergeCell = cells[r1][c1];

						for (int r = r1; r <= r2; r++) {
							for (int c = c1; c <= c2; c++) {
								if (cells[r][c] == null) {
									cells[r][c] = new JOCell(document, null, null, null, null, true, r, c, null, this);
								}
								JOCell cell = cells[r][c];
								if (cell != leadingMergeCell) {
									cell.setHidden(true);
									cell.setLeadMergeCell(leadingMergeCell);
									hSpan++;
								}
							}
							JOCell cell = cells[r][c1];
							if (cell != leadingMergeCell) {
								if (cell != leadingMergeCell) {
									vSpan++;
								}
							}
						}
						cells[r1][c1].setHorizontalSpan(hSpan);
						cells[r1][c1].setVerticalSpan(vSpan);
					}
				}
			} catch (Exception ex) {

			}
			// JO.officePane.setProgressMessage(""); //$NON-NLS-1$
			// this.dirtyContent = false;
		}
	}

	public XSSFSheet getPoiSheet() {
		return poiSheet;
	}

	public String getName() {
		return poiSheet.getSheetName();
	}

	public int getRowNum() {
		return rowNum;
	}

	public int getColNum() {
		return colNum;
	}

	public JOCell[][] getCells() {
		return cells;
	}

	public List<JODrawing> getDrawings() {
		return drawings;
	}

	public JOWorkbookPart getWorkbook() {
		return workbookPart;
	}

	@Override
	protected void createDocument() {
	}

}
