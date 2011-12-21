package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;

import net.ui.model.form.FormSetConfig;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;

public class CreateUIFormListConfigFileDialogProvider extends
		AbstractCreateConfigFileDialogProvider {

	public CreateUIFormListConfigFileDialogProvider(File baseDir) {
		super(baseDir, "xml");
	}

	@Override
	public String getTitle() {
		return "新建表单配置文件";
	}

	@Override
	protected void initFileContent(File file) throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUIFromConfig(new FormSetConfig(), outputWriter);

		FileUtils.writeStringToFile(file, outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

}
