/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:21:17
 *
 * @model auto gen
 */
public class SystemResource implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysResource objSysResource;

    static {
        mappedDaoFields.put("domainId",
            com.ourteam.system.dao.ISysResourceDAO.DomainId);

        mappedDaoFields.put("id", com.ourteam.system.dao.ISysResourceDAO.Id);

        mappedDaoFields.put("parentId",
            com.ourteam.system.dao.ISysResourceDAO.ParentResourceId);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysResourceDAO.Remarks);

        mappedDaoFields.put("code",
            com.ourteam.system.dao.ISysResourceDAO.ResourceCode);

        mappedDaoFields.put("name",
            com.ourteam.system.dao.ISysResourceDAO.ResourceName);

        mappedDaoFields.put("typeId",
            com.ourteam.system.dao.ISysResourceDAO.ResourceTypeId);

        mappedDaoFields.put("sort", com.ourteam.system.dao.ISysResourceDAO.Sort);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysResourceDAO.Status);

        mappedDaoFields.put("titleKey",
            com.ourteam.system.dao.ISysResourceDAO.ResourceTitleKey);

        mappedDaoFields.put("domainTitleKey",
            com.ourteam.system.dao.ISysResourceDAO.DomainTitleKey);
    } 

    /**
     * Creates a new SystemResource object.
     */
    public SystemResource() {
        super();

        objSysResource = new com.ourteam.system.dao.SysResource();
    } // end SystemResource()

    /**
     * Creates a new SystemResource object.
     *
     * @param aSysResource DOCUMENT ME!
     */
    public SystemResource(com.ourteam.system.dao.SysResource aSysResource) {
        super();

        objSysResource = aSysResource;
    } // end SystemResource()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.SysResource convertToSysResource() {
        return objSysResource;
    } // end convertToSysResource()

    /**
     * DOCUMENT ME!
     */
    private SystemResourceProperty[] properties = new SystemResourceProperty[] {  };

    /**
     * Get DomainId
     *
     * @return domainId
     */
    public long getDomainId() {
        return objSysResource.getDomainId();
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    public void setDomainId(long aDomainId) {
        this.objSysResource.setDomainId(aDomainId);
    } // end setDomainId()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysResource.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysResource.setId(aId);
    } // end setId()

    /**
     * Get ParentId
     *
     * @return parentId
     */
    public long getParentId() {
        return objSysResource.getParentResourceId();
    } // end getParentId()

    /**
     * Set ParentId
     *
     * @param aParentId
     */
    public void setParentId(long aParentId) {
        this.objSysResource.setParentResourceId(aParentId);
    } // end setParentId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysResource.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysResource.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objSysResource.getResourceCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objSysResource.setResourceCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objSysResource.getResourceName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objSysResource.setResourceName(aName);
    } // end setName()

    /**
     * Get TypeId
     *
     * @return typeId
     */
    public Long getTypeId() {
        return Long.valueOf(objSysResource.getResourceTypeId());
    } // end getTypeId()

    /**
     * Set TypeId
     *
     * @param aTypeId
     */
    public void setTypeId(Long aTypeId) {
        if (aTypeId != null) {
            this.objSysResource.setResourceTypeId(((Number) aTypeId).longValue());
        } // end if
    } // end setTypeId()

    /**
     * Get Sort
     *
     * @return sort
     */
    public int getSort() {
        return objSysResource.getSort();
    } // end getSort()

    /**
     * Set Sort
     *
     * @param aSort
     */
    public void setSort(int aSort) {
        this.objSysResource.setSort(aSort);
    } // end setSort()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objSysResource.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysResource.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Properties
     *
     * @return properties
     */
    public SystemResourceProperty[] getProperties() {
        return properties;
    } // end getProperties()

    /**
     * Set Properties
     *
     * @param aProperties
     */
    public void setProperties(SystemResourceProperty[] aProperties) {
        this.properties = aProperties;
    } // end setProperties()

    /**
     * Get TitleKey 标题key
     *
     * @return titleKey
     */
    public String getTitleKey() {
        return objSysResource.getResourceTitleKey();
    } // end getTitleKey()

    /**
     * Set TitleKey 标题key
     *
     * @param aTitleKey
     */
    public void setTitleKey(String aTitleKey) {
        this.objSysResource.setResourceTitleKey(aTitleKey);
    } // end setTitleKey()

    /**
     * Get DomainTitleKey
     *
     * @return domainTitleKey
     */
    public String getDomainTitleKey() {
        return objSysResource.getDomainTitleKey();
    } // end getDomainTitleKey()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
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

        if ((obj instanceof SystemResource) == false) {
            return false;
        } // end if

        SystemResource other = (SystemResource) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysResource tempSysResource = other.convertToSysResource();

        if ((tempSysResource == null) || (this.objSysResource == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysResource == this.objSysResource) ||
                tempSysResource.equals(this.objSysResource)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResources DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemResource[] toArray(
        com.ourteam.system.dao.SysResource[] aSysResources) {
        return toArray(aSysResources, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResources DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SystemResource[] toArray(
        com.ourteam.system.dao.SysResource[] aSysResources,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysResources)) {
            return new SystemResource[0];
        } // end if

        int length = aSysResources.length;

        SystemResource[] beans = new SystemResource[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemResource(aSysResources[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new SystemResource(aSysResources[i]);

                aCallBack.populate(beans[i], new Object[] { aSysResources[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end SystemResource
