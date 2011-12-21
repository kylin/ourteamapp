package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;

import net.ui.model.tree.TreeBean;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;

public class CreateUITreeConfigFileDialogProvider extends
		AbstractCreateConfigFileDialogProvider {

	public CreateUITreeConfigFileDialogProvider(File baseDir) {
		super(baseDir, "xml");
	}

	@Override
	public String getTitle() {
		return "新建树型列表配置文件";
	}

	@Override
	protected void initFileContent(File file) throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUITreeConfig(new TreeBean(), outputWriter);

		FileUtils.writeStringToFile(file, outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

}
