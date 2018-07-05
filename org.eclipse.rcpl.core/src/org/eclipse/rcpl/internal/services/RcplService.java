package org.eclipse.rcpl.internal.services;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.IColorTool;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IService;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.RcplAbstractService;
import org.eclipse.rcpl.RcplCommand;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOKey;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

/**
 * @author ramin
 * 
 */
public class RcplService extends RcplAbstractService implements IService {

	public RcplService() {
	}

	@Override
	public Object doExecute(ICommand command) throws Exception {

		try {
			ITool iTool = command.getTool();
			if (iTool != null) {
				Tool tool = iTool.getTool();
				if (tool != null) {

					String id = tool.getId();

					if (id != null) {

						if (id.startsWith(JOSession.SWITCH_TO_PERSPECTIVE_AND_CREATE_DOCUMENT_IF_NEEDED)) {
							String persp = id.substring(
									JOSession.SWITCH_TO_PERSPECTIVE_AND_CREATE_DOCUMENT_IF_NEEDED.length(),
									id.length());
							IService serv = getServiceBySimpleName("New" + persp.toUpperCase() + "DocumentService");
							if (serv != null) {
								serv.doExecute(command);
								return true;
							}

							Rcpl.UIC.showPerspective(persp, false);
							return true;
						}

						if (id.startsWith("insert_shape") || id.startsWith("shape")) {
							IService serv = getService(EnServiceId.INSERT_SERVICE);
							serv.doExecute(command);
							return true;
						}

					}
				}

			}

			switch (command.getCommandId()) {
			case undo:
			case redo:
				getCommandService().doExecute(command);
				break;
			case textStyleListTool:
				break;
			case foregroundColor:
				// getService(JOColor).doExecute(command);
				break;
			case showOutline:
				JOSession.getDefault().getSystemPreferences().put(JOKey.SHOW_OUTLINE,
						(Boolean) command.getNewData()[0]);
				showOutLine(command, (Boolean) command.getNewData()[0]);
				break;
			case showStartMenu:
				Rcpl.UIC.showHomePage();
				break;
			case homeShowOverview:
				Rcpl.UIC.showOverviewPage();
				break;
			case homeShowPreferences:
				Rcpl.UIC.showPreferencesPage();
				break;
			case homeShowSamples:
				Rcpl.UIC.showSamplesPage();
				break;
			case homeShowNew:
				Rcpl.UIC.showNewPage();
				break;
			case homeShowTutorials:
				Rcpl.UIC.showTutorialsPage();
				break;
			case homeShowDonation:
				Rcpl.UIC.showDonationPage();
				break;
			case homeShowWhatsNew:
				Rcpl.UIC.showWhatsNewPage();
				break;
			case homeShowAbout:
				Rcpl.UIC.showAboutPage();
				break;
			case CONTACT_US:
				Rcpl.UIC.showContactUsPage();
				break;
			case collapse_all:
				Rcpl.UIC.collapseAll();
				break;
			case bold:
			case italic:
			case underline:
			case fontSize:
				getService(EnServiceId.PARAGRAPH_SERVICE).doExecute(command);
				break;
			default:
				String toolId = command.getTool().getTool().getId();

				if (toolId.startsWith("USE_CASE_")) {
					Rcpl.UIC.showPerspective(command.getTool().getTool().getId(), true);
					return true;
				}

				String service = command.getTool().getService();

				if (service != null) {

					IService srv = getServiceBySimpleName(service);
					if (srv != null) {
						srv.doExecute(command);
						return true;
					}

				}

				Rcpl.UIC.getSideToolBarControl().showGroup(command.getTool().getTool().getId(), true);
				return true;

			// return false;

			}

			return true;
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
			return false;
		}
	}

