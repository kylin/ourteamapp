package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;

import net.ui.model.action.ActionSetBean;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;

public class CreateUIActionConfigFileDialogProvider extends
		AbstractCreateConfigFileDialogProvider {

	public CreateUIActionConfigFileDialogProvider(File baseDir) {
		super(baseDir, "xml");
	}

	@Override
	public String getTitle() {
		return "新建动作配置文件";
	}

	@Override
	protected void initFileContent(File file) throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUIActionConfig(new ActionSetBean(), outputWriter);

		FileUtils.writeStringToFile(file, outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

}
