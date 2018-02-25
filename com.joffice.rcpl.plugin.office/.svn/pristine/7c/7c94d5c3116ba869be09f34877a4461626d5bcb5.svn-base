package com.joffice.rcpl.plugin.office.databinding.types;


/**
 * @author ramin
 * 
 */
public enum JOCharacterSubsets {

	BASIC_LATIN("Basic Latin", 0x20, 0x20 + 500, null),

	LATIN_1_SUPPLEMENT("Latin-1 Supplement", 0xa0, 0xa0 + 500, null),

	LATIN_EXTENDED_A("Latin-Extended A", 0x100, 0x100 + 500, null),

	LATIN_EXTENDED_B("Latin Extended B", 0x180, 0x180 + 500, null),

	LATIN_EXTENDED_ADDITIONAL("Latin Extended Additional", 0x250, 0x250 + 300,
			null),

	GREEK_AND_COPTIC("Greek and Coptic", 0x0374, 0x0374 + 300, null),

	GREEKEXTENDED("Greek Extended", 0x01f00, 0x1ffc, null),

	CYRILLIC("Cyrillic", 0x0400, 0x0400 + 0x100, null),

	CYRILLIC_SUPPLEMENT("Cyrillic Supplement", 0x0500, 0x0500 + 300, null),

	ARABIC("Arabic", 0x0600, 0x076d, null),

	ARABIC_PRESENTAION_FORMS_A("Arabic Presentation Forms-A", 0x0fb51, 0xfefc,
			null),

	ARABIC_PRESENTAIONFORM_B("Arabic Presentation Forms-B", 0x0fe82, 0xfefc,
			null),

	HEBREW("Hebrew", 0x05b0, 0x5f4, null),

	DEVANGARI("Devanagari", 0x0, 0x0 + 300, null),

	THAI("Thai", 0x0e3f, 0x1d26, null),

	// ---------------------

	IPA_EXTENSIONS("IPA Extensions", 0x0250, 0x0385, null),

	SPACING_MODIFIER_LETTERS("Spacing Modifier Letters", 0x02b0, 0x0385, null),

	COMBINING_DIACRITICAL_MARKS("Combining Diacritical Marks", 0x0, 0x0 + 300,
			null),

	COMBINING_DIACRITICAL_MARKS_SUPPLEMENT(
			"Combining Diacritical Marks Supplement", 0x0, 0x0 + 300, null),

	PHONETIC_EXTENSIONS("Phonetic Extensions", 0x0, 0x0 + 300, null),

	PHONETIC_EXTENSIONS_SUPPLEMENT("Phonetic Extensions Supplement", 0x0,
			0x0 + 300, null),

	GENERALPUNCTUATION("General Punctuation", 0x02000, 0x0205f, null),

	SUPPLEMENTAL_PUNCTUATION("Supplemental Punctuation", 0x0, 0x0 + 300, null),

	// ---------- symbols ----------------------------------------------

	CURRENCY_SYMBOLS("Currency Symbols", 0x0, 0x0 + 300, new int[] { 0x24,
			0x20ac, 0xa5, 0xa3, 0x20a0, 0x20a1, 0x20a2, 0x20a3, 0x20a4, 0x20a5,
			0x20a6, 0x20a7, 0x20a8, 0x20a9, 0x20aa, 0x20ab, 0x20ac, 0x20ad,
			0x20ae, 0x20af, 0x20b0, 0x20b1, 0x20b2, 0x20b3, 0x20b4, 0x20b5 }),

	SUPERSCRIPTS_AND_SUBSCRIPTS("Superscipts and Subscripts", 0x0, 0x0 + 300,
			null),

	COMBING_DIACRITICAL_MARKS_FOR_SYMBOLS(
			"Combining Diacritical Marks for Symbols", 0x0, 0x0 + 300, null),

	LETTERLIKE_SYMBOLS("Letterlike Symbols", 0x0, 0x0 + 300, null),

	NUMBERFORMS("Numberforms", 0x02153, 0x0215f, null),

	ARROWS("Arrows", 0x02190, 0x02199, null),

	MATHEMATICAL_OPERATORS("Mathematical Operators", 0x02202, 0x02321, null),

	MISCELLANEOUS_TECHNICAL("Miscelaneous Technical", 0x0, 0x0 + 300, null),

	ENCLOSED_ALPHANUMERICS("Enclosed Alphanumerics", 0x0, 0x0 + 300, null),

	BOS_DRAWING("Box Drawing", 0x0, 0x0 + 300, null),

	GEOMETRIC_SHAPES("Geometric Shapes", 0x025a1, 0x025e6, null),

	DINGBATS("Dingbats", 0x02776, 0x0277f, null),

	GLAGOLITIC("Glagolitic", 0x02c60, 0x02e17, null),

	MODIFIER_TONE_LETTERS("Modifier Tone Letters", 0x0, 0x0 + 300, null),

	ALPHABETICE_PRESENTAION_FORMS("Alphabetic Presentation Forms", 0x0,
			0x0 + 300, null),

	COMBINING_HALF_MARKS("Combining Half Marks", 0x0, 0x0 + 300, null);

	private String displayName;

	private int startCode;

	private int endCode;

	private int[] codes;

	/**
	 * @param displayName
	 * @param startCode
	 * @param endCode
	 */
	private JOCharacterSubsets(String displayName, int startCode, int endCode,
			int[] codes) {
		this.displayName = displayName;
		this.startCode = startCode;
		this.endCode = endCode;
		this.codes = codes;
	}

	/**
	 * @return
	 */
	public static String[] getDisplayNames() {
		String[] result = new String[JOCharacterSubsets.values().length];
		for (int i = 0; i < result.length; i++) {
			result[i] = JOCharacterSubsets.values()[i].getDisplayName();
		}
		return result;
	}

	public String getDisplayName() {
		return displayName;
	}

	public int getStartCode() {
		return startCode;
	}

	public int getEndCode() {
		return endCode;
	}

	public int[] getCodes() {
		if (codes != null) {
			return codes;
		}
		int[] codes2 = new int[endCode - startCode];
		for (int i = 0; i < codes2.length; i++) {
			codes2[i] = i + startCode;
		}
		return codes2;
	}

}
