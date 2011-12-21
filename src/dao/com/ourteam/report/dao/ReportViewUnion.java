/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:38:01
 *
 * @author Auto Gen
 */
public class ReportViewUnion implements java.io.Serializable {
    /**
     * Creates a new ReportViewUnion object.
     */
    public ReportViewUnion() {
        super();
    } // end ReportViewUnion()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

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
    private long unionViewId;

    /** Attribute  Be Seted Falg */
    private boolean unionViewIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean unionViewIdNull = false;

    /** Attribute */
    private String unionedViewCode;

    /** Attribute  Be Seted Falg */
    private boolean unionedViewCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean unionedViewCodeNull = false;

    /** Attribute */
    private String unionedViewName;

    /** Attribute  Be Seted Falg */
    private boolean unionedViewNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean unionedViewNameNull = false;

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
     * Get UnionViewId
     *
     * @return unionViewId
     */
    final public long getUnionViewId() {
        return unionViewId;
    } // end getUnionViewId()

    /**
     * Set UnionViewId
     *
     * @param aUnionViewId
     */
    final public void setUnionViewId(long aUnionViewId) {
        this.unionViewId = aUnionViewId;

        this.unionViewIdSetted = true;

        this.setUnionViewIdNull(false);
    } // end setUnionViewId()

    /**
     * Get UnionViewId Has Been Setted
     *
     * @return unionViewId
     */
    final public boolean isUnionViewIdSetted() {
        return this.unionViewIdSetted;
    } // end isUnionViewIdSetted()

    /**
     * Set UnionViewId Null
     */
    final public void setUnionViewIdNull() {
        this.unionViewIdNull = true;
    } // end setUnionViewIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUnionViewIdNull(boolean aNullFlag) {
        this.unionViewIdNull = aNullFlag;
    } // end setUnionViewIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUnionViewIdNull() {
        return this.unionViewIdNull;
    } // end isUnionViewIdNull()

    /**
     * Get UnionedViewCode
     *
     * @return unionedViewCode
     */
    final public String getUnionedViewCode() {
        return unionedViewCode;
    } // end getUnionedViewCode()

    /**
     * Set UnionedViewCode
     *
     * @param aUnionedViewCode
     */
    final public void setUnionedViewCode(String aUnionedViewCode) {
        this.unionedViewCode = aUnionedViewCode;

        this.unionedViewCodeSetted = true;

        this.setUnionedViewCodeNull(this.unionedViewCode == null);
    } // end setUnionedViewCode()

    /**
     * Get UnionedViewCode Has Been Setted
     *
     * @return unionedViewCode
     */
    final public boolean isUnionedViewCodeSetted() {
        return this.unionedViewCodeSetted;
    } // end isUnionedViewCodeSetted()

    /**
     * Set UnionedViewCode Null
     */
    final public void setUnionedViewCodeNull() {
        this.unionedViewCodeNull = true;
    } // end setUnionedViewCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUnionedViewCodeNull(boolean aNullFlag) {
        this.unionedViewCodeNull = aNullFlag;
    } // end setUnionedViewCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUnionedViewCodeNull() {
        return this.unionedViewCodeNull;
    } // end isUnionedViewCodeNull()

    /**
     * Get UnionedViewName
     *
     * @return unionedViewName
     */
    final public String getUnionedViewName() {
        return unionedViewName;
    } // end getUnionedViewName()

    /**
     * Set UnionedViewName
     *
     * @param aUnionedViewName
     */
    final public void setUnionedViewName(String aUnionedViewName) {
        this.unionedViewName = aUnionedViewName;

        this.unionedViewNameSetted = true;

        this.setUnionedViewNameNull(this.unionedViewName == null);
    } // end setUnionedViewName()

    /**
     * Get UnionedViewName Has Been Setted
     *
     * @return unionedViewName
     */
    final public boolean isUnionedViewNameSetted() {
        return this.unionedViewNameSetted;
    } // end isUnionedViewNameSetted()

    /**
     * Set UnionedViewName Null
     */
    final public void setUnionedViewNameNull() {
        this.unionedViewNameNull = true;
    } // end setUnionedViewNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUnionedViewNameNull(boolean aNullFlag) {
        this.unionedViewNameNull = aNullFlag;
    } // end setUnionedViewNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUnionedViewNameNull() {
        return this.unionedViewNameNull;
    } // end isUnionedViewNameNull()

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

        if ((obj instanceof ReportViewUnion) == false) {
            return false;
        } // end if

        ReportViewUnion other = (ReportViewUnion) obj;

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

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportViewId=");
        buffer.append(this.reportViewId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("unionViewId=");
        buffer.append(this.unionViewId);
        buffer.append("\r\n");

        buffer.append("unionedViewCode=");
        buffer.append(this.unionedViewCode);
        buffer.append("\r\n");

        buffer.append("unionedViewName=");
        buffer.append(this.unionedViewName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportViewUnion
