package com.ourteam.app.workspace.editor;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;

import net.ui.model.constlist.ListDataContainer;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;

public class CreateUISelectListConfigFileDialogProvider extends
		AbstractCreateConfigFileDialogProvider {

	public CreateUISelectListConfigFileDialogProvider(File baseDir) {
		super(baseDir, "xml");
	}

	@Override
	public String getTitle() {
		return "新建选择列表配置文件";
	}

	@Override
	protected void initFileContent(File file) throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUISelectListConfig(new ArrayList<ListDataContainer>(), outputWriter);

		FileUtils.writeStringToFile(file, outputWriter.toString(), "UTF-8");

		outputWriter.close();

	}

}
