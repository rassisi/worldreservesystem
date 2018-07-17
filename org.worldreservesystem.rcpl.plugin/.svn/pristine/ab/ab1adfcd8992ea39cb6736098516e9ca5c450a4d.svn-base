package com.joffice.rcpl.plugin.office.internal.services;

import java.util.Iterator;
import java.util.List;

import org.eclipse.rcpl.IFooter;
import org.eclipse.rcpl.IHeader;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.EnLayoutAlignment;
import org.eclipse.rcpl.LayoutData;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.JOPropertySectionType;
import com.joffice.rcpl.plugin.office.databinding.types.JOSectionType;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.joffice.rcpl.plugin.office.internal.figures.JOEmptyPageFigure;
import com.joffice.rcpl.plugin.office.internal.figures.JOPageFigure;
import com.joffice.rcpl.plugin.office.internal.model.word.JOFooter;
import com.joffice.rcpl.plugin.office.internal.model.word.JOHeader;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSection;

import javafx.application.Platform;
import javafx.geometry.Point2D;

/**
 * @author ramin
 *
 */
public class JOLayoutServiceProviderWord {

	private JOLayoutService layoutService;

	public JOLayoutServiceProviderWord(JOLayoutService layoutService) {
		this.layoutService = layoutService;
	}

	/**
	 * @param layoutObject
	 * @param layoutData
	 */
	private void addAfterSpace(LayoutData ld) {
		ILayoutObject lo = ld.getLayoutObject();
		if (lo.isPageBreakAfter()) {
			return;
		}
		ld.setY(ld.getY() + layoutService.calculateAfterSpace(ld.getLayoutObject()));
	}

	/**
	 * @param layoutObject
	 * @param ld
	 * @return
	 */
	private boolean breakAfter(LayoutData ld) {
		if (ld.getLayoutObject().isPageBreakAfter()) {
			ILayoutObject lo = ld.getLayoutObject();
			if (lo.getSection().getNumberOfcolumns() > 1) {
				layoutService.breakToNextColumn(ld);
			} else {
				layoutService.breakToNextPage(ld, false);
				ld.page.setSection(ld.actualSection);
			}
			ld.pageBreakOccured = true;
			return true;
		}
		return false;
	}

	/**
	 * @param layoutObject
	 * @param ld
	 */
	private boolean breakBefore(LayoutData ld) {
		if (ld.page == null) {
			return false;
		}

		ILayoutObject lo = ld.getLayoutObject();
		ILayoutFigure lf = lo.getLayoutFigure();
		ILayoutFigure prevOverflow = getPreviousOverflowFigure(ld);
		boolean overflowOccuredInPrev = prevOverflow != null && prevOverflow.getPane().getParent() == null;

		boolean pageBreak = ((JOObject) ld.getLayoutObject()).isRenderedPageBreak();
		boolean pageBreakBefore = ((JOObject) ld.getLayoutObject()).isPageBreakBefore();

		double layoutBottomY = ld.getY() + lo.getHeightPixel();

		// now get the height of the first line
		// the remainin must be more than that

		double pageBottomY = ld.page.getY2() + ld.page.getHeight() - ld.page.getMarginBottom();
		double overflowExcess;
		double absatzControl = 0;

		overflowExcess = layoutBottomY - pageBottomY;

		double remaining = pageBottomY - ld.getY();

		boolean hurenkinder = false;

		if (lo instanceof IParagraph && lo.isRootObject()) {

			double firstLineHeight = ((IParagraphFigure) lf).getFirstLineHeight();
			if (remaining < (firstLineHeight + 5)) {
				hurenkinder = true;
				lf.setOverflowExcess(0, 0);
			} else {
				if (overflowExcess > 0) {
					absatzControl = (overflowExcess / lo.getHeightPixel()) * 100;
					if (absatzControl > 95) {
						lf.setOverflowExcess(0, 0);
						hurenkinder = true;
					} else {
						lf.setOverflowExcess(overflowExcess, remaining);
						// double newOverflowExcess = lf.getOverflowExcess();
						// double newRemaining = lf.getRemaining();

					}
				} else {
					ld.getLayoutObject().getLayoutFigure().setOverflowExcess(0, 0);
				}
			}
		}

		if (

		(ld.getLayoutObject().getPreviousRootObject() == null && pageBreak)

		|| (pageBreak && !ld.getLayoutObject().getPreviousRootObject().isPageBreakAfter())

		|| pageBreakBefore

		|| hurenkinder

		|| overflowOccuredInPrev) {

			if (ld.editor.getDocument().getSection().getNumberOfcolumns() > 1) {
				layoutService.breakToNextColumn(ld);
			} else {
				layoutService.breakToNextPage(ld, true);
			}

			if (overflowOccuredInPrev) {
				prevOverflow.setColumnX(ld.getX() - ld.page.getX2());
				ld.page.add(prevOverflow);
			}

			return !hurenkinder;
		}

		if (isColumnBreak(ld)) {
			IParagraph p = ld.getLayoutObject().getPreviousRootParagraph();
			if (p != null) {
				((JOParagraphFigure) p.getLayoutFigure()).showColumnBreakLabel(true);
			}
			layoutService.breakToNextColumn(ld);
			return false;
		} else {

			IParagraph p = ld.getLayoutObject().getPreviousRootParagraph();
			if (p != null) {
				((JOParagraphFigure) p.getLayoutFigure().getFx()).showColumnBreakLabel(false);
			}
		}

		return false;
	}

