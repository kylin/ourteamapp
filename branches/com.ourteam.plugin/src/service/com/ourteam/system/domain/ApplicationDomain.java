/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 应用域 Generate date 2011-11-29 09:10:32
 *
 * @model auto gen
 */
public class ApplicationDomain implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.SysDomain objSysDomain;

    static {
        mappedDaoFields.put("id", com.ourteam.system.dao.ISysDomainDAO.Id);

        mappedDaoFields.put("code",
            com.ourteam.system.dao.ISysDomainDAO.DomainCode);

        mappedDaoFields.put("name",
            com.ourteam.system.dao.ISysDomainDAO.DomainName);

        mappedDaoFields.put("title",
            com.ourteam.system.dao.ISysDomainDAO.DomainTitelKey);

        mappedDaoFields.put("icon",
            com.ourteam.system.dao.ISysDomainDAO.DomainIcon);

        mappedDaoFields.put("sort",
            com.ourteam.system.dao.ISysDomainDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.system.dao.ISysDomainDAO.Status);

        mappedDaoFields.put("remarks",
            com.ourteam.system.dao.ISysDomainDAO.Remarks);

        mappedDaoFields.put("shortName",
            com.ourteam.system.dao.ISysDomainDAO.DomainShortName);

        mappedDaoFields.put("smallIcon",
            com.ourteam.system.dao.ISysDomainDAO.DomainSmallIcon);
    } 

    /**
     * Creates a new ApplicationDomain object.
     */
    public ApplicationDomain() {
        super();

        objSysDomain = new com.ourteam.system.dao.SysDomain();
    } // end ApplicationDomain()

    /**
     * Creates a new ApplicationDomain object.
     *
     * @param aSysDomain DOCUMENT ME!
     */
    public ApplicationDomain(com.ourteam.system.dao.SysDomain aSysDomain) {
        super();

        objSysDomain = aSysDomain;
    } // end ApplicationDomain()

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
    public com.ourteam.system.dao.SysDomain convertToSysDomain() {
        return objSysDomain;
    } // end convertToSysDomain()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objSysDomain.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objSysDomain.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objSysDomain.getDomainCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objSysDomain.setDomainCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objSysDomain.getDomainName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objSysDomain.setDomainName(aName);
    } // end setName()

    /**
     * Get Title
     *
     * @return title
     */
    public String getTitle() {
        return objSysDomain.getDomainTitelKey();
    } // end getTitle()

    /**
     * Set Title
     *
     * @param aTitle
     */
    public void setTitle(String aTitle) {
        this.objSysDomain.setDomainTitelKey(aTitle);
    } // end setTitle()

    /**
     * Get Icon
     *
     * @return icon
     */
    public String getIcon() {
        return objSysDomain.getDomainIcon();
    } // end getIcon()

    /**
     * Set Icon
     *
     * @param aIcon
     */
    public void setIcon(String aIcon) {
        this.objSysDomain.setDomainIcon(aIcon);
    } // end setIcon()

    /**
     * Get Sort 排序
     *
     * @return sort
     */
    public int getSort() {
        if (objSysDomain.getSortIndex() != null) {
            return ((Number) objSysDomain.getSortIndex()).intValue();
        } // end if
        else {
            return 0;
        } // end else
    } // end getSort()

    /**
     * Set Sort 排序
     *
     * @param aSort
     */
    public void setSort(int aSort) {
        this.objSysDomain.setSortIndex(Integer.valueOf(aSort));
    } // end setSort()

    /**
     * Get Status 状态
     *
     * @return status
     */
    public String getStatus() {
        return objSysDomain.getStatus();
    } // end getStatus()

    /**
     * Set Status 状态
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objSysDomain.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get Remarks 备注说明
     *
     * @return remarks
     */
    public String getRemarks() {
        return objSysDomain.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks 备注说明
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objSysDomain.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ShortName
     *
     * @return shortName
     */
    public String getShortName() {
        return objSysDomain.getDomainShortName();
    } // end getShortName()

    /**
     * Set ShortName
     *
     * @param aShortName
     */
    public void setShortName(String aShortName) {
        this.objSysDomain.setDomainShortName(aShortName);
    } // end setShortName()

    /**
     * Get SmallIcon
     *
     * @return smallIcon
     */
    public String getSmallIcon() {
        return objSysDomain.getDomainSmallIcon();
    } // end getSmallIcon()

    /**
     * Set SmallIcon
     *
     * @param aSmallIcon
     */
    public void setSmallIcon(String aSmallIcon) {
        this.objSysDomain.setDomainSmallIcon(aSmallIcon);
    } // end setSmallIcon()

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

        if ((obj instanceof ApplicationDomain) == false) {
            return false;
        } // end if

        ApplicationDomain other = (ApplicationDomain) obj;

        boolean isEqual = false;

        com.ourteam.system.dao.SysDomain tempSysDomain = other.convertToSysDomain();

        if ((tempSysDomain == null) || (this.objSysDomain == null)) {
            isEqual = false;
        } // end if
        else if ((tempSysDomain == this.objSysDomain) ||
                tempSysDomain.equals(this.objSysDomain)) {
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
     * @param aSysDomains DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ApplicationDomain[] toArray(
        com.ourteam.system.dao.SysDomain[] aSysDomains) {
        return toArray(aSysDomains, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aSysDomains DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ApplicationDomain[] toArray(
        com.ourteam.system.dao.SysDomain[] aSysDomains,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aSysDomains)) {
            return new ApplicationDomain[0];
        } // end if

        int length = aSysDomains.length;

        ApplicationDomain[] beans = new ApplicationDomain[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ApplicationDomain(aSysDomains[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ApplicationDomain(aSysDomains[i]);

                aCallBack.populate(beans[i], new Object[] { aSysDomains[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ApplicationDomain
