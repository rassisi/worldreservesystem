package org.eclipse.rcpl;

import java.util.Properties;

public interface IDocumentViewer {

	void addEntry(Properties properties, String key, Object value);

	void refresh();

	IDocumentList getDocumentList();

}
