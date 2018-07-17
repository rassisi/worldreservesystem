package com.joffice.rcpl.plugin.office.tools;

import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.RcplFont;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.internal.tools.FontNameTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import com.joffice.rcpl.plugin.office.databinding.types.JOCharacterSubsets;
import com.joffice.rcpl.plugin.office.figures.word.JOParagraphFigure;
import com.sun.javafx.geom.Point2D;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;

/**
 * @author ramin
 *
 */
public class JOSymbolsTool extends RcplTool {

	private JOCharacterSubsets characterSubset;

	private Canvas canvas;

	private ComboBox<String> typeCombo;

	private IFont font;

	private double fontSize = 11;

	Point2D siz = new Point2D(21, 26); // JOUtil.getMaxExtent(cFont);
										// //JOUtil.getTextExtent("W", cFont);
										// //$NON-NLS-1$

	public JOSymbolsTool(Tool eTool) {
		super(eTool);
		Label label = new Label("Font");
		GridPane.setHgrow(label, Priority.ALWAYS);
		getNode().setHgap(5);
		getNode().setVgap(5);
		font = new RcplFont("Arial", fontSize, Rcpl.BOLD);
		getNode().add(label, 0, 0);
		Tool emfTool = RcplFactory.eINSTANCE.createTool();
		emfTool.setId(EnCommandId.fontName.name());
		emfTool.setService(EnServiceId.PARAGRAPH_SERVICE.name());
		final FontNameTool fontNameTool = new FontNameTool(emfTool) {
			public void setFont(IFont f) {
				font = f;
				refresh();
			};
		};
		fontNameTool.getNode().setPrefWidth(220);
		getNode().add(fontNameTool.getNode(), 1, 0);
		label = new Label("Type");
		GridPane.setHgrow(label, Priority.ALWAYS);
		getNode().add(label, 0, 1);
		typeCombo = new ComboBox<String>();
		typeCombo.setPrefWidth(220);
		typeCombo.valueProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				double colW = siz.x;
				double rowH = siz.y;
				int numberOfColumns = 10;
				Bounds b = canvas.getBoundsInLocal();
				int index = typeCombo.getSelectionModel().getSelectedIndex();
				characterSubset = JOCharacterSubsets.values()[index];
				numberOfColumns = (int) (b.getWidth() / colW) - 1;
				// double fHeight = ((characterSubset.getCodes().length /
				// numberOfColumns) + 1)
				// * rowH;
				// canvas.setWidth(numberOfColumns * colW + 5);
				// canvas.setHeight(2000); // fHeight + 300);

				// scrollPane.setCenterShape(true);
				// canvas.scrollToY(0);
				scrollPane.layout();
				refresh();
			}
		});

		final int index = 0;
		characterSubset = JOCharacterSubsets.values()[index];

		new WaitThread(getEditor()) {

			@Override
			public void doRun() {
				typeCombo.getSelectionModel().select(index);
				fontNameTool.selectFont(new RcplFont("Arial", fontSize, 0));
			}
		};

		getNode().add(typeCombo, 1, 1);
		characterSubset = JOCharacterSubsets.values()[0];
		typeCombo.getItems().addAll(JOCharacterSubsets.getDisplayNames());

		scrollPane = new ScrollPane();
		getNode().add(scrollPane, 0, 2, 2, 1);
		canvas = new Canvas();
		canvas.setWidth(230);
		canvas.setHeight(1500);
		scrollPane.setContent(canvas);
		scrollPane.setCenterShape(true);
		scrollPane.setPrefHeight(2000);
		GridPane.setVgrow(scrollPane, Priority.ALWAYS);

		ColumnConstraints columnConstraints = new ColumnConstraints();
		columnConstraints.setFillWidth(true);
		columnConstraints.setHgrow(Priority.ALWAYS);
		getNode().getColumnConstraints().add(columnConstraints);

		RowConstraints rowConstraints = new RowConstraints();
		rowConstraints.setFillHeight(true);
		rowConstraints.setVgrow(Priority.ALWAYS);
		getNode().getRowConstraints().add(rowConstraints);

		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent me) {
				IParagraph paragraph = getEditor().getSelectedParagraph();
				if (paragraph != null) {

					Bounds r = canvas.getBoundsInLocal();
					int row = (int) ((me.getY() - 10.0) / siz.y);
					int col = (int) ((me.getX() - 10.0) / siz.x);
					int numberOfColumns = 10;
					int index = row * numberOfColumns + col;
					int code = characterSubset.getCodes()[index];
					Character c = new Character((char) code);
					String s = c.toString();

					// e.keyCode = s.toCharArray()[0];
					// e.character = s.toCharArray()[0];// (char) index;

					JOParagraphFigure p = (JOParagraphFigure) paragraph.getLayoutFigure().getFx();

					me.consume();

					// @NamedArg("source") Object source,
					// @NamedArg("target") EventTarget target,
					// @NamedArg("eventType") EventType<KeyEvent> eventType,
					// @NamedArg("character") String character,
					// @NamedArg("text") String text,
					// @NamedArg("code") KeyCode code,
					// @NamedArg("shiftDown") boolean shiftDown,
					// @NamedArg("controlDown") boolean controlDown,
					// @NamedArg("altDown") boolean altDown,
					// @NamedArg("metaDown") boolean metaDown

					KeyEvent ke = new KeyEvent(null, null, null, s, s, KeyCode.C, false, false, false, false);

					p.processKeyEvent(ke);
				}

			}
		});

		refresh();
	}

	private ScrollPane scrollPane;

	public void refresh() {

		double colW = siz.x;
		double rowH = siz.y;
		int numberOfColumns = 10;

		GraphicsContext graphics = canvas.getGraphicsContext2D();

		Bounds b = canvas.getBoundsInLocal();
		graphics.setFill(Color.WHITE);
		graphics.fillRect(0, 0, b.getWidth(), b.getHeight());

		int row = 0;

		int[] codes = characterSubset.getCodes();
		for (int codeCount = 0; row < 1000 && codeCount < characterSubset.getCodes().length; row++) {
			for (int col = 0; col < numberOfColumns
					&& codeCount < characterSubset.getCodes().length; col++, codeCount++) {
				double x = col * colW + 10.5;
				double y = row * rowH + 10.5;
				graphics.setStroke(Rcpl.colorProvider().get(1.2).getFx());
				graphics.strokeRect(x, y, colW, rowH);
				Character c = new Character((char) codes[codeCount]);
				String s = c.toString();
				graphics.setFont(font.getFx());
				graphics.setFill(Rcpl.colorProvider().get(0.2).getFx());
				graphics.fillText(s, x + 2, y + 20);
			}
		}

	}

	@Override
	public IToolRegistry getToolRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntry getEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IToolComponent getToolComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub

	}

	@Override
	public IToolGroup getGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullSize() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getToolHierarchy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GridPane createNode() {
		return new GridPane();
	}

	@Override
	public GridPane getNode() {
		return (GridPane) super.getNode();
	}
}
