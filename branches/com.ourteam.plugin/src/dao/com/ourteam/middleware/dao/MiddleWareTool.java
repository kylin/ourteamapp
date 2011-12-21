/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * Generate Date 2011-12-17 17:30:54
 *
 * @author Auto Gen
 */
public class MiddleWareTool implements java.io.Serializable {
    /**
     * Creates a new MiddleWareTool object.
     */
    public MiddleWareTool() {
        super();
    } // end MiddleWareTool()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String completeKeyWork;

    /** Attribute  Be Seted Falg */
    private boolean completeKeyWorkSetted = false;

    /** Attribute  is Null Falg */
    private boolean completeKeyWorkNull = false;

    /** Attribute */
    private String inputForm;

    /** Attribute  Be Seted Falg */
    private boolean inputFormSetted = false;

    /** Attribute  is Null Falg */
    private boolean inputFormNull = false;

    /** Attribute */
    private String outputFile;

    /** Attribute  Be Seted Falg */
    private boolean outputFileSetted = false;

    /** Attribute  is Null Falg */
    private boolean outputFileNull = false;

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
    private String succeedKeyWork;

    /** Attribute  Be Seted Falg */
    private boolean succeedKeyWorkSetted = false;

    /** Attribute  is Null Falg */
    private boolean succeedKeyWorkNull = false;

    /** Attribute */
    private int timeOut;

    /** Attribute  Be Seted Falg */
    private boolean timeOutSetted = false;

    /** Attribute  is Null Falg */
    private boolean timeOutNull = false;

    /** Attribute */
    private long toolGroupId;

    /** Attribute  Be Seted Falg */
    private boolean toolGroupIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolGroupIdNull = false;

    /** Attribute */
    private String toolScript;

    /** Attribute  Be Seted Falg */
    private boolean toolScriptSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolScriptNull = false;

    /** Attribute */
    private String toolScriptType;

    /** Attribute  Be Seted Falg */
    private boolean toolScriptTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolScriptTypeNull = false;

    /** Attribute */
    private long lastEditorId;

    /** Attribute  Be Seted Falg */
    private boolean lastEditorIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditorIdNull = false;

    /** Attribute */
    private java.util.Date lastEditTime;

    /** Attribute  Be Seted Falg */
    private boolean lastEditTimeSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditTimeNull = false;

    /** Attribute */
    private String lastEditorName;

    /** Attribute  Be Seted Falg */
    private boolean lastEditorNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean lastEditorNameNull = false;

    /** Attribute */
    private String toolName;

    /** Attribute  Be Seted Falg */
    private boolean toolNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolNameNull = false;

    /** Attribute */
    private long providerId;

    /** Attribute  Be Seted Falg */
    private boolean providerIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerIdNull = false;

    /** Attribute */
    private String providerName;

    /** Attribute  Be Seted Falg */
    private boolean providerNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerNameNull = false;

    /** Attribute */
    private String middleWareName;

    /** Attribute  Be Seted Falg */
    private boolean middleWareNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareNameNull = false;

    /** Attribute */
    private String middleWareVersion;

    /** Attribute  Be Seted Falg */
    private boolean middleWareVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareVersionNull = false;

    /** Attribute */
    private String middleWareType;

    /** Attribute  Be Seted Falg */
    private boolean middleWareTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareTypeNull = false;

    /** Attribute */
    private String toolProgram;

    /** Attribute  Be Seted Falg */
    private boolean toolProgramSetted = false;

    /** Attribute  is Null Falg */
    private boolean toolProgramNull = false;

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
     * Get CompleteKeyWork
     *
     * @return completeKeyWork
     */
    final public String getCompleteKeyWork() {
        if (isCompleteKeyWorkNull()) {
            return null;
        } // end if
        else {
            return completeKeyWork;
        } // end else
    } // end getCompleteKeyWork()

    /**
     * Set CompleteKeyWork
     *
     * @param aCompleteKeyWork
     */
    final public void setCompleteKeyWork(String aCompleteKeyWork) {
        this.completeKeyWork = aCompleteKeyWork;

        this.completeKeyWorkSetted = true;

        this.setCompleteKeyWorkNull(this.completeKeyWork == null);
    } // end setCompleteKeyWork()

    /**
     * Get CompleteKeyWork Has Been Setted
     *
     * @return completeKeyWork
     */
    final public boolean isCompleteKeyWorkSetted() {
        return this.completeKeyWorkSetted;
    } // end isCompleteKeyWorkSetted()

