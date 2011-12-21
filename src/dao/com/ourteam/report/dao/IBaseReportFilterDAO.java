/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportFilter Data Access Object
*  GenDate 2011-09-27 11:37:54  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportFilterDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_FILTER";

    /** Attribute */
    static final String Id = "REPORT_FILTER.ID";

    /** Attribute */
    static final String Connection = "REPORT_FILTER.CONNECTION";

    /** Attribute */
    static final String FieldId = "REPORT_FILTER.FIELD_ID";

    /** Attribute */
    static final String LeftSymbol = "REPORT_FILTER.LEFT_SYMBOL";

    /** Attribute */
    static final String Operation = "REPORT_FILTER.OPERATION";

    /** Attribute */
    static final String Remarks = "REPORT_FILTER.REMARKS";

    /** Attribute */
    static final String ReportInstanceId = "REPORT_FILTER.REPORT_INSTANCE_ID";

    /** Attribute */
    static final String RightSymbol = "REPORT_FILTER.RIGHT_SYMBOL";

    /** Attribute */
    static final String Status = "REPORT_FILTER.STATUS";

    /** Attribute */
    static final String Value = "REPORT_FILTER.VALUE";

    /** Attribute */
    static final String FieldDataType = "reportViewFieldE.DATA_TYPE";

    /** Attribute */
    static final String FieldName = "reportViewFieldE.FIELD_NAME";

    /** Attribute */
    static final String FieldAlias = "reportViewFieldE.FIELD_ALIAS";

    /** Attribute */
    static final String FieldTitle = "reportViewFieldE.TITLE";

    /** Attribute */
    static final String FieldListSourceId = "reportViewFieldE.LIST_SOURCE_ID";

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
        static final String Connection = "connection";

        /** Attribute */
        static final String FieldId = "fieldId";

        /** Attribute */
        static final String LeftSymbol = "leftSymbol";

        /** Attribute */
        static final String Operation = "operation";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportInstanceId = "reportInstanceId";

        /** Attribute */
        static final String RightSymbol = "rightSymbol";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String Value = "value";

        /** Attribute */
        static final String FieldDataType = "fieldDataType";

        /** Attribute */
        static final String FieldName = "fieldName";

        /** Attribute */
        static final String FieldAlias = "fieldAlias";

        /** Attribute */
        static final String FieldTitle = "fieldTitle";

        /** Attribute */
        static final String FieldListSourceId = "fieldListSourceId";
    } // end DataProperty

    /**
     * Check Unique ReportFilter
     *
     * @param aReportFilter
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportFilter aReportFilter) throws Exception;

    /**
     * insert ReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportFilter(ReportFilter aReportFilter)
        throws Exception;

    /**
     * Batch Insert ReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportFilter(ReportFilter[] aReportFilter)
        throws Exception;

    /**
     * Delete ReportFilter
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportFilter(final long aId) throws Exception;

    /**
     * Delete ReportFilter By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportFilter(ReportFilterDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportFilter(ReportFilter aReportFilter)
        throws Exception;

    /**
     * Batch Modify ReportFilter
     *
     * @param aReportFilter
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportFilter(ReportFilter[] aReportFilter)
        throws Exception;

    /**
     * Modify ReportFilter  By Query Conditions
     *
     * @param aReportFilter Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportFilter(ReportFilter aReportFilter,
        ReportFilterDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportFilter
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportFilter findReportFilterById(final long aId) throws Exception;

    /**
     * Query ReportFilter
     *
     * @param aQueryBean
     *
     * @return IReportFilter[]
     *
     * @throws Exception
     *
     * @model type="IReportFilter" containment="true"
     */
    ReportFilter[] queryReportFilter(ReportFilterDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ReportFilter
     *
     * @param aBaseQueryBean
     *
     * @return IReportFilter[]
     *
     * @throws Exception
     *
     * @model type="IReportFilter" containment="true"
     */

    //Map queryReportFilterForMap(ReportFilterDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportFilter
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportFilterCount(ReportFilterDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportFilter Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportFilterSelective(ReportFilterDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ReportFilter
     *
     * @param aReportFilters
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportFilter(ReportFilter[] aReportFilters,
        ReportFilterDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportFilter
     *
     * @param aReportFilters
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportFilter(ReportFilter[] aReportFilters,
        ReportFilterDAOQueryBean aQueryBean,
        ReportFilterSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportFilterSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportFilterArray DOCUMENT ME!
         * @param willUpdateReportFilterArray DOCUMENT ME!
         * @param willDeleteReportFilterArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(ReportFilter[] willAddReportFilterArray,
            ReportFilter[] willUpdateReportFilterArray,
            ReportFilter[] willDeleteReportFilterArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportFilters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportFilter[] aReportFilters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportFilters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportFilter[] aReportFilters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportFilters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportFilter[] aReportFilters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportFilters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportFilter[] aReportFilters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportFilters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportFilter[] aReportFilters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportFilters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportFilter[] aReportFilters)
            throws Exception;
    } // end ReportFilterSynchronizeCallback
} // end IBaseReportFilterDAO
