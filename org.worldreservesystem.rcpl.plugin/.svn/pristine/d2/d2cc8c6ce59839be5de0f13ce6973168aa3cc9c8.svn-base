package com.joffice.rcpl.plugin.office.internal.model.presentation;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;

import javax.xml.namespace.QName;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.xmlbeans.XmlOptions;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;

/**
 * @author ramin
 * 
 */
public class JOSlidePart extends JOAbstractSlide {

	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOSlidePart.class);

	private CTSlide ctSlide;

	private String id;

	private POIXMLDocumentPart poiSlidePart;

	/**
	 * @param document
	 * @param slide
	 */
	public JOSlidePart(JOPresentationDocument document, PackagePart packagePart, String id,
			JOSlideLayoutPart slideLayout, CTSlide ctSlide, Hashtable<String, String> relationsRegistry) {
		super(document, packagePart, relationsRegistry);
		this.ctSlide = ctSlide;
		this.slideLayout = slideLayout;
		this.id = id;
		if (relationsRegistry != null) {
			getRelationsRegistry().putAll(relationsRegistry);
		}
		initSlide(ctSlide.getClrMapOvr(), ctSlide.getCSld());
		// document.getPoi().addRelation(packagePart);
	}

	/**
	 * @param document
	 * @param packagePart
	 * @param slidePart
	 */
	public JOSlidePart(JOPresentationDocument document, PackagePart packagePart, JOSlidePart slidePart) {
		super(document, packagePart, null);
		int index = 0;
		CTSlide ctSlideTemplate;
		if (slidePart == null) {
			slidePart = document.getSlides().get(0);
		}
		// index = slidePart.getIndex() + 1;
		// ctSlideTemplate = slidePart.getCTSlide();
		// int newSlideNumber = document.getSlides().size() + 1;
		// poiSlidePart =
		// document.getPoi().createRelationship(XSLFRelation.SLIDE,
		// XSLFFactory___JO.getInstance(), newSlideNumber, false);
		// String targetName = poiSlidePart.getPackagePart().getPartName()
		// .getName();
		// id = ((JOAbstractDocument) document).findId(targetName);
		// if (!document.getPoi().getPresentation().isSetSldIdLst()) {
		// document.getPoi().getPresentation()
		// .setSldIdLst(CTSlideIdList.Factory.newInstance());
		// }
		// CTSlideIdList idList = document.getPoi().getPresentation()
		// .getSldIdLst();
		// CTSlideIdListEntry entry = idList.addNewSldId();
		// entry.setId2(id);
		// ctSlide = CTSlide.Factory.newInstance();
		// ctSlide.set(ctSlideTemplate);
		// document.getSlides().add(index, this);
		// save();
		// slideLayout = new JOSlideLayoutPart(document, packagePart, this);
		// JO.service.getLayoutService().layout();
	}

	public CTSlide getCTSlide() {
		return ctSlide;
	}

	@Override
	public JOSlideLayoutPart getSlideLayout() {
		return slideLayout;
	}

	@Override
	public void setSlideLayout(JOSlideLayoutPart slideLayout) {
		this.slideLayout = slideLayout;
	}

	@Override
	public String getId() {
		return id;
	}

	/**
	 * 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void save() {
		XmlOptions xmlOptions = new XmlOptions(POIXMLDocumentPart.DEFAULT_XML_OPTIONS);
		xmlOptions.setSaveSyntheticDocumentElement(new QName(CTSlide.type.getName().getNamespaceURI(), "sld")); //$NON-NLS-1$
		HashMap map = new HashMap<String, String>();
		map.put(STRelationshipId.type.getName().getNamespaceURI(), "r"); //$NON-NLS-1$
		map.put("http://schemas.openxmlformats.org/drawingml/2006/main", "a"); //$NON-NLS-1$ //$NON-NLS-2$
		// map.put("http://schemas.openxmlformats.org/officeDocument/2006/relationships",
		// "r"); //$NON-NLS-1$//$NON-NLS-2$
		map.put("http://schemas.openxmlformats.org/presentationml/2006/main", "p"); //$NON-NLS-1$//$NON-NLS-2$
		xmlOptions.setSaveSuggestedPrefixes(map);
		OutputStream out = getPackagePart().getOutputStream();
		try {
			ctSlide.save(out, xmlOptions);
			out.close();
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	/**
	 * @return
	 */
	public POIXMLDocumentPart getPoiSlidePart() {
		return poiSlidePart;
	}

	/**
	 * @return
	 */
	public int getIndex() {
		return getDocument().getSlides().indexOf(this);
	}

	@Override
	public JOPresentationDocument getDocument() {
		return (JOPresentationDocument) super.getDocument();
	}
}
