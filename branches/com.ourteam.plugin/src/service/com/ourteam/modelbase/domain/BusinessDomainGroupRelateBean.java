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
public class BusinessDomainGroupRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.BusinessDomainGroupRelate objBusinessDomainGroupRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.Id);

        mappedDaoFields.put("domainId",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.DomainId);

        mappedDaoFields.put("groupId",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.GroupId);

        mappedDaoFields.put("remarks",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.Status);

        mappedDaoFields.put("domainName",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.DomainName);

        mappedDaoFields.put("groupName",
            com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO.GroupName);
    } 

    /**
     * Creates a new BusinessDomainGroupRelateBean object.
     */
    public BusinessDomainGroupRelateBean() {
        super();

        objBusinessDomainGroupRelate = new com.ourteam.modelbase.dao.BusinessDomainGroupRelate();
    } // end BusinessDomainGroupRelateBean()

    /**
     * Creates a new BusinessDomainGroupRelateBean object.
     *
     * @param aBusinessDomainGroupRelate DOCUMENT ME!
     */
    public BusinessDomainGroupRelateBean(
        com.ourteam.modelbase.dao.BusinessDomainGroupRelate aBusinessDomainGroupRelate) {
        super();

        objBusinessDomainGroupRelate = aBusinessDomainGroupRelate;
    } // end BusinessDomainGroupRelateBean()

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
    public com.ourteam.modelbase.dao.BusinessDomainGroupRelate convertToBusinessDomainGroupRelate() {
        return objBusinessDomainGroupRelate;
    } // end convertToBusinessDomainGroupRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBusinessDomainGroupRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBusinessDomainGroupRelate.setId(aId);
    } // end setId()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    public long getDomainId() {
        return objBusinessDomainGroupRelate.getDomainId();
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    public void setDomainId(long aDomainId) {
        this.objBusinessDomainGroupRelate.setDomainId(aDomainId);
    } // end setDomainId()

    /**
     * Get GroupId
     *
     * @return groupId
     */
    public long getGroupId() {
        return objBusinessDomainGroupRelate.getGroupId();
    } // end getGroupId()

    /**
     * Set GroupId
     *
     * @param aGroupId
     */
    public void setGroupId(long aGroupId) {
        this.objBusinessDomainGroupRelate.setGroupId(aGroupId);
    } // end setGroupId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBusinessDomainGroupRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBusinessDomainGroupRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBusinessDomainGroupRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBusinessDomainGroupRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    public String getDomainName() {
        return objBusinessDomainGroupRelate.getDomainName();
    } // end getDomainName()

    /**
     * Get GroupName
     *
     * @return groupName
     */
    public String getGroupName() {
        return objBusinessDomainGroupRelate.getGroupName();
    } // end getGroupName()

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

        if ((obj instanceof BusinessDomainGroupRelateBean) == false) {
            return false;
        } // end if

        BusinessDomainGroupRelateBean other = (BusinessDomainGroupRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.modelbase.dao.BusinessDomainGroupRelate tempBusinessDomainGroupRelate =
            other.convertToBusinessDomainGroupRelate();

        if ((tempBusinessDomainGroupRelate == null) ||
                (this.objBusinessDomainGroupRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempBusinessDomainGroupRelate == this.objBusinessDomainGroupRelate) ||
                tempBusinessDomainGroupRelate.equals(
                    this.objBusinessDomainGroupRelate)) {
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
     * @param aBusinessDomainGroupRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessDomainGroupRelateBean[] toArray(
        com.ourteam.modelbase.dao.BusinessDomainGroupRelate[] aBusinessDomainGroupRelates) {
        return toArray(aBusinessDomainGroupRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroupRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BusinessDomainGroupRelateBean[] toArray(
        com.ourteam.modelbase.dao.BusinessDomainGroupRelate[] aBusinessDomainGroupRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aBusinessDomainGroupRelates)) {
            return new BusinessDomainGroupRelateBean[0];
        } // end if

        int length = aBusinessDomainGroupRelates.length;

        BusinessDomainGroupRelateBean[] beans = new BusinessDomainGroupRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessDomainGroupRelateBean(aBusinessDomainGroupRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BusinessDomainGroupRelateBean(aBusinessDomainGroupRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBusinessDomainGroupRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BusinessDomainGroupRelateBean
