package org.eclipse.rcpl;

public interface IContainer {

	boolean isNoDownloads();

	boolean isNoToolBar();

	boolean isNoStatusBar();

	boolean isOnlyOffice();

	void setNumber(int instanceNumber);

	int getNumber();

	void setSplashText(String text);

	Object getShell();

	IToolRegistry createToolRegistry(IEditor editor, Object infoAreaCanvas,
			String root);

	void setDisableOneMouseClick(boolean disable);

	Object getTopCanvas();

	Object getTopFigure();

	void heartBeat();

	void dispose();

}
