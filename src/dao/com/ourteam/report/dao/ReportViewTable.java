/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:38:00
 *
 * @author Auto Gen
 */
public class ReportViewTable implements java.io.Serializable {
    /**
     * Creates a new ReportViewTable object.
     */
    public ReportViewTable() {
        super();
    } // end ReportViewTable()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String joinCond;

    /** Attribute  Be Seted Falg */
    private boolean joinCondSetted = false;

    /** Attribute  is Null Falg */
    private boolean joinCondNull = false;

    /** Attribute */
    private String joinType;

    /** Attribute  Be Seted Falg */
    private boolean joinTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean joinTypeNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long reportViewId;

    /** Attribute  Be Seted Falg */
    private boolean reportViewIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String tableAlias;

    /** Attribute  Be Seted Falg */
    private boolean tableAliasSetted = false;

    /** Attribute  is Null Falg */
    private boolean tableAliasNull = false;

    /** Attribute */
    private String tableName;

    /** Attribute  Be Seted Falg */
    private boolean tableNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean tableNameNull = false;

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
     * Get JoinCond
     *
     * @return joinCond
     */
    final public String getJoinCond() {
        if (isJoinCondNull()) {
            return null;
        } // end if
        else {
            return joinCond;
        } // end else
    } // end getJoinCond()

    /**
     * Set JoinCond
     *
     * @param aJoinCond
     */
    final public void setJoinCond(String aJoinCond) {
        this.joinCond = aJoinCond;

        this.joinCondSetted = true;

        this.setJoinCondNull(this.joinCond == null);
    } // end setJoinCond()

    /**
     * Get JoinCond Has Been Setted
     *
     * @return joinCond
     */
    final public boolean isJoinCondSetted() {
        return this.joinCondSetted;
    } // end isJoinCondSetted()

    /**
     * Set JoinCond Null
     */
    final public void setJoinCondNull() {
        this.joinCondNull = true;
    } // end setJoinCondNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setJoinCondNull(boolean aNullFlag) {
        this.joinCondNull = aNullFlag;
    } // end setJoinCondNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isJoinCondNull() {
        return this.joinCondNull;
    } // end isJoinCondNull()

    /**
     * Get JoinType
     *
     * @return joinType
     */
    final public String getJoinType() {
        return joinType;
    } // end getJoinType()

    /**
     * Set JoinType
     *
     * @param aJoinType
     */
    final public void setJoinType(String aJoinType) {
        this.joinType = aJoinType;

        this.joinTypeSetted = true;

        this.setJoinTypeNull(this.joinType == null);
    } // end setJoinType()

    /**
     * Get JoinType Has Been Setted
     *
     * @return joinType
     */
    final public boolean isJoinTypeSetted() {
        return this.joinTypeSetted;
    } // end isJoinTypeSetted()

    /**
     * Set JoinType Null
     */
    final public void setJoinTypeNull() {
        this.joinTypeNull = true;
    } // end setJoinTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setJoinTypeNull(boolean aNullFlag) {
        this.joinTypeNull = aNullFlag;
    } // end setJoinTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isJoinTypeNull() {
        return this.joinTypeNull;
    } // end isJoinTypeNull()

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
     * Get ReportViewId
     *
     * @return reportViewId
     */
    final public long getReportViewId() {
        return reportViewId;
    } // end getReportViewId()

    /**
     * Set ReportViewId
     *
     * @param aReportViewId
     */
    final public void setReportViewId(long aReportViewId) {
        this.reportViewId = aReportViewId;

        this.reportViewIdSetted = true;

        this.setReportViewIdNull(false);
    } // end setReportViewId()

    /**
     * Get ReportViewId Has Been Setted
     *
     * @return reportViewId
     */
    final public boolean isReportViewIdSetted() {
        return this.reportViewIdSetted;
    } // end isReportViewIdSetted()

    /**
     * Set ReportViewId Null
     */
    final public void setReportViewIdNull() {
        this.reportViewIdNull = true;
    } // end setReportViewIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewIdNull(boolean aNullFlag) {
        this.reportViewIdNull = aNullFlag;
    } // end setReportViewIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewIdNull() {
        return this.reportViewIdNull;
    } // end isReportViewIdNull()

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
     * Get TableAlias
     *
     * @return tableAlias
     */
    final public String getTableAlias() {
        return tableAlias;
    } // end getTableAlias()

    /**
     * Set TableAlias
     *
     * @param aTableAlias
     */
    final public void setTableAlias(String aTableAlias) {
        this.tableAlias = aTableAlias;

        this.tableAliasSetted = true;

        this.setTableAliasNull(this.tableAlias == null);
    } // end setTableAlias()

    /**
     * Get TableAlias Has Been Setted
     *
     * @return tableAlias
     */
    final public boolean isTableAliasSetted() {
        return this.tableAliasSetted;
    } // end isTableAliasSetted()

    /**
     * Set TableAlias Null
     */
    final public void setTableAliasNull() {
        this.tableAliasNull = true;
    } // end setTableAliasNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTableAliasNull(boolean aNullFlag) {
        this.tableAliasNull = aNullFlag;
    } // end setTableAliasNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTableAliasNull() {
        return this.tableAliasNull;
    } // end isTableAliasNull()

    /**
     * Get TableName
     *
     * @return tableName
     */
    final public String getTableName() {
        return tableName;
    } // end getTableName()

    /**
     * Set TableName
     *
     * @param aTableName
     */
    final public void setTableName(String aTableName) {
        this.tableName = aTableName;

        this.tableNameSetted = true;

        this.setTableNameNull(this.tableName == null);
    } // end setTableName()

    /**
     * Get TableName Has Been Setted
     *
     * @return tableName
     */
    final public boolean isTableNameSetted() {
        return this.tableNameSetted;
    } // end isTableNameSetted()

    /**
     * Set TableName Null
     */
    final public void setTableNameNull() {
        this.tableNameNull = true;
    } // end setTableNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTableNameNull(boolean aNullFlag) {
        this.tableNameNull = aNullFlag;
    } // end setTableNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTableNameNull() {
        return this.tableNameNull;
    } // end isTableNameNull()

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

        if ((obj instanceof ReportViewTable) == false) {
            return false;
        } // end if

        ReportViewTable other = (ReportViewTable) obj;

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

        buffer.append("joinCond=");
        buffer.append(this.joinCond);
        buffer.append("\r\n");

        buffer.append("joinType=");
        buffer.append(this.joinType);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportViewId=");
        buffer.append(this.reportViewId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("tableAlias=");
        buffer.append(this.tableAlias);
        buffer.append("\r\n");

        buffer.append("tableName=");
        buffer.append(this.tableName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportViewTable
