package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
*  系统资源服务
*  Generated Date 2010-07-21 16:19:12   
*  @author Auto Gen
*/
abstract class AbstractSysResourceService extends  net.service.DefaultServiceImpl  implements ISysResourceService {

	protected static final Log logger = LogFactory.getLog(AbstractSysResourceService.class);
	
			
	/**
	 *  SysDomain DAO Instance
	*/
	protected com.ourteam.system.dao.ISysDomainDAO sysDomainDao;
				
	/**
	 *  SysResource DAO Instance
	*/
	protected com.ourteam.system.dao.ISysResourceDAO sysResourceDao;
				
	/**
	 *  SysResourceProperty DAO Instance
	*/
	protected com.ourteam.system.dao.ISysResourcePropertyDAO sysResourcePropertyDao;
				
	/**
	 *  SysResourceType DAO Instance
	*/
	protected com.ourteam.system.dao.ISysResourceTypeDAO sysResourceTypeDao;
				
	/**
	 *  SysResourcePropertyOption DAO Instance
	*/
	protected com.ourteam.system.dao.ISysResourcePropertyOptionDAO sysResourcePropertyOptionDao;
				
	/**
	 *  SysMessageResourceService Instance
	*/
	protected com.ourteam.system.service.ISysMessageResourceService sysMessageResourceService;
			
			
	/**
	 *  Get SysDomain DAO Instance
	*/
	public com.ourteam.system.dao.ISysDomainDAO getSysDomainDao(){
		return sysDomainDao;
	}
	
	/**
	 *  Set SysDomain DAO Instance
	*/
	public void setSysDomainDao(com.ourteam.system.dao.ISysDomainDAO aDao){
		sysDomainDao = aDao;
	}
	
				
	/**
	 *  Get SysResource DAO Instance
	*/
	public com.ourteam.system.dao.ISysResourceDAO getSysResourceDao(){
		return sysResourceDao;
	}
	
	/**
	 *  Set SysResource DAO Instance
	*/
	public void setSysResourceDao(com.ourteam.system.dao.ISysResourceDAO aDao){
		sysResourceDao = aDao;
	}
	
				
	/**
	 *  Get SysResourceProperty DAO Instance
	*/
	public com.ourteam.system.dao.ISysResourcePropertyDAO getSysResourcePropertyDao(){
		return sysResourcePropertyDao;
	}
	
	/**
	 *  Set SysResourceProperty DAO Instance
	*/
	public void setSysResourcePropertyDao(com.ourteam.system.dao.ISysResourcePropertyDAO aDao){
		sysResourcePropertyDao = aDao;
	}
	
				
	/**
	 *  Get SysResourceType DAO Instance
	*/
	public com.ourteam.system.dao.ISysResourceTypeDAO getSysResourceTypeDao(){
		return sysResourceTypeDao;
	}
	
	/**
	 *  Set SysResourceType DAO Instance
	*/
	public void setSysResourceTypeDao(com.ourteam.system.dao.ISysResourceTypeDAO aDao){
		sysResourceTypeDao = aDao;
	}
	
				
	/**
	 *  Get SysResourcePropertyOption DAO Instance
	*/
	public com.ourteam.system.dao.ISysResourcePropertyOptionDAO getSysResourcePropertyOptionDao(){
		return sysResourcePropertyOptionDao;
	}
	
	/**
	 *  Set SysResourcePropertyOption DAO Instance
	*/
	public void setSysResourcePropertyOptionDao(com.ourteam.system.dao.ISysResourcePropertyOptionDAO aDao){
		sysResourcePropertyOptionDao = aDao;
	}
	
				
	/**
	 *  Get SysMessageResourceService Instance
	*/
	public com.ourteam.system.service.ISysMessageResourceService getSysMessageResourceService(){
		return sysMessageResourceService;
	}
	
