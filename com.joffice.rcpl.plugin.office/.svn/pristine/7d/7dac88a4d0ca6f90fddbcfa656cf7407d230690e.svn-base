package com.joffice.rcpl.plugin.office.figures.word;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.CSSTextStyles;
import org.eclipse.rcpl.DelayedExecution;
import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IDrawing;
import org.eclipse.rcpl.IEditorListener;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IOverflowable;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.ITableFigure;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplCommand;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.JOBorder;
import com.joffice.rcpl.plugin.office.databinding.types.JOAlignment;
import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab.JOTabLeader;
import com.joffice.rcpl.plugin.office.databinding.types.JOTabArray;
import com.joffice.rcpl.plugin.office.databinding2.JOLineSpacingProperty;
import com.joffice.rcpl.plugin.office.fx.figures.JOFXAbstractFigure;
import com.sun.javafx.text.TextLine;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * @author Ramin
 * 
 */
public class JOParagraphFigure extends JOFXAbstractFigure implements IParagraphFigure, IOverflowable {

	private EventHandler<MouseEvent> mouseHandler;

	enum State {
		NONE, DELETE, BACKSPACE;
	}

	class TextRunInternal {
		public int offset = -1;
		public String text;
		public Bounds bound;
		public Node node;

		public TextRunInternal(int offset, String text, Bounds bounds, Node node) {
			this.offset = offset;
			this.text = text;
			this.bound = bounds;
			this.node = node;
		}
	}

	private State state = State.NONE;

	TextFlowExt textFlow;

	private Label breakLabel;

	private Rectangle borderTop;

	private Rectangle borderBottom;

	private Rectangle borderLeft;

	private Rectangle borderRight;

	int verticalShift = 0;

	boolean atEnd;

	private boolean inCaretForward;

	private boolean inLeftSelection = false;

	private boolean inRightSelection = false;

	private EventHandler<KeyEvent> keyHandler;

	public JOParagraphFigure(ILayoutObject layoutObject) {
		this(layoutObject, false);
	}

	public JOParagraphFigure(ILayoutObject layoutObject, boolean overflowFigure) {
		super(layoutObject);
		setOverflowFigure(overflowFigure);
		createTextFlow();
		updateFx();
		addMouseHandler();
	}

