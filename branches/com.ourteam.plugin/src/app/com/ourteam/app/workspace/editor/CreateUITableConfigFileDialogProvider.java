package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;

import net.ui.model.table.TableConfig;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;

public class CreateUITableConfigFileDialogProvider extends
		AbstractCreateConfigFileDialogProvider {

	public CreateUITableConfigFileDialogProvider(File baseDir) {
		super(baseDir, "xml");
	}

	@Override
	public String getTitle() {
		return "新建列表配置文件";
	}

	@Override
	protected void initFileContent(File file) throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUITableConfig(new TableConfig(), outputWriter);

		FileUtils.writeStringToFile(file, outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

}
