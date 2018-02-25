/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl.internal.fx.figures;

import org.eclipse.rcpl.AlignType;
import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.IAlignment;
import org.eclipse.rcpl.IButton;
import org.eclipse.rcpl.IButtonListener;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolType;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * @author ramin
 *
 */
public class JOButton extends RcplTool implements IButton {

	private Node imageNode;

	private boolean toggle;

	private IButtonListener buttonListener;

	private boolean systemButton;

	private double width;

	private double height;

	private IImage image;

	public JOButton(String id, String name, String toolTip, String imageName, boolean toggle) {
		super(id, name, toolTip, imageName, toggle);
		this.toggle = toggle;
	}

	public boolean isToggle() {
		return toggle;
	}

	public void setToggle(boolean toggle) {
		this.toggle = toggle;
		try {
			if (toggle) {
				getTool().setType(ToolType.TOGGLEBUTTON);
			} else {
				getTool().setType(ToolType.BUTTON);
			}
		} catch (Exception ex) {
			//
		}
	}

	public JOButton(Tool tool) {
		super(tool);
		toggle = ToolType.TOGGLEBUTTON.equals(tool.getType());
	}

	private void performAction() {
		try {

			getTool().setData(JOButton.this);
			ICommand command = Rcpl.getFactory().createCommand(getEditor(), JOButton.this);
			Object result = Rcpl.service().execute(command);
			if (result instanceof Boolean) {
				if (!((Boolean) result)) {
					doAction();
				}
			}
			if (buttonListener != null) {
				buttonListener.doAction();
			}

		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}

	}

	protected void doAction() {

	}

	public boolean isSelected() {
		if (toggle) {
			return ((ToggleButton) getNode()).isSelected();
		}
		return selected;
	}

	@Override
	public void setSelected(boolean selected) {
		if (toggle) {
			removeToggleButtonListener();
			((ToggleButton) getNode()).setSelected(selected);
			addToggleButtonListener();
		}
		this.selected = selected;
	}

	private ChangeListener<Boolean> toggleButonListener;

	private void addToggleButtonListener() {
		if (isToggle()) {
			((ToggleButton) getNode()).selectedProperty().addListener(toggleButonListener);
		}
	}

	private void removeToggleButtonListener() {
		if (isToggle()) {
			((ToggleButton) getNode()).selectedProperty().removeListener(toggleButonListener);
		}

	}

	@Override
	public ButtonBase createNode() {

		if (toggle) {
			node = new ToggleButton();
			node.setPickOnBounds(false);
			toggleButonListener = new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
					performAction();
				}
			};
			addToggleButtonListener();

		} else {
			node = new Button();
			node.setPickOnBounds(false);
			((ButtonBase) node).setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					performAction();
				}
			});
		}
		String imageName = getTool().getImage();
		if (imageName == null) {
			imageName = getTool().getId();
		}

		node.setId("toolButton");
		image = Rcpl.resources().getSvgImage(imageName, getWidth(), getHeight());

		this.imageNode = image.getNode();

		String toolTip = getTool().getToolTip();
		if (toolTip == null) {
			toolTip = getTool().getName();
		}

		if (toolTip == null) {
			toolTip = getTool().getId();
		}
		final String tt = toolTip;
		// unselectedSkin();

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				Tooltip t = new Tooltip(tt);
				Tooltip.install(node, t);
				t.getStyleClass().add("ttip");
			}
		});

		if (imageNode != null) {
			imageNode.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					performAction();
				}
			});
		}

		((ButtonBase) node).setGraphic(imageNode);
		((ButtonBase) node).setCenterShape(true);
		node.setUserData(this);

		if (getTool() != null) {
			getTool().setData(node);
		}

		return (ButtonBase) node;
	}

	@Override
	public void setButtonListener(IButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}

	@Override
	public void setImage(String imageName) {
		imageNode = Rcpl.resources().getImage(imageName, 16, 16).getNode();
	}

	@Override
	public void setToolTip(String toolTip) {
		Tooltip t = new Tooltip(toolTip);
		t.setId("joffice_tooltip");
		Tooltip.install(imageNode, t);

	}

	@Override
	public boolean isSystemButton() {
		return systemButton;
	}

	@Override
	public void setSystemButton() {
		this.systemButton = true;
	}

	@Override
	public IToolRegistry getToolRegistry() {
		return null;
	}

	@Override
	public IResourceEntry getEntry() {
		return null;
	}

	@Override
	public IToolComponent getToolComponent() {
		return null;
	}

	@Override
	public IToolGroup getGroup() {
		return null;
	}

	@Override
	public void setBounds(double x, double y, double Width, double height) {
		setWidth(Width);
		setHeight(height);
	}

	@Override
	public void setVisible(boolean visible) {
		getNode().setVisible(visible);

	}

	@Override
	public void setDisable(boolean disable) {
		getNode().setDisable(disable);
	}

	public Node getWebView() {
		return imageNode;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		if (width == 0) {
			width = 16;
		}
		return width;
	}

	public double getHeight() {
		if (height == 0) {
			height = 16;
		}
		return height;
	}

	@Override
	public ButtonBase getNode() {
		return (ButtonBase) super.getNode();
	}

	@Override
	public void update(JOEvent event) {
		try {
			if (getTool() != null) {
				String id = getTool().getId();
				if (id == null || "".equals(id)) {
					return;
				}

				removeToggleButtonListener();
				EnCommandId cmd = EnCommandId.valueOf(id);
				switch (cmd) {
				case CONTACT_US:
					break;
				case INSERT_PARAGRAPH:
					break;
				case NO_COMMAND:
					break;
				case USE_CASE:
					break;
				case align_text_center:
					updateAlign(event, AlignType.CENTER);
					break;
				case align_text_justify:
					updateAlign(event, AlignType.BOTH);
					break;
				case align_text_left:
					updateAlign(event, AlignType.LEFT);
					break;
				case align_text_right:
					updateAlign(event, AlignType.RIGHT);
					break;
				case backgroundColor:
					break;
				case bold:
					updateBold(event);
					break;
				case characterStyle:
					break;
				case collapse_all:
					break;
				case expandAfter:
					break;
				case expandBefore:
					break;

				case foregroundColor:
					break;
				case homeShowAbout:
					break;
				case homeShowDonation:
					break;
				case homeShowNew:
					break;
				case homeShowOverview:
					break;
				case homeShowPreferences:
					break;
				case homeShowSamples:
					break;
				case homeShowTemplates:
					break;
				case homeShowTutorials:
					break;
				case homeShowWhatsNew:
					break;
				case insertDrawing:
					break;
				case insertText:
					break;
				case italic:
					updateItalic(event);
					break;
				case layout:
					break;
				case layoutPages:
					break;
				case redo:
					break;
				case setStyle:
					break;
				case showOutline:
					break;
				case showRulers:
					break;
				case showStartMenu:
					break;
				case splitParagraph:
					break;
				case strikethrough:
					break;
				case textStyleListTool:
					break;
				case underline:
					updateUnderline(event);
					break;
				case undo:
					break;
				case updateParagraph:
					break;
				case style_normal:
				case style_title:
				case style_heading_1:
				case style_heading_2:
				case style_heading_3:
				case style_heading_4:
					if (event.getStyle() != null) {
						updateStyle(event, cmd);
					}
					break;
				default:
					break;

				}

			}
		} catch (Exception ex) {
			// ignore
		}
		addToggleButtonListener();
	}

	private void updateStyle(JOEvent event, EnCommandId cmd) {
		IStyle style = findSelectedStyle(event);
		switch (cmd) {
		case style_normal:
			((ToggleButton) getNode()).setSelected("Normal".equals(style.getName()));
			break;
		case style_title:
			((ToggleButton) getNode()).setSelected("Title".equals(style.getName()));
			break;
		case style_heading_1:
			((ToggleButton) getNode()).setSelected("heading 1".equals(style.getName()));
			break;
		case style_heading_2:
			((ToggleButton) getNode()).setSelected("heading 2".equals(style.getName()));
			break;
		case style_heading_3:
			((ToggleButton) getNode()).setSelected("heading 3".equals(style.getName()));
			break;
		case style_heading_4:
			((ToggleButton) getNode()).setSelected("heading 4".equals(style.getName()));
			break;
		default:
			break;
		}

	}

	private IStyle findSelectedStyle(JOEvent event) {
		ILayoutObject lo = event.getLayoutObject();
		if (lo instanceof IParagraph) {
			IParagraph p = (IParagraph) lo;
			return p.findCharacterStyleAtOffset();
		}
		return null;
	}

	// private IStyle getParagraphStyle(JOEvent event) {
	// ILayoutObject lo = event.getLayoutObject();
	// if (lo instanceof IParagraph) {
	// IParagraph p = (IParagraph) lo;
	// return p.getStyle();
	// }
	// return null;
	// }

	private void updateBold(JOEvent event) {
		IStyle style = findSelectedStyle(event);
		if (style != null) {
			((ToggleButton) getNode()).setSelected(style.isBold());
		}
	}

	private void updateItalic(JOEvent event) {
		IStyle style = findSelectedStyle(event);
		if (style != null) {
			((ToggleButton) getNode()).setSelected(style.isItalic());
		}
	}

	private void updateUnderline(JOEvent event) {
		IStyle style = findSelectedStyle(event);
		if (style != null) {
			((ToggleButton) getNode()).setSelected(style.isUnderline());
		}
	}

	private void updateAlign(JOEvent event, AlignType type) {
		ILayoutObject lo = event.getLayoutObject();
		if (lo instanceof IParagraph) {
			IParagraph p = (IParagraph) lo;
			IAlignment al = p.getAlignment();
			if (al != null) {
				removeToggleButtonListener();
				((ToggleButton) getNode()).setSelected(al.getType().equals(type));
				addToggleButtonListener();
			}
		}
	}

	@Override
	public IImage getImage() {
		return image;
	}
}
