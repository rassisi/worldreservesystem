/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office.internal.model.word;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.EnConnector;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.EnLayoutAlignment;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.resources.JOResource;
import org.eclipse.rcpl.util.JOUtil2;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;

import com.joffice.rcpl.plugin.office.JOBorder;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyOpacity;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuCentimeter;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOShapeType;
import com.joffice.rcpl.plugin.office.databinding.types.JOSize;
import com.joffice.rcpl.plugin.office.databinding2.JOBoolean;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOPropertySize;
import com.joffice.rcpl.plugin.office.databinding2.JOStringProperty;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;

import javafx.geometry.Rectangle2D;
import schemasMicrosoftComOfficeOffice.CTExtrusion;
import schemasMicrosoftComOfficeOffice.STConnectorType;
import schemasMicrosoftComOfficeWord.CTBorder;
import schemasMicrosoftComVml.CTFill;
import schemasMicrosoftComVml.CTImageData;
import schemasMicrosoftComVml.CTLine;
import schemasMicrosoftComVml.CTRect;
import schemasMicrosoftComVml.CTRoundRect;
import schemasMicrosoftComVml.CTShadow;
import schemasMicrosoftComVml.CTShape;
import schemasMicrosoftComVml.CTShapetype;
import schemasMicrosoftComVml.CTStroke;
import schemasMicrosoftComVml.CTTextPath;
import schemasMicrosoftComVml.CTTextbox;
import schemasMicrosoftComVml.STTrueFalse;

/**
 * @author ramin
 * 
 */
