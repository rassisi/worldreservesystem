package com.joffice.rcpl.plugin.office.internal.model.word;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.ILayoutObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu20ThPoint;

/**
 * @author ramin
 * 
 */
public class JOAbstractHeaderAndFooter {

	private List<ILayoutObject> layoutObjects = new ArrayList<ILayoutObject>();

	private JOEmu20ThPoint height;

	private boolean even;
	private boolean odd;
	private boolean onFirstPage;

	private JOPict watermark;

	private CTSdtBlock[] sdtBlocks;

	private CTHdrFtr headerAndFooter;

	private JOSection section;

	/**
	 * @param section
	 * @param headerAndFooter
	 * @param even
	 * @param odd
	 * @param onFirstPage
	 */
	@SuppressWarnings("deprecation")
	public JOAbstractHeaderAndFooter(JOSection section, CTHdrFtr headerAndFooter, boolean even, boolean odd,
			boolean onFirstPage, boolean templateDocument) {
		this.even = even;
		this.odd = odd;
		this.onFirstPage = onFirstPage;
		this.headerAndFooter = headerAndFooter;
		this.section = section;

		CTP[] ctps = headerAndFooter.getPArray();

		sdtBlocks = headerAndFooter.getSdtArray();

		double w = 300;
		if (section.getPageWidth() > 0) {
			w = section.getPageWidth();
		}

		// if (pageFigure != null) {
		// w = pageFigure.getSize().width;
		// }

		if (!templateDocument) {
			for (CTP ctp : ctps) {
				getLayoutObjects().add(new JOParagraph(section.getDocument(), section, headerAndFooter, ctp, w, 20, 0.0,
						0.0, 0.0, 0.0, null, true, false, section, null, false, 0, null));

			}
		}

		processStdBlocks();
	}

	/**
	 * 
	 */
	@SuppressWarnings("deprecation")
	public void processStdBlocks() {
		sdtBlocks = headerAndFooter.getSdtArray();
		if (sdtBlocks != null) {
			for (CTSdtBlock ctSdtBlock : sdtBlocks) {
				CTSdtPr sdtPr = ctSdtBlock.getSdtPr();
				if (sdtPr != null) {
					CTSdtDocPart[] docParts = sdtPr.getDocPartObjArray();
					if (docParts != null) {
						for (CTSdtDocPart ctSdtDocPart : docParts) {
							CTString docPartGallery = ctSdtDocPart.getDocPartGallery();
							if (docPartGallery != null) {
								String galleryPart = docPartGallery.getVal();
								if (galleryPart.equals("Watermarks")) { //$NON-NLS-1$
									CTSdtContentBlock contentBlock = ctSdtBlock.getSdtContent();
									if (contentBlock != null) {
										CTP[] pArray = contentBlock.getPArray();
										if (pArray != null) {
											for (CTP ctp : pArray) {
												CTR[] runs = ctp.getRArray();
												if (runs != null) {
													for (CTR ctr : runs) {
														CTPicture[] ctPicts = ctr.getPictArray();
														if (ctPicts != null && ctPicts.length > 0) {

															watermark = new JOPict(section.getDocument(), null, null,
																	ctPicts[0], true);

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public List<ILayoutObject> getLayoutObjects() {
		if (layoutObjects == null) {
			layoutObjects = new ArrayList<ILayoutObject>();
		}
		return layoutObjects;
	}

	public JOEmu20ThPoint getHeight() {
		return height;
	}

	public void setHeight(JOEmu20ThPoint height) {
		this.height = height;
	}

	public boolean isEven() {
		return even;
	}

	public void setEven(boolean even) {
		this.even = even;
	}

	public boolean isOdd() {
		return odd;
	}

	public void setOdd(boolean odd) {
		this.odd = odd;
	}

	public boolean isOnFirstPage() {
		return onFirstPage;
	}

	public JOPict getWatermark() {
		return watermark;
	}

	public CTSdtBlock[] getSdtBlocks() {
		return sdtBlocks;
	}

}
