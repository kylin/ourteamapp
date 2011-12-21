/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:22:45
 *
 * @model auto gen
 */
public class WorkspaceResourceBusinessPackageRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate objWorkspaceResourceBusinessPackageRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.Id);

        mappedDaoFields.put("businessPcakageId",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessPcakageId);

        mappedDaoFields.put("description",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.Description);

        mappedDaoFields.put("status",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.Status);

        mappedDaoFields.put("workspaceResourceId",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.WorkspaceResourceId);

        mappedDaoFields.put("businessPackageName",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageName);

        mappedDaoFields.put("businessDomainName",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainName);

        mappedDaoFields.put("businessDomainId",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainId);

        mappedDaoFields.put("businessPackageType",
            com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageType);
    } 

    /**
     * Creates a new WorkspaceResourceBusinessPackageRelateBean object.
     */
    public WorkspaceResourceBusinessPackageRelateBean() {
        super();

        objWorkspaceResourceBusinessPackageRelate = new com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate();
    } // end WorkspaceResourceBusinessPackageRelateBean()

    /**
     * Creates a new WorkspaceResourceBusinessPackageRelateBean object.
     *
     * @param aWorkspaceResourceBusinessPackageRelate DOCUMENT ME!
     */
    public WorkspaceResourceBusinessPackageRelateBean(
        com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate) {
        super();

        objWorkspaceResourceBusinessPackageRelate = aWorkspaceResourceBusinessPackageRelate;
    } // end WorkspaceResourceBusinessPackageRelateBean()

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
    public com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate convertToWorkspaceResourceBusinessPackageRelate() {
        return objWorkspaceResourceBusinessPackageRelate;
    } // end convertToWorkspaceResourceBusinessPackageRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objWorkspaceResourceBusinessPackageRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objWorkspaceResourceBusinessPackageRelate.setId(aId);
    } // end setId()

    /**
     * Get BusinessPcakageId
     *
     * @return businessPcakageId
     */
    public long getBusinessPcakageId() {
        return objWorkspaceResourceBusinessPackageRelate.getBusinessPcakageId();
    } // end getBusinessPcakageId()

    /**
     * Set BusinessPcakageId
     *
     * @param aBusinessPcakageId
     */
    public void setBusinessPcakageId(long aBusinessPcakageId) {
        this.objWorkspaceResourceBusinessPackageRelate.setBusinessPcakageId(aBusinessPcakageId);
    } // end setBusinessPcakageId()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objWorkspaceResourceBusinessPackageRelate.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objWorkspaceResourceBusinessPackageRelate.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get Status
     *
     * @return status
     */
    public Integer getStatus() {
        return objWorkspaceResourceBusinessPackageRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(Integer aStatus) {
        this.objWorkspaceResourceBusinessPackageRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get WorkspaceResourceId
     *
     * @return workspaceResourceId
     */
    public long getWorkspaceResourceId() {
        return objWorkspaceResourceBusinessPackageRelate.getWorkspaceResourceId();
    } // end getWorkspaceResourceId()

    /**
     * Set WorkspaceResourceId
     *
     * @param aWorkspaceResourceId
     */
    public void setWorkspaceResourceId(long aWorkspaceResourceId) {
        this.objWorkspaceResourceBusinessPackageRelate.setWorkspaceResourceId(aWorkspaceResourceId);
    } // end setWorkspaceResourceId()

    /**
     * Get BusinessPackageName
     *
     * @return businessPackageName
     */
    public String getBusinessPackageName() {
        return objWorkspaceResourceBusinessPackageRelate.getBusinessPackageName();
    } // end getBusinessPackageName()

    /**
     * Get BusinessDomainName
     *
     * @return businessDomainName
     */
    public String getBusinessDomainName() {
        return objWorkspaceResourceBusinessPackageRelate.getBusinessDomainName();
    } // end getBusinessDomainName()

    /**
     * Get BusinessDomainId
     *
     * @return businessDomainId
     */
    public long getBusinessDomainId() {
        return objWorkspaceResourceBusinessPackageRelate.getBusinessDomainId();
    } // end getBusinessDomainId()

    /**
     * Get BusinessPackageType
     *
     * @return businessPackageType
     */
    public String getBusinessPackageType() {
        return objWorkspaceResourceBusinessPackageRelate.getBusinessPackageType();
    } // end getBusinessPackageType()

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

        if ((obj instanceof WorkspaceResourceBusinessPackageRelateBean) == false) {
            return false;
        } // end if

        WorkspaceResourceBusinessPackageRelateBean other = (WorkspaceResourceBusinessPackageRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate tempWorkspaceResourceBusinessPackageRelate =
            other.convertToWorkspaceResourceBusinessPackageRelate();

        if ((tempWorkspaceResourceBusinessPackageRelate == null) ||
                (this.objWorkspaceResourceBusinessPackageRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempWorkspaceResourceBusinessPackageRelate == this.objWorkspaceResourceBusinessPackageRelate) ||
                tempWorkspaceResourceBusinessPackageRelate.equals(
                    this.objWorkspaceResourceBusinessPackageRelate)) {
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
     * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceResourceBusinessPackageRelateBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates) {
        return toArray(aWorkspaceResourceBusinessPackageRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static WorkspaceResourceBusinessPackageRelateBean[] toArray(
        com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aWorkspaceResourceBusinessPackageRelates)) {
            return new WorkspaceResourceBusinessPackageRelateBean[0];
        } // end if

        int length = aWorkspaceResourceBusinessPackageRelates.length;

        WorkspaceResourceBusinessPackageRelateBean[] beans = new WorkspaceResourceBusinessPackageRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceResourceBusinessPackageRelateBean(aWorkspaceResourceBusinessPackageRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new WorkspaceResourceBusinessPackageRelateBean(aWorkspaceResourceBusinessPackageRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aWorkspaceResourceBusinessPackageRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end WorkspaceResourceBusinessPackageRelateBean
