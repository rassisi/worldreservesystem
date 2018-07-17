package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOTextAnchoringType;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyTextAnchoring<T extends JOTextAnchoringType> extends
		JOProperty<JOTextAnchoringType> implements IObverserObvervable {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOPropertyTextAnchoring.class);

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOPropertyTextAnchoring(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, String key) {
		super(layoutObject, xmlParent, xmlObject, key);
	}

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 * @param immutable
	 */
	public JOPropertyTextAnchoring(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, String key, boolean immutable) {
		super(null, layoutObject, xmlParent, xmlObject, key, immutable);
	}

	@Override
	public JOTextAnchoringType get() {
		if (data == null) {
			if (xmlObject instanceof CTTextBodyProperties) {
				CTTextBodyProperties ctTextBodyProperties = (CTTextBodyProperties) xmlObject;
				if (ctTextBodyProperties.getAnchor() != null) {
					JOTextAnchoringType type = new JOTextAnchoringType(
							ctTextBodyProperties.getAnchor());
					data = type;
				}
			}
		}
		if (data == null) {
			data = JOTextAnchoringType.defaultType;
		}
		return (JOTextAnchoringType) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object dat) {
		try {
		} catch (Exception ex) {
//			LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	@Override
	public JOProperty<JOTextAnchoringType> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		/*
		 * if (isTemplate()) { JOParagraph par = (JOParagraph) layoutObject; if
		 * (par.getCTP().getPPr().getInd() != null) {
		 * par.getCTP().getPPr().unsetInd(); } XmlObject newXmlObject =
		 * par.getCTP().getPPr().addNewInd(); newXmlObject.set(xmlObject);
		 * layoutObject.setDirtyLayout(true);
		 * layoutObject.setDirtyContent(true); layoutObject.updateFromXml();
		 * return layoutObject.getIndent(); }
		 */return null;
	}

}
