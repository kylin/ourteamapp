/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao.impl;

import com.ourteam.document.dao.DocumentInfo;
import com.ourteam.document.dao.DocumentInfoDAOQueryBean;
import com.ourteam.document.dao.IDocumentInfoDAO;

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
 * ÎÄµµÐÅÏ¢ DAO JDBC Impl Generate Date : 2011-06-10 22:45:50
 *
 * @author Kylin
 */
abstract public class BaseDocumentInfoDAOJdbcImpl extends AbstractJdbcDAO
    implements IDocumentInfoDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DocumentLanguage, DocumentLastModifier, DocumentLastModifyDate,
            DocumentName, DocumentType, DocumentVersion, FolderId, Remarks,
            Status, DocumentPath, DocumentSize, DocumentLastModifierId,
            LockToken
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DocumentLanguage,
            DataProperty.DocumentLastModifier,
            DataProperty.DocumentLastModifyDate, DataProperty.DocumentName,
            DataProperty.DocumentType, DataProperty.DocumentVersion,
            DataProperty.FolderId, DataProperty.Remarks, DataProperty.Status,
            DataProperty.DocumentPath, DataProperty.DocumentSize,
            DataProperty.DocumentLastModifierId, DataProperty.LockToken
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
     * Creates a new BaseDocumentInfoDAOJdbcImpl object.
     */
    public BaseDocumentInfoDAOJdbcImpl() {
        super();
    } // end BaseDocumentInfoDAOJdbcImpl()

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

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique DocumentInfo
     *
     * @param aDocumentInfo
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(DocumentInfo aDocumentInfo)
        throws Exception {
        if (aDocumentInfo == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aDocumentInfo, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IDocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     */
    public void insertDocumentInfo(DocumentInfo aDocumentInfo)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aDocumentInfo,
            "documentLastModifyDate",
            new java.sql.Timestamp(System.currentTimeMillis()));

        insert(aDocumentInfo);
    } // end insertDocumentInfo()

    /**
     * Batch Insert IDocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     */
    public void batchInsertDocumentInfo(DocumentInfo[] aDocumentInfo)
        throws Exception {
        batchInsert(aDocumentInfo);
    } // end batchInsertDocumentInfo()

    /**
     * Delete IDocumentInfo
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteDocumentInfo(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteDocumentInfo()

    /**
     * Delete IDocumentInfo
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteDocumentInfo(DocumentInfoDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteDocumentInfo()

    /**
     * Update IDocumentInfo Selective
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     */
    public void updateDocumentInfo(DocumentInfo aDocumentInfo)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aDocumentInfo,
            "documentLastModifyDate",
            new java.sql.Timestamp(System.currentTimeMillis()));

        if (aDocumentInfo.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aDocumentInfo);

        DocumentInfo tempObj = findDocumentInfoById(aDocumentInfo.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aDocumentInfo, tempObj);
        } // end if
    } // end updateDocumentInfo()

    /**
     * Batch Update IDocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     */
    public void batchUpdateDocumentInfo(DocumentInfo[] aDocumentInfo)
        throws Exception {
        batchUpdate(aDocumentInfo);
    } // end batchUpdateDocumentInfo()

    /**
     * Update IDocumentInfo
     *
     * @param aDocumentInfo
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateDocumentInfo(DocumentInfo aDocumentInfo,
        DocumentInfoDAOQueryBean aQueryBean) throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aDocumentInfo,
            "documentLastModifyDate",
            new java.sql.Timestamp(System.currentTimeMillis()));

        updateByQuery(aDocumentInfo, aQueryBean);
    } // end updateDocumentInfo()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentInfo DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(DocumentInfo aDocumentInfo)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentInfos DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeDocumentInfo(DocumentInfo[] aDocumentInfos,
        DocumentInfoDAOQueryBean aQueryBean) throws Exception {
        synchronizeDocumentInfo(aDocumentInfos, aQueryBean, null);
    } // end synchronizeDocumentInfo()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentInfos DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeDocumentInfo(DocumentInfo[] aDocumentInfos,
        DocumentInfoDAOQueryBean aQueryBean,
        DocumentInfoSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aDocumentInfos) == false) {
            inputList.addAll(Arrays.asList(aDocumentInfos));
        } // end if

        DocumentInfo[] existentDocumentInfos = this.queryDocumentInfo(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentDocumentInfos) == false) {
            existentList.addAll(Arrays.asList(existentDocumentInfos));
        } // end if

        List willAddDocumentInfos = ListUtils.subtract(inputList, existentList);

        List willDeleteDocumentInfos = ListUtils.subtract(existentList,
                inputList);

        List willUpdateDocumentInfos = ListUtils.intersection(existentList,
                inputList);

        DocumentInfo[] willUpdateDocumentInfoArray = (DocumentInfo[]) willUpdateDocumentInfos.toArray(new DocumentInfo[willUpdateDocumentInfos.size()]);
        DocumentInfo[] willAddDocumentInfoArray = (DocumentInfo[]) willAddDocumentInfos.toArray(new DocumentInfo[willAddDocumentInfos.size()]);
        DocumentInfo[] willDeleteDocumentInfoArray = (DocumentInfo[]) willDeleteDocumentInfos.toArray(new DocumentInfo[willDeleteDocumentInfos.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddDocumentInfoArray,
                willUpdateDocumentInfoArray, willDeleteDocumentInfoArray);
        } // end if

        if (willUpdateDocumentInfos.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateDocumentInfoArray);
            } // end if

            this.batchUpdateDocumentInfo(willUpdateDocumentInfoArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateDocumentInfoArray);
            } // end if
        } // end if

        if (willAddDocumentInfos.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddDocumentInfoArray);
            } // end if

            this.batchInsertDocumentInfo(willAddDocumentInfoArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddDocumentInfoArray);
            } // end if
        } // end if

        if (willDeleteDocumentInfos.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteDocumentInfoArray);
            } // end if

            for (int i = 0; i < willDeleteDocumentInfoArray.length; i++) {
                DocumentInfo object = willDeleteDocumentInfoArray[i];
                this.deleteDocumentInfo(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteDocumentInfoArray);
            } // end if
        } // end if
    } // end synchronizeDocumentInfo()

    /**
     * Query IDocumentInfo
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public DocumentInfo findDocumentInfoById(final long aId)
        throws Exception {
        DocumentInfoDAOQueryBean queryBean = new DocumentInfoDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        DocumentInfo[] DocumentInfos = queryDocumentInfo(queryBean);

        if (DocumentInfos.length == 0) {
            return null;
        } // end if
        else {
            return DocumentInfos[0];
        } // end else
    } // end findDocumentInfoById()

    /**
     * Query IDocumentInfo
     *
     * @param queryBean
     *
     * @return IDocumentInfo[]
     *
     * @throws Exception
     */
    public DocumentInfo[] queryDocumentInfo(DocumentInfoDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcDocumentInfoRowMapper());

        return (DocumentInfo[]) result.toArray(new DocumentInfo[result.size()]);
    } // end queryDocumentInfo()

    /**
     * Query DocumentInfo Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryDocumentInfoSelective(DocumentInfoDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryDocumentInfoSelective()

    /**
     * Query IDocumentInfo Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryDocumentInfoCount(DocumentInfoDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryDocumentInfoCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcDocumentInfoRowMapper
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
            DocumentInfo object = new DocumentInfo();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DocumentLanguage = resultSet.getObject(columnIndex++);

                object.setDocumentLanguageNull(resultSet.getBoolean(
                        columnIndex++));

                if (DocumentLanguage != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.DocumentLanguage, DocumentLanguage);
                } // end if

                Object DocumentLastModifier = resultSet.getObject(columnIndex++);

                object.setDocumentLastModifierNull(resultSet.getBoolean(
                        columnIndex++));

                if (DocumentLastModifier != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.DocumentLastModifier, DocumentLastModifier);
                } // end if

                Object DocumentLastModifyDate = resultSet.getObject(columnIndex++);

                object.setDocumentLastModifyDateNull(resultSet.getBoolean(
                        columnIndex++));

                if (DocumentLastModifyDate != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.DocumentLastModifyDate,
                        DocumentLastModifyDate);
                } // end if

                Object DocumentName = resultSet.getObject(columnIndex++);

                object.setDocumentNameNull(resultSet.getBoolean(columnIndex++));

                if (DocumentName != null) {
                    BeanUtils.setProperty(object, DataProperty.DocumentName,
                        DocumentName);
                } // end if

                Object DocumentType = resultSet.getObject(columnIndex++);

                object.setDocumentTypeNull(resultSet.getBoolean(columnIndex++));

                if (DocumentType != null) {
                    BeanUtils.setProperty(object, DataProperty.DocumentType,
                        DocumentType);
                } // end if

                Object DocumentVersion = resultSet.getObject(columnIndex++);

                object.setDocumentVersionNull(resultSet.getBoolean(
                        columnIndex++));

                if (DocumentVersion != null) {
                    BeanUtils.setProperty(object, DataProperty.DocumentVersion,
                        DocumentVersion);
                } // end if

                Object FolderId = resultSet.getObject(columnIndex++);

                object.setFolderIdNull(resultSet.getBoolean(columnIndex++));

                if (FolderId != null) {
                    BeanUtils.setProperty(object, DataProperty.FolderId,
                        FolderId);
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

                Object DocumentPath = resultSet.getObject(columnIndex++);

                object.setDocumentPathNull(resultSet.getBoolean(columnIndex++));

                if (DocumentPath != null) {
                    BeanUtils.setProperty(object, DataProperty.DocumentPath,
                        DocumentPath);
                } // end if

                Object DocumentSize = resultSet.getObject(columnIndex++);

                object.setDocumentSizeNull(resultSet.getBoolean(columnIndex++));

                if (DocumentSize != null) {
                    BeanUtils.setProperty(object, DataProperty.DocumentSize,
                        DocumentSize);
                } // end if

                Object DocumentLastModifierId = resultSet.getObject(columnIndex++);

                object.setDocumentLastModifierIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (DocumentLastModifierId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.DocumentLastModifierId,
                        DocumentLastModifierId);
                } // end if

                Object LockToken = resultSet.getObject(columnIndex++);

                object.setLockTokenNull(resultSet.getBoolean(columnIndex++));

                if (LockToken != null) {
                    BeanUtils.setProperty(object, DataProperty.LockToken,
                        LockToken);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcDocumentInfoRowMapper
} // end BaseDocumentInfoDAOJdbcImpl
