/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.service;

/**
*  报表管理服务
*  Generated Date 2011-09-27 10:52:52   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IReportService {
    /**
     * 取得报表项目列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportProjectBean[] getReportProjects()
        throws Exception;

    /**
     * 根据ID取得报表项目
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportProjectBean getReportProjectById(
        final long reportProjectId) throws Exception;

    /**
     * 修改报表项目信息
     *
     * @param reportProjectBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportProjectInfo(
        final com.ourteam.report.domain.ReportProjectBean reportProjectBean)
        throws Exception;

    /**
     * 取得报表数据库
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportDatabaseBean getReportDatabase(
        final long reportProjectId) throws Exception;

    /**
     * 设置报表数据库
     *
     * @param reportProjectId
     * @param reportDatabaseBean
     *
     * @throws Exception
     *
     * @model
     */
    void setReportDatabase(final long reportProjectId,
        final com.ourteam.report.domain.ReportDatabaseBean reportDatabaseBean)
        throws Exception;

    /**
     * 添加报表项目
     *
     * @param reportProject
     *
     * @throws Exception
     *
     * @model
     */
    void addReportProject(
        final com.ourteam.report.domain.ReportProjectBean reportProject)
        throws Exception;

    /**
     * 取得报表项目列表数据源
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportListSourceBean[] getReportProjectListSources(
        final long reportProjectId) throws Exception;

    /**
     * 添加报表项目列表数据源
     *
     * @param reportListSourceBean
     *
     * @throws Exception
     *
     * @model
     */
    void addReportProjectListSource(
        final com.ourteam.report.domain.ReportListSourceBean reportListSourceBean)
        throws Exception;

    /**
     * 修改报表项目列表数据源
     *
     * @param reportListSourceBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportProjectListSource(
        final com.ourteam.report.domain.ReportListSourceBean reportListSourceBean)
        throws Exception;

    /**
     * 删除报表项目列表数据源
     *
     * @param listSourceIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportProjectListSources(final long[] listSourceIds)
        throws Exception;

    /**
     * 取得报表视图定义
     *
     * @param reportProjectId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportViewDefineBean[] getReportViewDefines(
        final long reportProjectId) throws Exception;

    /**
     * 添加报表视图定义
     *
     * @param reportProjectId
     * @param reportViewDefineBean
     *
     * @throws Exception
     *
     * @model
     */
    void addReportViewDefine(final long reportProjectId,
        final com.ourteam.report.domain.ReportViewDefineBean reportViewDefineBean)
        throws Exception;

    /**
     * 删除报表视图定义
     *
     * @param reportViewDefineId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewDefine(final long reportViewDefineId)
        throws Exception;

    /**
     * 根据ID取得视图定义
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportViewDefineBean getReportViewDefineById(
        final long reportViewDefineId) throws Exception;

    /**
     * 修改视图定义信息
     *
     * @param reportViewDefineBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportViewDefine(
        final com.ourteam.report.domain.ReportViewDefineBean reportViewDefineBean)
        throws Exception;

    /**
     * 取得视图字段列表
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportViewFieldBean[] getReportViewDefineFields(
        final long reportViewDefineId) throws Exception;

    /**
     * 添加视图字段定义
     *
     * @param reportViewDefineId
     * @param reportViewFieldBean
     *
     * @throws Exception
     *
     * @model
     */
    void addReportViewdefineFields(final long reportViewDefineId,
        final com.ourteam.report.domain.ReportViewFieldBean[] reportViewFieldBean)
        throws Exception;

    /**
     * 修改视图字段定义
     *
     * @param reportViewFieldBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportViewDefineField(
        final com.ourteam.report.domain.ReportViewFieldBean reportViewFieldBean)
        throws Exception;

    /**
     * 取得报表视图表
     *
     * @param reportViewId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportViewTableBean[] getReportViewDefineTables(
        final long reportViewId) throws Exception;

    /**
     * 添加报表视图表
     *
     * @param reportViewId
     * @param reportViewTableBeans
     *
     * @throws Exception
     *
     * @model
     */
    void addReportViewDefineTables(final long reportViewId,
        final com.ourteam.report.domain.ReportViewTableBean[] reportViewTableBeans)
        throws Exception;

    /**
     * 修改视图表对象
     *
     * @param reportViewTableBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportViewDefineTable(
        final com.ourteam.report.domain.ReportViewTableBean reportViewTableBean)
        throws Exception;

    /**
     * 删除视图字段
     *
     * @param reportViewFieldIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewDefineFields(final long[] reportViewFieldIds)
        throws Exception;

    /**
     * 删除视图表对象
     *
     * @param reportViewTableIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewDefineTables(final long[] reportViewTableIds)
        throws Exception;

    /**
     * 取得视图定义关联
     *
     * @param reportViewDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportViewUnionBean[] getReportViewDefineUnions(
        final long reportViewDefineId) throws Exception;

    /**
     * 添加视图关联
     *
     * @param reportViewId
     * @param reportViewUnion
     *
     * @throws Exception
     *
     * @model
     */
    void addReportViewDefineUnion(final long reportViewId,
        final com.ourteam.report.domain.ReportViewUnionBean reportViewUnion)
        throws Exception;

    /**
     * 修改视图关联
     *
     * @param reportViewUnion
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportViewDefineUnion(
        final com.ourteam.report.domain.ReportViewUnionBean reportViewUnion)
        throws Exception;

    /**
     * 删除视图关联
     *
     * @param reportViewUnionIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewDefineUnions(final long[] reportViewUnionIds)
        throws Exception;

    /**
     * 取得报表目录
     *
     * @param parentCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportCatalogBean[] getReportCatalog(
        final long parentCatalogId) throws Exception;

    /**
     * 添加报表目录
     *
     * @param parentCatalogId
     * @param reportCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void addReportCatalog(final long parentCatalogId,
        final com.ourteam.report.domain.ReportCatalogBean reportCatalog)
        throws Exception;

    /**
     * 修改报表目录
     *
     * @param reportCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReportCatalog(
        final com.ourteam.report.domain.ReportCatalogBean reportCatalog)
        throws Exception;

    /**
     * 删除报表目录
     *
     * @param reportCatalogId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportCatalog(final long reportCatalogId)
        throws Exception;

    /**
     * 取得报表
     *
     * @param reportCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportInstanceBean[] getReports(
        final long reportCatalogId) throws Exception;

    /**
     * 根据ID取得报表
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportInstanceBean getReportById(
        final long reportId) throws Exception;

    /**
     * 查询报表视图定义
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportViewDefineBean[] queryReportViewDeine(
        final com.ourteam.report.dao.ReportViewDefineDAOQueryBean queryBean)
        throws Exception;

    /**
     * 新建报表
     *
     * @param report
     *
     * @throws Exception
     *
     * @model
     */
    void addReport(final com.ourteam.report.domain.ReportInstanceBean report)
        throws Exception;

    /**
     * 修改报表
     *
     * @param report
     *
     * @throws Exception
     *
     * @model
     */
    void modifyReport(final com.ourteam.report.domain.ReportInstanceBean report)
        throws Exception;

    /**
     * 删除报表
     *
     * @param reportId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReport(final long reportId) throws Exception;

    /**
     * 取得报表显示列
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportDisplayColumnBean[] getReportDisplayColumns(
        final long reportId) throws Exception;

    /**
     * 设置报表显示列
     *
     * @param reportId
     * @param reportDisplayColumns
     *
     * @throws Exception
     *
     * @model
     */
    void setReportDisplayColumns(final long reportId,
        final com.ourteam.report.domain.ReportDisplayColumnBean[] reportDisplayColumns)
        throws Exception;

    /**
     * 根据ID取得报表列表数据源
     *
     * @param reportListSourceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportListSourceBean getReportListSourceById(
        final long reportListSourceId) throws Exception;

    /**
     * 取得报表过滤条件
     *
     * @param reportId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.report.domain.ReportFilterBean[] getReportFilters(
        final long reportId) throws Exception;

    /**
     * 设置报表过滤条件
     *
     * @param reportId
     * @param reportFilterBeans
     *
     * @throws Exception
     *
     * @model
     */
    void setReportFilters(final long reportId,
        final com.ourteam.report.domain.ReportFilterBean[] reportFilterBeans)
        throws Exception;
} // end IReportService
