package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
*  ϵͳ���ʻ���Դ����
*  Generated Date 2010-07-21 16:17:37   
*  @author Auto Gen
*/
abstract class AbstractSysMessageResourceService extends  net.service.DefaultServiceImpl  implements ISysMessageResourceService {

	protected static final Log logger = LogFactory.getLog(AbstractSysMessageResourceService.class);
	
			
	/**
	 *  SysMessageKey DAO Instance
	*/
	protected com.ourteam.system.dao.ISysMessageKeyDAO sysMessageKeyDao;
				
	/**
	 *  SysMessageResource DAO Instance
	*/
	protected com.ourteam.system.dao.ISysMessageResourceDAO sysMessageResourceDao;
			
			
	/**
	 *  Get SysMessageKey DAO Instance
	*/
	public com.ourteam.system.dao.ISysMessageKeyDAO getSysMessageKeyDao(){
		return sysMessageKeyDao;
	}
	
	/**
	 *  Set SysMessageKey DAO Instance
	*/
	public void setSysMessageKeyDao(com.ourteam.system.dao.ISysMessageKeyDAO aDao){
		sysMessageKeyDao = aDao;
	}
	
				
	/**
	 *  Get SysMessageResource DAO Instance
	*/
	public com.ourteam.system.dao.ISysMessageResourceDAO getSysMessageResourceDao(){
		return sysMessageResourceDao;
	}
	
	/**
	 *  Set SysMessageResource DAO Instance
	*/
	public void setSysMessageResourceDao(com.ourteam.system.dao.ISysMessageResourceDAO aDao){
		sysMessageResourceDao = aDao;
	}
	
		
		
	/**
	 * ȡ�ù��ʻ���Դ
	 	 
	 * @param aMessagekey
	 	 
	 * @param aLocal
	 
	 * @throws Exception
	 */
	protected abstract  com.ourteam.system.domain.MessageResource  doGetSysMessageResource(   String  aMessagekey,   String  aLocal) throws Exception;
	
	/**
	 * ȡ�ù��ʻ���Դ
	 	 
	 * @param aMessagekey
	 	 
	 * @param aLocal
	 	 
	 * @throws Exception
	 */
	public  com.ourteam.system.domain.MessageResource  getSysMessageResource(   String  aMessagekey,   String  aLocal) throws Exception{
			
		try {
						
						
									
									
						
									
													
						 com.ourteam.system.domain.MessageResource  result = doGetSysMessageResource( aMessagekey, aLocal);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getSysMessageResource error", e);
			throw e;
		}		
	}
		
	/**
	 * ���ϵͳ���ʻ���Դ
	 	 
	 * @param aMessageResource
	 
	 * @throws Exception
	 */
	protected abstract  void  doAddSysMessageResource(  final   com.ourteam.system.domain.MessageResource  aMessageResource) throws Exception;
	
