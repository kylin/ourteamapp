package com.ourteam.app.middleware.ui;

import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.apache.commons.lang.StringUtils;
import org.apache.ddlutils.Platform;
import org.apache.ddlutils.PlatformFactory;
import org.apache.ddlutils.model.Database;
import org.apache.ddlutils.model.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.middleware.utils.DatabaseUtils;
import com.ourteam.middleware.domain.MiddleWareBean;

public class DatabaseTableSearchComposite extends
		AbstractConfigableSearchComposite<DatabaseTableSearchDataModel, Table> {

	public DatabaseTableSearchComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	protected int getResultTableStyle() {
		return SWT.BORDER | SWT.FULL_SELECTION | SWT.VIRTUAL | SWT.CHECK;
	}

	@Override
	protected Table[] doSearch(DatabaseTableSearchDataModel searchDataModel)
			throws Exception {

		MiddleWareBean databaseServerBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareById(searchDataModel.getDatabaseServerId());

		SingleConnectionDataSource dataSource = DatabaseUtils
				.getSingleConnectionDataSource(databaseServerBean);

		dataSource.setSuppressClose(true);

		Platform platform = PlatformFactory
				.createNewPlatformInstance(dataSource);

		Database database = platform.readModelFromDatabase(databaseServerBean
				.getServiceName());

		Table[] tables = new Table[0];

		if (StringUtils.isNotBlank(searchDataModel.getTableName())) {
			StringBuffer regEx = new StringBuffer(".*");
			regEx.append(searchDataModel.getTableName());
			regEx.append(".*");
			tables = database.findTables(regEx.toString(), true);
		} else {
			tables = database.getTables();
		}

		dataSource.destroy();

		return tables;
	}

	@Override
	protected String getQueryFormConfigId() {
		return "searchDatabaseObjectForm";
	}

	@Override
	protected String getQueryResultConfigId() {
		return "databaseTableInfoTable";
	}

	@Override
	protected DatabaseTableSearchDataModel createSearchDataModel() {
		return new DatabaseTableSearchDataModel();
	}

}
