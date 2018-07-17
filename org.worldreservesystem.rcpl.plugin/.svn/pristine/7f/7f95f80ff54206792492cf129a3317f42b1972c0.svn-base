package com.joffice.rcpl.plugin.office.internal.figures;

import org.eclipse.rcpl.ILineal;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;

import com.joffice.rcpl.plugin.office.internal.config.JOConversion;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * @author ramin
 *
 */
public class JOHLineal extends Canvas implements ILineal {

	private IParagraph paragraph;

	private double height = 20;

	double ml;
	double mr;

	private IPage page;

	public JOHLineal(IPage page) {
		super();
		this.page = page;
		ml = page.getMarginLeft();
		mr = page.getMarginRight();
		setHeight(20);
		setOpacity(0.5);
		draw();
	}

	private void draw() {

		setWidth(page.getWidth());

		GraphicsContext gc = getGraphicsContext2D();
		gc.setLineWidth(0.5);
		gc.setStroke(Color.DARKBLUE);
		gc.strokeRect(0, 0, page.getWidth(), height);

		gc.setFill(Color.GOLD);
		gc.fillRect(1, 1, page.getWidth() - 2, height - 2);

		if (paragraph != null) {
			gc.setFill(Color.WHITE);
			double w = paragraph.getWidthPixel();
			gc.fillRect(ml + 1, 1, Math.min(w - 2, page.getWidth() - mr - 2), height - 2);
		}

		gc.setStroke(Color.BLACK);
		gc.setLineWidth(1);

		gc.setFont(Font.font(11));
		int i = 0;
		for (double milli = 0;; milli += 2.5, i++) {
			double x = JOConversion.millimeterToPixel(milli);
			if (x > page.getWidth()) {
				break;
			}
			if (i % 4 == 0) {
				if (i > 0) {
					gc.strokeText("" + (i / 4), x, height / 2 + 4, 20);
				}
			} else if (i % 2 == 0) {
				gc.strokeLine(x, height / 2 - 2, x, height / 2 + 2);
			} else {
				gc.strokeLine(x, height / 2 - 1, x, height / 2 + 1);
			}
		}

	}

	@Override
	public void setParagraph(IParagraph paragraph) {
		this.paragraph = paragraph;
		draw();
	}

	@Override
	public void show(boolean show) {
		setVisible(show);
		if (show) {
			draw();
		}
	}

}
