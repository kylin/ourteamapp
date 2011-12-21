/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportViewTable Data Access Object
*  GenDate 2011-09-27 11:38:00  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportViewTableDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_VIEW_TABLE";

    /** Attribute */
    static final String Id = "REPORT_VIEW_TABLE.ID";

    /** Attribute */
    static final String JoinCond = "REPORT_VIEW_TABLE.JOIN_COND";

    /** Attribute */
    static final String JoinType = "REPORT_VIEW_TABLE.JOIN_TYPE";

    /** Attribute */
    static final String Remarks = "REPORT_VIEW_TABLE.REMARKS";

    /** Attribute */
    static final String ReportViewId = "REPORT_VIEW_TABLE.REPORT_VIEW_ID";

    /** Attribute */
    static final String Status = "REPORT_VIEW_TABLE.STATUS";

    /** Attribute */
    static final String TableAlias = "REPORT_VIEW_TABLE.TABLE_ALIAS";

    /** Attribute */
    static final String TableName = "REPORT_VIEW_TABLE.TABLE_NAME";

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
        static final String JoinCond = "joinCond";

        /** Attribute */
        static final String JoinType = "joinType";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportViewId = "reportViewId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TableAlias = "tableAlias";

        /** Attribute */
        static final String TableName = "tableName";
    } // end DataProperty

    /**
     * Check Unique ReportViewTable
     *
     * @param aReportViewTable
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportViewTable aReportViewTable)
        throws Exception;

    /**
     * insert ReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportViewTable(ReportViewTable aReportViewTable)
        throws Exception;

    /**
     * Batch Insert ReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportViewTable(ReportViewTable[] aReportViewTable)
        throws Exception;

    /**
     * Delete ReportViewTable
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewTable(final long aId) throws Exception;

    /**
     * Delete ReportViewTable By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewTable(ReportViewTableDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewTable(ReportViewTable aReportViewTable)
        throws Exception;

    /**
     * Batch Modify ReportViewTable
     *
     * @param aReportViewTable
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportViewTable(ReportViewTable[] aReportViewTable)
        throws Exception;

    /**
     * Modify ReportViewTable  By Query Conditions
     *
     * @param aReportViewTable Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewTable(ReportViewTable aReportViewTable,
        ReportViewTableDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewTable
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportViewTable findReportViewTableById(final long aId)
        throws Exception;

    /**
     * Query ReportViewTable
     *
     * @param aQueryBean
     *
     * @return IReportViewTable[]
     *
     * @throws Exception
     *
     * @model type="IReportViewTable" containment="true"
     */
    ReportViewTable[] queryReportViewTable(
        ReportViewTableDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewTable
     *
     * @param aBaseQueryBean
     *
     * @return IReportViewTable[]
     *
     * @throws Exception
     *
     * @model type="IReportViewTable" containment="true"
     */

    //Map queryReportViewTableForMap(ReportViewTableDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportViewTable
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportViewTableCount(ReportViewTableDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportViewTable Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportViewTableSelective(
        ReportViewTableDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportViewTable
     *
     * @param aReportViewTables
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewTable(ReportViewTable[] aReportViewTables,
        ReportViewTableDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportViewTable
     *
     * @param aReportViewTables
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewTable(ReportViewTable[] aReportViewTables,
        ReportViewTableDAOQueryBean aQueryBean,
        ReportViewTableSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportViewTableSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportViewTableArray DOCUMENT ME!
         * @param willUpdateReportViewTableArray DOCUMENT ME!
         * @param willDeleteReportViewTableArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportViewTable[] willAddReportViewTableArray,
            ReportViewTable[] willUpdateReportViewTableArray,
            ReportViewTable[] willDeleteReportViewTableArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewTables DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportViewTable[] aReportViewTables)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewTables DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportViewTable[] aReportViewTables)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewTables DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportViewTable[] aReportViewTables)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewTables DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportViewTable[] aReportViewTables)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewTables DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportViewTable[] aReportViewTables)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewTables DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportViewTable[] aReportViewTables)
            throws Exception;
    } // end ReportViewTableSynchronizeCallback
} // end IBaseReportViewTableDAO
