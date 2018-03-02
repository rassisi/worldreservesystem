package org.worldreservesystem.rcpl.plugin.poi.extension;

import java.io.File;
import java.io.IOException;

import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.util.PackageHelper;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 * @author eclipse
 * 
 */
public class XWPFDocumentCustom extends XWPFDocument {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(XWPFDocumentCustom.class);

	public XWPFDocumentCustom(OPCPackage opc) throws IOException {
		super(opc);
	}

	public XWPFDocumentCustom() {
	}

	@Override
	public void commit() throws IOException {
		try {
			super.commit();
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	/**
	 * Appends a new paragraph to this document
	 * 
	 * @return a new paragraph
	 */
	public XWPFParagraph insertParagraph(int index) {
		XWPFParagraph newPar = null;
		if (index >= paragraphs.size()) {
			newPar = new XWPFParagraphCustom(getDocument().getBody().addNewP(), this);
			paragraphs.add(newPar);
			return newPar;
		}
		try {
			newPar = new XWPFParagraphCustom(getDocument().getBody().insertNewP(index), this);
			paragraphs.add(index, newPar);
		} catch (IndexOutOfBoundsException ex) {
			// TODO: workaround
			newPar = new XWPFParagraphCustom(getDocument().getBody().addNewP(), this);
			paragraphs.add(newPar);
		} catch (Exception ex) {
			// TODO: workaround
			newPar = new XWPFParagraphCustom(getDocument().getBody().addNewP(), this);
			paragraphs.add(newPar);
		}
		return newPar;
	}

	public void removeParagraph(XWPFParagraph paragraph) {
		paragraphs.remove(paragraph);
	}

	public static OPCPackage createTempDocument(OPCPackage pkg, File newFile) throws IOException {
		if (pkg.getPackageAccess() == PackageAccess.READ) {
			try {
				return PackageHelper.clone(pkg, newFile);
			} catch (OpenXML4JException e) {
				throw new POIXMLException(e);
			}
		}
		return pkg;
	}

}
