package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOSpacing;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertySpacing<T extends JOSpacing> extends
		JOProperty<JOSpacing> implements IObverserObvervable {

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOPropertySpacing(JOObject layoutObject, XmlObject xmlParent,
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
	public JOPropertySpacing(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, String key, boolean immutable) {
		super(null, layoutObject, xmlParent, xmlObject, key, immutable);
	}

	@Override
	public JOSpacing get() {
		if (data == null) {
			if (xmlObject instanceof CTSpacing) {
				CTSpacing sp = (CTSpacing) xmlObject;
				JOSpacing spacing = new JOSpacing();
				if (sp.getBefore() != null) {
					spacing.spaceBefore = new JOEmu20ThPoint(sp.getBefore());
				}
				if (sp.getAfter() != null) {
					spacing.spaceAfter = new JOEmu20ThPoint(sp.getAfter());
				}
				data = spacing;
			}
		}
		return (JOSpacing) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	@Override
	public void update(IJOProperty dataBindingFigure, Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public JOProperty<JOSpacing> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
