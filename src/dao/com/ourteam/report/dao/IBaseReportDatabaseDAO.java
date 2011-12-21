/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportDatabase Data Access Object
*  GenDate 2011-09-27 11:37:52  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportDatabaseDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_DATABASE";

    /** Attribute */
    static final String Id = "REPORT_DATABASE.ID";

    /** Attribute */
    static final String DatabaseId = "REPORT_DATABASE.DATABASE_ID";

    /** Attribute */
    static final String Remarks = "REPORT_DATABASE.REMARKS";

    /** Attribute */
    static final String ReportProjectId = "REPORT_DATABASE.REPORT_PROJECT_ID";

    /** Attribute */
    static final String Status = "REPORT_DATABASE.STATUS";

    /** Attribute */
    static final String DatabaseName = "databaseMiddlewareA.NAME";

    /** Attribute */
    static final String DatabaseProvider = "databaseMiddlewareA.PROVIDER";

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
        static final String DatabaseId = "databaseId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportProjectId = "reportProjectId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DatabaseName = "databaseName";

        /** Attribute */
        static final String DatabaseProvider = "databaseProvider";
    } // end DataProperty

    /**
     * Check Unique ReportDatabase
     *
     * @param aReportDatabase
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportDatabase aReportDatabase)
        throws Exception;

    /**
     * insert ReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportDatabase(ReportDatabase aReportDatabase)
        throws Exception;

    /**
     * Batch Insert ReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportDatabase(ReportDatabase[] aReportDatabase)
        throws Exception;

    /**
     * Delete ReportDatabase
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportDatabase(final long aId) throws Exception;

    /**
     * Delete ReportDatabase By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportDatabase(ReportDatabaseDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportDatabase(ReportDatabase aReportDatabase)
        throws Exception;

    /**
     * Batch Modify ReportDatabase
     *
     * @param aReportDatabase
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportDatabase(ReportDatabase[] aReportDatabase)
        throws Exception;

    /**
     * Modify ReportDatabase  By Query Conditions
     *
     * @param aReportDatabase Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportDatabase(ReportDatabase aReportDatabase,
        ReportDatabaseDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportDatabase
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportDatabase findReportDatabaseById(final long aId)
        throws Exception;

    /**
     * Query ReportDatabase
     *
     * @param aQueryBean
     *
     * @return IReportDatabase[]
     *
     * @throws Exception
     *
     * @model type="IReportDatabase" containment="true"
     */
    ReportDatabase[] queryReportDatabase(ReportDatabaseDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ReportDatabase
     *
     * @param aBaseQueryBean
     *
     * @return IReportDatabase[]
     *
     * @throws Exception
     *
     * @model type="IReportDatabase" containment="true"
     */

    //Map queryReportDatabaseForMap(ReportDatabaseDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportDatabase
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportDatabaseCount(ReportDatabaseDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportDatabase Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportDatabaseSelective(
        ReportDatabaseDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportDatabase
     *
     * @param aReportDatabases
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportDatabase(ReportDatabase[] aReportDatabases,
        ReportDatabaseDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportDatabase
     *
     * @param aReportDatabases
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportDatabase(ReportDatabase[] aReportDatabases,
        ReportDatabaseDAOQueryBean aQueryBean,
        ReportDatabaseSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportDatabaseSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportDatabaseArray DOCUMENT ME!
         * @param willUpdateReportDatabaseArray DOCUMENT ME!
         * @param willDeleteReportDatabaseArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportDatabase[] willAddReportDatabaseArray,
            ReportDatabase[] willUpdateReportDatabaseArray,
            ReportDatabase[] willDeleteReportDatabaseArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDatabases DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportDatabase[] aReportDatabases)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDatabases DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportDatabase[] aReportDatabases)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDatabases DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportDatabase[] aReportDatabases)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDatabases DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportDatabase[] aReportDatabases)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDatabases DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportDatabase[] aReportDatabases)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDatabases DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportDatabase[] aReportDatabases)
            throws Exception;
    } // end ReportDatabaseSynchronizeCallback
} // end IBaseReportDatabaseDAO
