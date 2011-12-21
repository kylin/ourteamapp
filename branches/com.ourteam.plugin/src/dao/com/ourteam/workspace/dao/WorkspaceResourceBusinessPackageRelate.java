/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

/**
 * Generate Date 2011-09-22 10:17:25
 *
 * @author Auto Gen
 */
public class WorkspaceResourceBusinessPackageRelate implements java.io.Serializable {
    /**
     * Creates a new WorkspaceResourceBusinessPackageRelate object.
     */
    public WorkspaceResourceBusinessPackageRelate() {
        super();
    } // end WorkspaceResourceBusinessPackageRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long businessPcakageId;

    /** Attribute  Be Seted Falg */
    private boolean businessPcakageIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessPcakageIdNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private Integer status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long workspaceResourceId;

    /** Attribute  Be Seted Falg */
    private boolean workspaceResourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean workspaceResourceIdNull = false;

    /** Attribute */
    private String businessPackageName;

    /** Attribute  Be Seted Falg */
    private boolean businessPackageNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessPackageNameNull = false;

    /** Attribute */
    private String businessDomainName;

    /** Attribute  Be Seted Falg */
    private boolean businessDomainNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessDomainNameNull = false;

    /** Attribute */
    private long businessDomainId;

    /** Attribute  Be Seted Falg */
    private boolean businessDomainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessDomainIdNull = false;

    /** Attribute */
    private String businessPackageType;

    /** Attribute  Be Seted Falg */
    private boolean businessPackageTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessPackageTypeNull = false;

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
     * Get BusinessPcakageId
     *
     * @return businessPcakageId
     */
    final public long getBusinessPcakageId() {
        return businessPcakageId;
    } // end getBusinessPcakageId()

    /**
     * Set BusinessPcakageId
     *
     * @param aBusinessPcakageId
     */
    final public void setBusinessPcakageId(long aBusinessPcakageId) {
        this.businessPcakageId = aBusinessPcakageId;

        this.businessPcakageIdSetted = true;

        this.setBusinessPcakageIdNull(false);
    } // end setBusinessPcakageId()

    /**
     * Get BusinessPcakageId Has Been Setted
     *
     * @return businessPcakageId
     */
    final public boolean isBusinessPcakageIdSetted() {
        return this.businessPcakageIdSetted;
    } // end isBusinessPcakageIdSetted()

