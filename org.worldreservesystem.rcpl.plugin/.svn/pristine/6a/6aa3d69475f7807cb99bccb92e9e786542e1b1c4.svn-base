package com.joffice.rcpl.plugin.office.databinding;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyColorAndBackground<IColor> extends JOProperty<IColor>
		implements IObverserObvervable {

	private CTGradientFillProperties ctGradientFillProperties;

	private IImage imageResource;

	private CTColorMapping colorMapping;

	public CTGradientFillProperties getCtGradientFillProperties() {
		return ctGradientFillProperties;
	}

	public JOPropertyColorAndBackground(IDocument document,
			CTColorMapping colorMapping, XmlObject xmlParent,
			XmlObject xmlObject) {
		super(document, xmlParent, xmlObject,
				"word/actions/color/document_bg_color"); //$NON-NLS-1$
		this.colorMapping = colorMapping;
	}

	public JOPropertyColorAndBackground(ILayoutObject layoutObject,
			XmlObject xmlParent, XmlObject xmlObject) {
		super(layoutObject, xmlParent, xmlObject, "word/actions/color/color"); //$NON-NLS-1$
	}

	@SuppressWarnings("unchecked")
	@Override
	public IColor get() {
		if (data == null) {
			set(xmlObject);
		}
		return (IColor) data;
	}

	@Override
	public void set(XmlObject xmlObject) {

		if (this.xmlObject instanceof CTHslColor) {
		} else if (this.xmlObject instanceof CTPresetColor) {
		} else if (this.xmlObject instanceof CTSchemeColor) {
		} else if (this.xmlObject instanceof CTScRgbColor) {
		} else if (this.xmlObject instanceof CTSRgbColor) {
		} else if (this.xmlObject instanceof CTSystemColor) {
		} else if (this.xmlObject instanceof CTBackground) {
			CTBackground bg = (CTBackground) this.xmlObject;
			@SuppressWarnings("unused")
			CTBackgroundProperties bgProps = bg.getBgPr();

			// data = bgProps.getSolidFill().get

			CTStyleMatrixReference styleMatrixReference = bg.getBgRef();
			if (styleMatrixReference != null) {
				CTSchemeColor schemeColor = styleMatrixReference.getSchemeClr();

				if (schemeColor != null) {
					data = Rcpl.colorProvider().getThemeColor(colorMapping,
							schemeColor);
				}
			}

			CTBackgroundProperties ctBackgroundProperties = bg.getBgPr();
			if (ctBackgroundProperties != null) {
				ctGradientFillProperties = ctBackgroundProperties.getGradFill();
			}

			if (bg.getBgPr() != null) {
				CTBlipFillProperties ctBlipFillProperties = bg.getBgPr()
						.getBlipFill();
				if (ctBlipFillProperties != null) {
					CTBlip ctBlip = ctBlipFillProperties.getBlip();
					if (ctBlip != null) {
						String embed = ctBlip.getEmbed();
						setImageResource(document.getPart()
								.getImageByRelationId(embed));
					}
				}
			}
		}
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
	public JOProperty<IColor> createCopyFromTemplate(ILayoutObject layoutObject) {
		// TODO Auto-generated method stub
		return null;
	}

	public IImage getImageResource() {
		get();
		return imageResource;
	}

	public void setImageResource(IImage imageResource) {
		this.imageResource = imageResource;
	}

}
