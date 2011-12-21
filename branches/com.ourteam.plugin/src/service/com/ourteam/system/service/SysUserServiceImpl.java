package com.ourteam.system.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.ArrayUtils;

import com.ourteam.system.dao.SysUser;
import com.ourteam.system.dao.SysUserDAOQueryBean;
import com.ourteam.system.dao.SysUserRoleRelate;
import com.ourteam.system.dao.SysUserRoleRelateDAOQueryBean;
import com.ourteam.system.domain.SystemUser;
import com.ourteam.system.domain.SystemUserPassword;
import com.ourteam.system.domain.SystemUserRoleRelate;

/**
 * ϵͳ�û����� impl Generated Date 2009-09-14 17:23:29
 * 
 * @author $Auto Gen
 */
public class SysUserServiceImpl extends AbstractSysUserService {

	/**
	 * ����ϵͳ�û� impl
	 * 
	 * @param systemUser
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doCreateSysUser(
			final com.ourteam.system.domain.SystemUser systemUser)
			throws Exception {

		SysUser sysUser = systemUser.convertToSysUser();

		if (sysUserDao.checkIsUnique(sysUser) == false) {
			throw new Exception("Account [" + sysUser.getUserAccount()
					+ "] Is In Use");
		}

		sysUser.setPassword(DigestUtils.md5Hex("user"));

		sysUserDao.insertSysUser(sysUser);
	}

	/**
	 * �޸�ϵͳ�û� impl
	 * 
	 * @param systemUser
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected void doModifySysUser(
			final com.ourteam.system.domain.SystemUser systemUser)
			throws Exception {
		SysUser sysUser = systemUser.convertToSysUser();

		if (sysUserDao.checkIsUnique(sysUser) == false) {
			throw new Exception("Account [" + sysUser.getUserAccount()
					+ "] Is In Use");
		}

		sysUserDao.updateSysUser(sysUser);
	}

	@Override
	protected int doGetSysUserCount(SysUserDAOQueryBean aQueryBean)
			throws Exception {
		return sysUserDao.querySysUserCount(aQueryBean);
	}

	@Override
	protected SystemUser[] doGetSysUsers(SysUserDAOQueryBean aQueryBean)
			throws Exception {
		SysUser[] sysUsers = sysUserDao.querySysUser(aQueryBean);

		return SystemUser.toArray(sysUsers);
	}

	@Override
	protected void doChangeUserPassword(SystemUserPassword aSystemUserPassword)
			throws Exception {

		SystemUser systemUser = getSysUserByAccount(aSystemUserPassword
				.getAccount());

		if (systemUser == null) {
			throw new Exception("Account [" + aSystemUserPassword.getAccount()
					+ "] Not Found");
		}

		String password = DigestUtils.md5Hex(aSystemUserPassword.getPassword());

		SysUser sysUser = sysUserDao.findSysUserById(systemUser.getId());

		sysUser.setPassword(password);

		sysUserDao.updateSysUser(sysUser);

	}

	@Override
	protected SystemUser doGetSysUserByAccount(String aAccount)
			throws Exception {

		SysUserDAOQueryBean queryBean = new SysUserDAOQueryBean();

		queryBean.createCriteria().andUserAccountEqualTo(aAccount);

		SysUser[] sysUsers = sysUserDao.querySysUser(queryBean);

		if (ArrayUtils.isEmpty(sysUsers)) {
			return null;

		} else {
			return new SystemUser(sysUsers[0]);
		}

	}

	@Override
	protected SystemUser doGetSysUserById(long aSystemUserId) throws Exception {
		SysUser sysUser = sysUserDao.findSysUserById(aSystemUserId);
		if (sysUser == null) {
			return null;
		} else {
			return new SystemUser(sysUser);
		}

	}

	@Override
	protected SystemUserPassword doGetSysUserPassword(String aAccount)
			throws Exception {

		SysUserDAOQueryBean queryBean = new SysUserDAOQueryBean();

		queryBean.createCriteria().andUserAccountEqualTo(aAccount);

		SystemUser systemUser = getSysUserByAccount(aAccount);

		if (systemUser == null) {
			return null;
		} else {
			SystemUserPassword userPassword = new SystemUserPassword();
			userPassword.setAccount(systemUser.getAccount());
			userPassword.setPassword(systemUser.getPassword());
			return userPassword;
		}

	}

	@Override
	protected SystemUserRoleRelate[] doGetSysUserAuthorities(long aSysUserId)
			throws Exception {

		SysUserDAOQueryBean queryBean = new SysUserDAOQueryBean();

		queryBean.createCriteria().andIdEqualTo(Long.valueOf(aSysUserId));

		SysUserRoleRelate[] userAuthorities = sysUserDao
				.querySysUserRoleRelates(queryBean);

		return SystemUserRoleRelate.toArray(userAuthorities);
	}

	@Override
	protected void doSetSysUserAuthorities(long aSysUserId,
			SystemUserRoleRelate[] aSystemUserAuthorities) throws Exception {

		if (aSystemUserAuthorities == null) {
			aSystemUserAuthorities = new SystemUserRoleRelate[0];
		}

		SysUser sysUser = sysUserDao.findSysUserById(aSysUserId);

		if (sysUser == null) {
			throw new Exception("Sys User ID [" + aSysUserId + "] Not Found");
		}

		SysUserRoleRelate[] userAuthorities = new SysUserRoleRelate[aSystemUserAuthorities.length];

		for (int i = 0; i < userAuthorities.length; i++) {
			userAuthorities[i] = aSystemUserAuthorities[i]
					.convertToSysUserRoleRelate();

		}

		SysUserRoleRelateDAOQueryBean queryBean = new SysUserRoleRelateDAOQueryBean();

		queryBean.createCriteria().andUserIdEqualTo(aSysUserId);

		sysUserRoleRelateDao.synchronizeSysUserRoleRelate(userAuthorities,
				queryBean);

	}

	@Override
	protected void doDeleteSysUsers(long[] sysUserIds) throws Exception {

		SysUserDAOQueryBean sysUserDAOQueryBean = new SysUserDAOQueryBean();

		sysUserDAOQueryBean.createCriteria().andIdIn(sysUserIds);

		this.sysUserDao.deleteSysUser(sysUserDAOQueryBean);
	}

	@Override
	protected SystemUser[] doGetSysUsersByIds(long[] sysUserId)
			throws Exception {

		SysUserDAOQueryBean sysUserDAOQueryBean = new SysUserDAOQueryBean();

		sysUserDAOQueryBean.createCriteria().andIdIn(sysUserId);

		return SystemUser.toArray(this.sysUserDao
				.querySysUser(sysUserDAOQueryBean));
	}

}
