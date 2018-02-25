package org.eclipse.rcpl.plugin.tools.parts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableRow;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.WindowEvent;

import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import org.eclipse.fxrcplight.Rcpl;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroups;
import org.eclipse.rcpl.plugin.tools.handlers.AddToolGroupHandler;
import org.eclipse.rcpl.plugin.tools.handlers.AddToolHandler;
import org.eclipse.rcpl.plugin.tools.handlers.CopyHandler;
import org.eclipse.rcpl.plugin.tools.handlers.CutHandler;
import org.eclipse.rcpl.plugin.tools.handlers.DeleteToolHandler;
import org.eclipse.rcpl.plugin.tools.handlers.PasteHandler;

public class EToolsContextMenuProvider implements ICellUpdateListener {

	private DeleteToolHandler deleteHandler;
	private MenuItem deleteMenuItem;
	CutHandler cutHandler;
	private MenuItem cutMenuItem;
	private CopyHandler copyHandler;
	private MenuItem copyMenuItem;
	private PasteHandler pasteHandler;
	private MenuItem pasteMenuItem;

	private AddToolHandler addToolHandler;
	private MenuItem addContactMenuItem;

	private AddToolGroupHandler addContactGroupHandler;
	private MenuItem addContactGroupMenuItem;

	private EToolsTreePart eToolsTreePart;

	public EToolsContextMenuProvider(EToolsTreePart eToolsTreePart) {
		this.eToolsTreePart = eToolsTreePart;
	}

	static List<?> getSelectionModel(Cell<?> cell) {
		if (cell instanceof ListCell<?>) {
			return ((ListCell<?>) cell).getListView().getSelectionModel()
					.getSelectedItems();
		} else if (cell instanceof TreeCell<?>) {
			MultipleSelectionModel<?> selectionModel = ((TreeCell<?>) cell)
					.getTreeView().getSelectionModel();
			ObservableList<?> selectedItems = selectionModel.getSelectedItems();
			ArrayList<Object> unwrappedItems = new ArrayList<>(
					selectedItems.size());
			for (Object object : selectedItems) {
				TreeItem<?> treeItem = (TreeItem<?>) object;
				unwrappedItems.add(treeItem.getValue());
			}
			return unwrappedItems;
		} else if (cell instanceof TableCell<?, ?>) {
			return ((TableCell<?, ?>) cell).getTableView().getSelectionModel()
					.getSelectedItems();
		} else if (cell instanceof TableRow<?>) {
			return ((TableRow<?>) cell).getTableView().getSelectionModel()
					.getSelectedItems();
		}
		return null;
	}

	@Override
	public void updateItem(final Cell<?> cell, final Object item, boolean empty) {

		final ContextMenu contextMenu = new ContextMenu();
		cell.setContextMenu(contextMenu);
		contextMenu.getItems().add(new MenuItem());
		contextMenu.setOnShowing(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {

				try {
					List<?> selectedItems = getSelectionModel(cell);

					if (selectedItems.size() == 1) {
						if (selectedItems.get(0) instanceof ToolGroup) {
							deleteMenuItem.setDisable(!deleteHandler
									.canExecute(selectedItems));
							cutMenuItem.setDisable(!cutHandler
									.canExecute(selectedItems));
							copyMenuItem.setDisable(!copyHandler
									.canExecute(selectedItems));
							Object item2 = cell.getItem();
							pasteMenuItem.setDisable(!pasteHandler
									.canExecute(item2));
							addContactMenuItem.setDisable(!addToolHandler
									.canExecute(item2));

							contextMenu.getItems().clear();
							contextMenu.getItems().add(deleteMenuItem);
							contextMenu.getItems().add(cutMenuItem);
							contextMenu.getItems().add(copyMenuItem);
							contextMenu.getItems().add(pasteMenuItem);

							contextMenu.getItems().add(addContactMenuItem);
							contextMenu.getItems().add(addContactGroupMenuItem);
						}

						// -----

						else if (selectedItems.get(0) instanceof ToolGroups) {
							deleteMenuItem.setDisable(!deleteHandler
									.canExecute(selectedItems));
							cutMenuItem.setDisable(!cutHandler
									.canExecute(selectedItems));
							copyMenuItem.setDisable(!copyHandler
									.canExecute(selectedItems));
							Object item2 = cell.getItem();
							pasteMenuItem.setDisable(!pasteHandler
									.canExecute(item2));
							addContactMenuItem.setDisable(!addToolHandler
									.canExecute(item2));

							contextMenu.getItems().clear();
							contextMenu.getItems().add(deleteMenuItem);
							contextMenu.getItems().add(cutMenuItem);
							contextMenu.getItems().add(copyMenuItem);
							contextMenu.getItems().add(pasteMenuItem);

							contextMenu.getItems().add(addContactMenuItem);
							contextMenu.getItems().add(addContactGroupMenuItem);
						} else if (selectedItems.get(0) instanceof Tool) {
							deleteMenuItem.setDisable(!deleteHandler
									.canExecute(selectedItems));
							cutMenuItem.setDisable(!cutHandler
									.canExecute(selectedItems));
							copyMenuItem.setDisable(!copyHandler
									.canExecute(selectedItems));
							Object item2 = cell.getItem();
							pasteMenuItem.setDisable(!pasteHandler
									.canExecute(item2));
							addContactMenuItem.setDisable(!addToolHandler
									.canExecute(item2));

							contextMenu.getItems().clear();
							contextMenu.getItems().add(deleteMenuItem);
							contextMenu.getItems().add(cutMenuItem);
							contextMenu.getItems().add(copyMenuItem);

						}
					}
				} catch (Exception ex) {
					// System. out.println();
				}
			}

		});

		deleteMenuItem = new MenuItem("Delete",
				getImage("icons/silk/cross.png"));
		deleteHandler = new DeleteToolHandler(eToolsTreePart);
		deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				deleteHandler.execute();
			}
		});

		cutMenuItem = new MenuItem("Cut", getImage("icons/silk/cut.png"));
		cutHandler = new CutHandler(eToolsTreePart);
		cutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cutHandler.execute();
			}
		});

		copyMenuItem = new MenuItem("Copy",
				getImage("icons/silk/page_copy.png"));
		copyHandler = new CopyHandler(eToolsTreePart);
		copyMenuItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				copyHandler.execute();
			}

		});

		pasteMenuItem = new MenuItem("Paste",
				getImage("icons/silk/page_paste.png"));
		pasteHandler = new PasteHandler(eToolsTreePart);
		pasteMenuItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				pasteHandler.execute();
			}

		});

		addContactMenuItem = new MenuItem("Add Tool",
				getImage("icons/silk/user_add.png"));
		addToolHandler = new AddToolHandler(eToolsTreePart);
		addContactMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				addToolHandler.execute();
			}
		});

		addContactGroupMenuItem = new MenuItem("Add Tool Group",
				getImage("icons/silk/folder_add.png"));
		addContactGroupHandler = new AddToolGroupHandler(eToolsTreePart);
		addContactGroupMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				addContactGroupHandler.execute();
			}
		});

	}

	private ImageView getImage(String path) {
		try {
			URL url = new URL("platform:/plugin/org.eclipse.fxrcplight.app/"
					+ path);
			Image image = new Image(url.toExternalForm());
			return new ImageView(image);
		} catch (MalformedURLException e) {
			return new ImageView(Rcpl.resources().getFxImage(
					"shape_16_point_star"));
		}
	}

}
