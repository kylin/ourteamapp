/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-24 14:34:00
 *
 * @model auto gen
 */
public class BpmFormFieldStatusDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmFormFieldStatusDefine objBpmFormFieldStatusDefine;

    static {
        mappedDaoFields.put("id",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.Id);

        mappedDaoFields.put("bpmRoleId",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.BpmRoleId);

        mappedDaoFields.put("fieldDefineId",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.FieldDefineId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.Status);

        mappedDaoFields.put("stepDefineId",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.StepDefineId);

        mappedDaoFields.put("fieldStatus",
            com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO.FieldStatus);
    } 

    /**
     * Creates a new BpmFormFieldStatusDefineBean object.
     */
    public BpmFormFieldStatusDefineBean() {
        super();

        objBpmFormFieldStatusDefine = new com.ourteam.bpm.dao.BpmFormFieldStatusDefine();
    } // end BpmFormFieldStatusDefineBean()

    /**
     * Creates a new BpmFormFieldStatusDefineBean object.
     *
     * @param aBpmFormFieldStatusDefine DOCUMENT ME!
     */
    public BpmFormFieldStatusDefineBean(
        com.ourteam.bpm.dao.BpmFormFieldStatusDefine aBpmFormFieldStatusDefine) {
        super();

        objBpmFormFieldStatusDefine = aBpmFormFieldStatusDefine;
    } // end BpmFormFieldStatusDefineBean()

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
    public com.ourteam.bpm.dao.BpmFormFieldStatusDefine convertToBpmFormFieldStatusDefine() {
        return objBpmFormFieldStatusDefine;
    } // end convertToBpmFormFieldStatusDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmFormFieldStatusDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmFormFieldStatusDefine.setId(aId);
    } // end setId()

    /**
     * Get BpmRoleId
     *
     * @return bpmRoleId
     */
    public long getBpmRoleId() {
        return objBpmFormFieldStatusDefine.getBpmRoleId();
    } // end getBpmRoleId()

    /**
     * Set BpmRoleId
     *
     * @param aBpmRoleId
     */
    public void setBpmRoleId(long aBpmRoleId) {
        this.objBpmFormFieldStatusDefine.setBpmRoleId(aBpmRoleId);
    } // end setBpmRoleId()

    /**
     * Get FieldDefineId
     *
     * @return fieldDefineId
     */
    public long getFieldDefineId() {
        return objBpmFormFieldStatusDefine.getFieldDefineId();
    } // end getFieldDefineId()

    /**
     * Set FieldDefineId
     *
     * @param aFieldDefineId
     */
    public void setFieldDefineId(long aFieldDefineId) {
        this.objBpmFormFieldStatusDefine.setFieldDefineId(aFieldDefineId);
    } // end setFieldDefineId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmFormFieldStatusDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmFormFieldStatusDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmFormFieldStatusDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmFormFieldStatusDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get StepDefineId
     *
     * @return stepDefineId
     */
    public long getStepDefineId() {
        return objBpmFormFieldStatusDefine.getStepDefineId();
    } // end getStepDefineId()

    /**
     * Set StepDefineId
     *
     * @param aStepDefineId
     */
    public void setStepDefineId(long aStepDefineId) {
        this.objBpmFormFieldStatusDefine.setStepDefineId(aStepDefineId);
    } // end setStepDefineId()

    /**
     * Get FieldStatus
     *
     * @return fieldStatus
     */
    public String getFieldStatus() {
        return objBpmFormFieldStatusDefine.getFieldStatus();
    } // end getFieldStatus()

    /**
     * Set FieldStatus
     *
     * @param aFieldStatus
     */
    public void setFieldStatus(String aFieldStatus) {
        this.objBpmFormFieldStatusDefine.setFieldStatus(aFieldStatus);
    } // end setFieldStatus()

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

        if ((obj instanceof BpmFormFieldStatusDefineBean) == false) {
            return false;
        } // end if

        BpmFormFieldStatusDefineBean other = (BpmFormFieldStatusDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmFormFieldStatusDefine tempBpmFormFieldStatusDefine =
            other.convertToBpmFormFieldStatusDefine();

        if ((tempBpmFormFieldStatusDefine == null) ||
                (this.objBpmFormFieldStatusDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmFormFieldStatusDefine == this.objBpmFormFieldStatusDefine) ||
                tempBpmFormFieldStatusDefine.equals(
                    this.objBpmFormFieldStatusDefine)) {
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
     * @param aBpmFormFieldStatusDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmFormFieldStatusDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines) {
        return toArray(aBpmFormFieldStatusDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldStatusDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmFormFieldStatusDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aBpmFormFieldStatusDefines)) {
            return new BpmFormFieldStatusDefineBean[0];
        } // end if

        int length = aBpmFormFieldStatusDefines.length;

        BpmFormFieldStatusDefineBean[] beans = new BpmFormFieldStatusDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmFormFieldStatusDefineBean(aBpmFormFieldStatusDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmFormFieldStatusDefineBean(aBpmFormFieldStatusDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmFormFieldStatusDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmFormFieldStatusDefineBean
