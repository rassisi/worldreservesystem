package com.joffice.rcpl.plugin.office.internal.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.rcpl.DelayedExecution;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.ISection;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.JOLayoutFigureBoundsChangedListener;
import org.eclipse.rcpl.LayoutData;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXShapeFigure;
import com.joffice.rcpl.plugin.office.internal.figures.JOEmptyPageFigure;
import com.joffice.rcpl.plugin.office.internal.figures.JOPageFigure;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOPresentationDocument;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOShape;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlideLayoutPart;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlideMasterPart;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlidePart;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSection;
import com.joffice.rcpl.plugin.office.internal.model.word.JOTable;

import javafx.geometry.Rectangle2D;

/**
 * @author eclipse
 * 
 */
public class JOLayoutService extends JOAbstractOfficeService implements JOLayoutFigureBoundsChangedListener {

	private JOLayoutServiceProviderWord wordLayout;

	public LayoutData ld;

	/**
	 * 
	 */
	public JOLayoutService() {
		this.wordLayout = new JOLayoutServiceProviderWord(this);
		ld = new LayoutData();
	}

	/**
	 * @param layoutObject
	 */
	void addObjectToPage(final LayoutData layoutData, ILayoutObject layoutObject, boolean overflowPart) {
		try {
			if (layoutObject == null) {
				layoutObject = layoutData.getLayoutObject();
			}
			final IPage oldPage = layoutObject.getPage();
			layoutObject.setPage(layoutData.page);
			layoutData.page.setEnableShadow(false);
			final ILayoutObject lo = layoutObject;
			layoutData.page.add(lo.getLayoutFigure());
			layoutObject.getLayoutFigure().setPage(layoutData.page);

			if (oldPage != null && oldPage != layoutData.page) {
				if (((JOPageFigure) oldPage).getLayoutFigures().contains(lo.getLayoutFigure())) {
					oldPage.remove(lo.getLayoutFigure());
				}
				if (((JOPageFigure) lo.getPage()).getLayoutFigures().isEmpty()) {
					getEditor().removePage(oldPage);
				}
			}

		} catch (

		Exception ex)

		{
			RCPLModel.logError(ex);
		}
		layoutData.page.setEnableShadow(false);

	}

	/**
	 * @param newPageFigure
	 * @param index
	 * @param forceEven
	 * @param forceOdd
	 * @param layoutData
	 * @return
	 */
	public IPage addPage(IPage newPageFigure, int index, boolean forceEven, boolean forceOdd, LayoutData layoutData,
			boolean layout, boolean overflowPage) {

		IPage p = null;
		switch (getEditor().getDocument().getDocumentType()) {
		case OOXML_WORDPROCESSING:
			p = wordLayout.addWordPage(newPageFigure, index, forceEven, forceOdd, layoutData, layout, overflowPage);
			return p;
		case OOXML_PRESENTATION:
			p = addPresentationPage(newPageFigure, index, layout);
		case BROWSER:
			break;
		case INFOTAB:
			break;
		case OOXML_SPREADSHEET:
			break;
		default:
			break;
		}

		if (getEditor().getDocument().isLayouted()) {
			int index2 = p.getPageNumber() - 1;
			for (ILayoutObject lo : getEditor().getDocument().getRootObjects()) {
				if (lo.getPage().getPageNumber() - 1 > index2) {
					lo.getLayoutFigure().updateRootLocation();
				}
			}
		}

		return p;
	}

	private IPage addPresentationPage(IPage newPageFigure, int index, boolean layout) {

		if (newPageFigure == null) {
			newPageFigure = new JOPageFigure(getEditor());
		}

		// ---------- update pages vector --------------------------------------

		if (index == -1) {
			getEditor().addPage(newPageFigure);
		} else {
			// getEditor().addPage(newPageFigure, index);
		}

		// System. out.("*** add page " + newPageFigure.getPageNumber());
		// //$NON-NLS-1$

		// ---------- add the page figure --------------------------------------

		// getEditor().addPage(newPageFigure);

		if (layout) {
			layoutPages();
		}

		return newPageFigure;
	}

	@Override
	public void boundsChanged(Rectangle2D newBounds) {
	}

