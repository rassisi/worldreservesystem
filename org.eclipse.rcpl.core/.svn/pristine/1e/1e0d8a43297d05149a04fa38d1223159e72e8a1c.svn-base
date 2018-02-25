package org.eclipse.rcpl;

import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.model.IImage;

import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 *
 */
public interface ILayoutObject {

	IProperty2 getInsets();

	void deActivate();

	void setVAnchorObject(ILayoutObject anchorObject);

	void setHAnchorObject(ILayoutObject anchorObject);

	ILayoutObject getNextRootObject();

	void setHeightPixel(double height);

	boolean commit();

	ILayoutFigure createLayoutFigure();

	boolean dispose();

	ILayoutObject getVAnchorObject();

	ILayoutObject getHAnchorObject();

	IBorder getBorder();

	List<ILayoutObject> getChildList();

	ILayoutObject[] getChildren();

	String getDisplayName();

	IDocument getDocument();

	ILayoutAnchor getHAnchor();

	IProperty2 getHeight();

	double getHeightOverflow();

	double getHeightPixel();

	IImage getImage();

	IJOProperty getIndent();

	int getIndex();

	Rectangle2D getLayoutBounds();

	ILayoutFigure getLayoutFigure();

	int getLayoutIndex();

	double getLeftMargin();

	double getBottomMargin();

	double getRightMargin();

	IParagraph getNextRootParagraph();

	IPage getPage();

	ILayoutObject getParent();

	ILayoutObject getPreviousRootObject();

	IParagraph getPreviousRootParagraph();

	ILayoutObject getRootObject();

	int getRootObjectIndex();

	double getSavedZOrder();

	ISection getSection();

	IProperty2 getSize();

	double getSpacingAfterPixel();

	double getSpacingBeforePixel();

	IStyle getStyle();

	double getTopMargin();

	ILayoutAnchor getVAnchor();

	IProperty2 getWidth();

	double getWidthPixel();

	EnLayoutAlignment getxAlign();

	XmlObject getXmlObject();

	double getXPixel();

	EnLayoutAlignment getyAlign();

	double getYPixel();

	double getZOrder();

	boolean isBehindDoc();

	boolean isDirtyContent();

	boolean isDirtyLayout();

	boolean isPageBreakAfter();

	boolean isRealPageBreakAfterAndNoSectionBreak();

	boolean isRootObject();

	java.util.Iterator<ILayoutObject> iterator();

	void remove(ILayoutObject lo);

	void removeChildren();

	void setBorderColor(IColor color);

	void setDirtyContent(boolean dirty);

	void setDirtyLayout(boolean dirty);

	void setHeightOverflow(double heightOverflow);

	void setLayoutBounds(Rectangle2D layoutBounds);

	void setLayoutFigure(ILayoutFigure f);

	void setPage(IPage page);

	void setParent(ILayoutObject lo);

	void setRootObject(boolean root);

	void setWidthPixel(double width);

	void setXmlIndex(int index);

	void setZOrder(double order);

	void setZOrderBehindDoc(boolean behindDoc);

	void update();

	void updateFromXml();

	int getRootIndex();

	void boundsChanged2(Rectangle2D newBounds);

}
