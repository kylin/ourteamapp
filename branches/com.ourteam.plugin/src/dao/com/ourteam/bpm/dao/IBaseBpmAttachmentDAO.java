/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmAttachment Data Access Object
*  GenDate 2011-12-02 14:46:13  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmAttachmentDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_ATTACHMENT";

    /** Attribute */
    static final String Id = "BPM_ATTACHMENT.ID";

    /** Attribute */
    static final String CreateDate = "BPM_ATTACHMENT.CREATE_DATE";

    /** Attribute */
    static final String CreatorId = "BPM_ATTACHMENT.CREATOR_ID";

    /** Attribute */
    static final String FileName = "BPM_ATTACHMENT.FILE_NAME";

    /** Attribute */
    static final String FileSize = "BPM_ATTACHMENT.FILE_SIZE";

    /** Attribute */
    static final String FileType = "BPM_ATTACHMENT.FILE_TYPE";

    /** Attribute */
    static final String ProcessInstanceId = "BPM_ATTACHMENT.PROCESS_INSTANCE_ID";

    /** Attribute */
    static final String Remarks = "BPM_ATTACHMENT.REMARKS";

    /** Attribute */
    static final String Status = "BPM_ATTACHMENT.STATUS";

    /** Attribute */
    static final String TaskId = "BPM_ATTACHMENT.TASK_ID";

    /** Attribute */
    static final String AttachementUrl = "BPM_ATTACHMENT.ATTACHEMENT_URL";

    /** Attribute */
    static final String AttachementType = "BPM_ATTACHMENT.ATTACHEMENT_TYPE";

    /** Attribute */
    static final String AttachmentKey = "BPM_ATTACHMENT.ATTACHMENT_KEY";

    /** Attribute */
    static final String FileDisplaySize = "BPM_ATTACHMENT.FILE_DISPLAY_SIZE";

    /** Attribute */
    static final String CreratorName = "creatorA.NAME";

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
        static final String CreateDate = "createDate";

        /** Attribute */
        static final String CreatorId = "creatorId";

        /** Attribute */
        static final String FileName = "fileName";

        /** Attribute */
        static final String FileSize = "fileSize";

        /** Attribute */
        static final String FileType = "fileType";

        /** Attribute */
        static final String ProcessInstanceId = "processInstanceId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TaskId = "taskId";

        /** Attribute */
        static final String AttachementUrl = "attachementUrl";

        /** Attribute */
        static final String AttachementType = "attachementType";

        /** Attribute */
        static final String AttachmentKey = "attachmentKey";

        /** Attribute */
        static final String FileDisplaySize = "fileDisplaySize";

        /** Attribute */
        static final String CreratorName = "creratorName";
    } // end DataProperty

    /**
     * Check Unique BpmAttachment
     *
     * @param aBpmAttachment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmAttachment aBpmAttachment)
        throws Exception;

    /**
     * insert BpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmAttachment(BpmAttachment aBpmAttachment)
        throws Exception;

    /**
     * Batch Insert BpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmAttachment(BpmAttachment[] aBpmAttachment)
        throws Exception;

    /**
     * Delete BpmAttachment
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmAttachment(final long aId) throws Exception;

    /**
     * Delete BpmAttachment By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmAttachment(BpmAttachmentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmAttachment(BpmAttachment aBpmAttachment)
        throws Exception;

    /**
     * Batch Modify BpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmAttachment(BpmAttachment[] aBpmAttachment)
        throws Exception;

    /**
     * Modify BpmAttachment  By Query Conditions
     *
     * @param aBpmAttachment Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmAttachment(BpmAttachment aBpmAttachment,
        BpmAttachmentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmAttachment
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmAttachment findBpmAttachmentById(final long aId)
        throws Exception;

    /**
     * Query BpmAttachment
     *
     * @param aQueryBean
     *
     * @return IBpmAttachment[]
     *
     * @throws Exception
     *
     * @model type="IBpmAttachment" containment="true"
     */
    BpmAttachment[] queryBpmAttachment(BpmAttachmentDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmAttachment
     *
     * @param aBaseQueryBean
     *
     * @return IBpmAttachment[]
     *
     * @throws Exception
     *
     * @model type="IBpmAttachment" containment="true"
     */

    //Map queryBpmAttachmentForMap(BpmAttachmentDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmAttachment
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmAttachmentCount(BpmAttachmentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmAttachment Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmAttachmentSelective(BpmAttachmentDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmAttachment
     *
     * @param aBpmAttachments
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmAttachment(BpmAttachment[] aBpmAttachments,
        BpmAttachmentDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmAttachment
     *
     * @param aBpmAttachments
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmAttachment(BpmAttachment[] aBpmAttachments,
        BpmAttachmentDAOQueryBean aQueryBean,
        BpmAttachmentSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmAttachmentSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmAttachmentArray DOCUMENT ME!
         * @param willUpdateBpmAttachmentArray DOCUMENT ME!
         * @param willDeleteBpmAttachmentArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmAttachment[] willAddBpmAttachmentArray,
            BpmAttachment[] willUpdateBpmAttachmentArray,
            BpmAttachment[] willDeleteBpmAttachmentArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmAttachments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmAttachment[] aBpmAttachments)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmAttachments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmAttachment[] aBpmAttachments)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmAttachments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmAttachment[] aBpmAttachments)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmAttachments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmAttachment[] aBpmAttachments)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmAttachments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmAttachment[] aBpmAttachments)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmAttachments DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmAttachment[] aBpmAttachments)
            throws Exception;
    } // end BpmAttachmentSynchronizeCallback
} // end IBaseBpmAttachmentDAO
