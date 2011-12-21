/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

/**
 * Generate Date 2011-09-22 10:17:54
 *
 * @author Auto Gen
 */
public class TeamBusinessDefine implements java.io.Serializable {
    /**
     * Creates a new TeamBusinessDefine object.
     */
    public TeamBusinessDefine() {
        super();
    } // end TeamBusinessDefine()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String itemIcon;

    /** Attribute  Be Seted Falg */
    private boolean itemIconSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemIconNull = false;

    /** Attribute */
    private String itemTitle;

    /** Attribute  Be Seted Falg */
    private boolean itemTitleSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemTitleNull = false;

    /** Attribute */
    private String itemType;

    /** Attribute  Be Seted Falg */
    private boolean itemTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemTypeNull = false;

    /** Attribute */
    private String linkPath;

    /** Attribute  Be Seted Falg */
    private boolean linkPathSetted = false;

    /** Attribute  is Null Falg */
    private boolean linkPathNull = false;

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
    private long teamId;

    /** Attribute  Be Seted Falg */
    private boolean teamIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamIdNull = false;

    /** Attribute */
    private String itemCode;

    /** Attribute  Be Seted Falg */
    private boolean itemCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean itemCodeNull = false;

    /** Attribute */
    private String teamName;

    /** Attribute  Be Seted Falg */
    private boolean teamNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean teamNameNull = false;

    /** Attribute */
    private String actionGroupId;

    /** Attribute  Be Seted Falg */
    private boolean actionGroupIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean actionGroupIdNull = false;

    /** Attribute */
    private String subNodeBuilder;

    /** Attribute  Be Seted Falg */
    private boolean subNodeBuilderSetted = false;

    /** Attribute  is Null Falg */
    private boolean subNodeBuilderNull = false;

    /** Attribute */
    private int sortIndex;

    /** Attribute  Be Seted Falg */
    private boolean sortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortIndexNull = false;

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
     * Get ItemIcon
     *
     * @return itemIcon
     */
    final public String getItemIcon() {
        return itemIcon;
    } // end getItemIcon()

    /**
     * Set ItemIcon
     *
     * @param aItemIcon
     */
    final public void setItemIcon(String aItemIcon) {
        this.itemIcon = aItemIcon;

        this.itemIconSetted = true;

        this.setItemIconNull(this.itemIcon == null);
    } // end setItemIcon()

    /**
     * Get ItemIcon Has Been Setted
     *
     * @return itemIcon
     */
    final public boolean isItemIconSetted() {
        return this.itemIconSetted;
    } // end isItemIconSetted()

    /**
     * Set ItemIcon Null
     */
    final public void setItemIconNull() {
        this.itemIconNull = true;
    } // end setItemIconNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemIconNull(boolean aNullFlag) {
        this.itemIconNull = aNullFlag;
    } // end setItemIconNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemIconNull() {
        return this.itemIconNull;
    } // end isItemIconNull()

    /**
     * Get ItemTitle
     *
     * @return itemTitle
     */
    final public String getItemTitle() {
        return itemTitle;
    } // end getItemTitle()

    /**
     * Set ItemTitle
     *
     * @param aItemTitle
     */
    final public void setItemTitle(String aItemTitle) {
        this.itemTitle = aItemTitle;

        this.itemTitleSetted = true;

        this.setItemTitleNull(this.itemTitle == null);
    } // end setItemTitle()

    /**
     * Get ItemTitle Has Been Setted
     *
     * @return itemTitle
     */
    final public boolean isItemTitleSetted() {
        return this.itemTitleSetted;
    } // end isItemTitleSetted()

    /**
     * Set ItemTitle Null
     */
    final public void setItemTitleNull() {
        this.itemTitleNull = true;
    } // end setItemTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemTitleNull(boolean aNullFlag) {
        this.itemTitleNull = aNullFlag;
    } // end setItemTitleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemTitleNull() {
        return this.itemTitleNull;
    } // end isItemTitleNull()

    /**
     * Get ItemType
     *
     * @return itemType
     */
    final public String getItemType() {
        return itemType;
    } // end getItemType()

    /**
     * Set ItemType
     *
     * @param aItemType
     */
    final public void setItemType(String aItemType) {
        this.itemType = aItemType;

        this.itemTypeSetted = true;

        this.setItemTypeNull(this.itemType == null);
    } // end setItemType()

    /**
     * Get ItemType Has Been Setted
     *
     * @return itemType
     */
    final public boolean isItemTypeSetted() {
        return this.itemTypeSetted;
    } // end isItemTypeSetted()

    /**
     * Set ItemType Null
     */
    final public void setItemTypeNull() {
        this.itemTypeNull = true;
    } // end setItemTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemTypeNull(boolean aNullFlag) {
        this.itemTypeNull = aNullFlag;
    } // end setItemTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemTypeNull() {
        return this.itemTypeNull;
    } // end isItemTypeNull()

    /**
     * Get LinkPath
     *
     * @return linkPath
     */
    final public String getLinkPath() {
        if (isLinkPathNull()) {
            return null;
        } // end if
        else {
            return linkPath;
        } // end else
    } // end getLinkPath()

    /**
     * Set LinkPath
     *
     * @param aLinkPath
     */
    final public void setLinkPath(String aLinkPath) {
        this.linkPath = aLinkPath;

        this.linkPathSetted = true;

        this.setLinkPathNull(this.linkPath == null);
    } // end setLinkPath()

    /**
     * Get LinkPath Has Been Setted
     *
     * @return linkPath
     */
    final public boolean isLinkPathSetted() {
        return this.linkPathSetted;
    } // end isLinkPathSetted()

    /**
     * Set LinkPath Null
     */
    final public void setLinkPathNull() {
        this.linkPathNull = true;
    } // end setLinkPathNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLinkPathNull(boolean aNullFlag) {
        this.linkPathNull = aNullFlag;
    } // end setLinkPathNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLinkPathNull() {
        return this.linkPathNull;
    } // end isLinkPathNull()

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
     * Get TeamId
     *
     * @return teamId
     */
    final public long getTeamId() {
        return teamId;
    } // end getTeamId()

    /**
     * Set TeamId
     *
     * @param aTeamId
     */
    final public void setTeamId(long aTeamId) {
        this.teamId = aTeamId;

        this.teamIdSetted = true;

        this.setTeamIdNull(false);
    } // end setTeamId()

    /**
     * Get TeamId Has Been Setted
     *
     * @return teamId
     */
    final public boolean isTeamIdSetted() {
        return this.teamIdSetted;
    } // end isTeamIdSetted()

    /**
     * Set TeamId Null
     */
    final public void setTeamIdNull() {
        this.teamIdNull = true;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTeamIdNull(boolean aNullFlag) {
        this.teamIdNull = aNullFlag;
    } // end setTeamIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTeamIdNull() {
        return this.teamIdNull;
    } // end isTeamIdNull()

    /**
     * Get ItemCode
     *
     * @return itemCode
     */
    final public String getItemCode() {
        return itemCode;
    } // end getItemCode()

    /**
     * Set ItemCode
     *
     * @param aItemCode
     */
    final public void setItemCode(String aItemCode) {
        this.itemCode = aItemCode;

        this.itemCodeSetted = true;

        this.setItemCodeNull(this.itemCode == null);
    } // end setItemCode()

    /**
     * Get ItemCode Has Been Setted
     *
     * @return itemCode
     */
    final public boolean isItemCodeSetted() {
        return this.itemCodeSetted;
    } // end isItemCodeSetted()

    /**
     * Set ItemCode Null
     */
    final public void setItemCodeNull() {
        this.itemCodeNull = true;
    } // end setItemCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setItemCodeNull(boolean aNullFlag) {
        this.itemCodeNull = aNullFlag;
    } // end setItemCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isItemCodeNull() {
        return this.itemCodeNull;
    } // end isItemCodeNull()

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
     * Get ActionGroupId
     *
     * @return actionGroupId
     */
    final public String getActionGroupId() {
        return actionGroupId;
    } // end getActionGroupId()

    /**
     * Set ActionGroupId
     *
     * @param aActionGroupId
     */
    final public void setActionGroupId(String aActionGroupId) {
        this.actionGroupId = aActionGroupId;

        this.actionGroupIdSetted = true;

        this.setActionGroupIdNull(this.actionGroupId == null);
    } // end setActionGroupId()

    /**
     * Get ActionGroupId Has Been Setted
     *
     * @return actionGroupId
     */
    final public boolean isActionGroupIdSetted() {
        return this.actionGroupIdSetted;
    } // end isActionGroupIdSetted()

    /**
     * Set ActionGroupId Null
     */
    final public void setActionGroupIdNull() {
        this.actionGroupIdNull = true;
    } // end setActionGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setActionGroupIdNull(boolean aNullFlag) {
        this.actionGroupIdNull = aNullFlag;
    } // end setActionGroupIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isActionGroupIdNull() {
        return this.actionGroupIdNull;
    } // end isActionGroupIdNull()

    /**
     * Get SubNodeBuilder
     *
     * @return subNodeBuilder
     */
    final public String getSubNodeBuilder() {
        if (isSubNodeBuilderNull()) {
            return null;
        } // end if
        else {
            return subNodeBuilder;
        } // end else
    } // end getSubNodeBuilder()

    /**
     * Set SubNodeBuilder
     *
     * @param aSubNodeBuilder
     */
    final public void setSubNodeBuilder(String aSubNodeBuilder) {
        this.subNodeBuilder = aSubNodeBuilder;

        this.subNodeBuilderSetted = true;

        this.setSubNodeBuilderNull(this.subNodeBuilder == null);
    } // end setSubNodeBuilder()

    /**
     * Get SubNodeBuilder Has Been Setted
     *
     * @return subNodeBuilder
     */
    final public boolean isSubNodeBuilderSetted() {
        return this.subNodeBuilderSetted;
    } // end isSubNodeBuilderSetted()

    /**
     * Set SubNodeBuilder Null
     */
    final public void setSubNodeBuilderNull() {
        this.subNodeBuilderNull = true;
    } // end setSubNodeBuilderNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSubNodeBuilderNull(boolean aNullFlag) {
        this.subNodeBuilderNull = aNullFlag;
    } // end setSubNodeBuilderNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSubNodeBuilderNull() {
        return this.subNodeBuilderNull;
    } // end isSubNodeBuilderNull()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public int getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(int aSortIndex) {
        this.sortIndex = aSortIndex;

        this.sortIndexSetted = true;

        this.setSortIndexNull(false);
    } // end setSortIndex()

    /**
     * Get SortIndex Has Been Setted
     *
     * @return sortIndex
     */
    final public boolean isSortIndexSetted() {
        return this.sortIndexSetted;
    } // end isSortIndexSetted()

    /**
     * Set SortIndex Null
     */
    final public void setSortIndexNull() {
        this.sortIndexNull = true;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortIndexNull(boolean aNullFlag) {
        this.sortIndexNull = aNullFlag;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortIndexNull() {
        return this.sortIndexNull;
    } // end isSortIndexNull()

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

        if ((obj instanceof TeamBusinessDefine) == false) {
            return false;
        } // end if

        TeamBusinessDefine other = (TeamBusinessDefine) obj;

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

        buffer.append("itemIcon=");
        buffer.append(this.itemIcon);
        buffer.append("\r\n");

        buffer.append("itemTitle=");
        buffer.append(this.itemTitle);
        buffer.append("\r\n");

        buffer.append("itemType=");
        buffer.append(this.itemType);
        buffer.append("\r\n");

        buffer.append("linkPath=");
        buffer.append(this.linkPath);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("teamId=");
        buffer.append(this.teamId);
        buffer.append("\r\n");

        buffer.append("itemCode=");
        buffer.append(this.itemCode);
        buffer.append("\r\n");

        buffer.append("teamName=");
        buffer.append(this.teamName);
        buffer.append("\r\n");

        buffer.append("actionGroupId=");
        buffer.append(this.actionGroupId);
        buffer.append("\r\n");

        buffer.append("subNodeBuilder=");
        buffer.append(this.subNodeBuilder);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end TeamBusinessDefine
