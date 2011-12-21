package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessObjectDAO;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ModelObjectSearchComposite
		extends
		AbstractConfigableSearchComposite<BusinessObjectSearchDataModel, BusinessObjectBean> {

	private BusinessObjectTypeEnum[] businessObjectTypeEnums;

	private long[] excludeBusinessObjectIds;

	public ModelObjectSearchComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	public BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
		return businessObjectTypeEnums;
	}

	public void setBusinessObjectTypeEnums(
			BusinessObjectTypeEnum[] businessObjectTypeEnums) {
		this.businessObjectTypeEnums = businessObjectTypeEnums;
	}

	public long[] getExcludeBusinessObjectIds() {
		return excludeBusinessObjectIds;
	}

	public void setExcludeBusinessObjectIds(long[] excludeBusinessObjectIds) {
		this.excludeBusinessObjectIds = excludeBusinessObjectIds;
	}

	@Override
	protected BusinessObjectBean[] doSearch(
			BusinessObjectSearchDataModel searchDataModel) throws Exception {

		String name = searchDataModel.getName();

		IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
				.getBusinessObjectService();

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		BusinessObjectDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		if (StringUtils.isNotBlank(name)) {
			criteria.andNameLike(name);
		}

		if (ArrayUtils.isNotEmpty(this.businessObjectTypeEnums)) {

			String[] types = new String[this.businessObjectTypeEnums.length];

			for (int i = 0; i < this.businessObjectTypeEnums.length; i++) {
				types[i] = this.businessObjectTypeEnums[i].getName();
			}

			criteria.andTypeIn(types);

		}

		if (ArrayUtils.isNotEmpty(this.excludeBusinessObjectIds)) {
			criteria.andBusinessObjectIdNotIn(this.excludeBusinessObjectIds);
		}

		queryBean.setSortProperty(IBusinessObjectDAO.Type);
		queryBean.setSortProperty(IBusinessObjectDAO.Name);

		BusinessObjectBean[] businessObjectBeans = businessObjectService
				.queryBusinessObjects(queryBean);

		return businessObjectBeans;

	}

	@Override
	protected String getQueryFormConfigId() {
		return "businessObjectSearchForm";
	}

	@Override
	protected String getQueryResultConfigId() {
		return "businessObjectTable";
	}

	@Override
	protected BusinessObjectSearchDataModel createSearchDataModel() {
		return new BusinessObjectSearchDataModel();
	}

}
