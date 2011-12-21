/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:52
 *
 * @author Auto Gen
 */
public class ReportCatalog implements java.io.Serializable {
    /**
     * Creates a new ReportCatalog object.
     */
    public ReportCatalog() {
        super();
    } // end ReportCatalog()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String catalogTitle;

    /** Attribute  Be Seted Falg */
    private boolean catalogTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean catalogTitleNull = false;

    /** Attribute */
    private long parentCatalogId;

    /** Attribute  Be Seted Falg */
    private boolean parentCatalogIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentCatalogIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

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
     * Get CatalogTitle
     *
     * @return catalogTitle
     */
    final public String getCatalogTitle() {
        return catalogTitle;
    } // end getCatalogTitle()

    /**
     * Set CatalogTitle
     *
     * @param aCatalogTitle
     */
    final public void setCatalogTitle(String aCatalogTitle) {
        this.catalogTitle = aCatalogTitle;

        this.catalogTitleSetted = true;

        this.setCatalogTitleNull(this.catalogTitle == null);
    } // end setCatalogTitle()

    /**
     * Get CatalogTitle Has Been Setted
     *
     * @return catalogTitle
     */
    final public boolean isCatalogTitleSetted() {
        return this.catalogTitleSetted;
    } // end isCatalogTitleSetted()

    /**
     * Set CatalogTitle Null
     */
    final public void setCatalogTitleNull() {
        this.catalogTitleNull = true;
    } // end setCatalogTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCatalogTitleNull(boolean aNullFlag) {
        this.catalogTitleNull = aNullFlag;
    } // end setCatalogTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCatalogTitleNull() {
        return this.catalogTitleNull;
    } // end isCatalogTitleNull()

    /**
     * Get ParentCatalogId
     *
     * @return parentCatalogId
     */
    final public long getParentCatalogId() {
        return parentCatalogId;
    } // end getParentCatalogId()

    /**
     * Set ParentCatalogId
     *
     * @param aParentCatalogId
     */
    final public void setParentCatalogId(long aParentCatalogId) {
        this.parentCatalogId = aParentCatalogId;

        this.parentCatalogIdSetted = true;

        this.setParentCatalogIdNull(false);
    } // end setParentCatalogId()

    /**
     * Get ParentCatalogId Has Been Setted
     *
     * @return parentCatalogId
     */
    final public boolean isParentCatalogIdSetted() {
        return this.parentCatalogIdSetted;
    } // end isParentCatalogIdSetted()

    /**
     * Set ParentCatalogId Null
     */
    final public void setParentCatalogIdNull() {
        this.parentCatalogIdNull = true;
    } // end setParentCatalogIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentCatalogIdNull(boolean aNullFlag) {
        this.parentCatalogIdNull = aNullFlag;
    } // end setParentCatalogIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentCatalogIdNull() {
        return this.parentCatalogIdNull;
    } // end isParentCatalogIdNull()

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

        if ((obj instanceof ReportCatalog) == false) {
            return false;
        } // end if

        ReportCatalog other = (ReportCatalog) obj;

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

        buffer.append("catalogTitle=");
        buffer.append(this.catalogTitle);
        buffer.append("\r\n");

        buffer.append("parentCatalogId=");
        buffer.append(this.parentCatalogId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportCatalog
