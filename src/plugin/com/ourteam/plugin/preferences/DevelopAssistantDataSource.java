package com.ourteam.plugin.preferences;

import org.apache.commons.dbcp.BasicDataSource;
import org.eclipse.jface.preference.IPreferenceStore;

import com.ourteam.plugin.Activator;

public class DevelopAssistantDataSource extends BasicDataSource {

	protected IPreferenceStore getStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	public DevelopAssistantDataSource() {
		super();
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		this.driverClassName = store
				.getString(PreferenceConstants.P_DRIVER_CLASS);

		this.username = store.getString(PreferenceConstants.P_SERVER_USER);

		this.password = store.getString(PreferenceConstants.P_SERVER_PASSWORD);

		StringBuffer urlBuffer = new StringBuffer();

		urlBuffer.append("jdbc:mysql://").append(
				store.getString(PreferenceConstants.P_SERVER_NAME));

		if (store.getInt(PreferenceConstants.P_SERVER_PORT) != 0) {
			urlBuffer.append(":").append(
					store.getInt(PreferenceConstants.P_SERVER_PORT));
		}

		urlBuffer.append("/")
				.append(store.getString(PreferenceConstants.P_SERVER_INSTANCE))
				.append("?useUnicode=true&characterEncoding=UTF-8");

		this.url = urlBuffer.toString();
	}

}
