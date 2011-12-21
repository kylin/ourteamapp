/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * Generate Date 2011-12-09 11:52:52
 *
 * @author Auto Gen
 */
public class MiddleWareToolLog implements java.io.Serializable {
    /**
     * Creates a new MiddleWareToolLog object.
     */
    public MiddleWareToolLog() {
        super();
    } // end MiddleWareToolLog()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date executeFinishTime;

    /** Attribute  Be Seted Falg */
    private boolean executeFinishTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean executeFinishTimeNull = false;

    /** Attribute */
    private String executeLog;

    /** Attribute  Be Seted Falg */
    private boolean executeLogSetted = false;

    /** Attribute  is Null Falg */
    private boolean executeLogNull = false;

    /** Attribute */
    private String executeResult;

    /** Attribute  Be Seted Falg */
    private boolean executeResultSetted = false;

    /** Attribute  is Null Falg */
    private boolean executeResultNull = false;

    /** Attribute */
    private java.util.Date executeStartTime;

    /** Attribute  Be Seted Falg */
    private boolean executeStartTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean executeStartTimeNull = false;

    /** Attribute */
    private long executorId;

    /** Attribute  Be Seted Falg */
    private boolean executorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean executorIdNull = false;

    /** Attribute */
    private long middleWareId;

    /** Attribute  Be Seted Falg */
    private boolean middleWareIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareIdNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long toolId;

    /** Attribute  Be Seted Falg */
    private boolean toolIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolIdNull = false;

    /** Attribute */
    private String executorName;

    /** Attribute  Be Seted Falg */
    private boolean executorNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean executorNameNull = false;

    /** Attribute */
    private String executeScript;

    /** Attribute  Be Seted Falg */
    private boolean executeScriptSetted = false;

    /** Attribute  is Null Falg */
    private boolean executeScriptNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get ExecuteFinishTime
     *
     * @return executeFinishTime
     */
    final public java.util.Date getExecuteFinishTime() {
        return executeFinishTime;
    } // end getExecuteFinishTime()

    /**
     * Set ExecuteFinishTime
     *
     * @param aExecuteFinishTime
     */
    final public void setExecuteFinishTime(java.util.Date aExecuteFinishTime) {
        this.executeFinishTime = aExecuteFinishTime;

        this.executeFinishTimeSetted = true;

        this.setExecuteFinishTimeNull(this.executeFinishTime == null);
    } // end setExecuteFinishTime()

    /**
     * Get ExecuteFinishTime Has Been Setted
     *
     * @return executeFinishTime
     */
    final public boolean isExecuteFinishTimeSetted() {
        return this.executeFinishTimeSetted;
    } // end isExecuteFinishTimeSetted()

