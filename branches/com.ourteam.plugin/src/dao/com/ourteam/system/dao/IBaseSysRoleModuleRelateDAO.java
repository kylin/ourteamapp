/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysRoleModuleRelate Data Access Object
*  GenDate 2011-10-27 09:54:15  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysRoleModuleRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ROLE_MODULE_RELATE";

    /** Attribute */
    static final String Id = "SYS_ROLE_MODULE_RELATE.ID";

    /** Attribute */
    static final String ModuleId = "SYS_ROLE_MODULE_RELATE.MODULE_ID";

    /** Attribute */
    static final String Remarks = "SYS_ROLE_MODULE_RELATE.REMARKS";

    /** Attribute */
    static final String RoleId = "SYS_ROLE_MODULE_RELATE.ROLE_ID";

    /** Attribute */
    static final String Status = "SYS_ROLE_MODULE_RELATE.STATUS";

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
        static final String ModuleId = "moduleId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RoleId = "roleId";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysRoleModuleRelate aSysRoleModuleRelate)
        throws Exception;

    /**
     * insert SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysRoleModuleRelate(SysRoleModuleRelate aSysRoleModuleRelate)
        throws Exception;

    /**
     * Batch Insert SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelate) throws Exception;

    /**
     * Delete SysRoleModuleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleModuleRelate(final long aId) throws Exception;

    /**
     * Delete SysRoleModuleRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleModuleRelate(SysRoleModuleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleModuleRelate(SysRoleModuleRelate aSysRoleModuleRelate)
        throws Exception;

    /**
     * Batch Modify SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelate) throws Exception;

    /**
     * Modify SysRoleModuleRelate  By Query Conditions
     *
     * @param aSysRoleModuleRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleModuleRelate(SysRoleModuleRelate aSysRoleModuleRelate,
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleModuleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysRoleModuleRelate findSysRoleModuleRelateById(final long aId)
        throws Exception;

    /**
     * Query SysRoleModuleRelate
     *
     * @param aQueryBean
     *
     * @return ISysRoleModuleRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleModuleRelate" containment="true"
     */
    SysRoleModuleRelate[] querySysRoleModuleRelate(
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleModuleRelate
     *
     * @param aBaseQueryBean
     *
     * @return ISysRoleModuleRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleModuleRelate" containment="true"
     */

    //Map querySysRoleModuleRelateForMap(SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysRoleModuleRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysRoleModuleRelateCount(
        SysRoleModuleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysRoleModuleRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysRoleModuleRelateSelective(
        SysRoleModuleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelates,
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelates,
        SysRoleModuleRelateDAOQueryBean aQueryBean,
        SysRoleModuleRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysRoleModuleRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysRoleModuleRelateArray DOCUMENT ME!
         * @param willUpdateSysRoleModuleRelateArray DOCUMENT ME!
         * @param willDeleteSysRoleModuleRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysRoleModuleRelate[] willAddSysRoleModuleRelateArray,
            SysRoleModuleRelate[] willUpdateSysRoleModuleRelateArray,
            SysRoleModuleRelate[] willDeleteSysRoleModuleRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysRoleModuleRelate[] aSysRoleModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysRoleModuleRelate[] aSysRoleModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysRoleModuleRelate[] aSysRoleModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysRoleModuleRelate[] aSysRoleModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysRoleModuleRelate[] aSysRoleModuleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleModuleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysRoleModuleRelate[] aSysRoleModuleRelates)
            throws Exception;
    } // end SysRoleModuleRelateSynchronizeCallback

    /**
     * Query Related ISysModule
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysModule" containment="true"
     */
    com.ourteam.system.dao.SysModule[] querySysModules(
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysModule to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysModule" containment="true"
     */

    //Map querySysModulesForMap(SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysModule Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysModulesSelective(SysRoleModuleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysModule
     *
     * @param aSysModule {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysModule(com.ourteam.system.dao.SysModule aSysModule,
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysModule
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysModule(SysRoleModuleRelateDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysRoleModuleRelateDAO
