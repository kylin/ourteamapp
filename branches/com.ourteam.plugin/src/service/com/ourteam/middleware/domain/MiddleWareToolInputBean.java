/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-08 10:39:38
 *
 * @model auto gen
 */
public class MiddleWareToolInputBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareToolInput objMiddleWareToolInput;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.Id);

        mappedDaoFields.put("isRequired",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.IsRequired);

        mappedDaoFields.put("parameterCode",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ParameterCode);

        mappedDaoFields.put("parameterName",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ParameterName);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.Remarks);

        mappedDaoFields.put("sortIndex",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.Status);

        mappedDaoFields.put("toolId",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ToolId);

        mappedDaoFields.put("parameterType",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.ParameterType);

        mappedDaoFields.put("defaultValue",
            com.ourteam.middleware.dao.IMiddleWareToolInputDAO.DefaultValue);
    } 

    /**
     * Creates a new MiddleWareToolInputBean object.
     */
    public MiddleWareToolInputBean() {
        super();

        objMiddleWareToolInput = new com.ourteam.middleware.dao.MiddleWareToolInput();
    } // end MiddleWareToolInputBean()

    /**
     * Creates a new MiddleWareToolInputBean object.
     *
     * @param aMiddleWareToolInput DOCUMENT ME!
     */
    public MiddleWareToolInputBean(
        com.ourteam.middleware.dao.MiddleWareToolInput aMiddleWareToolInput) {
        super();

        objMiddleWareToolInput = aMiddleWareToolInput;
    } // end MiddleWareToolInputBean()

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
    public com.ourteam.middleware.dao.MiddleWareToolInput convertToMiddleWareToolInput() {
        return objMiddleWareToolInput;
    } // end convertToMiddleWareToolInput()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareToolInput.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareToolInput.setId(aId);
    } // end setId()

    /**
     * Get IsRequired
     *
     * @return isRequired
     */
    public String getIsRequired() {
        return objMiddleWareToolInput.getIsRequired();
    } // end getIsRequired()

    /**
     * Set IsRequired
     *
     * @param aIsRequired
     */
    public void setIsRequired(String aIsRequired) {
        this.objMiddleWareToolInput.setIsRequired(aIsRequired);
    } // end setIsRequired()

    /**
     * Get ParameterCode
     *
     * @return parameterCode
     */
    public String getParameterCode() {
        return objMiddleWareToolInput.getParameterCode();
    } // end getParameterCode()

    /**
     * Set ParameterCode
     *
     * @param aParameterCode
     */
    public void setParameterCode(String aParameterCode) {
        this.objMiddleWareToolInput.setParameterCode(aParameterCode);
    } // end setParameterCode()

    /**
     * Get ParameterName
     *
     * @return parameterName
     */
    public String getParameterName() {
        return objMiddleWareToolInput.getParameterName();
    } // end getParameterName()

    /**
     * Set ParameterName
     *
     * @param aParameterName
     */
    public void setParameterName(String aParameterName) {
        this.objMiddleWareToolInput.setParameterName(aParameterName);
    } // end setParameterName()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareToolInput.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareToolInput.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objMiddleWareToolInput.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(int aSortIndex) {
        this.objMiddleWareToolInput.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareToolInput.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareToolInput.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get ToolId
     *
     * @return toolId
     */
    public long getToolId() {
        return objMiddleWareToolInput.getToolId();
    } // end getToolId()

    /**
     * Set ToolId
     *
     * @param aToolId
     */
    public void setToolId(long aToolId) {
        this.objMiddleWareToolInput.setToolId(aToolId);
    } // end setToolId()

    /**
     * Get ParameterType
     *
     * @return parameterType
     */
    public String getParameterType() {
        return objMiddleWareToolInput.getParameterType();
    } // end getParameterType()

    /**
     * Set ParameterType
     *
     * @param aParameterType
     */
    public void setParameterType(String aParameterType) {
        this.objMiddleWareToolInput.setParameterType(aParameterType);
    } // end setParameterType()

    /**
     * Get DefaultValue
     *
     * @return defaultValue
     */
    public String getDefaultValue() {
        return objMiddleWareToolInput.getDefaultValue();
    } // end getDefaultValue()

    /**
     * Set DefaultValue
     *
     * @param aDefaultValue
     */
    public void setDefaultValue(String aDefaultValue) {
        this.objMiddleWareToolInput.setDefaultValue(aDefaultValue);
    } // end setDefaultValue()

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

        if ((obj instanceof MiddleWareToolInputBean) == false) {
            return false;
        } // end if

        MiddleWareToolInputBean other = (MiddleWareToolInputBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareToolInput tempMiddleWareToolInput = other.convertToMiddleWareToolInput();

        if ((tempMiddleWareToolInput == null) ||
                (this.objMiddleWareToolInput == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareToolInput == this.objMiddleWareToolInput) ||
                tempMiddleWareToolInput.equals(this.objMiddleWareToolInput)) {
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
     * @param aMiddleWareToolInputs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolInputBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolInput[] aMiddleWareToolInputs) {
        return toArray(aMiddleWareToolInputs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolInputBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareToolInput[] aMiddleWareToolInputs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWareToolInputs)) {
            return new MiddleWareToolInputBean[0];
        } // end if

        int length = aMiddleWareToolInputs.length;

        MiddleWareToolInputBean[] beans = new MiddleWareToolInputBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolInputBean(aMiddleWareToolInputs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolInputBean(aMiddleWareToolInputs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareToolInputs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareToolInputBean
