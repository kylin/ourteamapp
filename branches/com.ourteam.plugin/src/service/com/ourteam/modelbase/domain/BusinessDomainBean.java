/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 业务领域对象 Generate date 2011-09-22 10:22:32
 *
 * @model auto gen
 */
public class BusinessDomainBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessDomain objBusinessDomain;

    static {
        mappedDaoFields.put("businessDomainId",
            com.ourteam.modelbase.dao.IBusinessDomainDAO.BusinessDomainId);

        mappedDaoFields.put("code",
            com.ourteam.modelbase.dao.IBusinessDomainDAO.Code);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IBusinessDomainDAO.Description);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IBusinessDomainDAO.Name);
    } 

    /**
     * Creates a new BusinessDomainBean object.
     */
    public BusinessDomainBean() {
        super();

        objBusinessDomain = new com.ourteam.modelbase.dao.BusinessDomain();
    } // end BusinessDomainBean()

    /**
     * Creates a new BusinessDomainBean object.
     *
     * @param aBusinessDomain DOCUMENT ME!
     */
    public BusinessDomainBean(
        com.ourteam.modelbase.dao.BusinessDomain aBusinessDomain) {
        super();

        objBusinessDomain = aBusinessDomain;
    } // end BusinessDomainBean()

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
    public com.ourteam.modelbase.dao.BusinessDomain convertToBusinessDomain() {
        return objBusinessDomain;
    } // end convertToBusinessDomain()

    /**
     * Get BusinessDomainId
     *
     * @return businessDomainId
     */
    public long getBusinessDomainId() {
        return objBusinessDomain.getBusinessDomainId();
    } // end getBusinessDomainId()

    /**
     * Set BusinessDomainId
     *
     * @param aBusinessDomainId
     */
    public void setBusinessDomainId(long aBusinessDomainId) {
        this.objBusinessDomain.setBusinessDomainId(aBusinessDomainId);
    } // end setBusinessDomainId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objBusinessDomain.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objBusinessDomain.setCode(aCode);
    } // end setCode()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objBusinessDomain.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objBusinessDomain.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBusinessDomain.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBusinessDomain.setName(aName);
    } // end setName()

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

        if ((obj instanceof BusinessDomainBean) == false) {
            return false;
        } // end if

        BusinessDomainBean other = (BusinessDomainBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessDomain tempBusinessDomain = other.convertToBusinessDomain();

        if ((tempBusinessDomain == null) || (this.objBusinessDomain == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessDomain == this.objBusinessDomain) ||
                tempBusinessDomain.equals(this.objBusinessDomain)) {
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
     * @param aBusinessDomains DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessDomainBean[] toArray(
        com.ourteam.modelbase.dao.BusinessDomain[] aBusinessDomains) {
        return toArray(aBusinessDomains, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomains DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessDomainBean[] toArray(
        com.ourteam.modelbase.dao.BusinessDomain[] aBusinessDomains,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBusinessDomains)) {
            return new BusinessDomainBean[0];
        } // end if

        int length = aBusinessDomains.length;

        BusinessDomainBean[] beans = new BusinessDomainBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessDomainBean(aBusinessDomains[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessDomainBean(aBusinessDomains[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessDomains[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessDomainBean
