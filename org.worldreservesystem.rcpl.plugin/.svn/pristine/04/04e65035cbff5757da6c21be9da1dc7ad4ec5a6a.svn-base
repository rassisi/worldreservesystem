package com.joffice.rcpl.plugin.office.fx.figures;

import java.util.Iterator;

import org.eclipse.rcpl.IDraggable;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IResizable;
import org.eclipse.rcpl.IShape;

import com.joffice.rcpl.plugin.office.databinding.types.JOTextAnchoringType;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOShape;

import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;

/**
 * @author Ramin
 * 
 */
public class JOFXShapeFigure extends JOFXAbstractFigure implements IDraggable, IResizable {

	Node imageView;

	public JOFXShapeFigure(IShape layoutObject) {
		super(layoutObject);

		// getBg().setStroke(Color.RED);
		// getBg().setVisible(true);

		if (layoutObject.getImage() != null) {

			imageView = layoutObject.getImage().getNode();

			// imageView.setEffect(new DropShadow());
			getPane().getChildren().add(imageView);
			imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					getEditor().showAnchor(JOFXShapeFigure.this);
				}
			});
		}

		getPane().setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				getEditor().showAnchor(JOFXShapeFigure.this);
			}
		});

		Iterator<ILayoutObject> it = getLayoutObject().iterator();
		while (it.hasNext()) {
			ILayoutObject l = it.next();
			ILayoutFigure layoutFigure = l.getLayoutFigure();
			// layoutFigure.setMovableFigure(this);
			add(layoutFigure);
		}

		double width = layoutObject.getWidthPixel();
		setWidth(width);
		setHeight(layoutObject.getHeightPixel());
	}

	@Override
	public void setWidth(double w) {
		super.setWidth(w);

		getBg().setWidth(w);

		if (imageView != null) {
			if (imageView instanceof ImageView) {
				((ImageView) imageView).setFitWidth(w);
			} else if (imageView instanceof WebView) {
				((WebView) imageView).setMinWidth(w);
				((WebView) imageView).setPrefWidth(w);
				((WebView) imageView).setMaxWidth(w);
			}

		}
	}

	@Override
	public void setHeight(double h) {
		super.setHeight(h);

		getBg().setHeight(h);

		if (imageView != null) {
			if (imageView instanceof ImageView) {
				((ImageView) imageView).setFitHeight(h);
			} else if (imageView instanceof WebView) {
				((WebView) imageView).setMinHeight(h);
				((WebView) imageView).setPrefHeight(h);
				((WebView) imageView).setMaxHeight(h);
			}
		}
	}

	public void addTextBox(JOFXTextBoxFigure par) {
		setTextBox(true);
		par.setParentFigure(this);
		par.updateLocation();
	}

	@Override
	public boolean setLocation(double x, double y) {
		super.setLocation(x, y);

		if (imageView != null) {
			// imageView.setLayoutY(0);
			imageView.toFront();
		}
		refresh();
		return false;
	}

	@Override
	public void refresh() {

		if (getWidth() == 0 || getHeight() == 0) {
			return;
		}
		double leftInset = 0;
		Rectangle2D groupBounds = null;
		if (getLayoutObject().getShapeGroup() != null) {
			ILayoutFigure f = getLayoutObject().getShapeGroup().getLayoutFigure();
			groupBounds = new Rectangle2D(f.getX2(), f.getY2(), f.getWidth(), f.getHeight());
		}

		if (getLayoutObject().getLeftInset() != null) {
			getLayoutObject().getLeftInset().get();
			leftInset = getLayoutObject().getLeftInset().toPixel();
		}

		JOFXShapeFigure shapeFigure = (JOFXShapeFigure) getLayoutObject().getLayoutFigure();
		int numberOfShapes = getLayoutObject().getChildren().length;
		if (numberOfShapes > 0) {
			double h = getHeight() / numberOfShapes;
			double y = getY2();
			if (getLayoutObject().getTextAnchoringType() != null) {
				getLayoutObject().getTextAnchoringType().get();
				JOTextAnchoringType type = getLayoutObject().getTextAnchoringType().get();
				int totalHeight = 0;
				Iterator<ILayoutObject> it = getLayoutObject().iterator();
				while (it.hasNext()) {
					ILayoutObject lO = it.next();
					ILayoutFigure layoutFigure = lO.getLayoutFigure();
					h = layoutFigure.getHeight();
					y += h;
					totalHeight += h;
				}
				if (type.type.equals(JOTextAnchoringType.Enum.CENTER)) {
					y = getY2() + (getHeight() - totalHeight) / 2;
				} else if (type.type.equals(JOTextAnchoringType.Enum.TOP)) {
					y = getY2();
				} else if (type.type.equals(JOTextAnchoringType.Enum.BOTTOM)) {
					y = getY2() + getHeight() - totalHeight;
				}
				it = getLayoutObject().iterator();
				while (it.hasNext()) {
					ILayoutObject lO = it.next();
					ILayoutFigure layoutFigure = lO.getLayoutFigure();
					if (layoutFigure instanceof JOParagraphFigure) {
						if (shapeFigure.isCloned()) {
							layoutFigure.setVisible(false);
						}
					}
					h = layoutFigure.getHeight();
					double w = layoutFigure.getWidth();
					double x1 = getX2() + leftInset;

					layoutFigure.setLocation(x1, y);

					if (groupBounds != null) {
						double xOverflow = (groupBounds.getMinX() + groupBounds.getWidth()) - (x1 + w);
						if (xOverflow > 1) {
							layoutFigure.setWidth(xOverflow);
							layoutFigure.setHeight(h);
						}
					}
					layoutFigure.refresh();
					y += h;
				}
			}
		}

	}

	@Override
	public JOShape getLayoutObject() {
		return (JOShape) super.getLayoutObject();
	}
}
