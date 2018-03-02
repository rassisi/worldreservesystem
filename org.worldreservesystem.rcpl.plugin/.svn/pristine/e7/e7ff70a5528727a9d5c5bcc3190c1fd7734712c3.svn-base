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
public class JOEmu100ThPoint extends JOEmu {
	public JOEmu100ThPoint(BigInteger value) {
		this.value = JOConversion.Pt2Emu(value.doubleValue() / 100.0);
	}
	
	public JOEmu100ThPoint(long value) {
		this.value = JOConversion.Pt2Emu(value / 100.0);
	}
}
