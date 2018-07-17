package com.joffice.rcpl.plugin.office.internal.model.word;

import java.math.BigInteger;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;

import com.joffice.rcpl.plugin.office.JOObject;

/**
 * @author ramin
 * 
 */
public class JONumbering extends JOObject {

	public final static int TYPE_ABSTRACT_NUM = 1;
	public final static int TYPE_NUM = 2;
	public final static int TYPE_PIC_BULLET = 3;

	private int type;
	private BigInteger id;

	private int level;

	private int number = 1;

	@SuppressWarnings("unused")
	private String bulletText;

	private JONumberingPart numberingPart;

	private JONumbering abstractNumbering;

	private JONumbering picBullet;

	private JOPict shape;

	public JONumbering(IDocument document, ILayoutObject anchorObject, XmlObject parent, XmlObject xmlObject,
			boolean childObject, JONumberingPart numberingPart) {
		super(document, anchorObject, parent, xmlObject, childObject, false, -1);
		this.numberingPart = numberingPart;
		updateFromXml();
	}

	@Override
	public boolean dispose() {
		return false;
	}

	@Override
	public String getDisplayName() {
		return "Numbering";
	}

	@SuppressWarnings({ "unused", "deprecation" })
	@Override
	public void updateFromXml() {
		if (getXmlObject() instanceof CTAbstractNum) {
			CTAbstractNum num = (CTAbstractNum) getXmlObject();
			id = num.getAbstractNumId();
			CTLvl[] ctLevelArray = num.getLvlArray();
			num.getMultiLevelType();
			num.getName();
			num.getNsid();
			num.getNumStyleLink();
			num.getStyleLink();
			num.getTmpl();
			type = TYPE_ABSTRACT_NUM;
		} else if (getXmlObject() instanceof CTNum) {
			CTNum num = (CTNum) getXmlObject();
			num.getLvlOverrideArray();
			id = num.getNumId();
			abstractNumbering = numberingPart.findNumbering(num.getAbstractNumId().getVal(),
					JONumbering.TYPE_ABSTRACT_NUM);
			type = TYPE_NUM;
		} else if (getXmlObject() instanceof CTNumPicBullet) {
			CTNumPicBullet num = (CTNumPicBullet) getXmlObject();
			id = num.getNumPicBulletId();
			CTPicture ctPicture = num.getPict();
			shape = new JOPict(getDocument(), null, num, ctPicture, false);
			type = TYPE_PIC_BULLET;
		}
	}

	@Override
	public boolean isPageBreakBefore() {
		return false;
	}

	public BigInteger getId() {
		return id;
	}

	public int getType() {
		return type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@SuppressWarnings("deprecation")
	public String getBulletText() {
		switch (type) {
		case JONumbering.TYPE_ABSTRACT_NUM:
			CTAbstractNum num = (CTAbstractNum) getXmlObject();
			CTLvl[] ctLevelArray = num.getLvlArray();
			for (CTLvl ctLvl : ctLevelArray) {
				if (ctLvl.getIlvl().intValue() == level) {
					String s = ctLvl.getLvlText().getVal();
					return s;
				}
			}
			break;

		case JONumbering.TYPE_NUM:
			if (abstractNumbering != null) {
				return abstractNumbering.getBulletText();
			}
			break;

		case JONumbering.TYPE_PIC_BULLET:
			break;
		}

		return "-"; //$NON-NLS-1$

		// return bulletText;
	}

	public void setBulletText(String bulletText) {
		this.bulletText = bulletText;
	}

	public JONumberingPart getNumberingPart() {
		return numberingPart;
	}

	public void setNumberingPart(JONumberingPart numberingPart) {
		this.numberingPart = numberingPart;
	}

	/**
	 * @return
	 */
	public JONumbering getAbstractNumbering() {
		return abstractNumbering;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public JONumbering copy() {
		JONumbering clone = new JONumbering(getDocument(), getVAnchorObject(), getXmlParent(), getXmlObject(),
				isChildObject(), numberingPart);
		// clone.setShape(shape);
		return clone;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		switch (type) {
		case JONumbering.TYPE_ABSTRACT_NUM:
			buf.append("abstract numbering"); //$NON-NLS-1$
			break;

		case JONumbering.TYPE_NUM:
			buf.append("numbering"); //$NON-NLS-1$
			break;

		case JONumbering.TYPE_PIC_BULLET:
			buf.append("pic bullet"); //$NON-NLS-1$
			break;
		}

		buf.append(" id = " + id); //$NON-NLS-1$
		buf.append(" level = " + level); //$NON-NLS-1$
		buf.append(" number = " + number); //$NON-NLS-1$
		buf.append(" bulletText = " + getBulletText()); //$NON-NLS-1$
		return buf.toString();
	}

	@SuppressWarnings("deprecation")
	public JOPict getShape() {
		if (shape == null) {
			switch (type) {
			case JONumbering.TYPE_ABSTRACT_NUM:
				CTAbstractNum num = (CTAbstractNum) getXmlObject();
				CTLvl[] ctLevelArray = num.getLvlArray();
				for (CTLvl ctLvl : ctLevelArray) {
					if (ctLvl.getIlvl().intValue() == level) {
						if (ctLvl.getLvlPicBulletId() != null) {
							BigInteger bi = ctLvl.getLvlPicBulletId().getVal();
							picBullet = numberingPart.findNumbering(bi, JONumbering.TYPE_PIC_BULLET);
							shape = picBullet.getShape();
							break;
						}
					}
				}
				break;
			}

		}
		return shape;
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		return null;
	}

	@Override
	public void setPage(IPage page) {
		// TODO Auto-generated method stub

	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
