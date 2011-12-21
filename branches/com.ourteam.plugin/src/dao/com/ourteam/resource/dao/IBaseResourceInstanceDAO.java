/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IResourceInstance Data Access Object
*  GenDate 2011-09-22 10:18:26  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseResourceInstanceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "RESOURCE_INSTANCE";

    /** Attribute */
    static final String Id = "RESOURCE_INSTANCE.ID";

    /** Attribute */
    static final String Code = "RESOURCE_INSTANCE.CODE";

    /** Attribute */
    static final String Name = "RESOURCE_INSTANCE.NAME";

    /** Attribute */
    static final String Remarks = "RESOURCE_INSTANCE.REMARKS";

    /** Attribute */
    static final String ResourceTypeId = "RESOURCE_INSTANCE.RESOURCE_TYPE_ID";

    /** Attribute */
    static final String Status = "RESOURCE_INSTANCE.STATUS";

    /** Attribute */
    static final String ResourceTypeCode = "resourceTypeB.CODE";

    /** Attribute */
    static final String ResourceTypeName = "resourceTypeB.NAME";

    /** Attribute */
    static final String ResourceTypeStatus = "resourceTypeB.STATUS";

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
        static final String Name = "name";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ResourceTypeId = "resourceTypeId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ResourceTypeCode = "resourceTypeCode";

        /** Attribute */
        static final String ResourceTypeName = "resourceTypeName";

        /** Attribute */
        static final String ResourceTypeStatus = "resourceTypeStatus";
    } // end DataProperty

    /**
     * Check Unique ResourceInstance
     *
     * @param aResourceInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ResourceInstance aResourceInstance)
        throws Exception;

    /**
     * insert ResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     *
     * @model
     */
    void insertResourceInstance(ResourceInstance aResourceInstance)
        throws Exception;

    /**
     * Batch Insert ResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertResourceInstance(ResourceInstance[] aResourceInstance)
        throws Exception;

    /**
     * Delete ResourceInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceInstance(final long aId) throws Exception;

    /**
     * Delete ResourceInstance By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceInstance(ResourceInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceInstance(ResourceInstance aResourceInstance)
        throws Exception;

    /**
     * Batch Modify ResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateResourceInstance(ResourceInstance[] aResourceInstance)
        throws Exception;

    /**
     * Modify ResourceInstance  By Query Conditions
     *
     * @param aResourceInstance Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceInstance(ResourceInstance aResourceInstance,
        ResourceInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ResourceInstance findResourceInstanceById(final long aId)
        throws Exception;

    /**
     * Query ResourceInstance
     *
     * @param aQueryBean
     *
     * @return IResourceInstance[]
     *
     * @throws Exception
     *
     * @model type="IResourceInstance" containment="true"
     */
    ResourceInstance[] queryResourceInstance(
        ResourceInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceInstance
     *
     * @param aBaseQueryBean
     *
     * @return IResourceInstance[]
     *
     * @throws Exception
     *
     * @model type="IResourceInstance" containment="true"
     */

    //Map queryResourceInstanceForMap(ResourceInstanceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ResourceInstance
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryResourceInstanceCount(ResourceInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ResourceInstance Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryResourceInstanceSelective(
        ResourceInstanceDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ResourceInstance
     *
     * @param aResourceInstances
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceInstance(ResourceInstance[] aResourceInstances,
        ResourceInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ResourceInstance
     *
     * @param aResourceInstances
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceInstance(ResourceInstance[] aResourceInstances,
        ResourceInstanceDAOQueryBean aQueryBean,
        ResourceInstanceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ResourceInstanceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddResourceInstanceArray DOCUMENT ME!
         * @param willUpdateResourceInstanceArray DOCUMENT ME!
         * @param willDeleteResourceInstanceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ResourceInstance[] willAddResourceInstanceArray,
            ResourceInstance[] willUpdateResourceInstanceArray,
            ResourceInstance[] willDeleteResourceInstanceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ResourceInstance[] aResourceInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ResourceInstance[] aResourceInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ResourceInstance[] aResourceInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ResourceInstance[] aResourceInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ResourceInstance[] aResourceInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ResourceInstance[] aResourceInstances)
            throws Exception;
    } // end ResourceInstanceSynchronizeCallback
} // end IBaseResourceInstanceDAO
