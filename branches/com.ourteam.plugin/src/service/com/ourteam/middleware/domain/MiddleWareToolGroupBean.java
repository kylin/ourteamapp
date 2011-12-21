/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-06 17:01:55
 *
 * @model auto gen
 */
public class MiddleWareToolGroupBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareToolGroup objMiddleWareToolGroup;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.Id);

        mappedDaoFields.put("groupName",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.GroupName);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.Remarks);

        mappedDaoFields.put("sortIndex",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.Status);

        mappedDaoFields.put("parentGroupId",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.ParentGroupId);

        mappedDaoFields.put("providerId",
            com.ourteam.middleware.dao.IMiddleWareToolGroupDAO.ProviderId);
    } 

    /**
     * Creates a new MiddleWareToolGroupBean object.
     */
    public MiddleWareToolGroupBean() {
        super();

        objMiddleWareToolGroup = new com.ourteam.middleware.dao.MiddleWareToolGroup();
    } // end MiddleWareToolGroupBean()

    /**
     * Creates a new MiddleWareToolGroupBean object.
     *
     * @param aMiddleWareToolGroup DOCUMENT ME!
     */
    public MiddleWareToolGroupBean(
        com.ourteam.middleware.dao.MiddleWareToolGroup aMiddleWareToolGroup) {
        super();

        objMiddleWareToolGroup = aMiddleWareToolGroup;
    } // end MiddleWareToolGroupBean()

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
    public com.ourteam.middleware.dao.MiddleWareToolGroup convertToMiddleWareToolGroup() {
        return objMiddleWareToolGroup;
    } // end convertToMiddleWareToolGroup()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareToolGroup.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareToolGroup.setId(aId);
    } // end setId()

    /**
     * Get GroupName
     *
     * @return groupName
     */
    public String getGroupName() {
        return objMiddleWareToolGroup.getGroupName();
    } // end getGroupName()

    /**
     * Set GroupName
     *
     * @param aGroupName
     */
    public void setGroupName(String aGroupName) {
        this.objMiddleWareToolGroup.setGroupName(aGroupName);
    } // end setGroupName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareToolGroup.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareToolGroup.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objMiddleWareToolGroup.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(int aSortIndex) {
        this.objMiddleWareToolGroup.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareToolGroup.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareToolGroup.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ParentGroupId
     *
     * @return parentGroupId
     */
    public long getParentGroupId() {
        return objMiddleWareToolGroup.getParentGroupId();
    } // end getParentGroupId()

    /**
     * Set ParentGroupId
     *
     * @param aParentGroupId
     */
    public void setParentGroupId(long aParentGroupId) {
        this.objMiddleWareToolGroup.setParentGroupId(aParentGroupId);
    } // end setParentGroupId()

    /**
     * Get ProviderId
     *
     * @return providerId
     */
    public long getProviderId() {
        return objMiddleWareToolGroup.getProviderId();
    } // end getProviderId()

    /**
     * Set ProviderId
     *
     * @param aProviderId
     */
    public void setProviderId(long aProviderId) {
        this.objMiddleWareToolGroup.setProviderId(aProviderId);
    } // end setProviderId()

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

        if ((obj instanceof MiddleWareToolGroupBean) == false) {
            return false;
        } // end if

        MiddleWareToolGroupBean other = (MiddleWareToolGroupBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareToolGroup tempMiddleWareToolGroup = other.convertToMiddleWareToolGroup();

        if ((tempMiddleWareToolGroup == null) ||
                (this.objMiddleWareToolGroup == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareToolGroup == this.objMiddleWareToolGroup) ||
                tempMiddleWareToolGroup.equals(this.objMiddleWareToolGroup)) {
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
     * @param aMiddleWareToolGroups DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolGroupBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolGroup[] aMiddleWareToolGroups) {
        return toArray(aMiddleWareToolGroups, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolGroups DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolGroupBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolGroup[] aMiddleWareToolGroups,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWareToolGroups)) {
            return new MiddleWareToolGroupBean[0];
        } // end if

        int length = aMiddleWareToolGroups.length;

        MiddleWareToolGroupBean[] beans = new MiddleWareToolGroupBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolGroupBean(aMiddleWareToolGroups[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolGroupBean(aMiddleWareToolGroups[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareToolGroups[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareToolGroupBean
