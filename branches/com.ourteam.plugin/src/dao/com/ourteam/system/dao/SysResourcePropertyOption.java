/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 资源属性可选值 Generate Date 2011-09-22 10:11:17
 *
 * @author Auto Gen
 */
public class SysResourcePropertyOption implements java.io.Serializable {
    /**
     * Creates a new SysResourcePropertyOption object.
     */
    public SysResourcePropertyOption() {
        super();
    } // end SysResourcePropertyOption()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private Integer orderIndex;

    /** Attribute  Be Seted Falg */
    private boolean orderIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean orderIndexNull = false;

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
    private Long sysResourcePropertyId;

    /** Attribute  Be Seted Falg */
    private boolean sysResourcePropertyIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysResourcePropertyIdNull = false;

    /** Attribute */
    private String valueCode;

    /** Attribute  Be Seted Falg */
    private boolean valueCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean valueCodeNull = false;

    /** Attribute */
    private String valueLable;

    /** Attribute  Be Seted Falg */
    private boolean valueLableSetted = false;

    /** Attribute  is Null Falg */
    private boolean valueLableNull = false;

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
     * Get OrderIndex
     *
     * @return orderIndex
     */
    final public Integer getOrderIndex() {
        return orderIndex;
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    final public void setOrderIndex(Integer aOrderIndex) {
        this.orderIndex = aOrderIndex;

        this.orderIndexSetted = true;

        this.setOrderIndexNull(this.orderIndex == null);
    } // end setOrderIndex()

    /**
     * Get OrderIndex Has Been Setted
     *
     * @return orderIndex
     */
    final public boolean isOrderIndexSetted() {
        return this.orderIndexSetted;
    } // end isOrderIndexSetted()

    /**
     * Set OrderIndex Null
     */
    final public void setOrderIndexNull() {
        this.orderIndexNull = true;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOrderIndexNull(boolean aNullFlag) {
        this.orderIndexNull = aNullFlag;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOrderIndexNull() {
        return this.orderIndexNull;
    } // end isOrderIndexNull()

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
     * Get SysResourcePropertyId
     *
     * @return sysResourcePropertyId
     */
    final public Long getSysResourcePropertyId() {
        return sysResourcePropertyId;
    } // end getSysResourcePropertyId()

    /**
     * Set SysResourcePropertyId
     *
     * @param aSysResourcePropertyId
     */
    final public void setSysResourcePropertyId(Long aSysResourcePropertyId) {
        this.sysResourcePropertyId = aSysResourcePropertyId;

        this.sysResourcePropertyIdSetted = true;

        this.setSysResourcePropertyIdNull(this.sysResourcePropertyId == null);
    } // end setSysResourcePropertyId()

    /**
     * Get SysResourcePropertyId Has Been Setted
     *
     * @return sysResourcePropertyId
     */
    final public boolean isSysResourcePropertyIdSetted() {
        return this.sysResourcePropertyIdSetted;
    } // end isSysResourcePropertyIdSetted()

    /**
     * Set SysResourcePropertyId Null
     */
    final public void setSysResourcePropertyIdNull() {
        this.sysResourcePropertyIdNull = true;
    } // end setSysResourcePropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysResourcePropertyIdNull(boolean aNullFlag) {
        this.sysResourcePropertyIdNull = aNullFlag;
    } // end setSysResourcePropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysResourcePropertyIdNull() {
        return this.sysResourcePropertyIdNull;
    } // end isSysResourcePropertyIdNull()

    /**
     * Get ValueCode
     *
     * @return valueCode
     */
    final public String getValueCode() {
        return valueCode;
    } // end getValueCode()

    /**
     * Set ValueCode
     *
     * @param aValueCode
     */
    final public void setValueCode(String aValueCode) {
        this.valueCode = aValueCode;

        this.valueCodeSetted = true;

        this.setValueCodeNull(this.valueCode == null);
    } // end setValueCode()

    /**
     * Get ValueCode Has Been Setted
     *
     * @return valueCode
     */
    final public boolean isValueCodeSetted() {
        return this.valueCodeSetted;
    } // end isValueCodeSetted()

    /**
     * Set ValueCode Null
     */
    final public void setValueCodeNull() {
        this.valueCodeNull = true;
    } // end setValueCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setValueCodeNull(boolean aNullFlag) {
        this.valueCodeNull = aNullFlag;
    } // end setValueCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isValueCodeNull() {
        return this.valueCodeNull;
    } // end isValueCodeNull()

    /**
     * Get ValueLable
     *
     * @return valueLable
     */
    final public String getValueLable() {
        return valueLable;
    } // end getValueLable()

    /**
     * Set ValueLable
     *
     * @param aValueLable
     */
    final public void setValueLable(String aValueLable) {
        this.valueLable = aValueLable;

        this.valueLableSetted = true;

        this.setValueLableNull(this.valueLable == null);
    } // end setValueLable()

    /**
     * Get ValueLable Has Been Setted
     *
     * @return valueLable
     */
    final public boolean isValueLableSetted() {
        return this.valueLableSetted;
    } // end isValueLableSetted()

    /**
     * Set ValueLable Null
     */
    final public void setValueLableNull() {
        this.valueLableNull = true;
    } // end setValueLableNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setValueLableNull(boolean aNullFlag) {
        this.valueLableNull = aNullFlag;
    } // end setValueLableNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isValueLableNull() {
        return this.valueLableNull;
    } // end isValueLableNull()

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

        if ((obj instanceof SysResourcePropertyOption) == false) {
            return false;
        } // end if

        SysResourcePropertyOption other = (SysResourcePropertyOption) obj;

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

        buffer.append("orderIndex=");
        buffer.append(this.orderIndex);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysResourcePropertyId=");
        buffer.append(this.sysResourcePropertyId);
        buffer.append("\r\n");

        buffer.append("valueCode=");
        buffer.append(this.valueCode);
        buffer.append("\r\n");

        buffer.append("valueLable=");
        buffer.append(this.valueLable);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysResourcePropertyOption
