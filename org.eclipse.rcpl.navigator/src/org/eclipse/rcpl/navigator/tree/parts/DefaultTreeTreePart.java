/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/

package org.eclipse.rcpl.navigator.tree.parts;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.net4j.util.lifecycle.LifecycleException;
import org.eclipse.rcpl.INavigatorListener;
import org.eclipse.rcpl.IOfficeUIC;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.rcpl.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.rcpl.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.rcpl.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.rcpl.emf.edit.ui.dnd.EditingDomainCellDropAdapter;
import org.eclipse.rcpl.homepages.JOOverviewHomePage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Folder;
import org.eclipse.rcpl.model_2_0_0.rcpl.Preference;
import org.eclipse.rcpl.model_2_0_0.rcpl.Preferences;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Resource;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.navigator.tree.handlers.AddOfficeFolderHandler;
import org.eclipse.rcpl.navigator.tree.handlers.AddPreferenceHandler;
import org.eclipse.rcpl.navigator.tree.handlers.AddPreferencesHandler;
import org.eclipse.rcpl.navigator.tree.handlers.DeleteOfficeDocumentHandler;
import org.eclipse.rcpl.navigator.tree.handlers.DeleteOfficeFolderHandler;
import org.eclipse.rcpl.navigator.tree.handlers.DeletePreferenceHandler;
import org.eclipse.rcpl.navigator.tree.handlers.DeletePreferencesHandler;
import org.eclipse.rcpl.navigator.tree.handlers.JOAbstractEmfHandler;
import org.eclipse.rcpl.navigator.tree.model.manager.UCEmfTreeModelManagerImpl;
import org.eclipse.rcpl.upload.DownloadClient;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * @author ramin
 *
 */
public class DefaultTreeTreePart extends RcplTool {

	private EObject root;

	private Node node;

	private TreeView<Object> treeView;

	private AdapterFactoryTreeItem adapterFactoryTreeItem2;

	// private CDOObject cdoobj;

	private EObject selectedObject;

	private UCEmfTreeModelManagerImpl emfTreeManager;

	// private NavigatorRcplPlugin useCase;

	private HashMap<Class<? extends EObject>, JOAbstractEmfHandler<?>> addHandlerRegistry = new HashMap<Class<? extends EObject>, JOAbstractEmfHandler<?>>();
	private HashMap<Class<? extends EObject>, JOAbstractEmfHandler<?>> deleteHandlerRegistry = new HashMap<Class<? extends EObject>, JOAbstractEmfHandler<?>>();

	private HashMap<String, File> documentRegistry = new HashMap<String, File>();

	private final Pane detailPane;

