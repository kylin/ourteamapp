/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-03 11:41:13
 *
 * @author Auto Gen
 */
public class BpmProcessCatalog implements java.io.Serializable {
    /**
     * Creates a new BpmProcessCatalog object.
     */
    public BpmProcessCatalog() {
        super();
    } // end BpmProcessCatalog()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private long parentId;

    /** Attribute  Be Seted Falg */
    private boolean parentIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentIdNull = false;

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
    private int orderIndex;

    /** Attribute  Be Seted Falg */
    private boolean orderIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean orderIndexNull = false;

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
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

    /**
     * Get ParentId
     *
     * @return parentId
     */
    final public long getParentId() {
        return parentId;
    } // end getParentId()

    /**
     * Set ParentId
     *
     * @param aParentId
     */
    final public void setParentId(long aParentId) {
        this.parentId = aParentId;

        this.parentIdSetted = true;

        this.setParentIdNull(false);
    } // end setParentId()

    /**
     * Get ParentId Has Been Setted
     *
     * @return parentId
     */
    final public boolean isParentIdSetted() {
        return this.parentIdSetted;
    } // end isParentIdSetted()

    /**
     * Set ParentId Null
     */
    final public void setParentIdNull() {
        this.parentIdNull = true;
    } // end setParentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentIdNull(boolean aNullFlag) {
        this.parentIdNull = aNullFlag;
    } // end setParentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentIdNull() {
        return this.parentIdNull;
    } // end isParentIdNull()

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
     * Get OrderIndex
     *
     * @return orderIndex
     */
    final public int getOrderIndex() {
        return orderIndex;
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    final public void setOrderIndex(int aOrderIndex) {
        this.orderIndex = aOrderIndex;

        this.orderIndexSetted = true;

        this.setOrderIndexNull(false);
    } // end setOrderIndex()

    /**
     * Get OrderIndex Has Been Setted
     *
     * @return orderIndex
     */
    final public boolean isOrderIndexSetted() {
        return this.orderIndexSetted;
    } // end isOrderIndexSetted()

    /**
     * Set OrderIndex Null
     */
    final public void setOrderIndexNull() {
        this.orderIndexNull = true;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOrderIndexNull(boolean aNullFlag) {
        this.orderIndexNull = aNullFlag;
    } // end setOrderIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOrderIndexNull() {
        return this.orderIndexNull;
    } // end isOrderIndexNull()

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

        if ((obj instanceof BpmProcessCatalog) == false) {
            return false;
        } // end if

        BpmProcessCatalog other = (BpmProcessCatalog) obj;

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

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("parentId=");
        buffer.append(this.parentId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("orderIndex=");
        buffer.append(this.orderIndex);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmProcessCatalog
