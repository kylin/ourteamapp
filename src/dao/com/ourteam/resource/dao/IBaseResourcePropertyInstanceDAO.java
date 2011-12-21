/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IResourcePropertyInstance Data Access Object
*  GenDate 2011-09-22 10:18:27  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseResourcePropertyInstanceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "RESOURCE_PROPERTY_INSTANCE";

    /** Attribute */
    static final String Id = "RESOURCE_PROPERTY_INSTANCE.ID";

    /** Attribute */
    static final String Remarks = "RESOURCE_PROPERTY_INSTANCE.REMARKS";

    /** Attribute */
    static final String ResourceInstanceId = "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID";

    /** Attribute */
    static final String ResourcePropertyId = "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID";

    /** Attribute */
    static final String Status = "RESOURCE_PROPERTY_INSTANCE.STATUS";

    /** Attribute */
    static final String Value = "RESOURCE_PROPERTY_INSTANCE.VALUE";

    /** Attribute */
    static final String PropertyCode = "resourcePropertyC.CODE";

    /** Attribute */
    static final String PropertyName = "resourcePropertyC.NAME";

    /** Attribute */
    static final String PropertyDataType = "resourcePropertyC.DATA_TYPE";

    /** Attribute */
    static final String PropertySortIndex = "resourcePropertyC.SORT_INDEX";

    /** Attribute */
    static final String PropertyStatus = "resourcePropertyC.STATUS";

    /** Attribute */
    static final String ResourceTypeId = "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID";

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
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ResourceInstanceId = "resourceInstanceId";

        /** Attribute */
        static final String ResourcePropertyId = "resourcePropertyId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String Value = "value";

        /** Attribute */
        static final String PropertyCode = "propertyCode";

        /** Attribute */
        static final String PropertyName = "propertyName";

        /** Attribute */
        static final String PropertyDataType = "propertyDataType";

        /** Attribute */
        static final String PropertySortIndex = "propertySortIndex";

        /** Attribute */
        static final String PropertyStatus = "propertyStatus";

        /** Attribute */
        static final String ResourceTypeId = "resourceTypeId";
    } // end DataProperty

    /**
     * Check Unique ResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception;

    /**
     * insert ResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     *
     * @model
     */
    void insertResourcePropertyInstance(
        ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception;

    /**
     * Batch Insert ResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstance)
        throws Exception;

    /**
     * Delete ResourcePropertyInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourcePropertyInstance(final long aId)
        throws Exception;

    /**
     * Delete ResourcePropertyInstance By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourcePropertyInstance(
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourcePropertyInstance(
        ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception;

    /**
     * Batch Modify ResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstance)
        throws Exception;

    /**
     * Modify ResourcePropertyInstance  By Query Conditions
     *
     * @param aResourcePropertyInstance Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourcePropertyInstance(
        ResourcePropertyInstance aResourcePropertyInstance,
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ResourcePropertyInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ResourcePropertyInstance findResourcePropertyInstanceById(final long aId)
        throws Exception;

    /**
     * Query ResourcePropertyInstance
     *
     * @param aQueryBean
     *
     * @return IResourcePropertyInstance[]
     *
     * @throws Exception
     *
     * @model type="IResourcePropertyInstance" containment="true"
     */
    ResourcePropertyInstance[] queryResourcePropertyInstance(
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ResourcePropertyInstance
     *
     * @param aBaseQueryBean
     *
     * @return IResourcePropertyInstance[]
     *
     * @throws Exception
     *
     * @model type="IResourcePropertyInstance" containment="true"
     */

    //Map queryResourcePropertyInstanceForMap(ResourcePropertyInstanceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ResourcePropertyInstance
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryResourcePropertyInstanceCount(
        ResourcePropertyInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ResourcePropertyInstance Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryResourcePropertyInstanceSelective(
        ResourcePropertyInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ResourcePropertyInstance
     *
     * @param aResourcePropertyInstances
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstances,
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize ResourcePropertyInstance
     *
     * @param aResourcePropertyInstances
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstances,
        ResourcePropertyInstanceDAOQueryBean aQueryBean,
        ResourcePropertyInstanceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ResourcePropertyInstanceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddResourcePropertyInstanceArray DOCUMENT ME!
         * @param willUpdateResourcePropertyInstanceArray DOCUMENT ME!
         * @param willDeleteResourcePropertyInstanceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ResourcePropertyInstance[] willAddResourcePropertyInstanceArray,
            ResourcePropertyInstance[] willUpdateResourcePropertyInstanceArray,
            ResourcePropertyInstance[] willDeleteResourcePropertyInstanceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertyInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ResourcePropertyInstance[] aResourcePropertyInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertyInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ResourcePropertyInstance[] aResourcePropertyInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertyInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ResourcePropertyInstance[] aResourcePropertyInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertyInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ResourcePropertyInstance[] aResourcePropertyInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertyInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ResourcePropertyInstance[] aResourcePropertyInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertyInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ResourcePropertyInstance[] aResourcePropertyInstances)
            throws Exception;
    } // end ResourcePropertyInstanceSynchronizeCallback
} // end IBaseResourcePropertyInstanceDAO
