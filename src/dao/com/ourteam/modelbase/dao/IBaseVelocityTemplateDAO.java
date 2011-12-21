/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IVelocityTemplate Data Access Object
*  GenDate 2011-09-22 10:16:52  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseVelocityTemplateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "VELOCITY_TEMPLATE";

    /** Attribute */
    static final String Id = "VELOCITY_TEMPLATE.ID";

    /** Attribute */
    static final String Description = "VELOCITY_TEMPLATE.DESCRIPTION";

    /** Attribute */
    static final String TemplateContent = "VELOCITY_TEMPLATE.TEMPLATE_CONTENT";

    /** Attribute */
    static final String TemplateName = "VELOCITY_TEMPLATE.TEMPLATE_NAME";

    /** Attribute */
    static final String TemplateTimestamp = "VELOCITY_TEMPLATE.TEMPLATE_TIMESTAMP";

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
        static final String Description = "description";

        /** Attribute */
        static final String TemplateContent = "templateContent";

        /** Attribute */
        static final String TemplateName = "templateName";

        /** Attribute */
        static final String TemplateTimestamp = "templateTimestamp";
    } // end DataProperty

    /**
     * Check Unique VelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(VelocityTemplate aVelocityTemplate)
        throws Exception;

    /**
     * insert VelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void insertVelocityTemplate(VelocityTemplate aVelocityTemplate)
        throws Exception;

    /**
     * Batch Insert VelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertVelocityTemplate(VelocityTemplate[] aVelocityTemplate)
        throws Exception;

    /**
     * Delete VelocityTemplate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteVelocityTemplate(final long aId) throws Exception;

    /**
     * Delete VelocityTemplate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteVelocityTemplate(VelocityTemplateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify VelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void updateVelocityTemplate(VelocityTemplate aVelocityTemplate)
        throws Exception;

    /**
     * Batch Modify VelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateVelocityTemplate(VelocityTemplate[] aVelocityTemplate)
        throws Exception;

    /**
     * Modify VelocityTemplate  By Query Conditions
     *
     * @param aVelocityTemplate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateVelocityTemplate(VelocityTemplate aVelocityTemplate,
        VelocityTemplateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query VelocityTemplate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    VelocityTemplate findVelocityTemplateById(final long aId)
        throws Exception;

    /**
     * Query VelocityTemplate
     *
     * @param aQueryBean
     *
     * @return IVelocityTemplate[]
     *
     * @throws Exception
     *
     * @model type="IVelocityTemplate" containment="true"
     */
    VelocityTemplate[] queryVelocityTemplate(
        VelocityTemplateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query VelocityTemplate
     *
     * @param aBaseQueryBean
     *
     * @return IVelocityTemplate[]
     *
     * @throws Exception
     *
     * @model type="IVelocityTemplate" containment="true"
     */

    //Map queryVelocityTemplateForMap(VelocityTemplateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count VelocityTemplate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryVelocityTemplateCount(VelocityTemplateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query VelocityTemplate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryVelocityTemplateSelective(
        VelocityTemplateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize VelocityTemplate
     *
     * @param aVelocityTemplates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeVelocityTemplate(VelocityTemplate[] aVelocityTemplates,
        VelocityTemplateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize VelocityTemplate
     *
     * @param aVelocityTemplates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeVelocityTemplate(VelocityTemplate[] aVelocityTemplates,
        VelocityTemplateDAOQueryBean aQueryBean,
        VelocityTemplateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface VelocityTemplateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddVelocityTemplateArray DOCUMENT ME!
         * @param willUpdateVelocityTemplateArray DOCUMENT ME!
         * @param willDeleteVelocityTemplateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            VelocityTemplate[] willAddVelocityTemplateArray,
            VelocityTemplate[] willUpdateVelocityTemplateArray,
            VelocityTemplate[] willDeleteVelocityTemplateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aVelocityTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(VelocityTemplate[] aVelocityTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aVelocityTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(VelocityTemplate[] aVelocityTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aVelocityTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(VelocityTemplate[] aVelocityTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aVelocityTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(VelocityTemplate[] aVelocityTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aVelocityTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(VelocityTemplate[] aVelocityTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aVelocityTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(VelocityTemplate[] aVelocityTemplates)
            throws Exception;
    } // end VelocityTemplateSynchronizeCallback
} // end IBaseVelocityTemplateDAO
