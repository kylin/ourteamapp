/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportCatalog Data Access Object
*  GenDate 2011-09-27 11:37:52  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportCatalogDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_CATALOG";

    /** Attribute */
    static final String Id = "REPORT_CATALOG.ID";

    /** Attribute */
    static final String CatalogTitle = "REPORT_CATALOG.CATALOG_TITLE";

    /** Attribute */
    static final String ParentCatalogId = "REPORT_CATALOG.PARENT_CATALOG_ID";

    /** Attribute */
    static final String Remarks = "REPORT_CATALOG.REMARKS";

    /** Attribute */
    static final String Status = "REPORT_CATALOG.STATUS";

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
        static final String CatalogTitle = "catalogTitle";

        /** Attribute */
        static final String ParentCatalogId = "parentCatalogId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique ReportCatalog
     *
     * @param aReportCatalog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportCatalog aReportCatalog)
        throws Exception;

    /**
     * insert ReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportCatalog(ReportCatalog aReportCatalog)
        throws Exception;

    /**
     * Batch Insert ReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportCatalog(ReportCatalog[] aReportCatalog)
        throws Exception;

    /**
     * Delete ReportCatalog
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportCatalog(final long aId) throws Exception;

    /**
     * Delete ReportCatalog By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportCatalog(ReportCatalogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportCatalog(ReportCatalog aReportCatalog)
        throws Exception;

    /**
     * Batch Modify ReportCatalog
     *
     * @param aReportCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportCatalog(ReportCatalog[] aReportCatalog)
        throws Exception;

    /**
     * Modify ReportCatalog  By Query Conditions
     *
     * @param aReportCatalog Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportCatalog(ReportCatalog aReportCatalog,
        ReportCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportCatalog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportCatalog findReportCatalogById(final long aId)
        throws Exception;

    /**
     * Query ReportCatalog
     *
     * @param aQueryBean
     *
     * @return IReportCatalog[]
     *
     * @throws Exception
     *
     * @model type="IReportCatalog" containment="true"
     */
    ReportCatalog[] queryReportCatalog(ReportCatalogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ReportCatalog
     *
     * @param aBaseQueryBean
     *
     * @return IReportCatalog[]
     *
     * @throws Exception
     *
     * @model type="IReportCatalog" containment="true"
     */

    //Map queryReportCatalogForMap(ReportCatalogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportCatalog
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportCatalogCount(ReportCatalogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportCatalog Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportCatalogSelective(ReportCatalogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ReportCatalog
     *
     * @param aReportCatalogs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportCatalog(ReportCatalog[] aReportCatalogs,
        ReportCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportCatalog
     *
     * @param aReportCatalogs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportCatalog(ReportCatalog[] aReportCatalogs,
        ReportCatalogDAOQueryBean aQueryBean,
        ReportCatalogSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportCatalogSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportCatalogArray DOCUMENT ME!
         * @param willUpdateReportCatalogArray DOCUMENT ME!
         * @param willDeleteReportCatalogArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportCatalog[] willAddReportCatalogArray,
            ReportCatalog[] willUpdateReportCatalogArray,
            ReportCatalog[] willDeleteReportCatalogArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportCatalog[] aReportCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportCatalog[] aReportCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportCatalog[] aReportCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportCatalog[] aReportCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportCatalog[] aReportCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportCatalog[] aReportCatalogs)
            throws Exception;
    } // end ReportCatalogSynchronizeCallback
} // end IBaseReportCatalogDAO
