package org.worldreservesystem.rcpl.plugin.internal.figures;

import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.ISelectionShape;
import org.eclipse.rcpl.RcplUic;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * @author ramin
 *
 */
public class SelectionShape extends Polygon implements ISelectionShape {

	private double h1 = 20;
	private double h2 = 25;
	private double w = 15;
	private boolean start;

	private double locationX;
	private double locationY;

	private int characterIndex;

	private IParagraph paragraph;

	public SelectionShape(boolean start) {
		super();
		characterIndex = -1;
		this.start = start;
		if (start) {
			selectStart();
		} else {
			selectEnd();
		}
		setStroke(Color.DARKGRAY);
		setFill(Color.DARKBLUE);
		setOpacity(0.8);
		setVisible(false);

	}

	@Override
	public int getCharacterIndex() {
		return characterIndex;
	}

	public double getLocationX() {
		return locationX;
	}

	public double getLocationY() {
		return locationY;
	}

	@Override
	public IParagraph getParagraph() {
		return paragraph;
	}

	private void selectEnd() {
		getPoints().clear();
		getPoints()
				.addAll(new Double[] {

				w / 2, 0.0,

				w, h2 - h1,

				w, h2,

				0.0, h2,

				0.0, h2 - h1

		});
	}

	private void selectStart() {
		getPoints().clear();
		getPoints()
				.addAll(new Double[] {

				0.0, 0.0,

				w, 0.0,

				w, h1,

				w / 2, h2,

				0.0, h1

		});
	}

	public void setCharacterIndex(int characterIndex) {
		this.characterIndex = characterIndex;
	}

	public void setLocation(IParagraph paragraph, int characterIndex, double x, double y) {
		this.locationX = x;
		this.locationY = y;
		this.characterIndex = characterIndex;
		this.paragraph = paragraph;
		if (start) {
			setLayoutX(x - w / 2);
			setLayoutY(y - h2);
		} else {
			setLayoutX(x - w / 2);
			Rectangle r = RcplUic.getCaret();
			setLayoutY(y + r.getHeight());
		}
		setVisible(true);
	}

	public void setLocation(IParagraph paragraph, int characterIndex, Point2D p) {
		setLocation(paragraph, characterIndex, p.getX(), p.getY());
	}

	public void setParagraph(IParagraph paragraph) {
		this.paragraph = paragraph;
	}

}
