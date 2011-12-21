/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 业务对象 Generate date 2011-09-22 10:22:32
 *
 * @model auto gen
 */
public class BusinessObjectBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessObject objBusinessObject;

    static {
        mappedDaoFields.put("businessObjectId",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.BusinessObjectId);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.Description);

        mappedDaoFields.put("generateOption",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.GenerateOption);

        mappedDaoFields.put("name",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.Name);

        mappedDaoFields.put("packageId",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.PackageId);

        mappedDaoFields.put("state",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.State);

        mappedDaoFields.put("type",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.Type);

        mappedDaoFields.put("packageName",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.PackageName);

        mappedDaoFields.put("domainName",
            com.ourteam.modelbase.dao.IBusinessObjectDAO.DomainName);
    } 

    /**
     * Creates a new BusinessObjectBean object.
     */
    public BusinessObjectBean() {
        super();

        objBusinessObject = new com.ourteam.modelbase.dao.BusinessObject();
    } // end BusinessObjectBean()

    /**
     * Creates a new BusinessObjectBean object.
     *
     * @param aBusinessObject DOCUMENT ME!
     */
    public BusinessObjectBean(
        com.ourteam.modelbase.dao.BusinessObject aBusinessObject) {
        super();

        objBusinessObject = aBusinessObject;
    } // end BusinessObjectBean()

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
    public com.ourteam.modelbase.dao.BusinessObject convertToBusinessObject() {
        return objBusinessObject;
    } // end convertToBusinessObject()

    /**
     * DOCUMENT ME!
     */
    private Boolean valuedEnum;

    /**
     * Get BusinessObjectId
     *
     * @return businessObjectId
     */
    public long getBusinessObjectId() {
        return objBusinessObject.getBusinessObjectId();
    } // end getBusinessObjectId()

    /**
     * Set BusinessObjectId
     *
     * @param aBusinessObjectId
     */
    public void setBusinessObjectId(long aBusinessObjectId) {
        this.objBusinessObject.setBusinessObjectId(aBusinessObjectId);
    } // end setBusinessObjectId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objBusinessObject.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objBusinessObject.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get GenerateOption
     *
     * @return generateOption
     */
    public Long getGenerateOption() {
        return objBusinessObject.getGenerateOption();
    } // end getGenerateOption()

    /**
     * Set GenerateOption
     *
     * @param aGenerateOption
     */
    public void setGenerateOption(Long aGenerateOption) {
        this.objBusinessObject.setGenerateOption(aGenerateOption);
    } // end setGenerateOption()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBusinessObject.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBusinessObject.setName(aName);
    } // end setName()

    /**
     * Get PackageId
     *
     * @return packageId
     */
    public long getPackageId() {
        return objBusinessObject.getPackageId();
    } // end getPackageId()

    /**
     * Set PackageId
     *
     * @param aPackageId
     */
    public void setPackageId(long aPackageId) {
        this.objBusinessObject.setPackageId(aPackageId);
    } // end setPackageId()

    /**
     * Get State
     *
     * @return state
     */
    public String getState() {
        return objBusinessObject.getState();
    } // end getState()

    /**
     * Get Type
     *
     * @return type
     */
    public String getType() {
        return objBusinessObject.getType();
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    public void setType(String aType) {
        this.objBusinessObject.setType(aType);
    } // end setType()

    /**
     * Get ValuedEnum 数值型的枚举对象
     *
     * @return valuedEnum
     */
    public Boolean getValuedEnum() {
        return valuedEnum;
    } // end getValuedEnum()

    /**
     * Set ValuedEnum 数值型的枚举对象
     *
     * @param aValuedEnum
     */
    public void setValuedEnum(Boolean aValuedEnum) {
        this.valuedEnum = aValuedEnum;
    } // end setValuedEnum()

    /**
     * Get PackageName
     *
     * @return packageName
     */
    public String getPackageName() {
        return objBusinessObject.getPackageName();
    } // end getPackageName()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    public String getDomainName() {
        return objBusinessObject.getDomainName();
    } // end getDomainName()

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

        if ((obj instanceof BusinessObjectBean) == false) {
            return false;
        } // end if

        BusinessObjectBean other = (BusinessObjectBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessObject tempBusinessObject = other.convertToBusinessObject();

        if ((tempBusinessObject == null) || (this.objBusinessObject == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessObject == this.objBusinessObject) ||
                tempBusinessObject.equals(this.objBusinessObject)) {
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
     * @param aBusinessObjects DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessObjectBean[] toArray(
        com.ourteam.modelbase.dao.BusinessObject[] aBusinessObjects) {
        return toArray(aBusinessObjects, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjects DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessObjectBean[] toArray(
        com.ourteam.modelbase.dao.BusinessObject[] aBusinessObjects,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBusinessObjects)) {
            return new BusinessObjectBean[0];
        } // end if

        int length = aBusinessObjects.length;

        BusinessObjectBean[] beans = new BusinessObjectBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessObjectBean(aBusinessObjects[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessObjectBean(aBusinessObjects[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessObjects[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessObjectBean
