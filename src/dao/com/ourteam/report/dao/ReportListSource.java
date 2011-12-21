/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

/**
 * Generate Date 2011-09-27 11:37:57
 *
 * @author Auto Gen
 */
public class ReportListSource implements java.io.Serializable {
    /**
     * Creates a new ReportListSource object.
     */
    public ReportListSource() {
        super();
    } // end ReportListSource()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String code;

    /** Attribute  Be Seted Falg */
    private boolean codeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeNull = false;

    /** Attribute */
    private String idAttr;

    /** Attribute  Be Seted Falg */
    private boolean idAttrSetted = false;

    /** Attribute  is Null Falg */
    private boolean idAttrNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private long reportProjectId;

    /** Attribute  Be Seted Falg */
    private boolean reportProjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean reportProjectIdNull = false;

    /** Attribute */
    private String sqlScript;

    /** Attribute  Be Seted Falg */
    private boolean sqlScriptSetted = false;

    /** Attribute  is Null Falg */
    private boolean sqlScriptNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String textAttr;

    /** Attribute  Be Seted Falg */
    private boolean textAttrSetted = false;

    /** Attribute  is Null Falg */
    private boolean textAttrNull = false;

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
     * Get Code
     *
     * @return code
     */
    final public String getCode() {
        return code;
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    final public void setCode(String aCode) {
        this.code = aCode;

        this.codeSetted = true;

        this.setCodeNull(this.code == null);
    } // end setCode()

    /**
     * Get Code Has Been Setted
     *
     * @return code
     */
    final public boolean isCodeSetted() {
        return this.codeSetted;
    } // end isCodeSetted()

    /**
     * Set Code Null
     */
    final public void setCodeNull() {
        this.codeNull = true;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeNull(boolean aNullFlag) {
        this.codeNull = aNullFlag;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeNull() {
        return this.codeNull;
    } // end isCodeNull()

    /**
     * Get IdAttr
     *
     * @return idAttr
     */
    final public String getIdAttr() {
        return idAttr;
    } // end getIdAttr()

    /**
     * Set IdAttr
     *
     * @param aIdAttr
     */
    final public void setIdAttr(String aIdAttr) {
        this.idAttr = aIdAttr;

        this.idAttrSetted = true;

        this.setIdAttrNull(this.idAttr == null);
    } // end setIdAttr()

    /**
     * Get IdAttr Has Been Setted
     *
     * @return idAttr
     */
    final public boolean isIdAttrSetted() {
        return this.idAttrSetted;
    } // end isIdAttrSetted()

    /**
     * Set IdAttr Null
     */
    final public void setIdAttrNull() {
        this.idAttrNull = true;
    } // end setIdAttrNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdAttrNull(boolean aNullFlag) {
        this.idAttrNull = aNullFlag;
    } // end setIdAttrNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdAttrNull() {
        return this.idAttrNull;
    } // end isIdAttrNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

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
     * Get ReportProjectId
     *
     * @return reportProjectId
     */
    final public long getReportProjectId() {
        return reportProjectId;
    } // end getReportProjectId()

    /**
     * Set ReportProjectId
     *
     * @param aReportProjectId
     */
    final public void setReportProjectId(long aReportProjectId) {
        this.reportProjectId = aReportProjectId;

        this.reportProjectIdSetted = true;

        this.setReportProjectIdNull(false);
    } // end setReportProjectId()

    /**
     * Get ReportProjectId Has Been Setted
     *
     * @return reportProjectId
     */
    final public boolean isReportProjectIdSetted() {
        return this.reportProjectIdSetted;
    } // end isReportProjectIdSetted()

    /**
     * Set ReportProjectId Null
     */
    final public void setReportProjectIdNull() {
        this.reportProjectIdNull = true;
    } // end setReportProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setReportProjectIdNull(boolean aNullFlag) {
        this.reportProjectIdNull = aNullFlag;
    } // end setReportProjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isReportProjectIdNull() {
        return this.reportProjectIdNull;
    } // end isReportProjectIdNull()

    /**
     * Get SqlScript
     *
     * @return sqlScript
     */
    final public String getSqlScript() {
        if (isSqlScriptNull()) {
            return null;
        } // end if
        else {
            return sqlScript;
        } // end else
    } // end getSqlScript()

    /**
     * Set SqlScript
     *
     * @param aSqlScript
     */
    final public void setSqlScript(String aSqlScript) {
        this.sqlScript = aSqlScript;

        this.sqlScriptSetted = true;

        this.setSqlScriptNull(this.sqlScript == null);
    } // end setSqlScript()

    /**
     * Get SqlScript Has Been Setted
     *
     * @return sqlScript
     */
    final public boolean isSqlScriptSetted() {
        return this.sqlScriptSetted;
    } // end isSqlScriptSetted()

    /**
     * Set SqlScript Null
     */
    final public void setSqlScriptNull() {
        this.sqlScriptNull = true;
    } // end setSqlScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSqlScriptNull(boolean aNullFlag) {
        this.sqlScriptNull = aNullFlag;
    } // end setSqlScriptNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSqlScriptNull() {
        return this.sqlScriptNull;
    } // end isSqlScriptNull()

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
     * Get TextAttr
     *
     * @return textAttr
     */
    final public String getTextAttr() {
        return textAttr;
    } // end getTextAttr()

    /**
     * Set TextAttr
     *
     * @param aTextAttr
     */
    final public void setTextAttr(String aTextAttr) {
        this.textAttr = aTextAttr;

        this.textAttrSetted = true;

        this.setTextAttrNull(this.textAttr == null);
    } // end setTextAttr()

    /**
     * Get TextAttr Has Been Setted
     *
     * @return textAttr
     */
    final public boolean isTextAttrSetted() {
        return this.textAttrSetted;
    } // end isTextAttrSetted()

    /**
     * Set TextAttr Null
     */
    final public void setTextAttrNull() {
        this.textAttrNull = true;
    } // end setTextAttrNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTextAttrNull(boolean aNullFlag) {
        this.textAttrNull = aNullFlag;
    } // end setTextAttrNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTextAttrNull() {
        return this.textAttrNull;
    } // end isTextAttrNull()

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

        if ((obj instanceof ReportListSource) == false) {
            return false;
        } // end if

        ReportListSource other = (ReportListSource) obj;

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

        buffer.append("code=");
        buffer.append(this.code);
        buffer.append("\r\n");

        buffer.append("idAttr=");
        buffer.append(this.idAttr);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("reportProjectId=");
        buffer.append(this.reportProjectId);
        buffer.append("\r\n");

        buffer.append("sqlScript=");
        buffer.append(this.sqlScript);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("textAttr=");
        buffer.append(this.textAttr);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ReportListSource
