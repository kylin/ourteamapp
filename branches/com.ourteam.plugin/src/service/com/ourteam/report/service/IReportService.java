/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.service;

/**
*  ����������
*  Generated Date 2011-09-27 10:52:52   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IReportService {
    /**
     * ȡ�ñ�����Ŀ�б�
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
     * ����IDȡ�ñ�����Ŀ
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
     * �޸ı�����Ŀ��Ϣ
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
     * ȡ�ñ������ݿ�
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
     * ���ñ������ݿ�
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
     * ��ӱ�����Ŀ
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
     * ȡ�ñ�����Ŀ�б�����Դ
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
     * ��ӱ�����Ŀ�б�����Դ
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
     * �޸ı�����Ŀ�б�����Դ
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
     * ɾ��������Ŀ�б�����Դ
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
     * ȡ�ñ�����ͼ����
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
     * ��ӱ�����ͼ����
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
     * ɾ��������ͼ����
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
     * ����IDȡ����ͼ����
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
     * �޸���ͼ������Ϣ
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
     * ȡ����ͼ�ֶ��б�
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
     * �����ͼ�ֶζ���
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
     * �޸���ͼ�ֶζ���
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
     * ȡ�ñ�����ͼ��
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
     * ��ӱ�����ͼ��
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
     * �޸���ͼ�����
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
     * ɾ����ͼ�ֶ�
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
     * ɾ����ͼ�����
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
     * ȡ����ͼ�������
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
     * �����ͼ����
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
     * �޸���ͼ����
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
     * ɾ����ͼ����
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
     * ȡ�ñ���Ŀ¼
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
     * ��ӱ���Ŀ¼
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
     * �޸ı���Ŀ¼
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
     * ɾ������Ŀ¼
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
     * ȡ�ñ���
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
     * ����IDȡ�ñ���
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
     * ��ѯ������ͼ����
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
     * �½�����
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
     * �޸ı���
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
     * ɾ������
     *
     * @param reportId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReport(final long reportId) throws Exception;

    /**
     * ȡ�ñ�����ʾ��
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
     * ���ñ�����ʾ��
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
     * ����IDȡ�ñ����б�����Դ
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
     * ȡ�ñ����������
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
     * ���ñ����������
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
