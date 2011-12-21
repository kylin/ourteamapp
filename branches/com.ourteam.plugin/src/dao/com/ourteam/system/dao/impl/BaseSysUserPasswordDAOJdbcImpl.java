/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysUserPasswordDAO;
import com.ourteam.system.dao.SysUserPassword;
import com.ourteam.system.dao.SysUserPasswordDAOQueryBean;

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
 * 系统用户密码 DAO JDBC Impl Generate Date : 2011-06-10 22:45:11
 *
 * @author Kylin
 */
abstract public class BaseSysUserPasswordDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysUserPasswordDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            UserName, Enabled, Password
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.UserName, DataProperty.Enabled, DataProperty.Password
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { UserName };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {  };

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
     * Creates a new BaseSysUserPasswordDAOJdbcImpl object.
     */
    public BaseSysUserPasswordDAOJdbcImpl() {
        super();
    } // end BaseSysUserPasswordDAOJdbcImpl()

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
     * Check Unique SysUserPassword
     *
     * @param aSysUserPassword
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysUserPassword aSysUserPassword)
        throws Exception {
        if (aSysUserPassword == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysUserPassword,
                DataProperty.UserName));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     */
    public void insertSysUserPassword(SysUserPassword aSysUserPassword)
        throws Exception {
        insert(aSysUserPassword);
    } // end insertSysUserPassword()

    /**
     * Batch Insert ISysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     */
    public void batchInsertSysUserPassword(SysUserPassword[] aSysUserPassword)
        throws Exception {
        batchInsert(aSysUserPassword);
    } // end batchInsertSysUserPassword()

    /**
     * Delete ISysUserPassword
     *
     * @param aUserName String aUserName
     *
     * @throws Exception
     */
    public void deleteSysUserPassword(final String aUserName)
        throws Exception {
        deleteById(new Object[] { aUserName });
    } // end deleteSysUserPassword()

    /**
     * Delete ISysUserPassword
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysUserPassword(SysUserPasswordDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysUserPassword()

    /**
     * Update ISysUserPassword Selective
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     */
    public void updateSysUserPassword(SysUserPassword aSysUserPassword)
        throws Exception {
        if (aSysUserPassword.getUserName() == null) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysUserPassword);

        SysUserPassword tempObj = findSysUserPasswordById(aSysUserPassword.getUserName());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysUserPassword, tempObj);
        } // end if
    } // end updateSysUserPassword()

    /**
     * Batch Update ISysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     */
    public void batchUpdateSysUserPassword(SysUserPassword[] aSysUserPassword)
        throws Exception {
        batchUpdate(aSysUserPassword);
    } // end batchUpdateSysUserPassword()

    /**
     * Update ISysUserPassword
     *
     * @param aSysUserPassword
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysUserPassword(SysUserPassword aSysUserPassword,
        SysUserPasswordDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysUserPassword, aQueryBean);
    } // end updateSysUserPassword()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserPassword DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysUserPassword aSysUserPassword)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserPasswords DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysUserPassword(
        SysUserPassword[] aSysUserPasswords,
        SysUserPasswordDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysUserPassword(aSysUserPasswords, aQueryBean, null);
    } // end synchronizeSysUserPassword()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserPasswords DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysUserPassword(
        SysUserPassword[] aSysUserPasswords,
        SysUserPasswordDAOQueryBean aQueryBean,
        SysUserPasswordSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysUserPasswords) == false) {
            inputList.addAll(Arrays.asList(aSysUserPasswords));
        } // end if

        SysUserPassword[] existentSysUserPasswords = this.querySysUserPassword(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysUserPasswords) == false) {
            existentList.addAll(Arrays.asList(existentSysUserPasswords));
        } // end if

        List willAddSysUserPasswords = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysUserPasswords = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysUserPasswords = ListUtils.intersection(existentList,
                inputList);

        SysUserPassword[] willUpdateSysUserPasswordArray = (SysUserPassword[]) willUpdateSysUserPasswords.toArray(new SysUserPassword[willUpdateSysUserPasswords.size()]);
        SysUserPassword[] willAddSysUserPasswordArray = (SysUserPassword[]) willAddSysUserPasswords.toArray(new SysUserPassword[willAddSysUserPasswords.size()]);
        SysUserPassword[] willDeleteSysUserPasswordArray = (SysUserPassword[]) willDeleteSysUserPasswords.toArray(new SysUserPassword[willDeleteSysUserPasswords.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysUserPasswordArray,
                willUpdateSysUserPasswordArray, willDeleteSysUserPasswordArray);
        } // end if

        if (willUpdateSysUserPasswords.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysUserPasswordArray);
            } // end if

            this.batchUpdateSysUserPassword(willUpdateSysUserPasswordArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysUserPasswordArray);
            } // end if
        } // end if

        if (willAddSysUserPasswords.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysUserPasswordArray);
            } // end if

            this.batchInsertSysUserPassword(willAddSysUserPasswordArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysUserPasswordArray);
            } // end if
        } // end if

        if (willDeleteSysUserPasswords.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysUserPasswordArray);
            } // end if

            for (int i = 0; i < willDeleteSysUserPasswordArray.length; i++) {
                SysUserPassword object = willDeleteSysUserPasswordArray[i];
                this.deleteSysUserPassword(object.getUserName());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysUserPasswordArray);
            } // end if
        } // end if
    } // end synchronizeSysUserPassword()

    /**
     * Query ISysUserPassword
     *
     * @param aUserName String aUserName
     *
     * @return
     *
     * @throws Exception
     */
    public SysUserPassword findSysUserPasswordById(final String aUserName)
        throws Exception {
        SysUserPasswordDAOQueryBean queryBean = new SysUserPasswordDAOQueryBean();

        queryBean.createCriteria().andUserNameEqualTo(aUserName);

        queryBean.setDistinct(true);

        SysUserPassword[] SysUserPasswords = querySysUserPassword(queryBean);

        if (SysUserPasswords.length == 0) {
            return null;
        } // end if
        else {
            return SysUserPasswords[0];
        } // end else
    } // end findSysUserPasswordById()

    /**
     * Query ISysUserPassword
     *
     * @param queryBean
     *
     * @return ISysUserPassword[]
     *
     * @throws Exception
     */
    public SysUserPassword[] querySysUserPassword(
        SysUserPasswordDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysUserPasswordRowMapper());

        return (SysUserPassword[]) result.toArray(new SysUserPassword[result.size()]);
    } // end querySysUserPassword()

    /**
     * Query SysUserPassword Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysUserPasswordSelective(
        SysUserPasswordDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysUserPasswordSelective()

    /**
     * Query ISysUserPassword Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysUserPasswordCount(SysUserPasswordDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysUserPasswordCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysUserPasswordRowMapper
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
            SysUserPassword object = new SysUserPassword();

            int columnIndex = 1;

            try {
                Object UserName = resultSet.getObject(columnIndex++);

                object.setUserNameNull(resultSet.getBoolean(columnIndex++));

                if (UserName != null) {
                    BeanUtils.setProperty(object, DataProperty.UserName,
                        UserName);
                } // end if

                Object Enabled = resultSet.getObject(columnIndex++);

                object.setEnabledNull(resultSet.getBoolean(columnIndex++));

                if (Enabled != null) {
                    BeanUtils.setProperty(object, DataProperty.Enabled, Enabled);
                } // end if

                Object Password = resultSet.getObject(columnIndex++);

                object.setPasswordNull(resultSet.getBoolean(columnIndex++));

                if (Password != null) {
                    BeanUtils.setProperty(object, DataProperty.Password,
                        Password);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysUserPasswordRowMapper
} // end BaseSysUserPasswordDAOJdbcImpl