	private ILayoutFigure getPreviousOverflowFigure(LayoutData ld) {
		if (layoutService.isRootParagraph(ld)) {
			ILayoutObject prevL = ld.getLayoutObject().getPreviousRootObject();
			if (prevL instanceof IParagraph) {
				IParagraph prev = (IParagraph) prevL;
				if (prev.getLayoutFigure().getOverflowExcess() > 0) {
					IParagraphFigure f = prev.getOverflowParagraphFigure();
					return f;
				}
			}
		}
		return null;
	}

	/**
	 * @param page
	 * @param layoutObject
	 * @param layoutBounds
	 * @param hAnchor
	 * @param vAnchor
	 * @return
	 */
	private Point2D getAnchorPosition(LayoutData layoutData, ILayoutAnchor hAnchor, ILayoutAnchor vAnchor) {
		double x = Integer.MAX_VALUE;
		double y = Integer.MAX_VALUE;
		ILayoutObject lo = layoutData.getLayoutObject();
		if (vAnchor != null && (vAnchor.equals(ILayoutAnchor.PAGE) || vAnchor.equals(ILayoutAnchor.MARGIN))) {

			if (lo.getHeightPixel() > ((JOPageFigure) layoutData.page).getHeight()) {
				lo.setHeightPixel(((JOPageFigure) layoutData.page).getHeight());
			}
			if (lo.getWidthPixel() > ((JOPageFigure) layoutData.page).getWidth()) {
				lo.setWidthPixel(((JOPageFigure) layoutData.page).getWidth());
			}
			if (((JOObject) layoutData.getLayoutObject()).hasY()) {
				y = layoutData.page.getY2() + layoutData.getLayoutObject().getYPixel();
			} else {
				if (layoutData.getLayoutObject().getyAlign() != null) {
					EnLayoutAlignment ya = layoutData.getLayoutObject().getyAlign();
					if (ya.equals(EnLayoutAlignment.CENTER)) {
						if (vAnchor.equals(ILayoutAnchor.MARGIN)) {
							y = layoutData.page.getX2() + ((JOPageFigure) layoutData.page).getMarginTop()
									+ (layoutData.page.getWidth() - ((JOPageFigure) layoutData.page).getMarginTop()
											- ((JOPageFigure) layoutData.page).getMarginBottom()) / 2
									- layoutData.getLayoutObject().getHeightPixel() / 2; // figure
						} else if (vAnchor.equals(ILayoutAnchor.PAGE)) {
							y = layoutData.page.getX2() + layoutData.page.getWidth() / 2
									- layoutData.getLayoutObject().getHeightPixel() / 2; // figure
						}
					} else if (ya.equals(EnLayoutAlignment.INSIDE)) {

					} else if (ya.equals(EnLayoutAlignment.OUTSIDE)) {

					} else if (ya.equals(EnLayoutAlignment.LEFT)) {

					} else if (ya.equals(EnLayoutAlignment.RIGHT)) {

					}
				} else {
					y = 0;
				}
			}
		}

		if (hAnchor != null && (hAnchor.equals(ILayoutAnchor.PAGE) || hAnchor.equals(ILayoutAnchor.MARGIN))) {

			if (layoutData.getLayoutObject().getSection().getNumberOfcolumns() > 1) {

			} else {
				if ((hAnchor.equals(ILayoutAnchor.PAGE))) {
					x = layoutData.page.getX2();
				} else if ((hAnchor.equals(ILayoutAnchor.MARGIN))) {
					x = layoutData.page.getX2() + layoutData.page.getMarginLeft();
				}
			}

			if (lo.getHeightPixel() > ((JOPageFigure) layoutData.page).getHeight()) {
				lo.setHeightPixel(((JOPageFigure) layoutData.page).getHeight());
			}
			if (lo.getWidthPixel() > ((JOPageFigure) layoutData.page).getWidth()) {
				lo.setWidthPixel(((JOPageFigure) layoutData.page).getWidth());
			}
			if (((JOObject) layoutData.getLayoutObject()).hasX()) {
				double xOff = layoutData.getLayoutObject().getXPixel();
				x += xOff;
			} else {
				if (layoutData.getLayoutObject().getxAlign() != null) {
					EnLayoutAlignment xa = layoutData.getLayoutObject().getxAlign();
					if (xa.equals(EnLayoutAlignment.CENTER)) {
						if (vAnchor != null) {
							if (vAnchor.equals(ILayoutAnchor.MARGIN)) {
								x = layoutData.page.getX2() + layoutData.page.getMarginLeft()
										+ (layoutData.page.getWidth() - layoutData.page.getMarginLeft()
												- layoutData.page.getMarginRight()) / 2
										- layoutData.getLayoutObject().getWidthPixel() / 2; // figure
							} else if (vAnchor.equals(ILayoutAnchor.PAGE)) {
								x = layoutData.page.getX2() + layoutData.page.getWidth() / 2
										- layoutData.getLayoutObject().getWidthPixel() / 2; // figure
							}
						}
					} else if (xa.equals(EnLayoutAlignment.INSIDE)) {

					} else if (xa.equals(EnLayoutAlignment.OUTSIDE)) {

					} else if (xa.equals(EnLayoutAlignment.LEFT)) {

					} else if (xa.equals(EnLayoutAlignment.RIGHT)) {

					}
				}
			}
		}
		return new Point2D(x, y);
	}

