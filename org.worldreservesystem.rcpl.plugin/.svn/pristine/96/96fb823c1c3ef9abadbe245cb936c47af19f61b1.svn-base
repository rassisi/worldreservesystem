package com.joffice.rcpl.plugin.office.internal.model.word;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLProperties;
import org.apache.poi.POIXMLProperties.ExtendedProperties;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.internal.PackagePropertiesPart;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFHyperlink;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.xmlbeans.XmlException;
import org.eclipse.rcpl.EnDocumentType;
import org.eclipse.rcpl.IDocumentListener;
import org.eclipse.rcpl.IHeader;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IWordDocument;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHdrFtr;

import com.joffice.rcpl.plugin.office.JODefaultLayoutObject;
import com.joffice.rcpl.plugin.office.databinding2.JOColorProperty;
import com.joffice.rcpl.plugin.office.internal.JOAbstractDocument;
import com.joffice.rcpl.plugin.office.internal.JOStyleTemplate;
import com.joffice.rcpl.plugin.office.poi.extension.XWPFDocumentCustom;

import javafx.concurrent.Task;

/**
 * @author ramin
 * 
 */
public class JOWordDocument extends JOAbstractDocument implements IWordDocument {

	private int[] pos = new int[1];

	private JOSettingsDocument settingsDocument;

	private JONumberingDocument numberingDocument;

	private boolean templateDocument;

	public JOWordDocument(XWPFDocument poiDoc, boolean newDocument, boolean templateDocument,
			HashMap<String, String> wordReplacements, boolean onePage) {
		super(newDocument, wordReplacements, onePage);

		this.templateDocument = templateDocument;
		xml = poiDoc;
		if (templateDocument) {
			section = processSection();
		}
		valid = true;
	}

	/**
	 * @param file
	 */
	public JOWordDocument(final File file, boolean newDocument, boolean templateDocument,
			HashMap<String, String> wordReplacements, boolean onePage) {
		super(newDocument, wordReplacements, onePage);
		this.templateDocument = templateDocument;
		documentType = EnDocumentType.OOXML_WORDPROCESSING;
		if (!templateDocument) {
			loadFile(file);
			for (IDocumentListener l : getDocumentListeners()) {
				l.documentLoaded();
			}
		}
	}

	@Override
	public void addWatermark(String text) {
		if (templateDocument) {
			return;
		}
		try {
			XWPFHeader newHeader = ((XWPFDocument) xml).getHeaderFooterPolicy().createHeader(STHdrFtr.DEFAULT);
			CTHdrFtr hdr = newHeader._getHdrFtr();
			CTSdtBlock stdBlock = hdr.addNewSdt();
			JOHeader newJoHeader = new JOHeader((JOSection) getSection(), hdr, false, false, false, templateDocument);
			((JOSection) getSection()).getHeaders().add(newJoHeader);
			JOWordDocument dotX = ((JOStyleTemplate) Rcpl.globalStyleTemplate()).getDotxDocument();
			for (IHeader h0 : ((JOSection) dotX.getSection()).getHeaders()) {
				JOHeader h = (JOHeader) h0;
				if (h.getWatermark() != null) {
					stdBlock.set(h.getSdtBlocks()[0]);
					if (getSection() != null) {
						for (IHeader h20 : ((JOSection) getSection()).getHeaders()) {
							JOHeader h2 = (JOHeader) h20;
							CTSdtBlock[] stdBlocks2 = h2.getSdtBlocks();
							if (stdBlocks2 != null && stdBlocks2.length > 0) {
								h2.processStdBlocks();
								// h2.getWatermark().getTextPath().set(text);
								// h2.processStdBlocks();
								// TODO: repaint
								// JOUtil.getEditorFigure().repaint ();
								break;
							}
						}
					}
					break;
				}
			}
		} catch (IOException e) {
		}
	}

	@Override
	protected void init() {
	}

