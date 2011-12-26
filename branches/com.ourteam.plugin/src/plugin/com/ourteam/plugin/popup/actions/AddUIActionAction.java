package com.ourteam.plugin.popup.actions;

import java.io.File;

import net.ui.eclipse.utils.SWTUtils;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;

import com.ourteam.app.workspace.editor.CreateUIActionConfigFileDialogProvider;

public class AddUIActionAction extends AbstractJavaProjectAction {

	@Override
	public void run(IAction action) {

		File projectDir = this.javaProject.getProject().getLocation().toFile();

		CreateUIActionConfigFileDialogProvider dialogProvider = new CreateUIActionConfigFileDialogProvider(
				projectDir);

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
