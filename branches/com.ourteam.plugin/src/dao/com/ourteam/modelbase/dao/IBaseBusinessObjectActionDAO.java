/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessObjectAction Data Access Object
*  GenDate 2011-09-22 10:16:37  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessObjectActionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "OBJECT_ACTION";

    /** Attribute */
    static final String ObjectActionId = "OBJECT_ACTION.OBJECT_ACTION_ID";

    /** Attribute */
    static final String Action = "OBJECT_ACTION.ACTION";

    /** Attribute */
    static final String ObjectId = "OBJECT_ACTION.OBJECT_ID";

    /** Attribute */
    static final String PropertyId = "OBJECT_ACTION.PROPERTY_ID";

    /** Attribute */
    static final String PropertyValue = "OBJECT_ACTION.PROPERTY_VALUE";

    /** Attribute */
    static final String PropertyDataSize = "property.DATA_SIZE";

    /** Attribute */
    static final String PropertyDataType = "property.DATA_TYPE";

    /** Attribute */
    static final String PropertyDefaultValue = "property.VALUE";

    /** Attribute */
    static final String PropertyDescription = "property.DESCRIPTION";

    /** Attribute */
    static final String PropertyIsEnum = "property.IS_ENUM";

    /** Attribute */
    static final String PropertyIsGenerate = "property.IS_GENERATE";

    /** Attribute */
    static final String PropertyIsPrimaryProperty = "property.IS_PRIMARY_PROPERTY";

    /** Attribute */
    static final String PropertyKind = "property.PROPERTY_KIND";

    /** Attribute */
    static final String PropertyName = "property.NAME";

    /** Attribute */
    static final String PropertyOrderIndex = "property.ORDER_INDEX";

    /** Attribute */
    static final String PropertyState = "property.STATE";

    /** Attribute */
    static final String PropertyType = "property.TYPE";

    /** Attribute */
    static final String Operation = "OBJECT_ACTION.OPERATION";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String ObjectActionId = "objectActionId";

        /** Attribute */
        static final String Action = "action";

        /** Attribute */
        static final String ObjectId = "objectId";

        /** Attribute */
        static final String PropertyId = "propertyId";

        /** Attribute */
        static final String PropertyValue = "propertyValue";

        /** Attribute */
        static final String PropertyDataSize = "propertyDataSize";

        /** Attribute */
        static final String PropertyDataType = "propertyDataType";

        /** Attribute */
        static final String PropertyDefaultValue = "propertyDefaultValue";

        /** Attribute */
        static final String PropertyDescription = "propertyDescription";

        /** Attribute */
        static final String PropertyIsEnum = "propertyIsEnum";

        /** Attribute */
        static final String PropertyIsGenerate = "propertyIsGenerate";

        /** Attribute */
        static final String PropertyIsPrimaryProperty = "propertyIsPrimaryProperty";

        /** Attribute */
        static final String PropertyKind = "propertyKind";

        /** Attribute */
        static final String PropertyName = "propertyName";

        /** Attribute */
        static final String PropertyOrderIndex = "propertyOrderIndex";

        /** Attribute */
        static final String PropertyState = "propertyState";

        /** Attribute */
        static final String PropertyType = "propertyType";

        /** Attribute */
        static final String Operation = "operation";
    } // end DataProperty

    /**
     * Check Unique BusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessObjectAction aBusinessObjectAction)
        throws Exception;

    /**
     * insert BusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessObjectAction(BusinessObjectAction aBusinessObjectAction)
        throws Exception;

    /**
     * Batch Insert BusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectAction) throws Exception;

    /**
     * Delete BusinessObjectAction
     *
     * @param aObjectActionId long aObjectActionId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessObjectAction(final long aObjectActionId)
        throws Exception;

    /**
     * Delete BusinessObjectAction By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessObjectAction(BusinessObjectActionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessObjectAction(BusinessObjectAction aBusinessObjectAction)
        throws Exception;

    /**
     * Batch Modify BusinessObjectAction
     *
     * @param aBusinessObjectAction
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectAction) throws Exception;

    /**
     * Modify BusinessObjectAction  By Query Conditions
     *
     * @param aBusinessObjectAction Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessObjectAction(
        BusinessObjectAction aBusinessObjectAction,
        BusinessObjectActionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessObjectAction
     *
     * @param aObjectActionId long aObjectActionId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessObjectAction findBusinessObjectActionById(
        final long aObjectActionId) throws Exception;

    /**
     * Query BusinessObjectAction
     *
     * @param aQueryBean
     *
     * @return IBusinessObjectAction[]
     *
     * @throws Exception
     *
     * @model type="IBusinessObjectAction" containment="true"
     */
    BusinessObjectAction[] queryBusinessObjectAction(
        BusinessObjectActionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessObjectAction
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessObjectAction[]
     *
     * @throws Exception
     *
     * @model type="IBusinessObjectAction" containment="true"
     */

    //Map queryBusinessObjectActionForMap(BusinessObjectActionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessObjectAction
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessObjectActionCount(
        BusinessObjectActionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessObjectAction Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessObjectActionSelective(
        BusinessObjectActionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BusinessObjectAction
     *
     * @param aBusinessObjectActions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectActions,
        BusinessObjectActionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BusinessObjectAction
     *
     * @param aBusinessObjectActions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessObjectAction(
        BusinessObjectAction[] aBusinessObjectActions,
        BusinessObjectActionDAOQueryBean aQueryBean,
        BusinessObjectActionSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessObjectActionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessObjectActionArray DOCUMENT ME!
         * @param willUpdateBusinessObjectActionArray DOCUMENT ME!
         * @param willDeleteBusinessObjectActionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessObjectAction[] willAddBusinessObjectActionArray,
            BusinessObjectAction[] willUpdateBusinessObjectActionArray,
            BusinessObjectAction[] willDeleteBusinessObjectActionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjectActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BusinessObjectAction[] aBusinessObjectActions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjectActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BusinessObjectAction[] aBusinessObjectActions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjectActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BusinessObjectAction[] aBusinessObjectActions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjectActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BusinessObjectAction[] aBusinessObjectActions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjectActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BusinessObjectAction[] aBusinessObjectActions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjectActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BusinessObjectAction[] aBusinessObjectActions)
            throws Exception;
    } // end BusinessObjectActionSynchronizeCallback
} // end IBaseBusinessObjectActionDAO
