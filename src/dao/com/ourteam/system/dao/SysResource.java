/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统资源 Generate Date 2011-09-22 10:11:14
 *
 * @author Auto Gen
 */
public class SysResource implements java.io.Serializable {
    /**
     * Creates a new SysResource object.
     */
    public SysResource() {
        super();
    } // end SysResource()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long domainId;

    /** Attribute  Be Seted Falg */
    private boolean domainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainIdNull = false;

    /** Attribute */
    private long parentResourceId;

    /** Attribute  Be Seted Falg */
    private boolean parentResourceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentResourceIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String resourceCode;

    /** Attribute  Be Seted Falg */
    private boolean resourceCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceCodeNull = false;

    /** Attribute */
    private String resourceName;

    /** Attribute  Be Seted Falg */
    private boolean resourceNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceNameNull = false;

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
    private int sort;

    /** Attribute  Be Seted Falg */
    private boolean sortSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortNull = false;

    /** Attribute */
    private String resourceTitleKey;

    /** Attribute  Be Seted Falg */
    private boolean resourceTitleKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTitleKeyNull = false;

    /** Attribute */
    private String domainTitleKey;

    /** Attribute  Be Seted Falg */
    private boolean domainTitleKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean domainTitleKeyNull = false;

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
     * Get DomainId
     *
     * @return domainId
     */
    final public long getDomainId() {
        return domainId;
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    final public void setDomainId(long aDomainId) {
        this.domainId = aDomainId;

        this.domainIdSetted = true;

        this.setDomainIdNull(false);
    } // end setDomainId()

    /**
     * Get DomainId Has Been Setted
     *
     * @return domainId
     */
    final public boolean isDomainIdSetted() {
        return this.domainIdSetted;
    } // end isDomainIdSetted()

    /**
     * Set DomainId Null
     */
    final public void setDomainIdNull() {
        this.domainIdNull = true;
    } // end setDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainIdNull(boolean aNullFlag) {
        this.domainIdNull = aNullFlag;
    } // end setDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainIdNull() {
        return this.domainIdNull;
    } // end isDomainIdNull()

    /**
     * Get ParentResourceId
     *
     * @return parentResourceId
     */
    final public long getParentResourceId() {
        return parentResourceId;
    } // end getParentResourceId()

    /**
     * Set ParentResourceId
     *
     * @param aParentResourceId
     */
    final public void setParentResourceId(long aParentResourceId) {
        this.parentResourceId = aParentResourceId;

        this.parentResourceIdSetted = true;

        this.setParentResourceIdNull(false);
    } // end setParentResourceId()

    /**
     * Get ParentResourceId Has Been Setted
     *
     * @return parentResourceId
     */
    final public boolean isParentResourceIdSetted() {
        return this.parentResourceIdSetted;
    } // end isParentResourceIdSetted()

    /**
     * Set ParentResourceId Null
     */
    final public void setParentResourceIdNull() {
        this.parentResourceIdNull = true;
    } // end setParentResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentResourceIdNull(boolean aNullFlag) {
        this.parentResourceIdNull = aNullFlag;
    } // end setParentResourceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentResourceIdNull() {
        return this.parentResourceIdNull;
    } // end isParentResourceIdNull()

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
     * Get ResourceCode
     *
     * @return resourceCode
     */
    final public String getResourceCode() {
        return resourceCode;
    } // end getResourceCode()

    /**
     * Set ResourceCode
     *
     * @param aResourceCode
     */
    final public void setResourceCode(String aResourceCode) {
        this.resourceCode = aResourceCode;

        this.resourceCodeSetted = true;

        this.setResourceCodeNull(this.resourceCode == null);
    } // end setResourceCode()

    /**
     * Get ResourceCode Has Been Setted
     *
     * @return resourceCode
     */
    final public boolean isResourceCodeSetted() {
        return this.resourceCodeSetted;
    } // end isResourceCodeSetted()

    /**
     * Set ResourceCode Null
     */
    final public void setResourceCodeNull() {
        this.resourceCodeNull = true;
    } // end setResourceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceCodeNull(boolean aNullFlag) {
        this.resourceCodeNull = aNullFlag;
    } // end setResourceCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceCodeNull() {
        return this.resourceCodeNull;
    } // end isResourceCodeNull()

    /**
     * Get ResourceName
     *
     * @return resourceName
     */
    final public String getResourceName() {
        return resourceName;
    } // end getResourceName()

    /**
     * Set ResourceName
     *
     * @param aResourceName
     */
    final public void setResourceName(String aResourceName) {
        this.resourceName = aResourceName;

        this.resourceNameSetted = true;

        this.setResourceNameNull(this.resourceName == null);
    } // end setResourceName()

    /**
     * Get ResourceName Has Been Setted
     *
     * @return resourceName
     */
    final public boolean isResourceNameSetted() {
        return this.resourceNameSetted;
    } // end isResourceNameSetted()

    /**
     * Set ResourceName Null
     */
    final public void setResourceNameNull() {
        this.resourceNameNull = true;
    } // end setResourceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceNameNull(boolean aNullFlag) {
        this.resourceNameNull = aNullFlag;
    } // end setResourceNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceNameNull() {
        return this.resourceNameNull;
    } // end isResourceNameNull()

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
     * Get Sort
     *
     * @return sort
     */
    final public int getSort() {
        return sort;
    } // end getSort()

    /**
     * Set Sort
     *
     * @param aSort
     */
    final public void setSort(int aSort) {
        this.sort = aSort;

        this.sortSetted = true;

        this.setSortNull(false);
    } // end setSort()

    /**
     * Get Sort Has Been Setted
     *
     * @return sort
     */
    final public boolean isSortSetted() {
        return this.sortSetted;
    } // end isSortSetted()

    /**
     * Set Sort Null
     */
    final public void setSortNull() {
        this.sortNull = true;
    } // end setSortNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortNull(boolean aNullFlag) {
        this.sortNull = aNullFlag;
    } // end setSortNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortNull() {
        return this.sortNull;
    } // end isSortNull()

    /**
     * Get ResourceTitleKey
     *
     * @return resourceTitleKey
     */
    final public String getResourceTitleKey() {
        return resourceTitleKey;
    } // end getResourceTitleKey()

    /**
     * Set ResourceTitleKey
     *
     * @param aResourceTitleKey
     */
    final public void setResourceTitleKey(String aResourceTitleKey) {
        this.resourceTitleKey = aResourceTitleKey;

        this.resourceTitleKeySetted = true;

        this.setResourceTitleKeyNull(this.resourceTitleKey == null);
    } // end setResourceTitleKey()

    /**
     * Get ResourceTitleKey Has Been Setted
     *
     * @return resourceTitleKey
     */
    final public boolean isResourceTitleKeySetted() {
        return this.resourceTitleKeySetted;
    } // end isResourceTitleKeySetted()

    /**
     * Set ResourceTitleKey Null
     */
    final public void setResourceTitleKeyNull() {
        this.resourceTitleKeyNull = true;
    } // end setResourceTitleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setResourceTitleKeyNull(boolean aNullFlag) {
        this.resourceTitleKeyNull = aNullFlag;
    } // end setResourceTitleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isResourceTitleKeyNull() {
        return this.resourceTitleKeyNull;
    } // end isResourceTitleKeyNull()

    /**
     * Get DomainTitleKey
     *
     * @return domainTitleKey
     */
    final public String getDomainTitleKey() {
        return domainTitleKey;
    } // end getDomainTitleKey()

    /**
     * Set DomainTitleKey
     *
     * @param aDomainTitleKey
     */
    final public void setDomainTitleKey(String aDomainTitleKey) {
        this.domainTitleKey = aDomainTitleKey;

        this.domainTitleKeySetted = true;

        this.setDomainTitleKeyNull(this.domainTitleKey == null);
    } // end setDomainTitleKey()

    /**
     * Get DomainTitleKey Has Been Setted
     *
     * @return domainTitleKey
     */
    final public boolean isDomainTitleKeySetted() {
        return this.domainTitleKeySetted;
    } // end isDomainTitleKeySetted()

    /**
     * Set DomainTitleKey Null
     */
    final public void setDomainTitleKeyNull() {
        this.domainTitleKeyNull = true;
    } // end setDomainTitleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainTitleKeyNull(boolean aNullFlag) {
        this.domainTitleKeyNull = aNullFlag;
    } // end setDomainTitleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainTitleKeyNull() {
        return this.domainTitleKeyNull;
    } // end isDomainTitleKeyNull()

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

        if ((obj instanceof SysResource) == false) {
            return false;
        } // end if

        SysResource other = (SysResource) obj;

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

        buffer.append("domainId=");
        buffer.append(this.domainId);
        buffer.append("\r\n");

        buffer.append("parentResourceId=");
        buffer.append(this.parentResourceId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("resourceCode=");
        buffer.append(this.resourceCode);
        buffer.append("\r\n");

        buffer.append("resourceName=");
        buffer.append(this.resourceName);
        buffer.append("\r\n");

        buffer.append("resourceTypeId=");
        buffer.append(this.resourceTypeId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sort=");
        buffer.append(this.sort);
        buffer.append("\r\n");

        buffer.append("resourceTitleKey=");
        buffer.append(this.resourceTitleKey);
        buffer.append("\r\n");

        buffer.append("domainTitleKey=");
        buffer.append(this.domainTitleKey);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysResource
