package org.eclipse.rcpl;

import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

/**
 * @author ramin
 *
 */
public interface IStyle {

	IEmuProperty2 getCellMarginLeft();

	void setCellMarginLeft(IEmuProperty2 cellMarginLeft);;

	void setCellMarginRight(IEmuProperty2 cellMarginRight);

	IEmuProperty2 getCellMarginTop();

	void setCellMarginTop(IEmuProperty2 cellMarginTop);

	IEmuProperty2 getCellMarginBottom();

	void setCellMarginBottom(IEmuProperty2 cellMarginBottom);

	double getCellMarginLeftPixel();

	double getCellMarginRightPixel();

	double getCellMarginTopPixel();

	double getCellMarginBottomPixel();

	IStyle copy();

	void copyAttributesTo(IStyle dest0);

	IColor getBackground();

	IStyle getBasedOnStyle();

	IBorder getBorder();

	CTR getCtr();

	IDrawing getDrawing();

	IFont getFont();

	IColor getForeGround();

	String getHyperText();

	String getId();

	IImage getImage();

	IJOProperty getIndent();

	CTOnOff getKeepNext();

	int getLength();

	String getName();

	IStyle getNextStyle();

	IJOProperty getPageBreakBefore();

	EnShading getShading();

	IProperty2 getSpacingAfter();

	IProperty2 getSpacingBefore();

	IProperty2 getSpacingLine();

	int getStart();

	Object getTabs();

	IJOProperty getTextAlignment();

	EStyleType getType();

	boolean isBold();

	boolean isItalic();

	boolean isStrikeThrough();

	boolean isSubScript();

	boolean isSuperScript();

	boolean isTemplateStyle();

	boolean isUnderline();

	void setBackground(IColor color);

	void setBasedOnStyle(IStyle basedOnStyle);

	void setBold(boolean bold);

	void setBorder(IBorder border);

	void setCtr(CTR ctr);

	void setDrawing(IDrawing drawing);

	void setFont(IFont font);

	void setFonts(CTFonts ctFonts);

	void setForeground(IColor color);

	void setHeight(double height);

	void setHyperText(String hyperText);

	void setId(String id);

	void setImage(IImage image);

	void setImage(IImage image, double width, double height);

	void setIndent(IJOProperty indent);

	void setItalic(boolean italic);

	void setKeepNext(CTOnOff keepNext);

	void setLength(int length);

	void setPageBreakBefore(IJOProperty pageBreakBefore);

	void setShading(EnShading shading);

	void setSpacingAfter(IProperty2 spacingAfter);

	void setSpacingLine(IProperty2 spacingAfter);

	void setSpacingBefore(IProperty2 spacingBefore);

	void setStart(int start);

	void setTabs(Object tabs);

	void setTemplateStyle();

	void setTextAlignment(IJOProperty alignment);

	void setUnderline(boolean underline);

	void updateFont();
}
