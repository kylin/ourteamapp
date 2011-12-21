package com.ourteam.app.middleware.editor;

import net.ui.eclipse.utils.AbstractFormDialogProvider;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareProviderEditDialogProvider extends
		AbstractFormDialogProvider<MiddleWareProviderBean> {

	public MiddleWareProviderEditDialogProvider(
			MiddleWareProviderBean formDataModel) {
		super(formDataModel);
	}

	@Override
	protected String getFormConfigId() {
		return "middleWareProviderForm";
	}

	@Override
	public boolean doOkPressed() throws Exception {
		if (super.doOkPressed()) {

			MiddleWareProviderBean middleWareProviderBean = getFormDataModel();

			if (middleWareProviderBean.getId() == 0) {
				IOurTeamServiceConst.MIDDLE_WARE_SERVICE.addMiddleWareProvider(
						MiddleWareTypeEnum.getEnum(middleWareProviderBean
								.getMiddleWareType()), middleWareProviderBean);
			} else {
				IOurTeamServiceConst.MIDDLE_WARE_SERVICE
						.modifyMiddleWareProvider(middleWareProviderBean);
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getTitle() {
		return getFormDataModel().getId() == 0 ? "新增提供商" : "编辑提供商";
	}

}
