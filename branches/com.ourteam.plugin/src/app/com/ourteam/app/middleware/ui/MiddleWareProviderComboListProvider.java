package com.ourteam.app.middleware.ui;

import net.ui.eclipse.utils.AbstractComboListProvider;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareProviderComboListProvider extends
		AbstractComboListProvider<MiddleWareProviderBean> {

	private MiddleWareTypeEnum middleWareTypeEnum;

	public MiddleWareProviderComboListProvider(
			MiddleWareTypeEnum middleWareTypeEnum) {
		super();
		this.middleWareTypeEnum = middleWareTypeEnum;
	}

	@Override
	public MiddleWareProviderBean[] getDataList() throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareProviders(middleWareTypeEnum);
	}

	@Override
	public String getDataLabel(MiddleWareProviderBean dataItem) {
		return dataItem.getProviderName() + " " + dataItem.getMiddleWareName()
				+ " " + dataItem.getMiddleWareVersion();
	}

}
