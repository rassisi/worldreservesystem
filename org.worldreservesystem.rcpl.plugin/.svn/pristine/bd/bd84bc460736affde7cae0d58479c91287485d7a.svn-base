/******************************************************************************
 * Copyright (c) 2007-2008 APPLIED SOFT Ltd
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    APPLIED Soft Ltd. - initial API and implementation 
 *    Ramin Assisi
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.fx.figures;

import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.IColorProperty;
import org.eclipse.rcpl.IDraggable;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IResizable;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.ITableCell;
import org.eclipse.rcpl.ITableFigure;
import org.eclipse.rcpl.LayoutData;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;

import com.joffice.rcpl.plugin.office.internal.model.word.JOTable;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author ramin
 * 
 */
public class JOFXTableFigure extends JOFXAbstractFigure implements IDraggable, IResizable, ITableFigure {

	private Canvas canvas;

	private Group paragraphGroup;

	/**
	 * @param table
	 */
	public JOFXTableFigure(ITable table, double width) {
		super(table);
		canvas = new Canvas(50, 50);
		canvas.setLayoutX(0);
		canvas.setLayoutY(0);
		canvas.setVisible(true);
		paragraphGroup = new Group();
		getBackgroundGroup().getChildren().addAll(canvas, paragraphGroup);
		setHeight(table.getHeightPixel());
		setWidth(table.getWidthPixel());
		loadCells();
		refresh();
	}

	/**
	 * @param startRow
	 */
	@Override
	public void loadCells() {

		JOTable table = getLayoutObject();
		ITableCell[][] cells = table.getCells();

		for (int row = 0; row < cells.length; row++) {
			ITableCell[] columns = cells[row];
			for (int col = 0; col < columns.length; col++) {
				ITableCell cell = columns[col];
				if (cell != null) {
					try {
						for (int i = 0; i < cell.getParagraphCount(); i++) {
							IParagraph paragraph = cell.getParagraph(i);
							if (paragraph.isPageBreakBefore()) {
								// page break in the middle of the table
								if (row > 0) {
									return;
								}
								cell.setPageBreakBefore(true);
							}
							ILayoutFigure fig;

							fig = paragraph.getLayoutFigure();
							getParagraphGroup().getChildren().add(fig.getPane());
						}

					} catch (Exception ex) {
						RCPLModel.logError(ex);
					}

				} else {
					RCPLModel.logError("Cell==null");
				}
			}
		}
	}

	// private void drawTableCellBorders() {
	//
	// ITableCell[][] cells = getTable().getCells();
	// GraphicsContext graphics = canvas.getGraphicsContext2D();
	//
	// graphics.setLineWidth(0.5);
	// graphics.setStroke(Color.BLACK);
	// double y = 0.5;
	//
	// double tableHeight = getLayoutObject().getHeightPixel();
	// double tableWidth = getLayoutObject().getWidthPixel();
	//
	// // ---------- HORIZONTAL LINES ------------------
	//
	// for (int row = 0; row < cells.length; row++) {
	// ITableCell cell = cells[row][0];
	// if (cell != null) {
	// if (row == 0 && getLayoutObject().getTopBorderWidth() > 0) {
	// drawLine(graphics, 0, y, tableWidth, y);
	// } else if (row == cells.length - 1 &&
	// getLayoutObject().getBottomBorderWidth() > 0) {
	// if (getLayoutObject().getInsideVBorderWidth() > 0) {
	// drawLine(graphics, 0, y, tableWidth, y);
	// }
	// drawLine(graphics, 0, tableHeight, tableWidth, tableHeight);
	// } else if (getLayoutObject().getInsideVBorderWidth() > 0) {
	// drawLine(graphics, 0, y, tableWidth, y);
	// }
	// y += cell.getRowHeight();
	// }
	// }
	//
	// // ---------- VERTICAL LINES -----------------------------------
	//
	// double x = 0.5;
	// for (int col = 0; col < cells[0].length; col++) {
	// ITableCell cell = cells[0][col];
	// if (cell != null) {
	// if (col == 0) {
	// if (getLayoutObject().getLeftBorderWidth() > 0) {
	// drawLine(graphics, x, 0, x, tableHeight);
	// }
	// } else if (col == cells[0].length - 1) {
	// if (getLayoutObject().getInsideHBorderWidth() > 0) {
	// drawLine(graphics, x, 0, x, tableHeight);
	// }
	// if (getLayoutObject().getRightBorderWidth() > 0) {
	// drawLine(graphics, getWidth() - 1.5, 0, getWidth() - 1.5, tableHeight);
	// }
	// } else {
	// if (getLayoutObject().getInsideHBorderWidth() > 0) {
	// drawLine(graphics, x, 0, x, tableHeight);
	// }
	// }
	// x += cell.getWidthPixel();
	// }
	// }
	// }

