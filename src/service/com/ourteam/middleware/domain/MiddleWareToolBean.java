/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-12-17 17:31:58
 *
 * @model auto gen
 */
public class MiddleWareToolBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.MiddleWareTool objMiddleWareTool;

    static {
        mappedDaoFields.put("id",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.Id);

        mappedDaoFields.put("completeKeyWork",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.CompleteKeyWork);

        mappedDaoFields.put("inputForm",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.InputForm);

        mappedDaoFields.put("outputFile",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.OutputFile);

        mappedDaoFields.put("remarks",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.Status);

        mappedDaoFields.put("succeedKeyWork",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.SucceedKeyWork);

        mappedDaoFields.put("timeOut",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.TimeOut);

        mappedDaoFields.put("toolGroupId",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ToolGroupId);

        mappedDaoFields.put("toolScript",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ToolScript);

        mappedDaoFields.put("toolScriptType",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ToolScriptType);

        mappedDaoFields.put("lastEditorId",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.LastEditorId);

        mappedDaoFields.put("lastEditTime",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.LastEditTime);

        mappedDaoFields.put("lastEditorName",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.LastEditorName);

        mappedDaoFields.put("toolName",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ToolName);

        mappedDaoFields.put("providerName",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ProviderName);

        mappedDaoFields.put("middleWareName",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.MiddleWareName);

        mappedDaoFields.put("middleWareVersion",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.MiddleWareVersion);

        mappedDaoFields.put("middleWareType",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.MiddleWareType);

        mappedDaoFields.put("providerId",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ProviderId);

        mappedDaoFields.put("toolProgram",
            com.ourteam.middleware.dao.IMiddleWareToolDAO.ToolProgram);
    } 

    /**
     * Creates a new MiddleWareToolBean object.
     */
    public MiddleWareToolBean() {
        super();

        objMiddleWareTool = new com.ourteam.middleware.dao.MiddleWareTool();
    } // end MiddleWareToolBean()

    /**
     * Creates a new MiddleWareToolBean object.
     *
     * @param aMiddleWareTool DOCUMENT ME!
     */
    public MiddleWareToolBean(
        com.ourteam.middleware.dao.MiddleWareTool aMiddleWareTool) {
        super();

        objMiddleWareTool = aMiddleWareTool;
    } // end MiddleWareToolBean()

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
    public com.ourteam.middleware.dao.MiddleWareTool convertToMiddleWareTool() {
        return objMiddleWareTool;
    } // end convertToMiddleWareTool()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objMiddleWareTool.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objMiddleWareTool.setId(aId);
    } // end setId()

    /**
     * Get CompleteKeyWork
     *
     * @return completeKeyWork
     */
    public String getCompleteKeyWork() {
        return objMiddleWareTool.getCompleteKeyWork();
    } // end getCompleteKeyWork()

    /**
     * Set CompleteKeyWork
     *
     * @param aCompleteKeyWork
     */
    public void setCompleteKeyWork(String aCompleteKeyWork) {
        this.objMiddleWareTool.setCompleteKeyWork(aCompleteKeyWork);
    } // end setCompleteKeyWork()

    /**
     * Get InputForm
     *
     * @return inputForm
     */
    public String getInputForm() {
        return objMiddleWareTool.getInputForm();
    } // end getInputForm()

    /**
     * Set InputForm
     *
     * @param aInputForm
     */
    public void setInputForm(String aInputForm) {
        this.objMiddleWareTool.setInputForm(aInputForm);
    } // end setInputForm()

    /**
     * Get OutputFile
     *
     * @return outputFile
     */
    public String getOutputFile() {
        return objMiddleWareTool.getOutputFile();
    } // end getOutputFile()

    /**
     * Set OutputFile
     *
     * @param aOutputFile
     */
    public void setOutputFile(String aOutputFile) {
        this.objMiddleWareTool.setOutputFile(aOutputFile);
    } // end setOutputFile()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objMiddleWareTool.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objMiddleWareTool.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objMiddleWareTool.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objMiddleWareTool.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get SucceedKeyWork
     *
     * @return succeedKeyWork
     */
    public String getSucceedKeyWork() {
        return objMiddleWareTool.getSucceedKeyWork();
    } // end getSucceedKeyWork()

    /**
     * Set SucceedKeyWork
     *
     * @param aSucceedKeyWork
     */
    public void setSucceedKeyWork(String aSucceedKeyWork) {
        this.objMiddleWareTool.setSucceedKeyWork(aSucceedKeyWork);
    } // end setSucceedKeyWork()

    /**
     * Get TimeOut
     *
     * @return timeOut
     */
    public int getTimeOut() {
        return objMiddleWareTool.getTimeOut();
    } // end getTimeOut()

    /**
     * Set TimeOut
     *
     * @param aTimeOut
     */
    public void setTimeOut(int aTimeOut) {
        this.objMiddleWareTool.setTimeOut(aTimeOut);
    } // end setTimeOut()

    /**
     * Get ToolGroupId
     *
     * @return toolGroupId
     */
    public long getToolGroupId() {
        return objMiddleWareTool.getToolGroupId();
    } // end getToolGroupId()

    /**
     * Set ToolGroupId
     *
     * @param aToolGroupId
     */
    public void setToolGroupId(long aToolGroupId) {
        this.objMiddleWareTool.setToolGroupId(aToolGroupId);
    } // end setToolGroupId()

    /**
     * Get ToolScript
     *
     * @return toolScript
     */
    public String getToolScript() {
        return objMiddleWareTool.getToolScript();
    } // end getToolScript()

    /**
     * Set ToolScript
     *
     * @param aToolScript
     */
    public void setToolScript(String aToolScript) {
        this.objMiddleWareTool.setToolScript(aToolScript);
    } // end setToolScript()

    /**
     * Get ToolScriptType
     *
     * @return toolScriptType
     */
    public String getToolScriptType() {
        return objMiddleWareTool.getToolScriptType();
    } // end getToolScriptType()

    /**
     * Set ToolScriptType
     *
     * @param aToolScriptType
     */
    public void setToolScriptType(String aToolScriptType) {
        this.objMiddleWareTool.setToolScriptType(aToolScriptType);
    } // end setToolScriptType()

    /**
     * Get LastEditorId
     *
     * @return lastEditorId
     */
    public long getLastEditorId() {
        return objMiddleWareTool.getLastEditorId();
    } // end getLastEditorId()

    /**
     * Set LastEditorId
     *
     * @param aLastEditorId
     */
    public void setLastEditorId(long aLastEditorId) {
        this.objMiddleWareTool.setLastEditorId(aLastEditorId);
    } // end setLastEditorId()

    /**
     * Get LastEditTime
     *
     * @return lastEditTime
     */
    public java.util.Date getLastEditTime() {
        return objMiddleWareTool.getLastEditTime();
    } // end getLastEditTime()

    /**
     * Set LastEditTime
     *
     * @param aLastEditTime
     */
    public void setLastEditTime(java.util.Date aLastEditTime) {
        this.objMiddleWareTool.setLastEditTime(aLastEditTime);
    } // end setLastEditTime()

    /**
     * Get LastEditorName
     *
     * @return lastEditorName
     */
    public String getLastEditorName() {
        return objMiddleWareTool.getLastEditorName();
    } // end getLastEditorName()

    /**
     * Get ToolName
     *
     * @return toolName
     */
    public String getToolName() {
        return objMiddleWareTool.getToolName();
    } // end getToolName()

    /**
     * Set ToolName
     *
     * @param aToolName
     */
    public void setToolName(String aToolName) {
        this.objMiddleWareTool.setToolName(aToolName);
    } // end setToolName()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    public String getProviderName() {
        return objMiddleWareTool.getProviderName();
    } // end getProviderName()

    /**
     * Get MiddleWareName
     *
     * @return middleWareName
     */
    public String getMiddleWareName() {
        return objMiddleWareTool.getMiddleWareName();
    } // end getMiddleWareName()

    /**
     * Get MiddleWareVersion
     *
     * @return middleWareVersion
     */
    public String getMiddleWareVersion() {
        return objMiddleWareTool.getMiddleWareVersion();
    } // end getMiddleWareVersion()

    /**
     * Get MiddleWareType
     *
     * @return middleWareType
     */
    public String getMiddleWareType() {
        return objMiddleWareTool.getMiddleWareType();
    } // end getMiddleWareType()

    /**
     * Get ProviderId
     *
     * @return providerId
     */
    public long getProviderId() {
        return objMiddleWareTool.getProviderId();
    } // end getProviderId()

    /**
     * Set ProviderId
     *
     * @param aProviderId
     */
    public void setProviderId(long aProviderId) {
        this.objMiddleWareTool.setProviderId(aProviderId);
    } // end setProviderId()

    /**
     * Get ToolProgram
     *
     * @return toolProgram
     */
    public String getToolProgram() {
        return objMiddleWareTool.getToolProgram();
    } // end getToolProgram()

    /**
     * Set ToolProgram
     *
     * @param aToolProgram
     */
    public void setToolProgram(String aToolProgram) {
        this.objMiddleWareTool.setToolProgram(aToolProgram);
    } // end setToolProgram()

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

        if ((obj instanceof MiddleWareToolBean) == false) {
            return false;
        } // end if

        MiddleWareToolBean other = (MiddleWareToolBean) obj;

        boolean isEqual = false;

        com.ourteam.middleware.dao.MiddleWareTool tempMiddleWareTool = other.convertToMiddleWareTool();

        if ((tempMiddleWareTool == null) || (this.objMiddleWareTool == null)) {
            isEqual = false;
        } // end if
        else if ((tempMiddleWareTool == this.objMiddleWareTool) ||
                tempMiddleWareTool.equals(this.objMiddleWareTool)) {
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
     * @param aMiddleWareTools DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareTool[] aMiddleWareTools) {
        return toArray(aMiddleWareTools, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareTools DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static MiddleWareToolBean[] toArray(
        com.ourteam.middleware.dao.MiddleWareTool[] aMiddleWareTools,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aMiddleWareTools)) {
            return new MiddleWareToolBean[0];
        } // end if

        int length = aMiddleWareTools.length;

        MiddleWareToolBean[] beans = new MiddleWareToolBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolBean(aMiddleWareTools[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new MiddleWareToolBean(aMiddleWareTools[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aMiddleWareTools[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end MiddleWareToolBean
