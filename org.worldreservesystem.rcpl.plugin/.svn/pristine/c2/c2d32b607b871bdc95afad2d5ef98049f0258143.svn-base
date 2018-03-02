package com.joffice.rcpl.plugin.office.internal.figures;

import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.IEditor;

import com.joffice.rcpl.plugin.office.fx.figures.JOFXAbstractFigure;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXDrawingFigure;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawing;

import javafx.geometry.Point2D;

/**
 * @author ramin
 * 
 */
public class JODrawingFigure extends JOMovableFigure implements IDrawingFigure {

	private boolean imageOverflowToTheRight;
	private boolean imageOverflowToTheLeftt;
	private boolean imageOverflowToTheNorth;
	private boolean imageOverflowToTheSouth;

	/**
	 * @param drawing
	 */
	public JODrawingFigure(IEditor editorFigure, JODrawing drawing, boolean overflowPart) {
		super(editorFigure, drawing, overflowPart);
		setBounds(0, 0, (int) drawing.getWidthPixel(), (int) drawing.getHeightPixel());
		// addMouseListener(this);
		// addMouseMotionListener(this);
	}

	/**
	 * @return
	 */
	@Override
	public JODrawing getDrawing() {
		return (JODrawing) getLayoutObject();
	}

	// @Override
	// public void setBounds(final Rectangle newBounds) {
	// Rectangle oldBounds = getBounds().getCopy();
	// super.setBounds(newBounds);
	// JOPageFigure page = getPage();
	// if (page != null) {
	// Rectangle pBounds = page.getBounds();
	// int pageRightX = pBounds.x + pBounds.width;
	// int rightX = newBounds.x + newBounds.width;
	// if (rightX > pageRightX) {
	// imageOverflowToTheRight = true;
	// }
	// if (newBounds.x < pBounds.x) {
	// imageOverflowToTheLeftt = true;
	// }
	// if (newBounds.y < pBounds.y) {
	// imageOverflowToTheNorth = true;
	// }
	// if (newBounds.y + newBounds.height < pBounds.y + pBounds.height) {
	// imageOverflowToTheSouth = true;
	// }
	// }
	//
	// if (oldBounds.width != newBounds.width
	// || oldBounds.height != newBounds.height) {
	// boolean createImage = false;
	// if (oldBounds.height != 0) {
	// createImage = true;
	// }
	// if (getDrawing().getSvg(false, true) != null) {
	// // ((JOSVG) getDrawing().getSvg()).setSize(newBounds.width,
	// // newBounds.height, createImage);
	// } else {
	// if (paintImage != null) {
	// // JOUtil.disposeResource(paintImage);
	// paintImage = null;
	// getPaintImage();
	// if (rotation != 0) {
	// // rotate();
	// }
	// }
	// }
	// }
	// }

	// @Override
	// protected void setFxBounds(Rectangle2D rect) {
	// // if (realBounds.width != realBounds.height) {
	// // super.setFxBounds(new JORectangle(realBounds.x, realBounds.y,
	// // realBounds.width, realBounds.height));
	// // } else {
	//
	// super.setFxBounds(new JORectangle(rect.x, rect.y, rect.width,
	// rect.height));
	// // setFxLocation(realBounds.x, realBounds.y);
	// // }
	// updateScale();
	// }

	// private void updateScale() {
	// if (isSvg()) {
	// // double w1 = ((JOSVG) getDrawing().getSvg()).getWidth();
	// // double h1 = ((JOSVG) getDrawing().getSvg()).getHeight();
	// //
	// // double w2 = getDrawing().getWidthPixel();
	// // double h2 = getDrawing().getHeightPixel();
	// //
	// // double zoomX = (w2 / w1) * 0.8;
	// // double zoomY = (h2 / h1) * 0.8;
	// //
	// // getFx().setScale(zoomX, zoomY);
	//
	// }
	// }

	@Override
	public void refresh() {
	}

	@Override
	protected void activate() {
	}

	public boolean isImageOverflowToTheRight() {
		return imageOverflowToTheRight;
	}

	public boolean isImageOverflowToTheLeftt() {
		return imageOverflowToTheLeftt;
	}

	public boolean isImageOverflowToTheNorth() {
		return imageOverflowToTheNorth;
	}

	public boolean isImageOverflowToTheSouth() {
		return imageOverflowToTheSouth;
	}

	@SuppressWarnings("unused")
	private int counter = 0;

	private float imageRotationScale = 1;

	@Override
	protected JOFXAbstractFigure createFxFigure() {
		if (isSvg()) {
			// getDrawing().getSvg(false, true);
			// ((JOSVG) getDrawing().getSvg()).setSize(100, 100, false);
			// try {
			// return new JOFXSVGFigure(getDrawing(), 100);
			// } catch (MalformedURLException e) {
			// // TODO Auto-generated catch block
			
			// }
		}
		return new JOFXDrawingFigure(getDrawing());
	}

	// @Override
	// public List<ILayoutFigure> getFigureChildren() {
	// return getChildren();
	// }

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub

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

}
