package com.joffice.rcpl.plugin.office.databinding.types;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IDocument;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;

import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOStringProperty;

/**
 * @author ramin
 * 
 */
public class JOParagraphProperties {

	private JOCharacterProperties characterProperties;

	private JOAlignment alignment;
	@SuppressWarnings("unused")
	private CTColorMapping ctColorMapping;

	// ---------- new databinding 2
	// ---------------------------------------------

	private JOEmuProperty leftMargin;
	private JOEmuProperty rightMargin;
	private JOStringProperty bulletCharacter;
	@SuppressWarnings("unused")
	private IDocument document;

	/**
	 * @param ctTextListStyle
	 * @param ctColorMapping
	 */
	public JOParagraphProperties(IDocument document, CTTextListStyle ctTextListStyle, CTColorMapping ctColorMapping) {
		this.ctColorMapping = ctColorMapping;
		this.document = document;
		ctTextListStyle.getDefPPr();
		ctTextListStyle.getExtLst();
		ctTextListStyle.getLvl1PPr();
		ctTextListStyle.getLvl2PPr();
		ctTextListStyle.getLvl3PPr();
		ctTextListStyle.getLvl4PPr();
		ctTextListStyle.getLvl5PPr();
		ctTextListStyle.getLvl6PPr();
		ctTextListStyle.getLvl7PPr();
		ctTextListStyle.getLvl8PPr();
		ctTextListStyle.getLvl9PPr();
	}

	/**
	 * @param document
	 * @param ctExtensionList
	 * @param ctColorMapping
	 */
	public JOParagraphProperties(IDocument document, CTExtensionList ctExtensionList, CTColorMapping ctColorMapping) {
		this.ctColorMapping = ctColorMapping;
		this.document = document;

	}

	/**
	 * @param document
	 * @param props
	 * @param ctColorMapping
	 */
	@SuppressWarnings("unused")
	public JOParagraphProperties(IDocument document, CTTextParagraphProperties props, CTColorMapping ctColorMapping) {
		this.ctColorMapping = ctColorMapping;
		this.document = document;
		boolean eaLineBreak = props.getEaLnBrk();

		// ---------- bullets ------------------------------------------

		CTTextFont ctBulletTextFont = props.getBuFont();
		CTTextBulletTypefaceFollowText ctTextBulletTypefaceFollowText = props.getBuFontTx();
		CTTextNoBullet ctTextNoBullet = props.getBuNone();
		CTTextBulletSizePercent ctTextBulletSizePercent = props.getBuSzPct();
		CTTextBulletSizePoint CTTextBulletSizePoint = props.getBuSzPts();
		CTTextBulletSizeFollowText ctTextBulletSizeFollowText = props.getBuSzTx();
		CTTextAutonumberBullet ctTextAutonumberBullet = props.getBuAutoNum();
		CTTextBlipBullet ctTextBlipBullet = props.getBuBlip();
		CTTextCharBullet ctTextCharBullet = props.getBuChar();

		bulletCharacter = new JOStringProperty(null, null, props.getBuChar(), "Char", null, EValueType.OTHER); //$NON-NLS-1$

		CTColor ctBulletColor = props.getBuClr();
		CTTextBulletColorFollowText CTTextBulletColorFollowText = props.getBuClrTx();

		// ---------- run properties -----------------------------------

		if (props.getDefRPr() != null) {
			setCharacterProperties(new JOCharacterProperties(props.getDefRPr(), ctColorMapping));
		}

		int tabSize = props.getDefTabSz();
		CTOfficeArtExtensionList ctOfficeArtExtensionList = props.getExtLst();

		if (props.getFontAlgn() != null) {
			alignment = new JOAlignment(props.getFontAlgn());
		}

		if (props.getAlgn() != null) {
			STTextAlignType.Enum o = props.getAlgn();
			alignment = new JOAlignment(props.getAlgn());
			// if(o.equals(STTextAlignType.L)){

			// }
		}

		boolean hangingPunct = props.getHangingPunct();
		int indent = props.getIndent();
		JOEmu emuIndent = new JOEmu(indent);

		boolean lineBreak = props.getLatinLnBrk();
		CTTextSpacing ctTextSpacing = props.getLnSpc();
		int level = props.getLvl();
		// int marginLeft = props.getMarL();

		leftMargin = new JOEmuProperty(null, null, props, "MarL", null, EValueType.MEASUREMENT); //$NON-NLS-1$
		rightMargin = new JOEmuProperty(null, null, props, "MarR", null, EValueType.MEASUREMENT); //$NON-NLS-1$

		boolean rtl = props.getRtl();
		CTTextSpacing ctTextSpacingAfter = props.getSpcAft();
		CTTextSpacing ctTextSpacingBefore = props.getSpcBef();
		CTTextTabStopList ctTextTabStopList = props.getTabLst();

		// if (props.getSz() > 0) {
		// cProps.setSize(new JOEmu50ThPoint(BigInteger.valueOf(props
		// .getSz())));
		// }

	}

	public JOCharacterProperties getCharacterProperties() {
		return characterProperties;
	}

	public void setCharacterProperties(JOCharacterProperties characterProperties) {
		this.characterProperties = characterProperties;
	}

	/**
	 * @return
	 */
	public int getFontSize() {
		if (characterProperties != null) {
			return characterProperties.getFontSize();
		}

		return 12;
	}

	public JOAlignment getAlignment() {
		return alignment;
	}

	public JOEmuProperty getLeftMargin() {
		return leftMargin;
	}

	public JOEmuProperty getRightMargin() {
		return rightMargin;
	}

	public JOStringProperty getBulletCharacter() {
		return bulletCharacter;
	}

}