	/**
	 * ���ϵͳ���ʻ���Դ
	 	 
	 * @param aMessageResource
	 	 
	 * @throws Exception
	 */
	public  void  addSysMessageResource(  final   com.ourteam.system.domain.MessageResource  aMessageResource) throws Exception{
			
		try {
						
						
						
			if(aMessageResource == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageResource] Value is NULL");
			
			}
									
													
						
			doAddSysMessageResource( aMessageResource);
			
									
		} catch (Exception e) {
				
			logger.error("do addSysMessageResource error", e);
			throw e;
		}		
	}
		
	/**
	 * �����Դ
	 	 
	 * @param aMessageKey
	 	 
	 * @param aMessageValue
	 	 
	 * @param aLocal
	 
	 * @throws Exception
	 */
	protected abstract  void  doAddSysMessageResource(  final   String  aMessageKey,  final   String  aMessageValue,  final   java.util.Locale  aLocal) throws Exception;
	
	/**
	 * �����Դ
	 	 
	 * @param aMessageKey
	 	 
	 * @param aMessageValue
	 	 
	 * @param aLocal
	 	 
	 * @throws Exception
	 */
	public  void  addSysMessageResource(  final   String  aMessageKey,  final   String  aMessageValue,  final   java.util.Locale  aLocal) throws Exception{
			
		try {
						
						
						
			if(aMessageKey == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageKey] Value is NULL");
			
			}
									
									
						
						
			if(aMessageValue == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageValue] Value is NULL");
			
			}
									
									
						
						
			if(aLocal == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aLocal] Value is NULL");
			
			}
									
													
						
			doAddSysMessageResource( aMessageKey, aMessageValue, aLocal);
			
									
		} catch (Exception e) {
				
			logger.error("do addSysMessageResource error", e);
			throw e;
		}		
	}
		
	/**
	 * ������Դ
	 	 
	 * @param aMessageResource
	 
	 * @throws Exception
	 */
	protected abstract  void  doUpdateMessageResource(  final   com.ourteam.system.domain.MessageResource  aMessageResource) throws Exception;
	
	/**
	 * ������Դ
	 	 
	 * @param aMessageResource
	 	 
	 * @throws Exception
	 */
	public  void  updateMessageResource(  final   com.ourteam.system.domain.MessageResource  aMessageResource) throws Exception{
			
		try {
						
						
						
			if(aMessageResource == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageResource] Value is NULL");
			
			}
									
													
						
			doUpdateMessageResource( aMessageResource);
			
									
		} catch (Exception e) {
				
			logger.error("do updateMessageResource error", e);
			throw e;
		}		
	}
		
	/**
	 * ������Դ
	 	 
	 * @param aMessageKey
	 	 
	 * @param aMessageValue
	 	 
	 * @param aLocal
	 
	 * @throws Exception
	 */
	protected abstract  void  doUpdateMessageResource(  final   String  aMessageKey,  final   String  aMessageValue,  final   java.util.Locale  aLocal) throws Exception;
	
	/**
	 * ������Դ
	 	 
	 * @param aMessageKey
	 	 
	 * @param aMessageValue
	 	 
	 * @param aLocal
	 	 
	 * @throws Exception
	 */
	public  void  updateMessageResource(  final   String  aMessageKey,  final   String  aMessageValue,  final   java.util.Locale  aLocal) throws Exception{
			
		try {
						
						
						
			if(aMessageKey == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageKey] Value is NULL");
			
			}
									
									
						
						
			if(aMessageValue == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageValue] Value is NULL");
			
			}
									
									
						
						
			if(aLocal == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aLocal] Value is NULL");
			
			}
									
													
						
			doUpdateMessageResource( aMessageKey, aMessageValue, aLocal);
			
									
		} catch (Exception e) {
				
			logger.error("do updateMessageResource error", e);
			throw e;
		}		
	}
		
	/**
	 * ɾ�����ʻ���Դ
	 	 
	 * @param aMessageKey
	 
	 * @throws Exception
	 */
	protected abstract  void  doDeleteMessageResource(  final   String  aMessageKey) throws Exception;
	
	/**
	 * ɾ�����ʻ���Դ
	 	 
	 * @param aMessageKey
	 	 
	 * @throws Exception
	 */
	public  void  deleteMessageResource(  final   String  aMessageKey) throws Exception{
			
		try {
						
						
						
			if(aMessageKey == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aMessageKey] Value is NULL");
			
			}
									
													
						
			doDeleteMessageResource( aMessageKey);
			
									
		} catch (Exception e) {
				
			logger.error("do deleteMessageResource error", e);
			throw e;
		}		
	}
		
	/**
	 * ��ʼ��ϵͳ��Դ����
	 
	 * @throws Exception
	 */
	protected abstract  void  doInitSysMessageResourceCache() throws Exception;
	
	/**
	 * ��ʼ��ϵͳ��Դ����
	 	 
	 * @throws Exception
	 */
	public  void  initSysMessageResourceCache() throws Exception{
			
		try {
										
						
			doInitSysMessageResourceCache();
			
									
		} catch (Exception e) {
				
			logger.error("do initSysMessageResourceCache error", e);
			throw e;
		}		
	}
		
}
