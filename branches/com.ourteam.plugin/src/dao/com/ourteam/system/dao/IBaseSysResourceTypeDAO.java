/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysResourceType Data Access Object
*  GenDate 2011-09-22 10:11:18  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysResourceTypeDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_RESOURCE_TYPE";

    /** Attribute */
    static final String Id = "SYS_RESOURCE_TYPE.ID";

    /** Attribute */
    static final String ConfigCode = "SYS_RESOURCE_TYPE.CONFIG_CODE";

    /** Attribute */
    static final String ConfigName = "SYS_RESOURCE_TYPE.CONFIG_NAME";

    /** Attribute */
    static final String DomainId = "SYS_RESOURCE_TYPE.DOMAIN_ID";

    /** Attribute */
    static final String Remarks = "SYS_RESOURCE_TYPE.REMARKS";

    /** Attribute */
    static final String Status = "SYS_RESOURCE_TYPE.STATUS";

    /** Attribute */
    static final String ResourceTypeId = "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID";

    /** Attribute */
    static final String Sort = "SYS_RESOURCE_TYPE.SORT_INDEX";

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
        static final String ConfigCode = "configCode";

        /** Attribute */
        static final String ConfigName = "configName";

        /** Attribute */
        static final String DomainId = "domainId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ResourceTypeId = "resourceTypeId";

        /** Attribute */
        static final String Sort = "sort";
    } // end DataProperty

    /**
     * Check Unique SysResourceType
     *
     * @param aSysResourceType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysResourceType aSysResourceType)
        throws Exception;

    /**
     * insert SysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysResourceType(SysResourceType aSysResourceType)
        throws Exception;

    /**
     * Batch Insert SysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysResourceType(SysResourceType[] aSysResourceType)
        throws Exception;

    /**
     * Delete SysResourceType
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourceType(final long aId) throws Exception;

    /**
     * Delete SysResourceType By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourceType(SysResourceTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourceType(SysResourceType aSysResourceType)
        throws Exception;

    /**
     * Batch Modify SysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysResourceType(SysResourceType[] aSysResourceType)
        throws Exception;

    /**
     * Modify SysResourceType  By Query Conditions
     *
     * @param aSysResourceType Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourceType(SysResourceType aSysResourceType,
        SysResourceTypeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysResourceType
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysResourceType findSysResourceTypeById(final long aId)
        throws Exception;

    /**
     * Query SysResourceType
     *
     * @param aQueryBean
     *
     * @return ISysResourceType[]
     *
     * @throws Exception
     *
     * @model type="ISysResourceType" containment="true"
     */
    SysResourceType[] querySysResourceType(
        SysResourceTypeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysResourceType
     *
     * @param aBaseQueryBean
     *
     * @return ISysResourceType[]
     *
     * @throws Exception
     *
     * @model type="ISysResourceType" containment="true"
     */

    //Map querySysResourceTypeForMap(SysResourceTypeDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysResourceType
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysResourceTypeCount(SysResourceTypeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysResourceType Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysResourceTypeSelective(
        SysResourceTypeDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize SysResourceType
     *
     * @param aSysResourceTypes
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResourceType(SysResourceType[] aSysResourceTypes,
        SysResourceTypeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysResourceType
     *
     * @param aSysResourceTypes
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResourceType(SysResourceType[] aSysResourceTypes,
        SysResourceTypeDAOQueryBean aQueryBean,
        SysResourceTypeSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysResourceTypeSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysResourceTypeArray DOCUMENT ME!
         * @param willUpdateSysResourceTypeArray DOCUMENT ME!
         * @param willDeleteSysResourceTypeArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysResourceType[] willAddSysResourceTypeArray,
            SysResourceType[] willUpdateSysResourceTypeArray,
            SysResourceType[] willDeleteSysResourceTypeArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysResourceType[] aSysResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysResourceType[] aSysResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysResourceType[] aSysResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysResourceType[] aSysResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysResourceType[] aSysResourceTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourceTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysResourceType[] aSysResourceTypes)
            throws Exception;
    } // end SysResourceTypeSynchronizeCallback
} // end IBaseSysResourceTypeDAO
