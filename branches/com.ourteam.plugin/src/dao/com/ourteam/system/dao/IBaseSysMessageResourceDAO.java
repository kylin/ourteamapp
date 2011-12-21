/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysMessageResource Data Access Object
*  GenDate 2011-09-22 10:11:11  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysMessageResourceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_MESSAGE_RESOURCE";

    /** Attribute */
    static final String Id = "SYS_MESSAGE_RESOURCE.ID";

    /** Attribute */
    static final String MessageKeyId = "SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID";

    /** Attribute */
    static final String LocalCode = "SYS_MESSAGE_RESOURCE.LOCAL_CODE";

    /** Attribute */
    static final String MessageValue = "SYS_MESSAGE_RESOURCE.MESSAGE_VALUE";

    /** Attribute */
    static final String Remarks = "SYS_MESSAGE_RESOURCE.REMARKS";

    /** Attribute */
    static final String Status = "SYS_MESSAGE_RESOURCE.STATUS";

    /** Attribute */
    static final String MessageKey = "sysMessageKey.MESSAGE_KEY";

    /** Attribute */
    static final String MessageCatalog = "sysMessageKey.MESSAGE_CATALOG";

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
        static final String MessageKeyId = "messageKeyId";

        /** Attribute */
        static final String LocalCode = "localCode";

        /** Attribute */
        static final String MessageValue = "messageValue";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String MessageKey = "messageKey";

        /** Attribute */
        static final String MessageCatalog = "messageCatalog";
    } // end DataProperty

    /**
     * Check Unique SysMessageResource
     *
     * @param aSysMessageResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysMessageResource aSysMessageResource)
        throws Exception;

    /**
     * insert SysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysMessageResource(SysMessageResource aSysMessageResource)
        throws Exception;

    /**
     * Batch Insert SysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysMessageResource(SysMessageResource[] aSysMessageResource)
        throws Exception;

    /**
     * Delete SysMessageResource
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysMessageResource(final long aId) throws Exception;

    /**
     * Delete SysMessageResource By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysMessageResource(SysMessageResourceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysMessageResource(SysMessageResource aSysMessageResource)
        throws Exception;

    /**
     * Batch Modify SysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysMessageResource(SysMessageResource[] aSysMessageResource)
        throws Exception;

    /**
     * Modify SysMessageResource  By Query Conditions
     *
     * @param aSysMessageResource Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysMessageResource(SysMessageResource aSysMessageResource,
        SysMessageResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysMessageResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysMessageResource findSysMessageResourceById(final long aId)
        throws Exception;

    /**
     * Query SysMessageResource
     *
     * @param aQueryBean
     *
     * @return ISysMessageResource[]
     *
     * @throws Exception
     *
     * @model type="ISysMessageResource" containment="true"
     */
    SysMessageResource[] querySysMessageResource(
        SysMessageResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysMessageResource
     *
     * @param aBaseQueryBean
     *
     * @return ISysMessageResource[]
     *
     * @throws Exception
     *
     * @model type="ISysMessageResource" containment="true"
     */

    //Map querySysMessageResourceForMap(SysMessageResourceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysMessageResource
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysMessageResourceCount(
        SysMessageResourceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysMessageResource Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysMessageResourceSelective(
        SysMessageResourceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysMessageResource
     *
     * @param aSysMessageResources
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysMessageResource(
        SysMessageResource[] aSysMessageResources,
        SysMessageResourceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysMessageResource
     *
     * @param aSysMessageResources
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysMessageResource(
        SysMessageResource[] aSysMessageResources,
        SysMessageResourceDAOQueryBean aQueryBean,
        SysMessageResourceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysMessageResourceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysMessageResourceArray DOCUMENT ME!
         * @param willUpdateSysMessageResourceArray DOCUMENT ME!
         * @param willDeleteSysMessageResourceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysMessageResource[] willAddSysMessageResourceArray,
            SysMessageResource[] willUpdateSysMessageResourceArray,
            SysMessageResource[] willDeleteSysMessageResourceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysMessageResource[] aSysMessageResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysMessageResource[] aSysMessageResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysMessageResource[] aSysMessageResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysMessageResource[] aSysMessageResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysMessageResource[] aSysMessageResources)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageResources DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysMessageResource[] aSysMessageResources)
            throws Exception;
    } // end SysMessageResourceSynchronizeCallback
} // end IBaseSysMessageResourceDAO
