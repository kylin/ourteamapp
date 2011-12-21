/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportViewDefine Data Access Object
*  GenDate 2011-09-27 11:37:58  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportViewDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_VIEW_DEFINE";

    /** Attribute */
    static final String Id = "REPORT_VIEW_DEFINE.ID";

    /** Attribute */
    static final String Code = "REPORT_VIEW_DEFINE.CODE";

    /** Attribute */
    static final String GroupBy = "REPORT_VIEW_DEFINE.GROUP_BY";

    /** Attribute */
    static final String IsDistinct = "REPORT_VIEW_DEFINE.IS_DISTINCT";

    /** Attribute */
    static final String Name = "REPORT_VIEW_DEFINE.NAME";

    /** Attribute */
    static final String OrderBy = "REPORT_VIEW_DEFINE.ORDER_BY";

    /** Attribute */
    static final String Remarks = "REPORT_VIEW_DEFINE.REMARKS";

    /** Attribute */
    static final String ReportProjectId = "REPORT_VIEW_DEFINE.REPORT_PROJECT_ID";

    /** Attribute */
    static final String Status = "REPORT_VIEW_DEFINE.STATUS";

    /** Attribute */
    static final String UnionViews = "REPORT_VIEW_DEFINE.UNION_VIEWS";

    /** Attribute */
    static final String ViewFilters = "REPORT_VIEW_DEFINE.VIEW_FILTERS";

    /** Attribute */
    static final String ReportProjectName = "reportProjectA.NAME";

    /** Attribute */
    static final String ReportProjectCode = "reportProjectA.CODE";

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
        static final String Code = "code";

        /** Attribute */
        static final String GroupBy = "groupBy";

        /** Attribute */
        static final String IsDistinct = "isDistinct";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String OrderBy = "orderBy";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportProjectId = "reportProjectId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String UnionViews = "unionViews";

        /** Attribute */
        static final String ViewFilters = "viewFilters";

        /** Attribute */
        static final String ReportProjectName = "reportProjectName";

        /** Attribute */
        static final String ReportProjectCode = "reportProjectCode";
    } // end DataProperty

    /**
     * Check Unique ReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportViewDefine aReportViewDefine)
        throws Exception;

    /**
     * insert ReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportViewDefine(ReportViewDefine aReportViewDefine)
        throws Exception;

    /**
     * Batch Insert ReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportViewDefine(ReportViewDefine[] aReportViewDefine)
        throws Exception;

    /**
     * Delete ReportViewDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewDefine(final long aId) throws Exception;

    /**
     * Delete ReportViewDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewDefine(ReportViewDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewDefine(ReportViewDefine aReportViewDefine)
        throws Exception;

    /**
     * Batch Modify ReportViewDefine
     *
     * @param aReportViewDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportViewDefine(ReportViewDefine[] aReportViewDefine)
        throws Exception;

    /**
     * Modify ReportViewDefine  By Query Conditions
     *
     * @param aReportViewDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewDefine(ReportViewDefine aReportViewDefine,
        ReportViewDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportViewDefine findReportViewDefineById(final long aId)
        throws Exception;

    /**
     * Query ReportViewDefine
     *
     * @param aQueryBean
     *
     * @return IReportViewDefine[]
     *
     * @throws Exception
     *
     * @model type="IReportViewDefine" containment="true"
     */
    ReportViewDefine[] queryReportViewDefine(
        ReportViewDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewDefine
     *
     * @param aBaseQueryBean
     *
     * @return IReportViewDefine[]
     *
     * @throws Exception
     *
     * @model type="IReportViewDefine" containment="true"
     */

    //Map queryReportViewDefineForMap(ReportViewDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportViewDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportViewDefineCount(ReportViewDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportViewDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportViewDefineSelective(
        ReportViewDefineDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportViewDefine
     *
     * @param aReportViewDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewDefine(ReportViewDefine[] aReportViewDefines,
        ReportViewDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportViewDefine
     *
     * @param aReportViewDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewDefine(ReportViewDefine[] aReportViewDefines,
        ReportViewDefineDAOQueryBean aQueryBean,
        ReportViewDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportViewDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportViewDefineArray DOCUMENT ME!
         * @param willUpdateReportViewDefineArray DOCUMENT ME!
         * @param willDeleteReportViewDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportViewDefine[] willAddReportViewDefineArray,
            ReportViewDefine[] willUpdateReportViewDefineArray,
            ReportViewDefine[] willDeleteReportViewDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportViewDefine[] aReportViewDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportViewDefine[] aReportViewDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportViewDefine[] aReportViewDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportViewDefine[] aReportViewDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportViewDefine[] aReportViewDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportViewDefine[] aReportViewDefines)
            throws Exception;
    } // end ReportViewDefineSynchronizeCallback
} // end IBaseReportViewDefineDAO
