package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.databinding.types.JOPosition;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyPosition<T extends JOPosition> extends
		JOProperty<JOPosition> implements IObverserObvervable {

	private JOPosition position;

	public JOPropertyPosition(IDocument document, XmlObject xmlParent,
			XmlObject xmlObject, String key) {
		super(document, xmlParent, xmlObject, key);
	}

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOPropertyPosition(JOObject layoutObject, XmlObject xmlParent,
			XmlObject xmlObject, String key) {
		super(layoutObject, xmlParent, xmlObject, key);
	}

	@Override
	public JOPosition get() {
		if (data == null) {
			if (xmlObject instanceof CTPoint2D) {
				CTPoint2D ctPoint2d = (CTPoint2D) xmlObject;
				// JOEmu20ThPoint x = new JOEmu20ThPoint(ctPoint2d.getX());
				// JOEmu20ThPoint y = new JOEmu20ThPoint(ctPoint2d.getY());

				JOEmu x = new JOEmu(ctPoint2d.getX());
				JOEmu y = new JOEmu(ctPoint2d.getY());

				data = new JOPosition(x, y);
			}
		}
		return (JOPosition) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	public void setXPixel(int pixel) {
		get().setX(new JOEmuPixel(pixel));
	}

	public void setYPixel(int pixel) {
		get().setY(new JOEmuPixel(pixel));
	}

	public double getXPixel() {
		return get().getXPixel();
	}

	public double getYPixel() {
		return get().getYPixel();
	}

	@Override
	public void update(ILayoutObject layoutObject, Object data) {
	}

	@Override
	public JOProperty<JOPosition> createCopyFromTemplate(
			ILayoutObject layoutObject) {
		return null;
	}

}
