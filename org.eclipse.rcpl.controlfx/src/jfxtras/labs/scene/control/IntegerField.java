/*
 * Copyright (c) 2012, JFXtras
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *      * Redistributions of source code must retain the above copyright
 *        notice, this list of conditions and the following disclaimer.
 *      * Redistributions in binary form must reproduce the above copyright
 *        notice, this list of conditions and the following disclaimer in the
 *        documentation and/or other materials provided with the distribution.
 *      * Neither the name of the <organization> nor the
 *        names of its contributors may be used to endorse or promote products
 *        derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 *  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfxtras.labs.scene.control;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Control;

/**
 * Input field for Integer values. This control has the following features: -
 * Integer {@link #number} is parsed and formatted according to the provided
 * NumberFormat - up/down arrow keys and buttons increment/decrement the
 * {@link #number} by {@link #stepwidth}. If {@link #minValueProperty()} and/or
 * {@link #maxValue} are set, values outside these boundaries are not accepted
 * for {@link #number}.
 * 
 * @author Thomas Bolz
 */
public class IntegerField extends Control {

	/**
	 * Default constructor. Returns a {@link IntegerField} with no number,
	 * minValue and maxValue set, but stepwidth 1 and default
	 * {@link NumberFormat}.
	 */
	public IntegerField() {
		super();
		setStyle(null);
		getStyleClass().add("integer-field");
		number = new SimpleObjectProperty<Integer>(this, "number");
		stepwidth = new SimpleObjectProperty<Integer>(this, "stepwidth",
				Integer.valueOf(1));
		maxValue = new SimpleObjectProperty<Integer>(this, "maxValue");
		minValue = new SimpleObjectProperty<Integer>(this, "minValue");
		format = new SimpleObjectProperty<NumberFormat>(this, "format",
				NumberFormat.getNumberInstance());
		promptText = new SimpleStringProperty(this, "promptText", "");
		setFocusTraversable(false);
	}

	/**
	 * Returns a {@link IntegerField} with stepwidth 1 and {@link #number} set
	 * to number.
	 * 
	 * @param number
	 */
	public IntegerField(Integer number) {
		this();
		setNumber(number);
	}

	/**
	 * 
	 * @param initialValue
	 * @param stepwidth
	 * @param format
	 */
	public IntegerField(Integer initialValue, Integer stepwidth,
			NumberFormat format) {
		this();
		this.number.set(initialValue);
		this.stepwidth.set(stepwidth);
		this.format.set(format);
	}

	/**
	 * @return The text representation of number
	 */
	public String getText() {
		if (number.getValue() != null)
			return getFormat().format(number.getValue());
		else
			return null;
	}

	/**
	 * @param formattedNumber
	 *            representation of number
	 */
	public void setText(String formattedNumber) {
		try {
			Number parsedNumber = getFormat().parse(formattedNumber);
			setNumber(new Integer(parsedNumber.toString()));
		} catch (ParseException ex) {
			Logger.getLogger(IntegerField.class.getName()).log(Level.INFO,
					null, ex);
		}
	}

	/**
	 * increments the number by stepwidth
	 */
	public void increment() {
		if (getNumber() != null && getStepwidth() != null) {
			Integer newValue = getNumber().intValue()
					+ getStepwidth().intValue();
			if (checkBounds(newValue) == false) {
				return;
			}
			setNumber(newValue);
		}
	}

	/**
	 * decrements the number by stepwidth
	 */
	public void decrement() {
		if (getNumber() != null && getStepwidth() != null) {
			Integer newValue = getNumber().intValue()
					- getStepwidth().intValue();
			if (checkBounds(newValue) == false) {
				return;
			}
			setNumber(newValue);
		}
	}

	final private ObjectProperty<Integer> number;

	/**
	 * @return The Integer number
	 */
	public Integer getNumber() {
		return number.getValue();
	}

	/**
	 * Set the Integer number
	 */
	public void setNumber(Integer value) {
		if (checkBounds(value) == false) {
			String message = MessageFormat.format(
					"number {0} is out of bounds({1}, {2})", value,
					minValue.get(), maxValue.get());
			throw new IllegalArgumentException(message);
		}
		number.set(value);
	}

	/**
	 * Checks if value is between minValue and maxValue (both including) if set
	 * at all.
	 * 
	 * @param value
	 * @return
	 */
	private boolean checkBounds(Integer value) {
		if (value != null && getMaxValue() != null
				&& value.compareTo(getMaxValue()) > 0) {
			return false;
		}
		if (value != null && getMinValue() != null
				&& value.compareTo(getMinValue()) < 0) {
			return false;
		}
		return true;
	}

	/**
	 * @return The property containing the Integer number
	 */
	public ObjectProperty<Integer> numberProperty() {
		return number;
	}

	/**
	 * stepwidth for inc/dec operation
	 */
	final private ObjectProperty<Integer> stepwidth;

	/**
	 * stepwidth for inc/dec operation
	 */
	public Integer getStepwidth() {
		return stepwidth.getValue();
	}

	/**
	 * stepwidth for inc/dec operation
	 */
	public void setStepwidth(Integer value) {
		stepwidth.set(value);
	}

	/**
	 * stepwidth for inc/dec operation
	 */
	public ObjectProperty<Integer> stepwidthProperty() {
		return stepwidth;
	}

	final private ObjectProperty<NumberFormat> format;

	public NumberFormat getFormat() {
		return format.getValue();
	}

	public final void setFormat(NumberFormat value) {
		format.set(value);
	}

	public ObjectProperty<NumberFormat> formatProperty() {
		return format;
	}

	final private StringProperty promptText;

	public String getPromptText() {
		return promptText.getValue();
	}

	public final void setPromptText(String value) {
		promptText.setValue(value);
	}

	public StringProperty promptTextProperty() {
		return promptText;
	}

	final private ObjectProperty<Integer> maxValue;

	public Integer getMaxValue() {
		return maxValue.getValue();
	}

	public void setMaxValue(Integer value) {
		maxValue.set(value);
	}

	public ObjectProperty<Integer> maxValueProperty() {
		return maxValue;
	}

	final private ObjectProperty<Integer> minValue;

	public Integer getMinValue() {
		return minValue.getValue();
	}

	public void setMinValue(Integer value) {
		minValue.set(value);
	}

	public ObjectProperty<Integer> minValueProperty() {
		return minValue;
	}

	@Override
	public String getUserAgentStylesheet() {
		return getClass().getResource(
				"/jfxtras/labs/internal/scene/control/"
						+ getClass().getSimpleName() + ".css").toExternalForm();
	}
}
