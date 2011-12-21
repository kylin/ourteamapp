/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-19 16:45:43
 *
 * @model auto gen
 */
public class BpmProcessRolePurviewBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmProcessRolePurview objBpmProcessRolePurview;

    static {
        mappedDaoFields.put("id",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.Id);

        mappedDaoFields.put("canBreak",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.CanBreak);

        mappedDaoFields.put("canStart",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.CanStart);

        mappedDaoFields.put("processDefineId",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.ProcessDefineId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.Remarks);

        mappedDaoFields.put("roleId",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.RoleId);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.Status);

        mappedDaoFields.put("roleName",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.RoleName);

        mappedDaoFields.put("roleCode",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.RoleCode);

        mappedDaoFields.put("canReAssign",
            com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO.CanReAssign);
    } 

    /**
     * Creates a new BpmProcessRolePurviewBean object.
     */
    public BpmProcessRolePurviewBean() {
        super();

        objBpmProcessRolePurview = new com.ourteam.bpm.dao.BpmProcessRolePurview();
    } // end BpmProcessRolePurviewBean()

    /**
     * Creates a new BpmProcessRolePurviewBean object.
     *
     * @param aBpmProcessRolePurview DOCUMENT ME!
     */
    public BpmProcessRolePurviewBean(
        com.ourteam.bpm.dao.BpmProcessRolePurview aBpmProcessRolePurview) {
        super();

        objBpmProcessRolePurview = aBpmProcessRolePurview;
    } // end BpmProcessRolePurviewBean()

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
    public com.ourteam.bpm.dao.BpmProcessRolePurview convertToBpmProcessRolePurview() {
        return objBpmProcessRolePurview;
    } // end convertToBpmProcessRolePurview()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmProcessRolePurview.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmProcessRolePurview.setId(aId);
    } // end setId()

    /**
     * Get CanBreak
     *
     * @return canBreak
     */
    public String getCanBreak() {
        return objBpmProcessRolePurview.getCanBreak();
    } // end getCanBreak()

    /**
     * Set CanBreak
     *
     * @param aCanBreak
     */
    public void setCanBreak(String aCanBreak) {
        this.objBpmProcessRolePurview.setCanBreak(aCanBreak);
    } // end setCanBreak()

    /**
     * Get CanStart
     *
     * @return canStart
     */
    public String getCanStart() {
        return objBpmProcessRolePurview.getCanStart();
    } // end getCanStart()

    /**
     * Set CanStart
     *
     * @param aCanStart
     */
    public void setCanStart(String aCanStart) {
        this.objBpmProcessRolePurview.setCanStart(aCanStart);
    } // end setCanStart()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    public long getProcessDefineId() {
        return objBpmProcessRolePurview.getProcessDefineId();
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    public void setProcessDefineId(long aProcessDefineId) {
        this.objBpmProcessRolePurview.setProcessDefineId(aProcessDefineId);
    } // end setProcessDefineId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmProcessRolePurview.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmProcessRolePurview.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get RoleId
     *
     * @return roleId
     */
    public long getRoleId() {
        return objBpmProcessRolePurview.getRoleId();
    } // end getRoleId()

    /**
     * Set RoleId
     *
     * @param aRoleId
     */
    public void setRoleId(long aRoleId) {
        this.objBpmProcessRolePurview.setRoleId(aRoleId);
    } // end setRoleId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmProcessRolePurview.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmProcessRolePurview.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get RoleName
     *
     * @return roleName
     */
    public String getRoleName() {
        return objBpmProcessRolePurview.getRoleName();
    } // end getRoleName()

    /**
     * Set RoleName
     *
     * @param aRoleName
     */
    public void setRoleName(String aRoleName) {
        this.objBpmProcessRolePurview.setRoleName(aRoleName);
    } // end setRoleName()

    /**
     * Get RoleCode
     *
     * @return roleCode
     */
    public String getRoleCode() {
        return objBpmProcessRolePurview.getRoleCode();
    } // end getRoleCode()

    /**
     * Set RoleCode
     *
     * @param aRoleCode
     */
    public void setRoleCode(String aRoleCode) {
        this.objBpmProcessRolePurview.setRoleCode(aRoleCode);
    } // end setRoleCode()

    /**
     * Get CanReAssign
     *
     * @return canReAssign
     */
    public String getCanReAssign() {
        return objBpmProcessRolePurview.getCanReAssign();
    } // end getCanReAssign()

    /**
     * Set CanReAssign
     *
     * @param aCanReAssign
     */
    public void setCanReAssign(String aCanReAssign) {
        this.objBpmProcessRolePurview.setCanReAssign(aCanReAssign);
    } // end setCanReAssign()

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

        if ((obj instanceof BpmProcessRolePurviewBean) == false) {
            return false;
        } // end if

        BpmProcessRolePurviewBean other = (BpmProcessRolePurviewBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmProcessRolePurview tempBpmProcessRolePurview = other.convertToBpmProcessRolePurview();

        if ((tempBpmProcessRolePurview == null) ||
                (this.objBpmProcessRolePurview == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmProcessRolePurview == this.objBpmProcessRolePurview) ||
                tempBpmProcessRolePurview.equals(this.objBpmProcessRolePurview)) {
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
     * @param aBpmProcessRolePurviews DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessRolePurviewBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessRolePurview[] aBpmProcessRolePurviews) {
        return toArray(aBpmProcessRolePurviews, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessRolePurviews DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessRolePurviewBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessRolePurview[] aBpmProcessRolePurviews,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmProcessRolePurviews)) {
            return new BpmProcessRolePurviewBean[0];
        } // end if

        int length = aBpmProcessRolePurviews.length;

        BpmProcessRolePurviewBean[] beans = new BpmProcessRolePurviewBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessRolePurviewBean(aBpmProcessRolePurviews[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessRolePurviewBean(aBpmProcessRolePurviews[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmProcessRolePurviews[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmProcessRolePurviewBean
