/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package org.eclipse.rcpl;


public enum EnLayoutAlignment {

	CENTER, INSIDE, OUTSIDE, LEFT, RIGHT, BOTTOM, INLINE, TOP;

	private ILayoutObject layoutObject;

	private EnLayoutAlignment alignment;

	private EnLayoutAlignment() {
	}

	private EnLayoutAlignment(EnLayoutAlignment alignment,
			ILayoutObject layoutObject) {
		this.alignment = alignment;
		this.layoutObject = layoutObject;
	}

	public ILayoutObject getLayoutObject() {
		return layoutObject;
	}

	public EnLayoutAlignment getAlignment() {
		return alignment;
	}

}
