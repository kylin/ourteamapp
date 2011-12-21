/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

/**
 * Generate Date 2011-11-16 10:32:26
 *
 * @author Auto Gen
 */
public class BpmEmployeeRoleRelate implements java.io.Serializable {
    /**
     * Creates a new BpmEmployeeRoleRelate object.
     */
    public BpmEmployeeRoleRelate() {
        super();
    } // end BpmEmployeeRoleRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private long bpmRoleId;

    /** Attribute  Be Seted Falg */
    private boolean bpmRoleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmRoleIdNull = false;

    /** Attribute */
    private long businessInstanceId;

    /** Attribute  Be Seted Falg */
    private boolean businessInstanceIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessInstanceIdNull = false;

    /** Attribute */
    private String businessType;

    /** Attribute  Be Seted Falg */
    private boolean businessTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessTypeNull = false;

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
    private long sysModuleId;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleIdNull = false;

    /** Attribute */
    private long employeeId;

    /** Attribute  Be Seted Falg */
    private boolean employeeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeIdNull = false;

    /** Attribute */
    private String employeeName;

    /** Attribute  Be Seted Falg */
    private boolean employeeNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeNameNull = false;

    /** Attribute */
    private String bpmRoleName;

    /** Attribute  Be Seted Falg */
    private boolean bpmRoleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmRoleNameNull = false;

    /** Attribute */
    private String bpmRoleKey;

    /** Attribute  Be Seted Falg */
    private boolean bpmRoleKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean bpmRoleKeyNull = false;

    /** Attribute */
    private String sysModuleCode;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleCodeNull = false;

    /** Attribute */
    private String sysModuleName;

    /** Attribute  Be Seted Falg */
    private boolean sysModuleNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean sysModuleNameNull = false;

    /** Attribute */
    private String employeeCode;

    /** Attribute  Be Seted Falg */
    private boolean employeeCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeCodeNull = false;

    /** Attribute */
    private long projectId;

    /** Attribute  Be Seted Falg */
    private boolean projectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean projectIdNull = false;

    /** Attribute */
    private long productId;

    /** Attribute  Be Seted Falg */
    private boolean productIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean productIdNull = false;

    /** Attribute */
    private long teamId;

    /** Attribute  Be Seted Falg */
    private boolean teamIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamIdNull = false;

    /** Attribute */
    private long departmentId;

    /** Attribute  Be Seted Falg */
    private boolean departmentIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean departmentIdNull = false;

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
     * Get BpmRoleId
     *
     * @return bpmRoleId
     */
    final public long getBpmRoleId() {
        return bpmRoleId;
    } // end getBpmRoleId()

    /**
     * Set BpmRoleId
     *
     * @param aBpmRoleId
     */
    final public void setBpmRoleId(long aBpmRoleId) {
        this.bpmRoleId = aBpmRoleId;

        this.bpmRoleIdSetted = true;

        this.setBpmRoleIdNull(false);
    } // end setBpmRoleId()

    /**
     * Get BpmRoleId Has Been Setted
     *
     * @return bpmRoleId
     */
    final public boolean isBpmRoleIdSetted() {
        return this.bpmRoleIdSetted;
    } // end isBpmRoleIdSetted()

    /**
     * Set BpmRoleId Null
     */
    final public void setBpmRoleIdNull() {
        this.bpmRoleIdNull = true;
    } // end setBpmRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmRoleIdNull(boolean aNullFlag) {
        this.bpmRoleIdNull = aNullFlag;
    } // end setBpmRoleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmRoleIdNull() {
        return this.bpmRoleIdNull;
    } // end isBpmRoleIdNull()

    /**
     * Get BusinessInstanceId
     *
     * @return businessInstanceId
     */
    final public long getBusinessInstanceId() {
        return businessInstanceId;
    } // end getBusinessInstanceId()

    /**
     * Set BusinessInstanceId
     *
     * @param aBusinessInstanceId
     */
    final public void setBusinessInstanceId(long aBusinessInstanceId) {
        this.businessInstanceId = aBusinessInstanceId;

        this.businessInstanceIdSetted = true;

        this.setBusinessInstanceIdNull(false);
    } // end setBusinessInstanceId()

    /**
     * Get BusinessInstanceId Has Been Setted
     *
     * @return businessInstanceId
     */
    final public boolean isBusinessInstanceIdSetted() {
        return this.businessInstanceIdSetted;
    } // end isBusinessInstanceIdSetted()

    /**
     * Set BusinessInstanceId Null
     */
    final public void setBusinessInstanceIdNull() {
        this.businessInstanceIdNull = true;
    } // end setBusinessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessInstanceIdNull(boolean aNullFlag) {
        this.businessInstanceIdNull = aNullFlag;
    } // end setBusinessInstanceIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessInstanceIdNull() {
        return this.businessInstanceIdNull;
    } // end isBusinessInstanceIdNull()

    /**
     * Get BusinessType
     *
     * @return businessType
     */
    final public String getBusinessType() {
        return businessType;
    } // end getBusinessType()

    /**
     * Set BusinessType
     *
     * @param aBusinessType
     */
    final public void setBusinessType(String aBusinessType) {
        this.businessType = aBusinessType;

        this.businessTypeSetted = true;

        this.setBusinessTypeNull(this.businessType == null);
    } // end setBusinessType()

    /**
     * Get BusinessType Has Been Setted
     *
     * @return businessType
     */
    final public boolean isBusinessTypeSetted() {
        return this.businessTypeSetted;
    } // end isBusinessTypeSetted()

    /**
     * Set BusinessType Null
     */
    final public void setBusinessTypeNull() {
        this.businessTypeNull = true;
    } // end setBusinessTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessTypeNull(boolean aNullFlag) {
        this.businessTypeNull = aNullFlag;
    } // end setBusinessTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessTypeNull() {
        return this.businessTypeNull;
    } // end isBusinessTypeNull()

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
     * Get SysModuleId
     *
     * @return sysModuleId
     */
    final public long getSysModuleId() {
        return sysModuleId;
    } // end getSysModuleId()

    /**
     * Set SysModuleId
     *
     * @param aSysModuleId
     */
    final public void setSysModuleId(long aSysModuleId) {
        this.sysModuleId = aSysModuleId;

        this.sysModuleIdSetted = true;

        this.setSysModuleIdNull(false);
    } // end setSysModuleId()

    /**
     * Get SysModuleId Has Been Setted
     *
     * @return sysModuleId
     */
    final public boolean isSysModuleIdSetted() {
        return this.sysModuleIdSetted;
    } // end isSysModuleIdSetted()

    /**
     * Set SysModuleId Null
     */
    final public void setSysModuleIdNull() {
        this.sysModuleIdNull = true;
    } // end setSysModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysModuleIdNull(boolean aNullFlag) {
        this.sysModuleIdNull = aNullFlag;
    } // end setSysModuleIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysModuleIdNull() {
        return this.sysModuleIdNull;
    } // end isSysModuleIdNull()

    /**
     * Get EmployeeId
     *
     * @return employeeId
     */
    final public long getEmployeeId() {
        return employeeId;
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    final public void setEmployeeId(long aEmployeeId) {
        this.employeeId = aEmployeeId;

        this.employeeIdSetted = true;

        this.setEmployeeIdNull(false);
    } // end setEmployeeId()

    /**
     * Get EmployeeId Has Been Setted
     *
     * @return employeeId
     */
    final public boolean isEmployeeIdSetted() {
        return this.employeeIdSetted;
    } // end isEmployeeIdSetted()

    /**
     * Set EmployeeId Null
     */
    final public void setEmployeeIdNull() {
        this.employeeIdNull = true;
    } // end setEmployeeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeIdNull(boolean aNullFlag) {
        this.employeeIdNull = aNullFlag;
    } // end setEmployeeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeIdNull() {
        return this.employeeIdNull;
    } // end isEmployeeIdNull()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    final public String getEmployeeName() {
        return employeeName;
    } // end getEmployeeName()

    /**
     * Set EmployeeName
     *
     * @param aEmployeeName
     */
    final public void setEmployeeName(String aEmployeeName) {
        this.employeeName = aEmployeeName;

        this.employeeNameSetted = true;

        this.setEmployeeNameNull(this.employeeName == null);
    } // end setEmployeeName()

    /**
     * Get EmployeeName Has Been Setted
     *
     * @return employeeName
     */
    final public boolean isEmployeeNameSetted() {
        return this.employeeNameSetted;
    } // end isEmployeeNameSetted()

    /**
     * Set EmployeeName Null
     */
    final public void setEmployeeNameNull() {
        this.employeeNameNull = true;
    } // end setEmployeeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeNameNull(boolean aNullFlag) {
        this.employeeNameNull = aNullFlag;
    } // end setEmployeeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeNameNull() {
        return this.employeeNameNull;
    } // end isEmployeeNameNull()

    /**
     * Get BpmRoleName
     *
     * @return bpmRoleName
     */
    final public String getBpmRoleName() {
        return bpmRoleName;
    } // end getBpmRoleName()

    /**
     * Set BpmRoleName
     *
     * @param aBpmRoleName
     */
    final public void setBpmRoleName(String aBpmRoleName) {
        this.bpmRoleName = aBpmRoleName;

        this.bpmRoleNameSetted = true;

        this.setBpmRoleNameNull(this.bpmRoleName == null);
    } // end setBpmRoleName()

    /**
     * Get BpmRoleName Has Been Setted
     *
     * @return bpmRoleName
     */
    final public boolean isBpmRoleNameSetted() {
        return this.bpmRoleNameSetted;
    } // end isBpmRoleNameSetted()

    /**
     * Set BpmRoleName Null
     */
    final public void setBpmRoleNameNull() {
        this.bpmRoleNameNull = true;
    } // end setBpmRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmRoleNameNull(boolean aNullFlag) {
        this.bpmRoleNameNull = aNullFlag;
    } // end setBpmRoleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmRoleNameNull() {
        return this.bpmRoleNameNull;
    } // end isBpmRoleNameNull()

    /**
     * Get BpmRoleKey
     *
     * @return bpmRoleKey
     */
    final public String getBpmRoleKey() {
        return bpmRoleKey;
    } // end getBpmRoleKey()

    /**
     * Set BpmRoleKey
     *
     * @param aBpmRoleKey
     */
    final public void setBpmRoleKey(String aBpmRoleKey) {
        this.bpmRoleKey = aBpmRoleKey;

        this.bpmRoleKeySetted = true;

        this.setBpmRoleKeyNull(this.bpmRoleKey == null);
    } // end setBpmRoleKey()

    /**
     * Get BpmRoleKey Has Been Setted
     *
     * @return bpmRoleKey
     */
    final public boolean isBpmRoleKeySetted() {
        return this.bpmRoleKeySetted;
    } // end isBpmRoleKeySetted()

    /**
     * Set BpmRoleKey Null
     */
    final public void setBpmRoleKeyNull() {
        this.bpmRoleKeyNull = true;
    } // end setBpmRoleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBpmRoleKeyNull(boolean aNullFlag) {
        this.bpmRoleKeyNull = aNullFlag;
    } // end setBpmRoleKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBpmRoleKeyNull() {
        return this.bpmRoleKeyNull;
    } // end isBpmRoleKeyNull()

    /**
     * Get SysModuleCode
     *
     * @return sysModuleCode
     */
    final public String getSysModuleCode() {
        return sysModuleCode;
    } // end getSysModuleCode()

    /**
     * Set SysModuleCode
     *
     * @param aSysModuleCode
     */
    final public void setSysModuleCode(String aSysModuleCode) {
        this.sysModuleCode = aSysModuleCode;

        this.sysModuleCodeSetted = true;

        this.setSysModuleCodeNull(this.sysModuleCode == null);
    } // end setSysModuleCode()

    /**
     * Get SysModuleCode Has Been Setted
     *
     * @return sysModuleCode
     */
    final public boolean isSysModuleCodeSetted() {
        return this.sysModuleCodeSetted;
    } // end isSysModuleCodeSetted()

    /**
     * Set SysModuleCode Null
     */
    final public void setSysModuleCodeNull() {
        this.sysModuleCodeNull = true;
    } // end setSysModuleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysModuleCodeNull(boolean aNullFlag) {
        this.sysModuleCodeNull = aNullFlag;
    } // end setSysModuleCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysModuleCodeNull() {
        return this.sysModuleCodeNull;
    } // end isSysModuleCodeNull()

    /**
     * Get SysModuleName
     *
     * @return sysModuleName
     */
    final public String getSysModuleName() {
        return sysModuleName;
    } // end getSysModuleName()

    /**
     * Set SysModuleName
     *
     * @param aSysModuleName
     */
    final public void setSysModuleName(String aSysModuleName) {
        this.sysModuleName = aSysModuleName;

        this.sysModuleNameSetted = true;

        this.setSysModuleNameNull(this.sysModuleName == null);
    } // end setSysModuleName()

    /**
     * Get SysModuleName Has Been Setted
     *
     * @return sysModuleName
     */
    final public boolean isSysModuleNameSetted() {
        return this.sysModuleNameSetted;
    } // end isSysModuleNameSetted()

    /**
     * Set SysModuleName Null
     */
    final public void setSysModuleNameNull() {
        this.sysModuleNameNull = true;
    } // end setSysModuleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSysModuleNameNull(boolean aNullFlag) {
        this.sysModuleNameNull = aNullFlag;
    } // end setSysModuleNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSysModuleNameNull() {
        return this.sysModuleNameNull;
    } // end isSysModuleNameNull()

    /**
     * Get EmployeeCode
     *
     * @return employeeCode
     */
    final public String getEmployeeCode() {
        return employeeCode;
    } // end getEmployeeCode()

    /**
     * Set EmployeeCode
     *
     * @param aEmployeeCode
     */
    final public void setEmployeeCode(String aEmployeeCode) {
        this.employeeCode = aEmployeeCode;

        this.employeeCodeSetted = true;

        this.setEmployeeCodeNull(this.employeeCode == null);
    } // end setEmployeeCode()

    /**
     * Get EmployeeCode Has Been Setted
     *
     * @return employeeCode
     */
    final public boolean isEmployeeCodeSetted() {
        return this.employeeCodeSetted;
    } // end isEmployeeCodeSetted()

    /**
     * Set EmployeeCode Null
     */
    final public void setEmployeeCodeNull() {
        this.employeeCodeNull = true;
    } // end setEmployeeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeCodeNull(boolean aNullFlag) {
        this.employeeCodeNull = aNullFlag;
    } // end setEmployeeCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeCodeNull() {
        return this.employeeCodeNull;
    } // end isEmployeeCodeNull()

    /**
     * Get ProjectId
     *
     * @return projectId
     */
    final public long getProjectId() {
        return projectId;
    } // end getProjectId()

    /**
     * Set ProjectId
     *
     * @param aProjectId
     */
    final public void setProjectId(long aProjectId) {
        this.projectId = aProjectId;

        this.projectIdSetted = true;

        this.setProjectIdNull(false);
    } // end setProjectId()

    /**
     * Get ProjectId Has Been Setted
     *
     * @return projectId
     */
    final public boolean isProjectIdSetted() {
        return this.projectIdSetted;
    } // end isProjectIdSetted()

    /**
     * Set ProjectId Null
     */
    final public void setProjectIdNull() {
        this.projectIdNull = true;
    } // end setProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProjectIdNull(boolean aNullFlag) {
        this.projectIdNull = aNullFlag;
    } // end setProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProjectIdNull() {
        return this.projectIdNull;
    } // end isProjectIdNull()

    /**
     * Get ProductId
     *
     * @return productId
     */
    final public long getProductId() {
        return productId;
    } // end getProductId()

    /**
     * Set ProductId
     *
     * @param aProductId
     */
    final public void setProductId(long aProductId) {
        this.productId = aProductId;

        this.productIdSetted = true;

        this.setProductIdNull(false);
    } // end setProductId()

    /**
     * Get ProductId Has Been Setted
     *
     * @return productId
     */
    final public boolean isProductIdSetted() {
        return this.productIdSetted;
    } // end isProductIdSetted()

    /**
     * Set ProductId Null
     */
    final public void setProductIdNull() {
        this.productIdNull = true;
    } // end setProductIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProductIdNull(boolean aNullFlag) {
        this.productIdNull = aNullFlag;
    } // end setProductIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProductIdNull() {
        return this.productIdNull;
    } // end isProductIdNull()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    final public long getTeamId() {
        return teamId;
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    final public void setTeamId(long aTeamId) {
        this.teamId = aTeamId;

        this.teamIdSetted = true;

        this.setTeamIdNull(false);
    } // end setTeamId()

    /**
     * Get TeamId Has Been Setted
     *
     * @return teamId
     */
    final public boolean isTeamIdSetted() {
        return this.teamIdSetted;
    } // end isTeamIdSetted()

    /**
     * Set TeamId Null
     */
    final public void setTeamIdNull() {
        this.teamIdNull = true;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamIdNull(boolean aNullFlag) {
        this.teamIdNull = aNullFlag;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamIdNull() {
        return this.teamIdNull;
    } // end isTeamIdNull()

    /**
     * Get DepartmentId
     *
     * @return departmentId
     */
    final public long getDepartmentId() {
        return departmentId;
    } // end getDepartmentId()

    /**
     * Set DepartmentId
     *
     * @param aDepartmentId
     */
    final public void setDepartmentId(long aDepartmentId) {
        this.departmentId = aDepartmentId;

        this.departmentIdSetted = true;

        this.setDepartmentIdNull(false);
    } // end setDepartmentId()

    /**
     * Get DepartmentId Has Been Setted
     *
     * @return departmentId
     */
    final public boolean isDepartmentIdSetted() {
        return this.departmentIdSetted;
    } // end isDepartmentIdSetted()

    /**
     * Set DepartmentId Null
     */
    final public void setDepartmentIdNull() {
        this.departmentIdNull = true;
    } // end setDepartmentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDepartmentIdNull(boolean aNullFlag) {
        this.departmentIdNull = aNullFlag;
    } // end setDepartmentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDepartmentIdNull() {
        return this.departmentIdNull;
    } // end isDepartmentIdNull()

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

        if ((obj instanceof BpmEmployeeRoleRelate) == false) {
            return false;
        } // end if

        BpmEmployeeRoleRelate other = (BpmEmployeeRoleRelate) obj;

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

        buffer.append("bpmRoleId=");
        buffer.append(this.bpmRoleId);
        buffer.append("\r\n");

        buffer.append("businessInstanceId=");
        buffer.append(this.businessInstanceId);
        buffer.append("\r\n");

        buffer.append("businessType=");
        buffer.append(this.businessType);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("sysModuleId=");
        buffer.append(this.sysModuleId);
        buffer.append("\r\n");

        buffer.append("employeeId=");
        buffer.append(this.employeeId);
        buffer.append("\r\n");

        buffer.append("employeeName=");
        buffer.append(this.employeeName);
        buffer.append("\r\n");

        buffer.append("bpmRoleName=");
        buffer.append(this.bpmRoleName);
        buffer.append("\r\n");

        buffer.append("bpmRoleKey=");
        buffer.append(this.bpmRoleKey);
        buffer.append("\r\n");

        buffer.append("sysModuleCode=");
        buffer.append(this.sysModuleCode);
        buffer.append("\r\n");

        buffer.append("sysModuleName=");
        buffer.append(this.sysModuleName);
        buffer.append("\r\n");

        buffer.append("employeeCode=");
        buffer.append(this.employeeCode);
        buffer.append("\r\n");

        buffer.append("projectId=");
        buffer.append(this.projectId);
        buffer.append("\r\n");

        buffer.append("productId=");
        buffer.append(this.productId);
        buffer.append("\r\n");

        buffer.append("teamId=");
        buffer.append(this.teamId);
        buffer.append("\r\n");

        buffer.append("departmentId=");
        buffer.append(this.departmentId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BpmEmployeeRoleRelate
