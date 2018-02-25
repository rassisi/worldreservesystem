package com.joffice.rcpl.plugin.office.internal.model.word;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IColorProperty;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEmuProperty2;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.ITableCell;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding2.JOColorProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20Property;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20ThPointProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuPointProperty;

/**
 * @author ramin
 *
 */
public class JOTableCell extends JOObject implements ITableCell {

	// ----------- new databinding 2 -------------------------------------------

	private IColorProperty fillColor;
	private IColorProperty foregroundColor;

	private boolean hasBorders;

	IEmuProperty2 leftBorderWidth;
	IEmuProperty2 rightBorderWidth;
	IEmuProperty2 topBorderWidth;
	IEmuProperty2 bottomBorderWidth;

	// -------------------------------------------------------------------------

	private List<IParagraph> paragraphs;
	private List<JOTable> tables;

	private boolean pageBreakBefore = false;

	private int row;

	private int column;

	@SuppressWarnings("unused")
	private IColor shadeColor;

	private int vMerge = 0;

	private int hMerge = 0;

	private CTTc ctTc;

	private int vSpan = 0;

	private double rowHeight;

	@Override
	public CTTc getCtTc() {
		return ctTc;
	}

	@Override
	public void setWidthPixel(double width) {
		if (span > 1) {
			width -= 1; // span;
		}
		super.setWidthPixel(width);
	}

	/**
	 * @param document
	 * @param table
	 * @param ctTc
	 * @param row
	 * @param column
	 */
	public JOTableCell(IDocument document, JOTable table, CTTc ctTc, int row, int column) {
		super(document, table, null, ctTc, true, false, -1);
		this.table = table;
		this.ctTc = ctTc;
		this.row = row;
		this.column = column;
		updateFromXml();
	}

	private int span = 1;

	@Override
	public int getSpan() {
		return span;
	}

	public void setSpan(int span) {
		this.span = span;
	}

	private JOTable table;

	@Override
	public JOTable getTable() {
		return table;
	}

	public void addParagraph(IParagraph paragraph) {
		getParagraphs().add(paragraph);
	}

	public void removeParagraph(JOParagraph paragraph) {
		getParagraphs().remove(paragraph);
	}

	@Override
	public int getParagraphCount() {
		if (paragraphs == null) {
			return 0;
		}
		return paragraphs.size();
	}

	@Override
	public IParagraph getParagraph(int index) {
		if (paragraphs == null) {
			return null;
		}
		return paragraphs.get(index);
	}