	private void drawCell(ITableCell cell, int row, int col, int numberOfRows, int numberOfCols) {

		GraphicsContext graphics = canvas.getGraphicsContext2D();

		double x1 = cell.getXPixel();
		double y1 = cell.getYPixel();

		double width = cell.getWidthPixel();
		double height = cell.getRowHeight();

		double topBorderWidth = cell.getTopBorderWidthPixel();
		double bottomBorderWidth = cell.getBottomBorderWidthPixel();
		double leftBorderWidth = cell.getLeftBorderWidthPixel();
		double rightBorderWidth = cell.getRightBorderWidthPixel();

		IColorProperty fillColor = cell.getFillColor();
		if (fillColor != null) {
			graphics.setFill(fillColor.get().getFx());
			graphics.fillRect(x1, y1, width, height);
		}

		double w = width;

		// ---------- HORIZONTAL LINES -------------------

		if (!cell.hasBorders()) {
			if (row == 0) {
				if (getLayoutObject().getTopBorderWidth() > 0) {
					if (cell.getvMerge() == 0 || cell.getvMerge() == 1) {
						drawLine(graphics, x1, y1, x1 + w, y1);
					}
				}
			}
			if (row == numberOfRows - 1) {
				if (getLayoutObject().getInsideVBorderWidth() > 0) {
					drawLine(graphics, x1, y1, x1 + w, y1);
				}
				if (getLayoutObject().getBottomBorderWidth() > 0) {
					if (cell.getvMerge() == 0 || cell.getvMerge() == 1) {
						drawLine(graphics, x1, y1 + height - 1, x1 + w, y1 + height - 1);
					}
				}
			}

			if (row > 0) {
				if (getLayoutObject().getInsideVBorderWidth() > 0) {
					drawLine(graphics, x1, y1, x1 + w, y1);
				}
			}

			if (col == 0) {
				if (getLayoutObject().getLeftBorderWidth() > 0) {
					if (cell.gethMerge() == 0 || cell.gethMerge() == 3) {
						drawLine(graphics, x1, y1, x1, y1 + height);
					}
				}
			} else if (col == numberOfCols - 1) {
				if (getLayoutObject().getRightBorderWidth() > 0) {
					drawLine(graphics, x1 + w, y1, x1 + w, y1 + height);
				}
			}

			if (col > 0) {
				if (getLayoutObject().getInsideHBorderWidth() > 0) {
					drawLine(graphics, x1, y1, x1, y1 + height);
				}
			}

		} else {
			if (topBorderWidth > 0) {
				graphics.setLineWidth(topBorderWidth);
				drawLine(graphics, x1, y1, x1 + w, y1);
			}
			if (bottomBorderWidth > 0) {
				graphics.setLineWidth(bottomBorderWidth);
				drawLine(graphics, x1, y1 + height, x1 + w, y1 + height);
			}

			if (leftBorderWidth > 0) {
				graphics.setLineWidth(leftBorderWidth);
				drawLine(graphics, x1, y1, x1, y1 + height);
			}

			if (rightBorderWidth > 0) {
				graphics.setLineWidth(rightBorderWidth);
				drawLine(graphics, x1 + w, y1, x1 + w, y1 + height);
			}
		}

	}

