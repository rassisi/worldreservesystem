package org.eclipse.rcpl.control;

import javafx.beans.binding.Bindings;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

/**
 * @author Ramin
 *
 */
public class IntegerField {

	private TextField textField = new TextField();

	private final SimpleIntegerProperty valueProperty = new SimpleIntegerProperty();

	public IntegerField() {
		
		Bindings.bindBidirectional(textField.textProperty(), valueProperty, new NumberStringConverter());
	}

	
	public void unbindBidirectional(SimpleIntegerProperty newProperty) {
		Bindings.bindBidirectional(textField.textProperty(), newProperty, new NumberStringConverter());
		
	}

	

	public SimpleIntegerProperty valueProperty() {
		return valueProperty;
	}
	
	
	
	
}
