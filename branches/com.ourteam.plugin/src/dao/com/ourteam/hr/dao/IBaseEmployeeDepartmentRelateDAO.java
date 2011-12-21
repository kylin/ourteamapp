/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IEmployeeDepartmentRelate Data Access Object
*  GenDate 2011-11-29 20:18:38  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseEmployeeDepartmentRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "HR_EMPLOYEE_DEPARTMENT_RELATE";

    /** Attribute */
    static final String Id = "HR_EMPLOYEE_DEPARTMENT_RELATE.ID";

    /** Attribute */
    static final String DepartmentRole = "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ROLE";

    /** Attribute */
    static final String Status = "HR_EMPLOYEE_DEPARTMENT_RELATE.STATUS";

    /** Attribute */
    static final String DepartmentId = "HR_EMPLOYEE_DEPARTMENT_RELATE.DEPARTMENT_ID";

    /** Attribute */
    static final String EmployeeId = "HR_EMPLOYEE_DEPARTMENT_RELATE.EMPLOYEE_ID";

    /** Attribute */
    static final String EmployeeName = "employeeA.NAME";

    /** Attribute */
    static final String DepartmentName = "sysDepartmentA.DEPARTMENT_NAME";

    /** Attribute */
    static final String ParentDepartmentId = "sysDepartmentA.PARENT_ID";

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
        static final String DepartmentRole = "departmentRole";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DepartmentId = "departmentId";

        /** Attribute */
        static final String EmployeeId = "employeeId";

        /** Attribute */
        static final String EmployeeName = "employeeName";

        /** Attribute */
        static final String DepartmentName = "departmentName";

        /** Attribute */
        static final String ParentDepartmentId = "parentDepartmentId";
    } // end DataProperty

    /**
     * Check Unique EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception;

    /**
     * insert EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertEmployeeDepartmentRelate(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception;

    /**
     * Batch Insert EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelate)
        throws Exception;

    /**
     * Delete EmployeeDepartmentRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployeeDepartmentRelate(final long aId)
        throws Exception;

    /**
     * Delete EmployeeDepartmentRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployeeDepartmentRelate(
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateEmployeeDepartmentRelate(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate)
        throws Exception;

    /**
     * Batch Modify EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelate)
        throws Exception;

    /**
     * Modify EmployeeDepartmentRelate  By Query Conditions
     *
     * @param aEmployeeDepartmentRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateEmployeeDepartmentRelate(
        EmployeeDepartmentRelate aEmployeeDepartmentRelate,
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query EmployeeDepartmentRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    EmployeeDepartmentRelate findEmployeeDepartmentRelateById(final long aId)
        throws Exception;

    /**
     * Query EmployeeDepartmentRelate
     *
     * @param aQueryBean
     *
     * @return IEmployeeDepartmentRelate[]
     *
     * @throws Exception
     *
     * @model type="IEmployeeDepartmentRelate" containment="true"
     */
    EmployeeDepartmentRelate[] queryEmployeeDepartmentRelate(
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query EmployeeDepartmentRelate
     *
     * @param aBaseQueryBean
     *
     * @return IEmployeeDepartmentRelate[]
     *
     * @throws Exception
     *
     * @model type="IEmployeeDepartmentRelate" containment="true"
     */

    //Map queryEmployeeDepartmentRelateForMap(EmployeeDepartmentRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count EmployeeDepartmentRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryEmployeeDepartmentRelateCount(
        EmployeeDepartmentRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query EmployeeDepartmentRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryEmployeeDepartmentRelateSelective(
        EmployeeDepartmentRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelates,
        EmployeeDepartmentRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize EmployeeDepartmentRelate
     *
     * @param aEmployeeDepartmentRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeEmployeeDepartmentRelate(
        EmployeeDepartmentRelate[] aEmployeeDepartmentRelates,
        EmployeeDepartmentRelateDAOQueryBean aQueryBean,
        EmployeeDepartmentRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface EmployeeDepartmentRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddEmployeeDepartmentRelateArray DOCUMENT ME!
         * @param willUpdateEmployeeDepartmentRelateArray DOCUMENT ME!
         * @param willDeleteEmployeeDepartmentRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            EmployeeDepartmentRelate[] willAddEmployeeDepartmentRelateArray,
            EmployeeDepartmentRelate[] willUpdateEmployeeDepartmentRelateArray,
            EmployeeDepartmentRelate[] willDeleteEmployeeDepartmentRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployeeDepartmentRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(EmployeeDepartmentRelate[] aEmployeeDepartmentRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployeeDepartmentRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(EmployeeDepartmentRelate[] aEmployeeDepartmentRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployeeDepartmentRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(EmployeeDepartmentRelate[] aEmployeeDepartmentRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployeeDepartmentRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(EmployeeDepartmentRelate[] aEmployeeDepartmentRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployeeDepartmentRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(EmployeeDepartmentRelate[] aEmployeeDepartmentRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployeeDepartmentRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(EmployeeDepartmentRelate[] aEmployeeDepartmentRelates)
            throws Exception;
    } // end EmployeeDepartmentRelateSynchronizeCallback
} // end IBaseEmployeeDepartmentRelateDAO