	/**
	 * @param editor
	 * @param numberOfLayouts
	 * @param startLayoutObject
	 */
	private boolean initLayout(LayoutData layoutData) {

		if (layoutService.getEditor().getDocument() == null) {
			return false;
		}

		layoutData.startTime = System.currentTimeMillis();
		layoutData.editor = layoutService.getEditor();
		layoutData.rootObjects = layoutService.getEditor().getDocument().getRootObjects();

		ILayoutObject dirtyObject = layoutService.getEditor().getFirstDirtyLayoutObject();
		if (dirtyObject == null) {
			return false;
		}

		layoutData.index = dirtyObject.getRootObjectIndex();

		if (layoutData.index > 0) {
			if (dirtyObject.getLayoutFigure().getPane().getLayoutY() == 0) {
				dirtyObject = dirtyObject.getPreviousRootObject();
				layoutData.index = dirtyObject.getRootObjectIndex();
			}
		}

		// ---------- get section from document --------------------------------

		layoutData.actualSection = layoutData.editor.getDocument().getSection();
		layoutData.headers = ((JOSection) layoutData.editor.getDocument().getSection()).getHeaders();
		layoutData.footers = ((JOSection) layoutData.editor.getDocument().getSection()).getFooters();

		// ---------- set page -----------------------------------------------

		if (!layoutData.editor.hasPages()) {
			layoutData.page = layoutService.addPage(null, -1, false, false, layoutData, true, false);
			layoutService.layoutPages();
			layoutData.getLayoutObject().setPage(layoutData.page);
		} else {
			layoutData.page = dirtyObject.getPage();
			if (layoutData.page == null) {
				if (dirtyObject.getPreviousRootObject() != null) {
					layoutData.page = dirtyObject.getPreviousRootObject().getPage();
				} else {
					layoutData.page = dirtyObject.getDocument().getEditor().getPage(0);
				}
			}
		}

		// ---------- get the non dirty object before the dirty object -----

		if (layoutData.index <= 0) {
			double pageMarginX = layoutData.page.getX2() + layoutData.page.getMarginLeft();
			double pageMarginY = layoutData.page.getY2() + layoutData.page.getHeaderMargin();
			layoutData.setX(pageMarginX);
			layoutData.setY(pageMarginY);
		} else {
			ILayoutFigure f = layoutData.getLayoutObject().getLayoutFigure();
			layoutData.setX(f.getX2());
			layoutData.setY(f.getY2());
		}

		return true;

	}

	private boolean isColumnBreak(LayoutData layoutData) {
		if (layoutData.getLayoutObject() instanceof JOParagraph) {
			JOParagraph paragraph = (JOParagraph) layoutData.getLayoutObject();
			if (paragraph.isStartNewSection()) {
				JOPropertySectionType<JOSectionType> type = ((JOSection) paragraph.getSection()).getSectionType();
				if (type != null && type.get().equals(JOSectionType.NEXT_COLUMN)) {
					return true;
				}
			}
		}

		return ((JOObject) layoutData.getLayoutObject()).isColumnBreak();
	}

	/**
	 * Main Layout Method.<br/>
	 * Concept:<br/>
	 * <br/>
	 * 1. Skip all non dirty objects or start with the index of a given start
	 * object<br/>
	 * 
	 * for all objects<br/>
	 * 2. update section<br/>
	 * 3. check page break before<br/>
	 * 4. layout object<br/>
	 * 5. if layout not changed break;<br/>
	 * 6. layout children<br/>
	 * 7. section break to next column<br/>
	 * 8. if (!pageBreakAfter(layoutObject, layoutData)) {<br/>
	 * ____updateNewLayoutPosition(layoutObject, layoutData);<br/>
	 * ____if (maxNumberOfLayoutsReached(layoutData)) {<br/>
	 * ______break;<br/>
	 * }<br/>
	 * }<br/>
	 * <br/>
	 */
	void layout(LayoutData ld) {

		// ---------- init layout ---------------------------------------

		if (!ld.interrupted) {
			ld.clear();
			ld.firstDirtyObject = layoutService.getEditor().getFirstDirtyLayoutObject();
			if (!initLayout(ld)) {
				return;
			}
		}

		// ---------- main loop ------------------------------------------------

		ld.pageCount = 0;
		ld.interrupted = false;

		for (; ld.index < ld.rootObjects.size(); ld.index++) {

			if (!layoutOneRootObject(ld)) {
				break;
			}
			Rcpl.progressMessage("Page " + ld.editor.getPageCount());
		}

		// ---------- end - main loop -----------------------------------------

		if (!ld.interrupted) {
			ld.editor.removeEmptyPages();
			layoutService.layoutPages();
			ld.pageCount = 0;
		}

		if (ld.compleated()) {
			if (layoutService.getEditor().getDocument().isOnePage()) {
				layoutService.getEditor().getDocument().setLayouted(true);
			}

			if (!ld.getDocument().isLayouted()) {
				clipAllPages(ld);
				// showFirstPages();
			}
			ld.getDocument().setLayouted(true);
			ld.interrupted = false;
		}

	}

