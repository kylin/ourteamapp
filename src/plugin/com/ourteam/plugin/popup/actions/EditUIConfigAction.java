package com.ourteam.plugin.popup.actions;

import net.ui.eclipse.ImageChache;
import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PartInitException;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.editor.WorkspaceEditorHelper.FileResourceEditorInput;

public class EditUIConfigAction extends AbstractJavaProjectAction {

	public EditUIConfigAction() {

	}

	@Override
	public void run(IAction action) {
		System.out.println("OK");
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		StructuredSelection structuredSelection = (StructuredSelection) selection;

		if (structuredSelection.isEmpty()) {
			return;
		}

		IFile file = (IFile) structuredSelection.getFirstElement();

		WorkspaceResourceFileObject fileObject = new WorkspaceResourceFileObject(
				file.getRawLocation().toFile());
		
		FileResourceEditorInput editorInput = new FileResourceEditorInput(
				fileObject, "uiActionConfigEditorTab");
		
		editorInput.setImageDescriptor(ImageChache.getImageDescriptor("ui_action_config"));

		try {
			this.targetPart.getSite().getPage()
					.openEditor(editorInput, MultiPageEditorPartAgent.EDITOR_ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
