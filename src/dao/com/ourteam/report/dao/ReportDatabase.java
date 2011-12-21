/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:52
 *
 * @author Auto Gen
 */
public class ReportDatabase implements java.io.Serializable {
    /**
     * Creates a new ReportDatabase object.
     */
    public ReportDatabase() {
        super();
    } // end ReportDatabase()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long databaseId;

    /** Attribute  Be Seted Falg */
    private boolean databaseIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean databaseIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long reportProjectId;

    /** Attribute  Be Seted Falg */
    private boolean reportProjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportProjectIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String databaseName;

    /** Attribute  Be Seted Falg */
    private boolean databaseNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean databaseNameNull = false;

    /** Attribute */
    private String databaseProvider;

    /** Attribute  Be Seted Falg */
    private boolean databaseProviderSetted = false;

    /** Attribute  is Null Falg */
    private boolean databaseProviderNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get DatabaseId
     *
     * @return databaseId
     */
    final public long getDatabaseId() {
        return databaseId;
    } // end getDatabaseId()

    /**
     * Set DatabaseId
     *
     * @param aDatabaseId
     */
    final public void setDatabaseId(long aDatabaseId) {
        this.databaseId = aDatabaseId;

        this.databaseIdSetted = true;

        this.setDatabaseIdNull(false);
    } // end setDatabaseId()

    /**
     * Get DatabaseId Has Been Setted
     *
     * @return databaseId
     */
    final public boolean isDatabaseIdSetted() {
        return this.databaseIdSetted;
    } // end isDatabaseIdSetted()

    /**
     * Set DatabaseId Null
     */
    final public void setDatabaseIdNull() {
        this.databaseIdNull = true;
    } // end setDatabaseIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDatabaseIdNull(boolean aNullFlag) {
        this.databaseIdNull = aNullFlag;
    } // end setDatabaseIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDatabaseIdNull() {
        return this.databaseIdNull;
    } // end isDatabaseIdNull()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

    /**
     * Get ReportProjectId
     *
     * @return reportProjectId
     */
    final public long getReportProjectId() {
        return reportProjectId;
    } // end getReportProjectId()

    /**
     * Set ReportProjectId
     *
     * @param aReportProjectId
     */
    final public void setReportProjectId(long aReportProjectId) {
        this.reportProjectId = aReportProjectId;

        this.reportProjectIdSetted = true;

        this.setReportProjectIdNull(false);
    } // end setReportProjectId()

    /**
     * Get ReportProjectId Has Been Setted
     *
     * @return reportProjectId
     */
    final public boolean isReportProjectIdSetted() {
        return this.reportProjectIdSetted;
    } // end isReportProjectIdSetted()

    /**
     * Set ReportProjectId Null
     */
    final public void setReportProjectIdNull() {
        this.reportProjectIdNull = true;
    } // end setReportProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportProjectIdNull(boolean aNullFlag) {
        this.reportProjectIdNull = aNullFlag;
    } // end setReportProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportProjectIdNull() {
        return this.reportProjectIdNull;
    } // end isReportProjectIdNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get DatabaseName
     *
     * @return databaseName
     */
    final public String getDatabaseName() {
        return databaseName;
    } // end getDatabaseName()

    /**
     * Set DatabaseName
     *
     * @param aDatabaseName
     */
    final public void setDatabaseName(String aDatabaseName) {
        this.databaseName = aDatabaseName;

        this.databaseNameSetted = true;

        this.setDatabaseNameNull(this.databaseName == null);
    } // end setDatabaseName()

    /**
     * Get DatabaseName Has Been Setted
     *
     * @return databaseName
     */
    final public boolean isDatabaseNameSetted() {
        return this.databaseNameSetted;
    } // end isDatabaseNameSetted()

    /**
     * Set DatabaseName Null
     */
    final public void setDatabaseNameNull() {
        this.databaseNameNull = true;
    } // end setDatabaseNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDatabaseNameNull(boolean aNullFlag) {
        this.databaseNameNull = aNullFlag;
    } // end setDatabaseNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDatabaseNameNull() {
        return this.databaseNameNull;
    } // end isDatabaseNameNull()

    /**
     * Get DatabaseProvider
     *
     * @return databaseProvider
     */
    final public String getDatabaseProvider() {
        return databaseProvider;
    } // end getDatabaseProvider()

    /**
     * Set DatabaseProvider
     *
     * @param aDatabaseProvider
     */
    final public void setDatabaseProvider(String aDatabaseProvider) {
        this.databaseProvider = aDatabaseProvider;

        this.databaseProviderSetted = true;

        this.setDatabaseProviderNull(this.databaseProvider == null);
    } // end setDatabaseProvider()

    /**
     * Get DatabaseProvider Has Been Setted
     *
     * @return databaseProvider
     */
    final public boolean isDatabaseProviderSetted() {
        return this.databaseProviderSetted;
    } // end isDatabaseProviderSetted()

    /**
     * Set DatabaseProvider Null
     */
    final public void setDatabaseProviderNull() {
        this.databaseProviderNull = true;
    } // end setDatabaseProviderNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDatabaseProviderNull(boolean aNullFlag) {
        this.databaseProviderNull = aNullFlag;
    } // end setDatabaseProviderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDatabaseProviderNull() {
        return this.databaseProviderNull;
    } // end isDatabaseProviderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

        return result;
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

        if ((obj instanceof ReportDatabase) == false) {
            return false;
        } // end if

        ReportDatabase other = (ReportDatabase) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("databaseId=");
        buffer.append(this.databaseId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportProjectId=");
        buffer.append(this.reportProjectId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("databaseName=");
        buffer.append(this.databaseName);
        buffer.append("\r\n");

        buffer.append("databaseProvider=");
        buffer.append(this.databaseProvider);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportDatabase
