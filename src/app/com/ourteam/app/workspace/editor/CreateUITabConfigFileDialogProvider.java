package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;

import net.ui.model.tab.TabbedConfig;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;

public class CreateUITabConfigFileDialogProvider extends
		AbstractCreateConfigFileDialogProvider {

	public CreateUITabConfigFileDialogProvider(File baseDir) {
		super(baseDir, "xml");
	}

	@Override
	public String getTitle() {
		return "新建选项卡配置文件";
	}

	@Override
	protected void initFileContent(File file) throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUITabConfig(new TabbedConfig(), outputWriter);

		FileUtils.writeStringToFile(file, outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

}
