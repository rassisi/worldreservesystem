package com.joffice.rcpl.plugin.office.fx.figures;

import java.util.Iterator;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDraggable;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.IResizable;
import org.eclipse.rcpl.ISVG;

import com.joffice.rcpl.plugin.office.internal.model.word.JOPict;

import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;

/**
 * @author Ramin
 * 
 */
public class JOFXPictFigure extends JOFXAbstractFigure implements IDraggable, IResizable {

	Node imageView;

	double marginTop;
	double marginLeft;
	double marginBottom;
	double marginRight;

	public JOFXPictFigure(IPict layoutObject) {
		super(layoutObject);

		if (layoutObject.getImage() != null) {

			imageView = layoutObject.getImage().getNode();

			// imageView.setEffect(new DropShadow());
			getPane().getChildren().add(imageView);
			imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					getEditor().showAnchor(JOFXPictFigure.this);
				}
			});
		}

		if (layoutObject instanceof JOPict) {

			JOPict pict = (JOPict) layoutObject;

			setPict(layoutObject);

			updateFillAndStroke();

			marginTop = getLayoutObject().getMarginTop() != null
					? getLayoutObject().getMarginTop().get().toPixel() / 10.0 : 0;
			marginLeft = getLayoutObject().getMarginLeft() != null
					? getLayoutObject().getMarginLeft().get().toPixel() / 10.0 : 0;
			marginRight = getLayoutObject().getMarginRight() != null
					? getLayoutObject().getMarginRight().get().toPixel() / 10.0 : 0;
			marginBottom = getLayoutObject().getMarginBottom() != null
					? getLayoutObject().getMarginBottom().get().toPixel() / 10.0 : 0;

			Iterator<ILayoutObject> it = pict.iterator();
			while (it.hasNext()) {
				ILayoutObject l = it.next();
				ILayoutFigure layoutFigure = l.getLayoutFigure();
				layoutFigure.setPict(pict);
				add(layoutFigure);
			}

		}

		double width = layoutObject.getWidthPixel();

		setWidth(width);
		setHeight(layoutObject.getHeightPixel());

		outLineRectangle.setStroke(Color.AQUAMARINE);
		outLineRectangle.setStrokeWidth(2);

	}

	@Override
	public void setWidth(double w) {
		super.setWidth(w);

		if (getLayoutObject() instanceof JOPict) {
			JOPict pict = getLayoutObject();
			if (pict.getVml() != null && pict.getVml().getEmuShadowOffsX() != null) {
				w -= 2 * pict.getVml().getEmuShadowOffsX().toPixel();
				getBg().setWidth(w);
			}
		} else {
			getBg().setWidth(w);
		}

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
		if (getLayoutObject() instanceof JOPict) {
			JOPict pict = getLayoutObject();
			if (pict.getVml().getEmuShadowOffsY() != null) {
				h -= 2 * pict.getVml().getEmuShadowOffsY().toPixel();
				getBg().setHeight(h);
			}
		} else {
			getBg().setHeight(h);
		}

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

	public void addTextBox(JOFXTextBoxFigure textBoxFigure) {
		setTextBox(true);
		textBoxFigure.setParentFigure(this);
		textBoxFigure.updateLocation();
	}

	@Override
	public boolean setLocation(double x, double y) {
		super.setLocation(x, y);
		if (getLayoutObject().getVml().getEmuShadowOffsX() != null) {
			getBg().setLayoutX(getLayoutObject().getVml().getEmuShadowOffsX().toPixel());
		}

		if (getLayoutObject().getVml().getEmuShadowOffsY() != null) {
			getBg().setLayoutY(getLayoutObject().getVml().getEmuShadowOffsY().toPixel());
		}
		if (imageView != null) {
			// imageView.setLayoutY(0);
			imageView.toFront();
		}

		refresh();
		return false;
	}

	@Override
	public JOPict getLayoutObject() {
		return (JOPict) super.getLayoutObject();
	}

	private void updateFillAndStroke() {
		if (getLayoutObject().getSolidFillColor() != null) {
			IColor c = getLayoutObject().getSolidFillColor();
			double r = c.getRed();
			double g = c.getGreen();
			double b = c.getBlue();
			getFx().setFill(javafx.scene.paint.Color.rgb((int) r, (int) g, (int) b));
		}
		// int h = 20;
		// if (pict.getLineWidth() != null) {
		// h += pict.getLineWidth().toPixel();
		// }
		// // r.height = h;
		// arcSize = pict.getArcsize();
		// solidFillColor = pict.getSolidFillColor();
		if (getLayoutObject().getLineWidth() != null) {
			if (getLayoutObject().getLineColor() != null) {
				IColor c = getLayoutObject().getLineColor();
				getFx().setStroke(
						javafx.scene.paint.Color.rgb((int) c.getRed(), (int) c.getGreen(), (int) c.getBlue()));
			}

			double lineWidth = getLayoutObject().getLineWidth().toPixel();
			if (lineWidth > 0) {
				getFx().setStrokeWidth(lineWidth);
			}
		}
	}

	/**
	 * 
	 */
	// private void createToolTip() {
	// if (layoutObject instanceof JOPict) {
	// JOPict pict = (JOPict) layoutObject;
	// StringBuffer toolText = new StringBuffer();
	// toolText.append("Image Properties");
	// if (pict.getTitle() != null) {
	// toolText.append("Title " + pict.getTitle() + "\n"); //$NON-NLS-1$
	// }
	// if (pict.getSource() != null) {
	// toolText.append("Source " + pict.getSource() + "\n"); //$NON-NLS-1$
	// }
	// if (pict.gethRef() != null) {
	// toolText.append("Link " + pict.gethRef() + "\n"); //$NON-NLS-1$
	// }
	// }
	// }

	// @Override
	// public void setY(double y) {
	// super.setY(y);
	// refresh();
	// }

	@Override
	public void refresh() {

		int numberOfShapes = getLayoutObject().getChildren().length;

		if (numberOfShapes > 0) {

			double y = getLayoutObject().getYPixel() + marginTop;
			double x = getLayoutObject().getXPixel() + marginLeft;

			Rectangle2D totalSize = null;
			Iterator<ILayoutObject> it = getLayoutObject().iterator();

			// getPane().setStyle("-fx-background-color:orange");

			while (it.hasNext()) {
				ILayoutObject lO = it.next();
				ILayoutFigure f = lO.getLayoutFigure();
				f.setWidth(getLayoutObject().getWidthPixel() - marginLeft - marginRight);
				// f.getPane().setStyle("-fx-background-color:blue");
				f.refresh();
				// f.setParentFigure(null);
				// f.setLocation(getX2() + x, getY2() + y);
				y += f.getHeight();
			}

			// int xOffset = (getBounds().width - totalSize.width) / 2;
			// int yOffset = (getBounds().height - totalSize.height) / 2;
			// it = pict.iterator();
			// while (it.hasNext()) {
			// JOObject lO = it.next();
			// JOFigure layoutFigure = lO.getLayoutFigure();
			// Point loc = layoutFigure.getLocation();
			// layoutFigure.setLocation(new Point(loc.x + xOffset, loc.y
			// + yOffset));
			// }
		}

	}

	private String wordArt;

	private ISVG joSvg;

	/**
	 * @return
	 */
	public Rectangle2D getCrops() {
		Rectangle2D r = new Rectangle2D(0, 0, 0, 0);
		// if (layoutObject instanceof JOPict) {
		// JOPict pict = (JOPict) layoutObject;
		// Rectangle ir = pict.getImageResource()
		// .getImage().get().getBounds();
		// r.x = 0;
		// r.y = 0;
		// int ix2 = r.width = ir.width;
		// int iy2 = r.height = ir.height;
		//
		// float cropT = pict.getCropTop();
		// if (cropT > 0) {
		// r.y += (int) (ir.height * cropT / 100000.0);
		// }
		// float cropB = pict.getCropBottom();
		// if (cropB > 0) {
		// iy2 -= (int) (ir.height * cropB / 100000.0);
		// }
		// float cropL = pict.getCropLeft();
		// if (cropL > 0) {
		// r.x += (int) (ir.width * cropL / 100000.0);
		// }
		// float cropR = pict.getCropRight();
		// if (cropR > 0) {
		// ix2 -= (int) (ir.width * cropR / 100000.0);
		// }
		//
		// r.width = ix2 - r.x;
		// r.height = iy2 - r.y;
		// }
		return r;
	}

	// private int getLineStyle() {
	// return SWT.LINE_SOLID;
	// }

	private double getLineWidth() {
		if (getLayoutObject().getLineWidth() != null) {
			return getLayoutObject().getLineWidth().toPixel();
		}
		return 1;
	}

	// /**
	// *
	// */
	// private void paintShape(Graphics g, JORectangle r, double[] ps) {
	// PointList points = new PointList();
	// for (int i = 0; i < ps.length; i++) {
	// int x = (int) (ps[i] / 1000 * r.width);
	// int y = (int) (ps[i + 1] / 1000 * r.height);
	// points.addPoint(x, y);
	//
	// }
	// g.pushState();
	// // don't apply transparency to the outline
	// // applyTransparency(g);
	// // if (!isUsingGradient()) {
	// // g.fillPolygon(points);
	// // } else {
	// // fillGradient(g, getPath(points));
	// // }
	// g.popState();
	//
	// // set the line type and line width
	// g.setLineStyle(getLineStyle());
	// g.setLineWidth(getLineWidth());
	// g.drawPolygon(points);
	//
	// }

	// private void paintRightArrow(Graphics graphics, JORectangle r) {
	// PointList points = calculatePoints(r, new double[] { 225.71, 617.14,
	// 225.71, 377.14, 251.43, 377.14, 651.43, 217.14, 925.71, 497.14,
	// 651.43, 777.14, 651.43, 617.14 });
	// paintShape(graphics, points);
	// }
	//
	// private void paintStar(Graphics graphics, JORectangle r) {
	// PointList points = calculatePoints(r, new double[] { 12.3, 35.6, 56.7,
	// 76.5 });
	// paintShape(graphics, points);
	// }

	// private void paintBevel(Graphics g) {
	// PointList points = calculateBevelPoints(getWidthSpecificBounds());
	//
	// paintShape(g, points);
	// }

	/**
	 * @param r
	 * @param ps
	 * @return
	 */
	// private PointList calculatePoints(Rectangle r, double[] ps) {
	// PointList points = new PointList();
	// for (int i = 0; i < ps.length - 1; i += 2) {
	// int x = Math.min(r.x + r.width - 1, r.x
	// + (int) (ps[i] / 1000.0 * r.width));
	// int y = Math.min(r.y + r.height - 1, r.y
	// + (int) (ps[i + 1] / 1000.0 * r.height));
	// points.addPoint(x, y);
	// }
	// return points;
	// }

	// private void paintShape(Graphics graphics, PointList points) {
	// paintShape(graphics, points, 0);
	// }
	//
	// /**
	// * @param graphics
	// * @param points
	// */
	// private void paintShape(Graphics graphics, PointList points,
	// double brightness) {
	//
	// // // int[] ps = points.toIntArray();
	// //
	// // // graphics.pushState();
	// // // don't apply transparency to the outline
	// // // applyTransparency(g);
	// // // if (!isUsingGradient()) {
	// // // graphics.setAlpha(255);
	// //
	// // if (brightness != 0) {
	// // graphics.setBackgroundColor((Color) JO.colorProvider.get(
	// // graphics.getBackgroundColor(), brightness));
	// // }
	// //
	// // graphics.fillPolygon(points);
	// // // } else {
	// // // fillGradient(g, getPath(points));
	// // // }
	// // // graphics.popState();
	// //
	// // // set the line type and line width
	// // // g.setLineStyle(getLineStyle());
	// // // g.setLineWidth(getLineWidth());
	// // graphics.drawPolygon(points);
	// }

	// /**
	// * @param g
	// */
	// private void paintDiamond(Graphics g) {
	// PointList points = calculateDiamondPoints(getWidthSpecificBounds());
	// paintShape(g, points);
	// }
	//
	// protected Rectangle getWidthSpecificBounds() {
	// return getBounds().getCopy().shrink(getLineWidth() / 2,
	// getLineWidth() / 2);
	// }

	private int getTopHeight(Rectangle2D r) {
		return (int) (r.getHeight() * 0.25);
	}

	// @Override
	// public void mouseDoubleClicked(MouseEvent me) {
	// if (!JO.ACTIVATED_MODULE_EDITOR
	// || (getEditor() != null && getEditor().isReadOnly())) {

	// return;
	// }
	// // Iterator<JOObject> it = layoutObject.iterator();
	//
	// JOParagraphFigure pFig = findParagraphFigure(me.x, me.y);
	// if (pFig != null) {
	// pFig.mouseDoubleClicked(me);
	// } else {
	// mousePressed(me);
	// }
	//
	// // while (it.hasNext()) {
	// // JOObject l = it.next();
	// // JOLayoutFigure layoutFigure = l.getLayoutFigure();
	// // if (layoutFigure instanceof JOParagraphFigure) {
	// // ((JOParagraphFigure) layoutFigure).mouseDoubleClicked(me);

	// // } else if (layoutFigure instanceof JOTextboxFigure) {
	// // ((JOTextboxFigure) layoutFigure).mouseDoubleClicked(me);
	// // }
	// // }
	//
	// }

	protected void activate() {
	}

	// protected PointList calculateDiamondPoints(Rectangle rect) {
	// PointList points = new PointList();
	//
	// int halfX = rect.x + (rect.width / 2);
	// int halfY = rect.y + (rect.height / 2);
	//
	// Point p1 = new Point(halfX, rect.y);
	// Point p2 = new Point(rect.x + rect.width - 1, halfY);
	// Point p3 = new Point(halfX, rect.y + rect.height - 1);
	// Point p4 = new Point(rect.x, halfY);
	//
	// points.addPoint(p1);
	// points.addPoint(p2);
	// points.addPoint(p3);
	// points.addPoint(p4);
	// points.addPoint(p1);
	//
	// return points;
	// }

	// protected PointList calculateBevelPoints(JORectangle rect) {
	// PointList points = new PointList();
	//
	// int halfX = rect.x + (rect.width / 2);
	// int halfY = rect.y + (rect.height / 2);
	//
	// Point p1 = new Point(halfX, rect.y);
	// Point p2 = new Point(rect.x + rect.width - 1, halfY);
	// Point p3 = new Point(halfX, rect.y + rect.height - 1);
	// Point p4 = new Point(rect.x, halfY);
	//
	// points.addPoint(p1);
	// points.addPoint(p2);
	// points.addPoint(p3);
	// points.addPoint(p4);
	// points.addPoint(p1);
	//
	// return points;

	// protected PointList calculateRegularPentagonPoints(Rectangle rect) {
	// PointList points = new PointList();
	//
	// int halfX = rect.x + (rect.width / 2);
	// int Y = rect.y + (rect.height * 2 / 5);
	// int X = rect.x + (rect.width * 4 / 5);
	// int X2 = rect.x + (rect.width / 5);
	// Point p1 = new Point(halfX, rect.y);
	// Point p2 = new Point(rect.x + rect.width - 1, Y);
	// Point p3 = new Point(X, rect.y + rect.height - 1);
	// Point p4 = new Point(X2, rect.y + rect.height - 1);
	// Point p5 = new Point(rect.x, Y);
	// points.addPoint(p1);
	// points.addPoint(p2);
	// points.addPoint(p3);
	// points.addPoint(p4);
	// points.addPoint(p5);
	// points.addPoint(p1);
	//
	// return points;
	// }

	@Override
	public void showOutline(boolean show) {
		super.showOutline(show);
	}
}
