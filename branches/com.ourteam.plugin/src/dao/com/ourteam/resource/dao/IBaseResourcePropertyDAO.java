/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IResourceProperty Data Access Object
*  GenDate 2011-09-22 10:18:26  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseResourcePropertyDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "RESOURCE_PROPERTY";

    /** Attribute */
    static final String Id = "RESOURCE_PROPERTY.ID";

    /** Attribute */
    static final String Code = "RESOURCE_PROPERTY.CODE";

    /** Attribute */
    static final String DataType = "RESOURCE_PROPERTY.DATA_TYPE";

    /** Attribute */
    static final String Name = "RESOURCE_PROPERTY.NAME";

    /** Attribute */
    static final String Remarks = "RESOURCE_PROPERTY.REMARKS";

    /** Attribute */
    static final String ResourceTypeId = "RESOURCE_PROPERTY.RESOURCE_TYPE_ID";

    /** Attribute */
    static final String SortIndex = "RESOURCE_PROPERTY.SORT_INDEX";

    /** Attribute */
    static final String Status = "RESOURCE_PROPERTY.STATUS";

    /** Attribute */
    static final String ResourceTypeCode = "resourceTypeA.CODE";

    /** Attribute */
    static final String ResourceTypeName = "resourceTypeA.NAME";

    /** Attribute */
    static final String ResourceTypeStatus = "resourceTypeA.STATUS";

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
        static final String DataType = "dataType";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ResourceTypeId = "resourceTypeId";

        /** Attribute */
        static final String SortIndex = "sortIndex";

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
     * Check Unique ResourceProperty
     *
     * @param aResourceProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(ResourceProperty aResourceProperty)
        throws Exception;

    /**
     * insert ResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void insertResourceProperty(ResourceProperty aResourceProperty)
        throws Exception;

    /**
     * Batch Insert ResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertResourceProperty(ResourceProperty[] aResourceProperty)
        throws Exception;

    /**
     * Delete ResourceProperty
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceProperty(final long aId) throws Exception;

    /**
     * Delete ResourceProperty By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteResourceProperty(ResourcePropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify ResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceProperty(ResourceProperty aResourceProperty)
        throws Exception;

    /**
     * Batch Modify ResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateResourceProperty(ResourceProperty[] aResourceProperty)
        throws Exception;

    /**
     * Modify ResourceProperty  By Query Conditions
     *
     * @param aResourceProperty Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateResourceProperty(ResourceProperty aResourceProperty,
        ResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceProperty
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    ResourceProperty findResourcePropertyById(final long aId)
        throws Exception;

    /**
     * Query ResourceProperty
     *
     * @param aQueryBean
     *
     * @return IResourceProperty[]
     *
     * @throws Exception
     *
     * @model type="IResourceProperty" containment="true"
     */
    ResourceProperty[] queryResourceProperty(
        ResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query ResourceProperty
     *
     * @param aBaseQueryBean
     *
     * @return IResourceProperty[]
     *
     * @throws Exception
     *
     * @model type="IResourceProperty" containment="true"
     */

    //Map queryResourcePropertyForMap(ResourcePropertyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count ResourceProperty
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryResourcePropertyCount(ResourcePropertyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query ResourceProperty Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryResourcePropertySelective(
        ResourcePropertyDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize ResourceProperty
     *
     * @param aResourcePropertys
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceProperty(ResourceProperty[] aResourcePropertys,
        ResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize ResourceProperty
     *
     * @param aResourcePropertys
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeResourceProperty(ResourceProperty[] aResourcePropertys,
        ResourcePropertyDAOQueryBean aQueryBean,
        ResourcePropertySynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface ResourcePropertySynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddResourcePropertyArray DOCUMENT ME!
         * @param willUpdateResourcePropertyArray DOCUMENT ME!
         * @param willDeleteResourcePropertyArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            ResourceProperty[] willAddResourcePropertyArray,
            ResourceProperty[] willUpdateResourcePropertyArray,
            ResourceProperty[] willDeleteResourcePropertyArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(ResourceProperty[] aResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(ResourceProperty[] aResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(ResourceProperty[] aResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(ResourceProperty[] aResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(ResourceProperty[] aResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(ResourceProperty[] aResourcePropertys)
            throws Exception;
    } // end ResourcePropertySynchronizeCallback
} // end IBaseResourcePropertyDAO
