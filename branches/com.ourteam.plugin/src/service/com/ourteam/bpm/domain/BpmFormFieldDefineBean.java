/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-11 14:41:18
 *
 * @model auto gen
 */
public class BpmFormFieldDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmFormFieldDefine objBpmFormFieldDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.Id);

        mappedDaoFields.put("fieldKey",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.FieldKey);

        mappedDaoFields.put("fieldName",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.FieldName);

        mappedDaoFields.put("fieldType",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.FieldType);

        mappedDaoFields.put("formDefineId",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.FormDefineId);

        mappedDaoFields.put("parentFieldId",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.ParentFieldId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.Remarks);

        mappedDaoFields.put("sortIndex",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmFormFieldDefineDAO.Status);
    } 

    /**
     * Creates a new BpmFormFieldDefineBean object.
     */
    public BpmFormFieldDefineBean() {
        super();

        objBpmFormFieldDefine = new com.ourteam.bpm.dao.BpmFormFieldDefine();
    } // end BpmFormFieldDefineBean()

    /**
     * Creates a new BpmFormFieldDefineBean object.
     *
     * @param aBpmFormFieldDefine DOCUMENT ME!
     */
    public BpmFormFieldDefineBean(
        com.ourteam.bpm.dao.BpmFormFieldDefine aBpmFormFieldDefine) {
        super();

        objBpmFormFieldDefine = aBpmFormFieldDefine;
    } // end BpmFormFieldDefineBean()

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
    public com.ourteam.bpm.dao.BpmFormFieldDefine convertToBpmFormFieldDefine() {
        return objBpmFormFieldDefine;
    } // end convertToBpmFormFieldDefine()

    /**
     * DOCUMENT ME!
     */
    private java.util.List<BpmFormFieldDefineBean> subFormFields;

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmFormFieldDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmFormFieldDefine.setId(aId);
    } // end setId()

    /**
     * Get FieldKey
     *
     * @return fieldKey
     */
    public String getFieldKey() {
        return objBpmFormFieldDefine.getFieldKey();
    } // end getFieldKey()

    /**
     * Set FieldKey
     *
     * @param aFieldKey
     */
    public void setFieldKey(String aFieldKey) {
        this.objBpmFormFieldDefine.setFieldKey(aFieldKey);
    } // end setFieldKey()

    /**
     * Get FieldName
     *
     * @return fieldName
     */
    public String getFieldName() {
        return objBpmFormFieldDefine.getFieldName();
    } // end getFieldName()

    /**
     * Set FieldName
     *
     * @param aFieldName
     */
    public void setFieldName(String aFieldName) {
        this.objBpmFormFieldDefine.setFieldName(aFieldName);
    } // end setFieldName()

    /**
     * Get FieldType
     *
     * @return fieldType
     */
    public String getFieldType() {
        return objBpmFormFieldDefine.getFieldType();
    } // end getFieldType()

    /**
     * Set FieldType
     *
     * @param aFieldType
     */
    public void setFieldType(String aFieldType) {
        this.objBpmFormFieldDefine.setFieldType(aFieldType);
    } // end setFieldType()

    /**
     * Get FormDefineId
     *
     * @return formDefineId
     */
    public long getFormDefineId() {
        return objBpmFormFieldDefine.getFormDefineId();
    } // end getFormDefineId()

    /**
     * Set FormDefineId
     *
     * @param aFormDefineId
     */
    public void setFormDefineId(long aFormDefineId) {
        this.objBpmFormFieldDefine.setFormDefineId(aFormDefineId);
    } // end setFormDefineId()

    /**
     * Get ParentFieldId
     *
     * @return parentFieldId
     */
    public long getParentFieldId() {
        return objBpmFormFieldDefine.getParentFieldId();
    } // end getParentFieldId()

    /**
     * Set ParentFieldId
     *
     * @param aParentFieldId
     */
    public void setParentFieldId(long aParentFieldId) {
        this.objBpmFormFieldDefine.setParentFieldId(aParentFieldId);
    } // end setParentFieldId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmFormFieldDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmFormFieldDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public long getSortIndex() {
        return objBpmFormFieldDefine.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(long aSortIndex) {
        this.objBpmFormFieldDefine.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmFormFieldDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmFormFieldDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SubFormFields
     *
     * @return subFormFields
     */
    public java.util.List<BpmFormFieldDefineBean> getSubFormFields() {
        return subFormFields;
    } // end getSubFormFields()

    /**
     * Set SubFormFields
     *
     * @param aSubFormFields
     */
    public void setSubFormFields(
        java.util.List<BpmFormFieldDefineBean> aSubFormFields) {
        this.subFormFields = aSubFormFields;
    } // end setSubFormFields()

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

        if ((obj instanceof BpmFormFieldDefineBean) == false) {
            return false;
        } // end if

        BpmFormFieldDefineBean other = (BpmFormFieldDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmFormFieldDefine tempBpmFormFieldDefine = other.convertToBpmFormFieldDefine();

        if ((tempBpmFormFieldDefine == null) ||
                (this.objBpmFormFieldDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmFormFieldDefine == this.objBpmFormFieldDefine) ||
                tempBpmFormFieldDefine.equals(this.objBpmFormFieldDefine)) {
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
     * @param aBpmFormFieldDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmFormFieldDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmFormFieldDefine[] aBpmFormFieldDefines) {
        return toArray(aBpmFormFieldDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmFormFieldDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmFormFieldDefine[] aBpmFormFieldDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmFormFieldDefines)) {
            return new BpmFormFieldDefineBean[0];
        } // end if

        int length = aBpmFormFieldDefines.length;

        BpmFormFieldDefineBean[] beans = new BpmFormFieldDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmFormFieldDefineBean(aBpmFormFieldDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmFormFieldDefineBean(aBpmFormFieldDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmFormFieldDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmFormFieldDefineBean
