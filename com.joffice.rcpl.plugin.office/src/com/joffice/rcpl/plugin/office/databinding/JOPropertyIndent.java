package com.joffice.rcpl.plugin.office.databinding;

import java.math.BigInteger;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.eclipse.rcpl.IParagraph;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyIndent<T extends JOIndent> extends JOProperty<JOIndent>implements IObverserObvervable {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOPropertyIndent.class);

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 */
	public JOPropertyIndent(ILayoutObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, String key) {
		super(layoutObject, xmlParent, xmlObject, key);
	}

	/**
	 * @param layoutObject
	 * @param xmlParent
	 * @param xmlObject
	 * @param key
	 * @param immutable
	 */
	public JOPropertyIndent(ILayoutObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, String key,
			boolean immutable) {
		super(null, layoutObject, xmlParent, xmlObject, key, immutable);
	}

	@Override
	public JOIndent get() {
		if (data == null) {
			if (xmlObject instanceof CTInd) {
				JOIndent indent = new JOIndent();
				if (((CTInd) xmlObject).getLeft() != null) {
					indent.left = new JOEmu20ThPoint(((CTInd) xmlObject).getLeft());
				}
				if (((CTInd) xmlObject).getFirstLine() != null) {
					indent.firstLine = new JOEmu20ThPoint(((CTInd) xmlObject).getFirstLine());
				}
				if (((CTInd) xmlObject).getHanging() != null) {
					indent.hanging = new JOEmu20ThPoint(((CTInd) xmlObject).getHanging());
				}
				data = indent;
			}
		}
		return (JOIndent) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	@Override
	public void update(ILayoutObject layoutObject, Object dat) {
		try {
			Object[] values = (Object[]) dat;
			Integer left = (Integer) values[1];
			if (left != null) {
				JOEmu leftEmu = new JOEmuPixel(left);
				((CTInd) xmlObject).setLeft(BigInteger.valueOf((long) (leftEmu.toPoints() * 20)));
			}
			Integer first = (Integer) values[2];
			if (first != null) {
				JOEmu firstEmu = new JOEmuPixel(first);
				((CTInd) xmlObject).setFirstLine(BigInteger.valueOf((long) (firstEmu.toPoints() * 20)));
			}
			Integer hanging = (Integer) values[3];
			if (hanging != null) {
				JOEmu hangingEmu = new JOEmuPixel(hanging);
				((CTInd) xmlObject).setHanging(BigInteger.valueOf((long) (hangingEmu.toPoints() * 20)));
			}
			layoutObject.setDirtyLayout(true);
			layoutObject.setDirtyContent(true);
			layoutObject.updateFromXml();
			layoutObject.getDocument().getEditor().layoutDocument();
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JOProperty<JOIndent> createCopyFromTemplate(ILayoutObject layoutObject) {
		if (isTemplate()) {
			IParagraph par = (IParagraph) layoutObject;
			if (par.getXmlObject() instanceof CTP) {
				if (((CTP) par.getXmlObject()).getPPr().getInd() != null) {
					((CTP) par.getXmlObject()).getPPr().unsetInd();
				}
				XmlObject newXmlObject = ((CTP) par.getXmlObject()).getPPr().addNewInd();
				newXmlObject.set(xmlObject);
			}
			layoutObject.setDirtyLayout(true);
			layoutObject.setDirtyContent(true);
			layoutObject.updateFromXml();
			layoutObject.getDocument().getEditor().layoutDocument();
			return (JOProperty<JOIndent>) layoutObject.getIndent();
		}
		return null;
	}

	/**
	 * @return
	 */
	public int calulculateTotalIndentPixel() {
		double[] idents = calculateIndents();
		int ident = 0;
		if (idents[0] > 0) {
			ident += idents[0];
		}
		if (idents[1] > 0) {
			ident += idents[1];
		}
		if (idents[2] > 0) {
			ident += idents[2];
		}
		if (idents[3] > 0) {
			ident += idents[3];
		}
		return ident;
	}

	/**
	 * int[0] ... first line indent int[1] ... hanging indent int[2] ... left
	 * indent int[3] ... left margin
	 * 
	 * @return
	 */
	public double[] calculateIndents() {
		double[] result = new double[4];
		if (get() != null) {
			if (get().firstLine != null) {
				result[0] = get().firstLine.toPixel();
			}
			if (get().left != null) {
				result[2] = get().left.toPixel();
			}
			if (get().hanging != null) {
				result[1] = get().hanging.toPixel();
			}
		}
		IParagraph par = (IParagraph) layoutObject;
		if (par != null && par.getMarginLeft() != null) {
			result[3] = ((JOEmu) par.getMarginLeft().get()).toPixel();
		}
		return result;
	}

}
