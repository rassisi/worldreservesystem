package com.joffice.rcpl.plugin.office.fx.figures;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.EnEditMode;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IDraggable;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IEditorListener;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IPict;
import org.eclipse.rcpl.IResizable;
import org.eclipse.rcpl.JOAction;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.LayoutData;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.WindowResizeButton;
import org.eclipse.rcpl.WindowRotateButton;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.internal.figures.JOPageFigure;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * @author ramin
 *
 */
public class JOFXAbstractFigure implements ILayoutFigure {

	class ResizablePanel extends Pane {

		public ILayoutObject layoutObject;

		ResizablePanel(ILayoutObject layoutObject) {
			super();
			this.layoutObject = layoutObject;
		}

		@Override
		public double computePrefHeight(double arg0) {
			return super.computePrefHeight(arg0);
		}

		@Override
		public void layoutChildren() {

			super.layoutChildren();

			for (Node n : nodes) {
				if (n instanceof Region) {
					Region r = (Region) n;
					r.setPrefWidth(width);
					r.setPrefHeight(height);
				} else if (n instanceof Rectangle) {
					Rectangle s = (Rectangle) n;
					s.setWidth(width);
					s.setHeight(height);
				}
			}

			if (resizable && windowResizeButtonSE != null) {

				if (stage != null) {

					windowResizeButtonSE.autosize();
					windowResizeButtonSE.setLayoutX(width - windowResizeButtonSE.getLayoutBounds().getWidth());
					windowResizeButtonSE.setLayoutY(height - windowResizeButtonSE.getLayoutBounds().getHeight());

					windowResizeButtonNE.autosize();
					windowResizeButtonNE.setLayoutX(width - windowResizeButtonNE.getLayoutBounds().getWidth());
					windowResizeButtonNE.setLayoutY(0);

					windowResizeButtonNW.autosize();
					windowResizeButtonNW.setLayoutX(-windowResizeButtonNW.getLayoutBounds().getWidth());
					windowResizeButtonNW.setLayoutY(0);

					windowResizeButtonSW.autosize();
					windowResizeButtonSW.setLayoutX(0);
					windowResizeButtonSW.setLayoutY(height - windowResizeButtonSW.getLayoutBounds().getHeight());

					windowResizeButtonS.autosize();
					windowResizeButtonS.setLayoutX(20);
					windowResizeButtonS.setLayoutY(height - windowResizeButtonS.getLayoutBounds().getHeight());
					windowResizeButtonS.setMinWidth(width - 40);
					windowResizeButtonS.setMaxWidth(width - 40);
					windowResizeButtonS.setPrefWidth(width - 40);
					windowResizeButtonS.setMinHeight(4);
					windowResizeButtonS.setMaxHeight(4);
					windowResizeButtonS.setPrefHeight(4);

					windowResizeButtonN.autosize();
					windowResizeButtonN.setLayoutX(20);
					windowResizeButtonN.setLayoutY(0);
					windowResizeButtonN.setMinWidth(width - 40);
					windowResizeButtonN.setMaxWidth(width - 40);
					windowResizeButtonN.setPrefWidth(width - 40);
					windowResizeButtonN.setMinHeight(11);
					windowResizeButtonN.setMaxHeight(11);
					windowResizeButtonN.setPrefHeight(11);

					windowResizeButtonW.autosize();
					windowResizeButtonW.setLayoutX(-windowResizeButtonW.getLayoutBounds().getWidth() + 10);
					windowResizeButtonW.setLayoutY(10);
					windowResizeButtonW.setMinHeight(height - 20);

					windowResizeButtonE.autosize();
					windowResizeButtonE.setLayoutX(-windowResizeButtonW.getLayoutBounds().getWidth() + 10);
					windowResizeButtonE.setLayoutY(10);
				} else {
					windowRotateButton.setLayoutX(width / 2);
					windowRotateButton.setLayoutY(-height / 2);

					windowResizeButtonSE.setLayoutX(width);
					windowResizeButtonSE.setLayoutY(height);
				}
			}
		}

		@Override
		protected void setHeight(double h) {
			super.setHeight(h);
			height = h;
		}

		@Override
		public void setPrefSize(double w, double h) {
			super.setPrefSize(w, h);
			width = w;
			height = h;
		}

		@Override
		protected void setWidth(double w) {
			super.setWidth(w);
			width = w;
		}

		protected void superLayoutChildren() {
			super.layoutChildren();
		}
	}

	private String uuid;

	boolean cloned;

	private double remaining;

	private boolean overflow;

	private double overflowExcess;

	private ILayoutFigure parentNode;

