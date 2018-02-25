package org.eclipse.rcpl;

public interface IHeaderFigure extends ITextable {

	void repaint();

	void setText(String text);

	void setSelectedGroup(IToolGroup group);

}
