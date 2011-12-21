/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportDisplayColumn Data Access Object
*  GenDate 2011-09-27 11:37:53  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportDisplayColumnDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_DISPLAY_COLUMN";

    /** Attribute */
    static final String Id = "REPORT_DISPLAY_COLUMN.ID";

    /** Attribute */
    static final String ColumnTitle = "REPORT_DISPLAY_COLUMN.COLUMN_TITLE";

    /** Attribute */
    static final String ColumnWidth = "REPORT_DISPLAY_COLUMN.COLUMN_WIDTH";

    /** Attribute */
    static final String FieldId = "REPORT_DISPLAY_COLUMN.FIELD_ID";

    /** Attribute */
    static final String Remarks = "REPORT_DISPLAY_COLUMN.REMARKS";

    /** Attribute */
    static final String ReportInstanceId = "REPORT_DISPLAY_COLUMN.REPORT_INSTANCE_ID";

    /** Attribute */
    static final String SortIndex = "REPORT_DISPLAY_COLUMN.SORT_INDEX";

    /** Attribute */
    static final String Status = "REPORT_DISPLAY_COLUMN.STATUS";

    /** Attribute */
    static final String FieldDataType = "reportViewFieldD.DATA_TYPE";

    /** Attribute */
    static final String FieldAlias = "reportViewFieldD.FIELD_ALIAS";

    /** Attribute */
    static final String FieldName = "reportViewFieldD.FIELD_NAME";

    /** Attribute */
    static final String FieldWidth = "reportViewFieldD.WIDTH";

    /** Attribute */
    static final String FieldTitle = "reportViewFieldD.TITLE";

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
        static final String ColumnTitle = "columnTitle";

        /** Attribute */
        static final String ColumnWidth = "columnWidth";

        /** Attribute */
        static final String FieldId = "fieldId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportInstanceId = "reportInstanceId";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String FieldDataType = "fieldDataType";

        /** Attribute */
        static final String FieldAlias = "fieldAlias";

        /** Attribute */
        static final String FieldName = "fieldName";

        /** Attribute */
        static final String FieldWidth = "fieldWidth";

        /** Attribute */
        static final String FieldTitle = "fieldTitle";
    } // end DataProperty

    /**
     * Check Unique ReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportDisplayColumn aReportDisplayColumn)
        throws Exception;

    /**
     * insert ReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportDisplayColumn(ReportDisplayColumn aReportDisplayColumn)
        throws Exception;

    /**
     * Batch Insert ReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumn) throws Exception;

    /**
     * Delete ReportDisplayColumn
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportDisplayColumn(final long aId) throws Exception;

    /**
     * Delete ReportDisplayColumn By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportDisplayColumn(ReportDisplayColumnDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportDisplayColumn(ReportDisplayColumn aReportDisplayColumn)
        throws Exception;

    /**
     * Batch Modify ReportDisplayColumn
     *
     * @param aReportDisplayColumn
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumn) throws Exception;

    /**
     * Modify ReportDisplayColumn  By Query Conditions
     *
     * @param aReportDisplayColumn Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportDisplayColumn(ReportDisplayColumn aReportDisplayColumn,
        ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportDisplayColumn
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportDisplayColumn findReportDisplayColumnById(final long aId)
        throws Exception;

    /**
     * Query ReportDisplayColumn
     *
     * @param aQueryBean
     *
     * @return IReportDisplayColumn[]
     *
     * @throws Exception
     *
     * @model type="IReportDisplayColumn" containment="true"
     */
    ReportDisplayColumn[] queryReportDisplayColumn(
        ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportDisplayColumn
     *
     * @param aBaseQueryBean
     *
     * @return IReportDisplayColumn[]
     *
     * @throws Exception
     *
     * @model type="IReportDisplayColumn" containment="true"
     */

    //Map queryReportDisplayColumnForMap(ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportDisplayColumn
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportDisplayColumnCount(
        ReportDisplayColumnDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportDisplayColumn Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportDisplayColumnSelective(
        ReportDisplayColumnDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ReportDisplayColumn
     *
     * @param aReportDisplayColumns
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumns,
        ReportDisplayColumnDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportDisplayColumn
     *
     * @param aReportDisplayColumns
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportDisplayColumn(
        ReportDisplayColumn[] aReportDisplayColumns,
        ReportDisplayColumnDAOQueryBean aQueryBean,
        ReportDisplayColumnSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportDisplayColumnSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportDisplayColumnArray DOCUMENT ME!
         * @param willUpdateReportDisplayColumnArray DOCUMENT ME!
         * @param willDeleteReportDisplayColumnArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportDisplayColumn[] willAddReportDisplayColumnArray,
            ReportDisplayColumn[] willUpdateReportDisplayColumnArray,
            ReportDisplayColumn[] willDeleteReportDisplayColumnArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDisplayColumns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportDisplayColumn[] aReportDisplayColumns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDisplayColumns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportDisplayColumn[] aReportDisplayColumns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDisplayColumns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportDisplayColumn[] aReportDisplayColumns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDisplayColumns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportDisplayColumn[] aReportDisplayColumns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDisplayColumns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportDisplayColumn[] aReportDisplayColumns)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportDisplayColumns DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportDisplayColumn[] aReportDisplayColumns)
            throws Exception;
    } // end ReportDisplayColumnSynchronizeCallback
} // end IBaseReportDisplayColumnDAO
