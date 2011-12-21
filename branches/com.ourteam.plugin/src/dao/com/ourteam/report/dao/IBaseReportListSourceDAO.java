/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportListSource Data Access Object
*  GenDate 2011-09-27 11:37:57  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportListSourceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_LIST_SOURCE";

    /** Attribute */
    static final String Id = "REPORT_LIST_SOURCE.ID";

    /** Attribute */
    static final String Code = "REPORT_LIST_SOURCE.CODE";

    /** Attribute */
    static final String IdAttr = "REPORT_LIST_SOURCE.ID_ATTR";

    /** Attribute */
    static final String Name = "REPORT_LIST_SOURCE.NAME";

    /** Attribute */
    static final String Remarks = "REPORT_LIST_SOURCE.REMARKS";

    /** Attribute */
    static final String ReportProjectId = "REPORT_LIST_SOURCE.REPORT_PROJECT_ID";

    /** Attribute */
    static final String SqlScript = "REPORT_LIST_SOURCE.SQL_SCRIPT";

    /** Attribute */
    static final String Status = "REPORT_LIST_SOURCE.STATUS";

    /** Attribute */
    static final String TextAttr = "REPORT_LIST_SOURCE.TEXT_ATTR";

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
        static final String IdAttr = "idAttr";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportProjectId = "reportProjectId";

        /** Attribute */
        static final String SqlScript = "sqlScript";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TextAttr = "textAttr";
    } // end DataProperty

    /**
     * Check Unique ReportListSource
     *
     * @param aReportListSource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportListSource aReportListSource)
        throws Exception;

    /**
     * insert ReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportListSource(ReportListSource aReportListSource)
        throws Exception;

    /**
     * Batch Insert ReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportListSource(ReportListSource[] aReportListSource)
        throws Exception;

    /**
     * Delete ReportListSource
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportListSource(final long aId) throws Exception;

    /**
     * Delete ReportListSource By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportListSource(ReportListSourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportListSource(ReportListSource aReportListSource)
        throws Exception;

    /**
     * Batch Modify ReportListSource
     *
     * @param aReportListSource
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportListSource(ReportListSource[] aReportListSource)
        throws Exception;

    /**
     * Modify ReportListSource  By Query Conditions
     *
     * @param aReportListSource Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportListSource(ReportListSource aReportListSource,
        ReportListSourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportListSource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportListSource findReportListSourceById(final long aId)
        throws Exception;

    /**
     * Query ReportListSource
     *
     * @param aQueryBean
     *
     * @return IReportListSource[]
     *
     * @throws Exception
     *
     * @model type="IReportListSource" containment="true"
     */
    ReportListSource[] queryReportListSource(
        ReportListSourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportListSource
     *
     * @param aBaseQueryBean
     *
     * @return IReportListSource[]
     *
     * @throws Exception
     *
     * @model type="IReportListSource" containment="true"
     */

    //Map queryReportListSourceForMap(ReportListSourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportListSource
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportListSourceCount(ReportListSourceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportListSource Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportListSourceSelective(
        ReportListSourceDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportListSource
     *
     * @param aReportListSources
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportListSource(ReportListSource[] aReportListSources,
        ReportListSourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportListSource
     *
     * @param aReportListSources
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportListSource(ReportListSource[] aReportListSources,
        ReportListSourceDAOQueryBean aQueryBean,
        ReportListSourceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportListSourceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportListSourceArray DOCUMENT ME!
         * @param willUpdateReportListSourceArray DOCUMENT ME!
         * @param willDeleteReportListSourceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportListSource[] willAddReportListSourceArray,
            ReportListSource[] willUpdateReportListSourceArray,
            ReportListSource[] willDeleteReportListSourceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportListSources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportListSource[] aReportListSources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportListSources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportListSource[] aReportListSources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportListSources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportListSource[] aReportListSources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportListSources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportListSource[] aReportListSources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportListSources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportListSource[] aReportListSources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportListSources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportListSource[] aReportListSources)
            throws Exception;
    } // end ReportListSourceSynchronizeCallback
} // end IBaseReportListSourceDAO
