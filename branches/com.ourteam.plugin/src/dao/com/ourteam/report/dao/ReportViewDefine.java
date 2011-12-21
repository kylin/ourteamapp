/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:58
 *
 * @author Auto Gen
 */
public class ReportViewDefine implements java.io.Serializable {
    /**
     * Creates a new ReportViewDefine object.
     */
    public ReportViewDefine() {
        super();
    } // end ReportViewDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String code;

    /** Attribute  Be Seted Falg */
    private boolean codeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeNull = false;

    /** Attribute */
    private String groupBy;

    /** Attribute  Be Seted Falg */
    private boolean groupBySetted = false;

    /** Attribute  is Null Falg */
    private boolean groupByNull = false;

    /** Attribute */
    private String isDistinct;

    /** Attribute  Be Seted Falg */
    private boolean isDistinctSetted = false;

    /** Attribute  is Null Falg */
    private boolean isDistinctNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String orderBy;

    /** Attribute  Be Seted Falg */
    private boolean orderBySetted = false;

    /** Attribute  is Null Falg */
    private boolean orderByNull = false;

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
    private String unionViews;

    /** Attribute  Be Seted Falg */
    private boolean unionViewsSetted = false;

    /** Attribute  is Null Falg */
    private boolean unionViewsNull = false;

    /** Attribute */
    private String viewFilters;

    /** Attribute  Be Seted Falg */
    private boolean viewFiltersSetted = false;

    /** Attribute  is Null Falg */
    private boolean viewFiltersNull = false;

    /** Attribute */
    private String reportProjectName;

    /** Attribute  Be Seted Falg */
    private boolean reportProjectNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportProjectNameNull = false;

    /** Attribute */
    private String reportProjectCode;

