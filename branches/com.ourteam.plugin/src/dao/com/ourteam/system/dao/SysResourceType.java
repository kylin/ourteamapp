/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统资源类型 Generate Date 2011-09-22 10:11:17
 *
 * @author Auto Gen
 */
public class SysResourceType implements java.io.Serializable {
    /**
     * Creates a new SysResourceType object.
     */
    public SysResourceType() {
        super();
    } // end SysResourceType()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String configCode;

    /** Attribute  Be Seted Falg */
    private boolean configCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean configCodeNull = false;

    /** Attribute */
    private String configName;

    /** Attribute  Be Seted Falg */
    private boolean configNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean configNameNull = false;

    /** Attribute */
    private Long domainId;

    /** Attribute  Be Seted Falg */
    private boolean domainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainIdNull = false;

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
    private long resourceTypeId;

    /** Attribute  Be Seted Falg */
    private boolean resourceTypeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean resourceTypeIdNull = false;

    /** Attribute */
    private int sort;

    /** Attribute  Be Seted Falg */
    private boolean sortSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortNull = false;

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
     * Get ConfigCode
     *
     * @return configCode
     */
    final public String getConfigCode() {
        return configCode;
    } // end getConfigCode()

    /**
     * Set ConfigCode
     *
     * @param aConfigCode
     */
    final public void setConfigCode(String aConfigCode) {
        this.configCode = aConfigCode;

        this.configCodeSetted = true;

        this.setConfigCodeNull(this.configCode == null);
    } // end setConfigCode()

    /**
     * Get ConfigCode Has Been Setted
     *
     * @return configCode
     */
    final public boolean isConfigCodeSetted() {
        return this.configCodeSetted;
    } // end isConfigCodeSetted()

    /**
     * Set ConfigCode Null
     */
    final public void setConfigCodeNull() {
        this.configCodeNull = true;
    } // end setConfigCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigCodeNull(boolean aNullFlag) {
        this.configCodeNull = aNullFlag;
    } // end setConfigCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigCodeNull() {
        return this.configCodeNull;
    } // end isConfigCodeNull()

    /**
     * Get ConfigName
     *
     * @return configName
     */
    final public String getConfigName() {
        return configName;
    } // end getConfigName()

    /**
     * Set ConfigName
     *
     * @param aConfigName
     */
    final public void setConfigName(String aConfigName) {
        this.configName = aConfigName;

        this.configNameSetted = true;

        this.setConfigNameNull(this.configName == null);
    } // end setConfigName()

    /**
     * Get ConfigName Has Been Setted
     *
     * @return configName
     */
    final public boolean isConfigNameSetted() {
        return this.configNameSetted;
    } // end isConfigNameSetted()

    /**
     * Set ConfigName Null
     */
    final public void setConfigNameNull() {
        this.configNameNull = true;
    } // end setConfigNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setConfigNameNull(boolean aNullFlag) {
        this.configNameNull = aNullFlag;
    } // end setConfigNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isConfigNameNull() {
        return this.configNameNull;
    } // end isConfigNameNull()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    final public Long getDomainId() {
        return domainId;
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    final public void setDomainId(Long aDomainId) {
        this.domainId = aDomainId;

        this.domainIdSetted = true;

        this.setDomainIdNull(this.domainId == null);
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

        if ((obj instanceof SysResourceType) == false) {
            return false;
        } // end if

        SysResourceType other = (SysResourceType) obj;

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

        buffer.append("configCode=");
        buffer.append(this.configCode);
        buffer.append("\r\n");

        buffer.append("configName=");
        buffer.append(this.configName);
        buffer.append("\r\n");

        buffer.append("domainId=");
        buffer.append(this.domainId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("resourceTypeId=");
        buffer.append(this.resourceTypeId);
        buffer.append("\r\n");

        buffer.append("sort=");
        buffer.append(this.sort);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysResourceType
