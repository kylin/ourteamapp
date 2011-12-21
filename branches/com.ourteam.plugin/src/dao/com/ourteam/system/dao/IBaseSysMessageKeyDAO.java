/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysMessageKey Data Access Object
*  GenDate 2011-09-22 10:11:10  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysMessageKeyDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_MESSAGE_KEY";

    /** Attribute */
    static final String Id = "SYS_MESSAGE_KEY.ID";

    /** Attribute */
    static final String MessageCatalog = "SYS_MESSAGE_KEY.MESSAGE_CATALOG";

    /** Attribute */
    static final String MessageKey = "SYS_MESSAGE_KEY.MESSAGE_KEY";

    /** Attribute */
    static final String Remarks = "SYS_MESSAGE_KEY.REMARKS";

    /** Attribute */
    static final String Status = "SYS_MESSAGE_KEY.STATUS";

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
        static final String MessageCatalog = "messageCatalog";

        /** Attribute */
        static final String MessageKey = "messageKey";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique SysMessageKey
     *
     * @param aSysMessageKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysMessageKey aSysMessageKey)
        throws Exception;

    /**
     * insert SysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysMessageKey(SysMessageKey aSysMessageKey)
        throws Exception;

    /**
     * Batch Insert SysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysMessageKey(SysMessageKey[] aSysMessageKey)
        throws Exception;

    /**
     * Delete SysMessageKey
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysMessageKey(final long aId) throws Exception;

    /**
     * Delete SysMessageKey By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysMessageKey(SysMessageKeyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysMessageKey(SysMessageKey aSysMessageKey)
        throws Exception;

    /**
     * Batch Modify SysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysMessageKey(SysMessageKey[] aSysMessageKey)
        throws Exception;

    /**
     * Modify SysMessageKey  By Query Conditions
     *
     * @param aSysMessageKey Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysMessageKey(SysMessageKey aSysMessageKey,
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysMessageKey
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysMessageKey findSysMessageKeyById(final long aId)
        throws Exception;

    /**
     * Query SysMessageKey
     *
     * @param aQueryBean
     *
     * @return ISysMessageKey[]
     *
     * @throws Exception
     *
     * @model type="ISysMessageKey" containment="true"
     */
    SysMessageKey[] querySysMessageKey(SysMessageKeyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysMessageKey
     *
     * @param aBaseQueryBean
     *
     * @return ISysMessageKey[]
     *
     * @throws Exception
     *
     * @model type="ISysMessageKey" containment="true"
     */

    //Map querySysMessageKeyForMap(SysMessageKeyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysMessageKey
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysMessageKeyCount(SysMessageKeyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysMessageKey Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysMessageKeySelective(SysMessageKeyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysMessageKey
     *
     * @param aSysMessageKeys
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysMessageKey(SysMessageKey[] aSysMessageKeys,
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysMessageKey
     *
     * @param aSysMessageKeys
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysMessageKey(SysMessageKey[] aSysMessageKeys,
        SysMessageKeyDAOQueryBean aQueryBean,
        SysMessageKeySynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysMessageKeySynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysMessageKeyArray DOCUMENT ME!
         * @param willUpdateSysMessageKeyArray DOCUMENT ME!
         * @param willDeleteSysMessageKeyArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysMessageKey[] willAddSysMessageKeyArray,
            SysMessageKey[] willUpdateSysMessageKeyArray,
            SysMessageKey[] willDeleteSysMessageKeyArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageKeys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysMessageKey[] aSysMessageKeys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageKeys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysMessageKey[] aSysMessageKeys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageKeys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysMessageKey[] aSysMessageKeys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageKeys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysMessageKey[] aSysMessageKeys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageKeys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysMessageKey[] aSysMessageKeys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysMessageKeys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysMessageKey[] aSysMessageKeys)
            throws Exception;
    } // end SysMessageKeySynchronizeCallback

    /**
     * Query Related ISysMessageResource
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysMessageResource" containment="true"
     */
    com.ourteam.system.dao.SysMessageResource[] querySysMessageResources(
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysMessageResource to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysMessageResource" containment="true"
     */

    //Map querySysMessageResourcesForMap(SysMessageKeyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysMessageResource Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysMessageResourcesSelective(
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related ISysMessageResource
     *
     * @param aSysMessageResource {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysMessageResource(
        com.ourteam.system.dao.SysMessageResource aSysMessageResource,
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysMessageResource
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysMessageResource(SysMessageKeyDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysMessageKeyDAO
