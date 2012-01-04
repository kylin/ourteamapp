package com.ourteam.plugin;

import java.io.File;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.core.runtime.IAdaptable;
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

	protected PropertiesConfiguration configuration;

	protected IJavaProject javaProject;

	public WorkbenchPropertyPage() {

	}

	@Override
	public void createControl(Composite parent) {

		try {
			
			ModelBaseContext.start(getShell());
			
			IAdaptable adaptable = getElement();
			if (adaptable instanceof IJavaProject) {

				javaProject = ((IJavaProject) adaptable);

				File projectDir = javaProject.getProject().getLocation()
						.toFile();

				File configFile = new File(projectDir, ".ourteam");

				if (configFile.exists() == false) {
					configFile.createNewFile();
				}

				configuration = new PropertiesConfiguration(configFile);
			}
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
		}

		super.createControl(parent);
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout());

		return composite;
	}

}
