package org.eclipse.rcpl;

import java.util.List;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;

/**
 * @author ramin
 *
 */
public interface ITableCell {

	boolean hasBorders();

	double getLeftBorderWidthPixel();

	double getRightBorderWidthPixel();

	double getTopBorderWidthPixel();

	double getBottomBorderWidthPixel();

	IColorProperty getFillColor();

	IColorProperty getForegroundColor();

	ITable getTable();

	int getvMerge();

	int gethMerge();

	int getvSpan();

	void setvMerge(int merge);

	void setvSpan(int span);

	void sethMerge(int merge);

	int getTableCount();

	int getParagraphCount();

	ITable getTable(int index);

	IParagraph getParagraph(int index);

	int getSpan();

	double getHeightPixel();

	void setHeightPixel(double height);

	double getWidthPixel();

	List<IParagraph> getParagraphs();

	void setPageBreakBefore(boolean brea);

	double getXPixel();

	double getYPixel();

	void setXPixel(double x);

	void setYPixel(double y);

	double getRowHeight();

	CTTc getCtTc();

	void setRowHeight(double height);

}
