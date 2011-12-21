/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-22 10:23:02
 *
 * @model auto gen
 */
public class TeamBusinessDefineBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.team.dao.TeamBusinessDefine objTeamBusinessDefine;

    static {
        mappedDaoFields.put("id", com.ourteam.team.dao.ITeamBusinessDefineDAO.Id);

        mappedDaoFields.put("itemIcon",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.ItemIcon);

        mappedDaoFields.put("itemTitle",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.ItemTitle);

        mappedDaoFields.put("itemType",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.ItemType);

        mappedDaoFields.put("linkPath",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.LinkPath);

        mappedDaoFields.put("remarks",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.Status);

        mappedDaoFields.put("teamId",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.TeamId);

        mappedDaoFields.put("itemCode",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.ItemCode);

        mappedDaoFields.put("teamName",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.TeamName);

        mappedDaoFields.put("actionGroupId",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.ActionGroupId);

        mappedDaoFields.put("subNodeBuilder",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.SubNodeBuilder);

        mappedDaoFields.put("sortIndex",
            com.ourteam.team.dao.ITeamBusinessDefineDAO.SortIndex);
    } 

    /**
     * Creates a new TeamBusinessDefineBean object.
     */
    public TeamBusinessDefineBean() {
        super();

        objTeamBusinessDefine = new com.ourteam.team.dao.TeamBusinessDefine();
    } // end TeamBusinessDefineBean()

    /**
     * Creates a new TeamBusinessDefineBean object.
     *
     * @param aTeamBusinessDefine DOCUMENT ME!
     */
    public TeamBusinessDefineBean(
        com.ourteam.team.dao.TeamBusinessDefine aTeamBusinessDefine) {
        super();

        objTeamBusinessDefine = aTeamBusinessDefine;
    } // end TeamBusinessDefineBean()

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
    public com.ourteam.team.dao.TeamBusinessDefine convertToTeamBusinessDefine() {
        return objTeamBusinessDefine;
    } // end convertToTeamBusinessDefine()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objTeamBusinessDefine.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objTeamBusinessDefine.setId(aId);
    } // end setId()

    /**
     * Get ItemIcon
     *
     * @return itemIcon
     */
    public String getItemIcon() {
        return objTeamBusinessDefine.getItemIcon();
    } // end getItemIcon()

    /**
     * Set ItemIcon
     *
     * @param aItemIcon
     */
    public void setItemIcon(String aItemIcon) {
        this.objTeamBusinessDefine.setItemIcon(aItemIcon);
    } // end setItemIcon()

    /**
     * Get ItemTitle
     *
     * @return itemTitle
     */
    public String getItemTitle() {
        return objTeamBusinessDefine.getItemTitle();
    } // end getItemTitle()

    /**
     * Set ItemTitle
     *
     * @param aItemTitle
     */
    public void setItemTitle(String aItemTitle) {
        this.objTeamBusinessDefine.setItemTitle(aItemTitle);
    } // end setItemTitle()

    /**
     * Get ItemType
     *
     * @return itemType
     */
    public String getItemType() {
        return objTeamBusinessDefine.getItemType();
    } // end getItemType()

    /**
     * Set ItemType
     *
     * @param aItemType
     */
    public void setItemType(String aItemType) {
        this.objTeamBusinessDefine.setItemType(aItemType);
    } // end setItemType()

    /**
     * Get LinkPath
     *
     * @return linkPath
     */
    public String getLinkPath() {
        return objTeamBusinessDefine.getLinkPath();
    } // end getLinkPath()

    /**
     * Set LinkPath
     *
     * @param aLinkPath
     */
    public void setLinkPath(String aLinkPath) {
        this.objTeamBusinessDefine.setLinkPath(aLinkPath);
    } // end setLinkPath()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objTeamBusinessDefine.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objTeamBusinessDefine.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objTeamBusinessDefine.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objTeamBusinessDefine.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get TeamId
     *
     * @return teamId
     */
    public long getTeamId() {
        return objTeamBusinessDefine.getTeamId();
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    public void setTeamId(long aTeamId) {
        this.objTeamBusinessDefine.setTeamId(aTeamId);
    } // end setTeamId()

    /**
     * Get ItemCode
     *
     * @return itemCode
     */
    public String getItemCode() {
        return objTeamBusinessDefine.getItemCode();
    } // end getItemCode()

    /**
     * Set ItemCode
     *
     * @param aItemCode
     */
    public void setItemCode(String aItemCode) {
        this.objTeamBusinessDefine.setItemCode(aItemCode);
    } // end setItemCode()

    /**
     * Get TeamName
     *
     * @return teamName
     */
    public String getTeamName() {
        return objTeamBusinessDefine.getTeamName();
    } // end getTeamName()

    /**
     * Get ActionGroupId
     *
     * @return actionGroupId
     */
    public String getActionGroupId() {
        return objTeamBusinessDefine.getActionGroupId();
    } // end getActionGroupId()

    /**
     * Set ActionGroupId
     *
     * @param aActionGroupId
     */
    public void setActionGroupId(String aActionGroupId) {
        this.objTeamBusinessDefine.setActionGroupId(aActionGroupId);
    } // end setActionGroupId()

    /**
     * Get SubNodeBuilder
     *
     * @return subNodeBuilder
     */
    public String getSubNodeBuilder() {
        return objTeamBusinessDefine.getSubNodeBuilder();
    } // end getSubNodeBuilder()

    /**
     * Set SubNodeBuilder
     *
     * @param aSubNodeBuilder
     */
    public void setSubNodeBuilder(String aSubNodeBuilder) {
        this.objTeamBusinessDefine.setSubNodeBuilder(aSubNodeBuilder);
    } // end setSubNodeBuilder()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public int getSortIndex() {
        return objTeamBusinessDefine.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(int aSortIndex) {
        this.objTeamBusinessDefine.setSortIndex(aSortIndex);
    } // end setSortIndex()

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

        if ((obj instanceof TeamBusinessDefineBean) == false) {
            return false;
        } // end if

        TeamBusinessDefineBean other = (TeamBusinessDefineBean) obj;

        boolean isEqual = false;

        com.ourteam.team.dao.TeamBusinessDefine tempTeamBusinessDefine = other.convertToTeamBusinessDefine();

        if ((tempTeamBusinessDefine == null) ||
                (this.objTeamBusinessDefine == null)) {
            isEqual = false;
        } // end if
        else if ((tempTeamBusinessDefine == this.objTeamBusinessDefine) ||
                tempTeamBusinessDefine.equals(this.objTeamBusinessDefine)) {
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
     * @param aTeamBusinessDefines DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamBusinessDefineBean[] toArray(
        com.ourteam.team.dao.TeamBusinessDefine[] aTeamBusinessDefines) {
        return toArray(aTeamBusinessDefines, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aTeamBusinessDefines DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static TeamBusinessDefineBean[] toArray(
        com.ourteam.team.dao.TeamBusinessDefine[] aTeamBusinessDefines,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aTeamBusinessDefines)) {
            return new TeamBusinessDefineBean[0];
        } // end if

        int length = aTeamBusinessDefines.length;

        TeamBusinessDefineBean[] beans = new TeamBusinessDefineBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamBusinessDefineBean(aTeamBusinessDefines[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new TeamBusinessDefineBean(aTeamBusinessDefines[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aTeamBusinessDefines[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end TeamBusinessDefineBean
