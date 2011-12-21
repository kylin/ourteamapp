/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IProductFunction Data Access Object
*  GenDate 2011-10-10 16:06:17  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseProductFunctionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "PRODUCT_FUNCTION";

    /** Attribute */
    static final String Id = "PRODUCT_FUNCTION.ID";

    /** Attribute */
    static final String FunctionCode = "PRODUCT_FUNCTION.FUNCTION_CODE";

    /** Attribute */
    static final String FunctionName = "PRODUCT_FUNCTION.FUNCTION_NAME";

    /** Attribute */
    static final String ParentFunctionId = "PRODUCT_FUNCTION.PARENT_FUNCTION_ID";

    /** Attribute */
    static final String ProductDefineId = "PRODUCT_FUNCTION.PRODUCT_DEFINE_ID";

    /** Attribute */
    static final String Remarks = "PRODUCT_FUNCTION.REMARKS";

    /** Attribute */
    static final String Status = "PRODUCT_FUNCTION.STATUS";

    /** Attribute */
    static final String CanTest = "PRODUCT_FUNCTION.CAN_TEST";

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
        static final String FunctionCode = "functionCode";

        /** Attribute */
        static final String FunctionName = "functionName";

        /** Attribute */
        static final String ParentFunctionId = "parentFunctionId";

        /** Attribute */
        static final String ProductDefineId = "productDefineId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String CanTest = "canTest";
    } // end DataProperty

    /**
     * Check Unique ProductFunction
     *
     * @param aProductFunction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ProductFunction aProductFunction)
        throws Exception;

    /**
     * insert ProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     *
     * @model
     */
    void insertProductFunction(ProductFunction aProductFunction)
        throws Exception;

    /**
     * Batch Insert ProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertProductFunction(ProductFunction[] aProductFunction)
        throws Exception;

    /**
     * Delete ProductFunction
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductFunction(final long aId) throws Exception;

    /**
     * Delete ProductFunction By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteProductFunction(ProductFunctionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductFunction(ProductFunction aProductFunction)
        throws Exception;

    /**
     * Batch Modify ProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateProductFunction(ProductFunction[] aProductFunction)
        throws Exception;

    /**
     * Modify ProductFunction  By Query Conditions
     *
     * @param aProductFunction Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateProductFunction(ProductFunction aProductFunction,
        ProductFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductFunction
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ProductFunction findProductFunctionById(final long aId)
        throws Exception;

    /**
     * Query ProductFunction
     *
     * @param aQueryBean
     *
     * @return IProductFunction[]
     *
     * @throws Exception
     *
     * @model type="IProductFunction" containment="true"
     */
    ProductFunction[] queryProductFunction(
        ProductFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ProductFunction
     *
     * @param aBaseQueryBean
     *
     * @return IProductFunction[]
     *
     * @throws Exception
     *
     * @model type="IProductFunction" containment="true"
     */

    //Map queryProductFunctionForMap(ProductFunctionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ProductFunction
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryProductFunctionCount(ProductFunctionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ProductFunction Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryProductFunctionSelective(
        ProductFunctionDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ProductFunction
     *
     * @param aProductFunctions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductFunction(ProductFunction[] aProductFunctions,
        ProductFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ProductFunction
     *
     * @param aProductFunctions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeProductFunction(ProductFunction[] aProductFunctions,
        ProductFunctionDAOQueryBean aQueryBean,
        ProductFunctionSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ProductFunctionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddProductFunctionArray DOCUMENT ME!
         * @param willUpdateProductFunctionArray DOCUMENT ME!
         * @param willDeleteProductFunctionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ProductFunction[] willAddProductFunctionArray,
            ProductFunction[] willUpdateProductFunctionArray,
            ProductFunction[] willDeleteProductFunctionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ProductFunction[] aProductFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ProductFunction[] aProductFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ProductFunction[] aProductFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ProductFunction[] aProductFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ProductFunction[] aProductFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aProductFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ProductFunction[] aProductFunctions)
            throws Exception;
    } // end ProductFunctionSynchronizeCallback
} // end IBaseProductFunctionDAO