	private final Group backgroundGroup;

	protected final Group paragraphGroup;

	protected final Group outLineDescriptionGroup;

	private Rectangle bg;

	private Canvas canvas;

	protected Rectangle outLineRectangle;

	protected Rectangle overflowRectangle;

	protected Point2D dragAnchor;

	private boolean textBox;

	private IPage page;

	protected final Group selectionGroup;

	protected Label outlinerRootIndexLabel;

	protected Label outlinerDescriptionLabel;

	private EnEditMode editMode = EnEditMode.NONE;

	protected boolean disableDragging;

	private ILayoutObject layoutObject;

	// private double x = Double.MIN_VALUE;
	//
	// private double y = Double.MIN_VALUE;

	private double columnX;

	double startX;

	double startY;

	private boolean inHeader;

	private boolean inFooter;

	private WindowRotateButton windowRotateButton;

	private WindowResizeButton windowResizeButtonSE;

	private WindowResizeButton windowResizeButtonNE;

	private WindowResizeButton windowResizeButtonNW;

	private WindowResizeButton windowResizeButtonSW;

	private WindowResizeButton windowResizeButtonS;

	private WindowResizeButton windowResizeButtonN;

	private WindowResizeButton windowResizeButtonW;

	private WindowResizeButton windowResizeButtonE;

	private Stage stage;

	private boolean resizable = false;

	private double width;

	protected double height;

	private Pane pane;

	private Node[] nodes = new Node[0];

	private Group resizeHandlesGroup;

	private Group contentGroup;

	private Group overflowGroup;

	private Group canvasGroup;

	public JOFXAbstractFigure(ILayoutObject layoutObject) {

		this.uuid = UUID.randomUUID().toString();

		pane = createPane();
		pane.setUserData(this);

		this.layoutObject = layoutObject;

		backgroundGroup = new Group();
		outLineDescriptionGroup = new Group();
		selectionGroup = new Group();
		paragraphGroup = new Group();
		overflowGroup = new Group();
		canvasGroup = new Group();
		resizeHandlesGroup = new Group();
		resizeHandlesGroup.setVisible(false);
		contentGroup = new Group();
		pane.getChildren().addAll(backgroundGroup, selectionGroup, outLineDescriptionGroup, getOutlineRectangle(),
				paragraphGroup, overflowGroup, canvasGroup, contentGroup, resizeHandlesGroup);

		backgroundGroup.setPickOnBounds(false);
		outLineDescriptionGroup.setPickOnBounds(false);
		canvasGroup.setPickOnBounds(false);

		if (this instanceof IDraggable) {
			addDragSupport();
		}

		if (this instanceof IResizable) {
			setResizable(true);
		}

		this.overflowExcess = 0.0;

		if (getLayoutObject().getDocument().getEditor() != null) {
			if (getLayoutObject().getDocument().getEditor().isShowOutline()) {
				showOutline(true);
			}
		}

		// getBg().setFill(Color.TRANSPARENT);

		setWidth(layoutObject.getWidthPixel());
		setHeight(layoutObject.getHeightPixel());

	}

	private Rectangle getOutlineRectangle() {
		if (outLineRectangle == null) {
			outLineRectangle = new Rectangle();
			outLineRectangle.setId("outLine");
			outLineRectangle.setFill(null);
			outLineRectangle.setStroke(Color.LIGHTBLUE);
			outLineRectangle.setStrokeWidth(1);
			outLineRectangle.setX(-1);
			outLineRectangle.setY(-1);
			outLineRectangle.setVisible(false);
			outLineRectangle.setPickOnBounds(false);
		}
		return outLineRectangle;
	}

	@Override
	public void add(final ILayoutFigure layoutFigure) {
		addToGroup(contentGroup, layoutFigure.getPane());
		layoutFigure.setParentFigure(this);
	}

	public void add(final Node... nodes) {
		this.nodes = nodes;
		if (contentGroup.getScene() == null) {
			contentGroup.getChildren().addAll(nodes);
			return;
		}
		new WaitThread(getEditor()) {

			@Override
			public void doRun() {
				contentGroup.getChildren().addAll(nodes);
			}
		};
	}

	protected void addBoundsListener() {
		pane.boundsInLocalProperty().addListener(new ChangeListener<Bounds>() {

			@Override
			public void changed(ObservableValue<? extends Bounds> observable, Bounds oldValue, Bounds newValue) {
				doLocalBoundsChanged(oldValue, newValue);
			}
		});

		pane.boundsInParentProperty().addListener(new ChangeListener<Bounds>() {

			@Override
			public void changed(ObservableValue<? extends Bounds> observable, Bounds oldValue, Bounds newValue) {
				doInParentBoundsChanged(oldValue, newValue);
			}
		});
	}

	private int active;

	protected void deactivateAll() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				getEditor().getDocument().deactivateAll(getLayoutObject());
			}
		});
	}

	private void handleMousePressed(MouseEvent me) {

		if (active < 2) {
			active++;
			showHandles(true);
			showOutline(true);
			showAnchor(true);
		}
		if (active > 0) {
			if (getLayoutObject().getDocument().getEditor().isEditable()) {
				dragAnchor = new Point2D(me.getSceneX(), me.getSceneY());
				startX = pane.getLayoutX();
				startY = pane.getLayoutY();
			}
		}

		if (!me.isControlDown()) {
			deactivateAll();
		}

		if (me.isSecondaryButtonDown()) {
			getContextMenu().show(pane, me.getScreenX(), me.getScreenY());
		}
	}

	private void handleMouseReleased() {
		if (getLayoutObject().getDocument().getEditor().isEditable()) {
			if (active == 2) {
				active = 0;
				showHandles(false);
				showAnchor(false);
				showOutline(getEditor().isShowOutline());
			}
			if (!disableDragging) {
				if (pane.getTranslateX() < (10) && pane.getTranslateX() > (-10) && pane.getTranslateY() < (10)
						&& pane.getTranslateY() > (-10)) {
					pane.setTranslateX(0);
					pane.setTranslateY(0);
					clipFigure();
				}
			}
		}
	}

	private void handleMouseDragged(MouseEvent me) {
		if (getLayoutObject().getDocument().getEditor().isEditable()) {
			if (!disableDragging && active > 0) {
				if (dragAnchor != null) {
					double diffX = me.getSceneX() - dragAnchor.getX();
					double diffY = me.getSceneY() - dragAnchor.getY();

					if (editMode.equals(EnEditMode.SELECT)) {
						return;
					}

					if (!isResizable() && isTextBox()) {
						if (dragAnchor.getY() - me.getSceneY() > 10) {
							editMode = EnEditMode.DRAG;
							sendEditModeEvent();
						} else {
							if (Math.abs(dragAnchor.getX() - me.getSceneX()) > 10) {
								editMode = EnEditMode.SELECT;
								sendEditModeEvent();
							}
							return;
						}
					}

					if (EnEditMode.NONE.equals(editMode)) {
						editMode = EnEditMode.DRAG;
						sendEditModeEvent();
					}

					double scale = getEditor().getScale();

					diffX /= scale;
					diffY /= scale;
					double x = startX + diffX;
					double y = startY + diffY;

					if (me.isControlDown()) {
						x = ((int) x / 10) * 10;
						y = ((int) y / 10) * 10;
					}

					pane.setLayoutX(x);
					pane.setLayoutY(y);
					// scale);
					Rectangle2D newBounds = new Rectangle2D(pane.getLayoutX(), pane.getLayoutY(), pane.getWidth(),
							pane.getHeight());
					layoutObject.boundsChanged2(newBounds);
					clipFigure();
				}
			}
		}

	}

	protected void addDragSupport() {
		pane.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent me) {
				handleMousePressed(me);
			}
		});

		pane.setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				handleMouseReleased();
			}
		});

		pane.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent me) {
				handleMouseDragged(me);
			}
		});

	}

	protected void addToGroup(final Group group, final Node node) {

		if (group.getScene() == null) {
			if (!group.getChildren().contains(node)) {
				group.getChildren().add(node);
			}
			return;
		}

		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				if (!group.getChildren().contains(node)) {
					group.getChildren().add(node);
				}
			}
		};
	}

	@Override
	public void clipFigure() {

		if (getLayoutObject() instanceof IParagraph && getLayoutObject().isRootObject()) {
			return;
		}

		double x = pane.getLayoutX();
		double y = pane.getLayoutY();

		if (getPage() != null) {
			JOPageFigure pf = (JOPageFigure) getPage();
			if (x > pf.getWidth() || y > pf.getHeight()) {
				updateClipping(null);
				return;
			}
			if (x < -getWidth() || y < -getHeight()) {
				updateClipping(null);
				return;
			}

			if (getPage() != null && !getLayoutObject().getDocument().getEditor().isSuppressClipChildren()) {
				Rectangle r = pf.getClipping(this);
				updateClipping(r);

			}
		} else {
			updateClipping(null);
		}

	}

	protected Pane createPane() {
		return new ResizablePanel(getLayoutObject());
	}

	@Override
	public void detach() {
		final Parent parent = getNode().getParent();
		if (parent != null) {
			new WaitThread(getEditor()) {

				@Override
				public void doRun() {
					if (parent instanceof Group) {
						((Group) parent).getChildren().remove(getNode());
					} else if (parent instanceof Pane) {
						((Pane) parent).getChildren().remove(getNode());
					}
				}
			};
		}
	}

	protected void doInParentBoundsChanged(Bounds oldValue, Bounds newValue) {
	}

	protected void doLocalBoundsChanged(Bounds oldValue, Bounds newValue) {
	}

	@Override
	public int hashCode() {
		return uuid.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JOFXAbstractFigure other = (JOFXAbstractFigure) obj;
		if (hashCode() != other.hashCode())
			return false;
		return true;
	}

	public Group getBackgroundGroup() {
		return backgroundGroup;
	}

	protected Rectangle getBg() {
		if (bg == null) {
			bg = new Rectangle();
			bg.setFill(Color.GRAY);
			bg.setStroke(Color.GRAY);
			bg.setVisible(false);
			bg.setX(0);
			bg.setY(0);
			bg.setPickOnBounds(false);
			addToGroup(backgroundGroup, bg);
		}

		return bg;

	}

	@Override
	public Canvas getCanvas() {
		if (canvas == null) {
			canvas = new Canvas();
			canvas.setPickOnBounds(false);
			addToGroup(canvasGroup, canvas);
		}
		return canvas;
	}

	@Override
	public double getColumnX() {
		if (!getLayoutObject().isRootObject()) {
			return getLayoutObject().getRootObject().getLayoutFigure().getColumnX();
		}
		return columnX;
	}

	protected IEditor getEditor() {
		return getLayoutObject().getDocument().getEditor();
	}

	@Override
	public List<ILayoutFigure> getFigureChildren() {
		return null;
	}

	public Color getFill() {
		if (bg != null) {
			return (Color) bg.getFill();
		}
		return null;
	}

	@Override
	public JOFXAbstractFigure getFx() {
		return this;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public List<ILayoutFigure> getLayoutFigures() {
		List<ILayoutFigure> result = new ArrayList<ILayoutFigure>();
		for (Node f : pane.getChildren()) {
			if (f.getUserData() instanceof ILayoutFigure) {
				result.add((ILayoutFigure) f.getUserData());
			}
		}
		return result;
	}

	@Override
	public ILayoutObject getLayoutObject() {
		return layoutObject;
	}

	@Override
	public Pane getNode() {
		return pane;
	}

	@Override
	public double getOverflowExcess() {
		return overflowExcess;
	}

	@Override
	public double getOverflowHeight(LayoutData layoutData) {
		return 0;
	}

	@Override
	public Point2D getOverflowLocation() {
		return null;
	}

	private Rectangle getoverflowrecRectangle() {
		if (overflowRectangle == null) {
			overflowRectangle = new Rectangle();
			overflowRectangle.setStroke(Color.RED);
			overflowRectangle.setFill(Color.TRANSPARENT);
			overflowRectangle.setStrokeWidth(1);
			overflowRectangle.setHeight(1);
			overflowRectangle.setWidth(getWidth());
			overflowRectangle.setVisible(false);
			overflowRectangle.setPickOnBounds(false);

			new WaitThread(getEditor()) {

				@Override
				public void doRun() {
					addToGroup(overflowGroup, overflowRectangle);
				}
			};
		}
		return overflowRectangle;
	}

	@Override
	public IPage getPage() {
		if (page == null) {
			page = getLayoutObject().getPage();
			if (page == null) {
				page = getLayoutObject().getRootObject().getPage();
			}
		}
		return page;
	}

	@Override
	public Pane getPane() {
		return pane;
	}

	public Group getParagraphGroup() {
		return paragraphGroup;
	}

	@Override
	public ILayoutFigure getParentFigure() {
		if (parentNode == null && getLayoutObject().isRootObject()) {
			return getPage();
		}
		return parentNode;
	}

	@Override
	public double getRemaining() {
		return remaining;
	}

	public Group getSelectionGroup() {
		return selectionGroup;
	}

	public Color getStroke() {
		if (bg != null) {
			return (Color) bg.getStroke();
		}
		return null;
	}

	public Object getUserData() {
		return pane.getUserData();
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getX2() {
		if (getParentFigure() != null) {
			return getParentFigure().getPane().getLayoutX() + getPane().getLayoutX();
		}
		return getPane().getLayoutX();
	}

	@Override
	public double getY2() {
		if (getParentFigure() != null) {
			return getParentFigure().getPane().getLayoutY() + getPane().getLayoutY();
		}
		return getPane().getLayoutY();
	}

	private void initButtons() {
		windowResizeButtonSE = new WindowResizeButton(getEditor(), Cursor.SE_RESIZE, stage, this);
		windowRotateButton = new WindowRotateButton(this);

		if (stage != null) {
			windowResizeButtonNE = new WindowResizeButton(getEditor(), Cursor.NE_RESIZE, stage, this);
			windowResizeButtonNW = new WindowResizeButton(getEditor(), Cursor.NW_RESIZE, stage, this);
			windowResizeButtonSW = new WindowResizeButton(getEditor(), Cursor.SW_RESIZE, stage, this);

			windowResizeButtonS = new WindowResizeButton(getEditor(), Cursor.S_RESIZE, stage, this);
			windowResizeButtonN = new WindowResizeButton(getEditor(), Cursor.N_RESIZE, stage, this);
			windowResizeButtonW = new WindowResizeButton(getEditor(), Cursor.W_RESIZE, stage, this);
			windowResizeButtonE = new WindowResizeButton(getEditor(), Cursor.E_RESIZE, stage, this);

			resizeHandlesGroup.getChildren().addAll(windowResizeButtonSE, windowResizeButtonNE, windowResizeButtonNW,
					windowResizeButtonSW, windowResizeButtonN, windowResizeButtonS, windowResizeButtonE,
					windowResizeButtonW

			);
		} else {
			resizeHandlesGroup.getChildren().addAll(windowResizeButtonSE, windowRotateButton);
		}

	}

	@Override
	public boolean isCloned() {
		return cloned;
	}

	@Override
	public boolean isInFooter() {
		return inFooter;
	}

	@Override
	public boolean isInHeader() {
		return inHeader;
	}

	@Override
	public boolean isOverflowFigure() {
		return overflow;
	}

	public boolean isResizable() {
		return resizable;
	}

	public boolean isTextBox() {
		return textBox;
	}

	protected void log(String msg, Throwable ex) {
		RCPLModel.logError(ex);
	}

	@Override
	public void refresh() {
		// updateAnchorPosition();
	}

	@Override
	public void refreshOutline() {
		if (outlinerRootIndexLabel != null) {
			if (getLayoutObject() != null && getLayoutObject().isRootObject()) {
				try {
					outlinerRootIndexLabel.setText("" + (getLayoutObject().getRootIndex() + 1));
				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}
			}
		}

		if (outlinerDescriptionLabel != null) {
			if (getLayoutObject() != null && getLayoutObject().isRootObject()) {
				if (getLayoutObject() instanceof IParagraph && ((JOParagraph) getLayoutObject()).isStartNewSection()) {
					outlinerDescriptionLabel
							.setText((getLayoutObject().getRootIndex() + 1) + " :::::::::: new Section ::::::::::");
				} else if (getLayoutObject().isPageBreakAfter()) {
					outlinerDescriptionLabel
							.setText((getLayoutObject().getRootIndex() + 1) + " :::::::::: pageBreakAfter ::::::::::");
				}
			}
		}

	}

	@Override
	public void remove(final ILayoutFigure layoutFigure) {
		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				removeFromGroup(contentGroup, layoutFigure.getPane());
			}
		};
	}

	private void removeFromGroup(final Group group, final Node node) {
		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				group.getChildren().remove(node);
			}
		};
	}

	private void sendEditModeEvent() {
		JOEvent ev = new JOEvent(editMode, null);
		for (IEditorListener l : Rcpl.getEditorListeners()) {
			l.update(ev);
		}
	}

	protected void sendInfoMessage(String message) {
		JOEvent ev = new JOEvent(message, null);
		for (IEditorListener l : Rcpl.getEditorListeners()) {
			l.update(ev);
		}
	}

	@Override
	public void setCloned(boolean cloned) {
		this.cloned = cloned;
	}

	@Override
	public void setColumnX(double columnX) {
		this.columnX = columnX;
	}

	@Override
	public void setFill(Color color) {
		getBg().setFill(color);
		bg.setVisible(color != null);
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
		pane.setMinHeight(height);
		pane.setPrefHeight(height);
		pane.setMaxHeight(height);
		if (bg != null) {
			bg.setHeight(height);
		}
		getOutlineRectangle().setHeight(height + 2);
	}

	public void setHeightNoClipping(double height) {

		this.height = height;
		pane.setMinHeight(height);
		pane.setPrefHeight(height);
		pane.setMaxHeight(height);

		if (bg != null) {
			bg.setHeight(height);
		}
		getOutlineRectangle().setHeight(height + 2);
	}

	public void setImage(final String key) {
		if (backgroundGroup.getScene() == null) {
			backgroundGroup.getChildren().add(Rcpl.resources().getImage(key, 16, 16).getNode());
			return;
		}
		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				backgroundGroup.getChildren().add(Rcpl.resources().getImage(key, 16, 16).getNode());
			}
		};
	}

	@Override
	public void setInFooter(boolean inFooter) {
		this.inFooter = inFooter;

	}

	@Override
	public void setInHeader(boolean inHeader) {
		this.inHeader = inHeader;
	}

	@Override
	public boolean setLocation(double x, double y) {
		double newX = x;
		double newY = y;
		if (parentNode != null) {
			newX -= parentNode.getX2();
			newY -= parentNode.getY2();
		}
		if (newX != getPane().getLayoutX() || newY != getPane().getLayoutY()) {
			setSuperLayoutXY(newX, newY);
			return true;
		}
		return false;
	}

	@Override
	public void setOverflowExcess(double overflowExcess, double remaining) {
		this.overflowExcess = overflowExcess;
		this.remaining = remaining;
		if (overflowExcess > 0) {
			getoverflowrecRectangle().setY(remaining);
			getPane().setClip(new Rectangle(getWidth(), remaining));
		} else {
			getPane().setClip(null);
			if (overflowRectangle != null) {
				new WaitThread(getEditor()) {
					@Override
					public void doRun() {
						overflowGroup.getChildren().remove(overflowRectangle);
					}
				};
			}
		}
	}

	@Override
	public void setOverflowFigure(boolean overflow) {
		this.overflow = overflow;
	}

	@Override
	public void setPage(IPage page) {
		this.page = page;
	}

	@Override
	public void setParentFigure(ILayoutFigure parentNode) {
		this.parentNode = parentNode;
	}

	@Override
	public void setPict(IPict pict) {
	}

	public void setResizable(boolean resizable) {

		this.resizable = resizable;
		if (resizable) {
			initButtons();
		} else {
			if (stage != null) {
				resizeHandlesGroup.getChildren().removeAll(windowResizeButtonSE, windowResizeButtonNE,
						windowResizeButtonNW, windowResizeButtonSW, windowResizeButtonS, windowResizeButtonN,
						windowResizeButtonW, windowResizeButtonE);
			} else {
				resizeHandlesGroup.getChildren().remove(windowResizeButtonSE);
			}
		}
	}

	public void setScale(double x, double y) {
		pane.setScaleX(x);
		pane.setScaleY(y);
	}

	public void setStroke(Color color) {
		getBg().setStroke(color);
		bg.setVisible(color != null);
	}

	public void setStrokeWidth(double width) {
		if (bg != null) {
			bg.setStrokeWidth(width);
		}
	}

	@Override
	public void setStyle(String style) {
		pane.setStyle(style);
	}

	private void setSuperLayoutXY(final double x, final double y) {

		if (getPane().getScene() == null) {
			pane.setLayoutX(x);
			pane.setLayoutY(y);
			return;
		}

		if (Platform.isFxApplicationThread()) {
			pane.setLayoutX(x);
			pane.setLayoutY(y);
		} else {
			new WaitThread(getEditor()) {
				@Override
				public void doRun() {
					pane.setLayoutX(x);
					pane.setLayoutY(y);
				}
			};
		}
	}

	@Override
	public void setTextBox(boolean textBox) {
		this.textBox = textBox;
	}

	public void setUserData(Object data) {
		pane.setUserData(data);
	}

	@Override
	public void setVisible(boolean visible) {
		pane.setVisible(visible);
	}

	@Override
	public void setWidth(double w) {
		setWidthNoClipping(w);
	}

	private void setWidthNoClipping(double w) {
		this.width = w;
		pane.setPrefWidth(width);
		pane.setMaxWidth(width);
		if (bg != null) {
			bg.setWidth(w);
		}

		getOutlineRectangle().setWidth(w + 2);

		if (overflowRectangle != null) {
			overflowRectangle.setWidth(w);
		}

	}

	@Override
	public void setZOrder(JOAction action) {
	}

	private void showHandles(boolean show) {
		if (resizeHandlesGroup != null) {
			resizeHandlesGroup.setVisible(show);
		}
	}

	private void showAnchor(boolean show) {
		if (show) {
			getEditor().showAnchor(this);
		} else {
			getEditor().hideAnchor();
		}
	}

	@Override
	public void showOutline(final boolean show) {

		Platform.runLater(new Runnable() {

			@Override
			public void run() {

				try {
					if (overflowRectangle != null) {
						overflowRectangle.setVisible(show);
					}

					getOutlineRectangle().setVisible(show);

					if (outlinerRootIndexLabel == null) {
						outlinerRootIndexLabel = new Label();
						outlinerRootIndexLabel.setPadding(new Insets(0, 0, 0, -50));

						outlinerDescriptionLabel = new Label();
						outLineDescriptionGroup.getChildren().addAll(outlinerRootIndexLabel, outlinerDescriptionLabel);
						outlinerDescriptionLabel.setLayoutX(0);
						outlinerDescriptionLabel.setLayoutY(getLayoutObject().getHeightPixel());
						outlinerDescriptionLabel.setPickOnBounds(false);
						outlinerRootIndexLabel.setPickOnBounds(false);
					}

					outLineDescriptionGroup.setVisible(show);

					if (show) {
						refreshOutline();
					}

				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}
			}
		});

	}

	protected void sleep() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
	}

	@Override
	public void updateAnchorPosition() {

		ILayoutObject lo = getLayoutObject();
		if (lo.isRootObject()) {
			return;
		}

		if (lo.getRootObject().getLayoutFigure() == null) {
			return;
		}

		double anchorY = updateVAnchor();
		double anchorX = updateHAnchor();

		// if (anchorX != Double.MIN_VALUE) {
		// lo.getLayoutFigure().getPane().setLayoutX(anchorX);
		// }
		//
		// if (anchorX != Double.MIN_VALUE) {
		// lo.getLayoutFigure().getPane().setLayoutY(anchorY);
		// }

		if (anchorX != Double.MIN_VALUE || anchorY != Double.MIN_VALUE) {
			setLocation(anchorX, anchorY);
		}

	}

	private void updateClipping(final Rectangle r) {
		if (getPane().getScene() == null) {
			if (getEditor() != null && !getLayoutObject().getDocument().isLayouted()) {
				if (r == null) {
					contentGroup.setClip(null);
					backgroundGroup.setClip(null);
					return;
				}
				try {
					contentGroup.setClip(r);
					backgroundGroup.setClip(r);
				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}
			}
			return;
		}
		new WaitThread(getEditor()) {
			@Override
			public void doRun() {
				if (r == null) {
					contentGroup.setClip(null);
					backgroundGroup.setClip(null);
					return;
				}
				try {
					contentGroup.setClip(r);
					backgroundGroup.setClip(r);
				} catch (Exception ex) {
					RCPLModel.logError(ex);
				}
			}
		};
	}

	@Override
	public void updateFx() {
	}

	private double updateHAnchor() {
		double x = Double.MIN_VALUE;
		try {
			ILayoutObject lo = getLayoutObject();
			ILayoutFigure lf = getLayoutObject().getLayoutFigure();
			if (getLayoutObject().getHAnchor() != null) {
				double xPixel = getLayoutObject().getXPixel();
				switch (getLayoutObject().getHAnchor()) {
				case CHARACTER:
					break;
				case COLUMN:
					x = lo.getLayoutFigure().getColumnX() + xPixel;
					lf.setParentFigure(getPage());
					break;
				case INSIDE_MARGIN:
					if (page.isEven()) {
						x = getPage().getX2() + getPage().getMarginLeft() + xPixel;
					} else {
						x = getPage().getX2() + getPage().getMarginRight() + xPixel;
					}
					lf.setParentFigure(getPage());
					break;
				case LEFT_MARGIN:
					x = getPage().getX2() + getPage().getMarginLeft() + xPixel;
					lf.setParentFigure(getPage());
					break;
				case LINE:
					break;
				case MARGIN:
					x = getPage().getX2() + getPage().getMarginLeft() + xPixel;
					lf.setParentFigure(getPage());
					break;
				case OUTSIDE_MARGIN:
					if (page.isOdd()) {
						x = getPage().getX2() + getPage().getMarginLeft() + xPixel;
					} else {
						x = getPage().getX2() + getPage().getMarginRight() + xPixel;
					}
					lf.setParentFigure(getPage());
					break;
				case PAGE:
					x = getPage().getX2() + xPixel;
					lf.setParentFigure(getPage());
					break;
				case PARAGRAPH:
					lf.setParentFigure(lo.getHAnchorObject().getLayoutFigure());
					x = lo.getHAnchorObject().getLayoutFigure().getX2() + xPixel;
					break;
				case RIGHT_MARGIN:
					x = getPage().getX2() + getPage().getMarginRight() + xPixel;
					lf.setParentFigure(getPage());
					break;
				case TEXT:
					// lf.setParentFigure(lo.getHAnchorObject().getLayoutFigure());
					x = lo.getHAnchorObject().getLayoutFigure().getX2() + xPixel;
					break;
				default:
					break;

				}
			}
			return x;
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return x;
		}
	}

	@Override
	public void updateLocation() {
		if (parentNode != null) {
			final double x = pane.getLayoutX() - parentNode.getPane().getLayoutX();
			final double y = pane.getLayoutY() - parentNode.getPane().getLayoutY();
			setSuperLayoutXY(x, y);
		}
	}

	@Override
	public void updateRootLocation() {
		// if (page != null && getLayoutObject().isRootObject()) {
		// this.x = page.getX2() + pane.getLayoutX();
		// this.y = page.getY2() + pane.getLayoutY();
		// }
	}

	@Override
	public void updateSelection(Rectangle selectionRectangle) {
	}

	private double updateVAnchor() {
		double y = Double.MIN_VALUE;
		try {
			ILayoutObject lo = getLayoutObject();
			ILayoutFigure lf = getLayoutObject().getLayoutFigure();
			if (lo.getVAnchor() != null) {
				double yPixel = getLayoutObject().getYPixel();
				switch (getLayoutObject().getVAnchor()) {
				case BOTTOM_MARGIN:
					lf.setParentFigure(getPage());
					y = getPage().getY2() + getPage().getMarginBottom() + yPixel;
					break;
				case CHARACTER:
					break;
				case COLUMN:
					break;
				case LINE:
					break;
				case MARGIN:
					if (yPixel < 0) {
						lf.setParentFigure(getPage());
						y = getPage().getY2() + getPage().getMarginBottom() + yPixel;
					} else {
						lf.setParentFigure(getPage());
						y = getPage().getY2() + getPage().getMarginTop() + yPixel;
					}
					break;
				case OUTSIDE_MARGIN:
					lf.setParentFigure(getPage());
					y = getPage().getY2() + getPage().getMarginTop() + yPixel;
					break;
				case PAGE:
					lf.setParentFigure(getPage());
					y = getPage().getY2() + yPixel;
					break;
				case PARAGRAPH:
					lf.setParentFigure(getLayoutObject().getVAnchorObject().getLayoutFigure());
					y = getLayoutObject().getVAnchorObject().getLayoutFigure().getY2() + yPixel;
					break;
				case TEXT:
					// lf.setParentFigure(getLayoutObject().getVAnchorObject().getLayoutFigure());
					y = getLayoutObject().getVAnchorObject().getLayoutFigure().getY2() + yPixel;
					break;
				case TOP_MARGIN:
					lf.setParentFigure(getPage());
					y = getPage().getY2() + getPage().getMarginTop() + yPixel;
					break;
				default:
					break;

				}
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return y;
		}
		return y;
	}

	@Override
	public Point2D getCenter() {
		return getPane().localToScene(getWidth(), getHeight());
	}

	@Override
	public void deActivate() {
		active = 0;
		showHandles(false);
		showOutline(getEditor().isShowOutline());
	}

	@Override
	public void dispose() {
		getPane().getChildren().clear();
	}

	private ContextMenu contextMenu;

	protected ContextMenu getContextMenu() {
		if (contextMenu == null) {
			contextMenu = new ContextMenu();
			contextMenu.setOnShowing(new EventHandler<WindowEvent>() {
				@Override
				public void handle(WindowEvent e) {

				}
			});
			contextMenu.setOnShown(new EventHandler<WindowEvent>() {
				@Override
				public void handle(WindowEvent e) {
					System.out.println("shown");
				}
			});

			MenuItem item1 = new MenuItem("To Front");
			item1.setGraphic(Rcpl.resources().getImage("folder", 16, 16).getNode());
			item1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.toFront,
							getLayoutObject(), null);
					Rcpl.service().execute(command);
				}
			});
			MenuItem item2 = new MenuItem("To Back");
			item2.setGraphic(Rcpl.resources().getImage("folder", 16, 16).getNode());
			item2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.toBack,
							getLayoutObject(), null);
					Rcpl.service().execute(command);
				}
			});

			SeparatorMenuItem sep1 = new SeparatorMenuItem();

			MenuItem itemDelete = new MenuItem("Delete");
			itemDelete.setGraphic(Rcpl.resources().getImage("delete", 16, 16).getNode());
			itemDelete.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.delete,
							getLayoutObject(), null);
					Rcpl.service().execute(command);
				}
			});

			contextMenu.getItems().addAll(item1, item2, sep1, itemDelete);
		}
		return contextMenu;
	}

}
