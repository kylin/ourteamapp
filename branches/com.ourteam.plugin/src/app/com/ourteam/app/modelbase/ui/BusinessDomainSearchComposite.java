package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessDomainDAO;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class BusinessDomainSearchComposite
		extends
		AbstractConfigableSearchComposite<BusinessDomainSearchDataModel, BusinessDomainBean> {

	private long[] excludeBusinessDomainObjectIds;

	public BusinessDomainSearchComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	public long[] getExcludeBusinessDomainIds() {
		return excludeBusinessDomainObjectIds;
	}

	public void setExcludeBusinessDomainIds(
			long[] excludeBusinessDomainObjectIds) {
		this.excludeBusinessDomainObjectIds = excludeBusinessDomainObjectIds;
	}

	@Override
	protected BusinessDomainBean[] doSearch(
			BusinessDomainSearchDataModel searchDataModel) throws Exception {

		String name = searchDataModel.getName();

		IBusinessDomainService businessDomainService = BusinessDomainServiceFactory
				.getBusinessDomainService();

		BusinessDomainDAOQueryBean queryBean = new BusinessDomainDAOQueryBean();

		BusinessDomainDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		if (StringUtils.isNotBlank(name)) {
			criteria.andNameLike(name);
		}

		if (ArrayUtils.isNotEmpty(this.excludeBusinessDomainObjectIds)) {
			criteria.andBusinessDomainIdNotIn(this.excludeBusinessDomainObjectIds);
		}

		queryBean.setSortProperty(IBusinessDomainDAO.Name);

		BusinessDomainBean[] businessDomainBeans = businessDomainService
				.queryBusinessDomain(queryBean);

		return businessDomainBeans;

	}

	@Override
	protected String getQueryFormConfigId() {
		return "businessDomainSearchForm";
	}

	@Override
	protected String getQueryResultConfigId() {
		return "businessDomainTable";
	}

	@Override
	protected BusinessDomainSearchDataModel createSearchDataModel() {
		return new BusinessDomainSearchDataModel();
	}

}
