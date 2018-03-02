package com.joffice.rcpl.plugin.office.internal.figures;

import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IPage;

import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

public class JOEmptyPageFigure extends JOPageFigure {

	private TextFlow textFlow;

	Text mainTitleText;
	Text subTitleText;

	/**
	 * @param editorFigure
	 */
	public JOEmptyPageFigure(IEditor editorFigure) {
		super(editorFigure);

		textFlow = new TextFlow();
		textFlow.setTextAlignment(TextAlignment.CENTER);

		mainTitleText = new Text("Empty Page");
		mainTitleText.setFont(Font.font("Arial", 72));
		mainTitleText.setFill(Color.WHITE);
		// mainTitleText.setStroke(Color.WHITE);
		// mainTitleText.setStrokeWidth(1.5);

		mainTitleText.setEffect(new InnerShadow());
		mainTitleText.setOpacity(0.6);
		textFlow.getChildren().add(mainTitleText);

		subTitleText = new Text();
		subTitleText.setFont(Font.font("Arial", 20));
		subTitleText.setFill(Color.BLACK);
		// subTitleText.setStroke(Color.DARKBLUE);
		// subTitleText.setStrokeWidth(1);
		subTitleText.setOpacity(0.4);
		textFlow.getChildren().add(subTitleText);

		textFlow.layout();
		textFlow.setRotate(-30);

		getFreeFlowtingGroup().getChildren().add(textFlow);
		setFill(Color.WHITE);
		setOpacity(0.3);
	}

	@Override
	public String toString() {
		return super.toString() + " (empty page)"; //$NON-NLS-1$
	}

	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		textFlow.setLayoutY(height * 0.4);
	}

	@Override
	public void setWidth(double w) {
		super.setWidth(w);
		textFlow.setLayoutX(w * 0.2);

		// textFlow.setPrefWidth(450);

	}

	public void updateDescription() {
		mainTitleText.setText("Empty Page " + getPageNumber());
		IPage previousPage = getEditor().getPage(getPageNumber() - 2);
		if (previousPage != null && previousPage.getSection() != null) {
			if (previousPage.getSection().isEven()) {
				subTitleText.setText("\nSection Break to even Page " + (getPageNumber() + 1));
			} else if (previousPage.getSection().isOdd()) {
				subTitleText.setText("\nSection Break to odd Page " + (getPageNumber() + 1));
			}

		}

	}

}