	/**
	 *  Set SysMessageResourceService Instance
	*/
	public void setSysMessageResourceService(com.ourteam.system.service.ISysMessageResourceService aService){
		sysMessageResourceService = aService;
	}
		
		
	/**
	 * 取得系统资源
	 	 
	 * @param aDomainId
	 	 
	 * @param aParentId
	 	 
	 * @param aResourceType
	 	 
	 * @param aQueryCallback
	 
	 * @throws Exception
	 */
	protected abstract  com.ourteam.system.domain.SystemResource[]  doGetSysResources(   long  aDomainId,   long  aParentId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aResourceType,   com.ourteam.system.service.ISysResourceQueryCallback  aQueryCallback) throws Exception;
	
	/**
	 * 取得系统资源
	 	 
	 * @param aDomainId
	 	 
	 * @param aParentId
	 	 
	 * @param aResourceType
	 	 
	 * @param aQueryCallback
	 	 
	 * @throws Exception
	 */
	public  com.ourteam.system.domain.SystemResource[]  getSysResources(   long  aDomainId,   long  aParentId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aResourceType,   com.ourteam.system.service.ISysResourceQueryCallback  aQueryCallback) throws Exception{
			
		try {
						
						
									
						
									
						
						
			if(aResourceType == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aResourceType] Value is NULL");
			
			}
									
									
						
									
													
						 com.ourteam.system.domain.SystemResource[]  result = doGetSysResources( aDomainId, aParentId, aResourceType, aQueryCallback);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getSysResources error", e);
			throw e;
		}		
	}
		
	/**
	 * 取得系统资源属性
	 	 
	 * @param aSysResourceId
	 
	 * @throws Exception
	 */
	protected abstract  com.ourteam.system.dao.SysResourceProperty[]  doGetSysResourceProperties(   long  aSysResourceId) throws Exception;
	
	/**
	 * 取得系统资源属性
	 	 
	 * @param aSysResourceId
	 	 
	 * @throws Exception
	 */
	public  com.ourteam.system.dao.SysResourceProperty[]  getSysResourceProperties(   long  aSysResourceId) throws Exception{
			
		try {
						
						
													
						 com.ourteam.system.dao.SysResourceProperty[]  result = doGetSysResourceProperties( aSysResourceId);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getSysResourceProperties error", e);
			throw e;
		}		
	}
		
	/**
	 * 取得系统资源属性定义
	 	 
	 * @param aSysResourceTypeId
	 
	 * @throws Exception
	 */
	protected abstract  com.ourteam.system.dao.SysResourceType[]  doGetSysResourcePropertyDefines(  final   long  aSysResourceTypeId) throws Exception;
	
	/**
	 * 取得系统资源属性定义
	 	 
	 * @param aSysResourceTypeId
	 	 
	 * @throws Exception
	 */
	public  com.ourteam.system.dao.SysResourceType[]  getSysResourcePropertyDefines(  final   long  aSysResourceTypeId) throws Exception{
			
		try {
						
						
													
						 com.ourteam.system.dao.SysResourceType[]  result = doGetSysResourcePropertyDefines( aSysResourceTypeId);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getSysResourcePropertyDefines error", e);
			throw e;
		}		
	}
		
	/**
	 * 取得所有系统资源
	 	 
	 * @param aDomainId
	 	 
	 * @param aResourceType
	 	 
	 * @param aQueryCallback
	 
	 * @throws Exception
	 */
	protected abstract  com.ourteam.system.domain.SystemResource[]  doGetAllSysResources(   long  aDomainId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aResourceType,   com.ourteam.system.service.ISysResourceQueryCallback  aQueryCallback) throws Exception;
	
	/**
	 * 取得所有系统资源
	 	 
	 * @param aDomainId
	 	 
	 * @param aResourceType
	 	 
	 * @param aQueryCallback
	 	 
	 * @throws Exception
	 */
	public  com.ourteam.system.domain.SystemResource[]  getAllSysResources(   long  aDomainId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aResourceType,   com.ourteam.system.service.ISysResourceQueryCallback  aQueryCallback) throws Exception{
			
		try {
						
						
									
						
						
			if(aResourceType == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aResourceType] Value is NULL");
			
			}
									
									
						
									
													
						 com.ourteam.system.domain.SystemResource[]  result = doGetAllSysResources( aDomainId, aResourceType, aQueryCallback);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getAllSysResources error", e);
			throw e;
		}		
	}
		
	/**
	 * 新建系统资源
	 	 
	 * @param aSysResource
	 
	 * @throws Exception
	 */
	protected abstract  void  doCreateSysResource(  final   com.ourteam.system.domain.SystemResource  aSysResource) throws Exception;
	
	/**
	 * 新建系统资源
	 	 
	 * @param aSysResource
	 	 
	 * @throws Exception
	 */
	public  void  createSysResource(  final   com.ourteam.system.domain.SystemResource  aSysResource) throws Exception{
			
		try {
						
						
						
			if(aSysResource == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aSysResource] Value is NULL");
			
			}
									
													
						
			doCreateSysResource( aSysResource);
			
									
		} catch (Exception e) {
				
			logger.error("do createSysResource error", e);
			throw e;
		}		
	}
		
	/**
	 * 取得系统资源最大排序号
	 	 
	 * @param aDomainId
	 	 
	 * @param aParentId
	 	 
	 * @param aTypeIdEnum
	 
	 * @throws Exception
	 */
	protected abstract  int  doGetMaxSysResourceSortIndex(   long  aDomainId,   long  aParentId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aTypeIdEnum) throws Exception;
	
	/**
	 * 取得系统资源最大排序号
	 	 
	 * @param aDomainId
	 	 
	 * @param aParentId
	 	 
	 * @param aTypeIdEnum
	 	 
	 * @throws Exception
	 */
	public  int  getMaxSysResourceSortIndex(   long  aDomainId,   long  aParentId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aTypeIdEnum) throws Exception{
			
		try {
						
						
									
						
									
						
						
			if(aTypeIdEnum == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aTypeIdEnum] Value is NULL");
			
			}
									
													
						 int  result = doGetMaxSysResourceSortIndex( aDomainId, aParentId, aTypeIdEnum);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getMaxSysResourceSortIndex error", e);
			throw e;
		}		
	}
		
	/**
	 * 取得系统资源
	 	 
	 * @param aSysResourceId
	 
	 * @throws Exception
	 */
	protected abstract  com.ourteam.system.domain.SystemResource  doGetSysResourceById(   long  aSysResourceId) throws Exception;
	
	/**
	 * 取得系统资源
	 	 
	 * @param aSysResourceId
	 	 
	 * @throws Exception
	 */
	public  com.ourteam.system.domain.SystemResource  getSysResourceById(   long  aSysResourceId) throws Exception{
			
		try {
						
						
													
						 com.ourteam.system.domain.SystemResource  result = doGetSysResourceById( aSysResourceId);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getSysResourceById error", e);
			throw e;
		}		
	}
		
	/**
	 * 变更系统资源
	 	 
	 * @param aSysResource
	 
	 * @throws Exception
	 */
	protected abstract  void  doModifySysResource(  final   com.ourteam.system.domain.SystemResource  aSysResource) throws Exception;
	
	/**
	 * 变更系统资源
	 	 
	 * @param aSysResource
	 	 
	 * @throws Exception
	 */
	public  void  modifySysResource(  final   com.ourteam.system.domain.SystemResource  aSysResource) throws Exception{
			
		try {
						
						
						
			if(aSysResource == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aSysResource] Value is NULL");
			
			}
									
													
						
			doModifySysResource( aSysResource);
			
									
		} catch (Exception e) {
				
			logger.error("do modifySysResource error", e);
			throw e;
		}		
	}
		
	/**
	 * 设置资源排序
	 	 
	 * @param aSysResourceId
	 	 
	 * @param aSort
	 
	 * @throws Exception
	 */
	protected abstract  void  doSetSysResourceSortIndex(   long  aSysResourceId,   int  aSort) throws Exception;
	
	/**
	 * 设置资源排序
	 	 
	 * @param aSysResourceId
	 	 
	 * @param aSort
	 	 
	 * @throws Exception
	 */
	public  void  setSysResourceSortIndex(   long  aSysResourceId,   int  aSort) throws Exception{
			
		try {
						
						
									
						
													
						
			doSetSysResourceSortIndex( aSysResourceId, aSort);
			
									
		} catch (Exception e) {
				
			logger.error("do setSysResourceSortIndex error", e);
			throw e;
		}		
	}
		
	/**
	 * 删除系统资源
	 	 
	 * @param aSysResourceId
	 
	 * @throws Exception
	 */
	protected abstract  void  doDeleteSysResource(   long  aSysResourceId) throws Exception;
	
	/**
	 * 删除系统资源
	 	 
	 * @param aSysResourceId
	 	 
	 * @throws Exception
	 */
	public  void  deleteSysResource(   long  aSysResourceId) throws Exception{
			
		try {
						
						
													
						
			doDeleteSysResource( aSysResourceId);
			
									
		} catch (Exception e) {
				
			logger.error("do deleteSysResource error", e);
			throw e;
		}		
	}
		
	/**
	 * 取得资源总数
	 	 
	 * @param aDomainId
	 	 
	 * @param aParentId
	 	 
	 * @param aResourceType
	 	 
	 * @param aQueryCallback
	 
	 * @throws Exception
	 */
	protected abstract  int  doGetSysResourcesCount(   long  aDomainId,   long  aParentId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aResourceType,   com.ourteam.system.service.ISysResourceQueryCallback  aQueryCallback) throws Exception;
	
	/**
	 * 取得资源总数
	 	 
	 * @param aDomainId
	 	 
	 * @param aParentId
	 	 
	 * @param aResourceType
	 	 
	 * @param aQueryCallback
	 	 
	 * @throws Exception
	 */
	public  int  getSysResourcesCount(   long  aDomainId,   long  aParentId,  final   com.ourteam.system.dao.SysResourceTypeIdEnum  aResourceType,   com.ourteam.system.service.ISysResourceQueryCallback  aQueryCallback) throws Exception{
			
		try {
						
						
									
						
									
						
						
			if(aResourceType == null){
				throw new org.apache.commons.lang.NullArgumentException("The Parameter [aResourceType] Value is NULL");
			
			}
									
									
						
									
													
						 int  result = doGetSysResourcesCount( aDomainId, aParentId, aResourceType, aQueryCallback);
									
			return result;
						
		} catch (Exception e) {
				
			logger.error("do getSysResourcesCount error", e);
			throw e;
		}		
	}
		
	/**
	 * 设置系统资源国际化信息
	 	 
	 * @param aSystemResource
	 	 
	 * @param aLocale
	 
	 * @throws Exception
	 */
	protected abstract  void  doSetSysResourceTitleMessage(   com.ourteam.system.domain.SystemResource  aSystemResource,   java.util.Locale  aLocale) throws Exception;
	
	/**
	 * 设置系统资源国际化信息
	 	 
	 * @param aSystemResource
	 	 
	 * @param aLocale
	 	 
	 * @throws Exception
	 */
	public  void  setSysResourceTitleMessage(   com.ourteam.system.domain.SystemResource  aSystemResource,   java.util.Locale  aLocale) throws Exception{
			
		try {
						
						
									
									
						
									
													
						
			doSetSysResourceTitleMessage( aSystemResource, aLocale);
			
									
		} catch (Exception e) {
				
			logger.error("do setSysResourceTitleMessage error", e);
			throw e;
		}		
	}
		
}
