/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-16 11:48:13
 *
 * @model auto gen
 */
public class BpmTaskRoleRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmTaskRoleRelate objBpmTaskRoleRelate;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO.Remarks);

        mappedDaoFields.put("roleId",
            com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO.RoleId);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO.Status);

        mappedDaoFields.put("taskId",
            com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO.TaskId);
    } 

    /**
     * Creates a new BpmTaskRoleRelateBean object.
     */
    public BpmTaskRoleRelateBean() {
        super();

        objBpmTaskRoleRelate = new com.ourteam.bpm.dao.BpmTaskRoleRelate();
    } // end BpmTaskRoleRelateBean()

    /**
     * Creates a new BpmTaskRoleRelateBean object.
     *
     * @param aBpmTaskRoleRelate DOCUMENT ME!
     */
    public BpmTaskRoleRelateBean(
        com.ourteam.bpm.dao.BpmTaskRoleRelate aBpmTaskRoleRelate) {
        super();

        objBpmTaskRoleRelate = aBpmTaskRoleRelate;
    } // end BpmTaskRoleRelateBean()

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
    public com.ourteam.bpm.dao.BpmTaskRoleRelate convertToBpmTaskRoleRelate() {
        return objBpmTaskRoleRelate;
    } // end convertToBpmTaskRoleRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmTaskRoleRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmTaskRoleRelate.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmTaskRoleRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmTaskRoleRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RoleId
     *
     * @return roleId
     */
    public long getRoleId() {
        return objBpmTaskRoleRelate.getRoleId();
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    public void setRoleId(long aRoleId) {
        this.objBpmTaskRoleRelate.setRoleId(aRoleId);
    } // end setRoleId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmTaskRoleRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmTaskRoleRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TaskId
     *
     * @return taskId
     */
    public long getTaskId() {
        return objBpmTaskRoleRelate.getTaskId();
    } // end getTaskId()

    /**
     * Set TaskId
     *
     * @param aTaskId
     */
    public void setTaskId(long aTaskId) {
        this.objBpmTaskRoleRelate.setTaskId(aTaskId);
    } // end setTaskId()

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

        if ((obj instanceof BpmTaskRoleRelateBean) == false) {
            return false;
        } // end if

        BpmTaskRoleRelateBean other = (BpmTaskRoleRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmTaskRoleRelate tempBpmTaskRoleRelate = other.convertToBpmTaskRoleRelate();

        if ((tempBpmTaskRoleRelate == null) ||
                (this.objBpmTaskRoleRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmTaskRoleRelate == this.objBpmTaskRoleRelate) ||
                tempBpmTaskRoleRelate.equals(this.objBpmTaskRoleRelate)) {
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
     * @param aBpmTaskRoleRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmTaskRoleRelateBean[] toArray(
        com.ourteam.bpm.dao.BpmTaskRoleRelate[] aBpmTaskRoleRelates) {
        return toArray(aBpmTaskRoleRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTaskRoleRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmTaskRoleRelateBean[] toArray(
        com.ourteam.bpm.dao.BpmTaskRoleRelate[] aBpmTaskRoleRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmTaskRoleRelates)) {
            return new BpmTaskRoleRelateBean[0];
        } // end if

        int length = aBpmTaskRoleRelates.length;

        BpmTaskRoleRelateBean[] beans = new BpmTaskRoleRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmTaskRoleRelateBean(aBpmTaskRoleRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmTaskRoleRelateBean(aBpmTaskRoleRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmTaskRoleRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmTaskRoleRelateBean
