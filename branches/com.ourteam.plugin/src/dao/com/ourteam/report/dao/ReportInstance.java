/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:55
 *
 * @author Auto Gen
 */
public class ReportInstance implements java.io.Serializable {
    /**
     * Creates a new ReportInstance object.
     */
    public ReportInstance() {
        super();
    } // end ReportInstance()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long catalogId;

    /** Attribute  Be Seted Falg */
    private boolean catalogIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean catalogIdNull = false;

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
    private String reportTitle;

    /** Attribute  Be Seted Falg */
    private boolean reportTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportTitleNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long reportViewId;

    /** Attribute  Be Seted Falg */
    private boolean reportViewIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewIdNull = false;

    /** Attribute */
    private String reportViewName;

    /** Attribute  Be Seted Falg */
    private boolean reportViewNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewNameNull = false;

    /** Attribute */
    private String reportViewCode;

    /** Attribute  Be Seted Falg */
    private boolean reportViewCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewCodeNull = false;

    /** Attribute */
    private String reportViewIsDistinct;

    /** Attribute  Be Seted Falg */
    private boolean reportViewIsDistinctSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewIsDistinctNull = false;

    /** Attribute */
    private String reportViewFilters;

    /** Attribute  Be Seted Falg */
    private boolean reportViewFiltersSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewFiltersNull = false;

    /** Attribute */
    private String reportViewGroupBy;

    /** Attribute  Be Seted Falg */
    private boolean reportViewGroupBySetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewGroupByNull = false;

    /** Attribute */
    private String reportViewOrderBy;

    /** Attribute  Be Seted Falg */
    private boolean reportViewOrderBySetted = false;

    /** Attribute  is Null Falg */
    private boolean reportViewOrderByNull = false;

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
     * Get CatalogId
     *
     * @return catalogId
     */
    final public long getCatalogId() {
        return catalogId;
    } // end getCatalogId()

    /**
     * Set CatalogId
     *
     * @param aCatalogId
     */
    final public void setCatalogId(long aCatalogId) {
        this.catalogId = aCatalogId;

        this.catalogIdSetted = true;

        this.setCatalogIdNull(false);
    } // end setCatalogId()

    /**
     * Get CatalogId Has Been Setted
     *
     * @return catalogId
     */
    final public boolean isCatalogIdSetted() {
        return this.catalogIdSetted;
    } // end isCatalogIdSetted()

    /**
     * Set CatalogId Null
     */
    final public void setCatalogIdNull() {
        this.catalogIdNull = true;
    } // end setCatalogIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCatalogIdNull(boolean aNullFlag) {
        this.catalogIdNull = aNullFlag;
    } // end setCatalogIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCatalogIdNull() {
        return this.catalogIdNull;
    } // end isCatalogIdNull()

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
     * Get ReportTitle
     *
     * @return reportTitle
     */
    final public String getReportTitle() {
        return reportTitle;
    } // end getReportTitle()

    /**
     * Set ReportTitle
     *
     * @param aReportTitle
     */
    final public void setReportTitle(String aReportTitle) {
        this.reportTitle = aReportTitle;

        this.reportTitleSetted = true;

        this.setReportTitleNull(this.reportTitle == null);
    } // end setReportTitle()

    /**
     * Get ReportTitle Has Been Setted
     *
     * @return reportTitle
     */
    final public boolean isReportTitleSetted() {
        return this.reportTitleSetted;
    } // end isReportTitleSetted()

    /**
     * Set ReportTitle Null
     */
    final public void setReportTitleNull() {
        this.reportTitleNull = true;
    } // end setReportTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportTitleNull(boolean aNullFlag) {
        this.reportTitleNull = aNullFlag;
    } // end setReportTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportTitleNull() {
        return this.reportTitleNull;
    } // end isReportTitleNull()

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
     * Get ReportViewName
     *
     * @return reportViewName
     */
    final public String getReportViewName() {
        return reportViewName;
    } // end getReportViewName()

    /**
     * Set ReportViewName
     *
     * @param aReportViewName
     */
    final public void setReportViewName(String aReportViewName) {
        this.reportViewName = aReportViewName;

        this.reportViewNameSetted = true;

        this.setReportViewNameNull(this.reportViewName == null);
    } // end setReportViewName()

    /**
     * Get ReportViewName Has Been Setted
     *
     * @return reportViewName
     */
    final public boolean isReportViewNameSetted() {
        return this.reportViewNameSetted;
    } // end isReportViewNameSetted()

    /**
     * Set ReportViewName Null
     */
    final public void setReportViewNameNull() {
        this.reportViewNameNull = true;
    } // end setReportViewNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewNameNull(boolean aNullFlag) {
        this.reportViewNameNull = aNullFlag;
    } // end setReportViewNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewNameNull() {
        return this.reportViewNameNull;
    } // end isReportViewNameNull()

    /**
     * Get ReportViewCode
     *
     * @return reportViewCode
     */
    final public String getReportViewCode() {
        return reportViewCode;
    } // end getReportViewCode()

    /**
     * Set ReportViewCode
     *
     * @param aReportViewCode
     */
    final public void setReportViewCode(String aReportViewCode) {
        this.reportViewCode = aReportViewCode;

        this.reportViewCodeSetted = true;

        this.setReportViewCodeNull(this.reportViewCode == null);
    } // end setReportViewCode()

    /**
     * Get ReportViewCode Has Been Setted
     *
     * @return reportViewCode
     */
    final public boolean isReportViewCodeSetted() {
        return this.reportViewCodeSetted;
    } // end isReportViewCodeSetted()

    /**
     * Set ReportViewCode Null
     */
    final public void setReportViewCodeNull() {
        this.reportViewCodeNull = true;
    } // end setReportViewCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewCodeNull(boolean aNullFlag) {
        this.reportViewCodeNull = aNullFlag;
    } // end setReportViewCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewCodeNull() {
        return this.reportViewCodeNull;
    } // end isReportViewCodeNull()

    /**
     * Get ReportViewIsDistinct
     *
     * @return reportViewIsDistinct
     */
    final public String getReportViewIsDistinct() {
        return reportViewIsDistinct;
    } // end getReportViewIsDistinct()

    /**
     * Set ReportViewIsDistinct
     *
     * @param aReportViewIsDistinct
     */
    final public void setReportViewIsDistinct(String aReportViewIsDistinct) {
        this.reportViewIsDistinct = aReportViewIsDistinct;

        this.reportViewIsDistinctSetted = true;

        this.setReportViewIsDistinctNull(this.reportViewIsDistinct == null);
    } // end setReportViewIsDistinct()

    /**
     * Get ReportViewIsDistinct Has Been Setted
     *
     * @return reportViewIsDistinct
     */
    final public boolean isReportViewIsDistinctSetted() {
        return this.reportViewIsDistinctSetted;
    } // end isReportViewIsDistinctSetted()

    /**
     * Set ReportViewIsDistinct Null
     */
    final public void setReportViewIsDistinctNull() {
        this.reportViewIsDistinctNull = true;
    } // end setReportViewIsDistinctNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewIsDistinctNull(boolean aNullFlag) {
        this.reportViewIsDistinctNull = aNullFlag;
    } // end setReportViewIsDistinctNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewIsDistinctNull() {
        return this.reportViewIsDistinctNull;
    } // end isReportViewIsDistinctNull()

    /**
     * Get ReportViewFilters
     *
     * @return reportViewFilters
     */
    final public String getReportViewFilters() {
        if (isReportViewFiltersNull()) {
            return null;
        } // end if
        else {
            return reportViewFilters;
        } // end else
    } // end getReportViewFilters()

    /**
     * Set ReportViewFilters
     *
     * @param aReportViewFilters
     */
    final public void setReportViewFilters(String aReportViewFilters) {
        this.reportViewFilters = aReportViewFilters;

        this.reportViewFiltersSetted = true;

        this.setReportViewFiltersNull(this.reportViewFilters == null);
    } // end setReportViewFilters()

    /**
     * Get ReportViewFilters Has Been Setted
     *
     * @return reportViewFilters
     */
    final public boolean isReportViewFiltersSetted() {
        return this.reportViewFiltersSetted;
    } // end isReportViewFiltersSetted()

    /**
     * Set ReportViewFilters Null
     */
    final public void setReportViewFiltersNull() {
        this.reportViewFiltersNull = true;
    } // end setReportViewFiltersNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewFiltersNull(boolean aNullFlag) {
        this.reportViewFiltersNull = aNullFlag;
    } // end setReportViewFiltersNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewFiltersNull() {
        return this.reportViewFiltersNull;
    } // end isReportViewFiltersNull()

    /**
     * Get ReportViewGroupBy
     *
     * @return reportViewGroupBy
     */
    final public String getReportViewGroupBy() {
        if (isReportViewGroupByNull()) {
            return null;
        } // end if
        else {
            return reportViewGroupBy;
        } // end else
    } // end getReportViewGroupBy()

    /**
     * Set ReportViewGroupBy
     *
     * @param aReportViewGroupBy
     */
    final public void setReportViewGroupBy(String aReportViewGroupBy) {
        this.reportViewGroupBy = aReportViewGroupBy;

        this.reportViewGroupBySetted = true;

        this.setReportViewGroupByNull(this.reportViewGroupBy == null);
    } // end setReportViewGroupBy()

    /**
     * Get ReportViewGroupBy Has Been Setted
     *
     * @return reportViewGroupBy
     */
    final public boolean isReportViewGroupBySetted() {
        return this.reportViewGroupBySetted;
    } // end isReportViewGroupBySetted()

    /**
     * Set ReportViewGroupBy Null
     */
    final public void setReportViewGroupByNull() {
        this.reportViewGroupByNull = true;
    } // end setReportViewGroupByNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewGroupByNull(boolean aNullFlag) {
        this.reportViewGroupByNull = aNullFlag;
    } // end setReportViewGroupByNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewGroupByNull() {
        return this.reportViewGroupByNull;
    } // end isReportViewGroupByNull()

    /**
     * Get ReportViewOrderBy
     *
     * @return reportViewOrderBy
     */
    final public String getReportViewOrderBy() {
        if (isReportViewOrderByNull()) {
            return null;
        } // end if
        else {
            return reportViewOrderBy;
        } // end else
    } // end getReportViewOrderBy()

    /**
     * Set ReportViewOrderBy
     *
     * @param aReportViewOrderBy
     */
    final public void setReportViewOrderBy(String aReportViewOrderBy) {
        this.reportViewOrderBy = aReportViewOrderBy;

        this.reportViewOrderBySetted = true;

        this.setReportViewOrderByNull(this.reportViewOrderBy == null);
    } // end setReportViewOrderBy()

    /**
     * Get ReportViewOrderBy Has Been Setted
     *
     * @return reportViewOrderBy
     */
    final public boolean isReportViewOrderBySetted() {
        return this.reportViewOrderBySetted;
    } // end isReportViewOrderBySetted()

    /**
     * Set ReportViewOrderBy Null
     */
    final public void setReportViewOrderByNull() {
        this.reportViewOrderByNull = true;
    } // end setReportViewOrderByNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportViewOrderByNull(boolean aNullFlag) {
        this.reportViewOrderByNull = aNullFlag;
    } // end setReportViewOrderByNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportViewOrderByNull() {
        return this.reportViewOrderByNull;
    } // end isReportViewOrderByNull()

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

        if ((obj instanceof ReportInstance) == false) {
            return false;
        } // end if

        ReportInstance other = (ReportInstance) obj;

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

        buffer.append("catalogId=");
        buffer.append(this.catalogId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportProjectId=");
        buffer.append(this.reportProjectId);
        buffer.append("\r\n");

        buffer.append("reportTitle=");
        buffer.append(this.reportTitle);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("reportViewId=");
        buffer.append(this.reportViewId);
        buffer.append("\r\n");

        buffer.append("reportViewName=");
        buffer.append(this.reportViewName);
        buffer.append("\r\n");

        buffer.append("reportViewCode=");
        buffer.append(this.reportViewCode);
        buffer.append("\r\n");

        buffer.append("reportViewIsDistinct=");
        buffer.append(this.reportViewIsDistinct);
        buffer.append("\r\n");

        buffer.append("reportViewFilters=");
        buffer.append(this.reportViewFilters);
        buffer.append("\r\n");

        buffer.append("reportViewGroupBy=");
        buffer.append(this.reportViewGroupBy);
        buffer.append("\r\n");

        buffer.append("reportViewOrderBy=");
        buffer.append(this.reportViewOrderBy);
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
} // end ReportInstance
