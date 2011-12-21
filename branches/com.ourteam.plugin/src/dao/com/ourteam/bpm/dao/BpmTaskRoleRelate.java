/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-30 15:28:13
 *
 * @author Auto Gen
 */
public class BpmTaskRoleRelate implements java.io.Serializable {
    /**
     * Creates a new BpmTaskRoleRelate object.
     */
    public BpmTaskRoleRelate() {
        super();
    } // end BpmTaskRoleRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long roleId;

    /** Attribute  Be Seted Falg */
    private boolean roleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean roleIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long taskId;

    /** Attribute  Be Seted Falg */
    private boolean taskIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean taskIdNull = false;

    /** Attribute */
    private long processInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean processInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processInstanceIdNull = false;

    /** Attribute */
    private String taskName;

    /** Attribute  Be Seted Falg */
    private boolean taskNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean taskNameNull = false;

    /** Attribute */
    private String taskSerialNumber;

    /** Attribute  Be Seted Falg */
    private boolean taskSerialNumberSetted = false;

    /** Attribute  is Null Falg */
    private boolean taskSerialNumberNull = false;

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
     * Get RoleId
     *
     * @return roleId
     */
    final public long getRoleId() {
        return roleId;
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    final public void setRoleId(long aRoleId) {
        this.roleId = aRoleId;

        this.roleIdSetted = true;

        this.setRoleIdNull(false);
    } // end setRoleId()

    /**
     * Get RoleId Has Been Setted
     *
     * @return roleId
     */
    final public boolean isRoleIdSetted() {
        return this.roleIdSetted;
    } // end isRoleIdSetted()

    /**
     * Set RoleId Null
     */
    final public void setRoleIdNull() {
        this.roleIdNull = true;
    } // end setRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRoleIdNull(boolean aNullFlag) {
        this.roleIdNull = aNullFlag;
    } // end setRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRoleIdNull() {
        return this.roleIdNull;
    } // end isRoleIdNull()

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
     * Get TaskId
     *
     * @return taskId
     */
    final public long getTaskId() {
        return taskId;
    } // end getTaskId()

    /**
     * Set TaskId
     *
     * @param aTaskId
     */
    final public void setTaskId(long aTaskId) {
        this.taskId = aTaskId;

        this.taskIdSetted = true;

        this.setTaskIdNull(false);
    } // end setTaskId()

    /**
     * Get TaskId Has Been Setted
     *
     * @return taskId
     */
    final public boolean isTaskIdSetted() {
        return this.taskIdSetted;
    } // end isTaskIdSetted()

    /**
     * Set TaskId Null
     */
    final public void setTaskIdNull() {
        this.taskIdNull = true;
    } // end setTaskIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskIdNull(boolean aNullFlag) {
        this.taskIdNull = aNullFlag;
    } // end setTaskIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskIdNull() {
        return this.taskIdNull;
    } // end isTaskIdNull()

    /**
     * Get ProcessInstanceId
     *
     * @return processInstanceId
     */
    final public long getProcessInstanceId() {
        return processInstanceId;
    } // end getProcessInstanceId()

    /**
     * Set ProcessInstanceId
     *
     * @param aProcessInstanceId
     */
    final public void setProcessInstanceId(long aProcessInstanceId) {
        this.processInstanceId = aProcessInstanceId;

        this.processInstanceIdSetted = true;

        this.setProcessInstanceIdNull(false);
    } // end setProcessInstanceId()

    /**
     * Get ProcessInstanceId Has Been Setted
     *
     * @return processInstanceId
     */
    final public boolean isProcessInstanceIdSetted() {
        return this.processInstanceIdSetted;
    } // end isProcessInstanceIdSetted()

    /**
     * Set ProcessInstanceId Null
     */
    final public void setProcessInstanceIdNull() {
        this.processInstanceIdNull = true;
    } // end setProcessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProcessInstanceIdNull(boolean aNullFlag) {
        this.processInstanceIdNull = aNullFlag;
    } // end setProcessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProcessInstanceIdNull() {
        return this.processInstanceIdNull;
    } // end isProcessInstanceIdNull()

    /**
     * Get TaskName
     *
     * @return taskName
     */
    final public String getTaskName() {
        return taskName;
    } // end getTaskName()

    /**
     * Set TaskName
     *
     * @param aTaskName
     */
    final public void setTaskName(String aTaskName) {
        this.taskName = aTaskName;

        this.taskNameSetted = true;

        this.setTaskNameNull(this.taskName == null);
    } // end setTaskName()

    /**
     * Get TaskName Has Been Setted
     *
     * @return taskName
     */
    final public boolean isTaskNameSetted() {
        return this.taskNameSetted;
    } // end isTaskNameSetted()

    /**
     * Set TaskName Null
     */
    final public void setTaskNameNull() {
        this.taskNameNull = true;
    } // end setTaskNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskNameNull(boolean aNullFlag) {
        this.taskNameNull = aNullFlag;
    } // end setTaskNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskNameNull() {
        return this.taskNameNull;
    } // end isTaskNameNull()

    /**
     * Get TaskSerialNumber
     *
     * @return taskSerialNumber
     */
    final public String getTaskSerialNumber() {
        return taskSerialNumber;
    } // end getTaskSerialNumber()

    /**
     * Set TaskSerialNumber
     *
     * @param aTaskSerialNumber
     */
    final public void setTaskSerialNumber(String aTaskSerialNumber) {
        this.taskSerialNumber = aTaskSerialNumber;

        this.taskSerialNumberSetted = true;

        this.setTaskSerialNumberNull(this.taskSerialNumber == null);
    } // end setTaskSerialNumber()

    /**
     * Get TaskSerialNumber Has Been Setted
     *
     * @return taskSerialNumber
     */
    final public boolean isTaskSerialNumberSetted() {
        return this.taskSerialNumberSetted;
    } // end isTaskSerialNumberSetted()

    /**
     * Set TaskSerialNumber Null
     */
    final public void setTaskSerialNumberNull() {
        this.taskSerialNumberNull = true;
    } // end setTaskSerialNumberNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTaskSerialNumberNull(boolean aNullFlag) {
        this.taskSerialNumberNull = aNullFlag;
    } // end setTaskSerialNumberNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTaskSerialNumberNull() {
        return this.taskSerialNumberNull;
    } // end isTaskSerialNumberNull()

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

        if ((obj instanceof BpmTaskRoleRelate) == false) {
            return false;
        } // end if

        BpmTaskRoleRelate other = (BpmTaskRoleRelate) obj;

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

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("roleId=");
        buffer.append(this.roleId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("taskId=");
        buffer.append(this.taskId);
        buffer.append("\r\n");

        buffer.append("processInstanceId=");
        buffer.append(this.processInstanceId);
        buffer.append("\r\n");

        buffer.append("taskName=");
        buffer.append(this.taskName);
        buffer.append("\r\n");

        buffer.append("taskSerialNumber=");
        buffer.append(this.taskSerialNumber);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmTaskRoleRelate
