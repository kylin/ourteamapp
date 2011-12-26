package com.ourteam.plugin.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.ourteam.plugin.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_SERVER_NAME, "localhost");
		store.setDefault(PreferenceConstants.P_SERVER_PORT, 3306);
		store.setDefault(PreferenceConstants.P_SERVER_INSTANCE, "our_team");
		store.setDefault(PreferenceConstants.P_SERVER_USER, "user");
		store.setDefault(PreferenceConstants.P_SERVER_PASSWORD, "");
		store.setDefault(PreferenceConstants.P_SERVER_PASSWORD, "com.mysql.jdbc.Driver");
		
	}

}
