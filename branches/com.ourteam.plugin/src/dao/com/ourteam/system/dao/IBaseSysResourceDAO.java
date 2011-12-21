/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysResource Data Access Object
*  GenDate 2011-09-22 10:11:14  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysResourceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_RESOURCE";

    /** Attribute */
    static final String Id = "SYS_RESOURCE.ID";

    /** Attribute */
    static final String DomainId = "SYS_RESOURCE.DOMAIN_ID";

    /** Attribute */
    static final String ParentResourceId = "SYS_RESOURCE.PARENT_RESOURCE_ID";

    /** Attribute */
    static final String Remarks = "SYS_RESOURCE.REMARKS";

    /** Attribute */
    static final String ResourceCode = "SYS_RESOURCE.RESOURCE_CODE";

    /** Attribute */
    static final String ResourceName = "SYS_RESOURCE.RESOURCE_NAME";

    /** Attribute */
    static final String ResourceTypeId = "SYS_RESOURCE.RESOURCE_TYPE_ID";

    /** Attribute */
    static final String Status = "SYS_RESOURCE.STATUS";

    /** Attribute */
    static final String Sort = "SYS_RESOURCE.SORT_INDEX";

    /** Attribute */
    static final String ResourceTitleKey = "SYS_RESOURCE.RESOURCE_TITLE_KEY";

    /** Attribute */
    static final String DomainTitleKey = "resourceDomain.DOMAIN_TITEL_KEY";

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
        static final String DomainId = "domainId";

        /** Attribute */
        static final String ParentResourceId = "parentResourceId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String ResourceCode = "resourceCode";

        /** Attribute */
        static final String ResourceName = "resourceName";

        /** Attribute */
        static final String ResourceTypeId = "resourceTypeId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String Sort = "sort";

        /** Attribute */
        static final String ResourceTitleKey = "resourceTitleKey";

        /** Attribute */
        static final String DomainTitleKey = "domainTitleKey";
    } // end DataProperty

    /**
     * Check Unique SysResource
     *
     * @param aSysResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysResource aSysResource) throws Exception;

    /**
     * insert SysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysResource(SysResource aSysResource) throws Exception;

    /**
     * Batch Insert SysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysResource(SysResource[] aSysResource)
        throws Exception;

    /**
     * Delete SysResource
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResource(final long aId) throws Exception;

    /**
     * Delete SysResource By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResource(SysResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResource(SysResource aSysResource) throws Exception;

    /**
     * Batch Modify SysResource
     *
     * @param aSysResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysResource(SysResource[] aSysResource)
        throws Exception;

    /**
     * Modify SysResource  By Query Conditions
     *
     * @param aSysResource Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResource(SysResource aSysResource,
        SysResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysResource findSysResourceById(final long aId) throws Exception;

    /**
     * Query SysResource
     *
     * @param aQueryBean
     *
     * @return ISysResource[]
     *
     * @throws Exception
     *
     * @model type="ISysResource" containment="true"
     */
    SysResource[] querySysResource(SysResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysResource
     *
     * @param aBaseQueryBean
     *
     * @return ISysResource[]
     *
     * @throws Exception
     *
     * @model type="ISysResource" containment="true"
     */

    //Map querySysResourceForMap(SysResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysResource
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysResourceCount(SysResourceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysResource Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysResourceSelective(SysResourceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysResource
     *
     * @param aSysResources
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResource(SysResource[] aSysResources,
        SysResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysResource
     *
     * @param aSysResources
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResource(SysResource[] aSysResources,
        SysResourceDAOQueryBean aQueryBean,
        SysResourceSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysResourceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysResourceArray DOCUMENT ME!
         * @param willUpdateSysResourceArray DOCUMENT ME!
         * @param willDeleteSysResourceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysResource[] willAddSysResourceArray,
            SysResource[] willUpdateSysResourceArray,
            SysResource[] willDeleteSysResourceArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysResource[] aSysResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysResource[] aSysResources) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysResource[] aSysResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysResource[] aSysResources) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysResource[] aSysResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysResource[] aSysResources) throws Exception;
    } // end SysResourceSynchronizeCallback

    /**
     * Query Related ISysResourceProperty
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourceProperty" containment="true"
     */
    com.ourteam.system.dao.SysResourceProperty[] querySysResourcePropertys(
        SysResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysResourceProperty to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourceProperty" containment="true"
     */

    //Map querySysResourcePropertysForMap(SysResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysResourceProperty Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysResourcePropertysSelective(SysResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysResourceProperty
     *
     * @param aSysResourceProperty {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourceProperty(
        com.ourteam.system.dao.SysResourceProperty aSysResourceProperty,
        SysResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysResourceProperty
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourceProperty(SysResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Related ISysResourceType
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourceType" containment="true"
     */
    com.ourteam.system.dao.SysResourceType[] querySysResourceTypes(
        SysResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysResourceType to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourceType" containment="true"
     */

    //Map querySysResourceTypesForMap(SysResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysResourceType Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysResourceTypesSelective(SysResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysResourceType
     *
     * @param aSysResourceType {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourceType(
        com.ourteam.system.dao.SysResourceType aSysResourceType,
        SysResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysResourceType
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourceType(SysResourceDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysResourceDAO
