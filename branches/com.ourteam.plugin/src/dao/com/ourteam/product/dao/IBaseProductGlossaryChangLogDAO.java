/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductGlossaryChangLog Data Access Object
*  GenDate 2011-10-12 13:50:03  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductGlossaryChangLogDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_GLOSSARY_CHANG_LOG";

    /** Attribute */
    static final String Id = "PRODUCT_GLOSSARY_CHANG_LOG.ID";

    /** Attribute */
    static final String AfterChangeContent = "PRODUCT_GLOSSARY_CHANG_LOG.AFTER_CHANGE_CONTENT";

    /** Attribute */
    static final String ApproverId = "PRODUCT_GLOSSARY_CHANG_LOG.APPROVER_ID";

    /** Attribute */
    static final String BeforChangeContent = "PRODUCT_GLOSSARY_CHANG_LOG.BEFOR_CHANGE_CONTENT";

    /** Attribute */
    static final String ChangeReason = "PRODUCT_GLOSSARY_CHANG_LOG.CHANGE_REASON";

    /** Attribute */
    static final String EditorId = "PRODUCT_GLOSSARY_CHANG_LOG.EDITOR_ID";

    /** Attribute */
    static final String EditDate = "PRODUCT_GLOSSARY_CHANG_LOG.EDIT_DATE";

    /** Attribute */
    static final String ProductGlossaryId = "PRODUCT_GLOSSARY_CHANG_LOG.PRODUCT_GLOSSARY_ID";

    /** Attribute */
    static final String Remarks = "PRODUCT_GLOSSARY_CHANG_LOG.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_GLOSSARY_CHANG_LOG.STATUS";

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
        static final String AfterChangeContent = "afterChangeContent";

        /** Attribute */
        static final String ApproverId = "approverId";

        /** Attribute */
        static final String BeforChangeContent = "beforChangeContent";

        /** Attribute */
        static final String ChangeReason = "changeReason";

        /** Attribute */
        static final String EditorId = "editorId";

        /** Attribute */
        static final String EditDate = "editDate";

        /** Attribute */
        static final String ProductGlossaryId = "productGlossaryId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception;

    /**
     * insert ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductGlossaryChangLog(
        ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception;

    /**
     * Batch Insert ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLog)
        throws Exception;

    /**
     * Delete ProductGlossaryChangLog
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductGlossaryChangLog(final long aId)
        throws Exception;

    /**
     * Delete ProductGlossaryChangLog By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductGlossaryChangLog(
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductGlossaryChangLog(
        ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception;

    /**
     * Batch Modify ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLog)
        throws Exception;

    /**
     * Modify ProductGlossaryChangLog  By Query Conditions
     *
     * @param aProductGlossaryChangLog Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductGlossaryChangLog(
        ProductGlossaryChangLog aProductGlossaryChangLog,
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductGlossaryChangLog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductGlossaryChangLog findProductGlossaryChangLogById(final long aId)
        throws Exception;

    /**
     * Query ProductGlossaryChangLog
     *
     * @param aQueryBean
     *
     * @return IProductGlossaryChangLog[]
     *
     * @throws Exception
     *
     * @model type="IProductGlossaryChangLog" containment="true"
     */
    ProductGlossaryChangLog[] queryProductGlossaryChangLog(
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductGlossaryChangLog
     *
     * @param aBaseQueryBean
     *
     * @return IProductGlossaryChangLog[]
     *
     * @throws Exception
     *
     * @model type="IProductGlossaryChangLog" containment="true"
     */

    //Map queryProductGlossaryChangLogForMap(ProductGlossaryChangLogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductGlossaryChangLog
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductGlossaryChangLogCount(
        ProductGlossaryChangLogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductGlossaryChangLog Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductGlossaryChangLogSelective(
        ProductGlossaryChangLogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLogs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLogs,
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLogs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLogs,
        ProductGlossaryChangLogDAOQueryBean aQueryBean,
        ProductGlossaryChangLogSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductGlossaryChangLogSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductGlossaryChangLogArray DOCUMENT ME!
         * @param willUpdateProductGlossaryChangLogArray DOCUMENT ME!
         * @param willDeleteProductGlossaryChangLogArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductGlossaryChangLog[] willAddProductGlossaryChangLogArray,
            ProductGlossaryChangLog[] willUpdateProductGlossaryChangLogArray,
            ProductGlossaryChangLog[] willDeleteProductGlossaryChangLogArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossaryChangLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductGlossaryChangLog[] aProductGlossaryChangLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossaryChangLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductGlossaryChangLog[] aProductGlossaryChangLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossaryChangLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductGlossaryChangLog[] aProductGlossaryChangLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossaryChangLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductGlossaryChangLog[] aProductGlossaryChangLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossaryChangLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductGlossaryChangLog[] aProductGlossaryChangLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossaryChangLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductGlossaryChangLog[] aProductGlossaryChangLogs)
            throws Exception;
    } // end ProductGlossaryChangLogSynchronizeCallback
} // end IBaseProductGlossaryChangLogDAO
