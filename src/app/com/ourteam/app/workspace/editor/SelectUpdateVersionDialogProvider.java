package com.ourteam.app.workspace.editor;

import java.util.Map;

import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.utils.AbstractFormDialogProvider;

import com.ourteam.app.utils.ResourceUpdateInfo;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.app.workspace.ui.ResourceVersionComboListProvider;

public class SelectUpdateVersionDialogProvider extends
		AbstractFormDialogProvider<ResourceUpdateInfo> {

	private WorkspaceResourceFileObject fileObject;

	public SelectUpdateVersionDialogProvider(ResourceUpdateInfo formDataModel,
			WorkspaceResourceFileObject fileObject) {
		super(formDataModel);
		this.fileObject = fileObject;
	}

	@Override
	public String getTitle() {
		return "选择更新版本";
	}

	@Override
	protected String getFormConfigId() {
		return "selectUpdateVersionForm";
	}

	@Override
	protected void initFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {
		super.initFormOptionListDataProviders(listDataProiverMap);

		ResourceVersionComboListProvider listProvider = new ResourceVersionComboListProvider(
				this.fileObject);

		listDataProiverMap.put("getResourceVersionList",
				new FormOptionListDataProviderAdapter(listProvider));

	}

	@Override
	public int getInitialHeight() {
		return 400;
	}

	@Override
	public int getInitialWidth() {
		return 500;
	}

}
