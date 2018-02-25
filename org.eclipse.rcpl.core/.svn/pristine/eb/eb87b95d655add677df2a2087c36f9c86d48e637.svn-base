/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package org.eclipse.rcpl;


/**
 * @author ramin
 * 
 */
public enum EnDocumentType {

	FOLDER(null, null),

	// ---------- categories ---------------------------------------------------

	MAIN_CATEGORY_OFFICE_DOCUMENT(null, FOLDER), MAIN_CATEGORY_RECENTLY_USED_DOCUMENT(
			null, FOLDER), MAIN_CATEGORY_LINK(null, FOLDER), MAIN_CATEGORY_OFFICE_TEMPLATE_DOCUMENT(
			null, FOLDER), MAIN_CATEGORY_BROWSER_HISTORY(null, FOLDER), MAIN_CATEGORY_BROWSER_BOOKMARKS(
			null, FOLDER), MAIN_CATEGORY_BROWSER_FAVORITES(null, FOLDER),

	CATEGORY_WORDPROCESSING(null, FOLDER), CATEGORY_SPREADSHEET(null, FOLDER), CATEGORY_PRESENTATION(
			null, FOLDER), CATEGORY_FORMULA(null, FOLDER), CATEGORY_GRAPHIC(
			null, FOLDER), CATEGORY_MASTER(null, FOLDER), CATEGORY_URL(null,
			FOLDER),

	// ---------- documents ----------------------------------------------------

	OOXML_WORDPROCESSING("docx", CATEGORY_WORDPROCESSING), //$NON-NLS-1$

	OOXML_SPREADSHEET("xlsx", CATEGORY_SPREADSHEET), //$NON-NLS-1$

	OOXML_PRESENTATION("pptx", CATEGORY_PRESENTATION), //$NON-NLS-1$

	OOTEXT("odt", CATEGORY_WORDPROCESSING), //$NON-NLS-1$

	OOFORMULA("odf", CATEGORY_FORMULA), //$NON-NLS-1$

	OOSPREADSHEET("ods", CATEGORY_SPREADSHEET), //$NON-NLS-1$

	OOGRAPHIC("odg", CATEGORY_GRAPHIC), //$NON-NLS-1$

	OOPRESENTATION("odp", CATEGORY_PRESENTATION), //$NON-NLS-1$

	OOMASTER("odm", CATEGORY_MASTER), //$NON-NLS-1$

	URL("html", CATEGORY_URL), //$NON-NLS-1$

	BROWSER("html", CATEGORY_URL),

	INFOTAB("infotab", CATEGORY_MASTER);

	private String extension;

	private EnDocumentType category;

	/**
	 * @param extension
	 * @param category
	 */
	private EnDocumentType(String extension, EnDocumentType category) {
		this.extension = extension;
		this.category = category;
	}

	/**
	 * @return
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @return
	 */
	public String getDotExtension() {
		return "." + extension; //$NON-NLS-1$
	}

	/**
	 * @return
	 */
	public EnDocumentType getCategory() {
		return category;
	}

	/**
	 * @param ext
	 * @return
	 */
	public static EnDocumentType getType(String fName) {
		EnDocumentType[] types = values();
		for (EnDocumentType joDocumentType : types) {
			if (fName.toLowerCase().endsWith(joDocumentType.getDotExtension())) {
				return joDocumentType;
			}
		}
		return EnDocumentType.URL;
	}

	/**
	 * @param segment
	 * @return
	 */
	public static boolean isFolderSegment(String segment) {
		EnDocumentType[] types = values();
		for (EnDocumentType joDocumentType : types) {
			if (segment.startsWith(joDocumentType.name())) {
				return true;
			}
		}
		return false;
	}
}
