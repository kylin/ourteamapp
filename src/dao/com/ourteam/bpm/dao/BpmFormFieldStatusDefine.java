/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-01 13:19:52
 *
 * @author Auto Gen
 */
public class BpmFormFieldStatusDefine implements java.io.Serializable {
    /**
     * Creates a new BpmFormFieldStatusDefine object.
     */
    public BpmFormFieldStatusDefine() {
        super();
    } // end BpmFormFieldStatusDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long bpmRoleId;

    /** Attribute  Be Seted Falg */
    private boolean bpmRoleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmRoleIdNull = false;

    /** Attribute */
    private long fieldDefineId;

    /** Attribute  Be Seted Falg */
    private boolean fieldDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldDefineIdNull = false;

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
    private long stepDefineId;

    /** Attribute  Be Seted Falg */
    private boolean stepDefineIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean stepDefineIdNull = false;

    /** Attribute */
    private String fieldStatus;

    /** Attribute  Be Seted Falg */
    private boolean fieldStatusSetted = false;

    /** Attribute  is Null Falg */
    private boolean fieldStatusNull = false;

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
     * Get BpmRoleId
     *
     * @return bpmRoleId
     */
    final public long getBpmRoleId() {
        return bpmRoleId;
    } // end getBpmRoleId()

    /**
     * Set BpmRoleId
     *
     * @param aBpmRoleId
     */
    final public void setBpmRoleId(long aBpmRoleId) {
        this.bpmRoleId = aBpmRoleId;

        this.bpmRoleIdSetted = true;

        this.setBpmRoleIdNull(false);
    } // end setBpmRoleId()

    /**
     * Get BpmRoleId Has Been Setted
     *
     * @return bpmRoleId
     */
    final public boolean isBpmRoleIdSetted() {
        return this.bpmRoleIdSetted;
    } // end isBpmRoleIdSetted()

    /**
     * Set BpmRoleId Null
     */
    final public void setBpmRoleIdNull() {
        this.bpmRoleIdNull = true;
    } // end setBpmRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmRoleIdNull(boolean aNullFlag) {
        this.bpmRoleIdNull = aNullFlag;
    } // end setBpmRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmRoleIdNull() {
        return this.bpmRoleIdNull;
    } // end isBpmRoleIdNull()

    /**
     * Get FieldDefineId
     *
     * @return fieldDefineId
     */
    final public long getFieldDefineId() {
        return fieldDefineId;
    } // end getFieldDefineId()

    /**
     * Set FieldDefineId
     *
     * @param aFieldDefineId
     */
    final public void setFieldDefineId(long aFieldDefineId) {
        this.fieldDefineId = aFieldDefineId;

        this.fieldDefineIdSetted = true;

        this.setFieldDefineIdNull(false);
    } // end setFieldDefineId()

    /**
     * Get FieldDefineId Has Been Setted
     *
     * @return fieldDefineId
     */
    final public boolean isFieldDefineIdSetted() {
        return this.fieldDefineIdSetted;
    } // end isFieldDefineIdSetted()

    /**
     * Set FieldDefineId Null
     */
    final public void setFieldDefineIdNull() {
        this.fieldDefineIdNull = true;
    } // end setFieldDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldDefineIdNull(boolean aNullFlag) {
        this.fieldDefineIdNull = aNullFlag;
    } // end setFieldDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldDefineIdNull() {
        return this.fieldDefineIdNull;
    } // end isFieldDefineIdNull()

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
     * Get StepDefineId
     *
     * @return stepDefineId
     */
    final public long getStepDefineId() {
        return stepDefineId;
    } // end getStepDefineId()

    /**
     * Set StepDefineId
     *
     * @param aStepDefineId
     */
    final public void setStepDefineId(long aStepDefineId) {
        this.stepDefineId = aStepDefineId;

        this.stepDefineIdSetted = true;

        this.setStepDefineIdNull(false);
    } // end setStepDefineId()

    /**
     * Get StepDefineId Has Been Setted
     *
     * @return stepDefineId
     */
    final public boolean isStepDefineIdSetted() {
        return this.stepDefineIdSetted;
    } // end isStepDefineIdSetted()

    /**
     * Set StepDefineId Null
     */
    final public void setStepDefineIdNull() {
        this.stepDefineIdNull = true;
    } // end setStepDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStepDefineIdNull(boolean aNullFlag) {
        this.stepDefineIdNull = aNullFlag;
    } // end setStepDefineIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStepDefineIdNull() {
        return this.stepDefineIdNull;
    } // end isStepDefineIdNull()

    /**
     * Get FieldStatus
     *
     * @return fieldStatus
     */
    final public String getFieldStatus() {
        return fieldStatus;
    } // end getFieldStatus()

    /**
     * Set FieldStatus
     *
     * @param aFieldStatus
     */
    final public void setFieldStatus(String aFieldStatus) {
        this.fieldStatus = aFieldStatus;

        this.fieldStatusSetted = true;

        this.setFieldStatusNull(this.fieldStatus == null);
    } // end setFieldStatus()

    /**
     * Get FieldStatus Has Been Setted
     *
     * @return fieldStatus
     */
    final public boolean isFieldStatusSetted() {
        return this.fieldStatusSetted;
    } // end isFieldStatusSetted()

    /**
     * Set FieldStatus Null
     */
    final public void setFieldStatusNull() {
        this.fieldStatusNull = true;
    } // end setFieldStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFieldStatusNull(boolean aNullFlag) {
        this.fieldStatusNull = aNullFlag;
    } // end setFieldStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFieldStatusNull() {
        return this.fieldStatusNull;
    } // end isFieldStatusNull()

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

        if ((obj instanceof BpmFormFieldStatusDefine) == false) {
            return false;
        } // end if

        BpmFormFieldStatusDefine other = (BpmFormFieldStatusDefine) obj;

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

        buffer.append("bpmRoleId=");
        buffer.append(this.bpmRoleId);
        buffer.append("\r\n");

        buffer.append("fieldDefineId=");
        buffer.append(this.fieldDefineId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("stepDefineId=");
        buffer.append(this.stepDefineId);
        buffer.append("\r\n");

        buffer.append("fieldStatus=");
        buffer.append(this.fieldStatus);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmFormFieldStatusDefine
