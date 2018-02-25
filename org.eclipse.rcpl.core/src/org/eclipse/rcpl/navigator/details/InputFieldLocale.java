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

package org.eclipse.rcpl.navigator.details;

import java.util.Locale;

import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

/**
 * @author ramin
 *
 */
public class InputFieldLocale extends VBox {

	public InputFieldLocale(String value) {

		String language = "";
		String country = "";

		String[] splits = value.split("_");
		int index = 0;
		for (String s : splits) {
			switch (index) {
			case 0:
				language = s;
				break;
			case 1:
				country = s;
				break;
			}
			index++;
		}

		setSpacing(10);
		ComboBox<String> languageCombo = new ComboBox<String>();
		languageCombo.getItems().addAll(Locale.getISOLanguages());
		languageCombo.getSelectionModel().select(language);
		languageCombo.setPrefWidth(200);

		ComboBox<String> countryCombo = new ComboBox<String>();
		countryCombo.getItems().addAll(Locale.getISOCountries());
		countryCombo.getSelectionModel().select(country);
		countryCombo.setPrefWidth(200);

		getChildren().addAll(languageCombo, countryCombo);

	}
}
