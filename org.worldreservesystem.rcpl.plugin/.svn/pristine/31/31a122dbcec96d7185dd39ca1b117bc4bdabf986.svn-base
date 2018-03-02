package com.joffice.rcpl.plugin.office.databinding2;

import java.util.StringTokenizer;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPageOrientation;

import schemasMicrosoftComVml.CTLine;
import schemasMicrosoftComVml.CTRect;
import schemasMicrosoftComVml.CTRoundRect;
import schemasMicrosoftComVml.CTShape;
import schemasMicrosoftComVml.CTShapetype;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOSize;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertySize extends JOProperty2 {

	private JOSize size;

	public JOPropertySize(ILayoutObject joObject, Object xmlParent,
			Object object, String methodName, String[] dataBindingKeys,
			EValueType valueType) {
		super(joObject, xmlParent, object, methodName, dataBindingKeys,
				valueType);
	}

	// /**
	// * @param layoutObject
	// * @param xmlParent
	// * @param object
	// * @param key
	// */
	// public JOPropertySize(ILayoutObject layoutObject, object xmlParent,
	// object object, String key) {
	// super(layoutObject, xmlParent, object, key);
	// }

	@Override
	public JOSize get() {
		if (data == null) {
			if (object instanceof CTPageSz) {
				CTPageSz pageSize = (CTPageSz) object;
				STPageOrientation.Enum en = pageSize.getOrient();
				boolean landscape = en != null
						&& en.equals(STPageOrientation.LANDSCAPE);
				data = new JOSize(new JOEmu20ThPoint(pageSize.getW()),
						new JOEmu20ThPoint(pageSize.getH()), landscape);
			} else if (object instanceof CTSlideSize) {
				CTSlideSize s = (CTSlideSize) object;
				int w = s.getCx();
				int h = s.getCy();
				JOEmu width = new JOEmu((long) w);
				JOEmu height = new JOEmu((long) h);
				data = new JOSize(width, height, true);
			} else if (object instanceof CTPositiveSize2D) {
				CTPositiveSize2D siz = (CTPositiveSize2D) object;
				data = new JOSize(new JOEmu(siz.getCx()),
						new JOEmu(siz.getCy()), false);
			} else if (object instanceof CTTblWidth) {
				CTTblWidth tableWidth = (CTTblWidth) object;
				data = new JOSize(new JOEmu20ThPoint(tableWidth.getW()),
						new JOEmuPixel(10), false);
			} else if (object instanceof CTP) {
				data = new JOSize(new JOEmuPixel(10), new JOEmuPixel(10), false);
			} else if (object instanceof CTTbl) {
				data = new JOSize(new JOEmuPixel(10), new JOEmuPixel(10), false);

			} else if (object instanceof CTSlideSize) {
				CTSlideSize ctSlideSize = (CTSlideSize) object;
				data = new JOSize(new JOEmu(ctSlideSize.getCx()), new JOEmu(
						ctSlideSize.getCy()), false);
			} else {

				String styleString = null;

				if (object instanceof CTRect) {
					styleString = ((CTRect) object).getStyle();
				} else if (object instanceof CTRoundRect) {
					styleString = ((CTRoundRect) object).getStyle();
				} else if (object instanceof CTShape) {
					styleString = ((CTShape) object).getStyle();
				} else if (object instanceof CTShapetype) {
					styleString = ((CTShapetype) object).getStyle();
				} else if (object instanceof CTLine) {
					styleString = ((CTLine) object).getStyle();
				}

				if (styleString != null) {

					StringTokenizer tok = new StringTokenizer(styleString, "; "); //$NON-NLS-1$

					// type="#_x0000_t202"
					// style="position:absolute;
					// margin-left:2.3pt;
					// margin-top:5.25pt;
					// width:71.95pt;
					// height:27pt;z-index:251660288;
					// mso-width-relative:margin;
					// mso-height-relative:margin">

					while (tok.hasMoreTokens()) {
						String tokValue = tok.nextToken();
						String[] keyValue = tokValue.split(":"); //$NON-NLS-1$
						String styleKey = keyValue[0];
						String styleValue = keyValue[1];

						if (styleKey.equals("mso-width-percent")) { //$NON-NLS-1$
							//					mso_width_percent = styleKey + ":" //$NON-NLS-1$
							// + styleValue;

						} else if (styleKey.equals("mso-width-relative")) { //$NON-NLS-1$
							//					mso_width_relative = styleKey + ":" //$NON-NLS-1$
							// + styleValue;
							//					if (styleValue.equalsIgnoreCase("margin")) { //$NON-NLS-1$
							// pict.setHAnchor(OOXMLLayoutAnchor.MARGIN);
							//					} else if (styleValue.equalsIgnoreCase("page")) { //$NON-NLS-1$
							// pict.setHAnchor(OOXMLLayoutAnchor.PAGE);
							// }
						} else if (styleKey.equals("mso-height-relative")) { //$NON-NLS-1$
							//					mso_width_relative = styleKey + ":" //$NON-NLS-1$
							// + styleValue;
							//					if (styleValue.equalsIgnoreCase("margin")) { //$NON-NLS-1$
							// pict.setVAnchor(OOXMLLayoutAnchor.MARGIN);
							//					} else if (styleValue.equalsIgnoreCase("page")) { //$NON-NLS-1$
							// pict.setVAnchor(OOXMLLayoutAnchor.PAGE);
							// }
						} else if (styleKey.equals("mso-height-percent")) { //$NON-NLS-1$
							//					mso_height_percent = styleKey + ":" //$NON-NLS-1$
							// + styleValue;
						} else if (styleKey.equals("mso-width-relative")) { //$NON-NLS-1$
							//					mso_width_relative = styleKey + ":" //$NON-NLS-1$
							// + styleValue;
						} else if (styleKey.equals("mso-height-relative")) { //$NON-NLS-1$
							//					mso_height_relative = styleKey + ":" //$NON-NLS-1$
							// + styleValue;
						} else if (styleKey.equals("width")) { //$NON-NLS-1$
							String s = styleKey + ":" + styleValue; //$NON-NLS-1$
							if (data == null) {
								data = new JOSize(new JOEmu(styleValue),
										new JOEmuPixel(1), false);
								size = (JOSize) data;
							} else {
								size.setWidth(new JOEmu(styleValue));
							}
						} else if (styleKey.equals("height")) { //$NON-NLS-1$
							String s = styleKey + ":" + styleValue; //$NON-NLS-1$
							if (data == null) {
								data = new JOSize(new JOEmuPixel(1), new JOEmu(
										styleValue), false);
								size = (JOSize) data;
							} else {
								size.setHeight(new JOEmu(styleValue));
							}
						} else if (styleKey.equals("flip")) { //$NON-NLS-1$

							if (data == null) {
								data = new JOSize(new JOEmuPixel(1),
										new JOEmuPixel(1), false);
								size = (JOSize) data;
							}
							size.setLandscape(true);
						}
					}
				}
			}

			if (data == null) {
				data = new JOSize(new JOEmuPixel(1), new JOEmuPixel(1), false);
			}

			size = (JOSize) data;
		}
		return (JOSize) data;
	}

	public void setHeightPoints(int points) {
		get().setHeight(new JOEmuPoint((double) points));
	}

	public void setHeightPixel2(double pixel) {
		get().setHeight(new JOEmuPixel(pixel));
	}

	public void setWidthPixel2(double pixel) {
		get().getWidth().setPixel(pixel);
	}

	public void increaseWidthPixel2(int pixel) {
		get().getWidth().increasePixel(pixel);
	}

	public void decreaseWidthPixel2(int pixel) {
		get().getWidth().decreasePixel(pixel);
	}

	public void increaseHeightPixel2(int pixel) {
		get().getHeight().increasePixel(pixel);
	}

	public void decreaseHeightPixel2(int pixel) {
		get().getHeight().decreasePixel(pixel);
	}

	public double getWidthPixel() {
		return get().getWidthPixel();
	}

	public double getHeightPixel() {
		return get().getHeightPixel();
	}

	@Override
	protected void createObject() {
		// TODO Auto-generated method stub

	}

}
