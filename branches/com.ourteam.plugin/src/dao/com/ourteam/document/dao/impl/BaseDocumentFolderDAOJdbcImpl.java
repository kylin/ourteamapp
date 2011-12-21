/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao.impl;

import com.ourteam.document.dao.DocumentFolder;
import com.ourteam.document.dao.DocumentFolderDAOQueryBean;
import com.ourteam.document.dao.IDocumentFolderDAO;

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
 * ÎÄµµÄ¿Â¼ DAO JDBC Impl Generate Date : 2011-06-10 22:45:50
 *
 * @author Kylin
 */
abstract public class BaseDocumentFolderDAOJdbcImpl extends AbstractJdbcDAO
    implements IDocumentFolderDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, FolderName, ParentFolderId, Remarks, SortIndex, Status,
            FolderPath, LockToken
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.FolderName,
            DataProperty.ParentFolderId, DataProperty.Remarks,
            DataProperty.SortIndex, DataProperty.Status, DataProperty.FolderPath,
            DataProperty.LockToken
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
     * Creates a new BaseDocumentFolderDAOJdbcImpl object.
     */
    public BaseDocumentFolderDAOJdbcImpl() {
        super();
    } // end BaseDocumentFolderDAOJdbcImpl()

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
     * Check Unique DocumentFolder
     *
     * @param aDocumentFolder
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(DocumentFolder aDocumentFolder)
        throws Exception {
        if (aDocumentFolder == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aDocumentFolder,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IDocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     */
    public void insertDocumentFolder(DocumentFolder aDocumentFolder)
        throws Exception {
        insert(aDocumentFolder);
    } // end insertDocumentFolder()

    /**
     * Batch Insert IDocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     */
    public void batchInsertDocumentFolder(DocumentFolder[] aDocumentFolder)
        throws Exception {
        batchInsert(aDocumentFolder);
    } // end batchInsertDocumentFolder()

    /**
     * Delete IDocumentFolder
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteDocumentFolder(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteDocumentFolder()

    /**
     * Delete IDocumentFolder
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteDocumentFolder(DocumentFolderDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteDocumentFolder()

    /**
     * Update IDocumentFolder Selective
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     */
    public void updateDocumentFolder(DocumentFolder aDocumentFolder)
        throws Exception {
        if (aDocumentFolder.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aDocumentFolder);

        DocumentFolder tempObj = findDocumentFolderById(aDocumentFolder.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aDocumentFolder, tempObj);
        } // end if
    } // end updateDocumentFolder()

    /**
     * Batch Update IDocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     */
    public void batchUpdateDocumentFolder(DocumentFolder[] aDocumentFolder)
        throws Exception {
        batchUpdate(aDocumentFolder);
    } // end batchUpdateDocumentFolder()

    /**
     * Update IDocumentFolder
     *
     * @param aDocumentFolder
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateDocumentFolder(DocumentFolder aDocumentFolder,
        DocumentFolderDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aDocumentFolder, aQueryBean);
    } // end updateDocumentFolder()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentFolder DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(DocumentFolder aDocumentFolder)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentFolders DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeDocumentFolder(DocumentFolder[] aDocumentFolders,
        DocumentFolderDAOQueryBean aQueryBean) throws Exception {
        synchronizeDocumentFolder(aDocumentFolders, aQueryBean, null);
    } // end synchronizeDocumentFolder()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentFolders DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeDocumentFolder(DocumentFolder[] aDocumentFolders,
        DocumentFolderDAOQueryBean aQueryBean,
        DocumentFolderSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aDocumentFolders) == false) {
            inputList.addAll(Arrays.asList(aDocumentFolders));
        } // end if

        DocumentFolder[] existentDocumentFolders = this.queryDocumentFolder(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentDocumentFolders) == false) {
            existentList.addAll(Arrays.asList(existentDocumentFolders));
        } // end if

        List willAddDocumentFolders = ListUtils.subtract(inputList, existentList);

        List willDeleteDocumentFolders = ListUtils.subtract(existentList,
                inputList);

        List willUpdateDocumentFolders = ListUtils.intersection(existentList,
                inputList);

        DocumentFolder[] willUpdateDocumentFolderArray = (DocumentFolder[]) willUpdateDocumentFolders.toArray(new DocumentFolder[willUpdateDocumentFolders.size()]);
        DocumentFolder[] willAddDocumentFolderArray = (DocumentFolder[]) willAddDocumentFolders.toArray(new DocumentFolder[willAddDocumentFolders.size()]);
        DocumentFolder[] willDeleteDocumentFolderArray = (DocumentFolder[]) willDeleteDocumentFolders.toArray(new DocumentFolder[willDeleteDocumentFolders.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddDocumentFolderArray,
                willUpdateDocumentFolderArray, willDeleteDocumentFolderArray);
        } // end if

        if (willUpdateDocumentFolders.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateDocumentFolderArray);
            } // end if

            this.batchUpdateDocumentFolder(willUpdateDocumentFolderArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateDocumentFolderArray);
            } // end if
        } // end if

        if (willAddDocumentFolders.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddDocumentFolderArray);
            } // end if

            this.batchInsertDocumentFolder(willAddDocumentFolderArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddDocumentFolderArray);
            } // end if
        } // end if

        if (willDeleteDocumentFolders.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteDocumentFolderArray);
            } // end if

            for (int i = 0; i < willDeleteDocumentFolderArray.length; i++) {
                DocumentFolder object = willDeleteDocumentFolderArray[i];
                this.deleteDocumentFolder(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteDocumentFolderArray);
            } // end if
        } // end if
    } // end synchronizeDocumentFolder()

    /**
     * Query IDocumentFolder
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public DocumentFolder findDocumentFolderById(final long aId)
        throws Exception {
        DocumentFolderDAOQueryBean queryBean = new DocumentFolderDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        DocumentFolder[] DocumentFolders = queryDocumentFolder(queryBean);

        if (DocumentFolders.length == 0) {
            return null;
        } // end if
        else {
            return DocumentFolders[0];
        } // end else
    } // end findDocumentFolderById()

    /**
     * Query IDocumentFolder
     *
     * @param queryBean
     *
     * @return IDocumentFolder[]
     *
     * @throws Exception
     */
    public DocumentFolder[] queryDocumentFolder(
        DocumentFolderDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcDocumentFolderRowMapper());

        return (DocumentFolder[]) result.toArray(new DocumentFolder[result.size()]);
    } // end queryDocumentFolder()

    /**
     * Query DocumentFolder Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryDocumentFolderSelective(
        DocumentFolderDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryDocumentFolderSelective()

    /**
     * Query IDocumentFolder Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryDocumentFolderCount(DocumentFolderDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryDocumentFolderCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcDocumentFolderRowMapper
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
            DocumentFolder object = new DocumentFolder();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object FolderName = resultSet.getObject(columnIndex++);

                object.setFolderNameNull(resultSet.getBoolean(columnIndex++));

                if (FolderName != null) {
                    BeanUtils.setProperty(object, DataProperty.FolderName,
                        FolderName);
                } // end if

                Object ParentFolderId = resultSet.getObject(columnIndex++);

                object.setParentFolderIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentFolderId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentFolderId,
                        ParentFolderId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object FolderPath = resultSet.getObject(columnIndex++);

                object.setFolderPathNull(resultSet.getBoolean(columnIndex++));

                if (FolderPath != null) {
                    BeanUtils.setProperty(object, DataProperty.FolderPath,
                        FolderPath);
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
    } // end JdbcDocumentFolderRowMapper
} // end BaseDocumentFolderDAOJdbcImpl