	@Override
	public Object execute(ICommand command) {
		if (EnCommandId.NO_COMMAND.equals(command.getCommandId())) {
			try {
				IEditor editor = getEditor(command);
				setEditor(editor);
				doExecute(command);
			} catch (Exception e) {
				RCPLModel.logError(e);
			}
			return null;
		}

		IService service = getService(command);
		if (service == null) {
			return null;
		}
		IEditor editor = getEditor(command);
		setEditor(editor);
		service.setEditor(editor);
		try {
			return service.doExecute(command);
		} catch (Exception e) {
			RCPLModel.logError(e);
		}

		return null;
	}

	public Object execute(ITool tool) {
		ICommand command = Rcpl.getFactory().createCommand(null, tool);
		IService service = getService(command);
		try {
			return service.doExecute(command);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	protected void finalizeCommand(RcplCommand command) {
		command.update();
	}

	/**
	 * @return
	 */
	public IColorTool getColorChooser() {
		// try {
		// List<ITool> colorChoosers = JOUtil2
		// .findEditorTools("word/actions/object/color_chooser") //$NON-NLS-1$
		// ;
		// if (colorChoosers != null && colorChoosers.size() > 0) {
		// return (IColorTool) colorChoosers.get(0);
		// }
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		return null;
	}

	/**
	 * @param key
	 */
	protected void showGroup(String key, int shelfIndex) {
		selectGroup(key, shelfIndex, true);
	}

	public void showOutLine(ICommand command, boolean show) {
		if (getEditor(command) != null) {
			getEditor(command).setShowOutlineParagraph(show);
			Iterator<ILayoutObject> it = getDocument(command).layoutObjects();
			while (it.hasNext()) {
				ILayoutObject lo = it.next();
				// TODO ??
				if (lo.getLayoutFigure() != null && lo.getLayoutFigure().getFx() != null) {
					lo.getLayoutFigure().getFx().showOutline(show);
				}
			}
		}
	}

	/**
	 * @param key
	 */
	protected void unimplemented(RcplCommand command) {

		// if (command.getTool().getSubGroupItem() != null) {
		// doActionSubGroupItem(command);
		// return;
		// }

		// if
		// (command.getCommandId().name().startsWith("actions/groups/styles/"))
		// { //$NON-NLS-1$
		// try {
		// getParagraphService().doExecute(command);
		// } catch (Exception e) {
		// LOGGER.error("", e); //$NON-NLS-1$
		// }
		// return;
		// }

		// infotab/actions/editor/setup_tab_browsing
		// if (command.getCommandId().name()
		// .startsWith("actions/paragraph/text_change")) { //$NON-NLS-1$
		// try {
		// getParagraphService().doExecute(command);
		// } catch (Exception e) {
		// LOGGER.error("", e); //$NON-NLS-1$
		// }
		// return;
		// }

		if (command.isUndo() || command.isRedo()) {
			// LOGGER.error("redo/undo command not implemented: " //$NON-NLS-1$
			// + command.getCommandId().name());
			return;
		}
		// JOResourceEntry entry = (JOResourceEntry) command.getEntry();
		// if (entry != null) {
		// if (command.getSource() instanceof JOToolComponent) {
		// if (((JOToolComponent) command.getSource()).getEntry()
		// .isDatabinding()) {
		// return;
		// }
		// }
		// if (entry.getRadiogroup() != null) {
		// if (command.getSource() instanceof IButtonTool) {
		// if (((IButtonTool) command.getSource()).getRadioList()
		// .size() == 2) {
		// return;
		// }
		// }
		// }
		// }

		// LOGGER.error("Service unimplemented: " +
		// command.getCommandId().name()); //$NON-NLS-1$

		return;
	}

	public static RcplSetupService getSetupService() {
		return (RcplSetupService) getService(RcplSetupService.class);
	}

	protected RcplContextMenuGeneralService getContextMenuGeneralService() {
		return (RcplContextMenuGeneralService) getService(RcplContextMenuGeneralService.class);
	}

	protected RcplDeleteService getDeleteService() {
		return (RcplDeleteService) getService(RcplDeleteService.class);
	}

	protected RcplDocumentService getDocumentService() {
		return (RcplDocumentService) getService(RcplDocumentService.class);
	}

	RcplBrowserService getBrowserService() {
		return (RcplBrowserService) getService(RcplBrowserService.class);
	}

	@Override
	public IService getService(EnServiceId serviceId) {

		switch (serviceId) {
		case BROWSER_SERVICE:
			return getBrowserService();
		case COMMAND_SERVICE:
			return getCommandService();
		case CONTEXT_MENU_SERVICE:
			return getContextMenuGeneralService();
		case DEFAULT_SERVICE:
			return this;
		case DELETE_SERVICE:
			return getDeleteService();
		case DOCUMENT_SERVICE:
			return getDocumentService();
		case EDITOR_SERVICE:
			return getEditorService();
		case SETUP_SERVICE:
			return getSetupService();
		case COLOR_SERVICE:
			return getServiceBySimpleName("JOColorService");
		case FONT_SERVICE:
			return getServiceBySimpleName("JOFontService");
		case INSERT_SERVICE:
			return getServiceBySimpleName("JOInsertService");
		case LAYOUT_SERVICE:
			return getServiceBySimpleName("JOLayoutService");
		case PARAGRAPH_SERVICE:
			return getServiceBySimpleName("JOParagraphService");
		case PICTURE_SERVICE:
			return getServiceBySimpleName("JOPictureService");
		case TABLE_SERVICE:
			return getServiceBySimpleName("JOTableService");
		default:
			break;
		}

		if (serviceRegistry != null) {
			return serviceRegistry.get(serviceId);
		}
		return null;
	}

	private HashMap<EnServiceId, IService> serviceRegistry;

	@Override
	public void registerService(EnServiceId serviceId, IService service) {
		if (serviceRegistry == null) {
			serviceRegistry = new HashMap<EnServiceId, IService>();
		}
		serviceRegistry.put(serviceId, service);
		Rcpl.progressMessage(service.getClass().getSimpleName() + " registered");
	}

	/**
	 * @return
	 */
	protected RcplEditorService getEditorService() {
		return (RcplEditorService) getService(RcplEditorService.class);
	}

	RcplGroupButtonService getGroupButtonService() {
		return (RcplGroupButtonService) getService(RcplGroupButtonService.class);
	}

	RcplInfoTabService getInfoTabService() {
		return (RcplInfoTabService) getService(RcplInfoTabService.class);
	}

}

// @Override
// public void execute(JOCommand command) {
// if (command.getCommandId().name().equals("actions/command/undo")
// //$NON-NLS-1$
// || command.getCommandId().name().equals("actions/command/redo")) {
// //$NON-NLS-1$
// try {
// getCommandService().doActionPerformed(command);
// } catch (Exception e) {
// LOGGER.error("", e); //$NON-NLS-1$
// // MessageDialog.openError(JOUtil.getShell(),
// // Messages.JOService_Error,
// // Messages.JOService_ExecutionError);
// }
// } else {
// actionPerformed(command, false, false);
// }
// finalizeCommand(command);
// }

/**
 * @param command
 * @param undo
 */
// public void actionPerformed(JOCommand command, boolean undo, boolean
// redo) {
// try {
// command.setUndo(undo);
// command.setRedo(redo);
//
// if (!doActionPerformed(command)) {
// unimplemented(command);
// }
//
// // else {
// // String cmdMessage;
// // if (command.getEntry().isNoCommand()) {
// // cmdMessage = "COMMAND: "; //$NON-NLS-1$
// // } else {
// // cmdMessage = "UNDOABLE COMMAND: "; //$NON-NLS-1$
// // }
// // LOGGER.info(cmdMessage + command.getEntry().getKey());
// // // if (JOUtil.IS_IDE) {
// // // System. out
// // // .log(cmdMessage + command.getEntry().getKey());
// // // }
// // // command.setUndo(false);
// // }
//
// } catch (Exception ex) {
// LOGGER.error("", ex); //$NON-NLS-1$
// }
// }