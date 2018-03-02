package com.joffice.rcpl.plugin.office.internal.model.word;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.xmlbeans.XmlException;
import org.eclipse.rcpl.IDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument;

import com.joffice.rcpl.plugin.office.internal.JOAbstractPart;

/**
 * @author ramin
 * 
 */
public class JONumberingPart extends JOAbstractPart {

	private HashMap<String, JONumbering> numberings;

	public JONumberingPart(IDocument document, PackagePart packagePart) {
		super(document, packagePart, null, null);
	}

	@Override
	protected void init(Object poiObject, Object parent) {
		numberings = new HashMap<String, JONumbering>();
	}

	@Override
	protected void createDocument() {
		try {
			xmlDocument = NumberingDocument.Factory.parse(packagePart.getInputStream());
		} catch (XmlException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
	}

	@SuppressWarnings({ "unused", "deprecation" })
	@Override
	protected void updateFromXml() {
		NumberingDocument doc = (NumberingDocument) xmlDocument;

		CTNumbering ctNumbering;
		CTAbstractNum[] abstractNumArray;
		CTNum[] ctNumArray;
		CTDecimalNumber numIdMac;
		CTNumPicBullet[] cTNumPicBulletArray;

		ctNumbering = doc.getNumbering();

		abstractNumArray = ctNumbering.getAbstractNumArray();
		for (CTAbstractNum num : abstractNumArray) {
			JONumbering numbering = new JONumbering(document, null, ctNumbering, num, true, this);
			numberings.put(JONumbering.TYPE_ABSTRACT_NUM + "_" + num.getAbstractNumId(), numbering); //$NON-NLS-1$
		}
		ctNumArray = ctNumbering.getNumArray();
		for (CTNum num : ctNumArray) {
			JONumbering numbering = new JONumbering(document, null, ctNumbering, num, true, this);
			numberings.put(JONumbering.TYPE_NUM + "_" + num.getNumId(), numbering); //$NON-NLS-1$
		}
		numIdMac = ctNumbering.getNumIdMacAtCleanup();
		cTNumPicBulletArray = ctNumbering.getNumPicBulletArray();
		for (CTNumPicBullet num : cTNumPicBulletArray) {
			JONumbering numbering = new JONumbering(document, null, ctNumbering, num, true, this);
			numberings.put(JONumbering.TYPE_PIC_BULLET + "_" + num.getNumPicBulletId(), numbering); //$NON-NLS-1$
		}
	}

	/**
	 * @param id
	 * @return
	 */
	public JONumbering findNumbering(BigInteger id, int type) {
		JONumbering numbering = numberings.get(type + "_" + id); //$NON-NLS-1$
		if (numbering == null) {
			return null;
		}
		return numbering.copy();
	}

}
