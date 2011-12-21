/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 对象关联关系Bean Generate date 2011-09-22 10:22:35
 *
 * @model auto gen
 */
public class ObjectRelationBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.ObjectRelation objObjectRelation;

    static {
        mappedDaoFields.put("objectRelationId",
            com.ourteam.modelbase.dao.IObjectRelationDAO.ObjectRelationId);

        mappedDaoFields.put("description",
            com.ourteam.modelbase.dao.IObjectRelationDAO.Description);

        mappedDaoFields.put("objectId",
            com.ourteam.modelbase.dao.IObjectRelationDAO.ObjectId);

        mappedDaoFields.put("relatedObjectId",
            com.ourteam.modelbase.dao.IObjectRelationDAO.RelatedObjectId);

        mappedDaoFields.put("relateConfig",
            com.ourteam.modelbase.dao.IObjectRelationDAO.RelateConfig);

        mappedDaoFields.put("relateType",
            com.ourteam.modelbase.dao.IObjectRelationDAO.RelateType);

        mappedDaoFields.put("relatedBusinessObjectName",
            com.ourteam.modelbase.dao.IObjectRelationDAO.RelatedBusinessObjectName);

        mappedDaoFields.put("relatedBusinessObjectType",
            com.ourteam.modelbase.dao.IObjectRelationDAO.RelatedBusinessObjectType);

        mappedDaoFields.put("relatedBusinessPackageName",
            com.ourteam.modelbase.dao.IObjectRelationDAO.RelatedBusinessPackageName);
    } 

    /**
     * Creates a new ObjectRelationBean object.
     */
    public ObjectRelationBean() {
        super();

        objObjectRelation = new com.ourteam.modelbase.dao.ObjectRelation();
    } // end ObjectRelationBean()

    /**
     * Creates a new ObjectRelationBean object.
     *
     * @param aObjectRelation DOCUMENT ME!
     */
    public ObjectRelationBean(
        com.ourteam.modelbase.dao.ObjectRelation aObjectRelation) {
        super();

        objObjectRelation = aObjectRelation;
    } // end ObjectRelationBean()

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
    public com.ourteam.modelbase.dao.ObjectRelation convertToObjectRelation() {
        return objObjectRelation;
    } // end convertToObjectRelation()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.domain.ObjectRelationAttrBean[] relationAttrBeans =
        new com.ourteam.modelbase.domain.ObjectRelationAttrBean[] {  };

    /**
     * DOCUMENT ME!
     */
    private String businessObjectName;

    /**
     * DOCUMENT ME!
     */
    private String businessObjectType;

    /**
     * DOCUMENT ME!
     */
    private String businessPackageName;

    /**
     * DOCUMENT ME!
     */
    private long businessPackageId;

    /**
     * Get ObjectRelationId
     *
     * @return objectRelationId
     */
    public long getObjectRelationId() {
        return objObjectRelation.getObjectRelationId();
    } // end getObjectRelationId()

    /**
     * Set ObjectRelationId
     *
     * @param aObjectRelationId
     */
    public void setObjectRelationId(long aObjectRelationId) {
        this.objObjectRelation.setObjectRelationId(aObjectRelationId);
    } // end setObjectRelationId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objObjectRelation.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objObjectRelation.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get ObjectId
     *
     * @return objectId
     */
    public long getObjectId() {
        return objObjectRelation.getObjectId();
    } // end getObjectId()

    /**
     * Set ObjectId
     *
     * @param aObjectId
     */
    public void setObjectId(long aObjectId) {
        this.objObjectRelation.setObjectId(aObjectId);
    } // end setObjectId()

    /**
     * Get RelatedObjectId
     *
     * @return relatedObjectId
     */
    public long getRelatedObjectId() {
        return objObjectRelation.getRelatedObjectId();
    } // end getRelatedObjectId()

    /**
     * Set RelatedObjectId
     *
     * @param aRelatedObjectId
     */
    public void setRelatedObjectId(long aRelatedObjectId) {
        this.objObjectRelation.setRelatedObjectId(aRelatedObjectId);
    } // end setRelatedObjectId()

    /**
     * Get RelateConfig
     *
     * @return relateConfig
     */
    public String getRelateConfig() {
        return objObjectRelation.getRelateConfig();
    } // end getRelateConfig()

    /**
     * Set RelateConfig
     *
     * @param aRelateConfig
     */
    public void setRelateConfig(String aRelateConfig) {
        this.objObjectRelation.setRelateConfig(aRelateConfig);
    } // end setRelateConfig()

    /**
     * Get RelateType
     *
     * @return relateType
     */
    public String getRelateType() {
        return objObjectRelation.getRelateType();
    } // end getRelateType()

    /**
     * Set RelateType
     *
     * @param aRelateType
     */
    public void setRelateType(String aRelateType) {
        this.objObjectRelation.setRelateType(aRelateType);
    } // end setRelateType()

    /**
     * Get RelationAttrBeans
     *
     * @return relationAttrBeans
     */
    public com.ourteam.modelbase.domain.ObjectRelationAttrBean[] getRelationAttrBeans() {
        return relationAttrBeans;
    } // end getRelationAttrBeans()

    /**
     * Set RelationAttrBeans
     *
     * @param aRelationAttrBeans
     */
    public void setRelationAttrBeans(
        com.ourteam.modelbase.domain.ObjectRelationAttrBean[] aRelationAttrBeans) {
        this.relationAttrBeans = aRelationAttrBeans;
    } // end setRelationAttrBeans()

    /**
     * Get RelatedBusinessObjectName
     *
     * @return relatedBusinessObjectName
     */
    public String getRelatedBusinessObjectName() {
        return objObjectRelation.getRelatedBusinessObjectName();
    } // end getRelatedBusinessObjectName()

    /**
     * Get RelatedBusinessObjectType
     *
     * @return relatedBusinessObjectType
     */
    public String getRelatedBusinessObjectType() {
        return objObjectRelation.getRelatedBusinessObjectType();
    } // end getRelatedBusinessObjectType()

    /**
     * Get RelatedBusinessPackageName
     *
     * @return relatedBusinessPackageName
     */
    public String getRelatedBusinessPackageName() {
        return objObjectRelation.getRelatedBusinessPackageName();
    } // end getRelatedBusinessPackageName()

    /**
     * Get BusinessObjectName
     *
     * @return businessObjectName
     */
    public String getBusinessObjectName() {
        return businessObjectName;
    } // end getBusinessObjectName()

    /**
     * Set BusinessObjectName
     *
     * @param aBusinessObjectName
     */
    public void setBusinessObjectName(String aBusinessObjectName) {
        this.businessObjectName = aBusinessObjectName;
    } // end setBusinessObjectName()

    /**
     * Get BusinessObjectType
     *
     * @return businessObjectType
     */
    public String getBusinessObjectType() {
        return businessObjectType;
    } // end getBusinessObjectType()

    /**
     * Set BusinessObjectType
     *
     * @param aBusinessObjectType
     */
    public void setBusinessObjectType(String aBusinessObjectType) {
        this.businessObjectType = aBusinessObjectType;
    } // end setBusinessObjectType()

    /**
     * Get BusinessPackageName
     *
     * @return businessPackageName
     */
    public String getBusinessPackageName() {
        return businessPackageName;
    } // end getBusinessPackageName()

    /**
     * Set BusinessPackageName
     *
     * @param aBusinessPackageName
     */
    public void setBusinessPackageName(String aBusinessPackageName) {
        this.businessPackageName = aBusinessPackageName;
    } // end setBusinessPackageName()

    /**
     * Get BusinessPackageId
     *
     * @return businessPackageId
     */
    public long getBusinessPackageId() {
        return businessPackageId;
    } // end getBusinessPackageId()

    /**
     * Set BusinessPackageId
     *
     * @param aBusinessPackageId
     */
    public void setBusinessPackageId(long aBusinessPackageId) {
        this.businessPackageId = aBusinessPackageId;
    } // end setBusinessPackageId()

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

        if ((obj instanceof ObjectRelationBean) == false) {
            return false;
        } // end if

        ObjectRelationBean other = (ObjectRelationBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.ObjectRelation tempObjectRelation = other.convertToObjectRelation();

        if ((tempObjectRelation == null) || (this.objObjectRelation == null)) {
            isEqual = false;
        } // end if
        else if ((tempObjectRelation == this.objObjectRelation) ||
                tempObjectRelation.equals(this.objObjectRelation)) {
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
     * @param aObjectRelations DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectRelationBean[] toArray(
        com.ourteam.modelbase.dao.ObjectRelation[] aObjectRelations) {
        return toArray(aObjectRelations, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelations DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectRelationBean[] toArray(
        com.ourteam.modelbase.dao.ObjectRelation[] aObjectRelations,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aObjectRelations)) {
            return new ObjectRelationBean[0];
        } // end if

        int length = aObjectRelations.length;

        ObjectRelationBean[] beans = new ObjectRelationBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectRelationBean(aObjectRelations[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectRelationBean(aObjectRelations[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aObjectRelations[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ObjectRelationBean
