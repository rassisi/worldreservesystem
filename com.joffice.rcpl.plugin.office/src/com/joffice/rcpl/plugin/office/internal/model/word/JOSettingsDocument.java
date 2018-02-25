package com.joffice.rcpl.plugin.office.internal.model.word;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;

import com.joffice.rcpl.plugin.office.internal.JOAbstractDocument;

/**
 * @author ramin
 * 
 */
public class JOSettingsDocument extends JOAbstractDocument {

	public JOSettingsDocument(boolean newDocument) {
		super(newDocument, false);
	}

	@Override
	public String getXmlCoreDocumentFileName() {
		return null;
	}

	@Override
	protected void init() {
	}

	@Override
	protected void processBody() {
	}

	@Override
	protected void createPoiDocument() throws IOException {
	}

	@Override
	protected void processProperties() throws OpenXML4JException, IOException, XmlException {
	}

	@Override
	protected void processParts() {
	}

	@Override
	protected void processDocumentPart() {
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
	}

	public JOSettingsPart getSettingsPart() {
		return (JOSettingsPart) part;
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
		return false;
	}

	@Override
	public CTColorSchemeMapping getColorsSchemeMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRoot() {
		return ""; //$NON-NLS-1$
	}

	@Override
	public String getDefaultPerspective() {
		return "SETTING";
	}

}