	public DefaultTreeTreePart(Pane detailPane, Tool tool, EObject root, boolean showRoot) {
		super(tool);
		this.detailPane = detailPane;
		try {
			this.root = root;
			registerHandlers();

			getNode();

			treeView.setPrefHeight(10);

			emfTreeManager = new UCEmfTreeModelManagerImpl();

			refresh();

			treeView.setShowRoot(showRoot);
			// treeView.requestFocus();
			treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

			addSelectionListener();
			addCDOListener();
			addMouseListener();


		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	protected void doSelection() {

	}
	
	

	
	protected void defineDetailNode(EObject eObject) {
	}
	
	private void addSelectionListener() {
		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object oldItem, Object newItem) {
				if (newItem instanceof AdapterFactoryTreeItem) {
					Object value = ((AdapterFactoryTreeItem) newItem).getValue();
					if (value instanceof EObject) {
						selectedObject = (EObject) value;
						for (INavigatorListener l : Rcpl.navigatorListeners) {
							l.selected(selectedObject);
						}
					}
				}
			}

		});
	}

	private void addMouseListener() {
		treeView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {

				if (mouseEvent.isSecondaryButtonDown() || mouseEvent.isMiddleButtonDown()) {
					return;
				}
				EObject sel = getSelectedObject();
				if (sel instanceof Resource) {

					Resource doc = (Resource) sel;
					String uri = doc.getUri();
					String id = doc.getId();
					URL url = null;
					try {
						url = new URL(doc.getUri());
					} catch (Exception e) {
						//
					}

					if (mouseEvent.getClickCount() > 1) {

						if (id != null) {
							try {
								File file = documentRegistry.get(id);
								if (file == null) {
									file = new DownloadClient().download(JOSession.getDefault().userId, id);
									documentRegistry.put(id, file);
								}
								((IOfficeUIC) Rcpl.UIC).openDocument(file);
							} catch (Exception e) {
								RCPLModel.logError(e);
							}

						} else if (uri != null && uri.length() > 0) {
							((IOfficeUIC) Rcpl.UIC).openDocument(new File(uri));
						} else {
							if (url != null) {
								((IOfficeUIC) Rcpl.UIC).openDocument(url);
							}
						}
						mouseEvent.consume();

					}
				} else if(sel instanceof Folder){
					defineDetailNode(sel);
				} else {
					setDetailNode((Node)null);
				}
			}
		});
	}


	/**
	 * @param node
	 */
	protected void setDetailNode(Node node) {
		try {
			((JOOverviewHomePage) ((RcplUic) Rcpl.UIC).getOverviewPage()).setDetailNode(node);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * 
	 */
	private void registerHandlers() {
		addHandlerRegistry.put(Folder.class, new AddOfficeFolderHandler(this));
		addHandlerRegistry.put(Preferences.class, new AddPreferencesHandler(this));
		addHandlerRegistry.put(Preference.class, new AddPreferenceHandler(this));
		deleteHandlerRegistry.put(Folder.class, new DeleteOfficeFolderHandler(this));
		deleteHandlerRegistry.put(Resource.class, new DeleteOfficeDocumentHandler(this));
		deleteHandlerRegistry.put(Preferences.class, new DeletePreferencesHandler(this));
		deleteHandlerRegistry.put(Preference.class, new DeletePreferenceHandler(this));
	}

	/**
	 * @return
	 */
	public JOAbstractEmfHandler<?> getAddHandler() {
		EObject sel = getSelectedObject();
		for (Class<? extends EObject> cl : addHandlerRegistry.keySet()) {
			Class<?>[] interfaces = sel.getClass().getInterfaces();
			for (Class<?> ci : interfaces) {
				if (cl == ci) {
					return addHandlerRegistry.get(cl);
				}
			}
		}
		return null;
	}

	/**
	 * @return
	 */
	public JOAbstractEmfHandler<?> getDeleteHandler() {
		EObject sel = getSelectedObject();
		for (Class<? extends EObject> cl : deleteHandlerRegistry.keySet()) {
			Class<?>[] interfaces = sel.getClass().getInterfaces();
			for (Class<?> ci : interfaces) {
				if (cl == ci) {
					return deleteHandlerRegistry.get(cl);
				}
			}
		}
		return null;
	}

	/**
	 * 
	 */
	private void addCDOListener() {
		if (JOSession.getDefault().getSession() != null) {
			JOSession.getDefault().getSession().addListener(new IListener() {

				@Override
				public void notifyEvent(IEvent event) {
					// TODO Auto-generated method stub

					// if (event instanceof CDOSessionInvalidationEvent) {
					//
					// CDOSessionInvalidationEvent ev =
					// (CDOSessionInvalidationEvent) event;
					//
					// List<CDORevisionKey> list = ev.getChangedObjects();
					// CDOTransaction trans = ev.getLocalTransaction();
					// if (trans != null) {
					// for (CDORevisionKey cdoRevisionKey : list) {
					// CDOID id = cdoRevisionKey.getID();
					// // cdoobj = ((CDOView) trans).getObject(id,
					// // true);
					// }
					// }
					// }

					javafx.application.Platform.runLater(new Runnable() {

						@Override
						public void run() {
							adapterFactoryTreeItem2 = null;
							refresh();
						}
					});

				}
			});
		}
	}

	private void refresh() {

		try {
			if (adapterFactoryTreeItem2 == null) {

				adapterFactoryTreeItem2 = new AdapterFactoryTreeItem(root, treeView,
						emfTreeManager.getAdapterFactory());
				treeView.setRoot(adapterFactoryTreeItem2);

				AdapterFactoryTreeCellFactory treeCellFactory = new AdapterFactoryTreeCellFactory(
						emfTreeManager.getAdapterFactory());

				// ---------- add edit support ----------------------

				treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(
						RcplPackage.eINSTANCE.getTools().getEIDAttribute(), getEditingDomain()));
				treeCellFactory.addCellEditHandler(
						new EAttributeCellEditHandler(RcplPackage.eINSTANCE.getLayoutable_Id(), getEditingDomain()));
				treeCellFactory.addCellEditHandler(
						new EAttributeCellEditHandler(RcplPackage.eINSTANCE.getLayoutable_Id(), getEditingDomain()));

				if (!Rcpl.isMobile()) {
					treeCellFactory.addCellCreationListener(new CellDragAdapter());
				}

				treeView.setCellFactory(treeCellFactory);

				if (JOSession.getDefault().isDemo()) {
					treeView.setEditable(false);
				} else {
					treeView.setCellFactory(treeCellFactory);
					if (!Rcpl.isMobile()) {
						EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(getEditingDomain());
						dropAdapter.setFeedbackHandler(new EditingDomainCellDropAdapter.DefaultFeedbackHandler());
						treeCellFactory.addCellCreationListener(dropAdapter);
						DefaultTreeContextMenuProvider contextMenuProvider = createContextMenuProvider();
						treeCellFactory.addCellUpdateListener(contextMenuProvider);
					}
					treeView.setEditable(true);
				}
				treeView.getRoot().setExpanded(true);

				// for (TreeItem<?> item : treeView.getRoot().getChildren()) {
				// item.setExpanded(true);
				// }
			}
		} catch (LifecycleException ex) {
			//
		}

	}

	
	
	protected DefaultTreeContextMenuProvider createContextMenuProvider() {
		return new DefaultTreeContextMenuProvider(this);
	}
	
	public EditingDomain getEditingDomain() {
		return emfTreeManager.getEditingDomain();
	}

	@Override
	public Node createNode() {
		treeView = new TreeView<Object>();

		treeView.getStyleClass().add("emfTreeView");
		return treeView;
	}

	public EObject getSelectedObject() {
		return selectedObject;
	}

	public TreeView<Object> getTreeView() {
		return treeView;
	}

	@Override
	public IToolRegistry getToolRegistry() {
		return null;
	}

	@Override
	public IResourceEntry getEntry() {
		return null;
	}

	@Override
	public IToolComponent getToolComponent() {
		return null;
	}

	@Override
	public void setVisible(boolean visible) {
	}

	@Override
	public IToolGroup getGroup() {
		return null;
	}

	@Override
	public boolean isFullSize() {
		return false;
	}

	@Override
	public int getToolHierarchy() {
		return 0;
	}

	@Override
	public Object getImage() {
		return null;
	}

	@Override
	public boolean isWrap() {
		return false;
	}

	public Pane getDetailPane() {
		return detailPane;
	}

}
