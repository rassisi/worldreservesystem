/******************************************************************************
 *    (c)Ramin Assisi, JOFFICE LTD, 2010
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal.figures;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IColorProperty;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.ISection;
import org.eclipse.rcpl.JOAction;
import org.eclipse.rcpl.LayoutData;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.fx.figures.JOFXAbstractFigure;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOPresentationDocument;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlideLayoutPart;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlideMasterPart;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOSlidePart;
import com.joffice.rcpl.plugin.office.internal.model.word.JOFooter;
import com.joffice.rcpl.plugin.office.internal.model.word.JOHeader;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSection;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author ramin
 * 
 */
public class JOPageFigure implements IPage {

	private JOSection section;

	private boolean dirty;

	private int actualTabEditPos;

	private IEditor editor;

	private boolean forceEvenPage;

	private boolean forceOddPage;

	private Group paragraphGroup;

	private Group footerHeaderGroup;

	private Node backgroundImage;

	private JOSlidePart slide;

	private JOSlideLayoutPart slideLayout;

	private JOSlideMasterPart slideMaster;

	private boolean printMode;

	private boolean overflowPage;

	private boolean enableShadow = true;

	private Group backgroundGroup;

	private Group outlineGroup;

	private Rectangle marginShape;

	private Group infoGroup;

	private Group behindTextGroup;

	private Group behindParagraphGroup;

	private Group linealGroup;

	private Group freeFlowtingGroup;

	private Rectangle background;

	private IColorProperty backgroundColor;

	private JOHLineal hLineal;

	private JOVLineal vLineal;

	private List<ILayoutFigure> layoutFigures = new ArrayList<ILayoutFigure>();

	private Pane pane;

	private double columnX = -1;

	int suppressCount = 0;

	private boolean sortHappend = false;

	private double width;

	private double height;

	private double x;

	private double y;

