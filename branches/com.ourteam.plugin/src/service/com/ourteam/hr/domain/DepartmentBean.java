/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-28 16:00:51
 *
 * @model auto gen
 */
public class DepartmentBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.hr.dao.Department objDepartment;

    static {
        mappedDaoFields.put("id", com.ourteam.hr.dao.IDepartmentDAO.Id);

        mappedDaoFields.put("departmentName",
            com.ourteam.hr.dao.IDepartmentDAO.DepartmentName);

        mappedDaoFields.put("description",
            com.ourteam.hr.dao.IDepartmentDAO.Description);

        mappedDaoFields.put("parentId",
            com.ourteam.hr.dao.IDepartmentDAO.ParentId);

        mappedDaoFields.put("status", com.ourteam.hr.dao.IDepartmentDAO.Status);
    } 

    /**
     * Creates a new DepartmentBean object.
     */
    public DepartmentBean() {
        super();

        objDepartment = new com.ourteam.hr.dao.Department();
    } // end DepartmentBean()

    /**
     * Creates a new DepartmentBean object.
     *
     * @param aDepartment DOCUMENT ME!
     */
    public DepartmentBean(com.ourteam.hr.dao.Department aDepartment) {
        super();

        objDepartment = aDepartment;
    } // end DepartmentBean()

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
    public com.ourteam.hr.dao.Department convertToDepartment() {
        return objDepartment;
    } // end convertToDepartment()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objDepartment.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objDepartment.setId(aId);
    } // end setId()

    /**
     * Get DepartmentName
     *
     * @return departmentName
     */
    public String getDepartmentName() {
        return objDepartment.getDepartmentName();
    } // end getDepartmentName()

    /**
     * Set DepartmentName
     *
     * @param aDepartmentName
     */
    public void setDepartmentName(String aDepartmentName) {
        this.objDepartment.setDepartmentName(aDepartmentName);
    } // end setDepartmentName()

    /**
     * Get Description
     *
     * @return description
     */
    public String getDescription() {
        return objDepartment.getDescription();
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    public void setDescription(String aDescription) {
        this.objDepartment.setDescription(aDescription);
    } // end setDescription()

    /**
     * Get ParentId
     *
     * @return parentId
     */
    public long getParentId() {
        return objDepartment.getParentId();
    } // end getParentId()

    /**
     * Set ParentId
     *
     * @param aParentId
     */
    public void setParentId(long aParentId) {
        this.objDepartment.setParentId(aParentId);
    } // end setParentId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objDepartment.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objDepartment.setStatus(aStatus);
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

        if ((obj instanceof DepartmentBean) == false) {
            return false;
        } // end if

        DepartmentBean other = (DepartmentBean) obj;

        boolean isEqual = false;

        com.ourteam.hr.dao.Department tempDepartment = other.convertToDepartment();

        if ((tempDepartment == null) || (this.objDepartment == null)) {
            isEqual = false;
        } // end if
        else if ((tempDepartment == this.objDepartment) ||
                tempDepartment.equals(this.objDepartment)) {
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
     * @param aDepartments DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static DepartmentBean[] toArray(
        com.ourteam.hr.dao.Department[] aDepartments) {
        return toArray(aDepartments, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aDepartments DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static DepartmentBean[] toArray(
        com.ourteam.hr.dao.Department[] aDepartments,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aDepartments)) {
            return new DepartmentBean[0];
        } // end if

        int length = aDepartments.length;

        DepartmentBean[] beans = new DepartmentBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new DepartmentBean(aDepartments[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new DepartmentBean(aDepartments[i]);

                aCallBack.populate(beans[i], new Object[] { aDepartments[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end DepartmentBean
