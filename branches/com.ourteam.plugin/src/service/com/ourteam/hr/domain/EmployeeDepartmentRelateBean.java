/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-29 20:19:34
 *
 * @model auto gen
 */
public class EmployeeDepartmentRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.hr.dao.EmployeeDepartmentRelate objEmployeeDepartmentRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.Id);

        mappedDaoFields.put("departmentRole",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.DepartmentRole);

        mappedDaoFields.put("status",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.Status);

        mappedDaoFields.put("departmentId",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.DepartmentId);

        mappedDaoFields.put("employeeId",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.EmployeeId);

        mappedDaoFields.put("employeeName",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.EmployeeName);

        mappedDaoFields.put("departmentName",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.DepartmentName);

        mappedDaoFields.put("parentDepartmentId",
            com.ourteam.hr.dao.IEmployeeDepartmentRelateDAO.ParentDepartmentId);
    } 

    /**
     * Creates a new EmployeeDepartmentRelateBean object.
     */
    public EmployeeDepartmentRelateBean() {
        super();

        objEmployeeDepartmentRelate = new com.ourteam.hr.dao.EmployeeDepartmentRelate();
    } // end EmployeeDepartmentRelateBean()

    /**
     * Creates a new EmployeeDepartmentRelateBean object.
     *
     * @param aEmployeeDepartmentRelate DOCUMENT ME!
     */
    public EmployeeDepartmentRelateBean(
        com.ourteam.hr.dao.EmployeeDepartmentRelate aEmployeeDepartmentRelate) {
        super();

        objEmployeeDepartmentRelate = aEmployeeDepartmentRelate;
    } // end EmployeeDepartmentRelateBean()

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
    public com.ourteam.hr.dao.EmployeeDepartmentRelate convertToEmployeeDepartmentRelate() {
        return objEmployeeDepartmentRelate;
    } // end convertToEmployeeDepartmentRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objEmployeeDepartmentRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objEmployeeDepartmentRelate.setId(aId);
    } // end setId()

    /**
     * Get DepartmentRole
     *
     * @return departmentRole
     */
    public String getDepartmentRole() {
        return objEmployeeDepartmentRelate.getDepartmentRole();
    } // end getDepartmentRole()

    /**
     * Set DepartmentRole
     *
     * @param aDepartmentRole
     */
    public void setDepartmentRole(String aDepartmentRole) {
        this.objEmployeeDepartmentRelate.setDepartmentRole(aDepartmentRole);
    } // end setDepartmentRole()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objEmployeeDepartmentRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objEmployeeDepartmentRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DepartmentId
     *
     * @return departmentId
     */
    public long getDepartmentId() {
        return objEmployeeDepartmentRelate.getDepartmentId();
    } // end getDepartmentId()

    /**
     * Set DepartmentId
     *
     * @param aDepartmentId
     */
    public void setDepartmentId(long aDepartmentId) {
        this.objEmployeeDepartmentRelate.setDepartmentId(aDepartmentId);
    } // end setDepartmentId()

    /**
     * Get EmployeeId
     *
     * @return employeeId
     */
    public long getEmployeeId() {
        return objEmployeeDepartmentRelate.getEmployeeId();
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    public void setEmployeeId(long aEmployeeId) {
        this.objEmployeeDepartmentRelate.setEmployeeId(aEmployeeId);
    } // end setEmployeeId()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    public String getEmployeeName() {
        return objEmployeeDepartmentRelate.getEmployeeName();
    } // end getEmployeeName()

    /**
     * Set EmployeeName
     *
     * @param aEmployeeName
     */
    public void setEmployeeName(String aEmployeeName) {
        this.objEmployeeDepartmentRelate.setEmployeeName(aEmployeeName);
    } // end setEmployeeName()

    /**
     * Get DepartmentName
     *
     * @return departmentName
     */
    public String getDepartmentName() {
        return objEmployeeDepartmentRelate.getDepartmentName();
    } // end getDepartmentName()

    /**
     * Set DepartmentName
     *
     * @param aDepartmentName
     */
    public void setDepartmentName(String aDepartmentName) {
        this.objEmployeeDepartmentRelate.setDepartmentName(aDepartmentName);
    } // end setDepartmentName()

    /**
     * Get ParentDepartmentId
     *
     * @return parentDepartmentId
     */
    public long getParentDepartmentId() {
        return objEmployeeDepartmentRelate.getParentDepartmentId();
    } // end getParentDepartmentId()

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

        if ((obj instanceof EmployeeDepartmentRelateBean) == false) {
            return false;
        } // end if

        EmployeeDepartmentRelateBean other = (EmployeeDepartmentRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.hr.dao.EmployeeDepartmentRelate tempEmployeeDepartmentRelate =
            other.convertToEmployeeDepartmentRelate();

        if ((tempEmployeeDepartmentRelate == null) ||
                (this.objEmployeeDepartmentRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempEmployeeDepartmentRelate == this.objEmployeeDepartmentRelate) ||
                tempEmployeeDepartmentRelate.equals(
                    this.objEmployeeDepartmentRelate)) {
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
     * @param aEmployeeDepartmentRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static EmployeeDepartmentRelateBean[] toArray(
        com.ourteam.hr.dao.EmployeeDepartmentRelate[] aEmployeeDepartmentRelates) {
        return toArray(aEmployeeDepartmentRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployeeDepartmentRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static EmployeeDepartmentRelateBean[] toArray(
        com.ourteam.hr.dao.EmployeeDepartmentRelate[] aEmployeeDepartmentRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aEmployeeDepartmentRelates)) {
            return new EmployeeDepartmentRelateBean[0];
        } // end if

        int length = aEmployeeDepartmentRelates.length;

        EmployeeDepartmentRelateBean[] beans = new EmployeeDepartmentRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new EmployeeDepartmentRelateBean(aEmployeeDepartmentRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new EmployeeDepartmentRelateBean(aEmployeeDepartmentRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aEmployeeDepartmentRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end EmployeeDepartmentRelateBean
