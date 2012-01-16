package com.ourteam.plugin.popup.actions;

import java.io.File;

import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.utils.SWTUtils;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

abstract public class AbstractAddUIConfigAction extends
		AbstractJavaProjectAction {
	
	protected IFolder folder;

	abstract protected IDialogProvider getUIConfigDialogProvider(File projectDir);
	
	public void selectionChanged(IAction action, ISelection selection) {

		StructuredSelection structuredSelection = (StructuredSelection) selection;

		if (structuredSelection.isEmpty()) {
			return;
		}
		
		if(structuredSelection.getFirstElement() instanceof IFolder){
			this.folder = (IFolder)structuredSelection.getFirstElement();
		}
	}

	@Override
	public void run(IAction action) {
		
		if(this.folder == null){
			return;
		}

		File projectDir = this.folder.getLocation().toFile();

		IDialogProvider dialogProvider = getUIConfigDialogProvider(projectDir);

		if (SWTUtils.openDialog(shell, dialogProvider)) {
			try {
				this.folder.refreshLocal(IResource.DEPTH_ONE,
						null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

	}

}
