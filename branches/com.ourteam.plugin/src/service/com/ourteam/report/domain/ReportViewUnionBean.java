/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-09-23 11:41:19
 *
 * @model auto gen
 */
public class ReportViewUnionBean implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.report.dao.ReportViewUnion objReportViewUnion;

    static {
        mappedDaoFields.put("id", com.ourteam.report.dao.IReportViewUnionDAO.Id);

        mappedDaoFields.put("remarks",
            com.ourteam.report.dao.IReportViewUnionDAO.Remarks);

        mappedDaoFields.put("reportViewId",
            com.ourteam.report.dao.IReportViewUnionDAO.ReportViewId);

        mappedDaoFields.put("status",
            com.ourteam.report.dao.IReportViewUnionDAO.Status);

        mappedDaoFields.put("unionViewId",
            com.ourteam.report.dao.IReportViewUnionDAO.UnionViewId);

        mappedDaoFields.put("unionedViewCode",
            com.ourteam.report.dao.IReportViewUnionDAO.UnionedViewCode);

        mappedDaoFields.put("unionedViewName",
            com.ourteam.report.dao.IReportViewUnionDAO.UnionedViewName);
    } 

    /**
     * Creates a new ReportViewUnionBean object.
     */
    public ReportViewUnionBean() {
        super();

        objReportViewUnion = new com.ourteam.report.dao.ReportViewUnion();
    } // end ReportViewUnionBean()

    /**
     * Creates a new ReportViewUnionBean object.
     *
     * @param aReportViewUnion DOCUMENT ME!
     */
    public ReportViewUnionBean(
        com.ourteam.report.dao.ReportViewUnion aReportViewUnion) {
        super();

        objReportViewUnion = aReportViewUnion;
    } // end ReportViewUnionBean()

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
    public com.ourteam.report.dao.ReportViewUnion convertToReportViewUnion() {
        return objReportViewUnion;
    } // end convertToReportViewUnion()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objReportViewUnion.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objReportViewUnion.setId(aId);
    } // end setId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objReportViewUnion.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objReportViewUnion.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get ReportViewId
     *
     * @return reportViewId
     */
    public long getReportViewId() {
        return objReportViewUnion.getReportViewId();
    } // end getReportViewId()

    /**
     * Set ReportViewId
     *
     * @param aReportViewId
     */
    public void setReportViewId(long aReportViewId) {
        this.objReportViewUnion.setReportViewId(aReportViewId);
    } // end setReportViewId()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objReportViewUnion.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objReportViewUnion.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get UnionViewId
     *
     * @return unionViewId
     */
    public long getUnionViewId() {
        return objReportViewUnion.getUnionViewId();
    } // end getUnionViewId()

    /**
     * Set UnionViewId
     *
     * @param aUnionViewId
     */
    public void setUnionViewId(long aUnionViewId) {
        this.objReportViewUnion.setUnionViewId(aUnionViewId);
    } // end setUnionViewId()

    /**
     * Get UnionedViewCode
     *
     * @return unionedViewCode
     */
    public String getUnionedViewCode() {
        return objReportViewUnion.getUnionedViewCode();
    } // end getUnionedViewCode()

    /**
     * Set UnionedViewCode
     *
     * @param aUnionedViewCode
     */
    public void setUnionedViewCode(String aUnionedViewCode) {
        this.objReportViewUnion.setUnionedViewCode(aUnionedViewCode);
    } // end setUnionedViewCode()

    /**
     * Get UnionedViewName
     *
     * @return unionedViewName
     */
    public String getUnionedViewName() {
        return objReportViewUnion.getUnionedViewName();
    } // end getUnionedViewName()

    /**
     * Set UnionedViewName
     *
     * @param aUnionedViewName
     */
    public void setUnionedViewName(String aUnionedViewName) {
        this.objReportViewUnion.setUnionedViewName(aUnionedViewName);
    } // end setUnionedViewName()

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

        if ((obj instanceof ReportViewUnionBean) == false) {
            return false;
        } // end if

        ReportViewUnionBean other = (ReportViewUnionBean) obj;

        boolean isEqual = false;

        com.ourteam.report.dao.ReportViewUnion tempReportViewUnion = other.convertToReportViewUnion();

        if ((tempReportViewUnion == null) || (this.objReportViewUnion == null)) {
            isEqual = false;
        } // end if
        else if ((tempReportViewUnion == this.objReportViewUnion) ||
                tempReportViewUnion.equals(this.objReportViewUnion)) {
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
     * @param aReportViewUnions DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewUnionBean[] toArray(
        com.ourteam.report.dao.ReportViewUnion[] aReportViewUnions) {
        return toArray(aReportViewUnions, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aReportViewUnions DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static ReportViewUnionBean[] toArray(
        com.ourteam.report.dao.ReportViewUnion[] aReportViewUnions,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aReportViewUnions)) {
            return new ReportViewUnionBean[0];
        } // end if

        int length = aReportViewUnions.length;

        ReportViewUnionBean[] beans = new ReportViewUnionBean[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewUnionBean(aReportViewUnions[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new ReportViewUnionBean(aReportViewUnions[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aReportViewUnions[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end ReportViewUnionBean
