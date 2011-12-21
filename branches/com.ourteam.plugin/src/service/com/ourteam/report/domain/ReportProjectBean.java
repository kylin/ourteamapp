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
public class ReportProjectBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportProject objReportProject;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportProjectDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.report.dao.IReportProjectDAO.Code);

        mappedDaoFields.put("name",
            com.ourteam.report.dao.IReportProjectDAO.Name);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportProjectDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportProjectDAO.Status);
    } 

    /**
     * Creates a new ReportProjectBean object.
     */
    public ReportProjectBean() {
        super();

        objReportProject = new com.ourteam.report.dao.ReportProject();
    } // end ReportProjectBean()

    /**
     * Creates a new ReportProjectBean object.
     *
     * @param aReportProject DOCUMENT ME!
     */
    public ReportProjectBean(
        com.ourteam.report.dao.ReportProject aReportProject) {
        super();

        objReportProject = aReportProject;
    } // end ReportProjectBean()

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
    public com.ourteam.report.dao.ReportProject convertToReportProject() {
        return objReportProject;
    } // end convertToReportProject()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportProject.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportProject.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objReportProject.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objReportProject.setCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objReportProject.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objReportProject.setName(aName);
    } // end setName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportProject.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportProject.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportProject.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportProject.setStatus(aStatus);
    } // end setStatus()

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

        if ((obj instanceof ReportProjectBean) == false) {
            return false;
        } // end if

        ReportProjectBean other = (ReportProjectBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportProject tempReportProject = other.convertToReportProject();

        if ((tempReportProject == null) || (this.objReportProject == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportProject == this.objReportProject) ||
                tempReportProject.equals(this.objReportProject)) {
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
     * @param aReportProjects DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportProjectBean[] toArray(
        com.ourteam.report.dao.ReportProject[] aReportProjects) {
        return toArray(aReportProjects, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportProjects DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportProjectBean[] toArray(
        com.ourteam.report.dao.ReportProject[] aReportProjects,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportProjects)) {
            return new ReportProjectBean[0];
        } // end if

        int length = aReportProjects.length;

        ReportProjectBean[] beans = new ReportProjectBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportProjectBean(aReportProjects[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportProjectBean(aReportProjects[i]);

                aCallBack.populate(beans[i], new Object[] { aReportProjects[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportProjectBean
