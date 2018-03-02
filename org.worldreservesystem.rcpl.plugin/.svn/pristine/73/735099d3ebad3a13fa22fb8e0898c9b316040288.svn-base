package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOCharacterProperties;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyCharacterProperties<T extends JOCharacterProperties>
		extends JOProperty<JOCharacterProperties> implements
		IObverserObvervable {

	private CTColorMapping ctColorMapping;

	public JOPropertyCharacterProperties(IDocument document,
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
	public JOPropertyCharacterProperties(JOObject layoutObject,
			XmlObject xmlParent, XmlObject xmlObject, String key,
			CTColorMapping ctColorMapping) {
		super(layoutObject, xmlParent, xmlObject, key);
		this.ctColorMapping = ctColorMapping;
	}

	@Override
	public JOCharacterProperties get() {
		if (data == null) {
			if (xmlObject instanceof CTTextCharacterProperties) {
				CTTextCharacterProperties props = (CTTextCharacterProperties) xmlObject;
				JOCharacterProperties cProps = new JOCharacterProperties(props,
						ctColorMapping);
				data = cProps;
			}

		}
		return (JOCharacterProperties) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
	}

	@Override
	public JOProperty<JOCharacterProperties> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		return null;
	}

}