	private void addMouseHandler() {
		if (mouseHandler == null) {
			mouseHandler = new EventHandler<MouseEvent>() {
				@Override
				public void handle(final MouseEvent event) {
					getEditor().stopScroll();
					processMouseEvent(event);
					getPane().requestFocus();
					event.consume();
				}
			};
			getPane().addEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler);
		}
	}

	private void removeMouseHandler() {
		if (mouseHandler != null) {
			getPane().removeEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler);
			mouseHandler = null;
		}
	}

	private void createTextFlow() {
		if (textFlow != null) {
			paragraphGroup.getChildren().remove(textFlow);
		}
		textFlow = new TextFlowExt(getLayoutObject());
		double width = getLayoutObject().getWidthPixel();
		textFlow.setPrefWidth(width);
		textFlow.setMinWidth(width);
		textFlow.setMaxWidth(width);
		textFlow.setLayoutX(0);
		textFlow.setLayoutY(0);
		addToGroup(paragraphGroup, textFlow);
	}

	@Override
	public void processMouseEvent(MouseEvent event) {
		dragAnchor = new Point2D(event.getSceneX(), event.getSceneY());

		if (event.isShiftDown()) {
			getEditor().select(getEditor().getSelectedParagraph());
		}
		deactivateAll();
		activate(event);

		if (event.getClickCount() == 2) {
			getEditor().select(getLayoutObject());
			getEditor().updateAllSelections();
		}

		else {
			if (event.isShiftDown()) {
				getEditor().select(getLayoutObject());
				getEditor().updateAllSelections();
			} else if (getEditor().hasSelection()) {
				getEditor().unselect();
			}
		}

	}

	@Override
	public void activate(final double x, final double y) {
		if (getEditor() == null) {
			return;
		}
		getLayoutObject().setOverflowActive(isOverflowFigure());
		inCaretForward = false;
		getEditor().setActualPage(getPage());

		if (getLayoutObject().getDocument().isReadOnly()) {
			getLayoutObject().getDocument().getEditor().setSelectedParagraph(getLayoutObject());
			return;
		}

		// ---------- must be here ! ---------------------------------

		if (getLayoutObject().getDocument() != null) {
			IParagraph selP = getLayoutObject().getDocument().getEditor().getSelectedParagraph();
			if (selP != null && selP.getLayoutFigure() != null) {
				if (selP != getLayoutObject()) {
					selP.getLayoutFigure().deActivate();
				}
			}
			getLayoutObject().getDocument().getEditor().setSelectedParagraph(getLayoutObject());
		}

		addKeyHandler();
		getEditor().hideAnchor();

		activateCaret(x, y);

	}

	private void activateCaret(double x, double y) {
		if (isValidActive()) {
			showCaret();
			if (x != -1) {
				updateCaret(x, y, true);
			} else {
				updateCaret();
			}
		}
	}

	public void activate(final MouseEvent mouseEvent) {

		IPage page = getPage();
		getEditor().setActualPage(page);

		try {
			double x = mouseEvent.getX();
			double y = mouseEvent.getY();

			if (getEditor().hasSelection()) {
				unselect();
				for (IParagraph p2 : getLayoutObject().getDocument().getParagraphs()) {
					p2.unselect();
				}
			}
			if (!mouseEvent.isDragDetect()) {
				activate(x, y);
			}
		} catch (ConcurrentModificationException ex) {
			RCPLModel.logError(ex);
		}
	}

	private void activatePreviousParagraph(double x) {
		IParagraph par = getLayoutObject().getPreviousRootParagraph();
		if (par != null) {
			JOParagraphFigure f = (JOParagraphFigure) par.getLayoutFigure().getFx();
			double h2 = par.getHeightPixel();
			f.activate(x, h2 - 1);
		}
	}

	public void appendText(String text) {
		boolean dirty = getLayoutObject().getDocument().isDirty();
		caretToEnd(true);
		for (int i = 0; i < text.length(); i++) {
			String c = text.substring(i, i + 1);
			KeyEvent ke = new KeyEvent(null, null, null, c, c, KeyCode.C, false, false, false, false);
			processKeyEvent(ke);
		}
		getLayoutObject().getDocument().setDirty(dirty);
	}

	private boolean applyCssStyle(Text text) {
		String css = getCssStyle();
		if (css != null) {
			text.setStyle(css);
			return true;
		}
		return false;
	}

	Rectangle2D caretBounds;

	@Override
	public void updateCaret() {
		try {
			if (!isValidActive()) {
				return;
			}
			Rectangle2D newCaretBounds = calculateCaret();
			caretBounds = newCaretBounds;

			RcplUic.setCaretHeight(Math.min(caretBounds.getHeight() * 1.15, getLayoutObject().getTextBoundsHeight()));
			double w = Math.max(2, 2 / getEditor().getScale());
			if (getEditor().getScale() >= 1) {
				w = 2;
			}
			RcplUic.setCaretWidth(w);
			RcplUic.setCaretLocation(caretBounds.getMinX(), caretBounds.getMinY());
			adjustScrollbar();

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

	}

	private void adjustScrollbar() {

		new DelayedExecution(1) {

			@Override
			protected void execute() {
				if (getEditor() != null && getEditor().updateScrollTargetForCaret()) {
					setDone(true);
				}
			}
		};
	}

	@Override
	public Rectangle2D calculateCaret() {
		return calculateCaret(getCaretOffset());
	}

	@Override
	public Rectangle2D calculateCaret(int characterOffset) {

		// ---------- LENGTH == 0 -------------------------

		if (getText().length() == 0) {
			IFont f = getLayoutObject().getStyle().getFont();
			double h = f.getHeight() * RCPLModel.FONT_HEIGHT_FACTOR;
			return new Rectangle2D(0, 0, 1, h);
		}

		// ---------- NORMAL PROCESSING --------------------

		Point2D p = textFlow.hit(characterOffset, true);
		double x2 = p.getX();
		double y2 = p.getY();

		double h;

		List<IStyle> st = getLayoutObject().findCharacterStyleAtOffset(characterOffset);

		if (!st.isEmpty()) {
			if (st.get(0).getDrawing() != null) {
				h = st.get(0).getDrawing().getImage().getHeight();
			} else {
				h = st.get(0).getFont().getHeight() * RCPLModel.FONT_HEIGHT_FACTOR;
			}
			return new Rectangle2D(x2, y2, 1, h);
		}
		return new Rectangle2D(x2, y2, 1, 10);

	}

	@Override
	public void layoutChildrenSpecial(final IPage page, final double x) {
	}

	private boolean caretBack() {
		try {
			inCaretForward = false;
			if (getText().length() == 0 || getCaretOffset() == 0) {
				activatePreviousParagraph(getWidth());
				return true;
			}

			// ---------- BACKWARD & AT BEGINNING --------------------

			if (getCaretOffset() == 0) {
				return true;
			}

			// ---------- FIND CARET OFFSET --------------------------

			getLayoutObject().backCaretOffset();
			updateCaret();
			updateTools();

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		return false;
	}

	@Override
	public double getFirstLineHeight() {
		return textFlow.getFirstLineHeight();
	}

	private void caretDown() {

		double h0 = getHeight();
		double x = RcplUic.getCaretX();
		double y = RcplUic.getCaretY();
		double h = RcplUic.getCaretHeight();
		if ((y + h) > (h0 - 10)) {
			if (getLayoutObject().hasSelection()) {
				getLayoutObject().setSelectionEnd(getText().length());
				updateSelection();
			}
			IParagraph par = getLayoutObject().getNextRootParagraph();
			if (par != null) {
				JOParagraphFigure f = (JOParagraphFigure) par.getLayoutFigure().getFx();
				f.activate(x, 0);
			}
		} else {
			int startOffset = getCaretOffset();
			y = textFlow.hit(startOffset, true).getY() + 1;
			for (int i = 0; i < 1000; y++, i++) {
				int offset = textFlow.getCharacterOffset(x, y);
				if (offset != startOffset) {
					getLayoutObject().setCaretOffset(offset);
					updateCaret();
					return;
				}
			}
		}
	}

	private boolean caretForeward(boolean toNextLineWhenAtEnd) {
		if (inCaretForward) {
			return true;
		}
		inCaretForward = true;
		try {

			// ---------- TEXT LENGTH == 0 ---------------------------

			if (getText().length() == 0) {
				IParagraph next = getLayoutObject().getNextParagraph();
				if (next != null) {
					next.getLayoutFigure().activate(-1, -1);
				}
				inCaretForward = false;
				return true;
			}

			// ---------- FOREWARD & AT END --------------------------

			if (isAtEnd()) {
				if (atEnd) {
					atEnd = false;
					if (toNextLineWhenAtEnd) {
						IParagraph next = getLayoutObject().getNextParagraph();
						if (next != null) {
							next.getLayoutFigure().activate(0, 0);
						}
						inCaretForward = false;
						return true;
					} else {
						activate(getWidth() - 1, getHeight() - 1);
						inCaretForward = false;
						return false;
					}
				}

				caretToEnd(true);
				inCaretForward = false;
				return true;
			}

			getLayoutObject().advanceCaretOffset();
			updateCaret();
			updateTools();

		} catch (Exception ex) {
			log("", ex);
		}

		inCaretForward = false;
		return false;
	}

	private void caretToBeginningOfLine() {
		inCaretForward = false;
		getLayoutObject().setCaretOffset(0);
		updateCaret();
	}

	private void caretToEnd(boolean updateCaret) {
		inCaretForward = false;
		getLayoutObject().setCaretOffset(getText().length());
		if (updateCaret) {
			updateCaret();
		}
	}

	public int getOffsetAt(double x, double y) {
		return textFlow.getCharacterOffset(x, y);
	}

	private void caretUp() {
		double x = RcplUic.getCaretX();
		double y = RcplUic.getCaretY();
		y++;
		int startOffset = getOffsetAt(x, y);
		for (; y > 0; y--) {
			int offset = getOffsetAt(x, y);
			if (offset != startOffset) {
				activate(x, y);
				getLayoutObject().setSelectionStart(-1);
				getLayoutObject().setSelectionEnd(-1);
				updateSelection();
				return;
			}
		}
		if (y <= 0) {
			activatePreviousParagraph(x);
		} else {
			getLayoutObject().setSelectionStart(-1);
			getLayoutObject().setSelectionEnd(-1);
		}
	}

	private void clearSelection() {
		inLeftSelection = false;
		inRightSelection = false;
		getEditor().unselect();
	}

	/**
	 * @Override protected JOFXAbstractMovableFigure createFxFigure() { return
	 *           new JOFXParagraphFigure(getParagraph()); }
	 * 
	 *           public JOParagraph getParagraph() { return (JOParagraph)
	 *           getLayoutObject(); }
	 * @Override public void refresh() { }
	 * 
	 *           public void selectAllParagraphs() { for (ILayoutObject par2 :
	 *           getEditor().getDocument().getRootObjects()) { if (par2
	 *           instanceof JOParagraph) { if (((JOParagraphFigure)
	 *           par2.getLayoutFigure()).select()) {
	 *           par2.getLayoutFigure().repaint(); } } } }
	 * 
	 *           public void unSelectAllParagraphs() { for (ILayoutObject par2 :
	 *           getEditor().getDocument().getRootObjects()) { if (par2
	 *           instanceof JOParagraph) { if (((JOParagraphFigure)
	 *           par2.getLayoutFigure()).unselect()) {
	 *           par2.getLayoutFigure().repaint(); } } } }
	 * 
	 *           /**
	 * @return
	 */
	private RcplCommand createChangeCommand() {
		// Object[] oldData = new Object[] { this, getStyledText().getText(),
		// getStyledText().getStyleRanges(),
		// getStyledText().getSelection(),
		// getStyledText().caretOffset, getEditor().getCaretBounds() };
		// JOCommand command = new JOCommand(
		// getEditor(),
		// getParagraph(),
		// new JOResourceEntry(
		// "actions/paragraph/text_change",
		// Messages.JOParagraphFigure_TextChange, null), "", null, oldData);
		// //$NON-NLS-1$//$NON-NLS-2$
		// return command;
		return null;
	}

	@Override
	public void deActivate() {
		getParagraph().commit();
		removeKeyHandler();
	}

	private void addKeyHandler() {
		if (keyHandler == null) {
			keyHandler = new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					processKeyEvent(event);
				}
			};
		}
		getPane().addEventHandler(KeyEvent.KEY_PRESSED, keyHandler);
	}

	private void removeKeyHandler() {
		if (keyHandler != null) {
			getPane().removeEventHandler(KeyEvent.KEY_PRESSED, keyHandler);
		}
	}

	private double doTab(Text t, JOTabArray tabArray, int[] tabIndex, double[] offset) {
		double textPosition = t.getLayoutX();
		JOTab tab;
		double tabPos;
		do {
			tab = tabArray.getTab(tabIndex[0]++);
			if (tab == null) {
				// TODO;
				continue;
			}
			tabPos = tab.getPos();
			if (tabPos > textPosition - 1) {
				// if (tab.getType().equals(JOTabType.RIGHT)) {
				// Font f = t.getFont();
				// FontMetrics fm = Toolkit.getToolkit().getFontLoader()
				// .getFontMetrics(f);
				//
				// double w2 = t.getBoundsInLocal().getWidth();
				// double w = (double) fm
				// .computeStringWidth(" " + t.getText());
				// tabPos -= w;
				//
				// tabPos -= 10;
				// }

				tabPos -= 10;
				offset[0] = tabPos - textPosition;
				return tabPos;
			}
		} while (tabIndex[0] < tabArray.getTabCount());
		return Double.MIN_VALUE;
	}

	private int findIndex(IStyle style) {
		int index = 0;
		for (IStyle st : getLayoutObject().getCharaterStyles()) {
			if (st == style) {
				return index;
			}
			index++;
		}
		return -1;
	}

	private int findNextStyleIndex(IStyle style) {
		int index = findIndex(style) + 1;
		if (index <= getLayoutObject().getCharaterStyles().length - 1) {
			return index;
		}
		return -1;
	}

	/**
	 * @param defaultStyle
	 * @param styles
	 * @param offset
	 * @return
	 */
	private IStyle findStyleAtOffset(IStyle[] styles, int offset) {
		for (IStyle iStyle : styles) {
			int start = iStyle.getStart();
			int end = iStyle.getStart() + iStyle.getLength() - 1;

			if (offset >= start && offset <= end) {
				return iStyle;
			}
		}
		return null;
	}

	private int getCaretOffset() {
		return getLayoutObject().getCaretOffset();
	}

	private String getCssStyle() {
		if (getLayoutObject().getStyle().getId().startsWith("textart")) {
			String s = getLayoutObject().getStyle().getId().replaceAll("textart", "");
			int index = Integer.valueOf(s);
			return CSSTextStyles.CSSStyles[index - 1];
		}
		return null;
	}

	@Override
	public List<ILayoutFigure> getFigureChildren() {
		List<ILayoutFigure> chs = new ArrayList<ILayoutFigure>();
		for (Node n : getFx().getPane().getChildren()) {
			Object o = n.getUserData();
			if (o instanceof ILayoutObject) {
				chs.add(((ILayoutObject) o).getLayoutFigure());
			}
		}
		return chs;
	}

	FontPosture getFontPosture(IStyle style) {
		if (style.isItalic()) {
			return FontPosture.ITALIC;
		}
		return FontPosture.REGULAR;
	}

	FontWeight getFontWeight(IStyle style) {
		if (style.isBold()) {
			return FontWeight.BOLD;
		}
		return FontWeight.NORMAL;

	}

	@Override
	public JOParagraphFigure getFx() {
		return this;
	}

	@Override
	public IParagraph getLayoutObject() {
		return (IParagraph) super.getLayoutObject();
	}

	@Override
	public IParagraph getParagraph() {
		return getLayoutObject();
	}

	private String getText() {
		try {
			return getLayoutObject().getTextBuffer().toString();
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return "";
		}
	}

	public int getVerticalShift() {
		return verticalShift;
	}

	@Override
	public void insertText(final IParagraph p, final String c) {
		if (Platform.isFxApplicationThread()) {
			if (isValidActive()) {
				JOParagraphFigure f = getOppositeFigure();
				if (f != null) {
					f.doInsertText(p, c, false);
				}
			}
			doInsertText(p, c, true);
		} else {
			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					if (isValidActive()) {
						JOParagraphFigure f = getOppositeFigure();
						if (f != null) {
							f.doInsertText(p, c, false);
						}
					}
					doInsertText(p, c, true);
				}
			});
		}
	}

	public void doInsertText(IParagraph p, String c, boolean changeCaret) {

		if (copyFromOpposite()) {
			return;
		}

		p.setDirtyContent(true);

		Node actualRun = getActualText();
		if (!(actualRun instanceof Text)) {
			return;
		}

		Text actualText = (Text) actualRun;

		// ---------- INSERT AT END --------------------------

		if (getCaretOffset() == getText().length()) {
			StringBuilder s = new StringBuilder(actualText.getText());
			s.append(c);
			actualText.setText(s.toString());
		}

		// ---------- INSERT IN THE MIDDLE -------------------

		else {
			StringBuilder s = new StringBuilder(actualText.getText());
			s.insert(textFlow.getCaretTextRunOffset(), c);
			actualText.setText(s.toString());
		}

		IStyle style = (IStyle) actualText.getUserData();
		if (style != null) {
			style.setLength(style.getLength() + 1);
		}

		int index = findNextStyleIndex(style);
		if (index != -1) {
			IStyle[] styles = p.getCharaterStyles();
			for (; index < styles.length; index++) {
				styles[index].setStart(styles[index].getStart() + 1);
			}
		}

		updateText();
		if (changeCaret) {
			caretForeward(false);
			updateHeightAndLayoutAndWait();
		}

	}

	private boolean isAtEnd() {
		int cO = getCaretOffset();
		int tO = getText().length();
		atEnd = cO == tO;
		return cO >= tO - 1;
	}

	public boolean isOutline() {
		return getEditor() != null && getEditor().isShowOutline();
	}

	/**
	 * @param defaultStyle
	 * @param styles
	 * @param offset
	 * @return
	 */
	private int lookAheadStyleAtOffset(String txt, IStyle[] styles, int offset) {
		for (IStyle iStyle : styles) {
			if (iStyle.getStart() >= offset && iStyle.getStart() + iStyle.getLength() <= offset) {
				return -1;
			}
		}
		for (int pos = offset + 1; pos < txt.length(); pos++) {
			IStyle nextStyle = findStyleAtOffset(styles, pos);
			if (nextStyle != null) {
				return pos;
			}
		}
		return -1;
	}

	// private void positionCaretToEnd() {
	// caretToEnd(false);
	// Bounds b = getLastItem().getBoundsInParent();
	// double x1 = b.getMaxX() + 1;
	// double y1 = b.getMinY() + 1;
	// RcplUic.getCaret().setX(x1);
	// setCaretHeight(b.getHeight());
	// setCaretY(y1);
	// }

	/**
	 * Delete one Character at the caret offset - 1
	 */
	private void process_BACKSPACE() {
		if (getText().length() == 0) {
			final IParagraph prev = getLayoutObject().getPreviousRootParagraph();
			process_DELETE();

			new DelayedExecution(10) {

				@Override
				protected void execute() {
					prev.setCaretOffset(prev.getTextBuffer().length());
					prev.activate();
				}
			};
			return;
		}
		caretBack();
		process_DELETE();
	}

	/**
	 * Delete one Character at the caret offset
	 */
	public void process_DELETE() {
		state = State.DELETE;
		int textLength = getText().length();
		if (textLength > 0 && getCaretOffset() >= textLength) {
			state = State.NONE;
			return;
		}

		if (textLength == 0) {
			if (getLayoutObject().getDocument().getRootObjects().size() > 1) {
				final IParagraph prev = getLayoutObject().getPreviousRootParagraph();
				final IParagraph next = getLayoutObject().getNextRootParagraph();
				if (prev != null) {
					prev.setDirtyLayout(true);
				} else {
					next.setDirtyLayout(true);
				}

				getLayoutObject().dispose();

				getEditor().layoutDocument();

				if (next != null) {
					next.activate();
					next.setCaretOffset(0);
					next.getLayoutFigure().updateCaret();
				} else if (prev != null) {
					prev.activate();
				}
			}

		} else {
			if (hasSelection()) {
				deleteSelectedCharacters();
			} else {
				deleteCharacterAtActualOffset();
			}
		}

		state = State.NONE;
	}

	private void deleteSelectedCharacters() {
		int length = getSelectionLength();
		getLayoutObject().setCaretOffset(getSelectionStart());
		for (int i = 0; i < length; i++) {
			deleteCharacterAtActualOffset();
		}
		getEditor().unselect();
		unselect();
		updateCaret();
	}

	void deleteCharacterAtActualOffset() {
		if (isValidActive()) {
			JOParagraphFigure f = getOppositeFigure();
			if (f != null) {
				f.doDeleteCharacterAtActualOffset();
			}
		}
		doDeleteCharacterAtActualOffset();
	}

	private boolean copyFromOpposite() {
		if (!isValidActive() && getLayoutObject().getOverflowParagraphFigure() != null) {
			JOParagraphFigure f = getOppositeFigure();
			textFlow.getChildren().clear();

			for (Node n : f.textFlow.getChildren()) {
				if (n instanceof Text) {
					Text t1 = (Text) n;
					Text t2 = new Text(t1.getText());
					t2.setFont(t1.getFont());
					t2.setTextAlignment(t1.getTextAlignment());
					t2.setStyle(t1.getStyle());
					textFlow.getChildren().add(t2);
				} else if (n instanceof ImageView) {
					ImageView v1 = (ImageView) n;
					ImageView v2 = new ImageView(v1.getImage());
					textFlow.getChildren().add(v2);
				}
			}

			textFlow.layout();
			return true;
		}
		return false;
	}

	void doDeleteCharacterAtActualOffset() {

		try {

			if (copyFromOpposite()) {
				return;
			}

			Node actualRun = getActualText();

			if (actualRun instanceof ImageView) {
				textFlow.getChildren().remove(actualRun);
				updateHeightAndLayoutAndWait();
				updateText();
				updateCaret();
				return;
			}

			Text actualText = (Text) actualRun;

			getLayoutObject().setDirtyContent(true);
			IStyle style = (IStyle) actualText.getUserData();

			StringBuilder s = new StringBuilder(actualText.getText());
			if (s.length() > 0) {
				try {
					s.deleteCharAt(textFlow.getCaretTextRunOffset());
				} catch (Exception ex) {
					log("", ex);
				}
				if (s.length() == 0) {
					if (textFlow.getChildren().size() > 1) {
						int oldIndex = textFlow.getChildren().indexOf(actualText);
						textFlow.getChildren().remove(actualText);
						if (oldIndex < textFlow.getChildren().size()) {
							actualRun = textFlow.getChildren().get(oldIndex);
						} else {
							actualRun = textFlow.getChildren().get(textFlow.getChildren().size() - 1);
						}
						updateCaret(RcplUic.getCaretX(), RcplUic.getCaretY(), false);
					} else {
						actualText.setText(s.toString());
					}
				} else {
					actualText.setText(s.toString());
				}

				if (actualRun instanceof Text) {
					actualText = (Text) actualRun;
				} else {
					return;
				}

				if (style != null) {
					style.setLength(style.getLength() - 1);
				}

				int index = findNextStyleIndex(style);
				IStyle[] styles = getLayoutObject().getCharaterStyles();
				if (index != -1) {
					for (; index < styles.length; index++) {
						styles[index].setStart(styles[index].getStart() - 1);
					}

				}

				// ---------- fall back to paragraph style -------

				if (getText().length() == 0) {
					actualText.setUserData(null);
					actualText.setFont(getLayoutObject().getStyle().getFont().getFx());
				}

				updateHeightAndLayoutAndWait();
				updateText();
				updateCaret();

			}
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	void process_DOWN(KeyEvent event) {

		if (event.isShiftDown()) {
			if (getLayoutObject().getSelectionStart() == -1) {
				getLayoutObject().setSelectionStart(getCaretOffset());
			}
			caretDown();
			int newOffset = getCaretOffset();
			getLayoutObject().setSelectionEnd(newOffset);
			getEditor().select(getLayoutObject());

		} else {
			getLayoutObject().setSelectionStart(-1);
			getLayoutObject().setSelectionEnd(-1);
			caretDown();
			clearSelection();
		}
		updateSelection();
		event.consume();
	}

	void process_END(KeyEvent event) {
		if (getText().length() == 0) {
			return;
		}
		if (!event.isControlDown()) {
			double startX = RcplUic.getCaretX();
			while (!caretForeward(true)) {
				// new line detected
				if (RcplUic.getCaretX() < startX) {
					caretBack();
					break;
				}
			}
		} else {
			while (!caretForeward(true))
				;
		}
		event.consume();
	}

	void process_HOME(KeyEvent event) {
		if (getText().length() == 0) {
			return;
		}
		if (!event.isControlDown()) {
			activate(0, RcplUic.getCaretY());
		} else {
			caretToBeginningOfLine();
		}
		event.consume();
	}

	void process_LEFT(KeyEvent event) {
		if (event.isShiftDown()) {
			if (inRightSelection) {
				clearSelection();
			}
			if (getLayoutObject().getSelectionStart() == -1 || getLayoutObject().getSelectionEnd() == -1) {
				getEditor().select(getLayoutObject());
				getLayoutObject().setSelectionEnd(getCaretOffset());
			}
			caretBack();
			getLayoutObject().setSelectionStart(getCaretOffset());
			getEditor().select(getLayoutObject());
			inLeftSelection = true;
			inRightSelection = false;
		} else {
			clearSelection();
			getLayoutObject().setSelectionStart(-1);
			getLayoutObject().setSelectionEnd(-1);
			caretBack();
			getEditor().select(null);
		}
		updateSelection();

	}

	void process_SOFT_NEWLINE(KeyEvent event) {
		try {
			if (hasSelection()) {
				deleteSelectedCharacters();
			}
			IParagraph p = getLayoutObject();
			String c = "\n";
			if (c.length() > 0) {
				ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.insertText, p, null, c);
				Rcpl.service().execute(command);
				event.consume();
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

	}

	void process_NEWCHARACTER(KeyEvent event) {
		try {
			if (hasSelection()) {
				deleteSelectedCharacters();
			}

			IParagraph p = getLayoutObject();

			String c = event.getText();
			if (c.length() > 0) {

				// ---------- SAVE -----------------------------------

				if (event.isControlDown()) {
					if (c.equalsIgnoreCase("X") && event.isShiftDown()) {
						Rcpl.UIC.showPerspective(RCPLModel.USE_CASE_TOOLS_ID, false);
						event.consume();
						return;
					}
					if (c.equals("s")) {
						ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.updateParagraph, p,
								null);
						Rcpl.service().execute(command);
						return;
					}

					if (c.equals("a")) {
						selectAll();
						for (IParagraph p2 : getLayoutObject().getDocument().getParagraphs()) {
							p2.selectAll();
						}
						return;
					}
				}

				ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.insertText, p, null, c);

				Rcpl.service().execute(command);

				event.consume();
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

	}

	void process_RIGHT(KeyEvent event) {
		if (event.isShiftDown()) {
			if (inLeftSelection) {
				clearSelection();
			}
			if (getLayoutObject().getSelectionStart() == -1) {
				getEditor().select(getLayoutObject());
			}
			caretForeward(true);
			getLayoutObject().setSelectionEnd(getCaretOffset());
			getEditor().select(getLayoutObject());
			inRightSelection = true;
			inLeftSelection = false;
		} else {
			getLayoutObject().setSelectionStart(-1);
			getLayoutObject().setSelectionEnd(-1);
			caretForeward(true);
			clearSelection();
		}
		updateSelection();
	}

	void process_UP(KeyEvent event) {
		if (event.isShiftDown()) {
			if (getLayoutObject().getSelectionStart() == -1) {
				getLayoutObject().setSelectionStart(getCaretOffset());
			}
			caretUp();
			int newOffset = getCaretOffset();
			getLayoutObject().setSelectionEnd(newOffset);
			getEditor().select(getLayoutObject());

		} else {
			getLayoutObject().setSelectionStart(-1);
			getLayoutObject().setSelectionEnd(-1);
			caretUp();
			clearSelection();
		}
		updateSelection();
		event.consume();
	}

	void processENTER(KeyEvent event) {
		ICommand command = null;
		boolean pageBreak = event.isControlDown();

		ILayoutObject lo = getLayoutObject();
		if (!lo.isRootObject()) {
			lo = lo.getRootObject();
		}
		int index = lo.getRootIndex();

		if (getCaretOffset() == 0) {
			if (index > 0) {
				command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.expandBefore, getLayoutObject(),
						null, pageBreak);
			}
		} else if (getCaretOffset() < getText().length() - 1) {
			command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.splitParagraph, getLayoutObject(), null,
					getCaretOffset(), pageBreak);

		} else {
			command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.expandAfter, getLayoutObject(), null,
					pageBreak);

		}
		if (command != null) {
			Rcpl.service().execute(command);
		}
		event.consume();
	}

	/**
	 * @param event
	 */
	@Override
	public void processKeyEvent(KeyEvent event) {

		if (!isValidActive()) {
			return;
		}

		if (event.getCode().equals(KeyCode.SHIFT)) {
		} else if (event.getCode().equals(KeyCode.RIGHT)) {
			event.consume();
			process_RIGHT(event);
		} else if (event.getCode().equals(KeyCode.LEFT)) {
			event.consume();
			process_LEFT(event);
		} else if (event.getCode().equals(KeyCode.END)) {
			event.consume();
			process_END(event);
		} else if (event.getCode().equals(KeyCode.HOME)) {
			event.consume();
			process_HOME(event);
		} else if (event.getCode().equals(KeyCode.UP)) {
			event.consume();
			process_UP(event);
		} else if (event.getCode().equals(KeyCode.DOWN)) {
			event.consume();
			process_DOWN(event);
		} else if (event.getCode().equals(KeyCode.BACK_SPACE)) {
			event.consume();
			process_BACKSPACE();
			getText();
		} else if (event.getCode().equals(KeyCode.DELETE)) {
			event.consume();
			process_DELETE();
			getText();
		} else if (event.getCode().equals(KeyCode.ENTER) && !event.isShiftDown()) {
			processENTER(event);
		} else if (event.getCode().equals(KeyCode.PAGE_DOWN)) {
			event.consume();
			getEditor().scrollPageDown();
		} else if (event.getCode().equals(KeyCode.PAGE_UP)) {
			event.consume();
			getEditor().scrollPageUp();
		} else {
			if (event.getCode().equals(KeyCode.ENTER) && !event.isShiftDown()) {
				process_SOFT_NEWLINE(event);
			} else {
				process_NEWCHARACTER(event);
			}
			if (!event.isConsumed()) {
				JOParagraphFigure overflowFigure = getOppositeFigure();
				if (overflowFigure != null) {
					event.consume();
					if (event.getCode().equals(KeyCode.ENTER) && !event.isShiftDown()) {
						overflowFigure.process_SOFT_NEWLINE(event);
					} else {
						overflowFigure.process_NEWCHARACTER(event);
					}
				}
			}
		}
	}

	private void removeSelectionPolygon() {
		if (!getSelectionGroup().getChildren().isEmpty()) {
			getSelectionGroup().getChildren().clear();
		}
	}

	private String replaceFromTable(String s) {
		HashMap<String, String> t = getLayoutObject().getDocument().getWordReplacements();
		if (t == null) {
			return s;
		}
		for (String key : t.keySet()) {
			s = s.replaceAll(key, t.get(key));
		}
		return s;
	}

	/**
	 * @return
	 */
	@Override
	public void resetSelection() {
		getParagraph().resetSelection();
	}

	@Override
	public void selectAll() {
		if (getText().length() > 0) {
			getLayoutObject().setSelectionStart(0);
			getLayoutObject().setSelectionEnd(getText().length());
		} else {
			getLayoutObject().setSelectionStart(-1);
			getLayoutObject().setSelectionEnd(-1);
		}
		updateSelection();
	}

	public void setAlignment(AlignType type) {
		switch (type) {
		case LEFT:
			break;
		case BOTH:
			textFlow.setTextAlignment(TextAlignment.JUSTIFY);
			break;
		case BOTTOM:
			break;
		case CENTER:
			textFlow.setTextAlignment(TextAlignment.CENTER);
			break;
		case CENTER_SELECTION:
			break;
		case DISTRIBUTE:
			break;
		case FILL:
			break;
		case GENERAL:
			break;
		case HIGH_KASHIDA:
			break;
		case JUST:
			textFlow.setTextAlignment(TextAlignment.JUSTIFY);
			break;
		case JUST_LOW:
			break;
		case LOW_KASHIDA:
			break;
		case MEDIUM_KASHIDA:
			break;
		case NUM_TAB:
			break;
		case RIGHT:
			textFlow.setTextAlignment(TextAlignment.RIGHT);
			break;
		case THAI_DISTRIBUTE:
			break;
		case TOP:
			break;
		default:
			break;
		}

	}

	private JOParagraphFigure getOppositeFigure() {
		if (isOverflowFigure()) {
			return (JOParagraphFigure) getLayoutObject().getLayoutFigure();
		}
		return (JOParagraphFigure) getLayoutObject().getOverflowParagraphFigure();
	}

	@Override
	public void setParentFigure(ILayoutFigure parentNode) {
		super.setParentFigure(parentNode);

		if (parentNode instanceof JOFXAbstractFigure) {
			JOFXAbstractFigure f = (JOFXAbstractFigure) parentNode;
			if (f.getFill() != null) {
				// textFlow.setBackground(new Background(new BackgroundFill(f
				// .getBg().getFill(), null, null)));
			}
		}
	}

	public void setSelection(int start, int end) {
		getLayoutObject().setSelectionStart(start);
		getLayoutObject().setSelectionEnd(end);
		updateSelection();
	}

	private boolean waitSetText;

	/**
	 * @param txt
	 * @param defaultStyle
	 * @param styles
	 * @return
	 */
	@Override
	public void setText(final String txt, final IStyle defaultStyle, final IStyle[] styles, final double width) {

		System.out.println("width: " + width);
		if (width == 0) {
			System.out.println();
		}

		if (Platform.isFxApplicationThread()) {
			doSetText(txt, defaultStyle, styles, width);
			updateIndent();
		} else {
			waitSetText = true;
			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					doSetText(txt, defaultStyle, styles, width);
					updateIndent();
					waitSetText = false;
				}
			});
			do {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
			} while (waitSetText);
		}
	}

	private void updateIndent() {
		if (getLayoutObject().getIndent() != null) {
			JOIndent indent = (JOIndent) getLayoutObject().getIndent().get();
			if (indent.firstLine != null) {
				double firstLineIndent = indent.firstLine.toPixel();
				ImageView iv = new ImageView();
				iv.setFitWidth(firstLineIndent);
				iv.setFitHeight(2);
				textFlow.getChildren().add(0, iv);
			} else if (indent.left != null) {
				double left = indent.left.toPixel();
				textFlow.setPadding(new Insets(0, 0, 0, left));
			} else if (indent.hanging != null) {
				double hanging = indent.hanging.toPixel();
				textFlow.setPadding(new Insets(0, 0, 0, hanging));
			}
		}
	}

	public void doSetText(String txt, IStyle defaultStyle, IStyle[] styles, double width) {

		createTextFlow();
		getLayoutObject().getTextBuffer().setLength(0);
		getLayoutObject().getTextBuffer().append(txt);
		JOLineSpacingProperty spl = (JOLineSpacingProperty) getLayoutObject().getStyle().getSpacingLine();

		double lineSpacing = getLayoutObject().getStyle().getFont().getHeight() * 0.3;
		lineSpacing *= RCPLModel.FONT_HEIGHT_FACTOR;

		if (spl != null) {
			double lsp = spl.get();
			lineSpacing *= lsp;
		}

		textFlow.setLineSpacing(lineSpacing);

		textFlow.getChildren().clear();

		if (txt.length() == 0) {
			Text newText = new Text("");
			newText.setFontSmoothingType(FontSmoothingType.LCD);
			double fontHeight = defaultStyle.getFont().getHeight() * RCPLModel.FONT_HEIGHT_FACTOR; // *
			applyCssStyle(newText);
			newText.setFont(Font.font(defaultStyle.getFont().getName(), getFontWeight(defaultStyle),
					getFontPosture(defaultStyle), fontHeight));
			textFlow.getChildren().add(newText);
			textFlow.layout();
			updateHeight();
			return;
		}

		for (int offset = 0; offset < txt.length(); offset++) {

			IStyle style = findStyleAtOffset(styles, offset);

			// --------- paragraph style ---------------------------------------

			if (style == null) {
				int pos = lookAheadStyleAtOffset(txt, styles, offset);
				if (pos == -1) {
					pos = txt.length();
				}
				String fragment = txt.substring(offset, pos);

				final Text text = new Text(replaceFromTable(fragment));

				text.setFontSmoothingType(FontSmoothingType.LCD);
				double fontHeight = defaultStyle.getFont().getHeight() * RCPLModel.FONT_HEIGHT_FACTOR;

				if (!applyCssStyle(text)) {
					text.setFill(Color.rgb((int) defaultStyle.getForeGround().getRed(),
							(int) defaultStyle.getForeGround().getGreen(),
							(int) defaultStyle.getForeGround().getBlue()));
				}

				text.setFont(Font.font(defaultStyle.getFont().getName(), getFontWeight(defaultStyle),
						getFontPosture(defaultStyle), fontHeight));

				// TODO: bug: Workaround: 2 x OBJECT_PLACEHOLDER

				if (fragment.indexOf(Rcpl.OBJECT_PLACEHOLDER) != -1) {
					text.setOpacity(0);
					text.setFont(Font.font(defaultStyle.getFont().getName(), getFontWeight(defaultStyle),
							getFontPosture(defaultStyle), 1));
					textFlow.getChildren().add(text);
					textFlow.layout();
				}

				else {
					text.setFont(Font.font(defaultStyle.getFont().getName(), getFontWeight(defaultStyle),
							getFontPosture(defaultStyle), fontHeight));
					textFlow.getChildren().add(text);
					textFlow.layout();
				}
				offset = pos - 1;

			}

			// ---------- RUN STYLE ----------------------------------

			else {

				String fragment = txt.substring(offset, Math.min(txt.length(), offset + style.getLength()));

				double fontHeight = style.getFont().getHeight() * RCPLModel.FONT_HEIGHT_FACTOR;

				// ------------ Graphic as Character ---------------------------

				if (fragment.indexOf(Rcpl.OBJECT_PLACEHOLDER) != -1) {
					IDrawing drawing = style.getDrawing();
					if (drawing != null) {
						IImage img = drawing.getImage();
						ImageView imageView;
						if (isOverflowFigure()) {
							imageView = (ImageView) img.getCopyNode();
						} else {
							imageView = (ImageView) img.getNode();
						}
						textFlow.getChildren().add(imageView);
						textFlow.layout();
					} else {
						Text text = new Text(fragment);
						text.setUserData(style);
						text.setFontSmoothingType(FontSmoothingType.LCD);
						text.setFont(Font.font(style.getFont().getName(), getFontWeight(style), getFontPosture(style),
								fontHeight));

						textFlow.getChildren().add(text);
						textFlow.layout();
						if (!applyCssStyle(text)) {
							text.setFill(style.getForeGround().getFx());
						}
					}
				}

				// ---------- styled text fragment -----------------------

				else {

					Text text = new Text(replaceFromTable(fragment));
					text.setUserData(style);

					text.setFontSmoothingType(FontSmoothingType.LCD);
					text.setFont(Font.font(style.getFont().getName(), getFontWeight(style), getFontPosture(style),
							fontHeight));
					try {
						textFlow.getChildren().add(text);
					} catch (Exception ex) {
						RCPLModel.logError(ex);
					}
					textFlow.layout();
					if (!applyCssStyle(text)) {
						if (style.getForeGround() != null) {
							text.setFill(Color.rgb((int) style.getForeGround().getRed(),
									(int) style.getForeGround().getGreen(), (int) style.getForeGround().getBlue()));
						}
					}
				}

				offset = offset + Math.max(0, style.getLength() - 1);
			}
		}

		if (getLayoutObject().getAlignment() != null) {
			setAlignment(((JOAlignment) getLayoutObject().getAlignment()).type);
		}

		updateHeight();
		updateBorder();

		if (getLayoutObject().getTabs() != null) {
			getCanvas().setHeight(getHeight());
			getCanvas().setWidth(getLayoutObject().getWidthPixel());
			Node lastN = null;
			for (Node n : textFlow.getChildren()) {
				if (n.getUserData() instanceof Object[]) {
					Object[] data = (Object[]) n.getUserData();
					if ("\t".equals(data[0])) {
						JOTabLeader leader = (JOTabLeader) data[1];
						if (leader == null) {
							break;
						}
						double x1 = 0;
						if (lastN != null) {
							x1 = lastN.getBoundsInParent().getMaxX();
						}
						double x2 = n.getBoundsInParent().getMinX();
						GraphicsContext gc = getCanvas().getGraphicsContext2D();
						gc.setFill(Color.BLACK);

						IStyle style = getLayoutObject().getStyle();
						double h = style.getFont().getHeight();
						double y = n.getBoundsInParent().getHeight() / 2;
						if (n instanceof Text) {
							y = ((Text) n).getBaselineOffset();
						}
						x1 += h;
						for (; x1 < x2 - h;) {

							switch (leader) {
							case DOT:
								// y = style.getFont().getFx().
								gc.fillOval(x1, y, h / 5, h / 5);
								break;
							case HEAVY:
								gc.fillOval(x1, y, h / 2, h / 2);
								break;
							case HYPHEN:
								gc.fillOval(x1, y, h / 2, h / 2);
								break;
							case MIDDLE_DOT:
								gc.fillOval(x1, y, h / 5, h / 5);
								break;
							case NONE:
								break;
							case UNDERSCORE:
								gc.fillRect(x1, y + h, x1 + h, y + h);
								break;
							default:
								break;

							}

							x1 += h / 2;
						}

					}
				}
				lastN = n;
			}
		}

		return;
	}

	@Override
	public void setWidth(double w) {
		super.setWidth(w);
	}

	@Override
	public void clipFigure() {
	}

	private void showCaret() {
		if (isValidActive()) {
			RcplUic.showCaret(this);
		}

	}

	private boolean isValidActive() {
		return ((getLayoutObject().isOverflowActive() && isOverflowFigure())
				|| (!getLayoutObject().isOverflowActive() && !isOverflowFigure()));
	}

	public void showColumnBreakLabel(boolean show) {

		if (!show) {
			if (breakLabel != null) {
				getPane().getChildren().remove(breakLabel);
				breakLabel = null;
			}
			return;
		}
		String middleDot = "\uc2b7";
		StringBuilder sb = new StringBuilder();
		// for (int i = 0; i < 20; i++) {
		// sb.append(middleDot);
		// }
		sb.append("----- ColumnBreak ------");
		// for (int i = 0; i < 20; i++) {
		// sb.append(middleDot);
		// }
		breakLabel = new Label(sb.toString());
		getPane().getChildren().add(0, breakLabel);

		breakLabel.setLayoutX(0);
		breakLabel.setLayoutY(getHeight() + 10);
	}

	@Override
	public void showOutline(boolean show) {
		super.showOutline(show);
	}

	@Override
	public String toString() {
		return getLayoutObject().toString();
	}

	@Override
	public void unselect() {
		removeSelectionPolygon();
	}

	public void updateBorder() {
		com.joffice.rcpl.plugin.office.JOBorder border = (JOBorder) getLayoutObject().getBorder();

		if (borderBottom != null) {
			getPane().getChildren().remove(borderBottom);
		}
		if (borderTop != null) {
			getPane().getChildren().remove(borderTop);
		}
		if (borderLeft != null) {
			getPane().getChildren().remove(borderLeft);
		}
		if (borderRight != null) {
			getPane().getChildren().remove(borderRight);
		}

		if (border != null) {
			if (border.getDistanceBottom() != null) {
				borderBottom = new Rectangle();
				double w = Math.max(1, border.getLineWidthBottom().toPixel());
				borderBottom.setHeight(w - 0.5);
				if (border.getBorderColorBottom() != null) {
					borderBottom.setFill(border.getBorderColorBottom().getFx());
				}
				borderBottom.setWidth(getLayoutObject().getWidthPixel() + 2 * 2 + 1);
				borderBottom.setLayoutX(-w - 0.5);
				borderBottom.setLayoutY(getLayoutObject().getHeightPixel() + w + 0.5);
				getPane().getChildren().add(borderBottom);
			}

			if (border.getDistanceTop() != null) {
				borderTop = new Rectangle();
				double w = Math.max(1, border.getLineWidthTop().toPixel());
				borderTop.setHeight(w - 0.5);
				if (border.getBorderColorTop() != null) {
					borderTop.setFill(border.getBorderColorTop().getFx());
				}
				borderTop.setWidth(getLayoutObject().getWidthPixel() + 2 * 2 + 1);
				borderTop.setLayoutX(-w - 0.5);
				borderTop.setLayoutY(0);
				getPane().getChildren().add(borderTop);
			}

			if (border.getDistanceLeft() != null) {
				borderLeft = new Rectangle();
				double w = Math.max(1, border.getLineWidthLeft().toPixel());
				borderLeft.setWidth(w - 0.5);
				if (border.getBorderColorLeft() != null) {
					borderLeft.setFill(border.getBorderColorLeft().getFx());
				}
				borderLeft.setHeight(getLayoutObject().getHeightPixel() + 2 * 2 + 1);
				borderLeft.setLayoutX(-w - 0.5);
				borderLeft.setLayoutY(0);
				getPane().getChildren().add(borderLeft);
			}

			if (border.getDistanceRight() != null) {
				borderRight = new Rectangle();
				double w = Math.max(1, border.getLineWidthRight().toPixel());
				borderRight.setWidth(w - 0.5);
				if (border.getBorderColorRight() != null) {
					borderRight.setFill(border.getBorderColorRight().getFx());
				}
				borderRight.setHeight(getLayoutObject().getHeightPixel() + 2 * 2 + 1);
				borderRight.setLayoutX(getLayoutObject().getWidthPixel() - w - 0.5);
				borderRight.setLayoutY(0);
				getPane().getChildren().add(borderRight);
			}

		}
	}

	/**
	 * @param x
	 * @param y
	 */
	private void updateCaret(double x, double y, boolean updateOffsets) {
		if (State.DELETE.equals(state)) {
			return;
		}

		if (getLayoutObject().isOverflowActive() && !isOverflowFigure()) {
			return;
		}

		if (getText().length() > 0) {
			int caretOffset = textFlow.getCharacterOffset(x + 2, y);
			getLayoutObject().setCaretOffset(caretOffset);
			textFlow.adjustCaretOffset(x, y);
		}
		updateCaret();
		updateTools();
	}

	@Override
	public void updateTools() {
		IStyle st = findStyleAtOffset(getLayoutObject().getCharaterStyles(), getCaretOffset());
		final JOEvent ev = new JOEvent(getLayoutObject(), st, null);
		for (final IEditorListener l : Rcpl.getEditorListeners()) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					l.update(ev);
				}
			});
		}
	}

	// /**
	// * This is needed because of Drawing (Objectplaceholder)
	// */
	// private String savedText;

	@Override
	public void updateFx() {
		try {
			IParagraph p = getLayoutObject();
			String txt = p.getTextBuffer().toString();
			updateFx(txt);
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	private void updateFx(final String txt) {
		final IParagraph p = getLayoutObject();
		if (getPane().getScene() == null) {
			setText(txt, p.getStyle(), p.getCharaterStyles(), p.getWidthPixel());
			return;
		}

		if (Platform.isFxApplicationThread()) {
			setText(txt, p.getStyle(), p.getCharaterStyles(), p.getWidthPixel());
		} else {
			new WaitThread(getEditor()) {
				@Override
				public void doRun() {
					setText(txt, p.getStyle(), p.getCharaterStyles(), p.getWidthPixel());
				}
			};
		}
	}

	/**
	 * Calculates the height as the height of the main part and the overflow
	 * excess part
	 * 
	 * @return
	 */
	private boolean updateHeight() {

		double oldTextBoundHeight = getLayoutObject().getTextBoundsHeight();
		double newTextBoundHeight;

		// ---------- HEIGHT TEXTLENGTH == 0 -----------------------------

		newTextBoundHeight = textFlow.calculateHeight();
		getLayoutObject().setTextBoundsHeight(newTextBoundHeight);
		setHeight(newTextBoundHeight);

		// ---------- HEIGHT CHANGED -----------------------------------

		if (oldTextBoundHeight != newTextBoundHeight) {
			getLayoutObject().setHeightPixel(newTextBoundHeight);
			setHeight(getLayoutObject().getTextBoundsHeight());
			return true;
		}

		return false;
	}

	@Override
	public void updateHeightAndLayoutAndWait() {
		if (updateHeight()) {
			if (getLayoutObject().isRootObject()) {
				getLayoutObject().setDirtyLayout(true);
				getEditor().layoutDocument();
			} else {
				if (getLayoutObject().getTableCell() != null) {
					ITableFigure f = getLayoutObject().getTableCell().getTable().getLayoutFigure();
					f.refresh();
					f.getLayoutObject().getRootObject().setDirtyLayout(true);
					getEditor().layoutDocument();
				}
			}
		}
	}

	/**
	 * 
	 */
	@Override
	public void updateSelection() {

		int s1 = getLayoutObject().getSelectionStart();
		int s2 = getLayoutObject().getSelectionEnd();
		if (s1 != -1 && s2 != -1 && s1 != s2) {
			PathElement[] paths = textFlow.getRangeShape(getLayoutObject().getSelectionStart(),
					getLayoutObject().getSelectionEnd());
			Polygon p = new Polygon();

			boolean moveTo = false;
			for (PathElement pe : paths) {
				if (pe instanceof MoveTo) {
					if (!moveTo) {
						moveTo = true;
						p.getPoints().add(((MoveTo) pe).getX());
						p.getPoints().add(((MoveTo) pe).getY());
					}
				} else if (pe instanceof LineTo) {
					p.getPoints().add(((LineTo) pe).getX());
					p.getPoints().add(((LineTo) pe).getY());
				}
			}
			p.setFill(Color.CORNFLOWERBLUE);
			getSelectionGroup().getChildren().add(p);

			p.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					if (getEditor().hasSelection()) {
						getEditor().select(null);
						getEditor().updateAllSelections();
					}
				}
			});
		} else {
			removeSelectionPolygon();
		}
	}

	@Override
	public void updateSelection(Rectangle selectionRectangle) {

		if (selectionRectangle == null || selectionRectangle.getWidth() <= 0 || selectionRectangle.getHeight() <= 0) {
			unselect();
			return;
		}

		if (getLayoutObject() != null) {
			if (getLayoutObject().getPage() != null) {

				final Point2D nodeCoordR = selectionRectangle.localToScene(0.0, 0.0);

				Rectangle2D rR = new Rectangle2D(nodeCoordR.getX(), nodeCoordR.getY(), selectionRectangle.getWidth(),
						selectionRectangle.getHeight());
				final Point2D nodeCoord = getPane().localToScene(0.0, 0.0);
				Rectangle2D nR = new Rectangle2D(nodeCoord.getX(), nodeCoord.getY(), getWidth(), getHeight());
				Rectangle sR = new Rectangle(rR.getMinX(), rR.getMinY(), rR.getWidth(), rR.getHeight());
				Rectangle sN = new Rectangle(nR.getMinX(), nR.getMinY(), nR.getWidth(), nR.getHeight());
				Path path = (Path) Shape.intersect(sR, sN);
				Bounds b = path.getLayoutBounds();
				if (rR.intersects(nR)) {
					if (rR.contains(nR)) {
						selectAll();
					} else {
						Rectangle2D hitR = new Rectangle2D(b.getMinX() - nodeCoord.getX(),
								b.getMinY() - nodeCoord.getY(), b.getWidth(), b.getHeight());
						int start = 0;
						int end = 0;

						if (getLayoutObject().getPreviousRootParagraph() != null
								&& getLayoutObject().getPreviousRootParagraph().hasSelection()) {
							start = 0;
						} else {
							for (Node n : textFlow.getChildren()) {
								if (n instanceof Text) {
									Text t = (Text) n;
									if (t.contains(hitR.getMinX(), hitR.getMinY())) {
										start = textFlow.getCharacterOffset(hitR.getMinX(), hitR.getMinY());
										break;
									}
								}
							}
						}

						if (rR.getMaxX() > nR.getMaxX() && rR.getMaxY() > nR.getMaxY()) {
							end = getText().length();
						} else {
							for (Node n : textFlow.getChildren()) {
								if (n instanceof Text) {
									Text t = (Text) n;
									if (t.contains(hitR.getMaxX(), hitR.getMaxY())) {
										end = textFlow.getCharacterOffset(hitR.getMaxX() - 1, hitR.getMaxY() - 1);
										break;
									}
								}
							}
						}
						if (start > 0 && end == 0) {
							end = getText().length();
						} else if (start == 0 && end == 0) {
							end = getText().length();
						}

						setSelection(start, end);

					}
				}

			} else {
				RCPLModel.logError(new Exception("layoutObject without Page!!!"));
			}
		}

	}

	private String updateText() {
		String s = textFlow.getText();
		getLayoutObject().getTextBuffer().setLength(0);
		getLayoutObject().getTextBuffer().append(s);
		return s;
	}

	@Override
	public boolean hasSelection() {
		int end = getSelectionEnd();
		int start = getSelectionStart();
		return end > -1 && start > -1 && end != start;
	}

	@Override
	public int getSelectionStart() {
		return getParagraph().getSelectionStart();
	}

	@Override
	public int getSelectionEnd() {
		return getParagraph().getSelectionEnd();
	}

	@Override
	public int getSelectionLength() {
		return getParagraph().getSelectionLength();
	}

	// @Override
	// public TextFlow getOverflowTextFlow() {
	// return textFlow.getTextFlowOverflow();
	// }

	@Override
	public Node getActualText() {
		return textFlow.getActualText();
	}

	@Override
	protected Pane createPane() {
		Pane pane = new Pane();
		return pane;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
	}

	@Override
	public void detach() {
		removeMouseHandler();
		removeKeyHandler();
		if (getPage() != null) {
			getPage().remove(this);
		}
	}

	@Override
	public void setOverflowExcess(double overflowExcess, double remaining) {

		if (isOverflowFigure()) {
			return;
		}

		if (overflowExcess > 0) {
			TextLine[] lines = textFlow.getLines();

			if (lines.length == 1) {
				super.setOverflowExcess(0, 0);
				return;
			}

			if (overflowExcess > 0) {
				double total = overflowExcess + remaining;
				for (int i = 0; i < textFlow.getLineCount(); i++) {
					double y = textFlow.getLineY(i);
					TextLine line = lines[i];
					double yBottom = y + line.getBounds().getHeight();
					if (yBottom >= remaining) {
						remaining = y - 1;
						overflowExcess = total - remaining;
						break;
					}
				}
				super.setOverflowExcess(overflowExcess, remaining);
				if (!isOverflowFigure() && getLayoutObject().getOverflowParagraphFigure() == null) {
					getLayoutObject().createOverflowFigure();
				} else if (!isOverflowFigure()) {
					getLayoutObject().updateOverflowClipping();
				}
				return;
			}
		} else {
			if (getLayoutObject().getOverflowParagraphFigure() != null) {
				getLayoutObject().detachOverflowFigure();
			}
		}
		super.setOverflowExcess(overflowExcess, remaining);

	}

	@Override
	public double getRemaining() {
		if (isOverflowFigure()) {
			return getLayoutObject().getLayoutFigure().getRemaining();
		}
		return super.getRemaining();
	}

	@Override
	public void dispose() {
		super.dispose();
		detach();
	}

}
