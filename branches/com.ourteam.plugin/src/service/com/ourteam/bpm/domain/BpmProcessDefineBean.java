/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-23 16:28:46
 *
 * @model auto gen
 */
public class BpmProcessDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmProcessDefine objBpmProcessDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmProcessDefineDAO.Id);

        mappedDaoFields.put("lastEditorId",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.LastEditorId);

        mappedDaoFields.put("lastEditDate",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.LastEditDate);

        mappedDaoFields.put("processKey",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.ProcessKey);

        mappedDaoFields.put("processName",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.ProcessName);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.Status);

        mappedDaoFields.put("catalogId",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.CatalogId);

        mappedDaoFields.put("processVersion",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.ProcessVersion);

        mappedDaoFields.put("lastEditorName",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.LastEditorName);

        mappedDaoFields.put("startFormKey",
            com.ourteam.bpm.dao.IBpmProcessDefineDAO.StartFormKey);
    } 

    /**
     * Creates a new BpmProcessDefineBean object.
     */
    public BpmProcessDefineBean() {
        super();

        objBpmProcessDefine = new com.ourteam.bpm.dao.BpmProcessDefine();
    } // end BpmProcessDefineBean()

    /**
     * Creates a new BpmProcessDefineBean object.
     *
     * @param aBpmProcessDefine DOCUMENT ME!
     */
    public BpmProcessDefineBean(
        com.ourteam.bpm.dao.BpmProcessDefine aBpmProcessDefine) {
        super();

        objBpmProcessDefine = aBpmProcessDefine;
    } // end BpmProcessDefineBean()

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
    public com.ourteam.bpm.dao.BpmProcessDefine convertToBpmProcessDefine() {
        return objBpmProcessDefine;
    } // end convertToBpmProcessDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmProcessDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmProcessDefine.setId(aId);
    } // end setId()

    /**
     * Get LastEditorId
     *
     * @return lastEditorId
     */
    public long getLastEditorId() {
        return objBpmProcessDefine.getLastEditorId();
    } // end getLastEditorId()

    /**
     * Set LastEditorId
     *
     * @param aLastEditorId
     */
    public void setLastEditorId(long aLastEditorId) {
        this.objBpmProcessDefine.setLastEditorId(aLastEditorId);
    } // end setLastEditorId()

    /**
     * Get LastEditDate
     *
     * @return lastEditDate
     */
    public java.util.Date getLastEditDate() {
        return objBpmProcessDefine.getLastEditDate();
    } // end getLastEditDate()

    /**
     * Set LastEditDate
     *
     * @param aLastEditDate
     */
    public void setLastEditDate(java.util.Date aLastEditDate) {
        this.objBpmProcessDefine.setLastEditDate(aLastEditDate);
    } // end setLastEditDate()

    /**
     * Get ProcessKey
     *
     * @return processKey
     */
    public String getProcessKey() {
        return objBpmProcessDefine.getProcessKey();
    } // end getProcessKey()

    /**
     * Set ProcessKey
     *
     * @param aProcessKey
     */
    public void setProcessKey(String aProcessKey) {
        this.objBpmProcessDefine.setProcessKey(aProcessKey);
    } // end setProcessKey()

    /**
     * Get ProcessName
     *
     * @return processName
     */
    public String getProcessName() {
        return objBpmProcessDefine.getProcessName();
    } // end getProcessName()

    /**
     * Set ProcessName
     *
     * @param aProcessName
     */
    public void setProcessName(String aProcessName) {
        this.objBpmProcessDefine.setProcessName(aProcessName);
    } // end setProcessName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmProcessDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmProcessDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmProcessDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmProcessDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get CatalogId
     *
     * @return catalogId
     */
    public long getCatalogId() {
        return objBpmProcessDefine.getCatalogId();
    } // end getCatalogId()

    /**
     * Set CatalogId
     *
     * @param aCatalogId
     */
    public void setCatalogId(long aCatalogId) {
        this.objBpmProcessDefine.setCatalogId(aCatalogId);
    } // end setCatalogId()

    /**
     * Get ProcessVersion
     *
     * @return processVersion
     */
    public String getProcessVersion() {
        return objBpmProcessDefine.getProcessVersion();
    } // end getProcessVersion()

    /**
     * Set ProcessVersion
     *
     * @param aProcessVersion
     */
    public void setProcessVersion(String aProcessVersion) {
        this.objBpmProcessDefine.setProcessVersion(aProcessVersion);
    } // end setProcessVersion()

    /**
     * Get LastEditorName
     *
     * @return lastEditorName
     */
    public String getLastEditorName() {
        return objBpmProcessDefine.getLastEditorName();
    } // end getLastEditorName()

    /**
     * Get StartFormKey
     *
     * @return startFormKey
     */
    public String getStartFormKey() {
        return objBpmProcessDefine.getStartFormKey();
    } // end getStartFormKey()

    /**
     * Set StartFormKey
     *
     * @param aStartFormKey
     */
    public void setStartFormKey(String aStartFormKey) {
        this.objBpmProcessDefine.setStartFormKey(aStartFormKey);
    } // end setStartFormKey()

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

        if ((obj instanceof BpmProcessDefineBean) == false) {
            return false;
        } // end if

        BpmProcessDefineBean other = (BpmProcessDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmProcessDefine tempBpmProcessDefine = other.convertToBpmProcessDefine();

        if ((tempBpmProcessDefine == null) ||
                (this.objBpmProcessDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmProcessDefine == this.objBpmProcessDefine) ||
                tempBpmProcessDefine.equals(this.objBpmProcessDefine)) {
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
     * @param aBpmProcessDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessDefine[] aBpmProcessDefines) {
        return toArray(aBpmProcessDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessDefine[] aBpmProcessDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmProcessDefines)) {
            return new BpmProcessDefineBean[0];
        } // end if

        int length = aBpmProcessDefines.length;

        BpmProcessDefineBean[] beans = new BpmProcessDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessDefineBean(aBpmProcessDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessDefineBean(aBpmProcessDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmProcessDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmProcessDefineBean
