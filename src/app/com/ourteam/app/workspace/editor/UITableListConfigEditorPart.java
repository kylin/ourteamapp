package com.ourteam.app.workspace.editor;

import java.io.StringWriter;
import java.util.List;

import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.table.TableBean;
import net.ui.model.table.TableConfig;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class UITableListConfigEditorPart extends
		AbstractUIItemListConfigEditorPart<TableBean> {

	private TableConfig tableConfig;

	@Override
	protected String getTableConfigId() {
		return "uiTableListTable";
	}

	@Override
	protected TableBean[] getDataList(WorkspaceResourceFileObject dataModel)
			throws Exception {

		tableConfig = TableConfig.init(FileUtils.openInputStream(dataModel
				.getResourceFile()));

		return tableConfig.getTableList().toArray(
				new TableBean[tableConfig.getTableList().size()]);
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

		StringWriter outputWriter = new StringWriter();

		tableConfig.getTableList().clear();

		List<TableBean> formBeans = getTableComposite().getDataList();

		tableConfig.getTableList().addAll(formBeans);

		UIConfigUtils.saveUITableConfig(tableConfig, outputWriter);

		FileUtils.writeStringToFile(aDataModel.getResourceFile(),
				outputWriter.toString(), "UTF-8");

		outputWriter.close();
	}

	@Override
	protected boolean editUIItem(TableBean uiItemBean) throws Exception {

		TableBean tableBean = getSelectedItems().get(0);

		UITableConfigDialogProvider dialogProvider = new UITableConfigDialogProvider(
				tableBean);

		return SWTUtils.openDialog(getSite().getShell(), dialogProvider);
	}

	@Override
	protected TableBean addUIItem() throws Exception {
		TableBean tableBean = new TableBean();

		tableBean.setId("yourtable");

		UITableConfigDialogProvider dialogProvider = new UITableConfigDialogProvider(
				tableBean);

		if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
			return tableBean;
		} else {
			return null;
		}

	}

}
