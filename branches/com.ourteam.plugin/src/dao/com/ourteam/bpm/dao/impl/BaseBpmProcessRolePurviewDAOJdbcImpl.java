/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmProcessRolePurview;
import com.ourteam.bpm.dao.BpmProcessRolePurviewDAOQueryBean;
import com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-01 13:20:50
 *
 * @author kylin
 */
abstract public class BaseBpmProcessRolePurviewDAOJdbcImpl
    extends AbstractJdbcDAO implements IBpmProcessRolePurviewDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CanBreak, CanStart, ProcessDefineId, Remarks, RoleId, Status,
            RoleName, RoleCode, CanReAssign
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CanBreak, DataProperty.CanStart,
            DataProperty.ProcessDefineId, DataProperty.Remarks,
            DataProperty.RoleId, DataProperty.Status, DataProperty.RoleName,
            DataProperty.RoleCode, DataProperty.CanReAssign
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
     * Creates a new BaseBpmProcessRolePurviewDAOJdbcImpl object.
     */
    public BaseBpmProcessRolePurviewDAOJdbcImpl() {
        super();
    } // end BaseBpmProcessRolePurviewDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN BPM_ROLE bpmRoleD ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmRoleD.ID = BPM_PROCESS_ROLE_PURVIEW.ROLE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmProcessRolePurview aBpmProcessRolePurview)
        throws Exception {
        if (aBpmProcessRolePurview == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmProcessRolePurview,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     */
    public void insertBpmProcessRolePurview(
        BpmProcessRolePurview aBpmProcessRolePurview) throws Exception {
        insert(aBpmProcessRolePurview);
    } // end insertBpmProcessRolePurview()

    /**
     * Batch Insert IBpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     */
    public void batchInsertBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurview)
        throws Exception {
        batchInsert(aBpmProcessRolePurview);
    } // end batchInsertBpmProcessRolePurview()

    /**
     * Delete IBpmProcessRolePurview
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmProcessRolePurview(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmProcessRolePurview()

    /**
     * Delete IBpmProcessRolePurview
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmProcessRolePurview(
        BpmProcessRolePurviewDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmProcessRolePurview()

    /**
     * Update IBpmProcessRolePurview Selective
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     */
    public void updateBpmProcessRolePurview(
        BpmProcessRolePurview aBpmProcessRolePurview) throws Exception {
        if (aBpmProcessRolePurview.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmProcessRolePurview);

        BpmProcessRolePurview tempObj = findBpmProcessRolePurviewById(aBpmProcessRolePurview.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmProcessRolePurview, tempObj);
        } // end if
    } // end updateBpmProcessRolePurview()

    /**
     * Batch Update IBpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     */
    public void batchUpdateBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurview)
        throws Exception {
        batchUpdate(aBpmProcessRolePurview);
    } // end batchUpdateBpmProcessRolePurview()

    /**
     * Update IBpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmProcessRolePurview(
        BpmProcessRolePurview aBpmProcessRolePurview,
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmProcessRolePurview, aQueryBean);
    } // end updateBpmProcessRolePurview()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessRolePurview DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmProcessRolePurview aBpmProcessRolePurview)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessRolePurviews DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurviews,
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmProcessRolePurview(aBpmProcessRolePurviews, aQueryBean,
            null);
    } // end synchronizeBpmProcessRolePurview()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessRolePurviews DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurviews,
        BpmProcessRolePurviewDAOQueryBean aQueryBean,
        BpmProcessRolePurviewSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmProcessRolePurviews) == false) {
            inputList.addAll(Arrays.asList(aBpmProcessRolePurviews));
        } // end if

        BpmProcessRolePurview[] existentBpmProcessRolePurviews = this.queryBpmProcessRolePurview(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmProcessRolePurviews) == false) {
            existentList.addAll(Arrays.asList(existentBpmProcessRolePurviews));
        } // end if

        List willAddBpmProcessRolePurviews = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmProcessRolePurviews = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmProcessRolePurviews = ListUtils.intersection(existentList,
                inputList);

        BpmProcessRolePurview[] willUpdateBpmProcessRolePurviewArray = (BpmProcessRolePurview[]) willUpdateBpmProcessRolePurviews.toArray(new BpmProcessRolePurview[willUpdateBpmProcessRolePurviews.size()]);
        BpmProcessRolePurview[] willAddBpmProcessRolePurviewArray = (BpmProcessRolePurview[]) willAddBpmProcessRolePurviews.toArray(new BpmProcessRolePurview[willAddBpmProcessRolePurviews.size()]);
        BpmProcessRolePurview[] willDeleteBpmProcessRolePurviewArray = (BpmProcessRolePurview[]) willDeleteBpmProcessRolePurviews.toArray(new BpmProcessRolePurview[willDeleteBpmProcessRolePurviews.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmProcessRolePurviewArray,
                willUpdateBpmProcessRolePurviewArray,
                willDeleteBpmProcessRolePurviewArray);
        } // end if

        if (willUpdateBpmProcessRolePurviews.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmProcessRolePurviewArray);
            } // end if

            this.batchUpdateBpmProcessRolePurview(willUpdateBpmProcessRolePurviewArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmProcessRolePurviewArray);
            } // end if
        } // end if

        if (willAddBpmProcessRolePurviews.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmProcessRolePurviewArray);
            } // end if

            this.batchInsertBpmProcessRolePurview(willAddBpmProcessRolePurviewArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmProcessRolePurviewArray);
            } // end if
        } // end if

        if (willDeleteBpmProcessRolePurviews.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmProcessRolePurviewArray);
            } // end if

            for (int i = 0; i < willDeleteBpmProcessRolePurviewArray.length;
                    i++) {
                BpmProcessRolePurview object = willDeleteBpmProcessRolePurviewArray[i];
                this.deleteBpmProcessRolePurview(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmProcessRolePurviewArray);
            } // end if
        } // end if
    } // end synchronizeBpmProcessRolePurview()

    /**
     * Query IBpmProcessRolePurview
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmProcessRolePurview findBpmProcessRolePurviewById(final long aId)
        throws Exception {
        BpmProcessRolePurviewDAOQueryBean queryBean = new BpmProcessRolePurviewDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmProcessRolePurview[] BpmProcessRolePurviews = queryBpmProcessRolePurview(queryBean);

        if (BpmProcessRolePurviews.length == 0) {
            return null;
        } // end if
        else {
            return BpmProcessRolePurviews[0];
        } // end else
    } // end findBpmProcessRolePurviewById()

    /**
     * Query IBpmProcessRolePurview
     *
     * @param queryBean
     *
     * @return IBpmProcessRolePurview[]
     *
     * @throws Exception
     */
    public BpmProcessRolePurview[] queryBpmProcessRolePurview(
        BpmProcessRolePurviewDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmProcessRolePurviewRowMapper());

        return (BpmProcessRolePurview[]) result.toArray(new BpmProcessRolePurview[result.size()]);
    } // end queryBpmProcessRolePurview()

    /**
     * Query BpmProcessRolePurview Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmProcessRolePurviewSelective(
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmProcessRolePurviewSelective()

    /**
     * Query IBpmProcessRolePurview Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmProcessRolePurviewCount(
        BpmProcessRolePurviewDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmProcessRolePurviewCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmProcessRolePurviewRowMapper
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
            BpmProcessRolePurview object = new BpmProcessRolePurview();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CanBreak = resultSet.getObject(columnIndex++);

                object.setCanBreakNull(resultSet.getBoolean(columnIndex++));

                if (CanBreak != null) {
                    BeanUtils.setProperty(object, DataProperty.CanBreak,
                        CanBreak);
                } // end if

                Object CanStart = resultSet.getObject(columnIndex++);

                object.setCanStartNull(resultSet.getBoolean(columnIndex++));

                if (CanStart != null) {
                    BeanUtils.setProperty(object, DataProperty.CanStart,
                        CanStart);
                } // end if

                Object ProcessDefineId = resultSet.getObject(columnIndex++);

                object.setProcessDefineIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessDefineId,
                        ProcessDefineId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object RoleId = resultSet.getObject(columnIndex++);

                object.setRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (RoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleId, RoleId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object RoleName = resultSet.getObject(columnIndex++);

                object.setRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (RoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleName,
                        RoleName);
                } // end if

                Object RoleCode = resultSet.getObject(columnIndex++);

                object.setRoleCodeNull(resultSet.getBoolean(columnIndex++));

                if (RoleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleCode,
                        RoleCode);
                } // end if

                Object CanReAssign = resultSet.getObject(columnIndex++);

                object.setCanReAssignNull(resultSet.getBoolean(columnIndex++));

                if (CanReAssign != null) {
                    BeanUtils.setProperty(object, DataProperty.CanReAssign,
                        CanReAssign);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmProcessRolePurviewRowMapper
} // end BaseBpmProcessRolePurviewDAOJdbcImpl
