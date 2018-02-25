package com.joffice.rcpl.plugin.office.internal.figures;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPictFigure;
import org.eclipse.rcpl.ITextBox;
import org.eclipse.rcpl.ITextBoxFigure;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXAbstractFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXTextBoxFigure;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOPict;
import com.joffice.rcpl.plugin.office.internal.model.word.JOTextbox;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JOTextboxFigure extends JOMovableFigure implements ITextBoxFigure {

	/**
	 * @param editorFigure
	 * @param pictFigure
	 * @param textBox
	 * @param overflowPart
	 */
	public JOTextboxFigure(IEditor editorFigure, IPictFigure pictFigure, ITextBox textBox, boolean overflowPart) {
		super(editorFigure, textBox, overflowPart);

		for (ILayoutObject l : textBox.getChildList()) {
			ILayoutFigure layoutFigure = l.getLayoutFigure();
			add(layoutFigure);
		}

		double width = getLayoutObject().getWidthPixel();
		double height = getLayoutObject().getHeightPixel();

		if (width == 0) {
			width = 300;
			height = 300;
		}
		setBounds(0, 0, width, height);
		refresh();

	}

	@Override
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
			double h = r.getHeight() / numberOfShapes;

			// int x1 = r.x + 3 + getLineWidth();
			// int y1 = r.y + 2 + getLineWidth();

			// JavaFX
			double x1 = 3 + getLineWidth();
			double y1 = 2 + getLineWidth();

			double w = r.getWidth() - 2 * getLineWidth() - 7;

			for (ILayoutObject l : getLayoutObject().getChildList()) {
				ILayoutFigure layoutFigure = l.getLayoutFigure();
				if (l instanceof JOParagraph) {
					JOParagraph par = (JOParagraph) l;
					JOParagraphFigure f = (JOParagraphFigure) par.getLayoutFigure();
					f.getFx().setWidth(w);
					h = f.getFx().getHeight();
				} else {
					h = layoutFigure.getSize().getHeight();
				}
				y1 += l.getSpacingBeforePixel();

				layoutFigure.setBounds(0, y1, w, h);
				y1 += h;
				y1 += layoutObject.getSpacingAfterPixel();

				// y1 += 30;
			}
		}
	}

	private void updateStrokeAndFill() {
		Rectangle2D r = getBounds();
		if (getPict() != null) {
			boolean filled = getPict().isFilled();
			if (filled) {

				IColor bg = null;

				if (getPict().getSolidFillColor() != null) {
					bg = getPict().getSolidFillColor();
				} else {
					bg = IColor.WHITE;
				}

				getFx().setFill(
						javafx.scene.paint.Color.rgb((int) bg.getRed(), (int) bg.getGreen(), (int) bg.getBlue()));
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

			getFx().setStroke(javafx.scene.paint.Color.rgb((int) strokeColor.getRed(), (int) strokeColor.getGreen(),
					(int) strokeColor.getBlue()));

			getFx().setStrokeWidth(w);

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
				getFx().setStroke(javafx.scene.paint.Color.LIGHTGRAY);
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
		JOTextbox textBox = getLayoutObject();
		Rectangle2D r = getBounds();

		double x;
		double y;
		double width;
		double height;

		height = r.getHeight() - textBox.getTopMargin();
		height = r.getHeight() - textBox.getBottomMargin();
		width = r.getWidth() - textBox.getLeftMargin();
		width = r.getWidth() - textBox.getRightMargin();
		x = r.getMinX() + textBox.getLeftMargin();
		y = r.getMinY() + textBox.getTopMargin();
		return r;
	}

	@Override
	protected void activate() {
	}

	@Override
	public boolean select() {
		return false;
	}

	@Override
	public boolean unselect() {
		return true;
	}

	@Override
	public JOFXTextBoxFigure getFx() {
		return (JOFXTextBoxFigure) super.getFx();
	}

	@Override
	protected JOFXAbstractFigure createFxFigure() {
		return new JOFXTextBoxFigure(getLayoutObject(), 100);
	}

	@Override
	public void add(ILayoutFigure figure) {
		super.add(figure);
		// if (figure instanceof IParagraphFigure) {
		// getFx().addParagraph(((IParagraphFigure) figure).getFx());
		// }
	}

	@Override
	public JOTextbox getLayoutObject() {
		return (JOTextbox) super.getLayoutObject();
	}

	@Override
	public void setOverflowExcess(double excess) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getOverflowExcess() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setOverflowLocation(Point2D location) {
		// TODO Auto-generated method stub

	}

	@Override
	public Point2D getOverflowLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub

	}
}
