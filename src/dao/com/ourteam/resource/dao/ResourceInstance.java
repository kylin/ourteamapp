/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

/**
 * Generate Date 2011-09-22 10:18:26
 *
 * @author Auto Gen
 */
public class ResourceInstance implements java.io.Serializable {
    /**
     * Creates a new ResourceInstance object.
     */
    public ResourceInstance() {
        super();
    } // end ResourceInstance()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String code;

    /** Attribute  Be Seted Falg */
    private boolean codeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long resourceTypeId;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String resourceTypeCode;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeCodeNull = false;

    /** Attribute */
    private String resourceTypeName;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeNameNull = false;

    /** Attribute */
    private String resourceTypeStatus;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeStatusSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeStatusNull = false;

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
     * Get Code
     *
     * @return code
     */
    final public String getCode() {
        return code;
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    final public void setCode(String aCode) {
        this.code = aCode;

        this.codeSetted = true;

        this.setCodeNull(this.code == null);
    } // end setCode()

    /**
     * Get Code Has Been Setted
     *
     * @return code
     */
    final public boolean isCodeSetted() {
        return this.codeSetted;
    } // end isCodeSetted()

    /**
     * Set Code Null
     */
    final public void setCodeNull() {
        this.codeNull = true;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeNull(boolean aNullFlag) {
        this.codeNull = aNullFlag;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeNull() {
        return this.codeNull;
    } // end isCodeNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

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
     * Get ResourceTypeCode
     *
     * @return resourceTypeCode
     */
    final public String getResourceTypeCode() {
        return resourceTypeCode;
    } // end getResourceTypeCode()

    /**
     * Set ResourceTypeCode
     *
     * @param aResourceTypeCode
     */
    final public void setResourceTypeCode(String aResourceTypeCode) {
        this.resourceTypeCode = aResourceTypeCode;

        this.resourceTypeCodeSetted = true;

        this.setResourceTypeCodeNull(this.resourceTypeCode == null);
    } // end setResourceTypeCode()

    /**
     * Get ResourceTypeCode Has Been Setted
     *
     * @return resourceTypeCode
     */
    final public boolean isResourceTypeCodeSetted() {
        return this.resourceTypeCodeSetted;
    } // end isResourceTypeCodeSetted()

    /**
     * Set ResourceTypeCode Null
     */
    final public void setResourceTypeCodeNull() {
        this.resourceTypeCodeNull = true;
    } // end setResourceTypeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeCodeNull(boolean aNullFlag) {
        this.resourceTypeCodeNull = aNullFlag;
    } // end setResourceTypeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeCodeNull() {
        return this.resourceTypeCodeNull;
    } // end isResourceTypeCodeNull()

    /**
     * Get ResourceTypeName
     *
     * @return resourceTypeName
     */
    final public String getResourceTypeName() {
        return resourceTypeName;
    } // end getResourceTypeName()

    /**
     * Set ResourceTypeName
     *
     * @param aResourceTypeName
     */
    final public void setResourceTypeName(String aResourceTypeName) {
        this.resourceTypeName = aResourceTypeName;

        this.resourceTypeNameSetted = true;

        this.setResourceTypeNameNull(this.resourceTypeName == null);
    } // end setResourceTypeName()

    /**
     * Get ResourceTypeName Has Been Setted
     *
     * @return resourceTypeName
     */
    final public boolean isResourceTypeNameSetted() {
        return this.resourceTypeNameSetted;
    } // end isResourceTypeNameSetted()

    /**
     * Set ResourceTypeName Null
     */
    final public void setResourceTypeNameNull() {
        this.resourceTypeNameNull = true;
    } // end setResourceTypeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeNameNull(boolean aNullFlag) {
        this.resourceTypeNameNull = aNullFlag;
    } // end setResourceTypeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeNameNull() {
        return this.resourceTypeNameNull;
    } // end isResourceTypeNameNull()

    /**
     * Get ResourceTypeStatus
     *
     * @return resourceTypeStatus
     */
    final public String getResourceTypeStatus() {
        return resourceTypeStatus;
    } // end getResourceTypeStatus()

    /**
     * Set ResourceTypeStatus
     *
     * @param aResourceTypeStatus
     */
    final public void setResourceTypeStatus(String aResourceTypeStatus) {
        this.resourceTypeStatus = aResourceTypeStatus;

        this.resourceTypeStatusSetted = true;

        this.setResourceTypeStatusNull(this.resourceTypeStatus == null);
    } // end setResourceTypeStatus()

    /**
     * Get ResourceTypeStatus Has Been Setted
     *
     * @return resourceTypeStatus
     */
    final public boolean isResourceTypeStatusSetted() {
        return this.resourceTypeStatusSetted;
    } // end isResourceTypeStatusSetted()

    /**
     * Set ResourceTypeStatus Null
     */
    final public void setResourceTypeStatusNull() {
        this.resourceTypeStatusNull = true;
    } // end setResourceTypeStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTypeStatusNull(boolean aNullFlag) {
        this.resourceTypeStatusNull = aNullFlag;
    } // end setResourceTypeStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTypeStatusNull() {
        return this.resourceTypeStatusNull;
    } // end isResourceTypeStatusNull()

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

        if ((obj instanceof ResourceInstance) == false) {
            return false;
        } // end if

        ResourceInstance other = (ResourceInstance) obj;

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

        buffer.append("code=");
        buffer.append(this.code);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("resourceTypeId=");
        buffer.append(this.resourceTypeId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("resourceTypeCode=");
        buffer.append(this.resourceTypeCode);
        buffer.append("\r\n");

        buffer.append("resourceTypeName=");
        buffer.append(this.resourceTypeName);
        buffer.append("\r\n");

        buffer.append("resourceTypeStatus=");
        buffer.append(this.resourceTypeStatus);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ResourceInstance
