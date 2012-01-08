package com.ourteam.plugin;

import java.io.File;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

import com.ourteam.plugin.modelbase.ModelBaseContext;

public class WorkbenchPropertyPage extends PropertyPage implements
		IWorkbenchPropertyPage {

	private PropertiesConfiguration configuration;

	private IJavaProject javaProject;

	public WorkbenchPropertyPage() {

	}

	public IJavaProject getJavaProject() {
		return javaProject;
	}

	protected PropertiesConfiguration getPropertiesConfiguration() {

		javaProject = (IJavaProject) getElement();

		if (configuration != null) {
			return configuration;
		}

		try {

			ModelBaseContext.start(getShell());

			File projectDir = javaProject.getProject().getLocation().toFile();

			File configFile = new File(projectDir, ".ourteam");

			if (configFile.exists() == false) {
				configFile.createNewFile();
			}

			configuration = new PropertiesConfiguration(configFile);

			return configuration;

		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout());

		return composite;
	}

}
