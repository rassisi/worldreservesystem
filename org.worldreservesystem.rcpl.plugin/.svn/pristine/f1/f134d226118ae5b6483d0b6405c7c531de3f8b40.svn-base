package com.joffice.rcpl.plugin.office.internal.model.presentation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles;

import com.joffice.rcpl.plugin.office.databinding.JOPropertyColorAndBackground;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyParagraphProperties;
import com.joffice.rcpl.plugin.office.databinding.types.JOParagraphProperties;

/**
 * @author ramin
 * 
 */
public class JOSlideMasterPart extends JOAbstractSlide {

	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel1;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel2;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel3;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel4;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel5;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel6;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel7;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel8;
	private JOPropertyParagraphProperties<JOParagraphProperties> titleParagraphPropertiesLevel9;

	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel1;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel2;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel3;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel4;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel5;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel6;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel7;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel8;
	private JOPropertyParagraphProperties<JOParagraphProperties> bodyParagraphPropertiesLevel9;

	private List<JOSlideLayoutPart> slideLayouts = new ArrayList<JOSlideLayoutPart>();

	private CTColorMapping ctColorMapping;

	private String id;

	/**
	 * @param document
	 * @param packagePart
	 * @param slideMaster
	 * @param relationsRegistry
	 */
	@SuppressWarnings("unused")
	public JOSlideMasterPart(IDocument document, PackagePart packagePart,
			String id, CTSlideMaster slideMaster,
			Hashtable<String, String> relationsRegistry) {

		super(document, packagePart, relationsRegistry);
		ctColorMapping = slideMaster.getClrMap();

		CTCommonSlideData slideData = slideMaster.getCSld();
		if (slideData.getBg() != null) {
			backGround = new JOPropertyColorAndBackground<IColor>(document,
					ctColorMapping, slideData, slideData.getBg());
		}

		CTSlideLayoutIdList layoutIdList = slideMaster.getSldLayoutIdLst();
		CTColorMapping colorMapping = slideMaster.getClrMap();
		STColorSchemeIndex.Enum bg1 = colorMapping.getBg1();
		STColorSchemeIndex.Enum bg2 = colorMapping.getBg2();

		// STColorSchemeIndex.

		CTExtensionListModify CTExtensionListm = slideMaster.getExtLst();
		slideMaster.getHf();
		slideMaster.getPreserve();
		slideMaster.getSldLayoutIdLst();
		slideMaster.getTiming();
		slideMaster.getTransition();

		CTSlideMasterTextStyles ctSlideMasterTextStyles = slideMaster
				.getTxStyles();

		// ---------- body text styles -----------------------------------------

		if (ctSlideMasterTextStyles != null) {
			initBodyStyles(document, ctSlideMasterTextStyles, colorMapping);
			initTitleStyles(document, ctSlideMasterTextStyles, colorMapping);
		}

		// ---------- shapes and objects ---------------------------------------

		CTCommonSlideData masterSlideData = slideMaster.getCSld();
		initSlide(null, masterSlideData);

		// CTCommonSlideData ctCommonSlideData = slideMaster.getCSld();
		// if (slideData.getBg() != null) {
		// backGround = new JOPropertyColor<Color>((JOLayoutObject) null,
		// slideData, slideData.getBg());
		// }

	}

