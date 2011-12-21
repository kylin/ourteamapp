/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IServiceParameter Data Access Object
*  GenDate 2011-09-22 10:16:51  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseServiceParameterDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SERVICE_PARAMETER";

    /** Attribute */
    static final String ServiceParameterId = "SERVICE_PARAMETER.SERVICE_PARAMETER_ID";

    /** Attribute */
    static final String DataType = "SERVICE_PARAMETER.DATA_TYPE";

    /** Attribute */
    static final String Description = "SERVICE_PARAMETER.DESCRIPTION";

    /** Attribute */
    static final String IsArray = "SERVICE_PARAMETER.IS_ARRAY";

    /** Attribute */
    static final String Name = "SERVICE_PARAMETER.NAME";

    /** Attribute */
    static final String PreProcess = "SERVICE_PARAMETER.PRE_PROCESS";

    /** Attribute */
    static final String Sort = "SERVICE_PARAMETER.SORT";

    /** Attribute */
    static final String Type = "SERVICE_PARAMETER.TYPE";

    /** Attribute */
    static final String ValidateInfo = "SERVICE_PARAMETER.VALIDATE_INFO";

    /** Attribute */
    static final String ServiceFunctionId = "SERVICE_PARAMETER.SERVICE_FUNCTION_ID";

    /** Attribute */
    static final String ReferenceObjectId = "SERVICE_PARAMETER.REFERENCE_OBJECT_ID";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ServiceParameterId = "serviceParameterId";

        /** Attribute */
        static final String DataType = "dataType";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String IsArray = "isArray";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String PreProcess = "preProcess";

        /** Attribute */
        static final String Sort = "sort";

        /** Attribute */
        static final String Type = "type";

        /** Attribute */
        static final String ValidateInfo = "validateInfo";

        /** Attribute */
        static final String ServiceFunctionId = "serviceFunctionId";

        /** Attribute */
        static final String ReferenceObjectId = "referenceObjectId";
    } // end DataProperty

    /**
     * Check Unique ServiceParameter
     *
     * @param aServiceParameter
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ServiceParameter aServiceParameter)
        throws Exception;

    /**
     * insert ServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     *
     * @model
     */
    void insertServiceParameter(ServiceParameter aServiceParameter)
        throws Exception;

    /**
     * Batch Insert ServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertServiceParameter(ServiceParameter[] aServiceParameter)
        throws Exception;

    /**
     * Delete ServiceParameter
     *
     * @param aServiceParameterId long aServiceParameterId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteServiceParameter(final long aServiceParameterId)
        throws Exception;

    /**
     * Delete ServiceParameter By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteServiceParameter(ServiceParameterDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     *
     * @model
     */
    void updateServiceParameter(ServiceParameter aServiceParameter)
        throws Exception;

    /**
     * Batch Modify ServiceParameter
     *
     * @param aServiceParameter
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateServiceParameter(ServiceParameter[] aServiceParameter)
        throws Exception;

    /**
     * Modify ServiceParameter  By Query Conditions
     *
     * @param aServiceParameter Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateServiceParameter(ServiceParameter aServiceParameter,
        ServiceParameterDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ServiceParameter
     *
     * @param aServiceParameterId long aServiceParameterId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ServiceParameter findServiceParameterById(final long aServiceParameterId)
        throws Exception;

    /**
     * Query ServiceParameter
     *
     * @param aQueryBean
     *
     * @return IServiceParameter[]
     *
     * @throws Exception
     *
     * @model type="IServiceParameter" containment="true"
     */
    ServiceParameter[] queryServiceParameter(
        ServiceParameterDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ServiceParameter
     *
     * @param aBaseQueryBean
     *
     * @return IServiceParameter[]
     *
     * @throws Exception
     *
     * @model type="IServiceParameter" containment="true"
     */

    //Map queryServiceParameterForMap(ServiceParameterDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ServiceParameter
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryServiceParameterCount(ServiceParameterDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ServiceParameter Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryServiceParameterSelective(
        ServiceParameterDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ServiceParameter
     *
     * @param aServiceParameters
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeServiceParameter(ServiceParameter[] aServiceParameters,
        ServiceParameterDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ServiceParameter
     *
     * @param aServiceParameters
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeServiceParameter(ServiceParameter[] aServiceParameters,
        ServiceParameterDAOQueryBean aQueryBean,
        ServiceParameterSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ServiceParameterSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddServiceParameterArray DOCUMENT ME!
         * @param willUpdateServiceParameterArray DOCUMENT ME!
         * @param willDeleteServiceParameterArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ServiceParameter[] willAddServiceParameterArray,
            ServiceParameter[] willUpdateServiceParameterArray,
            ServiceParameter[] willDeleteServiceParameterArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceParameters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ServiceParameter[] aServiceParameters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceParameters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ServiceParameter[] aServiceParameters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceParameters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ServiceParameter[] aServiceParameters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceParameters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ServiceParameter[] aServiceParameters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceParameters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ServiceParameter[] aServiceParameters)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aServiceParameters DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ServiceParameter[] aServiceParameters)
            throws Exception;
    } // end ServiceParameterSynchronizeCallback
} // end IBaseServiceParameterDAO
