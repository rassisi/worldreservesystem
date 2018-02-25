package com.joffice.rcpl.plugin.office.figures.spreadsheet;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.IStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;

import com.joffice.rcpl.plugin.office.JOBorder;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.internal.figures.JOEditorFigure;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOCell;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOColumn;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JORow;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOSheetPart;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOVirtualCell;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.TextAlignment;

/**
 * @author ramin
 * 
 */
public class JOSpreadsheetFigure extends BorderPane {

	// @SuppressWarnings("unused")
	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOSpreadsheetFigure.class);

	private boolean entered = false;

	private final static double HEADER_HEIGHT = 21.5;

	public boolean isEntered() {
		return entered;
	}

	// public static final Cursor DOWN_CURSOR;
	//
	// static {
	// DOWN_CURSOR = new Cursor(null, SWT.CURSOR_SIZES);
	// }
	//
	// private final static Font headerFont = JOFontProvider.loadSystemFont();

	@SuppressWarnings("unused")
	private int actualColumn = -1;

	@SuppressWarnings("unused")
	private int actualRow = -1;

	private JOEditorFigure editorFigure;

	private JOSheetPart sheet;

	private double totalWidth;

	private double totalHeight;

	private int selectedColumn;

	private int selectedRow;

	private int hoveredColumn;

	private int hoveredRow;

	private List<JOVirtualCell> selectedAreas = new ArrayList<JOVirtualCell>();

	private GridPane mainPane;

	// private Canvas topCanvas;
	//
	// private Canvas leftCanvas;
	//
	// private Canvas canvas;

	double xStart;

	List<Label> columnLabels = new ArrayList<Label>();
	List<Label> rowLabels = new ArrayList<Label>();

	double maxRowHeaderWidth = 30;

	/**
	 * 
	 */
	public JOSpreadsheetFigure(JOEditorFigure editorFigure, JOSheetPart sheet) {
		this.editorFigure = editorFigure;
		this.sheet = sheet;
		xStart = ((sheet.getRows().length / 10000) + 1) * 10 + 10.5;

		mainPane = new GridPane() {
			@Override
			protected void layoutChildren() {
				super.layoutChildren();

			}
		};
		mainPane.setGridLinesVisible(true);
		mainPane.setStyle("-fx-background-color: white;");

		for (int col = 0; col < sheet.getColNum() + 100; col++) {
			Label l = new Label(getColumnName(col));
			l.setId("spreadsheetColumnHeader");
			mainPane.add(l, col + 1, 0);
			l.setPrefWidth(60);
			l.setTextAlignment(TextAlignment.CENTER);
			l.setAlignment(Pos.CENTER);
			columnLabels.add(l);
		}

		for (int row = 0; row < sheet.getRowNum() + 100; row++) {
			Label l = new Label("" + (row + 1));
			l.setId("spreadsheetRowHeader");
			l.setTextAlignment(TextAlignment.RIGHT);
			l.setAlignment(Pos.CENTER_RIGHT);
			rowLabels.add(l);
			mainPane.add(l, 0, row + 1);
			maxRowHeaderWidth = Math.max(maxRowHeaderWidth, l.getWidth());
		}

		for (Label l : rowLabels) {
			l.setPrefWidth(maxRowHeaderWidth);
			l.setMinWidth(maxRowHeaderWidth);
		}
		ScrollPane sp = new ScrollPane();
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setHbarPolicy(ScrollBarPolicy.ALWAYS);

		setCenter(sp);
		sp.setContent(mainPane);

		// ---------- add all drawing --------------------------------

		// for (JODrawing drawing : sheet.getDrawings()) {
		// drawing.getDocument().setEditorFigure(editorFigure);
		// JODrawingFigure drawingFigure = (JODrawingFigure) drawing
		// .getLayoutFigure();
		// add(drawingFigure);
		// }

		refresh();

	}

	private void add(IDrawingFigure d) {

	}

	/**
	 * @param r
	 * @param me
	 * @return
	 */
	// private boolean tableEntered(Rectangle r, MouseEvent me) {
	// int x = me.x - r.x;
	// int y = me.y - r.y;
	// if ((x > 2 && x < r.width - 4) && (y < r.height - 4 && y > 2)) {
	// return true;
	// }
	// return false;
	// }

	/**
	 * @param index
	 * @return
	 */
	public int calculateColumnPosition(int index) {
		double scale = getEditorFigure().getScale();
		int result = 0;
		for (int i = 0; i < index; i++) {
			result += sheet.getColumns()[i].width;
		}
		return (int) (result * scale);
	}

	/**
	 * result[0] - column index result[1] - diff to this column
	 * 
	 * @param x
	 * @return
	 */
	public int[] findNextColumn(int x) {
		int[] result = new int[2];
		// double scale = getEditorFigure().getScale();
		// int hSel = (int) (getEditorFigure().getHorizontalBar().getSelection()
		// * scale);
		// int lastDiff = Integer.MAX_VALUE;
		// int diff = Integer.MAX_VALUE;
		// for (int i = 0; i < sheet.getColumns().length; i++) {
		// int scaledX = (int) (sheet.getColumns()[i].x * scale) - hSel;
		// if (x > scaledX
		// && x < scaledX
		// + (int) (sheet.getColumns()[i].width * scale)) {
		// actualColumn = i;
		// }
		// diff = Math.abs(x - scaledX);
		// if (diff < lastDiff) {
		// lastDiff = diff;
		// } else if (diff > lastDiff) {
		// result[0] = i - 1;
		// result[1] = lastDiff;
		// return result;
		// }
		// }
		return result;
	}

	/**
	 * @param x
	 * @return
	 */
	public int findSelectedColumnIndex(int x) {
		int selColumn = 0;
		// double scale = getEditorFigure().getScale();
		// int hSel = (int) (getEditorFigure().getHorizontalBar().getSelection()
		// * scale);
		// for (int i = 0; i < sheet.getColumns().length; i++) {
		// int scaledX = (int) (sheet.getColumns()[i].x * scale) - hSel;
		// if (x >= scaledX
		// && x < scaledX
		// + (int) (sheet.getColumns()[i].width * scale)) {
		// selColumn = i;
		// break;
		// }
		// }
		return selColumn;
	}

	/**
	 * @param y
	 * @return
	 */
	public int findSelectedRowIndex(int y) {
		int selRow = 0;
		// double scale = getEditorFigure().getScale();
		// int hSel = (int) (getEditorFigure().getHorizontalBar().getSelection()
		// * scale);
		// for (int i = 0; i < sheet.getRows().length; i++) {
		// int scaledY = (int) (sheet.getRows()[i].y * scale) - hSel;
		// if (y >= scaledY
		// && y < scaledY + (int) (sheet.getRows()[i].height * scale)) {
		// selRow = i;
		// break;
		// }
		// }
		return selRow;
	}

	/**
	 * @param x
	 * @return
	 */
	public int[] findNextRow(int x) {
		int[] result = new int[2];
		// double scale = getEditorFigure().getScale();
		// int vSel = (int) (getEditorFigure().getvBar().getValue() * scale);
		// int lastDiff = Integer.MAX_VALUE;
		// int diff = Integer.MAX_VALUE;
		// for (int i = 0; i < sheet.getRows().length; i++) {
		// int scaledX = (int) (sheet.getRows()[i].y * scale) - vSel;
		// if (x > scaledX
		// && x < scaledX + (int) (sheet.getRows()[i].height * scale)) {
		// actualRow = i;
		// }
		// diff = Math.abs(x - scaledX);
		// if (diff < lastDiff) {
		// lastDiff = diff;
		// } else if (diff > lastDiff) {
		// result[0] = Math.max(0, i - 1);
		// result[1] = lastDiff;
		// return result;
		// }
		// }
		return result;
	}

	public int calculateRowPosition(int index) {
		double scale = getEditorFigure().getScale();
		int result = 0;
		for (int i = 0; i < index; i++) {
			result += sheet.getRows()[i].height;
		}
		return (int) (result * scale);
	}

	// @Override
	// public void paintFigure(Graphics graphics) {
	//
	// Rectangle r = getBounds();
	// graphics.setBackgroundColor(ColorConstants.white);
	// graphics.fillRectangle(r);
	// graphics.setForegroundColor(JOColorProvider.getColor(
	// JOColorProvider.COLOR_MAIN_OFFICE_COLOR, 0.3f));
	// graphics.setBackgroundColor(JOColorProvider.getColor(
	// JOColorProvider.COLOR_MAIN_OFFICE_COLOR, 1.1f));
	// graphics.setFont(headerFont);
	//
	// // ----------- draw grid -----------------------------------------------
	//
	// paintGrid(graphics, r);
	// //
	// // graphics.setForegroundColor(JOColorProvider.getColor(0.1));
	//
	// int y = 0;
	// for (int row = 0; row < sheet.getRows().length; row++) {
	// int x = 0;
	// for (int col = 0; col < sheet.getColumns().length; col++) {
	// if (sheet.getCells()[row][col] != null) {
	// JOCell cell = sheet.getCells()[row][col];
	// cell.setxPixel(x);
	// cell.setyPixel(y);
	// Rectangle cellR = new Rectangle(r.x + x, r.y + y,
	// cell.getWidth(), cell.getHeight());
	//
	// if (cell.getLeadMergeCell() == null) {
	// if (cell.getFillColorFg() != null) {
	// if (!(cell.getFillColorFg()
	// .equals(ColorConstants.white))) {
	// graphics.setBackgroundColor(cell
	// .getFillColorFg());
	// graphics.fillRectangle(cellR.x, cellR.y,
	// cellR.width, cellR.height);
	// }
	// }
	// paintCellBorders(graphics, cell, cellR);
	// }
	//
	// if (row == selectedRow && col == selectedColumn) {
	// paintSelectedCell(graphics, r, x, y, row, col);
	// }
	//
	// } else {
	// if (row == selectedRow && col == selectedColumn) {
	// paintSelectedCell(graphics, r, x, y, row, col);
	// }
	// }
	//
	// x += sheet.getColumns()[col].width;
	// }
	// y += sheet.getRows()[row].height;
	// }
	// }

	// /**
	// * @param graphics
	// * @param r
	// */
	// private void paintGrid(Graphics graphics, Rectangle r) {
	// if (getEditorFigure().isShowGrid()) {
	// int x = 0;
	// int i = 0;
	//
	// graphics.setForegroundColor(JOColorProvider.getColor(1.1f));
	// try {
	// do {
	// graphics.drawLine(r.x + x, r.y, r.x + x, r.y + r.height);
	// if (i < sheet.getColumns().length) {
	// x += sheet.getColumns()[i++].width;
	// } else {
	// break;
	// }
	// } while (x < r.width);
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// try {
	// int y = 0;
	// i = 0;
	// do {
	// graphics.drawLine(r.x, r.y + y, r.x + r.width, r.y + y);
	// if (i < sheet.getRows().length) {
	// y += sheet.getRows()[i++].height;
	// } else {
	// break;
	// }
	// } while (y < r.height);
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// }
	// }

	/**
	 * @param graphics
	 * @param r
	 * @param x
	 * @param y
	 * @param row
	 * @param col
	 */
	// private void paintSelectedCell(Graphics graphics, Rectangle r, int x,
	// int y, int row, int col) {
	//
	// JOVirtualCell selectedCell = null;
	//
	// double scale = getEditorFigure().getScale();
	//
	// for (JOVirtualCell cell : selectedAreas) {
	// if (cell.columnIndex == col && cell.rowIndex == row) {
	// boolean inverse = false;
	// selectedCell = cell;
	// int maxRow = row + cell.vSpan;
	// int maxCol = col + cell.hSpan;
	// int col1 = Math.min(col, maxCol);
	// int row1 = Math.min(row, maxRow);
	// int row2 = Math.max(maxRow, row);
	// int col2 = Math.max(maxCol, col);
	// if (row > maxRow) {
	// row2++;
	// inverse = true;
	// }
	// if (col > maxCol) {
	// col2++;
	// inverse = true;
	// }
	// int x1 = sheet.getColumns()[col1].x;
	// int y1 = sheet.getRows()[row1].y;
	// int x2 = sheet.getColumns()[col2].x;
	// int y2 = sheet.getRows()[row2].y;
	// int width = x2 - x1;
	// int height = y2 - y1;
	// Rectangle cellR = new Rectangle((int) (x1 * scale),
	// (int) (y1 * scale), width, height);
	// graphics.setLineWidth(3);
	// graphics.setForegroundColor(ColorConstants.black);
	//
	// graphics.drawRectangle(cellR);
	// graphics.setBackgroundColor(ColorConstants.black);
	// graphics.fillRectangle(cellR.x + cellR.width - 3, cellR.y
	// + cellR.height - 3, 6, 6);
	// graphics.setForegroundColor(ColorConstants.white);
	// graphics.setLineWidth(1);
	// graphics.drawRectangle(cellR.x + cellR.width - 4, cellR.y
	// + cellR.height - 4, 8, 8);
	//
	//
	// // graphics.drawText("" + selectedCell.hSpan + "/"
	// // + selectedCell.vSpan, cellR.x + 3, cellR.y + 3);
	//
	// graphics.setAlpha(128);
	// graphics.setBackgroundColor(ColorConstants.gray);
	// double selWidth = sheet.getColumns()[selectedCell.columnIndex].width;
	// double selHeight = sheet.getRows()[selectedCell.rowIndex].height;
	// if (inverse) {
	// int x11 = cellR.x;
	// int y11 = cellR.y;
	// Rectangle r1 = new Rectangle(x11, y11, cellR.width
	// - selWidth, cellR.height - selHeight);
	// graphics.fillRectangle(r1);
	// if (selectedCell.vSpan > 0) {
	// x11 = cellR.x;
	// y11 = cellR.y;
	// r1 = new Rectangle(x11, y11, selWidth, cellR.height
	// - selHeight);
	// graphics.fillRectangle(r1);
	// }
	// if (selectedCell.hSpan > 0) {
	// x11 = cellR.x + selWidth;
	// y11 = cellR.y;
	// r1 = new Rectangle(x11, y11, cellR.width - selWidth,
	// selHeight);
	// graphics.fillRectangle(r1);
	// }
	// } else {
	// int x11 = cellR.x + selWidth;
	// int y11 = cellR.y + selHeight;
	// Rectangle r1 = new Rectangle(x11, y11, cellR.width
	// - selWidth, cellR.height - selHeight);
	// graphics.fillRectangle(r1);
	// if (selectedCell.vSpan > 1) {
	// x11 = cellR.x;
	// y11 = cellR.y + selHeight;
	// r1 = new Rectangle(x11, y11, selWidth, cellR.height
	// - selHeight);
	// graphics.fillRectangle(r1);
	// }
	// if (selectedCell.hSpan > 1) {
	// x11 = cellR.x + selWidth;
	// y11 = cellR.y;
	// r1 = new Rectangle(x11, y11, cellR.width - selWidth,
	// selHeight);
	// graphics.fillRectangle(r1);
	// }
	// }
	// }
	// }
	// }

	private void drawCellBorders(JOCell cell) {

		// GraphicsContext graphics;
		//
		// if (cell.getBottomBorder() != null) {
		// IBorder border = cell.getBottomBorder().get();
		// graphics.setLineWidth(border.getLineWidthPixel());
		// Color fg1 = cell.getBottomBorderColor().get().getFx();
		// graphics.setStroke(fg1);
		// double y1 = r.getMinY() + r.getHeight();
		// if (AlignType.BOTTOM.equals(cell.getMarkBorderLimit())) {
		// y1 -= (border.getLineWidthPixel() + 1);
		// }
		// graphics.strokeLine(r.getMinX(), y1,
		// r.getMinY() + r.getWidth() - 1, y1);
		// }
		//
		// if (cell.getTopBorder() != null) {
		// IBorder border = cell.getTopBorder().get();
		// graphics.setLineWidth(border.getLineWidthPixel());
		// Color fg1 = cell.getTopBorderColor().get().getFx();
		// graphics.setStroke(fg1);
		// double y1 = r.getMinY();
		// graphics.strokeLine(r.getMinX(), y1,
		// r.getMinX() + r.getWidth() - 1, y1);
		// }
		//
		// if (cell.getLeftBorder() != null) {
		// IBorder border = cell.getLeftBorder().get();
		// graphics.setLineWidth(border.getLineWidthPixel());
		// Color fg1 = cell.getLeftBorderColor().get().getFx();
		// graphics.setStroke(fg1);
		// double y1 = r.getMinY() + r.getHeight() - 1;
		// graphics.strokeLine(r.getMinX(), r.getMinY(), r.getMinX(), y1);
		// }
		//
		// if (cell.getRightBorder() != null) {
		// IBorder border = cell.getRightBorder().get();
		// graphics.setLineWidth(border.getLineWidthPixel());
		// Color fg1 = cell.getRightBorderColor().get().getFx();
		// graphics.setStroke(fg1);
		// double x1 = r.getMinX() + r.getWidth();
		// if (AlignType.RIGHT.equals(cell.getMarkBorderLimit())) {
		// x1 -= (border.getLineWidthPixel() + 1);
		// }
		// graphics.strokeLine(x1, r.getMinY(), x1,
		// r.getMinY() + r.getHeight() - 1);
		// }
	}

	int reent = 0;

	public void refresh() {

		// for(JODrawing drawing : sheet.getDrawings()){
		// JODrawingFigure drawingFigure =
		// (JODrawingFigure)drawing.getLayoutFigure();
		// Rectangle r = getBounds();
		// int width = drawing.getSize().getWidthPixel();
		// int height = drawing.getSize().getHeightPixel();
		// int xOff = r.x + drawing.getXOff().get().toPixel();
		// int yOff = r.y + drawing.getYOff().get().toPixel();
		// }

		JOCell[][] cells = sheet.getCells();

		double y = 0;

		for (int col0 = 0; col0 < (sheet.getColumns().length - 2); col0++) {
			try {
				JOColumn joColumn = sheet.getColumns()[col0];
				columnLabels.get(col0).setPrefWidth(joColumn.width);
			} catch (Exception ex) {
				break;
			}
		}

		for (int row = 0; row < cells.length; row++) {
			JORow joRow = sheet.getRows()[row];
			double h = joRow.height;
			JOCell[] rowCells = cells[row];
			double x = 0;

			for (int col = 0; col < rowCells.length; col++) {

				JOColumn joColumn = sheet.getColumns()[col];
				double w = joColumn.width;

				JOCell joCell = cells[row][col];
				if (joCell != null) {
					double paragraphHeight = 0;
					double cellHeight = joCell.getHeight().get().toPixel();
					if (joCell.getParagraph() != null) {
						joCell.getLayoutFigure().getPane().setUserData("X");
						joCell.setWidthPixel(w);
						IStyle style = joCell.getStyle();
						if (style != null) {
							joCell.getParagraph().setStyle(style);
						}
						JOParagraphFigure f = (JOParagraphFigure) joCell.getParagraph().getLayoutFigure();
						f.updateFx();
						double indentation = 0;
						if (joCell.getIndentation() != null) {
							indentation = joCell.getIndentation().get().toPixel();
						}
						// TODO: cw!!!
						double cw = Math.max(w, joCell.getWidthPixel());
						if (!joCell.isWrap() && joCell.getHorizontalAlignment().get().equals(AlignType.LEFT)) {
							cw = Math.max(500, cw);
						}

						joCell.getParagraph().setWidthPixel(cw);
						f.setWidth(cw);
						f.setHeight(10);
						paragraphHeight = f.getFx().getHeight();
						joCell.getLayoutFigure().add(f);
						joCell.getLayoutFigure().getPane().setStyle("-fx-background-color: white;");

					} else {
						joCell.getLayoutFigure().setStyle("-fx-background-color: silver;");
					}

					h = Math.max(h, cellHeight);
					h = Math.max(h, paragraphHeight);

					// h = paragraphHeight;
					joRow.height = h;

					totalWidth = Math.max(totalWidth, x);

					if (joCell.getHorizontalSpan() > 1) {
						GridPane.setColumnSpan(joCell.getLayoutFigure().getPane(), joCell.getHorizontalSpan());
					}
					mainPane.add(joCell.getLayoutFigure().getPane(), col + 1, row + 1);
					drawCellBorders(joCell);

					joCell.getLayoutFigure().setWidth(joCell.getWidthPixel());
					joCell.getLayoutFigure().setHeight(joColumn.width);

					if (joCell.getFillColorBg() != null) {

						joCell.getLayoutFigure().setStyle("-fx-background-color: blue;");

						// joCell.getLayoutFigure()
						// .getNode()
						// .setBackground(
						// new Background(new BackgroundFill(
						// joCell.getFillColorBg()
						// .getFx(), null,
						// null)));
					} else {

						if (joCell.getFillColorProperty() != null) {
							joCell.getLayoutFigure().getPane().setBackground(new Background(
									new BackgroundFill(joCell.getFillColorProperty().get().getFx(), null, null)));

						}
						// ((Node) joCell.getLayoutFigure().getNode())
						// .setStyle("-fx-border-color:red;-fx-border-width:
						// 2;");
						// joCell.getLayoutFigure()
						// .getNode()
						// .setBackground(
						// new Background(new BackgroundFill(
						// Color.RED, null, null)));

					}

					// if (!(joCell.getFillColorFg().equals(IColor.WHITE)))
					// {
					// graphics.setBackgroundColor(cell.getFillColorFg());
					// graphics.fillRectangle(cellR.x, cellR.y,
					// cellR.width, cellR.height);
					// }

				}

				joColumn.x = x;
				x += w + 4;

			}

			for (int row0 = 0; row0 < (sheet.getRows().length - 2); row0++) {
				try {
					rowLabels.get(row0).setPrefHeight(joRow.height);
				} catch (Exception ex) {
					break;
				}
			}
			joRow.y = y;
			y += h;
			// totalHeight = Math.max(totalHeight, y);
		}

		// totalWidth = Math.max(totalWidth, 5000);

		// totalWidth += 500;
		//
		// totalHeight += 500;

		// mainPane.setPrefWidth(totalWidth);
		// mainPane.setMinHeight(totalHeight);
		// mainPane.setPrefHeight(totalHeight);
		// mainPane.setMaxHeight(totalHeight);

		// canvas.setWidth(totalWidth);
		// canvas.setHeight(totalHeight);

		// canvas.setWidth(getWidth());
		// canvas.setHeight(getHeight());

		drawCanvas();

		for (Node n : mainPane.getChildrenUnmodifiable()) {

			if ("X".equals(n.getUserData())) {
				n.toFront();
			}

		}
		reent = 0;

	}

	private void drawCanvas() {

		double h1 = (HEADER_HEIGHT - 1) / 2;

		JOCell[][] cells = sheet.getCells();

		// GraphicsContext gcTop = topCanvas.getGraphicsContext2D();
		// GraphicsContext gcLeft = leftCanvas.getGraphicsContext2D();

		// sheet.getPoiSheet().get
		// gcTop.setFill(Color.WHITE);
		// gcTop.fillRect(0, 0, totalWidth, totalHeight);

		Color c1 = Color.WHITE;
		Color c2 = Color.LIGHTGRAY;

		Color lineColor = Color.rgb(208, 215, 229);

		Color leftFillColor = lineColor.brighter();

		// ---------- fill left --------------------------------------

		// gcTop.setFill(leftFillColor);
		// gcTop.fillRect(1, 1, xStart - 3, totalHeight);

		// ---------- fill top ---------------------------------------

		LinearGradient lg1 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop(0.0, c1),
				new Stop(1.0, c2));

		LinearGradient lg2 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, new Stop(0.0, c2),
				new Stop(1.0, c2));

		for (int col = 0; col < sheet.getColumns().length; col++) {
			JOColumn joColumn = sheet.getColumns()[col];
			// gcTop.setFill(lg1);
			// gcTop.fillRect(joColumn.x + 1, 0, joColumn.width + 3, h1);
			// gcTop.setFill(lg2);
			// gcTop.fillRect(joColumn.x + 1, h1, joColumn.width + 3, h1);
		}

		// ---------- stroke left ------------------------------------

		// gcTop.setStroke(lineColor);
		// gcTop.setLineWidth(1);

		for (int row = 0; row < cells.length; row++) {
			JORow joRow = sheet.getRows()[row];
			// gcLeft.strokeLine(0, joRow.y + 0.5, xStart, joRow.y + 0.5);
		}

		// ---------- stroke top & labels ----------------------------

		// gcTop.setFill(Color.BLACK);

		for (int col = 0; col < sheet.getColumns().length; col++) {
			JOColumn joColumn = sheet.getColumns()[col];
			String s = getColumnName(col);
			// gcTop.fillText(s, joColumn.x + joColumn.width / 2 - s.length() *
			// 7
			// / 2, 14);
			// gcTop.strokeLine(joColumn.x + 0.5, 0, joColumn.x + 0.5,
			// HEADER_HEIGHT - 2);
		}

		// GraphicsContext gc = canvas.getGraphicsContext2D();
		//
		// gc.setFill(Color.WHITE);
		// gc.fillRect(0, 0, 1000, 1000);

		for (int row = 0; row < cells.length; row++) {
			JORow joRow = sheet.getRows()[row];
			for (int col = 0; col < sheet.getColumns().length; col++) {
				JOColumn joColumn = sheet.getColumns()[col];

				JOCell joCell = cells[row][col];
				if (joCell != null) {
					if (joCell.getFillColorBg() != null) {
						// gc.setFill(joCell.getFillColorBg().getFx());
						// gc.fillRect(joColumn.x, joRow.y, joColumn.width + 4,
						// joRow.height);

						if (joCell.getBottomBorder() != null) {
							IColor color = joCell.getBottomBorderColor().get();
							// if (color != null) {
							// gc.setStroke(color.getFx());
							// }
							// gc.setLineWidth(1);
							//
							// gc.strokeLine(joCell.getXPixel() + xStart,
							// joRow.y
							// + joRow.height,
							// joCell.getXPixel() + joCell.getWidthPixel()
							// + xStart, joRow.y + joRow.height);

						}

						if (joCell.getTopBorder() != null) {
							IColor color = joCell.getTopBorderColor().get();
							// if (color != null) {
							// gc.setStroke(color.getFx());
							// }
							// gc.setLineWidth(1);
							//
							// gc.strokeLine(
							// joCell.getXPixel(),
							// joRow.y,
							// joCell.getXPixel() + joCell.getWidthPixel(),
							// joRow.y);

						}

						if (joCell.getLeftBorder() != null) {
							IColor color = joCell.getLeftBorderColor().get();
							// if (color != null) {
							// gc.setStroke(color.getFx());
							// }
							// gc.setLineWidth(1);
							//
							// gc.strokeLine(joCell.getXPixel(), joRow.y,
							// joCell.getXPixel(), joRow.y + joRow.height);

						}

						if (joCell.getRightBorder() != null) {
							IColor color = joCell.getRightBorderColor().get();
							// if (color != null) {
							// gc.setStroke(color.getFx());
							// }
							// gc.setLineWidth(1);
							//
							// gc.strokeLine(
							// joCell.getXPixel() + joCell.getWidthPixel(),
							// joRow.y,
							// joCell.getXPixel() + joCell.getWidthPixel(),
							// joRow.y + joRow.height);

						}

						if (joCell.getBorder() != null) {
							IColor color = ((JOBorder) joCell.getBorder()).getBorderColorBottom();
							// if (color != null) {
							// gc.setStroke(color.getFx());
							// }
							// gc.setLineWidth(1);
							//
							// gc.strokeRect(
							// joCell.getXPixel(),
							// joRow.y,
							// joCell.getXPixel() + joCell.getWidthPixel(),
							// joRow.y + joRow.height);

						}

					}
				}

			}

		}
		//
		// gc.setStroke(lineColor);
		// gc.setLineWidth(1);

		// if (editorFigure.isShowLines()) {
		// for (int row = 0; row < cells.length; row++) {
		// JORow joRow = sheet.getRows()[row];
		// gc.strokeLine(0, joRow.y, 2000, joRow.y);
		// }
		//
		// gc.setFill(Color.BLACK);
		//
		// for (int col = 0; col < sheet.getColumns().length; col++) {
		// JOColumn joColumn = sheet.getColumns()[col];
		// gc.strokeLine(joColumn.x, 0, joColumn.x, totalHeight);
		// }
		// }

	}

	private IColor getBackgroundColorColor(int row, int column) {

		IColor result = IColor.WHITE;
		XSSFRow poiRow = sheet.getPoiSheet().getRow(row);
		if (poiRow != null && poiRow.getRowStyle() != null) {
			XSSFColor color1 = poiRow.getRowStyle().getFillBackgroundColorColor();
			XSSFColor color2 = poiRow.getRowStyle().getFillBackgroundXSSFColor();

			// if (color1 != null || color2 != null) {
			//
			// }
		}

		JOCell cell = sheet.getCells()[row][column];
		if (cell == null) {
			if (poiRow == null) {
				poiRow = sheet.getPoiSheet().createRow(row);
			}
			XSSFCell poiCell = poiRow.createCell(column);
			poiCell.setCellType(Cell.CELL_TYPE_STRING);
			poiCell.setCellValue(""); //$NON-NLS-1$
			org.apache.poi.ss.usermodel.Font fontFind = getSheet().getWorkbook().getPoiWorkbook().findFont(
					org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_NORMAL, IndexedColors.BLACK.getIndex(), (short) 220,
					"Calibri", false, false, //$NON-NLS-1$
					org.apache.poi.ss.usermodel.Font.SS_NONE, org.apache.poi.ss.usermodel.Font.U_NONE);

			XSSFCellStyle style = poiCell.getCellStyle();
			style.setFont(fontFind);
			XSSFColor xSSFColor = new XSSFColor(new byte[] { (byte) 255, (byte) 255, (byte) 255 });
			style.setFillForegroundColor(xSSFColor);
			CTColor ctColor = xSSFColor.getCTColor();

		}

		return result;
	}

	// @Override
	// public void mouseDragged(MouseEvent me) {
	// int selRow = findSelectedRowIndex(me.y);
	// int selCol = findSelectedColumnIndex(me.x);
	// if (selectedAreas.size() == 0) {
	// selectedRow = selRow;
	// selectedColumn = selCol;
	// addCellToSelection(selRow, selCol);
	// }
	// JOVirtualCell cell = selectedAreas.get(0);
	// cell.hSpan = selCol - cell.columnIndex + 1;
	// cell.vSpan = selRow - cell.rowIndex + 1;
	// if (cell.hSpan < 0) {
	// cell.hSpan--;
	// }
	// if (cell.vSpan <= 0) {
	// cell.vSpan--;
	// }
	// repaint();
	// updateTopTools();
	// }

	// @Override
	// public void mouseEntered(MouseEvent me) {
	// entered = true;
	// me.consume();
	// setDefaultCursor();
	// }

	// @Override
	// public void mouseExited(MouseEvent me) {
	// entered = false;
	// me.consume();
	// setCursor(null);
	// }

	// @Override
	// public void mouseMoved(MouseEvent me) {
	// hoveredRow = findSelectedRowIndex(me.y);
	// hoveredColumn = findSelectedColumnIndex(me.x);
	//
	// JORow row = sheet.getRows()[hoveredRow];
	// JOColumn col = sheet.getColumns()[hoveredColumn];
	//
	// int bottom = row.y + row.height;
	// int right = col.x + col.width;
	//
	// int diffY = Math.abs(bottom - me.y);
	// int diffX = Math.abs(right - me.x);
	//
	// /
	//
	// if (diffX < 9 && diffY < 9) {
	// setCursor(Display.getDefault().getSystemCursor(SWT.CURSOR_CROSS));
	// } else {
	// if (getHoveredCell() != null
	// && getHoveredCell().getParagraph() != null
	// && getHoveredCell().getParagraph().getLayoutFigure() == getEditorFigure()
	// .getFocusOwner()
	// && getEditorFigure().getEditorCaret().isVisible()) {
	// setCursor(Display.getDefault().getSystemCursor(SWT.CURSOR_HAND));
	// } else {
	// setDefaultCursor();
	// }
	// }
	//
	// }

	private JOCell getSelectedCell() {
		return sheet.getCells()[selectedRow][selectedColumn];
	}

	private JOCell getHoveredCell() {
		return sheet.getCells()[hoveredRow][hoveredColumn];
	}

	/**
	 * 
	 */
	private void setDefaultCursor() {
		// setCursor(JOCursorProvider.get("images/cursor_spreadsheet_cross_16"));
		// //$NON-NLS-1$
	}

	public void updateTopTools() {
		// if (JOAbstractOfficePane.getInstance() instanceof JOOfficePane) {
		//
		// JOSpreadsheetTopTools topTools = (JOSpreadsheetTopTools)
		// ((JOOfficePane) JOAbstractOfficePane
		// .getInstance()).getTopTools();
		// topTools.getHeaderFigure().repaint();
		// }
	}

	/**
	 * 
	 */
	public void updateTopTools(JOCell cell) {
		// if (cell != null) {
		// String formula = cell.getFormulaString();
		// String formatedValue = cell.getFormatedValue();
		// String s;
		// if (formula != null) {
		// s = "=" + formula; //$NON-NLS-1$
		// } else {
		// s = formatedValue;
		// }
		// JOSpreadsheetTopTools tt = JOUtil.getSpreadsheetTopTools();
		// tt.getHeaderFigure().getTextField().setText(s);
		// getEditorFigure().getSpreadsheetFigure().updateTopTools();
		// } else {
		// JOSpreadsheetTopTools tt = JOUtil.getSpreadsheetTopTools();
		// tt.getHeaderFigure().getTextField().setText(""); //$NON-NLS-1$
		// }
	}

	// @Override
	// public void mousePressed(MouseEvent me) {
	// if (tableEntered(getBounds(), me)) {
	// me.consume();
	// }
	// doMousePressed(me.x, me.y);
	// getEditorFigure().setFocusOwner(null);
	// getEditorFigure().hideCaret();
	// }
	//
	// public void doMousePressed(int x, int y) {
	// getEditorFigure().updateFocusOwner();
	// selectedRow = findSelectedRowIndex(y);
	// selectedColumn = findSelectedColumnIndex(x);
	// selectedAreas.clear();
	// addCellToSelection(selectedRow, selectedColumn);
	// repaint();
	// updateTopTools(getSheet().getCells()[selectedRow][selectedColumn]);
	// updateTopTools();
	// }

	/**
	 * @param row
	 * @param col
	 */
	private void addCellToSelection(int row, int col) {
		JOVirtualCell cell = new JOVirtualCell();
		cell.columnIndex = col;
		cell.rowIndex = row;
		cell.hSpan = 1;
		cell.vSpan = 1;
		selectedAreas.add(cell);
	}

	// @Override
	// public void mouseReleased(MouseEvent me) {
	// // if (editorFigure.getSpreadsheetFigure().get.isEnt) {
	// // int x = r.x + calculateColumnPosition(actualColumn);
	// // int y = r.y + OOXMLUiConfig.DEFAULT_HEADER_HEIGHT;
	// // int width = columns[actualColumn];
	// // int height = r.height;
	// //
	// // columnFigure.setBounds(new Rectangle(x, y, width, height));
	// // columnFigure.setVisible(true);
	// // } else {
	// // columnFigure.setVisible(false);
	// // }
	// //
	// // if (rowHeaderEntered) {
	// // int y = r.y + calculateRowPosition(actualRow);
	// // int x = r.x + OOXMLUiConfig.FIRST_COLUMNS_WIDTH;
	// // int width = r.width;
	// // int height = rows[actualRow];
	// // rowFigure.setBounds(new Rectangle(x, y, width, height));
	// // rowFigure.setVisible(true);
	// // } else {
	// // rowFigure.setVisible(false);
	// // }
	// }

	// @SuppressWarnings("unused")
	// @Override
	// public void mouseDoubleClicked(MouseEvent me) {
	// selectedRow = findSelectedRowIndex(me.y);
	// selectedColumn = findSelectedColumnIndex(me.x);
	//
	// JOCell cell = sheet.getCells()[selectedRow][selectedColumn];
	// if (cell == null) {
	// XSSFRow poiRow = sheet.getPoiSheet().getRow(selectedRow);
	// if (poiRow == null) {
	// poiRow = sheet.getPoiSheet().createRow(selectedRow);
	// }
	// XSSFCell poiCell = poiRow.createCell(selectedColumn);
	// poiCell.setCellType(Cell.CELL_TYPE_STRING);
	// poiCell.setCellValue(""); //$NON-NLS-1$
	// org.apache.poi.ss.usermodel.Font fontFind = getSheet()
	// .getWorkbook()
	// .getPoiWorkbook()
	// .findFont(
	// org.apache.poi.ss.usermodel.Font.BOLDWEIGHT_NORMAL,
	// IndexedColors.BLACK.getIndex(), (short) 220,
	// "Calibri", false, false, //$NON-NLS-1$
	// org.apache.poi.ss.usermodel.Font.SS_NONE,
	// org.apache.poi.ss.usermodel.Font.U_NONE);
	//
	// XSSFCellStyle style = poiCell.getCellStyle();
	// style.setFont(fontFind);
	// XSSFColor xSSFColor = new XSSFColor(new byte[] { (byte) 255,
	// (byte) 255, (byte) 255 });
	// style.setFillForegroundColor(xSSFColor);
	// CTColor ctColor = xSSFColor.getCTColor();
	//
	// JOCell newCell = new JOCell(getEditorFigure().getDocument(),
	// poiCell, null, null, poiCell.getCTCell(), false,
	// selectedRow, selectedColumn, poiRow, getSheet());
	//
	// newCell.getParagraph().getLayoutFigure().repaint();
	// getSheet().getCells()[selectedRow][selectedColumn] = newCell;
	// add(newCell.getParagraph().getLayoutFigure());
	//
	// newCell.setForegroundColor(ColorConstants.black);
	// // newCell.setFillColorFg(ColorConstants.black);
	// newCell.getParagraph().getStyle().foreground = ColorConstants.black;
	// getEditorFigure().getDocument().setDirty(true);
	// refresh();
	// newCell.getParagraph().getLayoutFigure().activate();
	// }
	//
	// setCursor(Display.getDefault().getSystemCursor(SWT.CURSOR_HAND));
	//
	// }

	public void setSelectedColumn(int selectedColumn) {
		this.selectedColumn = selectedColumn;
	}

	public void setSelectedRow(int selectedRow) {
		this.selectedRow = selectedRow;
	}

	public JOEditorFigure getEditorFigure() {
		return editorFigure;
	}

	public JOSheetPart getSheet() {
		return sheet;
	}

	public double getTotalWidth() {
		return totalWidth;
	}

	public double getTotalHeight() {
		return totalHeight;
	}

	public int getSelectedColumn() {
		return selectedColumn;
	}

	public int getSelectedRow() {
		return selectedRow;
	}

	public List<JOVirtualCell> getSelectedAreas() {
		return selectedAreas;
	}

	private String getColumnName(int index) {
		int count = 26;
		int x1 = index % count;
		int x2 = index / count % (count);
		int x3 = index / count / count % (count);
		if (index < count) {
			return calculateColumnName(x1);
		} else if (index < (count * count)) {
			return calculateColumnName(x2) + calculateColumnName(x1);
		} else if (index < (count * count * count)) {
			return calculateColumnName(x3) + calculateColumnName(x2) + calculateColumnName(x1);
		}
		return "XXX"; //$NON-NLS-1$
	}

	private String calculateColumnName(int x) {
		switch (x) {
		case 0:
			return "A"; //$NON-NLS-1$
		case 1:
			return "B"; //$NON-NLS-1$
		case 2:
			return "C"; //$NON-NLS-1$
		case 3:
			return "D"; //$NON-NLS-1$
		case 4:
			return "E"; //$NON-NLS-1$
		case 5:
			return "F"; //$NON-NLS-1$
		case 6:
			return "G"; //$NON-NLS-1$
		case 7:
			return "H"; //$NON-NLS-1$
		case 8:
			return "I"; //$NON-NLS-1$
		case 9:
			return "J"; //$NON-NLS-1$
		case 10:
			return "K"; //$NON-NLS-1$
		case 11:
			return "L"; //$NON-NLS-1$
		case 12:
			return "M"; //$NON-NLS-1$
		case 13:
			return "N"; //$NON-NLS-1$
		case 14:
			return "O"; //$NON-NLS-1$
		case 15:
			return "P"; //$NON-NLS-1$
		case 16:
			return "Q"; //$NON-NLS-1$
		case 17:
			return "R"; //$NON-NLS-1$
		case 18:
			return "S"; //$NON-NLS-1$
		case 19:
			return "T"; //$NON-NLS-1$
		case 20:
			return "U"; //$NON-NLS-1$
		case 21:
			return "V"; //$NON-NLS-1$
		case 22:
			return "W"; //$NON-NLS-1$
		case 23:
			return "X"; //$NON-NLS-1$
		case 24:
			return "Y"; //$NON-NLS-1$
		case 25:
			return "Z"; //$NON-NLS-1$

		default:
			return "X"; // cannot happen //$NON-NLS-1$
		}
	}
}
