package com.ourteam.app.workspace.editor;

import java.io.StringWriter;
import java.util.List;

import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormSetConfig;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class UIFormListConfigEditorPart extends
		AbstractUIItemListConfigEditorPart<FormBean> {

	private FormSetConfig formSetConfig;

	@Override
	protected String getTableConfigId() {
		return "uiFormBeanListTable";
	}

	@Override
	protected FormBean[] getDataList(WorkspaceResourceFileObject dataModel)
			throws Exception {

		formSetConfig = FormSetConfig.init(FileUtils.openInputStream(dataModel
				.getResourceFile()));

		return formSetConfig.getFormList().toArray(
				new FormBean[formSetConfig.getFormList().size()]);
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

		StringWriter outputWriter = new StringWriter();

		formSetConfig.getFormList().clear();

		List<FormBean> formBeans = getTableComposite().getDataList();

		formSetConfig.getFormList().addAll(formBeans);

		UIConfigUtils.saveUIFromConfig(formSetConfig, outputWriter);

		FileUtils.writeStringToFile(aDataModel.getResourceFile(),
				outputWriter.toString(), "UTF-8");

		outputWriter.close();
	}

	@Override
	protected boolean editUIItem(FormBean uiItemBean) throws Exception {
		FormBean formBean = getSelectedItems().get(0);

		UIFormConfigDialogProvider dialogProvider = new UIFormConfigDialogProvider(
				formBean);

		return SWTUtils.openDialog(getSite().getShell(), dialogProvider);
	}

	@Override
	protected FormBean addUIItem() throws Exception {
		FormBean formBean = new FormBean();

		formBean.setId("yourform");

		UIFormConfigDialogProvider dialogProvider = new UIFormConfigDialogProvider(
				formBean);

		if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {

			return formBean;
		} else {
			return null;
		}
	}

}