    /**
     * Set CompleteKeyWork Null
     */
    final public void setCompleteKeyWorkNull() {
        this.completeKeyWorkNull = true;
    } // end setCompleteKeyWorkNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCompleteKeyWorkNull(boolean aNullFlag) {
        this.completeKeyWorkNull = aNullFlag;
    } // end setCompleteKeyWorkNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCompleteKeyWorkNull() {
        return this.completeKeyWorkNull;
    } // end isCompleteKeyWorkNull()

    /**
     * Get InputForm
     *
     * @return inputForm
     */
    final public String getInputForm() {
        if (isInputFormNull()) {
            return null;
        } // end if
        else {
            return inputForm;
        } // end else
    } // end getInputForm()

    /**
     * Set InputForm
     *
     * @param aInputForm
     */
    final public void setInputForm(String aInputForm) {
        this.inputForm = aInputForm;

        this.inputFormSetted = true;

        this.setInputFormNull(this.inputForm == null);
    } // end setInputForm()

    /**
     * Get InputForm Has Been Setted
     *
     * @return inputForm
     */
    final public boolean isInputFormSetted() {
        return this.inputFormSetted;
    } // end isInputFormSetted()

    /**
     * Set InputForm Null
     */
    final public void setInputFormNull() {
        this.inputFormNull = true;
    } // end setInputFormNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setInputFormNull(boolean aNullFlag) {
        this.inputFormNull = aNullFlag;
    } // end setInputFormNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isInputFormNull() {
        return this.inputFormNull;
    } // end isInputFormNull()

    /**
     * Get OutputFile
     *
     * @return outputFile
     */
    final public String getOutputFile() {
        if (isOutputFileNull()) {
            return null;
        } // end if
        else {
            return outputFile;
        } // end else
    } // end getOutputFile()

    /**
     * Set OutputFile
     *
     * @param aOutputFile
     */
    final public void setOutputFile(String aOutputFile) {
        this.outputFile = aOutputFile;

        this.outputFileSetted = true;

        this.setOutputFileNull(this.outputFile == null);
    } // end setOutputFile()

    /**
     * Get OutputFile Has Been Setted
     *
     * @return outputFile
     */
    final public boolean isOutputFileSetted() {
        return this.outputFileSetted;
    } // end isOutputFileSetted()

    /**
     * Set OutputFile Null
     */
    final public void setOutputFileNull() {
        this.outputFileNull = true;
    } // end setOutputFileNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setOutputFileNull(boolean aNullFlag) {
        this.outputFileNull = aNullFlag;
    } // end setOutputFileNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isOutputFileNull() {
        return this.outputFileNull;
    } // end isOutputFileNull()

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
     * Get SucceedKeyWork
     *
     * @return succeedKeyWork
     */
    final public String getSucceedKeyWork() {
        if (isSucceedKeyWorkNull()) {
            return null;
        } // end if
        else {
            return succeedKeyWork;
        } // end else
    } // end getSucceedKeyWork()

    /**
     * Set SucceedKeyWork
     *
     * @param aSucceedKeyWork
     */
    final public void setSucceedKeyWork(String aSucceedKeyWork) {
        this.succeedKeyWork = aSucceedKeyWork;

        this.succeedKeyWorkSetted = true;

        this.setSucceedKeyWorkNull(this.succeedKeyWork == null);
    } // end setSucceedKeyWork()

    /**
     * Get SucceedKeyWork Has Been Setted
     *
     * @return succeedKeyWork
     */
    final public boolean isSucceedKeyWorkSetted() {
        return this.succeedKeyWorkSetted;
    } // end isSucceedKeyWorkSetted()

    /**
     * Set SucceedKeyWork Null
     */
    final public void setSucceedKeyWorkNull() {
        this.succeedKeyWorkNull = true;
    } // end setSucceedKeyWorkNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSucceedKeyWorkNull(boolean aNullFlag) {
        this.succeedKeyWorkNull = aNullFlag;
    } // end setSucceedKeyWorkNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSucceedKeyWorkNull() {
        return this.succeedKeyWorkNull;
    } // end isSucceedKeyWorkNull()

    /**
     * Get TimeOut
     *
     * @return timeOut
     */
    final public int getTimeOut() {
        return timeOut;
    } // end getTimeOut()

    /**
     * Set TimeOut
     *
     * @param aTimeOut
     */
    final public void setTimeOut(int aTimeOut) {
        this.timeOut = aTimeOut;

        this.timeOutSetted = true;

        this.setTimeOutNull(false);
    } // end setTimeOut()

    /**
     * Get TimeOut Has Been Setted
     *
     * @return timeOut
     */
    final public boolean isTimeOutSetted() {
        return this.timeOutSetted;
    } // end isTimeOutSetted()

    /**
     * Set TimeOut Null
     */
    final public void setTimeOutNull() {
        this.timeOutNull = true;
    } // end setTimeOutNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTimeOutNull(boolean aNullFlag) {
        this.timeOutNull = aNullFlag;
    } // end setTimeOutNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTimeOutNull() {
        return this.timeOutNull;
    } // end isTimeOutNull()

    /**
     * Get ToolGroupId
     *
     * @return toolGroupId
     */
    final public long getToolGroupId() {
        return toolGroupId;
    } // end getToolGroupId()

    /**
     * Set ToolGroupId
     *
     * @param aToolGroupId
     */
    final public void setToolGroupId(long aToolGroupId) {
        this.toolGroupId = aToolGroupId;

        this.toolGroupIdSetted = true;

        this.setToolGroupIdNull(false);
    } // end setToolGroupId()

    /**
     * Get ToolGroupId Has Been Setted
     *
     * @return toolGroupId
     */
    final public boolean isToolGroupIdSetted() {
        return this.toolGroupIdSetted;
    } // end isToolGroupIdSetted()

    /**
     * Set ToolGroupId Null
     */
    final public void setToolGroupIdNull() {
        this.toolGroupIdNull = true;
    } // end setToolGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolGroupIdNull(boolean aNullFlag) {
        this.toolGroupIdNull = aNullFlag;
    } // end setToolGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolGroupIdNull() {
        return this.toolGroupIdNull;
    } // end isToolGroupIdNull()

    /**
     * Get ToolScript
     *
     * @return toolScript
     */
    final public String getToolScript() {
        if (isToolScriptNull()) {
            return null;
        } // end if
        else {
            return toolScript;
        } // end else
    } // end getToolScript()

    /**
     * Set ToolScript
     *
     * @param aToolScript
     */
    final public void setToolScript(String aToolScript) {
        this.toolScript = aToolScript;

        this.toolScriptSetted = true;

        this.setToolScriptNull(this.toolScript == null);
    } // end setToolScript()

    /**
     * Get ToolScript Has Been Setted
     *
     * @return toolScript
     */
    final public boolean isToolScriptSetted() {
        return this.toolScriptSetted;
    } // end isToolScriptSetted()

    /**
     * Set ToolScript Null
     */
    final public void setToolScriptNull() {
        this.toolScriptNull = true;
    } // end setToolScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolScriptNull(boolean aNullFlag) {
        this.toolScriptNull = aNullFlag;
    } // end setToolScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolScriptNull() {
        return this.toolScriptNull;
    } // end isToolScriptNull()

    /**
     * Get ToolScriptType
     *
     * @return toolScriptType
     */
    final public String getToolScriptType() {
        return toolScriptType;
    } // end getToolScriptType()

    /**
     * Set ToolScriptType
     *
     * @param aToolScriptType
     */
    final public void setToolScriptType(String aToolScriptType) {
        this.toolScriptType = aToolScriptType;

        this.toolScriptTypeSetted = true;

        this.setToolScriptTypeNull(this.toolScriptType == null);
    } // end setToolScriptType()

    /**
     * Get ToolScriptType Has Been Setted
     *
     * @return toolScriptType
     */
    final public boolean isToolScriptTypeSetted() {
        return this.toolScriptTypeSetted;
    } // end isToolScriptTypeSetted()

    /**
     * Set ToolScriptType Null
     */
    final public void setToolScriptTypeNull() {
        this.toolScriptTypeNull = true;
    } // end setToolScriptTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolScriptTypeNull(boolean aNullFlag) {
        this.toolScriptTypeNull = aNullFlag;
    } // end setToolScriptTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolScriptTypeNull() {
        return this.toolScriptTypeNull;
    } // end isToolScriptTypeNull()

    /**
     * Get LastEditorId
     *
     * @return lastEditorId
     */
    final public long getLastEditorId() {
        return lastEditorId;
    } // end getLastEditorId()

    /**
     * Set LastEditorId
     *
     * @param aLastEditorId
     */
    final public void setLastEditorId(long aLastEditorId) {
        this.lastEditorId = aLastEditorId;

        this.lastEditorIdSetted = true;

        this.setLastEditorIdNull(false);
    } // end setLastEditorId()

    /**
     * Get LastEditorId Has Been Setted
     *
     * @return lastEditorId
     */
    final public boolean isLastEditorIdSetted() {
        return this.lastEditorIdSetted;
    } // end isLastEditorIdSetted()

    /**
     * Set LastEditorId Null
     */
    final public void setLastEditorIdNull() {
        this.lastEditorIdNull = true;
    } // end setLastEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditorIdNull(boolean aNullFlag) {
        this.lastEditorIdNull = aNullFlag;
    } // end setLastEditorIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditorIdNull() {
        return this.lastEditorIdNull;
    } // end isLastEditorIdNull()

    /**
     * Get LastEditTime
     *
     * @return lastEditTime
     */
    final public java.util.Date getLastEditTime() {
        return lastEditTime;
    } // end getLastEditTime()

    /**
     * Set LastEditTime
     *
     * @param aLastEditTime
     */
    final public void setLastEditTime(java.util.Date aLastEditTime) {
        this.lastEditTime = aLastEditTime;

        this.lastEditTimeSetted = true;

        this.setLastEditTimeNull(this.lastEditTime == null);
    } // end setLastEditTime()

    /**
     * Get LastEditTime Has Been Setted
     *
     * @return lastEditTime
     */
    final public boolean isLastEditTimeSetted() {
        return this.lastEditTimeSetted;
    } // end isLastEditTimeSetted()

    /**
     * Set LastEditTime Null
     */
    final public void setLastEditTimeNull() {
        this.lastEditTimeNull = true;
    } // end setLastEditTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditTimeNull(boolean aNullFlag) {
        this.lastEditTimeNull = aNullFlag;
    } // end setLastEditTimeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditTimeNull() {
        return this.lastEditTimeNull;
    } // end isLastEditTimeNull()

    /**
     * Get LastEditorName
     *
     * @return lastEditorName
     */
    final public String getLastEditorName() {
        return lastEditorName;
    } // end getLastEditorName()

    /**
     * Set LastEditorName
     *
     * @param aLastEditorName
     */
    final public void setLastEditorName(String aLastEditorName) {
        this.lastEditorName = aLastEditorName;

        this.lastEditorNameSetted = true;

        this.setLastEditorNameNull(this.lastEditorName == null);
    } // end setLastEditorName()

    /**
     * Get LastEditorName Has Been Setted
     *
     * @return lastEditorName
     */
    final public boolean isLastEditorNameSetted() {
        return this.lastEditorNameSetted;
    } // end isLastEditorNameSetted()

    /**
     * Set LastEditorName Null
     */
    final public void setLastEditorNameNull() {
        this.lastEditorNameNull = true;
    } // end setLastEditorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLastEditorNameNull(boolean aNullFlag) {
        this.lastEditorNameNull = aNullFlag;
    } // end setLastEditorNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLastEditorNameNull() {
        return this.lastEditorNameNull;
    } // end isLastEditorNameNull()

    /**
     * Get ToolName
     *
     * @return toolName
     */
    final public String getToolName() {
        return toolName;
    } // end getToolName()

    /**
     * Set ToolName
     *
     * @param aToolName
     */
    final public void setToolName(String aToolName) {
        this.toolName = aToolName;

        this.toolNameSetted = true;

        this.setToolNameNull(this.toolName == null);
    } // end setToolName()

    /**
     * Get ToolName Has Been Setted
     *
     * @return toolName
     */
    final public boolean isToolNameSetted() {
        return this.toolNameSetted;
    } // end isToolNameSetted()

    /**
     * Set ToolName Null
     */
    final public void setToolNameNull() {
        this.toolNameNull = true;
    } // end setToolNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolNameNull(boolean aNullFlag) {
        this.toolNameNull = aNullFlag;
    } // end setToolNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolNameNull() {
        return this.toolNameNull;
    } // end isToolNameNull()

    /**
     * Get ProviderId
     *
     * @return providerId
     */
    final public long getProviderId() {
        return providerId;
    } // end getProviderId()

    /**
     * Set ProviderId
     *
     * @param aProviderId
     */
    final public void setProviderId(long aProviderId) {
        this.providerId = aProviderId;

        this.providerIdSetted = true;

        this.setProviderIdNull(false);
    } // end setProviderId()

    /**
     * Get ProviderId Has Been Setted
     *
     * @return providerId
     */
    final public boolean isProviderIdSetted() {
        return this.providerIdSetted;
    } // end isProviderIdSetted()

    /**
     * Set ProviderId Null
     */
    final public void setProviderIdNull() {
        this.providerIdNull = true;
    } // end setProviderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderIdNull(boolean aNullFlag) {
        this.providerIdNull = aNullFlag;
    } // end setProviderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderIdNull() {
        return this.providerIdNull;
    } // end isProviderIdNull()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    final public String getProviderName() {
        if (isProviderNameNull()) {
            return null;
        } // end if
        else {
            return providerName;
        } // end else
    } // end getProviderName()

    /**
     * Set ProviderName
     *
     * @param aProviderName
     */
    final public void setProviderName(String aProviderName) {
        this.providerName = aProviderName;

        this.providerNameSetted = true;

        this.setProviderNameNull(this.providerName == null);
    } // end setProviderName()

    /**
     * Get ProviderName Has Been Setted
     *
     * @return providerName
     */
    final public boolean isProviderNameSetted() {
        return this.providerNameSetted;
    } // end isProviderNameSetted()

    /**
     * Set ProviderName Null
     */
    final public void setProviderNameNull() {
        this.providerNameNull = true;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderNameNull(boolean aNullFlag) {
        this.providerNameNull = aNullFlag;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderNameNull() {
        return this.providerNameNull;
    } // end isProviderNameNull()

    /**
     * Get MiddleWareName
     *
     * @return middleWareName
     */
    final public String getMiddleWareName() {
        if (isMiddleWareNameNull()) {
            return null;
        } // end if
        else {
            return middleWareName;
        } // end else
    } // end getMiddleWareName()

    /**
     * Set MiddleWareName
     *
     * @param aMiddleWareName
     */
    final public void setMiddleWareName(String aMiddleWareName) {
        this.middleWareName = aMiddleWareName;

        this.middleWareNameSetted = true;

        this.setMiddleWareNameNull(this.middleWareName == null);
    } // end setMiddleWareName()

    /**
     * Get MiddleWareName Has Been Setted
     *
     * @return middleWareName
     */
    final public boolean isMiddleWareNameSetted() {
        return this.middleWareNameSetted;
    } // end isMiddleWareNameSetted()

    /**
     * Set MiddleWareName Null
     */
    final public void setMiddleWareNameNull() {
        this.middleWareNameNull = true;
    } // end setMiddleWareNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareNameNull(boolean aNullFlag) {
        this.middleWareNameNull = aNullFlag;
    } // end setMiddleWareNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareNameNull() {
        return this.middleWareNameNull;
    } // end isMiddleWareNameNull()

    /**
     * Get MiddleWareVersion
     *
     * @return middleWareVersion
     */
    final public String getMiddleWareVersion() {
        if (isMiddleWareVersionNull()) {
            return null;
        } // end if
        else {
            return middleWareVersion;
        } // end else
    } // end getMiddleWareVersion()

    /**
     * Set MiddleWareVersion
     *
     * @param aMiddleWareVersion
     */
    final public void setMiddleWareVersion(String aMiddleWareVersion) {
        this.middleWareVersion = aMiddleWareVersion;

        this.middleWareVersionSetted = true;

        this.setMiddleWareVersionNull(this.middleWareVersion == null);
    } // end setMiddleWareVersion()

    /**
     * Get MiddleWareVersion Has Been Setted
     *
     * @return middleWareVersion
     */
    final public boolean isMiddleWareVersionSetted() {
        return this.middleWareVersionSetted;
    } // end isMiddleWareVersionSetted()

    /**
     * Set MiddleWareVersion Null
     */
    final public void setMiddleWareVersionNull() {
        this.middleWareVersionNull = true;
    } // end setMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareVersionNull(boolean aNullFlag) {
        this.middleWareVersionNull = aNullFlag;
    } // end setMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareVersionNull() {
        return this.middleWareVersionNull;
    } // end isMiddleWareVersionNull()

    /**
     * Get MiddleWareType
     *
     * @return middleWareType
     */
    final public String getMiddleWareType() {
        return middleWareType;
    } // end getMiddleWareType()

    /**
     * Set MiddleWareType
     *
     * @param aMiddleWareType
     */
    final public void setMiddleWareType(String aMiddleWareType) {
        this.middleWareType = aMiddleWareType;

        this.middleWareTypeSetted = true;

        this.setMiddleWareTypeNull(this.middleWareType == null);
    } // end setMiddleWareType()

    /**
     * Get MiddleWareType Has Been Setted
     *
     * @return middleWareType
     */
    final public boolean isMiddleWareTypeSetted() {
        return this.middleWareTypeSetted;
    } // end isMiddleWareTypeSetted()

    /**
     * Set MiddleWareType Null
     */
    final public void setMiddleWareTypeNull() {
        this.middleWareTypeNull = true;
    } // end setMiddleWareTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareTypeNull(boolean aNullFlag) {
        this.middleWareTypeNull = aNullFlag;
    } // end setMiddleWareTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareTypeNull() {
        return this.middleWareTypeNull;
    } // end isMiddleWareTypeNull()

    /**
     * Get ToolProgram
     *
     * @return toolProgram
     */
    final public String getToolProgram() {
        if (isToolProgramNull()) {
            return null;
        } // end if
        else {
            return toolProgram;
        } // end else
    } // end getToolProgram()

    /**
     * Set ToolProgram
     *
     * @param aToolProgram
     */
    final public void setToolProgram(String aToolProgram) {
        this.toolProgram = aToolProgram;

        this.toolProgramSetted = true;

        this.setToolProgramNull(this.toolProgram == null);
    } // end setToolProgram()

    /**
     * Get ToolProgram Has Been Setted
     *
     * @return toolProgram
     */
    final public boolean isToolProgramSetted() {
        return this.toolProgramSetted;
    } // end isToolProgramSetted()

    /**
     * Set ToolProgram Null
     */
    final public void setToolProgramNull() {
        this.toolProgramNull = true;
    } // end setToolProgramNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setToolProgramNull(boolean aNullFlag) {
        this.toolProgramNull = aNullFlag;
    } // end setToolProgramNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isToolProgramNull() {
        return this.toolProgramNull;
    } // end isToolProgramNull()

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

        if ((obj instanceof MiddleWareTool) == false) {
            return false;
        } // end if

        MiddleWareTool other = (MiddleWareTool) obj;

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

        buffer.append("completeKeyWork=");
        buffer.append(this.completeKeyWork);
        buffer.append("\r\n");

        buffer.append("inputForm=");
        buffer.append(this.inputForm);
        buffer.append("\r\n");

        buffer.append("outputFile=");
        buffer.append(this.outputFile);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("succeedKeyWork=");
        buffer.append(this.succeedKeyWork);
        buffer.append("\r\n");

        buffer.append("timeOut=");
        buffer.append(this.timeOut);
        buffer.append("\r\n");

        buffer.append("toolGroupId=");
        buffer.append(this.toolGroupId);
        buffer.append("\r\n");

        buffer.append("toolScript=");
        buffer.append(this.toolScript);
        buffer.append("\r\n");

        buffer.append("toolScriptType=");
        buffer.append(this.toolScriptType);
        buffer.append("\r\n");

        buffer.append("lastEditorId=");
        buffer.append(this.lastEditorId);
        buffer.append("\r\n");

        buffer.append("lastEditTime=");
        buffer.append(this.lastEditTime);
        buffer.append("\r\n");

        buffer.append("lastEditorName=");
        buffer.append(this.lastEditorName);
        buffer.append("\r\n");

        buffer.append("toolName=");
        buffer.append(this.toolName);
        buffer.append("\r\n");

        buffer.append("providerId=");
        buffer.append(this.providerId);
        buffer.append("\r\n");

        buffer.append("providerName=");
        buffer.append(this.providerName);
        buffer.append("\r\n");

        buffer.append("middleWareName=");
        buffer.append(this.middleWareName);
        buffer.append("\r\n");

        buffer.append("middleWareVersion=");
        buffer.append(this.middleWareVersion);
        buffer.append("\r\n");

        buffer.append("middleWareType=");
        buffer.append(this.middleWareType);
        buffer.append("\r\n");

        buffer.append("toolProgram=");
        buffer.append(this.toolProgram);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWareTool
