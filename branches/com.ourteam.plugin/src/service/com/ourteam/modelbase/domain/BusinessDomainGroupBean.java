/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:32
 *
 * @model auto gen
 */
public class BusinessDomainGroupBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessDomainGroup objBusinessDomainGroup;

    static {
        mappedDaoFields.put("id",
            com.ourteam.modelbase.dao.IBusinessDomainGroupDAO.Id);

        mappedDaoFields.put("groupName",
            com.ourteam.modelbase.dao.IBusinessDomainGroupDAO.GroupName);

        mappedDaoFields.put("remarks",
            com.ourteam.modelbase.dao.IBusinessDomainGroupDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.modelbase.dao.IBusinessDomainGroupDAO.Status);
    } 

    /**
     * Creates a new BusinessDomainGroupBean object.
     */
    public BusinessDomainGroupBean() {
        super();

        objBusinessDomainGroup = new com.ourteam.modelbase.dao.BusinessDomainGroup();
    } // end BusinessDomainGroupBean()

    /**
     * Creates a new BusinessDomainGroupBean object.
     *
     * @param aBusinessDomainGroup DOCUMENT ME!
     */
    public BusinessDomainGroupBean(
        com.ourteam.modelbase.dao.BusinessDomainGroup aBusinessDomainGroup) {
        super();

        objBusinessDomainGroup = aBusinessDomainGroup;
    } // end BusinessDomainGroupBean()

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
    public com.ourteam.modelbase.dao.BusinessDomainGroup convertToBusinessDomainGroup() {
        return objBusinessDomainGroup;
    } // end convertToBusinessDomainGroup()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBusinessDomainGroup.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBusinessDomainGroup.setId(aId);
    } // end setId()

    /**
     * Get GroupName
     *
     * @return groupName
     */
    public String getGroupName() {
        return objBusinessDomainGroup.getGroupName();
    } // end getGroupName()

    /**
     * Set GroupName
     *
     * @param aGroupName
     */
    public void setGroupName(String aGroupName) {
        this.objBusinessDomainGroup.setGroupName(aGroupName);
    } // end setGroupName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBusinessDomainGroup.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBusinessDomainGroup.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBusinessDomainGroup.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBusinessDomainGroup.setStatus(aStatus);
    } // end setStatus()

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

        if ((obj instanceof BusinessDomainGroupBean) == false) {
            return false;
        } // end if

        BusinessDomainGroupBean other = (BusinessDomainGroupBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessDomainGroup tempBusinessDomainGroup = other.convertToBusinessDomainGroup();

        if ((tempBusinessDomainGroup == null) ||
                (this.objBusinessDomainGroup == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessDomainGroup == this.objBusinessDomainGroup) ||
                tempBusinessDomainGroup.equals(this.objBusinessDomainGroup)) {
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
     * @param aBusinessDomainGroups DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessDomainGroupBean[] toArray(
        com.ourteam.modelbase.dao.BusinessDomainGroup[] aBusinessDomainGroups) {
        return toArray(aBusinessDomainGroups, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroups DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessDomainGroupBean[] toArray(
        com.ourteam.modelbase.dao.BusinessDomainGroup[] aBusinessDomainGroups,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBusinessDomainGroups)) {
            return new BusinessDomainGroupBean[0];
        } // end if

        int length = aBusinessDomainGroups.length;

        BusinessDomainGroupBean[] beans = new BusinessDomainGroupBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessDomainGroupBean(aBusinessDomainGroups[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessDomainGroupBean(aBusinessDomainGroups[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessDomainGroups[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessDomainGroupBean
