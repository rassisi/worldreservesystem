/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office;

import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPBdr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;

public class JOBorder implements IBorder {

	protected JOEmu distanceTop;
	protected JOEmu distanceBottom;
	protected JOEmu distanceLeft;
	protected JOEmu distanceRight;
	protected JOEmu lineWidthTop;
	protected JOEmu lineWidthBottom;
	protected JOEmu lineWidthLeft;
	protected JOEmu lineWidthRight;
	protected IColor borderColorTop;
	protected IColor borderColorBottom;
	protected IColor borderColorLeft;
	protected IColor borderColorRight;

	/**
	 * @param layoutObject
	 * @param pageBorders
	 */
	public JOBorder(JOObject layoutObject, CTPageBorders pageBorders) {
		createBorder(pageBorders.getTop(), Rcpl.TOP);
		createBorder(pageBorders.getBottom(), Rcpl.BOTTOM);
		createBorder(pageBorders.getLeft(), Rcpl.LEFT);
		createBorder(pageBorders.getRight(), Rcpl.RIGHT);
	}

	/**
	 * @param layoutObject
	 * @param border
	 */
	public JOBorder(JOObject layoutObject, CTBorder border) {
	}

	/**
	 * @param layoutObject
	 * @param borderB
	 * @param borderT
	 * @param borderL
	 * @param borderR
	 * @param colorB
	 * @param colorT
	 * @param colorL
	 * @param colorR
	 */
	public JOBorder(JOObject layoutObject,
			schemasMicrosoftComOfficeWord.CTBorder borderB,
			schemasMicrosoftComOfficeWord.CTBorder borderT,
			schemasMicrosoftComOfficeWord.CTBorder borderL,
			schemasMicrosoftComOfficeWord.CTBorder borderR, String colorB,
			String colorT, String colorL, String colorR) {

		if (borderT != null) {
			distanceTop = new JOEmu(borderT.getWidth());
		}
		if (borderB != null) {
			distanceBottom = new JOEmu(borderB.getWidth());
		}
		if (borderL != null) {
			distanceLeft = new JOEmu(borderL.getWidth());
		}
		if (borderR != null) {
			distanceRight = new JOEmu(borderR.getWidth());
		}
	}

	/**
	 * @param layoutObject
	 * @param border
	 */
	public JOBorder(JOObject layoutObject,
			org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder border) {

	}

	/**
	 * @param layoutObject
	 * @param b
	 */
	public JOBorder(JOObject layoutObject, CTPBdr b) {
		createBorder(b.getTop(), Rcpl.TOP);
		createBorder(b.getBottom(), Rcpl.BOTTOM);
		createBorder(b.getLeft(), Rcpl.LEFT);
		createBorder(b.getRight(), Rcpl.RIGHT);
	}

	/**
	 * @param border
	 * @param type
	 */
	public void createBorder(CTBorder border, int type) {
		if (border != null) {
			JOEmu distance = null;
			JOEmu lineWidth = null;
			IColor borderColor = null;
			if (border.getSpace() != null) {
				distance = new JOEmuPoint(border.getSpace());
				lineWidth = new JOEmuPoint(border.getSz().doubleValue() / 12);
				if (border.getColor() instanceof byte[]) {
					borderColor = Rcpl.colorProvider().get(
							(byte[]) border.getColor());
				}
			}
			switch (type) {
			case Rcpl.TOP:
				distanceTop = distance;
				lineWidthTop = lineWidth;
				borderColorTop = borderColor;
				break;
			case Rcpl.BOTTOM:
				distanceBottom = distance;
				lineWidthBottom = lineWidth;
				borderColorBottom = borderColor;
				break;
			case Rcpl.LEFT:
				distanceLeft = distance;
				lineWidthLeft = lineWidth;
				borderColorLeft = borderColor;
				break;
			case Rcpl.RIGHT:
				distanceRight = distance;
				lineWidthRight = lineWidth;
				borderColorRight = borderColor;
				break;
			}
		}
	}

	public JOEmu getDistanceTop() {
		return distanceTop;
	}

	public void setDistanceTop(JOEmu distanceTop) {
		this.distanceTop = distanceTop;
	}

	public JOEmu getDistanceBottom() {
		return distanceBottom;
	}

	public void setDistanceBottom(JOEmu distanceBottom) {
		this.distanceBottom = distanceBottom;
	}

	public JOEmu getDistanceLeft() {
		return distanceLeft;
	}

	public void setDistanceLeft(JOEmu distanceLeft) {
		this.distanceLeft = distanceLeft;
	}

	public JOEmu getDistanceRight() {
		return distanceRight;
	}

	public void setDistanceRight(JOEmu distanceRight) {
		this.distanceRight = distanceRight;
	}

	public JOEmu getLineWidthTop() {
		return lineWidthTop;
	}

	public void setLineWidthTop(JOEmu lineWidthTop) {
		this.lineWidthTop = lineWidthTop;
	}

	public JOEmu getLineWidthBottom() {
		return lineWidthBottom;
	}

	public void setLineWidthBottom(JOEmu lineWidthBottom) {
		this.lineWidthBottom = lineWidthBottom;
	}

	public JOEmu getLineWidthLeft() {
		return lineWidthLeft;
	}

	public void setLineWidthLeft(JOEmu lineWidthLeft) {
		this.lineWidthLeft = lineWidthLeft;
	}

	public JOEmu getLineWidthRight() {
		return lineWidthRight;
	}

	public void setLineWidthRight(JOEmu lineWidthRight) {
		this.lineWidthRight = lineWidthRight;
	}

	public IColor getBorderColorTop() {
		return borderColorTop;
	}

	public void setBorderColorTop(IColor borderColorTop) {
		this.borderColorTop = borderColorTop;
	}

	public IColor getBorderColorBottom() {
		return borderColorBottom;
	}

	public void setBorderColorBottom(IColor borderColorBottom) {
		this.borderColorBottom = borderColorBottom;
	}

	public IColor getBorderColorLeft() {
		return borderColorLeft;
	}

	public void setBorderColorLeft(IColor borderColorLeft) {
		this.borderColorLeft = borderColorLeft;
	}

	public IColor getBorderColorRight() {
		return borderColorRight;
	}

	public void setBorderColorRight(IColor borderColorRight) {
		this.borderColorRight = borderColorRight;
	}

	@Override
	public void setLineWidth(double width) {
		lineWidthBottom.setPixel(width);
		lineWidthLeft.setPixel(width);
		lineWidthRight.setPixel(width);
		lineWidthTop.setPixel(width);

	}

	@Override
	public double getLineWidthPixel() {
		return lineWidthTop.toPixel();
	}

}
