/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-28 15:47:33
 *
 * @model auto gen
 */
public class BpmProcessFormInstanceBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmProcessFormInstance objBpmProcessFormInstance;

    static {
        mappedDaoFields.put("id",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.Id);

        mappedDaoFields.put("formKey",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.FormKey);

        mappedDaoFields.put("formXml",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.FormXml);

        mappedDaoFields.put("processInstanceId",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.ProcessInstanceId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.Status);

        mappedDaoFields.put("taskId",
            com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO.TaskId);
    } 

    /**
     * Creates a new BpmProcessFormInstanceBean object.
     */
    public BpmProcessFormInstanceBean() {
        super();

        objBpmProcessFormInstance = new com.ourteam.bpm.dao.BpmProcessFormInstance();
    } // end BpmProcessFormInstanceBean()

    /**
     * Creates a new BpmProcessFormInstanceBean object.
     *
     * @param aBpmProcessFormInstance DOCUMENT ME!
     */
    public BpmProcessFormInstanceBean(
        com.ourteam.bpm.dao.BpmProcessFormInstance aBpmProcessFormInstance) {
        super();

        objBpmProcessFormInstance = aBpmProcessFormInstance;
    } // end BpmProcessFormInstanceBean()

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
    public com.ourteam.bpm.dao.BpmProcessFormInstance convertToBpmProcessFormInstance() {
        return objBpmProcessFormInstance;
    } // end convertToBpmProcessFormInstance()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmProcessFormInstance.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmProcessFormInstance.setId(aId);
    } // end setId()

    /**
     * Get FormKey
     *
     * @return formKey
     */
    public String getFormKey() {
        return objBpmProcessFormInstance.getFormKey();
    } // end getFormKey()

    /**
     * Set FormKey
     *
     * @param aFormKey
     */
    public void setFormKey(String aFormKey) {
        this.objBpmProcessFormInstance.setFormKey(aFormKey);
    } // end setFormKey()

    /**
     * Get FormXml
     *
     * @return formXml
     */
    public String getFormXml() {
        return objBpmProcessFormInstance.getFormXml();
    } // end getFormXml()

    /**
     * Set FormXml
     *
     * @param aFormXml
     */
    public void setFormXml(String aFormXml) {
        this.objBpmProcessFormInstance.setFormXml(aFormXml);
    } // end setFormXml()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    public long getProcessInstanceId() {
        return objBpmProcessFormInstance.getProcessInstanceId();
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    public void setProcessInstanceId(long aProcessInstanceId) {
        this.objBpmProcessFormInstance.setProcessInstanceId(aProcessInstanceId);
    } // end setProcessInstanceId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmProcessFormInstance.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmProcessFormInstance.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmProcessFormInstance.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmProcessFormInstance.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TaskId
     *
     * @return taskId
     */
    public long getTaskId() {
        return objBpmProcessFormInstance.getTaskId();
    } // end getTaskId()

    /**
     * Set TaskId
     *
     * @param aTaskId
     */
    public void setTaskId(long aTaskId) {
        this.objBpmProcessFormInstance.setTaskId(aTaskId);
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

        if ((obj instanceof BpmProcessFormInstanceBean) == false) {
            return false;
        } // end if

        BpmProcessFormInstanceBean other = (BpmProcessFormInstanceBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmProcessFormInstance tempBpmProcessFormInstance = other.convertToBpmProcessFormInstance();

        if ((tempBpmProcessFormInstance == null) ||
                (this.objBpmProcessFormInstance == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmProcessFormInstance == this.objBpmProcessFormInstance) ||
                tempBpmProcessFormInstance.equals(
                    this.objBpmProcessFormInstance)) {
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
     * @param aBpmProcessFormInstances DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessFormInstanceBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessFormInstance[] aBpmProcessFormInstances) {
        return toArray(aBpmProcessFormInstances, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormInstances DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessFormInstanceBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessFormInstance[] aBpmProcessFormInstances,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmProcessFormInstances)) {
            return new BpmProcessFormInstanceBean[0];
        } // end if

        int length = aBpmProcessFormInstances.length;

        BpmProcessFormInstanceBean[] beans = new BpmProcessFormInstanceBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessFormInstanceBean(aBpmProcessFormInstances[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessFormInstanceBean(aBpmProcessFormInstances[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmProcessFormInstances[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmProcessFormInstanceBean
