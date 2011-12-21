/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IResourceType Data Access Object
*  GenDate 2011-09-22 10:18:28  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseResourceTypeDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "RESOURCE_TYPE";

    /** Attribute */
    static final String Id = "RESOURCE_TYPE.ID";

    /** Attribute */
    static final String Code = "RESOURCE_TYPE.CODE";

    /** Attribute */
    static final String Name = "RESOURCE_TYPE.NAME";

    /** Attribute */
    static final String Remarks = "RESOURCE_TYPE.REMARKS";

    /** Attribute */
    static final String Status = "RESOURCE_TYPE.STATUS";

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
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique ResourceType
     *
     * @param aResourceType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ResourceType aResourceType) throws Exception;

    /**
     * insert ResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void insertResourceType(ResourceType aResourceType)
        throws Exception;

    /**
     * Batch Insert ResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertResourceType(ResourceType[] aResourceType)
        throws Exception;

    /**
     * Delete ResourceType
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceType(final long aId) throws Exception;

    /**
     * Delete ResourceType By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceType(ResourceTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceType(ResourceType aResourceType)
        throws Exception;

    /**
     * Batch Modify ResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateResourceType(ResourceType[] aResourceType)
        throws Exception;

    /**
     * Modify ResourceType  By Query Conditions
     *
     * @param aResourceType Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceType(ResourceType aResourceType,
        ResourceTypeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceType
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ResourceType findResourceTypeById(final long aId) throws Exception;

    /**
     * Query ResourceType
     *
     * @param aQueryBean
     *
     * @return IResourceType[]
     *
     * @throws Exception
     *
     * @model type="IResourceType" containment="true"
     */
    ResourceType[] queryResourceType(ResourceTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query ResourceType
     *
     * @param aBaseQueryBean
     *
     * @return IResourceType[]
     *
     * @throws Exception
     *
     * @model type="IResourceType" containment="true"
     */

    //Map queryResourceTypeForMap(ResourceTypeDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ResourceType
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryResourceTypeCount(ResourceTypeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ResourceType Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryResourceTypeSelective(ResourceTypeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize ResourceType
     *
     * @param aResourceTypes
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceType(ResourceType[] aResourceTypes,
        ResourceTypeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ResourceType
     *
     * @param aResourceTypes
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceType(ResourceType[] aResourceTypes,
        ResourceTypeDAOQueryBean aQueryBean,
        ResourceTypeSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ResourceTypeSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddResourceTypeArray DOCUMENT ME!
         * @param willUpdateResourceTypeArray DOCUMENT ME!
         * @param willDeleteResourceTypeArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(ResourceType[] willAddResourceTypeArray,
            ResourceType[] willUpdateResourceTypeArray,
            ResourceType[] willDeleteResourceTypeArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ResourceType[] aResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ResourceType[] aResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ResourceType[] aResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ResourceType[] aResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ResourceType[] aResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ResourceType[] aResourceTypes)
            throws Exception;
    } // end ResourceTypeSynchronizeCallback
} // end IBaseResourceTypeDAO
