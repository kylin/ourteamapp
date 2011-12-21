package com.ourteam.app.workspace.editor;

import java.io.StringWriter;

import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.constlist.ListDataFactory;

import org.apache.commons.io.FileUtils;

import com.ourteam.app.utils.UIConfigUtils;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class UISelectListConfigEditorPart extends
		AbstractUIItemListConfigEditorPart<ListDataContainer> {

	private ListDataFactory listDataFactory;

	@Override
	protected String getTableConfigId() {
		return "uiSelectListConfigTable";
	}

	@Override
	protected ListDataContainer[] getDataList(
			WorkspaceResourceFileObject dataModel) throws Exception {

		listDataFactory = new ListDataFactory();

		listDataFactory.initListData(FileUtils.openInputStream(dataModel
				.getResourceFile()));

		return listDataFactory.getListDataContainers();
	}

	@Override
	protected void saveDataModel(WorkspaceResourceFileObject aDataModel)
			throws Exception {

		StringWriter outputWriter = new StringWriter();

		UIConfigUtils.saveUISelectListConfig(getTableComposite().getDataList(),
				outputWriter);

		FileUtils.writeStringToFile(aDataModel.getResourceFile(),
				outputWriter.toString(), "UTF-8");

		outputWriter.close();
	}

	@Override
	protected boolean editUIItem(ListDataContainer uiItemBean) throws Exception {
		ListDataContainer listDataContainer = getSelectedItems().get(0);

		UISelectListConfigDialogProvider dialogProvider = new UISelectListConfigDialogProvider(
				listDataContainer);

		return SWTUtils.openDialog(getSite().getShell(), dialogProvider);
	}

	@Override
	protected ListDataContainer addUIItem() throws Exception {
		ListDataContainer listDataContainer = new ListDataContainer();

		UISelectListConfigDialogProvider dialogProvider = new UISelectListConfigDialogProvider(
				listDataContainer);

		if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
			return listDataContainer;
		} else {
			return null;
		}
	}

}
