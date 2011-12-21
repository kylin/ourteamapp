/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

/**
 * Generate Date 2011-09-22 10:17:55
 *
 * @author Auto Gen
 */
public class TeamDefine implements java.io.Serializable {
    /**
     * Creates a new TeamDefine object.
     */
    public TeamDefine() {
        super();
    } // end TeamDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

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
    private String teamCode;

    /** Attribute  Be Seted Falg */
    private boolean teamCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamCodeNull = false;

    /** Attribute */
    private String teamMaill;

    /** Attribute  Be Seted Falg */
    private boolean teamMaillSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamMaillNull = false;

    /** Attribute */
    private String teamName;

    /** Attribute  Be Seted Falg */
    private boolean teamNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamNameNull = false;

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
     * Get TeamCode
     *
     * @return teamCode
     */
    final public String getTeamCode() {
        return teamCode;
    } // end getTeamCode()

    /**
     * Set TeamCode
     *
     * @param aTeamCode
     */
    final public void setTeamCode(String aTeamCode) {
        this.teamCode = aTeamCode;

        this.teamCodeSetted = true;

        this.setTeamCodeNull(this.teamCode == null);
    } // end setTeamCode()

    /**
     * Get TeamCode Has Been Setted
     *
     * @return teamCode
     */
    final public boolean isTeamCodeSetted() {
        return this.teamCodeSetted;
    } // end isTeamCodeSetted()

    /**
     * Set TeamCode Null
     */
    final public void setTeamCodeNull() {
        this.teamCodeNull = true;
    } // end setTeamCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamCodeNull(boolean aNullFlag) {
        this.teamCodeNull = aNullFlag;
    } // end setTeamCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamCodeNull() {
        return this.teamCodeNull;
    } // end isTeamCodeNull()

    /**
     * Get TeamMaill
     *
     * @return teamMaill
     */
    final public String getTeamMaill() {
        return teamMaill;
    } // end getTeamMaill()

    /**
     * Set TeamMaill
     *
     * @param aTeamMaill
     */
    final public void setTeamMaill(String aTeamMaill) {
        this.teamMaill = aTeamMaill;

        this.teamMaillSetted = true;

        this.setTeamMaillNull(this.teamMaill == null);
    } // end setTeamMaill()

    /**
     * Get TeamMaill Has Been Setted
     *
     * @return teamMaill
     */
    final public boolean isTeamMaillSetted() {
        return this.teamMaillSetted;
    } // end isTeamMaillSetted()

    /**
     * Set TeamMaill Null
     */
    final public void setTeamMaillNull() {
        this.teamMaillNull = true;
    } // end setTeamMaillNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamMaillNull(boolean aNullFlag) {
        this.teamMaillNull = aNullFlag;
    } // end setTeamMaillNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamMaillNull() {
        return this.teamMaillNull;
    } // end isTeamMaillNull()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    final public String getTeamName() {
        return teamName;
    } // end getTeamName()

    /**
     * Set TeamName
     *
     * @param aTeamName
     */
    final public void setTeamName(String aTeamName) {
        this.teamName = aTeamName;

        this.teamNameSetted = true;

        this.setTeamNameNull(this.teamName == null);
    } // end setTeamName()

    /**
     * Get TeamName Has Been Setted
     *
     * @return teamName
     */
    final public boolean isTeamNameSetted() {
        return this.teamNameSetted;
    } // end isTeamNameSetted()

    /**
     * Set TeamName Null
     */
    final public void setTeamNameNull() {
        this.teamNameNull = true;
    } // end setTeamNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamNameNull(boolean aNullFlag) {
        this.teamNameNull = aNullFlag;
    } // end setTeamNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamNameNull() {
        return this.teamNameNull;
    } // end isTeamNameNull()

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

        if ((obj instanceof TeamDefine) == false) {
            return false;
        } // end if

        TeamDefine other = (TeamDefine) obj;

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

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("teamCode=");
        buffer.append(this.teamCode);
        buffer.append("\r\n");

        buffer.append("teamMaill=");
        buffer.append(this.teamMaill);
        buffer.append("\r\n");

        buffer.append("teamName=");
        buffer.append(this.teamName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end TeamDefine
