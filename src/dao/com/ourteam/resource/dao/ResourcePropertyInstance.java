/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

/**
 * Generate Date 2011-09-22 10:18:27
 *
 * @author Auto Gen
 */
public class ResourcePropertyInstance implements java.io.Serializable {
    /**
     * Creates a new ResourcePropertyInstance object.
     */
    public ResourcePropertyInstance() {
        super();
    } // end ResourcePropertyInstance()

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
    private long resourceInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean resourceInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceInstanceIdNull = false;

    /** Attribute */
    private long resourcePropertyId;

    /** Attribute  Be Seted Falg */
    private boolean resourcePropertyIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourcePropertyIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String value;

    /** Attribute  Be Seted Falg */
    private boolean valueSetted = false;

    /** Attribute  is Null Falg */
    private boolean valueNull = false;

    /** Attribute */
    private String propertyCode;

    /** Attribute  Be Seted Falg */
    private boolean propertyCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyCodeNull = false;

    /** Attribute */
    private String propertyName;

    /** Attribute  Be Seted Falg */
    private boolean propertyNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyNameNull = false;

    /** Attribute */
    private String propertyDataType;

    /** Attribute  Be Seted Falg */
    private boolean propertyDataTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyDataTypeNull = false;

    /** Attribute */
    private int propertySortIndex;

    /** Attribute  Be Seted Falg */
    private boolean propertySortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertySortIndexNull = false;

    /** Attribute */
    private String propertyStatus;

    /** Attribute  Be Seted Falg */
    private boolean propertyStatusSetted = false;

    /** Attribute  is Null Falg */
    private boolean propertyStatusNull = false;

    /** Attribute */
    private long resourceTypeId;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeIdNull = false;

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
     * Get ResourceInstanceId
     *
     * @return resourceInstanceId
     */
    final public long getResourceInstanceId() {
        return resourceInstanceId;
    } // end getResourceInstanceId()

    /**
     * Set ResourceInstanceId
     *
     * @param aResourceInstanceId
     */
    final public void setResourceInstanceId(long aResourceInstanceId) {
        this.resourceInstanceId = aResourceInstanceId;

        this.resourceInstanceIdSetted = true;

        this.setResourceInstanceIdNull(false);
    } // end setResourceInstanceId()

    /**
     * Get ResourceInstanceId Has Been Setted
     *
     * @return resourceInstanceId
     */
    final public boolean isResourceInstanceIdSetted() {
        return this.resourceInstanceIdSetted;
    } // end isResourceInstanceIdSetted()

