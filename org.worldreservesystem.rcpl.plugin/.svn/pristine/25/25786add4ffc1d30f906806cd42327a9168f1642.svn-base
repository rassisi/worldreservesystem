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
public class JOEmuCentimeter extends JOEmu {
	public JOEmuCentimeter(double value) {
		this.value = BigInteger.valueOf((long)JOConversion.millimeterToEmu(value*10.0));
	}
}
