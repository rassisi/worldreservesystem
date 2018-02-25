package com.joffice.rcpl.plugin.office.internal.model.word;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlValueDisconnectedException;
import org.eclipse.rcpl.EnConnector;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IFocusable;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.resources.JOResource;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyOpacity;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOShapeType;
import com.joffice.rcpl.plugin.office.databinding2.JOBoolean;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOStringProperty;
import com.joffice.rcpl.plugin.office.internal.JOfficeFactory;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JOPict extends JOObject implements IFocusable, IPict {

	// ---------- data binding 2 -----------------------------------------------

	private JOBoolean filled;

	private JOBoolean stroked;

	private JOStringProperty textPath;

	// ---------- data binding -------------------------------------------------

	private boolean strokedOverwrite;

	private JOPropertyOpacity<Double> opacity;

	private JOResource imageResource;

	private JOVml vml;

	private EnConnector connector;

	private JOShapeType.Enum shapeType = JOShapeType.Enum.UNDEFINED;

	private boolean flipY = false;

	private List<JOEmu> polygon;

	private XmlObject[] rects;

	private XmlObject[] lines;

	private XmlObject[] roundrects;

	private XmlObject[] shapes;

	private XmlObject[] shapeTypes;

	private boolean textBox;

	/**
	 * @param document
	 * @param paragraph
	 */
	public JOPict(IDocument document, JOObject anchorObject, XmlObject parent, CTPicture ctPicture,
			boolean childObject) {
		super(document, anchorObject, parent, ctPicture, childObject, false, -1);
		updateFromXml();

		// if (vml != null) {
		// Point2D siz = vml.getSize();
		// setWidthPixel(siz.getX());
		// setHeightPixel(siz.getY());
		// }

	}

	// public int getWidth() {
	// return getSize().x; // - 2 * OOXMLMovableFigure.HANDLE_MARGIN - 7;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.OOXMLTextLevelObject#
	 * getTextLevelFigure()
	 */
	@Override
	public ILayoutFigure createLayoutFigure() {

		if (textBox || getShapeType().equals(JOShapeType.Enum.TEXTBOX)) {
			return new JOfficeFactory().createPictFigure(this);
		}
		if (rects != null && rects.length > 0) {
			return new JOfficeFactory().createPictFigure(this);
		}
		if (roundrects != null && roundrects.length > 0) {
			return new JOfficeFactory().createPictFigure(this);
		}
		if (lines != null && lines.length > 0) {
			return new JOfficeFactory().createPictFigure(this);
		}
		if (shapes != null && shapes.length > 0) {
			return new JOfficeFactory().createPictFigure(this);
		}
		// LOGGER.error("undefined shape"); //$NON-NLS-1$
		return null;
	}

	@Override
	public void updateFromXml() {
		Rcpl.profile();
		CTPicture ctPicture = (CTPicture) getXmlObject();
		try {

			// ---------- VML --------------------------------------------

			rects = selectPath(ctPicture, "v", //$NON-NLS-1$
					Rcpl.NS_MS_VML, "rect"); //$NON-NLS-1$

			lines = selectPath(ctPicture, "v", //$NON-NLS-1$
					Rcpl.NS_MS_VML, "line"); //$NON-NLS-1$

			roundrects = selectPath(ctPicture, "v", //$NON-NLS-1$
					Rcpl.NS_MS_VML, "roundrect"); //$NON-NLS-1$
			shapes = selectPath(ctPicture, "v", //$NON-NLS-1$
					Rcpl.NS_MS_VML, "shape"); //$NON-NLS-1$
			shapeTypes = selectPath(ctPicture, "v", //$NON-NLS-1$
					Rcpl.NS_MS_VML, "shapetype"); //$NON-NLS-1$

			if (rects != null || shapes != null || shapeTypes != null || lines != null) {
				vml = new JOVml(getDocument(), this, rects, roundrects, lines, shapes, shapeTypes);
				// return;
			}

			Iterator<ILayoutObject> it = iterator();
			while (it.hasNext()) {
				ILayoutObject l = it.next();
				if (l instanceof JOTextbox) {
					textBox = true;
				}
				l.setZOrder(getZOrder());
			}

		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		Rcpl.profileEnd();
	}

	@Override
	public void boundsChanged2(Rectangle2D newBounds) {

		double x1 = 0;
		double y1 = 0;
		Rectangle2D r = newBounds; // .getCopy();

		try {
			double x = getPage().getX2();
			double y = getPage().getY2();
			if (getVAnchor() == ILayoutAnchor.PAGE) {
				y1 = r.getMinY() - y;
				// TODO
			} else if (getVAnchor() == ILayoutAnchor.COLUMN) {
				y1 = r.getMinY() - y;
			} else if (getVAnchor() == ILayoutAnchor.MARGIN) {
				y1 = r.getMinY() - (y + getSection().getTopMarginPixel(getPage().getPageNumber()));
			} else if (getVAnchor() == ILayoutAnchor.PARAGRAPH || getVAnchor() == ILayoutAnchor.TEXT) {
				double paragraphBoundsY = getVAnchorObject().getLayoutFigure().getY2();
				y1 = r.getMinY(); // - paragraphBoundsY;
			}

			if (getHAnchor() == ILayoutAnchor.PAGE) {
				x1 = r.getMinX() - x;
			} else if (getHAnchor() == ILayoutAnchor.COLUMN) {
				x1 = r.getMinX() - x;
			} else if (getHAnchor() == ILayoutAnchor.MARGIN) {
				x1 = r.getMinX() - (x + getSection().getLeftMargin());
			} else if (getHAnchor() == ILayoutAnchor.PARAGRAPH || getHAnchor() == ILayoutAnchor.TEXT) {
				double paragraphBoundsX = getVAnchorObject().getLayoutFigure().getX2();
				x1 = r.getMinX(); // - paragraphBoundsX;
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}

		setDirtyContent(true);
		if (vml != null) {
			setXPixel(x1);
			setYPixel(y1);
			setWidthPixel(newBounds.getWidth());
			setHeightPixel(newBounds.getHeight());
			Rectangle2D r2 = new Rectangle2D(x1, y1, r.getWidth(), r.getHeight());
			vml.updateStyleString(r2);
		}
	}

	public JOResource getImageResource() {
		return imageResource;
	}

	public void setImageResource(JOResource imageResource) {
		this.imageResource = imageResource;
	}

	public JOVml getVml() {
		return vml;
	}

	public void setVml(JOVml vml) {
		this.vml = vml;
	}

	public double[] getPolygonPixel() {
		double[] result = new double[getPolygon().size()];
		int i = 0;
		for (JOEmu emu : getPolygon()) {
			result[i++] = emu.toPixel();
		}
		return result;
	}

	public List<JOEmu> getPolygon() {
		if (polygon == null) {
			polygon = new ArrayList<JOEmu>();
		}
		return polygon;
	}

	public void setPolygon(List<JOEmu> polygon) {
		this.polygon = polygon;
	}

	public EnConnector getConnector() {
		return connector;
	}

	public void setConnector(EnConnector connector) {
		this.connector = connector;
	}

	public boolean isFlipY() {
		return flipY;
	}

	public void setFlipY(boolean flipY) {
		this.flipY = flipY;
	}

	public JOShapeType.Enum getShapeType() {
		return shapeType;
	}

	public void setShapeType(JOShapeType.Enum shapeType) {
		this.shapeType = shapeType;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean dispose() {
		super.dispose();
		Object[] os = getChildren();
		for (Object object : os) {
			JOObject l = (JOObject) object;
			l.dispose();
		}
		getDocument().setDirty(true);
		getVAnchorObject().setDirtyContent(true);

		CTPicture ctPicture = (CTPicture) getXmlObject();

		CTR ctr = (CTR) getXmlParent();
		try {
			CTPicture[] pictures = ctr.getPictArray();
			int i = 0;
			for (CTPicture ctPicture2 : pictures) {
				if (ctPicture2 == ctPicture) {
					ctr.removePict(i);
					break;
				}
				i++;
			}
		} catch (XmlValueDisconnectedException ex) {
			// ignore
		}
		return true;
	}

	@Override
	public String toString() {
		return getShapeType().getDisplayName() + " / " + super.toString(); //$NON-NLS-1$
	}

	@Override
	public String getDisplayName() {
		return getShapeType().getDisplayName();
	}

	@Override
	public boolean isPageBreakBefore() {
		return false;
	}

	public JOPropertyOpacity<Double> getOpacity() {
		return opacity;
	}

	public void setOpacity(JOPropertyOpacity<Double> opacity) {
		this.opacity = opacity;
	}

	public XmlObject[] getShapes() {
		return shapes;
	}

	/**
	 * @param filled
	 */
	public void setFilled(JOBoolean filled) {
		this.filled = filled;
	}

	/**
	 * @param stroked
	 */
	public void setStroked(JOBoolean stroked) {
		this.stroked = stroked;
	}

	/**
	 * @return
	 */
	public boolean isFilled() {
		if (filled == null) {
			return true;
		}
		return filled != null && filled.get() != null && filled.get();
	}

	/**
	 * @return
	 */
	public boolean isStroked() {
		boolean result = false;
		if (strokedOverwrite) {
			result = true;
		} else {
			result = lineWidth != null;
		}
		if (stroked != null) {
			result = stroked != null && stroked.get() != null && stroked.get();
		}
		return result;
	}

	public boolean isStrokedOverwrite() {
		return strokedOverwrite;
	}

	public void setStrokedOverwrite(boolean strokedOverwrite) {
		this.strokedOverwrite = strokedOverwrite;
	}

	public JOStringProperty getTextPath() {
		return textPath;
	}

	public void setTextPath(JOStringProperty textPath) {
		this.textPath = textPath;
	}

	@Override
	public void setZOrder(double zOrder) {
		super.setZOrder(zOrder);
		if (getVml() != null) {
			String v = "" + (long) zOrder; //$NON-NLS-1$
			getVml().setzIndexString("z-index:" + v); //$NON-NLS-1$
			getVml().updateStyleString(null);
			getDocument().setDirty(true);
		}
	}

	@Override
	public void setZOrderBehindDoc(boolean behindDoc) {
	}

	@Override
	public double getWidthPixel() {
		if (width != null) {
			return width.get().toPixel();
		}
		if (size != null) {
			return size.getWidthPixel();
		}
		return 10;
	}

	@Override
	public double getHeightPixel() {
		if (height != null) {
			return height.get().toPixel();
		}
		if (size != null) {
			return size.getHeightPixel();
		}
		return 10;
	}

	@Override
	public void setX(JOEmuProperty x) {
		super.setX(x);
	}

	@Override
	public void setXPixel(double x) {
		super.setXPixel(x);
	}

	public boolean isTextBox() {
		return textBox;
	}

	@Override
	public void setHeightPixel(double height) {
		super.setHeightPixel(height);
	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
