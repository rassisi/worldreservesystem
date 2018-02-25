package com.joffice.rcpl.plugin.office.internal.services;

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.Rcpl;

import com.joffice.rcpl.plugin.office.application.JOUic;

/**
 * @author eclipse
 * 
 */
public class NewSPREADSHEETDocumentService extends JOAbstractOfficeService {

	@Override
	public Object doExecute(ICommand command) throws Exception {
		((JOUic) Rcpl.UIC).actionAddSpreadsheetTab();
		return true;
	}
}