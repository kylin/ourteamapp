package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class CustomDataTypeSearchComposite
		extends
		AbstractConfigableSearchComposite<BusinessObjectSearchDataModel, BusinessObjectBean> {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	public CustomDataTypeSearchComposite(Composite parent) {
		super(parent, SWT.NONE);
		refreshResults();
	}

	@Override
	protected BusinessObjectBean[] doSearch(
			BusinessObjectSearchDataModel searchDataModel) throws Exception {

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		if (StringUtils.isNotBlank(searchDataModel.getName())) {
			queryBean.createCriteria().andNameLike(searchDataModel.getName());
		}

		return BUSINESS_OBJECT_SERVICE.queryCustomDataObjects(queryBean);
	}


	@Override
	protected String getQueryFormConfigId() {
		return "businessObjectSearchForm";
	}


	@Override
	protected String getQueryResultConfigId() {
		return "customDataTypeTable";
	}

	@Override
	protected BusinessObjectSearchDataModel createSearchDataModel() {
		return new BusinessObjectSearchDataModel();
	}

}