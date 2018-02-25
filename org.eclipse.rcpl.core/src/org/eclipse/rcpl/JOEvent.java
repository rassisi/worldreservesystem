package org.eclipse.rcpl;

import java.util.HashMap;

/**
 * @author ramin
 * 
 */
public class JOEvent {

	private IStyle style;

	private final EnEditMode editMode;

	private final ILayoutObject layoutObject;

	private final String message;

	private final HashMap<String, Object> data;

	public JOEvent(HashMap<String, Object> data) {
		this.data = data;
		this.editMode = null;
		this.layoutObject = null;
		this.message = null;
	}

	public JOEvent(EnEditMode editMode, HashMap<String, Object> data) {
		this.editMode = editMode;
		this.data = data;
		this.layoutObject = null;
		this.message = null;
	}

	public JOEvent(String message, HashMap<String, Object> data) {
		this.message = message;
		this.data = data;
		this.editMode = null;
		this.layoutObject = null;
	}

	public JOEvent(ILayoutObject layoutObject, IStyle style,
			HashMap<String, Object> data) {
		this.layoutObject = layoutObject;
		this.data = data;
		this.style = style;
		this.editMode = null;
		this.message = null;
	}

	public IStyle getStyle() {
		if (style != null) {
			return style;
		}
		if (layoutObject != null) {
			return layoutObject.getStyle();
		}
		return null;
	}

	public ILayoutObject getLayoutObject() {
		return layoutObject;
	}

	public EnEditMode getEditMode() {
		return editMode;
	}

	public String getMessage() {
		return message;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

}
