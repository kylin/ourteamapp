/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-09 10:21:45
 *
 * @model auto gen
 */
public class MiddleWareToolInputLogBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareToolInputLog objMiddleWareToolInputLog;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.Status);

        mappedDaoFields.put("toolInputId",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ToolInputId);

        mappedDaoFields.put("toolInputValue",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ToolInputValue);

        mappedDaoFields.put("toolLogId",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ToolLogId);

        mappedDaoFields.put("parameterName",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ParameterName);

        mappedDaoFields.put("parameterCode",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ParameterCode);

        mappedDaoFields.put("parameterType",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ParameterType);

        mappedDaoFields.put("sortIndex",
            com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.SortIndex);
    } 

    /**
     * Creates a new MiddleWareToolInputLogBean object.
     */
    public MiddleWareToolInputLogBean() {
        super();

        objMiddleWareToolInputLog = new com.ourteam.middleware.dao.MiddleWareToolInputLog();
    } // end MiddleWareToolInputLogBean()

    /**
     * Creates a new MiddleWareToolInputLogBean object.
     *
     * @param aMiddleWareToolInputLog DOCUMENT ME!
     */
    public MiddleWareToolInputLogBean(
        com.ourteam.middleware.dao.MiddleWareToolInputLog aMiddleWareToolInputLog) {
        super();

        objMiddleWareToolInputLog = aMiddleWareToolInputLog;
    } // end MiddleWareToolInputLogBean()

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
    public com.ourteam.middleware.dao.MiddleWareToolInputLog convertToMiddleWareToolInputLog() {
        return objMiddleWareToolInputLog;
    } // end convertToMiddleWareToolInputLog()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareToolInputLog.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareToolInputLog.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareToolInputLog.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareToolInputLog.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareToolInputLog.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareToolInputLog.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ToolInputId
     *
     * @return toolInputId
     */
    public long getToolInputId() {
        return objMiddleWareToolInputLog.getToolInputId();
    } // end getToolInputId()

    /**
     * Set ToolInputId
     *
     * @param aToolInputId
     */
    public void setToolInputId(long aToolInputId) {
        this.objMiddleWareToolInputLog.setToolInputId(aToolInputId);
    } // end setToolInputId()

    /**
     * Get ToolInputValue
     *
     * @return toolInputValue
     */
    public String getToolInputValue() {
        return objMiddleWareToolInputLog.getToolInputValue();
    } // end getToolInputValue()

    /**
     * Set ToolInputValue
     *
     * @param aToolInputValue
     */
    public void setToolInputValue(String aToolInputValue) {
        this.objMiddleWareToolInputLog.setToolInputValue(aToolInputValue);
    } // end setToolInputValue()

    /**
     * Get ToolLogId
     *
     * @return toolLogId
     */
    public long getToolLogId() {
        return objMiddleWareToolInputLog.getToolLogId();
    } // end getToolLogId()

    /**
     * Set ToolLogId
     *
     * @param aToolLogId
     */
    public void setToolLogId(long aToolLogId) {
        this.objMiddleWareToolInputLog.setToolLogId(aToolLogId);
    } // end setToolLogId()

    /**
     * Get ParameterName
     *
     * @return parameterName
     */
    public String getParameterName() {
        return objMiddleWareToolInputLog.getParameterName();
    } // end getParameterName()

    /**
     * Get ParameterCode
     *
     * @return parameterCode
     */
    public String getParameterCode() {
        return objMiddleWareToolInputLog.getParameterCode();
    } // end getParameterCode()

    /**
     * Get ParameterType
     *
     * @return parameterType
     */
    public String getParameterType() {
        return objMiddleWareToolInputLog.getParameterType();
    } // end getParameterType()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objMiddleWareToolInputLog.getSortIndex();
    } // end getSortIndex()

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

        if ((obj instanceof MiddleWareToolInputLogBean) == false) {
            return false;
        } // end if

        MiddleWareToolInputLogBean other = (MiddleWareToolInputLogBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareToolInputLog tempMiddleWareToolInputLog =
            other.convertToMiddleWareToolInputLog();

        if ((tempMiddleWareToolInputLog == null) ||
                (this.objMiddleWareToolInputLog == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareToolInputLog == this.objMiddleWareToolInputLog) ||
                tempMiddleWareToolInputLog.equals(
                    this.objMiddleWareToolInputLog)) {
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
     * @param aMiddleWareToolInputLogs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolInputLogBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolInputLog[] aMiddleWareToolInputLogs) {
        return toArray(aMiddleWareToolInputLogs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputLogs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolInputLogBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolInputLog[] aMiddleWareToolInputLogs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWareToolInputLogs)) {
            return new MiddleWareToolInputLogBean[0];
        } // end if

        int length = aMiddleWareToolInputLogs.length;

        MiddleWareToolInputLogBean[] beans = new MiddleWareToolInputLogBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolInputLogBean(aMiddleWareToolInputLogs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolInputLogBean(aMiddleWareToolInputLogs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareToolInputLogs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareToolInputLogBean
