package com.joffice.rcpl.plugin.office.fx.figures;

import org.eclipse.rcpl.IDraggable;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.IResizable;

import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;

/**
 * @author Ramin
 * 
 */
public class JOFXDrawingFigure extends JOFXAbstractFigure implements IDraggable, IResizable, IDrawingFigure {

	private Node imageView;

	public JOFXDrawingFigure(IDrawing drawing) {
		super(drawing);

		if (drawing.getImage() != null) {
			imageView = drawing.getImage().getNode();
			add(imageView);
			imageView.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					getEditor().showAnchor(JOFXDrawingFigure.this);
				}
			});
		}

		setWidth(getLayoutObject().getWidthPixel());
		setHeight(getLayoutObject().getHeightPixel());

	}

	@Override
	public void setWidth(double w) {
		if (w > 0) {
			super.setWidth(w);
			if (imageView != null) {
				if (imageView instanceof ImageView) {
					((ImageView) imageView).setFitWidth(w);
				} else if (imageView instanceof WebView) {
					((WebView) imageView).setMinWidth(w);
					((WebView) imageView).setPrefWidth(w);
					((WebView) imageView).setMaxWidth(w);
				}
				clipFigure();
			}
		}
	}

	@Override
	public void setHeight(double h) {
		if (h > 0) {
			super.setHeight(h);
			if (imageView != null) {
				if (imageView instanceof ImageView) {
					((ImageView) imageView).setFitHeight(h);
				} else if (imageView instanceof WebView) {
					((WebView) imageView).setMinHeight(h);
					((WebView) imageView).setPrefHeight(h);
					((WebView) imageView).setMaxHeight(h);
				}
				clipFigure();
			}
		}
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
	}

	public void addParagraph(JOParagraphFigure par) {
		getPane().getChildren().add(par.getPane());
		par.setParentFigure(this);
		par.updateLocation();
	}

	@Override
	public IDrawing getDrawing() {
		return getDrawing();
	}

}
