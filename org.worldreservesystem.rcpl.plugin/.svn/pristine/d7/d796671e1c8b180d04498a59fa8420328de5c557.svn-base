package com.joffice.rcpl.plugin.office.tools;

import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import com.joffice.rcpl.plugin.office.JOStyle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Callback;

/**
 * @author ramin
 *
 */
public class TextStyleListTool extends RcplTool {

	public static double LABEL_FONT_SIZE = 13;

	private ObservableList<String> data = FXCollections.observableArrayList();

	public TextStyleListTool(Tool eTool) {
		super(eTool);

		for (int i = 1; i < 31; i++) {
			data.add("textart" + i);
		}

		getNode().setItems(data);

		getNode().setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
			@Override
			public ListCell<String> call(ListView<String> p) {
				return new ColorRectCell();

			}
		});
		getNode().setMinHeight(500);
		getNode().setPrefHeight(1000);
		getNode().setPrefWidth(1000);
	}

	class ColorRectCell extends ListCell<String> {
		private final Text label;

		{
			setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
			label = new Text();
		}

		@Override
		public void updateItem(String item, boolean empty) {
			super.updateItem(item, empty);

			if (item == null || empty) {
				setGraphic(null);
			} else {
				label.setText(item);
				label.setId(item);
				label.setFont(Font.font("Arial", 40));
				setGraphic(label);
				label.setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {

						String selectedItem = getNode().getSelectionModel().getSelectedItem();
						IParagraph par = getEditor().getSelectedParagraph();

						IStyle style = new JOStyle(selectedItem, "");

						if (par.getCharaterStyles().length > 0) {
							style = par.getCharaterStyles()[0].copy();
						} else {
							style = par.getStyle().copy();
						}

						if (style.getPageBreakBefore() == null) {
							style.setPageBreakBefore(par.getStyle().getPageBreakBefore());
						}
						style.setId(selectedItem);
						if (par != null) {
							ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.setStyle, par,
									null, style, true, true);
							Rcpl.service().execute(command);

						}
					}
				});
			}
		}
	}

	public void initSelection() {
		IFont font = Rcpl.globalStyleTemplate().getDefaultStyle().getFont();
		selectFont(font);
		setFont(font);
	}

	public void selectFont(IFont font) {
		// getSelectionModel().select(font.getName());
	}

	public void setFont(IFont font) {
		// ObservableList<Node> chs = node.getChildren();
		// for (Node n : chs) {
		// if (n instanceof Labeled) {
		// ((Labeled) n).setFont(font.getFx());
		// break;
		// }
		// }
	}

	@Override
	public ListView<String> createNode() {
		return new ListView<String>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ListView<String> getNode() {
		return (ListView<String>) super.getNode();
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
	public boolean isWrap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	// public List<String> getListAsString() {
	// return listAsString;
	// }

}