public class JOVml {

	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOVml.class);

	private JOPict pict;

	private String marginLeftString;
	private String marginTopString;
	private String marginRightString;
	private String marginBottomString;
	private String positionString;
	private String widthString;
	private String heightString;
	private String zIndexString;
	private String flipString;

	private String mso_wrap_distance_left;
	private String mso_wrap_distance_top;
	private String mso_wrap_distance_right;
	private String mso_wrap_distance_bottom;
	private String mso_position_vertical_relative;
	private String mso_position_horizontal_relative;
	private String mso_position_vertical;
	private String mso_position_horizontal;
	private String line_from;
	private String line_to;

	private String mso_width_percent;
	private String mso_height_percent;
	private String mso_width_relative;
	private String mso_height_relative;

	private CTPicture ctPicture;

	private List<String> notYetSupportedStyleElements = new ArrayList<String>();

	private CTShape shape;

	private CTShapetype ctShapeType;

	private CTLine line;

	private CTRect ctRect;

	private XmlObject[] rects;

	private XmlObject[] roundrects;

	private XmlObject[] lines;

	private XmlObject[] shapes;

	private XmlObject[] shapeTypes;

	@SuppressWarnings("unused")
	private IDocument document;

	public JOVml(IDocument document, JOPict pict, XmlObject[] rects, XmlObject[] roundrects, XmlObject[] lines,
			XmlObject[] shapes, XmlObject[] shapeTypes) {
		this.pict = pict;
		this.document = document;
		this.rects = rects;
		this.roundrects = roundrects;
		this.lines = lines;
		this.shapes = shapes;
		this.shapeTypes = shapeTypes;

		ctPicture = (CTPicture) pict.getXmlObject();

		// HashMap<String, String> vmlMap = JOUtil.parseNode(ctPicture
		// .getDomNode());
		//

		if (processShapTypes(ctPicture, shapeTypes)) {
		}

		if (processShape(ctPicture, shapes)) {
			return;
		}
		if (processRect(ctPicture, rects)) {
			return;
		}
		if (processRoundRects(ctPicture, roundrects)) {
			return;
		}
		if (processLines(ctPicture, lines)) {
			return;
		}

	}

	/**
	 * @param value
	 */
	private void processShapeStyle(XmlObject xmlObject) {
		try {

			String styleString = null;

			if (xmlObject instanceof CTRect) {
				styleString = ((CTRect) xmlObject).getStyle();
			} else if (xmlObject instanceof CTRoundRect) {
				styleString = ((CTRoundRect) xmlObject).getStyle();
			} else if (xmlObject instanceof CTShape) {
				CTShape ctShape = (CTShape) xmlObject;
				styleString = ctShape.getStyle();

				// if (ctShape.getTextboxArray() != null
				// && ((CTShape) xmlObject).getTextboxArray().length > 0) {
				//
				// }

				// ctShape.get

			} else if (xmlObject instanceof CTShapetype) {
				styleString = ((CTShapetype) xmlObject).getStyle();
			} else if (xmlObject instanceof CTLine) {
				styleString = ((CTLine) xmlObject).getStyle();
			}

			pict.setSize(new JOPropertySize(pict, pict.getXmlParent(), xmlObject, null, new String[] { "size" }, //$NON-NLS-1$
					EValueType.MEASUREMENT));

			StringTokenizer tok = new StringTokenizer(styleString, "; "); //$NON-NLS-1$

			// type="#_x0000_t202"
			// style="position:absolute;
			// margin-left:2.3pt;
			// margin-top:5.25pt;
			// width:71.95pt;
			// height:27pt;z-index:251660288;
			// mso-width-relative:margin;
			// mso-height-relative:margin">

			// position:absolute;
			// left:0;
			// text-align:left;
			// margin-left:174.25pt;
			// margin-top:-394.1pt;width:64.5pt;
			// height:70.5pt;
			// z-index:-251653120;
			// mso-position-horizontal-relative:text;
			// mso-position-vertical-relative:text

			while (tok.hasMoreTokens()) {
				String tokValue = tok.nextToken();
				String[] keyValue = tokValue.split(":"); //$NON-NLS-1$
				String styleKey = keyValue[0];
				String styleValue = keyValue[1];

				if (styleKey.equals("mso-next-textbox")) { //$NON-NLS-1$
					// :#_x0000_s1224"
					pict.setStrokedOverwrite(true);
				}

				if (styleKey.equals("mso-width-percent")) { //$NON-NLS-1$
					mso_width_percent = styleKey + ":" //$NON-NLS-1$
							+ styleValue;

				} else if (styleKey.equals("mso-width-relative")) { //$NON-NLS-1$
					mso_width_relative = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					if (styleValue.equalsIgnoreCase("margin")) { //$NON-NLS-1$
						// pict.setHAnchor(ILayoutAnchor.MARGIN);
					} else if (styleValue.equalsIgnoreCase("page")) { //$NON-NLS-1$
						// pict.setHAnchor(ILayoutAnchor.PAGE);
					}
				} else if (styleKey.equals("mso-height-relative")) { //$NON-NLS-1$
					mso_width_relative = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					if (styleValue.equalsIgnoreCase("margin")) { //$NON-NLS-1$
						// pict.setVAnchor(ILayoutAnchor.MARGIN);
					} else if (styleValue.equalsIgnoreCase("page")) { //$NON-NLS-1$
						// pict.setVAnchor(ILayoutAnchor.PAGE);
					}
				} else if (styleKey.equals("mso-height-percent")) { //$NON-NLS-1$
					mso_height_percent = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
				} else if (styleKey.equals("mso-width-relative")) { //$NON-NLS-1$
					mso_width_relative = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
				} else if (styleKey.equals("mso-height-relative")) { //$NON-NLS-1$
					mso_height_relative = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
				} else if (styleKey.equals("position")) { //$NON-NLS-1$
					positionString = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					if (styleValue.equals("absolute")) { //$NON-NLS-1$
						// pict.setVAnchor(ILayoutAnchor.PAGE);
						// pict.setHAnchor(ILayoutAnchor.COLUMN);
					}
				} else if (styleKey.equals("mso-position-vertical-relative")) { //$NON-NLS-1$
					mso_position_vertical_relative = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					if (styleValue.equals("page")) { //$NON-NLS-1$
						pict.setVAnchor(ILayoutAnchor.PAGE);
					} else if (styleValue.equals("text")) { //$NON-NLS-1$
						pict.setVAnchor(ILayoutAnchor.TEXT);
						pict.setVAnchorObject(pict.getRootObject());
					} else if (styleValue.equals("bottom-margin")) { //$NON-NLS-1$
						pict.setVAnchor(ILayoutAnchor.BOTTOM_MARGIN);
						pict.setVAnchorObject(pict.getRootObject());
					} else if (styleValue.equals("top-margin")) { //$NON-NLS-1$
						pict.setVAnchor(ILayoutAnchor.TOP_MARGIN);
						pict.setVAnchorObject(pict.getRootObject());
					}

				} else if (styleKey.equals("mso-position-horizontal-relative")) { //$NON-NLS-1$
					mso_position_horizontal_relative = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					if (styleValue.equals("page")) { //$NON-NLS-1$
						pict.setHAnchor(ILayoutAnchor.PAGE);
					} else if (styleValue.equals("text")) { //$NON-NLS-1$
						pict.setHAnchor(ILayoutAnchor.TEXT);
						pict.setHAnchorObject(pict.getRootObject());
					} else if (styleValue.equals("left-margin")) { //$NON-NLS-1$
						pict.setHAnchor(ILayoutAnchor.LEFT_MARGIN);
						pict.setHAnchorObject(pict.getRootObject());
					} else if (styleValue.equals("inside-margin")) { //$NON-NLS-1$
						pict.setHAnchor(ILayoutAnchor.INSIDE_MARGIN);
						pict.setHAnchorObject(pict.getRootObject());
					} else if (styleValue.equals("outside-margin")) { //$NON-NLS-1$
						pict.setHAnchor(ILayoutAnchor.OUTSIDE_MARGIN);
						pict.setVAnchorObject(pict.getRootObject());
					} else if (styleValue.equals("right-margin")) { //$NON-NLS-1$
						pict.setHAnchor(ILayoutAnchor.RIGHT_MARGIN);
						pict.setHAnchorObject(pict.getRootObject());
					}

				} else if (styleKey.equals("mso-wrap-distance-left")) { //$NON-NLS-1$
					mso_wrap_distance_left = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					// pict.setLeftMargin(new OOXMLEmuPoint(styleValue));
				} else if (styleKey.equals("mso-wrap-distance-top")) { //$NON-NLS-1$
					mso_wrap_distance_top = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					// pict.setTopMargin(new OOXMLEmuPoint(styleValue));
				} else if (styleKey.equals("mso-wrap-distance-bottom")) { //$NON-NLS-1$
					mso_wrap_distance_bottom = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					// pict.setBottomMargin(new OOXMLEmuPoint(styleValue));
				} else if (styleKey.equals("mso-wrap-distance-right")) { //$NON-NLS-1$
					mso_wrap_distance_right = styleKey + ":" //$NON-NLS-1$
							+ styleValue;
					// pict.setRightMargin(new OOXMLEmuPoint(styleValue));

				} else if (styleKey.equals("mso-position-horizontal")) { //$NON-NLS-1$
					mso_position_horizontal = styleKey + ":" + styleValue; //$NON-NLS-1$
					if (styleValue.equals("center")) { //$NON-NLS-1$
						pict.setxAlign(EnLayoutAlignment.CENTER);
					}

				} else if (styleKey.equals("mso-position-vertical")) { //$NON-NLS-1$
					mso_position_vertical = styleKey + ":" + styleValue; //$NON-NLS-1$
					if (styleValue.equals("center")) { //$NON-NLS-1$
						pict.setyAlign(EnLayoutAlignment.CENTER);
					}
				} else if (styleKey.equals("margin-left")) { //$NON-NLS-1$
					marginLeftString = styleKey + ":" + styleValue; //$NON-NLS-1$
					pict.setX(new JOEmuProperty(styleValue));
					pict.setMarginLeft(new JOEmuProperty(styleValue));
				} else if (styleKey.equals("margin-top")) { //$NON-NLS-1$
					marginTopString = styleKey + ":" + styleValue; //$NON-NLS-1$
					pict.setY(new JOEmuProperty(styleValue));
					pict.setMarginTop(new JOEmuProperty(styleValue));
				} else if (styleKey.equals("margin-right")) { //$NON-NLS-1$
					marginRightString = styleKey + ":" + styleValue; //$NON-NLS-1$
					pict.setMarginRight(new JOEmuProperty(styleValue));
				} else if (styleKey.equals("margin-bottom")) { //$NON-NLS-1$
					marginBottomString = styleKey + ":" + styleValue; //$NON-NLS-1$
					pict.setMarginBottom(new JOEmuProperty(styleValue));
				} else if (styleKey.equals("width")) { //$NON-NLS-1$
					widthString = styleKey + ":" + styleValue; //$NON-NLS-1$
				} else if (styleKey.equals("height")) { //$NON-NLS-1$
					heightString = styleKey + ":" + styleValue; //$NON-NLS-1$
				} else if (styleKey.equals("z-index")) { //$NON-NLS-1$
					zIndexString = styleKey + ":" + styleValue; //$NON-NLS-1$
					pict.setZOrder(Double.valueOf(styleValue));
				} else if (styleKey.equals("flip")) { //$NON-NLS-1$
					flipString = styleKey + ":" + styleValue; //$NON-NLS-1$
					pict.setFlipY(true);

				} else {

					// left
					// text-align

					// System. out.("not supported: " + styleKey);
					notYetSupportedStyleElements.add(styleKey + ":" //$NON-NLS-1$
							+ styleValue);
				}

				// if (fillArray != null && fillArray.length > 0) {
				// String fillC = fillArray[0].getColor2();
				// if (fillC != null) {
				// pict.setSolidFillColor(JOColorProvider.getColor(fillC));
				// }
				// } else if (fillColor != null) {
				// pict.setSolidFillColor(JOColorProvider.getColor(fillColor));
				// } else {
				// pict.setSolidFillColor(null);
				// }

			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private String createStyleString() {
		return createStyleString(null);
	}

	/**
	 * @param marginLeft
	 * @param marginTop
	 * @return
	 */
	String createStyleString(Rectangle2D newBounds) {
		StringBuffer buf = new StringBuffer();

		// type="#_x0000_t202"
		// style="position:absolute;
		// margin-left:2.3pt;
		// margin-top:5.25pt;
		// width:71.95pt;
		// height:27pt;z-index:251660288;
		// mso-width-relative:margin;
		// mso-height-relative:margin">

		// fillcolor="#919c37"

		if (positionString != null) {
			buf.append(positionString + ";"); //$NON-NLS-1$
		}
		if (mso_width_relative != null) {
			buf.append(mso_width_relative + ";"); //$NON-NLS-1$
		}
		if (mso_height_relative != null) {
			buf.append(mso_width_relative + ";"); //$NON-NLS-1$
		}
		if (mso_width_percent != null) {
			buf.append(mso_width_percent + ";"); //$NON-NLS-1$
		}
		if (mso_height_percent != null) {
			buf.append(mso_height_percent + ";"); //$NON-NLS-1$
		}
		if (mso_width_relative != null) {
			buf.append(mso_width_relative + ";"); //$NON-NLS-1$
		}
		if (mso_height_relative != null) {
			buf.append(mso_height_relative + ";"); //$NON-NLS-1$
		}
		if (marginLeftString != null) {
			if (newBounds != null) {
				buf.append(setStyleValue(marginLeftString, JOConversion.pixelToPointString(newBounds.getMinX()) + ";")); //$NON-NLS-1$
			} else {
				buf.append(marginLeftString + ";"); //$NON-NLS-1$
			}
		}
		if (marginTopString != null) {
			if (newBounds != null) {
				buf.append(setStyleValue(marginTopString, JOConversion.pixelToPointString(newBounds.getMinY()) + ";")); //$NON-NLS-1$
			} else {
				buf.append(marginTopString + ";"); //$NON-NLS-1$
			}
		}
		if (marginRightString != null) {
			buf.append(marginRightString + ";"); //$NON-NLS-1$
		}
		if (marginBottomString != null) {
			buf.append(marginBottomString + ";"); //$NON-NLS-1$
		}
		if (widthString != null) {
			if (newBounds != null) {
				buf.append(setStyleValue(widthString, JOConversion.pixelToPointString(newBounds.getWidth()) + ";")); //$NON-NLS-1$
			} else {
				buf.append(widthString + ";"); //$NON-NLS-1$
			}
		}
		if (heightString != null) {
			if (newBounds != null) {
				buf.append(setStyleValue(heightString, JOConversion.pixelToPointString(newBounds.getHeight()) + ";")); //$NON-NLS-1$
			} else {
				buf.append(heightString + ";"); //$NON-NLS-1$

			}
		}
		if (zIndexString != null) {
			buf.append(zIndexString + ";"); //$NON-NLS-1$
		}
		if (flipString != null) {
			buf.append(flipString + ";"); //$NON-NLS-1$
		}
		if (mso_wrap_distance_left != null) {
			buf.append(mso_wrap_distance_left + ";"); //$NON-NLS-1$
		}
		if (mso_wrap_distance_top != null) {
			buf.append(mso_wrap_distance_top + ";"); //$NON-NLS-1$
		}
		if (mso_wrap_distance_right != null) {
			buf.append(mso_wrap_distance_right + ";"); //$NON-NLS-1$
		}
		if (mso_wrap_distance_bottom != null) {
			buf.append(mso_wrap_distance_bottom + ";"); //$NON-NLS-1$
		}

		if (mso_position_vertical_relative != null) {
			if (newBounds != null) {
				buf.append(setStyleValue(mso_position_vertical_relative,
						JOConversion.pixelToPointString(newBounds.getMinY()) + ";")); //$NON-NLS-1$
			} else {
				buf.append(mso_position_vertical_relative + ";"); //$NON-NLS-1$
			}
		}
		if (mso_position_horizontal_relative != null) {
			if (newBounds != null) {
				buf.append(setStyleValue(mso_position_horizontal_relative,
						JOConversion.pixelToPointString(newBounds.getMinY()) + ";")); //$NON-NLS-1$
			} else {
				buf.append(mso_position_horizontal_relative + ";"); //$NON-NLS-1$
			}
		}
		if (mso_position_vertical != null) {
			buf.append(mso_position_vertical + ";"); //$NON-NLS-1$
		}
		if (mso_position_horizontal != null) {
			buf.append(mso_position_horizontal + ";"); //$NON-NLS-1$
		}

		for (String s : notYetSupportedStyleElements) {
			buf.append(s + ";"); //$NON-NLS-1$
		}
		return buf.toString();
	}

	/**
	 * @param keyValue
	 * @param value
	 * @return
	 */
	private String setStyleValue(String keyValue, String value) {
		String[] splits = keyValue.split(":"); //$NON-NLS-1$
		return splits[0] + ":" + value; //$NON-NLS-1$
	}

	private JOEmu emuShadowOffsX;

	private JOEmu emuShadowOffsY;

	/**
	 * @param ctPicture
	 * @return
	 */
	@SuppressWarnings({ "deprecation", "unused" })
	private boolean processRect(CTPicture ctPict, XmlObject[] rects) {
		Rcpl.profile();
		if (rects != null && rects.length > 0) {
			ctRect = (CTRect) rects[0];

			if (ctRect.getTextboxArray() != null && ctRect.getTextboxArray().length > 0) {
			}

			pict.setShapeType(JOShapeType.Enum.RECTANGLE);

			// should be done first, because it might be needed for children

			processShapeStyle(ctRect);

			String alt = ctRect.getAlt();
			ctRect.getAnchorlockArray();

			processBorders(ctRect.getBorderbottomArray(), ctRect.getBordertopArray(), ctRect.getBorderleftArray(),
					ctRect.getBorderrightArray(), ctRect.getBorderbottomcolor(), ctRect.getBordertopcolor(),
					ctRect.getBorderleftcolor(), ctRect.getBorderrightcolor());

			ctRect.getCalloutArray();
			ctRect.getChromakey();
			ctRect.getClass1();
			ctRect.getClientDataArray();
			ctRect.getClippathArray();
			String coordOrigin = ctRect.getCoordorigin();
			String coordSize = ctRect.getCoordsize();
			ctRect.getDgmlayout();
			ctRect.getDgmnodekind();
			ctRect.getDoubleclicknotify();
			CTExtrusion[] extrusionArray = ctRect.getExtrusionArray();

			if (extrusionArray != null && extrusionArray.length > 0) {
			}

			processFills(ctRect.getFillArray(), ctRect.getFillcolor());
			ctRect.getFormulasArray();
			ctRect.getHandlesArray();

			// enums

			STTrueFalse.Enum en = ctRect.getFilled();
			if (en != null) {
				pict.setFilled(new JOBoolean(pict, ctPict, ctRect, "Filled", null)); //$NON-NLS-1$
			}

			ctRect.getConnectortype();
			ctRect.getCliptowrap();
			ctRect.getBwmode();
			ctRect.getBwnormal();
			ctRect.getBwpure();
			ctRect.getBullet();
			ctRect.getButton();
			ctRect.getInsetmode();
			ctRect.getHr();
			ctRect.getHralign();
			ctRect.getHrnoshade();
			ctRect.getForcedash();
			ctRect.getAllowincell();
			ctRect.getAllowoverlap();
			ctRect.getClip();
			ctRect.getHrstd();

			String hRef = ctRect.getHref();

			float hrpct = ctRect.getHrpct();

			processImageData(ctRect.getImagedataArray());

			ctRect.getInsetpen();
			ctRect.getLockArray();
			ctRect.getOle();
			ctRect.getOleicon();
			ctRect.getOned();
			if (ctRect.getOpacity() != null) {
				pict.setOpacity(new JOPropertyOpacity<Double>(pict, ctPicture, ctRect, "pict_opacity")); //$NON-NLS-1$
			}
			ctRect.getPathArray();
			ctRect.getPreferrelative();
			ctRect.getPrint();
			ctRect.getRegroupid();

			CTShadow[] shadowArray = ctRect.getShadowArray();
			if (shadowArray != null) {
				for (CTShadow ctShadow : shadowArray) {
					String offset = ctShadow.getOffset();
					if (offset != null && offset.indexOf("mm") != -1) {
						offset = offset.replace("mm", "");
						String[] splits = offset.split(",");
						String sX = splits[0];
						String sY = splits[1];
						double offsX = Double.valueOf(sX);
						double offsY = Double.valueOf(sY);
						emuShadowOffsX = new JOEmuCentimeter(offsX / 10);
						emuShadowOffsY = new JOEmuCentimeter(offsY / 10);
					}
				}
			}

			ctRect.getSignaturelineArray();
			ctRect.getSignaturelineArray();
			ctRect.getSkewArray();
			ctRect.getSpid();
			ctRect.getSpt();

			String strokeWeight = ctRect.getStrokeweight();
			if (strokeWeight != null) {
				pict.setLineWidth(new JOEmuPoint(strokeWeight));
			}
			pict.setLineColor(Rcpl.colorProvider().get(ctRect.getStrokecolor()));

			if (ctRect.getStroked() != null) {
				pict.setStroked(new JOBoolean(pict, ctPicture, ctRect, "Stroked", null)); //$NON-NLS-1$
			}

			ctRect.getTarget();
			processTextBoxContent(ctRect.getTextboxArray());
			ctRect.getTextdataArray();
			ctRect.getTextpathArray();
			ctRect.getTitle();
			ctRect.getUserdrawn();
			ctRect.getUserhidden();
			ctRect.getWrapArray();
			ctRect.getWrapcoords();
			Rcpl.profileEnd();

			return true;
		}
		Rcpl.profileEnd();
		return false;
	}

	@SuppressWarnings({ "unused", "deprecation" })
	private boolean processRoundRects(CTPicture ctPicture, XmlObject[] roundrects) {
		Rcpl.profile();
		if (roundrects != null && roundrects.length > 0) {
			CTRoundRect ctRoundRect = (CTRoundRect) roundrects[0];

			// should be done first, because it might be needed for children

			processShapeStyle(ctRoundRect);

			pict.setShapeType(JOShapeType.Enum.ROUND_RECTANGLE);
			pict.setArcsize(JOUtil2.getFloat(ctRoundRect.getArcsize()));

			if (ctRoundRect.getOpacity() != null) {
				pict.setOpacity(new JOPropertyOpacity<Double>(pict, ctPicture, ctRoundRect, "pict_opacity")); //$NON-NLS-1$
			}

			String alt = ctRoundRect.getAlt();
			ctRoundRect.getAnchorlockArray();
			ctRoundRect.getBorderbottomArray();
			ctRoundRect.getBorderbottomcolor();
			ctRoundRect.getBorderleftArray();
			ctRoundRect.getBorderleftcolor();
			ctRoundRect.getBorderrightArray();
			ctRoundRect.getBorderrightcolor();
			ctRoundRect.getBordertopArray();
			ctRoundRect.getBordertopcolor();

			ctRoundRect.getCalloutArray();
			ctRoundRect.getChromakey();
			ctRoundRect.getClass1();
			ctRoundRect.getClientDataArray();
			ctRoundRect.getClippathArray();
			String coordOrigin = ctRoundRect.getCoordorigin();
			String coordSize = ctRoundRect.getCoordsize();
			ctRoundRect.getDgmlayout();
			ctRoundRect.getDgmnodekind();
			ctRoundRect.getDoubleclicknotify();
			CTExtrusion[] extrusionArray = ctRoundRect.getExtrusionArray();

			if (extrusionArray != null && extrusionArray.length > 0) {
			}

			processFills(ctRoundRect.getFillArray(), ctRoundRect.getFillcolor());
			ctRoundRect.getFormulasArray();
			ctRoundRect.getHandlesArray();

			// enums

			STTrueFalse.Enum en = ctRoundRect.getFilled();
			if (en != null) {
				pict.setFilled(new JOBoolean(pict, ctRoundRect, ctRoundRect, "Filled", null)); //$NON-NLS-1$
			}

			ctRoundRect.getConnectortype();
			ctRoundRect.getCliptowrap();
			ctRoundRect.getBwmode();
			ctRoundRect.getBwnormal();
			ctRoundRect.getBwpure();
			ctRoundRect.getBullet();
			ctRoundRect.getButton();
			ctRoundRect.getInsetmode();
			ctRoundRect.getHr();
			ctRoundRect.getHralign();
			ctRoundRect.getHrnoshade();
			ctRoundRect.getForcedash();
			ctRoundRect.getAllowincell();
			ctRoundRect.getAllowoverlap();
			ctRoundRect.getClip();
			ctRoundRect.getHrstd();

			String hRef = ctRoundRect.getHref();

			float hrpct = ctRoundRect.getHrpct();

			processImageData(ctRoundRect.getImagedataArray());

			ctRoundRect.getInsetpen();
			ctRoundRect.getLockArray();
			ctRoundRect.getOle();
			ctRoundRect.getOleicon();
			ctRoundRect.getOned();
			ctRoundRect.getPathArray();
			ctRoundRect.getPreferrelative();
			ctRoundRect.getPrint();
			ctRoundRect.getRegroupid();
			ctRoundRect.getShadowArray();
			ctRoundRect.getSignaturelineArray();
			ctRoundRect.getSignaturelineArray();
			ctRoundRect.getSkewArray();
			ctRoundRect.getSpid();
			ctRoundRect.getSpt();

			ctRoundRect.getStrokeArray();
			ctRoundRect.getStrokecolor();
			if (ctRoundRect.getStroked() != null) {
				pict.setStroked(new JOBoolean(pict, ctPicture, ctRoundRect, "Stroked", null)); //$NON-NLS-1$
			}
			String strokeWeight = ctRoundRect.getStrokeweight();
			if (strokeWeight != null) {
				pict.setLineWidth(new JOEmuPoint(strokeWeight));
			}
			pict.setLineColor(Rcpl.colorProvider().get(ctRoundRect.getStrokecolor()));

			ctRoundRect.getTarget();
			processTextBoxContent(ctRoundRect.getTextboxArray());
			ctRoundRect.getTextdataArray();
			ctRoundRect.getTextpathArray();
			ctRoundRect.getTitle();
			ctRoundRect.getUserdrawn();
			ctRoundRect.getUserhidden();
			ctRoundRect.getWrapArray();
			ctRoundRect.getWrapcoords();
			Rcpl.profileEnd();

			return true;
		}
		Rcpl.profileEnd();
		return false;
	}

	public void setNoFill() {
		if (rects != null && rects.length > 0) {
			CTRect rect = (CTRect) rects[0];
			if (rect.isSetFillcolor()) {
				rect.unsetFillcolor();
			}
			if (rect.isSetFilled()) {
				rect.unsetFilled();
			}
			rect.setFillArray(null);
		}
		if (roundrects != null && roundrects.length > 0) {
			CTRoundRect rect = (CTRoundRect) roundrects[0];
			if (rect.isSetFillcolor()) {
				rect.unsetFillcolor();
			}
			if (rect.isSetFilled()) {
				rect.unsetFilled();
			}
			rect.setFillArray(null);
		}
		if (lines != null && lines.length > 0) {
			CTLine rect = (CTLine) lines[0];
			if (rect.isSetFillcolor()) {
				rect.unsetFillcolor();
			}
			if (rect.isSetFilled()) {
				rect.unsetFilled();
			}
			rect.setFillArray(null);
		}
		if (shapes != null && shapes.length > 0) {
			CTShape rect = (CTShape) shapes[0];
			if (rect.isSetFillcolor()) {
				rect.unsetFillcolor();
			}
			if (rect.isSetFilled()) {
				rect.unsetFilled();
			}
			rect.setFillArray(null);
		}
		if (shapeTypes != null && shapeTypes.length > 0) {
			CTShapetype rect = (CTShapetype) shapeTypes[0];
			if (rect.isSetFillcolor()) {
				rect.unsetFillcolor();
			}
			if (rect.isSetFilled()) {
				rect.unsetFilled();
			}
			rect.setFillArray(null);
		}
		pict.setSolidFillColor(null);
	}

	/**
	 * @param ctPicture
	 * @param lines
	 * @return
	 */
	@SuppressWarnings({ "deprecation" })
	private boolean processLines(CTPicture ctPicture, XmlObject[] lines) {
		if (lines != null && lines.length > 0) {
			Rcpl.profile();

			line = (CTLine) lines[0];

			// should be done first, because it might be needed for children

			processShapeStyle(line);

			pict.setShapeType(JOShapeType.Enum.LINE);
			line_from = line.getFrom();
			if (line_from != null) {
				String[] splits = line_from.split(","); //$NON-NLS-1$
				pict.getPolygon().add(new JOEmuPoint(splits[0].trim()));
				pict.getPolygon().add(new JOEmuPoint(splits[1].trim()));
				line_to = line.getTo();
				if (line_to != null) {
					splits = line_to.split(","); //$NON-NLS-1$
					pict.getPolygon().add(new JOEmuPoint(splits[0].trim()));
					pict.getPolygon().add(new JOEmuPoint(splits[1].trim()));
				}
				updateLineSize();
			}
			processFills(line.getFillArray(), line.getFillcolor());

			if (pict.getSolidFillColor() != null) {
				pict.setLineColor(pict.getSolidFillColor());
			}
			CTStroke[] strokes = line.getStrokeArray();
			for (CTStroke ctStroke : strokes) {

				ctStroke.getTop();

			}
			Rcpl.profileEnd();

			return true;
		}
		return false;
	}

	/**
	 * 
	 */
	private void updateLineSize() {
		if (pict.getPolygon().isEmpty()) {
			return;
		}

		double x1 = Integer.MAX_VALUE;
		double y1 = Integer.MAX_VALUE;

		double x2 = Integer.MIN_VALUE;
		double y2 = Integer.MIN_VALUE;

		// ---------- left top corner ------------------------------------------

		int minXIndex = 0;
		int minYIndex = 1;

		double[] polygonPixel = pict.getPolygonPixel();
		for (int i = 0; i < polygonPixel.length; i++) {
			if (polygonPixel[i] < x1) {
				x1 = polygonPixel[i];
				minXIndex = i;
			}
			i++;
			if (polygonPixel[i] < y1) {
				y1 = polygonPixel[i];
				minYIndex = i;
			}
		}

		pict.setX(new JOEmuProperty(pict.getPolygon().get(minXIndex)));
		pict.setY(new JOEmuProperty(pict.getPolygon().get(minYIndex)));

		// ---------- right bottom corner --------------------------------------

		for (int i = 0; i < polygonPixel.length; i++) {
			if (polygonPixel[i] > x2) {
				x2 = polygonPixel[i];
			}
			i++;
			if (polygonPixel[i] > y2) {
				y2 = polygonPixel[i];
			}
		}

		double w = x2 - x1;
		double h = y2 - y1;
		// if (w < JOMoveFeedbackFigure.HANDLE_WIDTH) {
		// w = JOMoveFeedbackFigure.HANDLE_WIDTH;
		// h = JOMoveFeedbackFigure.HANDLE_WIDTH;
		// }
		// if (h < JOMoveFeedbackFigure.HANDLE_WIDTH) {
		// h = JOMoveFeedbackFigure.HANDLE_WIDTH;
		// w = JOMoveFeedbackFigure.HANDLE_WIDTH;
		// }

		pict.setSize(w, h);

		// if (pict.isFlipY()) {
		// pict.setSize(w, h);
		//
		// } else {
		// pict.setSize(h, w);
		//
		// }

		// JORectangle cr = pict.getc

	}

	private void processBorders(CTBorder[] bordersB, CTBorder[] bordersT, CTBorder[] bordersL, CTBorder[] bordersR,
			String borderColorsB, String borderColorsT, String borderColorsL, String borderColorsR) {
		CTBorder borderB = null;
		CTBorder borderT = null;
		CTBorder borderL = null;
		CTBorder borderR = null;

		if (bordersB != null && bordersB.length > 0) {
			borderB = bordersB[0];
		}
		if (bordersT != null && bordersT.length > 0) {
			borderT = bordersT[0];
		}
		if (bordersL != null && bordersL.length > 0) {
			borderL = bordersL[0];
		}
		if (bordersR != null && bordersR.length > 0) {
			borderR = bordersR[0];
		}

		pict.setBorder(new JOBorder(pict, borderB, borderT, borderL, borderR, borderColorsB, borderColorsT,
				borderColorsL, borderColorsR));
	}

	/**
	 * @param ctPicture
	 * @param shapes
	 * @return
	 */
	@SuppressWarnings({ "deprecation" })
	private boolean processShape(CTPicture ctPicture, XmlObject[] shapes) {

		if (shapes != null && shapes.length > 0) {
			try {
				for (XmlObject xmlObject : shapes) {
					shape = (CTShape) xmlObject;

					// should be done first, because it might be needed for
					// children

					processShapeStyle(shape);

					if (shape.getType() != null) {
						pict.setShapeType(JOShapeType.create(shape.getType()));
					}
					shape.getAdj();
					shape.getAllowincell();
					shape.getAllowoverlap();
					shape.getAlt();

					processBorders(shape.getBorderbottomArray(), shape.getBordertopArray(), shape.getBorderleftArray(),
							shape.getBorderrightArray(), shape.getBorderbottomcolor(), shape.getBordertopcolor(),
							shape.getBorderleftcolor(), shape.getBorderrightcolor());

					shape.getAnchorlockArray();

					shape.getBullet();
					shape.getButton();
					shape.getBwmode();
					shape.getBwnormal();
					shape.getBwpure();
					shape.getCalloutArray();
					shape.getChromakey();
					shape.getClass1();
					shape.getClientDataArray();
					shape.getClip();
					shape.getClippathArray();
					shape.getCliptowrap();

					STConnectorType.Enum en = shape.getConnectortype();
					if (en.equals(STConnectorType.STRAIGHT)) {
						pict.setConnector(EnConnector.STRAIGHT);
					} else if (en.equals(STConnectorType.CURVED)) {
						pict.setConnector(EnConnector.CURVED);
					} else if (en.equals(STConnectorType.ELBOW)) {
						pict.setConnector(EnConnector.ELBOW);
					}

					shape.getCoordorigin();
					shape.getCoordsize();
					shape.getDgmlayout();
					shape.getDgmlayoutmru();
					shape.getDgmnodekind();
					shape.getDoubleclicknotify();
					shape.getExtrusionArray();

					if (pict.getShapeType() != null) {
						if (pict.getShapeType().equals(JOShapeType.Enum.LINE) && shape.getFillcolor() != null) {
							pict.setLineColor(Rcpl.colorProvider().get(shape.getFillcolor()));
						}
					}

					processFills(shape.getFillArray(), shape.getFillcolor());

					String fillColor = shape.getFillcolor();

					if (fillColor != null) {

						IColor color = Rcpl.colorProvider().get(fillColor);
						pict.setSolidFillColor(color);
					}

					STTrueFalse.Enum en2 = shape.getFilled();
					if (en2 != null) {
						pict.setFilled(new JOBoolean(pict, shape, shape, "Filled", null)); //$NON-NLS-1$
					}

					shape.getForcedash();
					shape.getFormulasArray();
					shape.getHandlesArray();
					shape.getHr();
					shape.getHralign();
					shape.getHref();
					shape.getHrnoshade();
					shape.getHrpct();
					shape.getHrstd();
					shape.getId();
					processImageData(shape.getImagedataArray());

					shape.getInsetmode();
					shape.getInsetpen();
					shape.getLockArray();
					shape.getOle();
					shape.getOleicon();
					shape.getOned();
					if (shape.getOpacity() != null) {
						pict.setOpacity(new JOPropertyOpacity<Double>(pict, ctPicture, shape, "pict_opacity")); //$NON-NLS-1$
					}
					shape.getPath2();
					shape.getPathArray();
					shape.getPreferrelative();
					shape.getPrint();
					shape.getRegroupid();
					shape.getShadowArray();
					shape.getSignaturelineArray();
					shape.getSkewArray();
					shape.getSpid();
					shape.getSpt();
					CTStroke[] strokes = shape.getStrokeArray();
					for (CTStroke ctStroke : strokes) {
						ctStroke.getAlthref();
						ctStroke.getBottom();
						ctStroke.getColor();
						ctStroke.getColor2();
						ctStroke.getColumn();
						ctStroke.getDashstyle();
						ctStroke.getEndarrow();
						ctStroke.getEndarrowlength();
						ctStroke.getEndarrowwidth();
						ctStroke.getEndcap();
						ctStroke.getFilltype();
						ctStroke.getForcedash();
						ctStroke.getHref();
						ctStroke.getId();
						ctStroke.getId2();
						ctStroke.getImagealignshape();
						ctStroke.getImageaspect();
						ctStroke.getImagesize();
						ctStroke.getInsetpen();
						ctStroke.getJoinstyle();
						ctStroke.getLeft();
						ctStroke.getLinestyle();
						ctStroke.getMiterlimit();
						ctStroke.getOn();
						ctStroke.getOpacity();
						ctStroke.getRelid();
						ctStroke.getRight();
						ctStroke.getSrc();
						ctStroke.getStartarrow();
						ctStroke.getStartarrowlength();
						ctStroke.getStartarrowwidth();
						ctStroke.getTitle();
						ctStroke.getTop();
						ctStroke.getWeight();
						break;
					}
					String strokeColor = shape.getStrokecolor();

					if (strokeColor != null) {
						pict.setLineColor(Rcpl.colorProvider().get(strokeColor));
					}

					if (shape.getStroked() != null) {
						pict.setStroked(new JOBoolean(pict, ctPicture, shape, "Stroked", null)); //$NON-NLS-1$
					}

					if (shape.getStrokeweight() != null) {
						pict.setLineWidth(new JOEmu(shape.getStrokeweight()));
					}

					shape.getStyle();
					shape.getTarget();
					processTextBoxContent(shape.getTextboxArray());
					shape.getTextdataArray();
					CTTextPath[] textPaths = shape.getTextpathArray();
					if (textPaths != null && textPaths.length > 0) {
						pict.setTextPath(new JOStringProperty(null, null, textPaths[0], "String", //$NON-NLS-1$
								new String[] { "actions/page/set_textpath" }, //$NON-NLS-1$
								EValueType.OTHER));
					}
					shape.getTitle();
					shape.getUserdrawn();
					shape.getUserhidden();
					shape.getWrapArray();
					shape.getWrapcoords();

					// TODO: only 1 shape per PIC
					break;
				}

			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
			Rcpl.profileEnd();
			return true;
		}
		Rcpl.profileEnd();
		return false;
	}

	@SuppressWarnings({ "deprecation", "unused" })
	private boolean processShapTypes(CTPicture ctPicture, XmlObject[] shapeTypes) {

		if (shapeTypes != null && shapeTypes.length > 0) {
			try {

				for (XmlObject xmlObject : shapeTypes) {
					ctShapeType = (CTShapetype) xmlObject;
					// should be done first, because it might be needed for
					// children

					pict.setShapeType(JOShapeType.create(ctShapeType.getId()));
					ctShapeType.getAdj();
					ctShapeType.getAllowincell();
					ctShapeType.getAllowoverlap();
					ctShapeType.getAlt();
					ctShapeType.getAnchorlockArray();
					ctShapeType.getBorderbottomArray();
					ctShapeType.getBorderbottomcolor();
					ctShapeType.getBorderleftArray();
					ctShapeType.getBorderleftcolor();
					ctShapeType.getBorderrightArray();
					ctShapeType.getBorderrightcolor();
					ctShapeType.getBordertopArray();
					ctShapeType.getBordertopcolor();
					ctShapeType.getBullet();
					ctShapeType.getButton();
					ctShapeType.getBwmode();
					ctShapeType.getBwnormal();
					ctShapeType.getBwpure();
					ctShapeType.getCalloutArray();
					ctShapeType.getChromakey();
					ctShapeType.getClass1();
					ctShapeType.getClientDataArray();
					ctShapeType.getClip();
					ctShapeType.getClippathArray();
					ctShapeType.getCliptowrap();
					ctShapeType.getComplex();
					ctShapeType.getConnectortype();
					ctShapeType.getCoordorigin();
					ctShapeType.getCoordsize();
					ctShapeType.getDgmlayout();
					ctShapeType.getDgmlayoutmru();
					ctShapeType.getDgmnodekind();
					ctShapeType.getDoubleclicknotify();
					ctShapeType.getExtrusionArray();
					processFills(ctShapeType.getFillArray(), ctShapeType.getFillcolor());
					STTrueFalse.Enum en = ctShapeType.getFilled();
					if (en != null) {
						pict.setFilled(new JOBoolean(pict, ctShapeType, ctShapeType, "Filled", null)); //$NON-NLS-1$
					}
					ctShapeType.getForcedash();
					ctShapeType.getFormulasArray();
					ctShapeType.getHandlesArray();
					ctShapeType.getHr();
					ctShapeType.getHralign();
					ctShapeType.getHref();
					ctShapeType.getHrnoshade();
					ctShapeType.getHrpct();
					ctShapeType.getHrstd();
					ctShapeType.getId();
					processImageData(ctShapeType.getImagedataArray());
					ctShapeType.getInsetmode();
					ctShapeType.getInsetpen();
					ctShapeType.getLockArray();
					ctShapeType.getMaster();
					ctShapeType.getOle();
					ctShapeType.getOleicon();
					ctShapeType.getOned();
					if (ctShapeType.getOpacity() != null) {
						pict.setOpacity(new JOPropertyOpacity<Double>(pict, ctPicture, ctShapeType, "pict_opacity")); //$NON-NLS-1$
					}

					String path = ctShapeType.getPath2();

					ctShapeType.getPathArray();
					ctShapeType.getPreferrelative();
					ctShapeType.getPrint();
					ctShapeType.getRegroupid();
					ctShapeType.getShadowArray();
					ctShapeType.getSignaturelineArray();
					ctShapeType.getSkewArray();
					ctShapeType.getSpid();
					ctShapeType.getSpt();
					ctShapeType.getStrokeArray();
					ctShapeType.getStrokecolor();
					ctShapeType.getStroked();

					if (ctShapeType.getStroked() != null) {
						pict.setStroked(new JOBoolean(pict, ctPicture, ctShapeType, "Stroked", null)); //$NON-NLS-1$
					}

					ctShapeType.getStrokeweight();
					ctShapeType.getStyle();
					ctShapeType.getTarget();
					processTextBoxContent(ctShapeType.getTextboxArray());
					ctShapeType.getTextdataArray();
					ctShapeType.getTextpathArray();
					ctShapeType.getTitle();
					ctShapeType.getUserdrawn();
					ctShapeType.getUserhidden();
					ctShapeType.getWrapArray();
					ctShapeType.getWrapcoords();
				}
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
			return true;
		}
		return false;
	}

	private void processTextBoxContent(CTTextbox[] textboxes) {
		if (textboxes != null) {
			for (CTTextbox ctTextbox : textboxes) {
				if (ctTextbox.getTxbxContent() != null) {
					JOTextbox textBox = new JOTextbox(pict.getDocument(), pict, ctTextbox, ctTextbox.getTxbxContent(),
							true);
					textBox.setSection((JOSection) pict.getSection());

					double width = pict.getWidthPixel();
					if (width == 0) {
						width = pict.getSize().getWidthPixel();
					}

					textBox.setWidthPixel(width);
					pict.add(textBox);
				}
			}
		}
	}

	/**
	 * @param imageDatas
	 */
	@SuppressWarnings("unused")
	private void processImageData(CTImageData[] imageDatas) {
		if (imageDatas != null && imageDatas.length > 0) {
			try {
				String id = imageDatas[0].getId();
				String id2 = imageDatas[0].getId2();
				if (id != null) {
					pict.setImageResource((JOResource) pict.getDocument().getPart().getImageByRelationId(id));
				} else if (id2 != null) {
					pict.setImageResource((JOResource) pict.getDocument().getPart().getImageByRelationId(id2));
				}
				String title = imageDatas[0].getTitle();
				if (title != null) {
					pict.setTitle(title);
				}
				String source = imageDatas[0].getSrc();
				if (source != null) {
					pict.setSource(source);
				}
				String pictPict = imageDatas[0].getPict();
				String hRef = imageDatas[0].getHref();
				if (hRef != null) {
					pict.sethRef(hRef);
				}
				String hRef2 = imageDatas[0].getHref2();
				if (hRef2 != null) {
					pict.sethRef(hRef2);
				}

				pict.setCropBottom(JOUtil2.getFloat(imageDatas[0].getCropbottom()));
				pict.setCropTop(JOUtil2.getFloat(imageDatas[0].getCroptop()));
				pict.setCropLeft(JOUtil2.getFloat(imageDatas[0].getCropleft()));
				pict.setCropRight(JOUtil2.getFloat(imageDatas[0].getCropright()));

			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
		}
	}

	/**
	 * @param fillArray
	 * @param fillColor
	 */
	private void processFills(CTFill[] fillArray, String fillColor) {
		if (fillArray != null && fillArray.length > 0) {
			String fillC = fillArray[0].getColor2();
			if (fillC != null) {
				pict.setSolidFillColor(Rcpl.colorProvider().get(fillC));
			} else if (fillColor != null) {
				pict.setSolidFillColor(Rcpl.colorProvider().get(fillColor));
			}
		} else if (fillColor != null) {
			pict.setSolidFillColor(Rcpl.colorProvider().get(fillColor));
		} else {
			pict.setSolidFillColor(null);
		}
	}

	/**
	 * @param newBounds
	 */
	public void updateStyleString(Rectangle2D newBounds) {
		String styleString = createStyleString(newBounds);
		if (getShape() != null) {
			try {
				getShape().setStyle(styleString);
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
		} else if (ctShapeType != null) {
			try {
				ctShapeType.setStyle(styleString);
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}

		} else if (ctRect != null) {
			try {
				ctRect.setStyle(styleString);
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
		} else if (line != null) {
			try {
				line.setStyle(styleString);
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
		}
	}

	/**
	 * @return
	 */
	public javafx.geometry.Point2D getSize() {

		JOEmu emuW = new JOEmu(widthString);
		JOEmu emuH = new JOEmu(heightString);

		return new javafx.geometry.Point2D((float) emuW.toPixel(), (float) emuH.toPixel());
	}

	/**
	 * @return
	 */
	public CTShape getShape() {
		return shape;
	}

	/**
	 * @param zIndexString
	 */
	public void setzIndexString(String zIndexString) {
		this.zIndexString = zIndexString;
	}

	public JOEmu getEmuShadowOffsX() {
		return emuShadowOffsX;
	}

	public JOEmu getEmuShadowOffsY() {
		return emuShadowOffsY;
	}

}
