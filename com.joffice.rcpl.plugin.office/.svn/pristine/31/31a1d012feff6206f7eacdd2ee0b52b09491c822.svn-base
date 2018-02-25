package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOParagraphProperties;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyParagraphProperties<T extends JOParagraphProperties>
		extends JOProperty<JOParagraphProperties> {

	private CTColorMapping ctColorMapping;

	public JOPropertyParagraphProperties(IDocument document,
			XmlObject xmlParent, XmlObject xmlObject, String key,
			CTColorMapping ctColorMapping) {
		super(document, xmlParent, xmlObject, key);
		this.ctColorMapping = ctColorMapping;
	}

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOPropertyParagraphProperties(JOObject layoutObject,
			XmlObject xmlParent, XmlObject xmlObject, String key) {
		super(layoutObject, xmlParent, xmlObject, key);
	}

	@Override
	public JOParagraphProperties get() {
		if (data == null) {
			if (xmlObject instanceof CTTextParagraphProperties) {
				CTTextParagraphProperties props = (CTTextParagraphProperties) xmlObject;
				JOParagraphProperties parProps = new JOParagraphProperties(
						document, props, ctColorMapping);
				data = parProps;
			} else if (xmlObject instanceof CTSlideMasterTextStyles) {
				CTTextListStyle props = (CTTextListStyle) xmlObject;
				JOParagraphProperties parProps = new JOParagraphProperties(
						document, props, ctColorMapping);
				data = parProps;
			}

		}
		return (JOParagraphProperties) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
	}

	@Override
	public JOProperty<JOParagraphProperties> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		return null;
	}

}