	/**
	 * @param editorFigure
	 * @param canvas
	 * @param style
	 * @param columns
	 * @param text
	 */
	public JOPageFigure(final IEditor editorFigure) {

		super();

		pane = new Pane();

		// wichtig!!!
		pane.setPickOnBounds(false);
		pane.setUserData(this);

		this.editor = editorFigure;
		this.backgroundImage = getBackgroundImage();

		infoGroup = new Group();

		linealGroup = new Group();
		hLineal = new JOHLineal(this);
		hLineal.setVisible(false);
		vLineal = new JOVLineal(this);
		vLineal.setVisible(false);
		linealGroup.getChildren().addAll(hLineal, vLineal);

		backgroundGroup = new Group();

		outlineGroup = new Group();

		marginShape = new Rectangle();
		marginShape.setStrokeWidth(1);
		marginShape.setStroke(Color.GRAY);
		marginShape.setFill(Color.TRANSPARENT);

		outlineGroup.getChildren().add(marginShape);
		outlineGroup.setVisible(false);
		footerHeaderGroup = new Group();
		behindTextGroup = new Group();
		paragraphGroup = new Group();
		behindParagraphGroup = new Group();
		freeFlowtingGroup = new Group();
		// freeFlowtingGroup.setCache(true);

		background = new Rectangle();
		background.setEffect(new DropShadow());

		backgroundGroup.getChildren().addAll(background);

		backgroundColor = editorFigure.getDocument().getBackground();

		IColor bgColor = null;

		if (backgroundColor != null) {
			bgColor = (IColor) backgroundColor.get();
		}

		if (bgColor != null) {

			Color bg = bgColor.getFx();
			background.setFill(bg);
		} else {
			background.setFill(Color.WHITE);
		}

		pane.getChildren().addAll(infoGroup, backgroundGroup, footerHeaderGroup, outlineGroup, behindParagraphGroup,
				paragraphGroup, freeFlowtingGroup, linealGroup);

		// infoGroup.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
		// backgroundGroup.addEventHandler(MouseEvent.MOUSE_CLICKED,
		// mouseHandler);
		// footerHeaderGroup.addEventHandler(MouseEvent.MOUSE_CLICKED,
		// mouseHandler);
		// outlineGroup.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
		// behindParagraphGroup.addEventHandler(MouseEvent.MOUSE_CLICKED,
		// mouseHandler);
		// paragraphGroup.addEventHandler(MouseEvent.MOUSE_CLICKED,
		// mouseHandler);
		// freeFlowtingGroup.addEventHandler(MouseEvent.MOUSE_CLICKED,
		// mouseHandler);
		// linealGroup.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
		// pane.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);

		Node dropTarget = background;

		dropTarget.setOnDragDropped(new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent event) {
				Dragboard dragBoard = event.getDragboard();

				String html1 = dragBoard.getHtml();

				String url1 = dragBoard.getUrl();

				Image image = dragBoard.getImage();
				if (image == null && url1 != null) {
					image = new Image(url1);
				}

				if (image != null) {
					String html = dragBoard.getHtml();
					String url = dragBoard.getUrl();
					List<File> files = dragBoard.getFiles();
					String rtf = dragBoard.getRtf();
					String string = dragBoard.getString();
					IParagraph par = editorFigure.getSelectedParagraph();
					ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.insertDrawing, par,
							null, files.get(0), image);
					Rcpl.service().execute(command);
					event.consume();
				}
			}
		});

		dropTarget.setOnDragDetected(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {

				Object o = event.getSource();
				if (o instanceof Node) {
					/* drag was detected, start a drag-and-drop gesture */
					/* allow any transfer mode */
					// Dragboard db = ((Node) o)
					// .startDragAndDrop(TransferMode.ANY);

					/* Put a string on a dragboard */
					// ClipboardContent content = new ClipboardContent();
					// content.putString(((Node)o).getText());
					// db.setContent(content);

				}
			}
		});

		dropTarget.setOnDragOver(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				// if (event.getGestureSource() != background)
				{
					event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
				}
			}
		});

		getNode().setTranslateX(RcplConfig.firstPageLocationX);
		getNode().setTranslateY(RcplConfig.firstPageLocationY);

		setVisible(false);
	}

	@Override
	public void add(ILayoutFigure figure) {

		if (figure.isInFooter() || figure.isInHeader()) {

			if (figure instanceof IParagraphFigure) {
				if (!footerHeaderGroup.getChildren().contains(figure.getFx())) {
					addNodeToParent(footerHeaderGroup, figure.getPane());
				}
			}
			return;
		}

		if (figure.isOverflowFigure()) {
			addOverflowFigure(figure);
			return;
		}

		if (figure.getLayoutObject().isRootObject()) {
			addRootObject(figure);
			return;
		}

		if (figure instanceof JOFXAbstractFigure) {
			addFreeFlowtingFigure(figure);
			return;
		}

		RCPLModel.logError(new Exception("JOPageFigure.add"));
	}

	private void addFreeFlowtingFigure(final ILayoutFigure figure) {

		figure.setPage(this);
		figure.setParentFigure(this);

		if (freeFlowtingGroup.getScene() == null) {
			doAddFreeFloatingFigure(figure);
			return;
		}

		new WaitThread(getEditor()) {

			@Override
			public void doRun() {
				doAddFreeFloatingFigure(figure);
			}
		};
	}

	private void addNodeToParent(final Group parent, final Node node) {
		if (parent.getScene() == null) {
			if (!parent.getChildren().contains(node)) {
				parent.getChildren().add(node);
			}
			return;
		}

		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				if (!parent.getChildren().contains(node)) {
					parent.getChildren().add(node);
				}
			}
		};
	}

	private void addOverflowFigure(final ILayoutFigure overflowParagraphFigure) {
		if (overflowParagraphFigure == null) {
			return;
		}
		final double x = overflowParagraphFigure.getColumnX();
		if (!paragraphGroup.getChildren().contains(overflowParagraphFigure.getPane())) {

			new WaitThread(getEditor()) {

				@Override
				public void doRun() {
					if (!paragraphGroup.getChildren().contains(overflowParagraphFigure.getPane())) {
						paragraphGroup.getChildren().add(overflowParagraphFigure.getPane());
						overflowParagraphFigure.setPage(JOPageFigure.this);
						overflowParagraphFigure.setParentFigure(JOPageFigure.this);
						updateOverflowParagraphLocation(overflowParagraphFigure, x);
					}
				}
			};
		} else {
			updateOverflowParagraphLocation(overflowParagraphFigure, x);
		}
	}

	private void addRootObject(final ILayoutFigure f) {

		if (layoutFigures.contains(f)) {
			return;
		}

		try {
			layoutFigures.add(f);
			if (!paragraphGroup.getChildren().contains(f.getNode())) {
				try {
					f.setParentFigure(this);
					f.setPage(this);
					addNodeToParent(paragraphGroup, f.getNode());
				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}

			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	// public int getBorderWidth() {
	// return borderWidth;
	// }
	//
	// public void setBorderWidth(int borderWidth) {
	// this.borderWidth = borderWidth;
	// }

	// /**
	// * @param lineNumber
	// * @param alignment
	// */
	// public void setLineAlignment(int lineNumber, int alignment) {
	// editorFigure.getStyledText().setLineAlignment(lineNumber, 1, alignment);
	// }

	// public void setLineAlignment(AlignmentType alignment) {
	// //
	// editorFigure.getStyledText().getStyledTextUtil().setLineAlignment(alignment);
	// }

	/**
	 * 
	 */
	public void clear() {
		layoutFigures.clear();
	}

	@Override
	public void clipFigure() {
	}

	@Override
	public void clipFigures() {
		for (ILayoutFigure f : getLayoutFigures()) {
			if (!f.getLayoutObject().isRootObject()) {
				f.clipFigure();
				f.setVisible(true);
			}
		}
	}

	public void decreaseIndent() {
		// editorFigure.getStyledText().getStyledTextUtil().decreaseIndent();
	}

	@Override
	public void detach() {
	}

	// private boolean isMouseBetweenPages(MouseEvent me) {
	// Rectangle r = getBounds();
	//
	// Rectangle r2 = new Rectangle(r.x, r.y + r.height - 5, r.x + r.width, 5);
	// Rectangle r3 = new Rectangle(r.x, r.y, r.x + r.width, 5);
	// if (r2.contains(new org.eclipse.draw2d.geometry.Point(me.x, me.y))) {
	// return true;
	// } else if (r3
	// .contains(new org.eclipse.draw2d.geometry.Point(me.x, me.y))) {
	// return true;
	// } else {
	// return false;
	// }
	// }

	@Override
	public void dispose() {
		List<ILayoutFigure> list = new ArrayList<ILayoutFigure>(layoutFigures);
		for (ILayoutFigure iLayoutFigure : list) {
			remove(iLayoutFigure);
		}

	}

	// /**
	// * @param headerFigure
	// */
	// public void setHeaderFigure(JOAbstractHeaderAndFooterFigure headerFigure)
	// {
	// if (headerFigure != null) {
	// if (this.headerFigure == null) {
	// this.headerFigure = new JOAbstractHeaderAndFooterFigure(editorFigure,
	// this, headerFigure.getHeaderAndFooter());
	// JORectangle r = getBounds();
	// this.headerFigure.setBounds(new JORectangle(r.x, r.y, r.width,
	// 100));
	// this.headerFigure.setPageFigure(this);
	// add(this.headerFigure);
	// }
	// }
	// }

	// /**
	// * @param footerFigure
	// */
	// public void setFooterFigure(JOAbstractHeaderAndFooterFigure footerFigure)
	// {
	// if (footerFigure != null) {
	// if (this.footerFigure == null) {
	// this.footerFigure = new JOAbstractHeaderAndFooterFigure(editorFigure,
	// this, footerFigure.getHeaderAndFooter());
	// JORectangle r = getBounds();
	// this.footerFigure.setBounds(new JORectangle(r.x, r.y + r.height
	// - 100, r.width, 100));
	// this.footerFigure.setPageFigure(this);
	// add(this.footerFigure);
	// }
	// }
	// }

	private void doAddFreeFloatingFigure(ILayoutFigure figure) {
		if (freeFlowtingGroup.getChildren().contains(figure.getNode())) {
			return;
		}
		layoutFigures.add(figure);
		double z1 = figure.getLayoutObject().getZOrder();
		for (Node n : freeFlowtingGroup.getChildren()) {

			Object o = n.getUserData();
			if (o instanceof ILayoutFigure) {
				ILayoutObject lo = ((ILayoutFigure) o).getLayoutObject();
				double z2 = lo.getZOrder();
				if (z1 < z2) {
					int index = freeFlowtingGroup.getChildren().indexOf(n);
					freeFlowtingGroup.getChildren().add(index, figure.getNode());
					figure.updateLocation();
					return;
				}
			}
		}

		figure.setVisible(true);

		freeFlowtingGroup.getChildren().add(figure.getNode());

		figure.setVisible(true);
		figure.updateLocation();

	}

	// private JOPageFigure findLeftPage() {
	// if (!editor.isTwoPageLayout() || isEven()) {
	// return null;
	// }
	// int index = getPageNumber() - 1;
	// if (index == 0) {
	// return null;
	// }
	// JOPageFigure page = (JOPageFigure) editor.getPage(index - 1);
	// return page;
	// }

	// private JOPageFigure findNorthPage() {
	// if (!editor.isTwoPageLayout()) {
	// return null;
	// }
	// int index = getPageNumber() - 1;
	// if (index <= 0) {
	// return null;
	// }
	// if (index == 1) {
	// return (JOPageFigure) editor.getPage(index - 1);
	// }
	// return (JOPageFigure) editor.getPage(index - 2);
	// }

	// private JOPageFigure findNorthWestPage() {
	// if (!editor.isTwoPageLayout()) {
	// return null;
	// }
	// int index = getPageNumber() - 1;
	// if (index < 2) {
	// return null;
	// }
	// if (index == 2) {
	// return (JOPageFigure) editor.getPage(0);
	// }
	// return (JOPageFigure) editor.getPage(index - 3);
	// }

	// private JOPageFigure findRightPage() {
	// if (!editor.isTwoPageLayout() || !isEven()) {
	// return null;
	// }
	// int index = getPageNumber() - 1;
	// if (index == editor.getPageCount()) {
	// return null;
	// }
	// JOPageFigure page = (JOPageFigure) editor.getPage(index + 1);
	// return page;
	// }
	//
	// private JOPageFigure findSouthPage() {
	// if (!editor.isTwoPageLayout()) {
	// return null;
	// }
	// int index = getPageNumber() - 1;
	// if (index >= editor.getPageCount()) {
	// return null;
	// }
	// if (index == 0) {
	// return (JOPageFigure) editor.getPage(index + 1);
	// }
	// return (JOPageFigure) editor.getPage(index + 2);
	// }

	public int getActualTabEditPos() {
		return actualTabEditPos;
	}

	public Rectangle getBackground2() {
		return background;
	}

	public Node getBackgroundImage() {
		if (editor == null) {
			// LOGGER.error("editorFigure==null");
			return null;
		}
		if (editor.getDocumentType() == null) {
			// LOGGER.error("editorFigure.getDocumentType()==null");
			return null;
		}

		try {
			if (backgroundImage == null) {
				switch (editor.getDocumentType()) {
				case OOXML_WORDPROCESSING:
					break;
				case OOXML_PRESENTATION:
					JOPresentationDocument doc = (JOPresentationDocument) editor.getDocument();
					if (slide != null) {
						if (slide.getBackGround() != null) {

							slide.getBackGround().get();
							if (slide.getBackGround().getImageResource() != null) {
								backgroundImage = slide.getBackGround().getImageResource().getNode();

							}
						} else if (slide.getSlideLayout() != null && slide.getSlideLayout().getBackGround() != null) {
							slide.getSlideLayout().getBackGround().get();
							if (slide.getSlideLayout().getBackGround().getImageResource() != null) {
								backgroundImage = slide.getSlideLayout().getBackGround().getImageResource().getNode();
							}
						} else if (slide.getSlideLayout() != null && slide.getSlideLayout().getSlideMaster() != null
								&& slide.getSlideLayout().getSlideMaster().getBackGround() != null) {
							slide.getSlideLayout().getSlideMaster().getBackGround().get();
							if (slide.getSlideLayout().getSlideMaster().getBackGround().getImageResource() != null) {
								backgroundImage = slide.getSlideLayout().getSlideMaster().getBackGround()
										.getImageResource().getNode();
							}
						}
					} else if (slideMaster != null && slideMaster.getBackGround().getImageResource() != null) {
						backgroundImage = doc.getMasterSlides().get(0).getBackGround().getImageResource().getNode();
					}
					break;
				case BROWSER:
					break;
				case CATEGORY_FORMULA:
					break;
				case CATEGORY_GRAPHIC:
					break;
				case CATEGORY_MASTER:
					break;
				case CATEGORY_PRESENTATION:
					break;
				case CATEGORY_SPREADSHEET:
					break;
				case CATEGORY_URL:
					break;
				case CATEGORY_WORDPROCESSING:
					break;
				case FOLDER:
					break;
				case INFOTAB:
					break;
				case MAIN_CATEGORY_BROWSER_BOOKMARKS:
					break;
				case MAIN_CATEGORY_BROWSER_FAVORITES:
					break;
				case MAIN_CATEGORY_BROWSER_HISTORY:
					break;
				case MAIN_CATEGORY_LINK:
					break;
				case MAIN_CATEGORY_OFFICE_DOCUMENT:
					break;
				case MAIN_CATEGORY_OFFICE_TEMPLATE_DOCUMENT:
					break;
				case MAIN_CATEGORY_RECENTLY_USED_DOCUMENT:
					break;
				case OOFORMULA:
					break;
				case OOGRAPHIC:
					break;
				case OOMASTER:
					break;
				case OOPRESENTATION:
					break;
				case OOSPREADSHEET:
					break;
				case OOTEXT:
					break;
				case OOXML_SPREADSHEET:
					break;
				case URL:
					break;
				default:
					break;
				}
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}

		return backgroundImage;

	}

	public Rectangle getClipping(ILayoutFigure figure) {

		double diffX = figure.getNode().getLayoutX();
		double diffY = figure.getNode().getLayoutY();

		double x = 0;
		double y = 0;

		double diffHeight = background.getHeight() - (figure.getNode().getLayoutY() + figure.getHeight());

		double diffWidth = background.getWidth() - (figure.getNode().getLayoutX() + figure.getWidth());

		double width = figure.getWidth();

		if (diffX < 0) {
			x -= diffX;
			width += diffX;
		}
		if (diffWidth < 0) {
			width += diffWidth;
		}

		double height = figure.getHeight();

		if (diffY < 0) {
			y -= diffY;
			height += diffY;

		}

		if (diffHeight < 0) {
			height += diffHeight;
		}

		return new Rectangle(x, y, width, height);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rcpl.ILayoutFigure#getColumnX()
	 */
	@Override
	public double getColumnX() {
		if (columnX < 0) {
			columnX = getX2() + getMarginLeft();
		}
		return columnX;
	}

	protected IEditor getEditor() {
		return editor;
	}

	/**
	 * @return
	 */
	@Override
	public Rectangle2D getEditRect() {

		double width = getWidth();
		double height = getHeight();
		try {
			double x = getX2() + getSection().getLeftMargin();
			double y = getY2() + getSection().getTopMargin();
			width -= (getSection().getLeftMargin() + getSection().getRightMargin());
			height -= (getSection().getTopMargin() + getSection().getBottomMargin());
			return new Rectangle2D(x, y, width, height);
		} catch (Exception ex) {
			return new Rectangle2D(getX2(), getY2(), width, height);
		}
	}

	@Override
	public double getEditWidth() {
		return getWidth() - getMarginLeft() - getMarginRight();
	}

	@Override
	public List<ILayoutFigure> getFigureChildren() {
		return null;
	}

	/**
	 * @return
	 */
	public double getFooterMarginMargin() {
		double h = getMarginBottom();
		if (section != null && section.getFooters() != null && section.getFooters().size() > 0) {
			// JORectangle r = getBounds().getCopy();
			JOFooter footer = (JOFooter) section.getFooters().get(0);
			if (footer != null) {
				double height = footer.getHeight().toPixel();
				double margin = getMarginBottom();
				h = Math.max(margin, height);
			} else {
				h = getMarginBottom();
			}
		}

		return h;
	}

	public Group getFreeFlowtingGroup() {
		return freeFlowtingGroup;
	}

	@Override
	public ILayoutFigure getFx() {
		return null;
	}

	/**
	 * @return
	 */
	@Override
	public double getHeaderMargin() {
		double h = getMarginTop();
		if (section != null && section.getHeaders() != null && section.getHeaders().size() > 0) {
			// JORectangle r = getBounds().getCopy();
			JOHeader header = (JOHeader) section.getHeaders().get(0);
			if (header != null) {
				if (header.getHeight() == null) {
					return getMarginTop();
				}
				double height = header.getHeight().toPixel();
				double margin = getMarginTop();
				h = Math.max(margin, height);
			} else {
				h = getMarginTop();
			}
		}

		return h;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public JOHLineal getHLineal() {
		return hLineal;
	}

	@Override
	public List<ILayoutFigure> getLayoutFigures() {
		return layoutFigures;
	}

	@Override
	public ILayoutObject getLayoutObject() {
		return null;
	}

	@Override
	public List<ILayoutObject> getLayoutObjects() {
		List<ILayoutFigure> chs = getLayoutFigures();
		List<ILayoutObject> chs2 = new ArrayList<ILayoutObject>();
		for (ILayoutFigure iLayoutFigure : chs) {
			chs2.add(iLayoutFigure.getLayoutObject());
		}
		return chs2;
	}

	/**
	 * @return the marginBottom
	 */
	@Override
	public double getMarginBottom() {
		return getSection().getBottomMargin();
	}

	/**
	 * @return the marginLeft
	 */
	@Override
	public double getMarginLeft() {
		return getSection().getLeftMargin();
	}

	/**
	 * @return the marginRight
	 */
	@Override
	public double getMarginRight() {
		return getSection().getRightMargin();
	}

	/**
	 * @return the marginTop
	 */
	@Override
	public double getMarginTop() {
		return getSection().getTopMarginPixel(getPageNumber());
	}

	@Override
	public Pane getNode() {
		return pane;
	}

	@Override
	public double getOverflowExcess() {
		return 0;
	}

	@Override
	public double getOverflowHeight(LayoutData layoutData) {
		return 0;
	}

	@Override
	public Point2D getOverflowLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage getPage() {
		return this;
	}

	@Override
	public int getPageNumber() {
		return editor.getPageIndex(this) + 1;
	}

	@Override
	public Pane getPane() {
		return pane;
	}

	@Override
	public Group getParagraphGroup() {
		return paragraphGroup;
	}

	@Override
	public ILayoutFigure getParentFigure() {
		return null;
	}

	@Override
	public double getRemaining() {
		return 0;
	}

	@Override
	public JOSection getSection() {
		if (section == null) {
			return (JOSection) editor.getDocument().getSection();
		}
		return section;
	}

	/**
	 * @return
	 */
	public JOSlidePart getSlide() {
		return slide;
	}

	public JOSlideLayoutPart getSlideLayout() {
		return slideLayout;
	}

	public JOSlideMasterPart getSlideMaster() {
		return slideMaster;
	}

	@Override
	public JOVLineal getVLineal() {
		return vLineal;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getX2() {
		return x;
	}

	@Override
	public double getY2() {
		return y;
	}

	public void increaseIndent() {
		// editorFigure.getStyledText().getStyledTextUtil().increaseIndent();
	}

	@Override
	public boolean isCloned() {
		return false;
	}

	public boolean isDirty() {
		return dirty;
	}

	@Override
	public boolean isEmpty() {
		boolean empty = layoutFigures.isEmpty();
		if (!empty) {

			for (ILayoutFigure f : layoutFigures) {

				int index = f.getLayoutObject().getRootIndex();

				if (index == -1) {
					continue;
				} else {
					return false;
				}

			}
			return true;
		}
		return empty;
	}

	public boolean isEnableShadow() {
		return enableShadow;
	}

	@Override
	public boolean isEven() {
		return (getPageNumber() % 2) == 0;
	}

	public boolean isForceEvenPage() {
		return forceEvenPage;
	}

	public boolean isForceOddPage() {
		return forceOddPage;
	}

	@Override
	public boolean isInFooter() {
		return false;
	}

	@Override
	public boolean isInHeader() {
		return false;
	}

	public boolean isLastPage() {
		return editor.getPageIndex(this) == editor.getPageCount() - 1;
	}

	@Override
	public boolean isOdd() {
		return !isEven();
	}

	@Override
	public boolean isOverflowFigure() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isOverflowPage() {
		return overflowPage;
	}

	public boolean isPrintMode() {
		return printMode;
	}

	/**
	 * @return
	 */
	public JOPageFigure nextPage() {
		int index = editor.getPageIndex(this);
		JOPageFigure nextPage = (JOPageFigure) editor.getPage(index + 1);
		return nextPage;
	}

	public JOPageFigure previousPage() {
		int index = editor.getPageIndex(this);
		JOPageFigure previousPage = (JOPageFigure) editor.getPage(index - 1);
		return previousPage;
	}

	/**
	 * 
	 */
	public void redo() {
		// editorFigure.getStyledText().redo();
	}

	@Override
	public void refresh() {
	}

	@Override
	public void refreshOutline() {
	}

	@Override
	public void remove(final ILayoutFigure f) {

		layoutFigures.remove(f);
		if (paragraphGroup.getScene() == null) {
			Node n = f.getNode();
			paragraphGroup.getChildren().remove(n);
			freeFlowtingGroup.getChildren().remove(n);
			return;
		}

		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				Node n = f.getNode();
				paragraphGroup.getChildren().remove(n);
				freeFlowtingGroup.getChildren().remove(n);
			}
		};
	}

	@Override
	public void repaint() {
	}

	public void setActualTabEditPos(int actualTabEditPos) {
		this.actualTabEditPos = actualTabEditPos;
	}

	@Override
	public void setCloned(boolean cloned) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rcpl.ILayoutFigure#setColumnX(double)
	 */
	@Override
	public void setColumnX(double x) {
		this.columnX = x;
	}

	@Override
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	@Override
	public void setEnableShadow(boolean enableShadow) {
		this.enableShadow = enableShadow;
	}

	@Override
	public void setFill(Color color) {
		background.setFill(color);
	}

	public void setForceEvenPage(boolean forceEvenPage) {
		this.forceEvenPage = forceEvenPage;
	}

	public void setForceOddPage(boolean forceOddPage) {
		this.forceOddPage = forceOddPage;
	}

	@Override
	public void setHeight(final double h) {
		this.height = h;
		ISection section = getSection();
		final double topMargin = section.getTopMargin();
		final double bottomMargin = section.getBottomMargin();
		final double mh = h - bottomMargin - topMargin;

		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				pane.setMinHeight(h);
				pane.setPrefHeight(h);
				pane.setMaxHeight(h);
				background.setHeight(h);
				marginShape.setHeight(mh);
				// imageView.setFitHeight(arg0);
			}
		};

	}

	@Override
	public void setInFooter(boolean inFooter) {
	}

	@Override
	public void setInHeader(boolean inHeader) {
	}

	@Override
	public boolean setLocation(final double x, final double y) {
		this.columnX = x + getMarginLeft();
		if (this.x != x || this.y != y) {
			this.x = x;
			this.y = y;
			this.columnX = x + getMarginLeft();
			new WaitThread(getEditor()) {
				@Override
				public void doRun() {
					pane.setLayoutX(x);
					pane.setLayoutY(y);
					pane.setTranslateX(RcplConfig.firstPageLocationX / getEditor().getScale());
					pane.setTranslateY(RcplConfig.firstPageLocationY / getEditor().getScale());
					marginShape.setLayoutX(getMarginLeft());
					marginShape.setLayoutY(getMarginTop());
				}
			};
			return true;
		}
		return false;
	}

	@Override
	public void setOpacity(double opac) {
		pane.setOpacity(opac);
	}

	@Override
	public void setOverflowExcess(double excess, double remaining) {
	}

	@Override
	public void setOverflowFigure(boolean overflow) {
		// TODO Auto-generated method stub

	}

	public void setOverflowPage(boolean overflowPage) {
		this.overflowPage = overflowPage;
	}

	@Override
	public void setPage(IPage page) {
	}

	@Override
	public void setParentFigure(ILayoutFigure figure) {
	}

	@Override
	public void setPict(IPict pict) {
	}

	public void setPrintMode(boolean printMode) {
		this.printMode = printMode;
	}

	@Override
	public void setSection(ISection section) {
		setSection((JOSection) section);

	}

	/**
	 * @param section
	 */
	public void setSection(JOSection section) {
		if (section != null) {
			setWidth(section.getPageWidth());
			setHeight(section.getPageHeight());
			section.setPage(this);
		}
		this.section = section;
	}

	public void setSlide(JOSlidePart slide) {
		this.slide = slide;
		backgroundImage = getBackgroundImage();
	}

	public void setSlideLayout(JOSlideLayoutPart slideLayout) {
		this.slideLayout = slideLayout;
	}

	public void setSlideMaster(JOSlideMasterPart slideMaster) {
		this.slideMaster = slideMaster;
		backgroundImage = getBackgroundImage();
	}

	@Override
	public void setStyle(String style) {
		pane.setStyle(style);
	}

	@Override
	public void setTextBox(boolean textBox) {

	}

	@Override
	public void setVisible(boolean visible) {

		if (editor.getPageCount() == 0) {
			showRootParagraphs(true);
			return;
		}
		showRootParagraphs(visible);
	}

	@Override
	public void setWidth(final double w) {
		width = w;
		ISection section = getSection();
		final double leftMargin = section.getLeftMargin();
		final double rightMargin = section.getRightMargin();
		final double mw = w - rightMargin - leftMargin;

		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				pane.setMinWidth(w);
				pane.setPrefWidth(w);
				pane.setMaxWidth(w);
				background.setWidth(w);
				marginShape.setWidth(mw);
				marginShape.setLayoutX(getMarginLeft());
				marginShape.setLayoutY(getMarginTop());
				// imageView.setFitWidth(w);
			}
		};
	}

	@Override
	public void setZOrder(JOAction action) {
	}

	@Override
	public void showOutline(boolean show) {
		if (outlineGroup != null) {
			outlineGroup.setVisible(show);
		}
	}

	/**
	 * for performance reason during scrollig
	 * 
	 * @param show
	 */
	@Override
	public void showRootParagraphs(final boolean show) {
		if (getPane().getScene() == null || Platform.isFxApplicationThread()) {
			paragraphGroup.setVisible(show);
			freeFlowtingGroup.setVisible(show);
			infoGroup.setVisible(show);
			backgroundGroup.setVisible(show);
			footerHeaderGroup.setVisible(show);
			behindParagraphGroup.setVisible(show);

		} else {
			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					paragraphGroup.setVisible(show);
					freeFlowtingGroup.setVisible(show);
					infoGroup.setVisible(show);
					backgroundGroup.setVisible(show);
					footerHeaderGroup.setVisible(show);
					behindParagraphGroup.setVisible(show);
				}
			});
		}

	}

	@Override
	public String toString() {
		return "page number = " + getPageNumber() + "  index = " + editor.getPageIndex(this); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public void updateAnchorPosition() {
	}

	@Override
	public void updateFx() {
	}

	// public void updateInfo() {
	// if (Platform.isFxApplicationThread()) {
	// infoLabel.setLayoutX(getWidth() - 10);
	// infoLabel.setText(" " + getPageNumber() + " \n ");
	// } else {
	// Platform.runLater(new Runnable() {
	//
	// @Override
	// public void run() {
	// infoLabel.setLayoutX(getWidth() - 10);
	// infoLabel.setText(" " + getPageNumber() + " \n ");
	// }
	// });
	// }
	// }

	@Override
	public void updateLocation() {
	}

	void updateOverflowParagraphLocation(final ILayoutFigure overflowParagraphFigure, final double x) {
		if (overflowParagraphFigure == null) {
			return;
		}
		overflowParagraphFigure.setLocation(getX2() + x,
				getY2() + getMarginTop() - overflowParagraphFigure.getLayoutObject().getLayoutFigure().getRemaining());

	}

	@Override
	public void updateSelection(Rectangle selectionRectangle) {
	}

	@Override
	public void zOrder() {

		if (!freeFlowtingGroup.getChildren().isEmpty()) {
			final List<ILayoutFigure> sortedList = new ArrayList<ILayoutFigure>();

			sortedList.addAll(layoutFigures);

			sortHappend = false;

			Collections.sort(sortedList, new Comparator<ILayoutFigure>() {

				@Override
				public int compare(ILayoutFigure o1, ILayoutFigure o2) {

					ILayoutObject lo1 = o1.getLayoutObject();
					ILayoutObject lo2 = o2.getLayoutObject();
					if (lo1 == null && lo2 != null) {
						sortHappend = true;
						return 1;
					}
					if (lo1 != null && lo2 == null) {
						sortHappend = true;
						return -1;
					}

					if (lo2 == null && lo1 == null) {
						return 0;
					}
					sortHappend = true;
					return (int) (lo1.getZOrder() - lo2.getZOrder());
				}

			});

			if (sortHappend) {

				final List<Node> list = new ArrayList<Node>();
				for (ILayoutFigure f : sortedList) {
					list.add(f.getPane());
				}
				new WaitThread(getEditor()) {
					@Override
					public void doRun() {
						freeFlowtingGroup.getChildren().clear();
						freeFlowtingGroup.getChildren().addAll(list);
					}
				};
			}
		}
	}

	@Override
	public Canvas getCanvas() {
		return null;
	}

	@Override
	public Point2D getCenter() {
		return null;
	}

	@Override
	public void deActivate() {
	}

	@Override
	public void updateRootLocation() {
	}

}
