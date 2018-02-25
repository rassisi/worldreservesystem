/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office.internal.model.word;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.EnPageSize;
import org.eclipse.rcpl.IFooter;
import org.eclipse.rcpl.IHeader;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.ISection;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FtrDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHdrFtr;

import com.joffice.rcpl.plugin.office.JOBorder;
import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.JOPropertySectionType;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;
import com.joffice.rcpl.plugin.office.databinding.types.JOSectionType;
import com.joffice.rcpl.plugin.office.databinding2.JOAlignmentProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOBoolean;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20ThPointProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;

/**
 * @author ramin
 * 
 */
public class JOSection extends JOObject implements ISection {

	private List<IHeader> headers = null;
	private List<IFooter> footers = null;

	// ---------- new data binding 2 -------------------------------------------

	protected JOEmuProperty pageWidth;
	protected JOEmuProperty pageHeight;
	protected JOBoolean landscape;

	// ---------- new data binding ---------------------------------------------

	private JOPropertySectionType<JOSectionType> sectionType;

	protected JOBorder pageBorders;

	protected JOEmu headerMargin;
	protected JOEmu footerMargin;

	private int headerHeightFirstPagePixel = -1;
	private int headerHeightEvenPixel = -1;
	private int headerHeightOddPixel = -1;
	protected double columnSpace;
	protected int numberOfcolumns;
	protected CTDocGrid ooxmlDocGrid;

	private boolean templateDocument;

	private IPage page;

	private CTSectPr sectPr;

	private JOAlignmentProperty vAlignment;

	JOObject layoutObject;

	/**
	 * @param layoutObject
	 * @param anchorObject
	 * @param pageFigure
	 * @param xmlParent
	 * @param xmlObject
	 */
	public JOSection(JOObject layoutObject, JOObject anchorObject, XmlObject xmlParent, XmlObject xmlObject,
			boolean templateDocument) {
		super(layoutObject.getDocument(), anchorObject, xmlParent, xmlObject, true, false, -1);
		this.layoutObject = layoutObject;
		this.sectPr = (CTSectPr) xmlObject;
		this.templateDocument = templateDocument;
		if (sectPr == null) {
			return;
		}
		updateFromXml();
	}

	/**
	 * 
	 */
	private void processHeaderAndFooter() {
		JOEmu20ThPoint headerHeight = null;
		JOEmu20ThPoint footerHeight = null;

		CTPageMar pageMargin = sectPr.getPgMar();
		if (pageMargin != null && pageMargin.getHeader() != null) {
			headerHeight = new JOEmu20ThPoint(pageMargin.getHeader());
		}
		if (pageMargin != null && pageMargin.getFooter() != null) {
			footerHeight = new JOEmu20ThPoint(pageMargin.getFooter());
		}

		boolean flag = getDocument().isDirtyBecauseOfFirstLayout();

		for (int i = 0; i < sectPr.sizeOfHeaderReferenceArray(); i++) {
			if (headers == null) {
				headers = new ArrayList<IHeader>();
			}
			// Get the header
			CTHdrFtrRef ref = sectPr.getHeaderReferenceArray(i);

			STHdrFtr.Enum en = ref.getType();
			boolean even = false;
			boolean odd = false;
			boolean onFirstPage = false;
			if (en.equals(STHdrFtr.EVEN)) {
				even = true;
				odd = false;
				onFirstPage = false;
			} else if (en.equals(STHdrFtr.FIRST)) {
				even = false;
				odd = false;
				onFirstPage = true;
			} else if (en.equals(STHdrFtr.DEFAULT)) {
				even = true;
				odd = true;
				onFirstPage = false;
			}

			PackagePart hdrPart = getDocument().getPartById(ref.getId());
			HdrDocument hdrDoc;
			try {
				hdrDoc = HdrDocument.Factory.parse(hdrPart.getInputStream());
				CTHdrFtr headerAndFooter = hdrDoc.getHdr();
				JOHeader newHeader = new JOHeader(this, headerAndFooter, even, odd, onFirstPage, templateDocument);
				if (headerHeight != null) {
					newHeader.setHeight(headerHeight);
				}
				headers.add(newHeader);
			} catch (XmlException e) {
			} catch (IOException e) {
			}

			// Assign it
			// Enum type = ref.getType();
			// assignHeader(hdr, type);
		}

		for (int i = 0; i < sectPr.sizeOfFooterReferenceArray(); i++) {
			if (footers == null) {
				footers = new ArrayList<IFooter>();
			}
			// Get the footer
			CTHdrFtrRef ref = sectPr.getFooterReferenceArray(i);
			PackagePart ftrPart = getDocument().getPartById(ref.getId());
			STHdrFtr.Enum en = ref.getType();
			boolean even = false;
			boolean odd = false;
			boolean onFirstPage = false;
			if (en.equals(STHdrFtr.EVEN)) {
				even = true;
				odd = false;
				onFirstPage = false;
			} else if (en.equals(STHdrFtr.FIRST)) {
				even = false;
				odd = false;
				onFirstPage = true;
			} else if (en.equals(STHdrFtr.DEFAULT)) {
				even = true;
				odd = true;
				onFirstPage = false;
			}

			FtrDocument ftrDoc;
			try {
				ftrDoc = FtrDocument.Factory.parse(ftrPart.getInputStream());
				CTHdrFtr hdrFtr = ftrDoc.getFtr();
				JOFooter newFooter = new JOFooter(this, hdrFtr, even, odd, onFirstPage, templateDocument);
				if (footerHeight != null) {
					newFooter.setHeight(footerHeight);
				}
				footers.add(newFooter);
			} catch (XmlException e) {
			} catch (IOException e) {
			}

			// Assign it
			// Enum type = ref.getType();
			// assignFooter(ftr, type);
		}

		getDocument().setDirtyBecauseOfFirstLayout(flag);

	}

