package com.joffice.rcpl.plugin.office.internal.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IPictureToolGroup;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.SVGImage;
import org.eclipse.rcpl.internal.resources.JOResource;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.databinding.types.JOImageType;
import com.joffice.rcpl.plugin.office.internal.JOStyleTemplate;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawing;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author eclipse
 * 
 */
public class JOPictureService extends JOAbstractOfficeService {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOPictureService.class);

	private IPictureToolGroup pictureGroup;

	public JOPictureService() {
		super();
	}

	@Override
	public Object doExecute(ICommand cmd) throws Exception {

		switch (cmd.getCommandId()) {
		case toFront:
		case toBack:
		case toFrontOneLevel:
		case toBackOneLevel:
			break;
		case delete:
			cmd.getLayoutObject().dispose();
			break;
		case insertDrawing:
			JOImageType imageType = null;
			if (cmd.getNewData() != null) {
				File file = (File) cmd.getNewData()[0];
				Image image = (Image) cmd.getNewData()[1];
				double height = image.getHeight();
				double width = image.getWidth();
				double ratio = height / width;
				width = 200;
				height = width * ratio;
				if (imageType == null) {
					imageType = JOImageType.DEFAULT;
				}
				insertPicture(imageType, file.getName(), new FileInputStream(file),
						new Rectangle2D(0, 0, width, height), Double.MIN_VALUE, false);
			}
			return true;
		default:
			String id = cmd.getTool().getTool().getId();
			if (id.toLowerCase().startsWith("shape")) {
				String imageName = cmd.getTool().getTool().getImage();
				addSvgImage(imageName);
			}
			break;
		}

		return false;
	}

	/**
	 * @param imageName
	 */
	public void addSvgImage(String imageName) {
		SVGImage img = new SVGImage(imageName, 500, 500);
		img.getNode();

		try {
			InputStream is = new FileInputStream(img.getPngFile());
			if (is != null) {
				double height = 100;
				double width = 100;
				insertPicture(JOImageType.DEFAULT, img.getPngFile().getName(), is, new Rectangle2D(0, 0, width, height),
						Double.MIN_VALUE, true);

			}
		} catch (FileNotFoundException e) {
			RCPLModel.logError(e);
		}
	}

	/**
	 * @param imageType
	 * @param file
	 * @return
	 */
	public boolean insertPicture(JOImageType imageType, String fileName, InputStream is, Rectangle2D bounds,
			double zOrder, boolean svg) {

		String imageName = imageType.getImageName();

		if (fileName == null) {
			String[] files = null; // JO.officePane.openImageFileDialog("");
									// //$NON-NLS-1$

			if (files != null) {
				String path = files[0];
				try {
					Rectangle2D imageBounds = new Rectangle2D(0, 0, 100, 100);
					// TODO: add to reg of slide when presentation

					String id = getEditor().getDocument().getPart().getIdFromPath(path);

					boolean newImage = false;
					is = new FileInputStream(new File(files[0]));
					if (id == null) {
						id = getEditor().getDocument().getPart().addImage(is, fileName,
								new Rectangle2D(0, 0, imageBounds.getWidth(), imageBounds.getHeight()));
						newImage = true;
					} else {
					}

					JOResource res = (JOResource) getEditor().getDocument().getPart().getImageByRelationId(id);

					IImage resource = insertDrawing(getEditor(), imageName, 50, 50, newImage, zOrder, null, svg);
					if (pictureGroup != null) {
						if (path.endsWith(".svg")) { //$NON-NLS-1$
						} else {
							if (resource != null) {
								// Image image = (Image) resource.getImage()
								// .getSwt();
								// pictureGroup.setImage(image);
							}
						}
					}
				} catch (IOException e) {
					// LOGGER.error("", e); //$NON-NLS-1$
				}
			}
		} else {
			insertDrawing(getEditor(), fileName, bounds.getWidth(), bounds.getHeight(), true, zOrder, is, svg);
		}
		return true;
	}

	/**
	 * @param editorFigure
	 * @param tableName
	 */
	public IImage insertDrawing(IEditor editorFigure, String fileName, double width, double height, boolean newImage,
			double zOrder, InputStream is, boolean svg) {
		if (editorFigure == null || editorFigure.getSelectedParagraph() == null) {
			return null;
		}
		try {

			IParagraph par = editorFigure.getSelectedParagraph();

			par.setDirtyLayout(true);
			par.setDirtyContent(true);
			CTR run = par.createRun();
			JOStyleTemplate templates = (JOStyleTemplate) Rcpl.globalStyleTemplate();
			CTDrawing drawing = run.addNewDrawing();
			CTDrawing template = (CTDrawing) templates.getTemplateXml(fileName);

			if (template == null) {
				template = (CTDrawing) templates.getTemplateXml(JOImageType.DEFAULT.getImageName());
			}

			CTBlipFillProperties fillProperties = null;

			if (template != null) {
				drawing.set(template.copy());
				CTAnchor ctAnchor = drawing.getAnchorArray()[0];
				// double quarterPageWidth = editorFigure.getSelectedPage()
				// .getWidth() / 6;
				// double zoom = (double) quarterPageWidth / (double) width;
				// width *= zoom;
				// height *= zoom;
				JOEmuPixel cx = new JOEmuPixel(width);
				JOEmuPixel cy = new JOEmuPixel(height);
				ctAnchor.getExtent().setCx((long) cx.toEmu());
				ctAnchor.getExtent().setCy((long) cy.toEmu());
				CTGraphicalObjectData graphicalData = ctAnchor.getGraphic().getGraphicData();
				XmlObject[] pics = JOObject.selectPath(graphicalData, "w", //$NON-NLS-1$
						Rcpl.NS_PICTURE, "pic"); //$NON-NLS-1$
				CTPicture picture = (CTPicture) pics[0];

				CTShapeProperties ctShapeProperties = picture.getSpPr();
				CTTransform2D ctTransform2D = ctShapeProperties.getXfrm();

				CTPositiveSize2D siz = CTPositiveSize2D.Factory.newInstance();
				siz.setCx((long) new JOEmuPixel(width).toEmu());
				siz.setCy((long) new JOEmuPixel(height).toEmu());
				ctTransform2D.setExt(siz);

				// CTPictureNonVisual nonVisual = picture.getNvPicPr();
				// CTShapeProperties shapeProperties = picture
				// .getSpPr();
				fillProperties = picture.getBlipFill();
				// long dpi = fillProperties.getDpi();
				// boolean rotateWithShape = fillProperties
				// .getRotWithShape();
				CTRelativeRect srcRect = fillProperties.getSrcRect();
				if (srcRect != null) {
					// setCropTop(srcRect.getT());
					// setCropBottom(srcRect.getB());
					// setCropLeft(srcRect.getL());
					// setCropRight(srcRect.getR());
				}

				// CTStretchInfoProperties strechInfoProperties =
				// fillProperties
				// .getStretch();
				// CTTileInfoProperties tileInfoProperties = fillProperties
				// .getTile();

				// fillProperties.getBlip().setEmbed(id);

				par.removeChildren();

				par.updateFromXml();

				JODrawing d = (JODrawing) par.getDrawings().get(par.getDrawings().size() - 1);

				d.setRelationId(editorFigure.getDocument().getPart().addImage(is, fileName,
						new Rectangle2D(0, 0, width, height)));

				fillProperties.getBlip().setEmbed(d.getRelationId());

				try {
					d.setImage(getEditor().getDocument().getPart().getImageByRelationId(d.getRelationId()));
				} catch (Exception ex) {
					// LOGGER.error("", ex); //$NON-NLS-1$
				}

				if (zOrder != Double.MIN_VALUE) {
					d.setZOrder(zOrder);
				}
				// d.getLayoutFigure().setSize(width, height);
				double x1 = par.getXPixel() + 10;
				double y1 = par.getYPixel() + 10;
				IPage page = par.getPage();

				IImage res = editorFigure.getDocument().getPart().getImageByRelationId(d.getRelationId());

				if (!newImage && res != null) {
					Node img = res.getNode();
					// .getBounds();

					// quarterPageWidth = editorFigure.getSelectedPage()
					// .getWidth() / 4;
					// zoom = (double) quarterPageWidth / (double)
					// img.getWidth();
					// imageBounds.width *= zoom;
					// imageBounds.height *= zoom;
					Rectangle2D newBounds = new Rectangle2D(x1 + page.getMarginLeft(), y1, res.getWidth(),
							res.getHeight());
					d.boundsChanged2(newBounds);
				}

				d.setImage(res);

				if (res.getNode() instanceof ImageView) {
					double w = ((ImageView) res.getNode()).getFitWidth();
					double h = ((ImageView) res.getNode()).getFitHeight();
					double ratio = h / w;
					w = 200;
					h = w * ratio;
					d.setWidthPixel(w);
					d.setHeightPixel(h);
				}

				par.setDirtyLayout(true);
				par.getDocument().getEditor().layoutDocument();

				return res;
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		return null;
	}

	public void setPictureGroup(IPictureToolGroup pictureGroup) {
		this.pictureGroup = pictureGroup;
	}

}
