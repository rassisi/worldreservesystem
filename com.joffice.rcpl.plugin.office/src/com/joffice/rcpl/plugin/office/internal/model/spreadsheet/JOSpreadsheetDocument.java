package com.joffice.rcpl.plugin.office.internal.model.spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.xssf.usermodel.XSSFPictureData;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlException;
import org.eclipse.rcpl.EnDocumentType;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;

import com.joffice.rcpl.plugin.office.internal.JOAbstractDocument;

/**
 * @author ramin
 * 
 */
public class JOSpreadsheetDocument extends JOAbstractDocument {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOSpreadsheetDocument.class);

	private JOWorkbookPart workbook;

	XSSFWorkbook xSSFWorkbook;

	/**
	 * @param newDocument
	 */
	public JOSpreadsheetDocument(boolean newDocument) {
		super(newDocument, false);
		valid = true;
		documentType = EnDocumentType.OOXML_SPREADSHEET;
	}

	/**
	 * @param file
	 * @param newDocument
	 */
	public JOSpreadsheetDocument(File file, boolean newDocument) {
		super(newDocument, false);
		loadFile(file);
		valid = true;
		documentType = EnDocumentType.OOXML_SPREADSHEET;

	}

	@Override
	protected void processBody() {
	}

	@Override
	protected void processProperties() throws OpenXML4JException, IOException, XmlException {
		// JO.officePane.setProgress(0);
		// JO.officePane.setProgressMaximum(1000);

	}

	@Override
	protected void processParts() {
		XSSFWorkbook poiWorkbook = (XSSFWorkbook) xml;
		List<XSSFPictureData> pictures = poiWorkbook.getAllPictures();
		for (XSSFPictureData xssfPictureData : pictures) {
			// String id = xssfPictureData.getPackageRelationship().getId();
			// PackagePart part2 = xssfPictureData.getPackagePart();
			// for (ImageItem imageItem : part.getImages()) {
			// if (imageItem.fileName.equals(part2.getPartName().getName())) {
			// imageItem.id = id;
			// }
			// JO.officePane.updateProgressBar();
			// }
			// ImageItem imageItem = saveImagePart(part);
			// imageItem.id = id;
			// Collections.sort(images, new Comparator<ImageItem>() {
			// @Override
			// public int compare(ImageItem o1, ImageItem o2) {
			// return o1.index - o2.index;
			// }
			// });

			// byte[] bytes = xssfPictureData.getData();
		}
	}

	@Override
	protected void processDocumentPart() {
		try {
			xml.getAllEmbedds();
			XSSFWorkbook poiWorkbook = (XSSFWorkbook) xml;
			new JOWorkbookPart(this, poiWorkbook, xml.getPackagePart());
		} catch (OpenXML4JException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
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
	protected void processRelations() {
		try {
			processRelations(new URI("/" + getPrefix() + "/_rels/spreadsheet.xml.rels"), Rcpl.RELATION_TYPE_IMAGE, //$NON-NLS-1$ //$NON-NLS-2$
					part.getRelationsRegistry());
		} catch (URISyntaxException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	@Override
	public void commit() throws IOException {
		OutputStream out = new FileOutputStream(file);
		workbook.getPoiWorkbook().write(out);
		out.flush();
		out.close();
	}

	@Override
	protected void createPoiDocument() throws IOException {
		xml = new XSSFWorkbook(new FileInputStream(file));
	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub

	}

	public JOWorkbookPart getWorkbook() {
		return workbook;
	}

	public void setWorkbook(JOWorkbookPart workbook) {
		this.workbook = workbook;
	}

	@Override
	public String getXmlCoreDocumentFileName() {
		return "workbook.xml"; //$NON-NLS-1$
	}

	@Override
	public boolean isWord() {
		return false;
	}

	@Override
	public void addWatermark(String text) {
	}

	@Override
	public boolean isPresentation() {
		return false;
	}

	@Override
	public boolean isSpreadsheet() {
		return true;
	}

	@Override
	public CTColorSchemeMapping getColorsSchemeMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRoot() {
		return "/xl"; //$NON-NLS-1$
	}

	@Override
	public String getDefaultPerspective() {
		return "SPREADSHEET";
	}

}
