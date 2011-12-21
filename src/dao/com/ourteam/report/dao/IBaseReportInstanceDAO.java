/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportInstance Data Access Object
*  GenDate 2011-09-27 11:37:55  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportInstanceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_INSTANCE";

    /** Attribute */
    static final String Id = "REPORT_INSTANCE.ID";

    /** Attribute */
    static final String CatalogId = "REPORT_INSTANCE.CATALOG_ID";

    /** Attribute */
    static final String Remarks = "REPORT_INSTANCE.REMARKS";

    /** Attribute */
    static final String ReportProjectId = "REPORT_INSTANCE.REPORT_PROJECT_ID";

    /** Attribute */
    static final String ReportTitle = "REPORT_INSTANCE.REPORT_TITLE";

    /** Attribute */
    static final String Status = "REPORT_INSTANCE.STATUS";

    /** Attribute */
    static final String ReportViewId = "REPORT_INSTANCE.REPORT_VIEW_ID";

    /** Attribute */
    static final String ReportViewName = "reportViewDefineC.NAME";

    /** Attribute */
    static final String ReportViewCode = "reportViewDefineC.CODE";

    /** Attribute */
    static final String ReportViewIsDistinct = "reportViewDefineC.IS_DISTINCT";

    /** Attribute */
    static final String ReportViewFilters = "reportViewDefineC.VIEW_FILTERS";

    /** Attribute */
    static final String ReportViewGroupBy = "reportViewDefineC.GROUP_BY";

    /** Attribute */
    static final String ReportViewOrderBy = "reportViewDefineC.ORDER_BY";

    /** Attribute */
    static final String ReportProjectName = "reportProjectC.NAME";

    /** Attribute */
    static final String ReportProjectCode = "reportProjectC.CODE";

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
        static final String CatalogId = "catalogId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportProjectId = "reportProjectId";

        /** Attribute */
        static final String ReportTitle = "reportTitle";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ReportViewId = "reportViewId";

        /** Attribute */
        static final String ReportViewName = "reportViewName";

        /** Attribute */
        static final String ReportViewCode = "reportViewCode";

        /** Attribute */
        static final String ReportViewIsDistinct = "reportViewIsDistinct";

        /** Attribute */
        static final String ReportViewFilters = "reportViewFilters";

        /** Attribute */
        static final String ReportViewGroupBy = "reportViewGroupBy";

        /** Attribute */
        static final String ReportViewOrderBy = "reportViewOrderBy";

        /** Attribute */
        static final String ReportProjectName = "reportProjectName";

        /** Attribute */
        static final String ReportProjectCode = "reportProjectCode";
    } // end DataProperty

    /**
     * Check Unique ReportInstance
     *
     * @param aReportInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportInstance aReportInstance)
        throws Exception;

    /**
     * insert ReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportInstance(ReportInstance aReportInstance)
        throws Exception;

    /**
     * Batch Insert ReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportInstance(ReportInstance[] aReportInstance)
        throws Exception;

    /**
     * Delete ReportInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportInstance(final long aId) throws Exception;

    /**
     * Delete ReportInstance By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportInstance(ReportInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportInstance(ReportInstance aReportInstance)
        throws Exception;

    /**
     * Batch Modify ReportInstance
     *
     * @param aReportInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportInstance(ReportInstance[] aReportInstance)
        throws Exception;

    /**
     * Modify ReportInstance  By Query Conditions
     *
     * @param aReportInstance Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportInstance(ReportInstance aReportInstance,
        ReportInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportInstance findReportInstanceById(final long aId)
        throws Exception;

    /**
     * Query ReportInstance
     *
     * @param aQueryBean
     *
     * @return IReportInstance[]
     *
     * @throws Exception
     *
     * @model type="IReportInstance" containment="true"
     */
    ReportInstance[] queryReportInstance(ReportInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ReportInstance
     *
     * @param aBaseQueryBean
     *
     * @return IReportInstance[]
     *
     * @throws Exception
     *
     * @model type="IReportInstance" containment="true"
     */

    //Map queryReportInstanceForMap(ReportInstanceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportInstance
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportInstanceCount(ReportInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportInstance Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportInstanceSelective(
        ReportInstanceDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportInstance
     *
     * @param aReportInstances
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportInstance(ReportInstance[] aReportInstances,
        ReportInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportInstance
     *
     * @param aReportInstances
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportInstance(ReportInstance[] aReportInstances,
        ReportInstanceDAOQueryBean aQueryBean,
        ReportInstanceSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportInstanceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportInstanceArray DOCUMENT ME!
         * @param willUpdateReportInstanceArray DOCUMENT ME!
         * @param willDeleteReportInstanceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportInstance[] willAddReportInstanceArray,
            ReportInstance[] willUpdateReportInstanceArray,
            ReportInstance[] willDeleteReportInstanceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportInstance[] aReportInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportInstance[] aReportInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportInstance[] aReportInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportInstance[] aReportInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportInstance[] aReportInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportInstance[] aReportInstances)
            throws Exception;
    } // end ReportInstanceSynchronizeCallback
} // end IBaseReportInstanceDAO
