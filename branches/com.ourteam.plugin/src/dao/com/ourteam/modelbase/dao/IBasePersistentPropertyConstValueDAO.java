/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IPersistentPropertyConstValue Data Access Object
*  GenDate 2011-09-22 10:16:50  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBasePersistentPropertyConstValueDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_FIELD_DESC";

    /** Attribute */
    static final String ColumnId = "SYS_FIELD_DESC.COLUMN_ID";

    /** Attribute */
    static final String ColumnName = "SYS_FIELD_DESC.COLUMN_NAME";

    /** Attribute */
    static final String DelFlag = "SYS_FIELD_DESC.DEL_FLAG";

    /** Attribute */
    static final String Description = "SYS_FIELD_DESC.DESCRIPTION";

    /** Attribute */
    static final String FieldOrder = "SYS_FIELD_DESC.FIELD_ORDER";

    /** Attribute */
    static final String RowId = "SYS_FIELD_DESC.ROW_ID";

    /** Attribute */
    static final String TableName = "SYS_FIELD_DESC.TABLE_NAME";

    /** Attribute */
    static final String Value = "SYS_FIELD_DESC.VALUE";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ColumnId = "columnId";

        /** Attribute */
        static final String ColumnName = "columnName";

        /** Attribute */
        static final String DelFlag = "delFlag";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String FieldOrder = "fieldOrder";

        /** Attribute */
        static final String RowId = "rowId";

        /** Attribute */
        static final String TableName = "tableName";

        /** Attribute */
        static final String Value = "value";
    } // end DataProperty

    /**
     * Check Unique PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception;

    /**
     * insert PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     *
     * @model
     */
    void insertPersistentPropertyConstValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception;

    /**
     * Batch Insert PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertPersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValue)
        throws Exception;

    /**
     * Delete PersistentPropertyConstValue
     *
     * @param aRowId long aRowId
     *
     * @throws Exception
     *
     * @model
     */
    void deletePersistentPropertyConstValue(final long aRowId)
        throws Exception;

    /**
     * Delete PersistentPropertyConstValue By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deletePersistentPropertyConstValue(
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     *
     * @model
     */
    void updatePersistentPropertyConstValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue)
        throws Exception;

    /**
     * Batch Modify PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValue
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdatePersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValue)
        throws Exception;

    /**
     * Modify PersistentPropertyConstValue  By Query Conditions
     *
     * @param aPersistentPropertyConstValue Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updatePersistentPropertyConstValue(
        PersistentPropertyConstValue aPersistentPropertyConstValue,
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query PersistentPropertyConstValue
     *
     * @param aRowId long aRowId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    PersistentPropertyConstValue findPersistentPropertyConstValueById(
        final long aRowId) throws Exception;

    /**
     * Query PersistentPropertyConstValue
     *
     * @param aQueryBean
     *
     * @return IPersistentPropertyConstValue[]
     *
     * @throws Exception
     *
     * @model type="IPersistentPropertyConstValue" containment="true"
     */
    PersistentPropertyConstValue[] queryPersistentPropertyConstValue(
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query PersistentPropertyConstValue
     *
     * @param aBaseQueryBean
     *
     * @return IPersistentPropertyConstValue[]
     *
     * @throws Exception
     *
     * @model type="IPersistentPropertyConstValue" containment="true"
     */

    //Map queryPersistentPropertyConstValueForMap(PersistentPropertyConstValueDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count PersistentPropertyConstValue
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryPersistentPropertyConstValueCount(
        PersistentPropertyConstValueDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query PersistentPropertyConstValue Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryPersistentPropertyConstValueSelective(
        PersistentPropertyConstValueDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValues
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizePersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValues,
        PersistentPropertyConstValueDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize PersistentPropertyConstValue
     *
     * @param aPersistentPropertyConstValues
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizePersistentPropertyConstValue(
        PersistentPropertyConstValue[] aPersistentPropertyConstValues,
        PersistentPropertyConstValueDAOQueryBean aQueryBean,
        PersistentPropertyConstValueSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface PersistentPropertyConstValueSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddPersistentPropertyConstValueArray DOCUMENT ME!
         * @param willUpdatePersistentPropertyConstValueArray DOCUMENT ME!
         * @param willDeletePersistentPropertyConstValueArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            PersistentPropertyConstValue[] willAddPersistentPropertyConstValueArray,
            PersistentPropertyConstValue[] willUpdatePersistentPropertyConstValueArray,
            PersistentPropertyConstValue[] willDeletePersistentPropertyConstValueArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aPersistentPropertyConstValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            PersistentPropertyConstValue[] aPersistentPropertyConstValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aPersistentPropertyConstValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            PersistentPropertyConstValue[] aPersistentPropertyConstValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aPersistentPropertyConstValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            PersistentPropertyConstValue[] aPersistentPropertyConstValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aPersistentPropertyConstValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            PersistentPropertyConstValue[] aPersistentPropertyConstValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aPersistentPropertyConstValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            PersistentPropertyConstValue[] aPersistentPropertyConstValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aPersistentPropertyConstValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            PersistentPropertyConstValue[] aPersistentPropertyConstValues)
            throws Exception;
    } // end PersistentPropertyConstValueSynchronizeCallback
} // end IBasePersistentPropertyConstValueDAO
