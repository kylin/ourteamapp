package com.ourteam.app.workspace.editor;

import java.io.StringWriter;
import java.util.List;

import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.tab.TabbedConfig;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class UITabListConfigEditorPart extends
		AbstractUIItemListConfigEditorPart<TabbedPaneConfig> {

	private TabbedConfig tabbedConfig;

	@Override
	protected String getTableConfigId() {
		return "uiTabListTable";
	}

	@Override
	protected TabbedPaneConfig[] getDataList(
			WorkspaceResourceFileObject dataModel) throws Exception {

		tabbedConfig = TabbedConfig.parse(FileUtils.openInputStream(dataModel
				.getResourceFile()));

		return tabbedConfig.getTabbedPaneList().toArray(
				new TabbedPaneConfig[tabbedConfig.getTabbedPaneList().size()]);
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

		StringWriter outputWriter = new StringWriter();

		tabbedConfig.getTabbedPaneList().clear();

		List<TabbedPaneConfig> formBeans = getTableComposite().getDataList();

		tabbedConfig.getTabbedPaneList().addAll(formBeans);

		UIConfigUtils.saveUITabConfig(tabbedConfig, outputWriter);

		FileUtils.writeStringToFile(aDataModel.getResourceFile(),
				outputWriter.toString(), "UTF-8");

		outputWriter.close();
	}

	@Override
	protected boolean editUIItem(TabbedPaneConfig uiItemBean) throws Exception {

		UITabConfigDialogProvider dialogProvider = new UITabConfigDialogProvider(
				uiItemBean);

		return SWTUtils.openDialog(getSite().getShell(), dialogProvider);
	}

	@Override
	protected TabbedPaneConfig addUIItem() throws Exception {

		TabbedPaneConfig tabbedPaneConfig = new TabbedPaneConfig();

		tabbedPaneConfig.setId("TabConfig");

		UITabConfigDialogProvider dialogProvider = new UITabConfigDialogProvider(
				tabbedPaneConfig);

		if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
			return tabbedPaneConfig;
		} else {
			return null;
		}

	}

}