	@Override
	public boolean dispose() {
		return false;
	}

	@Override
	public ILayoutFigure createLayoutFigure() {
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void updateFromXml() {

		// ---------- columns --------------------------------------------------

		CTColumns ctColumns = sectPr.getCols();
		if (ctColumns != null) {
			if (ctColumns.getSpace() != null) {
				columnSpace = JOConversion.pointsToPixel(ctColumns.getSpace().doubleValue() / 20.0);
			}
			BigInteger numCols = ctColumns.getNum();
			if (numCols != null) {
				numberOfcolumns = numCols.intValue();
			}
		} else {
			columnSpace = 0;
			numberOfcolumns = 1;
		}

		// STOnOff.Enum columnEqulWidth = ctColumns.getEqualWidth();

		// STOnOff.Enum sep = ctColumns.getSep();

		// CTColumn[] ctColumnArray = ctColumns.getColArray();
		// for (CTColumn column : ctColumnArray) {
		// BigInteger space = column.getSpace();
		// BigInteger columnWidth = column.getW();
		// }

		sectPr.getBidi();
		ooxmlDocGrid = sectPr.getDocGrid();
		sectPr.getEndnotePr();
		sectPr.getFooterReferenceArray();
		sectPr.getFootnotePr();
		sectPr.getFormProt();
		// CTHdrFtrRef[] headerFooterReferences =
		// sectPr.getHeaderReferenceArray();
		// for (CTHdrFtrRef ctHdrFtrRef : headerFooterReferences) {
		// STHdrFtr.Enum en = ctHdrFtrRef.getType();
		// if (en.equals(STHdrFtr.EVEN)) {
		// even = true;
		//
		// } else if (en.equals(STHdrFtr.FIRST)) {
		// } else if (en.equals(STHdrFtr.DEFAULT)) {
		// }
		// }

		sectPr.getLnNumType();
		sectPr.getNoEndnote();
		sectPr.getPaperSrc();

		CTPageBorders ctPageBorders = sectPr.getPgBorders();
		if (ctPageBorders != null) {
			pageBorders = new JOBorder(this, ctPageBorders);
		} else {
			pageBorders = null;
		}

		setPageMargin(sectPr.getPgMar());

		sectPr.getPgNumType();

		CTPageSz pageSiz = sectPr.getPgSz();
		if (pageSiz != null) {
			pageWidth = new JOEmu20ThPointProperty(this, null, pageSiz, "W", //$NON-NLS-1$
					new String[] { "word/actions/page/size_width" }, EValueType.MEASUREMENT); //$NON-NLS-1$
			pageHeight = new JOEmu20ThPointProperty(this, null, pageSiz, "H", //$NON-NLS-1$
					new String[] { "word/actions/page/size_height" }, EValueType.MEASUREMENT); //$NON-NLS-1$

			pageWidth.get();
			pageHeight.get();

			landscape = new JOBoolean(this, null, pageSiz, "Orient", //$NON-NLS-1$
					new String[] { "word/actions/page/set_landscape" }); //$NON-NLS-1$
		}
		sectPr.getPrinterSettings();
		sectPr.getRsidDel();
		sectPr.getRsidR();
		sectPr.getRsidRPr();
		sectPr.getRsidSect();
		sectPr.getRtlGutter();
		sectPr.getSectPrChange();
		sectPr.getTextDirection();
		sectPr.getTitlePg();
		sectPr.getType();
		CTVerticalJc ctVerticalJc = sectPr.getVAlign();

		if (ctVerticalJc != null) {
			vAlignment = new JOAlignmentProperty(layoutObject, sectPr, ctVerticalJc, "Val",
					new String[] { Rcpl.DBK_SECTION_VERTICAL_ALIGNMENT });
		}

		sectPr.getLnNumType();
		sectPr.getCols();
		sectPr.getBidi();
		sectPr.getDocGrid();
		sectPr.getEndnotePr();
		sectPr.getFootnotePr();
		sectPr.getFormProt();
		sectPr.getNoEndnote();
		sectPr.getPaperSrc();
		sectPr.getPgBorders();

		sectPr.getPgNumType();
		// CTPageSz pageSize = sectPr.getPgSz();

		sectPr.getPrinterSettings();
		sectPr.getRtlGutter();
		sectPr.getSectPrChange();
		sectPr.getTextDirection();
		sectPr.getTitlePg();
		if (sectPr.getType() != null) {
			sectionType = new JOPropertySectionType<JOSectionType>(this, sectPr, sectPr.getType());
		}
		sectPr.getVAlign();

		processHeaderAndFooter();
	}

	@Override
	public double getClientPageWidth() {
		return getPageWidth() - getLeftMargin() - getRightMargin();
	}

	/**
	 * @return
	 */
	@Override
	public int getNumberOfcolumns() {
		if (numberOfcolumns < 1) {
			numberOfcolumns = 1;
		}
		return numberOfcolumns;
	}

	public void setNumberOfcolumns(int numberOfcolumns) {
		this.numberOfcolumns = numberOfcolumns;
	}

	public CTDocGrid getOoxmlDocGrid() {
		return ooxmlDocGrid;
	}

	public void setOoxmlDocGrid(CTDocGrid ooxmlDocGrid) {
		this.ooxmlDocGrid = ooxmlDocGrid;
	}

	@Override
	public double getColumnSpace() {
		return columnSpace;
	}

	public void setColumnSpace(int columnSpace) {
		this.columnSpace = columnSpace;
	}

	public void setPageMargin(CTPageMar pageMargin) {
		if (pageMargin != null && pageMargin.getLeft() != null) {
			leftMargin = new JOEmu20ThPointProperty(this, null, pageMargin, "Left", //$NON-NLS-1$
					new String[] { "word/actions/page/margin_left" }, EValueType.MEASUREMENT); //$NON-NLS-1$
		}
		if (pageMargin != null && pageMargin.getTop() != null) {
			topMargin = new JOEmu20ThPointProperty(this, null, pageMargin, "Top", //$NON-NLS-1$
					new String[] { "word/actions/page/margin_top" }, EValueType.MEASUREMENT); //$NON-NLS-1$
		}
		if (pageMargin != null && pageMargin.getRight() != null) {
			rightMargin = new JOEmu20ThPointProperty(this, null, pageMargin, "Right", //$NON-NLS-1$
					new String[] { "word/actions/page/margin_right" }, EValueType.MEASUREMENT); //$NON-NLS-1$
		}
		if (pageMargin != null && pageMargin.getBottom() != null) {
			bottomMargin = new JOEmu20ThPointProperty(this, null, pageMargin, "Bottom", //$NON-NLS-1$
					new String[] { "word/actions/page/margin_bottom" }, EValueType.MEASUREMENT); //$NON-NLS-1$
		}
		if (pageMargin != null && pageMargin.getFooter() != null) {
			footerMargin = new JOEmuPoint(pageMargin.getFooter().doubleValue() / 20.0);
		}
		if (pageMargin != null && pageMargin.getHeader() != null) {
			headerMargin = new JOEmuPoint(pageMargin.getHeader().doubleValue() / 20.0);
		}
	}

	/**
	 * @param pageNumber
	 * @return
	 */
	@Override
	public double getTopMarginPixel(int pageNumber) {
		if (topMargin == null) {
			return 0;
		}
		if (pageNumber == 1 && headerHeightFirstPagePixel != -1) {
			return Math.max(headerHeightFirstPagePixel, getTopMargin());
		} else if ((pageNumber % 2) == 0 && headerHeightEvenPixel != -1) {
			return Math.max(headerHeightEvenPixel, getTopMargin());
		} else if ((pageNumber % 2) != 0 && headerHeightOddPixel != -1) {
			return Math.max(headerHeightOddPixel, getTopMargin());
		} else {
			return getTopMargin();
		}
	}

	/**
	 * @param pageNumber
	 * @return
	 */
	@Override
	public double getBottomMarginPixel(int pageNumber) {
		if (bottomMargin == null) {
			return 0;
		}
		if (pageNumber == 1 && headerHeightFirstPagePixel != -1) {
			return Math.max(headerHeightFirstPagePixel, getBottomMargin());
		} else if ((pageNumber % 2) == 0 && headerHeightEvenPixel != -1) {
			return Math.max(headerHeightEvenPixel, getBottomMargin());
		} else if ((pageNumber % 2) != 0 && headerHeightOddPixel != -1) {
			return Math.max(headerHeightOddPixel, getBottomMargin());
		} else {
			return getBottomMargin();
		}
	}

	public List<IHeader> getHeaders() {
		if (headers == null) {
			headers = new ArrayList<IHeader>();
		}
		return headers;
	}

	public List<IFooter> getFooters() {
		if (footers == null) {
			footers = new ArrayList<IFooter>();
		}
		return footers;
	}

	@Override
	public String getDisplayName() {
		return "SectionBreak";
	}

	public JOPropertySectionType<JOSectionType> getSectionType() {
		return sectionType;
	}

	public void setSectionType(JOPropertySectionType<JOSectionType> sectionType) {
		this.sectionType = sectionType;
	}

	@Override
	public boolean isPageBreakBefore() {
		return false;
	}

	@Override
	public IPage getPage() {
		return page;
	}

	@Override
	public void setPage(IPage page) {
		this.page = page;
	}

	@Override
	public boolean isEven() {
		if (sectionType != null) {
			return sectionType.get().equals(JOSectionType.EVEN);
		}
		return false;
	}

	@Override
	public boolean isOdd() {
		if (sectionType != null) {
			return sectionType.get().equals(JOSectionType.ODD);
		}
		return false;
	}

	@Override
	public boolean isNextPage() {
		if (sectionType != null) {
			return sectionType.get().equals(JOSectionType.NEXT_PAGE);
		}
		return false;
	}

	public boolean isContinuous() {
		if (sectionType != null) {
			return sectionType.get().equals(JOSectionType.CONTINUOUS);
		}
		return false;
	}

	public boolean isNextColumn() {
		if (sectionType != null) {
			return sectionType.get().equals(JOSectionType.NEXT_COLUMN);
		}
		return false;
	}

	@Override
	public String toString() {
		return " width = " + getPageWidth() //$NON-NLS-1$
				+ " height = " + getPageHeight(); //$NON-NLS-1$
	}

	public int getHeaderHeightFirstPagePixel() {
		return headerHeightFirstPagePixel;
	}

	public void setHeaderHeightFirstPagePixel(int headerHeightFirstPagePixel) {
		this.headerHeightFirstPagePixel = headerHeightFirstPagePixel;
	}

	public int getHeaderHeightEvenPixel() {
		return headerHeightEvenPixel;
	}

	public void setHeaderHeightEvenPixel(int headerHeightEvenPixel) {
		this.headerHeightEvenPixel = headerHeightEvenPixel;
	}

	public int getHeaderHeightOddPagePixel() {
		return headerHeightOddPixel;
	}

	public void setHeaderHeightOddPagePixel(int headerHeightOddPagePixel) {
		this.headerHeightOddPixel = headerHeightOddPagePixel;
	}

	public JOEmu getHeaderMargin() {
		return headerMargin;
	}

	public JOEmu getFooterMargin() {
		return footerMargin;
	}

	/**
	 * @return
	 */
	@Override
	public EnPageSize getPageSize() {
		double pageWidthCm = (pageWidth.get().toCm() * 100);
		double pageHeightCm = (pageHeight.get().toCm() * 100);
		double pageWidthInch = (pageWidth.get().toInch() * 100);
		double pageHeightInch = (pageHeight.get().toInch() * 100);

		for (EnPageSize pz : EnPageSize.values()) {
			double pageWidthCm2 = (pz.getCmWidth() * 100);
			double pageHeightCm2 = (pz.getCmHeight() * 100);
			double pageWidthInch2 = (pz.getInchWidth() * 100);
			double pageHeightInch2 = (pz.getInchHeight() * 100);
			if (pageWidthCm2 > 0) {
				double diffW = Math.abs(pageWidthCm2 - pageWidthCm);
				double diffH = Math.abs(pageHeightCm2 - pageHeightCm);
				if (diffW < 5 && diffH < 5) {
					return pz;
				}
			} else if (pageWidthInch2 > 0) {
				double diffW = Math.abs(pageWidthInch2 - pageWidthInch);
				double diffH = Math.abs(pageHeightInch2 - pageHeightInch);
				if (diffW < 5 && diffH < 5) {
					return pz;
				}
			}
		}
		return EnPageSize.CUSTOM;
	}

	/**
	 * @return
	 */
	@Override
	public double getPageWidth() {

		try {
			double cm = pageWidth.get().toCm();

			double w = pageWidth.get().toPixel();
			if (getLandscape().getValue() == null) {
				return w;
			}
			double h = pageHeight.get().toPixel();
			if (getLandscape().get()) {
				if (w > h) {
					return w;
				}
				return h;
			}
			if (w < h) {
				return w;
			}
			return h;
		} catch (Exception ex) {
			return 0;
		}
	}

	/**
	 * @return
	 */
	@Override
	public double getPageHeight() {
		double h = pageHeight.get().toPixel();

		if (getLandscape().getValue() == null) {
			return h;
		}
		double w = pageWidth.get().toPixel();
		if (getLandscape().get()) {
			if (w < h) {
				return w;
			}
			return h;
		}
		if (w > h) {
			return w;
		}
		return h;
	}

	/**
	 * @param width
	 * @param height
	 */
	public void setPageSize(int width, int height) {

		pageHeight.set(height);
		pageWidth.set(width);
		if (getDocument().getEditor() != null) {
			IPage page = getDocument().getEditor().findFistPageOfSection();
			if (page != null) {
				page.setWidth(width);
				page.setHeight(height);
			}
		}
	}

	public JOBoolean getLandscape() {
		return landscape;
	}

	public JOBorder getPageBorders() {
		return pageBorders;
	}

	@Override
	public JOAlignmentProperty getvAlignment() {
		return vAlignment;
	}

	@Override
	public IImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getWidthPixel() {
		return getPageWidth();
	}

	@Override
	public double getHeightPixel() {
		return getPageHeight();
	}
}
