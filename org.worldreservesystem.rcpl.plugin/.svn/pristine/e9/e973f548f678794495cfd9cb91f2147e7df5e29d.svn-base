package com.joffice.rcpl.plugin.office.internal.services;

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IPictureToolGroup;

/**
 * @author eclipse
 * 
 */
public class EditorService extends JOAbstractOfficeService {

	public EditorService() {
		super();
	}

	@Override
	public Object doExecute(ICommand cmd) throws Exception {

		switch (cmd.getCommandId()) {
		case save:
			return true;
		case save_as:
			return true;
		case open:
			return true;
		case open_last_document:
			return true;
		default:
			break;
		}

		return false;
	}

}
