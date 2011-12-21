package com.ourteam.app.modelbase.ui;

import java.util.Map;

import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.modelbase.editor.BusinessDomainComboListProvider;
import com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class ModelPackageSearchComposite
		extends
		AbstractConfigableSearchComposite<BusinessPackageSearchDataModel, BusinessPackageBean> {

	private final static IBusinessPackageService businessPackageService = BusinessPackageServiceFactory
			.getBusinessPackageService();

	private BusinessPackageTypeEnum[] packageTypeEnums;

	private long[] exculdPackageIds;

	public ModelPackageSearchComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	public BusinessPackageTypeEnum[] getPackageTypeEnums() {
		return packageTypeEnums;
	}

	public void setPackageTypeEnums(BusinessPackageTypeEnum[] packageTypeEnums) {
		this.packageTypeEnums = packageTypeEnums;
	}

	public long[] getExculdPackageIds() {
		return exculdPackageIds;
	}

	public void setExculdPackageIds(long[] exculdPackageIds) {
		this.exculdPackageIds = exculdPackageIds;
	}

	@Override
	protected BusinessPackageBean[] doSearch(
			BusinessPackageSearchDataModel packageSearchDataModel)
			throws Exception {
		Long businessDomianId = packageSearchDataModel.getBusinessDomainId();

		String packageName = packageSearchDataModel.getName();

		BusinessPackageDAOQueryBean queryBean = new BusinessPackageDAOQueryBean();

		BusinessPackageDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		if (businessDomianId != null) {
			criteria.andBusinessDomainIdEqualTo(businessDomianId);
		}

		if (StringUtils.isNotBlank(packageName)) {
			criteria.andNameLike(packageName);
		}

		if (ArrayUtils.isNotEmpty(packageTypeEnums)) {

			String[] packageTypes = new String[packageTypeEnums.length];

			for (int i = 0; i < packageTypes.length; i++) {
				packageTypes[i] = packageTypeEnums[i].getName();

			}

			criteria.andTypeIn(packageTypes);
		}

		if (ArrayUtils.isNotEmpty(this.exculdPackageIds)) {
			criteria.andBusinessPackageIdNotIn(this.exculdPackageIds);
		}

		BusinessPackageBean[] businessPackageBeans = businessPackageService
				.queryBusinessPackages(queryBean);

		return businessPackageBeans;

	}

	@Override
	protected void doInitFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

		listDataProiverMap.put("getAllBusinessDomain",
				new FormOptionListDataProviderAdapter(
						new BusinessDomainComboListProvider()));

	}

	@Override
	protected String getQueryFormConfigId() {
		return "businessPackageSearchForm";
	}

	@Override
	protected String getQueryResultConfigId() {
		return "businessPackageTable";
	}

	@Override
	protected BusinessPackageSearchDataModel createSearchDataModel() {
		return new BusinessPackageSearchDataModel();
	}

}
