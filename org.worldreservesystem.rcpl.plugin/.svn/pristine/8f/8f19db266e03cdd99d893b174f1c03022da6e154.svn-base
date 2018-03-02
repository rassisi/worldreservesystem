package com.joffice.rcpl.plugin.office.databinding2;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IColorProperty;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOWorkbookPart;
import com.joffice.rcpl.plugin.office.resources.JOOfficeColorProvider;

/**
 * @author ramin
 * 
 */
public class JOColorProperty extends JOProperty2 implements IColorProperty {

	// @SuppressWarnings("unused")
	// private final static org.slf4j.Logger LOGGER = LoggerFactory
	// .getLogger(JOColorProperty.class);

	private boolean background;

	private JOWorkbookPart workbook;

	private IDocument document;

	// public static JOColorProperty create(XmlObject xO, String methodName,
	// boolean background) {
	// if (xO == null) {
	// return null;
	// }
	// return new JOColorProperty((IDocument) null, null, null, xO, methodName,
	// false,
	// background);
	// }

	/**
	 * @param document
	 * @param layoutObject
	 * @param parent
	 * @param object
	 * @param methodName
	 * @param immutable
	 */
	public JOColorProperty(JOObject joObject, Object parent, Object object, String methodName, String[] dataBindingKeys,
			boolean background, JOWorkbookPart workbook) {
		super(joObject, parent, object, methodName, dataBindingKeys, EValueType.COLOR);
		this.background = background;
		this.workbook = workbook;
		if (joObject != null) {
			document = joObject.getDocument();
		}
	}

	@Override
	public IColor get() {
		Object result = getValue();
		if (workbook != null) {
			if (result instanceof Short) {
				int index = ((Short) result).intValue();
				IColor c = new JOOfficeColorProvider().getIndexedColor(workbook, index, background);
				data = c;
			}
		} else {
			if (result instanceof byte[]) {
				data = Rcpl.colorProvider().get((byte[]) result);
			} else if (result instanceof CTBackground) {
				CTBackground bg = (CTBackground) result;
				data = Rcpl.colorProvider().get(bg);
			} else if (result instanceof STThemeColor.Enum) {
				data = Rcpl.colorProvider().getThemeColor(document.getColorsSchemeMapping(), (STThemeColor) result);
			} else if (result instanceof CTSolidColorFillProperties) {
				CTSolidColorFillProperties fp = (CTSolidColorFillProperties) result;
				data = Rcpl.colorProvider().get(fp);
			} else if (result instanceof CTHighlight) {
				CTHighlight fp = (CTHighlight) result;
				data = Rcpl.colorProvider().get(fp);
			} else if (result instanceof CTShd) {
				data = Rcpl.colorProvider().get((CTShd) data);

			} else if (result instanceof String) {
				if (result.equals("auto")) { //$NON-NLS-1$
					if (background) {
						if (object instanceof CTShd) {
							STShd.Enum en = ((CTShd) object).getVal();
							if (en.equals(STShd.CLEAR)) {
								data = null;
							} else {
								data = IColor.WHITE;
							}
						} else {
							data = IColor.WHITE;
						}
					} else {
						data = IColor.BLACK;
					}
				} else {
					// data = JOColorProvider.get
				}

			} else {
				// if (background) {
				// data = ColorConstants.white;
				// } else {
				// data = ColorConstants.black;
				// }

			}
		}

		return (IColor) data;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class[] getArgTypes() {
		if (object instanceof CTLineProperties || object instanceof CTShapeProperties) {
			return new Class[] { CTSolidColorFillProperties.class };
		}
		if (object instanceof CTDocument1 && methodName.equals("Background")) { //$NON-NLS-1$
			return new Class[] { CTBackground.class };
		}
		if (object instanceof CTPPr && methodName.equals("Shd")) { //$NON-NLS-1$
			return new Class[] { CTShd.class };
		}
		return null;
	}

	@SuppressWarnings("nls")
	@Override
	protected Object objectToXml(Object dat) {
		IColor c = (IColor) dat;
		if (object instanceof CTLineProperties || object instanceof CTShapeProperties) {
			CTSolidColorFillProperties fp = CTSolidColorFillProperties.Factory.newInstance();
			CTScRgbColor c1 = CTScRgbColor.Factory.newInstance();
			c1.setB((int) c.getBlue());
			c1.setG((int) c.getGreen());
			c1.setR((int) c.getRed());
			fp.setScrgbClr(c1);
			return fp;
		}
		if (object instanceof CTDocument1 && methodName.equals("Background")) { //$NON-NLS-1$
			CTBackground bg = CTBackground.Factory.newInstance();
			bg.setColor(Rcpl.colorProvider().getBytesFromCOLOR(c));
			return bg;
		}
		if (object instanceof CTPPr && methodName.equals("Shd")) {
			CTPPr ppr = (CTPPr) object;
			CTShd shd = ppr.getShd();
			if (shd == null) {
				shd = ppr.addNewShd();
				shd.setVal(STShd.CLEAR);
				shd.setColor("auto");
			}
			shd.setFill(Rcpl.colorProvider().getBytesFromCOLOR(c));
			return shd;
		}
		return super.objectToXml(dat);
	}

	@Override
	protected void createObject() {
		if (methodName.equals("Shd") && parent instanceof CTP) { //$NON-NLS-1$
			object = ((CTP) parent).getPPr();
			if (object == null) {
				object = ((CTP) parent).addNewPPr();
			}
		}
	}

	public void setDocument(IDocument document) {
		this.document = document;
	}

	@Override
	public boolean set(IColor color) {
		return super.set(color);
	}
}