    /**
     * Set ExecuteFinishTime Null
     */
    final public void setExecuteFinishTimeNull() {
        this.executeFinishTimeNull = true;
    } // end setExecuteFinishTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecuteFinishTimeNull(boolean aNullFlag) {
        this.executeFinishTimeNull = aNullFlag;
    } // end setExecuteFinishTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecuteFinishTimeNull() {
        return this.executeFinishTimeNull;
    } // end isExecuteFinishTimeNull()

    /**
     * Get ExecuteLog
     *
     * @return executeLog
     */
    final public String getExecuteLog() {
        if (isExecuteLogNull()) {
            return null;
        } // end if
        else {
            return executeLog;
        } // end else
    } // end getExecuteLog()

    /**
     * Set ExecuteLog
     *
     * @param aExecuteLog
     */
    final public void setExecuteLog(String aExecuteLog) {
        this.executeLog = aExecuteLog;

        this.executeLogSetted = true;

        this.setExecuteLogNull(this.executeLog == null);
    } // end setExecuteLog()

    /**
     * Get ExecuteLog Has Been Setted
     *
     * @return executeLog
     */
    final public boolean isExecuteLogSetted() {
        return this.executeLogSetted;
    } // end isExecuteLogSetted()

    /**
     * Set ExecuteLog Null
     */
    final public void setExecuteLogNull() {
        this.executeLogNull = true;
    } // end setExecuteLogNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecuteLogNull(boolean aNullFlag) {
        this.executeLogNull = aNullFlag;
    } // end setExecuteLogNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecuteLogNull() {
        return this.executeLogNull;
    } // end isExecuteLogNull()

    /**
     * Get ExecuteResult
     *
     * @return executeResult
     */
    final public String getExecuteResult() {
        return executeResult;
    } // end getExecuteResult()

    /**
     * Set ExecuteResult
     *
     * @param aExecuteResult
     */
    final public void setExecuteResult(String aExecuteResult) {
        this.executeResult = aExecuteResult;

        this.executeResultSetted = true;

        this.setExecuteResultNull(this.executeResult == null);
    } // end setExecuteResult()

    /**
     * Get ExecuteResult Has Been Setted
     *
     * @return executeResult
     */
    final public boolean isExecuteResultSetted() {
        return this.executeResultSetted;
    } // end isExecuteResultSetted()

    /**
     * Set ExecuteResult Null
     */
    final public void setExecuteResultNull() {
        this.executeResultNull = true;
    } // end setExecuteResultNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecuteResultNull(boolean aNullFlag) {
        this.executeResultNull = aNullFlag;
    } // end setExecuteResultNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecuteResultNull() {
        return this.executeResultNull;
    } // end isExecuteResultNull()

    /**
     * Get ExecuteStartTime
     *
     * @return executeStartTime
     */
    final public java.util.Date getExecuteStartTime() {
        return executeStartTime;
    } // end getExecuteStartTime()

    /**
     * Set ExecuteStartTime
     *
     * @param aExecuteStartTime
     */
    final public void setExecuteStartTime(java.util.Date aExecuteStartTime) {
        this.executeStartTime = aExecuteStartTime;

        this.executeStartTimeSetted = true;

        this.setExecuteStartTimeNull(this.executeStartTime == null);
    } // end setExecuteStartTime()

    /**
     * Get ExecuteStartTime Has Been Setted
     *
     * @return executeStartTime
     */
    final public boolean isExecuteStartTimeSetted() {
        return this.executeStartTimeSetted;
    } // end isExecuteStartTimeSetted()

    /**
     * Set ExecuteStartTime Null
     */
    final public void setExecuteStartTimeNull() {
        this.executeStartTimeNull = true;
    } // end setExecuteStartTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecuteStartTimeNull(boolean aNullFlag) {
        this.executeStartTimeNull = aNullFlag;
    } // end setExecuteStartTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecuteStartTimeNull() {
        return this.executeStartTimeNull;
    } // end isExecuteStartTimeNull()

    /**
     * Get ExecutorId
     *
     * @return executorId
     */
    final public long getExecutorId() {
        return executorId;
    } // end getExecutorId()

    /**
     * Set ExecutorId
     *
     * @param aExecutorId
     */
    final public void setExecutorId(long aExecutorId) {
        this.executorId = aExecutorId;

        this.executorIdSetted = true;

        this.setExecutorIdNull(false);
    } // end setExecutorId()

    /**
     * Get ExecutorId Has Been Setted
     *
     * @return executorId
     */
    final public boolean isExecutorIdSetted() {
        return this.executorIdSetted;
    } // end isExecutorIdSetted()

    /**
     * Set ExecutorId Null
     */
    final public void setExecutorIdNull() {
        this.executorIdNull = true;
    } // end setExecutorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecutorIdNull(boolean aNullFlag) {
        this.executorIdNull = aNullFlag;
    } // end setExecutorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecutorIdNull() {
        return this.executorIdNull;
    } // end isExecutorIdNull()

    /**
     * Get MiddleWareId
     *
     * @return middleWareId
     */
    final public long getMiddleWareId() {
        return middleWareId;
    } // end getMiddleWareId()

    /**
     * Set MiddleWareId
     *
     * @param aMiddleWareId
     */
    final public void setMiddleWareId(long aMiddleWareId) {
        this.middleWareId = aMiddleWareId;

        this.middleWareIdSetted = true;

        this.setMiddleWareIdNull(false);
    } // end setMiddleWareId()

    /**
     * Get MiddleWareId Has Been Setted
     *
     * @return middleWareId
     */
    final public boolean isMiddleWareIdSetted() {
        return this.middleWareIdSetted;
    } // end isMiddleWareIdSetted()

    /**
     * Set MiddleWareId Null
     */
    final public void setMiddleWareIdNull() {
        this.middleWareIdNull = true;
    } // end setMiddleWareIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareIdNull(boolean aNullFlag) {
        this.middleWareIdNull = aNullFlag;
    } // end setMiddleWareIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareIdNull() {
        return this.middleWareIdNull;
    } // end isMiddleWareIdNull()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * Get ToolId
     *
     * @return toolId
     */
    final public long getToolId() {
        return toolId;
    } // end getToolId()

    /**
     * Set ToolId
     *
     * @param aToolId
     */
    final public void setToolId(long aToolId) {
        this.toolId = aToolId;

        this.toolIdSetted = true;

        this.setToolIdNull(false);
    } // end setToolId()

    /**
     * Get ToolId Has Been Setted
     *
     * @return toolId
     */
    final public boolean isToolIdSetted() {
        return this.toolIdSetted;
    } // end isToolIdSetted()

    /**
     * Set ToolId Null
     */
    final public void setToolIdNull() {
        this.toolIdNull = true;
    } // end setToolIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolIdNull(boolean aNullFlag) {
        this.toolIdNull = aNullFlag;
    } // end setToolIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolIdNull() {
        return this.toolIdNull;
    } // end isToolIdNull()

    /**
     * Get ExecutorName
     *
     * @return executorName
     */
    final public String getExecutorName() {
        return executorName;
    } // end getExecutorName()

    /**
     * Set ExecutorName
     *
     * @param aExecutorName
     */
    final public void setExecutorName(String aExecutorName) {
        this.executorName = aExecutorName;

        this.executorNameSetted = true;

        this.setExecutorNameNull(this.executorName == null);
    } // end setExecutorName()

    /**
     * Get ExecutorName Has Been Setted
     *
     * @return executorName
     */
    final public boolean isExecutorNameSetted() {
        return this.executorNameSetted;
    } // end isExecutorNameSetted()

    /**
     * Set ExecutorName Null
     */
    final public void setExecutorNameNull() {
        this.executorNameNull = true;
    } // end setExecutorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecutorNameNull(boolean aNullFlag) {
        this.executorNameNull = aNullFlag;
    } // end setExecutorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecutorNameNull() {
        return this.executorNameNull;
    } // end isExecutorNameNull()

    /**
     * Get ExecuteScript
     *
     * @return executeScript
     */
    final public String getExecuteScript() {
        if (isExecuteScriptNull()) {
            return null;
        } // end if
        else {
            return executeScript;
        } // end else
    } // end getExecuteScript()

    /**
     * Set ExecuteScript
     *
     * @param aExecuteScript
     */
    final public void setExecuteScript(String aExecuteScript) {
        this.executeScript = aExecuteScript;

        this.executeScriptSetted = true;

        this.setExecuteScriptNull(this.executeScript == null);
    } // end setExecuteScript()

    /**
     * Get ExecuteScript Has Been Setted
     *
     * @return executeScript
     */
    final public boolean isExecuteScriptSetted() {
        return this.executeScriptSetted;
    } // end isExecuteScriptSetted()

    /**
     * Set ExecuteScript Null
     */
    final public void setExecuteScriptNull() {
        this.executeScriptNull = true;
    } // end setExecuteScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setExecuteScriptNull(boolean aNullFlag) {
        this.executeScriptNull = aNullFlag;
    } // end setExecuteScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isExecuteScriptNull() {
        return this.executeScriptNull;
    } // end isExecuteScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

        return result;
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

        if ((obj instanceof MiddleWareToolLog) == false) {
            return false;
        } // end if

        MiddleWareToolLog other = (MiddleWareToolLog) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("executeFinishTime=");
        buffer.append(this.executeFinishTime);
        buffer.append("\r\n");

        buffer.append("executeLog=");
        buffer.append(this.executeLog);
        buffer.append("\r\n");

        buffer.append("executeResult=");
        buffer.append(this.executeResult);
        buffer.append("\r\n");

        buffer.append("executeStartTime=");
        buffer.append(this.executeStartTime);
        buffer.append("\r\n");

        buffer.append("executorId=");
        buffer.append(this.executorId);
        buffer.append("\r\n");

        buffer.append("middleWareId=");
        buffer.append(this.middleWareId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("toolId=");
        buffer.append(this.toolId);
        buffer.append("\r\n");

        buffer.append("executorName=");
        buffer.append(this.executorName);
        buffer.append("\r\n");

        buffer.append("executeScript=");
        buffer.append(this.executeScript);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWareToolLog
