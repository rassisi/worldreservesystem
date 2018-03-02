/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office.databinding.types;

import java.math.BigInteger;

import com.joffice.rcpl.plugin.office.internal.config.JOConversion;

/**
 * @author ramin
 * 
 */
public class JOEmu50ThPoint extends JOEmu {
	public JOEmu50ThPoint(BigInteger value) {
		this.value = JOConversion.Pt2Emu(value.doubleValue() / 50.0);
	}
	
	public JOEmu50ThPoint(long value) {
		this.value = JOConversion.Pt2Emu(value / 50.0);
	}
}
