package com.joffice.rcpl.plugin.office.internal.services;

import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.IService;
import org.eclipse.rcpl.internal.services.RcplService;

import com.joffice.rcpl.plugin.office.internal.figures.JOEditorFigure;

public abstract class JOAbstractOfficeService extends RcplService {

	@Override
	public IService getService(EnServiceId serviceId) {

		IService service = super.getService(serviceId);
		if (service != null) {
			return service;
		}

		switch (serviceId) {
		case COLOR_SERVICE:
			return getService(JOColorService.class);
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
		case FONT_SERVICE:
			return getService(JOFontService.class);
		case INSERT_SERVICE:
			return getService(JOInsertService.class);
		case LAYOUT_SERVICE:
			return getService(JOLayoutService.class);
		case PARAGRAPH_SERVICE:
			return getService(JOParagraphService.class);
		case PICTURE_SERVICE:
			return getService(JOPictureService.class);
		case SETUP_SERVICE:
			return getSetupService();
		case TABLE_SERVICE:
			return getService(JOTableService.class);
		default:
			break;
		}

		return null;
	}

	public JOLayoutService getLayoutService() {
		return (JOLayoutService) getService(JOLayoutService.class);
	}

	public JOParagraphService getParagraphService() {
		return (JOParagraphService) getService(JOParagraphService.class);
	}

	/**
	 * @param editorFigure
	 */
	protected void updateFocusOwner(JOEditorFigure editorFigure) {

		if (editorFigure.getSelectedParagraph() != null) {
			editorFigure.getSelectedParagraph().unselect();
			editorFigure.getSelectedParagraph().activate();

		}
	}
}
