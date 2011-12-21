/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:36
 *
 * @model auto gen
 */
public class ReportDatabaseBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportDatabase objReportDatabase;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportDatabaseDAO.Id);

        mappedDaoFields.put("databaseId",
            com.ourteam.report.dao.IReportDatabaseDAO.DatabaseId);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportDatabaseDAO.Remarks);

        mappedDaoFields.put("reportProjectId",
            com.ourteam.report.dao.IReportDatabaseDAO.ReportProjectId);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportDatabaseDAO.Status);

        mappedDaoFields.put("databaseName",
            com.ourteam.report.dao.IReportDatabaseDAO.DatabaseName);

        mappedDaoFields.put("databaseProvider",
            com.ourteam.report.dao.IReportDatabaseDAO.DatabaseProvider);
    } 

    /**
     * Creates a new ReportDatabaseBean object.
     */
    public ReportDatabaseBean() {
        super();

        objReportDatabase = new com.ourteam.report.dao.ReportDatabase();
    } // end ReportDatabaseBean()

    /**
     * Creates a new ReportDatabaseBean object.
     *
     * @param aReportDatabase DOCUMENT ME!
     */
    public ReportDatabaseBean(
        com.ourteam.report.dao.ReportDatabase aReportDatabase) {
        super();

        objReportDatabase = aReportDatabase;
    } // end ReportDatabaseBean()

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
    public com.ourteam.report.dao.ReportDatabase convertToReportDatabase() {
        return objReportDatabase;
    } // end convertToReportDatabase()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportDatabase.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportDatabase.setId(aId);
    } // end setId()

    /**
     * Get DatabaseId
     *
     * @return databaseId
     */
    public long getDatabaseId() {
        return objReportDatabase.getDatabaseId();
    } // end getDatabaseId()

    /**
     * Set DatabaseId
     *
     * @param aDatabaseId
     */
    public void setDatabaseId(long aDatabaseId) {
        this.objReportDatabase.setDatabaseId(aDatabaseId);
    } // end setDatabaseId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportDatabase.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportDatabase.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportProjectId
     *
     * @return reportProjectId
     */
    public long getReportProjectId() {
        return objReportDatabase.getReportProjectId();
    } // end getReportProjectId()

    /**
     * Set ReportProjectId
     *
     * @param aReportProjectId
     */
    public void setReportProjectId(long aReportProjectId) {
        this.objReportDatabase.setReportProjectId(aReportProjectId);
    } // end setReportProjectId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportDatabase.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportDatabase.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DatabaseName
     *
     * @return databaseName
     */
    public String getDatabaseName() {
        return objReportDatabase.getDatabaseName();
    } // end getDatabaseName()

    /**
     * Set DatabaseName
     *
     * @param aDatabaseName
     */
    public void setDatabaseName(String aDatabaseName) {
        this.objReportDatabase.setDatabaseName(aDatabaseName);
    } // end setDatabaseName()

    /**
     * Get DatabaseProvider
     *
     * @return databaseProvider
     */
    public String getDatabaseProvider() {
        return objReportDatabase.getDatabaseProvider();
    } // end getDatabaseProvider()

    /**
     * Set DatabaseProvider
     *
     * @param aDatabaseProvider
     */
    public void setDatabaseProvider(String aDatabaseProvider) {
        this.objReportDatabase.setDatabaseProvider(aDatabaseProvider);
    } // end setDatabaseProvider()

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

        if ((obj instanceof ReportDatabaseBean) == false) {
            return false;
        } // end if

        ReportDatabaseBean other = (ReportDatabaseBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportDatabase tempReportDatabase = other.convertToReportDatabase();

        if ((tempReportDatabase == null) || (this.objReportDatabase == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportDatabase == this.objReportDatabase) ||
                tempReportDatabase.equals(this.objReportDatabase)) {
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
     * @param aReportDatabases DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportDatabaseBean[] toArray(
        com.ourteam.report.dao.ReportDatabase[] aReportDatabases) {
        return toArray(aReportDatabases, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportDatabases DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportDatabaseBean[] toArray(
        com.ourteam.report.dao.ReportDatabase[] aReportDatabases,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportDatabases)) {
            return new ReportDatabaseBean[0];
        } // end if

        int length = aReportDatabases.length;

        ReportDatabaseBean[] beans = new ReportDatabaseBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportDatabaseBean(aReportDatabases[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportDatabaseBean(aReportDatabases[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportDatabases[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportDatabaseBean
