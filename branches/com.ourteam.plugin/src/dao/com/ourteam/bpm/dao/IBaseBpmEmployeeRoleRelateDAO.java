/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmEmployeeRoleRelate Data Access Object
*  GenDate 2011-11-16 10:32:26  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmEmployeeRoleRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_EMPLOYEE_ROLE_RELATE";

    /** Attribute */
    static final String Id = "BPM_EMPLOYEE_ROLE_RELATE.ID";

    /** Attribute */
    static final String BpmRoleId = "BPM_EMPLOYEE_ROLE_RELATE.BPM_ROLE_ID";

    /** Attribute */
    static final String BusinessInstanceId = "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_INSTANCE_ID";

    /** Attribute */
    static final String BusinessType = "BPM_EMPLOYEE_ROLE_RELATE.BUSINESS_TYPE";

    /** Attribute */
    static final String Remarks = "BPM_EMPLOYEE_ROLE_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_EMPLOYEE_ROLE_RELATE.STATUS";

    /** Attribute */
    static final String SysModuleId = "BPM_EMPLOYEE_ROLE_RELATE.SYS_MODULE_ID";

    /** Attribute */
    static final String EmployeeId = "BPM_EMPLOYEE_ROLE_RELATE.EMPLOYEE_ID";

    /** Attribute */
    static final String EmployeeName = "employeeC.NAME";

    /** Attribute */
    static final String BpmRoleName = "bpmRoleC.ROLE_NAME";

    /** Attribute */
    static final String BpmRoleKey = "bpmRoleC.ROLE_KEY";

    /** Attribute */
    static final String SysModuleCode = "sysModuleC.MODULE_CODE";

    /** Attribute */
    static final String SysModuleName = "sysModuleC.MODULE_NAME";

    /** Attribute */
    static final String EmployeeCode = "employeeC.CODE";

    /** Attribute */
    static final String ProjectId = "BPM_EMPLOYEE_ROLE_RELATE.PROJECT_ID";

    /** Attribute */
    static final String ProductId = "BPM_EMPLOYEE_ROLE_RELATE.PRODUCT_ID";

    /** Attribute */
    static final String TeamId = "BPM_EMPLOYEE_ROLE_RELATE.TEAM_ID";

    /** Attribute */
    static final String DepartmentId = "BPM_EMPLOYEE_ROLE_RELATE.DEPARTMENT_ID";

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
        static final String BpmRoleId = "bpmRoleId";

        /** Attribute */
        static final String BusinessInstanceId = "businessInstanceId";

        /** Attribute */
        static final String BusinessType = "businessType";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysModuleId = "sysModuleId";

        /** Attribute */
        static final String EmployeeId = "employeeId";

        /** Attribute */
        static final String EmployeeName = "employeeName";

        /** Attribute */
        static final String BpmRoleName = "bpmRoleName";

        /** Attribute */
        static final String BpmRoleKey = "bpmRoleKey";

        /** Attribute */
        static final String SysModuleCode = "sysModuleCode";

        /** Attribute */
        static final String SysModuleName = "sysModuleName";

        /** Attribute */
        static final String EmployeeCode = "employeeCode";

        /** Attribute */
        static final String ProjectId = "projectId";

        /** Attribute */
        static final String ProductId = "productId";

        /** Attribute */
        static final String TeamId = "teamId";

        /** Attribute */
        static final String DepartmentId = "departmentId";
    } // end DataProperty

    /**
     * Check Unique BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmEmployeeRoleRelate aBpmEmployeeRoleRelate)
        throws Exception;

    /**
     * insert BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate aBpmEmployeeRoleRelate) throws Exception;

    /**
     * Batch Insert BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelate)
        throws Exception;

    /**
     * Delete BpmEmployeeRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmEmployeeRoleRelate(final long aId) throws Exception;

    /**
     * Delete BpmEmployeeRoleRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Modify BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate aBpmEmployeeRoleRelate) throws Exception;

    /**
     * Batch Modify BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelate)
        throws Exception;

    /**
     * Modify BpmEmployeeRoleRelate  By Query Conditions
     *
     * @param aBpmEmployeeRoleRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate aBpmEmployeeRoleRelate,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmEmployeeRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmEmployeeRoleRelate findBpmEmployeeRoleRelateById(final long aId)
        throws Exception;

    /**
     * Query BpmEmployeeRoleRelate
     *
     * @param aQueryBean
     *
     * @return IBpmEmployeeRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="IBpmEmployeeRoleRelate" containment="true"
     */
    BpmEmployeeRoleRelate[] queryBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmEmployeeRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return IBpmEmployeeRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="IBpmEmployeeRoleRelate" containment="true"
     */

    //Map queryBpmEmployeeRoleRelateForMap(BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmEmployeeRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmEmployeeRoleRelateCount(
        BpmEmployeeRoleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmEmployeeRoleRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmEmployeeRoleRelateSelective(
        BpmEmployeeRoleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmEmployeeRoleRelate
     *
     * @param aBpmEmployeeRoleRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmEmployeeRoleRelate(
        BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean,
        BpmEmployeeRoleRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmEmployeeRoleRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmEmployeeRoleRelateArray DOCUMENT ME!
         * @param willUpdateBpmEmployeeRoleRelateArray DOCUMENT ME!
         * @param willDeleteBpmEmployeeRoleRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmEmployeeRoleRelate[] willAddBpmEmployeeRoleRelateArray,
            BpmEmployeeRoleRelate[] willUpdateBpmEmployeeRoleRelateArray,
            BpmEmployeeRoleRelate[] willDeleteBpmEmployeeRoleRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmEmployeeRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmEmployeeRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmEmployeeRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmEmployeeRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmEmployeeRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmEmployeeRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmEmployeeRoleRelate[] aBpmEmployeeRoleRelates)
            throws Exception;
    } // end BpmEmployeeRoleRelateSynchronizeCallback

    /**
     * Query Related IEmployee
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */
    com.ourteam.hr.dao.Employee[] queryEmployees(
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IEmployee to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */

    //Map queryEmployeesForMap(BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IEmployee Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryEmployeesSelective(BpmEmployeeRoleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related IEmployee
     *
     * @param aEmployee {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateEmployee(com.ourteam.hr.dao.Employee aEmployee,
        BpmEmployeeRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IEmployee
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployee(BpmEmployeeRoleRelateDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseBpmEmployeeRoleRelateDAO
