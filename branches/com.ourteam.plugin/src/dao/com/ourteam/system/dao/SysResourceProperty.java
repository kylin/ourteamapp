/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统资源属性 Generate Date 2011-09-22 10:11:16
 *
 * @author Auto Gen
 */
public class SysResourceProperty implements java.io.Serializable {
    /**
     * Creates a new SysResourceProperty object.
     */
    public SysResourceProperty() {
        super();
    } // end SysResourceProperty()

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
    private String resourcePropertyCode;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyCodeNull = false;

    /** Attribute */
    private String resourcePropertyDefaultValue;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyDefaultValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyDefaultValueNull = false;

    /** Attribute */
    private String resourcePropertyName;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyNameNull = false;

    /** Attribute */
    private Integer resourcePropertyOrder;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyOrderSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyOrderNull = false;

    /** Attribute */
    private String resourcePropertyType;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyTypeNull = false;

    /** Attribute */
    private String resourcePropertyValue;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyValueSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyValueNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private Long sysResourceId;

    /** Attribute  Be Seted Falg */
    private boolean sysResourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysResourceIdNull = false;

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
     * Get ResourcePropertyCode
     *
     * @return resourcePropertyCode
     */
    final public String getResourcePropertyCode() {
        return resourcePropertyCode;
    } // end getResourcePropertyCode()

    /**
     * Set ResourcePropertyCode
     *
     * @param aResourcePropertyCode
     */
    final public void setResourcePropertyCode(String aResourcePropertyCode) {
        this.resourcePropertyCode = aResourcePropertyCode;

        this.resourcePropertyCodeSetted = true;

        this.setResourcePropertyCodeNull(this.resourcePropertyCode == null);
    } // end setResourcePropertyCode()

    /**
     * Get ResourcePropertyCode Has Been Setted
     *
     * @return resourcePropertyCode
     */
    final public boolean isResourcePropertyCodeSetted() {
        return this.resourcePropertyCodeSetted;
    } // end isResourcePropertyCodeSetted()

