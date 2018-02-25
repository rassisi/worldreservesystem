package org.eclipse.rcpl.model.cdo.client;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

import org.eclipse.rcpl.model_2_0_0.rcpl.Preference;
import org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.Preferences;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;

public abstract class JOAbstractPreferences {

	private HashMap<JOKey, String> properties = null;

	protected static final String USER_PREFERENCES = "USER_PREFERENCES";
	protected static final String SYSTEM_PREFERENCES = "SYSTEM_PREFERENCES";

	public JOAbstractPreferences() {
	}

	/**
	 * @param key
	 * @return
	 */
	public boolean getBoolean(JOKey key) {
		String v = getString(key);
		if (v == null) {
			return false;
		}
		try {
			return Boolean.valueOf(v);
		} catch (Exception ex) {
			return false;
		}
	}

	/**
	 * @param key
	 * @return
	 */
	public double getDouble(JOKey key) {
		try {
			return Double.valueOf((String) getProperties().get(key)).doubleValue();
		} catch (Exception ex) {
			return 0;
		}
	}

	/**
	 * @param key
	 * @return
	 */
	public File getFile(JOKey key) {
		String v = getString(key);
		if (v == null || v.length() == 0) {
			return null;
		}
		return new File(v);
	}

	public PreferenceGroup getPreferenceGroup() {
		Preferences prefs = JOSession.getDefault().getRcpl().getAllPreferences();
		PreferenceGroup userPreferences = null;
		for (PreferenceGroup p : prefs.getChildren()) {
			if (USER_PREFERENCES.equals(p.getId())) {
				userPreferences = p;
				break;
			}
		}
		if (userPreferences == null) {
			userPreferences = RcplFactory.eINSTANCE.createPreferenceGroup();
			userPreferences.setId(USER_PREFERENCES);
			prefs.getChildren().add(userPreferences);

			JOSession.getDefault().commit();
		}
		PreferenceGroup ps = createPreferences(userPreferences, JOKey.PREFERENCES_HELP);
		ps = createPreferences(userPreferences, JOKey.PREFERENCES_LANGUAGE);

		if (!hasPreference(ps, null, Locale.class.getName())) {
			Preference p = RcplFactory.eINSTANCE.createPreference();
			p.setId(JOKey.PREFERENCES_LOCALE.getName());
			p.setType(Locale.class.getName());
			p.setValue(Locale.getDefault().toString());
			ps.getPreferences().add(p);
			JOSession.getDefault().commit();
		}

		ps = createPreferences(userPreferences, JOKey.PREFERENCES_THEME);
		return userPreferences;

	}

	/**
	 * @return
	 */
	private HashMap<JOKey, String> getProperties() {
		if (properties == null) {
			properties = new HashMap<JOKey, String>();

			for (Preference p : getPreferenceGroup().getPreferences()) {
				properties.put(JOKey.valueOf(p.getKey()), p.getValue());
			}

		}
		return properties;
	}

	/**
	 * @param key
	 * @return
	 */
	public String getString(JOKey key) {
		return (String) getProperties().get(key);
	}

	public void init() {

	}

	protected boolean isEmpty() {
		return getPreferenceGroup().getPreferences().isEmpty();
	}

	/**
	 * @param key
	 * @param value
	 */
	public void put(JOKey key, boolean value) {
		String v = Boolean.valueOf(value).toString();
		put(key, v);
	}

	public void put(JOKey key, double value) {
		put(key, "" + value);
	}

	/**
	 * @param key
	 * @param value
	 */
	public void put(JOKey key, File value) {
		String v = value.getAbsolutePath();
		put(key, v);
	}

	/**
	 * @param key
	 * @param value
	 */
	public void put(JOKey key, String value) {

		for (Preference p : getPreferenceGroup().getPreferences()) {
			if (p.getKey().equals(key.name())) {
				p.setValue(value);
				getProperties().put(key, value);
				return;
			}
		}

		Preference preference = RcplFactory.eINSTANCE.createPreference();
		preference.setKey(key.name());
		preference.setValue(value);
		getPreferenceGroup().getPreferences().add(preference);
		getProperties().put(key, value);
	}

	/**
	 * @param ps
	 * @param id
	 * @param type
	 * @return
	 */
	private boolean hasPreference(PreferenceGroup ps, String id, String type) {
		for (Preference p : ps.getPreferences()) {
			if ((id == null || id.equals(p.getId()) && (type == null || type.equals(p.getType())))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param userPreferences
	 * @param key
	 */
	private PreferenceGroup createPreferences(PreferenceGroup userPreferences, JOKey key) {
		for (PreferenceGroup ps : JOSession.getDefault().getRcpl().getAllPreferences().getChildren()) {
			if (key.name().equals(ps.getId())) {
				return ps;
			}
		}
		PreferenceGroup prefs = RcplFactory.eINSTANCE.createPreferenceGroup();
		prefs.setId(key.name());
		prefs.setName(key.getName());
		prefs.setImage(key.getImage());
		JOSession.getDefault().getRcpl().getAllPreferences().getChildren().add(prefs);
		JOSession.getDefault().commit();
		return prefs;
	}
}