    /** Attribute  Be Seted Falg */
    private boolean reportProjectCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportProjectCodeNull = false;

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
     * Get Code
     *
     * @return code
     */
    final public String getCode() {
        return code;
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    final public void setCode(String aCode) {
        this.code = aCode;

        this.codeSetted = true;

        this.setCodeNull(this.code == null);
    } // end setCode()

    /**
     * Get Code Has Been Setted
     *
     * @return code
     */
    final public boolean isCodeSetted() {
        return this.codeSetted;
    } // end isCodeSetted()

    /**
     * Set Code Null
     */
    final public void setCodeNull() {
        this.codeNull = true;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeNull(boolean aNullFlag) {
        this.codeNull = aNullFlag;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeNull() {
        return this.codeNull;
    } // end isCodeNull()

    /**
     * Get GroupBy
     *
     * @return groupBy
     */
    final public String getGroupBy() {
        if (isGroupByNull()) {
            return null;
        } // end if
        else {
            return groupBy;
        } // end else
    } // end getGroupBy()

    /**
     * Set GroupBy
     *
     * @param aGroupBy
     */
    final public void setGroupBy(String aGroupBy) {
        this.groupBy = aGroupBy;

        this.groupBySetted = true;

        this.setGroupByNull(this.groupBy == null);
    } // end setGroupBy()

    /**
     * Get GroupBy Has Been Setted
     *
     * @return groupBy
     */
    final public boolean isGroupBySetted() {
        return this.groupBySetted;
    } // end isGroupBySetted()

    /**
     * Set GroupBy Null
     */
    final public void setGroupByNull() {
        this.groupByNull = true;
    } // end setGroupByNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setGroupByNull(boolean aNullFlag) {
        this.groupByNull = aNullFlag;
    } // end setGroupByNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isGroupByNull() {
        return this.groupByNull;
    } // end isGroupByNull()

    /**
     * Get IsDistinct
     *
     * @return isDistinct
     */
    final public String getIsDistinct() {
        return isDistinct;
    } // end getIsDistinct()

    /**
     * Set IsDistinct
     *
     * @param aIsDistinct
     */
    final public void setIsDistinct(String aIsDistinct) {
        this.isDistinct = aIsDistinct;

        this.isDistinctSetted = true;

        this.setIsDistinctNull(this.isDistinct == null);
    } // end setIsDistinct()

    /**
     * Get IsDistinct Has Been Setted
     *
     * @return isDistinct
     */
    final public boolean isIsDistinctSetted() {
        return this.isDistinctSetted;
    } // end isIsDistinctSetted()

    /**
     * Set IsDistinct Null
     */
    final public void setIsDistinctNull() {
        this.isDistinctNull = true;
    } // end setIsDistinctNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsDistinctNull(boolean aNullFlag) {
        this.isDistinctNull = aNullFlag;
    } // end setIsDistinctNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsDistinctNull() {
        return this.isDistinctNull;
    } // end isIsDistinctNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

    /**
     * Get OrderBy
     *
     * @return orderBy
     */
    final public String getOrderBy() {
        if (isOrderByNull()) {
            return null;
        } // end if
        else {
            return orderBy;
        } // end else
    } // end getOrderBy()

    /**
     * Set OrderBy
     *
     * @param aOrderBy
     */
    final public void setOrderBy(String aOrderBy) {
        this.orderBy = aOrderBy;

        this.orderBySetted = true;

        this.setOrderByNull(this.orderBy == null);
    } // end setOrderBy()

    /**
     * Get OrderBy Has Been Setted
     *
     * @return orderBy
     */
    final public boolean isOrderBySetted() {
        return this.orderBySetted;
    } // end isOrderBySetted()

    /**
     * Set OrderBy Null
     */
    final public void setOrderByNull() {
        this.orderByNull = true;
    } // end setOrderByNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOrderByNull(boolean aNullFlag) {
        this.orderByNull = aNullFlag;
    } // end setOrderByNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOrderByNull() {
        return this.orderByNull;
    } // end isOrderByNull()

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
     * Get UnionViews
     *
     * @return unionViews
     */
    final public String getUnionViews() {
        if (isUnionViewsNull()) {
            return null;
        } // end if
        else {
            return unionViews;
        } // end else
    } // end getUnionViews()

    /**
     * Set UnionViews
     *
     * @param aUnionViews
     */
    final public void setUnionViews(String aUnionViews) {
        this.unionViews = aUnionViews;

        this.unionViewsSetted = true;

        this.setUnionViewsNull(this.unionViews == null);
    } // end setUnionViews()

    /**
     * Get UnionViews Has Been Setted
     *
     * @return unionViews
     */
    final public boolean isUnionViewsSetted() {
        return this.unionViewsSetted;
    } // end isUnionViewsSetted()

    /**
     * Set UnionViews Null
     */
    final public void setUnionViewsNull() {
        this.unionViewsNull = true;
    } // end setUnionViewsNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUnionViewsNull(boolean aNullFlag) {
        this.unionViewsNull = aNullFlag;
    } // end setUnionViewsNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUnionViewsNull() {
        return this.unionViewsNull;
    } // end isUnionViewsNull()

    /**
     * Get ViewFilters
     *
     * @return viewFilters
     */
    final public String getViewFilters() {
        if (isViewFiltersNull()) {
            return null;
        } // end if
        else {
            return viewFilters;
        } // end else
    } // end getViewFilters()

    /**
     * Set ViewFilters
     *
     * @param aViewFilters
     */
    final public void setViewFilters(String aViewFilters) {
        this.viewFilters = aViewFilters;

        this.viewFiltersSetted = true;

        this.setViewFiltersNull(this.viewFilters == null);
    } // end setViewFilters()

    /**
     * Get ViewFilters Has Been Setted
     *
     * @return viewFilters
     */
    final public boolean isViewFiltersSetted() {
        return this.viewFiltersSetted;
    } // end isViewFiltersSetted()

    /**
     * Set ViewFilters Null
     */
    final public void setViewFiltersNull() {
        this.viewFiltersNull = true;
    } // end setViewFiltersNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setViewFiltersNull(boolean aNullFlag) {
        this.viewFiltersNull = aNullFlag;
    } // end setViewFiltersNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isViewFiltersNull() {
        return this.viewFiltersNull;
    } // end isViewFiltersNull()

    /**
     * Get ReportProjectName
     *
     * @return reportProjectName
     */
    final public String getReportProjectName() {
        return reportProjectName;
    } // end getReportProjectName()

    /**
     * Set ReportProjectName
     *
     * @param aReportProjectName
     */
    final public void setReportProjectName(String aReportProjectName) {
        this.reportProjectName = aReportProjectName;

        this.reportProjectNameSetted = true;

        this.setReportProjectNameNull(this.reportProjectName == null);
    } // end setReportProjectName()

    /**
     * Get ReportProjectName Has Been Setted
     *
     * @return reportProjectName
     */
    final public boolean isReportProjectNameSetted() {
        return this.reportProjectNameSetted;
    } // end isReportProjectNameSetted()

    /**
     * Set ReportProjectName Null
     */
    final public void setReportProjectNameNull() {
        this.reportProjectNameNull = true;
    } // end setReportProjectNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportProjectNameNull(boolean aNullFlag) {
        this.reportProjectNameNull = aNullFlag;
    } // end setReportProjectNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportProjectNameNull() {
        return this.reportProjectNameNull;
    } // end isReportProjectNameNull()

    /**
     * Get ReportProjectCode
     *
     * @return reportProjectCode
     */
    final public String getReportProjectCode() {
        return reportProjectCode;
    } // end getReportProjectCode()

    /**
     * Set ReportProjectCode
     *
     * @param aReportProjectCode
     */
    final public void setReportProjectCode(String aReportProjectCode) {
        this.reportProjectCode = aReportProjectCode;

        this.reportProjectCodeSetted = true;

        this.setReportProjectCodeNull(this.reportProjectCode == null);
    } // end setReportProjectCode()

    /**
     * Get ReportProjectCode Has Been Setted
     *
     * @return reportProjectCode
     */
    final public boolean isReportProjectCodeSetted() {
        return this.reportProjectCodeSetted;
    } // end isReportProjectCodeSetted()

    /**
     * Set ReportProjectCode Null
     */
    final public void setReportProjectCodeNull() {
        this.reportProjectCodeNull = true;
    } // end setReportProjectCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportProjectCodeNull(boolean aNullFlag) {
        this.reportProjectCodeNull = aNullFlag;
    } // end setReportProjectCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportProjectCodeNull() {
        return this.reportProjectCodeNull;
    } // end isReportProjectCodeNull()

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

        if ((obj instanceof ReportViewDefine) == false) {
            return false;
        } // end if

        ReportViewDefine other = (ReportViewDefine) obj;

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

        buffer.append("code=");
        buffer.append(this.code);
        buffer.append("\r\n");

        buffer.append("groupBy=");
        buffer.append(this.groupBy);
        buffer.append("\r\n");

        buffer.append("isDistinct=");
        buffer.append(this.isDistinct);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("orderBy=");
        buffer.append(this.orderBy);
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

        buffer.append("unionViews=");
        buffer.append(this.unionViews);
        buffer.append("\r\n");

        buffer.append("viewFilters=");
        buffer.append(this.viewFilters);
        buffer.append("\r\n");

        buffer.append("reportProjectName=");
        buffer.append(this.reportProjectName);
        buffer.append("\r\n");

        buffer.append("reportProjectCode=");
        buffer.append(this.reportProjectCode);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportViewDefine
