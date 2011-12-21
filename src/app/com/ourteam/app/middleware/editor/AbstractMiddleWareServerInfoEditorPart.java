package com.ourteam.app.middleware.editor;

import java.util.Map;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;
import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.IFormOptionListDataProvider;

import com.ourteam.app.middleware.ui.MiddleWareProviderComboListProvider;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;

public abstract class AbstractMiddleWareServerInfoEditorPart extends
		AbstractFormEditorPart<MiddleWareBean, MiddleWareServerEditorInput> {

	private static final IMiddleWareService MIDDLE_WARE_SERVICE = MiddleWareServiceFactory
			.getMiddleWareService();

	@Override
	protected void saveDataModel(MiddleWareBean aDataModel) throws Exception {
		MIDDLE_WARE_SERVICE.modifyMiddleWare(aDataModel);
	}

	@Override
	protected void doInitFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

		MiddleWareTypeEnum middleWareTypeEnum = MiddleWareTypeEnum
				.getEnum(getDataModel().getType());

		listDataProiverMap.put("getMiddleWareProviderList",
				new FormOptionListDataProviderAdapter(
						new MiddleWareProviderComboListProvider(
								middleWareTypeEnum)));
	}

}
