/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareDAO;
import com.ourteam.middleware.dao.MiddleWare;
import com.ourteam.middleware.dao.MiddleWareDAOQueryBean;

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
 * 中间件对象 DAO JDBC Impl Generate Date : 2011-12-06 16:04:03
 *
 * @author kylin
 */
abstract public class BaseMiddleWareDAOJdbcImpl extends AbstractJdbcDAO
    implements IMiddleWareDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DriveType, HostName, HostPort, Name, NeedSSL, Password,
            ServiceName, ServiceStatus, Status, Type, User, Provider, Desc,
            GroupId, ProviderId, ProviderName, MiddleWareName, MiddleWareVersion
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DriveType, DataProperty.HostName,
            DataProperty.HostPort, DataProperty.Name, DataProperty.NeedSSL,
            DataProperty.Password, DataProperty.ServiceName,
            DataProperty.ServiceStatus, DataProperty.Status, DataProperty.Type,
            DataProperty.User, DataProperty.Provider, DataProperty.Desc,
            DataProperty.GroupId, DataProperty.ProviderId,
            DataProperty.ProviderName, DataProperty.MiddleWareName,
            DataProperty.MiddleWareVersion
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
     * Creates a new BaseMiddleWareDAOJdbcImpl object.
     */
    public BaseMiddleWareDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(
                " LEFT JOIN MIDDLE_WARE_PROVIDER middleWareProviderA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " middleWareProviderA.ID = MIDDLE_WARE.PROVIDER_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique MiddleWare
     *
     * @param aMiddleWare
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWare aMiddleWare)
        throws Exception {
        if (aMiddleWare == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWare, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     */
    public void insertMiddleWare(MiddleWare aMiddleWare)
        throws Exception {
        insert(aMiddleWare);
    } // end insertMiddleWare()

    /**
     * Batch Insert IMiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     */
    public void batchInsertMiddleWare(MiddleWare[] aMiddleWare)
        throws Exception {
        batchInsert(aMiddleWare);
    } // end batchInsertMiddleWare()

    /**
     * Delete IMiddleWare
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWare(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWare()

    /**
     * Delete IMiddleWare
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWare(MiddleWareDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWare()

    /**
     * Update IMiddleWare Selective
     *
     * @param aMiddleWare
     *
     * @throws Exception
     */
    public void updateMiddleWare(MiddleWare aMiddleWare)
        throws Exception {
        if (aMiddleWare.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWare);

        MiddleWare tempObj = findMiddleWareById(aMiddleWare.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWare, tempObj);
        } // end if
    } // end updateMiddleWare()

    /**
     * Batch Update IMiddleWare
     *
     * @param aMiddleWare
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWare(MiddleWare[] aMiddleWare)
        throws Exception {
        batchUpdate(aMiddleWare);
    } // end batchUpdateMiddleWare()

    /**
     * Update IMiddleWare
     *
     * @param aMiddleWare
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWare(MiddleWare aMiddleWare,
        MiddleWareDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMiddleWare, aQueryBean);
    } // end updateMiddleWare()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWare DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MiddleWare aMiddleWare)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWares DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWare(MiddleWare[] aMiddleWares,
        MiddleWareDAOQueryBean aQueryBean) throws Exception {
        synchronizeMiddleWare(aMiddleWares, aQueryBean, null);
    } // end synchronizeMiddleWare()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWares DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWare(MiddleWare[] aMiddleWares,
        MiddleWareDAOQueryBean aQueryBean,
        MiddleWareSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWares) == false) {
            inputList.addAll(Arrays.asList(aMiddleWares));
        } // end if

        MiddleWare[] existentMiddleWares = this.queryMiddleWare(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWares) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWares));
        } // end if

        List willAddMiddleWares = ListUtils.subtract(inputList, existentList);

        List willDeleteMiddleWares = ListUtils.subtract(existentList, inputList);

        List willUpdateMiddleWares = ListUtils.intersection(existentList,
                inputList);

        MiddleWare[] willUpdateMiddleWareArray = (MiddleWare[]) willUpdateMiddleWares.toArray(new MiddleWare[willUpdateMiddleWares.size()]);
        MiddleWare[] willAddMiddleWareArray = (MiddleWare[]) willAddMiddleWares.toArray(new MiddleWare[willAddMiddleWares.size()]);
        MiddleWare[] willDeleteMiddleWareArray = (MiddleWare[]) willDeleteMiddleWares.toArray(new MiddleWare[willDeleteMiddleWares.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareArray,
                willUpdateMiddleWareArray, willDeleteMiddleWareArray);
        } // end if

        if (willUpdateMiddleWares.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareArray);
            } // end if

            this.batchUpdateMiddleWare(willUpdateMiddleWareArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareArray);
            } // end if
        } // end if

        if (willAddMiddleWares.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareArray);
            } // end if

            this.batchInsertMiddleWare(willAddMiddleWareArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareArray);
            } // end if
        } // end if

        if (willDeleteMiddleWares.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareArray.length; i++) {
                MiddleWare object = willDeleteMiddleWareArray[i];
                this.deleteMiddleWare(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWare()

    /**
     * Query IMiddleWare
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWare findMiddleWareById(final long aId)
        throws Exception {
        MiddleWareDAOQueryBean queryBean = new MiddleWareDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWare[] MiddleWares = queryMiddleWare(queryBean);

        if (MiddleWares.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWares[0];
        } // end else
    } // end findMiddleWareById()

    /**
     * Query IMiddleWare
     *
     * @param queryBean
     *
     * @return IMiddleWare[]
     *
     * @throws Exception
     */
    public MiddleWare[] queryMiddleWare(MiddleWareDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcMiddleWareRowMapper());

        return (MiddleWare[]) result.toArray(new MiddleWare[result.size()]);
    } // end queryMiddleWare()

    /**
     * Query MiddleWare Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareSelective(MiddleWareDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareSelective()

    /**
     * Query IMiddleWare Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareCount(MiddleWareDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareRowMapper
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
            MiddleWare object = new MiddleWare();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DriveType = resultSet.getObject(columnIndex++);

                object.setDriveTypeNull(resultSet.getBoolean(columnIndex++));

                if (DriveType != null) {
                    BeanUtils.setProperty(object, DataProperty.DriveType,
                        DriveType);
                } // end if

                Object HostName = resultSet.getObject(columnIndex++);

                object.setHostNameNull(resultSet.getBoolean(columnIndex++));

                if (HostName != null) {
                    BeanUtils.setProperty(object, DataProperty.HostName,
                        HostName);
                } // end if

                Object HostPort = resultSet.getObject(columnIndex++);

                object.setHostPortNull(resultSet.getBoolean(columnIndex++));

                if (HostPort != null) {
                    BeanUtils.setProperty(object, DataProperty.HostPort,
                        HostPort);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object NeedSSL = resultSet.getObject(columnIndex++);

                object.setNeedSSLNull(resultSet.getBoolean(columnIndex++));

                if (NeedSSL != null) {
                    BeanUtils.setProperty(object, DataProperty.NeedSSL, NeedSSL);
                } // end if

                Object Password = resultSet.getObject(columnIndex++);

                object.setPasswordNull(resultSet.getBoolean(columnIndex++));

                if (Password != null) {
                    BeanUtils.setProperty(object, DataProperty.Password,
                        Password);
                } // end if

                Object ServiceName = resultSet.getObject(columnIndex++);

                object.setServiceNameNull(resultSet.getBoolean(columnIndex++));

                if (ServiceName != null) {
                    BeanUtils.setProperty(object, DataProperty.ServiceName,
                        ServiceName);
                } // end if

                Object ServiceStatus = resultSet.getObject(columnIndex++);

                object.setServiceStatusNull(resultSet.getBoolean(columnIndex++));

                if (ServiceStatus != null) {
                    BeanUtils.setProperty(object, DataProperty.ServiceStatus,
                        ServiceStatus);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object Type = resultSet.getObject(columnIndex++);

                object.setTypeNull(resultSet.getBoolean(columnIndex++));

                if (Type != null) {
                    BeanUtils.setProperty(object, DataProperty.Type, Type);
                } // end if

                Object User = resultSet.getObject(columnIndex++);

                object.setUserNull(resultSet.getBoolean(columnIndex++));

                if (User != null) {
                    BeanUtils.setProperty(object, DataProperty.User, User);
                } // end if

                Object Provider = resultSet.getObject(columnIndex++);

                object.setProviderNull(resultSet.getBoolean(columnIndex++));

                if (Provider != null) {
                    BeanUtils.setProperty(object, DataProperty.Provider,
                        Provider);
                } // end if

                Object Desc = resultSet.getObject(columnIndex++);

                object.setDescNull(resultSet.getBoolean(columnIndex++));

                if (Desc != null) {
                    BeanUtils.setProperty(object, DataProperty.Desc, Desc);
                } // end if

                Object GroupId = resultSet.getObject(columnIndex++);

                object.setGroupIdNull(resultSet.getBoolean(columnIndex++));

                if (GroupId != null) {
                    BeanUtils.setProperty(object, DataProperty.GroupId, GroupId);
                } // end if

                Object ProviderId = resultSet.getObject(columnIndex++);

                object.setProviderIdNull(resultSet.getBoolean(columnIndex++));

                if (ProviderId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderId,
                        ProviderId);
                } // end if

                Object ProviderName = resultSet.getObject(columnIndex++);

                object.setProviderNameNull(resultSet.getBoolean(columnIndex++));

                if (ProviderName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderName,
                        ProviderName);
                } // end if

                Object MiddleWareName = resultSet.getObject(columnIndex++);

                object.setMiddleWareNameNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareName != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareName,
                        MiddleWareName);
                } // end if

                Object MiddleWareVersion = resultSet.getObject(columnIndex++);

                object.setMiddleWareVersionNull(resultSet.getBoolean(
                        columnIndex++));

                if (MiddleWareVersion != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.MiddleWareVersion, MiddleWareVersion);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareRowMapper
} // end BaseMiddleWareDAOJdbcImpl
