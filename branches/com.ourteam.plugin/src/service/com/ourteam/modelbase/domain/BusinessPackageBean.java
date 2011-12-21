/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Ä£ÐÍ°ü Generate date 2011-09-22 10:22:33
 *
 * @model auto gen
 */
public class BusinessPackageBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessPackage objBusinessPackage;

    static {
        mappedDaoFields.put("businessPackageId",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.BusinessPackageId);

        mappedDaoFields.put("businessDomainId",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.BusinessDomainId);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.Description);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.Name);

        mappedDaoFields.put("parentPackageId",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.ParentPackageId);

        mappedDaoFields.put("state",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.State);

        mappedDaoFields.put("type",
            com.ourteam.modelbase.dao.IBusinessPackageDAO.Type);
    } 

    /**
     * Creates a new BusinessPackageBean object.
     */
    public BusinessPackageBean() {
        super();

        objBusinessPackage = new com.ourteam.modelbase.dao.BusinessPackage();
    } // end BusinessPackageBean()

    /**
     * Creates a new BusinessPackageBean object.
     *
     * @param aBusinessPackage DOCUMENT ME!
     */
    public BusinessPackageBean(
        com.ourteam.modelbase.dao.BusinessPackage aBusinessPackage) {
        super();

        objBusinessPackage = aBusinessPackage;
    } // end BusinessPackageBean()

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
    public com.ourteam.modelbase.dao.BusinessPackage convertToBusinessPackage() {
        return objBusinessPackage;
    } // end convertToBusinessPackage()

    /**
     * Get BusinessPackageId
     *
     * @return businessPackageId
     */
    public long getBusinessPackageId() {
        return objBusinessPackage.getBusinessPackageId();
    } // end getBusinessPackageId()

    /**
     * Set BusinessPackageId
     *
     * @param aBusinessPackageId
     */
    public void setBusinessPackageId(long aBusinessPackageId) {
        this.objBusinessPackage.setBusinessPackageId(aBusinessPackageId);
    } // end setBusinessPackageId()

    /**
     * Get BusinessDomainId
     *
     * @return businessDomainId
     */
    public long getBusinessDomainId() {
        return objBusinessPackage.getBusinessDomainId();
    } // end getBusinessDomainId()

    /**
     * Set BusinessDomainId
     *
     * @param aBusinessDomainId
     */
    public void setBusinessDomainId(long aBusinessDomainId) {
        this.objBusinessPackage.setBusinessDomainId(aBusinessDomainId);
    } // end setBusinessDomainId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objBusinessPackage.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objBusinessPackage.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBusinessPackage.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBusinessPackage.setName(aName);
    } // end setName()

    /**
     * Get ParentPackageId
     *
     * @return parentPackageId
     */
    public Long getParentPackageId() {
        return objBusinessPackage.getParentPackageId();
    } // end getParentPackageId()

    /**
     * Set ParentPackageId
     *
     * @param aParentPackageId
     */
    public void setParentPackageId(Long aParentPackageId) {
        this.objBusinessPackage.setParentPackageId(aParentPackageId);
    } // end setParentPackageId()

    /**
     * Get State
     *
     * @return state
     */
    public String getState() {
        return objBusinessPackage.getState();
    } // end getState()

    /**
     * Set State
     *
     * @param aState
     */
    public void setState(String aState) {
        this.objBusinessPackage.setState(aState);
    } // end setState()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objBusinessPackage.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objBusinessPackage.setType(aType);
    } // end setType()

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

        if ((obj instanceof BusinessPackageBean) == false) {
            return false;
        } // end if

        BusinessPackageBean other = (BusinessPackageBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessPackage tempBusinessPackage = other.convertToBusinessPackage();

        if ((tempBusinessPackage == null) || (this.objBusinessPackage == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessPackage == this.objBusinessPackage) ||
                tempBusinessPackage.equals(this.objBusinessPackage)) {
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
     * @param aBusinessPackages DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessPackageBean[] toArray(
        com.ourteam.modelbase.dao.BusinessPackage[] aBusinessPackages) {
        return toArray(aBusinessPackages, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessPackages DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessPackageBean[] toArray(
        com.ourteam.modelbase.dao.BusinessPackage[] aBusinessPackages,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBusinessPackages)) {
            return new BusinessPackageBean[0];
        } // end if

        int length = aBusinessPackages.length;

        BusinessPackageBean[] beans = new BusinessPackageBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessPackageBean(aBusinessPackages[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessPackageBean(aBusinessPackages[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessPackages[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessPackageBean
