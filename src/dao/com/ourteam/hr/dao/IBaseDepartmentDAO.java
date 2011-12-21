/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IDepartment Data Access Object
*  GenDate 2011-10-28 17:10:31  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseDepartmentDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "HR_DEPARTMENT";

    /** Attribute */
    static final String Id = "HR_DEPARTMENT.ID";

    /** Attribute */
    static final String DepartmentName = "HR_DEPARTMENT.DEPARTMENT_NAME";

    /** Attribute */
    static final String Description = "HR_DEPARTMENT.DESCRIPTION";

    /** Attribute */
    static final String ParentId = "HR_DEPARTMENT.PARENT_ID";

    /** Attribute */
    static final String Status = "HR_DEPARTMENT.STATUS";

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
        static final String DepartmentName = "departmentName";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String ParentId = "parentId";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique Department
     *
     * @param aDepartment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(Department aDepartment) throws Exception;

    /**
     * insert Department
     *
     * @param aDepartment
     *
     * @throws Exception
     *
     * @model
     */
    void insertDepartment(Department aDepartment) throws Exception;

    /**
     * Batch Insert Department
     *
     * @param aDepartment
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertDepartment(Department[] aDepartment)
        throws Exception;

    /**
     * Delete Department
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDepartment(final long aId) throws Exception;

    /**
     * Delete Department By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDepartment(DepartmentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify Department
     *
     * @param aDepartment
     *
     * @throws Exception
     *
     * @model
     */
    void updateDepartment(Department aDepartment) throws Exception;

    /**
     * Batch Modify Department
     *
     * @param aDepartment
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateDepartment(Department[] aDepartment)
        throws Exception;

    /**
     * Modify Department  By Query Conditions
     *
     * @param aDepartment Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateDepartment(Department aDepartment,
        DepartmentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Department
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    Department findDepartmentById(final long aId) throws Exception;

    /**
     * Query Department
     *
     * @param aQueryBean
     *
     * @return IDepartment[]
     *
     * @throws Exception
     *
     * @model type="IDepartment" containment="true"
     */
    Department[] queryDepartment(DepartmentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Department
     *
     * @param aBaseQueryBean
     *
     * @return IDepartment[]
     *
     * @throws Exception
     *
     * @model type="IDepartment" containment="true"
     */

    //Map queryDepartmentForMap(DepartmentDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count Department
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryDepartmentCount(DepartmentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query Department Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryDepartmentSelective(DepartmentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize Department
     *
     * @param aDepartments
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeDepartment(Department[] aDepartments,
        DepartmentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize Department
     *
     * @param aDepartments
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeDepartment(Department[] aDepartments,
        DepartmentDAOQueryBean aQueryBean,
        DepartmentSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DepartmentSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddDepartmentArray DOCUMENT ME!
         * @param willUpdateDepartmentArray DOCUMENT ME!
         * @param willDeleteDepartmentArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(Department[] willAddDepartmentArray,
            Department[] willUpdateDepartmentArray,
            Department[] willDeleteDepartmentArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDepartments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(Department[] aDepartments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDepartments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(Department[] aDepartments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDepartments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(Department[] aDepartments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDepartments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(Department[] aDepartments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDepartments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(Department[] aDepartments) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDepartments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(Department[] aDepartments) throws Exception;
    } // end DepartmentSynchronizeCallback
} // end IBaseDepartmentDAO