	/**
	 * @param xml
	 */
	@Override
	protected void processDocumentPart() {
		CTDocument1 doc = ((XWPFDocumentCustom) xml).getDocument();
		background = new JOColorProperty(null, null, doc, "Background", null, true, null); //$NON-NLS-1$

		for (POIXMLDocumentPart p : xml.getRelations()) {
			String relation = p.getPackageRelationship().getRelationshipType();
			if (relation.equals(XWPFRelation.COMMENT.getRelation())) {
				// CommentsDocument cmntdoc =
				// CommentsDocument.Factory.parse(p.getPackagePart().getInputStream());
				// for(CTComment ctcomment :
				// cmntdoc.getComments().getCommentArray()) {
				// comments.add(new XWPFComment(ctcomment));
				// }
			} else if (relation.equals(XWPFRelation.SETTINGS.getRelation())) {
				// XWPFSettings poiSettings = (XWPFSettings) p;
				settingsDocument = new JOSettingsDocument(false);
				settingsPart = new JOSettingsPart(settingsDocument, p.getPackagePart());
			} else
				if (relation.equals("http://schemas.openxmlformats.org/officeDocument/2006/relationships/numbering")) { //$NON-NLS-1$
				numberingDocument = new JONumberingDocument(false);
				numberingPart = new JONumberingPart(numberingDocument, p.getPackagePart());
			}
		}
	}

	class MyTask extends Task<Void> {

		@Override
		protected Void call() throws Exception {
			return null;
		}

		@Override
		public void updateProgress(double arg0, double arg1) {
			super.updateProgress(arg0, arg1);

			// System.out.("x1: " + arg0 + " x2: " + arg1);
		}
	}

	/**
	 * @param ctBody
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected void processBody() {

		setLayouted(false);

		pos[0] = 0;
		CTBody ctBody = ((XWPFDocumentCustom) xml).getDocument().getBody();
		section = processSection();

		int numberOfRootElements = 0;
		numberOfRootElements += ((XWPFDocumentCustom) xml).getDocument().getBody().getTblArray().length;
		numberOfRootElements += ctBody.getSdtArray().length;
		numberOfRootElements += ((XWPFDocumentCustom) xml).getParagraphs().size();
		start = 0.05;

		processStds(ctBody);
		processParagraphs();
		processTables();
		ctBody.getAltChunkArray();
		ctBody.getBookmarkEndArray();
		ctBody.getBookmarkStartArray();
		ctBody.getCommentRangeEndArray();
		ctBody.getCustomXmlArray();
		ctBody.getCustomXmlDelRangeEndArray();
		ctBody.getCustomXmlDelRangeStartArray();
		ctBody.getCustomXmlInsRangeEndArray();
		ctBody.getCustomXmlInsRangeEndArray();
		ctBody.getCustomXmlMoveFromRangeEndArray();
		ctBody.getDelArray();
		ctBody.getPArray();
		ctBody.getPermEndArray();
		ctBody.getPermEndArray();
		ctBody.getProofErrArray();

		// sortLayoutObjects();

	}

	/**
	 * @param ctBody
	 */

