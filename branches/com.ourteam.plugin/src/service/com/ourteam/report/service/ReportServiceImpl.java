/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.report.service;

import org.apache.commons.lang.ArrayUtils;

import com.ourteam.report.dao.IReportCatalogDAO;
import com.ourteam.report.dao.IReportDisplayColumnDAO;
import com.ourteam.report.dao.ReportCatalogDAOQueryBean;
import com.ourteam.report.dao.ReportDatabase;
import com.ourteam.report.dao.ReportDatabaseDAOQueryBean;
import com.ourteam.report.dao.ReportDisplayColumn;
import com.ourteam.report.dao.ReportDisplayColumnDAOQueryBean;
import com.ourteam.report.dao.ReportFilter;
import com.ourteam.report.dao.ReportFilterDAOQueryBean;
import com.ourteam.report.dao.ReportInstance;
import com.ourteam.report.dao.ReportInstanceDAOQueryBean;
import com.ourteam.report.dao.ReportListSource;
import com.ourteam.report.dao.ReportListSourceDAOQueryBean;
import com.ourteam.report.dao.ReportProject;
import com.ourteam.report.dao.ReportViewDefine;
import com.ourteam.report.dao.ReportViewDefineDAOQueryBean;
import com.ourteam.report.dao.ReportViewField;
import com.ourteam.report.dao.ReportViewFieldDAOQueryBean;
import com.ourteam.report.dao.ReportViewTable;
import com.ourteam.report.dao.ReportViewTableDAOQueryBean;
import com.ourteam.report.dao.ReportViewUnionDAOQueryBean;
import com.ourteam.report.domain.ReportCatalogBean;
import com.ourteam.report.domain.ReportDatabaseBean;
import com.ourteam.report.domain.ReportDisplayColumnBean;
import com.ourteam.report.domain.ReportFilterBean;
import com.ourteam.report.domain.ReportInstanceBean;
import com.ourteam.report.domain.ReportListSourceBean;
import com.ourteam.report.domain.ReportProjectBean;
import com.ourteam.report.domain.ReportViewDefineBean;
import com.ourteam.report.domain.ReportViewFieldBean;
import com.ourteam.report.domain.ReportViewTableBean;
import com.ourteam.report.domain.ReportViewUnionBean;

/**
 * ���������� impl Generated Date 2011-09-19 15:34:31
 * 
 * @author $Auto Gen
 */
