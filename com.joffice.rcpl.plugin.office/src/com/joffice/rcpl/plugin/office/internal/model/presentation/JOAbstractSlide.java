package com.joffice.rcpl.plugin.office.internal.model.presentation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnector;
import org.openxmlformats.schemas.presentationml.x2006.main.CTControl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTControlList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyColorAndBackground;
import com.joffice.rcpl.plugin.office.databinding.types.JOPlaceholderType;
import com.joffice.rcpl.plugin.office.internal.JOAbstractPart;

/**
 * @author ramin
 * 
 */
public class JOAbstractSlide extends JOAbstractPart {

	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOAbstractSlide.class);

	protected JOPropertyColorAndBackground<IColor> backGround;

	protected List<JOObject> layoutObjects = new ArrayList<JOObject>();

	protected Hashtable<String, String> relationsRegistry = new Hashtable<String, String>();

	protected JOSlideLayoutPart slideLayout;

	protected PackagePart packagePart;

	protected boolean dirty;

	/**
	 * @param document
	 * @param slide
	 */
	public JOAbstractSlide(IDocument document, PackagePart packagePart, Hashtable<String, String> relationsRegistry) {
		super(document, packagePart, null, null);
		if (relationsRegistry != null) {
			getRelationsRegistry().putAll(relationsRegistry);
		}
		this.packagePart = packagePart;
	}

	/**
	 * @param document
	 * @param ctColorMappingOverride
	 * @param slideData
	 * @param colorMapping
	 */
	@SuppressWarnings({ "unused", "deprecation" })
	protected void initSlide(CTColorMappingOverride ctColorMappingOverride, CTCommonSlideData slideData) {

		try {
			CTColorMapping colorMapping = null;

			// ---------- color mapping override -------------------------------

			if (ctColorMappingOverride != null) {
				CTEmptyElement ctMasterClrMapping = ctColorMappingOverride.getMasterClrMapping();
				CTColorMapping ctColorMapping = ctColorMappingOverride.getOverrideClrMapping();

			}

			// ---------- slide data -------------------------------------------

			if (slideData.getBg() != null) {
				if (slideLayout != null) {
					colorMapping = slideLayout.getSlideMaster().getCtColorMapping();
				} else if (getSlideMaster() != null) {
					colorMapping = getSlideMaster().getCtColorMapping();
				}
				backGround = new JOPropertyColorAndBackground<IColor>(document, colorMapping, slideData,
						slideData.getBg());
			}

			CTControlList ctControlList = slideData.getControls();
			if (ctControlList != null) {
				CTControl[] controls = ctControlList.getControlArray();

				for (CTControl ctControl : controls) {
					// ctControl.get
				}
			}

			initGroupShape(document, layoutObjects, slideData.getSpTree(), null);
			CTExtensionList ctExtensionList = slideData.getExtLst();
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	/**
	 * @param document
	 * @param lOs
	 * @param ctGroupShape
	 */
	@SuppressWarnings({ "hiding", "deprecation", "unused" })
	private void initGroupShape(IDocument document, List<JOObject> lOs, CTGroupShape ctGroupShape,
			JOShapeGroup shapeGroup) {
		CTGroupShape[] ctGroupShapeArray = ctGroupShape.getGrpSpArray();
		for (CTGroupShape ctGroupShape2 : ctGroupShapeArray) {
			JOShapeGroup sG = new JOShapeGroup(document, this, null, ctGroupShape, ctGroupShape2, true, shapeGroup);
			if (lOs != null) {
				lOs.add(sG);
			} else if (shapeGroup != null) {
				shapeGroup.add(sG);
			}
			initGroupShape(document, null, ctGroupShape2, sG);
		}
		CTGroupShapeProperties ctGroupShapeProperties = ctGroupShape.getGrpSpPr();

		// ---------- non visuals ----------------------------------------------

		CTGroupShapeNonVisual ctGroupShapeNonVisual = ctGroupShape.getNvGrpSpPr();
		CTNonVisualGroupDrawingShapeProps ctNonVisualGroupDrawingShapeProps = ctGroupShapeNonVisual.getCNvGrpSpPr();

		CTNonVisualDrawingProps ctNonVisualDrawingProps = ctGroupShapeNonVisual.getCNvPr();
		CTApplicationNonVisualDrawingProps ctApplicationNonVisualDrawingProps = ctGroupShapeNonVisual.getNvPr();

		CTConnector[] ctConnectorArray = ctGroupShape.getCxnSpArray();
		CTExtensionListModify ctExtensionListModify = ctGroupShape.getExtLst();
		CTGraphicalObjectFrame[] ctGraphicalObjectFrames = ctGroupShape.getGraphicFrameArray();

		CTPicture[] picArray = ctGroupShape.getPicArray();
		for (CTPicture ctPicture : picArray) {
			JOShape shape = new JOShape(document, this, null, ctGroupShape, ctPicture, true, shapeGroup);
			if (lOs != null) {
				lOs.add(shape);
			} else if (shapeGroup != null) {
				shapeGroup.add(shape);
			}
		}

		initShapes(document, lOs, ctGroupShape, shapeGroup);

	}

	public JOShape findShapeByNameOrPlaceholderType(String name, JOPlaceholderType.Enum type) {
		JOShape shape = findShapeByName(name);
		if (shape == null) {
			shape = findShapeByPlaceholderType(type);
		}
		return shape;
	}

	/**
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unused")
	public JOShape findShapeByName(String name) {
		for (JOObject l : layoutObjects) {
			if (l instanceof JOShape) {
				JOShape shape = (JOShape) l;
				if (shape.getName().equals(name)) {
					return shape;
				}
			}
		}
		if (this instanceof JOSlideLayoutPart) {
			JOSlideMasterPart slideMaster = ((JOSlideLayoutPart) this).getSlideMaster();
		}
		return null;
	}

	/**
	 * @param type
	 * @return
	 */
	public JOShape findShapeByPlaceholderType(JOPlaceholderType.Enum type) {
		for (JOObject l : layoutObjects) {
			if (l instanceof JOShape) {
				JOShape shape = (JOShape) l;
				if (shape.getPlaceHolderType().type.equals(JOPlaceholderType.Enum.TITLE)
						&& type == JOPlaceholderType.Enum.TITLE
						|| shape.getType().type.equals(JOPlaceholderType.Enum.TITLE)
								&& type == JOPlaceholderType.Enum.CTR_TITLE
						|| shape.getType().type.equals(JOPlaceholderType.Enum.CTR_TITLE)
								&& type == JOPlaceholderType.Enum.CTR_TITLE
						|| shape.getType().type.equals(JOPlaceholderType.Enum.CTR_TITLE)
								&& type == JOPlaceholderType.Enum.TITLE
						|| shape.getType().type.equals(type)) {
					return shape;
				}
			}
		}
		return null;
	}

	@SuppressWarnings({ "deprecation", "hiding" })
	private void initShapes(IDocument document, List<JOObject> lO, CTGroupShape ctGroupShape, JOShape shapeGroup) {
		try {
			CTShape[] shapeArray = ctGroupShape.getSpArray();
			for (CTShape ctShape : shapeArray) {
				JOShape shape = new JOShape(document, this, null, ctGroupShape, ctShape, true, shapeGroup);
				if (lO != null) {
					lO.add(shape);
				} else if (shapeGroup != null) {
					shapeGroup.add(shape);
				}
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}

	}

	public List<JOObject> getLayoutObjects() {
		return layoutObjects;
	}

	public JOPropertyColorAndBackground<IColor> getBackGround() {
		return backGround;
	}

	@Override
	public Hashtable<String, String> getRelationsRegistry() {
		return relationsRegistry;
	}

	public JOSlideLayoutPart getSlideLayout() {
		return slideLayout;
	}

	public void setSlideLayout(JOSlideLayoutPart slideLayout) {
		this.slideLayout = slideLayout;
	}

	@Override
	public PackagePart getPackagePart() {
		return packagePart;
	}

	public JOSlideMasterPart getSlideMaster() {
		return getSlideLayout().getSlideMaster();
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	@Override
	protected void createDocument() {
	}

	@Override
	protected void updateFromXml() {
	}

}
