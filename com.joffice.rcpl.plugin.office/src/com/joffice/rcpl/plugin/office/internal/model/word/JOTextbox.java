/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office.internal.model.word;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IPictFigure;
import org.eclipse.rcpl.ITextBox;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent;

import schemasMicrosoftComVml.CTTextbox;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.application.JOUic;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuInsetProperty;
import com.joffice.rcpl.plugin.office.internal.JOfficeFactory;

/**
 * @author ramin
 * 
 */
public class JOTextbox extends JOObject implements ITextBox {

	@SuppressWarnings("deprecation")
	public JOTextbox(IDocument document, JOObject anchorObject, XmlObject xmlParent, XmlObject xmlObject,
			boolean childObject) {

		super(document, anchorObject, xmlParent, xmlObject, childObject, false, -1);
		pict = (JOPict) anchorObject;

		CTTextbox tb = CTTextbox.Factory.newInstance();
		tb.set(xmlParent);

		String st = tb.getStyle();

		if (st != null) {
			String[] splits = st.split(":"); //$NON-NLS-1$
			if (splits[0].equals("mso-next-textbox")) { //$NON-NLS-1$
				// // :#_x0000_s1224"
				pict.setStrokedOverwrite(true);
			}
		}

		CTTextbox ctTextbox = (CTTextbox) xmlParent;

		if (ctTextbox.getInset() != null) {
			insets = new JOEmuInsetProperty(this, null, ctTextbox, "Inset", null); //$NON-NLS-1$
		}

		CTTxbxContent content = (CTTxbxContent) xmlObject;

		CTTbl[] tables = content.getTblArray();
		for (CTTbl ctTbl : tables) {
			JOTable table = new JOTable(pict.getDocument(), pict, ctTbl, true, false, 0);
			table.setPict(pict);
			table.setZOrder(pict.getZOrder() + 0.0001);
			getChildList().add(table);
		}

		double width = pict.getWidthPixel();
		if (width == 0) {
			width = pict.getSize().getWidthPixel();
		}

		CTP[] ps = content.getPArray();
		for (CTP ctp : ps) {
			JOParagraph par = new JOParagraph(pict.getDocument(), pict, content, ctp, width, -1, 0.0, 0.0, 0.0, 0.0,
					null, true, true, null, null, false, 0, null);
			par.setPict(pict);
			par.setZOrder(pict.getZOrder() + 0.0001);
			getChildList().add(par);
		}

		setSize(width, pict.getHeightPixel());

	}

	@Override
	public boolean dispose() {
		super.dispose();
		return false;
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		return ((JOfficeFactory) Rcpl.getFactory()).createTextBoxFigure(this);
	}

	@Override
	public void updateFromXml() {
	}

	@Override
	public String getDisplayName() {
		return "Textbox";
	}

	@Override
	public boolean isPageBreakBefore() {
		return false;
	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
