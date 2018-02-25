package com.joffice.rcpl.plugin.office.internal.model.presentation;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.XSLFSlideShow;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.EnDocumentType;
import org.eclipse.rcpl.JOFontScheme;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize;
import org.openxmlformats.schemas.presentationml.x2006.main.SldDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.SldLayoutDocument;
import org.openxmlformats.schemas.presentationml.x2006.main.SldMasterDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;

import com.joffice.rcpl.plugin.office.databinding.JOPropertyParagraphProperties;
import com.joffice.rcpl.plugin.office.databinding.types.JOParagraphProperties;
import com.joffice.rcpl.plugin.office.databinding2.JOPropertySize;
import com.joffice.rcpl.plugin.office.internal.JOAbstractDocument;
import com.joffice.rcpl.plugin.office.internal.JOStyleTemplate;

import javafx.application.Platform;

/**
 * @author ramin
 * 
 */
public class JOPresentationDocument extends JOAbstractDocument {

	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOPresentationDocument.class);

	private JOPropertySize pageSize;

	private List<JOSlidePart> slides = new ArrayList<JOSlidePart>();

	private List<JOSlideLayoutPart> slideLayouts = new ArrayList<JOSlideLayoutPart>();

	private List<JOSlideMasterPart> slideMasters = new ArrayList<JOSlideMasterPart>();

	private ThemeDocument themeDocument;

	private JOFontScheme fontScheme;

	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphProperties;

	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel1;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel2;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel3;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel4;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel5;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel6;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel7;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel8;
	private JOPropertyParagraphProperties<JOParagraphProperties> defaultParagraphPropertiesLevel9;

	private STPathShadeType.Enum backGroundShadeType;

	public static final XmlOptions DEFAULT_XML_OPTIONS;

	static {
		DEFAULT_XML_OPTIONS = new XmlOptions();
		DEFAULT_XML_OPTIONS.setSaveOuter();
		DEFAULT_XML_OPTIONS.setUseDefaultNamespace();
		DEFAULT_XML_OPTIONS.setSaveAggressiveNamespaces();
	}

	public STPathShadeType.Enum getBackGroundShadeType() {
		return backGroundShadeType;
	}

	/**
	 * @param newDocument
	 */
	public JOPresentationDocument(boolean newDocument) {
		super(newDocument, false);
		valid = true;
		documentType = EnDocumentType.OOXML_PRESENTATION;

		layout();

	}

	/**
	 * @param file
	 * @param newDocument
	 */
	public JOPresentationDocument(File file, boolean newDocument) {
		super(newDocument, false);
		loadFile(file);
		valid = true;
		documentType = EnDocumentType.OOXML_PRESENTATION;

		layout();

	}

	private void layout() {
	}

	@Override
	protected void init() {
	}

	@Override
	protected void processBody() {
	}

	@Override
	protected void processProperties() throws OpenXML4JException, IOException, XmlException {
	}

	@Override
	protected void processParts() {
	}

	@SuppressWarnings("hiding")
	@Override
	public void loadFile(File file) {
		this.file = file;

		init();

		styleTemplate = new JOStyleTemplate();

		try {
			loadDocument(file);
			valid = true;
		} catch (IOException e) {
			// // LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		} catch (OpenXML4JException e) {
			// // LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		} catch (XmlException e) {
			// // LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		} catch (Throwable e) {
			// // LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		}

	}

	@SuppressWarnings({ "unused", "deprecation" })
	@Override
	protected void processDocumentPart() {

		try {
			getThemesDocument();
			if (themeDocument != null) {
				CTOfficeStyleSheet officeStyleSheet = themeDocument.getTheme();
				CTCustomColorList ctCustomColorList = officeStyleSheet.getCustClrLst();
				CTOfficeArtExtensionList ctOfficeArtExtensionList = officeStyleSheet.getExtLst();
				CTColorSchemeList ctColorSchemeList = officeStyleSheet.getExtraClrSchemeLst();
				String themeName = officeStyleSheet.getName();

				// ---------- base style s -------------------------------------

				CTBaseStyles ctBaseStyle = officeStyleSheet.getThemeElements();
				if (ctBaseStyle != null) {
					Rcpl.colorProvider().createColorScheme(ctBaseStyle.getClrScheme());

					CTOfficeArtExtensionList ctOfficeArtExtensionList2 = ctBaseStyle.getExtLst();
					CTStyleMatrix ctStyleMatrix = ctBaseStyle.getFmtScheme();
					fontScheme = new JOFontScheme(ctBaseStyle.getFontScheme());
					CTObjectStyleDefaults ctObjectStyleDefaults = officeStyleSheet.getObjectDefaults();

					CTStyleMatrix fmtScheme = ctBaseStyle.getFmtScheme();
					if (fmtScheme != null) {
						CTBackgroundFillStyleList ctBackgroundFillStyleList = fmtScheme.getBgFillStyleLst();
						if (ctBackgroundFillStyleList != null) {
							CTGradientFillProperties[] ctGradientFillProperties = ctBackgroundFillStyleList
									.getGradFillArray();
							if (ctGradientFillProperties != null) {
								for (CTGradientFillProperties ctGradientFillProperties2 : ctGradientFillProperties) {

									CTPathShadeProperties ctPathShadeProperties = ctGradientFillProperties2.getPath();
									if (ctPathShadeProperties != null) {
										backGroundShadeType = ctPathShadeProperties.getPath();
									}
								}
							}

						}
					}
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

		} catch (XmlException e) {
			// TODO Auto-generated catch block

		}

		// getPoi().get
		CTPresentation ctPresentation = getPoi().getPresentation();
		ctPresentation.getAutoCompressPictures();
		ctPresentation.getBookmarkIdSeed();
		ctPresentation.getCompatMode();
		ctPresentation.getCustDataLst();
		ctPresentation.getCustShowLst();

		// TODO:

		CTColorMapping ctColorMapping = null;

		CTTextListStyle ctDefaultTextListStyle = ctPresentation.getDefaultTextStyle();
		if (ctDefaultTextListStyle != null) {
			if (ctDefaultTextListStyle.getDefPPr() != null) {
				defaultParagraphPropertiesLevel1 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getDefPPr(), "default_paragraph_properties", //$NON-NLS-1$
						ctColorMapping);
			}

			if (ctDefaultTextListStyle.getLvl1PPr() != null) {
				defaultParagraphPropertiesLevel1 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl1PPr(), "title_character_prop_1", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl2PPr() != null) {
				defaultParagraphPropertiesLevel2 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl2PPr(), "title_character_prop_2", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl3PPr() != null) {
				defaultParagraphPropertiesLevel3 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl3PPr(), "title_character_prop_3", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl4PPr() != null) {
				defaultParagraphPropertiesLevel4 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl4PPr(), "title_character_prop_4", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl5PPr() != null) {
				defaultParagraphPropertiesLevel5 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl5PPr(), "title_character_prop_5", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl6PPr() != null) {
				defaultParagraphPropertiesLevel6 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl6PPr(), "title_character_prop_6", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl7PPr() != null) {
				defaultParagraphPropertiesLevel7 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl7PPr(), "title_character_prop_7", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl8PPr() != null) {
				defaultParagraphPropertiesLevel8 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl8PPr(), "title_character_prop_8", //$NON-NLS-1$
						ctColorMapping);
			}
			if (ctDefaultTextListStyle.getLvl9PPr() != null) {
				defaultParagraphPropertiesLevel9 = new JOPropertyParagraphProperties<JOParagraphProperties>(this,
						ctDefaultTextListStyle, ctDefaultTextListStyle.getLvl9PPr(), "title_character_prop_9", //$NON-NLS-1$
						ctColorMapping);
			}
		}
		ctPresentation.getEmbeddedFontLst();
		ctPresentation.getEmbedTrueTypeFonts();
		ctPresentation.getExtLst();
		ctPresentation.getFirstSlideNum();
		ctPresentation.getHandoutMasterIdLst();
		ctPresentation.getKinsoku();
		ctPresentation.getModifyVerifier();
		ctPresentation.getNotesMasterIdLst();
		ctPresentation.getNotesSz();
		ctPresentation.getPhotoAlbum();
		ctPresentation.getRemovePersonalInfoOnSave();
		ctPresentation.getRtl();
		ctPresentation.getSaveSubsetFonts();
		ctPresentation.getServerZoom();
		ctPresentation.getShowSpecialPlsOnTitleSld();
		ctPresentation.getSldIdLst();

		CTSlideMasterIdList slideMasterIdList = ctPresentation.getSldMasterIdLst();
		CTSlideMasterIdListEntry[] masterSlideEntries = slideMasterIdList.getSldMasterIdArray();

		int index = 1;
		for (CTSlideMasterIdListEntry ctMasterSlideIdListEntry : masterSlideEntries) {
			CTSlideMaster ctSlideMaster;
			try {
				ctSlideMaster = getSlideMaster(ctMasterSlideIdListEntry);
				PackagePart masterPart = getSlideMasterPart(ctMasterSlideIdListEntry);
				Hashtable<String, String> relationsRegistry = new Hashtable<String, String>();
				URI uri = new URI("/" + getPrefix() + "/slideMasters/_rels/slideMaster" + index + ".xml.rels"); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
				processRelations(uri, Rcpl.RELATION_TYPE_IMAGE, relationsRegistry);

				JOSlideMasterDocument slideMasterDocument = new JOSlideMasterDocument(this);
				JOSlideMasterPart slideMaster = new JOSlideMasterPart(slideMasterDocument, masterPart,
						ctMasterSlideIdListEntry.getId2(), ctSlideMaster, relationsRegistry);
				slideMasters.add(slideMaster);

				PackageRelationshipCollection layouts = masterPart
						.getRelationshipsByType(Rcpl.SLIDE_LAYOUT_RELATION_TYPE);

				for (int i = 0; i < layouts.size(); i++) {
					PackageRelationship layoutRel = layouts.getRelationship(i);
					PackagePart layoutPart = getTargetPart(layoutRel);
					Hashtable<String, String> relationsRegistrySlideLayout = new Hashtable<String, String>();
					uri = new URI("/" + getPrefix() + "/slideLayouts/_rels/slideLayout" + (i + 1) + ".xml.rels"); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
					processRelations(uri, Rcpl.RELATION_TYPE_IMAGE, relationsRegistrySlideLayout);

					JOSlideLayoutDocument slideLayoutDocument = new JOSlideLayoutDocument(this);
					JOSlideLayoutPart slideLayout = new JOSlideLayoutPart(slideLayoutDocument, layoutPart,
							layoutRel.getId(), SldLayoutDocument.Factory.parse(layoutPart.getInputStream()),
							relationsRegistrySlideLayout);
					slideLayouts.add(slideLayout);
					slideMaster.getSlideLayouts().add(slideLayout);
				}

				index++;
			} catch (IOException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (XmlException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (URISyntaxException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (InvalidFormatException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			}
		}

		CTSlideIdList slideIdList = ctPresentation.getSldIdLst();
		CTSlideIdListEntry[] slideEntries = slideIdList.getSldIdArray();
		index = 1;
		for (CTSlideIdListEntry ctSlideIdListEntry : slideEntries) {
			try {
				Hashtable<String, String> relationsRegistrySlide = new Hashtable<String, String>();
				URI uri = new URI("/" + getPrefix() + "/slides/_rels/slide" + index + ".xml.rels"); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
				processRelations(uri, Rcpl.RELATION_TYPE_IMAGE, relationsRegistrySlide);

				// ---------- slide layouts ------------------------------------

				CTSlide ctSlide = getSlide(ctSlideIdListEntry);

				PackageRelationshipCollection layouts = getSlidePart(ctSlideIdListEntry)
						.getRelationshipsByType(Rcpl.SLIDE_LAYOUT_RELATION_TYPE);
				PackageRelationship layoutRel = layouts.getRelationship(0);
				PackagePart layoutPart = getTargetPart(layoutRel);
				URI targetURI = layoutRel.getTargetURI();
				JOSlideLayoutPart slideLayout = null;
				String id = layoutRel.getId();
				for (JOSlideMasterPart sM : slideMasters) {
					for (JOSlideLayoutPart sl : sM.getSlideLayouts()) {
						String id1 = sl.getId();
						if (id1.equals(id)) {
							slideLayout = sl;
							break;
						}
					}
				}
				PackagePart slidePart = getSlidePart(ctSlideIdListEntry);
				JOSlidePart slide = new JOSlidePart(this, slidePart, ctSlideIdListEntry.getId2(), slideLayout, ctSlide,
						relationsRegistrySlide);
				slides.add(slide);
			} catch (IOException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (XmlException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (URISyntaxException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (InvalidFormatException e) {
				// // LOGGER.error("", e); //$NON-NLS-1$
			} catch (Exception ex) {
				// // LOGGER.error("", ex); //$NON-NLS-1$
			}
			index++;
		}

		CTSlideSize ctSlideSize = ctPresentation.getSldSz();
		if (ctSlideSize != null) {
			pageSize = new JOPropertySize(null, ctPresentation, ctSlideSize, "SldSz", new String[] { "page_size" }, //$NON-NLS-2$
					EValueType.MEASUREMENT);
		}

		ctPresentation.getSmartTags();
		ctPresentation.getStrictFirstAndLastChars();

	}

	public PackagePart getSlidePart(CTSlideIdListEntry slide) throws IOException, XmlException {
		try {
			return getTargetPart(getCorePart().getRelationship(slide.getId2()));
		} catch (InvalidFormatException e) {
			throw new XmlException(e);
		}
	}

	/**
	 * Returns the low level slide object from the supplied slide reference
	 */
	@Internal
	public CTSlide getSlide(CTSlideIdListEntry slide) throws IOException, XmlException {
		PackagePart slidePart = getSlidePart(slide);
		SldDocument slideDoc = SldDocument.Factory.parse(slidePart.getInputStream());
		return slideDoc.getSld();
	}

	/**
	 * Returns the low level slide master object from the supplied slide master
	 * reference
	 */
	@Internal
	private CTSlideMaster getSlideMaster(CTSlideMasterIdListEntry master) throws IOException, XmlException {
		PackagePart masterPart = getSlideMasterPart(master);
		SldMasterDocument masterDoc = SldMasterDocument.Factory.parse(masterPart.getInputStream());
		return masterDoc.getSldMaster();
	}

	public PackagePart getSlideMasterPart(CTSlideMasterIdListEntry master) throws XmlException {
		try {
			return getTargetPart(getCorePart().getRelationship(master.getId2()));
		} catch (InvalidFormatException e) {
			throw new XmlException(e);
		}
	}

	@Override
	protected void processRelations() {
	};

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphProperties() {
		return defaultParagraphProperties;
	}

	@Override
	public int getNumberOfSlides() {
		return slides.size();
	}

	public JOSlidePart getSlide(int index) {
		return slides.get(index);
	}

	@Override
	protected void processHyperlinks() {
	}

	@Override
	protected void processComments() {
	}

	@Override
	protected void processAllEmbedds() {
	}

	@Override
	public void commit() throws IOException {

		super.commit();

		for (JOSlidePart s : slides) {
			s.save();
		}

		// XmlOptions xmlOptions = new XmlOptions(DEFAULT_XML_OPTIONS);
		// xmlOptions.setSaveSyntheticDocumentElement(new QName(CTDocument1.type
		// .getName().getNamespaceURI(), "presentation")); //$NON-NLS-1$
		// Map<String, String> map = new HashMap<String, String>();

		// map.put("http://schemas.openxmlformats.org/officeDocument/2006/math",
		// //$NON-NLS-1$
		// "m"); //$NON-NLS-1$
		// map.put("urn:schemas-microsoft-com:office:office", "o");
		// //$NON-NLS-1$//$NON-NLS-2$
		// map.put(
		// "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
		// //$NON-NLS-1$
		// "r"); //$NON-NLS-1$
		// map.put("urn:schemas-microsoft-com:vml", "v"); //$NON-NLS-1$
		// //$NON-NLS-2$
		// map.put("http://schemas.openxmlformats.org/markup-compatibility/2006",
		// //$NON-NLS-1$
		// "ve"); //$NON-NLS-1$
		// map.put("http://schemas.openxmlformats.org/wordprocessingml/2006/main",
		// //$NON-NLS-1$
		// "w"); //$NON-NLS-1$
		// map.put("urn:schemas-microsoft-com:office:word", "w10");
		// //$NON-NLS-1$//$NON-NLS-2$
		// map.put("http://schemas.microsoft.com/office/word/2006/wordml",
		// "wne"); //$NON-NLS-1$ //$NON-NLS-2$
		// map.put(
		// "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing",
		// //$NON-NLS-1$
		// "wp"); //$NON-NLS-1$

		// map.put("http://schemas.openxmlformats.org/drawingml/2006/main",
		// "a"); //$NON-NLS-1$ //$NON-NLS-2$
		// map.put("http://schemas.openxmlformats.org/officeDocument/2006/relationships",
		// "r"); //$NON-NLS-1$//$NON-NLS-2$
		// map.put("http://schemas.openxmlformats.org/presentationml/2006/main",
		// "p"); //$NON-NLS-1$//$NON-NLS-2$
		//
		// xmlOptions.setSaveSuggestedPrefixes(map);

		// saveNamedRanges();
		// saveCalculationChain();

		// getPoi().getPackage().addMarshaller(XSLFSlideShow.SLIDE_CONTENT_TYPE,
		// new ZipPartMarshaller());

		// for (JOSlidePart slide : slides) {
		// // if (slide.isDirty())
		// {
		// slide.save();
		// }
		// }

		// XmlOptions xmlOptions = new XmlOptions(DEFAULT_XML_OPTIONS);
		// xmlOptions.setSaveSyntheticDocumentElement(new
		// QName(CTPresentation.type
		// .getName().getNamespaceURI(), "presentation")); //$NON-NLS-1$
		// Map<String, String> map = new HashMap<String, String>();
		// map.put(STRelationshipId.type.getName().getNamespaceURI(), "r");
		// //$NON-NLS-1$
		// map.put("http://schemas.openxmlformats.org/drawingml/2006/main",
		// "a"); //$NON-NLS-1$ //$NON-NLS-2$
		// map.put(
		// "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
		// "r"); //$NON-NLS-1$//$NON-NLS-2$
		// map.put(
		// "http://schemas.openxmlformats.org/presentationml/2006/main", "p");
		// //$NON-NLS-1$//$NON-NLS-2$
		// xmlOptions.setSaveSuggestedPrefixes(map);
		//
		// PackagePart part = xml.getPackagePart();
		// PackageRelationship coreRel =
		// xml.getPackage().getRelationshipsByType(
		// PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0);
		//
		// part = xml.getPackage().getPart(coreRel);
		//
		// OutputStream out = part.getOutputStream();
		// getPoi().getPresentation().save(out, xmlOptions);
		// out.close();

	}

	/**
	 * // * this holds the XSSFName objects attached to this workbook //
	 */
	// private List<XSSFName> namedRanges;
	//
	// /**
	// * marshal named ranges from the {@link #namedRanges} collection to the
	// underlying CTWorkbook bean
	// */
	// private void saveNamedRanges(){
	// // Named ranges
	// if(namedRanges.size() > 0) {
	// CTDefinedNames names = CTDefinedNames.Factory.newInstance();
	// CTDefinedName[] nr = new CTDefinedName[namedRanges.size()];
	// int i = 0;
	// for(XSSFName name : namedRanges) {
	// nr[i] = name.getCTName();
	// i++;
	// }
	// names.setDefinedNameArray(nr);
	// workbook.setDefinedNames(names);
	// } else {
	// if(workbook.isSetDefinedNames()) {
	// workbook.unsetDefinedNames();
	// }
	// }
	// }
	//
	// private void saveCalculationChain(){
	// if(calcChain != null){
	// int count = calcChain.getCTCalcChain().getCArray().length;
	// if(count == 0){
	// removeRelation(calcChain);
	// calcChain = null;
	// }
	// }
	// }

	@Override
	protected void createPoiDocument() throws IOException {
		try {
			OPCPackage opcPackage = POIXMLDocument.openPackage(file.toString());
			xml = new XSLFSlideShow(opcPackage);

		} catch (OpenXML4JException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		} catch (XmlException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	public XSLFSlideShow getPoi() {
		return (XSLFSlideShow) xml;
	}

	public JOPropertySize getPageSize() {
		return pageSize;
	}

	public List<JOSlideMasterPart> getMasterSlides() {
		return slideMasters;
	}

	/**
	 * Returns the low level notes object for the given slide, as found from the
	 * supplied slide reference
	 */
	private void getThemesDocument() throws IOException, XmlException {
		try {
			PackagePart corePart = getCorePart();
			PackageRelationshipCollection themesCollection = corePart.getRelationshipsByType(Rcpl.THEME_RELATION_TYPE);
			PackageRelationship themesRel = themesCollection.getRelationship(0);
			PackagePart themePart = getTargetPart(themesRel);
			themeDocument = ThemeDocument.Factory.parse(themePart.getInputStream());
		} catch (InvalidFormatException e) {
			throw new XmlException(e);
		}
	}

	public JOFontScheme getFontScheme() {
		return fontScheme;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel1() {
		return defaultParagraphPropertiesLevel1;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel2() {
		return defaultParagraphPropertiesLevel2;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel3() {
		return defaultParagraphPropertiesLevel3;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel4() {
		return defaultParagraphPropertiesLevel4;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel5() {
		return defaultParagraphPropertiesLevel5;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel6() {
		return defaultParagraphPropertiesLevel6;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel7() {
		return defaultParagraphPropertiesLevel7;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel8() {
		return defaultParagraphPropertiesLevel8;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getDefaultParagraphPropertiesLevel9() {
		return defaultParagraphPropertiesLevel9;
	}

	public List<JOSlideMasterPart> getSlideMasters() {
		return slideMasters;
	}

	@Override
	public String getXmlCoreDocumentFileName() {
		return "presentation.xml"; //$NON-NLS-1$
	}

	@Override
	public boolean isWord() {
		return false;
	}

	@Override
	public boolean isPresentation() {
		return true;
	}

	@Override
	public boolean isSpreadsheet() {
		return false;
	}

	@Override
	public void addWatermark(String text) {
	}

	@Override
	public CTColorSchemeMapping getColorsSchemeMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param slideMasterPart
	 * @param slidePart
	 */
	@SuppressWarnings("unused")
	public void addSlide(JOSlideMasterPart slideMasterPart, JOSlidePart slidePart) {
		new JOSlidePart(this, xml.getPackagePart(), slidePart);
		setDirty(true);
	}

	@Override
	public String getRoot() {
		return "/ppt"; //$NON-NLS-1$
	}

	public List<JOSlidePart> getSlides() {
		return slides;
	}

	public List<JOSlideLayoutPart> getSlideLayouts() {
		return slideLayouts;
	}

	@Override
	public String getDefaultPerspective() {
		return "PRESENTATION";
	}

}
