/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysModule Data Access Object
*  GenDate 2011-09-30 13:32:33  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysModuleDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_MODULE";

    /** Attribute */
    static final String Id = "SYS_MODULE.ID";

    /** Attribute */
    static final String ModuleCode = "SYS_MODULE.MODULE_CODE";

    /** Attribute */
    static final String ModuleName = "SYS_MODULE.MODULE_NAME";

    /** Attribute */
    static final String ParentModuleId = "SYS_MODULE.PARENT_MODULE_ID";

    /** Attribute */
    static final String Remarks = "SYS_MODULE.REMARKS";

    /** Attribute */
    static final String Status = "SYS_MODULE.STATUS";

    /** Attribute */
    static final String DomainId = "SYS_MODULE.DOMAIN_ID";

    /** Attribute */
    static final String ModuleIcon = "SYS_MODULE.MODULE_ICON";

    /** Attribute */
    static final String SortIndex = "SYS_MODULE.SORT_INDEX";

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
        static final String ModuleCode = "moduleCode";

        /** Attribute */
        static final String ModuleName = "moduleName";

        /** Attribute */
        static final String ParentModuleId = "parentModuleId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DomainId = "domainId";

        /** Attribute */
        static final String ModuleIcon = "moduleIcon";

        /** Attribute */
        static final String SortIndex = "sortIndex";
    } // end DataProperty

    /**
     * Check Unique SysModule
     *
     * @param aSysModule
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysModule aSysModule) throws Exception;

    /**
     * insert SysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysModule(SysModule aSysModule) throws Exception;

    /**
     * Batch Insert SysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysModule(SysModule[] aSysModule) throws Exception;

    /**
     * Delete SysModule
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysModule(final long aId) throws Exception;

    /**
     * Delete SysModule By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysModule(SysModuleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysModule(SysModule aSysModule) throws Exception;

    /**
     * Batch Modify SysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysModule(SysModule[] aSysModule) throws Exception;

    /**
     * Modify SysModule  By Query Conditions
     *
     * @param aSysModule Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysModule(SysModule aSysModule, SysModuleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysModule
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysModule findSysModuleById(final long aId) throws Exception;

    /**
     * Query SysModule
     *
     * @param aQueryBean
     *
     * @return ISysModule[]
     *
     * @throws Exception
     *
     * @model type="ISysModule" containment="true"
     */
    SysModule[] querySysModule(SysModuleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysModule
     *
     * @param aBaseQueryBean
     *
     * @return ISysModule[]
     *
     * @throws Exception
     *
     * @model type="ISysModule" containment="true"
     */

    //Map querySysModuleForMap(SysModuleDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysModule
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysModuleCount(SysModuleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysModule Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysModuleSelective(SysModuleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysModule
     *
     * @param aSysModules
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysModule(SysModule[] aSysModules,
        SysModuleDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysModule
     *
     * @param aSysModules
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysModule(SysModule[] aSysModules,
        SysModuleDAOQueryBean aQueryBean, SysModuleSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysModuleSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysModuleArray DOCUMENT ME!
         * @param willUpdateSysModuleArray DOCUMENT ME!
         * @param willDeleteSysModuleArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysModule[] willAddSysModuleArray,
            SysModule[] willUpdateSysModuleArray,
            SysModule[] willDeleteSysModuleArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysModules DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysModule[] aSysModules) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysModules DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysModule[] aSysModules) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysModules DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysModule[] aSysModules) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysModules DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysModule[] aSysModules) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysModules DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysModule[] aSysModules) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysModules DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysModule[] aSysModules) throws Exception;
    } // end SysModuleSynchronizeCallback
} // end IBaseSysModuleDAO