    /**
     * Set BusinessPcakageId Null
     */
    final public void setBusinessPcakageIdNull() {
        this.businessPcakageIdNull = true;
    } // end setBusinessPcakageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessPcakageIdNull(boolean aNullFlag) {
        this.businessPcakageIdNull = aNullFlag;
    } // end setBusinessPcakageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessPcakageIdNull() {
        return this.businessPcakageIdNull;
    } // end isBusinessPcakageIdNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        if (isDescriptionNull()) {
            return null;
        } // end if
        else {
            return description;
        } // end else
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    final public void setDescription(String aDescription) {
        this.description = aDescription;

        this.descriptionSetted = true;

        this.setDescriptionNull(this.description == null);
    } // end setDescription()

    /**
     * Get Description Has Been Setted
     *
     * @return description
     */
    final public boolean isDescriptionSetted() {
        return this.descriptionSetted;
    } // end isDescriptionSetted()

    /**
     * Set Description Null
     */
    final public void setDescriptionNull() {
        this.descriptionNull = true;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescriptionNull(boolean aNullFlag) {
        this.descriptionNull = aNullFlag;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescriptionNull() {
        return this.descriptionNull;
    } // end isDescriptionNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public Integer getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(Integer aStatus) {
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
     * Get WorkspaceResourceId
     *
     * @return workspaceResourceId
     */
    final public long getWorkspaceResourceId() {
        return workspaceResourceId;
    } // end getWorkspaceResourceId()

    /**
     * Set WorkspaceResourceId
     *
     * @param aWorkspaceResourceId
     */
    final public void setWorkspaceResourceId(long aWorkspaceResourceId) {
        this.workspaceResourceId = aWorkspaceResourceId;

        this.workspaceResourceIdSetted = true;

        this.setWorkspaceResourceIdNull(false);
    } // end setWorkspaceResourceId()

    /**
     * Get WorkspaceResourceId Has Been Setted
     *
     * @return workspaceResourceId
     */
    final public boolean isWorkspaceResourceIdSetted() {
        return this.workspaceResourceIdSetted;
    } // end isWorkspaceResourceIdSetted()

    /**
     * Set WorkspaceResourceId Null
     */
    final public void setWorkspaceResourceIdNull() {
        this.workspaceResourceIdNull = true;
    } // end setWorkspaceResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setWorkspaceResourceIdNull(boolean aNullFlag) {
        this.workspaceResourceIdNull = aNullFlag;
    } // end setWorkspaceResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isWorkspaceResourceIdNull() {
        return this.workspaceResourceIdNull;
    } // end isWorkspaceResourceIdNull()

    /**
     * Get BusinessPackageName
     *
     * @return businessPackageName
     */
    final public String getBusinessPackageName() {
        return businessPackageName;
    } // end getBusinessPackageName()

    /**
     * Set BusinessPackageName
     *
     * @param aBusinessPackageName
     */
    final public void setBusinessPackageName(String aBusinessPackageName) {
        this.businessPackageName = aBusinessPackageName;

        this.businessPackageNameSetted = true;

        this.setBusinessPackageNameNull(this.businessPackageName == null);
    } // end setBusinessPackageName()

    /**
     * Get BusinessPackageName Has Been Setted
     *
     * @return businessPackageName
     */
    final public boolean isBusinessPackageNameSetted() {
        return this.businessPackageNameSetted;
    } // end isBusinessPackageNameSetted()

    /**
     * Set BusinessPackageName Null
     */
    final public void setBusinessPackageNameNull() {
        this.businessPackageNameNull = true;
    } // end setBusinessPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessPackageNameNull(boolean aNullFlag) {
        this.businessPackageNameNull = aNullFlag;
    } // end setBusinessPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessPackageNameNull() {
        return this.businessPackageNameNull;
    } // end isBusinessPackageNameNull()

    /**
     * Get BusinessDomainName
     *
     * @return businessDomainName
     */
    final public String getBusinessDomainName() {
        return businessDomainName;
    } // end getBusinessDomainName()

    /**
     * Set BusinessDomainName
     *
     * @param aBusinessDomainName
     */
    final public void setBusinessDomainName(String aBusinessDomainName) {
        this.businessDomainName = aBusinessDomainName;

        this.businessDomainNameSetted = true;

        this.setBusinessDomainNameNull(this.businessDomainName == null);
    } // end setBusinessDomainName()

    /**
     * Get BusinessDomainName Has Been Setted
     *
     * @return businessDomainName
     */
    final public boolean isBusinessDomainNameSetted() {
        return this.businessDomainNameSetted;
    } // end isBusinessDomainNameSetted()

    /**
     * Set BusinessDomainName Null
     */
    final public void setBusinessDomainNameNull() {
        this.businessDomainNameNull = true;
    } // end setBusinessDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessDomainNameNull(boolean aNullFlag) {
        this.businessDomainNameNull = aNullFlag;
    } // end setBusinessDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessDomainNameNull() {
        return this.businessDomainNameNull;
    } // end isBusinessDomainNameNull()

    /**
     * Get BusinessDomainId
     *
     * @return businessDomainId
     */
    final public long getBusinessDomainId() {
        return businessDomainId;
    } // end getBusinessDomainId()

    /**
     * Set BusinessDomainId
     *
     * @param aBusinessDomainId
     */
    final public void setBusinessDomainId(long aBusinessDomainId) {
        this.businessDomainId = aBusinessDomainId;

        this.businessDomainIdSetted = true;

        this.setBusinessDomainIdNull(false);
    } // end setBusinessDomainId()

    /**
     * Get BusinessDomainId Has Been Setted
     *
     * @return businessDomainId
     */
    final public boolean isBusinessDomainIdSetted() {
        return this.businessDomainIdSetted;
    } // end isBusinessDomainIdSetted()

    /**
     * Set BusinessDomainId Null
     */
    final public void setBusinessDomainIdNull() {
        this.businessDomainIdNull = true;
    } // end setBusinessDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessDomainIdNull(boolean aNullFlag) {
        this.businessDomainIdNull = aNullFlag;
    } // end setBusinessDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessDomainIdNull() {
        return this.businessDomainIdNull;
    } // end isBusinessDomainIdNull()

    /**
     * Get BusinessPackageType
     *
     * @return businessPackageType
     */
    final public String getBusinessPackageType() {
        return businessPackageType;
    } // end getBusinessPackageType()

    /**
     * Set BusinessPackageType
     *
     * @param aBusinessPackageType
     */
    final public void setBusinessPackageType(String aBusinessPackageType) {
        this.businessPackageType = aBusinessPackageType;

        this.businessPackageTypeSetted = true;

        this.setBusinessPackageTypeNull(this.businessPackageType == null);
    } // end setBusinessPackageType()

    /**
     * Get BusinessPackageType Has Been Setted
     *
     * @return businessPackageType
     */
    final public boolean isBusinessPackageTypeSetted() {
        return this.businessPackageTypeSetted;
    } // end isBusinessPackageTypeSetted()

    /**
     * Set BusinessPackageType Null
     */
    final public void setBusinessPackageTypeNull() {
        this.businessPackageTypeNull = true;
    } // end setBusinessPackageTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessPackageTypeNull(boolean aNullFlag) {
        this.businessPackageTypeNull = aNullFlag;
    } // end setBusinessPackageTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessPackageTypeNull() {
        return this.businessPackageTypeNull;
    } // end isBusinessPackageTypeNull()

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

        if ((obj instanceof WorkspaceResourceBusinessPackageRelate) == false) {
            return false;
        } // end if

        WorkspaceResourceBusinessPackageRelate other = (WorkspaceResourceBusinessPackageRelate) obj;

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

        buffer.append("businessPcakageId=");
        buffer.append(this.businessPcakageId);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("workspaceResourceId=");
        buffer.append(this.workspaceResourceId);
        buffer.append("\r\n");

        buffer.append("businessPackageName=");
        buffer.append(this.businessPackageName);
        buffer.append("\r\n");

        buffer.append("businessDomainName=");
        buffer.append(this.businessDomainName);
        buffer.append("\r\n");

        buffer.append("businessDomainId=");
        buffer.append(this.businessDomainId);
        buffer.append("\r\n");

        buffer.append("businessPackageType=");
        buffer.append(this.businessPackageType);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end WorkspaceResourceBusinessPackageRelate