	/**
	 * @param lastParBounds
	 * @param pageBounds
	 * @param newParBounds
	 * @param document
	 * @return
	 */
	boolean breakToNextColumn(LayoutData layoutData) {

		ILayoutObject lo = layoutData.getLayoutObject();
		ILayoutFigure lf = lo.getLayoutFigure();
		layoutData.page.setColumnX(layoutData.getX() + lo.getWidthPixel() + lo.getSection().getColumnSpace());
		double maxX = layoutData.page.getX2() + layoutData.page.getWidth() - layoutData.page.getMarginRight()
				- lo.getWidthPixel();
		if (layoutData.page.getColumnX() > maxX) {
			layoutData.page.setColumnX(layoutData.page.getX2() + layoutData.page.getMarginLeft());
			breakToNextPage(layoutData, true);
			return false;
		}
		layoutData.setX(layoutData.getX() + lo.getWidthPixel() + lo.getSection().getColumnSpace());
		double topMargin = ((JOPageFigure) layoutData.page).getHeaderMargin();
		// if (layoutObject.getSection().getTopMargin() != null) {
		// topMargin = layoutObject.getSection().getTopMargin().toPixel();
		// }

		double spacing = getSpacingBeforeWhenBreakOccured(layoutData, layoutData.getX());

		double newX = layoutData.getX();
		double newY = layoutData.page.getY2() + topMargin + spacing;
		changeLayoutBounds(layoutData, newX, newY);

		addObjectToPage(layoutData, lo, false);
		lf.setLocation(layoutData.getX(), layoutData.getY());

		return true;
	}

	double getSpacingBeforeWhenBreakOccured(LayoutData layoutData, double x) {
		if (!isRootParagraph(layoutData)) {
			return 0;
		}

		if (isRootParagraph(layoutData)) {
			ILayoutObject prevL = layoutData.getLayoutObject().getPreviousRootObject();
			if (prevL instanceof IParagraph) {
				IParagraph prev = (IParagraph) prevL;
				if (prev.getLayoutFigure().getOverflowExcess() > 0) {
					return prev.getSpacingAfterPixel() + prev.getLayoutFigure().getOverflowExcess()
							+ layoutData.getLayoutObject().getSpacingBeforePixel();
				}
			}
		}
		return 0;
	}

	boolean isRootParagraph(LayoutData lo) {
		return lo.getLayoutObject() instanceof IParagraph && lo.getLayoutObject().isRootObject();
	}

	/**
	 * @param layoutObject
	 * @return
	 */
	double calculateAfterSpace(ILayoutObject layoutObject) {

		double spaceAfter = 0;

		double h = layoutObject.getHeightPixel();

		if (layoutObject instanceof IParagraph) {
			IStyle style = ((IParagraph) layoutObject).getStyle();
			if (style.getSpacingLine() != null) {
				double lineSpacing = (Double) style.getSpacingLine().get() - 1.0;
				lineSpacing *= h;
				spaceAfter += lineSpacing;
			}
		}

		spaceAfter = layoutObject.getSpacingAfterPixel();

		if (layoutObject instanceof JOTable) {
			spaceAfter += 2;
			if (h == 0) {
				JOTable t = (JOTable) layoutObject;
				t.getLayoutFigure().setWidth(t.getTableWidth());
				t.getLayoutFigure().setHeight(t.getTotalHeight());
			}
		}

		spaceAfter += h;

		spaceAfter += layoutObject.getTopMargin();
		return spaceAfter;
	}

	/**
	 * @param layoutBounds
	 * @param x
	 * @param y
	 */
	boolean changeLayoutBounds(LayoutData ld, Double x, Double y) {

		boolean changed = false;
		if (x != null && x != Integer.MAX_VALUE) {
			if (ld.getX() != x) {
				changed = true;
				ld.setX(x);
			}
		}
		if (y != null && y != Integer.MAX_VALUE) {
			if (ld.getY() != y) {
				changed = true;
				ld.setY(y);

			}
		}
		return changed;
	}