	/**
	 * @param document
	 * @param ctSlideMasterTextStyles
	 * @param colorMapping
	 */
	@SuppressWarnings({ "hiding", "deprecation", "unused" })
	private void initBodyStyles(IDocument document,
			CTSlideMasterTextStyles ctSlideMasterTextStyles,
			CTColorMapping colorMapping) {
		CTTextListStyle ctBodyStyle = ctSlideMasterTextStyles.getBodyStyle();
		CTOfficeArtExtensionList ctOfficeArtExtensionList = ctBodyStyle
				.getExtLst();
		if (ctOfficeArtExtensionList != null) {
			CTOfficeArtExtension[] ctOfficeArtExtensionArray = ctOfficeArtExtensionList
					.getExtArray();
			for (CTOfficeArtExtension ctOfficeArtExtension : ctOfficeArtExtensionArray) {
				String uri = ctOfficeArtExtension.getUri();
			}
		}

		if (ctBodyStyle.getLvl1PPr() != null) {
			bodyParagraphPropertiesLevel1 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl1PPr(),
					"title_character_prop_1", colorMapping); //$NON-NLS-1$

			bodyParagraphPropertiesLevel1.get();
		}
		if (ctBodyStyle.getLvl2PPr() != null) {
			bodyParagraphPropertiesLevel2 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl2PPr(),
					"title_character_prop_2", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl3PPr() != null) {
			bodyParagraphPropertiesLevel3 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl3PPr(),
					"title_character_prop_3", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl4PPr() != null) {
			bodyParagraphPropertiesLevel4 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl4PPr(),
					"title_character_prop_4", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl5PPr() != null) {
			bodyParagraphPropertiesLevel5 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl5PPr(),
					"title_character_prop_5", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl6PPr() != null) {
			bodyParagraphPropertiesLevel6 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl6PPr(),
					"title_character_prop_6", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl7PPr() != null) {
			bodyParagraphPropertiesLevel7 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl7PPr(),
					"title_character_prop_7", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl8PPr() != null) {
			bodyParagraphPropertiesLevel8 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl8PPr(),
					"title_character_prop_8", colorMapping); //$NON-NLS-1$
		}
		if (ctBodyStyle.getLvl9PPr() != null) {
			bodyParagraphPropertiesLevel9 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctBodyStyle, ctBodyStyle.getLvl9PPr(),
					"title_character_prop_9", colorMapping); //$NON-NLS-1$
		}
	}

	/**
	 * @param document
	 * @param ctSlideMasterTextStyles
	 * @param colorMapping
	 */
	@SuppressWarnings({ "hiding", "deprecation", "unused" })
	private void initTitleStyles(IDocument document,
			CTSlideMasterTextStyles ctSlideMasterTextStyles,
			CTColorMapping colorMapping) {
		CTTextListStyle ctTitleStyle = ctSlideMasterTextStyles.getTitleStyle();

		CTOfficeArtExtensionList ctTitleOfficeArtExtensionList = ctTitleStyle
				.getExtLst();

		if (ctTitleOfficeArtExtensionList != null) {
			CTOfficeArtExtension[] ctOfficeArtExtensionArray = ctTitleOfficeArtExtensionList
					.getExtArray();
			for (CTOfficeArtExtension ctOfficeArtExtension : ctOfficeArtExtensionArray) {
				String uri = ctOfficeArtExtension.getUri();
			}
		}

		CTTextParagraphProperties titleParagraphProperties = ctTitleStyle
				.getDefPPr();
		if (titleParagraphProperties != null) {
		}

		if (ctTitleStyle.getLvl1PPr() != null) {
			titleParagraphPropertiesLevel1 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl1PPr(),
					"title_character_prop_1", colorMapping); //$NON-NLS-1$

			titleParagraphPropertiesLevel1.get();
		}
		if (ctTitleStyle.getLvl2PPr() != null) {
			titleParagraphPropertiesLevel2 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl2PPr(),
					"title_character_prop_2", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl3PPr() != null) {
			titleParagraphPropertiesLevel3 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl3PPr(),
					"title_character_prop_3", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl4PPr() != null) {
			titleParagraphPropertiesLevel4 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl4PPr(),
					"title_character_prop_4", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl5PPr() != null) {
			titleParagraphPropertiesLevel5 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl5PPr(),
					"title_character_prop_5", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl6PPr() != null) {
			titleParagraphPropertiesLevel6 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl6PPr(),
					"title_character_prop_6", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl7PPr() != null) {
			titleParagraphPropertiesLevel7 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl7PPr(),
					"title_character_prop_7", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl8PPr() != null) {
			titleParagraphPropertiesLevel8 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl8PPr(),
					"title_character_prop_8", colorMapping); //$NON-NLS-1$
		}
		if (ctTitleStyle.getLvl9PPr() != null) {
			titleParagraphPropertiesLevel9 = new JOPropertyParagraphProperties<JOParagraphProperties>(
					document, ctTitleStyle, ctTitleStyle.getLvl9PPr(),
					"title_character_prop_9", colorMapping); //$NON-NLS-1$
		}
	}

	public CTColorMapping getCtColorMapping() {
		return ctColorMapping;
	}

	// public Hashtable<String, String> getRelationsRegistry() {
	// return relationsRegistry;
	// }

	// public JOPropertyColorAndBackground<Color> getBackGround() {
	// return backGround;
	// }

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel1() {
		return titleParagraphPropertiesLevel1;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel2() {
		return titleParagraphPropertiesLevel2;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel3() {
		return titleParagraphPropertiesLevel3;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel4() {
		return titleParagraphPropertiesLevel4;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel5() {
		return titleParagraphPropertiesLevel5;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel6() {
		return titleParagraphPropertiesLevel6;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel7() {
		return titleParagraphPropertiesLevel7;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel8() {
		return titleParagraphPropertiesLevel8;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getTitleParagraphPropertiesLevel9() {
		return titleParagraphPropertiesLevel9;
	}

	@Override
	public PackagePart getPackagePart() {
		return packagePart;
	}

	public List<JOSlideLayoutPart> getSlideLayouts() {
		return slideLayouts;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public JOSlideMasterPart getSlideMaster() {
		return this;
	}

	@SuppressWarnings("unused")
	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel1() {
		int i = bodyParagraphPropertiesLevel1.get().getFontSize();
		i = bodyParagraphPropertiesLevel2.get().getFontSize();
		i = bodyParagraphPropertiesLevel3.get().getFontSize();
		return bodyParagraphPropertiesLevel1;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel2() {
		bodyParagraphPropertiesLevel2.get();
		return bodyParagraphPropertiesLevel2;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel3() {
		return bodyParagraphPropertiesLevel3;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel4() {
		return bodyParagraphPropertiesLevel4;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel5() {
		return bodyParagraphPropertiesLevel5;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel6() {
		return bodyParagraphPropertiesLevel6;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel7() {
		return bodyParagraphPropertiesLevel7;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel8() {
		return bodyParagraphPropertiesLevel8;
	}

	public JOPropertyParagraphProperties<JOParagraphProperties> getBodyParagraphPropertiesLevel9() {
		return bodyParagraphPropertiesLevel9;
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

}
