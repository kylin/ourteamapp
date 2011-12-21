/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * Generate Date 2011-10-10 16:06:18
 *
 * @author Auto Gen
 */
public class ProductFunctionVersionRelate implements java.io.Serializable {
    /**
     * Creates a new ProductFunctionVersionRelate object.
     */
    public ProductFunctionVersionRelate() {
        super();
    } // end ProductFunctionVersionRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long productFunctionId;

    /** Attribute  Be Seted Falg */
    private boolean productFunctionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productFunctionIdNull = false;

    /** Attribute */
    private long productVersionId;

    /** Attribute  Be Seted Falg */
    private boolean productVersionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productVersionIdNull = false;

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
     * Get ProductFunctionId
     *
     * @return productFunctionId
     */
    final public long getProductFunctionId() {
        return productFunctionId;
    } // end getProductFunctionId()

    /**
     * Set ProductFunctionId
     *
     * @param aProductFunctionId
     */
    final public void setProductFunctionId(long aProductFunctionId) {
        this.productFunctionId = aProductFunctionId;

        this.productFunctionIdSetted = true;

        this.setProductFunctionIdNull(false);
    } // end setProductFunctionId()

    /**
     * Get ProductFunctionId Has Been Setted
     *
     * @return productFunctionId
     */
    final public boolean isProductFunctionIdSetted() {
        return this.productFunctionIdSetted;
    } // end isProductFunctionIdSetted()

    /**
     * Set ProductFunctionId Null
     */
    final public void setProductFunctionIdNull() {
        this.productFunctionIdNull = true;
    } // end setProductFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductFunctionIdNull(boolean aNullFlag) {
        this.productFunctionIdNull = aNullFlag;
    } // end setProductFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductFunctionIdNull() {
        return this.productFunctionIdNull;
    } // end isProductFunctionIdNull()

    /**
     * Get ProductVersionId
     *
     * @return productVersionId
     */
    final public long getProductVersionId() {
        return productVersionId;
    } // end getProductVersionId()

    /**
     * Set ProductVersionId
     *
     * @param aProductVersionId
     */
    final public void setProductVersionId(long aProductVersionId) {
        this.productVersionId = aProductVersionId;

        this.productVersionIdSetted = true;

        this.setProductVersionIdNull(false);
    } // end setProductVersionId()

    /**
     * Get ProductVersionId Has Been Setted
     *
     * @return productVersionId
     */
    final public boolean isProductVersionIdSetted() {
        return this.productVersionIdSetted;
    } // end isProductVersionIdSetted()

    /**
     * Set ProductVersionId Null
     */
    final public void setProductVersionIdNull() {
        this.productVersionIdNull = true;
    } // end setProductVersionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductVersionIdNull(boolean aNullFlag) {
        this.productVersionIdNull = aNullFlag;
    } // end setProductVersionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductVersionIdNull() {
        return this.productVersionIdNull;
    } // end isProductVersionIdNull()

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

        if ((obj instanceof ProductFunctionVersionRelate) == false) {
            return false;
        } // end if

        ProductFunctionVersionRelate other = (ProductFunctionVersionRelate) obj;

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

        buffer.append("productFunctionId=");
        buffer.append(this.productFunctionId);
        buffer.append("\r\n");

        buffer.append("productVersionId=");
        buffer.append(this.productVersionId);
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
} // end ProductFunctionVersionRelate
