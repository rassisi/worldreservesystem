package com.joffice.rcpl.plugin.office.fx.figures;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.ITextBox;
import org.eclipse.rcpl.ITextBoxFigure;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuInsetProperty;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOPict;

import javafx.geometry.Rectangle2D;
import javafx.scene.paint.Color;

/**
 * @author Ramin
 * 
 */
public class JOFXTextBoxFigure extends JOFXAbstractFigure implements ITextBoxFigure {

	private JOPict pict;

	public JOFXTextBoxFigure(ITextBox textBox) {
		super(textBox);

		for (ILayoutObject l : textBox.getChildList()) {
			ILayoutFigure layoutFigure = l.getLayoutFigure();
			if (layoutFigure instanceof IParagraphFigure) {
				((IParagraphFigure) layoutFigure).setTextBox(true);
				addParagraph((IParagraphFigure) layoutFigure);
			}
		}

		double width = getLayoutObject().getWidthPixel();
		double height = getLayoutObject().getHeightPixel();

		if (width == 0) {
			width = 300;
			height = 300;
		}

		setWidth(width);
		setHeight(height);
		refresh();

		outLineRectangle.setStroke(Color.YELLOW);
		outLineRectangle.setStrokeWidth(2);
		// setStroke(Color.RED);

	}

	public void addParagraph(IParagraphFigure par) {
		add(par);
		par.updateLocation();
	}

	@Override
	public ITextBox getLayoutObject() {
		return (ITextBox) super.getLayoutObject();
	}

	public void setPict(JOPict pict) {
		super.setPict(pict);
		updateStrokeAndFill();
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		StringBuffer buf = new StringBuffer();
		for (ILayoutObject l : getLayoutObject().getChildList()) {
			if (l instanceof JOParagraph) {
				JOParagraph par = (JOParagraph) l;
				buf.append(par.getTextBuffer().toString());
			}
		}
		return buf.length() == 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.joffice.rcpl.plugin.office.rcp.ui.figures.JOLayoutFigure#refresh()
	 */
	@Override
	public void refresh() {
		Rectangle2D r = getClientRect();
		int numberOfShapes = getLayoutObject().getChildList().size();
		if (numberOfShapes > 0) {
			double h;

			double insetTop = 0; // JOConversion.millimeterToPixel(1.3);
			double insetRight = JOConversion.millimeterToPixel(2.5);
			double insetLeft = JOConversion.millimeterToPixel(2.5);
			// double insetBottom = JOConversion.millimeterToPixel(1.3);

			boolean verticalAlign = true;
			if (getLayoutObject().getInsets() != null) {
				JOEmuInsetProperty p = (JOEmuInsetProperty) getLayoutObject().getInsets();
				insetTop = p.getTop();
				// insetBottom = p.getBottom();
				insetLeft = p.getLeft();
				insetRight = p.getRight();
				verticalAlign = false;
			}

			double y1 = insetTop;
			double x1 = insetLeft - insetRight;
			double w = r.getWidth() - insetLeft - insetRight;

			double h1 = 0;
			if (verticalAlign) {
				for (ILayoutObject l : getLayoutObject().getChildList()) {
					ILayoutFigure layoutFigure = l.getLayoutFigure();
					if (l instanceof JOParagraph) {
						JOParagraph par = (JOParagraph) l;
						JOParagraphFigure f = (JOParagraphFigure) par.getLayoutFigure();
						f.setWidth(w);
						h = f.getHeight();
					} else {
						h = layoutFigure.getHeight();
					}
					// not for the first line
					if (y1 > 0) {
						y1 += l.getSpacingBeforePixel();
					}

					h1 += h;
					h1 += getLayoutObject().getSpacingAfterPixel();
				}
				y1 = (getHeight() - h1) / 2;

			}

			for (ILayoutObject l : getLayoutObject().getChildList()) {
				ILayoutFigure layoutFigure = l.getLayoutFigure();
				if (l instanceof JOParagraph) {
					JOParagraph par = (JOParagraph) l;
					JOParagraphFigure f = (JOParagraphFigure) par.getLayoutFigure();
					f.setWidth(w);
					h = f.getHeight();
				} else {
					h = layoutFigure.getHeight();
				}
				// not for the first line
				if (y1 > 0) {
					y1 += l.getSpacingBeforePixel();
				}
				layoutFigure.getPane().setLayoutX(x1);
				layoutFigure.getPane().setLayoutY(y1);
				layoutFigure.setWidth(w);
				y1 += h;
				y1 += getLayoutObject().getSpacingAfterPixel();
			}

			if (verticalAlign) {
				double remaining = getHeight() - y1;

			}
		}
	}

	private void updateStrokeAndFill() {

		if (getPict() != null) {
			boolean filled = getPict().isFilled();
			if (filled) {

				IColor bg = null;

				if (getPict().getSolidFillColor() != null) {
					bg = getPict().getSolidFillColor();
				} else {
					bg = IColor.WHITE;
				}

				setFill(javafx.scene.paint.Color.rgb((int) bg.getRed(), (int) bg.getGreen(), (int) bg.getBlue()));
			}
		}

		IColor strokeColor = null;
		if (getPict().isStroked()) {
			strokeColor = getPict().getLineColor();
			if (strokeColor == null) {
				if (getPict().getLineColorProperty() != null) {
					strokeColor = getPict().getLineColorProperty().get();
				}
			}
			if (strokeColor == null) {
				strokeColor = IColor.BLACK;
			}
		}
		if (strokeColor != null) {
			JOEmu lineWidth = getPict().getLineWidth();
			// JOEmuProperty lineWidth2 = getShape().getLineWidthProperty();
			double w = 1;
			if (lineWidth != null) {
				w = lineWidth.toPixel();
			}

			setStroke(javafx.scene.paint.Color.rgb((int) strokeColor.getRed(), (int) strokeColor.getGreen(),
					(int) strokeColor.getBlue()));

			setStrokeWidth(w);

		}

		if (isEmpty()) {
			if (getPict().isFilled()) {
				IColor c = getPict().getSolidFillColor();
				if (c != null) {
					if (!c.equals(IColor.WHITE)) {
						return;
					}
				}
			}
			if (strokeColor == null || strokeColor.equals(IColor.WHITE)) {
				setStroke(javafx.scene.paint.Color.LIGHTGRAY);
			}
		}
	}

	/**
	 * @return
	 */
	private double getLineWidth() {
		if (getPict() == null) {
			return 0;
		}
		if (!getPict().isStroked()) {
			return 0;
		}
		JOEmu lineWidth = getPict().getLineWidth();
		// JOEmuProperty lineWidth2 = getShape().getLineWidthProperty();
		double w = 1;
		if (lineWidth != null) {
			w = lineWidth.toPixel();
		}
		return w;
	}

	/**
	 * @return
	 */
	private Rectangle2D getClientRect() {

		double x;
		double y;
		double width;
		double height;

		height = getHeight() - getLayoutObject().getTopMargin();
		height = getHeight() - getLayoutObject().getBottomMargin();
		width = getWidth() - getLayoutObject().getLeftMargin();
		width = getWidth() - getLayoutObject().getRightMargin();
		x = getX2() + getLayoutObject().getLeftMargin();
		y = getY2() + getLayoutObject().getTopMargin();
		return new Rectangle2D(x, y, width, height);
	}

	public JOPict getPict() {
		return pict;
	}

	@Override
	public void showOutline(boolean show) {
		super.showOutline(show);
	}

}
