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

package org.eclipse.rcpl.util;

import java.io.OutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class StringOutputStream extends OutputStream implements Serializable {

	/**
	 * The internal destination StringBuffer.
	 */
	protected StringBuffer buf = null;

	/**
	 * Creates new StringOutputStream, makes a new internal StringBuffer.
	 */
	public StringOutputStream() {
		super();
		buf = new StringBuffer();
	}

	/**
	 * Returns the content of the internal StringBuffer as a String, the result
	 * of all writing to this OutputStream.
	 *
	 * @return returns the content of the internal StringBuffer
	 */
	@Override
	public String toString() {
		return buf.toString();
	}

	/**
	 * Sets the internal StringBuffer to null.
	 */
	@Override
	public void close() {
		buf = null;

	}

	/**
	 * Writes and appends byte array to StringOutputStream.
	 *
	 * @param b
	 *            byte array
	 */
	@Override
	public void write(byte[] b) {
		buf.append(CharUtil.toCharArray(b));
	}

	/**
	 * Writes and appends a byte array to StringOutputStream.
	 *
	 * @param b
	 *            the byte array
	 * @param off
	 *            the byte array starting index
	 * @param len
	 *            the number of bytes from byte array to write to the stream
	 */
	@SuppressWarnings("nls")
	@Override
	public void write(byte[] b, int off, int len) {
		if ((off < 0) || (len < 0) || (off + len) > b.length) {
			throw new IndexOutOfBoundsException(
					"StringOutputStream.write: Parameters out of bounds.");
		}
		byte[] bytes = new byte[len];
		for (int i = 0; i < len; i++) {
			bytes[i] = b[off];
			off++;
		}
		buf.append(CharUtil.toCharArray(bytes));
	}

	/**
	 * Writes and appends a single byte to StringOutputStream.
	 *
	 * @param b
	 *            the byte as an int to add
	 */
	@Override
	public void write(int b) {
		buf.append((char) b);
	}
}
