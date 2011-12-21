/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-03 11:41:00
 *
 * @model auto gen
 */
public class BpmProcessCatalogBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.bpm.dao.BpmProcessCatalog objBpmProcessCatalog;

    static {
        mappedDaoFields.put("id", com.ourteam.bpm.dao.IBpmProcessCatalogDAO.Id);

        mappedDaoFields.put("name",
            com.ourteam.bpm.dao.IBpmProcessCatalogDAO.Name);

        mappedDaoFields.put("parentId",
            com.ourteam.bpm.dao.IBpmProcessCatalogDAO.ParentId);

        mappedDaoFields.put("remarks",
            com.ourteam.bpm.dao.IBpmProcessCatalogDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.bpm.dao.IBpmProcessCatalogDAO.Status);

        mappedDaoFields.put("orderIndex",
            com.ourteam.bpm.dao.IBpmProcessCatalogDAO.OrderIndex);
    } 

    /**
     * Creates a new BpmProcessCatalogBean object.
     */
    public BpmProcessCatalogBean() {
        super();

        objBpmProcessCatalog = new com.ourteam.bpm.dao.BpmProcessCatalog();
    } // end BpmProcessCatalogBean()

    /**
     * Creates a new BpmProcessCatalogBean object.
     *
     * @param aBpmProcessCatalog DOCUMENT ME!
     */
    public BpmProcessCatalogBean(
        com.ourteam.bpm.dao.BpmProcessCatalog aBpmProcessCatalog) {
        super();

        objBpmProcessCatalog = aBpmProcessCatalog;
    } // end BpmProcessCatalogBean()

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
    public com.ourteam.bpm.dao.BpmProcessCatalog convertToBpmProcessCatalog() {
        return objBpmProcessCatalog;
    } // end convertToBpmProcessCatalog()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objBpmProcessCatalog.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objBpmProcessCatalog.setId(aId);
    } // end setId()

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return objBpmProcessCatalog.getName();
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    public void setName(String aName) {
        this.objBpmProcessCatalog.setName(aName);
    } // end setName()

    /**
     * Get ParentId
     *
     * @return parentId
     */
    public long getParentId() {
        return objBpmProcessCatalog.getParentId();
    } // end getParentId()

    /**
     * Set ParentId
     *
     * @param aParentId
     */
    public void setParentId(long aParentId) {
        this.objBpmProcessCatalog.setParentId(aParentId);
    } // end setParentId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objBpmProcessCatalog.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objBpmProcessCatalog.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objBpmProcessCatalog.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objBpmProcessCatalog.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get OrderIndex
     *
     * @return orderIndex
     */
    public int getOrderIndex() {
        return objBpmProcessCatalog.getOrderIndex();
    } // end getOrderIndex()

    /**
     * Set OrderIndex
     *
     * @param aOrderIndex
     */
    public void setOrderIndex(int aOrderIndex) {
        this.objBpmProcessCatalog.setOrderIndex(aOrderIndex);
    } // end setOrderIndex()

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

        if ((obj instanceof BpmProcessCatalogBean) == false) {
            return false;
        } // end if

        BpmProcessCatalogBean other = (BpmProcessCatalogBean) obj;

        boolean isEqual = false;

        com.ourteam.bpm.dao.BpmProcessCatalog tempBpmProcessCatalog = other.convertToBpmProcessCatalog();

        if ((tempBpmProcessCatalog == null) ||
                (this.objBpmProcessCatalog == null)) {
            isEqual = false;
        } // end if
        else if ((tempBpmProcessCatalog == this.objBpmProcessCatalog) ||
                tempBpmProcessCatalog.equals(this.objBpmProcessCatalog)) {
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
     * @param aBpmProcessCatalogs DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessCatalogBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessCatalog[] aBpmProcessCatalogs) {
        return toArray(aBpmProcessCatalogs, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessCatalogs DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static BpmProcessCatalogBean[] toArray(
        com.ourteam.bpm.dao.BpmProcessCatalog[] aBpmProcessCatalogs,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aBpmProcessCatalogs)) {
            return new BpmProcessCatalogBean[0];
        } // end if

        int length = aBpmProcessCatalogs.length;

        BpmProcessCatalogBean[] beans = new BpmProcessCatalogBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessCatalogBean(aBpmProcessCatalogs[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new BpmProcessCatalogBean(aBpmProcessCatalogs[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aBpmProcessCatalogs[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end BpmProcessCatalogBean
