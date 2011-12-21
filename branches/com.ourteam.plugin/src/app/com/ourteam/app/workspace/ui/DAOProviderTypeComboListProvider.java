package com.ourteam.app.workspace.ui;

import net.ui.eclipse.utils.AbstractComboListProvider;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;

public class DAOProviderTypeComboListProvider extends
		AbstractComboListProvider<BusinessTemplateProviderTypeBean> {

	public DAOProviderTypeComboListProvider() {
		super(false);
	}

	@Override
	public BusinessTemplateProviderTypeBean[] getDataList() {
		try {
			return BusinessTemplateServiceFactory.getBusinessTemplateService()
					.getBusinessTemplateProviderTypes(
							BusinessObjectTypeEnum.DAO.getName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getDataLabel(BusinessTemplateProviderTypeBean dataItem) {
		return dataItem.getProviderName();
	}

}
