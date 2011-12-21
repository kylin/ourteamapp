/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-28 15:45:01
 *
 * @author Auto Gen
 */
public class BpmProcessFormInstance implements java.io.Serializable {
    /**
     * Creates a new BpmProcessFormInstance object.
     */
    public BpmProcessFormInstance() {
        super();
    } // end BpmProcessFormInstance()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String formKey;

    /** Attribute  Be Seted Falg */
    private boolean formKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean formKeyNull = false;

    /** Attribute */
    private String formXml;

    /** Attribute  Be Seted Falg */
    private boolean formXmlSetted = false;

    /** Attribute  is Null Falg */
    private boolean formXmlNull = false;

    /** Attribute */
    private long processInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean processInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean processInstanceIdNull = false;

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
    private long taskId;

    /** Attribute  Be Seted Falg */
    private boolean taskIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean taskIdNull = false;

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
     * Get FormKey
     *
     * @return formKey
     */
    final public String getFormKey() {
        return formKey;
    } // end getFormKey()

    /**
     * Set FormKey
     *
     * @param aFormKey
     */
    final public void setFormKey(String aFormKey) {
        this.formKey = aFormKey;

        this.formKeySetted = true;

        this.setFormKeyNull(this.formKey == null);
    } // end setFormKey()

    /**
     * Get FormKey Has Been Setted
     *
     * @return formKey
     */
    final public boolean isFormKeySetted() {
        return this.formKeySetted;
    } // end isFormKeySetted()

    /**
     * Set FormKey Null
     */
    final public void setFormKeyNull() {
        this.formKeyNull = true;
    } // end setFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormKeyNull(boolean aNullFlag) {
        this.formKeyNull = aNullFlag;
    } // end setFormKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormKeyNull() {
        return this.formKeyNull;
    } // end isFormKeyNull()

    /**
     * Get FormXml
     *
     * @return formXml
     */
    final public String getFormXml() {
        if (isFormXmlNull()) {
            return null;
        } // end if
        else {
            return formXml;
        } // end else
    } // end getFormXml()

    /**
     * Set FormXml
     *
     * @param aFormXml
     */
    final public void setFormXml(String aFormXml) {
        this.formXml = aFormXml;

        this.formXmlSetted = true;

        this.setFormXmlNull(this.formXml == null);
    } // end setFormXml()

    /**
     * Get FormXml Has Been Setted
     *
     * @return formXml
     */
    final public boolean isFormXmlSetted() {
        return this.formXmlSetted;
    } // end isFormXmlSetted()

    /**
     * Set FormXml Null
     */
    final public void setFormXmlNull() {
        this.formXmlNull = true;
    } // end setFormXmlNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFormXmlNull(boolean aNullFlag) {
        this.formXmlNull = aNullFlag;
    } // end setFormXmlNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFormXmlNull() {
        return this.formXmlNull;
    } // end isFormXmlNull()

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

        if ((obj instanceof BpmProcessFormInstance) == false) {
            return false;
        } // end if

        BpmProcessFormInstance other = (BpmProcessFormInstance) obj;

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

        buffer.append("formKey=");
        buffer.append(this.formKey);
        buffer.append("\r\n");

        buffer.append("formXml=");
        buffer.append(this.formXml);
        buffer.append("\r\n");

        buffer.append("processInstanceId=");
        buffer.append(this.processInstanceId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("taskId=");
        buffer.append(this.taskId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmProcessFormInstance
