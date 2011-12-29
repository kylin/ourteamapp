package com.ourteam.plugin.popup.actions;

import java.io.File;

import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.utils.SWTUtils;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;

abstract public class AbstractAddUIConfigAction extends
		AbstractJavaProjectAction {

	abstract protected IDialogProvider getUIConfigDialogProvider(File projectDir);

	@Override
	public void run(IAction action) {

		File projectDir = this.javaProject.getProject().getLocation().toFile();

		IDialogProvider dialogProvider = getUIConfigDialogProvider(projectDir);

		if (SWTUtils.openDialog(shell, dialogProvider)) {
			try {
				javaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE,
						null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

	}

}
