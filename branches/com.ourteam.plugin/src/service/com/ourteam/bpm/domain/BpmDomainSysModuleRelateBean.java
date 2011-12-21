/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-04 10:02:31
 *
 * @model auto gen
 */
public class BpmDomainSysModuleRelateBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmDomainSysModuleRelate objBpmDomainSysModuleRelate;

    static {
        mappedDaoFields.put("id",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.Id);

        mappedDaoFields.put("bpmDomainId",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.BpmDomainId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.Status);

        mappedDaoFields.put("sysModuleId",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.SysModuleId);

        mappedDaoFields.put("moduleName",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.ModuleName);

        mappedDaoFields.put("moduleCode",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.ModuleCode);

        mappedDaoFields.put("moduleIcon",
            com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO.ModuleIcon);
    } 

    /**
     * Creates a new BpmDomainSysModuleRelateBean object.
     */
    public BpmDomainSysModuleRelateBean() {
        super();

        objBpmDomainSysModuleRelate = new com.ourteam.bpm.dao.BpmDomainSysModuleRelate();
    } // end BpmDomainSysModuleRelateBean()

    /**
     * Creates a new BpmDomainSysModuleRelateBean object.
     *
     * @param aBpmDomainSysModuleRelate DOCUMENT ME!
     */
    public BpmDomainSysModuleRelateBean(
        com.ourteam.bpm.dao.BpmDomainSysModuleRelate aBpmDomainSysModuleRelate) {
        super();

        objBpmDomainSysModuleRelate = aBpmDomainSysModuleRelate;
    } // end BpmDomainSysModuleRelateBean()

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
    public com.ourteam.bpm.dao.BpmDomainSysModuleRelate convertToBpmDomainSysModuleRelate() {
        return objBpmDomainSysModuleRelate;
    } // end convertToBpmDomainSysModuleRelate()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmDomainSysModuleRelate.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmDomainSysModuleRelate.setId(aId);
    } // end setId()

    /**
     * Get BpmDomainId
     *
     * @return bpmDomainId
     */
    public long getBpmDomainId() {
        return objBpmDomainSysModuleRelate.getBpmDomainId();
    } // end getBpmDomainId()

    /**
     * Set BpmDomainId
     *
     * @param aBpmDomainId
     */
    public void setBpmDomainId(long aBpmDomainId) {
        this.objBpmDomainSysModuleRelate.setBpmDomainId(aBpmDomainId);
    } // end setBpmDomainId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmDomainSysModuleRelate.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmDomainSysModuleRelate.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmDomainSysModuleRelate.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmDomainSysModuleRelate.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SysModuleId
     *
     * @return sysModuleId
     */
    public long getSysModuleId() {
        return objBpmDomainSysModuleRelate.getSysModuleId();
    } // end getSysModuleId()

    /**
     * Set SysModuleId
     *
     * @param aSysModuleId
     */
    public void setSysModuleId(long aSysModuleId) {
        this.objBpmDomainSysModuleRelate.setSysModuleId(aSysModuleId);
    } // end setSysModuleId()

    /**
     * Get ModuleName
     *
     * @return moduleName
     */
    public String getModuleName() {
        return objBpmDomainSysModuleRelate.getModuleName();
    } // end getModuleName()

    /**
     * Get ModuleCode
     *
     * @return moduleCode
     */
    public String getModuleCode() {
        return objBpmDomainSysModuleRelate.getModuleCode();
    } // end getModuleCode()

    /**
     * Get ModuleIcon
     *
     * @return moduleIcon
     */
    public String getModuleIcon() {
        return objBpmDomainSysModuleRelate.getModuleIcon();
    } // end getModuleIcon()

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

        if ((obj instanceof BpmDomainSysModuleRelateBean) == false) {
            return false;
        } // end if

        BpmDomainSysModuleRelateBean other = (BpmDomainSysModuleRelateBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmDomainSysModuleRelate tempBpmDomainSysModuleRelate =
            other.convertToBpmDomainSysModuleRelate();

        if ((tempBpmDomainSysModuleRelate == null) ||
                (this.objBpmDomainSysModuleRelate == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmDomainSysModuleRelate == this.objBpmDomainSysModuleRelate) ||
                tempBpmDomainSysModuleRelate.equals(
                    this.objBpmDomainSysModuleRelate)) {
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
     * @param aBpmDomainSysModuleRelates DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmDomainSysModuleRelateBean[] toArray(
        com.ourteam.bpm.dao.BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates) {
        return toArray(aBpmDomainSysModuleRelates, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomainSysModuleRelates DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmDomainSysModuleRelateBean[] toArray(
        com.ourteam.bpm.dao.BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aBpmDomainSysModuleRelates)) {
            return new BpmDomainSysModuleRelateBean[0];
        } // end if

        int length = aBpmDomainSysModuleRelates.length;

        BpmDomainSysModuleRelateBean[] beans = new BpmDomainSysModuleRelateBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmDomainSysModuleRelateBean(aBpmDomainSysModuleRelates[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmDomainSysModuleRelateBean(aBpmDomainSysModuleRelates[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmDomainSysModuleRelates[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmDomainSysModuleRelateBean
