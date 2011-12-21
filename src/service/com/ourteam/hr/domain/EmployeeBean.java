/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-31 11:56:43
 *
 * @model auto gen
 */
public class EmployeeBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.hr.dao.Employee objEmployee;

    static {
        mappedDaoFields.put("id", com.ourteam.hr.dao.IEmployeeDAO.Id);

        mappedDaoFields.put("birthDay", com.ourteam.hr.dao.IEmployeeDAO.BirthDay);

        mappedDaoFields.put("homeAddress",
            com.ourteam.hr.dao.IEmployeeDAO.HomeAddress);

        mappedDaoFields.put("mailAddress",
            com.ourteam.hr.dao.IEmployeeDAO.MailAddress);

        mappedDaoFields.put("name", com.ourteam.hr.dao.IEmployeeDAO.Name);

        mappedDaoFields.put("phoneCall",
            com.ourteam.hr.dao.IEmployeeDAO.PhoneCall);

        mappedDaoFields.put("remarks", com.ourteam.hr.dao.IEmployeeDAO.Remarks);

        mappedDaoFields.put("sex", com.ourteam.hr.dao.IEmployeeDAO.Sex);

        mappedDaoFields.put("status", com.ourteam.hr.dao.IEmployeeDAO.Status);

        mappedDaoFields.put("userId", com.ourteam.hr.dao.IEmployeeDAO.UserId);

        mappedDaoFields.put("code", com.ourteam.hr.dao.IEmployeeDAO.Code);
    } 

    /**
     * Creates a new EmployeeBean object.
     */
    public EmployeeBean() {
        super();

        objEmployee = new com.ourteam.hr.dao.Employee();
    } // end EmployeeBean()

    /**
     * Creates a new EmployeeBean object.
     *
     * @param aEmployee DOCUMENT ME!
     */
    public EmployeeBean(com.ourteam.hr.dao.Employee aEmployee) {
        super();

        objEmployee = aEmployee;
    } // end EmployeeBean()

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
    public com.ourteam.hr.dao.Employee convertToEmployee() {
        return objEmployee;
    } // end convertToEmployee()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objEmployee.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objEmployee.setId(aId);
    } // end setId()

    /**
     * Get BirthDay
     *
     * @return birthDay
     */
    public java.util.Date getBirthDay() {
        return objEmployee.getBirthDay();
    } // end getBirthDay()

    /**
     * Set BirthDay
     *
     * @param aBirthDay
     */
    public void setBirthDay(java.util.Date aBirthDay) {
        this.objEmployee.setBirthDay(aBirthDay);
    } // end setBirthDay()

    /**
     * Get HomeAddress
     *
     * @return homeAddress
     */
    public String getHomeAddress() {
        return objEmployee.getHomeAddress();
    } // end getHomeAddress()

    /**
     * Set HomeAddress
     *
     * @param aHomeAddress
     */
    public void setHomeAddress(String aHomeAddress) {
        this.objEmployee.setHomeAddress(aHomeAddress);
    } // end setHomeAddress()

    /**
     * Get MailAddress
     *
     * @return mailAddress
     */
    public String getMailAddress() {
        return objEmployee.getMailAddress();
    } // end getMailAddress()

    /**
     * Set MailAddress
     *
     * @param aMailAddress
     */
    public void setMailAddress(String aMailAddress) {
        this.objEmployee.setMailAddress(aMailAddress);
    } // end setMailAddress()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objEmployee.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objEmployee.setName(aName);
    } // end setName()

    /**
     * Get PhoneCall
     *
     * @return phoneCall
     */
    public String getPhoneCall() {
        return objEmployee.getPhoneCall();
    } // end getPhoneCall()

    /**
     * Set PhoneCall
     *
     * @param aPhoneCall
     */
    public void setPhoneCall(String aPhoneCall) {
        this.objEmployee.setPhoneCall(aPhoneCall);
    } // end setPhoneCall()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objEmployee.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objEmployee.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Sex
     *
     * @return sex
     */
    public String getSex() {
        return objEmployee.getSex();
    } // end getSex()

    /**
     * Set Sex
     *
     * @param aSex
     */
    public void setSex(String aSex) {
        this.objEmployee.setSex(aSex);
    } // end setSex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objEmployee.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objEmployee.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get UserId
     *
     * @return userId
     */
    public long getUserId() {
        return objEmployee.getUserId();
    } // end getUserId()

    /**
     * Set UserId
     *
     * @param aUserId
     */
    public void setUserId(long aUserId) {
        this.objEmployee.setUserId(aUserId);
    } // end setUserId()

    /**
     * Get Code
     *
     * @return code
     */
    public String getCode() {
        return objEmployee.getCode();
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    public void setCode(String aCode) {
        this.objEmployee.setCode(aCode);
    } // end setCode()

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

        if ((obj instanceof EmployeeBean) == false) {
            return false;
        } // end if

        EmployeeBean other = (EmployeeBean) obj;

        boolean isEqual = false;

        com.ourteam.hr.dao.Employee tempEmployee = other.convertToEmployee();

        if ((tempEmployee == null) || (this.objEmployee == null)) {
            isEqual = false;
        } // end if
        else if ((tempEmployee == this.objEmployee) ||
                tempEmployee.equals(this.objEmployee)) {
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
     * @param aEmployees DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static EmployeeBean[] toArray(
        com.ourteam.hr.dao.Employee[] aEmployees) {
        return toArray(aEmployees, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aEmployees DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static EmployeeBean[] toArray(
        com.ourteam.hr.dao.Employee[] aEmployees,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aEmployees)) {
            return new EmployeeBean[0];
        } // end if

        int length = aEmployees.length;

        EmployeeBean[] beans = new EmployeeBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new EmployeeBean(aEmployees[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new EmployeeBean(aEmployees[i]);

                aCallBack.populate(beans[i], new Object[] { aEmployees[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end EmployeeBean
