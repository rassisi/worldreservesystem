/******************************************************************************
 *    Ramin Assisi
 ****************************************************************************/
package com.joffice.rcpl.plugin.office.internal.figures;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlValueDisconnectedException;
import org.eclipse.rcpl.DelayedExecution;
import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.EnDocumentType;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.IBrowser;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.ITableCell;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.IUndoRedoListener;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplCommand;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.fx.zoom.ZScrollPane2;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.internal.tools.FontNameTool;
import org.eclipse.rcpl.internal.tools.FontSizeTool;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolType;
import org.eclipse.rcpl.util.JOUtil2;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.figures.spreadsheet.JOSpreadsheetFigure;
import com.joffice.rcpl.plugin.office.internal.JOAbstractDocument;
import com.joffice.rcpl.plugin.office.internal.model.drawing.JODrawing;
import com.joffice.rcpl.plugin.office.internal.model.presentation.JOPresentationDocument;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOSheetPart;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOSpreadsheetDocument;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOWordDocument;
import com.joffice.rcpl.plugin.office.internal.services.JOLayoutService;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Control;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * @author Ramin Assisi
 * 
 */
public class JOEditorFigure extends Pane implements IEditor {

	public enum FocusReason {
		LAYOUT, LEFT, RIGHT, DOWN, UP, BS, DEL, FOCUS, MOUSE_PRESSED, MOUSE_DOUBLECLICK, POSITION_TO_END_OF_SELECTION;

	}

	private final double TAB_HEIGHT = 20;

	private boolean sortMode;

	private List<IPage> pages = new ArrayList<IPage>();

	private List<JOBetweenPagesFigure> betweenPages = new ArrayList<JOBetweenPagesFigure>();

	private Object tabItem;

	private boolean dirtyZOrder = true;

	private boolean readOnly = false;

	private boolean showPageNumbers = true;

	private IPage selectedPage;

	private int pageColumns = 1;

	private boolean printMode = false;

	private int mouseX;

	private int mouseY;

	private List<ICommand> commandStack = new Vector<ICommand>();

	private boolean disposed;

	private boolean paragraphSelectionMode;

	private int startPage = 1;

	private boolean showRulers = true;

	private ILayoutObject selectedLayoutObject;

	private boolean showOutline = false;

	private boolean showGrid = false;

	private int commandStackPointer = -1;

	private boolean slideMasterView;

	final static int MAX_COMMAND_STACK = 1000;

	private List<JOSpreadsheetFigure> spreadsheets;

	private boolean inSelectionMode;

	private JOParagraph lastPaintedParagraph;

	private JOObject lastFocussedObject;

	private List<RcplCommand> externalEdits;

	private IColor actualForgroundColor = IColor.BLACK;

	private IColor actualBackgroundColor = IColor.WHITE;

	private IColor actualHiglightColor = IColor.CYAN;

	protected int lastMouseX;

	protected int lastMouseY;

	private boolean leftMouseDown = false;

	private boolean ctrlKeyDown = false;

	private boolean shiftKeyDown = false;

	private EnDocumentType documentType;

	private TabPane documentTabPane;

	private Parent mainPane;

	private ZScrollPane2 zScrollPane;

	private boolean enableCommandStack = true;

	private boolean suppressClipChildren;

	private Rectangle selectionRectangle;

	private Tab infoTab;

	private boolean showLines = false;

	private Group backGroundGroup;

	private Group pageGroup;

	private Group selectionGroup;

	private Tab tab;

	private ILayoutObject anchorObject;

	private SelectionShape selectionStartShape;

	private SelectionShape selectionEndShape;

	private IUndoRedoListener undoRedoListener;

	private Pane st;

	private IDocument doc;

	private ScrollInfoPane scrollInfoPane;

	private Node anchor;

	VBox documentInfoContainer;

	TextArea documentInfo;

	/**
	 * @param file
	 * @param tab
	 * @param wordReplacements
	 * @param onePage
	 */
	public JOEditorFigure(File file, Tab tab, HashMap<String, String> wordReplacements, boolean onePage) {
		this(tab, false);
		doc = JOAbstractDocument.load(file, false, wordReplacements, onePage);
		doc.setEditorFigure(this);
	}

