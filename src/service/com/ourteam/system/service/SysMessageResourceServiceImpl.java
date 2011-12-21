package com.ourteam.system.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.ourteam.system.dao.ISysMessageResourceDAO;
import com.ourteam.system.dao.SysMessageKey;
import com.ourteam.system.dao.SysMessageKeyDAOQueryBean;
import com.ourteam.system.dao.SysMessageResource;
import com.ourteam.system.dao.SysMessageResourceDAOQueryBean;
import com.ourteam.system.domain.MessageResource;

/**
 * ϵͳ��ʻ���Դ���� impl Generated Date 2009-07-10 18:10:39
 * 
 * @author $Auto Gen
 */
public class SysMessageResourceServiceImpl extends
		AbstractSysMessageResourceService {

	private transient static final Map messageCache = new HashMap();

	protected MessageResource doGetSysMessageResource(String aMessagekey,
			String aLocal) throws Exception {

		if (StringUtils.isBlank(aMessagekey)) {
			return null;
		}

		if (messageCache.containsKey(aMessagekey)) {
			return (MessageResource) messageCache.get(aMessagekey);
		}

		SysMessageResourceDAOQueryBean queryBean = new SysMessageResourceDAOQueryBean();

		queryBean.createCriteria().andMessageKeyEqualTo(aMessagekey);

		SysMessageResource[] sysMessageResources = sysMessageResourceDao
				.querySysMessageResource(queryBean);

		if (ArrayUtils.isEmpty(sysMessageResources)) {
			return null;
		}

		MessageResource messageResource = new MessageResource();

		messageResource.setId(sysMessageResources[0].getMessageKeyId());
		messageResource.setCatalog(sysMessageResources[0].getMessageCatalog());
		messageResource.setMessageKey(sysMessageResources[0].getMessageKey());

		Map messageResourceMap = new HashMap();

		for (int i = 0; i < sysMessageResources.length; i++) {
			SysMessageResource sysMessageResource = sysMessageResources[i];

			messageResourceMap.put(sysMessageResource.getLocalCode(),
					sysMessageResource.getMessageValue());
		}

		messageResource.setMessageResourceMap(messageResourceMap);

		messageCache.put(aMessagekey, messageResource);

		return messageResource;
	}

	protected void doAddSysMessageResource(MessageResource aMessageResource)
			throws Exception {

		SysMessageKey messageKey = new SysMessageKey();

		messageKey.setMessageCatalog(aMessageResource.getCatalog());
		messageKey.setMessageKey(aMessageResource.getMessageKey());

		sysMessageKeyDao.insertSysMessageKey(messageKey);

		SysMessageResource[] messageResources = new SysMessageResource[aMessageResource
				.getMessageResourceMap().size()];

		Map resourceMap = aMessageResource.getMessageResourceMap();

		int index = 0;

		for (Iterator iterator = resourceMap.keySet().iterator(); iterator
				.hasNext();) {
			String local = (String) iterator.next();
			messageResources[index] = new SysMessageResource();
			messageResources[index].setMessageKeyId(messageKey.getId());
			messageResources[index].setLocalCode(local);
			messageResources[index].setMessageValue((String) resourceMap
					.get(local));
			index++;
		}

		sysMessageResourceDao.batchInsertSysMessageResource(messageResources);

	}

	protected void doAddSysMessageResource(String aMessageKey,
			String aMessageValue, Locale aLocal) throws Exception {

		MessageResource messageResource = new MessageResource();

		messageResource.setMessageKey(aMessageKey);

		if (StringUtils.indexOf(aMessageKey, ".") != -1) {
			messageResource.setCatalog(StringUtils.substringBefore(aMessageKey,
					"."));
		}

		Map messageResourceMap = new HashMap();

		messageResourceMap.put(aLocal.toString(), aMessageValue);

		messageResource.setMessageResourceMap(messageResourceMap);

		addSysMessageResource(messageResource);

	}

	protected void doUpdateMessageResource(MessageResource aMessageResource)
			throws Exception {

		SysMessageKey key = sysMessageKeyDao
				.findSysMessageKeyById(aMessageResource.getId());

		if (key == null) {
			return;
		}

		sysMessageKeyDao.updateSysMessageKey(key);

		Map resourceMap = aMessageResource.getMessageResourceMap();

		for (Iterator iterator = resourceMap.keySet().iterator(); iterator
				.hasNext();) {
			String local = (String) iterator.next();

			SysMessageResourceDAOQueryBean resourceQueryBean = new SysMessageResourceDAOQueryBean();

			resourceQueryBean.createCriteria().andMessageKeyIdEqualTo(
					Long.valueOf(key.getId())).andLocalCodeEqualTo(local);

			SysMessageResource messageResource = new SysMessageResource();
			messageResource.setMessageKeyId(key.getId());
			messageResource.setMessageValue((String) resourceMap.get(local));
			sysMessageResourceDao.updateSysMessageResource(messageResource,
					resourceQueryBean);
		}

	}

	protected void doUpdateMessageResource(String aMessageKey,
			String aMessageValue, Locale aLocal) throws Exception {

		SysMessageKeyDAOQueryBean keyQueryBean = new SysMessageKeyDAOQueryBean();

		keyQueryBean.setDistinct(true);
		keyQueryBean.createCriteria().andMessageKeyEqualTo(aMessageKey);

		SysMessageKey[] keys = sysMessageKeyDao
				.querySysMessageKey(keyQueryBean);

		if (ArrayUtils.isEmpty(keys)) {
			addSysMessageResource(aMessageKey, aMessageValue, aLocal);
			return;
		}

		SysMessageResourceDAOQueryBean resourceQueryBean = new SysMessageResourceDAOQueryBean();

		resourceQueryBean.createCriteria().andMessageKeyIdEqualTo(
				Long.valueOf(keys[0].getId())).andLocalCodeEqualTo(
				aLocal.toString());

		SysMessageResource messageResource = new SysMessageResource();
		messageResource.setMessageKeyId(keys[0].getId());
		messageResource.setMessageValue(aMessageValue);

		sysMessageResourceDao.updateSysMessageResource(messageResource,
				resourceQueryBean);

		messageCache.remove(aMessageKey);

		getSysMessageResource(aMessageKey, aLocal.toString());

	}

	protected void doDeleteMessageResource(String aMessageKey) throws Exception {
		SysMessageKeyDAOQueryBean queryBean = new SysMessageKeyDAOQueryBean();

		queryBean.createCriteria().andMessageKeyEqualTo(aMessageKey);

		sysMessageKeyDao.deleteSysMessageResource(queryBean);

		sysMessageKeyDao.deleteSysMessageKey(queryBean);

		messageCache.remove(aMessageKey);
	}

	@Override
	protected void doInitSysMessageResourceCache() throws Exception {

		SysMessageResourceDAOQueryBean queryBean = new SysMessageResourceDAOQueryBean();
		
		queryBean.setSortProperty(ISysMessageResourceDAO.MessageKey);

		SysMessageResource[] sysMessageResources = sysMessageResourceDao
				.querySysMessageResource(queryBean);
		
		for (int i = 0; i < sysMessageResources.length; i++) {
			
			SysMessageResource sysMessageResource = sysMessageResources[i];
			
			if(StringUtils.isBlank(sysMessageResource.getMessageKey())){
				continue;
			}
			
			if(messageCache.containsKey(sysMessageResource.getMessageKey())){
				
				Map  messageResourceMap = (Map)messageCache.get(sysMessageResource.getMessageKey());
				
				messageResourceMap.put(sysMessageResource.getLocalCode(),
						sysMessageResource.getMessageValue());
			}
			else{
				MessageResource messageResource = new MessageResource();

				messageResource.setId(sysMessageResource.getMessageKeyId());
				messageResource.setCatalog(sysMessageResource.getMessageCatalog());
				messageResource.setMessageKey(sysMessageResource.getMessageKey());
				
				Map messageResourceMap = new HashMap();
				
				messageResourceMap.put(sysMessageResource.getLocalCode(),
						sysMessageResource.getMessageValue());
				
				messageResource.setMessageResourceMap(messageResourceMap);
				
				messageCache.put(sysMessageResource.getMessageKey(), messageResource);
			}
			
			
		}

	}

}
