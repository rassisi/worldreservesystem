package com.joffice.rcpl.plugin.office.internal.impl;

import java.io.File;
import java.util.HashMap;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IDocumentProvider;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.util.JOUtil2;

import com.joffice.rcpl.plugin.office.internal.JOAbstractDocument;

/**
 * @author ramin
 *
 */
public class JODocumentProvider implements IDocumentProvider {

	@Override
	public IDocument createTemplateDocument(String fileName, HashMap<String, String> wordReplacements,
			boolean onePage) {
		return loadTemplateDocument(fileName, wordReplacements, false, onePage);
	}

	@Override
	public void createTemplateDocument(String fileName, File file) {
		JOUtil2.loadTemplateDocumentToFile(fileName, file, false);
	}

	@Override
	public String createHtmlDocument(String fileName, HashMap<String, String> wordReplacements) {
		return JOUtil2.loadTemplateHTMLDocument(fileName, wordReplacements, true);
	}

	/**
	 * @param templateResourceName
	 * @return
	 */
	public static IDocument loadTemplateDocument(String name, HashMap<String, String> wordReplacements,
			boolean escapeHtml, boolean onePage) {
		try {
			IDocument doc = null;
			File templateFile = JOUtil2.loadTemplateDocumentToFile(name, false);
			if (templateFile == null) {
				return null;
			}
			doc = JOAbstractDocument.load(templateFile, true, wordReplacements, onePage);
			return doc;
		} catch (Exception ex) {
			RCPLModel.logError(ex);
			return null;
		}
	}

}
