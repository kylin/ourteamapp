/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductGlossary Data Access Object
*  GenDate 2011-10-12 16:26:30  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductGlossaryDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_GLOSSARY";

    /** Attribute */
    static final String Id = "PRODUCT_GLOSSARY.ID";

    /** Attribute */
    static final String Code = "PRODUCT_GLOSSARY.CODE";

    /** Attribute */
    static final String Content = "PRODUCT_GLOSSARY.CONTENT";

    /** Attribute */
    static final String CreateDate = "PRODUCT_GLOSSARY.CREATE_DATE";

    /** Attribute */
    static final String CreatorId = "PRODUCT_GLOSSARY.CREATOR_ID";

    /** Attribute */
    static final String LastEditorId = "PRODUCT_GLOSSARY.LAST_EDITOR_ID";

    /** Attribute */
    static final String LastEditDate = "PRODUCT_GLOSSARY.LAST_EDIT_DATE";

    /** Attribute */
    static final String Name = "PRODUCT_GLOSSARY.NAME";

    /** Attribute */
    static final String ProductId = "PRODUCT_GLOSSARY.PRODUCT_ID";

    /** Attribute */
    static final String Remarks = "PRODUCT_GLOSSARY.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_GLOSSARY.STATUS";

    /** Attribute */
    static final String LastEditorName = "lastEditorA.USER_NAME";

    /** Attribute */
    static final String SinceVersionId = "PRODUCT_GLOSSARY.SINCE_VERSION_ID";

    /** Attribute */
    static final String SinceVersion = "productVersionA.PRODUCT_VERSION";

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
        static final String Content = "content";

        /** Attribute */
        static final String CreateDate = "createDate";

        /** Attribute */
        static final String CreatorId = "creatorId";

        /** Attribute */
        static final String LastEditorId = "lastEditorId";

        /** Attribute */
        static final String LastEditDate = "lastEditDate";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String ProductId = "productId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String LastEditorName = "lastEditorName";

        /** Attribute */
        static final String SinceVersionId = "sinceVersionId";

        /** Attribute */
        static final String SinceVersion = "sinceVersion";
    } // end DataProperty

    /**
     * Check Unique ProductGlossary
     *
     * @param aProductGlossary
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductGlossary aProductGlossary)
        throws Exception;

    /**
     * insert ProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductGlossary(ProductGlossary aProductGlossary)
        throws Exception;

    /**
     * Batch Insert ProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductGlossary(ProductGlossary[] aProductGlossary)
        throws Exception;

    /**
     * Delete ProductGlossary
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductGlossary(final long aId) throws Exception;

    /**
     * Delete ProductGlossary By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductGlossary(ProductGlossaryDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductGlossary(ProductGlossary aProductGlossary)
        throws Exception;

    /**
     * Batch Modify ProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductGlossary(ProductGlossary[] aProductGlossary)
        throws Exception;

    /**
     * Modify ProductGlossary  By Query Conditions
     *
     * @param aProductGlossary Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductGlossary(ProductGlossary aProductGlossary,
        ProductGlossaryDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductGlossary
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductGlossary findProductGlossaryById(final long aId)
        throws Exception;

    /**
     * Query ProductGlossary
     *
     * @param aQueryBean
     *
     * @return IProductGlossary[]
     *
     * @throws Exception
     *
     * @model type="IProductGlossary" containment="true"
     */
    ProductGlossary[] queryProductGlossary(
        ProductGlossaryDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductGlossary
     *
     * @param aBaseQueryBean
     *
     * @return IProductGlossary[]
     *
     * @throws Exception
     *
     * @model type="IProductGlossary" containment="true"
     */

    //Map queryProductGlossaryForMap(ProductGlossaryDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductGlossary
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductGlossaryCount(ProductGlossaryDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductGlossary Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductGlossarySelective(
        ProductGlossaryDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ProductGlossary
     *
     * @param aProductGlossarys
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductGlossary(ProductGlossary[] aProductGlossarys,
        ProductGlossaryDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProductGlossary
     *
     * @param aProductGlossarys
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductGlossary(ProductGlossary[] aProductGlossarys,
        ProductGlossaryDAOQueryBean aQueryBean,
        ProductGlossarySynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductGlossarySynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductGlossaryArray DOCUMENT ME!
         * @param willUpdateProductGlossaryArray DOCUMENT ME!
         * @param willDeleteProductGlossaryArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductGlossary[] willAddProductGlossaryArray,
            ProductGlossary[] willUpdateProductGlossaryArray,
            ProductGlossary[] willDeleteProductGlossaryArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossarys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductGlossary[] aProductGlossarys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossarys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductGlossary[] aProductGlossarys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossarys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductGlossary[] aProductGlossarys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossarys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductGlossary[] aProductGlossarys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossarys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductGlossary[] aProductGlossarys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductGlossarys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductGlossary[] aProductGlossarys)
            throws Exception;
    } // end ProductGlossarySynchronizeCallback
} // end IBaseProductGlossaryDAO
