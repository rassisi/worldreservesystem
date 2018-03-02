package com.joffice.rcpl.plugin.office.internal.model.spreadsheet;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IWorkbookPart;
import org.eclipse.rcpl.Rcpl;

import com.joffice.rcpl.plugin.office.internal.JOAbstractPart;

/**
 * @author ramin
 * 
 */
public class JOWorkbookPart extends JOAbstractPart implements IWorkbookPart {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOWorkbookPart.class);

	private XSSFWorkbook poiWorkbook;

	private List<JOSheetPart> sheets = new ArrayList<JOSheetPart>();

	private int maxFontCharacterWidth = 0;

	private int indentationWidth = 0;

	private StylesTable stylesTable;

	private ThemesTable themesTable;

	public JOWorkbookPart(JOSpreadsheetDocument document, XSSFWorkbook poiWorkbook, PackagePart packagePart) {
		super(document, packagePart, poiWorkbook, null);
		document.setWorkbook(this);

		themesTable = getPoiWorkbook().getTheme();
		IFont normalFont = Rcpl.fontProvider().loadSystemFont();
		// loadFont(
		// themesTable.getNormalFontTypeFace(),
		// themesTable.getNormalFontHeight(), SWT.NORMAL);

		// for (int i = 0; i < 10; i++) {
		// int w =
		//
		// JO.service.getFontService().getTextExtent(
		// "" + i, normalFont).x; //$NON-NLS-1$
		// if (w > maxFontCharacterWidth) {
		// maxFontCharacterWidth = w;
		// }
		// }

		maxFontCharacterWidth = 10;
		indentationWidth = 0;

		// JO.service.getFontService().getTextExtent(
		// " ", normalFont).x; //$NON-NLS-1$

		// ---------- styles document

		stylesTable = getPoiWorkbook().getStylesSource();

		for (int i = 0; i < poiWorkbook.getNumberOfSheets(); i++) {
			JOSheetPart sheet = new JOSheetPart(document, this, poiWorkbook.getSheetAt(i),
					poiWorkbook.getSheetAt(i).getPackagePart());
			sheet.updateFromXml();
			sheets.add(sheet);
			// JO.officePane.updateProgressBar();
		}
	}

	@Override
	protected void init(Object poiObject, Object parent) {
		this.poiWorkbook = (XSSFWorkbook) poiObject;
	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	public void recalculate() {
		FormulaEvaluator evaluator = getPoiWorkbook().getCreationHelper().createFormulaEvaluator();

		for (JOSheetPart sheet : sheets) {
			JOCell[][] cells = sheet.getCells();
			for (int row = 0; row < sheet.getRowNum(); row++) {
				JOCell[] joRow = cells[row];
				for (int col = 0; col < sheet.getColNum(); col++) {
					JOCell cell = cells[row][col];
					if (cell != null) {
						if (cell.getParagraph() != null) {
							Cell poiCell = cell.getPoiCell();
							if (poiCell.getCellType() == Cell.CELL_TYPE_FORMULA) {
								try {
									evaluator.evaluateFormulaCell(poiCell);
									cell.getParagraph().updateFromXml();
								} catch (Exception ex) {
									// LOGGER.error("", ex); //$NON-NLS-1$
								}
							}
						}
					}
				}
			}

			// Sheet poiSheet = sheet.getPoiSheet();
			//
			//
			//
			//
			// for (Row r : poiSheet) {
			// for (Cell c : r) {
			// if (c.getCellType() == Cell.CELL_TYPE_FORMULA) {
			// try {
			// evaluator.evaluateFormulaCell(c);
			// } catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
			// }
			// }
			// }
			// }

		}

		// for (int sheetNum = 0; sheetNum <
		// getPoiWorkbook().getNumberOfSheets(); sheetNum++) {
		// Sheet poiSheet = getPoiWorkbook().getSheetAt(sheetNum);
		// for (Row r : poiSheet) {
		// for (Cell c : r) {
		// if (c.getCellType() == Cell.CELL_TYPE_FORMULA) {
		// try {
		// evaluator.evaluateFormulaCell(c);
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		// }
		// }
		// }
		// }
	}

	@Override
	public void updateFromXml() {
	}

	public XSSFWorkbook getPoiWorkbook() {
		return poiWorkbook;
	}

	public List<JOSheetPart> getSheets() {
		return sheets;
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getMaxFontCharacterWidth() {
		return maxFontCharacterWidth;
	}

	public int getIndentationWidth() {
		return indentationWidth;
	}

	public StylesTable getStylesTable() {
		return stylesTable;
	}

	public ThemesTable getThemesTable() {
		return themesTable;
	}

	@Override
	protected void createDocument() {
	}

}
