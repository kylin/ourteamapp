/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.middleware.service;

import java.util.Date;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;

import com.ourteam.middleware.dao.IMiddleWareProviderDAO;
import com.ourteam.middleware.dao.IMiddleWareToolGroupDAO;
import com.ourteam.middleware.dao.IMiddleWareToolInputDAO;
import com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO;
import com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO;
import com.ourteam.middleware.dao.MiddleWare;
import com.ourteam.middleware.dao.MiddleWareDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareProvider;
import com.ourteam.middleware.dao.MiddleWareProviderDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareTool;
import com.ourteam.middleware.dao.MiddleWareToolDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareToolGroup;
import com.ourteam.middleware.dao.MiddleWareToolGroupDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareToolInput;
import com.ourteam.middleware.dao.MiddleWareToolInputDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareToolInputLog;
import com.ourteam.middleware.dao.MiddleWareToolInputLogDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareToolInputOption;
import com.ourteam.middleware.dao.MiddleWareToolInputOptionDAOQueryBean;
import com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolGroupBean;
import com.ourteam.middleware.domain.MiddleWareToolInputBean;
import com.ourteam.middleware.domain.MiddleWareToolInputLogBean;
import com.ourteam.middleware.domain.MiddleWareToolInputOptionBean;
import com.ourteam.middleware.domain.MiddleWareToolLogBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

/**
 * �м��������� impl Generated Date 2010-10-20 16:27:33
 * 
 * @author $Auto Gen
 */
public class MiddleWareServiceImpl extends AbstractMiddleWareService {
	/**
	 * ��ѯ�м�� impl
	 * 
	 * @param queryBean
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.middleware.domain.MiddleWareBean[] doQueryMiddleWare(
			final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
			throws Exception {
		MiddleWare[] middleWares = this.middleWareDao
				.queryMiddleWare(queryBean);
		return MiddleWareBean.toArray(middleWares);
	} // end doQueryMiddleWare()

	/**
	 * ��ѯ�м������ impl
	 * 
	 * @param queryBean
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected int doQueryMiddleWareCount(
			final com.ourteam.middleware.dao.MiddleWareDAOQueryBean queryBean)
			throws Exception {
		return this.middleWareDao.queryMiddleWareCount(queryBean);
	} // end doQueryMiddleWareCount()

	/**
	 * impl
	 * 
	 * @param middleWareId
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected com.ourteam.middleware.domain.MiddleWareBean doGetMiddleWareById(
			final long middleWareId) throws Exception {

		MiddleWare middleWare = this.middleWareDao
				.findMiddleWareById(middleWareId);

		if (middleWare == null) {
			return null;
		} else {
			return new MiddleWareBean(middleWare);
		}

	} // end doGetMiddleWareById()

	/**
	 * impl
	 * 
	 * @param middleWareBean
	 * 
	 * @throws Exception
	 */
	protected void doAddMiddleWare(final MiddleWareTypeEnum typeEnum,
			long groupId,
			final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
			throws Exception {

		middleWareBean.setType(typeEnum.getName());

		middleWareBean.setGroupId(groupId);

		this.middleWareDao.insertMiddleWare(middleWareBean
				.convertToMiddleWare());
	} // end doAddMiddleWare()

	/**
	 * impl
	 * 
	 * @param middleWareBean
	 * 
	 * @throws Exception
	 */
	protected void doModifyMiddleWare(
			final com.ourteam.middleware.domain.MiddleWareBean middleWareBean)
			throws Exception {
		this.middleWareDao.updateMiddleWare(middleWareBean
				.convertToMiddleWare());
	} // end doModifyMiddleWare()

	/**
	 * ɾ���м�� impl
	 * 
	 * @param middleWareIds
	 * 
	 * @throws Exception
	 */
	protected void doDeleteMiddleWare(final long[] middleWareIds)
			throws Exception {
		MiddleWareDAOQueryBean queryBean = new MiddleWareDAOQueryBean();

		queryBean.createCriteria().andIdIn(middleWareIds);

		this.middleWareDao.deleteMiddleWare(queryBean);
	} // end doDeleteMiddleWare()

	@Override
	protected void doAddMiddleWareToolGroup(long providerId,
			MiddleWareToolGroupBean middleWareToolGroup) throws Exception {

		int maxSortIndex = getMaxMiddleWareToolGroupSortIndex(providerId,
				middleWareToolGroup.getParentGroupId());

		middleWareToolGroup.setProviderId(providerId);

		middleWareToolGroup.setSortIndex(maxSortIndex + 1);

		this.middleWareToolGroupDao
				.insertMiddleWareToolGroup(middleWareToolGroup
						.convertToMiddleWareToolGroup());

	}

	@Override
	protected MiddleWareToolGroupBean[] doGetMiddleWareToolGroups(
			long providerId, long parentGroupId) throws Exception {

		MiddleWareToolGroupDAOQueryBean queryBean = new MiddleWareToolGroupDAOQueryBean();

		queryBean.createCriteria().andProviderIdEqualTo(providerId)
				.andParentGroupIdEqualTo(parentGroupId);

		queryBean.setSortProperty(IMiddleWareToolGroupDAO.SortIndex);

		return MiddleWareToolGroupBean.toArray(this.middleWareToolGroupDao
				.queryMiddleWareToolGroup(queryBean));
	}

	@Override
	protected void doModifyMiddleWareToolGroup(
			MiddleWareToolGroupBean middleWareToolGroup) throws Exception {

		this.middleWareToolGroupDao
				.updateMiddleWareToolGroup(middleWareToolGroup
						.convertToMiddleWareToolGroup());

	}

	@Override
	protected void doDeleteMiddleWareToolGroups(long[] middleWareToolGroupIds)
			throws Exception {

		MiddleWareToolGroupDAOQueryBean queryBean = new MiddleWareToolGroupDAOQueryBean();

		queryBean.createCriteria().andIdIn(middleWareToolGroupIds);

		this.middleWareToolGroupDao.deleteMiddleWareToolGroup(queryBean);

	}

	@Override
	protected MiddleWareToolGroupBean doGetMiddleWareToolGroupById(
			long middleWareGroupId) throws Exception {

		MiddleWareToolGroup middleWareToolGroup = this.middleWareToolGroupDao
				.findMiddleWareToolGroupById(middleWareGroupId);

		return middleWareToolGroup != null ? new MiddleWareToolGroupBean(
				middleWareToolGroup) : null;
	}

	@Override
	protected int doGetMaxMiddleWareToolGroupSortIndex(long providerId,
			long parentGroupId) throws Exception {

		MiddleWareToolGroupDAOQueryBean queryBean = new MiddleWareToolGroupDAOQueryBean();

		queryBean.createCriteria().andProviderIdEqualTo(providerId)
				.andParentGroupIdEqualTo(parentGroupId);

		queryBean.addMaxFunctionProperty(IMiddleWareToolGroupDAO.SortIndex,
				"maxSortIndex");

		Map<String, Object>[] results = this.middleWareToolGroupDao
				.queryMiddleWareToolGroupSelective(queryBean);

		return ArrayUtils.isNotEmpty(results) ? MapUtils.getIntValue(
				results[0], "maxSortIndex") : 0;
	}

	@Override
	protected MiddleWareProviderBean[] doGetMiddleWareProviders(
			MiddleWareTypeEnum middleWareType) throws Exception {

		MiddleWareProviderDAOQueryBean queryBean = new MiddleWareProviderDAOQueryBean();

		queryBean.createCriteria().andMiddleWareTypeEqualTo(
				middleWareType.getName());

		queryBean.setSortProperty(IMiddleWareProviderDAO.ProviderName);
		queryBean.setSortProperty(IMiddleWareProviderDAO.MiddleWareName);
		queryBean.setSortProperty(IMiddleWareProviderDAO.MiddleWareVersion);

		return MiddleWareProviderBean.toArray(this.middleWareProviderDao
				.queryMiddleWareProvider(queryBean));
	}

	@Override
	protected void doAddMiddleWareProvider(MiddleWareTypeEnum middleWareType,
			MiddleWareProviderBean middleWareProvider) throws Exception {

		middleWareProvider.setMiddleWareType(middleWareType.getName());

		this.middleWareProviderDao.insertMiddleWareProvider(middleWareProvider
				.convertToMiddleWareProvider());

	}

	@Override
	protected void doModifyMiddleWareProvider(
			MiddleWareProviderBean middleWareProvider) throws Exception {

		this.middleWareProviderDao.updateMiddleWareProvider(middleWareProvider
				.convertToMiddleWareProvider());

	}

	@Override
	protected void doDeleteMiddleWareProviders(long[] middleWareProviderIds)
			throws Exception {

		MiddleWareProviderDAOQueryBean queryBean = new MiddleWareProviderDAOQueryBean();

		queryBean.createCriteria().andIdIn(middleWareProviderIds);

		this.middleWareProviderDao.deleteMiddleWareProvider(queryBean);

	}

	@Override
	protected MiddleWareProviderBean doGetMiddleWareProviderById(
			long middleWareProviderId) throws Exception {

		MiddleWareProvider middleWareProvider = this.middleWareProviderDao
				.findMiddleWareProviderById(middleWareProviderId);

		return middleWareProvider != null ? new MiddleWareProviderBean(
				middleWareProvider) : null;
	}

	@Override
	protected void doAddMiddleWareTool(long toolGroupId,
			MiddleWareToolBean middleWareTool) throws Exception {

		middleWareTool.setToolGroupId(toolGroupId);

		middleWareTool.setLastEditTime(new Date());

		this.middleWareToolDao.insertMiddleWareTool(middleWareTool
				.convertToMiddleWareTool());

	}

	@Override
	protected void doModifyMiddleWareTool(MiddleWareToolBean middleWareTool)
			throws Exception {

		middleWareTool.setLastEditTime(new Date());

		this.middleWareToolDao.updateMiddleWareTool(middleWareTool
				.convertToMiddleWareTool());

	}

	@Override
	protected void doDeleteMiddleWareTools(long[] middleWareToolIds)
			throws Exception {

		MiddleWareToolDAOQueryBean queryBean = new MiddleWareToolDAOQueryBean();

		queryBean.createCriteria().andIdIn(middleWareToolIds);

		this.middleWareToolDao.deleteMiddleWareTool(queryBean);

		this.middleWareToolDao.deleteMiddleWareToolInput(queryBean);

		MiddleWareToolInputDAOQueryBean tooInputQueryBean = new MiddleWareToolInputDAOQueryBean();

		tooInputQueryBean.createCriteria().andToolIdIn(middleWareToolIds);

		this.middleWareToolInputDao
				.deleteMiddleWareToolInputOption(tooInputQueryBean);

	}

	@Override
	protected MiddleWareToolBean doGetMiddleWareToolById(long middleWareToolId)
			throws Exception {

		MiddleWareTool middleWareTool = this.middleWareToolDao
				.findMiddleWareToolById(middleWareToolId);

		return middleWareTool != null ? new MiddleWareToolBean(middleWareTool)
				: null;
	}

	@Override
	protected MiddleWareToolBean[] doGetMiddleWareTools(long toolGroupId)
			throws Exception {

		MiddleWareToolDAOQueryBean queryBean = new MiddleWareToolDAOQueryBean();

		queryBean.createCriteria().andToolGroupIdEqualTo(toolGroupId);

		return MiddleWareToolBean.toArray(this.middleWareToolDao
				.queryMiddleWareTool(queryBean));
	}

	@Override
	protected void doAddMiddleWareToolInput(long middleWareToolId,
			MiddleWareToolInputBean middleWareToolInput) throws Exception {

		middleWareToolInput.setToolId(middleWareToolId);

		int sortIndex = getMaxMiddleWareToolInputSortIndex(middleWareToolId);

		middleWareToolInput.setSortIndex(sortIndex + 1);

		this.middleWareToolInputDao
				.insertMiddleWareToolInput(middleWareToolInput
						.convertToMiddleWareToolInput());

	}

	@Override
	protected void doModifyMiddleWareToolInput(
			MiddleWareToolInputBean middleWareToolInput) throws Exception {

		this.middleWareToolInputDao
				.updateMiddleWareToolInput(middleWareToolInput
						.convertToMiddleWareToolInput());

	}

	@Override
	protected void doDeleteMiddleWareToolInputs(long[] middleWareToolInputIds)
			throws Exception {

		MiddleWareToolInputDAOQueryBean queryBean = new MiddleWareToolInputDAOQueryBean();

		queryBean.createCriteria().andIdIn(middleWareToolInputIds);

		this.middleWareToolInputDao.deleteMiddleWareToolInput(queryBean);

		MiddleWareToolInputOptionDAOQueryBean inputOptionQueryBean = new MiddleWareToolInputOptionDAOQueryBean();

		inputOptionQueryBean.createCriteria().andToolInputIdIn(
				middleWareToolInputIds);

		this.middleWareToolInputOptionDao
				.deleteMiddleWareToolInputOption(inputOptionQueryBean);

	}

	@Override
	protected MiddleWareToolInputBean[] doGetMiddleWareToolInputs(
			long middleWareToolId) throws Exception {

		MiddleWareToolInputDAOQueryBean queryBean = new MiddleWareToolInputDAOQueryBean();

		queryBean.createCriteria().andToolIdEqualTo(middleWareToolId);

		queryBean.setSortProperty(IMiddleWareToolInputDAO.SortIndex);

		return MiddleWareToolInputBean.toArray(this.middleWareToolInputDao
				.queryMiddleWareToolInput(queryBean));
	}

	@Override
	protected MiddleWareToolInputBean doGetMiddleWareToolInputById(
			long middleWareToolInputId) throws Exception {

		MiddleWareToolInput middleWareToolInput = this.middleWareToolInputDao
				.findMiddleWareToolInputById(middleWareToolInputId);

		return middleWareToolInput != null ? new MiddleWareToolInputBean(
				middleWareToolInput) : null;
	}

	@Override
	protected int doGetMaxMiddleWareToolInputSortIndex(long middleWareToolId)
			throws Exception {

		MiddleWareToolInputDAOQueryBean queryBean = new MiddleWareToolInputDAOQueryBean();

		queryBean.createCriteria().andToolIdEqualTo(middleWareToolId);

		queryBean.addMaxFunctionProperty(IMiddleWareToolInputDAO.SortIndex,
				"maxSortIndex");

		Map<String, Object>[] results = this.middleWareToolInputDao
				.queryMiddleWareToolInputSelective(queryBean);

		return ArrayUtils.isNotEmpty(results) ? MapUtils.getIntValue(
				results[0], "maxSortIndex") : 0;
	}

	@Override
	protected void doSetMiddleWareToolInputOptions(long toolInputId,
			MiddleWareToolInputOptionBean[] inputOptions) throws Exception {

		MiddleWareToolInputOption[] toolInputOptions = new MiddleWareToolInputOption[inputOptions.length];

		for (int i = 0; i < inputOptions.length; i++) {
			MiddleWareToolInputOptionBean middleWareToolInputOptionBean = inputOptions[i];
			middleWareToolInputOptionBean.setSortIndex(i + 1);
			middleWareToolInputOptionBean.setToolInputId(toolInputId);
			toolInputOptions[i] = middleWareToolInputOptionBean
					.convertToMiddleWareToolInputOption();
		}

		MiddleWareToolInputOptionDAOQueryBean queryBean = new MiddleWareToolInputOptionDAOQueryBean();

		queryBean.createCriteria().andToolInputIdEqualTo(toolInputId);

		this.middleWareToolInputOptionDao.synchronizeMiddleWareToolInputOption(
				toolInputOptions, queryBean);
	}

	@Override
	protected MiddleWareToolInputOptionBean[] doGetMiddleWareToolInputOptions(
			long toolInputId) throws Exception {

		MiddleWareToolInputOptionDAOQueryBean queryBean = new MiddleWareToolInputOptionDAOQueryBean();

		queryBean.createCriteria().andToolInputIdEqualTo(toolInputId);

		queryBean.setSortProperty(IMiddleWareToolInputOptionDAO.SortIndex);

		return MiddleWareToolInputOptionBean
				.toArray(this.middleWareToolInputOptionDao
						.queryMiddleWareToolInputOption(queryBean));
	}

	@Override
	protected void doAddMiddleWareToolExecuteLog(
			MiddleWareToolLogBean middleWareToolLog,
			MiddleWareToolInputLogBean[] middleWareToolInputLogs)
			throws Exception {

		this.middleWareToolLogDao.insertMiddleWareToolLog(middleWareToolLog
				.convertToMiddleWareToolLog());

		MiddleWareToolInputLog[] inputLogs = new MiddleWareToolInputLog[middleWareToolInputLogs.length];

		for (int i = 0; i < inputLogs.length; i++) {
			middleWareToolInputLogs[i].setToolLogId(middleWareToolLog.getId());
			inputLogs[i] = middleWareToolInputLogs[i]
					.convertToMiddleWareToolInputLog();
		}

		this.middleWareToolInputLogDao
				.batchInsertMiddleWareToolInputLog(inputLogs);

	}

	@Override
	protected MiddleWareToolLogBean[] doQueryMiddleWareToolExecuteLogs(
			MiddleWareToolLogDAOQueryBean queryBean) throws Exception {
		return MiddleWareToolLogBean.toArray(this.middleWareToolLogDao
				.queryMiddleWareToolLog(queryBean));
	}

	@Override
	protected int doQueryMiddleWareToolExecuteLogCount(
			MiddleWareToolLogDAOQueryBean queryBean) throws Exception {
		return this.middleWareToolLogDao.queryMiddleWareToolLogCount(queryBean);
	}

	@Override
	protected MiddleWareToolInputLogBean[] doGetMiddleWareToolInputLogs(
			long middleWareToolLogId) throws Exception {

		MiddleWareToolInputLogDAOQueryBean daoQueryBean = new MiddleWareToolInputLogDAOQueryBean();

		daoQueryBean.createCriteria().andToolLogIdEqualTo(middleWareToolLogId);

		daoQueryBean.setSortProperty(IMiddleWareToolInputLogDAO.SortIndex);

		return MiddleWareToolInputLogBean
				.toArray(this.middleWareToolInputLogDao
						.queryMiddleWareToolInputLog(daoQueryBean));
	}

} // end MiddleWareServiceImpl