	@Override
	public List<IParagraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new ArrayList<IParagraph>();
		}
		return paragraphs;
	}

	public void addTable(JOTable table) {
		getTables().add(table);
	}

	public void removeTable(JOTable table) {
		getTables().remove(table);
	}

	@Override
	public int getTableCount() {
		if (tables == null) {
			return 0;
		}
		return tables.size();
	}

	@Override
	public JOTable getTable(int index) {
		if (tables == null) {
			return null;
		}
		return tables.get(index);
	}

	private List<JOTable> getTables() {
		if (tables == null) {
			tables = new ArrayList<JOTable>();
		}
		return tables;
	}

	@Override
	public boolean isPageBreakBefore() {
		return pageBreakBefore;
	}

	@Override
	public void setPageBreakBefore(boolean pageBreakBefore) {
		this.pageBreakBefore = pageBreakBefore;
	}

	@Override
	public boolean dispose() {
		return false;
	}

	@Override
	public String getDisplayName() {
		return "TableCell";
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		return null;
	}

	@SuppressWarnings("unused")
	@Override
	public void updateFromXml() {
		CTTcPr tcPr = ctTc.getTcPr();

		if (tcPr != null) {
			CTShd shd = tcPr.getShd();
			if (shd != null) {
				if (shd.getColor() != null) {
					foregroundColor = new JOColorProperty(this, tcPr, shd, "Color", null, false, null); //$NON-NLS-1$
				} else if (shd.getThemeColor() != null) {
					foregroundColor = new JOColorProperty(this, tcPr, shd, "ThemeColor", null, false, null); //$NON-NLS-1$
				}

				if (shd.getFill() != null) {
					fillColor = new JOColorProperty(this, tcPr, shd, "Fill", null, true, null); //$NON-NLS-1$
					fillColor.get();
				} else if (shd.getThemeFill() != null) {
					fillColor = new JOColorProperty(this, tcPr, shd, "ThemeFill", null, true, null); //$NON-NLS-1$

				}
				Object themeFillShade = shd.getThemeFillShade();
				Object themeFillTint = shd.getThemeFillTint();
				Object themeShade = shd.getThemeShade();
				Object themeTint = shd.getThemeTint();

			}
			if (ctTc.getTcPr().getTcBorders() != null) {
				hasBorders = true;
				CTTcBorders ctBorders = ctTc.getTcPr().getTcBorders();
				bottomBorderWidth = new JOEmu20ThPointProperty(null, ctBorders, ctBorders.getBottom(), "Sz",
						new String[] { "bottomBorderWidth" }, EValueType.MEASUREMENT);
				topBorderWidth = new JOEmu20ThPointProperty(null, ctBorders, ctBorders.getTop(), "Sz",
						new String[] { "topBorderWidth" }, EValueType.MEASUREMENT);
				leftBorderWidth = new JOEmu20ThPointProperty(null, ctBorders, ctBorders.getLeft(), "Sz",
						new String[] { "leftBorderWidth" }, EValueType.MEASUREMENT);
				rightBorderWidth = new JOEmu20ThPointProperty(null, ctBorders, ctBorders.getRight(), "Sz",
						new String[] { "rightBorderWidth" }, EValueType.MEASUREMENT);

			}
		}

	}

	@Override
	public IColorProperty getFillColor() {
		return fillColor;
	}

	@Override
	public IColorProperty getForegroundColor() {
		return foregroundColor;
	}

	@Override
	public int getvMerge() {
		return vMerge;
	}

	@Override
	public void setvMerge(int vMerge) {
		this.vMerge = vMerge;
	}

	@Override
	public int gethMerge() {
		return hMerge;
	}

	@Override
	public void sethMerge(int hMerge) {
		this.hMerge = hMerge;
	}

	@Override
	public int getvSpan() {
		return vSpan;
	}

	@Override
	public void setvSpan(int vSpan) {
		this.vSpan = vSpan;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public double getRowHeight() {
		return rowHeight;
	}

	@Override
	public void setRowHeight(double rowHeight) {
		this.rowHeight = rowHeight;
	}

	@Override
	public IImage getImage() {
		return null;
	}

	public IEmuProperty2 getLeftBorderWidth() {
		return leftBorderWidth;
	}

	public void setLeftBorderWidth(IEmuProperty2 leftBorderWidth) {
		this.leftBorderWidth = leftBorderWidth;
	}

	public IEmuProperty2 getRightBorderWidth() {
		return rightBorderWidth;
	}

	public void setRightBorderWidth(IEmuProperty2 rightBorderWidth) {
		this.rightBorderWidth = rightBorderWidth;
	}

	public IEmuProperty2 getTopBorderWidth() {
		return topBorderWidth;
	}

	public void setTopBorderWidth(IEmuProperty2 topBorderWidth) {
		this.topBorderWidth = topBorderWidth;
	}

	public IEmuProperty2 getBottomBorderWidth() {
		return bottomBorderWidth;
	}

	public void setBottomBorderWidth(IEmuProperty2 bottomBorderWidth) {
		this.bottomBorderWidth = bottomBorderWidth;
	}

	@Override
	public double getLeftBorderWidthPixel() {
		if (leftBorderWidth != null) {
			return leftBorderWidth.get().toPixel();
		}
		return 0;
	}

	@Override
	public double getRightBorderWidthPixel() {
		if (rightBorderWidth != null) {
			return rightBorderWidth.get().toPixel();
		}

		return 0;
	}

	@Override
	public double getTopBorderWidthPixel() {
		if (topBorderWidth != null) {
			return topBorderWidth.get().toPixel();
		}
		return 0;
	}

	@Override
	public double getBottomBorderWidthPixel() {
		if (bottomBorderWidth != null) {
			return bottomBorderWidth.get().toPixel();
		}
		return 0;
	}

	@Override
	public boolean hasBorders() {
		return hasBorders;
	}
}
