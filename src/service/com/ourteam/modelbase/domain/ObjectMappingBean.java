/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ∂‘œÛ”≥…‰Bean Generate date 2011-09-22 10:22:33
 *
 * @model auto gen
 */
public class ObjectMappingBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.ObjectMapping objObjectMapping;

    static {
        mappedDaoFields.put("objectMappingId",
            com.ourteam.modelbase.dao.IObjectMappingDAO.ObjectMappingId);

        mappedDaoFields.put("businessObjectId",
            com.ourteam.modelbase.dao.IObjectMappingDAO.BusinessObjectId);

        mappedDaoFields.put("persistentObjectId",
            com.ourteam.modelbase.dao.IObjectMappingDAO.PersistentObjectId);

        mappedDaoFields.put("state",
            com.ourteam.modelbase.dao.IObjectMappingDAO.State);
    } 

    /**
     * Creates a new ObjectMappingBean object.
     */
    public ObjectMappingBean() {
        super();

        objObjectMapping = new com.ourteam.modelbase.dao.ObjectMapping();
    } // end ObjectMappingBean()

    /**
     * Creates a new ObjectMappingBean object.
     *
     * @param aObjectMapping DOCUMENT ME!
     */
    public ObjectMappingBean(
        com.ourteam.modelbase.dao.ObjectMapping aObjectMapping) {
        super();

        objObjectMapping = aObjectMapping;
    } // end ObjectMappingBean()

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
    public com.ourteam.modelbase.dao.ObjectMapping convertToObjectMapping() {
        return objObjectMapping;
    } // end convertToObjectMapping()

    /**
     * Get ObjectMappingId
     *
     * @return objectMappingId
     */
    public long getObjectMappingId() {
        return objObjectMapping.getObjectMappingId();
    } // end getObjectMappingId()

    /**
     * Set ObjectMappingId
     *
     * @param aObjectMappingId
     */
    public void setObjectMappingId(long aObjectMappingId) {
        this.objObjectMapping.setObjectMappingId(aObjectMappingId);
    } // end setObjectMappingId()

    /**
     * Get BusinessObjectId
     *
     * @return businessObjectId
     */
    public long getBusinessObjectId() {
        return objObjectMapping.getBusinessObjectId();
    } // end getBusinessObjectId()

    /**
     * Set BusinessObjectId
     *
     * @param aBusinessObjectId
     */
    public void setBusinessObjectId(long aBusinessObjectId) {
        this.objObjectMapping.setBusinessObjectId(aBusinessObjectId);
    } // end setBusinessObjectId()

    /**
     * Get PersistentObjectId
     *
     * @return persistentObjectId
     */
    public long getPersistentObjectId() {
        return objObjectMapping.getPersistentObjectId();
    } // end getPersistentObjectId()

    /**
     * Set PersistentObjectId
     *
     * @param aPersistentObjectId
     */
    public void setPersistentObjectId(long aPersistentObjectId) {
        this.objObjectMapping.setPersistentObjectId(aPersistentObjectId);
    } // end setPersistentObjectId()

    /**
     * Get State
     *
     * @return state
     */
    public String getState() {
        return objObjectMapping.getState();
    } // end getState()

    /**
     * Set State
     *
     * @param aState
     */
    public void setState(String aState) {
        this.objObjectMapping.setState(aState);
    } // end setState()

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

        if ((obj instanceof ObjectMappingBean) == false) {
            return false;
        } // end if

        ObjectMappingBean other = (ObjectMappingBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.ObjectMapping tempObjectMapping = other.convertToObjectMapping();

        if ((tempObjectMapping == null) || (this.objObjectMapping == null)) {
            isEqual = false;
        } // end if
        else if ((tempObjectMapping == this.objObjectMapping) ||
                tempObjectMapping.equals(this.objObjectMapping)) {
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
     * @param aObjectMappings DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectMappingBean[] toArray(
        com.ourteam.modelbase.dao.ObjectMapping[] aObjectMappings) {
        return toArray(aObjectMappings, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectMappings DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ObjectMappingBean[] toArray(
        com.ourteam.modelbase.dao.ObjectMapping[] aObjectMappings,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aObjectMappings)) {
            return new ObjectMappingBean[0];
        } // end if

        int length = aObjectMappings.length;

        ObjectMappingBean[] beans = new ObjectMappingBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectMappingBean(aObjectMappings[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ObjectMappingBean(aObjectMappings[i]);

                aCallBack.populate(beans[i], new Object[] { aObjectMappings[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ObjectMappingBean
