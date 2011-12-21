/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * Generate Date 2011-12-07 08:45:29
 *
 * @author Auto Gen
 */
public class MiddleWareToolGroup implements java.io.Serializable {
    /**
     * Creates a new MiddleWareToolGroup object.
     */
    public MiddleWareToolGroup() {
        super();
    } // end MiddleWareToolGroup()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String groupName;

    /** Attribute  Be Seted Falg */
    private boolean groupNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean groupNameNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private int sortIndex;

    /** Attribute  Be Seted Falg */
    private boolean sortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortIndexNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long parentGroupId;

    /** Attribute  Be Seted Falg */
    private boolean parentGroupIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentGroupIdNull = false;

    /** Attribute */
    private long providerId;

    /** Attribute  Be Seted Falg */
    private boolean providerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerIdNull = false;

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
     * Get GroupName
     *
     * @return groupName
     */
    final public String getGroupName() {
        return groupName;
    } // end getGroupName()

    /**
     * Set GroupName
     *
     * @param aGroupName
     */
    final public void setGroupName(String aGroupName) {
        this.groupName = aGroupName;

        this.groupNameSetted = true;

        this.setGroupNameNull(this.groupName == null);
    } // end setGroupName()

    /**
     * Get GroupName Has Been Setted
     *
     * @return groupName
     */
    final public boolean isGroupNameSetted() {
        return this.groupNameSetted;
    } // end isGroupNameSetted()

    /**
     * Set GroupName Null
     */
    final public void setGroupNameNull() {
        this.groupNameNull = true;
    } // end setGroupNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setGroupNameNull(boolean aNullFlag) {
        this.groupNameNull = aNullFlag;
    } // end setGroupNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isGroupNameNull() {
        return this.groupNameNull;
    } // end isGroupNameNull()

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
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public int getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(int aSortIndex) {
        this.sortIndex = aSortIndex;

        this.sortIndexSetted = true;

        this.setSortIndexNull(false);
    } // end setSortIndex()

    /**
     * Get SortIndex Has Been Setted
     *
     * @return sortIndex
     */
    final public boolean isSortIndexSetted() {
        return this.sortIndexSetted;
    } // end isSortIndexSetted()

    /**
     * Set SortIndex Null
     */
    final public void setSortIndexNull() {
        this.sortIndexNull = true;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortIndexNull(boolean aNullFlag) {
        this.sortIndexNull = aNullFlag;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortIndexNull() {
        return this.sortIndexNull;
    } // end isSortIndexNull()

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
     * Get ParentGroupId
     *
     * @return parentGroupId
     */
    final public long getParentGroupId() {
        return parentGroupId;
    } // end getParentGroupId()

    /**
     * Set ParentGroupId
     *
     * @param aParentGroupId
     */
    final public void setParentGroupId(long aParentGroupId) {
        this.parentGroupId = aParentGroupId;

        this.parentGroupIdSetted = true;

        this.setParentGroupIdNull(false);
    } // end setParentGroupId()

    /**
     * Get ParentGroupId Has Been Setted
     *
     * @return parentGroupId
     */
    final public boolean isParentGroupIdSetted() {
        return this.parentGroupIdSetted;
    } // end isParentGroupIdSetted()

    /**
     * Set ParentGroupId Null
     */
    final public void setParentGroupIdNull() {
        this.parentGroupIdNull = true;
    } // end setParentGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentGroupIdNull(boolean aNullFlag) {
        this.parentGroupIdNull = aNullFlag;
    } // end setParentGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentGroupIdNull() {
        return this.parentGroupIdNull;
    } // end isParentGroupIdNull()

    /**
     * Get ProviderId
     *
     * @return providerId
     */
    final public long getProviderId() {
        return providerId;
    } // end getProviderId()

    /**
     * Set ProviderId
     *
     * @param aProviderId
     */
    final public void setProviderId(long aProviderId) {
        this.providerId = aProviderId;

        this.providerIdSetted = true;

        this.setProviderIdNull(false);
    } // end setProviderId()

    /**
     * Get ProviderId Has Been Setted
     *
     * @return providerId
     */
    final public boolean isProviderIdSetted() {
        return this.providerIdSetted;
    } // end isProviderIdSetted()

    /**
     * Set ProviderId Null
     */
    final public void setProviderIdNull() {
        this.providerIdNull = true;
    } // end setProviderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderIdNull(boolean aNullFlag) {
        this.providerIdNull = aNullFlag;
    } // end setProviderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderIdNull() {
        return this.providerIdNull;
    } // end isProviderIdNull()

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

        if ((obj instanceof MiddleWareToolGroup) == false) {
            return false;
        } // end if

        MiddleWareToolGroup other = (MiddleWareToolGroup) obj;

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

        buffer.append("groupName=");
        buffer.append(this.groupName);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("parentGroupId=");
        buffer.append(this.parentGroupId);
        buffer.append("\r\n");

        buffer.append("providerId=");
        buffer.append(this.providerId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWareToolGroup
