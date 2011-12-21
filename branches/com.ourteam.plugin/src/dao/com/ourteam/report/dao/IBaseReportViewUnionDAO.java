/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportViewUnion Data Access Object
*  GenDate 2011-09-27 11:38:01  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportViewUnionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_VIEW_UNION";

    /** Attribute */
    static final String Id = "REPORT_VIEW_UNION.ID";

    /** Attribute */
    static final String Remarks = "REPORT_VIEW_UNION.REMARKS";

    /** Attribute */
    static final String ReportViewId = "REPORT_VIEW_UNION.REPORT_VIEW_ID";

    /** Attribute */
    static final String Status = "REPORT_VIEW_UNION.STATUS";

    /** Attribute */
    static final String UnionViewId = "REPORT_VIEW_UNION.UNION_VIEW_ID";

    /** Attribute */
    static final String UnionedViewCode = "unionViewDefineA.CODE";

    /** Attribute */
    static final String UnionedViewName = "unionViewDefineA.NAME";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String Id = "id";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportViewId = "reportViewId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String UnionViewId = "unionViewId";

        /** Attribute */
        static final String UnionedViewCode = "unionedViewCode";

        /** Attribute */
        static final String UnionedViewName = "unionedViewName";
    } // end DataProperty

    /**
     * Check Unique ReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportViewUnion aReportViewUnion)
        throws Exception;

    /**
     * insert ReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportViewUnion(ReportViewUnion aReportViewUnion)
        throws Exception;

    /**
     * Batch Insert ReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportViewUnion(ReportViewUnion[] aReportViewUnion)
        throws Exception;

    /**
     * Delete ReportViewUnion
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewUnion(final long aId) throws Exception;

    /**
     * Delete ReportViewUnion By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewUnion(ReportViewUnionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewUnion(ReportViewUnion aReportViewUnion)
        throws Exception;

    /**
     * Batch Modify ReportViewUnion
     *
     * @param aReportViewUnion
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportViewUnion(ReportViewUnion[] aReportViewUnion)
        throws Exception;

    /**
     * Modify ReportViewUnion  By Query Conditions
     *
     * @param aReportViewUnion Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewUnion(ReportViewUnion aReportViewUnion,
        ReportViewUnionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewUnion
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportViewUnion findReportViewUnionById(final long aId)
        throws Exception;

    /**
     * Query ReportViewUnion
     *
     * @param aQueryBean
     *
     * @return IReportViewUnion[]
     *
     * @throws Exception
     *
     * @model type="IReportViewUnion" containment="true"
     */
    ReportViewUnion[] queryReportViewUnion(
        ReportViewUnionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewUnion
     *
     * @param aBaseQueryBean
     *
     * @return IReportViewUnion[]
     *
     * @throws Exception
     *
     * @model type="IReportViewUnion" containment="true"
     */

    //Map queryReportViewUnionForMap(ReportViewUnionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportViewUnion
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportViewUnionCount(ReportViewUnionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportViewUnion Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportViewUnionSelective(
        ReportViewUnionDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportViewUnion
     *
     * @param aReportViewUnions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewUnion(ReportViewUnion[] aReportViewUnions,
        ReportViewUnionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportViewUnion
     *
     * @param aReportViewUnions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewUnion(ReportViewUnion[] aReportViewUnions,
        ReportViewUnionDAOQueryBean aQueryBean,
        ReportViewUnionSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportViewUnionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportViewUnionArray DOCUMENT ME!
         * @param willUpdateReportViewUnionArray DOCUMENT ME!
         * @param willDeleteReportViewUnionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportViewUnion[] willAddReportViewUnionArray,
            ReportViewUnion[] willUpdateReportViewUnionArray,
            ReportViewUnion[] willDeleteReportViewUnionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewUnions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportViewUnion[] aReportViewUnions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewUnions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportViewUnion[] aReportViewUnions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewUnions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportViewUnion[] aReportViewUnions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewUnions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportViewUnion[] aReportViewUnions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewUnions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportViewUnion[] aReportViewUnions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewUnions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportViewUnion[] aReportViewUnions)
            throws Exception;
    } // end ReportViewUnionSynchronizeCallback
} // end IBaseReportViewUnionDAO
