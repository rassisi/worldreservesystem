package org.eclipse.rcpl;

import javafx.scene.text.Font;

public interface IFont {

	String getName();

	double getHeight();

	int getStyle();

	void setStyle(int style);

	Font getFx();

	void setHeight(double height);

	void setBold(boolean bold);

	void setName(String fontName);

	boolean isBold();

	boolean isItalic();

	boolean isUnderline();

	IFont copy();
}
