package com.joffice.rcpl.plugin.office.databinding;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs;

import com.joffice.rcpl.plugin.office.databinding.types.JOTabArray;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

/**
 * @author ramin
 * 
 */
public class JOPropertyFactory {

	public static JOPropertyTabs<JOTabArray> create(JOParagraph paragraph,
			CTPPr ctpPr, CTTabs tabs, boolean immutable) {
		if (tabs == null) {
			return null;
		}
		return new JOPropertyTabs<JOTabArray>(paragraph, ctpPr, tabs, immutable);
	}

//	public static JOPropertyTabs<JOTabArray> create(JOPParagraph paragraph,
//			CTTextParagraphProperties ctpPr, CTTextTabStopList tabs, boolean immutable) {
//		if (tabs == null) {
//			return null;
//		}
//		return new JOPropertyTabs<JOTabArray>(paragraph, ctpPr, tabs, immutable);
//	}

}
