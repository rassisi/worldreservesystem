package com.joffice.rcpl.plugin.office.internal.model.word;

import java.io.IOException;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.xmlbeans.XmlException;
import org.eclipse.rcpl.IDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.SettingsDocument;

import com.joffice.rcpl.plugin.office.internal.JOAbstractPart;

public class JOSettingsPart extends JOAbstractPart {

	private CTColorSchemeMapping ctColorSchemeMapping;

	public JOSettingsPart(IDocument document, PackagePart packagePart) {
		super(document, packagePart, null, null);
	}

	@Override
	protected void createDocument() {
		try {
			xmlDocument = SettingsDocument.Factory
					.parse(packagePart.getInputStream());
		} catch (XmlException e) {
		} catch (IOException e) {
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void updateFromXml() {
		SettingsDocument doc = (SettingsDocument) xmlDocument;
		CTSettings ctSettings = doc.getSettings();
		ctSettings.getActiveWritingStyleArray();
		ctSettings.getAlignBordersAndEdges();
		ctSettings.getAlwaysMergeEmptyNamespace();
		ctSettings.getAlwaysShowPlaceholderText();
		ctSettings.getAttachedSchemaArray();
		ctSettings.getAttachedTemplate();
		ctSettings.getAutoFormatOverride();
		ctSettings.getAutoHyphenation();
		ctSettings.getBookFoldPrinting();
		ctSettings.getBookFoldPrintingSheets();
		ctSettings.getBookFoldRevPrinting();
		ctSettings.getBordersDoNotSurroundFooter();
		ctSettings.getBordersDoNotSurroundHeader();
		ctSettings.getCaptions();
		ctSettings.getCharacterSpacingControl();
		ctSettings.getClickAndTypeStyle();

		ctColorSchemeMapping = ctSettings.getClrSchemeMapping();

		ctSettings.getCompat();
		ctSettings.getConsecutiveHyphenLimit();
		ctSettings.getDecimalSymbol();
		ctSettings.getDefaultTableStyle();
		ctSettings.getDefaultTabStop();
		ctSettings.getDisplayBackgroundShape();
		ctSettings.getDisplayHorizontalDrawingGridEvery();
		ctSettings.getDisplayVerticalDrawingGridEvery();
		ctSettings.getDocumentProtection();
		ctSettings.getDocumentType();
		ctSettings.getDocVars();
		ctSettings.getDoNotAutoCompressPictures();
		ctSettings.getDoNotDemarcateInvalidXml();
		ctSettings.getDoNotDisplayPageBoundaries();
		ctSettings.getDoNotEmbedSmartTags();
		ctSettings.getDoNotHyphenateCaps();
		ctSettings.getDoNotIncludeSubdocsInStats();
		ctSettings.getDoNotShadeFormData();
		ctSettings.getDoNotTrackFormatting();
		ctSettings.getDoNotTrackMoves();
		ctSettings.getDoNotUseMarginsForDrawingGridOrigin();
		ctSettings.getDoNotValidateAgainstSchema();
		ctSettings.getDrawingGridHorizontalOrigin();
		ctSettings.getDrawingGridHorizontalSpacing();
		ctSettings.getDrawingGridVerticalOrigin();
		ctSettings.getDrawingGridVerticalSpacing();
		ctSettings.getEmbedSystemFonts();
		ctSettings.getEmbedTrueTypeFonts();
		ctSettings.getEndnotePr();
		ctSettings.getEvenAndOddHeaders();
		ctSettings.getFootnotePr();
		ctSettings.getForceUpgrade();
		ctSettings.getFormsDesign();
		ctSettings.getGutterAtTop();
		ctSettings.getHdrShapeDefaults();
		ctSettings.getHideGrammaticalErrors();
		ctSettings.getHideSpellingErrors();
		ctSettings.getHyphenationZone();
		ctSettings.getIgnoreMixedContent();
		ctSettings.getLinkStyles();
		ctSettings.getListSeparator();
		ctSettings.getMailMerge();
		ctSettings.getMathPr();
		ctSettings.getMirrorMargins();
		ctSettings.getNoLineBreaksAfter();
		ctSettings.getNoLineBreaksBefore();
		ctSettings.getNoPunctuationKerning();
		ctSettings.getPrintFormsData();
		ctSettings.getPrintFractionalCharacterWidth();
		ctSettings.getPrintPostScriptOverText();
		ctSettings.getPrintTwoOnOne();
		ctSettings.getProofState();
		ctSettings.getReadModeInkLockDown();
		ctSettings.getRemoveDateAndTime();
		ctSettings.getRemovePersonalInformation();
		ctSettings.getRevisionView();
		ctSettings.getRsids();
		ctSettings.getSaveFormsData();
		ctSettings.getSaveInvalidXml();
		ctSettings.getSavePreviewPicture();
		ctSettings.getSaveSubsetFonts();
		ctSettings.getSaveThroughXslt();
		ctSettings.getSaveXmlDataOnly();
		ctSettings.getSchemaLibrary();
		ctSettings.getShapeDefaults();
		ctSettings.getShowEnvelope();
		ctSettings.getShowXMLTags();
		ctSettings.getSmartTagTypeArray();
		ctSettings.getStrictFirstAndLastChars();
		ctSettings.getStyleLockQFSet();
		ctSettings.getStyleLockTheme();
		ctSettings.getStylePaneFormatFilter();
		ctSettings.getStylePaneSortMethod();
		ctSettings.getSummaryLength();
		ctSettings.getThemeFontLang();
		ctSettings.getTrackRevisions();
		ctSettings.getUiCompat97To2003();
		ctSettings.getUpdateFields();
		ctSettings.getUseXSLTWhenSaving();
		ctSettings.getView();
		ctSettings.getWriteProtection();
		ctSettings.getZoom();
	}

	public CTColorSchemeMapping getCtColorSchemeMapping() {
		return ctColorSchemeMapping;
	}

}