	private void drawLine(GraphicsContext graphics, double x1, double y1, double x2, double y2) {
		graphics.strokeLine(x1, y1, x2, y2);

	}

	/**
	 * @param graphics
	 * @param border
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	private boolean drawBorder(GraphicsContext graphics, CTBorder bord, double x1, double y1, double x2, double y2) {
		if (getTable().isTblLoookAllBorders()) {
			graphics.setFill(Color.BLACK);
			drawLine(graphics, x1, y1, x2, y2);
		}
		if (bord != null) {
			Object color = bord.getColor();
			if (color instanceof byte[]) {
				graphics.setFill(Rcpl.colorProvider().get((byte[]) color).getFx());
			}
			STThemeColor.Enum themeColor = bord.getThemeColor();
			if (themeColor != null) {
				// TODO: color mappintg
				graphics.setFill(Rcpl.colorProvider().getThemeColor(null, themeColor).getFx());
			}
			if (bord.getSz().longValue() > 0) {
				drawLine(graphics, x1, y1, x2, y2);
			}
			return true;
		}
		return false;
	}

	@Override
	public void refresh() {
		layoutCells();
		drawCells();
		// drawTableCellBorders();
	}

	private void drawCells() {
		GraphicsContext graphics = canvas.getGraphicsContext2D();

		double tableHeight = getLayoutObject().getHeightPixel();
		double tableWidth = getLayoutObject().getWidthPixel();
		canvas.setWidth(tableWidth);
		canvas.setHeight(tableHeight + 1);
		graphics.setFill(Color.WHITE);
		graphics.fillRect(0, 0, tableWidth, tableHeight);

		graphics.setStroke(Color.BLACK);
		graphics.setLineWidth(1);

		JOTable table = getLayoutObject();
		ITableCell[][] cells = table.getCells();

		for (int row = 0; row < cells.length; row++) {
			ITableCell[] columns = cells[row];
			for (int col = 0; col < columns.length; col++) {
				ITableCell cell = columns[col];
				if (cell != null) {
					drawCell(cell, row, col, cells.length, columns.length);
				}
			}
		}
	}

	private void layoutCells() {

		double x = 0; // getX2();
		double y = 0; // getY2();

		getTable().setTotalTableHeight(0);

		JOTable table = getLayoutObject();
		double marginLeft = 0;
		double marginTop = 0;
		double marginBottom = 0;
		double marginRight = 0;

		if (table.getTableStyle() != null) {
			marginLeft = table.getTableStyle().getCellMarginLeftPixel();
			marginTop = table.getTableStyle().getCellMarginTopPixel();
			marginBottom = table.getTableStyle().getCellMarginBottomPixel();
			marginRight = table.getTableStyle().getCellMarginRightPixel();
		}

		ITableCell[][] cells = table.getCells();
		double y1 = y + table.getTableLineWidth();

		for (int row = 0; row < cells.length; row++) {
			ITableCell[] columns = cells[row];
			double x1 = x + table.getTableLineWidth();
			double ind = 0;
			if (table.getIndent() != null) {
				ind = table.getLeftIndentPixel();
			}
			y1 += marginTop;
			x1 += ind;
			x1 += marginLeft;

			double rowHeight = 0;
			for (int col = 0; col < columns.length; col++) {
				ITableCell cell = columns[col];
				if (cell != null) {
					int parY = 0;

					// ---------- tables in cell -------------------------------

					if (cell.getTableCount() > 0) {
						for (int i = 0; i < cell.getTableCount(); i++) {
							ITable t = cell.getTable(i);
							parY += t.getSpacingBeforePixel();
							ILayoutFigure f = t.getLayoutFigure();
							f.setLocation(x1, y1 + parY);
							f.setWidth(t.getWidthPixel());
							f.setHeight(t.getHeightPixel());

							parY += t.getHeightPixel();
							parY += t.getSpacingAfterPixel();
							x1 += cell.getWidthPixel();
							rowHeight = Math.max(cell.getHeightPixel(), rowHeight);
							if (cell.getSpan() > 1) {
								col += (cell.getSpan() - 1);
							}
						}

						// ---------- paragraph in cell ------------------------

					} else {
						for (int i = 0; i < cell.getParagraphCount(); i++) {
							IParagraph p = cell.getParagraph(i);
							double h = 0.0;
							if (i > 0) {
								h += p.getSpacingBeforePixel();
							}
							ILayoutFigure fig;

							fig = p.getLayoutFigure();
							fig.setLocation(x1 + p.getCellMarginLeft(), y1 + parY);
							fig.setWidth(p.getWidthPixel());
							fig.setHeight(p.getHeightPixel());
							h += p.getHeightPixel();

							if (i < cell.getParagraphCount() - 1) {
								h += p.getSpacingAfterPixel();
							}
							cell.setHeightPixel(h);
							// h = Math.max(h, cell.getHeightPixel());
							rowHeight = Math.max(h, rowHeight);
							if (cell.getSpan() > 1) {
								col += (cell.getSpan() - 1);
							}
							parY += h;
						}

						cell.setXPixel(x1 - marginLeft);
						x1 += cell.getWidthPixel();
					}

				} else {
					RCPLModel.logError("Cell is null!"); //$NON-NLS-1$
				}

				rowHeight += marginTop + marginBottom;

				if (cell != null) {
					cell.setYPixel(y1);
					cell.setRowHeight(rowHeight);
				}
			}
			y1 += rowHeight;

			getTable().setTotalTableHeight(getTable().getTotalTableHeight() + rowHeight);

		}

		double newHeight = getTable().getTotalTableHeight() + 1;
		getTable().setTotalTableHeight(newHeight);
		getTable().setHeightPixel(newHeight);
		setHeight(newHeight);

	}

	@Override
	public double getOverflowHeight(LayoutData data) {
		// Rectangle r = getBounds();
		// double overflow = super.getOverflowHeight(data);
		// JOTable table = (JOTable) getLayoutObject();
		// if (overflow > 0) {
		// int y1 = r.y + tableLineWidth;
		// for (int row = 0; row < table.getCells().length; row++) {
		// JOTableCell[] columns = table.getCells()[row];
		// double bottomRow = y1 + columns[0].getHeightPixel();
		// if (bottomRow > overflow) {
		// overflow = y1 + 1;
		// break;
		// }
		// y1 += bottomRow;
		// }
		// }
		// return overflow;
		return 0;
	}

	/**
	 * @return
	 */
	public JOTable getTable() {
		return getLayoutObject();
	}

