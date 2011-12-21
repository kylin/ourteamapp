/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-01 11:51:48
 *
 * @model auto gen
 */
public class BpmDomainBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmDomain objBpmDomain;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmDomainDAO.Id);

        mappedDaoFields.put("code", com.ourteam.bpm.dao.IBpmDomainDAO.Code);

        mappedDaoFields.put("name", com.ourteam.bpm.dao.IBpmDomainDAO.Name);

        mappedDaoFields.put("remarks", com.ourteam.bpm.dao.IBpmDomainDAO.Remarks);

        mappedDaoFields.put("status", com.ourteam.bpm.dao.IBpmDomainDAO.Status);
    } 

    /**
     * Creates a new BpmDomainBean object.
     */
    public BpmDomainBean() {
        super();

        objBpmDomain = new com.ourteam.bpm.dao.BpmDomain();
    } // end BpmDomainBean()

    /**
     * Creates a new BpmDomainBean object.
     *
     * @param aBpmDomain DOCUMENT ME!
     */
    public BpmDomainBean(com.ourteam.bpm.dao.BpmDomain aBpmDomain) {
        super();

        objBpmDomain = aBpmDomain;
    } // end BpmDomainBean()

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
    public com.ourteam.bpm.dao.BpmDomain convertToBpmDomain() {
        return objBpmDomain;
    } // end convertToBpmDomain()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmDomain.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmDomain.setId(aId);
    } // end setId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objBpmDomain.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objBpmDomain.setCode(aCode);
    } // end setCode()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBpmDomain.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBpmDomain.setName(aName);
    } // end setName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmDomain.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmDomain.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmDomain.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmDomain.setStatus(aStatus);
    } // end setStatus()

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

        if ((obj instanceof BpmDomainBean) == false) {
            return false;
        } // end if

        BpmDomainBean other = (BpmDomainBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmDomain tempBpmDomain = other.convertToBpmDomain();

        if ((tempBpmDomain == null) || (this.objBpmDomain == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmDomain == this.objBpmDomain) ||
                tempBpmDomain.equals(this.objBpmDomain)) {
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
     * @param aBpmDomains DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmDomainBean[] toArray(
        com.ourteam.bpm.dao.BpmDomain[] aBpmDomains) {
        return toArray(aBpmDomains, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomains DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmDomainBean[] toArray(
        com.ourteam.bpm.dao.BpmDomain[] aBpmDomains,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmDomains)) {
            return new BpmDomainBean[0];
        } // end if

        int length = aBpmDomains.length;

        BpmDomainBean[] beans = new BpmDomainBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmDomainBean(aBpmDomains[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmDomainBean(aBpmDomains[i]);

                aCallBack.populate(beans[i], new Object[] { aBpmDomains[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmDomainBean
