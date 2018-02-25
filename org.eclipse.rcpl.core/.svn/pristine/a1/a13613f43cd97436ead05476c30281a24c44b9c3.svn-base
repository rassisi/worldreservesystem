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
package org.eclipse.rcpl;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.internal.services.RcplCommandService;
import org.eclipse.rcpl.internal.services.RcplObjectService;
import org.eclipse.rcpl.internal.services.RcplService;
import org.eclipse.rcpl.internal.services.RcplStartButtonService;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

/**
 * @author ramin
 *
 */
public abstract class RcplAbstractService {

	protected int savedOffset = 0;

	protected boolean selectionSimulation;

	protected List<ILayoutObject> dirtyLayoutObjects;

	public static boolean enableUnimplementedMessage = true;

	public abstract Object doExecute(ICommand event) throws Exception;

	private static Hashtable<Class<?>, IService> services;

	private IEditor editor;

	public RcplAbstractService() {
	}

	public static void registerService(Class<? extends RcplService> serviceClass) {
		if (services == null) {
			services = new Hashtable<Class<?>, IService>();
		}
		try {
			services.put(serviceClass, serviceClass.newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	protected IEditor getEditor(ICommand command) {
		if (command.getEditor() != null) {
			return command.getEditor();
		}
		ILayoutObject lo = command.getLayoutObject();
		if (lo != null) {
			IDocument doc = lo.getDocument();
			if (doc != null) {
				return doc.getEditor();
			}
		}
		return null;
	}

	protected IDocument getDocument(ICommand command) {
		ILayoutObject lo = command.getLayoutObject();
		if (lo != null) {
			return lo.getDocument();
		}
		return command.getEditor().getDocument();
	}

	// protected boolean match(JOCommand event, String key) {
	// return match(event, key, true);
	// }

	// /**
	// * @param event
	// * @param key
	// * @return
	// */
	// protected boolean match(JOCommand event, String key, boolean exact) {
	// // String key2 = event.getContext() + key;
	// // if (exact) {
	// // if (event.getEntry().getKey().equals(key2)
	// // || event.getEntry().getKey().equals(key)) {
	// // // browser/actions/browser/find_what
	// // // browser/actions/browser/find_what
	// // return true;
	// // }
	// // } else {
	// // key2 = JOResources.getGeneralKey(key);
	// // if (event.getEntry().getKey().endsWith(key2)
	// // || event.getEntry().getKey().startsWith(key)) {
	// // return true;
	// // }
	// // }
	// return false;
	// }

	public boolean getBoolean(Tool tool) {
		if (tool.getData() instanceof Boolean) {
			return ((Boolean) tool.getData()).booleanValue();
		} else if (tool.getData() instanceof JOButton) {
			return ((JOButton) tool.getData()).isSelected();
		}
		return false;
	}

	protected String getId(RcplCommand command) {
		if (command.getTool() != null) {
			return command.getTool().getTool().getId();
		}
		if (command.getCommandId() != null) {
			return command.getCommandId().name();
		}
		return "";
	}

	/**
	 * 
	 */
	protected void initSelectedObjects(ICommand command) {
		// getEditor().getCanvas().setFocus();
		dirtyLayoutObjects = new ArrayList<ILayoutObject>();
		selectionSimulation = false;

	}

	/**
	 * @param colorType
	 */
	protected boolean showColorChooser(int colorType, int shelfIndex) {
		// IColorTool colorChooser = (IColorTool) JOUtil2.findEditorTools(
		// "word/actions/object/color_chooser") //$NON-NLS-1$
		// .get(0);
		// boolean result = true;
		// if (colorChooser.getChoosenColorType() == colorType) {
		// result = false;
		// }
		// colorChooser.setChoosenColorType(colorType);
		// JO.service.selectGroup("word/actions/groups/colors", shelfIndex,
		// true); //$NON-NLS-1$
		// return result;

		return true;
	}

	/**
	 * @param figure
	 */
	protected boolean simulateSelection(ICommand command, IParagraph paragraph) {
		if (!(paragraph.hasSelection() && command.getEditor().getSelectedParagraph() == paragraph)) {
			selectionSimulation = true;
			paragraph.selectAll();
			return true;
		}

		return false;
	}

	//
	// /**
	// *
	// */
	// protected void finalizeSelectedObjects() {
	// getEditor().unselectAll();
	// updateFocusOwner(getEditor());
	// if (dirtyLayoutObjects.size() > 0) {
	// getEditor().setDirtyLayout(dirtyLayoutObjects.get(0));
	// }
	// }

	public RcplObjectService getObjectService() {
		return (RcplObjectService) getService(RcplObjectService.class);
	}

	// public JOPageService getPageService() {
	// return (JOPageService) getService(JOPageService.class);
	// }
	//
	// public JOParagraphService getParagraphService() {
	// return (JOParagraphService) getService(JOParagraphService.class);
	// }
	//
	// public JOPictureService getPictureService() {
	// return (JOPictureService) getService(JOPictureService.class);
	// }

	public IService getService(ICommand command) {

		if (command.getTool() != null && command.getTool().getTool().getId() != null) {
			EnServiceId servId = EnServiceId.getServiceId(command.getTool().getTool().getId());
			if (servId != null) {
				IService customService = getService(servId);
				if (customService != null) {
					return customService;
				}
			}
		}

		IService service = getService(command.getCommandId().getServiceId());
		return service;
	}

	public abstract IService getService(EnServiceId serviceId);

	public RcplStartButtonService getStartButtonService() {
		return (RcplStartButtonService) getService(RcplStartButtonService.class);
	}

	// public JOTableService getTableService() {
	// return (JOTableService) getService(JOTableService.class);
	// }

	/**
	 * @param <T>
	 * @param serviceClass
	 * @return
	 */
	public static IService getServiceBySimpleName(String serviceClassSimpleName) {
		for (Class<?> cl : services.keySet()) {
			String sn = cl.getSimpleName();
			if (serviceClassSimpleName.equals(sn)) {
				return getService(cl);
			}
		}
		return null;

	}

	/**
	 * @param <T>
	 * @param serviceClass
	 * @return
	 */
	public static IService getService(Class<?> serviceClass) {
		IService service = services.get(serviceClass);
		if (service == null) {
			try {
				service = (RcplService) serviceClass.newInstance();
				services.put(serviceClass, service);
			} catch (InstantiationException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (IllegalAccessException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
		return service;
	}

	public void selectGroup(String id, int shelfIndex, boolean b) {
		// TODO Auto-generated method stub

	}

	public RcplCommandService getCommandService() {
		return (RcplCommandService) getService(RcplCommandService.class);
	}

	public IEditor getEditor() {
		return editor;
	}

	public void setEditor(IEditor editor) {
		for (IService srv : services.values()) {
			((RcplAbstractService) srv).editor = null;
		}
		this.editor = editor;
	}

}
