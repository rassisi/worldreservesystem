/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl;

import org.eclipse.rcpl.model.RCPLModel;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * @author ramin
 *
 */
public class RcplFont implements IFont {

	private String name;

	private double height;

	private int fontStyle;

	private Font fx;

	public RcplFont(String name, double height, int fontStyle) {
		super();
		this.name = name;
		this.height = height;
		this.fontStyle = fontStyle;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getHeight() {
		return height;
	}

	public int getFontStyle() {
		return fontStyle;
	}

	@Override
	public int getStyle() {
		return fontStyle;
	}

	@Override
	public Font getFx() {
		if (fx == null) {
			if (isBold()) {
				if (isItalic()) {
					fx = Font.font(name, FontWeight.BOLD, FontPosture.ITALIC, height * RCPLModel.FONT_HEIGHT_FACTOR);
				} else {
					fx = Font.font(name, FontWeight.BOLD, height * RCPLModel.FONT_HEIGHT_FACTOR);
				}
			} else {
				fx = Font.font(name, height * RCPLModel.FONT_HEIGHT_FACTOR);
			}
		}
		return fx;
	}

	@Override
	public void setHeight(double height) {
		fx = null;
		this.height = height;
	}

	@Override
	public boolean isBold() {
		return (fontStyle & Rcpl.BOLD) != 0;
	}

	@Override
	public void setBold(boolean bold) {
		fx = null;
		if (bold) {
			fontStyle |= Rcpl.BOLD;
		} else {
			fontStyle &= ~Rcpl.BOLD;
		}
	}

	@Override
	public boolean isItalic() {
		return (fontStyle & Rcpl.ITALIC) != 0;
	}

	@Override
	public boolean isUnderline() {
		return (fontStyle & Rcpl.UNDERLINE_SINGLE) != 0;
	}

	@Override
	public IFont copy() {
		IFont f = new RcplFont(name, height, fontStyle);
		return f;
	}

	@Override
	public void setStyle(int style) {
		fx = null;
		fontStyle = style;
	}

	@Override
	public void setName(String fontName) {
		fx = null;
		this.name = fontName;
	}

}
