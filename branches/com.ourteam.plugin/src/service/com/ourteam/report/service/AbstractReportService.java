/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 报表管理服务 Generated Date 2011-09-27 10:53:58
 *
 * @author Auto Gen
 */
abstract class AbstractReportService extends net.service.DefaultServiceImpl
    implements IReportService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractReportService.class);

    /** ReportCatalog DAO Instance */
    protected com.ourteam.report.dao.IReportCatalogDAO reportCatalogDao;

    /** ReportDatabase DAO Instance */
    protected com.ourteam.report.dao.IReportDatabaseDAO reportDatabaseDao;

    /** ReportDisplayColumn DAO Instance */
    protected com.ourteam.report.dao.IReportDisplayColumnDAO reportDisplayColumnDao;

    /** ReportFilter DAO Instance */
    protected com.ourteam.report.dao.IReportFilterDAO reportFilterDao;

    /** ReportInstance DAO Instance */
    protected com.ourteam.report.dao.IReportInstanceDAO reportInstanceDao;

    /** ReportListSource DAO Instance */
    protected com.ourteam.report.dao.IReportListSourceDAO reportListSourceDao;

    /** ReportProject DAO Instance */
    protected com.ourteam.report.dao.IReportProjectDAO reportProjectDao;

    /** ReportViewDefine DAO Instance */
    protected com.ourteam.report.dao.IReportViewDefineDAO reportViewDefineDao;

    /** ReportViewField DAO Instance */
    protected com.ourteam.report.dao.IReportViewFieldDAO reportViewFieldDao;

    /** ReportViewTable DAO Instance */
    protected com.ourteam.report.dao.IReportViewTableDAO reportViewTableDao;

    /** ReportViewUnion DAO Instance */
    protected com.ourteam.report.dao.IReportViewUnionDAO reportViewUnionDao;

    /**
     * Get ReportCatalog DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportCatalogDAO getReportCatalogDao() {
        return reportCatalogDao;
    } // end getReportCatalogDao()

    /**
     * Set ReportCatalog DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportCatalogDao(
        com.ourteam.report.dao.IReportCatalogDAO aDao) {
        reportCatalogDao = aDao;
    } // end setReportCatalogDao()

    /**
     * Get ReportDatabase DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportDatabaseDAO getReportDatabaseDao() {
        return reportDatabaseDao;
    } // end getReportDatabaseDao()

    /**
     * Set ReportDatabase DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportDatabaseDao(
        com.ourteam.report.dao.IReportDatabaseDAO aDao) {
        reportDatabaseDao = aDao;
    } // end setReportDatabaseDao()

    /**
     * Get ReportDisplayColumn DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportDisplayColumnDAO getReportDisplayColumnDao() {
        return reportDisplayColumnDao;
    } // end getReportDisplayColumnDao()

    /**
     * Set ReportDisplayColumn DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportDisplayColumnDao(
        com.ourteam.report.dao.IReportDisplayColumnDAO aDao) {
        reportDisplayColumnDao = aDao;
    } // end setReportDisplayColumnDao()

    /**
     * Get ReportFilter DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportFilterDAO getReportFilterDao() {
        return reportFilterDao;
    } // end getReportFilterDao()

    /**
     * Set ReportFilter DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportFilterDao(com.ourteam.report.dao.IReportFilterDAO aDao) {
        reportFilterDao = aDao;
    } // end setReportFilterDao()

    /**
     * Get ReportInstance DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportInstanceDAO getReportInstanceDao() {
        return reportInstanceDao;
    } // end getReportInstanceDao()

    /**
     * Set ReportInstance DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportInstanceDao(
        com.ourteam.report.dao.IReportInstanceDAO aDao) {
        reportInstanceDao = aDao;
    } // end setReportInstanceDao()

    /**
     * Get ReportListSource DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportListSourceDAO getReportListSourceDao() {
        return reportListSourceDao;
    } // end getReportListSourceDao()

    /**
     * Set ReportListSource DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportListSourceDao(
        com.ourteam.report.dao.IReportListSourceDAO aDao) {
        reportListSourceDao = aDao;
    } // end setReportListSourceDao()

    /**
     * Get ReportProject DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportProjectDAO getReportProjectDao() {
        return reportProjectDao;
    } // end getReportProjectDao()

    /**
     * Set ReportProject DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportProjectDao(
        com.ourteam.report.dao.IReportProjectDAO aDao) {
        reportProjectDao = aDao;
    } // end setReportProjectDao()

    /**
     * Get ReportViewDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportViewDefineDAO getReportViewDefineDao() {
        return reportViewDefineDao;
    } // end getReportViewDefineDao()

    /**
     * Set ReportViewDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportViewDefineDao(
        com.ourteam.report.dao.IReportViewDefineDAO aDao) {
        reportViewDefineDao = aDao;
    } // end setReportViewDefineDao()

    /**
     * Get ReportViewField DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportViewFieldDAO getReportViewFieldDao() {
        return reportViewFieldDao;
    } // end getReportViewFieldDao()

    /**
     * Set ReportViewField DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportViewFieldDao(
        com.ourteam.report.dao.IReportViewFieldDAO aDao) {
        reportViewFieldDao = aDao;
    } // end setReportViewFieldDao()

    /**
     * Get ReportViewTable DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportViewTableDAO getReportViewTableDao() {
        return reportViewTableDao;
    } // end getReportViewTableDao()

    /**
     * Set ReportViewTable DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportViewTableDao(
        com.ourteam.report.dao.IReportViewTableDAO aDao) {
        reportViewTableDao = aDao;
    } // end setReportViewTableDao()

    /**
     * Get ReportViewUnion DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.IReportViewUnionDAO getReportViewUnionDao() {
        return reportViewUnionDao;
    } // end getReportViewUnionDao()

    /**
     * Set ReportViewUnion DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setReportViewUnionDao(
        com.ourteam.report.dao.IReportViewUnionDAO aDao) {
        reportViewUnionDao = aDao;
    } // end setReportViewUnionDao()

    /**
     * 取得报表项目列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportProjectBean[] doGetReportProjects()
        throws Exception;

    /**
     * 取得报表项目列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportProjectBean[] getReportProjects()
        throws Exception {
        try {
            com.ourteam.report.domain.ReportProjectBean[] result = doGetReportProjects();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportProjects error", e);
            throw e;
        } // end catch
    } // end getReportProjects()

    /**
     * 根据ID取得报表项目
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportProjectBean doGetReportProjectById(
        final long reportProjectId) throws Exception;

    /**
     * 根据ID取得报表项目
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportProjectBean getReportProjectById(
        final long reportProjectId) throws Exception {
        try {
            com.ourteam.report.domain.ReportProjectBean result = doGetReportProjectById(reportProjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportProjectById error", e);
            throw e;
        } // end catch
    } // end getReportProjectById()

    /**
     * 修改报表项目信息
     *
     * @param reportProjectBean
     *
     * @throws Exception
     */
    protected abstract void doModifyReportProjectInfo(
        final com.ourteam.report.domain.ReportProjectBean reportProjectBean)
        throws Exception;

    /**
     * 修改报表项目信息
     *
     * @param reportProjectBean
     *
     * @throws Exception
     */
    public void modifyReportProjectInfo(
        final com.ourteam.report.domain.ReportProjectBean reportProjectBean)
        throws Exception {
        try {
            if (reportProjectBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportProjectBean] Value is NULL");
            } // end if

            doModifyReportProjectInfo(reportProjectBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportProjectInfo error", e);
            throw e;
        } // end catch
    } // end modifyReportProjectInfo()

    /**
     * 取得报表数据库
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportDatabaseBean doGetReportDatabase(
        final long reportProjectId) throws Exception;

    /**
     * 取得报表数据库
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportDatabaseBean getReportDatabase(
        final long reportProjectId) throws Exception {
        try {
            com.ourteam.report.domain.ReportDatabaseBean result = doGetReportDatabase(reportProjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportDatabase error", e);
            throw e;
        } // end catch
    } // end getReportDatabase()

    /**
     * 设置报表数据库
     *
     * @param reportProjectId
     * @param reportDatabaseBean
     *
     * @throws Exception
     */
    protected abstract void doSetReportDatabase(final long reportProjectId,
        final com.ourteam.report.domain.ReportDatabaseBean reportDatabaseBean)
        throws Exception;

    /**
     * 设置报表数据库
     *
     * @param reportProjectId
     * @param reportDatabaseBean
     *
     * @throws Exception
     */
    public void setReportDatabase(final long reportProjectId,
        final com.ourteam.report.domain.ReportDatabaseBean reportDatabaseBean)
        throws Exception {
        try {
            if (reportDatabaseBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportDatabaseBean] Value is NULL");
            } // end if

            doSetReportDatabase(reportProjectId, reportDatabaseBean);
        } // end try
        catch (Exception e) {
            logger.error("do setReportDatabase error", e);
            throw e;
        } // end catch
    } // end setReportDatabase()

    /**
     * 添加报表项目
     *
     * @param reportProject
     *
     * @throws Exception
     */
    protected abstract void doAddReportProject(
        final com.ourteam.report.domain.ReportProjectBean reportProject)
        throws Exception;

    /**
     * 添加报表项目
     *
     * @param reportProject
     *
     * @throws Exception
     */
    public void addReportProject(
        final com.ourteam.report.domain.ReportProjectBean reportProject)
        throws Exception {
        try {
            if (reportProject == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportProject] Value is NULL");
            } // end if

            doAddReportProject(reportProject);
        } // end try
        catch (Exception e) {
            logger.error("do addReportProject error", e);
            throw e;
        } // end catch
    } // end addReportProject()

    /**
     * 取得报表项目列表数据源
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportListSourceBean[] doGetReportProjectListSources(
        final long reportProjectId) throws Exception;

    /**
     * 取得报表项目列表数据源
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportListSourceBean[] getReportProjectListSources(
        final long reportProjectId) throws Exception {
        try {
            com.ourteam.report.domain.ReportListSourceBean[] result = doGetReportProjectListSources(reportProjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportProjectListSources error", e);
            throw e;
        } // end catch
    } // end getReportProjectListSources()

    /**
     * 添加报表项目列表数据源
     *
     * @param reportListSourceBean
     *
     * @throws Exception
     */
    protected abstract void doAddReportProjectListSource(
        final com.ourteam.report.domain.ReportListSourceBean reportListSourceBean)
        throws Exception;

    /**
     * 添加报表项目列表数据源
     *
     * @param reportListSourceBean
     *
     * @throws Exception
     */
    public void addReportProjectListSource(
        final com.ourteam.report.domain.ReportListSourceBean reportListSourceBean)
        throws Exception {
        try {
            if (reportListSourceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportListSourceBean] Value is NULL");
            } // end if

            doAddReportProjectListSource(reportListSourceBean);
        } // end try
        catch (Exception e) {
            logger.error("do addReportProjectListSource error", e);
            throw e;
        } // end catch
    } // end addReportProjectListSource()

    /**
     * 修改报表项目列表数据源
     *
     * @param reportListSourceBean
     *
     * @throws Exception
     */
    protected abstract void doModifyReportProjectListSource(
        final com.ourteam.report.domain.ReportListSourceBean reportListSourceBean)
        throws Exception;

    /**
     * 修改报表项目列表数据源
     *
     * @param reportListSourceBean
     *
     * @throws Exception
     */
    public void modifyReportProjectListSource(
        final com.ourteam.report.domain.ReportListSourceBean reportListSourceBean)
        throws Exception {
        try {
            if (reportListSourceBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportListSourceBean] Value is NULL");
            } // end if

            doModifyReportProjectListSource(reportListSourceBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportProjectListSource error", e);
            throw e;
        } // end catch
    } // end modifyReportProjectListSource()

    /**
     * 删除报表项目列表数据源
     *
     * @param listSourceIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteReportProjectListSources(
        final long[] listSourceIds) throws Exception;

    /**
     * 删除报表项目列表数据源
     *
     * @param listSourceIds
     *
     * @throws Exception
     */
    public void deleteReportProjectListSources(final long[] listSourceIds)
        throws Exception {
        try {
            doDeleteReportProjectListSources(listSourceIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReportProjectListSources error", e);
            throw e;
        } // end catch
    } // end deleteReportProjectListSources()

    /**
     * 取得报表视图定义
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportViewDefineBean[] doGetReportViewDefines(
        final long reportProjectId) throws Exception;

    /**
     * 取得报表视图定义
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportViewDefineBean[] getReportViewDefines(
        final long reportProjectId) throws Exception {
        try {
            com.ourteam.report.domain.ReportViewDefineBean[] result = doGetReportViewDefines(reportProjectId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportViewDefines error", e);
            throw e;
        } // end catch
    } // end getReportViewDefines()

    /**
     * 添加报表视图定义
     *
     * @param reportProjectId
     * @param reportViewDefineBean
     *
     * @throws Exception
     */
    protected abstract void doAddReportViewDefine(final long reportProjectId,
        final com.ourteam.report.domain.ReportViewDefineBean reportViewDefineBean)
        throws Exception;

    /**
     * 添加报表视图定义
     *
     * @param reportProjectId
     * @param reportViewDefineBean
     *
     * @throws Exception
     */
    public void addReportViewDefine(final long reportProjectId,
        final com.ourteam.report.domain.ReportViewDefineBean reportViewDefineBean)
        throws Exception {
        try {
            if (reportViewDefineBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewDefineBean] Value is NULL");
            } // end if

            doAddReportViewDefine(reportProjectId, reportViewDefineBean);
        } // end try
        catch (Exception e) {
            logger.error("do addReportViewDefine error", e);
            throw e;
        } // end catch
    } // end addReportViewDefine()

    /**
     * 删除报表视图定义
     *
     * @param reportViewDefineId
     *
     * @throws Exception
     */
    protected abstract void doDeleteReportViewDefine(
        final long reportViewDefineId) throws Exception;

    /**
     * 删除报表视图定义
     *
     * @param reportViewDefineId
     *
     * @throws Exception
     */
    public void deleteReportViewDefine(final long reportViewDefineId)
        throws Exception {
        try {
            doDeleteReportViewDefine(reportViewDefineId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReportViewDefine error", e);
            throw e;
        } // end catch
    } // end deleteReportViewDefine()

    /**
     * 根据ID取得视图定义
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportViewDefineBean doGetReportViewDefineById(
        final long reportViewDefineId) throws Exception;

    /**
     * 根据ID取得视图定义
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportViewDefineBean getReportViewDefineById(
        final long reportViewDefineId) throws Exception {
        try {
            com.ourteam.report.domain.ReportViewDefineBean result = doGetReportViewDefineById(reportViewDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportViewDefineById error", e);
            throw e;
        } // end catch
    } // end getReportViewDefineById()

    /**
     * 修改视图定义信息
     *
     * @param reportViewDefineBean
     *
     * @throws Exception
     */
    protected abstract void doModifyReportViewDefine(
        final com.ourteam.report.domain.ReportViewDefineBean reportViewDefineBean)
        throws Exception;

    /**
     * 修改视图定义信息
     *
     * @param reportViewDefineBean
     *
     * @throws Exception
     */
    public void modifyReportViewDefine(
        final com.ourteam.report.domain.ReportViewDefineBean reportViewDefineBean)
        throws Exception {
        try {
            if (reportViewDefineBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewDefineBean] Value is NULL");
            } // end if

            doModifyReportViewDefine(reportViewDefineBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportViewDefine error", e);
            throw e;
        } // end catch
    } // end modifyReportViewDefine()

    /**
     * 取得视图字段列表
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportViewFieldBean[] doGetReportViewDefineFields(
        final long reportViewDefineId) throws Exception;

    /**
     * 取得视图字段列表
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportViewFieldBean[] getReportViewDefineFields(
        final long reportViewDefineId) throws Exception {
        try {
            com.ourteam.report.domain.ReportViewFieldBean[] result = doGetReportViewDefineFields(reportViewDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportViewDefineFields error", e);
            throw e;
        } // end catch
    } // end getReportViewDefineFields()

    /**
     * 添加视图字段定义
     *
     * @param reportViewDefineId
     * @param reportViewFieldBean
     *
     * @throws Exception
     */
    protected abstract void doAddReportViewdefineFields(
        final long reportViewDefineId,
        final com.ourteam.report.domain.ReportViewFieldBean[] reportViewFieldBean)
        throws Exception;

    /**
     * 添加视图字段定义
     *
     * @param reportViewDefineId
     * @param reportViewFieldBean
     *
     * @throws Exception
     */
    public void addReportViewdefineFields(final long reportViewDefineId,
        final com.ourteam.report.domain.ReportViewFieldBean[] reportViewFieldBean)
        throws Exception {
        try {
            if (reportViewFieldBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewFieldBean] Value is NULL");
            } // end if

            doAddReportViewdefineFields(reportViewDefineId, reportViewFieldBean);
        } // end try
        catch (Exception e) {
            logger.error("do addReportViewdefineFields error", e);
            throw e;
        } // end catch
    } // end addReportViewdefineFields()

    /**
     * 修改视图字段定义
     *
     * @param reportViewFieldBean
     *
     * @throws Exception
     */
    protected abstract void doModifyReportViewDefineField(
        final com.ourteam.report.domain.ReportViewFieldBean reportViewFieldBean)
        throws Exception;

    /**
     * 修改视图字段定义
     *
     * @param reportViewFieldBean
     *
     * @throws Exception
     */
    public void modifyReportViewDefineField(
        final com.ourteam.report.domain.ReportViewFieldBean reportViewFieldBean)
        throws Exception {
        try {
            if (reportViewFieldBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewFieldBean] Value is NULL");
            } // end if

            doModifyReportViewDefineField(reportViewFieldBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportViewDefineField error", e);
            throw e;
        } // end catch
    } // end modifyReportViewDefineField()

    /**
     * 取得报表视图表
     *
     * @param reportViewId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportViewTableBean[] doGetReportViewDefineTables(
        final long reportViewId) throws Exception;

    /**
     * 取得报表视图表
     *
     * @param reportViewId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportViewTableBean[] getReportViewDefineTables(
        final long reportViewId) throws Exception {
        try {
            com.ourteam.report.domain.ReportViewTableBean[] result = doGetReportViewDefineTables(reportViewId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportViewDefineTables error", e);
            throw e;
        } // end catch
    } // end getReportViewDefineTables()

    /**
     * 添加报表视图表
     *
     * @param reportViewId
     * @param reportViewTableBeans
     *
     * @throws Exception
     */
    protected abstract void doAddReportViewDefineTables(
        final long reportViewId,
        final com.ourteam.report.domain.ReportViewTableBean[] reportViewTableBeans)
        throws Exception;

    /**
     * 添加报表视图表
     *
     * @param reportViewId
     * @param reportViewTableBeans
     *
     * @throws Exception
     */
    public void addReportViewDefineTables(final long reportViewId,
        final com.ourteam.report.domain.ReportViewTableBean[] reportViewTableBeans)
        throws Exception {
        try {
            if (reportViewTableBeans == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewTableBeans] Value is NULL");
            } // end if

            doAddReportViewDefineTables(reportViewId, reportViewTableBeans);
        } // end try
        catch (Exception e) {
            logger.error("do addReportViewDefineTables error", e);
            throw e;
        } // end catch
    } // end addReportViewDefineTables()

    /**
     * 修改视图表对象
     *
     * @param reportViewTableBean
     *
     * @throws Exception
     */
    protected abstract void doModifyReportViewDefineTable(
        final com.ourteam.report.domain.ReportViewTableBean reportViewTableBean)
        throws Exception;

    /**
     * 修改视图表对象
     *
     * @param reportViewTableBean
     *
     * @throws Exception
     */
    public void modifyReportViewDefineTable(
        final com.ourteam.report.domain.ReportViewTableBean reportViewTableBean)
        throws Exception {
        try {
            if (reportViewTableBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewTableBean] Value is NULL");
            } // end if

            doModifyReportViewDefineTable(reportViewTableBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportViewDefineTable error", e);
            throw e;
        } // end catch
    } // end modifyReportViewDefineTable()

    /**
     * 删除视图字段
     *
     * @param reportViewFieldIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteReportViewDefineFields(
        final long[] reportViewFieldIds) throws Exception;

    /**
     * 删除视图字段
     *
     * @param reportViewFieldIds
     *
     * @throws Exception
     */
    public void deleteReportViewDefineFields(final long[] reportViewFieldIds)
        throws Exception {
        try {
            doDeleteReportViewDefineFields(reportViewFieldIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReportViewDefineFields error", e);
            throw e;
        } // end catch
    } // end deleteReportViewDefineFields()

    /**
     * 删除视图表对象
     *
     * @param reportViewTableIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteReportViewDefineTables(
        final long[] reportViewTableIds) throws Exception;

    /**
     * 删除视图表对象
     *
     * @param reportViewTableIds
     *
     * @throws Exception
     */
    public void deleteReportViewDefineTables(final long[] reportViewTableIds)
        throws Exception {
        try {
            doDeleteReportViewDefineTables(reportViewTableIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReportViewDefineTables error", e);
            throw e;
        } // end catch
    } // end deleteReportViewDefineTables()

    /**
     * 取得视图定义关联
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportViewUnionBean[] doGetReportViewDefineUnions(
        final long reportViewDefineId) throws Exception;

    /**
     * 取得视图定义关联
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportViewUnionBean[] getReportViewDefineUnions(
        final long reportViewDefineId) throws Exception {
        try {
            com.ourteam.report.domain.ReportViewUnionBean[] result = doGetReportViewDefineUnions(reportViewDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportViewDefineUnions error", e);
            throw e;
        } // end catch
    } // end getReportViewDefineUnions()

    /**
     * 添加视图关联
     *
     * @param reportViewId
     * @param reportViewUnion
     *
     * @throws Exception
     */
    protected abstract void doAddReportViewDefineUnion(
        final long reportViewId,
        final com.ourteam.report.domain.ReportViewUnionBean reportViewUnion)
        throws Exception;

    /**
     * 添加视图关联
     *
     * @param reportViewId
     * @param reportViewUnion
     *
     * @throws Exception
     */
    public void addReportViewDefineUnion(final long reportViewId,
        final com.ourteam.report.domain.ReportViewUnionBean reportViewUnion)
        throws Exception {
        try {
            if (reportViewUnion == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewUnion] Value is NULL");
            } // end if

            doAddReportViewDefineUnion(reportViewId, reportViewUnion);
        } // end try
        catch (Exception e) {
            logger.error("do addReportViewDefineUnion error", e);
            throw e;
        } // end catch
    } // end addReportViewDefineUnion()

    /**
     * 修改视图关联
     *
     * @param reportViewUnion
     *
     * @throws Exception
     */
    protected abstract void doModifyReportViewDefineUnion(
        final com.ourteam.report.domain.ReportViewUnionBean reportViewUnion)
        throws Exception;

    /**
     * 修改视图关联
     *
     * @param reportViewUnion
     *
     * @throws Exception
     */
    public void modifyReportViewDefineUnion(
        final com.ourteam.report.domain.ReportViewUnionBean reportViewUnion)
        throws Exception {
        try {
            if (reportViewUnion == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportViewUnion] Value is NULL");
            } // end if

            doModifyReportViewDefineUnion(reportViewUnion);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportViewDefineUnion error", e);
            throw e;
        } // end catch
    } // end modifyReportViewDefineUnion()

    /**
     * 删除视图关联
     *
     * @param reportViewUnionIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteReportViewDefineUnions(
        final long[] reportViewUnionIds) throws Exception;

    /**
     * 删除视图关联
     *
     * @param reportViewUnionIds
     *
     * @throws Exception
     */
    public void deleteReportViewDefineUnions(final long[] reportViewUnionIds)
        throws Exception {
        try {
            doDeleteReportViewDefineUnions(reportViewUnionIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReportViewDefineUnions error", e);
            throw e;
        } // end catch
    } // end deleteReportViewDefineUnions()

    /**
     * 取得报表目录
     *
     * @param parentCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportCatalogBean[] doGetReportCatalog(
        final long parentCatalogId) throws Exception;

    /**
     * 取得报表目录
     *
     * @param parentCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportCatalogBean[] getReportCatalog(
        final long parentCatalogId) throws Exception {
        try {
            com.ourteam.report.domain.ReportCatalogBean[] result = doGetReportCatalog(parentCatalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportCatalog error", e);
            throw e;
        } // end catch
    } // end getReportCatalog()

    /**
     * 添加报表目录
     *
     * @param parentCatalogId
     * @param reportCatalog
     *
     * @throws Exception
     */
    protected abstract void doAddReportCatalog(final long parentCatalogId,
        final com.ourteam.report.domain.ReportCatalogBean reportCatalog)
        throws Exception;

    /**
     * 添加报表目录
     *
     * @param parentCatalogId
     * @param reportCatalog
     *
     * @throws Exception
     */
    public void addReportCatalog(final long parentCatalogId,
        final com.ourteam.report.domain.ReportCatalogBean reportCatalog)
        throws Exception {
        try {
            if (reportCatalog == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportCatalog] Value is NULL");
            } // end if

            doAddReportCatalog(parentCatalogId, reportCatalog);
        } // end try
        catch (Exception e) {
            logger.error("do addReportCatalog error", e);
            throw e;
        } // end catch
    } // end addReportCatalog()

    /**
     * 修改报表目录
     *
     * @param reportCatalog
     *
     * @throws Exception
     */
    protected abstract void doModifyReportCatalog(
        final com.ourteam.report.domain.ReportCatalogBean reportCatalog)
        throws Exception;

    /**
     * 修改报表目录
     *
     * @param reportCatalog
     *
     * @throws Exception
     */
    public void modifyReportCatalog(
        final com.ourteam.report.domain.ReportCatalogBean reportCatalog)
        throws Exception {
        try {
            if (reportCatalog == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [reportCatalog] Value is NULL");
            } // end if

            doModifyReportCatalog(reportCatalog);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReportCatalog error", e);
            throw e;
        } // end catch
    } // end modifyReportCatalog()

    /**
     * 删除报表目录
     *
     * @param reportCatalogId
     *
     * @throws Exception
     */
    protected abstract void doDeleteReportCatalog(final long reportCatalogId)
        throws Exception;

    /**
     * 删除报表目录
     *
     * @param reportCatalogId
     *
     * @throws Exception
     */
    public void deleteReportCatalog(final long reportCatalogId)
        throws Exception {
        try {
            doDeleteReportCatalog(reportCatalogId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReportCatalog error", e);
            throw e;
        } // end catch
    } // end deleteReportCatalog()

    /**
     * 取得报表
     *
     * @param reportCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportInstanceBean[] doGetReports(
        final long reportCatalogId) throws Exception;

    /**
     * 取得报表
     *
     * @param reportCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportInstanceBean[] getReports(
        final long reportCatalogId) throws Exception {
        try {
            com.ourteam.report.domain.ReportInstanceBean[] result = doGetReports(reportCatalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReports error", e);
            throw e;
        } // end catch
    } // end getReports()

    /**
     * 根据ID取得报表
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportInstanceBean doGetReportById(
        final long reportId) throws Exception;

    /**
     * 根据ID取得报表
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportInstanceBean getReportById(
        final long reportId) throws Exception {
        try {
            com.ourteam.report.domain.ReportInstanceBean result = doGetReportById(reportId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportById error", e);
            throw e;
        } // end catch
    } // end getReportById()

    /**
     * 查询报表视图定义
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportViewDefineBean[] doQueryReportViewDeine(
        final com.ourteam.report.dao.ReportViewDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询报表视图定义
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportViewDefineBean[] queryReportViewDeine(
        final com.ourteam.report.dao.ReportViewDefineDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.report.domain.ReportViewDefineBean[] result = doQueryReportViewDeine(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryReportViewDeine error", e);
            throw e;
        } // end catch
    } // end queryReportViewDeine()

    /**
     * 新建报表
     *
     * @param report
     *
     * @throws Exception
     */
    protected abstract void doAddReport(
        final com.ourteam.report.domain.ReportInstanceBean report)
        throws Exception;

    /**
     * 新建报表
     *
     * @param report
     *
     * @throws Exception
     */
    public void addReport(
        final com.ourteam.report.domain.ReportInstanceBean report)
        throws Exception {
        try {
            if (report == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [report] Value is NULL");
            } // end if

            doAddReport(report);
        } // end try
        catch (Exception e) {
            logger.error("do addReport error", e);
            throw e;
        } // end catch
    } // end addReport()

    /**
     * 修改报表
     *
     * @param report
     *
     * @throws Exception
     */
    protected abstract void doModifyReport(
        final com.ourteam.report.domain.ReportInstanceBean report)
        throws Exception;

    /**
     * 修改报表
     *
     * @param report
     *
     * @throws Exception
     */
    public void modifyReport(
        final com.ourteam.report.domain.ReportInstanceBean report)
        throws Exception {
        try {
            if (report == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [report] Value is NULL");
            } // end if

            doModifyReport(report);
        } // end try
        catch (Exception e) {
            logger.error("do modifyReport error", e);
            throw e;
        } // end catch
    } // end modifyReport()

    /**
     * 删除报表
     *
     * @param reportId
     *
     * @throws Exception
     */
    protected abstract void doDeleteReport(final long reportId)
        throws Exception;

    /**
     * 删除报表
     *
     * @param reportId
     *
     * @throws Exception
     */
    public void deleteReport(final long reportId) throws Exception {
        try {
            doDeleteReport(reportId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteReport error", e);
            throw e;
        } // end catch
    } // end deleteReport()

    /**
     * 取得报表显示列
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportDisplayColumnBean[] doGetReportDisplayColumns(
        final long reportId) throws Exception;

    /**
     * 取得报表显示列
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportDisplayColumnBean[] getReportDisplayColumns(
        final long reportId) throws Exception {
        try {
            com.ourteam.report.domain.ReportDisplayColumnBean[] result = doGetReportDisplayColumns(reportId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportDisplayColumns error", e);
            throw e;
        } // end catch
    } // end getReportDisplayColumns()

    /**
     * 设置报表显示列
     *
     * @param reportId
     * @param reportDisplayColumns
     *
     * @throws Exception
     */
    protected abstract void doSetReportDisplayColumns(final long reportId,
        final com.ourteam.report.domain.ReportDisplayColumnBean[] reportDisplayColumns)
        throws Exception;

    /**
     * 设置报表显示列
     *
     * @param reportId
     * @param reportDisplayColumns
     *
     * @throws Exception
     */
    public void setReportDisplayColumns(final long reportId,
        final com.ourteam.report.domain.ReportDisplayColumnBean[] reportDisplayColumns)
        throws Exception {
        try {
            if (reportDisplayColumns == null) {
                logger.warn(
                    "The Parameter [reportDisplayColumns] Value is NULL,Exit");

                return;
            } // end if

            doSetReportDisplayColumns(reportId, reportDisplayColumns);
        } // end try
        catch (Exception e) {
            logger.error("do setReportDisplayColumns error", e);
            throw e;
        } // end catch
    } // end setReportDisplayColumns()

    /**
     * 根据ID取得报表列表数据源
     *
     * @param reportListSourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportListSourceBean doGetReportListSourceById(
        final long reportListSourceId) throws Exception;

    /**
     * 根据ID取得报表列表数据源
     *
     * @param reportListSourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportListSourceBean getReportListSourceById(
        final long reportListSourceId) throws Exception {
        try {
            com.ourteam.report.domain.ReportListSourceBean result = doGetReportListSourceById(reportListSourceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportListSourceById error", e);
            throw e;
        } // end catch
    } // end getReportListSourceById()

    /**
     * 取得报表过滤条件
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.report.domain.ReportFilterBean[] doGetReportFilters(
        final long reportId) throws Exception;

    /**
     * 取得报表过滤条件
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.report.domain.ReportFilterBean[] getReportFilters(
        final long reportId) throws Exception {
        try {
            com.ourteam.report.domain.ReportFilterBean[] result = doGetReportFilters(reportId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getReportFilters error", e);
            throw e;
        } // end catch
    } // end getReportFilters()

    /**
     * 设置报表过滤条件
     *
     * @param reportId
     * @param reportFilterBeans
     *
     * @throws Exception
     */
    protected abstract void doSetReportFilters(final long reportId,
        final com.ourteam.report.domain.ReportFilterBean[] reportFilterBeans)
        throws Exception;

    /**
     * 设置报表过滤条件
     *
     * @param reportId
     * @param reportFilterBeans
     *
     * @throws Exception
     */
    public void setReportFilters(final long reportId,
        final com.ourteam.report.domain.ReportFilterBean[] reportFilterBeans)
        throws Exception {
        try {
            doSetReportFilters(reportId, reportFilterBeans);
        } // end try
        catch (Exception e) {
            logger.error("do setReportFilters error", e);
            throw e;
        } // end catch
    } // end setReportFilters()
} // end AbstractReportService
