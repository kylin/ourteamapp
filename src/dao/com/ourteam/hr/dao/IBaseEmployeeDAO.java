/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IEmployee Data Access Object
*  GenDate 2011-10-31 11:55:27  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseEmployeeDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "HR_EMPLOYEE";

    /** Attribute */
    static final String Id = "HR_EMPLOYEE.ID";

    /** Attribute */
    static final String BirthDay = "HR_EMPLOYEE.BIRTH_DAY";

    /** Attribute */
    static final String HomeAddress = "HR_EMPLOYEE.HOME_ADDRESS";

    /** Attribute */
    static final String MailAddress = "HR_EMPLOYEE.MAIL_ADDRESS";

    /** Attribute */
    static final String Name = "HR_EMPLOYEE.NAME";

    /** Attribute */
    static final String PhoneCall = "HR_EMPLOYEE.PHONE_CALL";

    /** Attribute */
    static final String Remarks = "HR_EMPLOYEE.REMARKS";

    /** Attribute */
    static final String Sex = "HR_EMPLOYEE.SEX";

    /** Attribute */
    static final String Status = "HR_EMPLOYEE.STATUS";

    /** Attribute */
    static final String UserId = "HR_EMPLOYEE.USER_ID";

    /** Attribute */
    static final String Code = "HR_EMPLOYEE.CODE";

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
        static final String BirthDay = "birthDay";

        /** Attribute */
        static final String HomeAddress = "homeAddress";

        /** Attribute */
        static final String MailAddress = "mailAddress";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String PhoneCall = "phoneCall";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Sex = "sex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String UserId = "userId";

        /** Attribute */
        static final String Code = "code";
    } // end DataProperty

    /**
     * Check Unique Employee
     *
     * @param aEmployee
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(Employee aEmployee) throws Exception;

    /**
     * insert Employee
     *
     * @param aEmployee
     *
     * @throws Exception
     *
     * @model
     */
    void insertEmployee(Employee aEmployee) throws Exception;

    /**
     * Batch Insert Employee
     *
     * @param aEmployee
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertEmployee(Employee[] aEmployee) throws Exception;

    /**
     * Delete Employee
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployee(final long aId) throws Exception;

    /**
     * Delete Employee By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployee(EmployeeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify Employee
     *
     * @param aEmployee
     *
     * @throws Exception
     *
     * @model
     */
    void updateEmployee(Employee aEmployee) throws Exception;

    /**
     * Batch Modify Employee
     *
     * @param aEmployee
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateEmployee(Employee[] aEmployee) throws Exception;

    /**
     * Modify Employee  By Query Conditions
     *
     * @param aEmployee Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateEmployee(Employee aEmployee, EmployeeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Employee
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    Employee findEmployeeById(final long aId) throws Exception;

    /**
     * Query Employee
     *
     * @param aQueryBean
     *
     * @return IEmployee[]
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */
    Employee[] queryEmployee(EmployeeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Employee
     *
     * @param aBaseQueryBean
     *
     * @return IEmployee[]
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */

    //Map queryEmployeeForMap(EmployeeDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count Employee
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryEmployeeCount(EmployeeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query Employee Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryEmployeeSelective(EmployeeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize Employee
     *
     * @param aEmployees
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeEmployee(Employee[] aEmployees,
        EmployeeDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize Employee
     *
     * @param aEmployees
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeEmployee(Employee[] aEmployees,
        EmployeeDAOQueryBean aQueryBean, EmployeeSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface EmployeeSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddEmployeeArray DOCUMENT ME!
         * @param willUpdateEmployeeArray DOCUMENT ME!
         * @param willDeleteEmployeeArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(Employee[] willAddEmployeeArray,
            Employee[] willUpdateEmployeeArray,
            Employee[] willDeleteEmployeeArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployees DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(Employee[] aEmployees) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployees DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(Employee[] aEmployees) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployees DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(Employee[] aEmployees) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployees DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(Employee[] aEmployees) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployees DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(Employee[] aEmployees) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aEmployees DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(Employee[] aEmployees) throws Exception;
    } // end EmployeeSynchronizeCallback
} // end IBaseEmployeeDAO
