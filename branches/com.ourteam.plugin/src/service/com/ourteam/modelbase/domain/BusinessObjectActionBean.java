/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:32
 *
 * @model auto gen
 */
public class BusinessObjectActionBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessObjectAction objBusinessObjectAction;

    static {
        mappedDaoFields.put("objectActionId",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.ObjectActionId);

        mappedDaoFields.put("action",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.Action);

        mappedDaoFields.put("objectId",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.ObjectId);

        mappedDaoFields.put("propertyId",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyId);

        mappedDaoFields.put("propertyValue",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyValue);

        mappedDaoFields.put("propertyDataSize",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyDataSize);

        mappedDaoFields.put("propertyDataType",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyDataType);

        mappedDaoFields.put("propertyDefaultValue",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyDefaultValue);

        mappedDaoFields.put("propertyDescription",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyDescription);

        mappedDaoFields.put("propertyIsEnum",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyIsEnum);

        mappedDaoFields.put("propertyIsGenerate",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyIsGenerate);

        mappedDaoFields.put("propertyIsPrimaryProperty",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyIsPrimaryProperty);

        mappedDaoFields.put("propertyKind",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyKind);

        mappedDaoFields.put("propertyName",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyName);

        mappedDaoFields.put("propertyOrderIndex",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyOrderIndex);

        mappedDaoFields.put("propertyState",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyState);

        mappedDaoFields.put("propertyType",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.PropertyType);

        mappedDaoFields.put("operation",
            com.ourteam.modelbase.dao.IBusinessObjectActionDAO.Operation);
    } 

    /**
     * Creates a new BusinessObjectActionBean object.
     */
    public BusinessObjectActionBean() {
        super();

        objBusinessObjectAction = new com.ourteam.modelbase.dao.BusinessObjectAction();
    } // end BusinessObjectActionBean()

    /**
     * Creates a new BusinessObjectActionBean object.
     *
     * @param aBusinessObjectAction DOCUMENT ME!
     */
    public BusinessObjectActionBean(
        com.ourteam.modelbase.dao.BusinessObjectAction aBusinessObjectAction) {
        super();

        objBusinessObjectAction = aBusinessObjectAction;
    } // end BusinessObjectActionBean()

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
    public com.ourteam.modelbase.dao.BusinessObjectAction convertToBusinessObjectAction() {
        return objBusinessObjectAction;
    } // end convertToBusinessObjectAction()

    /**
     * Get ObjectActionId
     *
     * @return objectActionId
     */
    public long getObjectActionId() {
        return objBusinessObjectAction.getObjectActionId();
    } // end getObjectActionId()

    /**
     * Set ObjectActionId
     *
     * @param aObjectActionId
     */
    public void setObjectActionId(long aObjectActionId) {
        this.objBusinessObjectAction.setObjectActionId(aObjectActionId);
    } // end setObjectActionId()

    /**
     * Get Action
     *
     * @return action
     */
    public String getAction() {
        return objBusinessObjectAction.getAction();
    } // end getAction()

    /**
     * Set Action
     *
     * @param aAction
     */
    public void setAction(String aAction) {
        this.objBusinessObjectAction.setAction(aAction);
    } // end setAction()

    /**
     * Get ObjectId
     *
     * @return objectId
     */
    public long getObjectId() {
        return objBusinessObjectAction.getObjectId();
    } // end getObjectId()

    /**
     * Set ObjectId
     *
     * @param aObjectId
     */
    public void setObjectId(long aObjectId) {
        this.objBusinessObjectAction.setObjectId(aObjectId);
    } // end setObjectId()

    /**
     * Get PropertyId
     *
     * @return propertyId
     */
    public long getPropertyId() {
        return objBusinessObjectAction.getPropertyId();
    } // end getPropertyId()

    /**
     * Set PropertyId
     *
     * @param aPropertyId
     */
    public void setPropertyId(long aPropertyId) {
        this.objBusinessObjectAction.setPropertyId(aPropertyId);
    } // end setPropertyId()

    /**
     * Get PropertyValue
     *
     * @return propertyValue
     */
    public String getPropertyValue() {
        return objBusinessObjectAction.getPropertyValue();
    } // end getPropertyValue()

    /**
     * Set PropertyValue
     *
     * @param aPropertyValue
     */
    public void setPropertyValue(String aPropertyValue) {
        this.objBusinessObjectAction.setPropertyValue(aPropertyValue);
    } // end setPropertyValue()

    /**
     * Get PropertyDataSize
     *
     * @return propertyDataSize
     */
    public Integer getPropertyDataSize() {
        return objBusinessObjectAction.getPropertyDataSize();
    } // end getPropertyDataSize()

    /**
     * Get PropertyDataType
     *
     * @return propertyDataType
     */
    public String getPropertyDataType() {
        return objBusinessObjectAction.getPropertyDataType();
    } // end getPropertyDataType()

    /**
     * Get PropertyDefaultValue
     *
     * @return propertyDefaultValue
     */
    public String getPropertyDefaultValue() {
        return objBusinessObjectAction.getPropertyDefaultValue();
    } // end getPropertyDefaultValue()

    /**
     * Get PropertyDescription
     *
     * @return propertyDescription
     */
    public String getPropertyDescription() {
        return objBusinessObjectAction.getPropertyDescription();
    } // end getPropertyDescription()

    /**
     * Get PropertyIsEnum
     *
     * @return propertyIsEnum
     */
    public String getPropertyIsEnum() {
        return objBusinessObjectAction.getPropertyIsEnum();
    } // end getPropertyIsEnum()

    /**
     * Get PropertyIsGenerate
     *
     * @return propertyIsGenerate
     */
    public String getPropertyIsGenerate() {
        return objBusinessObjectAction.getPropertyIsGenerate();
    } // end getPropertyIsGenerate()

    /**
     * Get PropertyIsPrimaryProperty
     *
     * @return propertyIsPrimaryProperty
     */
    public String getPropertyIsPrimaryProperty() {
        return objBusinessObjectAction.getPropertyIsPrimaryProperty();
    } // end getPropertyIsPrimaryProperty()

    /**
     * Get PropertyKind
     *
     * @return propertyKind
     */
    public String getPropertyKind() {
        return objBusinessObjectAction.getPropertyKind();
    } // end getPropertyKind()

    /**
     * Get PropertyName
     *
     * @return propertyName
     */
    public String getPropertyName() {
        return objBusinessObjectAction.getPropertyName();
    } // end getPropertyName()

    /**
     * Get PropertyOrderIndex
     *
     * @return propertyOrderIndex
     */
    public Integer getPropertyOrderIndex() {
        return objBusinessObjectAction.getPropertyOrderIndex();
    } // end getPropertyOrderIndex()

    /**
     * Get PropertyState
     *
     * @return propertyState
     */
    public String getPropertyState() {
        return objBusinessObjectAction.getPropertyState();
    } // end getPropertyState()

    /**
     * Get PropertyType
     *
     * @return propertyType
     */
    public String getPropertyType() {
        return objBusinessObjectAction.getPropertyType();
    } // end getPropertyType()

    /**
     * Get Operation
     *
     * @return operation
     */
    public String getOperation() {
        return objBusinessObjectAction.getOperation();
    } // end getOperation()

    /**
     * Set Operation
     *
     * @param aOperation
     */
    public void setOperation(String aOperation) {
        this.objBusinessObjectAction.setOperation(aOperation);
    } // end setOperation()

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

        if ((obj instanceof BusinessObjectActionBean) == false) {
            return false;
        } // end if

        BusinessObjectActionBean other = (BusinessObjectActionBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessObjectAction tempBusinessObjectAction = other.convertToBusinessObjectAction();

        if ((tempBusinessObjectAction == null) ||
                (this.objBusinessObjectAction == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessObjectAction == this.objBusinessObjectAction) ||
                tempBusinessObjectAction.equals(this.objBusinessObjectAction)) {
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
     * @param aBusinessObjectActions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessObjectActionBean[] toArray(
        com.ourteam.modelbase.dao.BusinessObjectAction[] aBusinessObjectActions) {
        return toArray(aBusinessObjectActions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjectActions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessObjectActionBean[] toArray(
        com.ourteam.modelbase.dao.BusinessObjectAction[] aBusinessObjectActions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBusinessObjectActions)) {
            return new BusinessObjectActionBean[0];
        } // end if

        int length = aBusinessObjectActions.length;

        BusinessObjectActionBean[] beans = new BusinessObjectActionBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessObjectActionBean(aBusinessObjectActions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessObjectActionBean(aBusinessObjectActions[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessObjectActions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessObjectActionBean
