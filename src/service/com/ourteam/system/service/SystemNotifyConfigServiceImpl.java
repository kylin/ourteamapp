/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.system.service;

import com.ourteam.system.dao.SysNotifyConfigDAOQueryBean;
import com.ourteam.system.domain.SystemNotifyConfigBean;

/**
 * ϵͳ֪ͨ���÷��� impl Generated Date 2011-11-24 15:09:14
 * 
 * @author $Auto Gen
 */
public class SystemNotifyConfigServiceImpl extends
		AbstractSystemNotifyConfigService {
	/**
	 * ȡ��ϵͳ֪ͨ���� impl
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.system.domain.SystemNotifyConfigBean[] doGetSystemNotifyConfigs()
			throws Exception {

		SysNotifyConfigDAOQueryBean queryBean = new SysNotifyConfigDAOQueryBean();

		queryBean.createCriteria().andStatusEqualTo("actived");

		return SystemNotifyConfigBean.toArray(this.sysNotifyConfigDao
				.querySysNotifyConfig(queryBean));
	} // end doGetSystemNotifyConfigs()
} // end SystemNotifyConfigServiceImpl
