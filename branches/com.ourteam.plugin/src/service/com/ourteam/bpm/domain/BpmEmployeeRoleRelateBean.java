/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-16 10:34:03
 *
 * @model auto gen
 */
public class BpmEmployeeRoleRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmEmployeeRoleRelate objBpmEmployeeRoleRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.Id);

        mappedDaoFields.put("bpmRoleId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.BpmRoleId);

        mappedDaoFields.put("businessInstanceId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.BusinessInstanceId);

        mappedDaoFields.put("businessType",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.BusinessType);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.Status);

        mappedDaoFields.put("sysModuleId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.SysModuleId);

        mappedDaoFields.put("employeeId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.EmployeeId);

        mappedDaoFields.put("employeeName",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.EmployeeName);

        mappedDaoFields.put("bpmRoleName",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.BpmRoleName);

        mappedDaoFields.put("bpmRoleKey",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.BpmRoleKey);

        mappedDaoFields.put("sysModuleCode",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.SysModuleCode);

        mappedDaoFields.put("sysModuleName",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.SysModuleName);

        mappedDaoFields.put("employeeCode",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.EmployeeCode);

        mappedDaoFields.put("projectId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.ProjectId);

        mappedDaoFields.put("productId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.ProductId);

        mappedDaoFields.put("teamId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.TeamId);

        mappedDaoFields.put("departmentId",
            com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO.DepartmentId);
    } 

    /**
     * Creates a new BpmEmployeeRoleRelateBean object.
     */
    public BpmEmployeeRoleRelateBean() {
        super();

        objBpmEmployeeRoleRelate = new com.ourteam.bpm.dao.BpmEmployeeRoleRelate();
    } // end BpmEmployeeRoleRelateBean()

    /**
     * Creates a new BpmEmployeeRoleRelateBean object.
     *
     * @param aBpmEmployeeRoleRelate DOCUMENT ME!
     */
    public BpmEmployeeRoleRelateBean(
        com.ourteam.bpm.dao.BpmEmployeeRoleRelate aBpmEmployeeRoleRelate) {
        super();

        objBpmEmployeeRoleRelate = aBpmEmployeeRoleRelate;
    } // end BpmEmployeeRoleRelateBean()

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
    public com.ourteam.bpm.dao.BpmEmployeeRoleRelate convertToBpmEmployeeRoleRelate() {
        return objBpmEmployeeRoleRelate;
    } // end convertToBpmEmployeeRoleRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmEmployeeRoleRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmEmployeeRoleRelate.setId(aId);
    } // end setId()

    /**
     * Get BpmRoleId
     *
     * @return bpmRoleId
     */
    public long getBpmRoleId() {
        return objBpmEmployeeRoleRelate.getBpmRoleId();
    } // end getBpmRoleId()

    /**
     * Set BpmRoleId
     *
     * @param aBpmRoleId
     */
    public void setBpmRoleId(long aBpmRoleId) {
        this.objBpmEmployeeRoleRelate.setBpmRoleId(aBpmRoleId);
    } // end setBpmRoleId()

    /**
     * Get BusinessInstanceId
     *
     * @return businessInstanceId
     */
    public long getBusinessInstanceId() {
        return objBpmEmployeeRoleRelate.getBusinessInstanceId();
    } // end getBusinessInstanceId()

    /**
     * Set BusinessInstanceId
     *
     * @param aBusinessInstanceId
     */
    public void setBusinessInstanceId(long aBusinessInstanceId) {
        this.objBpmEmployeeRoleRelate.setBusinessInstanceId(aBusinessInstanceId);
    } // end setBusinessInstanceId()

    /**
     * Get BusinessType
     *
     * @return businessType
     */
    public String getBusinessType() {
        return objBpmEmployeeRoleRelate.getBusinessType();
    } // end getBusinessType()

    /**
     * Set BusinessType
     *
     * @param aBusinessType
     */
    public void setBusinessType(String aBusinessType) {
        this.objBpmEmployeeRoleRelate.setBusinessType(aBusinessType);
    } // end setBusinessType()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmEmployeeRoleRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmEmployeeRoleRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmEmployeeRoleRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmEmployeeRoleRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SysModuleId
     *
     * @return sysModuleId
     */
    public long getSysModuleId() {
        return objBpmEmployeeRoleRelate.getSysModuleId();
    } // end getSysModuleId()

    /**
     * Set SysModuleId
     *
     * @param aSysModuleId
     */
    public void setSysModuleId(long aSysModuleId) {
        this.objBpmEmployeeRoleRelate.setSysModuleId(aSysModuleId);
    } // end setSysModuleId()

    /**
     * Get EmployeeId
     *
     * @return employeeId
     */
    public long getEmployeeId() {
        return objBpmEmployeeRoleRelate.getEmployeeId();
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    public void setEmployeeId(long aEmployeeId) {
        this.objBpmEmployeeRoleRelate.setEmployeeId(aEmployeeId);
    } // end setEmployeeId()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    public String getEmployeeName() {
        return objBpmEmployeeRoleRelate.getEmployeeName();
    } // end getEmployeeName()

    /**
     * Get BpmRoleName
     *
     * @return bpmRoleName
     */
    public String getBpmRoleName() {
        return objBpmEmployeeRoleRelate.getBpmRoleName();
    } // end getBpmRoleName()

    /**
     * Get BpmRoleKey
     *
     * @return bpmRoleKey
     */
    public String getBpmRoleKey() {
        return objBpmEmployeeRoleRelate.getBpmRoleKey();
    } // end getBpmRoleKey()

    /**
     * Get SysModuleCode
     *
     * @return sysModuleCode
     */
    public String getSysModuleCode() {
        return objBpmEmployeeRoleRelate.getSysModuleCode();
    } // end getSysModuleCode()

    /**
     * Get SysModuleName
     *
     * @return sysModuleName
     */
    public String getSysModuleName() {
        return objBpmEmployeeRoleRelate.getSysModuleName();
    } // end getSysModuleName()

    /**
     * Get EmployeeCode
     *
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return objBpmEmployeeRoleRelate.getEmployeeCode();
    } // end getEmployeeCode()

    /**
     * Get ProjectId
     *
     * @return projectId
     */
    public long getProjectId() {
        return objBpmEmployeeRoleRelate.getProjectId();
    } // end getProjectId()

    /**
     * Set ProjectId
     *
     * @param aProjectId
     */
    public void setProjectId(long aProjectId) {
        this.objBpmEmployeeRoleRelate.setProjectId(aProjectId);
    } // end setProjectId()

    /**
     * Get ProductId
     *
     * @return productId
     */
    public long getProductId() {
        return objBpmEmployeeRoleRelate.getProductId();
    } // end getProductId()

    /**
     * Set ProductId
     *
     * @param aProductId
     */
    public void setProductId(long aProductId) {
        this.objBpmEmployeeRoleRelate.setProductId(aProductId);
    } // end setProductId()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    public long getTeamId() {
        return objBpmEmployeeRoleRelate.getTeamId();
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    public void setTeamId(long aTeamId) {
        this.objBpmEmployeeRoleRelate.setTeamId(aTeamId);
    } // end setTeamId()

    /**
     * Get DepartmentId
     *
     * @return departmentId
     */
    public long getDepartmentId() {
        return objBpmEmployeeRoleRelate.getDepartmentId();
    } // end getDepartmentId()

    /**
     * Set DepartmentId
     *
     * @param aDepartmentId
     */
    public void setDepartmentId(long aDepartmentId) {
        this.objBpmEmployeeRoleRelate.setDepartmentId(aDepartmentId);
    } // end setDepartmentId()

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

        if ((obj instanceof BpmEmployeeRoleRelateBean) == false) {
            return false;
        } // end if

        BpmEmployeeRoleRelateBean other = (BpmEmployeeRoleRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmEmployeeRoleRelate tempBpmEmployeeRoleRelate = other.convertToBpmEmployeeRoleRelate();

        if ((tempBpmEmployeeRoleRelate == null) ||
                (this.objBpmEmployeeRoleRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmEmployeeRoleRelate == this.objBpmEmployeeRoleRelate) ||
                tempBpmEmployeeRoleRelate.equals(this.objBpmEmployeeRoleRelate)) {
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
     * @param aBpmEmployeeRoleRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmEmployeeRoleRelateBean[] toArray(
        com.ourteam.bpm.dao.BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates) {
        return toArray(aBpmEmployeeRoleRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmEmployeeRoleRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmEmployeeRoleRelateBean[] toArray(
        com.ourteam.bpm.dao.BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmEmployeeRoleRelates)) {
            return new BpmEmployeeRoleRelateBean[0];
        } // end if

        int length = aBpmEmployeeRoleRelates.length;

        BpmEmployeeRoleRelateBean[] beans = new BpmEmployeeRoleRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmEmployeeRoleRelateBean(aBpmEmployeeRoleRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmEmployeeRoleRelateBean(aBpmEmployeeRoleRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmEmployeeRoleRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmEmployeeRoleRelateBean
