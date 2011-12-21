/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

/**
 * Generate Date 2011-10-10 16:06:21
 *
 * @author Auto Gen
 */
public class ProductTeamRelate implements java.io.Serializable {
    /**
     * Creates a new ProductTeamRelate object.
     */
    public ProductTeamRelate() {
        super();
    } // end ProductTeamRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long productId;

    /** Attribute  Be Seted Falg */
    private boolean productIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productIdNull = false;

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
    private long teamId;

    /** Attribute  Be Seted Falg */
    private boolean teamIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamIdNull = false;

    /** Attribute */
    private String teamName;

    /** Attribute  Be Seted Falg */
    private boolean teamNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamNameNull = false;

    /** Attribute */
    private String teamCode;

    /** Attribute  Be Seted Falg */
    private boolean teamCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamCodeNull = false;

    /** Attribute */
    private String teamMail;

    /** Attribute  Be Seted Falg */
    private boolean teamMailSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamMailNull = false;

    /** Attribute */
    private String teamStatus;

    /** Attribute  Be Seted Falg */
    private boolean teamStatusSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamStatusNull = false;

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
     * Get ProductId
     *
     * @return productId
     */
    final public long getProductId() {
        return productId;
    } // end getProductId()

    /**
     * Set ProductId
     *
     * @param aProductId
     */
    final public void setProductId(long aProductId) {
        this.productId = aProductId;

        this.productIdSetted = true;

        this.setProductIdNull(false);
    } // end setProductId()

    /**
     * Get ProductId Has Been Setted
     *
     * @return productId
     */
    final public boolean isProductIdSetted() {
        return this.productIdSetted;
    } // end isProductIdSetted()

    /**
     * Set ProductId Null
     */
    final public void setProductIdNull() {
        this.productIdNull = true;
    } // end setProductIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductIdNull(boolean aNullFlag) {
        this.productIdNull = aNullFlag;
    } // end setProductIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductIdNull() {
        return this.productIdNull;
    } // end isProductIdNull()

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
     * Get TeamId
     *
     * @return teamId
     */
    final public long getTeamId() {
        return teamId;
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    final public void setTeamId(long aTeamId) {
        this.teamId = aTeamId;

        this.teamIdSetted = true;

        this.setTeamIdNull(false);
    } // end setTeamId()

    /**
     * Get TeamId Has Been Setted
     *
     * @return teamId
     */
    final public boolean isTeamIdSetted() {
        return this.teamIdSetted;
    } // end isTeamIdSetted()

    /**
     * Set TeamId Null
     */
    final public void setTeamIdNull() {
        this.teamIdNull = true;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamIdNull(boolean aNullFlag) {
        this.teamIdNull = aNullFlag;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamIdNull() {
        return this.teamIdNull;
    } // end isTeamIdNull()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    final public String getTeamName() {
        return teamName;
    } // end getTeamName()

    /**
     * Set TeamName
     *
     * @param aTeamName
     */
    final public void setTeamName(String aTeamName) {
        this.teamName = aTeamName;

        this.teamNameSetted = true;

        this.setTeamNameNull(this.teamName == null);
    } // end setTeamName()

    /**
     * Get TeamName Has Been Setted
     *
     * @return teamName
     */
    final public boolean isTeamNameSetted() {
        return this.teamNameSetted;
    } // end isTeamNameSetted()

    /**
     * Set TeamName Null
     */
    final public void setTeamNameNull() {
        this.teamNameNull = true;
    } // end setTeamNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamNameNull(boolean aNullFlag) {
        this.teamNameNull = aNullFlag;
    } // end setTeamNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamNameNull() {
        return this.teamNameNull;
    } // end isTeamNameNull()

    /**
     * Get TeamCode
     *
     * @return teamCode
     */
    final public String getTeamCode() {
        return teamCode;
    } // end getTeamCode()

    /**
     * Set TeamCode
     *
     * @param aTeamCode
     */
    final public void setTeamCode(String aTeamCode) {
        this.teamCode = aTeamCode;

        this.teamCodeSetted = true;

        this.setTeamCodeNull(this.teamCode == null);
    } // end setTeamCode()

    /**
     * Get TeamCode Has Been Setted
     *
     * @return teamCode
     */
    final public boolean isTeamCodeSetted() {
        return this.teamCodeSetted;
    } // end isTeamCodeSetted()

    /**
     * Set TeamCode Null
     */
    final public void setTeamCodeNull() {
        this.teamCodeNull = true;
    } // end setTeamCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamCodeNull(boolean aNullFlag) {
        this.teamCodeNull = aNullFlag;
    } // end setTeamCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamCodeNull() {
        return this.teamCodeNull;
    } // end isTeamCodeNull()

    /**
     * Get TeamMail
     *
     * @return teamMail
     */
    final public String getTeamMail() {
        return teamMail;
    } // end getTeamMail()

    /**
     * Set TeamMail
     *
     * @param aTeamMail
     */
    final public void setTeamMail(String aTeamMail) {
        this.teamMail = aTeamMail;

        this.teamMailSetted = true;

        this.setTeamMailNull(this.teamMail == null);
    } // end setTeamMail()

    /**
     * Get TeamMail Has Been Setted
     *
     * @return teamMail
     */
    final public boolean isTeamMailSetted() {
        return this.teamMailSetted;
    } // end isTeamMailSetted()

    /**
     * Set TeamMail Null
     */
    final public void setTeamMailNull() {
        this.teamMailNull = true;
    } // end setTeamMailNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamMailNull(boolean aNullFlag) {
        this.teamMailNull = aNullFlag;
    } // end setTeamMailNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamMailNull() {
        return this.teamMailNull;
    } // end isTeamMailNull()

    /**
     * Get TeamStatus
     *
     * @return teamStatus
     */
    final public String getTeamStatus() {
        return teamStatus;
    } // end getTeamStatus()

    /**
     * Set TeamStatus
     *
     * @param aTeamStatus
     */
    final public void setTeamStatus(String aTeamStatus) {
        this.teamStatus = aTeamStatus;

        this.teamStatusSetted = true;

        this.setTeamStatusNull(this.teamStatus == null);
    } // end setTeamStatus()

    /**
     * Get TeamStatus Has Been Setted
     *
     * @return teamStatus
     */
    final public boolean isTeamStatusSetted() {
        return this.teamStatusSetted;
    } // end isTeamStatusSetted()

    /**
     * Set TeamStatus Null
     */
    final public void setTeamStatusNull() {
        this.teamStatusNull = true;
    } // end setTeamStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamStatusNull(boolean aNullFlag) {
        this.teamStatusNull = aNullFlag;
    } // end setTeamStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamStatusNull() {
        return this.teamStatusNull;
    } // end isTeamStatusNull()

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

        if ((obj instanceof ProductTeamRelate) == false) {
            return false;
        } // end if

        ProductTeamRelate other = (ProductTeamRelate) obj;

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

        buffer.append("productId=");
        buffer.append(this.productId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("teamId=");
        buffer.append(this.teamId);
        buffer.append("\r\n");

        buffer.append("teamName=");
        buffer.append(this.teamName);
        buffer.append("\r\n");

        buffer.append("teamCode=");
        buffer.append(this.teamCode);
        buffer.append("\r\n");

        buffer.append("teamMail=");
        buffer.append(this.teamMail);
        buffer.append("\r\n");

        buffer.append("teamStatus=");
        buffer.append(this.teamStatus);
        buffer.append("\r\n");

        buffer.append("productCode=");
        buffer.append(this.productCode);
        buffer.append("\r\n");

        buffer.append("productName=");
        buffer.append(this.productName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ProductTeamRelate