public class ReportServiceImpl extends AbstractReportService {
	/**
	 * ȡ�ñ�����Ŀ�б� impl
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.report.domain.ReportProjectBean[] doGetReportProjects()
			throws Exception {
		return ReportProjectBean.toArray(this.reportProjectDao
				.queryReportProject(null));
	} // end doGetReportProjects()

	@Override
	protected ReportProjectBean doGetReportProjectById(long reportProjectId)
			throws Exception {

		ReportProject reportProject = this.reportProjectDao
				.findReportProjectById(reportProjectId);

		return reportProject != null ? new ReportProjectBean(reportProject)
				: null;
	}

	@Override
	protected void doModifyReportProjectInfo(ReportProjectBean reportProjectBean)
			throws Exception {

		this.reportProjectDao.updateReportProject(reportProjectBean
				.convertToReportProject());
	}

	@Override
	protected ReportDatabaseBean doGetReportDatabase(long reportProjectId)
			throws Exception {

		ReportDatabaseDAOQueryBean queryBean = new ReportDatabaseDAOQueryBean();

		queryBean.createCriteria().andReportProjectIdEqualTo(reportProjectId);

		ReportDatabase[] reportDatabases = this.reportDatabaseDao
				.queryReportDatabase(queryBean);

		return ArrayUtils.isNotEmpty(reportDatabases) ? new ReportDatabaseBean(
				reportDatabases[0]) : null;
	}

	@Override
	protected void doSetReportDatabase(long reportProjectId,
			ReportDatabaseBean aReportDatabase) throws Exception {

		ReportDatabaseBean databaseBean = getReportDatabase(reportProjectId);

		aReportDatabase.setReportProjectId(reportProjectId);

		if (databaseBean == null) {
			this.reportDatabaseDao.insertReportDatabase(aReportDatabase
					.convertToReportDatabase());
		} else {
			aReportDatabase.setId(databaseBean.getId());

			this.reportDatabaseDao.updateReportDatabase(aReportDatabase
					.convertToReportDatabase());
		}

	}

	@Override
	protected void doAddReportProject(ReportProjectBean reportProject)
			throws Exception {
		this.reportProjectDao.insertReportProject(reportProject
				.convertToReportProject());
	}

	@Override
	protected ReportListSourceBean[] doGetReportProjectListSources(
			long reportProjectId) throws Exception {

		ReportListSourceDAOQueryBean queryBean = new ReportListSourceDAOQueryBean();

		queryBean.createCriteria().andReportProjectIdEqualTo(reportProjectId);

		return ReportListSourceBean.toArray(this.reportListSourceDao
				.queryReportListSource(queryBean));
	}

	@Override
	protected void doAddReportProjectListSource(
			ReportListSourceBean reportListSourceBean) throws Exception {

		this.reportListSourceDao.insertReportListSource(reportListSourceBean
				.convertToReportListSource());
	}

	@Override
	protected void doModifyReportProjectListSource(
			ReportListSourceBean reportListSourceBean) throws Exception {

		this.reportListSourceDao.updateReportListSource(reportListSourceBean
				.convertToReportListSource());
	}

	@Override
	protected void doDeleteReportProjectListSources(long[] listSourceIds)
			throws Exception {
		ReportListSourceDAOQueryBean queryBean = new ReportListSourceDAOQueryBean();

		queryBean.createCriteria().andIdIn(listSourceIds);

		this.reportListSourceDao.deleteReportListSource(queryBean);

	}

	@Override
	protected ReportViewDefineBean[] doGetReportViewDefines(long reportProjectId)
			throws Exception {

		ReportViewDefineDAOQueryBean queryBean = new ReportViewDefineDAOQueryBean();

		queryBean.createCriteria().andReportProjectIdEqualTo(reportProjectId);

		return ReportViewDefineBean.toArray(this.reportViewDefineDao
				.queryReportViewDefine(queryBean));
	}

	@Override
	protected void doAddReportViewDefine(long reportProjectId,
			ReportViewDefineBean reportViewDefineBean) throws Exception {

		reportViewDefineBean.setReportProjectId(reportProjectId);

		this.reportViewDefineDao.insertReportViewDefine(reportViewDefineBean
				.convertToReportViewDefine());
	}

	@Override
	protected void doDeleteReportViewDefine(long reportViewDefineId)
			throws Exception {

		ReportViewFieldDAOQueryBean fieldQueryBean = new ReportViewFieldDAOQueryBean();

		fieldQueryBean.createCriteria().andReportViewIdEqualTo(
				reportViewDefineId);

		this.reportViewFieldDao.deleteReportViewField(fieldQueryBean);

		ReportViewTableDAOQueryBean tableQueryBean = new ReportViewTableDAOQueryBean();

		tableQueryBean.createCriteria().andReportViewIdEqualTo(
				reportViewDefineId);

		this.reportViewTableDao.deleteReportViewTable(tableQueryBean);

		this.reportViewDefineDao.deleteReportViewDefine(reportViewDefineId);
	}

	@Override
	protected ReportViewDefineBean doGetReportViewDefineById(
			long reportViewDefineId) throws Exception {

		ReportViewDefine reportViewDefine = this.reportViewDefineDao
				.findReportViewDefineById(reportViewDefineId);

		return reportViewDefine != null ? new ReportViewDefineBean(
				reportViewDefine) : null;
	}

	@Override
	protected void doModifyReportViewDefine(
			ReportViewDefineBean reportViewDefineBean) throws Exception {

		this.reportViewDefineDao.updateReportViewDefine(reportViewDefineBean
				.convertToReportViewDefine());

	}

	@Override
	protected ReportViewFieldBean[] doGetReportViewDefineFields(
			long reportViewDefineId) throws Exception {

		ReportViewFieldDAOQueryBean queryBean = new ReportViewFieldDAOQueryBean();

		queryBean.createCriteria().andReportViewIdEqualTo(reportViewDefineId);

		return ReportViewFieldBean.toArray(this.reportViewFieldDao
				.queryReportViewField(queryBean));
	}

	@Override
	protected void doAddReportViewdefineFields(long reportViewDefineId,
			ReportViewFieldBean[] reportViewFieldBeans) throws Exception {

		ReportViewField[] reportViewFields = new ReportViewField[reportViewFieldBeans.length];

		for (int i = 0; i < reportViewFieldBeans.length; i++) {
			ReportViewFieldBean reportViewFieldBean = reportViewFieldBeans[i];
			reportViewFieldBean.setReportViewId(reportViewDefineId);
			reportViewFields[i] = reportViewFieldBean
					.convertToReportViewField();
		}

		this.reportViewFieldDao.batchInsertReportViewField(reportViewFields);
	}

	@Override
	protected void doModifyReportViewDefineField(
			ReportViewFieldBean reportViewFieldBean) throws Exception {

		this.reportViewFieldDao.updateReportViewField(reportViewFieldBean
				.convertToReportViewField());
	}

	@Override
	protected ReportViewTableBean[] doGetReportViewDefineTables(
			long reportViewId) throws Exception {

		ReportViewTableDAOQueryBean queryBean = new ReportViewTableDAOQueryBean();

		queryBean.createCriteria().andReportViewIdEqualTo(reportViewId);

		return ReportViewTableBean.toArray(this.reportViewTableDao
				.queryReportViewTable(queryBean));
	}

	@Override
	protected void doAddReportViewDefineTables(long reportViewId,
			ReportViewTableBean[] reportViewTableBeans) throws Exception {

		ReportViewTable[] reportViewTables = new ReportViewTable[reportViewTableBeans.length];

		for (int i = 0; i < reportViewTableBeans.length; i++) {
			ReportViewTableBean reportViewTableBean = reportViewTableBeans[i];
			reportViewTableBean.setReportViewId(reportViewId);
			reportViewTables[i] = reportViewTableBean
					.convertToReportViewTable();
		}

		this.reportViewTableDao.batchInsertReportViewTable(reportViewTables);
	}

	@Override
	protected void doModifyReportViewDefineTable(
			ReportViewTableBean reportViewTableBean) throws Exception {

		this.reportViewTableDao.updateReportViewTable(reportViewTableBean
				.convertToReportViewTable());

	}

	@Override
	protected void doDeleteReportViewDefineFields(long[] reportViewFieldIds)
			throws Exception {

		if (ArrayUtils.isEmpty(reportViewFieldIds)) {
			return;
		}

		ReportViewFieldDAOQueryBean queryBean = new ReportViewFieldDAOQueryBean();

		queryBean.createCriteria().andIdIn(reportViewFieldIds);

		this.reportViewFieldDao.deleteReportViewField(queryBean);

	}

	@Override
	protected void doDeleteReportViewDefineTables(long[] reportViewTableIds)
			throws Exception {

		if (ArrayUtils.isEmpty(reportViewTableIds)) {
			return;
		}

		ReportViewTableDAOQueryBean queryBean = new ReportViewTableDAOQueryBean();

		queryBean.createCriteria().andIdIn(reportViewTableIds);

		this.reportViewTableDao.deleteReportViewTable(queryBean);

	}

	@Override
	protected ReportViewUnionBean[] doGetReportViewDefineUnions(
			long reportViewDefineId) throws Exception {

		ReportViewUnionDAOQueryBean queryBean = new ReportViewUnionDAOQueryBean();

		queryBean.createCriteria().andReportViewIdEqualTo(reportViewDefineId);

		return ReportViewUnionBean.toArray(this.reportViewUnionDao
				.queryReportViewUnion(queryBean));
	}

	@Override
	protected void doAddReportViewDefineUnion(long reportViewId,
			ReportViewUnionBean reportViewUnion) throws Exception {

		reportViewUnion.setReportViewId(reportViewId);

		this.reportViewUnionDao.insertReportViewUnion(reportViewUnion
				.convertToReportViewUnion());

	}

	@Override
	protected void doModifyReportViewDefineUnion(
			ReportViewUnionBean reportViewUnion) throws Exception {

		this.reportViewUnionDao.updateReportViewUnion(reportViewUnion
				.convertToReportViewUnion());

	}

	@Override
	protected void doDeleteReportViewDefineUnions(long[] reportViewUnionIds)
			throws Exception {

		if (ArrayUtils.isEmpty(reportViewUnionIds)) {
			return;
		}

		ReportViewUnionDAOQueryBean queryBean = new ReportViewUnionDAOQueryBean();

		queryBean.createCriteria().andIdIn(reportViewUnionIds);

		this.reportViewUnionDao.deleteReportViewUnion(queryBean);

	}

	@Override
	protected ReportCatalogBean[] doGetReportCatalog(long parentCatalogId)
			throws Exception {

		ReportCatalogDAOQueryBean queryBean = new ReportCatalogDAOQueryBean();

		queryBean.createCriteria().andParentCatalogIdEqualTo(parentCatalogId);

		queryBean.setSortProperty(IReportCatalogDAO.CatalogTitle);

		return ReportCatalogBean.toArray(this.reportCatalogDao
				.queryReportCatalog(queryBean));
	}

	@Override
	protected void doAddReportCatalog(long parentCatalogId,
			ReportCatalogBean reportCatalog) throws Exception {

		reportCatalog.setParentCatalogId(parentCatalogId);

		this.reportCatalogDao.insertReportCatalog(reportCatalog
				.convertToReportCatalog());
	}

	@Override
	protected void doModifyReportCatalog(ReportCatalogBean reportCatalog)
			throws Exception {

		this.reportCatalogDao.updateReportCatalog(reportCatalog
				.convertToReportCatalog());

	}

	@Override
	protected void doDeleteReportCatalog(long reportCatalogId) throws Exception {

		this.reportCatalogDao.deleteReportCatalog(reportCatalogId);

	}

	@Override
	protected ReportInstanceBean[] doGetReports(long reportCatalogId)
			throws Exception {

		ReportInstanceDAOQueryBean queryBean = new ReportInstanceDAOQueryBean();

		queryBean.createCriteria().andCatalogIdEqualTo(reportCatalogId);

		return ReportInstanceBean.toArray(this.reportInstanceDao
				.queryReportInstance(queryBean));
	}

	@Override
	protected ReportInstanceBean doGetReportById(long reportId)
			throws Exception {

		ReportInstance reportInstance = this.reportInstanceDao
				.findReportInstanceById(reportId);

		return reportInstance != null ? new ReportInstanceBean(reportInstance)
				: null;
	}

	@Override
	protected ReportViewDefineBean[] doQueryReportViewDeine(
			ReportViewDefineDAOQueryBean queryBean) throws Exception {
		return ReportViewDefineBean.toArray(this.reportViewDefineDao
				.queryReportViewDefine(queryBean));
	}

	@Override
	protected void doAddReport(ReportInstanceBean report) throws Exception {

		this.reportInstanceDao.insertReportInstance(report
				.convertToReportInstance());
	}

	@Override
	protected void doModifyReport(ReportInstanceBean report) throws Exception {

		this.reportInstanceDao.updateReportInstance(report
				.convertToReportInstance());

	}

	@Override
	protected void doDeleteReport(long reportId) throws Exception {

		this.reportInstanceDao.deleteReportInstance(reportId);

	}

	@Override
	protected ReportDisplayColumnBean[] doGetReportDisplayColumns(long reportId)
			throws Exception {

		ReportDisplayColumnDAOQueryBean queryBean = new ReportDisplayColumnDAOQueryBean();

		queryBean.createCriteria().andReportInstanceIdEqualTo(reportId);

		queryBean.setSortProperty(IReportDisplayColumnDAO.SortIndex);

		return ReportDisplayColumnBean.toArray(this.reportDisplayColumnDao
				.queryReportDisplayColumn(queryBean));
	}

	@Override
	protected void doSetReportDisplayColumns(long reportId,
			ReportDisplayColumnBean[] reportDisplayColumns) throws Exception {

		ReportDisplayColumnDAOQueryBean queryBean = new ReportDisplayColumnDAOQueryBean();

		queryBean.createCriteria().andReportInstanceIdEqualTo(reportId);

		ReportDisplayColumn[] displayColumns = new ReportDisplayColumn[reportDisplayColumns.length];

		for (int i = 0; i < displayColumns.length; i++) {
			displayColumns[i] = reportDisplayColumns[i]
					.convertToReportDisplayColumn();
			displayColumns[i].setReportInstanceId(reportId);
			displayColumns[i].setSortIndex(i + 1);
		}

		this.reportDisplayColumnDao.synchronizeReportDisplayColumn(
				displayColumns, queryBean);

	}

	@Override
	protected ReportListSourceBean doGetReportListSourceById(
			long reportListSourceId) throws Exception {

		ReportListSource listSource = this.reportListSourceDao
				.findReportListSourceById(reportListSourceId);

		return listSource != null ? new ReportListSourceBean(listSource) : null;
	}

	@Override
	protected ReportFilterBean[] doGetReportFilters(long reportId)
			throws Exception {

		ReportFilterDAOQueryBean queryBean = new ReportFilterDAOQueryBean();

		queryBean.createCriteria().andReportInstanceIdEqualTo(reportId);

		return ReportFilterBean.toArray(this.reportFilterDao
				.queryReportFilter(queryBean));
	}

	@Override
	protected void doSetReportFilters(long reportId,
			ReportFilterBean[] reportFilterBeans) throws Exception {

		ReportFilterDAOQueryBean queryBean = new ReportFilterDAOQueryBean();

		queryBean.createCriteria().andReportInstanceIdEqualTo(reportId);

		ReportFilter[] reportFilters = new ReportFilter[reportFilterBeans.length];

		for (int i = 0; i < reportFilters.length; i++) {
			reportFilterBeans[i].setReportInstanceId(reportId);
			reportFilters[i] = reportFilterBeans[i].convertToReportFilter();

		}

		this.reportFilterDao.synchronizeReportFilter(reportFilters, queryBean);

	}

} // end ReportServiceImpl
