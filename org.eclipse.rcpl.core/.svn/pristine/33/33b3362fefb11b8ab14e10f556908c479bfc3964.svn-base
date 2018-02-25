package org.eclipse.rcpl;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLProperties.CoreProperties;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.xmlbeans.XmlException;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;

/**
 * @author ramin
 *
 */
public interface IDocument {

	int layoutObjectsSize();

	int layoutObjectIndexOf(ILayoutObject lo);

	Iterator<ILayoutObject> layoutObjects();

	int getCharacterCount();

	void deactivateAll(ILayoutObject except);

	void dispose();

	void addDocumentListener(IDocumentListener listener);

	// ---------- databinding 2 ------------------------------------------------

	IColorProperty getBackground();

	// -------------------------------------------------------------------------

	CTColorSchemeMapping getColorsSchemeMapping();

	void addWatermark(String text);

	String getXmlCoreDocumentFileName();

	void setPart(IPart part);

	void setAllParagraphsCharactersLayouted(boolean layouted);

	boolean isDirty();

	void setDirty(boolean dirty);

	IEditor getEditor();

	void setEditorFigure(IEditor editorFigure);

	POIXMLDocument getXml();

	File getFile();

	void setFile(File file);

	IStyleTemplate getStyleTemplate();

	ILayoutObject getLastRootObject();

	void bind(IProperty2 property);

	/**
	 * @param bigDecimal
	 * @return
	 */
	int transFormToInt(BigDecimal bigDecimal);

	/**
		 * 
		 */
	void loadFile(File file);

	/**
		 * 
		 */
	/**
	 * @return
	 */
	CoreProperties getCoreProperties();

	/**
	 * @param coreProperties
	 */
	void setCoreProperties(CoreProperties coreProperties);

	String getTitle();

	void setTitle(String title);

	String getStatus();

	void setStatus(String status);

	String getCategory();

	void setCategory(String category);

	String getContentType();

	void setContentType(String contentType);

	Date getCreatedDate();

	void setCreatedDate(Date createdDate);

	String getCreatedString();

	void setCreatedString(String createdString);

	String getDescription();

	void setDescription(String description);

	String getIdentifier();

	void setIdentifier(String identifier);

	String getKeyWords();

	void setKeyWords(String keyWords);

	String getLanguage();

	void setLanguage(String language);

	String getModifiedBy();

	void setModifiedBy(String modifiedBy);

	Date getLastPrintedDate();

	void setLastPrintedDate(Date lastPrintedDate);

	String getLastPrintedString();

	void setLastPrintedString(String lastPrintedString);

	Date getModiedDate();

	void setModiedDate(Date modiedDate);

	String getRevision();

	void setRevision(String revision);

	String getSubject();

	void setSubject(String subject);

	String getTitle2();

	void setTitle2(String title2);

	String getVersion();

	void setVersion(String version);

	String getApplication();

	void setApplication(String application);

	String getAppVersion();

	void setAppVersion(String appVersion);

	int getNumberOfCharacters();

	void setNumberOfCharacters(int numberOfCharacters);

	int getNumberOfCharactersIncludingWhiteSpaces();

	void setNumberOfCharactersIncludingWhiteSpaces(int numberOfCharactersIncludingWhiteSpaces);

	String getCompany();

	void setCompany(String company);

	int getDocSecurity();

	void setDocSecurity(int docSecurity);

	int getHiddenSlides();

	void setHiddenSlides(int hiddenSlides);

	String getHyperlinkBase();

	void setHyperlinkBase(String hyperlinkBase);

	boolean isHyperLinksChanged();

	void setHyperLinksChanged(boolean hyperLinksChanged);

	int getNumberOfLines();

	void setNumberOfLines(int numberOfLines);

	boolean isLinksUpToDate();

	void setLinksUpToDate(boolean linksUpToDate);

	String getManager();

	void setManager(String manager);

	int getMmClips();

	void setMmClips(int mmClips);

	int getNumberOfNotes();

	void setNumberOfNotes(int numberOfNotes);

	int getNumberOfPages();

	void setNumberOfPages(int numberOfPages);

	int getNumberOfParagraphs();

	void setNumberOfParagraphs(int numberOfParagraphs);

	String getPresentationsFormat();

	void setPresentationsFormat(String presentationsFormat);

	boolean isScaleCrop();

	void setScaleCrop(boolean scaleCrop);

	boolean isSharedDoc();

	void setSharedDoc(boolean sharedDoc);

	int getNumberOfSlides();

	void setNumberOfSlides(int numberOfSlides);

	String getTempleate();

	void setTempleate(String templeate);

	int getTotalTime();

	void setTotalTime(int totalTime);

	int getNumberOfWords();

	void setNumberOfWords(int numberOfWords);

	void addLayoutObject(ILayoutObject layoutObject);

	void addLayoutObject(int index, ILayoutObject layoutObject);

	void removeLayoutObject(ILayoutObject layoutObject);

	ILayoutObject getLayoutObject(int index);

	ILayoutObject getRootObject(int index);

	int getRootObjectsSize();

	int getLayoutObjectSize();

	int getObjectIndex(ILayoutObject layoutObject);

	int getRootObjectIndex(ILayoutObject layoutObject);

	void commit() throws IOException;

	/**
		 * 
		 */
	void save();

	void save(boolean close);

	void loadDocument(File file) throws IOException, OpenXML4JException, XmlException;

	void addResource(String name);

	String getPrefix();

	void saveAs(File f);

	IPart getPart();

	IImage getImage();

	void setImage(IImage image);

	/**
	 * @param resource
	 */
	void addResource(IResource resource);

	boolean isValid();

	PackagePart getPartById(String id);

	/**
	 * @param document
	 * @return
	 */
	void saveRegistry();

	boolean isLoading();

	void setLoading(boolean loading);

	boolean isClosing();

	void setClosing(boolean closing);

	boolean isNewDocument();

	void setNewDocument(boolean newDocument);

	ISection getSection();

	void setSection(ISection section);

	List<ILayoutObject> getRootObjects();

	boolean isDirtyBecauseOfFirstLayout();

	void setDirtyBecauseOfFirstLayout(boolean dirtyBecauseOfFirstLayout);

	List<IParagraph> getParagraphs();

	List<IParagraph> getRootParagraphs();

	List<ISelectable> getSelectables();

	/**
	 * @param key
	 * @return
	 */
	Double getDouble(String key);

	/**
	 * @param key
	 * @return
	 */
	Boolean getBoolean(String key);

	/**
	 * @param key
	 * @return
	 */
	Integer getInteger(String key);

	/**
	 * @param key
	 * @return
	 */
	int[] getIntArray(String key);

	boolean isDirtyRegistry();

	boolean isAllParagraphsCharactersLayouted();

	// void setAllParagraphsCharactersLayouted(

	String getCreator();

	boolean isWord();

	boolean isPresentation();

	boolean isSpreadsheet();

	EnDocumentType getDocumentType();

	String getDefaultPerspective();

	IParagraph getFirstDirtyParagraph();

	public boolean isLayouted();

	public void setLayouted(boolean layouted);

	void setReadOnly();

	boolean isReadOnly();

	HashMap<String, String> getWordReplacements();

	boolean isOnePage();

}
