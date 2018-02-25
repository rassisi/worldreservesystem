package org.eclipse.rcpl;

import java.util.List;

public interface IButtonTool {

	void setSelectedInternal(boolean sel);

	void doSelect(boolean sel);

	void setSelected(boolean sel, boolean notify);

	void setSize(int width, int height);

	void setVisible(boolean visible);

	List<IButtonTool> getRadioList();

	String getTabName();;

}
