/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:37
 *
 * @model auto gen
 */
public class ReportListSourceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportListSource objReportListSource;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportListSourceDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.report.dao.IReportListSourceDAO.Code);

        mappedDaoFields.put("idAttr",
            com.ourteam.report.dao.IReportListSourceDAO.IdAttr);

        mappedDaoFields.put("name",
            com.ourteam.report.dao.IReportListSourceDAO.Name);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportListSourceDAO.Remarks);

        mappedDaoFields.put("reportProjectId",
            com.ourteam.report.dao.IReportListSourceDAO.ReportProjectId);

        mappedDaoFields.put("sqlScript",
            com.ourteam.report.dao.IReportListSourceDAO.SqlScript);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportListSourceDAO.Status);

        mappedDaoFields.put("textAttr",
            com.ourteam.report.dao.IReportListSourceDAO.TextAttr);
    } 

    /**
     * Creates a new ReportListSourceBean object.
     */
    public ReportListSourceBean() {
        super();

        objReportListSource = new com.ourteam.report.dao.ReportListSource();
    } // end ReportListSourceBean()

    /**
     * Creates a new ReportListSourceBean object.
     *
     * @param aReportListSource DOCUMENT ME!
     */
    public ReportListSourceBean(
        com.ourteam.report.dao.ReportListSource aReportListSource) {
        super();

        objReportListSource = aReportListSource;
    } // end ReportListSourceBean()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.report.dao.ReportListSource convertToReportListSource() {
        return objReportListSource;
    } // end convertToReportListSource()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportListSource.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportListSource.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objReportListSource.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objReportListSource.setCode(aCode);
    } // end setCode()

    /**
     * Get IdAttr
     *
     * @return idAttr
     */
    public String getIdAttr() {
        return objReportListSource.getIdAttr();
    } // end getIdAttr()

    /**
     * Set IdAttr
     *
     * @param aIdAttr
     */
    public void setIdAttr(String aIdAttr) {
        this.objReportListSource.setIdAttr(aIdAttr);
    } // end setIdAttr()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objReportListSource.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objReportListSource.setName(aName);
    } // end setName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportListSource.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportListSource.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportProjectId
     *
     * @return reportProjectId
     */
    public long getReportProjectId() {
        return objReportListSource.getReportProjectId();
    } // end getReportProjectId()

    /**
     * Set ReportProjectId
     *
     * @param aReportProjectId
     */
    public void setReportProjectId(long aReportProjectId) {
        this.objReportListSource.setReportProjectId(aReportProjectId);
    } // end setReportProjectId()

    /**
     * Get SqlScript
     *
     * @return sqlScript
     */
    public String getSqlScript() {
        return objReportListSource.getSqlScript();
    } // end getSqlScript()

    /**
     * Set SqlScript
     *
     * @param aSqlScript
     */
    public void setSqlScript(String aSqlScript) {
        this.objReportListSource.setSqlScript(aSqlScript);
    } // end setSqlScript()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportListSource.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportListSource.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TextAttr
     *
     * @return textAttr
     */
    public String getTextAttr() {
        return objReportListSource.getTextAttr();
    } // end getTextAttr()

    /**
     * Set TextAttr
     *
     * @param aTextAttr
     */
    public void setTextAttr(String aTextAttr) {
        this.objReportListSource.setTextAttr(aTextAttr);
    } // end setTextAttr()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
    } // end hashCode()

    /**
     * DOCUMENT ME!
     *
     * @param obj DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } // end if

        if ((obj instanceof ReportListSourceBean) == false) {
            return false;
        } // end if

        ReportListSourceBean other = (ReportListSourceBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportListSource tempReportListSource = other.convertToReportListSource();

        if ((tempReportListSource == null) ||
                (this.objReportListSource == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportListSource == this.objReportListSource) ||
                tempReportListSource.equals(this.objReportListSource)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aReportListSources DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportListSourceBean[] toArray(
        com.ourteam.report.dao.ReportListSource[] aReportListSources) {
        return toArray(aReportListSources, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportListSources DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportListSourceBean[] toArray(
        com.ourteam.report.dao.ReportListSource[] aReportListSources,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportListSources)) {
            return new ReportListSourceBean[0];
        } // end if

        int length = aReportListSources.length;

        ReportListSourceBean[] beans = new ReportListSourceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportListSourceBean(aReportListSources[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportListSourceBean(aReportListSources[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportListSources[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportListSourceBean
