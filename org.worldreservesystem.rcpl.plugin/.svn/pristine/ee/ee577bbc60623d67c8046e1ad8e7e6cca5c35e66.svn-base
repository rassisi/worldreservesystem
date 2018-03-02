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
public class JOVLineal extends Canvas implements ILineal {

	private IParagraph paragraph;

	private double width = 20;

	double mt;
	double mb;

	private IPage page;

	public JOVLineal(IPage page) {
		super();
		this.page = page;
		mt = page.getMarginTop();
		mb = page.getMarginBottom();
		setHeight(page.getHeight());
		setWidth(width);
		setOpacity(0.5);
		draw();
	}

	private void draw() {

		setHeight(page.getHeight());
		GraphicsContext gc = getGraphicsContext2D();
		gc.setLineWidth(0.5);
		gc.setStroke(Color.DARKBLUE);
		gc.strokeRect(0, 0, width, page.getHeight());

		gc.setFill(Color.GOLD);
		gc.fillRect(1, 1, width - 2, page.getHeight() - 2);

		if (paragraph != null) {
			// gc.setFill(Color.WHITE);
			// double w = paragraph.getWidthPixel();
			// gc.fillRect(, 1, Math.min(w - 2, page.getWidth() - mr - 2),
			// height -
			// 1);
		}

		gc.setStroke(Color.BLACK);
		gc.setLineWidth(1);

		gc.setFont(Font.font(11));
		int i = 0;

		for (double milli = 0;; milli += 2.5, i++) {
			double y = JOConversion.millimeterToPixel(milli);
			if (y > page.getHeight()) {
				break;
			}
			if (i % 4 == 0) {
				if (i > 0) {
					gc.strokeText("" + (i / 4), width / 2 - 6, y, 20);
				}
			} else if (i % 2 == 0) {
				gc.strokeLine(width / 2 - 2, y, width / 2 + 2, y);
			} else {
				gc.strokeLine(width / 2 - 1, y, width / 2 + 1, y);
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
