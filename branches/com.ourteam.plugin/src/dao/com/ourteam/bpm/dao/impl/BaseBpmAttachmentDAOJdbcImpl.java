/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmAttachment;
import com.ourteam.bpm.dao.BpmAttachmentDAOQueryBean;
import com.ourteam.bpm.dao.IBpmAttachmentDAO;

import net.dao.AbstractJdbcDAO;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.ArrayUtils;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * DAO JDBC Impl Generate Date : 2011-12-02 14:46:23
 *
 * @author kylin
 */
abstract public class BaseBpmAttachmentDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmAttachmentDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CreateDate, CreatorId, FileName, FileSize, FileType,
            ProcessInstanceId, Remarks, Status, TaskId, AttachementUrl,
            AttachementType, AttachmentKey, FileDisplaySize, CreratorName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CreateDate, DataProperty.CreatorId,
            DataProperty.FileName, DataProperty.FileSize, DataProperty.FileType,
            DataProperty.ProcessInstanceId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.TaskId,
            DataProperty.AttachementUrl, DataProperty.AttachementType,
            DataProperty.AttachmentKey, DataProperty.FileDisplaySize,
            DataProperty.CreratorName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {  };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseBpmAttachmentDAOJdbcImpl object.
     */
    public BaseBpmAttachmentDAOJdbcImpl() {
        super();
    } // end BaseBpmAttachmentDAOJdbcImpl()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getEntityName() {
        return EntityName;
    } // end getEntityName()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityFields() {
        return ENTITY_FIELDS;
    } // end getEntityFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityProperties() {
        return ENTITY_PROPERTIES;
    } // end getEntityProperties()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityPKFields() {
        return ENTITY_PK_FIELDS;
    } // end getEntityPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityAutoGenPKFields() {
        return ENTITY_AUTO_GEN_PK_FIELDS;
    } // end getEntityAutoGenPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityUniqueFields() {
        return ENTITY_UNIQUE_FIELDS;
    } // end getEntityUniqueFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getBaiscQueryFilter() {
        if (basicFilterSQL == null) {
            StringBuffer basicFilterSQLbuffer = new StringBuffer();

            basicFilterSQL = basicFilterSQLbuffer.toString();
        } // end if

        return basicFilterSQL;
    } // end getBaiscQueryFilter()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getRelatedJoinSQL() {
        if (relatedJoinSQL == null) {
            StringBuffer relatedJoinSQLBuffer = new StringBuffer();

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE creatorA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " creatorA.ID = BPM_ATTACHMENT.CREATOR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmAttachment
     *
     * @param aBpmAttachment
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmAttachment aBpmAttachment)
        throws Exception {
        if (aBpmAttachment == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmAttachment,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     */
    public void insertBpmAttachment(BpmAttachment aBpmAttachment)
        throws Exception {
        insert(aBpmAttachment);
    } // end insertBpmAttachment()

    /**
     * Batch Insert IBpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     */
    public void batchInsertBpmAttachment(BpmAttachment[] aBpmAttachment)
        throws Exception {
        batchInsert(aBpmAttachment);
    } // end batchInsertBpmAttachment()

    /**
     * Delete IBpmAttachment
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmAttachment(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmAttachment()

    /**
     * Delete IBpmAttachment
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmAttachment(BpmAttachmentDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmAttachment()

    /**
     * Update IBpmAttachment Selective
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     */
    public void updateBpmAttachment(BpmAttachment aBpmAttachment)
        throws Exception {
        if (aBpmAttachment.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmAttachment);

        BpmAttachment tempObj = findBpmAttachmentById(aBpmAttachment.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmAttachment, tempObj);
        } // end if
    } // end updateBpmAttachment()

    /**
     * Batch Update IBpmAttachment
     *
     * @param aBpmAttachment
     *
     * @throws Exception
     */
    public void batchUpdateBpmAttachment(BpmAttachment[] aBpmAttachment)
        throws Exception {
        batchUpdate(aBpmAttachment);
    } // end batchUpdateBpmAttachment()

    /**
     * Update IBpmAttachment
     *
     * @param aBpmAttachment
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmAttachment(BpmAttachment aBpmAttachment,
        BpmAttachmentDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmAttachment, aQueryBean);
    } // end updateBpmAttachment()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmAttachment DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmAttachment aBpmAttachment)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmAttachments DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmAttachment(BpmAttachment[] aBpmAttachments,
        BpmAttachmentDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmAttachment(aBpmAttachments, aQueryBean, null);
    } // end synchronizeBpmAttachment()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmAttachments DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmAttachment(BpmAttachment[] aBpmAttachments,
        BpmAttachmentDAOQueryBean aQueryBean,
        BpmAttachmentSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmAttachments) == false) {
            inputList.addAll(Arrays.asList(aBpmAttachments));
        } // end if

        BpmAttachment[] existentBpmAttachments = this.queryBpmAttachment(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmAttachments) == false) {
            existentList.addAll(Arrays.asList(existentBpmAttachments));
        } // end if

        List willAddBpmAttachments = ListUtils.subtract(inputList, existentList);

        List willDeleteBpmAttachments = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmAttachments = ListUtils.intersection(existentList,
                inputList);

        BpmAttachment[] willUpdateBpmAttachmentArray = (BpmAttachment[]) willUpdateBpmAttachments.toArray(new BpmAttachment[willUpdateBpmAttachments.size()]);
        BpmAttachment[] willAddBpmAttachmentArray = (BpmAttachment[]) willAddBpmAttachments.toArray(new BpmAttachment[willAddBpmAttachments.size()]);
        BpmAttachment[] willDeleteBpmAttachmentArray = (BpmAttachment[]) willDeleteBpmAttachments.toArray(new BpmAttachment[willDeleteBpmAttachments.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmAttachmentArray,
                willUpdateBpmAttachmentArray, willDeleteBpmAttachmentArray);
        } // end if

        if (willUpdateBpmAttachments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmAttachmentArray);
            } // end if

            this.batchUpdateBpmAttachment(willUpdateBpmAttachmentArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmAttachmentArray);
            } // end if
        } // end if

        if (willAddBpmAttachments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmAttachmentArray);
            } // end if

            this.batchInsertBpmAttachment(willAddBpmAttachmentArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmAttachmentArray);
            } // end if
        } // end if

        if (willDeleteBpmAttachments.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmAttachmentArray);
            } // end if

            for (int i = 0; i < willDeleteBpmAttachmentArray.length; i++) {
                BpmAttachment object = willDeleteBpmAttachmentArray[i];
                this.deleteBpmAttachment(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmAttachmentArray);
            } // end if
        } // end if
    } // end synchronizeBpmAttachment()

    /**
     * Query IBpmAttachment
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmAttachment findBpmAttachmentById(final long aId)
        throws Exception {
        BpmAttachmentDAOQueryBean queryBean = new BpmAttachmentDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmAttachment[] BpmAttachments = queryBpmAttachment(queryBean);

        if (BpmAttachments.length == 0) {
            return null;
        } // end if
        else {
            return BpmAttachments[0];
        } // end else
    } // end findBpmAttachmentById()

    /**
     * Query IBpmAttachment
     *
     * @param queryBean
     *
     * @return IBpmAttachment[]
     *
     * @throws Exception
     */
    public BpmAttachment[] queryBpmAttachment(
        BpmAttachmentDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBpmAttachmentRowMapper());

        return (BpmAttachment[]) result.toArray(new BpmAttachment[result.size()]);
    } // end queryBpmAttachment()

    /**
     * Query BpmAttachment Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmAttachmentSelective(
        BpmAttachmentDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmAttachmentSelective()

    /**
     * Query IBpmAttachment Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmAttachmentCount(BpmAttachmentDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmAttachmentCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmAttachmentRowMapper
        implements ParameterizedRowMapper {
        /**
         * DOCUMENT ME!
         *
         * @param resultSet DOCUMENT ME!
         * @param arg1 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         *
         * @throws SQLException DOCUMENT ME!
         */
        public Object mapRow(ResultSet resultSet, int arg1)
            throws SQLException {
            BpmAttachment object = new BpmAttachment();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CreateDate = resultSet.getObject(columnIndex++);

                object.setCreateDateNull(resultSet.getBoolean(columnIndex++));

                if (CreateDate != null) {
                    BeanUtils.setProperty(object, DataProperty.CreateDate,
                        CreateDate);
                } // end if

                Object CreatorId = resultSet.getObject(columnIndex++);

                object.setCreatorIdNull(resultSet.getBoolean(columnIndex++));

                if (CreatorId != null) {
                    BeanUtils.setProperty(object, DataProperty.CreatorId,
                        CreatorId);
                } // end if

                Object FileName = resultSet.getObject(columnIndex++);

                object.setFileNameNull(resultSet.getBoolean(columnIndex++));

                if (FileName != null) {
                    BeanUtils.setProperty(object, DataProperty.FileName,
                        FileName);
                } // end if

                Object FileSize = resultSet.getObject(columnIndex++);

                object.setFileSizeNull(resultSet.getBoolean(columnIndex++));

                if (FileSize != null) {
                    BeanUtils.setProperty(object, DataProperty.FileSize,
                        FileSize);
                } // end if

                Object FileType = resultSet.getObject(columnIndex++);

                object.setFileTypeNull(resultSet.getBoolean(columnIndex++));

                if (FileType != null) {
                    BeanUtils.setProperty(object, DataProperty.FileType,
                        FileType);
                } // end if

                Object ProcessInstanceId = resultSet.getObject(columnIndex++);

                object.setProcessInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProcessInstanceId, ProcessInstanceId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object TaskId = resultSet.getObject(columnIndex++);

                object.setTaskIdNull(resultSet.getBoolean(columnIndex++));

                if (TaskId != null) {
                    BeanUtils.setProperty(object, DataProperty.TaskId, TaskId);
                } // end if

                Object AttachementUrl = resultSet.getObject(columnIndex++);

                object.setAttachementUrlNull(resultSet.getBoolean(columnIndex++));

                if (AttachementUrl != null) {
                    BeanUtils.setProperty(object, DataProperty.AttachementUrl,
                        AttachementUrl);
                } // end if

                Object AttachementType = resultSet.getObject(columnIndex++);

                object.setAttachementTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (AttachementType != null) {
                    BeanUtils.setProperty(object, DataProperty.AttachementType,
                        AttachementType);
                } // end if

                Object AttachmentKey = resultSet.getObject(columnIndex++);

                object.setAttachmentKeyNull(resultSet.getBoolean(columnIndex++));

                if (AttachmentKey != null) {
                    BeanUtils.setProperty(object, DataProperty.AttachmentKey,
                        AttachmentKey);
                } // end if

                Object FileDisplaySize = resultSet.getObject(columnIndex++);

                object.setFileDisplaySizeNull(resultSet.getBoolean(
                        columnIndex++));

                if (FileDisplaySize != null) {
                    BeanUtils.setProperty(object, DataProperty.FileDisplaySize,
                        FileDisplaySize);
                } // end if

                Object CreratorName = resultSet.getObject(columnIndex++);

                object.setCreratorNameNull(resultSet.getBoolean(columnIndex++));

                if (CreratorName != null) {
                    BeanUtils.setProperty(object, DataProperty.CreratorName,
                        CreratorName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmAttachmentRowMapper
} // end BaseBpmAttachmentDAOJdbcImpl
