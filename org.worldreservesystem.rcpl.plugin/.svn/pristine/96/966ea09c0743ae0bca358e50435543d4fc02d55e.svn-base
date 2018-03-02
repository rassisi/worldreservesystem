package com.joffice.rcpl.plugin.office.figures.word;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab;
import com.joffice.rcpl.plugin.office.databinding.types.JOTabArray;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab.JOTabLeader;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab.JOTabType;
import com.joffice.rcpl.plugin.office.internal.config.JOConversion;
import com.sun.javafx.geom.RectBounds;
import com.sun.javafx.scene.text.GlyphList;
import com.sun.javafx.scene.text.HitInfo;
import com.sun.javafx.scene.text.TextLayout;
import com.sun.javafx.scene.text.TextSpan;
import com.sun.javafx.text.PrismTextLayout;
import com.sun.javafx.text.TextLine;

import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.PathElement;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * Adds additional API to {@link TextFlow}.
 */
@SuppressWarnings("restriction")
public class TextFlowExt extends TextFlow {

	private static Method mGetTextLayout;
	private static Method mGetLines;
	private static Method mGetLineIndex;
	private static Method mGetCharCount;
	private static Method mGetSpanBounds;
	private static Method mLayoutSpan;
	private static Method mGetNode;

	private static Field fInLayout;

	private static Class<?> mEmbeddedSpan;

	private IParagraph layoutObject;

	private boolean isInLayout;

	public TextFlowExt(IParagraph layoutObject) {
		super();
		this.layoutObject = layoutObject;
	}

	static {
		try {
			mGetTextLayout = TextFlow.class.getDeclaredMethod("getTextLayout");
			mGetLines = PrismTextLayout.class.getDeclaredMethod("getLines");
			mGetLineIndex = PrismTextLayout.class.getDeclaredMethod("getLineIndex", float.class);
			mGetCharCount = PrismTextLayout.class.getDeclaredMethod("getCharCount");
			mGetSpanBounds = Text.class.getDeclaredMethod("getSpanBounds");
			mLayoutSpan = Text.class.getDeclaredMethod("layoutSpan", GlyphList[].class);
			mEmbeddedSpan = Class.forName("javafx.scene.text.TextFlow$EmbeddedSpan");
			mGetNode = mEmbeddedSpan.getDeclaredMethod("getNode");
			fInLayout = TextFlow.class.getDeclaredField("inLayout");

		} catch (Exception ex) {
			// {
			throw new RuntimeException(ex);
		}
		mGetTextLayout.setAccessible(true);
		mGetLines.setAccessible(true);
		mGetLineIndex.setAccessible(true);
		mGetCharCount.setAccessible(true);
		mGetSpanBounds.setAccessible(true);
		mLayoutSpan.setAccessible(true);
		mGetNode.setAccessible(true);
		fInLayout.setAccessible(true);
	}

	private static Object invoke(Method m, Object obj, Object... args) {
		try {
			return m.invoke(obj, args);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public int getLineCount() {
		return getLines().length;
	}

	public int getLineOfCharacter(int charIdx) {
		// TextLine[] lines = getLines();
		// TwoLevelNavigator navigator = new TwoLevelNavigator(() ->
		// lines.length, i -> lines[i].getLength());
		// return navigator.offsetToPosition(charIdx, Forward).getMajor();

		return 0;

	}

	public PathElement[] getCaretShape(int charIdx, boolean isLeading) {
		return textLayout().getCaretShape(charIdx, isLeading, 0.0f, 0.0f);
	}

	public Point2D hit(int characterIndex, boolean leading) {
		PathElement[] p = getCaretShape(characterIndex, leading);
		MoveTo m = (MoveTo) p[0];

		double x = m.getX();

		Node n0 = getChildren().get(0);
		if (n0 instanceof ImageView) {
			ImageView iv = (ImageView) n0;
			if (iv.getFitHeight() == 2) {
				x += iv.getFitWidth();
			}
		}

		if (getPadding() != null) {
			x += getPadding().getLeft();
		}

		return new Point2D(x, m.getY());
	}

	public PathElement[] getRangeShape(int from, int to) {
		return textLayout().getRange(from, to, TextLayout.TYPE_TEXT, 0, 0);
	}

	public int getCharacterOffset(double x, double y) {
		try {

			CharacterHit hit = hit(x, y);
			int result = hit.getCharacterIndex();
			return result;
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return 0;
		}
	}

	private CharacterHit hit(double x, double y) {

		Node n0 = getChildren().get(0);
		if (n0 instanceof ImageView) {
			ImageView iv = (ImageView) n0;
			if (iv.getFitHeight() == 2) {
				x -= iv.getFitWidth();
			}
		}

		if (getPadding() != null) {
			x -= getPadding().getLeft();
		}

		HitInfo hit = textLayout().getHitInfo((float) x, (float) y);
		int charIdx = hit.getCharIndex();

		int lineIdx = getLineIndex((float) y);
		if (lineIdx >= getLineCount()) {
			return CharacterHit.after(getCharCount() - 1);
		}

		TextLine line = getLines()[lineIdx];
		RectBounds lineBounds = line.getBounds();

		if (x < lineBounds.getMinX() || x > lineBounds.getMaxX()) {
			if (hit.isLeading()) {
				return CharacterHit.before(charIdx);
			} else {
				return CharacterHit.after(charIdx);
			}
		} else {
			if (hit.isLeading()) {
				return CharacterHit.leadingHalfOf(charIdx);
			} else {
				return CharacterHit.trailingHalfOf(charIdx);
			}
		}

	}

	public void adjustCaretOffset(double x, double y) {
		try {
			CharacterHit hit = hit(x, y);
			switch (hit.getHitType()) {
			case AFTER:
				layoutObject.advanceCaretOffset();
				break;
			case BEFORE:
				break;
			case LEADING_HALF:
				break;
			case TRAILING_HALF:
				break;
			default:
				break;

			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	public float getLineY(int index) {
		TextLine[] lines = getLines();
		float spacing = (float) getLineSpacing();
		float lineY = 0;
		for (int i = 0; i < index; ++i) {
			lineY += lines[i].getBounds().getHeight() + spacing;
		}
		return lineY;
	}

	public float getLineCenter(int index) {
		return getLineY(index) + getLines()[index].getBounds().getHeight() / 2;
	}

	public TextLine[] getLines() {
		return (TextLine[]) invoke(mGetLines, textLayout());
	}

	private int getLineIndex(float y) {
		return (Integer) invoke(mGetLineIndex, textLayout(), y);
	}

	private int getCharCount() {
		return (Integer) invoke(mGetCharCount, textLayout());
	}

	private TextLayout textLayout() {
		return (TextLayout) invoke(mGetTextLayout, this);
	}

	public void layoutSpan(Text text, GlyphList[] list) {
		invoke(mLayoutSpan, text, (Object[]) list);
	}

	public Node getEmbeddedSpansNode(TextSpan span) {
		return (Node) invoke(mGetNode, span);
	}

	@Override
	protected void layoutChildren() {
		try {
			super.layoutChildren();
			isInLayout = true;
		} catch (Exception ex) {
			isInLayout = false;
			return;
		}
		layoutChildrenSpecial();
		isInLayout = false;
	}

	public void setInLayout(boolean isInLayout) {
		this.isInLayout = isInLayout;
	}

	private void layoutChildrenSpecial() {
		if (layoutObject != null) {

			IJOProperty tabs = layoutObject.getTabs();

			if (tabs != null) {
				JOTabArray tabArray = null;
				if (tabs != null) {
					tabArray = (JOTabArray) tabs.get();
				}

				if (tabArray != null) {

					boolean requestTab = false;

					double shift = 0;

					for (int index = 0; index < getChildren().size(); index++) {
						Node n = getChildren().get(index);
						if (n instanceof Text) {
							Text t = (Text) n;
							String s = t.getText();

							double y = t.getBoundsInParent().getMinY();
							double x = t.getBoundsInParent().getMinX();

							if (s.startsWith("\t") || requestTab) {
								requestTab = false;
								JOTab lastTab = null;

								for (int i = tabArray.getTabCount() - 1; i > 0; i--) {
									JOTab tab = tabArray.getTab(i);

									double tabPos = tab.getPos();
									double nextPos = tabPos;

									if (x >= tabPos) {
										if (i > 0 && lastTab != null) {
											nextPos = lastTab.getPos();
										}

										double w = t.getBoundsInLocal().getWidth();
										double leftNextPos = nextPos - w;

										switch (tab.getType()) {
										case BAR:
											shift = leftNextPos - x;
											t.relocate(nextPos - w, y);
											break;
										case CENTER:
											shift = leftNextPos - x;
											t.relocate(nextPos - w / 2, y);
											break;
										case CLEAR:
											shift = leftNextPos - x;
											t.relocate(nextPos, y);
											break;
										case DECIMAL:
											shift = nextPos - w - x;
											t.relocate(leftNextPos, y);
											break;
										case LEFT:
											int start = getChildren().indexOf(n);
											List<Node> nodes = new ArrayList<Node>();
											nodes.add(n);
											n.setUserData(new Object[] { "\t",
													lastTab != null ? lastTab.getLeader() : JOTabLeader.NONE });

											for (int index2 = start + 1; index2 < getChildren().size(); index2++) {
												Node n2 = getChildren().get(index2);
												if (n2 instanceof Text) {
													if (((Text) n2).getText().indexOf("\t") != -1) {
														break;
													}
												}
												nodes.add(n2);
												index++;
											}
											double sh = nextPos;
											int index2 = nodes.size() - 1;
											for (; index2 >= 0; index2--) {
												Node n2 = nodes.get(index2);
												sh -= n2.getBoundsInLocal().getWidth();
												n2.relocate(sh, y);
											}
											shift = 0;
											w = 0;
											break;
										case NUM:
											shift = nextPos - w - x;
											t.relocate(nextPos - w, y);
											break;
										case RIGHT:
											shift = nextPos - w - x;
											t.relocate(nextPos - w, y);
											break;
										default:
											shift = nextPos - w - x;
											t.relocate(nextPos, y);
											break;

										}
										break;
									}

									lastTab = tab;
								}
							} else if (shift > 0) {
								t.relocate(x + shift, y);

							}
							if (s.endsWith("\t")) {
								requestTab = true;
							}
						}
					}
				}
			}
		}
	}

	public void deleteCharAtOffset(int offset) {
		// textLayout().
	}

	private int getCaretOffset() {
		return layoutObject.getCaretOffset();
	}

	public double getFirstLineHeight() {
		com.sun.javafx.scene.text.TextLine[] lines = textLayout().getLines();
		if (lines != null && lines.length > 0) {
			return lines[0].getBounds().getHeight();
		}
		return getBoundsInLocal().getHeight();
	}

	public Node getActualText() {
		int pos = 0;
		for (Node n : getChildren()) {
			if (n instanceof Text) {
				Text txt = (Text) n;
				int l = txt.getText().length();
				if (getCaretOffset() >= pos && getCaretOffset() < pos + l) {
					return txt;
				}
				pos += l;
			} else if (n instanceof ImageView) {
				if (getCaretOffset() == pos) {
					return n;
				}
				pos += 1;
			}
		}

		if (getChildren().size() == 0) {
			Text text = new Text("");
			getChildren().add(text);
		}

		return getChildren().get(getChildren().size() - 1);
	}

	public int getCaretTextRunOffset() {
		int pos = 0;
		int offset = getCaretOffset();
		for (Node n : getChildren()) {
			if (n instanceof Text) {
				Text txt = (Text) n;
				int l = txt.getText().length();
				if (offset >= pos && offset < pos + l) {
					return offset - pos;
				}
				pos += l;
			} else if (n instanceof ImageView) {
				if (offset >= pos && offset < pos + 1) {
					return offset - pos;
				}
				pos += 1;
			}
		}

		return getCaretOffset();
	}

	public String getText1() {

		StringBuilder sb = new StringBuilder();
		for (Node n : getChildren()) {
			if (n instanceof Text) {
				Text txt = (Text) n;
				sb.append(txt.getText());
			} else if (n instanceof ImageView) {
				sb.append(Rcpl.OBJECT_PLACEHOLDER);
			}
		}

		return sb.toString();
	}

	public String getText() {

		StringBuilder sb = new StringBuilder();
		for (Node n : getChildren()) {
			if (n instanceof Text) {
				Text txt = (Text) n;
				sb.append(txt.getText());
			} else if (n instanceof ImageView) {
				sb.append(Rcpl.OBJECT_PLACEHOLDER);
			}
		}
		return sb.toString();
	}

	@Override
	public void requestLayout() {
		if (isInLayout) {
			return;
		}
		super.requestLayout();
	}

	public double calculateHeight() {
		double width = layoutObject.getWidthPixel();
		double result = computePrefHeight(width);
		return result + getExtraTopMargin();
	}

	double getExtraTopMargin() {
		Node n = getChildren().get(0);
		if (n instanceof Text) {
			double topMargin = ((Text) n).getFont().getSize() * RCPLModel.FONT_HEIGHT_FACTOR * 0.065;
			setLayoutY(topMargin);
			return topMargin;
		}
		return 0;
	}

	@Override
	protected void setWidth(double width) {
		super.setWidth(width);
		setPrefWidth(width);
		setMinWidth(width);
		setMaxWidth(width);

	}

}