	boolean isOverflowPart() {
		return false;
	}

	public void setAlignment(AlignType type) {
		switch (type) {
		case LEFT:
			break;
		case BOTH:
			break;
		case BOTTOM:
			break;
		case CENTER:
			// textFlow.setTextAlignment(TextAlignment.CENTER);
			break;
		case CENTER_SELECTION:
			break;
		case DISTRIBUTE:
			break;
		case FILL:
			break;
		case GENERAL:
			break;
		case HIGH_KASHIDA:
			break;
		case JUST:
			// textFlow.setTextAlignment(TextAlignment.JUSTIFY);
			break;
		case JUST_LOW:
			break;
		case LOW_KASHIDA:
			break;
		case MEDIUM_KASHIDA:
			break;
		case NUM_TAB:
			break;
		case RIGHT:
			// textFlow.setTextAlignment(TextAlignment.RIGHT);
			break;
		case THAI_DISTRIBUTE:
			break;
		case TOP:
			break;
		default:
			break;
		}

	}

	@Override
	public void setWidth(double w) {
		super.setWidth(w);
		if (canvas != null) {
			canvas.setWidth(w);
		}
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		if (canvas != null) {
			canvas.setHeight(height);
		}
	}

	@Override
	public Group getParagraphGroup() {
		return paragraphGroup;
	}

	@Override
	public JOTable getLayoutObject() {
		return (JOTable) super.getLayoutObject();
	}
}
