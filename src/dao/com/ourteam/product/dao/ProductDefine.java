/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * 产品定义 Generate Date 2011-10-10 16:06:16
 *
 * @author Auto Gen
 */
public class ProductDefine implements java.io.Serializable {
    /**
     * Creates a new ProductDefine object.
     */
    public ProductDefine() {
        super();
    } // end ProductDefine()

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
    private String productCode;

    /** Attribute  Be Seted Falg */
    private boolean productCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean productCodeNull = false;

    /** Attribute */
    private String productName;

    /** Attribute  Be Seted Falg */
    private boolean productNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean productNameNull = false;

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
     * Get ProductCode
     *
     * @return productCode
     */
    final public String getProductCode() {
        return productCode;
    } // end getProductCode()

    /**
     * Set ProductCode
     *
     * @param aProductCode
     */
    final public void setProductCode(String aProductCode) {
        this.productCode = aProductCode;

        this.productCodeSetted = true;

        this.setProductCodeNull(this.productCode == null);
    } // end setProductCode()

    /**
     * Get ProductCode Has Been Setted
     *
     * @return productCode
     */
    final public boolean isProductCodeSetted() {
        return this.productCodeSetted;
    } // end isProductCodeSetted()

    /**
     * Set ProductCode Null
     */
    final public void setProductCodeNull() {
        this.productCodeNull = true;
    } // end setProductCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductCodeNull(boolean aNullFlag) {
        this.productCodeNull = aNullFlag;
    } // end setProductCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductCodeNull() {
        return this.productCodeNull;
    } // end isProductCodeNull()

    /**
     * Get ProductName
     *
     * @return productName
     */
    final public String getProductName() {
        return productName;
    } // end getProductName()

    /**
     * Set ProductName
     *
     * @param aProductName
     */
    final public void setProductName(String aProductName) {
        this.productName = aProductName;

        this.productNameSetted = true;

        this.setProductNameNull(this.productName == null);
    } // end setProductName()

    /**
     * Get ProductName Has Been Setted
     *
     * @return productName
     */
    final public boolean isProductNameSetted() {
        return this.productNameSetted;
    } // end isProductNameSetted()

    /**
     * Set ProductName Null
     */
    final public void setProductNameNull() {
        this.productNameNull = true;
    } // end setProductNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductNameNull(boolean aNullFlag) {
        this.productNameNull = aNullFlag;
    } // end setProductNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductNameNull() {
        return this.productNameNull;
    } // end isProductNameNull()

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

        if ((obj instanceof ProductDefine) == false) {
            return false;
        } // end if

        ProductDefine other = (ProductDefine) obj;

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

        buffer.append("productCode=");
        buffer.append(this.productCode);
        buffer.append("\r\n");

        buffer.append("productName=");
        buffer.append(this.productName);
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
} // end ProductDefine
