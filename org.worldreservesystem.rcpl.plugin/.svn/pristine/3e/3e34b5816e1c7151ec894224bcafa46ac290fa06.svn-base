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
public class JOEmuPoint extends JOEmu {

	public JOEmuPoint(double value) {
		this.value = JOConversion.Pt2Emu(value);
	}

	public JOEmuPoint(BigInteger value) {
		this.value = JOConversion.Pt2Emu(value.doubleValue());
	}

	public JOEmuPoint(String value) {
		if (value == null || value.trim().length() == 0) {
			this.value = BigInteger.ZERO;
			return;
		}

		if (value.endsWith("mm")) {
			value = value.substring(0, value.length() - 2);
			double mm = Double.valueOf(value);
			double emu = JOConversion.millimeterToEmu(mm);
			this.value = BigInteger.valueOf((long) emu);
			return;
		}

		this.value = JOConversion.pointsAndInchesAndValuesToEmu(value);
	}

}
