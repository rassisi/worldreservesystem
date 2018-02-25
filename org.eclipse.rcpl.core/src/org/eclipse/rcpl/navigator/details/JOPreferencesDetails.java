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

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import org.eclipse.rcpl.model_2_0_0.rcpl.Preference;
import org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.Preferences;

/**
 * @author ramin
 *
 */
public class JOPreferencesDetails {

	private final Parent node;

	/**
	 * @param preferences
	 */
	public JOPreferencesDetails(Preferences preferences) {

		node = new GridPane();

		Label l = new Label(getDisplayName(preferences));
		l.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
		getNode().add(l, 0, 0);
		GridPane.setColumnSpan(l, 2);
		l.setPadding(new Insets(10, 0, 30, 10));
		int rowIndex = 1;

		for (PreferenceGroup g : preferences.getChildren()) {
			for (Preference pref : g.getPreferences()) {
				l = new Label(getDisplayName(pref));
				l.setPadding(new Insets(10));
				l.setAlignment(Pos.TOP_LEFT);

				// getNode().setAlignment(Pos.TOP_LEFT);
				GridPane.setValignment(l, VPos.TOP);
				getNode().add(l, 0, rowIndex);
				Node editor = createEditor(pref);
				getNode().add(editor, 1, rowIndex);
				rowIndex++;
			}
		}

	}

	/**
	 * @param pref
	 * @return
	 */
	private String getDisplayName(Preferences prefs) {
		if (prefs.getName() != null && prefs.getName().length() > 0) {
			return prefs.getName();
		}
		return prefs.getId();
	}

	/**
	 * @param pref
	 * @return
	 */
	private String getDisplayName(Preference pref) {
		if (pref.getName() != null && pref.getName().length() > 0) {
			return pref.getName();
		}
		return pref.getId();
	}

	/**
	 * @return
	 */
	public GridPane getNode() {
		return (GridPane) node;
	}

	private Node createEditor(Preference pref) {
		String type = pref.getType();

		try {
			Class<?> cl = Class.forName(type);

			if (cl == Locale.class) {
				return new InputFieldLocale(pref.getValue());
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

		}

		return new TextField(pref.getValue());

	}
}
