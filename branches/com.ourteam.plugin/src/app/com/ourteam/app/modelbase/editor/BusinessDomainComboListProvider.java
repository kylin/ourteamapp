package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.AbstractComboListProvider;

import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class BusinessDomainComboListProvider extends
		AbstractComboListProvider<BusinessDomainBean> {

	private static final IBusinessDomainService businessDomainService = BusinessDomainServiceFactory
			.getBusinessDomainService();
	
	

	public BusinessDomainComboListProvider() {
		super(false);
	}

	@Override
	public BusinessDomainBean[] getDataList() {
		try {
			return businessDomainService.getAllBusinessDomains();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getDataLabel(BusinessDomainBean dataItem) {
		return dataItem.getName();
	}

}