	/**
	 * @param o1
	 * @param o2
	 * @return
	 */
	private int compareZOrder(ILayoutObject o1, ILayoutObject o2) {
		if (o1.isBehindDoc()) {
			return -1;
		}
		if (o2.isBehindDoc()) {
			return 1;
		}
		double z1 = o1.getZOrder();
		double z2 = o2.getZOrder();
		if (z1 > z2) {
			return 1;
		} else if (z1 < z2) {
			return -1;
		} else {
			return 0;
		}
	}

	public List<IPage> createMasterPresentationPages(IEditor editorFigure) {
		for (; getEditor().getPageCount() > 0;) {
			IPage page = getEditor().getPage(0);
			getEditor().removePage(page);
			page.dispose();
		}
		List<JOSlideMasterPart> slideMasters = ((JOPresentationDocument) editorFigure.getDocument()).getSlideMasters();
		LayoutData layoutData = new LayoutData();

		List<IPage> pages = new ArrayList<IPage>();

		for (JOSlideMasterPart joSlideMaster : slideMasters) {
			JOPageFigure pageMaster = (JOPageFigure) addPage(null, -1, false, false, layoutData, false, false);
			pageMaster.setSlideMaster(joSlideMaster);
			for (JOObject l : joSlideMaster.getLayoutObjects()) {
				l.setPage(pageMaster);
				layoutPresentationShapes(l, pageMaster, false);
			}
			List<JOSlideLayoutPart> slideLayouts = joSlideMaster.getSlideLayouts();
			pages.add(pageMaster);
			for (JOSlideLayoutPart joSlideLayout : slideLayouts) {
				JOPageFigure page = (JOPageFigure) addPage(null, -1, false, false, layoutData, true, false);
				page.setSlideLayout(joSlideLayout);
				for (JOObject l : joSlideLayout.getLayoutObjects()) {
					layoutPresentationShapes(l, page, false);
				}

				// page.createFigureImage();
				pages.add(page);
			}
			// pageMaster.createFigureImage();
		}
		return pages;
	}

	@Override
	public Object doExecute(ICommand command) throws Exception {

		switch (command.getCommandId()) {
		case layout:
			layout();
			return true;
		case layoutPages:
			layoutPages();
			return true;
		default:
			break;
		}
		return false;
	}

	public JOLayoutServiceProviderWord getWordLayout() {
		return wordLayout;
	}

	public List<ILayoutFigure> getZOrderedFigureList(List<ILayoutFigure> layoutObjects) {

		List<ILayoutFigure> sortedList = new ArrayList<ILayoutFigure>();
		sortedList.addAll(layoutObjects);

		Collections.sort(sortedList, new Comparator<ILayoutFigure>() {
			@Override
			public int compare(ILayoutFigure o1, ILayoutFigure o2) {
				return JOLayoutService.this.compareZOrder(o1.getLayoutObject(), o2.getLayoutObject());
			}
		});

		return sortedList;
	}

	/**
	 * @param layoutObjects
	 */
	public List<ILayoutObject> getZOrderedList(List<ILayoutObject> layoutObjects) {

		List<ILayoutObject> sortedList = new ArrayList<ILayoutObject>();
		sortedList.addAll(layoutObjects);
		Collections.sort(sortedList, new Comparator<ILayoutObject>() {
			@Override
			public int compare(ILayoutObject o1, ILayoutObject o2) {
				return JOLayoutService.this.compareZOrder(o1, o2);
			}
		});

		return sortedList;
	}

	boolean inLayout;

	/**
	 * @param editor
	 * @param numberOfLayouts
	 * @param startLayoutObject
	 * @return
	 */
	public void layout() {

		if (getEditor() == null) {
			return;
		}
		if (getEditor().getDocument() == null) {
			return;
		}

		try {
			switch (getEditor().getDocument().getDocumentType()) {
			case OOXML_WORDPROCESSING:
				wordLayout.layout(ld);
				break;
			case BROWSER:
				break;
			case OOXML_PRESENTATION:
				layoutPresentation();
				break;
			case OOXML_SPREADSHEET:
				break;
			case INFOTAB:
				break;
			default:
				break;
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		getEditor().updateCanvasSize();

		inLayout = false;
	}

	/**
	 * @param editor
	 * @param page
	 * @param pageNumber
	 * @param startX
	 * @param startY
	 * @param dist
	 */
	public void layoutPage(IPage page, int pageNumber, double[] startX, double[] startY, double dist) {
		switch (getEditor().getDocument().getDocumentType()) {
		case OOXML_WORDPROCESSING:
			layoutWordPage(page, pageNumber, startX, startY, dist);
			break;
		case OOXML_PRESENTATION:
			layoutPresentationPage(page, pageNumber, startX, startY, dist);
			break;
		default:
			break;
		}
	}

	/**
	 * 
	 */
	public void layoutPages() {
		double[] startX = new double[] { 0 };
		double[] startY = new double[] { 0 };
		int dist = RcplConfig.pageDistance;
		int pageCount = getEditor().getPageCount();
		if (pageCount == 0) {
			return;
		}
		for (int pageNumber = 1; pageNumber <= pageCount; pageNumber++) {
			JOPageFigure page = (JOPageFigure) getEditor().getPage(pageNumber - 1);
			layoutPage(page, pageNumber, startX, startY, dist);
		}
		if (getEditor().getDocument().isLayouted()) {
			new DelayedExecution(10) {

				@Override
				protected void execute() {
					getEditor().updatePageVisibility();
					getEditor().updateDocumentInfo();
				}
			};
		}
	}

	/**
	 * @param editor
	 * @param numberOfLayouts
	 * @param startLayoutObject
	 * @return
	 */
	private List<IPage> layoutPresentation() {
		// for (; getEditor().getPageCount() > 0;) {
		// getEditor().removePage(0);
		// }
		JOPresentationDocument document = (JOPresentationDocument) getEditor().getDocument();
		LayoutData layoutData = new LayoutData();
		List<IPage> pages;

		// IToolGroup group = null;

		// List<IToolComponent> toolFs = JOUtil2
		// .findEditorToolComponents("actions/editor/select_slide");
		// //$NON-NLS-1$
		// if (toolFs != null && toolFs.size() > 0) {
		// // ((JOToolComponentPageViewFigure)
		// IToolComponent f = toolFs.get(0);
		// ITool tool = f.getTool();
		// group = tool.getGroup();
		// }

		// ---------- slide master view ----------------------------------------

		if (getEditor().isSlideMasterView()) {
			pages = createMasterPresentationPages(getEditor());
		}

		// ---------- normal presentation view -----------------------------

		else {
			pages = new ArrayList<IPage>();
			int n = document.getNumberOfSlides();
			int index = 0;
			while (getEditor().getPageCount() < n) {
				JOPageFigure page = (JOPageFigure) addPage(null, -1, false, false, layoutData, true, false);
				JOSlidePart slide = document.getSlide(index);
				page.setSlide(slide);

				// ---------- add the object from the slide layout to the page -

				JOSlideLayoutPart slideLayout = slide.getSlideLayout();
				if (slideLayout != null) {
					for (JOObject l : slideLayout.getLayoutObjects()) {
						layoutPresentationShapes(l, page, true);
					}
				}
				for (JOObject l : slide.getLayoutObjects()) {
					layoutPresentationShapes(l, page, false);
				}
				index++;
				pages.add(page);
			}
		}
		getEditor().setPages(pages);

		layoutPages();
		return pages;
	}

	private void layoutPresentationPage(IPage page, int pageNumber, double[] startX, double[] startY, double dist) {

		JOPresentationDocument document = (JOPresentationDocument) getEditor().getDocument();

		double w = document.getPageSize().get().getWidth().toPixel();
		double h = document.getPageSize().get().getHeight().toPixel();

		startX[0] = 0;

		int indent = 0;

		if (((JOPageFigure) page).getSlideLayout() != null) {
			indent = 50;
		}
		page.setLocation(startX[0] + indent, startY[0]);
		page.setWidth(w);
		page.setHeight(h);

		// if (dist > 0 && !getEditor().getBetweenPages().isEmpty()) {
		// // int index = getEditor().getPageIndex(page);
		// // JOBetweenPagesFigure f = getEditor().getBetweenPages().get(
		// // index);
		// // f.setBounds(startX[0], startY[0]
		// // + document.getPageSize().get().getHeight().toPixel(),
		// // document.getPageSize().get().getWidth().toPixel(), dist);
		// }

		if (page.getPageNumber() > 1) {

			// document.getPageSize().get().getWidth().toPixel()
			// + dist
			startY[0] += h + 50;
		}

	}

	/**
	 * @param l
	 * @param page
	 */
	private void layoutPresentationShapes(JOObject l, JOPageFigure page, boolean clone) {

		try {
			l.setPage(page);
			ILayoutFigure f;

			if (clone) {
				f = l.createLayoutFigure();
				f.setCloned(true);
			} else {
				f = l.getLayoutFigure();

			}
			if (f instanceof JOFXShapeFigure) {
				page.add(f);
				f.setPage(page);

				JOShape shape = (JOShape) l;
				if (shape.getPosition() != null && shape.getSize() != null) {

					f.setLocation(page.getX2() + shape.getPosition().getXPixel(),
							(page.getY2() + shape.getPosition().getYPixel()));
					f.setWidth(shape.getSize().getWidthPixel());
					f.setHeight(shape.getSize().getHeightPixel());

				}
			}

			Iterator<ILayoutObject> it = l.iterator();
			while (it.hasNext()) {
				JOObject l2 = (JOObject) it.next();
				layoutPresentationShapes(l2, page, clone);
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

	}

	/**
	 * @param editor
	 * @param page
	 * @param pageNumber
	 * @param startX
	 * @param startY
	 * @param dist
	 */
	public void layoutWordPage(final IPage page, int pageNumber, double[] startX, double[] startY, double dist) {
		int additionalHorizontalPages = (page.getPageNumber()) % getEditor().getPageColumns();

		// dist *= getEditor().getZoom();

		final ISection section = page.getSection();

		if (additionalHorizontalPages > 0) {
			//
		} else {
			if (getEditor().getPageColumns() == 1 || !(getEditor().getPageCount() == 2 && page.getPageNumber() == 2)) {
				if (getEditor().getPageColumns() == 1 && page.getPageNumber() > 1
						|| getEditor().getPageColumns() > 1 && page.getPageNumber() > 1) {
					startY[0] += section.getPageHeight() + dist;
				}
			} else {
				if (getEditor().getPageColumns() > 1) {
					additionalHorizontalPages = 1;
				}
			}
		}

		if (pageNumber == 1) {
			additionalHorizontalPages = 0;
		}
		startX[0] = additionalHorizontalPages * (section.getPageWidth());

		final double x = startX[0];
		final double y = startY[0];

		page.setLocation(x, y);
		page.setWidth(section.getPageWidth());
		page.setHeight(section.getPageHeight());

	}

	/**
	 * @param layoutData
	 */
	void positionToTopOfPage(LayoutData layoutData) {
		double leftMargin = layoutData.getLayoutObject().getSection().getLeftMargin();
		double topMargin = 0;
		if (layoutData.getLayoutObject().getSection().getBottomMargin() > 0) {
			topMargin = ((JOPageFigure) layoutData.page).getHeaderMargin(); // layoutObject.getSection().getTopMargin().toPixel();
		}
		changeLayoutBounds(layoutData, layoutData.page.getX2() + leftMargin, layoutData.page.getY2() + topMargin);

	}

	/**
	 * @param layoutData
	 */
	void breakToNextPage(LayoutData layoutData, boolean before) {

		ILayoutObject lo = layoutData.getLayoutObject();
		ILayoutFigure lf = lo.getLayoutFigure();

		// TODO: keine seitenumbruch, wenn seite noch leer ist.
		// später muss noch overflow objects implementiert werden.

		IPage page = layoutData.page;

		if (page.isEmpty()) {
			return;
		}

		boolean forceEvenPage = false;
		boolean forceOddPage = false;

		JOParagraph par = null;

		if (lo instanceof JOParagraph) {
			par = (JOParagraph) lo;
			if (par.isStartNewSection()) {
				if (((JOSection) par.getSection()).getSectionType() != null) {
					if (par.getSection().isEven()) {
						forceEvenPage = true;
					} else if (par.getSection().isOdd()) {
						forceOddPage = true;
					} else if (par.getSection().isNextPage()) {
					}
				}
			}
		}

		// ---------- last page ------------------------------------------------

		if (getEditor().isLastPage(layoutData.page)) {
			layoutData.page = addPage(null, -1, forceEvenPage, forceOddPage, layoutData, true, false);
			layoutData.page.setDirty(true);

			// ---------- take the next existing page ----------------------

		} else {
			int index = getEditor().getPageIndex(layoutData.page);

			JOPageFigure nextPage = (JOPageFigure) getEditor().getPage(index + 1);
			if (nextPage instanceof JOEmptyPageFigure) {
				nextPage = (JOPageFigure) getEditor().getPage(index + 2);
			}

			if (nextPage != null) {
				layoutData.page = nextPage;
			} else {
				if (par != null && par.isPageBreakAfter()) {
					layoutData.page = addPage(null, index + 1, forceEvenPage, forceOddPage, layoutData, true, false);
				}
			}
			layoutData.page.setDirty(true);
		}

		double leftMargin = 0;
		leftMargin = lo.getSection().getLeftMargin();
		double topMargin = lo.getSection().getTopMargin();
		if (layoutData.getLayoutObject().getSection().getBottomMargin() > 0) {
			topMargin = ((JOPageFigure) layoutData.page).getHeaderMargin();
		}

		double spacing = 0;
		if (before) {
			spacing = getSpacingBeforeWhenBreakOccured(layoutData, leftMargin + layoutData.page.getX2());
			if (spacing > 0) {
				double spacingbefore = layoutData.getLayoutObject().getSpacingBeforePixel();
				double spacingAfter = layoutData.getLayoutObject().getPreviousRootParagraph().getSpacingAfterPixel();
				spacing += spacingbefore + spacingAfter;
			}
		}

		changeLayoutBounds(layoutData, layoutData.page.getX2() + leftMargin,
				layoutData.page.getY2() + topMargin + spacing);

		if (before) {
			lf.setPage(layoutData.page);
			lo.setPage(layoutData.page);
			addObjectToPage(layoutData, lo, false);
			lf.setLocation(layoutData.getX(), layoutData.getY());
		}

		new DelayedExecution(10) {

			@Override
			protected void execute() {
				layoutPages();
				getEditor().updatePageVisibility();
			}
		};
	}

	/**
	 * @param layoutBounds
	 * @param layoutObject
	 * @param lastLayoutObject
	 */
	protected void calculateSpaceBefore(LayoutData ld) {
		if (ld.page == null) {
			return;
		}

		try {

			ILayoutObject lo = ld.getLayoutObject();

			ILayoutObject prev = lo.getPreviousRootObject();
			if (prev != null && prev.isPageBreakAfter()) {
				return;
			}

			boolean doSpaceBefore = true;
			double pageTopMargin = ld.page.getX2() + ((JOPageFigure) ld.page).getMarginTop();
			if (ld.getY() == pageTopMargin) {
				doSpaceBefore = false;
			}

			if (doSpaceBefore) {
				ld.setY(ld.getY() + ld.getLayoutObject().getSpacingBeforePixel());
			}

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	// /**
	// * @param ld
	// * @param layoutFigure
	// * @return
	// */
	// boolean sameLocationOnPage(LayoutData ld) {
	// if (!getEditor().getDocument().isLayouted()) {
	// return false;
	// }
	// ILayoutObject lo = ld.getLayoutObject();
	// ILayoutFigure lf = lo.getLayoutFigure();
	//
	// if (lo.getPage() == null) {
	// return false;
	// }
	//
	// double oldX = lf.getPane().getLayoutX();
	// double oldY = lf.getPane().getLayoutY();
	// // if (oldX == -1 && oldY == -1) {
	// // return false;
	// // }
	//
	// double newX = ld.getX() - ld.page.getX2();
	// double newY = ld.getX() - ld.page.getX2();
	//
	// if (oldX != ld.getX()) {
	// return false;
	// }
	// if (oldY != ld.getY()) {
	// return false;
	// }
	//
	// return true;
	// }

	/**
	 * @param editor
	 * @param pageColumns
	 */
	public void setPageLayout(int pageColumns) {
		if (pageColumns != getEditor().getPageColumns()) {
			getEditor().setPageColumns(pageColumns);
			layoutPages();
		}
	}

}