	/**
	 * @param canvas
	 * @param style
	 * @param x
	 * @param y
	 * @param documentWidth
	 * @param documentHeight
	 */
	public JOEditorFigure(Tab tab, boolean isBrowser) {
		this.tab = tab;

		if (Rcpl.isMobile()) {
			editable = false;
		}

		externalEdits = new Vector<RcplCommand>();

		// ---------- BACKGROUND -----------------------------------------

		backGroundGroup = new Group();
		backGroundGroup.setUserData("backgroundGroup");

		pageGroup = new Group();
		pageGroup.setUserData("pageGroup");

		pageGroup.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if (event.getCode().equals(KeyCode.PAGE_DOWN)) {
					scrollPageDown();
					event.consume();
				} else if (event.getCode().equals(KeyCode.PAGE_UP)) {
					scrollPageUp();
					event.consume();
				}
			}
		});

		// ---------- SELECTION GROUP -------------------

		double x = RcplConfig.firstPageLocationX; // / getScale();
		double y = RcplConfig.firstPageLocationY; // / getScale();

		selectionGroup = new Group();
		selectionGroup.setUserData("selectionGroup");
		selectionRectangle = new Rectangle();
		selectionRectangle.setTranslateX(x);
		selectionRectangle.setTranslateY(y);
		selectionRectangle.setFill(Color.TRANSPARENT);

		selectionGroup.getChildren().add(selectionRectangle);
		selectionRectangle.setVisible(false);

		selectionStartShape = new SelectionShape(true);
		selectionStartShape.setTranslateX(x);
		selectionStartShape.setTranslateY(y);

		selectionEndShape = new SelectionShape(false);
		selectionEndShape.setTranslateX(x);
		selectionEndShape.setTranslateY(y);
		anchor = Rcpl.resources().getImage("anchor", 16, 16).getNode();
		anchor.setTranslateX(x);
		anchor.setTranslateY(y);

		anchor.setVisible(false);
		selectionGroup.getChildren().addAll(selectionStartShape, selectionEndShape, anchor);

		// -----------------------------------------------------------------------------------------------

		createEditorArea();

		showAspect();

		if (getDocument() != null) {
			configureDocument();
		}
		documentInfoContainer = new VBox();

		documentInfo = new TextArea();
		documentInfo.setWrapText(true);
		documentInfo.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
		documentInfo.setPrefHeight(100);
		// documentInfo.setOpacity(0.7);
		documentInfo.setBlendMode(BlendMode.DARKEN);
		VBox.setMargin(documentInfo, new Insets(30, 0, 30, 0));
		documentInfoContainer.getChildren().add(documentInfo);

		documentInfoContainer.layout();
		documentInfoContainer.setLayoutY(3000);
		pageGroup.getChildren().add(documentInfoContainer);

		getChildren().addAll(backGroundGroup, pageGroup, selectionGroup);

	}

	// private JOFXLayoutService layoutService;

	public void addExternalEditCommand(RcplCommand command) {
		if (!externalEdits.contains(command)) {
			externalEdits.add(command);
		}
	}

	@Override
	public void finishAddPages() {

		try {
			for (int index = 0; index < pages.size(); index++) {

				final int startIndex = index;
				new WaitThread(this) {
					@Override
					public void doRun() {
						if (pages != null) {
							IPage page = pages.get(startIndex);
							if (!pageGroup.getChildren().contains(page.getPane())) {
								pageGroup.getChildren().add(page.getPane());
							}
						}
					}
				};
				if (pages == null) {
					break;
				}
				if (isDisposed()) {
					break;
				}
			}

			new DelayedExecution(10) {

				@Override
				protected void execute() {
					JOEditorFigure.this.updatePageVisibility();
					JOEditorFigure.this.updateDocumentInfo();
				}
			};

		} catch (Exception ex) {
			// ignore
		}

	}

	@Override
	public void addPage(final IPage page) {

		if (!getDocument().isLayouted()) {
			pages.add(page);
			return;
		}

		new WaitThread(this) {

			@Override
			public void doRun() {
				if (!pageGroup.getChildren().contains(page.getPane())) {
					pages.add(page);
					pageGroup.getChildren().add(page.getPane());
				}
			}
		};

		new DelayedExecution(10) {

			@Override
			protected void execute() {
				updatePageVisibility();
			}
		};

	}

	/**
	 * @param spreadsheet
	 */
	public void addSpreadsheet(JOSpreadsheetFigure spreadsheet) {
		getSpreadsheets().add(spreadsheet);
		Tab tab = new Tab(spreadsheet.getSheet().getName());
		tab.setClosable(false);
		tab.setContent(spreadsheet);
		documentTabPane.getTabs().add(tab);
	}

	/**
	 * @param ef
	 * @return
	 */
	public boolean closeEditor() {
		try {
			// if (document != null) {
			// saveLastDocument();
			// saveLastEditPosition();
			// if (document.isDirty()) {
			//
			// // ---------- new document ---------------------------------
			//
			// if (document.isNewDocument()) {
			// int result = JOUiUtil
			// .question(Messages.JOOfficePane_DoYouWantToSaveTheChanges);
			// if (result == SWT.YES || result == SWT.OK) {
			// String[] saveAsFile = Rcpl.officePane.openFileDialog(
			// document.getFile().getAbsolutePath(),
			// SWT.SAVE);
			// if (saveAsFile != null && saveAsFile.length > 0) {
			// File f = new File(saveAsFile[0]);
			// document.setFile(f);
			// document.save();
			// } else {
			// return false;
			// }
			// } else if (result == SWT.CANCEL) {
			// return false;
			// }
			// }
			//
			// // ---------- not new document -----------------------------
			//
			// else {
			// String questionString =
			// Messages.OOXMLOfficePane_DoYouWantToChange
			// + document.getFile().getName()
			// + Messages.OOXMLOfficePane_QuestionMark;
			// int result = JOUiUtil.question(questionString);
			// if (result == SWT.YES || result == SWT.OK) {
			// document.save();
			// } else if (result == SWT.CANCEL) {
			// return false;
			// }
			// }
			// }
			//
			// // ---------- not dirty ----------------------------------------
			//
			// else if (document.isDirtyBecauseOfFirstLayout()
			// && !document.isDirty() || document.isDirtyRegistry()) {
			// if (document.isDirtyRegistry()) {
			// document.save();
			// }
			// }
			// }
			// dispose();
			// System.gc();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public void collapseHorizontalRuler() {
	}

	/**
	 * 
	 */
	private void configureDocument() {
		// boolean automaticResize = getDocument().getBoolean(
		// Rcpl.REGISTRY_AUTOMATIC_RESIZE);
		// setResizeAutomatic(automaticResize);
		// boolean twoPageLayout = getDocument().getBoolean(
		// Rcpl.REGISTRY_TWO_PAGE_LAYOUT);
		setShowOutlineParagraph(JOUtil2.getBoolean(Rcpl.TOOL_WORD_SHOW_PARAGRAPH_OUTLINE));
		setShowGrid(JOUtil2.getBoolean(Rcpl.TOOL_WORD_SHOW_GRID));
		setShowOutline(JOUtil2.getBoolean(Rcpl.TOOL_WORD_SHOW_PAGE_OUTLINE));

	}

	// private boolean requestHScroll;
	//
	// private boolean requestVScroll;

	/**
	 * @param parent
	 */
	private void createEditorArea() {

		st = new StackPane();
		st.setPrefSize(10, 10);
		st.setPickOnBounds(false);
		zScrollPane = new ZScrollPane2();
		zScrollPane.setPickOnBounds(false);

		// zScrollPane.focusedProperty().addListener(new
		// ChangeListener<Boolean>() {
		//
		// @Override
		// public void changed(ObservableValue<? extends Boolean> observable,
		// Boolean oldValue, Boolean newValue) {
		// IParagraph p = getSelectedParagraph();
		// if (p != null) {
		// p.getLayoutFigure().getPane().requestFocus();
		// }
		// }
		// });

		zScrollPane.vvalueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> ov, Number old_val, final Number new_val) {
				scrollInfoPane.fade();
				if (!inPageVisibility) {
					new DelayedExecution(100) {

						@Override
						protected void execute() {
							updatePageVisibility();
						}
					};
				}
			}
		});

		zScrollPane.setEffect(new InnerShadow());

		st.getChildren().add(zScrollPane);

		scrollInfoPane = new ScrollInfoPane(this, st);

		st.getChildren().add(scrollInfoPane.getNode());

		StackPane.setAlignment(scrollInfoPane.getNode(), Pos.CENTER_RIGHT);
		StackPane.setMargin(scrollInfoPane.getNode(), new Insets(0, 0, 0, -30));

		createVerticalEditorButtons();
		createHorizontalEditorButtons();

		if (getDocument() instanceof JOSpreadsheetDocument) {
			documentTabPane = new TabPane();
			documentTabPane.setSide(Side.BOTTOM);
			documentTabPane.setPadding(new Insets(0, 0, -24, 5));
			Tab tab = new Tab("Document");
			tab.setClosable(false);
			infoTab = new Tab("Info");
			infoTab.setClosable(false);
			infoTab.setContent(new Text("Info"));
			documentTabPane.getTabs().add(infoTab);
			tab.setContent(st);
			documentTabPane.getTabs().add(tab);
			documentTabPane.setPadding(new Insets(0, 0, 0, 0));
			documentTabPane.getSelectionModel().select(1);
			mainPane = documentTabPane;
		} else {
			mainPane = st;
		}

		zScrollPane.add(this);

		showTools(false);

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				scrollInfoPane.fade();
			}
		});
	}

	private void createHorizontalEditorButtons() {

		double startX = 70;
		double[] posX = new double[] { startX };

		double advance = 34;

		Tool emfTool = RcplFactory.eINSTANCE.createTool();
		emfTool.setId(EnCommandId.fontName.name());
		emfTool.setService(EnServiceId.PARAGRAPH_SERVICE.name());
		ITool tool = new FontNameTool(emfTool);
		Control control = (Control) tool.getNode();
		control.setPrefWidth(167);
		addHorizontalEditorToolComponent(st, (Region) tool.getNode(), 5, posX, 172);

		emfTool = RcplFactory.eINSTANCE.createTool();
		emfTool.setId(EnCommandId.fontSize.name());
		emfTool.setService(EnServiceId.PARAGRAPH_SERVICE.name());
		tool = new FontSizeTool(emfTool);
		addHorizontalEditorToolComponent(st, (Region) tool.getNode(), 5, posX, 70);

		undoRedoListener = Rcpl.getFactory().createUndoRedoTool();
		addHorizontalEditorToolComponent(st, undoRedoListener.getUndoCombo(), 5, posX, 80);
		addHorizontalEditorToolComponent(st, undoRedoListener.getUndoButton(), 5, posX, advance);
		posX[0] = startX;

		createHorizontalEditorToggleButton(st, EnCommandId.style_normal, 35, posX, advance);
		createHorizontalEditorToggleButton(st, EnCommandId.style_title, 35, posX, advance);
		createHorizontalEditorToggleButton(st, EnCommandId.style_heading_1, 35, posX, advance);
		createHorizontalEditorToggleButton(st, EnCommandId.style_heading_2, 35, posX, advance);
		createHorizontalEditorToggleButton(st, EnCommandId.style_heading_3, 35, posX, advance);
		createHorizontalEditorToggleButton(st, EnCommandId.style_heading_4, 35, posX, advance);
		createHorizontalEditorToggleButton(st, EnCommandId.style_heading_5, 35, posX, advance + 5);

		addHorizontalEditorToolComponent(st, undoRedoListener.getRedoCombo(), 35, posX, 80);
		addHorizontalEditorToolComponent(st, undoRedoListener.getRedoButton(), 35, posX, advance + 5);
	}

	private boolean editable;

	private List<Node> editorTools = new ArrayList<Node>();

	private ToggleButton bShowTools;

	private void createVerticalEditorButtons() {
		double[] posY = new double[] { 5 };

		double advance = 30;

		// ----------- show V Lineal ----------------------------

		bShowTools = createEditorToggleButton(st, EnCommandId.showTools, posY, advance, 28);
		bShowTools.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				showTools(bShowTools.isSelected());
			}
		});

		// ----------- show soft keyboard on Mobile Devices ---------

		if (Rcpl.isMobile()) {
			final ToggleButton bEdit = createEditorToggleButton(st, EnCommandId.showTools, posY, advance, 50);
			bEdit.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (bEdit.isSelected()) {
						RCPLModel.mobileProvider.showSoftKeyboard();
						editable = true;
					} else {
						RCPLModel.mobileProvider.hideSoftKeyboard();
						editable = false;
					}
				}
			});
		}

		// ----------- select ----------------------------

		final ButtonBase bSel = createEditorButton(st, EnCommandId.select, posY, 0, 28);
		bSel.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				select(getSelectedParagraph());
				updateAllSelections();
			}
		});

		// ----------- show outline ----------------------------

		final ToggleButton b = createEditorToggleButton(st, EnCommandId.showOutline, posY, advance, 28);
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				showOutline(b.isSelected());
			}
		});

		// ----------- show H Lineal ----------------------------

		final ToggleButton bHLineal = createEditorToggleButton(st, EnCommandId.showHLineal, posY, 0, 28);
		bHLineal.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				for (IPage page : pages) {
					page.getHLineal().show(bHLineal.isSelected());
				}
			}
		});

		// ----------- show V Lineal ----------------------------

		final ToggleButton bVLineal = createEditorToggleButton(st, EnCommandId.showVLineal, posY, advance, 28);
		bVLineal.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				for (IPage page : pages) {
					page.getVLineal().show(bVLineal.isSelected());
				}
			}
		});

		// ---------- zoom in ----------------------------------

		final ButtonBase b100 = createEditorButton(st, EnCommandId.zoom_in, posY, 0, 28);
		b100.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int s = ((int) (getScale() * 100)) + 10;
				if (s < 200) {
					setScale(s / 100.00);
				} else {
					setScale(2);
				}
			}
		});

		// ---------- ZOOM OUT ----------------------------------

		final ButtonBase b75 = createEditorButton(st, EnCommandId.zoom_out, posY, advance, 28);
		b75.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int s = ((int) (getScale() * 100)) - 10;
				if (s > 10) {
					setScale(s / 100.0);
				} else {
					setScale(0.1);
				}
			}
		});

		// ---------- 2 pages -----------------------------

		final ToggleButton bPage = createEditorToggleButton(st, EnCommandId.showTwoPages, posY, advance, 28);

		bPage.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (bPage.isSelected()) {
					setPageColumns(2);
				} else {
					setPageColumns(1);
				}
			}
		});

		createEditorButton(st, EnCommandId.open, posY, 0, 28);
		createEditorButton(st, EnCommandId.open_last_document, posY, advance, 28);

		createEditorButton(st, EnCommandId.save, posY, 0, 28);
		createEditorButton(st, EnCommandId.save_as, posY, advance, 28);

		createEditorButton(st, EnCommandId.test_layout, posY, 0, 28);
		createEditorButton(st, EnCommandId.test_z_order, posY, advance, 28);

		createEditorToggleButton(st, EnCommandId.bold, posY, 0, 28);
		createEditorToggleButton(st, EnCommandId.italic, posY, advance, 28);
		createEditorToggleButton(st, EnCommandId.underline, posY, 0, 28);
		createEditorToggleButton(st, EnCommandId.strikethrough, posY, advance, 28);

		createEditorToggleButton(st, EnCommandId.align_text_left, posY, 0, 28);
		createEditorToggleButton(st, EnCommandId.align_text_center, posY, advance, 28);
		createEditorToggleButton(st, EnCommandId.align_text_right, posY, 0, 28);
		createEditorToggleButton(st, EnCommandId.align_text_justify, posY, advance, 28);

	}

	private void addHorizontalEditorToolComponent(Pane st, Region node, double y, double[] pos, double advance) {
		node.setOpacity(0.8);
		node.setPrefHeight(25);
		StackPane.setAlignment(node, Pos.TOP_LEFT);
		StackPane.setMargin(node, new Insets(y, 0, 0, pos[0]));
		pos[0] += advance;
		st.getChildren().add(node);
		editorTools.add(node);
	}

	private void createHorizontalEditorToggleButton(Pane st, EnCommandId id, double y, double[] pos, double advance) {
		Tool emfTool = RcplFactory.eINSTANCE.createTool();
		emfTool.setId(id.getId());
		emfTool.setService(id.getServiceId().name());
		emfTool.setName(id.getDisplayName());
		emfTool.setImage(id.getImage());
		final JOButton b = new JOButton(emfTool);
		b.setToggle(true);
		StackPane.setAlignment(b.getNode(), Pos.TOP_LEFT);
		StackPane.setMargin(b.getNode(), new Insets(y, 0, 0, pos[0]));
		pos[0] += advance;
		st.getChildren().add(b.getNode());
		b.getNode().setPickOnBounds(false);
		editorTools.add(b.getNode());
	}

	// private void createVerticalEditorToggleButton(Pane st, EnCommandId id,
	// double x, double[] pos, double advance) {
	// Tool emfTool = RcplFactory.eINSTANCE.createTool();
	// emfTool.setId(id.getId());
	// emfTool.setService(id.getServiceId().name());
	// emfTool.setName(id.getDisplayName());
	// emfTool.setImage(id.getImage());
	// final JOButton b = new JOButton(emfTool);
	// b.setToggle(true);
	// StackPane.setAlignment(b.getNode(), Pos.TOP_LEFT);
	// StackPane.setMargin(b.getNode(), new Insets(pos[0], 0, 0, x));
	// pos[0] += advance;
	// st.getChildren().add(b.getNode());
	// editorTools.add(b.getNode());
	// }

	private ButtonBase createEditorButton(Pane st, EnCommandId id, double[] pos, double advance, double prefWidth) {
		Tool emfTool = RcplFactory.eINSTANCE.createTool();
		emfTool.setId(id.getId());
		emfTool.setService(id.getServiceId().name());
		emfTool.setName(id.getDisplayName());
		emfTool.setImage(id.getImage());
		emfTool.setType(ToolType.BUTTON);
		final JOButton b22 = new JOButton(emfTool);

		StackPane.setAlignment(b22.getNode(), Pos.TOP_LEFT);
		StackPane.setMargin(b22.getNode(), new Insets(pos[0], 0, 0, advance == 0 ? prefWidth + 10 : 5));
		pos[0] += advance;
		st.getChildren().add(b22.getNode());
		editorTools.add(b22.getNode());
		b22.getNode().setPickOnBounds(false);
		return b22.getNode();
	}

	private ToggleButton createEditorToggleButton(Pane st, EnCommandId id, double[] pos, double advance,
			double prefWidth) {
		Tool emfTool = RcplFactory.eINSTANCE.createTool();
		emfTool.setId(id.getId());
		emfTool.setService(id.getServiceId().name());
		emfTool.setName(id.getDisplayName());
		emfTool.setToolTip(id.getToolTip());
		if (id.getImage() != null) {
			emfTool.setImage(id.getImage());
		}
		emfTool.setType(ToolType.TOGGLEBUTTON);
		final JOButton b22 = new JOButton(emfTool);
		if (id.getImage() == null) {
			b22.getNode().setText(id.getDisplayName());
		}
		StackPane.setAlignment(b22.getNode(), Pos.TOP_LEFT);
		StackPane.setMargin(b22.getNode(), new Insets(pos[0], 0, 0, advance == 0 ? prefWidth + 10 : 5));
		pos[0] += advance;
		st.getChildren().add(b22.getNode());
		editorTools.add(b22.getNode());
		b22.getNode().setPickOnBounds(false);
		return (ToggleButton) b22.getNode();
	}

	@Override
	public void showTools(boolean show) {
		if (show) {
			for (Node n : editorTools) {
				if (!st.getChildren().contains(n)) {
					st.getChildren().add(n);
				}
			}
		} else {
			for (Node n : editorTools) {
				if (st.getChildren().contains(n)) {
					st.getChildren().remove(n);
				}
			}
		}

		if (!st.getChildren().contains(bShowTools)) {
			st.getChildren().add(bShowTools);
		}
	}

	/**
	 * 
	 */
	@Override
	public void dispose() {
		try {
			Rcpl.service().setEditor(null);
			List<IPage> tempPageList = new ArrayList<IPage>(pages);
			for (IPage iPage : tempPageList) {
				removePage(iPage);
			}

			st.getChildren().clear();

			tempPageList = null;

			if (disposed) {
				return;
			}
			getSpreadsheets().clear();
			disposed = true;
			doc = null;
			betweenPages = null;
			pages.clear();
			pages = null;
			betweenPages = null;
			tabItem = null;
			selectedPage = null;
			documentType = null;
			selectedLayoutObject = null;
			documentTabPane = null;
			betweenPages = null;
			tabItem = null;
			selectedPage = null;
			commandStack = null;
			selectedLayoutObject = null;
			spreadsheets = null;
			lastPaintedParagraph = null;
			lastFocussedObject = null;
			externalEdits = null;
			actualForgroundColor = null;
			actualBackgroundColor = null;
			actualHiglightColor = null;
			documentType = null;
			documentTabPane = null;
			mainPane = null;
			zScrollPane = null;
			selectionRectangle = null;
			infoTab = null;
			backGroundGroup = null;
			pageGroup = null;
			selectionGroup = null;
			tab.setUserData(null);
			tab = null;
			anchorObject = null;
			selectionStartShape = null;
			selectionEndShape = null;
			undoRedoListener = null;
			st = null;
			doc = null;

		} catch (Exception ex) {
			RCPLModel.logError(ex);
			disposed = false;
		}
	}

	@Override
	public void expandHorizontalRuler() {
		// TODO Auto-generated method stub

	}

	@Override
	public void expandVerticalArea() {
		// TODO Auto-generated method stub

	}

	@Override
	public IPage findFistPageOfSection() {
		for (IPage page : pages) {

			if (page.getSection() == this) {
				return page;
			}
		}
		return null;
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	public JOPageFigure findPageAt(int x, int y) {
		Rcpl.profile();
		// IFigure figure = findFigureAt(x, y, new TreeSearch() {
		// @Override
		// public boolean prune(IFigure fig) {
		// return false;
		// }
		//
		// @Override
		// public boolean accept(IFigure fig) {
		// if (fig instanceof JOPageFigure) {
		// return true;
		// }
		// return false;
		// }
		// });
		// Rcpl.profileEnd();
		// return (JOPageFigure) figure;

		return null;
	}

	public IColor getActualBackgroundColor() {
		return actualBackgroundColor;
	}

	public IColor getActualForgroundColor() {
		return actualForgroundColor;
	}

	public IColor getActualHiglightColor() {
		return actualHiglightColor;
	}

	public List<JOBetweenPagesFigure> getBetweenPages() {
		return betweenPages;
	}

	@Override
	public EnDocumentType getDocumentType() {
		if (documentType == null) {
			documentType = getDocument().getDocumentType();
		}
		return documentType;
	}

	@Override
	public ILayoutObject getFirstDirtyLayoutObject() {
		if (getDocument() == null) {
			return null;
		}
		for (ILayoutObject l : getDocument().getRootObjects()) {
			if (l.isDirtyLayout()) {
				return l;
			}
		}
		return null;
	}

	/**
	 * @return
	 */
	public JOParagraph getFirstParagraph() {
		return ((JOWordDocument) getDocument()).getFirstParagraph();
	}

	/**
	 * @return
	 */
	public JOObject getLastFocussedObject() {
		if (lastFocussedObject == null) {
			if (getDocument() == null) {
				return null;
			}
			Integer lastSelectedParagraphIndex = getDocument().getInteger("last_paragraph_index"); //$NON-NLS-1$
			if (lastSelectedParagraphIndex > 0) {
				if (getDocument().getParagraphs().size() > lastSelectedParagraphIndex) {
					lastFocussedObject = (JOObject) getDocument().getParagraphs().get(lastSelectedParagraphIndex);

				}
			}
		}
		return lastFocussedObject;
	}

	public int getLastMouseX() {
		return lastMouseX;
	}

	public int getLastMouseY() {
		return lastMouseY;
	}

	@Override
	public IPage getLastPage() {
		if (pages.size() > 0) {
			return pages.get(pages.size() - 1);
		}
		return null;
	}

	@Override
	public IPage getFirstPage() {
		if (pages.size() > 0) {
			return pages.get(0);
		}
		return null;
	}

	public JOParagraph getLastPaintedParagraph() {
		return lastPaintedParagraph;
	}

	/**
	 * @return
	 */
	public JOParagraph getLastParagraph() {
		for (int i = getDocument().getRootObjectsSize() - 1; i >= 0; i--) {
			if (getDocument().getRootObject(i) instanceof JOParagraph) {
				return (JOParagraph) getDocument().getRootObject(i);
			}
		}
		return null;
	}

	@Override
	public Parent getMainPane() {
		return mainPane;
	}

	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	/**
	 * @param index
	 * @return
	 */
	@Override
	public IPage getPage(int index) {
		if (index < 0 || index >= pages.size()) {
			return null;
		}
		return pages.get(index);
	}

	@Override
	public int getPageColumns() {
		return pageColumns;
	}

	@Override
	public int getPageCount() {
		if (pages == null) {
			return 0;
		}
		return pages.size();
	}

	/**
	 * @param page
	 * @return
	 */
	@Override
	public int getPageIndex(IPage page) {
		if (pages == null) {
			return -1;
		}
		int index = pages.indexOf(page);
		return index;
	}

	/**
	 * @return
	 */
	@Override
	public RcplCommand getRedo() {
		if (commandStack.size() == 0) {
			return null;
		}
		if (commandStackPointer < commandStack.size() - 1) {
			return (RcplCommand) commandStack.get(++commandStackPointer);
		}
		return null;
	}

	@Override
	public double getScale() {
		return zScrollPane.getZoom();
	}

	/**
	 * @return
	 */
	@Override
	public ILayoutObject getSelectedLayoutObject() {
		return selectedLayoutObject;
	}

	/**
	 * @return
	 */
	@Override
	public JOPageFigure getSelectedPage() {
		if (selectedPage == null && !pages.isEmpty()) {
			selectedPage = pages.get(0);
		}
		return (JOPageFigure) selectedPage;
	}

	public int getSelectedPageColumn() {
		return (getSelectedPage().getPageNumber() + 1) % pageColumns;
	}

	/**
	 * @return
	 */
	public int getSelectedPageRow() {
		return (selectedPage.getPageNumber() - 1) / pageColumns;
	}

	@Override
	public IParagraph getSelectedParagraph() {
		return (IParagraph) selectedLayoutObject;
	}

	/**
	 * @return
	 */
	public JOSpreadsheetFigure getSpreadsheetFigure() {
		Tab tab = documentTabPane.getSelectionModel().getSelectedItem();
		Node n = tab.getContent();
		if (n instanceof JOSpreadsheetFigure) {
			return (JOSpreadsheetFigure) n;
		}
		return null;
	}

	/**
	 * @return
	 */
	public List<JOSpreadsheetFigure> getSpreadsheets() {
		if (spreadsheets == null) {
			spreadsheets = new ArrayList<JOSpreadsheetFigure>();
		}
		return spreadsheets;
	}

	/**
	 * @return
	 */
	public int getStartPage() {
		return startPage;
	}

	@Override
	public Object getTabItem() {
		return tabItem;
	}

	/**
	 * @return
	 */
	@Override
	public RcplCommand getUndo() {
		if (commandStack.size() == 0) {
			return null;
		}
		if (commandStackPointer > -1) {
			return (RcplCommand) commandStack.get(commandStackPointer--);
		}
		return null;
	}

	@Override
	public boolean hasPages() {
		return pages != null && pages.size() > 0;
	}

	public boolean hasRedoCommands() {
		if (commandStack == null || commandStack.size() == 0 || commandStackPointer >= (commandStack.size() - 1)) {
			return false;
		}
		return true;
	}

	public boolean hasUndoCommands() {
		if (commandStack == null || commandStack.size() == 0 || commandStackPointer < 0) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 */
	public void hideCursor() {
	}

	public boolean isCtrlKeyDown() {
		return ctrlKeyDown;
	}

	@Override
	public boolean isDirty() {
		for (ILayoutObject l : getDocument().getRootObjects()) {
			if (l != null && l.isDirtyLayout()) {
				return true;
			}
		}
		return false;
	}

	public boolean isDirtyZOrder() {
		return dirtyZOrder;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
	}

	@Override
	public boolean isEnableCommandStack() {
		return enableCommandStack;
	}

	/**
	 * @return
	 */
	public boolean isEvenPage() {
		return ((getSelectedPage().getPageNumber()) % pageColumns) % 2 == 0;
	}

	/**
	 * @param pageFigure
	 * @return
	 */
	public boolean isEvenPage(JOPageFigure pageFigure) {
		return ((pageFigure.getPageNumber()) % pageColumns) % 2 == 0;
	}

	public boolean isFirstPage(JOPageFigure page) {
		return getPageIndex(page) == 0;
	}

	public boolean isInSelectionMode() {
		return inSelectionMode;
	}

	public boolean isLastPage(JOPageFigure page) {
		return getPageIndex(page) == getPageCount() - 1;
	}

	public boolean isLeftMouseDown() {
		return leftMouseDown;
	}

	/**
	 * @return
	 */
	public boolean isOddPage() {
		return !isEvenPage();
	}

	/**
	 * @param pageFigure
	 * @return
	 */
	public boolean isOddPage(JOPageFigure pageFigure) {
		return !isEvenPage(pageFigure);
	}

	public boolean isParagraphSelectionMode() {
		return paragraphSelectionMode;
	}

	public boolean isPrintMode() {
		return printMode;
	}

	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	public boolean isShiftKeyDown() {
		return shiftKeyDown;
	}

	public boolean isShowGrid() {
		if (getDocument() != null && getDocument().isSpreadsheet()) {
			showGrid = JOUtil2.getBoolean("word/actions/editor/grid"); //$NON-NLS-1$
		}
		return showGrid;
	}

	/**
	 * @return is outline showed
	 */
	@Override
	public boolean isShowOutline() {
		return showOutline;
	}

	/**
	 * @return
	 */
	public boolean isShowPageNumbers() {
		return showPageNumbers;
	}

	public boolean isShowRulers() {
		return showRulers;
	}

	@Override
	public boolean isSlideMasterView() {
		return slideMasterView;
	}

	@Override
	public boolean isSortMode() {
		return sortMode;
	}

	@Override
	public boolean isSuppressClipChildren() {
		return suppressClipChildren;
	}

	@Override
	public boolean isTwoPageLayout() {
		return pageColumns == 2;
	}

	@Override
	protected void layoutChildren() {
	}

	public Iterator<IPage> pageIterator() {
		return pages.iterator();
	}

	@Override
	public void layoutDocument() {
		if (isDisposed() || getDocument() == null) {
			return;
		}
		if (getDocument().isLayouted()) {
			new Thread() {
				@Override
				public void run() {
					final JOLayoutService s = new JOLayoutService();
					s.setEditor(JOEditorFigure.this);
					int index = 0;
					while (!s.ld.compleated() && getDocument() != null) {

						new WaitThread(JOEditorFigure.this) {

							@Override
							public void doRun() {
								s.layout();
							}
						};

						long delay;
						if (++index < 3) {
							delay = 1;
						} else {
							delay = 300;
						}
						try {
							Thread.sleep(delay);
						} catch (InterruptedException e) {
						}
					}
				}
			}.start();

		}
	}

	/**
	 * @param document
	 */
	@Override
	public void positionToLastEditParagraph() {
		// try {
		// if (getLastFocussedObject() instanceof JOParagraph) {
		// ((JOParagraph) lastFocussedObject).getLayoutFigure().activate(0, 0,
		// false);
		// if (lastFocussedObject.getRootObjectIndex() != 0) {
		// scrollToPage(((JOParagraph) lastFocussedObject).getPage());
		// }
		// try {
		// Integer lastCaretOffset =
		// getDocument().getInteger("last_caret_offset"); //$NON-NLS-1$
		// if (lastCaretOffset == null) {
		// lastCaretOffset = 0;
		// }
		//
		// ((JOParagraph)
		// lastFocussedObject).getLayoutFigure().setCaretOffset(lastCaretOffset);
		// } catch (Exception ex) {
		// JOModel.logError(ex);
		// }
		// } else {
		// if (getFirstParagraph() != null) {
		// getFirstParagraph().getLayoutFigure().activate(0, 0, false);
		// }
		// }
		// } catch (Exception ex) {
		// JOModel.logError(ex);
		// }
	}

	@Override
	public void push(ICommand command) {

		if (!enableCommandStack) {
			return;
		}
		try {
			while (commandStack.size() > commandStackPointer + 1) {
				commandStack.remove(commandStack.size() - 1);
			}
			commandStack.add(command);
			if (commandStack.size() > MAX_COMMAND_STACK) {
				commandStack.remove(0);
			}
			commandStackPointer = commandStack.size() - 1;

			// officePane.setUndoEnabled(true);

			// System. out.("commandStackPointer: " +
			// commandStackPointer);
			//
			// for (int i = 0; i < commandStack.size(); i++) {
			// System. out.(" cmd.getOldXmlObject(): "
			// + commandStack.get(i));
			// // + cmd.getOldXmlObject().toString());
			// }

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		notifyUndoRedoListeners();

	}

	/**
	 * 
	 */
	@Override
	public void redo() {
		// JOCommand command = getRedo();
		// int savePos = commandStackPointer;
		// int length = commandStack.size();
		// enableCommandStack = false;
		// try {
		// if (command instanceof JORootObjectChangedCommand) {
		// JORootObjectChangedCommand c = (JORootObjectChangedCommand) command;
		// Object[] oldData = c.getOldData();
		// ILayoutObject rootObject = c.getObject().getRootObject();
		// XmlObject newXmlObject = (XmlObject) oldData[0];
		// rootObject.getXmlObject().set(newXmlObject);
		// rootObject.setDirty(true);
		// rootObject.updateFromXml();
		// if (rootObject instanceof JOParagraph) {
		// Rcpl.service.getParagraphService().updateStyledText(
		// (JOParagraph) rootObject, getStyledText());
		// ((JOParagraph) rootObject).getLayoutFigure()
		// .markAllCharactersDirty();
		// ((JOParagraph) rootObject).getLayoutFigure().repaint();
		// }
		// setDirtyLayout(rootObject);
		// } else if (command != null) {
		// // Rcpl.service.actionPerformed(command, false, true);
		//
		// }
		// } catch (XmlValueDisconnectedException ex) {
		// LOGGER.warn("?", ex); //$NON-NLS-1$
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		//
		// try {
		// List<JOCommand> newStack = new ArrayList<JOCommand>();
		// for (int i = 0; i < length; i++) {
		// newStack.add(commandStack.get(i));
		// }
		// commandStack = newStack;
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		// enableCommandStack = true;
		// commandStackPointer = savePos;
		// refreshUndoButtons();
	}

	/**
	 * 
	 */
	public void refresh() {

	}

	// /**
	// *
	// */
	// @Override
	// public void refreshUndoButtons() {
	// try {
	// IOfficePane officePane = Rcpl.officePane;
	// if (officePane != null) {
	// if (commandStack.size() == 0) {
	// officePane.setUndoEnabled(false);
	// officePane.setRedoEnabled(false);
	// } else {
	// officePane.setUndoEnabled(commandStackPointer > -1);
	// officePane.setRedoEnabled(commandStackPointer < commandStack.size() - 1);
	// }
	// if (!officePane.isDisposed()) {
	// officePane.refreshUndoRedoButtons();
	// }
	// }
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// }

	/**
	 * @param updatePages
	 */
	public void removeLastPage() {
		if (pages.size() > 1) {
			IPage page = pages.get(pages.size() - 1);
			removePage(page);
		}
	}

	@Override
	public void removePage(final IPage page) {

		if (pageGroup.getScene() == null) {
			if (pages.contains(page)) {
				pages.remove(page);
				pageGroup.getChildren().remove(page.getPane());
				page.dispose();
			}
			return;
		}

		new WaitThread(this) {
			@Override
			public void doRun() {
				if (pages.contains(page)) {
					pages.remove(page);
					pageGroup.getChildren().remove(page.getPane());
				}
			}
		};
		new DelayedExecution(10) {

			@Override
			protected void execute() {
				updatePageVisibility();
			}
		};
	}

	@Override
	public void resetAll() {
		for (ILayoutObject l : getDocument().getRootObjects()) {
			if (l instanceof JOParagraph) {
				JOParagraph par = (JOParagraph) l;
				if (par.hasSelection()) {
					par.unselect();
				}
			}
		}
		setParagraphSelectionMode(false);
	}

	public void saveLastDocument() {
		if (doc.getFile() != null) {
			JOUtil2.set("infotab/actions/help/open_last_document", doc.getFile() //$NON-NLS-1$
					.getAbsolutePath());
		}
	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private void saveLastEditPosition() {
		// try {
		// JOParagraphFigure pf = getSelectedParagraphFigure();
		// if (pf != null) {
		// int index = document.getParagraphs().indexOf(pf.getParagraph());
		// getDocument().set("last_paragraph_index", index); //$NON-NLS-1$
		// getDocument()
		// .set("last_caret_offset", pf.getStyledText().getCaretOffset());
		// //$NON-NLS-1$
		// }
		// // getDocument().set("vertical_bar",
		// getVerticalBar().getSelection()); //$NON-NLS-1$
		// // getDocument().set("horizontal_bar", //$NON-NLS-1$
		// // getHorizontalBar().getSelection());
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
	}

	@Override
	public void scrollPageDown() {
		IPage newPage;
		if (actualPage.getPageNumber() < pages.size()) {
			newPage = pages.get(actualPage.getPageNumber());
		} else {
			newPage = actualPage;
		}
		if (newPage instanceof JOEmptyPageFigure) {
			setActualPage(newPage);
			scrollPageDown();
			return;
		}
		setActualPage(newPage);
		scrollToPage(newPage);
		newPage.setVisible(true);

		new DelayedExecution(100) {

			@Override
			protected void execute() {
				actualPage.setVisible(true);
				for (ILayoutFigure f : actualPage.getLayoutFigures()) {
					if (f instanceof IParagraphFigure && f.getLayoutObject().isRootObject()) {
						((IParagraphFigure) f).activate(-1, -1);
						return;
					}
				}

			}
		};

	}

	/**
	 * 
	 */
	@Override
	public void scrollPageUp() {
		IPage newPage;
		if (actualPage.getPageNumber() > 1) {
			newPage = pages.get(actualPage.getPageNumber() - 2);
		} else {
			newPage = actualPage;
		}

		setActualPage(newPage);
		scrollToPage(newPage);

		new DelayedExecution(100) {

			@Override
			protected void execute() {
				actualPage.setVisible(true);

				for (ILayoutFigure f : actualPage.getLayoutFigures()) {
					if (f instanceof IParagraphFigure && f.getLayoutObject().isRootObject()) {
						((IParagraphFigure) f).activate(-1, -1);
						return;
					}
				}

			}
		};

	}

	public void scrollToFirstPage() {
		scrollToPage(getFirstPage());
	}

	public void scrollToLastPage() {
		if (pages.size() > 0) {
			scrollToPage(getLastPage());
		}
	}

	/**
	 * @param page
	 */
	public void scrollToPage(IPage page) {
		scrollToPageV(page);
		scrollToPageH(page);
	}

	@Override
	public void stopScroll() {

	}

	public void scrollToPageV(IPage page) {
		if (page == null) {
			return;
		}
		zScrollPane.vvalueProperty().set(page.getY2() / (getHeight() - page.getHeight()));
		updatePageVisibility();
	}

	public void scrollToPageH(IPage page) {
		if (page == null) {
			return;
		}
		double h = (double) page.getPageNumber() % pageColumns / pageColumns;

		double xOffset = RcplConfig.firstPageLocationX;
		if (getSelectedParagraph() != null) {

			xOffset += getSelectedParagraph().getLayoutFigure().getPane().getLayoutX();

		}
		double hOffset = xOffset / getWidth();
		zScrollPane.hvalueProperty().set(h - hOffset);
		updatePageVisibility();
	}

	/**
	 * @param page
	 */
	public void scrollPageV(IPage page, double scrollDeltaPixel) {
		if (page == null) {
			return;
		}

		double vOffset = scrollDeltaPixel / getHeight();
		zScrollPane.vvalueProperty().set(zScrollPane.vvalueProperty().get() + vOffset);
		updatePageVisibility();
	}

	/**
	 * @param page
	 */
	public void scrollPageH(IPage page, double scrollDeltaPixel) {
		if (page == null) {
			return;
		}
		double hOffset = scrollDeltaPixel / page.getWidth();
		zScrollPane.hvalueProperty().set(zScrollPane.hvalueProperty().get() + hOffset);
		updatePageVisibility();
	}

	/**
	 * @param paragraph
	 */
	public void scrollToParagraph(JOParagraph paragraph) {
		// Rectangle rParagraph = ((ILayoutFigure)
		// paragraph.getLayoutFigure()).getBounds();
		// int y = Math.max(0, rParagraph.y - 100);
		// scrollToY((int) (y * getScale()));
	}

	public void setActualBackgroundColor(IColor actualBackgroundColor) {
		this.actualBackgroundColor = actualBackgroundColor;
	}

	public void setActualForgroundColor(IColor actualForgroundColor) {
		this.actualForgroundColor = actualForgroundColor;
	}

	public void setActualHiglightColor(IColor actualHiglightColor) {
		this.actualHiglightColor = actualHiglightColor;
	}

	@Override
	public void setBrowser(IBrowser browser) {
		// TODO Auto-generated method stub

	}

	public void setCtrlKeyDown(boolean ctrlKeyDown) {
		this.ctrlKeyDown = ctrlKeyDown;
	}

	public void setDirtyZOrder(boolean dirtyZOrder) {
		this.dirtyZOrder = dirtyZOrder;
	}

	@Override
	public void setEnableCommandStack(boolean enableCommandStack) {
		this.enableCommandStack = enableCommandStack;
	}

	public void setInSelectionMode(boolean inSelectionMode) {
		this.inSelectionMode = inSelectionMode;
	}

	public void setLastMouseX(int lastMouseX) {
		this.lastMouseX = lastMouseX;
	}

	public void setLastMouseY(int lastMouseY) {
		this.lastMouseY = lastMouseY;
	}

	public void setLastPaintedParagraph(JOParagraph lastPaintedParagraph) {
		this.lastPaintedParagraph = lastPaintedParagraph;
	}

	public void setLeftMouseDown(boolean leftMouseDown) {
		this.leftMouseDown = leftMouseDown;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	@Override
	public void setPageColumns(int pageColumns) {
		this.pageColumns = pageColumns;
		ICommand command = Rcpl.getFactory().createCommand(this, EnCommandId.layoutPages, null, null);
		Rcpl.service().execute(command);
	}

	@Override
	public void setPages(List<IPage> pages) {
		pages.clear();
		pages.addAll(pages);
	}

	public void setParagraphSelectionMode(boolean paragraphSelectionMode) {
		this.paragraphSelectionMode = paragraphSelectionMode;
	}

	/**
	 * @param printMode
	 */
	@Override
	public void setPrintMode(boolean printMode) {
		this.printMode = printMode;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	@Override
	public void setResizeAutomatic(boolean auto) {
	}

	@Override
	public void setScale(final double scale) {
		if (!getDocument().isLayouted()) {
			return;
		}
		new WaitThread(this) {
			@Override
			public void doRun() {
				doSetScale(scale);
			}
		};
	}

	private void doSetScale(double scale) {

		double w = Math.max(2, 2 / getScale());

		if (getScale() >= 1) {
			w = 2;
		}

		RcplUic.setCaretWidth(w);

		boolean firstTime = zScrollPane.isFirstTimeZoom();
		zScrollPane.zoom(scale);
		updateTabText();
		updateCanvasSize();
		if (actualPage == null) {
			setActualPage(pages.get(0));
		}

		if (firstTime) {
			new DelayedExecution(100) {

				@Override
				protected void execute() {
					updatePageVisibility();
				}
			};
		}

		double x = RcplConfig.firstPageLocationX / scale;
		double y = RcplConfig.firstPageLocationY / scale;
		documentInfoContainer.setTranslateX(x);
		documentInfoContainer.setTranslateY(y);

		for (IPage p : pages) {
			p.getNode().setTranslateX(x);
			p.getNode().setTranslateY(y);
		}

		if (scrollInfoPane.getPage() != null) {
			scrollToPage(scrollInfoPane.getPage());
		} else {
			scrollToPageV(actualPage);
		}

	}

	@Override
	public void updateDocumentInfo() {
		if (pages == null) {
			return;
		}
		if (pages.isEmpty()) {
			return;
		}
		IPage page = pages.get(pages.size() - 1);

		double y = page.getY2() + page.getHeight();
		documentInfoContainer.setPrefWidth(page.getWidth());
		StringBuilder sb = new StringBuilder();
		sb.append("Number of Pages:      " + pages.size() + "\n");

		int characterCount = getDocument().getCharacterCount();

		sb.append("Number of Characters: " + characterCount + "\n");
		documentInfo.setText(sb.toString());

		documentInfoContainer.setLayoutY(y);

	}

	@Override
	public void centerHorizontally() {

		// double max = scrollPane.getHvalue();
		// double newH = max / 2;
		// scrollPane.setHvalue(newH);

		// scrollPane.setCenterShape(true);

	}

	/**
	 * @param selectedPage
	 * @return
	 */
	@Override
	public boolean setSelectedPage(IPage selectedPage) {
		return setSelectedPage(selectedPage, true);
	}

	/**
	 * @param selectedPage
	 * @param repaint
	 * @return
	 */
	public boolean setSelectedPage(IPage selectedPage, boolean repaint) {
		if (this.selectedPage != selectedPage) {
			this.selectedPage = selectedPage;
			if (repaint) {
				updateSelectedPage();
			}
			return true;
		}
		return false;
	}

	@Override
	public void setSelectedParagraph(IParagraph paragraph) {
		try {
			if (this.selectedLayoutObject != null && this.selectedLayoutObject.isDirtyContent()) {
				this.selectedLayoutObject.commit();
			}
			if (paragraph != null && paragraph.getPage() != null) {
				paragraph.getPage().getHLineal().setParagraph(paragraph);
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		this.selectedLayoutObject = paragraph;
	}

	public void setShiftKeyDown(boolean shiftKeyDown) {
		this.shiftKeyDown = shiftKeyDown;
	}

	@Override
	public void setShowGrid(boolean showGrid) {
		this.showGrid = showGrid;

		// for (Object f : getChildren()) {
		// if (f instanceof JOPageFigure) {
		// ((IFigure) f).repaint();
		// }
		// }
	}

	@Override
	public void setShowOutline(boolean outline) {
		this.showOutline = outline;

		// for (JOFXAbstractMovableFigure lo : getDocument().getFxFigures()) {
		// lo.setOutlined(outline);
		// }
	}

	/**
	 * @param outline
	 */
	@Override
	public void setShowOutlineParagraph(boolean outline) {
		this.showOutline = outline;
	}

	/**
	 * @param showPageNumbers
	 */
	public void setShowPageNumbers(boolean showPageNumbers) {
		this.showPageNumbers = showPageNumbers;
	}

	public void setShowRulers(boolean showRulers) {
		this.showRulers = showRulers;
	}

	public void setSlideMasterView(boolean slideMasterView) {
		this.slideMasterView = slideMasterView;
	}

	@Override
	public void setSortMode(boolean sortMode) {
		this.sortMode = sortMode;
	}

	/**
	 * @param startPage
	 */
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	@Override
	public void setSuppressClipChildren(boolean suppress) {
		this.suppressClipChildren = suppress;
	}

	/**
	 * 
	 */
	@Override
	public void showAspect() {
		if (documentType == null) {
			if (getDocument() instanceof JOWordDocument) {
				this.documentType = EnDocumentType.OOXML_WORDPROCESSING;
				showAspect(documentType, true);
			} else if (getDocument() instanceof JOSpreadsheetDocument) {
				this.documentType = EnDocumentType.OOXML_SPREADSHEET;
				showAspect(documentType, false);
			} else if (getDocument() instanceof JOPresentationDocument) {
				this.documentType = EnDocumentType.OOXML_PRESENTATION;
				showAspect(documentType, false);
			}
		}

	}

	@Override
	public void showAspect(EnDocumentType documentType, boolean fx) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	public void showDefaultCursor() {
	}

	@Override
	public void showOutline(boolean show) {
		this.showOutline = show;

		Iterator<ILayoutObject> it = getDocument().layoutObjects();

		while (it.hasNext()) {
			ILayoutObject lo = it.next();
			if (lo instanceof JODrawing) {
				continue;
			}

			if (lo.getLayoutFigure() != null) {
				lo.getLayoutFigure().showOutline(show);
			}
		}

		for (IPage page : pages) {
			page.showOutline(show);
		}

	}

	@Override
	public void updateOutline() {
		if (getDocument() != null) {
			Iterator<ILayoutObject> it = getDocument().layoutObjects();

			while (it.hasNext()) {
				ILayoutObject lo = it.next();
				if (lo instanceof JODrawing) {
					continue;
				}

				if (lo.getLayoutFigure() != null) {
					try {
						lo.getLayoutFigure().refreshOutline();
					} catch (Exception ex) {
						System.out.println();
					}
				}
			}
		}
	}

	public void showRulers(boolean show) {
		ICommand command = Rcpl.getFactory().createCommand(this, EnCommandId.layoutPages, null, null);
		Rcpl.service().execute(command);
	}

	// JOSpreadsheetFigure

	@Override
	public String toString() {
		if (doc != null) {
			return doc.toString();
		}
		return super.toString();
	}

	/**
	 * 
	 */
	@Override
	public void undo() {
		final RcplCommand command = getUndo();
		int savePos = commandStackPointer;
		enableCommandStack = false;
		try {
			final ILayoutObject rootObject = command.getLayoutObject();
			if (rootObject instanceof IParagraph) {
				((IParagraph) rootObject).activate();
			}
			XmlObject newXmlObject = command.getOldXmlObject();
			rootObject.getXmlObject().set(newXmlObject);
			rootObject.setDirtyContent(true);
			rootObject.updateFromXml();
			if (rootObject instanceof JOParagraph) {
				new WaitThread(this) {

					@Override
					public void doRun() {
						((JOParagraph) rootObject).getLayoutFigure().updateFx();
						((JOParagraph) rootObject).setCaretOffset(command.getOffset());
						// JOUIC.getCaret().setX(command.getCaretX());
						// JOUIC.getCaret().setY(command.getCaretY());
						rootObject.setDirtyLayout(true);
						rootObject.getDocument().getEditor().layoutDocument();
					}
				};
			}

		} catch (XmlValueDisconnectedException ex) {
			RCPLModel.logError(ex);
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		enableCommandStack = true;
		commandStackPointer = savePos;
		notifyUndoRedoListeners();
	}

	private IPage actualPage;

	@Override
	public void updatePageVisibility() {
		if (getDocument() == null) {
			return;
		}
		if (!getDocument().isLayouted()) {
			return;
		}
		if (getMainPane().getScene() == null) {
			return;
		}

		inPageVisibility = true;
		try {
			double yTop = getMainPane().localToScreen(0, 0).getY();
			Bounds b = getMainPane().getBoundsInLocal();
			double yBottom = getMainPane().localToScreen(b.getWidth(), b.getHeight()).getY();
			double yCenter = getMainPane().localToScreen(b.getWidth(), b.getHeight() / 2).getY();

			for (IPage pg : pages) {
				if (pg.getPane().getScene() == null) {
					break;
				}
				if (!pageGroup.getChildren().contains(pg.getPane())) {
					break;
				}
				double pageTop = pg.getPane().localToScreen(0, 0).getY();
				double pageBottom = pg.getPane().localToScreen(pg.getWidth(), pg.getHeight()).getY();
				boolean visible = pageBottom > yTop && pageTop < yBottom;
				pg.setVisible(visible);
				boolean isInTheCenter = pageTop < yCenter && pageBottom > yCenter;
				if (isInTheCenter) {
					scrollInfoPane.setPage(pg);
				}
			}
			if (actualPage == null) {
				setActualPage(pages.get(0));
			}
		} catch (Exception ex) {
			// ignore
		}
		inPageVisibility = false;

	}

	private boolean inPageVisibility;

	/**
	 * @param selectedPage
	 * @return
	 */
	public void updateSelectedPage() {

	}

	public void updateTabText() {
		updateTabText(getDocument().getFile().getName(), isDirty());
	}

	@Override
	public void updateTabText(String text, boolean dirty) {
		if (getDocument() == null) {
			return;
		}
		text = getDocument().getFile().getName();
		if (text == null) {
			return;
		}
		String s = text.replace("*", "");
		if (dirty) {
			s += "*";
		}

		if (getScale() != 1) {
			s += " " + (int) (getScale() * 100) + " %";
		}

		tab.setText(s);

	}

	@Override
	public boolean isShowLines() {
		return showLines;
	}

	@Override
	public void setShowLines(boolean showLines) {
		this.showLines = showLines;
	}

	@Override
	public ILayoutObject getAnchorObject() {
		return anchorObject;
	}

	@Override
	public void setAnchorObject(ILayoutObject anchorObject) {
		this.anchorObject = anchorObject;
	}

	@Override
	public boolean isLastPage(IPage page) {
		return getPage(getPageCount() - 1) == page;
	}

	private void notifyUndoRedoListeners() {
		undoRedoListener.handle(commandStack, commandStackPointer);
	}

	@Override
	public IDocument getDocument() {
		return doc;
	}

	@Override
	public void setDocument(IDocument document) {
		this.doc = document;

		// @Override
		// public void run() {
		// try {
		// if (doc.getRootParagraphs().size() > 0) {
		// doc.getRootParagraphs().get(0).activate(true);
		// }
		// switch (getDocument().getDocumentType()) {
		// case OOXML_SPREADSHEET:
		// documentTabPane.getSelectionModel().select(2);
		// break;
		// default:
		// documentTabPane.getSelectionModel().select(1);
		// break;
		//
		// }
		// boolean selected =
		// JOSession.getDefault().getSystemPreferences().getBoolean(JOKey.SHOW_OUTLINE);
		// ICommand command =
		// Rcpl.factory.createCommand(EnServiceId.DEFAULT_SERVICE,
		// EnCommandId.showOutline,
		// null, null, selected);
		// Rcpl.service().execute(command);
		// } catch (Exception ex) {
		// ex.printStackTrace();
		// }
		// }
		// });

		if (doc != null && doc.isSpreadsheet()) {
			// spreadsheetBottomAreaFigure = new JOSpreadsheetBottomAreaFigure(
			// this);

			// ---------- editor area ; left area
			// ----------------------------------

			// spreadSheetLeftComposite = new Composite(editorArea, SWT.NONE);
			// bottomEditorArea = new GridData(SWT.FILL, SWT.FILL, true, false);
			// bottomEditorArea.heightHint = 20;
			// spreadSheetLeftComposite.setLayoutData(bottomEditorArea);
			// JOColorProvider.setBgColor(spreadSheetLeftComposite, 0.95);

			// ---------- editor area: spreadsheet tabs below spreadsheet
			// ----------

			// spreadSheetTabCanvas = new FigureCanvas(editorArea, SWT.NONE);
			// gd = new GridData(SWT.FILL, SWT.FILL, true, false);
			// gd.heightHint = 20;
			// gd.horizontalSpan = 2;
			// spreadSheetTabCanvas.setLayoutData(gd);
			// JOColorProvider.setBgColor(spreadSheetTabCanvas, 0.95);

			// spreadSheetTabCanvas.setContents(spreadsheetBottomAreaFigure);
			// spreadSheetTabCanvas
			// .setVerticalScrollBarVisibility(FigureCanvas.NEVER);
			// spreadSheetTabCanvas
			// .setHorizontalScrollBarVisibility(FigureCanvas.NEVER);
			// spreadsheetBottomAreaFigure.createContextMenu(spreadSheetTabCanvas);
			//
			// this.spreadSheetstack = new org.eclipse.draw2d.StackLayout();
			// setLayoutManager(spreadSheetstack);
			JOSpreadsheetDocument doc2 = (JOSpreadsheetDocument) doc;
			for (JOSheetPart sheet : doc2.getWorkbook().getSheets()) {
				addSpreadsheet(new JOSpreadsheetFigure(this, sheet));
			}
			// if (getSpreadsheets().size() > 0) {
			//
			// int index = doc.getWorkbook().getPoiWorkbook()
			// .getActiveSheetIndex();
			// // spreadsheetBottomAreaFigure
			// // .select(getSpreadsheets().get(index));
			// }
			documentTabPane.setTabMinHeight(TAB_HEIGHT);
			documentTabPane.setTabMaxHeight(TAB_HEIGHT);

		}
	}

	/**
	 * @param editorFigure
	 */
	@Override
	public void updateCanvasSize() {
	}

	@Override
	public void select(IParagraph paragraph) {
		if (!getDocument().isLayouted()) {
			return;
		}

		if (paragraph == null) {
			selectionStartShape.setVisible(false);
			selectionStartShape.setCharacterIndex(-1);
			selectionEndShape.setVisible(false);
			selectionEndShape.setCharacterIndex(-1);
			return;
		}

		Point2D p = calculateEditorLocation(paragraph.getLayoutFigure().getPane());
		p = new Point2D(p.getX() + RcplUic.getCaretX(), p.getY() + RcplUic.getCaretY());

		if (isStartSelected()) {
			selectionEndShape.setLocation(paragraph, paragraph.getCaretOffset(), p);
		} else {
			selectionStartShape.setLocation(paragraph, paragraph.getCaretOffset(), p);
			return;
		}

		double startY = selectionStartShape.getLocationY();
		double endY = selectionEndShape.getLocationY();

		double startX = selectionStartShape.getLocationX();
		double endX = selectionEndShape.getLocationX();

		if (selectionStartShape.getCharacterIndex() == selectionEndShape.getCharacterIndex()) {
			select(null);
			return;
		}

		if (selectionStartShape.getCharacterIndex() < selectionEndShape.getCharacterIndex()) {
			return;
		}

		// ---------- now swap ----------

		IParagraph startParagraph = selectionStartShape.getParagraph();
		IParagraph endParagraph = selectionEndShape.getParagraph();

		selectionStartShape.setParagraph(endParagraph);
		selectionEndShape.setParagraph(startParagraph);

		startX = selectionStartShape.getLocationX();
		startY = selectionStartShape.getLocationY();
		int characterStartIndex = selectionStartShape.getCharacterIndex();

		endX = selectionEndShape.getLocationX();
		endY = selectionEndShape.getLocationY();
		int characterEndIndex = selectionEndShape.getCharacterIndex();

		selectionStartShape.setLocation(selectionStartShape.getParagraph(), characterEndIndex, endX, endY);
		selectionEndShape.setLocation(selectionEndShape.getParagraph(), characterStartIndex, startX, startY);

	}

	@Override
	public void updateAllSelections() {
		if (hasSelection()) {
			Iterator<ILayoutObject> it = getDocument().layoutObjects();
			while (it.hasNext()) {
				ILayoutObject lo = it.next();
				if (lo instanceof IParagraph) {
					((IParagraph) lo).getLayoutFigure().updateSelection();
				} else if (lo instanceof ITable) {
					ITable table = (ITable) lo;

					for (ITableCell[] cellRow : table.getCells()) {
						for (ITableCell cell : cellRow) {
							if (cell != null) {
								for (IParagraph p : cell.getParagraphs()) {
									p.getLayoutFigure().updateSelection();
								}
							}
						}
					}
				} else if (!lo.getChildList().isEmpty()) {
					for (ILayoutObject lo2 : lo.getChildList()) {
						if (lo2 instanceof IParagraph) {
							((IParagraph) lo2).getLayoutFigure().updateSelection();
						}
					}
				}
			}
		}
	}

	private boolean isStartSelected() {
		return selectionStartShape.isVisible();
	}

	private Point2D calculateEditorLocation(Node n) {
		double x = 0;
		double y = 0;
		List<Parent> parents = new ArrayList<Parent>();
		Parent p = n.getParent();
		while (p != this) {
			parents.add(p);
			p = p.getParent();
		}
		for (Parent p2 : parents) {
			x += p2.getLayoutX();
			y += p2.getLayoutY();
		}
		x += n.getLayoutX();
		y += n.getLayoutY();
		return new Point2D(x, y);
	}

	@Override
	public SelectionShape getSelectionStartShape() {
		return selectionStartShape;
	}

	@Override
	public SelectionShape getSelectionEndShape() {
		return selectionEndShape;
	}

	@Override
	public boolean hasSelection() {
		return selectionStartShape.isVisible() && selectionEndShape.isVisible();
	}

	@Override
	public double getZoom() {
		return getScale();
	}

	public IPage getActivePage() {
		if (selectedLayoutObject != null) {
			return selectedLayoutObject.getPage();
		}
		return null;
	}

	@Override
	public boolean isEditable() {
		if (!Rcpl.isMobile()) {
			return true;
		}
		return editable;
	}

	@Override
	public IUndoRedoListener getUndoRedoListener() {
		return undoRedoListener;
	}

	@Override
	public void unselect() {
		Iterator<ILayoutObject> it = getDocument().layoutObjects();
		while (it.hasNext()) {
			ILayoutObject lo = it.next();
			if (lo instanceof IParagraph) {
				((IParagraph) lo).unselect();
			}
		}
		select(null);
	}

	@Override
	public void removeEmptyPages() {

		if (pages.size() == 1) {
			return;
		}

		List<IPage> pagesRO = new ArrayList<IPage>();
		pagesRO.addAll(pages);
		for (IPage page : pagesRO) {
			if (page.isEmpty() && !(page instanceof JOEmptyPageFigure)) {
				removePage(page);
			}
		}
	}

	@Override
	public boolean updateScrollTargetForCaret() {
		boolean hasScroll;
		try {
			if (getMainPane() != null && actualPage != null) {

				do {
					hasScroll = false;
					IParagraph paragraph = getSelectedParagraph();
					if (paragraph != null) {

						Point2D pC = RcplUic.getCaret().localToScreen(RcplUic.getCaretX(), RcplUic.getCaretY());
						Point2D pCBottom = RcplUic.getCaret().localToScreen(RcplUic.getCaretX(),
								RcplUic.getCaretY() + RcplUic.getCaretHeight());
						if (pC != null) {
							double additionalOffset = bShowTools.isSelected() ? 80 : 0;
							double caretX = pC.getX();
							double caretY = pC.getY();
							double caretBottom = pCBottom.getY();
							Point2D zLeftTop = zScrollPane.localToScreen(0, 0);
							Point2D zRightBottom = zScrollPane.localToScreen(zScrollPane.getViewportBounds().getWidth(),
									zScrollPane.getViewportBounds().getHeight());
							double zTop = zLeftTop.getY();
							double zBottom = zRightBottom.getY();
							double zLeft = zLeftTop.getX();
							double zRight = zRightBottom.getX();
							double caretHeight = RcplUic.getCaretHeight();

							// ---------- VERTICAL SCROLL TO SHOW THE CARET

							if (caretY < zTop) {
								double diff = zTop - caretY;
								if (diff > 0) {
									scrollPageV(actualPage, -2 * diff);
									hasScroll = true;
								}
							} else if (caretBottom > zBottom) {
								double diff = caretBottom - zBottom + caretHeight;
								if (diff > 0) {
									scrollPageV(actualPage, 1.2 * diff);
									hasScroll = true;
								}
							}

							// ---------- HORIZONTAL SCROLL TO SHOW THE CARET

							if (caretX < zLeft) {
								double diff = zLeft - caretX;
								scrollPageH(actualPage, -3 * diff);
								hasScroll = true;
							} else if (caretX > zRight) {
								double diff = caretX - zRight + 30;
								scrollPageH(actualPage, 2 * diff);
								hasScroll = true;
							}
						}
					}
				} while (hasScroll);

			}
		} catch (Exception ex) {
			// ignore
		}
		return false;
	}

	@Override
	public List<IPage> getPages() {
		return pages;
	}

	@Override
	public void setActualPage(IPage actualPage) {
		this.actualPage = actualPage;
	}

	@Override
	public void hideAnchor() {
		anchor.setVisible(false);
	}

	@Override
	public void showAnchor(ILayoutFigure figure) {
		if (figure.getLayoutObject().isRootObject()) {
			return;
		}

		if (figure.getLayoutObject().getVAnchorObject() == null) {
			return;
		}

		ILayoutFigure anchorFigure = figure.getLayoutObject().getVAnchorObject().getLayoutFigure();

		anchor.setLayoutX(anchorFigure.getX2() - 20);
		anchor.setLayoutY(anchorFigure.getY2() + 5);
		anchor.setVisible(true);

	}

	@Override
	public void showPageGroup(boolean show) {
		pageGroup.setVisible(show);
	}

}
