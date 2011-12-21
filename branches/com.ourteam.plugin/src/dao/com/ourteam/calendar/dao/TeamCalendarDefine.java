/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import com.ourteam.calendar.dao.CalendarDefine;


/**
 * Generate Date 2011-09-22 10:18:09
 *
 * @author Auto Gen
 */
public class TeamCalendarDefine extends CalendarDefine implements java.io.Serializable {
    /**
     * Creates a new TeamCalendarDefine object.
     */
    public TeamCalendarDefine() {
        super();
    } // end TeamCalendarDefine()

    /** Attribute */
    private String teamName;

    /** Attribute  Be Seted Falg */
    private boolean teamNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamNameNull = false;

    /** Attribute */
    private String teamRemarks;

    /** Attribute  Be Seted Falg */
    private boolean teamRemarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamRemarksNull = false;

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
     * Get TeamRemarks
     *
     * @return teamRemarks
     */
    final public String getTeamRemarks() {
        if (isTeamRemarksNull()) {
            return null;
        } // end if
        else {
            return teamRemarks;
        } // end else
    } // end getTeamRemarks()

    /**
     * Set TeamRemarks
     *
     * @param aTeamRemarks
     */
    final public void setTeamRemarks(String aTeamRemarks) {
        this.teamRemarks = aTeamRemarks;

        this.teamRemarksSetted = true;

        this.setTeamRemarksNull(this.teamRemarks == null);
    } // end setTeamRemarks()

    /**
     * Get TeamRemarks Has Been Setted
     *
     * @return teamRemarks
     */
    final public boolean isTeamRemarksSetted() {
        return this.teamRemarksSetted;
    } // end isTeamRemarksSetted()

    /**
     * Set TeamRemarks Null
     */
    final public void setTeamRemarksNull() {
        this.teamRemarksNull = true;
    } // end setTeamRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamRemarksNull(boolean aNullFlag) {
        this.teamRemarksNull = aNullFlag;
    } // end setTeamRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamRemarksNull() {
        return this.teamRemarksNull;
    } // end isTeamRemarksNull()

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
        return super.equals(obj);
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append(super.toString());

        buffer.append("[\r\n");

        buffer.append("teamName=");
        buffer.append(this.teamName);
        buffer.append("\r\n");

        buffer.append("teamRemarks=");
        buffer.append(this.teamRemarks);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end TeamCalendarDefine