    /**
     * Set ResourcePropertyCode Null
     */
    final public void setResourcePropertyCodeNull() {
        this.resourcePropertyCodeNull = true;
    } // end setResourcePropertyCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyCodeNull(boolean aNullFlag) {
        this.resourcePropertyCodeNull = aNullFlag;
    } // end setResourcePropertyCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyCodeNull() {
        return this.resourcePropertyCodeNull;
    } // end isResourcePropertyCodeNull()

    /**
     * Get ResourcePropertyDefaultValue
     *
     * @return resourcePropertyDefaultValue
     */
    final public String getResourcePropertyDefaultValue() {
        if (isResourcePropertyDefaultValueNull()) {
            return null;
        } // end if
        else {
            return resourcePropertyDefaultValue;
        } // end else
    } // end getResourcePropertyDefaultValue()

    /**
     * Set ResourcePropertyDefaultValue
     *
     * @param aResourcePropertyDefaultValue
     */
    final public void setResourcePropertyDefaultValue(
        String aResourcePropertyDefaultValue) {
        this.resourcePropertyDefaultValue = aResourcePropertyDefaultValue;

        this.resourcePropertyDefaultValueSetted = true;

        this.setResourcePropertyDefaultValueNull(this.resourcePropertyDefaultValue == null);
    } // end setResourcePropertyDefaultValue()

    /**
     * Get ResourcePropertyDefaultValue Has Been Setted
     *
     * @return resourcePropertyDefaultValue
     */
    final public boolean isResourcePropertyDefaultValueSetted() {
        return this.resourcePropertyDefaultValueSetted;
    } // end isResourcePropertyDefaultValueSetted()

    /**
     * Set ResourcePropertyDefaultValue Null
     */
    final public void setResourcePropertyDefaultValueNull() {
        this.resourcePropertyDefaultValueNull = true;
    } // end setResourcePropertyDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyDefaultValueNull(boolean aNullFlag) {
        this.resourcePropertyDefaultValueNull = aNullFlag;
    } // end setResourcePropertyDefaultValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyDefaultValueNull() {
        return this.resourcePropertyDefaultValueNull;
    } // end isResourcePropertyDefaultValueNull()

    /**
     * Get ResourcePropertyName
     *
     * @return resourcePropertyName
     */
    final public String getResourcePropertyName() {
        return resourcePropertyName;
    } // end getResourcePropertyName()

    /**
     * Set ResourcePropertyName
     *
     * @param aResourcePropertyName
     */
    final public void setResourcePropertyName(String aResourcePropertyName) {
        this.resourcePropertyName = aResourcePropertyName;

        this.resourcePropertyNameSetted = true;

        this.setResourcePropertyNameNull(this.resourcePropertyName == null);
    } // end setResourcePropertyName()

    /**
     * Get ResourcePropertyName Has Been Setted
     *
     * @return resourcePropertyName
     */
    final public boolean isResourcePropertyNameSetted() {
        return this.resourcePropertyNameSetted;
    } // end isResourcePropertyNameSetted()

    /**
     * Set ResourcePropertyName Null
     */
    final public void setResourcePropertyNameNull() {
        this.resourcePropertyNameNull = true;
    } // end setResourcePropertyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyNameNull(boolean aNullFlag) {
        this.resourcePropertyNameNull = aNullFlag;
    } // end setResourcePropertyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyNameNull() {
        return this.resourcePropertyNameNull;
    } // end isResourcePropertyNameNull()

    /**
     * Get ResourcePropertyOrder
     *
     * @return resourcePropertyOrder
     */
    final public Integer getResourcePropertyOrder() {
        return resourcePropertyOrder;
    } // end getResourcePropertyOrder()

    /**
     * Set ResourcePropertyOrder
     *
     * @param aResourcePropertyOrder
     */
    final public void setResourcePropertyOrder(Integer aResourcePropertyOrder) {
        this.resourcePropertyOrder = aResourcePropertyOrder;

        this.resourcePropertyOrderSetted = true;

        this.setResourcePropertyOrderNull(this.resourcePropertyOrder == null);
    } // end setResourcePropertyOrder()

    /**
     * Get ResourcePropertyOrder Has Been Setted
     *
     * @return resourcePropertyOrder
     */
    final public boolean isResourcePropertyOrderSetted() {
        return this.resourcePropertyOrderSetted;
    } // end isResourcePropertyOrderSetted()

    /**
     * Set ResourcePropertyOrder Null
     */
    final public void setResourcePropertyOrderNull() {
        this.resourcePropertyOrderNull = true;
    } // end setResourcePropertyOrderNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyOrderNull(boolean aNullFlag) {
        this.resourcePropertyOrderNull = aNullFlag;
    } // end setResourcePropertyOrderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyOrderNull() {
        return this.resourcePropertyOrderNull;
    } // end isResourcePropertyOrderNull()

    /**
     * Get ResourcePropertyType
     *
     * @return resourcePropertyType
     */
    final public String getResourcePropertyType() {
        return resourcePropertyType;
    } // end getResourcePropertyType()

    /**
     * Set ResourcePropertyType
     *
     * @param aResourcePropertyType
     */
    final public void setResourcePropertyType(String aResourcePropertyType) {
        this.resourcePropertyType = aResourcePropertyType;

        this.resourcePropertyTypeSetted = true;

        this.setResourcePropertyTypeNull(this.resourcePropertyType == null);
    } // end setResourcePropertyType()

    /**
     * Get ResourcePropertyType Has Been Setted
     *
     * @return resourcePropertyType
     */
    final public boolean isResourcePropertyTypeSetted() {
        return this.resourcePropertyTypeSetted;
    } // end isResourcePropertyTypeSetted()

    /**
     * Set ResourcePropertyType Null
     */
    final public void setResourcePropertyTypeNull() {
        this.resourcePropertyTypeNull = true;
    } // end setResourcePropertyTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyTypeNull(boolean aNullFlag) {
        this.resourcePropertyTypeNull = aNullFlag;
    } // end setResourcePropertyTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyTypeNull() {
        return this.resourcePropertyTypeNull;
    } // end isResourcePropertyTypeNull()

    /**
     * Get ResourcePropertyValue
     *
     * @return resourcePropertyValue
     */
    final public String getResourcePropertyValue() {
        if (isResourcePropertyValueNull()) {
            return null;
        } // end if
        else {
            return resourcePropertyValue;
        } // end else
    } // end getResourcePropertyValue()

    /**
     * Set ResourcePropertyValue
     *
     * @param aResourcePropertyValue
     */
    final public void setResourcePropertyValue(String aResourcePropertyValue) {
        this.resourcePropertyValue = aResourcePropertyValue;

        this.resourcePropertyValueSetted = true;

        this.setResourcePropertyValueNull(this.resourcePropertyValue == null);
    } // end setResourcePropertyValue()

    /**
     * Get ResourcePropertyValue Has Been Setted
     *
     * @return resourcePropertyValue
     */
    final public boolean isResourcePropertyValueSetted() {
        return this.resourcePropertyValueSetted;
    } // end isResourcePropertyValueSetted()

    /**
     * Set ResourcePropertyValue Null
     */
    final public void setResourcePropertyValueNull() {
        this.resourcePropertyValueNull = true;
    } // end setResourcePropertyValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyValueNull(boolean aNullFlag) {
        this.resourcePropertyValueNull = aNullFlag;
    } // end setResourcePropertyValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyValueNull() {
        return this.resourcePropertyValueNull;
    } // end isResourcePropertyValueNull()

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
     * Get SysResourceId
     *
     * @return sysResourceId
     */
    final public Long getSysResourceId() {
        return sysResourceId;
    } // end getSysResourceId()

    /**
     * Set SysResourceId
     *
     * @param aSysResourceId
     */
    final public void setSysResourceId(Long aSysResourceId) {
        this.sysResourceId = aSysResourceId;

        this.sysResourceIdSetted = true;

        this.setSysResourceIdNull(this.sysResourceId == null);
    } // end setSysResourceId()

    /**
     * Get SysResourceId Has Been Setted
     *
     * @return sysResourceId
     */
    final public boolean isSysResourceIdSetted() {
        return this.sysResourceIdSetted;
    } // end isSysResourceIdSetted()

    /**
     * Set SysResourceId Null
     */
    final public void setSysResourceIdNull() {
        this.sysResourceIdNull = true;
    } // end setSysResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysResourceIdNull(boolean aNullFlag) {
        this.sysResourceIdNull = aNullFlag;
    } // end setSysResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysResourceIdNull() {
        return this.sysResourceIdNull;
    } // end isSysResourceIdNull()

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

        if ((obj instanceof SysResourceProperty) == false) {
            return false;
        } // end if

        SysResourceProperty other = (SysResourceProperty) obj;

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

        buffer.append("resourcePropertyCode=");
        buffer.append(this.resourcePropertyCode);
        buffer.append("\r\n");

        buffer.append("resourcePropertyDefaultValue=");
        buffer.append(this.resourcePropertyDefaultValue);
        buffer.append("\r\n");

        buffer.append("resourcePropertyName=");
        buffer.append(this.resourcePropertyName);
        buffer.append("\r\n");

        buffer.append("resourcePropertyOrder=");
        buffer.append(this.resourcePropertyOrder);
        buffer.append("\r\n");

        buffer.append("resourcePropertyType=");
        buffer.append(this.resourcePropertyType);
        buffer.append("\r\n");

        buffer.append("resourcePropertyValue=");
        buffer.append(this.resourcePropertyValue);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysResourceId=");
        buffer.append(this.sysResourceId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysResourceProperty
