/******************************************************************************
 *    Ramin Assisi
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal.model.drawing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlAnyTypeImpl;
import org.apache.xmlbeans.impl.values.XmlValueDisconnectedException;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IDrawingFigure;
import org.eclipse.rcpl.IFocusable;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.images.RcplImage;
import org.eclipse.rcpl.internal.util.JOUtil;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.util.JOUtil2;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromH;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STRelFromV;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyEffects;
import com.joffice.rcpl.plugin.office.databinding.types.JOEffects;
import com.joffice.rcpl.plugin.office.databinding2.JOColorProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOPropertySize;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXDrawingFigure;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOWordDocument;
import com.joffice.rcpl.plugin.office.internal.services.JOPictureService;

import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JODrawing extends JOObject implements IFocusable, IDrawing {

	// ---------- databinding --------------------------------------------------

	JOPropertyEffects<JOEffects> effects;

	private CTDrawing ctDrawing;

	private CTR ctr;

	private IImage image;

	private long emuEffectExtentLeft = 0;
	private long emuEffectExtentTop = 0;
	private long emuEffectExtentRight = 0;
	private long emuEffectExtentBottom = 0;
	private boolean inTextBox;

	private String relationId;

	private CTShapeProperties shapeProperties;

	private boolean flipHorizontal;

	private boolean flipVertical;

	private CTTwoCellAnchor ctTwoCellAnchor;

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	/**
	 * Constructor for Spreadsheet images
	 * 
	 * @param document
	 * @param anchorObject
	 * @param ctDrawing
	 * @param ctTwoCellAnchor
	 * @param childObject
	 */
	public JODrawing(IDocument document, JOObject anchorObject,
			org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing ctDrawing,
			CTTwoCellAnchor ctTwoCellAnchor, boolean childObject) {
		super(document, anchorObject, ctDrawing, ctTwoCellAnchor, childObject, false, -1);
		this.ctTwoCellAnchor = ctTwoCellAnchor;
		updateFromXml();
	}

	/**
	 * @param document
	 * @param anchorObject
	 * @param ctDrawing
	 * @param ctOneCellAnchor
	 * @param childObject
	 */
	public JODrawing(IDocument document, JOObject anchorObject,
			org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing ctDrawing,
			CTOneCellAnchor ctOneCellAnchor, boolean childObject) {
		super(document, anchorObject, ctDrawing, ctOneCellAnchor, childObject, false, -1);
	}

	public JODrawing(IDocument document, JOObject anchorObject,
			org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing ctDrawing,
			CTAbsoluteAnchor ctAbsoluteAnchor, boolean childObject) {
		super(document, anchorObject, ctDrawing, ctAbsoluteAnchor, childObject, false, -1);
	}

	/**
	 * @param document
	 * @param ctDrawing
	 */
	public JODrawing(IDocument document, JOObject anchorObject, CTR ctr, CTDrawing ctDrawing, boolean childObject) {
		super(document, anchorObject, ctr, ctDrawing, childObject, false, -1);
		this.ctDrawing = ctDrawing;
		this.ctr = ctr;
		updateFromXml();
	}

	@Override
	public ILayoutFigure getLayoutFigure() {
		if (getEditorFigure() != null) {
			if (layoutFigure == null) {
				layoutFigure = createLayoutFigure();
			}
		}
		return layoutFigure;
	}

	private void createImage(CTGraphicalObjectData graphicalData) {
		if (graphicalData == null) {
			setImage(Rcpl.resources().getImage("parrot", 16, 16)); //$NON-NLS-1$
			return;
		}
		XmlObject[] pics = selectPath(graphicalData, "nsalias", //$NON-NLS-1$
				Rcpl.NS_PICTURE, "pic"); //$NON-NLS-1$

		for (XmlObject pic : pics) {

			if (pic instanceof XmlAnyTypeImpl) {

				HashMap<String, String> picMap = JOUtil.parseNode(graphicalData.getDomNode());

				relationId = picMap.get(
						"/a:graphicData/pic:pic/pic:nvPicPr/pic:cNvPr/pic:cNvPicPr/a:picLocks/pic:blipFill/a:blip/r:embed");

				try {
					IImage image = getDocument().getPart().getImageByRelationId(relationId);
					image.setWidth(getWidthPixel());
					image.setHeight(getHeightPixel());
					setImage(image);
				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}

				// try {
				// pic = CTPicture.Factory.parse(graphicalData.getDomNode());
				//
				// System. out.();
				// } catch (XmlException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }

				// attributeName: pic:cNvPr/id attributeValue: 0
				// attributeName: pic:cNvPr/name attributeValue: Picture 1
				// attributeName: a:picLocks/noChangeAspect attributeValue: 1
				// attributeName: a:picLocks/noChangeArrowheads attributeValue:
				// 1

				// attributeName: a:blip/cstate attributeValue: print
				// attributeName: pic:spPr/bwMode attributeValue: auto
				// attributeName: a:off/x attributeValue: 0
				// attributeName: a:off/y attributeValue: 0
				// attributeName: a:ext/cx attributeValue: 3448135
				// attributeName: a:ext/cy attributeValue: 4110176
				// attributeName: a:prstGeom/prst attributeValue: rect
				// attributeName: a:ln/w attributeValue: 9525
				// attributeName: a:miter/lim attributeValue: 800000

				return;
			}

			if (pic instanceof CTPicture) {
				CTPicture picture = (CTPicture) pic;

				// CTPictureNonVisual nonVisual = picture.getNvPicPr();
				initShapeProperties(picture.getSpPr());

				// ---------- fill properties ----------------------------------

				CTBlipFillProperties fillProperties = picture.getBlipFill();
				// long dpi = fillProperties.getDpi();
				// boolean rotateWithShape = fillProperties.getRotWithShape();
				CTRelativeRect srcRect = fillProperties.getSrcRect();
				if (srcRect != null) {
					setCropTop(srcRect.getT());
					setCropBottom(srcRect.getB());
					setCropLeft(srcRect.getL());
					setCropRight(srcRect.getR());
				}

				// CTStretchInfoProperties strechInfoProperties = fillProperties
				// .getStretch();
				// CTTileInfoProperties tileInfoProperties = fillProperties
				// .getTile();

				relationId = fillProperties.getBlip().getEmbed();

				try {
					IImage res = getDocument().getPart().getImageByRelationId(relationId);
					setImage(res);
					res.setWidth(getWidthPixel());
					res.setHeight(getHeightPixel());
				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}

			} else {
				setImage(Rcpl.resources().getImage("parrot", 16, 16)); //$NON-NLS-1$
				return;
			}
		}

	}

	private float rotation;

	/**
	 * @param shapeProps
	 */
	private void initShapeProperties(CTShapeProperties shapeProps) {
		if (shapeProps != null) {
			this.shapeProperties = shapeProps;
			CTEffectList effectList = shapeProperties.getEffectLst();
			if (effectList != null) {
				effects = new JOPropertyEffects<JOEffects>(this, shapeProperties, effectList);
			}
			shapeProperties.getBlipFill();
			shapeProperties.getBwMode();
			shapeProperties.getCustGeom();
			shapeProperties.getEffectDag();
			shapeProperties.getExtLst();
			shapeProperties.getGradFill();
			shapeProperties.getGrpFill();
			CTLineProperties ctLineProperties = shapeProperties.getLn();
			if (ctLineProperties != null) {
				lineColorProperty = new JOColorProperty(this, shapeProperties, ctLineProperties, "SolidFill", null, //$NON-NLS-1$
						false, null);
				lineWidthProperty = new JOEmuProperty(this, shapeProperties, ctLineProperties, "W", null, //$NON-NLS-1$
						EValueType.MEASURMENT_ALWAYS_POINTS);
			}

			shapeProperties.getNoFill();
			shapeProperties.getPattFill();
			shapeProperties.getPrstGeom();
			shapeProperties.getScene3D();
			CTSolidColorFillProperties ctSolidColorFillProperties = shapeProperties.getSolidFill();
			if (ctSolidColorFillProperties != null) {
				fillColorProperty = new JOColorProperty(this, null, shapeProperties, "SolidFill", null, false, null); //$NON-NLS-1$
			}

			shapeProperties.getSp3D();
			CTTransform2D transform = shapeProperties.getXfrm();
			if (transform != null) {
				rotation = transform.getRot() / 60000.0f;
				CTPositiveSize2D ext = transform.getExt();
				if (ext != null) {
					setWidth(new JOEmuProperty(this, transform, ext, "Cx", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					setHeight(new JOEmuProperty(this, transform, ext, "Cy", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
				}
				CTPoint2D ctPoint2D = shapeProperties.getXfrm().getOff();
				if (ctPoint2D != null) {
					xOff = new JOEmuProperty(this, shapeProperties.getXfrm(), shapeProperties.getXfrm().getOff(), "X", //$NON-NLS-1$
							null, EValueType.MEASUREMENT);
					yOff = new JOEmuProperty(this, shapeProperties.getXfrm(), shapeProperties.getXfrm().getOff(), "Y", //$NON-NLS-1$
							null, EValueType.MEASUREMENT);

					xOff.get();
					yOff.get();
				}
				flipHorizontal = transform.getFlipH();
				flipVertical = transform.getFlipV();
			}
		}
	}

	public CTDrawing getDrawing() {
		return ctDrawing;
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		if (isAsCharacter()) {
			IDrawingFigure f = new JOFXDrawingFigure(this);
			return f;
		}
		IDrawingFigure f = new JOFXDrawingFigure(this);
		return f;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void updateFromXml() {

		if (getDocument().isWord()) {

			List<CTAnchor> anchors1 = ctDrawing.getAnchorList();
			List<CTInline> inlines1 = ctDrawing.getInlineList();

			if (anchors1.isEmpty() && inlines1.isEmpty()) {

				Map<String, String> map = JOUtil.parseNode(ctDrawing.getDomNode());

				for (String key : map.keySet()) {

					// System. out.("key: " + key + " value: "
					// + map.get(key));

					if (key.endsWith("/a:prstGeom/prst")) {

						String v = map.get(key);

						String svgName = null;

						if ("rightArrow".equals(v)) {
							svgName = "shape_right_arrow";
						}

						if (svgName != null) {
							image = Rcpl.resources().getImage(v, 16, 16);
							new JOPictureService().addSvgImage(v);
							break;
						}
						// image.getFx();

						// System. out.();
						//
						// hAnchor = JOLayoutAnchor.CHARACTER;
						//
						// setWidth(new JOEmuProperty(this, null, null,
						// "Cx", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
						// double w = getWidthPixel();
						//
						// setHeight(new JOEmuProperty(this, null, null,
						// "Cy", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					}
				}

				return;

			}

			CTAnchor[] anchors = ctDrawing.getAnchorArray();
			for (CTAnchor ctAnchor : anchors) {
				allowOverlap = ctAnchor.getAllowOverlap();

				behindDoc = ctAnchor.getBehindDoc();
				ctAnchor.getCNvGraphicFramePr();
				ctAnchor.getDistB();
				ctAnchor.getDistL();
				ctAnchor.getDistR();
				ctAnchor.getDistT();
				ctAnchor.getDocPr();
				ctAnchor.getEffectExtent();
				CTPositiveSize2D ext = ctAnchor.getExtent();
				if (ext != null) {
					setWidth(new JOEmuProperty(this, ctAnchor, ext, "Cx", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					double w = getWidthPixel();

					setHeight(new JOEmuProperty(this, ctAnchor, ext, "Cy", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
				}
				CTGraphicalObject graphicalObject = ctAnchor.getGraphic();
				CTGraphicalObjectData gData = null;
				if (graphicalObject != null) {
					gData = graphicalObject.getGraphicData();
				}
				ctAnchor.getHidden();
				ctAnchor.getLayoutInCell();
				ctAnchor.getLocked();

				CTPosH posH = ctAnchor.getPositionH();
				if (posH != null) {
					setX(new JOEmuProperty(this, ctAnchor, ctAnchor.getPositionH(), "PosOffset", null, //$NON-NLS-1$
							EValueType.MEASUREMENT));

					double x = getXPixel();
					STRelFromH.Enum en = posH.getRelativeFrom();
					if (en.equals(STRelFromH.CHARACTER)) {
						hAnchor = ILayoutAnchor.CHARACTER;
					} else if (en.equals(STRelFromH.COLUMN)) {
						hAnchor = ILayoutAnchor.COLUMN;
					} else if (en.equals(STRelFromH.INSIDE_MARGIN)) {
						hAnchor = ILayoutAnchor.INSIDE_MARGIN;
					} else if (en.equals(STRelFromH.LEFT_MARGIN)) {
						hAnchor = ILayoutAnchor.LEFT_MARGIN;
					} else if (en.equals(STRelFromH.MARGIN)) {
						hAnchor = ILayoutAnchor.MARGIN;
					} else if (en.equals(STRelFromH.OUTSIDE_MARGIN)) {
						hAnchor = ILayoutAnchor.OUTSIDE_MARGIN;
					} else if (en.equals(STRelFromH.PAGE)) {
						hAnchor = ILayoutAnchor.PAGE;
					} else if (en.equals(STRelFromH.RIGHT_MARGIN)) {
						hAnchor = ILayoutAnchor.RIGHT_MARGIN;
					}
				}

				CTPosV posV = ctAnchor.getPositionV();

				if (posV != null) {
					// setY(posV.getPosOffset());
					setY(new JOEmuProperty(this, ctAnchor, ctAnchor.getPositionV(), "PosOffset", null, //$NON-NLS-1$
							EValueType.MEASUREMENT));

					double y = getYPixel();

					STRelFromV.Enum env = posV.getRelativeFrom();
					if (env.equals(STRelFromV.LINE)) {
						vAnchor = ILayoutAnchor.LINE;
					} else if (env.equals(STRelFromV.PARAGRAPH)) {
						vAnchor = ILayoutAnchor.PARAGRAPH;
					} else if (env.equals(STRelFromV.INSIDE_MARGIN)) {
						vAnchor = ILayoutAnchor.INSIDE_MARGIN;
					} else if (env.equals(STRelFromV.TOP_MARGIN)) {
						vAnchor = ILayoutAnchor.TOP_MARGIN;
					} else if (env.equals(STRelFromV.MARGIN)) {
						vAnchor = ILayoutAnchor.MARGIN;
					} else if (env.equals(STRelFromV.OUTSIDE_MARGIN)) {
						vAnchor = ILayoutAnchor.OUTSIDE_MARGIN;
					} else if (env.equals(STRelFromV.PAGE)) {
						vAnchor = ILayoutAnchor.PAGE;
					} else if (env.equals(STRelFromV.BOTTOM_MARGIN)) {
						vAnchor = ILayoutAnchor.RIGHT_MARGIN;
					}
				}
				// ctAnchor.get

				zOrder = ctAnchor.getRelativeHeight();

				// CTPoint2D simplePos = ctAnchor.getSimplePos();
				// boolean simplePos2 = ctAnchor.getSimplePos2();
				// CTWrapNone wrapNone = ctAnchor.getWrapNone();
				// CTWrapSquare warpSquare = ctAnchor.getWrapSquare();
				// CTWrapThrough wrapThrough = ctAnchor.getWrapThrough();
				// CTWrapTight wrapTight = ctAnchor.getWrapTight();
				// CTWrapTopBottom wrapTopBottom =
				// ctAnchor.getWrapTopAndBottom();

				createImage(gData);

			}
			CTInline[] inlines = ctDrawing.getInlineArray();
			for (CTInline ctInline : inlines) {

				// CTNonVisualGraphicFrameProperties novisualGraphicsPr =
				// ctInline
				// .getCNvGraphicFramePr();
				// long distB = ctInline.getDistB();
				// long distL = ctInline.getDistL();
				// long distR = ctInline.getDistR();
				// long distT = ctInline.getDistT();
				CTNonVisualDrawingProps drawingProps = ctInline.getDocPr();
				drawingProps.getDescr();
				drawingProps.getExtLst();
				drawingProps.getHidden();
				drawingProps.getHlinkClick();
				drawingProps.getHlinkHover();
				drawingProps.getId();
				drawingProps.getName();
				CTEffectExtent effectExtent = ctInline.getEffectExtent();
				if (effectExtent != null) {
					emuEffectExtentLeft = effectExtent.getL();
					emuEffectExtentRight = effectExtent.getR();
					emuEffectExtentTop = effectExtent.getT();
					emuEffectExtentBottom = effectExtent.getB();
				}

				CTPositiveSize2D ext = ctInline.getExtent();
				if (ext != null) {
					setWidth(new JOEmuProperty(this, ctInline, ext, "Cx", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
					setHeight(new JOEmuProperty(this, ctInline, ext, "Cy", null, EValueType.MEASUREMENT)); //$NON-NLS-1$
				}
				CTGraphicalObject graphicalObject = ctInline.getGraphic();
				CTGraphicalObjectData graphicalData = graphicalObject.getGraphicData();
				try {
					createImage(graphicalData);
				} catch (Exception ex) {
					// LOGGER.error("", ex); //$NON-NLS-1$
				}
				// String uriString = graphicalData.getUri();

			}
		} else if (getDocument().isSpreadsheet()) {
			org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture pic = ctTwoCellAnchor.getPic();
			if (pic != null) {
				CTBlipFillProperties ctBlipFillProperties = pic.getBlipFill();
				CTBlip ctBlip = ctBlipFillProperties.getBlip();
				relationId = ctBlip.getEmbed();
				image = getDocument().getPart().getImageByRelationId(relationId);
				initShapeProperties(pic.getSpPr());
				pic.getFPublished();
				pic.getMacro();
				pic.getNvPicPr();
				pic.getStyle();
			}

		}
	}

	@Override
	public long getEmuEffectExtentLeft() {
		return emuEffectExtentLeft;
	}

	public void setEmuEffectExtentLeft(long emuEffectExtentLeft) {
		this.emuEffectExtentLeft = emuEffectExtentLeft;
	}

	@Override
	public long getEmuEffectExtentTop() {
		return emuEffectExtentTop;
	}

	public void setEmuEffectExtentTop(long emuEffectExtentTop) {
		this.emuEffectExtentTop = emuEffectExtentTop;
	}

	@Override
	public long getEmuEffectExtentRight() {
		return emuEffectExtentRight;
	}

	public void setEmuEffectExtentRight(long emuEffectExtentRight) {
		this.emuEffectExtentRight = emuEffectExtentRight;
	}

	@Override
	public long getEmuEffectExtentBottom() {
		return emuEffectExtentBottom;
	}

	public void setEmuEffectExtentBottom(long emuEffectExtentBottom) {
		this.emuEffectExtentBottom = emuEffectExtentBottom;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void boundsChanged2(Rectangle2D newBounds) {
		double x1 = 0;
		double y1 = 0;
		Rectangle2D r = newBounds;
		if (getDocument() instanceof JOWordDocument) {
			try {
				if (getVAnchor() == ILayoutAnchor.PAGE) {

					y1 = r.getMinY() - getPage().getY2();
					// TODO
				} else if (getVAnchor() == ILayoutAnchor.COLUMN) {
					y1 = r.getMinY() - getPage().getY2();
				} else if (getVAnchor() == ILayoutAnchor.MARGIN) {
					y1 = r.getMinY() - (getPage().getY2() + getSection().getTopMarginPixel(getPage().getPageNumber()));
				} else if (getVAnchor() == ILayoutAnchor.PARAGRAPH || getVAnchor() == ILayoutAnchor.TEXT) {
					y1 = r.getMinY() - getVAnchorObject().getLayoutFigure().getY2();
				}

				if (getHAnchor() == ILayoutAnchor.PAGE) {
					x1 = r.getMinX() - getPage().getX2();
				} else if (getHAnchor() == ILayoutAnchor.COLUMN) {
					x1 = r.getMinX() - getPage().getX2();
				} else if (getHAnchor() == ILayoutAnchor.MARGIN) {
					x1 = r.getMinX() - (getPage().getX2() + getSection().getLeftMargin());
				} else if (getHAnchor() == ILayoutAnchor.PARAGRAPH || getHAnchor() == ILayoutAnchor.TEXT) {
					x1 = r.getMinX() - getVAnchorObject().getLayoutFigure().getX2();
				}
			} catch (Exception ex) {
				RCPLModel.logError(ex);
			}
		}

		r = JOUtil2.setPosition(r, x1, y1);
		// setDirtyLayout(true);
		setDirtyContent(true);

		try {
			// ---------- first update model data ------------------------------

			// getX().set(x1);
			// getY().set(y1);

			// ----------- update XML now --------------------------------------

			CTAnchor[] anchors = ctDrawing.getAnchorArray();
			if (anchors.length > 0) {
				for (CTAnchor ctAnchor : anchors) {
					ctAnchor.getCNvGraphicFramePr();
					CTPositiveSize2D ext = ctAnchor.getExtent();
					if (ext != null) {
						ext.setCx((long) JOConversion.pixelToEmu(r.getWidth()));
						ext.setCy((long) JOConversion.pixelToEmu(r.getHeight()));
					}
					CTPosH posH = ctAnchor.getPositionH();
					if (posH != null) {
						if (getHAnchor() == ILayoutAnchor.PAGE) {
							// x1 = r.x - pageBounds.x;
						} else if (getHAnchor() == ILayoutAnchor.COLUMN) {
							x1 = x1 - getSection().getLeftMargin();
						} else if (getHAnchor() == ILayoutAnchor.MARGIN) {
							x1 = x1 - getSection().getLeftMargin();
						} else if (getHAnchor() == ILayoutAnchor.PARAGRAPH || getHAnchor() == ILayoutAnchor.TEXT) {
							x1 = x1 - getSection().getLeftMargin();
						}

						posH.setPosOffset((int) JOConversion.pixelToEmu(x1));
					}
					CTPosV posV = ctAnchor.getPositionV();
					if (posV != null) {
						posV.setPosOffset((int) JOConversion.pixelToEmu(r.getMinY()));
					}
				}
			} else {
				CTInline[] inlines = ctDrawing.getInlineArray();
				for (CTInline ctInline : inlines) {
					CTPositiveSize2D positiveSize2D = ctInline.getExtent();
					if (positiveSize2D != null) {

						// positiveSize2D.setCx((long) siz.getWidth().toEmu());
						// positiveSize2D.setCy((long) siz.getHeight().toEmu());
					}
				}
			}

			changeWidth(r.getWidth());
			changeHeight(r.getHeight());

			if (isAsCharacter()) {
				getVAnchorObject().setDirtyContent(true);
				((JOParagraph) getVAnchorObject()).updateFromXml();
				getVAnchorObject().setDirtyLayout(true);
				getDocument().getEditor().layoutDocument();
			}

		} catch (XmlValueDisconnectedException e) {
			dispose();
			RCPLModel.logError(e);
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean dispose() {
		super.dispose();
		try {
			getDocument().setDirty(true);
			getVAnchorObject().setDirtyContent(true);
			getVAnchorObject().setDirtyLayout(true);
			// CTR ctr = (CTR) getXmlParent();
			CTDrawing[] drawings = ctr.getDrawingArray();
			int i = 0;
			for (CTDrawing d : drawings) {
				if (d == ctDrawing) {
					ctr.removeDrawing(i);
					break;
				}
				i++;
			}
			getDocument().setDirty(true);
			PackagePart part = getDocument().getPart().getPackagePartByRelationId(relationId);
			if (part != null) {
				part.getPackage().removePart(part);
			}
			try {
				getDocument().getPart().removeRelationPart(relationId);
			} catch (Exception ex) {
				// TODOO:
			}

			getDocument().getEditor().layoutDocument();
			// !!!

			// if (getSvg() != null && getSvg().getImageFile() != null) {
			// getSvg().getImageFile().delete();
			// }

		} catch (XmlValueDisconnectedException e) {
			RCPLModel.logError(e);
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		if (getLayoutFigure() != null && getLayoutFigure().getParentFigure() != null) {
			getLayoutFigure().getParentFigure().remove(getLayoutFigure());
		}
		if (getVAnchorObject() != null) {
			getVAnchorObject().setDirtyLayout(true);
		}
		return true;
	}

	public boolean isInTextBox() {
		return inTextBox;
	}

	public void setInTextBox(boolean inTextBox) {
		this.inTextBox = inTextBox;
	}

	@Override
	public String getDisplayName() {
		return "Drawing";
	}

	/**
	 * @return
	 */
	public JOPropertyEffects<JOEffects> getEffects() {
		return effects;
	}

	/**
	 * @param effects
	 */
	public void setEffects(JOPropertyEffects<JOEffects> effects) {
		this.effects = effects;
	}

	@Override
	public boolean isPageBreakBefore() {
		return false;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setZOrder(double zOrder) {
		super.setZOrder(zOrder);
		if (xmlObject instanceof CTDrawing) {
			CTDrawing ctD = (CTDrawing) xmlObject;
			ctD.getAnchorArray()[0].setRelativeHeight((long) zOrder);
			getDocument().setDirty(true);
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setZOrderBehindDoc(boolean behindDoc) {
		if (xmlObject instanceof CTDrawing) {
			CTDrawing ctD = (CTDrawing) xmlObject;
			ctD.getAnchorArray()[0].setBehindDoc(behindDoc);
			getDocument().setDirty(true);
		}
	}

	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getRelationId() {
		return relationId;
	}

	// public void setLineColorProperty(JOColorProperty lineColorProperty) {
	// this.lineColorProperty = lineColorProperty;
	// }

	// public void setLineWidthProperty(JOEmuProperty lineWidthProperty) {
	// this.lineWidthProperty = lineWidthProperty;
	// }

	public CTShapeProperties getShapeProperties() {
		return shapeProperties;
	}

	@Override
	public void setBorderColor(IColor borderColor) {
		if (lineColorProperty == null) {
			CTLineProperties ctLineProperties = shapeProperties.addNewLn();
			lineColorProperty = new JOColorProperty(this, shapeProperties, ctLineProperties, "SolidFill", null, false, //$NON-NLS-1$
					null);
		}

		lineColorProperty.set(borderColor);
	}

	/**
	 * @param fillColor
	 */
	public void setFillColor(IColor fillColor) {
		if (fillColorProperty == null) {
			fillColorProperty = new JOColorProperty(this, null, shapeProperties, "SolidFill", null, false, null); //$NON-NLS-1$
		}
		fillColorProperty.set(fillColor);
	}

	/**
	 * @param width
	 */
	public void setBorderWidth(int width) {
		if (lineWidthProperty == null) {
			CTLineProperties ctLineProperties = shapeProperties.getLn();
			if (ctLineProperties == null) {
				ctLineProperties = shapeProperties.addNewLn();
			}
			lineWidthProperty = new JOEmuProperty(this, shapeProperties, ctLineProperties, "W", null, //$NON-NLS-1$
					EValueType.MEASURMENT_ALWAYS_POINTS);
		}
		lineWidthProperty.set(width);

	}

	public boolean isFlipHorizontal() {
		return flipHorizontal;
	}

	public boolean isFlipVertical() {
		return flipVertical;
	}

	@Override
	public JOPropertySize getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWidthPixel(double width) {
		// TODO Auto-generated method stub
		super.setWidthPixel(width);
	}

	@Override
	public IImage getImage() {
		return image;
	}

	public void setImage(IImage image) {
		this.image = image;
	}

}
