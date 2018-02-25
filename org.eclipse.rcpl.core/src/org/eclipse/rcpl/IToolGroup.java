package org.eclipse.rcpl;

public interface IToolGroup {

	void setSelected(boolean sel);

	IToolComponent getToolComponent();

	void add(ITool tool);

	Object getCanvas();

	int getPaletteWidth1();

	int getPaletteHeight1();

	IResourceEntry getEntry();

	public void createButtons();
}
