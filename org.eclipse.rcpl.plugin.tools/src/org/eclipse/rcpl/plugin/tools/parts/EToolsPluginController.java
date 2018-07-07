/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package org.eclipse.rcpl.plugin.tools.parts;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rcpl.AbstractRcplPlugin;
import org.eclipse.rcpl.EnCustomToolIds;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.INavigatorPlugin;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplLogin;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.GroupType;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolType;
import org.eclipse.rcpl.navigator.EViewController;
import org.eclipse.rcpl.plugin.tools.EToolsPlugin;

import com.sun.javafx.scene.control.IntegerField;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class EToolsPluginController extends EViewController {

	@FXML
	private ImageView imageView;

	@FXML
	private TextField image;
	private Property<String> imageProperty;

	@FXML
	private TextField textFieldServiceClass;
	private Property<String> serviceClassProperty;

	@FXML
	private ComboBox<String> toolId;
	private Property<String> toolIdProperty;

	@FXML
	private TextField toolName;
	private Property<String> toolNameProperty;

	@FXML
	private TextField toolTip;
	private Property<String> toolTipProperty;

	@FXML
	private ComboBox<String> format;
	private Property<String> formatProperty;

	@FXML
	private CheckBox grid;
	private Property<Boolean> gridProperty;

	@FXML
	private CheckBox checkBoxNotImplemented;
	private Property<Boolean> notImplementedProperty;

	private ComboBox<ToolType> toolType;

	private ComboBox<GroupType> groupType;

	@FXML
	private SplitPane contactsPane;

	@FXML
	private VBox viewerBox;

	@FXML
	private GridPane gridPane;

	@FXML
	private Button button_1;

	@FXML
	private Button button_2;

	@FXML
	private Button button_3;

	@FXML
	private Button button_4;

	@FXML
	private Label imageSize;

	private Tool tool = null;

	private ToolGroup toolGroup = null;

	private CheckBox labeled;

	private ChangeListener<String> toolsIdChangeListener;

	private Property<Boolean> labeledProperty;

	public void unbindAll() {
		if (notImplementedProperty != null)
			notImplementedProperty.unbind();
		if (imageProperty != null)
			imageProperty.unbind();
		if (serviceClassProperty != null)
			serviceClassProperty.unbind();
		if (toolIdProperty != null)
			toolIdProperty.unbind();
		if (toolNameProperty != null)
			toolNameProperty.unbind();
		if (toolTipProperty != null)
			toolTipProperty.unbind();
		if (labeledProperty != null)
			labeledProperty.unbind();
		if (gridProperty != null)
			gridProperty.unbind();
		if (formatProperty != null)
			formatProperty.unbind();
		if (gridXFieldProperty != null)
			gridXFieldProperty.unbind();
		if (gridYFieldProperty != null)
			gridYFieldProperty.unbind();
		if (spanXFieldProperty != null)
			spanXFieldProperty.unbind();
		if (spanYFieldProperty != null)
			spanYFieldProperty.unbind();
		if (toolsIdChangeListener != null) {
			toolId.valueProperty().removeListener(toolsIdChangeListener);
			toolsIdChangeListener = null;
		}
	}

	public void updateBindings(EObject eObject, EditingDomain editingDomain) {
		// General

		if (toolId.getItems().isEmpty()) {
			List<String> ids = Tool.ids;
			try {
				Collections.sort(ids);
			} catch (Exception ex) {
				// System. out.println();
			}
			toolId.getItems().addAll(ids);
		}

		if (eObject instanceof AbstractTool) {

			tool = null;
			// clear();

			imageProperty = bind(image, imageProperty, eObject,
					RcplPackage.eINSTANCE.getLayoutable_Image(), editingDomain);

			serviceClassProperty = bind(textFieldServiceClass,
					serviceClassProperty, eObject,
					RcplPackage.eINSTANCE.getAbstractTool_Service(),
					editingDomain);

			toolIdProperty = rebindTextCombo(toolId, toolIdProperty, eObject,
					RcplPackage.eINSTANCE.getLayoutable_Id(), editingDomain);

			toolNameProperty = bind(toolName, toolNameProperty, eObject,
					RcplPackage.eINSTANCE.getLayoutable_Name(), editingDomain);

			if (toolTip != null) {
				toolTipProperty = bind(toolTip, toolTipProperty, eObject,
						RcplPackage.eINSTANCE.getLayoutable_ToolTip(),
						editingDomain);
			}

			labeledProperty = rebind(labeled, labeledProperty, eObject,
					RcplPackage.eINSTANCE.getAbstractTool_Labeled(),
					editingDomain);

			if (eObject instanceof ToolGroup) {
				gridPane.getChildren().remove(getToolType());
				gridPane.getChildren().remove(getGroupType());
				gridPane.add(getGroupType(), 1, 5);
				gridProperty = rebind(grid, gridProperty, eObject,
						RcplPackage.eINSTANCE.getToolGroup_Grid(),
						editingDomain);

				toolGroup = (ToolGroup) eObject;
				GroupType tt = toolGroup.getType();
				groupType.getSelectionModel().clearSelection();
				groupType.getSelectionModel().select(tt.getValue());
				groupType.getSelectionModel().selectedItemProperty()
						.addListener(new ChangeListener<GroupType>() {
							@Override
							public void changed(
									ObservableValue<? extends GroupType> observable,
									GroupType oldValue, GroupType newValue) {
								if (toolGroup != null) {
									toolGroup.setType(newValue);
								}
							}
						});

			}

			if (eObject instanceof Tool) {
				gridPane.getChildren().remove(getToolType());
				gridPane.getChildren().remove(getGroupType());

				gridPane.add(getToolType(), 1, 5);
				formatProperty = rebindTextCombo(format, formatProperty,
						eObject, RcplPackage.eINSTANCE.getTool_Format(),
						editingDomain);
				tool = (Tool) eObject;
				ToolType tt = tool.getType();
				toolType.getSelectionModel().clearSelection();
				toolType.getSelectionModel().select(tt.getValue());
				toolType.getSelectionModel().selectedItemProperty()
						.addListener(new ChangeListener<ToolType>() {
							@Override
							public void changed(
									ObservableValue<? extends ToolType> observable,
									ToolType oldValue, ToolType newValue) {

								if (tool != null) {
									tool.setType(newValue);
								}
							}
						});
				notImplementedProperty = rebind(checkBoxNotImplemented,
						notImplementedProperty, eObject,
						RcplPackage.eINSTANCE.getAbstractTool_NotImplemented(),
						editingDomain);
			} else {
				tool = null;
				toolType.getSelectionModel().select(-1);
			}


			Image image = Rcpl.resources().getImage(
					((AbstractTool) eObject).getImage(),16,16).getImage();
			imageView.setImage(image);
			if (image != null) {
				double height = image.getHeight();
				double width = image.getWidth();
				imageView.setFitHeight(height);
				imageView.setFitWidth(width);
				imageSize.setText(width + " / " + height);
			}

			gridXFieldProperty = rebind(gridXField, gridXFieldProperty,
					eObject, RcplPackage.eINSTANCE.getAbstractTool_GridX(),
					editingDomain);

			gridYFieldProperty = rebind(gridYField, gridYFieldProperty,
					eObject, RcplPackage.eINSTANCE.getAbstractTool_GridY(),
					editingDomain);

			spanXFieldProperty = rebind(spanXField, spanXFieldProperty,
					eObject, RcplPackage.eINSTANCE.getAbstractTool_SpanX(),
					editingDomain);

			spanYFieldProperty = rebind(spanYField, spanYFieldProperty,
					eObject, RcplPackage.eINSTANCE.getAbstractTool_SpanY(),
					editingDomain);

			addRecreationListener(gridXFieldProperty);
			addRecreationListener(gridYFieldProperty);
			addStringRecreationListener(toolIdProperty);
			addStringRecreationListener(toolNameProperty);
			addStringRecreationListener(toolTipProperty);
			addStringRecreationListener(formatProperty);
			addStringRecreationListener(imageProperty);

			addBooleanRecreationListener(gridProperty);

		} else {
			toolName.setText("");
			toolId.setValue("");
			format.setValue("");
			if (gridProperty != null) {
				gridProperty.setValue(false);
			}
		}

		grid.setDisable(!(eObject instanceof ToolGroup));
		toolType.setDisable(!(eObject instanceof Tool));
		format.setDisable(!(eObject instanceof AbstractTool));
		gridXField.setDisable(!(eObject instanceof AbstractTool));
		gridYField.setDisable(!(eObject instanceof AbstractTool));
		spanXField.setDisable(!(eObject instanceof AbstractTool));
		spanYField.setDisable(!(eObject instanceof AbstractTool));
		toolId.setDisable(!(eObject instanceof AbstractTool));

		addToolIdListener();
	}

	public void doInit(AbstractRcplPlugin uc) {
		Node node1 = new EToolsTreePart((EToolsPlugin) uc).getNode();
		getViewerBox().getChildren().add(node1);
		getToolType().getItems().clear();
		getToolType().getItems().addAll(ToolType.values());
		getToolType().getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<ToolType>() {

					@Override
					public void changed(
							ObservableValue<? extends ToolType> observable,
							ToolType oldValue, final ToolType newValue) {
						if (getTool() != null) {
							getTool().setType(newValue);
						}

					}
				});

		// ---------- FORMAT FIELD -----------------------------------

		format.getItems().clear();
		format.getItems().add("");
		for (EnCustomToolIds folderTypes2 : EnCustomToolIds.values()) {
			format.getItems().add(folderTypes2.toString());
		}
		if (formatProperty == null || formatProperty.getValue() == null
				|| formatProperty.getValue().length() == 0) {
			format.getSelectionModel().select(0);
		}

		format.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<String>() {
					@Override
					public void changed(
							ObservableValue<? extends String> observable,
							String oldValue, String newValue) {
						if (tool != null) {
							tool.setFormat(newValue);
						}
					}
				});

		getGroupType().getItems().clear();
		getGroupType().getItems().addAll(GroupType.values());
		getGroupType().getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<GroupType>() {

					@Override
					public void changed(
							ObservableValue<? extends GroupType> observable,
							GroupType oldValue, final GroupType newValue) {
						if (getToolGroup() != null) {
							getToolGroup().setType(newValue);
						}

					}
				});

		button_1.setText("Restore Defaults");
		button_1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				// IDocumentProvider.INSTANCE.createTemplateDocument(
				// "joffice.joc", new File(JOSession.getJofficeJocFile()));

				// boolean recreate = JOSession.DEBUG_RECREATE;
				// JOSession.DEBUG_RECREATE = true;
				// JO.session.init();
				// JOSession.DEBUG_RECREATE = recreate;
			}
		});

		button_2.setText("Apply");
		button_2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Rcpl.UIC.recreateSideBar();
				Rcpl.UIC.recreateTopBar();
				JOSession.getDefault().commit();
			}
		});

		button_3.setVisible(false);
		button_4.setVisible(false);
	}

	private void addToolIdListener() {
		toolsIdChangeListener = new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable,
					String oldValue, String newValue) {
				removeToolIdListener();
				if (oldValue != null && Tool.ids.contains(oldValue)) {
					Tool.ids.remove(oldValue);
				}
				if (Tool.ids.contains(newValue)) {
					newValue += "_" + Tool.ids.size();
					toolId.valueProperty().setValue(newValue);
				}
				updateToolItems(newValue);
				addToolIdListener();
			}
		};
		toolId.valueProperty().addListener(toolsIdChangeListener);
	}

	private void removeToolIdListener() {
		if (toolsIdChangeListener != null) {
			toolId.valueProperty().removeListener(toolsIdChangeListener);
		}
	}

	private void updateToolItems(final String newItem) {
		if (newItem == null) {
			return;
		}
		try {
			Tool.ids.add(newItem);
			Collections.sort(Tool.ids);
			javafx.application.Platform.runLater(new Runnable() {

				@Override
				public void run() {
					toolId.getItems().clear();
					Collections.sort(Tool.ids);
					toolId.getItems().addAll(Tool.ids);
					toolId.getSelectionModel().select(newItem);
				}
			});
		} catch (Exception ex) {
			// System. out.println();
		}
	}

	protected void addCustomFields() {
		if (gridXField == null) {
			gridXField = new IntegerField();
			gridXField.setMinWidth(0);
			gridYField = new IntegerField();
			gridYField.setMinHeight(0);
			spanXField = new IntegerField();
			spanXField.setMinWidth(1);
			spanYField = new IntegerField();
			spanYField.setMinHeight(1);

			int startY = 8;
			labeled = new CheckBox();
			getGridPane().add(labeled, 1, startY++);
			getGridPane().add(gridXField, 1, startY++);
			getGridPane().add(gridYField, 1, startY++);
			getGridPane().add(spanXField, 1, startY++);
			getGridPane().add(spanYField, 1, startY++);

		}
	}

	private void addRecreationListener(final Property<Number> prop) {
		if (prop != null) {
			prop.addListener(new ChangeListener<Number>() {

				@Override
				public void changed(
						ObservableValue<? extends Number> observable,
						Number oldValue, Number newValue) {

					// JO.UIC.recreateSideBar();

				}
			});
		}
	}

	private void addStringRecreationListener(final Property<String> prop) {
		if (prop != null) {
			prop.addListener(new ChangeListener<String>() {

				@Override
				public void changed(
						ObservableValue<? extends String> observable,
						String oldValue, String newValue) {
					if (prop == imageProperty) {
						Image image = Rcpl.resources().getImage(newValue,16,16).getImage();
						imageView.setImage(image);
					}

					// JO.UIC.recreateSideBar();

				}
			});
		}
	}

	private void addBooleanRecreationListener(Property<Boolean> prop) {
		if (prop != null) {
			prop.addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(
						ObservableValue<? extends Boolean> observable,
						Boolean oldValue, Boolean newValue) {
					// JO.UIC.recreateSideBar();

				}
			});
		}
	}

	private IntegerField gridXField = null;
	private Property<Number> gridXFieldProperty = new SimpleObjectProperty<Number>();

	private IntegerField gridYField = null;
	private Property<Number> gridYFieldProperty = new SimpleObjectProperty<Number>();

	private IntegerField spanXField = null;
	private Property<Number> spanXFieldProperty = new SimpleObjectProperty<Number>();

	private IntegerField spanYField = null;
	private Property<Number> spanYFieldProperty = new SimpleObjectProperty<Number>();

	public SplitPane getContactDetailPane() {
		return contactsPane;
	}

	public VBox getViewerBox() {
		return viewerBox;
	}

	public ComboBox<ToolType> getToolType() {
		if (toolType == null) {
			toolType = new ComboBox<>();
		}
		return toolType;
	}

	public ComboBox<GroupType> getGroupType() {
		if (groupType == null) {
			groupType = new ComboBox<>();
		}
		return groupType;
	}

	public Tool getTool() {
		return tool;
	}

	public ToolGroup getToolGroup() {
		return toolGroup;
	}

	public GridPane getGridPane() {
		return gridPane;
	}

	@Override
	public Perspective findPerspective(String type) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void actionAddPresentationTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionOpenLast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addtoApplicationStack(StackPane contentGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collapseAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expandAllToolBars() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expandBottomAra(boolean expand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expandLeftAra(boolean expand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expandTopAra(boolean epand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IRcplPlugin findRcplPlugins(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebView getBrowser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEditor getEditor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getFocusOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IHomePage> getHomepages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public INavigatorPlugin getNavigator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perspective getPerspective() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stage getStage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRcplPlugin getUseCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleThemeDefault(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(BorderPane parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean initSession(RcplLogin login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initStyles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isViewer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openDocument(File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openTemplate(String name, String tabName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recreateSideBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recreateTopBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restorePerspective() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPerspective(Perspective perspective, IRcplPlugin useCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUseCase(IRcplPlugin useCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContent(IEditor editor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContent(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDebugText(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInhibitUI(boolean inhibitUI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLeftTrimBar(StackPane perspectiveToolSideBarStackPane) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPerspective(Perspective perspective) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusText(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTopAreaHeight(double height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTopContent(Node content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setViewer(boolean viewer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAboutPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean showBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showContactUsPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDonationPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showErrorPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showHomePage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean showHtmlEditor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showNewPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPerspectivePage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOverviewPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean showPerspective(String id, boolean asEditor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showPreferencesPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showSamplesPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStartMenuButton(boolean show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTabPane() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showTutorialsPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showWebView(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showWhatsNewPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStartMenuButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(IRcplPlugin rcplPlugin) {
		// TODO Auto-generated method stub
		
	}

}
