package org.eclipse.rcpl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public interface IToolRegistry {

	List<ITool> getTools();

	String getRoot();

	ITool[] findAllTools(String key);

	List<ITool> findTools(String key);

	Iterator<ITool> toolIterator();

	Iterator<IToolGroup> groupIterator();

	void dispose();

	IToolGroup findGroup(String id);

	IToolGroup findToolGroup(String key);

	Map<String, IToolGroup> getGroupToolRegistry();

	boolean isInfoTab();
}
