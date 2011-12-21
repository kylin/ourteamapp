/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-28 15:49:03
 *
 * @model auto gen
 */
public class BpmProcessFormValueBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmProcessFormValue objBpmProcessFormValue;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmProcessFormValueDAO.Id);

        mappedDaoFields.put("doubleValue",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.DoubleValue);

        mappedDaoFields.put("formInstanceId",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.FormInstanceId);

        mappedDaoFields.put("longValue",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.LongValue);

        mappedDaoFields.put("propertyDataType",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.PropertyDataType);

        mappedDaoFields.put("propertyName",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.PropertyName);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.Status);

        mappedDaoFields.put("stringValue",
            com.ourteam.bpm.dao.IBpmProcessFormValueDAO.StringValue);
    } 

    /**
     * Creates a new BpmProcessFormValueBean object.
     */
    public BpmProcessFormValueBean() {
        super();

        objBpmProcessFormValue = new com.ourteam.bpm.dao.BpmProcessFormValue();
    } // end BpmProcessFormValueBean()

    /**
     * Creates a new BpmProcessFormValueBean object.
     *
     * @param aBpmProcessFormValue DOCUMENT ME!
     */
    public BpmProcessFormValueBean(
        com.ourteam.bpm.dao.BpmProcessFormValue aBpmProcessFormValue) {
        super();

        objBpmProcessFormValue = aBpmProcessFormValue;
    } // end BpmProcessFormValueBean()

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
    public com.ourteam.bpm.dao.BpmProcessFormValue convertToBpmProcessFormValue() {
        return objBpmProcessFormValue;
    } // end convertToBpmProcessFormValue()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmProcessFormValue.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmProcessFormValue.setId(aId);
    } // end setId()

    /**
     * Get DoubleValue
     *
     * @return doubleValue
     */
    public java.lang.Double getDoubleValue() {
        return objBpmProcessFormValue.getDoubleValue();
    } // end getDoubleValue()

    /**
     * Set DoubleValue
     *
     * @param aDoubleValue
     */
    public void setDoubleValue(java.lang.Double aDoubleValue) {
        this.objBpmProcessFormValue.setDoubleValue(aDoubleValue);
    } // end setDoubleValue()

    /**
     * Get FormInstanceId
     *
     * @return formInstanceId
     */
    public long getFormInstanceId() {
        return objBpmProcessFormValue.getFormInstanceId();
    } // end getFormInstanceId()

    /**
     * Set FormInstanceId
     *
     * @param aFormInstanceId
     */
    public void setFormInstanceId(long aFormInstanceId) {
        this.objBpmProcessFormValue.setFormInstanceId(aFormInstanceId);
    } // end setFormInstanceId()

    /**
     * Get LongValue
     *
     * @return longValue
     */
    public java.lang.Long getLongValue() {
        return objBpmProcessFormValue.getLongValue();
    } // end getLongValue()

    /**
     * Set LongValue
     *
     * @param aLongValue
     */
    public void setLongValue(java.lang.Long aLongValue) {
        this.objBpmProcessFormValue.setLongValue(aLongValue);
    } // end setLongValue()

    /**
     * Get PropertyDataType
     *
     * @return propertyDataType
     */
    public String getPropertyDataType() {
        return objBpmProcessFormValue.getPropertyDataType();
    } // end getPropertyDataType()

    /**
     * Set PropertyDataType
     *
     * @param aPropertyDataType
     */
    public void setPropertyDataType(String aPropertyDataType) {
        this.objBpmProcessFormValue.setPropertyDataType(aPropertyDataType);
    } // end setPropertyDataType()

    /**
     * Get PropertyName
     *
     * @return propertyName
     */
    public String getPropertyName() {
        return objBpmProcessFormValue.getPropertyName();
    } // end getPropertyName()

    /**
     * Set PropertyName
     *
     * @param aPropertyName
     */
    public void setPropertyName(String aPropertyName) {
        this.objBpmProcessFormValue.setPropertyName(aPropertyName);
    } // end setPropertyName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmProcessFormValue.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmProcessFormValue.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmProcessFormValue.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmProcessFormValue.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get StringValue
     *
     * @return stringValue
     */
    public String getStringValue() {
        return objBpmProcessFormValue.getStringValue();
    } // end getStringValue()

    /**
     * Set StringValue
     *
     * @param aStringValue
     */
    public void setStringValue(String aStringValue) {
        this.objBpmProcessFormValue.setStringValue(aStringValue);
    } // end setStringValue()

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

        if ((obj instanceof BpmProcessFormValueBean) == false) {
            return false;
        } // end if

        BpmProcessFormValueBean other = (BpmProcessFormValueBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmProcessFormValue tempBpmProcessFormValue = other.convertToBpmProcessFormValue();

        if ((tempBpmProcessFormValue == null) ||
                (this.objBpmProcessFormValue == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmProcessFormValue == this.objBpmProcessFormValue) ||
                tempBpmProcessFormValue.equals(this.objBpmProcessFormValue)) {
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
     * @param aBpmProcessFormValues DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessFormValueBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessFormValue[] aBpmProcessFormValues) {
        return toArray(aBpmProcessFormValues, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormValues DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessFormValueBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessFormValue[] aBpmProcessFormValues,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmProcessFormValues)) {
            return new BpmProcessFormValueBean[0];
        } // end if

        int length = aBpmProcessFormValues.length;

        BpmProcessFormValueBean[] beans = new BpmProcessFormValueBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessFormValueBean(aBpmProcessFormValues[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessFormValueBean(aBpmProcessFormValues[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmProcessFormValues[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmProcessFormValueBean
