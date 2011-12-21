/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * ²úÆ·°æ±¾ Generate Date 2011-10-12 15:01:22
 *
 * @author Auto Gen
 */
public class ProductVersion implements java.io.Serializable {
    /**
     * Creates a new ProductVersion object.
     */
    public ProductVersion() {
        super();
    } // end ProductVersion()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long productDefineId;

    /** Attribute  Be Seted Falg */
    private boolean productDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productDefineIdNull = false;

    /** Attribute */
    private String productVersion;

    /** Attribute  Be Seted Falg */
    private boolean productVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean productVersionNull = false;

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

    /** Attribute */
    private String productVersionType;

    /** Attribute  Be Seted Falg */
    private boolean productVersionTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean productVersionTypeNull = false;

    /** Attribute */
    private long parentVersionId;

    /** Attribute  Be Seted Falg */
    private boolean parentVersionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentVersionIdNull = false;

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
     * Get ProductDefineId
     *
     * @return productDefineId
     */
    final public long getProductDefineId() {
        return productDefineId;
    } // end getProductDefineId()

    /**
     * Set ProductDefineId
     *
     * @param aProductDefineId
     */
    final public void setProductDefineId(long aProductDefineId) {
        this.productDefineId = aProductDefineId;

        this.productDefineIdSetted = true;

        this.setProductDefineIdNull(false);
    } // end setProductDefineId()

    /**
     * Get ProductDefineId Has Been Setted
     *
     * @return productDefineId
     */
    final public boolean isProductDefineIdSetted() {
        return this.productDefineIdSetted;
    } // end isProductDefineIdSetted()

    /**
     * Set ProductDefineId Null
     */
    final public void setProductDefineIdNull() {
        this.productDefineIdNull = true;
    } // end setProductDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductDefineIdNull(boolean aNullFlag) {
        this.productDefineIdNull = aNullFlag;
    } // end setProductDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductDefineIdNull() {
        return this.productDefineIdNull;
    } // end isProductDefineIdNull()

    /**
     * Get ProductVersion
     *
     * @return productVersion
     */
    final public String getProductVersion() {
        return productVersion;
    } // end getProductVersion()

    /**
     * Set ProductVersion
     *
     * @param aProductVersion
     */
    final public void setProductVersion(String aProductVersion) {
        this.productVersion = aProductVersion;

        this.productVersionSetted = true;

        this.setProductVersionNull(this.productVersion == null);
    } // end setProductVersion()

    /**
     * Get ProductVersion Has Been Setted
     *
     * @return productVersion
     */
    final public boolean isProductVersionSetted() {
        return this.productVersionSetted;
    } // end isProductVersionSetted()

    /**
     * Set ProductVersion Null
     */
    final public void setProductVersionNull() {
        this.productVersionNull = true;
    } // end setProductVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductVersionNull(boolean aNullFlag) {
        this.productVersionNull = aNullFlag;
    } // end setProductVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductVersionNull() {
        return this.productVersionNull;
    } // end isProductVersionNull()

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
     * Get ProductVersionType
     *
     * @return productVersionType
     */
    final public String getProductVersionType() {
        return productVersionType;
    } // end getProductVersionType()

    /**
     * Set ProductVersionType
     *
     * @param aProductVersionType
     */
    final public void setProductVersionType(String aProductVersionType) {
        this.productVersionType = aProductVersionType;

        this.productVersionTypeSetted = true;

        this.setProductVersionTypeNull(this.productVersionType == null);
    } // end setProductVersionType()

    /**
     * Get ProductVersionType Has Been Setted
     *
     * @return productVersionType
     */
    final public boolean isProductVersionTypeSetted() {
        return this.productVersionTypeSetted;
    } // end isProductVersionTypeSetted()

    /**
     * Set ProductVersionType Null
     */
    final public void setProductVersionTypeNull() {
        this.productVersionTypeNull = true;
    } // end setProductVersionTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductVersionTypeNull(boolean aNullFlag) {
        this.productVersionTypeNull = aNullFlag;
    } // end setProductVersionTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductVersionTypeNull() {
        return this.productVersionTypeNull;
    } // end isProductVersionTypeNull()

    /**
     * Get ParentVersionId
     *
     * @return parentVersionId
     */
    final public long getParentVersionId() {
        return parentVersionId;
    } // end getParentVersionId()

    /**
     * Set ParentVersionId
     *
     * @param aParentVersionId
     */
    final public void setParentVersionId(long aParentVersionId) {
        this.parentVersionId = aParentVersionId;

        this.parentVersionIdSetted = true;

        this.setParentVersionIdNull(false);
    } // end setParentVersionId()

    /**
     * Get ParentVersionId Has Been Setted
     *
     * @return parentVersionId
     */
    final public boolean isParentVersionIdSetted() {
        return this.parentVersionIdSetted;
    } // end isParentVersionIdSetted()

    /**
     * Set ParentVersionId Null
     */
    final public void setParentVersionIdNull() {
        this.parentVersionIdNull = true;
    } // end setParentVersionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentVersionIdNull(boolean aNullFlag) {
        this.parentVersionIdNull = aNullFlag;
    } // end setParentVersionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentVersionIdNull() {
        return this.parentVersionIdNull;
    } // end isParentVersionIdNull()

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

        if ((obj instanceof ProductVersion) == false) {
            return false;
        } // end if

        ProductVersion other = (ProductVersion) obj;

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

        buffer.append("productDefineId=");
        buffer.append(this.productDefineId);
        buffer.append("\r\n");

        buffer.append("productVersion=");
        buffer.append(this.productVersion);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("productVersionType=");
        buffer.append(this.productVersionType);
        buffer.append("\r\n");

        buffer.append("parentVersionId=");
        buffer.append(this.parentVersionId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ProductVersion
