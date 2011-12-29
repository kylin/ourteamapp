package com.ourteam.plugin.popup.actions;

import java.io.File;

import net.ui.eclipse.utils.IDialogProvider;

import com.ourteam.app.workspace.editor.CreateUITreeConfigFileDialogProvider;

public class AddUITreeAction extends AbstractAddUIConfigAction {

	@Override
	protected IDialogProvider getUIConfigDialogProvider(File projectDir) {
		return new CreateUITreeConfigFileDialogProvider(projectDir);
	}

}