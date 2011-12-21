/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IServiceFunction Data Access Object
*  GenDate 2011-09-22 10:16:50  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseServiceFunctionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "OBJECT_FUNCTION";

    /** Attribute */
    static final String ObjectFunctionId = "OBJECT_FUNCTION.OBJECT_FUNCTION_ID";

    /** Attribute */
    static final String Description = "OBJECT_FUNCTION.DESCRIPTION";

    /** Attribute */
    static final String IsQuery = "OBJECT_FUNCTION.ISQUERY";

    /** Attribute */
    static final String Name = "OBJECT_FUNCTION.NAME";

    /** Attribute */
    static final String ObjectId = "OBJECT_FUNCTION.OBJECT_ID";

    /** Attribute */
    static final String State = "OBJECT_FUNCTION.STATE";

    /** Attribute */
    static final String Type = "OBJECT_FUNCTION.TYPE";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ObjectFunctionId = "objectFunctionId";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String IsQuery = "isQuery";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String ObjectId = "objectId";

        /** Attribute */
        static final String State = "state";

        /** Attribute */
        static final String Type = "type";
    } // end DataProperty

    /**
     * Check Unique ServiceFunction
     *
     * @param aServiceFunction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ServiceFunction aServiceFunction)
        throws Exception;

    /**
     * insert ServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     *
     * @model
     */
    void insertServiceFunction(ServiceFunction aServiceFunction)
        throws Exception;

    /**
     * Batch Insert ServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertServiceFunction(ServiceFunction[] aServiceFunction)
        throws Exception;

    /**
     * Delete ServiceFunction
     *
     * @param aObjectFunctionId long aObjectFunctionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteServiceFunction(final long aObjectFunctionId)
        throws Exception;

    /**
     * Delete ServiceFunction By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteServiceFunction(ServiceFunctionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     *
     * @model
     */
    void updateServiceFunction(ServiceFunction aServiceFunction)
        throws Exception;

    /**
     * Batch Modify ServiceFunction
     *
     * @param aServiceFunction
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateServiceFunction(ServiceFunction[] aServiceFunction)
        throws Exception;

    /**
     * Modify ServiceFunction  By Query Conditions
     *
     * @param aServiceFunction Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateServiceFunction(ServiceFunction aServiceFunction,
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ServiceFunction
     *
     * @param aObjectFunctionId long aObjectFunctionId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ServiceFunction findServiceFunctionById(final long aObjectFunctionId)
        throws Exception;

    /**
     * Query ServiceFunction
     *
     * @param aQueryBean
     *
     * @return IServiceFunction[]
     *
     * @throws Exception
     *
     * @model type="IServiceFunction" containment="true"
     */
    ServiceFunction[] queryServiceFunction(
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ServiceFunction
     *
     * @param aBaseQueryBean
     *
     * @return IServiceFunction[]
     *
     * @throws Exception
     *
     * @model type="IServiceFunction" containment="true"
     */

    //Map queryServiceFunctionForMap(ServiceFunctionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ServiceFunction
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryServiceFunctionCount(ServiceFunctionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ServiceFunction Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryServiceFunctionSelective(
        ServiceFunctionDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ServiceFunction
     *
     * @param aServiceFunctions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeServiceFunction(ServiceFunction[] aServiceFunctions,
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ServiceFunction
     *
     * @param aServiceFunctions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeServiceFunction(ServiceFunction[] aServiceFunctions,
        ServiceFunctionDAOQueryBean aQueryBean,
        ServiceFunctionSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ServiceFunctionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddServiceFunctionArray DOCUMENT ME!
         * @param willUpdateServiceFunctionArray DOCUMENT ME!
         * @param willDeleteServiceFunctionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ServiceFunction[] willAddServiceFunctionArray,
            ServiceFunction[] willUpdateServiceFunctionArray,
            ServiceFunction[] willDeleteServiceFunctionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ServiceFunction[] aServiceFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ServiceFunction[] aServiceFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ServiceFunction[] aServiceFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ServiceFunction[] aServiceFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ServiceFunction[] aServiceFunctions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceFunctions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ServiceFunction[] aServiceFunctions)
            throws Exception;
    } // end ServiceFunctionSynchronizeCallback

    /**
     * Query Related IServiceParameter
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IServiceParameter" containment="true"
     */
    com.ourteam.modelbase.dao.ServiceParameter[] queryServiceParameters(
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IServiceParameter to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IServiceParameter" containment="true"
     */

    //Map queryServiceParametersForMap(ServiceFunctionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IServiceParameter Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryServiceParametersSelective(
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related IServiceParameter
     *
     * @param aServiceParameter {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateServiceParameter(
        com.ourteam.modelbase.dao.ServiceParameter aServiceParameter,
        ServiceFunctionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IServiceParameter
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteServiceParameter(ServiceFunctionDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseServiceFunctionDAO
