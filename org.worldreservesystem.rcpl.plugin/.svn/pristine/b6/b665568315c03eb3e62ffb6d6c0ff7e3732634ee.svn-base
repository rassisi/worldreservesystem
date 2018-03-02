package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;

import com.joffice.rcpl.plugin.office.databinding.types.JOEffects;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyEffects<T extends JOEffects> extends
		JOProperty<JOEffects> implements IObverserObvervable {

	private CTEffectList effectList;

	public JOPropertyEffects(ILayoutObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject) {
		super(layoutObject, xmlParent, xmlObject, "word/actions/shape/effects"); //$NON-NLS-1$
	}

	@Override
	public JOEffects get() {
		if (data == null) {
			data = new JOEffects(layoutObject, effectList);

		}
		return (JOEffects) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		effectList = (CTEffectList) xmlObject;
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
	public JOProperty<JOEffects> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
