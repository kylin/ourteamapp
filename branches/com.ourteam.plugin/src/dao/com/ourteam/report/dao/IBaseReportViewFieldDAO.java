/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.report.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IReportViewField Data Access Object
*  GenDate 2011-09-27 11:37:59  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseReportViewFieldDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "REPORT_VIEW_FIELD";

    /** Attribute */
    static final String Id = "REPORT_VIEW_FIELD.ID";

    /** Attribute */
    static final String DataType = "REPORT_VIEW_FIELD.DATA_TYPE";

    /** Attribute */
    static final String FieldAlias = "REPORT_VIEW_FIELD.FIELD_ALIAS";

    /** Attribute */
    static final String FieldName = "REPORT_VIEW_FIELD.FIELD_NAME";

    /** Attribute */
    static final String ListSourceId = "REPORT_VIEW_FIELD.LIST_SOURCE_ID";

    /** Attribute */
    static final String Remarks = "REPORT_VIEW_FIELD.REMARKS";

    /** Attribute */
    static final String ReportViewId = "REPORT_VIEW_FIELD.REPORT_VIEW_ID";

    /** Attribute */
    static final String Status = "REPORT_VIEW_FIELD.STATUS";

    /** Attribute */
    static final String Title = "REPORT_VIEW_FIELD.TITLE";

    /** Attribute */
    static final String Width = "REPORT_VIEW_FIELD.WIDTH";

    /** Attribute */
    static final String ListSourceCode = "reportListSourceB.CODE";

    /** Attribute */
    static final String ListSourceName = "reportListSourceB.NAME";

    /** Attribute */
    static final String TableId = "REPORT_VIEW_FIELD.TABLE_ID";

    /** Attribute */
    static final String TableName = "reportViewTableB.TABLE_NAME";

    /** Attribute */
    static final String TableAlias = "reportViewTableB.TABLE_ALIAS";

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
        static final String DataType = "dataType";

        /** Attribute */
        static final String FieldAlias = "fieldAlias";

        /** Attribute */
        static final String FieldName = "fieldName";

        /** Attribute */
        static final String ListSourceId = "listSourceId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ReportViewId = "reportViewId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String Title = "title";

        /** Attribute */
        static final String Width = "width";

        /** Attribute */
        static final String ListSourceCode = "listSourceCode";

        /** Attribute */
        static final String ListSourceName = "listSourceName";

        /** Attribute */
        static final String TableId = "tableId";

        /** Attribute */
        static final String TableName = "tableName";

        /** Attribute */
        static final String TableAlias = "tableAlias";
    } // end DataProperty

    /**
     * Check Unique ReportViewField
     *
     * @param aReportViewField
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ReportViewField aReportViewField)
        throws Exception;

    /**
     * insert ReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     *
     * @model
     */
    void insertReportViewField(ReportViewField aReportViewField)
        throws Exception;

    /**
     * Batch Insert ReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertReportViewField(ReportViewField[] aReportViewField)
        throws Exception;

    /**
     * Delete ReportViewField
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewField(final long aId) throws Exception;

    /**
     * Delete ReportViewField By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteReportViewField(ReportViewFieldDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewField(ReportViewField aReportViewField)
        throws Exception;

    /**
     * Batch Modify ReportViewField
     *
     * @param aReportViewField
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateReportViewField(ReportViewField[] aReportViewField)
        throws Exception;

    /**
     * Modify ReportViewField  By Query Conditions
     *
     * @param aReportViewField Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateReportViewField(ReportViewField aReportViewField,
        ReportViewFieldDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewField
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ReportViewField findReportViewFieldById(final long aId)
        throws Exception;

    /**
     * Query ReportViewField
     *
     * @param aQueryBean
     *
     * @return IReportViewField[]
     *
     * @throws Exception
     *
     * @model type="IReportViewField" containment="true"
     */
    ReportViewField[] queryReportViewField(
        ReportViewFieldDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ReportViewField
     *
     * @param aBaseQueryBean
     *
     * @return IReportViewField[]
     *
     * @throws Exception
     *
     * @model type="IReportViewField" containment="true"
     */

    //Map queryReportViewFieldForMap(ReportViewFieldDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ReportViewField
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryReportViewFieldCount(ReportViewFieldDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ReportViewField Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryReportViewFieldSelective(
        ReportViewFieldDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ReportViewField
     *
     * @param aReportViewFields
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewField(ReportViewField[] aReportViewFields,
        ReportViewFieldDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ReportViewField
     *
     * @param aReportViewFields
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeReportViewField(ReportViewField[] aReportViewFields,
        ReportViewFieldDAOQueryBean aQueryBean,
        ReportViewFieldSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ReportViewFieldSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddReportViewFieldArray DOCUMENT ME!
         * @param willUpdateReportViewFieldArray DOCUMENT ME!
         * @param willDeleteReportViewFieldArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ReportViewField[] willAddReportViewFieldArray,
            ReportViewField[] willUpdateReportViewFieldArray,
            ReportViewField[] willDeleteReportViewFieldArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewFields DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ReportViewField[] aReportViewFields)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewFields DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ReportViewField[] aReportViewFields)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewFields DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ReportViewField[] aReportViewFields)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewFields DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ReportViewField[] aReportViewFields)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewFields DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ReportViewField[] aReportViewFields)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aReportViewFields DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ReportViewField[] aReportViewFields)
            throws Exception;
    } // end ReportViewFieldSynchronizeCallback
} // end IBaseReportViewFieldDAO