	/**
	 * @param xml
	 * @throws OpenXML4JException
	 * @throws IOException
	 * @throws XmlException
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected void processProperties() throws OpenXML4JException, IOException, XmlException {
		POIXMLProperties poiXmlProperties = xml.getProperties();

		// --------- core properties -------------------------------------------

		coreProperties = poiXmlProperties.getCoreProperties();
		title = coreProperties.getTitle();
		creator = coreProperties.getCreator();

		PackagePropertiesPart packagePropertiesPart = coreProperties.getUnderlyingProperties();
		status = packagePropertiesPart.getContentStatusProperty().getValue();
		category = packagePropertiesPart.getCategoryProperty().getValue();
		contentType = packagePropertiesPart.getContentType();
		packagePropertiesPart.getContentTypeProperty().getValue();
		createdDate = packagePropertiesPart.getCreatedProperty().getValue();
		createdString = packagePropertiesPart.getCreatedPropertyString();
		description = packagePropertiesPart.getDescriptionProperty().getValue();
		identifier = packagePropertiesPart.getIdentifierProperty().getValue();
		keyWords = packagePropertiesPart.getKeywordsProperty().getValue();
		language = packagePropertiesPart.getLanguageProperty().getValue();
		modifiedBy = packagePropertiesPart.getLastModifiedByProperty().getValue();
		lastPrintedDate = packagePropertiesPart.getLastPrintedProperty().getValue();
		lastPrintedString = packagePropertiesPart.getLastPrintedPropertyString();
		modiedDate = packagePropertiesPart.getModifiedProperty().getValue();
		// PackageRelationshipCollection packageRelationCollection =
		// packagePropertiesPart
		// .getRelationships();
		revision = packagePropertiesPart.getRevisionProperty().getValue();
		subject = packagePropertiesPart.getSubjectProperty().getValue();
		title2 = packagePropertiesPart.getTitleProperty().getValue();
		version = packagePropertiesPart.getVersionProperty().getValue();

		// ------------ custom properties --------------------------------------

		// CustomProperties customProperties = poiXmlProperties
		// .getCustomProperties();
		// CTProperties customUnderlyingProperties = customProperties
		// .getUnderlyingProperties();
		// CTProperty[] customPropertiesArray = customUnderlyingProperties
		// .getPropertyArray();
		// for (CTProperty property : customPropertiesArray) {
		// // property.get
		// }

		// ------------- extended properties -----------------------------------

		ExtendedProperties extendedProperties = poiXmlProperties.getExtendedProperties();
		org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties extendedUnderlyingProperties = extendedProperties
				.getUnderlyingProperties();
		application = extendedUnderlyingProperties.getApplication();
		appVersion = extendedUnderlyingProperties.getAppVersion();
		numberOfCharacters = extendedUnderlyingProperties.getCharacters();
		numberOfCharactersIncludingWhiteSpaces = extendedUnderlyingProperties.getCharactersWithSpaces();
		company = extendedUnderlyingProperties.getCompany();
		// digSig = extendedUnderlyingProperties.getDigSig();
		docSecurity = extendedUnderlyingProperties.getDocSecurity();
		// headingPairs = extendedUnderlyingProperties.getHeadingPairs();
		hiddenSlides = extendedUnderlyingProperties.getHiddenSlides();
		// hLinks = extendedUnderlyingProperties.getHLinks();
		hyperlinkBase = extendedUnderlyingProperties.getHyperlinkBase();
		hyperLinksChanged = extendedUnderlyingProperties.getHyperlinksChanged();
		numberOfLines = extendedUnderlyingProperties.getLines();
		linksUpToDate = extendedUnderlyingProperties.getLinksUpToDate();
		manager = extendedUnderlyingProperties.getManager();
		mmClips = extendedUnderlyingProperties.getMMClips();
		numberOfNotes = extendedUnderlyingProperties.getNotes();
		numberOfPages = extendedUnderlyingProperties.getPages();
		numberOfParagraphs = extendedUnderlyingProperties.getParagraphs();
		presentationsFormat = extendedUnderlyingProperties.getPresentationFormat();
		scaleCrop = extendedUnderlyingProperties.getScaleCrop();
		sharedDoc = extendedUnderlyingProperties.getSharedDoc();
		numberOfSlides = extendedUnderlyingProperties.getSlides();
		templeate = extendedUnderlyingProperties.getTemplate();
		// titleOfParts = extendedUnderlyingProperties.getTitlesOfParts();
		totalTime = extendedUnderlyingProperties.getTotalTime();
		numberOfWords = extendedUnderlyingProperties.getWords();

		final int tableNumber = ((XWPFDocumentCustom) xml).getDocument().getBody().getTblArray().length;
		final int paragraphNumber = getNumberOfParagraphs();

	}

	/**
	 * @param ctBody
	 * @param sizes
	 * @param pos
	 */
	@SuppressWarnings("deprecation")
	private void processStds(CTBody ctBody) {
		CTSdtBlock[] ctStdBlocks = ctBody.getSdtArray();
		if (ctStdBlocks != null) {
			for (CTSdtBlock ctSdtBlock : ctStdBlocks) {
				CTSdtContentBlock contentBlock = ctSdtBlock.getSdtContent();
				for (CTP ctp : contentBlock.getPArray()) {
					// int[] siz = getSize(paragraphSizes, pos);

					// JOAbstractDocument document, JOObject anchorObject,
					// XmlObject xmlParent, XmlObject xmlObject, int width, int
					// height,
					// double cellMarginLeft, double cellMarginRight,
					// double cellMarginTop, double cellMarginBottom,
					// JOTable containerTable, boolean childObject, boolean
					// inTextBox,
					// JOSection section, JOStyle style, boolean rootObject

					@SuppressWarnings("unused")
					JOParagraph par = new JOParagraph(this, null, ctSdtBlock, ctp, 0, 0, 0.0, 0.0, 0.0, 0.0, null,
							false, false, null, null, true, -1, null);
				}

			}
		}
	}

	double start;

	/**
	 * @param xml
	 */
	public JOParagraph processParagraphs() {

		List<XWPFParagraph> poiParagraphs = ((XWPFDocumentCustom) xml).getParagraphs();

		firstDirtyParagraph = null;
		int secondCounter = 0;

		int paragraphCounter = 0;

		for (XWPFParagraph paragraph : poiParagraphs) {

			// JOAbstractDocument document, JOObject anchorObject,
			// XmlObject xmlParent, XmlObject xmlObject, int width, int
			// height,
			// double cellMarginLeft, double cellMarginRight,
			// double cellMarginTop, double cellMarginBottom,
			// JOTable containerTable, boolean childObject, boolean
			// inTextBox,
			// JOSection section, JOStyle style, boolean rootObject

			final JOParagraph par = new JOParagraph(JOWordDocument.this, null, null, paragraph.getCTP(), 0, 0, 0.0, 0.0,
					0.0, 0.0, null, false, false, null, null, true, -1, paragraph);

			paragraphCounter++;

			switch (paragraphCounter) {
			case 1:
			case 2:
			case 3:
			case 10:
				// layout(null);
				break;
			case 11:
				firstDirtyParagraph = par;
				break;
			}

			if (onePage && paragraphCounter > 50) {
				break;
			}

			Rcpl.progressMessage("Loading...");
		}

		return firstDirtyParagraph;
	}

	/**
	 * @return
	 */
	public JOParagraph getFirstParagraph() {
		for (ILayoutObject l : getRootObjects()) {
			if (l instanceof JOParagraph) {
				return (JOParagraph) l;
			}
		}
		return null;
	}

	/**
	 * 
	 */
	@SuppressWarnings({ "deprecation" })
	public void processTables() {
		CTTbl[] tbls = ((XWPFDocumentCustom) xml).getDocument().getBody().getTblArray();
		for (CTTbl tbl : tbls) {
			new JOTable(this, null, tbl, false, true, -1);
			Rcpl.progressMessage("Loading tables...");
		}
	}

	/**
	 * @param xml
	 */
	@Override
	protected void processHyperlinks() {
		XWPFHyperlink[] hyperlinks = ((XWPFDocumentCustom) xml).getHyperlinks();
		if (hyperlinks != null) {
			for (XWPFHyperlink hyperlink : hyperlinks) {
				// // LOGGER.debug(hyperlink.toString());
			}
		}
	}

	@Override
	protected void processRelations() {
		try {
			processRelations(new URI("/" + getPrefix() + "/_rels/document.xml.rels"), Rcpl.RELATION_TYPE_IMAGE, //$NON-NLS-1$ //$NON-NLS-2$
					part.getRelationsRegistry());
		} catch (URISyntaxException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	@Override
	protected void processParts() {
	}

	@Override
	protected void processComments() {
	}

	@Override
	protected void processAllEmbedds() {
	}

	/**
	 * @param sectPr
	 * @return
	 */
	public JOSection processSection() {
		CTBody ctBody = ((XWPFDocument) xml).getDocument().getBody();
		CTSectPr sectPr = ctBody.getSectPr();
		if (sectPr != null) {
			return new JOSection(new JODefaultLayoutObject(this), null, null, sectPr, templateDocument);
		}
		return null;
	}

	@Override
	protected void createPoiDocument() throws IOException {
		OPCPackage opcPackage = POIXMLDocument.openPackage(file.toString());
		xml = new XWPFDocumentCustom(opcPackage);
	}

	@Override
	public String getXmlCoreDocumentFileName() {
		return "document.xml"; //$NON-NLS-1$
	}

	@Override
	public CTColorSchemeMapping getColorsSchemeMapping() {
		return settingsDocument.getSettingsPart().getCtColorSchemeMapping();
	}

	public JONumberingDocument getNumberingDocument() {
		return numberingDocument;
	}

	@Override
	public boolean isWord() {
		return true;
	}

	@Override
	public boolean isPresentation() {
		return false;
	}

	@Override
	public boolean isSpreadsheet() {
		return false;
	}

	@Override
	public String toString() {
		return ((XWPFDocumentCustom) xml).getDocument().toString();
	}

	public void setTemplateDocument(boolean templateDocument) {
		this.templateDocument = templateDocument;
	}

	@Override
	public String getRoot() {
		return "/word"; //$NON-NLS-1$
	}

	@Override
	public void setDirty(boolean dirty) {
		super.setDirty(dirty);
	}

	@Override
	public String getDefaultPerspective() {
		return "WORD";
	}

	@Override
	protected void processDocument() throws IOException, OpenXML4JException, XmlException {
		super.processDocument();
	}
}
