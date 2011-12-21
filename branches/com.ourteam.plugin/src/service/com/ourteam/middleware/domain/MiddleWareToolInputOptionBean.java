/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-08 10:59:52
 *
 * @model auto gen
 */
public class MiddleWareToolInputOptionBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareToolInputOption objMiddleWareToolInputOption;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.Id);

        mappedDaoFields.put("displayLabel",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.DisplayLabel);

        mappedDaoFields.put("realValue",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.RealValue);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.Remarks);

        mappedDaoFields.put("sortIndex",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.Status);

        mappedDaoFields.put("toolInputId",
            com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO.ToolInputId);
    } 

    /**
     * Creates a new MiddleWareToolInputOptionBean object.
     */
    public MiddleWareToolInputOptionBean() {
        super();

        objMiddleWareToolInputOption = new com.ourteam.middleware.dao.MiddleWareToolInputOption();
    } // end MiddleWareToolInputOptionBean()

    /**
     * Creates a new MiddleWareToolInputOptionBean object.
     *
     * @param aMiddleWareToolInputOption DOCUMENT ME!
     */
    public MiddleWareToolInputOptionBean(
        com.ourteam.middleware.dao.MiddleWareToolInputOption aMiddleWareToolInputOption) {
        super();

        objMiddleWareToolInputOption = aMiddleWareToolInputOption;
    } // end MiddleWareToolInputOptionBean()

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
    public com.ourteam.middleware.dao.MiddleWareToolInputOption convertToMiddleWareToolInputOption() {
        return objMiddleWareToolInputOption;
    } // end convertToMiddleWareToolInputOption()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareToolInputOption.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareToolInputOption.setId(aId);
    } // end setId()

    /**
     * Get DisplayLabel
     *
     * @return displayLabel
     */
    public String getDisplayLabel() {
        return objMiddleWareToolInputOption.getDisplayLabel();
    } // end getDisplayLabel()

    /**
     * Set DisplayLabel
     *
     * @param aDisplayLabel
     */
    public void setDisplayLabel(String aDisplayLabel) {
        this.objMiddleWareToolInputOption.setDisplayLabel(aDisplayLabel);
    } // end setDisplayLabel()

    /**
     * Get RealValue
     *
     * @return realValue
     */
    public String getRealValue() {
        return objMiddleWareToolInputOption.getRealValue();
    } // end getRealValue()

    /**
     * Set RealValue
     *
     * @param aRealValue
     */
    public void setRealValue(String aRealValue) {
        this.objMiddleWareToolInputOption.setRealValue(aRealValue);
    } // end setRealValue()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareToolInputOption.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareToolInputOption.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objMiddleWareToolInputOption.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(int aSortIndex) {
        this.objMiddleWareToolInputOption.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareToolInputOption.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareToolInputOption.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ToolInputId
     *
     * @return toolInputId
     */
    public long getToolInputId() {
        return objMiddleWareToolInputOption.getToolInputId();
    } // end getToolInputId()

    /**
     * Set ToolInputId
     *
     * @param aToolInputId
     */
    public void setToolInputId(long aToolInputId) {
        this.objMiddleWareToolInputOption.setToolInputId(aToolInputId);
    } // end setToolInputId()

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

        if ((obj instanceof MiddleWareToolInputOptionBean) == false) {
            return false;
        } // end if

        MiddleWareToolInputOptionBean other = (MiddleWareToolInputOptionBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareToolInputOption tempMiddleWareToolInputOption =
            other.convertToMiddleWareToolInputOption();

        if ((tempMiddleWareToolInputOption == null) ||
                (this.objMiddleWareToolInputOption == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareToolInputOption == this.objMiddleWareToolInputOption) ||
                tempMiddleWareToolInputOption.equals(
                    this.objMiddleWareToolInputOption)) {
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
     * @param aMiddleWareToolInputOptions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolInputOptionBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolInputOption[] aMiddleWareToolInputOptions) {
        return toArray(aMiddleWareToolInputOptions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputOptions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolInputOptionBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolInputOption[] aMiddleWareToolInputOptions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(
                    aMiddleWareToolInputOptions)) {
            return new MiddleWareToolInputOptionBean[0];
        } // end if

        int length = aMiddleWareToolInputOptions.length;

        MiddleWareToolInputOptionBean[] beans = new MiddleWareToolInputOptionBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolInputOptionBean(aMiddleWareToolInputOptions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolInputOptionBean(aMiddleWareToolInputOptions[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareToolInputOptions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareToolInputOptionBean
