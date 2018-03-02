package com.joffice.rcpl.plugin.office.internal.model.presentation;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IShape;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.resources.JOResource;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingShapeProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPictureNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShapeNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.STDirection;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyBottomInset;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyLeftInset;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyParagraphProperties;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyPosition;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyRightInset;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTextAlign;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTextAnchoring;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyTopInset;
import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;
import com.joffice.rcpl.plugin.office.databinding.types.JOParagraphProperties;
import com.joffice.rcpl.plugin.office.databinding.types.JOPlaceholderType;
import com.joffice.rcpl.plugin.office.databinding.types.JOPosition;
import com.joffice.rcpl.plugin.office.databinding.types.JOShapeType;
import com.joffice.rcpl.plugin.office.databinding.types.JOTextAnchoringType;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOPropertySize;
import com.joffice.rcpl.plugin.office.databinding2.JOStringProperty;
import com.joffice.rcpl.plugin.office.internal.JOfficeFactory;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JOShape extends JOObject implements IShape {

	// private final static Logger LOGGER =
	// LoggerFactory.getLogger(JOShape.class);

	// ----------- data binding ------------------------------------------------

	private JOPropertySize size;
	private JOPropertyPosition<JOPosition> position;
	private JOPropertyLeftInset<Double> leftInset;
	private JOPropertyRightInset<Double> rightInset;
	private JOPropertyTopInset<Double> topInset;
	private JOPropertyBottomInset<Double> bottomInset;
	private JOPropertyTextAnchoring<JOTextAnchoringType> textAnchoringType;

	// ---------- data binding 2 -----------------------------------------------

	private JOEmuProperty leftMargin;
	private JOEmuProperty rightMargin;
	private JOStringProperty bulletCharacter;

	// -------------------------------------------------------------------------

	private JOShapeType type = JOShapeType.UNDEFINED_SHAPE;

	private JOPlaceholderType placeHolderType = JOPlaceholderType.UNDEFINED;

	private IColor foregroundColor = IColor.BLACK;

	private IColor fillColor;

	private int alpha = 255;

	private IColor lineColor;

	private IColor effectColor;

	private JOResource imageResource;

	private JOAbstractSlide slide;

	protected String name;

	protected long id;

	private CTGeomGuide[] ctGeomGuideArray;

	private JOShape shapeGroup;

	/**
	 * @param document
	 * @param slide
	 * @param anchorObject
	 * @param parent
	 * @param xmlObject
	 * @param childObject
	 */
	public JOShape(IDocument document, JOAbstractSlide slide, JOObject anchorObject, XmlObject parent,
			XmlObject xmlObject, boolean childObject, JOShape shapeGroup) {
		super(document, anchorObject, parent, xmlObject, childObject, false, -1);
		this.slide = slide;
		this.shapeGroup = shapeGroup;
		if (xmlObject instanceof CTShape) {
			initShape();
		}

		if (xmlObject instanceof CTGroupShape) {
			initGroup();
		}

		if (xmlObject instanceof CTPicture) {
			initPicture();
		}
	}

	/**
	 * 
	 */
	private void initShape() {
		try {
			CTShape ctShape = (CTShape) getXmlObject();
			initNameAndId(ctShape);
			initNonVisuals(ctShape);
			initShapeProperties(ctShape.getSpPr());
			initShapeStyle(ctShape.getStyle());
			initParagraphs(ctShape);
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	/**
	 * 
	 */
	private void initGroup() {
		try {
			CTGroupShape ctGroupShape = (CTGroupShape) getXmlObject();
			initNameAndId(ctGroupShape);
			// initNonVisuals(ctGroupShape);
			initShapeProperties(ctGroupShape.getGrpSpPr());
			// initShapeStyle(ctGroupShape.getStyle());
			// initParagraphs(ctGroupShape);
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	/**
	 * @param ctShape
	 */
	private void initNameAndId(CTPicture ctPicture) {
		CTPictureNonVisual ctPictureNonVisual = ctPicture.getNvPicPr();
		if (ctPictureNonVisual != null) {
			id = ctPictureNonVisual.getCNvPr().getId();
			name = ctPictureNonVisual.getCNvPr().getName();
		}
	}

	private void initNameAndId(CTShape ctShape) {
		CTShapeNonVisual ctShapeNonVisual = ctShape.getNvSpPr();
		if (ctShapeNonVisual != null) {
			id = ctShapeNonVisual.getCNvPr().getId();
			name = ctShapeNonVisual.getCNvPr().getName();
		}
	}

	private void initNameAndId(CTGroupShape ctGroupShape) {
		CTGroupShapeNonVisual ctShapeNonVisual = ctGroupShape.getNvGrpSpPr();
		if (ctShapeNonVisual != null) {
			id = ctShapeNonVisual.getCNvPr().getId();
			name = ctShapeNonVisual.getCNvPr().getName();
		}
	}

	/**
	 * @param ctShapeNonVisual
	 */
	@SuppressWarnings({ "unused", })
	private void initNonVisuals(CTShape ctShape) {
		CTShapeNonVisual ctShapeNonVisual = ctShape.getNvSpPr();
		CTNonVisualDrawingProps ctNonVisualDrawingProps1 = ctShapeNonVisual.getCNvPr();
		String desc = ctShapeNonVisual.getCNvPr().getDescr();

		CTOfficeArtExtensionList artExtensionList = ctShapeNonVisual.getCNvPr().getExtLst();
		boolean hidden = ctShapeNonVisual.getCNvPr().getHidden();
		CTHyperlink hyperlink = ctShapeNonVisual.getCNvPr().getHlinkClick();
		CTHyperlink hoverHyperlink = ctShapeNonVisual.getCNvPr().getHlinkHover();

		CTNonVisualDrawingProps ctNonVisualDrawingProps2 = ctShapeNonVisual.getCNvPr();

		CTNonVisualDrawingShapeProps ctNonVisualDrawingShapeProps = ctShapeNonVisual.getCNvSpPr();

		CTApplicationNonVisualDrawingProps ctApplicationNonVisualDrawingProps = ctShapeNonVisual.getNvPr();
		ctApplicationNonVisualDrawingProps.getAudioCd();
		ctApplicationNonVisualDrawingProps.getAudioFile();
		ctApplicationNonVisualDrawingProps.getCustDataLst();
		ctApplicationNonVisualDrawingProps.getExtLst();
		ctApplicationNonVisualDrawingProps.getIsPhoto();
		ctApplicationNonVisualDrawingProps.getQuickTimeFile();
		ctApplicationNonVisualDrawingProps.getUserDrawn();
		ctApplicationNonVisualDrawingProps.getVideoFile();
		ctApplicationNonVisualDrawingProps.getWavAudioFile();

		CTPlaceholder ctPlaceHolder = ctApplicationNonVisualDrawingProps.getPh();

		if (ctPlaceHolder != null) {
			CTExtensionListModify ctExtensionListModify = ctPlaceHolder.getExtLst();
			boolean hasCustomPrompt = ctPlaceHolder.getHasCustomPrompt();
			long idx = ctPlaceHolder.getIdx();
			STDirection.Enum direction = ctPlaceHolder.getOrient();
			STPlaceholderSize.Enum size = ctPlaceHolder.getSz();
			placeHolderType = new JOPlaceholderType(ctPlaceHolder);
		}

	}

	/**
	 * @param ctShape
	 */
	@SuppressWarnings({ "unused", "deprecation", "cast" })
	private void initParagraphs(CTShape ctShape) {
		CTTextBody ctTextBody = ctShape.getTxBody();

		if (ctTextBody != null) {
			double w = 0;
			if (size != null) {
				w = size.getWidthPixel();
			}

			// ---------- body properties --------------------------------------

			if (ctTextBody.getBodyPr() != null) {
				leftInset = new JOPropertyLeftInset<Double>(this, ctTextBody, ctTextBody.getBodyPr());
				w -= leftInset.toPixel();
				rightInset = new JOPropertyRightInset<Double>(this, ctTextBody, ctTextBody.getBodyPr());
				w -= rightInset.toPixel();
				topInset = new JOPropertyTopInset<Double>(this, ctTextBody, ctTextBody.getBodyPr());
				bottomInset = new JOPropertyBottomInset<Double>(this, ctTextBody, ctTextBody.getBodyPr());

				textAnchoringType = new JOPropertyTextAnchoring<JOTextAnchoringType>(this, ctTextBody,
						ctTextBody.getBodyPr(), "text_achoring_type"); //$NON-NLS-1$

				boolean b1 = ctTextBody.getBodyPr().getAnchorCtr();
				int i1 = ctTextBody.getBodyPr().getBIns();
				boolean b2 = ctTextBody.getBodyPr().getCompatLnSpc();
				CTOfficeArtExtensionList l1 = ctTextBody.getBodyPr().getExtLst();
				CTFlatText t1 = ctTextBody.getBodyPr().getFlatTx();
				boolean aa = ctTextBody.getBodyPr().getForceAA();
				boolean fromWordArt = ctTextBody.getBodyPr().getFromWordArt();
				STTextHorzOverflowType.Enum en1 = ctTextBody.getBodyPr().getHorzOverflow();
				ctTextBody.getBodyPr().getLIns();
				ctTextBody.getBodyPr().getNoAutofit();
				ctTextBody.getBodyPr().getNormAutofit();
				ctTextBody.getBodyPr().getNumCol();
				ctTextBody.getBodyPr().getPrstTxWarp();
				ctTextBody.getBodyPr().getRIns();
				ctTextBody.getBodyPr().getRot();
				ctTextBody.getBodyPr().getRtlCol();
				ctTextBody.getBodyPr().getScene3D();
				ctTextBody.getBodyPr().getSp3D();
				ctTextBody.getBodyPr().getSpAutoFit();
				ctTextBody.getBodyPr().getSpcCol();
				ctTextBody.getBodyPr().getSpcFirstLastPara();
				ctTextBody.getBodyPr().getTIns();
				ctTextBody.getBodyPr().getUpright();
				ctTextBody.getBodyPr().getVert();
				ctTextBody.getBodyPr().getVertOverflow();
				ctTextBody.getBodyPr().getWrap();
			}

			CTTextParagraph[] ctTextParagraphs = ctTextBody.getPArray();
			for (CTTextParagraph ctTextParagraph : ctTextParagraphs) {

				JOStyle paragraphStyle = new JOStyle();
				paragraphStyle.setForeground(foregroundColor);
				JOPropertyTextAlign<JOAlignment> textAlignment = null;

				if (placeHolderType != null) {
					if (placeHolderType.type.equals(JOPlaceholderType.Enum.CTR_TITLE)
							|| placeHolderType.type.equals(JOPlaceholderType.Enum.TITLE)) {
						JOPropertyParagraphProperties<JOParagraphProperties> titleProperties = null;
						int level = 1;
						if (ctTextParagraph.getPPr() != null) {
							level = ctTextParagraph.getPPr().getLvl();
						}

						titleProperties = getTitleParagraphProperties(level);

						if (titleProperties != null) {
							int size = titleProperties.get().getFontSize();
							CTTextFont ctMajorLatinFont = getPresentationDocument().getFontScheme()
									.getMajorFontsLatin();
							String typeFace = ctMajorLatinFont.getTypeface();
							paragraphStyle.setFont(Rcpl.fontProvider().loadFont(typeFace, size, 0));

							if (titleProperties.get().getCharacterProperties() != null
									&& titleProperties.get().getCharacterProperties().fgColor != null) {
								paragraphStyle.setForeground(titleProperties.get().getCharacterProperties().fgColor);
							}
							// titleProperties.get().getCharacterProperties().get
							// titleProperties.get().getCharacterProperties().

							if (titleProperties.get().getAlignment() != null) {
								JOAlignment align = titleProperties.get().getAlignment();
								if (align.type.equals(AlignType.CENTER)) {
									textAlignment = new JOPropertyTextAlign<JOAlignment>(null, null, null,
											new JOAlignment(AlignType.CENTER));
								}
							}
						}
					} else if (placeHolderType.type.equals(JOPlaceholderType.Enum.SUB_TITLE)) {

						CTTextFont ctMajorLatinFont = getPresentationDocument().getFontScheme().getMajorFontsLatin();
						String typeFace = ctMajorLatinFont.getTypeface();

						paragraphStyle.setFont(Rcpl.fontProvider().loadFont(typeFace, 32, 0));

					} else if (placeHolderType.type.equals(JOPlaceholderType.Enum.BODY)) {

						int level = 1;
						if (ctTextParagraph.getPPr() != null) {
							level = ctTextParagraph.getPPr().getLvl() + 1;
						}

						JOPropertyParagraphProperties<JOParagraphProperties> bodyProperties = getBodyParagraphProperties(
								level);

						if (bodyProperties != null) {
							int size = bodyProperties.get().getFontSize();

							CTTextFont ctMajorLatinFont = getPresentationDocument().getFontScheme()
									.getMajorFontsLatin();
							String typeFace = ctMajorLatinFont.getTypeface();

							if (size == 0) {
								size = 20;
							}

							paragraphStyle.setFont(Rcpl.fontProvider().loadFont(typeFace, size, 0));

							if (bodyProperties.get().getCharacterProperties() != null
									&& bodyProperties.get().getCharacterProperties().fgColor != null) {
								paragraphStyle.setForeground(bodyProperties.get().getCharacterProperties().fgColor);
							}
							// titleProperties.get().getCharacterProperties().get
							// titleProperties.get().getCharacterProperties().

							if (bodyProperties.get().getAlignment() != null) {
								JOAlignment align = bodyProperties.get().getAlignment();

								if (align.type.equals(AlignType.CENTER)) {
									textAlignment = new JOPropertyTextAlign<JOAlignment>(null, null, null,
											new JOAlignment(AlignType.CENTER));
								}
							}

							leftMargin = bodyProperties.get().getLeftMargin();
							rightMargin = bodyProperties.get().getRightMargin();
							bulletCharacter = bodyProperties.get().getBulletCharacter();
						}

						// CTTextFont ctMinorLatinFont =
						// getPresentationDocument()
						// .getFontScheme().getMinorFontsLatin();
						// String typeFace = ctMinorLatinFont.getTypeface();
						//
						// paragraphStyle.setFont(JOFontProvider.loadFont(
						// typeFace, 14, SWT.NONE));

					} else {

						// JOParagraphProperties props =
						// doc.getDefaultParagraphProperties().get();
						//
						// int fontSize = 20; // props.getFontSize();
						CTTextFont ctMajorLatinFont = getPresentationDocument().getFontScheme().getMinorFontsLatin();
						String typeFace = ctMajorLatinFont.getTypeface();

						paragraphStyle.setFont(Rcpl.fontProvider().loadFont(typeFace, 20, 0));
						textAlignment = new JOPropertyTextAlign<JOAlignment>(null, null, null,
								new JOAlignment(AlignType.CENTER));
					}
				}
				JOParagraph paragraph = new JOParagraph(getDocument(), this, ctTextBody, ctTextParagraph, w, 0, 0.0,
						0.0, 0.0, 0.0, null, true, false, null, paragraphStyle, false, 0, null);
				paragraph.setAlignment(textAlignment);
				paragraph.setMarginLeft(leftMargin);
				paragraph.setMarginRight(rightMargin);
				paragraph.setBulletCharacter(bulletCharacter);
				add(paragraph);
			}
		}
	}

	private JOPresentationDocument getPresentationDocument() {
		if (getDocument() instanceof JOPresentationDocument) {
			return (JOPresentationDocument) getDocument();
		}
		if (getDocument() instanceof JOSlideMasterDocument) {
			return ((JOSlideMasterDocument) getDocument()).getPresentationDocument();
		}
		if (getDocument() instanceof JOSlideLayoutDocument) {
			return ((JOSlideLayoutDocument) getDocument()).getPresentationDocument();
		}
		return null;
	}

	/**
	 * @param level
	 * @return
	 */
	private JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphProperties(int level) {
		JOPropertyParagraphProperties<JOParagraphProperties> titleProperties = null;

		JOSlideLayoutPart slideLayout = slide.getSlideLayout();
		JOSlideMasterPart slideMaster = null;
		if (slideLayout != null) {
			slideMaster = slideLayout.getSlideMaster();
		}

		if (slide instanceof JOSlideMasterPart) {
			slideMaster = (JOSlideMasterPart) slide;
		}
		if (slideMaster == null) {
			return null;
		}
		switch (level) {
		case 1:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel1();
			break;
		case 2:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel2();
			break;
		case 3:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel3();
			break;
		case 4:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel4();
			break;
		case 5:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel5();
			break;
		case 6:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel6();
			break;
		case 7:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel7();
			break;
		case 8:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel8();
			break;
		case 9:
			titleProperties = slideMaster.getTitleParagraphPropertiesLevel9();
			break;
		}
		return titleProperties;
	}

	/**
	 * @param level
	 * @return
	 */
	private JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphProperties(int level) {
		JOPropertyParagraphProperties<JOParagraphProperties> bodyProperties = null;

		JOSlideLayoutPart slideLayout = slide.getSlideLayout();
		JOSlideMasterPart slideMaster = null;
		if (slideLayout != null) {
			slideMaster = slideLayout.getSlideMaster();
		}

		if (slide instanceof JOSlideMasterPart) {
			slideMaster = (JOSlideMasterPart) slide;
		}
		if (slideMaster == null) {
			return null;
		}
		switch (level) {
		case 1:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel1();
			break;
		case 2:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel2();
			break;
		case 3:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel3();
			break;
		case 4:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel4();
			break;
		case 5:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel5();
			break;
		case 6:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel6();
			break;
		case 7:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel7();
			break;
		case 8:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel8();
			break;
		case 9:
			bodyProperties = slideMaster.getBodyParagraphPropertiesLevel9();
			break;
		}
		return bodyProperties;
	}

	/**
	 * @param ctShapeStyle
	 */
	private void initShapeStyle(CTShapeStyle ctShapeStyle) {

		// TODO: color mapping
		if (ctShapeStyle != null) {
			CTStyleMatrixReference ctEffectRef = ctShapeStyle.getEffectRef();

			if (ctEffectRef != null) {
				if (ctEffectRef.getSchemeClr() != null) {
					effectColor = Rcpl.colorProvider().getThemeColor(null, ctEffectRef.getSchemeClr());
				}
			} else {
				JOShape shape = findAssociatedShape();
				if (shape != null) {
					effectColor = shape.getEffectColor();
				}
			}

			CTStyleMatrixReference ctFillRef = ctShapeStyle.getFillRef();
			if (ctFillRef != null) {
				if (ctFillRef.getSchemeClr() != null) {
					fillColor = Rcpl.colorProvider().getThemeColor(null, ctFillRef.getSchemeClr());
				}
			} else {
				JOShape shape = findAssociatedShape();
				if (shape != null) {
					fillColor = shape.getFillColor();
				}
			}

			CTStyleMatrixReference ctLnRef = ctShapeStyle.getLnRef();
			if (ctLnRef != null) {
				if (ctLnRef.getSchemeClr() != null) {
					lineColor = Rcpl.colorProvider().getThemeColor(null, ctLnRef.getSchemeClr());
				} else {
					JOShape shape = findAssociatedShape();
					if (shape != null) {
						lineColor = shape.getLineColor();
					}
				}
			}

			if (ctLnRef != null) {
			}

			CTFontReference ctFontRef = ctShapeStyle.getFontRef();
			if (ctFontRef != null) {
				if (ctFontRef.getSchemeClr() != null) {
					foregroundColor = Rcpl.colorProvider().getThemeColor(null, ctFontRef.getSchemeClr());
				}
			} else {
				JOShape shape = findAssociatedShape();
				if (shape != null) {
					foregroundColor = shape.getForegroundColor();
				}
			}

		}
	}

	/**
	 * @return
	 */
	private JOShape findAssociatedShape() {
		JOSlideLayoutPart slideLayout = slide.getSlideLayout();
		if (slideLayout != null) {
			JOShape shape = slideLayout.findShapeByNameOrPlaceholderType(getName(), getPlaceHolderType().type);
			return shape;
		}
		return null;
	}

	/**
	 * @param ctShapeProperties
	 */
	@SuppressWarnings({ "unused", "deprecation" })
	private void initShapeProperties(CTShapeProperties ctShapeProperties) {

		CTBlipFillProperties ctBlipFillProperties = ctShapeProperties.getBlipFill();

		ctShapeProperties.getBwMode();

		CTCustomGeometry2D ctCustomGeometry2D = ctShapeProperties.getCustGeom();
		if (ctCustomGeometry2D != null) {
			CTGeomRect ctGeomRect = ctCustomGeometry2D.getRect();
			if (ctGeomRect != null) {
			}
			CTAdjustHandleList ctAdjustHandleList = ctCustomGeometry2D.getAhLst();
			if (ctAdjustHandleList != null) {
			}
			CTGeomGuideList ctGeomGuideList = ctCustomGeometry2D.getAvLst();
			if (ctGeomGuideList != null) {
			}
			CTConnectionSiteList ctConnectionSiteList = ctCustomGeometry2D.getCxnLst();
			if (ctConnectionSiteList != null) {
			}
			CTGeomGuideList ctGeomGuideList2 = ctCustomGeometry2D.getGdLst();
			if (ctGeomGuideList2 != null) {
			}
			CTPath2DList ctPath2DList = ctCustomGeometry2D.getPathLst();
			if (ctPath2DList != null) {
			}
		}

		// ctGeomRect.get

		CTEffectContainer ctEffectContainer = ctShapeProperties.getEffectDag();
		CTEffectList ctEffectList = ctShapeProperties.getEffectLst();
		CTOfficeArtExtensionList ctOfficeArtExtensionList = ctShapeProperties.getExtLst();

		CTGradientFillProperties ctGradientFillProperties = ctShapeProperties.getGradFill();
		CTGroupFillProperties ctGroupFillProperties = ctShapeProperties.getGrpFill();
		ctShapeProperties.getLn();

		ctShapeProperties.getNoFill();
		ctShapeProperties.getPattFill();
		CTPresetGeometry2D ctPresetGeometry2D = ctShapeProperties.getPrstGeom();
		if (ctPresetGeometry2D != null) {
			type = new JOShapeType(ctPresetGeometry2D);

			CTGeomGuideList ctGeomGuideList = ctPresetGeometry2D.getAvLst();
			if (ctGeomGuideList != null) {
				ctGeomGuideArray = ctGeomGuideList.getGdArray();
			}
		}

		ctShapeProperties.getScene3D();
		CTSolidColorFillProperties ctSolidColorFillProperties = ctShapeProperties.getSolidFill();

		if (ctSolidColorFillProperties != null) {
			fillColor = Rcpl.colorProvider().get(null, ctSolidColorFillProperties);

			if (ctSolidColorFillProperties.getSrgbClr() != null) {
				CTPositiveFixedPercentage[] ctPositiveFixedPercentageAlphaArray = ctSolidColorFillProperties
						.getSrgbClr().getAlphaArray();
				if (ctPositiveFixedPercentageAlphaArray != null && ctPositiveFixedPercentageAlphaArray.length > 0) {
					double pct = ctPositiveFixedPercentageAlphaArray[0].getVal() / 100000.0;
					alpha = (int) (pct * 255);
				}
			} else if (ctSolidColorFillProperties.getHslClr() != null) {
				CTPositiveFixedPercentage[] ctPositiveFixedPercentageAlphaArray = ctSolidColorFillProperties.getHslClr()
						.getAlphaArray();
				if (ctPositiveFixedPercentageAlphaArray != null && ctPositiveFixedPercentageAlphaArray.length > 0) {
					double pct = ctPositiveFixedPercentageAlphaArray[0].getVal() / 100000.0;
					alpha = (int) (pct * 255);
				}
			} else if (ctSolidColorFillProperties.getPrstClr() != null) {
				CTPositiveFixedPercentage[] ctPositiveFixedPercentageAlphaArray = ctSolidColorFillProperties
						.getPrstClr().getAlphaArray();
				if (ctPositiveFixedPercentageAlphaArray != null && ctPositiveFixedPercentageAlphaArray.length > 0) {
					double pct = ctPositiveFixedPercentageAlphaArray[0].getVal() / 100000.0;
					alpha = (int) (pct * 255);
				}
			} else if (ctSolidColorFillProperties.getSchemeClr() != null) {
				CTPositiveFixedPercentage[] ctPositiveFixedPercentageAlphaArray = ctSolidColorFillProperties
						.getSchemeClr().getAlphaArray();
				if (ctPositiveFixedPercentageAlphaArray != null && ctPositiveFixedPercentageAlphaArray.length > 0) {
					double pct = ctPositiveFixedPercentageAlphaArray[0].getVal() / 100000.0;
					alpha = (int) (pct * 255);
				}
			} else if (ctSolidColorFillProperties.getScrgbClr() != null) {
				CTPositiveFixedPercentage[] ctPositiveFixedPercentageAlphaArray = ctSolidColorFillProperties
						.getScrgbClr().getAlphaArray();
				if (ctPositiveFixedPercentageAlphaArray != null && ctPositiveFixedPercentageAlphaArray.length > 0) {
					double pct = ctPositiveFixedPercentageAlphaArray[0].getVal() / 100000.0;
					alpha = (int) (pct * 255);
				}
			} else if (ctSolidColorFillProperties.getSysClr() != null) {
				CTPositiveFixedPercentage[] ctPositiveFixedPercentageAlphaArray = ctSolidColorFillProperties.getSysClr()
						.getAlphaArray();
				if (ctPositiveFixedPercentageAlphaArray != null && ctPositiveFixedPercentageAlphaArray.length > 0) {
					double pct = ctPositiveFixedPercentageAlphaArray[0].getVal() / 100000.0;
					alpha = (int) (pct * 255);
				}
			}
		}

		ctShapeProperties.getSp3D();

		CTTransform2D ctTransform2D = ctShapeProperties.getXfrm();

		if (ctTransform2D == null) {
			JOSlideLayoutPart slideLayout = slide.getSlideLayout();
			if (slideLayout != null) {
				JOShape layoutShape = slideLayout.findShapeByNameOrPlaceholderType(getName(),
						getPlaceHolderType().type);
				if (layoutShape != null) {
					CTShape ctLayoutShape = (CTShape) layoutShape.getXmlObject();
					CTShapeProperties ctLayoutShapeProperties = ctLayoutShape.getSpPr();
					ctTransform2D = ctLayoutShapeProperties.getXfrm();
				}
			}
		}

		if (ctTransform2D != null) {
			if (ctTransform2D.getExt() != null) {
				size = new JOPropertySize(this, ctTransform2D, ctTransform2D.getExt(), "Ext", new String[] { "size" }, //$NON-NLS-1$
						EValueType.MEASUREMENT);
				size.get();
			}

			if (ctTransform2D.getOff() != null) {
				position = new JOPropertyPosition<JOPosition>(this, ctTransform2D, ctTransform2D.getOff(), "offset"); //$NON-NLS-1$
				position.get();
			}
		}
	}

	@SuppressWarnings("unused")
	private void initShapeProperties(CTGroupShapeProperties ctShapeProperties) {

		CTBlipFillProperties ctBlipFillProperties = ctShapeProperties.getBlipFill();
		ctShapeProperties.getBwMode();
		CTGroupTransform2D ctTransform2D = ctShapeProperties.getXfrm();

		if (ctTransform2D != null) {
			if (ctTransform2D.getExt() != null) {
				size = new JOPropertySize(this, ctTransform2D, ctTransform2D.getExt(), "Ext", new String[] { "size" }, //$NON-NLS-1$
						EValueType.MEASUREMENT);
				size.get();
			}

			if (ctTransform2D.getOff() != null) {
				position = new JOPropertyPosition<JOPosition>(this, ctTransform2D, ctTransform2D.getOff(), "offset"); //$NON-NLS-1$
				position.get();
			}
		}
	}

	/**
	 * 
	 */
	private void initPicture() {
		CTPicture ctPicture = (CTPicture) getXmlObject();
		CTBlipFillProperties ctBlipFillProperties = ctPicture.getBlipFill();
		CTBlip ctBlip = ctBlipFillProperties.getBlip();
		String embed = ctBlip.getEmbed();

		JOResource imageResource = (JOResource) getDocument().getPart().getImageByRelationId(embed);
		setImageResource(imageResource);

		// long dpi = ctBlipFillProperties.getDpi();
		// boolean rotationWithShape = ctBlipFillProperties.getRotWithShape();
		// CTRelativeRect ctRelativeRect = ctBlipFillProperties.getSrcRect();
		// CTStretchInfoProperties ctStretchInfoProperties =
		// ctBlipFillProperties
		// .getStretch();
		// CTTileInfoProperties ctTileInfoProperties = ctBlipFillProperties
		// .getTile();
		//
		// CTExtensionListModify ctPictureExtensionListModify = ctPicture
		// .getExtLst();
		initNameAndId(ctPicture);
		initShapeProperties(ctPicture.getSpPr());
		initShapeStyle(ctPicture.getStyle());
	}

	public IColor getForegroundColor() {
		return foregroundColor;
	}

	public JOShapeType getType() {
		return type;
	}

	@Override
	public boolean dispose() {
		super.dispose();
		return false;
	}

	@Override
	public String getDisplayName() {
		return "Shape";
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		return new JOfficeFactory().createPictFigure(this);
	}

	public JOPropertyTextAnchoring<JOTextAnchoringType> getTextAnchoringType() {
		return textAnchoringType;
	}

	@Override
	public void updateFromXml() {
	}

	@Override
	public boolean isPageBreakBefore() {
		return false;
	}

	public IColor getFillColor() {
		return fillColor;
	}

	@Override
	public IColor getLineColor() {
		return lineColor;
	}

	public IColor getEffectColor() {
		return effectColor;
	}

	public JOResource getImageResource() {
		return imageResource;
	}

	public void setImageResource(JOResource imageResource) {
		this.imageResource = imageResource;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	@Override
	public JOPropertySize getSize() {
		return size;
	}

	public JOPropertyPosition<JOPosition> getPosition() {
		return position;
	}

	public JOPropertyLeftInset<Double> getLeftInset() {
		return leftInset;
	}

	public JOPropertyRightInset<Double> getRightInset() {
		return rightInset;
	}

	public JOPropertyTopInset<Double> getTopInset() {
		return topInset;
	}

	public JOPropertyBottomInset<Double> getBottomInset() {
		return bottomInset;
	}

	public CTGeomGuide[] getCtGeomGuideArray() {
		return ctGeomGuideArray;
	}

	public void setCtGeomGuideArray(CTGeomGuide[] ctGeomGuideArray) {
		this.ctGeomGuideArray = ctGeomGuideArray;
	}

	@Override
	public String toString() {
		if (type != null) {
			return type.toString() + " " + super.toString(); //$NON-NLS-1$
		}
		return super.toString();
	}

	public int getAlpha() {
		return alpha;
	}

	public JOShape getShapeGroup() {
		return shapeGroup;
	}

	public JOPlaceholderType getPlaceHolderType() {
		return placeHolderType;
	}

	public JOAbstractSlide getSlide() {
		return slide;
	}

	@Override
	public void boundsChanged2(Rectangle2D newBounds) {
	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