    /**
     * Set ResourceInstanceId Null
     */
    final public void setResourceInstanceIdNull() {
        this.resourceInstanceIdNull = true;
    } // end setResourceInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceInstanceIdNull(boolean aNullFlag) {
        this.resourceInstanceIdNull = aNullFlag;
    } // end setResourceInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceInstanceIdNull() {
        return this.resourceInstanceIdNull;
    } // end isResourceInstanceIdNull()

    /**
     * Get ResourcePropertyId
     *
     * @return resourcePropertyId
     */
    final public long getResourcePropertyId() {
        return resourcePropertyId;
    } // end getResourcePropertyId()

    /**
     * Set ResourcePropertyId
     *
     * @param aResourcePropertyId
     */
    final public void setResourcePropertyId(long aResourcePropertyId) {
        this.resourcePropertyId = aResourcePropertyId;

        this.resourcePropertyIdSetted = true;

        this.setResourcePropertyIdNull(false);
    } // end setResourcePropertyId()

    /**
     * Get ResourcePropertyId Has Been Setted
     *
     * @return resourcePropertyId
     */
    final public boolean isResourcePropertyIdSetted() {
        return this.resourcePropertyIdSetted;
    } // end isResourcePropertyIdSetted()

    /**
     * Set ResourcePropertyId Null
     */
    final public void setResourcePropertyIdNull() {
        this.resourcePropertyIdNull = true;
    } // end setResourcePropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourcePropertyIdNull(boolean aNullFlag) {
        this.resourcePropertyIdNull = aNullFlag;
    } // end setResourcePropertyIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourcePropertyIdNull() {
        return this.resourcePropertyIdNull;
    } // end isResourcePropertyIdNull()

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
     * Get Value
     *
     * @return value
     */
    final public String getValue() {
        if (isValueNull()) {
            return null;
        } // end if
        else {
            return value;
        } // end else
    } // end getValue()

    /**
     * Set Value
     *
     * @param aValue
     */
    final public void setValue(String aValue) {
        this.value = aValue;

        this.valueSetted = true;

        this.setValueNull(this.value == null);
    } // end setValue()

    /**
     * Get Value Has Been Setted
     *
     * @return value
     */
    final public boolean isValueSetted() {
        return this.valueSetted;
    } // end isValueSetted()

    /**
     * Set Value Null
     */
    final public void setValueNull() {
        this.valueNull = true;
    } // end setValueNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setValueNull(boolean aNullFlag) {
        this.valueNull = aNullFlag;
    } // end setValueNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isValueNull() {
        return this.valueNull;
    } // end isValueNull()

    /**
     * Get PropertyCode
     *
     * @return propertyCode
     */
    final public String getPropertyCode() {
        return propertyCode;
    } // end getPropertyCode()

    /**
     * Set PropertyCode
     *
     * @param aPropertyCode
     */
    final public void setPropertyCode(String aPropertyCode) {
        this.propertyCode = aPropertyCode;

        this.propertyCodeSetted = true;

        this.setPropertyCodeNull(this.propertyCode == null);
    } // end setPropertyCode()

    /**
     * Get PropertyCode Has Been Setted
     *
     * @return propertyCode
     */
    final public boolean isPropertyCodeSetted() {
        return this.propertyCodeSetted;
    } // end isPropertyCodeSetted()

    /**
     * Set PropertyCode Null
     */
    final public void setPropertyCodeNull() {
        this.propertyCodeNull = true;
    } // end setPropertyCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyCodeNull(boolean aNullFlag) {
        this.propertyCodeNull = aNullFlag;
    } // end setPropertyCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyCodeNull() {
        return this.propertyCodeNull;
    } // end isPropertyCodeNull()

    /**
     * Get PropertyName
     *
     * @return propertyName
     */
    final public String getPropertyName() {
        return propertyName;
    } // end getPropertyName()

    /**
     * Set PropertyName
     *
     * @param aPropertyName
     */
    final public void setPropertyName(String aPropertyName) {
        this.propertyName = aPropertyName;

        this.propertyNameSetted = true;

        this.setPropertyNameNull(this.propertyName == null);
    } // end setPropertyName()

    /**
     * Get PropertyName Has Been Setted
     *
     * @return propertyName
     */
    final public boolean isPropertyNameSetted() {
        return this.propertyNameSetted;
    } // end isPropertyNameSetted()

    /**
     * Set PropertyName Null
     */
    final public void setPropertyNameNull() {
        this.propertyNameNull = true;
    } // end setPropertyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyNameNull(boolean aNullFlag) {
        this.propertyNameNull = aNullFlag;
    } // end setPropertyNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyNameNull() {
        return this.propertyNameNull;
    } // end isPropertyNameNull()

    /**
     * Get PropertyDataType
     *
     * @return propertyDataType
     */
    final public String getPropertyDataType() {
        return propertyDataType;
    } // end getPropertyDataType()

    /**
     * Set PropertyDataType
     *
     * @param aPropertyDataType
     */
    final public void setPropertyDataType(String aPropertyDataType) {
        this.propertyDataType = aPropertyDataType;

        this.propertyDataTypeSetted = true;

        this.setPropertyDataTypeNull(this.propertyDataType == null);
    } // end setPropertyDataType()

    /**
     * Get PropertyDataType Has Been Setted
     *
     * @return propertyDataType
     */
    final public boolean isPropertyDataTypeSetted() {
        return this.propertyDataTypeSetted;
    } // end isPropertyDataTypeSetted()

    /**
     * Set PropertyDataType Null
     */
    final public void setPropertyDataTypeNull() {
        this.propertyDataTypeNull = true;
    } // end setPropertyDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyDataTypeNull(boolean aNullFlag) {
        this.propertyDataTypeNull = aNullFlag;
    } // end setPropertyDataTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyDataTypeNull() {
        return this.propertyDataTypeNull;
    } // end isPropertyDataTypeNull()

    /**
     * Get PropertySortIndex
     *
     * @return propertySortIndex
     */
    final public int getPropertySortIndex() {
        return propertySortIndex;
    } // end getPropertySortIndex()

    /**
     * Set PropertySortIndex
     *
     * @param aPropertySortIndex
     */
    final public void setPropertySortIndex(int aPropertySortIndex) {
        this.propertySortIndex = aPropertySortIndex;

        this.propertySortIndexSetted = true;

        this.setPropertySortIndexNull(false);
    } // end setPropertySortIndex()

    /**
     * Get PropertySortIndex Has Been Setted
     *
     * @return propertySortIndex
     */
    final public boolean isPropertySortIndexSetted() {
        return this.propertySortIndexSetted;
    } // end isPropertySortIndexSetted()

    /**
     * Set PropertySortIndex Null
     */
    final public void setPropertySortIndexNull() {
        this.propertySortIndexNull = true;
    } // end setPropertySortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertySortIndexNull(boolean aNullFlag) {
        this.propertySortIndexNull = aNullFlag;
    } // end setPropertySortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertySortIndexNull() {
        return this.propertySortIndexNull;
    } // end isPropertySortIndexNull()

    /**
     * Get PropertyStatus
     *
     * @return propertyStatus
     */
    final public String getPropertyStatus() {
        return propertyStatus;
    } // end getPropertyStatus()

    /**
     * Set PropertyStatus
     *
     * @param aPropertyStatus
     */
    final public void setPropertyStatus(String aPropertyStatus) {
        this.propertyStatus = aPropertyStatus;

        this.propertyStatusSetted = true;

        this.setPropertyStatusNull(this.propertyStatus == null);
    } // end setPropertyStatus()

    /**
     * Get PropertyStatus Has Been Setted
     *
     * @return propertyStatus
     */
    final public boolean isPropertyStatusSetted() {
        return this.propertyStatusSetted;
    } // end isPropertyStatusSetted()

    /**
     * Set PropertyStatus Null
     */
    final public void setPropertyStatusNull() {
        this.propertyStatusNull = true;
    } // end setPropertyStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPropertyStatusNull(boolean aNullFlag) {
        this.propertyStatusNull = aNullFlag;
    } // end setPropertyStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPropertyStatusNull() {
        return this.propertyStatusNull;
    } // end isPropertyStatusNull()

    /**
     * Get ResourceTypeId
     *
     * @return resourceTypeId
     */
    final public long getResourceTypeId() {
        return resourceTypeId;
    } // end getResourceTypeId()

    /**
     * Set ResourceTypeId
     *
     * @param aResourceTypeId
     */
    final public void setResourceTypeId(long aResourceTypeId) {
        this.resourceTypeId = aResourceTypeId;

        this.resourceTypeIdSetted = true;

        this.setResourceTypeIdNull(false);
    } // end setResourceTypeId()

    /**
     * Get ResourceTypeId Has Been Setted
     *
     * @return resourceTypeId
     */
    final public boolean isResourceTypeIdSetted() {
        return this.resourceTypeIdSetted;
    } // end isResourceTypeIdSetted()

    /**
     * Set ResourceTypeId Null
     */
    final public void setResourceTypeIdNull() {
        this.resourceTypeIdNull = true;
    } // end setResourceTypeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeIdNull(boolean aNullFlag) {
        this.resourceTypeIdNull = aNullFlag;
    } // end setResourceTypeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeIdNull() {
        return this.resourceTypeIdNull;
    } // end isResourceTypeIdNull()

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

        if ((obj instanceof ResourcePropertyInstance) == false) {
            return false;
        } // end if

        ResourcePropertyInstance other = (ResourcePropertyInstance) obj;

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

        buffer.append("resourceInstanceId=");
        buffer.append(this.resourceInstanceId);
        buffer.append("\r\n");

        buffer.append("resourcePropertyId=");
        buffer.append(this.resourcePropertyId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("value=");
        buffer.append(this.value);
        buffer.append("\r\n");

        buffer.append("propertyCode=");
        buffer.append(this.propertyCode);
        buffer.append("\r\n");

        buffer.append("propertyName=");
        buffer.append(this.propertyName);
        buffer.append("\r\n");

        buffer.append("propertyDataType=");
        buffer.append(this.propertyDataType);
        buffer.append("\r\n");

        buffer.append("propertySortIndex=");
        buffer.append(this.propertySortIndex);
        buffer.append("\r\n");

        buffer.append("propertyStatus=");
        buffer.append(this.propertyStatus);
        buffer.append("\r\n");

        buffer.append("resourceTypeId=");
        buffer.append(this.resourceTypeId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ResourcePropertyInstance
