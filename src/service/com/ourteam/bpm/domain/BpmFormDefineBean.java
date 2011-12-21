/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-11 14:52:24
 *
 * @model auto gen
 */
public class BpmFormDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmFormDefine objBpmFormDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmFormDefineDAO.Id);

        mappedDaoFields.put("formKey",
            com.ourteam.bpm.dao.IBpmFormDefineDAO.FormKey);

        mappedDaoFields.put("formName",
            com.ourteam.bpm.dao.IBpmFormDefineDAO.FormName);

        mappedDaoFields.put("processDefineId",
            com.ourteam.bpm.dao.IBpmFormDefineDAO.ProcessDefineId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmFormDefineDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmFormDefineDAO.Status);

        mappedDaoFields.put("formXml",
            com.ourteam.bpm.dao.IBpmFormDefineDAO.FormXml);
    } 

    /**
     * Creates a new BpmFormDefineBean object.
     */
    public BpmFormDefineBean() {
        super();

        objBpmFormDefine = new com.ourteam.bpm.dao.BpmFormDefine();
    } // end BpmFormDefineBean()

    /**
     * Creates a new BpmFormDefineBean object.
     *
     * @param aBpmFormDefine DOCUMENT ME!
     */
    public BpmFormDefineBean(com.ourteam.bpm.dao.BpmFormDefine aBpmFormDefine) {
        super();

        objBpmFormDefine = aBpmFormDefine;
    } // end BpmFormDefineBean()

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
    public com.ourteam.bpm.dao.BpmFormDefine convertToBpmFormDefine() {
        return objBpmFormDefine;
    } // end convertToBpmFormDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmFormDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmFormDefine.setId(aId);
    } // end setId()

    /**
     * Get FormKey
     *
     * @return formKey
     */
    public String getFormKey() {
        return objBpmFormDefine.getFormKey();
    } // end getFormKey()

    /**
     * Set FormKey
     *
     * @param aFormKey
     */
    public void setFormKey(String aFormKey) {
        this.objBpmFormDefine.setFormKey(aFormKey);
    } // end setFormKey()

    /**
     * Get FormName
     *
     * @return formName
     */
    public String getFormName() {
        return objBpmFormDefine.getFormName();
    } // end getFormName()

    /**
     * Set FormName
     *
     * @param aFormName
     */
    public void setFormName(String aFormName) {
        this.objBpmFormDefine.setFormName(aFormName);
    } // end setFormName()

    /**
     * Get ProcessDefineId
     *
     * @return processDefineId
     */
    public long getProcessDefineId() {
        return objBpmFormDefine.getProcessDefineId();
    } // end getProcessDefineId()

    /**
     * Set ProcessDefineId
     *
     * @param aProcessDefineId
     */
    public void setProcessDefineId(long aProcessDefineId) {
        this.objBpmFormDefine.setProcessDefineId(aProcessDefineId);
    } // end setProcessDefineId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmFormDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmFormDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmFormDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmFormDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get FormXml
     *
     * @return formXml
     */
    public String getFormXml() {
        return objBpmFormDefine.getFormXml();
    } // end getFormXml()

    /**
     * Set FormXml
     *
     * @param aFormXml
     */
    public void setFormXml(String aFormXml) {
        this.objBpmFormDefine.setFormXml(aFormXml);
    } // end setFormXml()

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

        if ((obj instanceof BpmFormDefineBean) == false) {
            return false;
        } // end if

        BpmFormDefineBean other = (BpmFormDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmFormDefine tempBpmFormDefine = other.convertToBpmFormDefine();

        if ((tempBpmFormDefine == null) || (this.objBpmFormDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmFormDefine == this.objBpmFormDefine) ||
                tempBpmFormDefine.equals(this.objBpmFormDefine)) {
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
     * @param aBpmFormDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmFormDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmFormDefine[] aBpmFormDefines) {
        return toArray(aBpmFormDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmFormDefineBean[] toArray(
        com.ourteam.bpm.dao.BpmFormDefine[] aBpmFormDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmFormDefines)) {
            return new BpmFormDefineBean[0];
        } // end if

        int length = aBpmFormDefines.length;

        BpmFormDefineBean[] beans = new BpmFormDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmFormDefineBean(aBpmFormDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmFormDefineBean(aBpmFormDefines[i]);

                aCallBack.populate(beans[i], new Object[] { aBpmFormDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmFormDefineBean
