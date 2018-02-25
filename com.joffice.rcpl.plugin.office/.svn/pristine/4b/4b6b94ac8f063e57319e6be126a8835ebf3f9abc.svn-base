/******************************************************************************
 *    Ramin Assisi
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLFactory;
import org.apache.poi.POIXMLProperties.CoreProperties;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageProperties;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackageRelationshipTypes;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFFactory;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.xmlbeans.XmlException;
import org.eclipse.rcpl.EnDocumentType;
import org.eclipse.rcpl.IColorProperty;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IDocumentListener;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IPart;
import org.eclipse.rcpl.IProperty2;
import org.eclipse.rcpl.IResource;
import org.eclipse.rcpl.ISection;
import org.eclipse.rcpl.ISelectable;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.util.JOUtil2;

import com.joffice.rcpl.plugin.office.JODocumentLayoutObject;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOPresentationDocument;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOSpreadsheetDocument;
import com.joffice.rcpl.plugin.office.internal.model.word.JONumberingPart;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSection;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSettingsPart;
import com.joffice.rcpl.plugin.office.internal.model.word.JOWordDocument;
import com.joffice.rcpl.plugin.office.poi.extension.XWPFDocumentCustom;

/**
 * @author ramin
 * 
 */
public abstract class JOAbstractDocument implements IDocument {

	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOAbstractDocument.class);

	private List<IProperty2> dataBindingProperties = new ArrayList<IProperty2>();

	private HashMap<String, String> wordReplacements = null;

	// ---------- databinding 2 ------------------------------------------------

	protected IColorProperty background;

	// -------------------------------------------------------------------------

	protected ISection section;

	protected CoreProperties coreProperties;
	protected JOSettingsPart settingsPart;
	protected JONumberingPart numberingPart;

	protected String title;
	protected String creator;
	protected String status;
	protected String category;
	protected String contentType;
	// packagePropertiesPart.getContentTypeProperty().getValue();
	protected Date createdDate;
	protected String createdString;
	protected String description;
	protected String identifier;
	protected String keyWords;
	protected String language;
	protected String modifiedBy;
	protected Date lastPrintedDate;
	protected String lastPrintedString;
	protected Date modiedDate;

	protected String revision;
	protected String subject;
	protected String title2;
	protected String version;
	private boolean closing = false;
	private boolean loading;

	// custom properties

	protected String application;
	protected String appVersion;
	protected int numberOfCharacters;
	protected int numberOfCharactersIncludingWhiteSpaces;
	protected String company;
	protected int docSecurity;
	protected int hiddenSlides;
	protected String hyperlinkBase;
	protected boolean hyperLinksChanged;
	protected int numberOfLines;
	protected boolean linksUpToDate;
	protected String manager;
	protected int mmClips;
	protected int numberOfNotes;
	protected int numberOfPages;
	protected int numberOfParagraphs;
	protected String presentationsFormat;
	protected boolean scaleCrop;
	protected boolean sharedDoc;
	protected int numberOfSlides;
	protected String templeate;
	protected int totalTime;
	protected int numberOfWords;

	private List<ILayoutObject> layoutObjects = new ArrayList<ILayoutObject>();
	protected List<Object> resources = new Vector<Object>();
	protected List<Object> headerParts = new Vector<Object>();
	private List<ISelectable> selectables = new Vector<ISelectable>();

	protected POIXMLDocument xml;
	protected boolean dirty;
	protected boolean valid;

	protected boolean newDocument = false;

	protected IImage image;

	protected boolean dirtyBecauseOfFirstLayout = false;

	private boolean dirtyRegistry;

	private boolean allParagraphsCharactersLayouted;

	protected IPart part;

	protected EnDocumentType documentType;

	protected JOParagraph firstDirtyParagraph;

	private boolean layouted = false;

	private List<IDocumentListener> documentListeners = new ArrayList<IDocumentListener>();

	private List<ILayoutObject> rootLayoutObjects;

	protected IEditor editor;

	protected IStyleTemplate styleTemplate;

	protected boolean onePage;

	private boolean disposed;

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
		if (getEditor() != null) {
			getEditor().updateTabText(null, dirty);
		}
	}

	@Override
	public IEditor getEditor() {
		return editor;
	}

	@Override
	public void setEditorFigure(IEditor editorFigure) {
		this.editor = editorFigure;
		this.editor.setDocument(this);
	}

	@Override
	public POIXMLDocument getXml() {
		return xml;
	}

	protected File file;

	@Override
	public File getFile() {
		return file;
	}

	@Override
	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public IStyleTemplate getStyleTemplate() {
		if (styleTemplate == null) {
			styleTemplate = Rcpl.globalStyleTemplate();
		}
		return styleTemplate;
	}

	/**
	 * @param bigDecimal
	 * @return
	 */
	@Override
	public int transFormToInt(BigDecimal bigDecimal) {
		return (int) (bigDecimal.doubleValue() / JOConversion.getTransFormFactor());
	}

	public JOAbstractDocument(boolean newDocument, boolean onePage) {
		this(newDocument, null, onePage);
	}

	public JOAbstractDocument(boolean newDocument, HashMap<String, String> wordReplacements, boolean onePage) {
		this.newDocument = newDocument;
		this.wordReplacements = wordReplacements;
		this.onePage = onePage;
	}

	/**
	 * 
	 */
	@Override
	public void loadFile(File f) {
		this.file = f;
		init();
		styleTemplate = new JOStyleTemplate(file);
		try {
			loadDocument(file);
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		} catch (OpenXML4JException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		} catch (XmlException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		} catch (Throwable e) {
			// LOGGER.error("", e); //$NON-NLS-1$
			dispose();
		}
	}

	/**
	 * 
	 */
	protected abstract void init();

	/**
	 * @param file
	 * @return
	 * @throws IOException
	 * @throws OpenXML4JException
	 * @throws XmlException
	 */
	public static IDocument load(File file, boolean newDocument, HashMap<String, String> wordReplacements,
			boolean onePage) {
		IDocument doc = createDocument(file, true, newDocument, wordReplacements, onePage);
		return doc;
	}

	/**
	 * @param fileName
	 * @return
	 */
	public static IImage getDocumentImage(String fileName) {
		try {
			if (fileName.toLowerCase().endsWith(EnDocumentType.OOXML_WORDPROCESSING.getDotExtension())) {
				return Rcpl.resources().getImage("word", 16, 16); //$NON-NLS-1$ );

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOXML_SPREADSHEET.getDotExtension())) {
				return Rcpl.resources().getImage("spreadsheet", 16, 16); //$NON-NLS-1$

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOXML_PRESENTATION.getDotExtension())) {
				return Rcpl.resources().getImage("presentation", 16, 16); //$NON-NLS-1$

				// ---

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOPRESENTATION.getDotExtension())) {
				return Rcpl.resources().getImage("oopresentation", 16, 16); //$NON-NLS-1$

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOFORMULA.getDotExtension())) {
				return Rcpl.resources().getImage("ooformula", 16, 16); //$NON-NLS-1$

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOGRAPHIC.getDotExtension())) {
				return Rcpl.resources().getImage("oographic", 16, 16); //$NON-NLS-1$

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOMASTER.getDotExtension())) {
				return Rcpl.resources().getImage("oomaster", 16, 16); //$NON-NLS-1$

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOTEXT.getDotExtension())) {
				return Rcpl.resources().getImage("ootext", 16, 16); //$NON-NLS-1$

			} else if (fileName.toLowerCase().endsWith(EnDocumentType.OOSPREADSHEET.getDotExtension())) {
				return Rcpl.resources().getImage("oospreadsheet", 16, 16); //$NON-NLS-1$
			} else {
				// @SuppressWarnings("unused")
				// URL url = new URL(fileName);
				return Rcpl.resources().getImage("webbrowser", 16, 16); //$NON-NLS-1$

			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * @return
	 */
	@Override
	public CoreProperties getCoreProperties() {
		return coreProperties;
	}

	/**
	 * @param coreProperties
	 */
	@Override
	public void setCoreProperties(CoreProperties coreProperties) {
		this.coreProperties = coreProperties;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String getContentType() {
		return contentType;
	}

	@Override
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String getCreatedString() {
		return createdString;
	}

	@Override
	public void setCreatedString(String createdString) {
		this.createdString = createdString;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String getKeyWords() {
		return keyWords;
	}

	@Override
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	@Override
	public String getLanguage() {
		return language;
	}

	@Override
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public Date getLastPrintedDate() {
		return lastPrintedDate;
	}

	@Override
	public void setLastPrintedDate(Date lastPrintedDate) {
		this.lastPrintedDate = lastPrintedDate;
	}

	@Override
	public String getLastPrintedString() {
		return lastPrintedString;
	}

	@Override
	public void setLastPrintedString(String lastPrintedString) {
		this.lastPrintedString = lastPrintedString;
	}

	@Override
	public Date getModiedDate() {
		return modiedDate;
	}

	@Override
	public void setModiedDate(Date modiedDate) {
		this.modiedDate = modiedDate;
	}

	@Override
	public String getRevision() {
		return revision;
	}

	@Override
	public void setRevision(String revision) {
		this.revision = revision;
	}

	@Override
	public String getSubject() {
		return subject;
	}

	@Override
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String getTitle2() {
		return title2;
	}

	@Override
	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String getApplication() {
		return application;
	}

	@Override
	public void setApplication(String application) {
		this.application = application;
	}

	@Override
	public String getAppVersion() {
		return appVersion;
	}

	@Override
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	@Override
	public int getNumberOfCharacters() {
		return numberOfCharacters;
	}

	@Override
	public void setNumberOfCharacters(int numberOfCharacters) {
		this.numberOfCharacters = numberOfCharacters;
	}

	@Override
	public int getNumberOfCharactersIncludingWhiteSpaces() {
		return numberOfCharactersIncludingWhiteSpaces;
	}

	@Override
	public void setNumberOfCharactersIncludingWhiteSpaces(int numberOfCharactersIncludingWhiteSpaces) {
		this.numberOfCharactersIncludingWhiteSpaces = numberOfCharactersIncludingWhiteSpaces;
	}

	@Override
	public String getCompany() {
		return company;
	}

	@Override
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int getDocSecurity() {
		return docSecurity;
	}

	@Override
	public void setDocSecurity(int docSecurity) {
		this.docSecurity = docSecurity;
	}

	@Override
	public int getHiddenSlides() {
		return hiddenSlides;
	}

	@Override
	public void setHiddenSlides(int hiddenSlides) {
		this.hiddenSlides = hiddenSlides;
	}

	@Override
	public String getHyperlinkBase() {
		return hyperlinkBase;
	}

	@Override
	public void setHyperlinkBase(String hyperlinkBase) {
		this.hyperlinkBase = hyperlinkBase;
	}

	@Override
	public boolean isHyperLinksChanged() {
		return hyperLinksChanged;
	}

	@Override
	public void setHyperLinksChanged(boolean hyperLinksChanged) {
		this.hyperLinksChanged = hyperLinksChanged;
	}

	@Override
	public int getNumberOfLines() {
		return numberOfLines;
	}

	@Override
	public void setNumberOfLines(int numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	@Override
	public boolean isLinksUpToDate() {
		return linksUpToDate;
	}

	@Override
	public void setLinksUpToDate(boolean linksUpToDate) {
		this.linksUpToDate = linksUpToDate;
	}

	@Override
	public String getManager() {
		return manager;
	}

	@Override
	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public int getMmClips() {
		return mmClips;
	}

	@Override
	public void setMmClips(int mmClips) {
		this.mmClips = mmClips;
	}

	@Override
	public int getNumberOfNotes() {
		return numberOfNotes;
	}

	@Override
	public void setNumberOfNotes(int numberOfNotes) {
		this.numberOfNotes = numberOfNotes;
	}

	@Override
	public int getNumberOfPages() {
		return numberOfPages;
	}

	@Override
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public int getNumberOfParagraphs() {
		return numberOfParagraphs;
	}

	@Override
	public void setNumberOfParagraphs(int numberOfParagraphs) {
		this.numberOfParagraphs = numberOfParagraphs;
	}

	@Override
	public String getPresentationsFormat() {
		return presentationsFormat;
	}

	@Override
	public void setPresentationsFormat(String presentationsFormat) {
		this.presentationsFormat = presentationsFormat;
	}

	@Override
	public boolean isScaleCrop() {
		return scaleCrop;
	}

	@Override
	public void setScaleCrop(boolean scaleCrop) {
		this.scaleCrop = scaleCrop;
	}

	@Override
	public boolean isSharedDoc() {
		return sharedDoc;
	}

	@Override
	public void setSharedDoc(boolean sharedDoc) {
		this.sharedDoc = sharedDoc;
	}

	@Override
	public int getNumberOfSlides() {
		return numberOfSlides;
	}

	@Override
	public void setNumberOfSlides(int numberOfSlides) {
		this.numberOfSlides = numberOfSlides;
	}

	@Override
	public String getTempleate() {
		return templeate;
	}

	@Override
	public void setTempleate(String templeate) {
		this.templeate = templeate;
	}

	@Override
	public int getTotalTime() {
		return totalTime;
	}

	@Override
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	@Override
	public int getNumberOfWords() {
		return numberOfWords;
	}

	@Override
	public void setNumberOfWords(int numberOfWords) {
		this.numberOfWords = numberOfWords;
	}

	@Override
	public void addLayoutObject(ILayoutObject layoutObject) {
		if (!layoutObjects.contains(layoutObject)) {
			layoutObjects.add(layoutObject);
			if (layoutObject.isRootObject()) {
				synchronized (this) {
					resetRootLayoutObjects();
					if (isLayouted()) {
						getRootObjects();
					}
				}
			}
		}
	}

	private void resetRootLayoutObjects() {
		if (rootLayoutObjects != null) {
			rootLayoutObjects.clear();
		}
	}

	@Override
	public void addLayoutObject(int index, ILayoutObject layoutObject) {
		if (!layoutObjects.contains(layoutObject)) {
			layoutObjects.add(index, layoutObject);
			if (layoutObject.isRootObject()) {
				synchronized (this) {
					resetRootLayoutObjects();
					if (isLayouted()) {
						getRootObjects();
					}
				}
			}
		}
	}

	@Override
	public void removeLayoutObject(ILayoutObject layoutObject) {
		layoutObjects.remove(layoutObject);
		if (layoutObject.isRootObject()) {
			synchronized (this) {
				resetRootLayoutObjects();
				if (isLayouted()) {
					getRootObjects();
				}
			}
		}
	}

	@Override
	public ILayoutObject getLastRootObject() {
		return getRootObjects().get(getRootObjects().size() - 1);
	}

	@Override
	public ILayoutObject getLayoutObject(int index) {
		if (index >= layoutObjects.size() || index < 0) {
			return null;
		}
		return layoutObjects.get(index);
	}

	@Override
	public ILayoutObject getRootObject(int index) {
		List<ILayoutObject> rootList = getRootObjects();
		return rootList.get(index);
	}

	@Override
	public int getRootObjectsSize() {
		return getRootObjects().size();
	}

	// @Override
	// public List<ILayoutObject> getLayoutObjects() {
	// return layoutObjects;
	// }

	@Override
	public List<ILayoutObject> getRootObjects() {
		if (rootLayoutObjects == null) {
			rootLayoutObjects = new ArrayList<ILayoutObject>();
		}
		if (rootLayoutObjects.isEmpty()) {
			for (ILayoutObject lo : layoutObjects) {
				if (lo.isRootObject()) {
					rootLayoutObjects.add(lo);
				}
			}
			JOUtil2.sortRootObjects(rootLayoutObjects);
		}
		return rootLayoutObjects;
	}

	@Override
	public int getLayoutObjectSize() {
		return layoutObjects.size();
	}

	@Override
	public int getObjectIndex(ILayoutObject layoutObject) {
		return layoutObjects.indexOf(layoutObject);
	}

	@Override
	public int getRootObjectIndex(ILayoutObject layoutObject) {
		int index = 0;
		for (ILayoutObject lo : getRootObjects()) {
			if (lo == layoutObject) {
				return index;
			}
			index++;
		}
		return -1;
	}

	// public CTPageBorders getOoxmlPageBorders() {
	// return ooxmlPageBorders;
	// }
	//
	// public void setOoxmlPageBorders(CTPageBorders ooxmlPageBorders) {
	// this.ooxmlPageBorders = ooxmlPageBorders;
	// }
	//
	// public CTBackground getOoxmlBackground() {
	// return ooxmlBackground;
	// }
	//
	// public void setOoxmlBackground(CTBackground ooxmlBackground) {
	// this.ooxmlBackground = ooxmlBackground;
	// }

	protected abstract void processBody();

	@Override
	public void commit() throws IOException {

		if (isWord()) {
			((XWPFDocumentCustom) xml).commit();
		} else if (isSpreadsheet()) {
			// xml.commit();
		} else if (isPresentation()) {
			// xml.commit();
		}
	}

	@Override
	public void save() {
		save(false);
	}

	/**
	 * 
	 */
	@Override
	public void save(boolean close) {

		if (xml == null) {
			return;
		}
		if (isDirty() || dirtyRegistry) {

			try {
				saveRegistry();
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}

			try {
				commit();
				if (close) {
					xml.getPackage().close();
					xml = null;
				} else {
					xml.getPackage().flush();
				}
				setDirty(false);

			} catch (Exception e) {
				setDirty(true);
				String s = e.getMessage();
				if (s != null && s.indexOf("used by another process") != -1) { //$NON-NLS-1$
					// MessageDialog
					// .openError(
					// JOUtil.getShell(),
					// Messages.JODocument_error_while_saving,
					// Messages.JOAbstractDocument_TheDocumentCouldNotBeSaved);
					// JOUtil.getAbstractOfficePane().doSaveAs();
				} else {
					// MessageDialog
					// .openError(
					// JOUtil.getShell(),
					// Messages.JODocument_error_while_saving,
					// Messages.JODocument_the_document_could_not_be_saved);
				}
			}
		} else if (close) {
			try {
				// xml.getPackage().close();
				xml.close();
				xml = null;
			} catch (Exception ex) {
				RCPLModel.logError(ex);
			}
		}

	}

	// /**
	// * @return
	// */
	// private String getExtension() {
	// String fName = file.getName();
	// String[] splits = fName.split("['.']");
	// return splits[splits.length - 1];
	// }

	public static OPCPackage createTempDocument(OPCPackage pkg, File newFile) throws IOException {
		if (pkg.getPackageAccess() == PackageAccess.READ) {
			try {
				return clone(pkg, newFile, false);
			} catch (OpenXML4JException e) {
				throw new POIXMLException(e);
			}
		}
		return pkg;
	}

	@Override
	public void loadDocument(File f) throws IOException, OpenXML4JException, XmlException {
		loadDocument(null, f);
	}

	private void loadDocument(OPCPackage opcPackage, File f) throws IOException, OpenXML4JException, XmlException {

		this.file = f;

		// ---------- DOCUMENT WITH ALL PARTS ----------------------------------

		if (opcPackage != null) {
			RCPLModel.log(this, "JoAbstractDocument:  xml = new XWPFDocumentCustom(opcPackage);");
			xml = new XWPFDocumentCustom(opcPackage);
			RCPLModel.log(this, "JoAbstractDocument:  part = new JODefaultPart(this, xml.getPackagePart());");
			part = new JODefaultPart(this, xml.getPackagePart());
		} else {
			RCPLModel.log(this, "JoAbstractDocument:  createPoiDocument();");
			createPoiDocument();
			part = new JODefaultPart(this, xml.getPackagePart());
		}

		RCPLModel.log(this, "processDocument();");
		processDocument();

	}

	protected abstract void createPoiDocument() throws IOException;

	protected void processDocument() throws IOException, OpenXML4JException, XmlException {
		if (xml instanceof XWPFDocumentCustom) {
			Rcpl.startProgress(100.0 / (((XWPFDocumentCustom) xml).getParagraphs().size() * 2), false);
		} else {
			Rcpl.startProgress(0.01, false);
		}
		RCPLModel.log(this, "processProperties();");
		processProperties();
		RCPLModel.log(this, "processRelations();");
		processRelations();
		// processImageParts();
		RCPLModel.log(this, "processParts();");
		processParts();
		RCPLModel.log(this, "processDocumentPart();");
		processDocumentPart();
		RCPLModel.log(this, "processBody();");
		processBody();
		RCPLModel.log(this, "processHyperlinks();");
		processHyperlinks();

	}

	protected abstract void processProperties() throws OpenXML4JException, IOException, XmlException;

	protected abstract void processParts();

	protected abstract void processDocumentPart();

	protected abstract void processHyperlinks();

	protected abstract void processComments();

	protected abstract void processAllEmbedds();

	/**
	 * @param zipFile
	 * @param folder
	 * @param files
	 * @throws IOException
	 */
	public static File addFilesToExistingZip(File zipFile, String folder, File[] files) throws IOException {
		// get a temp file

		if (folder == null) {
			folder = ""; //$NON-NLS-1$
		} else {
			if (!folder.endsWith("/")) { //$NON-NLS-1$
				folder += "/"; //$NON-NLS-1$
			}
		}

		File tempFile = File.createTempFile(zipFile.getName(), null);
		// // delete it, otherwise you cannot rename your existing zip to it.
		// tempFile.delete();
		//
		// boolean renameOk = zipFile.renameTo(tempFile);
		// if (!renameOk) {
		// throw new RuntimeException("could not rename the file " //$NON-NLS-1$
		// + zipFile.getAbsolutePath() + " to " //$NON-NLS-1$
		// + tempFile.getAbsolutePath());
		// }
		byte[] buf = new byte[1024];

		// ZipInputStream zin = new ZipInputStream(new
		// FileInputStream(tempFile));
		// ZipOutputStream out = new ZipOutputStream(new
		// FileOutputStream(zipFile));

		ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFile));
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(tempFile));

		ZipEntry entry = zin.getNextEntry();
		while (entry != null) {
			String name = entry.getName();
			boolean notInFiles = true;
			for (File f : files) {
				if (f.getName().equals(name)) {
					notInFiles = false;
					break;
				}
			}
			if (notInFiles) {
				// Add ZIP entry to output stream.
				out.putNextEntry(new ZipEntry(name));
				// Transfer bytes from the ZIP file to the output file
				int len;
				while ((len = zin.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
			}
			entry = zin.getNextEntry();
		}
		// Close the streams
		zin.close();
		// Compress the files
		for (int i = 0; i < files.length; i++) {
			InputStream in = new FileInputStream(files[i]);
			// Add ZIP entry to output stream.
			out.putNextEntry(new ZipEntry(folder + files[i].getName()));
			// Transfer bytes from the file to the ZIP file
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			// Complete the entry
			out.closeEntry();
			in.close();
		}
		// Complete the ZIP file
		out.close();
		// tempFile.delete();

		return tempFile;
	}

	/**
	 * @param zipFile
	 * @param folder
	 * @param files
	 * @throws IOException
	 */
	public static File addFilesToExistingZip2(File zipFile, String folder, File[] filesToAdd) throws IOException {
		// get a temp file

		if (folder == null) {
			folder = ""; //$NON-NLS-1$
		} else {
			if (!folder.endsWith("/")) { //$NON-NLS-1$
				folder += "/"; //$NON-NLS-1$
			}
		}

		File tempFile = File.createTempFile(zipFile.getName(), null);
		// delete it, otherwise you cannot rename your existing zip to it.
		tempFile.delete();

		FileHelper.copyFile(zipFile, tempFile);

		//
		// boolean renameOk = zipFile.renameTo(tempFile);
		// if (!renameOk) {
		// LOGGER.error("could not rename the file " //$NON-NLS-1$
		// + zipFile.getAbsolutePath() + " to " //$NON-NLS-1$
		// + tempFile.getAbsolutePath());
		// return null;
		// }

		byte[] buf = new byte[1024];

		ZipInputStream zin = new ZipInputStream(new FileInputStream(tempFile));
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));

		ZipEntry entry = zin.getNextEntry();
		while (entry != null) {
			String name = entry.getName();
			boolean notInFiles = true;
			for (File f : filesToAdd) {
				if ((folder + f.getName()).equals(name)) {
					notInFiles = false;
					break;
				}
			}
			if (notInFiles) {
				// Add ZIP entry to output stream.
				out.putNextEntry(new ZipEntry(name));
				// Transfer bytes from the ZIP file to the output file
				int len;
				while ((len = zin.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
			}
			entry = zin.getNextEntry();
		}
		// Close the streams
		zin.close();
		// Compress the files
		for (int i = 0; i < filesToAdd.length; i++) {
			InputStream in = new FileInputStream(filesToAdd[i]);
			// Add ZIP entry to output stream.
			out.putNextEntry(new ZipEntry(folder + filesToAdd[i].getName()));
			// Transfer bytes from the file to the ZIP file
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			// Complete the entry
			out.closeEntry();
			in.close();
		}
		// Complete the ZIP file
		out.close();
		// tempFile.delete();

		return tempFile;
	}

	@Override
	public void addResource(String name) {

		PackagePartName partName;
		try {
			partName = PackagingURIHelper.createPartName(name);
			PackagePart packagePart = xml.getPackage().getPart(partName);
			if (packagePart == null) {
				String SHEET_WITH_COMMENTS = "/" + getPrefix() + "/media/parrot.png"; //$NON-NLS-1$ //$NON-NLS-2$
				String filepath = "C:/Users/ramin/Documents/workspace/com.joffice.rcpl.plugin.office.rcp.client.libs/src/com/joffice/ui/resources/images/parrot.jpg"; //$NON-NLS-1$
				POIXMLDocumentPart newPart = new POIXMLDocumentPart(xml.getPackage());
				POIXMLRelation rel = XWPFRelation.WEB_SETTINGS;
				POIXMLFactory factory = XWPFFactory.getInstance();
				newPart.createRelationship(rel, factory);
				OPCPackage pkg = OPCPackage.open(filepath, PackageAccess.READ_WRITE);
				PackagePart part2 = pkg.getPart(PackagingURIHelper.createPartName(SHEET_WITH_COMMENTS));
				JOUtil2.copyInputStream(new FileInputStream(filepath), part2.getOutputStream(), false);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try {
					pkg.save(baos);
				} catch (IOException e) {
					// LOGGER.error("", e); //$NON-NLS-1$
				}
			}
		} catch (InvalidFormatException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		} catch (FileNotFoundException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	@Override
	public String getPrefix() {
		if (this instanceof JOWordDocument) {
			return "word"; //$NON-NLS-1$
		}
		if (this instanceof JOPresentationDocument) {
			return "ppt"; //$NON-NLS-1$
		}
		if (this instanceof JOSpreadsheetDocument) {
			return "xl"; //$NON-NLS-1$
		}

		return ""; //$NON-NLS-1$
	}

	protected void processHeaderParts() {

		// try {
		//
		// // XWPFDocument document;
		// // XWPFWordExtractor extractor = new XWPFWordExtractor(opcPackage);
		// // POIXMLDocument doc = extractor.getDocument();
		//
		// // XWPFHeaderFooterPolicy hfPolicy = doc.getHeaderFooterPolicy();
		// } catch (XmlException e1) {
		// } catch (OpenXML4JException e1) {
		// } catch (IOException e1) {
		// }

	}

	/**
	 * @param f
	 * @return
	 */
	public static IDocument createDocument(File f, boolean load, boolean newDocument,
			HashMap<String, String> wordReplacements, boolean onePage) {
		IDocument doc = null;
		if (f.getName().toLowerCase().endsWith(EnDocumentType.OOXML_WORDPROCESSING.getDotExtension())) {
			if (load) {
				doc = new JOWordDocument(f, newDocument, false, wordReplacements, onePage);
			} else {
				doc = new JOWordDocument((File) null, newDocument, false, wordReplacements, onePage);
			}
		} else if (f.getName().toLowerCase().endsWith(EnDocumentType.OOXML_SPREADSHEET.getDotExtension())) {
			if (load) {
				doc = new JOSpreadsheetDocument(f, newDocument);
			} else {
				doc = new JOSpreadsheetDocument(newDocument);
			}
		} else if (f.getName().toLowerCase().endsWith(EnDocumentType.OOXML_PRESENTATION.getDotExtension())) {
			if (load) {
				doc = new JOPresentationDocument(f, newDocument);
			} else {
				doc = new JOPresentationDocument(newDocument);
			}
		}
		// else if (f.getName().toLowerCase()
		// .endsWith(EnDocumentType.OOTEXT.getDotExtension())) {
		// if (load) {
		// doc = new JOWriterDocument(f, newDocument);
		// } else {
		// doc = new JOWriterDocument(newDocument);
		// }
		// }
		if (doc != null) {
			doc.setImage(getDocumentImage(f.getName()));
		}
		return doc;
	}

	@Override
	public void saveAs(File f) {
		FileOutputStream out;
		try {
			out = new FileOutputStream(f);
			xml.write(out);
			out.close();
			setFile(f);
			// save(false);
			setDirty(false);
		} catch (FileNotFoundException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	public static OPCPackage clone(OPCPackage pkg, File file, boolean tempFile) throws OpenXML4JException, IOException {

		String path = file.getAbsolutePath();

		OPCPackage dest = OPCPackage.create(path);
		PackageRelationshipCollection rels = pkg.getRelationships();
		for (PackageRelationship rel : rels) {
			PackagePart part = pkg.getPart(rel);
			PackagePart part_tgt;
			if (rel.getRelationshipType().equals(PackageRelationshipTypes.CORE_PROPERTIES)) {
				copyProperties(pkg.getPackageProperties(), dest.getPackageProperties());
				continue;
			}
			dest.addRelationship(part.getPartName(), rel.getTargetMode(), rel.getRelationshipType());
			part_tgt = dest.createPart(part.getPartName(), part.getContentType());

			OutputStream out = part_tgt.getOutputStream();
			IOUtils.copy(part.getInputStream(), out);
			out.close();

			if (part.hasRelationships()) {
				copy(pkg, part, dest, part_tgt);
			}
		}
		dest.close();

		// the temp file will be deleted when JVM terminates
		if (tempFile) {
			new File(path).deleteOnExit();
		}
		return OPCPackage.open(path);
	}

	/**
	 * Copy core package properties
	 * 
	 * @param src
	 *            source properties
	 * @param tgt
	 *            target properties
	 */
	private static void copyProperties(PackageProperties src, PackageProperties tgt) {
		tgt.setCategoryProperty(src.getCategoryProperty().getValue());
		tgt.setContentStatusProperty(src.getContentStatusProperty().getValue());
		tgt.setContentTypeProperty(src.getContentTypeProperty().getValue());
		tgt.setCreatorProperty(src.getCreatorProperty().getValue());
		tgt.setDescriptionProperty(src.getDescriptionProperty().getValue());
		tgt.setIdentifierProperty(src.getIdentifierProperty().getValue());
		tgt.setKeywordsProperty(src.getKeywordsProperty().getValue());
		tgt.setLanguageProperty(src.getLanguageProperty().getValue());
		tgt.setRevisionProperty(src.getRevisionProperty().getValue());
		tgt.setSubjectProperty(src.getSubjectProperty().getValue());
		tgt.setTitleProperty(src.getTitleProperty().getValue());
		tgt.setVersionProperty(src.getVersionProperty().getValue());
	}

	private static void copy(OPCPackage pkg, PackagePart part, OPCPackage tgt, PackagePart part_tgt)
			throws OpenXML4JException, IOException {
		PackageRelationshipCollection rels = part.getRelationships();
		if (rels != null)
			for (PackageRelationship rel : rels) {
				PackagePart p;
				if (rel.getTargetMode() == TargetMode.EXTERNAL) {
					part_tgt.addExternalRelationship(rel.getTargetURI().toString(), rel.getRelationshipType(),
							rel.getId());
					// external relations don't have associated package parts
					continue;
				}
				URI uri = rel.getTargetURI();

				if (uri.getRawFragment() != null) {
					part_tgt.addRelationship(uri, rel.getTargetMode(), rel.getRelationshipType(), rel.getId());
					continue;
				}
				PackagePartName relName = PackagingURIHelper.createPartName(rel.getTargetURI());
				p = pkg.getPart(relName);
				part_tgt.addRelationship(p.getPartName(), rel.getTargetMode(), rel.getRelationshipType(), rel.getId());

				PackagePart dest;
				if (!tgt.containPart(p.getPartName())) {
					dest = tgt.createPart(p.getPartName(), p.getContentType());
					OutputStream out = dest.getOutputStream();
					IOUtils.copy(p.getInputStream(), out);
					out.close();
					copy(pkg, p, tgt, dest);
				}
			}
	}

	// /**
	// *
	// */
	// public void commit() {
	// try {
	// xml.commit();
	// } catch (IOException e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// }
	// }

	abstract protected void processRelations();

	@SuppressWarnings("unchecked")
	protected void processRelations(URI uri, String relationType, Hashtable<String, String> registry2) {
		try {
			PackagePartName partName = PackagingURIHelper.createPartName(uri);
			PackagePart relDoc = xml.getPackage().getPart(partName);
			if (relDoc == null) {
				// LOGGER.error("relation document == null"); //$NON-NLS-1$
				return;
			}

			// !!! 1
			// InputStream is = relDoc.getInputStream();
			// SAXReader saxReader = new SAXReader();
			// Document document = saxReader.read(is);
			// Element element = document.getRootElement();
			// List<Element> chs = element.elements();
			// for (Element element2 : chs) {
			// List<Attribute> attributes = element2.attributes();
			// if (attributes != null) {
			// String id = null;
			// String target = null;
			// boolean found;
			// found = false;
			// for (Attribute attribute : attributes) {
			// String attrName = attribute.getName();
			// String attrValue = attribute.getValue();
			// if (attrName.toLowerCase().equals("type")) { //$NON-NLS-1$
			// if (attrValue.equals(relationType)) {
			// found = true;
			// } else {
			// break;
			// }
			// }
			// if (attrName.toLowerCase().equals("id")) { //$NON-NLS-1$
			// id = attrValue;
			// }
			// if (attrName.toLowerCase().equals("target")) { //$NON-NLS-1$
			// target = attrValue;
			// }
			// }
			// if (found) {
			// registry2.put(id, target);
			// }
			// }
			// }
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	@Override
	public IImage getImage() {
		return image;
	}

	@Override
	public void setImage(IImage image) {
		this.image = image;
	}

	/**
	 * @param resource
	 */
	@Override
	public void addResource(IResource resource) {

	}

	@Override
	public boolean isValid() {
		return valid;
	}

	@Override
	public PackagePart getPartById(String id) {
		try {
			return getTargetPart(getCorePart().getRelationship(id));
		} catch (InvalidFormatException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected PackagePart getTargetPart(PackageRelationship rel) throws InvalidFormatException {
		return JOUtil2.getTargetPart(xml.getPackage(), rel);
	}

	// /**
	// * Get the PackagePart that is the target of a relationship.
	// *
	// * @param rel
	// * The relationship
	// * @param pkg
	// * The package to fetch from
	// * @return The target part
	// * @throws InvalidFormatException
	// */
	// protected static PackagePart getTargetPart(OPCPackage pkg,
	// PackageRelationship rel) throws InvalidFormatException {
	// PackagePartName relName = PackagingURIHelper.createPartName(rel
	// .getTargetURI());
	// PackagePart part = pkg.getPart(relName);
	// if (part == null) {
	// throw new IllegalArgumentException(
	// "No part found for relationship " + rel); //$NON-NLS-1$
	// }
	// return part;
	// }

	protected PackagePart getCorePart() {
		return xml.getPackagePart();
	}

	// /**
	// * @param document
	// * @return
	// */
	// @SuppressWarnings("unchecked")
	// @Override
	// public HashMap<String, Object> getRegistry() {
	// if (registry == null) {
	// if (part == null) {
	// return null;
	// }
	// OPCPackage opcPackage = part.getPackagePart().getPackage();
	// PackagePartName partName = null;
	// try {
	// partName = PackagingURIHelper.createPartName("/joregistry.dat");
	// //$NON-NLS-1$
	// } catch (InvalidFormatException e) {
	// }
	// if (opcPackage.getPart(partName) != null) {
	// PackagePart part2 = opcPackage.getPart(partName);
	// InputStream is;
	// try {
	// is = part2.getInputStream();
	// ObjectInputStream ois = new ObjectInputStream(is);
	// Object o = ois.readObject();
	// if (o instanceof HashMap) {
	// registry = (HashMap<String, Object>) o;
	// return registry;
	// }
	// } catch (IOException e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// } catch (ClassNotFoundException e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// }
	// registry = new HashMap<String, Object>();
	// registry.put(JO.REGISTRY_ZOOM, 1.0);
	// return registry;
	// }
	//
	// // ---------- create a new registry --------------------------------
	//
	// // PackagePart part2 = opcPackage.createPart(partName,
	// // ContentTypes.CUSTOM_XML_PART, false);
	// //
	// // try {
	// // MemoryPackagePartOutputStream os =
	// // (MemoryPackagePartOutputStream) part2
	// // .getOutputStream();
	// // registry = new HashMap<String, Object>();
	// // registry.put(JO.REGISTRY_ZOOM, 1.0);
	// // os.writeObject(registry);
	// // os.flush();
	// // part2.close();
	// // dirtyRegistry = true;
	// // dirtyBecauseOfFirstLayout = true;
	// // } catch (IOException e) {
	// // LOGGER.error("", e); //$NON-NLS-1$
	// // }
	// }
	// return registry;
	// }

	/**
	 * @param document
	 * @return
	 */
	@Override
	public void saveRegistry() {
		if (getXml() == null) {
			// LOGGER.error("getXml()==null");
			return;
		}
		// if (dirtyRegistry || isDirty()) {
		// OPCPackage opcPackage = getXml().getPackage();
		// PackagePartName partName = null;
		// try {
		// partName = PackagingURIHelper.createPartName("/joregistry.dat");
		// //$NON-NLS-1$
		// } catch (InvalidFormatException e) {
		// }
		// if (getXml().getPackage().getPart(partName) != null) {
		// PackagePart part2 = opcPackage.getPart(partName);
		// try {
		// saveLayoutData();
		// MemoryPackagePartOutputStream os = (MemoryPackagePartOutputStream)
		// part2
		// .getOutputStream();
		// os.writeObject(getRegistry());
		// os.flush();
		// // part.close();
		// dirtyRegistry = false;
		// } catch (IOException e) {
		// LOGGER.error("", e); //$NON-NLS-1$
		// }
		// }
		// }
	}

	// /**
	// *
	// */
	// private void saveLayoutData() {
	// // TODO
	// // int index = 0;
	// // for (ILayoutObject joo : getLayoutObjects()) {
	// // try {
	// // index = getLayoutObjects().indexOf(joo);
	// // set(JO.REGISTRY_PARAGRAPH_LAYOUT_INFO + index,
	// // ((ILayoutObject) joo).layoutInfo);
	// // } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// // }
	// // }
	// // set(JO.REGISTRY_PARAGRAPH_LAYOUT_SAVED, true);
	// }

	@Override
	public boolean isLoading() {
		return loading;
	}

	@Override
	public void setLoading(boolean loading) {
		this.loading = loading;
	}

	@Override
	public boolean isClosing() {
		return closing;
	}

	@Override
	public void setClosing(boolean closing) {
		this.closing = closing;
	}

	@Override
	public boolean isNewDocument() {
		return newDocument;
	}

	@Override
	public ISection getSection() {
		if (section == null) {
			section = new JOSection(new JODocumentLayoutObject(this), null, null, null, false);
		}
		return section;
	}

	@Override
	public void setSection(ISection section) {
		this.section = section;
	}

	@Override
	public boolean isDirtyBecauseOfFirstLayout() {
		return dirtyBecauseOfFirstLayout;
	}

	@Override
	public void setDirtyBecauseOfFirstLayout(boolean dirtyBecauseOfFirstLayout) {
		this.dirtyBecauseOfFirstLayout = dirtyBecauseOfFirstLayout;
	}

	@Override
	public List<IParagraph> getParagraphs() {
		List<IParagraph> rootParagraphs = new Vector<IParagraph>();
		for (ILayoutObject lo : layoutObjects) {
			if (lo instanceof IParagraph) {
				rootParagraphs.add((IParagraph) lo);
			}
		}
		return rootParagraphs;
	}

	@Override
	public List<ISelectable> getSelectables() {
		return selectables;
	}

	/**
	 * @param key
	 * @return
	 */
	@Override
	public Double getDouble(String key) {

		return null;
	}

	/**
	 * @param key
	 * @return
	 */
	@Override
	public Boolean getBoolean(String key) {

		return null;
	}

	/**
	 * @param key
	 * @return
	 */
	@Override
	public Integer getInteger(String key) {

		return null;
	}

	/**
	 * @param key
	 * @return
	 */
	@Override
	public int[] getIntArray(String key) {
		return null;
	}

	@Override
	public boolean isDirtyRegistry() {
		return dirtyRegistry;
	}

	@Override
	public boolean isAllParagraphsCharactersLayouted() {
		return allParagraphsCharactersLayouted;
	}

	@Override
	public void setAllParagraphsCharactersLayouted(boolean allParagraphsCharactersLayouted) {
		this.allParagraphsCharactersLayouted = allParagraphsCharactersLayouted;
	}

	@Override
	public IPart getPart() {
		return part;
	}

	@Override
	public void setPart(IPart part) {
		this.part = part;
	}

	@Override
	public String getCreator() {
		return creator;
	}

	@Override
	public String toString() {
		if (file != null) {
			return file.getAbsolutePath();
		}
		return super.toString();
	}

	@Override
	public IColorProperty getBackground() {
		return background;
	}

	@Override
	public List<IParagraph> getRootParagraphs() {
		List<IParagraph> rootParagraphs = new Vector<IParagraph>();
		for (ILayoutObject lo : getRootObjects()) {
			if (lo.isRootObject() && lo instanceof IParagraph) {
				rootParagraphs.add((IParagraph) lo);
			}
		}
		return rootParagraphs;
	}

	@Override
	public void setNewDocument(boolean newDocument) {
		this.newDocument = newDocument;
	}

	@Override
	public void bind(IProperty2 property) {
		dataBindingProperties.add(property);
	}

	public List<IProperty2> getDataBindingProperties() {
		return dataBindingProperties;
	}

	public void setXml(POIXMLDocument xml) {
		this.xml = xml;
	}

	/**
	 * This is needed for calculating relations; e.g /ppt/presentation.xml ->
	 * root = /ppt
	 * 
	 * @return
	 */
	public abstract String getRoot();

	public String findId(String targetName) {
		PackagePart part2 = xml.getPackagePart();
		return findId(part2, targetName);
	}

	public String findId(PackagePart p, String targetName) {
		String newId = null;
		try {
			PackageRelationshipCollection rels = p.getRelationships();
			Iterator<PackageRelationship> it = rels.iterator();
			// String root = getRoot();
			while (it.hasNext()) {
				PackageRelationship rel = it.next();
				String id = rel.getId();
				// String relType = rel.getRelationshipType();
				// PackagePart source = rel.getSource();
				// URI sourceURI = rel.getSourceURI();
				// TargetMode targetMode = rel.getTargetMode();
				URI targetURI = rel.getTargetURI();
				String targetPath = targetURI.getPath();
				// System. out.(targetPath);
				if (targetPath.equals(targetName)) {
					newId = id;
					break;
				}
				// URI containerPartnership =
				// rel.getContainerPartRelationship();
			}
			return newId;
		} catch (InvalidFormatException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
		return null;
	}

	@Override
	public EnDocumentType getDocumentType() {
		return documentType;
	}

	@Override
	abstract public String getDefaultPerspective();

	@Override
	public IParagraph getFirstDirtyParagraph() {
		return firstDirtyParagraph;
	}

	@Override
	public boolean isLayouted() {
		return layouted;
	}

	@Override
	public void setLayouted(boolean layouted) {
		this.layouted = layouted;
	}

	private boolean readOnly;

	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	@Override
	public void setReadOnly() {
		this.readOnly = true;
	}

	@Override
	public HashMap<String, String> getWordReplacements() {
		return wordReplacements;
	}

	@Override
	public boolean isOnePage() {
		return onePage;
	}

	/**
	 * @param templateResourceName
	 * @return
	 */
	public static IDocument loadTemplateDocument(String name, HashMap<String, String> wordReplacements,
			boolean escapeHtml, boolean onePage) {
		Rcpl.profile();
		IDocument doc = JOAbstractDocument.load(JOUtil2.loadTemplateDocumentToTempFile(name, escapeHtml), true,
				wordReplacements, onePage);
		Rcpl.profileEnd();
		return doc;
	}

	@Override
	public void addDocumentListener(IDocumentListener listener) {
		documentListeners.add(listener);
	}

	public List<IDocumentListener> getDocumentListeners() {
		return documentListeners;
	}

	@Override
	public void dispose() {
		if (disposed) {
			return;
		}
		List<ILayoutObject> tempList = new ArrayList<ILayoutObject>(layoutObjects);
		for (ILayoutObject lo : tempList) {
			lo.dispose();
		}

		try {
			xml.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		layoutObjects.clear();
		layoutObjects = null;
		closing = true;
		coreProperties = null;
		file = null;
		image = null;
		xml = null;
		section = null;
		title = null;
		status = null;
		category = null;
		contentType = null;
		createdDate = null;
		createdString = null;
		description = null;
		identifier = null;
		keyWords = null;
		language = null;
		modifiedBy = null;
		lastPrintedDate = null;
		lastPrintedString = null;
		modiedDate = null;
		revision = null;
		subject = null;
		title2 = null;
		version = null;
		application = null;
		appVersion = null;
		company = null;
		hyperlinkBase = null;
		manager = null;
		presentationsFormat = null;
		templeate = null;
		resources.clear();
		resources = null;
		if (headerParts != null) {
			headerParts.clear();
		}
		headerParts = null;
		dataBindingProperties.clear();
		dataBindingProperties = null;
		if (wordReplacements != null) {
			wordReplacements.clear();
		}
		wordReplacements = null;
		background = null;

		settingsPart = null;
		numberingPart = null;

		title = null;
		creator = null;
		status = null;
		category = null;
		contentType = null;
		createdDate = null;
		createdString = null;
		description = null;
		identifier = null;
		keyWords = null;
		language = null;
		modifiedBy = null;
		lastPrintedDate = null;
		lastPrintedString = null;
		modiedDate = null;
		revision = null;
		subject = null;
		title2 = null;
		version = null;
		application = null;
		appVersion = null;
		company = null;
		hyperlinkBase = null;
		manager = null;
		presentationsFormat = null;
		templeate = null;
		if (selectables != null) {
			selectables.clear();
		}
		selectables = null;
		;
		part = null;
		documentType = null;

		firstDirtyParagraph = null;
		if (documentListeners != null) {
			documentListeners.clear();
		}
		documentListeners = null;
		if (rootLayoutObjects != null) {
			rootLayoutObjects.clear();
		}
		rootLayoutObjects = null;
		editor = null;
		styleTemplate = null;

		System.gc();
		disposed = true;
	}

	@Override
	public void deactivateAll(ILayoutObject except) {
		try {
			for (ILayoutObject lo : layoutObjects) {
				if (lo != except) {
					lo.deActivate();
				}
			}
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	@Override
	public int getCharacterCount() {
		int characterCount = 0;
		for (ILayoutObject lo : layoutObjects) {
			if (lo instanceof IParagraph) {
				characterCount += ((IParagraph) lo).getTextBuffer().length();
			}
		}
		return characterCount;
	}

	@Override
	public Iterator<ILayoutObject> layoutObjects() {
		return layoutObjects.iterator();
	}

	public int layoutObjectsSize() {
		return layoutObjects.size();
	}

	public int layoutObjectIndexOf(ILayoutObject lo) {
		return layoutObjects.indexOf(lo);
	}

}
