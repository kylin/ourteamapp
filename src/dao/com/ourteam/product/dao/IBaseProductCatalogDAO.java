/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductCatalog Data Access Object
*  GenDate 2011-10-10 16:06:16  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductCatalogDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_CATALOG";

    /** Attribute */
    static final String CatalogName = "PRODUCT_CATALOG.CATALOG_NAME";

    /** Attribute */
    static final String Id = "PRODUCT_CATALOG.ID";

    /** Attribute */
    static final String ParentId = "PRODUCT_CATALOG.PARENT_ID";

    /** Attribute */
    static final String Remarks = "PRODUCT_CATALOG.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_CATALOG.STATUS";

    /** Attribute */
    static final String SortIndex = "PRODUCT_CATALOG.SORT_INDEX";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String CatalogName = "catalogName";

        /** Attribute */
        static final String Id = "id";

        /** Attribute */
        static final String ParentId = "parentId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SortIndex = "sortIndex";
    } // end DataProperty

    /**
     * Check Unique ProductCatalog
     *
     * @param aProductCatalog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductCatalog aProductCatalog)
        throws Exception;

    /**
     * insert ProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductCatalog(ProductCatalog aProductCatalog)
        throws Exception;

    /**
     * Batch Insert ProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductCatalog(ProductCatalog[] aProductCatalog)
        throws Exception;

    /**
     * Delete ProductCatalog
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductCatalog(final long aId) throws Exception;

    /**
     * Delete ProductCatalog By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductCatalog(ProductCatalogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductCatalog(ProductCatalog aProductCatalog)
        throws Exception;

    /**
     * Batch Modify ProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductCatalog(ProductCatalog[] aProductCatalog)
        throws Exception;

    /**
     * Modify ProductCatalog  By Query Conditions
     *
     * @param aProductCatalog Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductCatalog(ProductCatalog aProductCatalog,
        ProductCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductCatalog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductCatalog findProductCatalogById(final long aId)
        throws Exception;

    /**
     * Query ProductCatalog
     *
     * @param aQueryBean
     *
     * @return IProductCatalog[]
     *
     * @throws Exception
     *
     * @model type="IProductCatalog" containment="true"
     */
    ProductCatalog[] queryProductCatalog(ProductCatalogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ProductCatalog
     *
     * @param aBaseQueryBean
     *
     * @return IProductCatalog[]
     *
     * @throws Exception
     *
     * @model type="IProductCatalog" containment="true"
     */

    //Map queryProductCatalogForMap(ProductCatalogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductCatalog
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductCatalogCount(ProductCatalogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductCatalog Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductCatalogSelective(
        ProductCatalogDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ProductCatalog
     *
     * @param aProductCatalogs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductCatalog(ProductCatalog[] aProductCatalogs,
        ProductCatalogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProductCatalog
     *
     * @param aProductCatalogs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductCatalog(ProductCatalog[] aProductCatalogs,
        ProductCatalogDAOQueryBean aQueryBean,
        ProductCatalogSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductCatalogSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductCatalogArray DOCUMENT ME!
         * @param willUpdateProductCatalogArray DOCUMENT ME!
         * @param willDeleteProductCatalogArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductCatalog[] willAddProductCatalogArray,
            ProductCatalog[] willUpdateProductCatalogArray,
            ProductCatalog[] willDeleteProductCatalogArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductCatalog[] aProductCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductCatalog[] aProductCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductCatalog[] aProductCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductCatalog[] aProductCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductCatalog[] aProductCatalogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductCatalogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductCatalog[] aProductCatalogs)
            throws Exception;
    } // end ProductCatalogSynchronizeCallback
} // end IBaseProductCatalogDAO