	/**
	 * @param ld
	 * @return
	 */
	private boolean layoutOneRootObject(LayoutData ld) {
		try {
			IPage page = ld.page;
			if (page.getPageNumber() < 1) {
				return false;
			}
			ILayoutObject lo = ld.getLayoutObject();
			ILayoutFigure lf = lo.getLayoutFigure();

			// ---------- load the actual size -------------------
			// (only size of root object are important)

			// ---------- SET BOUNDS OF A TABLE ------------------

			if (lo instanceof ITable) {
				lo.setPage(ld.page);
			}

			// ---------- space before ---------------------------

			if (ld.firstDirtyObject != ld.getLayoutObject()) {
				layoutService.calculateSpaceBefore(ld);
			}

			// ---------- UPDATE SECTION -------------------------

			updateSection(ld);

			// ---------- BREAK BEFORE ---------------------------

			breakBefore(ld);

			// ------ layout the object, if nothing changed stop --

			boolean changedBounds = layoutRootObject(ld);

			if (ld.getDocument().isLayouted()) {
				if (!changedBounds) {
					ld.notChangedCounter++;
				} else {
					ld.notChangedCounter = 0;
				}

				if (ld.notChangedCounter > 10) {
					ld.notChangedCounter = 0;
					ld.index = ld.rootObjects.size();
					ld.getLayoutObject().setDirtyLayout(false);
					return false;
				}
			}

			// ---------- LAYOUT CHILDREN ------------------------

			lf.setColumnX(ld.getX());
			layoutChildren(ld);

			// ---------- correct position when table ------------

			layoutTable(ld);

			// ---------- BREAKS ---------------------------------

			breakAfter(ld);

			addAfterSpace(ld);

			if (ld.requestInterrupt) {
				ld.requestInterrupt = false;
				ld.getLayoutObject().setDirtyLayout(false);
				ld.index++;
				if (ld.getLayoutObject() == null) {
					return false;
				}
				ld.getLayoutObject().setDirtyLayout(true);
				ld.interrupted = true;
				return false;

			}
			if (ld.page != page) {
				ld.pageCount++;
				if (ld.pageCount == 1 || ld.pageCount > 5) {
					ld.pageCount = 2;
					ld.getLayoutObject().setDirtyLayout(false);
					// ld.requestInterrupt = true;

					ld.getLayoutObject().setDirtyLayout(false);
					ld.index++;
					if (ld.getLayoutObject() == null) {
						return false;
					}
					ld.getLayoutObject().setDirtyLayout(true);
					ld.interrupted = true;

					return false;
				}
			}

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		ld.getLayoutObject().setDirtyLayout(false);

		return true;
	}

	private void clipAllPages(LayoutData ld) {
		for (final IPage p : ld.editor.getPages()) {
			if (Platform.isFxApplicationThread()) {
				p.clipFigures();
			} else {
				Platform.runLater(new Runnable() {

					@Override
					public void run() {
						p.clipFigures();
					}
				});
			}
		}
	}

	private void showFirstPages() {
		// if (Platform.isFxApplicationThread()) {
		// int counter = 0;
		// for (IPage page : layoutService.getEditor().getPages()) {
		// page.setVisible(true);
		// if (++counter > 3) {
		// break;
		// }
		// }
		// layoutService.getEditor().getLastPage().setVisible(true);
		// } else {
		// Platform.runLater(new Runnable() {
		//
		// @Override
		// public void run() {
		// int counter = 0;
		// for (IPage page : layoutService.getEditor().getPages()) {
		// page.setVisible(true);
		// if (++counter > 3) {
		// break;
		// }
		// }
		// layoutService.getEditor().getLastPage().setVisible(true);
		//
		// }
		// });
		// }
	}

	/**
	 * @param newParPos
	 * @param layoutObject
	 */
	private void layoutChild(LayoutData layoutData, ILayoutObject childObject) {
		layoutService.addObjectToPage(layoutData, childObject, false);
		childObject.getLayoutFigure().updateAnchorPosition();
	}

	/**
	 * @param layoutObject
	 * @param layoutData
	 */
	private void layoutChildren(LayoutData layoutData) {
		try {

			Iterator<ILayoutObject> it = layoutData.getLayoutObject().iterator();
			layoutData.layoutResult = null;
			while (it.hasNext()) {
				ILayoutObject child = it.next();
				child.setPage(layoutData.page);
				if (child.getLayoutFigure() != null) {
					layoutChild(layoutData, child);
				}
			}

			if (layoutData.layoutResult != null && layoutData.layoutResult.getX() != Integer.MAX_VALUE) {
				layoutService.changeLayoutBounds(layoutData, layoutData.layoutResult.getX(), null);
			}
			if (layoutData.layoutResult != null && layoutData.layoutResult.getY() != Integer.MAX_VALUE) {
				layoutService.changeLayoutBounds(layoutData, null, layoutData.layoutResult.getY());
			}

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	/**
	 * @param newParPos
	 * @param layoutObject
	 */
	public boolean layoutRootObject(LayoutData layoutData) {

		if (layoutData.page == null) {
			return false;
		}

		ILayoutObject layoutObject = layoutData.getLayoutObject();
		ILayoutFigure layoutFigure = layoutObject.getLayoutFigure();

		ILayoutAnchor vAnchor = layoutObject.getVAnchor();
		ILayoutAnchor hAnchor = layoutObject.getHAnchor();

		boolean continueLayout = false;

		layoutData.layoutResult = getAnchorPosition(layoutData, hAnchor, vAnchor);

		// ---------- v anchor at page -----------------------------------------

		layoutService.changeLayoutBounds(layoutData, layoutData.layoutResult.getX(), layoutData.layoutResult.getY());

		// ---------- layout at page ---------------------------------------

		ILayoutAnchor vAncor = layoutObject.getVAnchor();

		// ---------- position relative to page ----------------------------

		if (vAncor.equals(ILayoutAnchor.PAGE) || vAncor.equals(ILayoutAnchor.TOP_MARGIN)) {
			layoutData.layoutResult.distance(layoutObject.getLeftMargin(), 0);
			layoutData.layoutResult.distance(0, layoutObject.getTopMargin());
			final double x = layoutData.layoutResult.getX();
			final double y = layoutData.layoutResult.getY();
			layoutFigure.setLocation(x, y);
			layoutService.addObjectToPage(layoutData, layoutObject, false);
		}

		// ---------- normal continuous layout ---------------------------------

		else {
			layoutService.addObjectToPage(layoutData, layoutObject, false);
			continueLayout = layoutFigure.setLocation(layoutData.getX(), layoutData.getY());
			return continueLayout;
		}

		return continueLayout;
	}

	private void layoutTable(LayoutData layoutData) {
		// TODO: funktioniert nicht
		// if (o instanceof JOTable) {
		// ILayoutObject prev = o.getPreviousRootObject();
		// if (prev != null) {
		// prev = prev.getPreviousRootObject();
		// }
		// if (layoutData.layoutBounds != null && prev != null) {
		// layoutData.layoutBounds =
		// JOUtil2.setX(layoutData.layoutBounds,
		// prev.getLayoutBounds().getMinX());
		// }
		// }
	}

	/**
	 * @param layoutData
	 */
	private void updateSection(LayoutData layoutData) {
		if (layoutData.getLayoutObject() instanceof JOParagraph) {
			JOParagraph paragraph = (JOParagraph) layoutData.getLayoutObject();
			if (paragraph.getSection() != null) {
				if (paragraph.getSection() != layoutData.actualSection) {
					layoutData.actualSection = paragraph.getSection();
					layoutData.page.setSection(paragraph.getSection());
					if (((JOSection) paragraph.getSection()).getHeaders() != null) {
						layoutData.headers = ((JOSection) paragraph.getSection()).getHeaders();
					}
					if (((JOSection) paragraph.getSection()).getFooters() != null) {
						layoutData.footers = ((JOSection) paragraph.getSection()).getFooters();
					}
					layoutData.actualSection = paragraph.getSection();
				}
			}
		}

	}

	/**
	 * @param updatePages
	 */
	IPage addWordPage(IPage newPageFigure0, int index, boolean forceEven, boolean forceOdd, final LayoutData layoutData,
			boolean layout, boolean overflowPage) {

		JOPageFigure newPageFigure = (JOPageFigure) newPageFigure0;
		boolean isNextPageEven;

		if (index == -1) {
			isNextPageEven = (layoutData.editor.getPageCount() + 1) % 2 == 0;
		} else {
			isNextPageEven = index + 1 % 2 == 0;
		}

		if (forceEven && !isNextPageEven || forceOdd && isNextPageEven) {
			JOEmptyPageFigure emptyPage = new JOEmptyPageFigure(layoutData.editor);
			layoutService.addPage(emptyPage, index, false, false, layoutData, layout, false);
			if (index != -1) {
				index++;
			}

			emptyPage.updateDescription();
		}

		if (newPageFigure == null) {
			newPageFigure = new JOPageFigure(layoutData.editor);
			newPageFigure.setEnableShadow(false);
			newPageFigure.setOverflowPage(overflowPage);
		}

		// ---------- update pages vector --------------------------------------

		if (index == -1) {
			layoutData.editor.addPage(newPageFigure);

		} else {
			if (newPageFigure0 != null) {
				layoutData.editor.addPage(newPageFigure);
			} else {
				return layoutData.editor.getPage(index);
			}
		}

		// System. out.("*** add page " + newPageFigure.getPageNumber());
		// //$NON-NLS-1$

		LayoutData ld = layoutData; // new LayoutData();

		// ---------- add the page figure --------------------------------------

		if (RcplConfig.pageDistance > 0) {
			// JOBetweenPagesFigure f = new JOBetweenPagesFigure(this);
			// betweenPages.add(f);
			// add(f);
		}

		newPageFigure.setForceEvenPage(forceEven);
		newPageFigure.setForceOddPage(forceOdd);
		int pageNumber = newPageFigure.getPageNumber();

		int dist = RcplConfig.pageDistance;
		double[] startX = { 0.0 };
		double[] startY = { 0.0 };

		if (pageNumber > 1) {
			IPage prev = ld.editor.getPage(pageNumber - 2);
			startX[0] = prev.getX2();
			startY[0] = prev.getY2();

		}
		layoutService.layoutPage(newPageFigure, pageNumber, startX, startY, dist);

		newPageFigure.setSection(layoutData.actualSection);

		JOSection section = newPageFigure.getSection();

		isNextPageEven = newPageFigure.isEven();
		boolean firstPage = pageNumber == 1;

		if (section != null) {

			addHeader(ld, section, firstPage, isNextPageEven, newPageFigure);

			// --------- add the footers ---------------------------------------

			addFooter(ld, section, firstPage, isNextPageEven, newPageFigure);

		}

		return newPageFigure;
	}

	private void addFooter(LayoutData ld, JOSection section, boolean firstPage, boolean isNextPageEven,
			IPage newPageFigure) {
		List<IFooter> footers = section.getFooters();
		if (footers == null || footers.size() == 0) {
			return;
		}

		boolean onlyOnFirstPage = false;
		int yFooter = 0;
		for (IFooter joFooter0 : footers) {

			JOFooter joFooter = (JOFooter) joFooter0;
			boolean even2 = joFooter.isEven();
			boolean odd2 = joFooter.isOdd();

			if (joFooter.isOnFirstPage()) {
				if (!firstPage) {
					onlyOnFirstPage = true;
					continue;
				}
			} else {
				if (onlyOnFirstPage && firstPage) {
					even2 = false;
					odd2 = false;
				}
			}

			if ((even2 && isNextPageEven) || (odd2 && !isNextPageEven) || (joFooter.isOnFirstPage() && firstPage)) {
				double x = section.getLeftMargin();

				for (ILayoutObject l : joFooter.getLayoutObjects()) {
					// ---------- create to produce one instance per page
					ILayoutFigure figure = l.createLayoutFigure();
					figure.setInFooter(true);
					addFigureToPage(newPageFigure, figure);
					double height = l.getHeightPixel();
					yFooter += height;
				}
				double footerMargin = 0;
				if (section.getFooterMargin() != null) {
					footerMargin = section.getFooterMargin().toPixel();
				}

				double y = newPageFigure.getHeight() - yFooter - footerMargin;

				double w = section.getWidthPixel() - section.getLeftMargin() - section.getRightMargin();

				for (ILayoutObject l : joFooter.getLayoutObjects()) {
					ILayoutFigure figure = l.getLayoutFigure();
					figure.setLocation(x, y);
					ld.setX(figure.getX2());
					ld.setY(figure.getY2());
					l.setWidthPixel(w);
					y += figure.getHeight();
					figure.setStyle("-fx-background-color: green;");

					ld.footers = section.getFooters();
					ld.headers = section.getHeaders();
					ld.firstPageAfterPageBreakAfter = null;
					ld.actualSection = ld.actualSection;
					ld.page = newPageFigure;

					Iterator<ILayoutObject> it = l.iterator();
					while (it.hasNext()) {
						ILayoutObject child = it.next();
						child.setPage(newPageFigure);
						ld.page = newPageFigure;
						layoutChild(ld, child);
					}

				}

			}
		}

		if (onlyOnFirstPage) {
			section.setHeaderHeightFirstPagePixel(yFooter);
		} else if (isNextPageEven) {
			section.setHeaderHeightEvenPixel(yFooter);
		} else if (!isNextPageEven) {
			section.setHeaderHeightOddPagePixel(yFooter);
		}
	}

	private void addFigureToPage(final IPage page, final ILayoutFigure figure) {
		page.add(figure);
	}

	private void addHeader(LayoutData ld, JOSection section, boolean firstPage, boolean isNextPageEven,
			IPage newPageFigure) {
		boolean onlyOnFirstPage = false;

		ld.headers = section.getHeaders();

		if (ld.headers != null && ld.headers.size() > 0) {
			int y = 0;
			for (IHeader joHeader : ld.headers) {
				if (((JOHeader) joHeader).isOnFirstPage()) {
					onlyOnFirstPage = true;
				}
			}
			for (IHeader joHeader0 : ld.headers) {

				JOHeader joHeader = (JOHeader) joHeader0;
				boolean even2 = joHeader.isEven();
				boolean odd2 = joHeader.isOdd();

				if (joHeader.isOnFirstPage()) {
					if (!firstPage) {
						continue;
					}
				} else {
					if (onlyOnFirstPage && firstPage) {
						even2 = false;
						odd2 = false;
					}
				}

				if ((even2 && isNextPageEven) || (odd2 && !isNextPageEven) || (joHeader.isOnFirstPage() && firstPage)) {
					double x = section.getLeftMargin();
					for (ILayoutObject l : joHeader.getLayoutObjects()) {
						ILayoutFigure figure = l.createLayoutFigure();
						figure.setInHeader(true);
						addFigureToPage(newPageFigure, figure);
						double headerMargin = 0;
						if (section.getHeaderMargin() != null) {
							headerMargin = section.getHeaderMargin().toPixel();
							// x = section.getFirstLineIndentPixel();
						}
						double y2 = y + headerMargin;
						figure.setLocation(x, y2);

						ld.setX(section.getLeftMargin());
						ld.setY(figure.getY2());
						double w = section.getWidthPixel();
						w -= section.getLeftMargin();
						w -= section.getRightMargin();
						l.setWidthPixel(w);

						ld.footers = section.getFooters();
						ld.firstPageAfterPageBreakAfter = null;
						ld.page = newPageFigure;

						Iterator<ILayoutObject> it = l.iterator();
						while (it.hasNext()) {
							ILayoutObject child = it.next();
							child.setPage(newPageFigure);
							ld.page = newPageFigure;
							layoutChild(ld, child);
						}
						y += l.getSpacingBeforePixel();
						y += l.getHeightPixel();
						y += l.getSpacingAfterPixel();
					}
				}
			}
			if (onlyOnFirstPage) {
				section.setHeaderHeightFirstPagePixel(y);
			} else if (isNextPageEven) {
				section.setHeaderHeightEvenPixel(y);
			} else if (!isNextPageEven) {
				section.setHeaderHeightOddPagePixel(y);
			}
		}

	}

}
