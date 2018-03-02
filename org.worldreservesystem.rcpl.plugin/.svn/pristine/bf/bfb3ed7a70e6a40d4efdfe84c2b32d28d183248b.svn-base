package com.joffice.rcpl.plugin.office.internal.model.presentation;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Hashtable;

import javax.xml.namespace.QName;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.xmlbeans.XmlOptions;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout;
import org.openxmlformats.schemas.presentationml.x2006.main.SldLayoutDocument;

/**
 * @author ramin
 * 
 */
public class JOSlideLayoutPart extends JOAbstractSlide {
	//
	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOSlideLayoutPart.class);

	private SldLayoutDocument layoutDoc;

	private JOSlideMasterPart slideMaster;

	private String id;

	private CTSlideLayout ctSlideLayout;

	private POIXMLDocumentPart poiSlideLayoutPart;

	/**
	 * @param document
	 * @param packagePart
	 * @param slidePart
	 */
	public JOSlideLayoutPart(JOPresentationDocument document,
			PackagePart packagePart, JOSlidePart slidePart) {
		super(document, packagePart, null);
		// initSlideMaster(document);
		// int newSlideLayoutNumber = document.getSlideLayouts().size() + 1;
		// poiSlideLayoutPart = slidePart.getPoiSlidePart().createRelationship(
		// XSLFRelation.SLIDE_LAYOUT, XSLFFactory___JO.getInstance(),
		// newSlideLayoutNumber, false);
		// String targetName = poiSlideLayoutPart.getPackagePart().getPartName()
		// .getName();
		// CTSlideLayout ctSlideTemplate;
		// id = ((JOAbstractDocument)
		// document).findId(slidePart.getPackagePart(),
		// targetName);
		// ctSlideTemplate = document.getSlide(0).getSlideLayout()
		// .getCtSlideLayout();
		// ctSlideLayout = CTSlideLayout.Factory.newInstance();
		// ctSlideLayout.set(ctSlideTemplate);
		// document.getSlideLayouts().add(this);
		save();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void save() {
		XmlOptions xmlOptions = new XmlOptions(
				JOPresentationDocument.DEFAULT_XML_OPTIONS);
		xmlOptions.setSaveSyntheticDocumentElement(new QName(CTSlideLayout.type
				.getName().getNamespaceURI(), "sldLayout")); //$NON-NLS-1$
		HashMap map = new HashMap<String, String>();
		map.put(STRelationshipId.type.getName().getNamespaceURI(), "r"); //$NON-NLS-1$
		map.put("http://schemas.openxmlformats.org/drawingml/2006/main", "a"); //$NON-NLS-1$ //$NON-NLS-2$
		map.put("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "r"); //$NON-NLS-1$//$NON-NLS-2$
		map.put("http://schemas.openxmlformats.org/presentationml/2006/main", "p"); //$NON-NLS-1$//$NON-NLS-2$		
		xmlOptions.setSaveSuggestedPrefixes(map);
		OutputStream out = poiSlideLayoutPart.getPackagePart()
				.getOutputStream();
		try {
			ctSlideLayout.save(out, xmlOptions);
			out.close();
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	/**
	 * 
	 */
	public JOSlideLayoutPart(JOSlideLayoutDocument document,
			PackagePart packagePart, String id, SldLayoutDocument layoutDoc,
			Hashtable<String, String> relationsRegistry) {
		super(document, packagePart, relationsRegistry);
		this.id = id;

		initSlideMaster(document.getPresentationDocument());

		getRelationsRegistry().putAll(relationsRegistry);
		ctSlideLayout = layoutDoc.getSldLayout();

		initSlide(ctSlideLayout.getClrMapOvr(), ctSlideLayout.getCSld());

		ctSlideLayout.getHf();
		ctSlideLayout.getMatchingName();
		ctSlideLayout.getPreserve();
		ctSlideLayout.getShowMasterPhAnim();
		ctSlideLayout.getShowMasterSp();
		ctSlideLayout.getTiming();
		ctSlideLayout.getTransition();
		ctSlideLayout.getType();
		ctSlideLayout.getUserDrawn();
	}

	/**
	 * 
	 */
	private void initSlideMaster(JOPresentationDocument presentationDocument) {
		try {
			PackageRelationshipCollection slideMasters = packagePart
					.getRelationshipsByType(Rcpl.RELATION_TYPE_SLIDE_MASTER);
			PackageRelationship slideMasterRel = slideMasters
					.getRelationship(0);
			URI uri1 = slideMasterRel.getTargetURI();

			for (JOSlideMasterPart sM : presentationDocument.getMasterSlides()) {
				URI partName = sM.getPackagePart().getPartName().getURI();
				if (uri1.equals(partName)) {
					slideMaster = sM;
					break;
				}
			}

		} catch (InvalidFormatException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	public SldLayoutDocument getLayoutDoc() {
		return layoutDoc;
	}

	@Override
	public JOSlideMasterPart getSlideMaster() {
		return slideMaster;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public JOSlideLayoutPart getSlideLayout() {
		return this;
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	public CTSlideLayout getCtSlideLayout() {
		return ctSlideLayout;
	}

}
