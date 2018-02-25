package org.eclipse.rcpl;

import javafx.scene.control.ButtonBase;

public interface IButton {

	void setButtonListener(IButtonListener buttonListener);

	ButtonBase getNode();

	void setSelected(boolean selected);

	void setVisible(boolean visible);

	void setDisable(boolean disable);

	void setImage(String imageName);

	void setToolTip(String toolTip);

	boolean isSystemButton();

	void setSystemButton();

	void setWidth(double width);

	void setHeight(double height);

}
