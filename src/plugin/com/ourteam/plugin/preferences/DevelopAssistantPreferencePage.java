package com.ourteam.plugin.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import com.ourteam.plugin.Activator;
import com.ourteam.plugin.modelbase.ModelBaseContext;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class DevelopAssistantPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	public DevelopAssistantPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("配置与数据库的连接参数");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		ComboFieldEditor driverFieldEditor = new ComboFieldEditor(
				PreferenceConstants.P_DRIVER_CLASS, "驱动:", new String[][] { {
						"com.mysql.jdbc.Driver", "com.mysql.jdbc.Driver" } },
				getFieldEditorParent());
		
		addField(driverFieldEditor);

		StringFieldEditor serverNameFieldEditor = new StringFieldEditor(
				PreferenceConstants.P_SERVER_NAME, "服务器地址:",
				getFieldEditorParent());

		serverNameFieldEditor.setEmptyStringAllowed(false);

		addField(serverNameFieldEditor);

		IntegerFieldEditor serverPortFieldEditor = new IntegerFieldEditor(
				PreferenceConstants.P_SERVER_PORT, "服务器端口:",
				getFieldEditorParent());

		addField(serverPortFieldEditor);

		StringFieldEditor serverInstanceFieldEditor = new StringFieldEditor(
				PreferenceConstants.P_SERVER_INSTANCE, "服务实例",
				getFieldEditorParent());

		serverInstanceFieldEditor.setEmptyStringAllowed(false);

		addField(serverInstanceFieldEditor);

		StringFieldEditor serverUserFieldEditor = new StringFieldEditor(
				PreferenceConstants.P_SERVER_USER, "用户:",
				getFieldEditorParent());

		serverUserFieldEditor.setEmptyStringAllowed(false);

		addField(serverUserFieldEditor);

		addField(new StringFieldEditor(PreferenceConstants.P_SERVER_PASSWORD,
				"密码:", getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	public boolean performOk() {
		ModelBaseContext.stop();
		ModelBaseContext.start();
		return super.performOk();
	}

}