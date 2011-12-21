/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysRoleResourceRelate Data Access Object
*  GenDate 2011-09-22 10:11:23  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysRoleResourceRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ROLE_RESOURCE_RELATE";

    /** Attribute */
    static final String Id = "SYS_ROLE_RESOURCE_RELATE.ID";

    /** Attribute */
    static final String RelateCode = "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE";

    /** Attribute */
    static final String RelateName = "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME";

    /** Attribute */
    static final String Remarks = "SYS_ROLE_RESOURCE_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "SYS_ROLE_RESOURCE_RELATE.STATUS";

    /** Attribute */
    static final String SysResourceId = "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID";

    /** Attribute */
    static final String SysRoleId = "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID";

    /** Attribute */
    static final String SysResourceTitleKey = "sysResource.RESOURCE_TITLE_KEY";

    /** Attribute */
    static final String SysRoleName = "sysRole.ROLE_NAME";

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
        static final String RelateCode = "relateCode";

        /** Attribute */
        static final String RelateName = "relateName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysResourceId = "sysResourceId";

        /** Attribute */
        static final String SysRoleId = "sysRoleId";

        /** Attribute */
        static final String SysResourceTitleKey = "sysResourceTitleKey";

        /** Attribute */
        static final String SysRoleName = "sysRoleName";
    } // end DataProperty

    /**
     * Check Unique SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysRoleResourceRelate aSysRoleResourceRelate)
        throws Exception;

    /**
     * insert SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysRoleResourceRelate(
        SysRoleResourceRelate aSysRoleResourceRelate) throws Exception;

    /**
     * Batch Insert SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelate)
        throws Exception;

    /**
     * Delete SysRoleResourceRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleResourceRelate(final long aId) throws Exception;

    /**
     * Delete SysRoleResourceRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleResourceRelate(
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Modify SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleResourceRelate(
        SysRoleResourceRelate aSysRoleResourceRelate) throws Exception;

    /**
     * Batch Modify SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelate)
        throws Exception;

    /**
     * Modify SysRoleResourceRelate  By Query Conditions
     *
     * @param aSysRoleResourceRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleResourceRelate(
        SysRoleResourceRelate aSysRoleResourceRelate,
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleResourceRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysRoleResourceRelate findSysRoleResourceRelateById(final long aId)
        throws Exception;

    /**
     * Query SysRoleResourceRelate
     *
     * @param aQueryBean
     *
     * @return ISysRoleResourceRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleResourceRelate" containment="true"
     */
    SysRoleResourceRelate[] querySysRoleResourceRelate(
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleResourceRelate
     *
     * @param aBaseQueryBean
     *
     * @return ISysRoleResourceRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleResourceRelate" containment="true"
     */

    //Map querySysRoleResourceRelateForMap(SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysRoleResourceRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysRoleResourceRelateCount(
        SysRoleResourceRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysRoleResourceRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysRoleResourceRelateSelective(
        SysRoleResourceRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelates,
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelates,
        SysRoleResourceRelateDAOQueryBean aQueryBean,
        SysRoleResourceRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysRoleResourceRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysRoleResourceRelateArray DOCUMENT ME!
         * @param willUpdateSysRoleResourceRelateArray DOCUMENT ME!
         * @param willDeleteSysRoleResourceRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysRoleResourceRelate[] willAddSysRoleResourceRelateArray,
            SysRoleResourceRelate[] willUpdateSysRoleResourceRelateArray,
            SysRoleResourceRelate[] willDeleteSysRoleResourceRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleResourceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysRoleResourceRelate[] aSysRoleResourceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleResourceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysRoleResourceRelate[] aSysRoleResourceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleResourceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysRoleResourceRelate[] aSysRoleResourceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleResourceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysRoleResourceRelate[] aSysRoleResourceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleResourceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysRoleResourceRelate[] aSysRoleResourceRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleResourceRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysRoleResourceRelate[] aSysRoleResourceRelates)
            throws Exception;
    } // end SysRoleResourceRelateSynchronizeCallback
} // end IBaseSysRoleResourceRelateDAO
