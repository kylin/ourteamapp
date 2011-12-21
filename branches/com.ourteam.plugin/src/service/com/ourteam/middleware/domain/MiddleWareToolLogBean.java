/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-09 11:55:27
 *
 * @model auto gen
 */
public class MiddleWareToolLogBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareToolLog objMiddleWareToolLog;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.Id);

        mappedDaoFields.put("executeFinishTime",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecuteFinishTime);

        mappedDaoFields.put("executeLog",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecuteLog);

        mappedDaoFields.put("executeResult",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecuteResult);

        mappedDaoFields.put("executeStartTime",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecuteStartTime);

        mappedDaoFields.put("executorId",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecutorId);

        mappedDaoFields.put("middleWareId",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.MiddleWareId);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.Status);

        mappedDaoFields.put("toolId",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ToolId);

        mappedDaoFields.put("executorName",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecutorName);

        mappedDaoFields.put("executeScript",
            com.ourteam.middleware.dao.IMiddleWareToolLogDAO.ExecuteScript);
    } 

    /**
     * Creates a new MiddleWareToolLogBean object.
     */
    public MiddleWareToolLogBean() {
        super();

        objMiddleWareToolLog = new com.ourteam.middleware.dao.MiddleWareToolLog();
    } // end MiddleWareToolLogBean()

    /**
     * Creates a new MiddleWareToolLogBean object.
     *
     * @param aMiddleWareToolLog DOCUMENT ME!
     */
    public MiddleWareToolLogBean(
        com.ourteam.middleware.dao.MiddleWareToolLog aMiddleWareToolLog) {
        super();

        objMiddleWareToolLog = aMiddleWareToolLog;
    } // end MiddleWareToolLogBean()

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
    public com.ourteam.middleware.dao.MiddleWareToolLog convertToMiddleWareToolLog() {
        return objMiddleWareToolLog;
    } // end convertToMiddleWareToolLog()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareToolLog.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareToolLog.setId(aId);
    } // end setId()

    /**
     * Get ExecuteFinishTime
     *
     * @return executeFinishTime
     */
    public java.util.Date getExecuteFinishTime() {
        return objMiddleWareToolLog.getExecuteFinishTime();
    } // end getExecuteFinishTime()

    /**
     * Set ExecuteFinishTime
     *
     * @param aExecuteFinishTime
     */
    public void setExecuteFinishTime(java.util.Date aExecuteFinishTime) {
        this.objMiddleWareToolLog.setExecuteFinishTime(aExecuteFinishTime);
    } // end setExecuteFinishTime()

    /**
     * Get ExecuteLog
     *
     * @return executeLog
     */
    public String getExecuteLog() {
        return objMiddleWareToolLog.getExecuteLog();
    } // end getExecuteLog()

    /**
     * Set ExecuteLog
     *
     * @param aExecuteLog
     */
    public void setExecuteLog(String aExecuteLog) {
        this.objMiddleWareToolLog.setExecuteLog(aExecuteLog);
    } // end setExecuteLog()

    /**
     * Get ExecuteResult
     *
     * @return executeResult
     */
    public String getExecuteResult() {
        return objMiddleWareToolLog.getExecuteResult();
    } // end getExecuteResult()

    /**
     * Set ExecuteResult
     *
     * @param aExecuteResult
     */
    public void setExecuteResult(String aExecuteResult) {
        this.objMiddleWareToolLog.setExecuteResult(aExecuteResult);
    } // end setExecuteResult()

    /**
     * Get ExecuteStartTime
     *
     * @return executeStartTime
     */
    public java.util.Date getExecuteStartTime() {
        return objMiddleWareToolLog.getExecuteStartTime();
    } // end getExecuteStartTime()

    /**
     * Set ExecuteStartTime
     *
     * @param aExecuteStartTime
     */
    public void setExecuteStartTime(java.util.Date aExecuteStartTime) {
        this.objMiddleWareToolLog.setExecuteStartTime(aExecuteStartTime);
    } // end setExecuteStartTime()

    /**
     * Get ExecutorId
     *
     * @return executorId
     */
    public long getExecutorId() {
        return objMiddleWareToolLog.getExecutorId();
    } // end getExecutorId()

    /**
     * Set ExecutorId
     *
     * @param aExecutorId
     */
    public void setExecutorId(long aExecutorId) {
        this.objMiddleWareToolLog.setExecutorId(aExecutorId);
    } // end setExecutorId()

    /**
     * Get MiddleWareId
     *
     * @return middleWareId
     */
    public long getMiddleWareId() {
        return objMiddleWareToolLog.getMiddleWareId();
    } // end getMiddleWareId()

    /**
     * Set MiddleWareId
     *
     * @param aMiddleWareId
     */
    public void setMiddleWareId(long aMiddleWareId) {
        this.objMiddleWareToolLog.setMiddleWareId(aMiddleWareId);
    } // end setMiddleWareId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareToolLog.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareToolLog.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareToolLog.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareToolLog.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ToolId
     *
     * @return toolId
     */
    public long getToolId() {
        return objMiddleWareToolLog.getToolId();
    } // end getToolId()

    /**
     * Set ToolId
     *
     * @param aToolId
     */
    public void setToolId(long aToolId) {
        this.objMiddleWareToolLog.setToolId(aToolId);
    } // end setToolId()

    /**
     * Get ExecutorName
     *
     * @return executorName
     */
    public String getExecutorName() {
        return objMiddleWareToolLog.getExecutorName();
    } // end getExecutorName()

    /**
     * Get ExecuteScript
     *
     * @return executeScript
     */
    public String getExecuteScript() {
        return objMiddleWareToolLog.getExecuteScript();
    } // end getExecuteScript()

    /**
     * Set ExecuteScript
     *
     * @param aExecuteScript
     */
    public void setExecuteScript(String aExecuteScript) {
        this.objMiddleWareToolLog.setExecuteScript(aExecuteScript);
    } // end setExecuteScript()

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

        if ((obj instanceof MiddleWareToolLogBean) == false) {
            return false;
        } // end if

        MiddleWareToolLogBean other = (MiddleWareToolLogBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareToolLog tempMiddleWareToolLog = other.convertToMiddleWareToolLog();

        if ((tempMiddleWareToolLog == null) ||
                (this.objMiddleWareToolLog == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareToolLog == this.objMiddleWareToolLog) ||
                tempMiddleWareToolLog.equals(this.objMiddleWareToolLog)) {
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
     * @param aMiddleWareToolLogs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolLogBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolLog[] aMiddleWareToolLogs) {
        return toArray(aMiddleWareToolLogs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolLogs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolLogBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolLog[] aMiddleWareToolLogs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWareToolLogs)) {
            return new MiddleWareToolLogBean[0];
        } // end if

        int length = aMiddleWareToolLogs.length;

        MiddleWareToolLogBean[] beans = new MiddleWareToolLogBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolLogBean(aMiddleWareToolLogs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolLogBean(aMiddleWareToolLogs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareToolLogs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareToolLogBean
