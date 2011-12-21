package com.ourteam.app.middleware.ui;

import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.middleware.dao.MiddleWareDAOQueryBean;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;

public class DatabaseSearchComposite
		extends
		AbstractConfigableSearchComposite<DatabaseSearchDataModel, MiddleWareBean> {

	public DatabaseSearchComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	@Override
	protected MiddleWareBean[] doSearch(DatabaseSearchDataModel searchDataModel)
			throws Exception {

		MiddleWareDAOQueryBean queryBean = new MiddleWareDAOQueryBean();

		MiddleWareDAOQueryBean.Criteria criteria = queryBean.createCriteria();

		criteria.andTypeEqualTo(MiddleWareTypeEnum.DATABASE_SERVER.getName());

		if (StringUtils.isNotBlank(searchDataModel.getName())) {
			criteria.andNameLike(searchDataModel.getName());
		}

		if (searchDataModel.getProviderId() != 0) {
			criteria.andProviderIdEqualTo(searchDataModel.getProviderId());
		}

		IMiddleWareService middleWareService = MiddleWareServiceFactory
				.getMiddleWareService();

		return middleWareService.queryMiddleWare(queryBean);
	}

	@Override
	protected String getQueryFormConfigId() {
		return "searchDatabaseInfoForm";
	}

	@Override
	protected String getQueryResultConfigId() {
		return "databaseInfoTable";
	}

	@Override
	protected DatabaseSearchDataModel createSearchDataModel() {
		return new DatabaseSearchDataModel();
	}

}
