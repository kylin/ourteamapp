/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 流程服务接口 Generated Date 2011-12-20 22:33:26
 *
 * @author Auto Gen
 */
abstract class AbstractBPMService extends net.service.DefaultServiceImpl
    implements IBPMService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractBPMService.class);

    /** BpmProcessDefine DAO Instance */
    protected com.ourteam.bpm.dao.IBpmProcessDefineDAO bpmProcessDefineDao;

    /** BpmRole DAO Instance */
    protected com.ourteam.bpm.dao.IBpmRoleDAO bpmRoleDao;

    /** BpmEmployeeRoleRelate DAO Instance */
    protected com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO bpmEmployeeRoleRelateDao;

    /** BpmFormDefine DAO Instance */
    protected com.ourteam.bpm.dao.IBpmFormDefineDAO bpmFormDefineDao;

    /** BpmFormFieldDefine DAO Instance */
    protected com.ourteam.bpm.dao.IBpmFormFieldDefineDAO bpmFormFieldDefineDao;

    /** BpmProcessRolePurview DAO Instance */
    protected com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO bpmProcessRolePurviewDao;

    /** BpmFormFieldStatusDefine DAO Instance */
    protected com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO bpmFormFieldStatusDefineDao;

    /** BpmFormFieldListDefine DAO Instance */
    protected com.ourteam.bpm.dao.IBpmFormFieldListDefineDAO bpmFormFieldListDefineDao;

    /** BpmProcessInstance DAO Instance */
    protected com.ourteam.bpm.dao.IBpmProcessInstanceDAO bpmProcessInstanceDao;

    /** BpmDomain DAO Instance */
    protected com.ourteam.bpm.dao.IBpmDomainDAO bpmDomainDao;

    /** BpmDomainSysModuleRelate DAO Instance */
    protected com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO bpmDomainSysModuleRelateDao;

    /** BpmProcessCatalog DAO Instance */
    protected com.ourteam.bpm.dao.IBpmProcessCatalogDAO bpmProcessCatalogDao;

    /** dentityService Instance */
    protected org.activiti.engine.IdentityService dentityService;

    /** RepositoryService Instance */
    protected org.activiti.engine.RepositoryService repositoryService;

    /** RuntimeService Instance */
    protected org.activiti.engine.RuntimeService runtimeService;

    /** SystemSerialCodeService Instance */
    protected com.ourteam.system.service.ISystemSerialCodeService systemSerialCodeService;

    /** TaskService Instance */
    protected org.activiti.engine.TaskService taskService;

    /** FormService Instance */
    protected org.activiti.engine.FormService formService;

    /** BpmPublicUiConfig DAO Instance */
    protected com.ourteam.bpm.dao.IBpmPublicUiConfigDAO bpmPublicUiConfigDao;

    /** BpmTask DAO Instance */
    protected com.ourteam.bpm.dao.IBpmTaskDAO bpmTaskDao;

    /** BpmTaskRoleRelate DAO Instance */
    protected com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO bpmTaskRoleRelateDao;

    /** EmployeeService Instance */
    protected com.ourteam.hr.service.IEmployeeService employeeService;

    /** DepartmentService Instance */
    protected com.ourteam.hr.service.IDepartmentService departmentService;

    /** TeamService Instance */
    protected com.ourteam.team.service.ITeamService teamService;

    /** ProjectService Instance */
    protected com.ourteam.project.service.IProjectService projectService;

    /** ProductService Instance */
    protected com.ourteam.product.service.IProductService productService;

    /** HistoryService Instance */
    protected org.activiti.engine.HistoryService historyService;

    /** BpmProcessFormInstance DAO Instance */
    protected com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO bpmProcessFormInstanceDao;

    /** BpmProcessFormValue DAO Instance */
    protected com.ourteam.bpm.dao.IBpmProcessFormValueDAO bpmProcessFormValueDao;

    /** BpmAttachment DAO Instance */
    protected com.ourteam.bpm.dao.IBpmAttachmentDAO bpmAttachmentDao;

    /** BpmComment DAO Instance */
    protected com.ourteam.bpm.dao.IBpmCommentDAO bpmCommentDao;

    /**
     * Get BpmProcessDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmProcessDefineDAO getBpmProcessDefineDao() {
        return bpmProcessDefineDao;
    } // end getBpmProcessDefineDao()

    /**
     * Set BpmProcessDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmProcessDefineDao(
        com.ourteam.bpm.dao.IBpmProcessDefineDAO aDao) {
        bpmProcessDefineDao = aDao;
    } // end setBpmProcessDefineDao()

    /**
     * Get BpmRole DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmRoleDAO getBpmRoleDao() {
        return bpmRoleDao;
    } // end getBpmRoleDao()

    /**
     * Set BpmRole DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmRoleDao(com.ourteam.bpm.dao.IBpmRoleDAO aDao) {
        bpmRoleDao = aDao;
    } // end setBpmRoleDao()

    /**
     * Get BpmEmployeeRoleRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO getBpmEmployeeRoleRelateDao() {
        return bpmEmployeeRoleRelateDao;
    } // end getBpmEmployeeRoleRelateDao()

    /**
     * Set BpmEmployeeRoleRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmEmployeeRoleRelateDao(
        com.ourteam.bpm.dao.IBpmEmployeeRoleRelateDAO aDao) {
        bpmEmployeeRoleRelateDao = aDao;
    } // end setBpmEmployeeRoleRelateDao()

    /**
     * Get BpmFormDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmFormDefineDAO getBpmFormDefineDao() {
        return bpmFormDefineDao;
    } // end getBpmFormDefineDao()

    /**
     * Set BpmFormDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmFormDefineDao(com.ourteam.bpm.dao.IBpmFormDefineDAO aDao) {
        bpmFormDefineDao = aDao;
    } // end setBpmFormDefineDao()

    /**
     * Get BpmFormFieldDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmFormFieldDefineDAO getBpmFormFieldDefineDao() {
        return bpmFormFieldDefineDao;
    } // end getBpmFormFieldDefineDao()

    /**
     * Set BpmFormFieldDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmFormFieldDefineDao(
        com.ourteam.bpm.dao.IBpmFormFieldDefineDAO aDao) {
        bpmFormFieldDefineDao = aDao;
    } // end setBpmFormFieldDefineDao()

    /**
     * Get BpmProcessRolePurview DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO getBpmProcessRolePurviewDao() {
        return bpmProcessRolePurviewDao;
    } // end getBpmProcessRolePurviewDao()

    /**
     * Set BpmProcessRolePurview DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmProcessRolePurviewDao(
        com.ourteam.bpm.dao.IBpmProcessRolePurviewDAO aDao) {
        bpmProcessRolePurviewDao = aDao;
    } // end setBpmProcessRolePurviewDao()

    /**
     * Get BpmFormFieldStatusDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO getBpmFormFieldStatusDefineDao() {
        return bpmFormFieldStatusDefineDao;
    } // end getBpmFormFieldStatusDefineDao()

    /**
     * Set BpmFormFieldStatusDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmFormFieldStatusDefineDao(
        com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO aDao) {
        bpmFormFieldStatusDefineDao = aDao;
    } // end setBpmFormFieldStatusDefineDao()

    /**
     * Get BpmFormFieldListDefine DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmFormFieldListDefineDAO getBpmFormFieldListDefineDao() {
        return bpmFormFieldListDefineDao;
    } // end getBpmFormFieldListDefineDao()

    /**
     * Set BpmFormFieldListDefine DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmFormFieldListDefineDao(
        com.ourteam.bpm.dao.IBpmFormFieldListDefineDAO aDao) {
        bpmFormFieldListDefineDao = aDao;
    } // end setBpmFormFieldListDefineDao()

    /**
     * Get BpmProcessInstance DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmProcessInstanceDAO getBpmProcessInstanceDao() {
        return bpmProcessInstanceDao;
    } // end getBpmProcessInstanceDao()

    /**
     * Set BpmProcessInstance DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmProcessInstanceDao(
        com.ourteam.bpm.dao.IBpmProcessInstanceDAO aDao) {
        bpmProcessInstanceDao = aDao;
    } // end setBpmProcessInstanceDao()

    /**
     * Get BpmDomain DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmDomainDAO getBpmDomainDao() {
        return bpmDomainDao;
    } // end getBpmDomainDao()

    /**
     * Set BpmDomain DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmDomainDao(com.ourteam.bpm.dao.IBpmDomainDAO aDao) {
        bpmDomainDao = aDao;
    } // end setBpmDomainDao()

    /**
     * Get BpmDomainSysModuleRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO getBpmDomainSysModuleRelateDao() {
        return bpmDomainSysModuleRelateDao;
    } // end getBpmDomainSysModuleRelateDao()

    /**
     * Set BpmDomainSysModuleRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmDomainSysModuleRelateDao(
        com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO aDao) {
        bpmDomainSysModuleRelateDao = aDao;
    } // end setBpmDomainSysModuleRelateDao()

    /**
     * Get BpmProcessCatalog DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmProcessCatalogDAO getBpmProcessCatalogDao() {
        return bpmProcessCatalogDao;
    } // end getBpmProcessCatalogDao()

    /**
     * Set BpmProcessCatalog DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmProcessCatalogDao(
        com.ourteam.bpm.dao.IBpmProcessCatalogDAO aDao) {
        bpmProcessCatalogDao = aDao;
    } // end setBpmProcessCatalogDao()

    /**
     * Get dentityService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.IdentityService getdentityService() {
        return dentityService;
    } // end getdentityService()

    /**
     * Set dentityService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setdentityService(org.activiti.engine.IdentityService aService) {
        dentityService = aService;
    } // end setdentityService()

    /**
     * Get RepositoryService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.RepositoryService getRepositoryService() {
        return repositoryService;
    } // end getRepositoryService()

    /**
     * Set RepositoryService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setRepositoryService(
        org.activiti.engine.RepositoryService aService) {
        repositoryService = aService;
    } // end setRepositoryService()

    /**
     * Get RuntimeService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.RuntimeService getRuntimeService() {
        return runtimeService;
    } // end getRuntimeService()

    /**
     * Set RuntimeService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setRuntimeService(org.activiti.engine.RuntimeService aService) {
        runtimeService = aService;
    } // end setRuntimeService()

    /**
     * Get SystemSerialCodeService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.service.ISystemSerialCodeService getSystemSerialCodeService() {
        return systemSerialCodeService;
    } // end getSystemSerialCodeService()

    /**
     * Set SystemSerialCodeService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setSystemSerialCodeService(
        com.ourteam.system.service.ISystemSerialCodeService aService) {
        systemSerialCodeService = aService;
    } // end setSystemSerialCodeService()

    /**
     * Get TaskService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.TaskService getTaskService() {
        return taskService;
    } // end getTaskService()

    /**
     * Set TaskService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setTaskService(org.activiti.engine.TaskService aService) {
        taskService = aService;
    } // end setTaskService()

    /**
     * Get FormService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.FormService getFormService() {
        return formService;
    } // end getFormService()

    /**
     * Set FormService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setFormService(org.activiti.engine.FormService aService) {
        formService = aService;
    } // end setFormService()

    /**
     * Get BpmPublicUiConfig DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmPublicUiConfigDAO getBpmPublicUiConfigDao() {
        return bpmPublicUiConfigDao;
    } // end getBpmPublicUiConfigDao()

    /**
     * Set BpmPublicUiConfig DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmPublicUiConfigDao(
        com.ourteam.bpm.dao.IBpmPublicUiConfigDAO aDao) {
        bpmPublicUiConfigDao = aDao;
    } // end setBpmPublicUiConfigDao()

    /**
     * Get BpmTask DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmTaskDAO getBpmTaskDao() {
        return bpmTaskDao;
    } // end getBpmTaskDao()

    /**
     * Set BpmTask DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmTaskDao(com.ourteam.bpm.dao.IBpmTaskDAO aDao) {
        bpmTaskDao = aDao;
    } // end setBpmTaskDao()

    /**
     * Get BpmTaskRoleRelate DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO getBpmTaskRoleRelateDao() {
        return bpmTaskRoleRelateDao;
    } // end getBpmTaskRoleRelateDao()

    /**
     * Set BpmTaskRoleRelate DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmTaskRoleRelateDao(
        com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO aDao) {
        bpmTaskRoleRelateDao = aDao;
    } // end setBpmTaskRoleRelateDao()

    /**
     * Get EmployeeService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.hr.service.IEmployeeService getEmployeeService() {
        return employeeService;
    } // end getEmployeeService()

    /**
     * Set EmployeeService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setEmployeeService(
        com.ourteam.hr.service.IEmployeeService aService) {
        employeeService = aService;
    } // end setEmployeeService()

    /**
     * Get DepartmentService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.hr.service.IDepartmentService getDepartmentService() {
        return departmentService;
    } // end getDepartmentService()

    /**
     * Set DepartmentService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setDepartmentService(
        com.ourteam.hr.service.IDepartmentService aService) {
        departmentService = aService;
    } // end setDepartmentService()

    /**
     * Get TeamService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.team.service.ITeamService getTeamService() {
        return teamService;
    } // end getTeamService()

    /**
     * Set TeamService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setTeamService(com.ourteam.team.service.ITeamService aService) {
        teamService = aService;
    } // end setTeamService()

    /**
     * Get ProjectService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.project.service.IProjectService getProjectService() {
        return projectService;
    } // end getProjectService()

    /**
     * Set ProjectService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setProjectService(
        com.ourteam.project.service.IProjectService aService) {
        projectService = aService;
    } // end setProjectService()

    /**
     * Get ProductService Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.product.service.IProductService getProductService() {
        return productService;
    } // end getProductService()

    /**
     * Set ProductService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setProductService(
        com.ourteam.product.service.IProductService aService) {
        productService = aService;
    } // end setProductService()

    /**
     * Get HistoryService Instance
     *
     * @return DOCUMENT ME!
     */
    public org.activiti.engine.HistoryService getHistoryService() {
        return historyService;
    } // end getHistoryService()

    /**
     * Set HistoryService Instance
     *
     * @param aService DOCUMENT ME!
     */
    public void setHistoryService(org.activiti.engine.HistoryService aService) {
        historyService = aService;
    } // end setHistoryService()

    /**
     * Get BpmProcessFormInstance DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO getBpmProcessFormInstanceDao() {
        return bpmProcessFormInstanceDao;
    } // end getBpmProcessFormInstanceDao()

    /**
     * Set BpmProcessFormInstance DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmProcessFormInstanceDao(
        com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO aDao) {
        bpmProcessFormInstanceDao = aDao;
    } // end setBpmProcessFormInstanceDao()

    /**
     * Get BpmProcessFormValue DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmProcessFormValueDAO getBpmProcessFormValueDao() {
        return bpmProcessFormValueDao;
    } // end getBpmProcessFormValueDao()

    /**
     * Set BpmProcessFormValue DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmProcessFormValueDao(
        com.ourteam.bpm.dao.IBpmProcessFormValueDAO aDao) {
        bpmProcessFormValueDao = aDao;
    } // end setBpmProcessFormValueDao()

    /**
     * Get BpmAttachment DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmAttachmentDAO getBpmAttachmentDao() {
        return bpmAttachmentDao;
    } // end getBpmAttachmentDao()

    /**
     * Set BpmAttachment DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmAttachmentDao(com.ourteam.bpm.dao.IBpmAttachmentDAO aDao) {
        bpmAttachmentDao = aDao;
    } // end setBpmAttachmentDao()

    /**
     * Get BpmComment DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.bpm.dao.IBpmCommentDAO getBpmCommentDao() {
        return bpmCommentDao;
    } // end getBpmCommentDao()

    /**
     * Set BpmComment DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBpmCommentDao(com.ourteam.bpm.dao.IBpmCommentDAO aDao) {
        bpmCommentDao = aDao;
    } // end setBpmCommentDao()

    /**
     * 根据目录ID取得流程定义
     *
     * @param catalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessDefineBean[] doGetBpmProcessDefinesByCatalogId(
        final long catalogId) throws Exception;

    /**
     * 根据目录ID取得流程定义
     *
     * @param catalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessDefineBean[] getBpmProcessDefinesByCatalogId(
        final long catalogId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessDefineBean[] result = doGetBpmProcessDefinesByCatalogId(catalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessDefinesByCatalogId error", e);
            throw e;
        } // end catch
    } // end getBpmProcessDefinesByCatalogId()

    /**
     * 取得流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmRoleBean[] doGetBpmRolesByModuleId(
        final long bpmDomainId, final long sysModuleId)
        throws Exception;

    /**
     * 取得流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmRoleBean[] getBpmRolesByModuleId(
        final long bpmDomainId, final long sysModuleId)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmRoleBean[] result = doGetBpmRolesByModuleId(bpmDomainId,
                    sysModuleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmRolesByModuleId error", e);
            throw e;
        } // end catch
    } // end getBpmRolesByModuleId()

    /**
     * 新建流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     * @param bpmRole
     *
     * @throws Exception
     */
    protected abstract void doAddBpmRole(final long bpmDomainId,
        final long sysModuleId, final com.ourteam.bpm.domain.BpmRoleBean bpmRole)
        throws Exception;

    /**
     * 新建流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     * @param bpmRole
     *
     * @throws Exception
     */
    public void addBpmRole(final long bpmDomainId, final long sysModuleId,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole)
        throws Exception {
        try {
            if (bpmRole == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmRole] Value is NULL");
            } // end if

            doAddBpmRole(bpmDomainId, sysModuleId, bpmRole);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmRole error", e);
            throw e;
        } // end catch
    } // end addBpmRole()

    /**
     * 更新流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     * @param bpmRole
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmRole(final long bpmDomainId,
        final long sysModuleId, final com.ourteam.bpm.domain.BpmRoleBean bpmRole)
        throws Exception;

    /**
     * 更新流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     * @param bpmRole
     *
     * @throws Exception
     */
    public void modifyBpmRole(final long bpmDomainId, final long sysModuleId,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole)
        throws Exception {
        try {
            if (bpmRole == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmRole] Value is NULL");
            } // end if

            doModifyBpmRole(bpmDomainId, sysModuleId, bpmRole);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmRole error", e);
            throw e;
        } // end catch
    } // end modifyBpmRole()

    /**
     * 删除流程角色
     *
     * @param bpmRoleIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmRoles(final long[] bpmRoleIds)
        throws Exception;

    /**
     * 删除流程角色
     *
     * @param bpmRoleIds
     *
     * @throws Exception
     */
    public void deleteBpmRoles(final long[] bpmRoleIds)
        throws Exception {
        try {
            doDeleteBpmRoles(bpmRoleIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmRoles error", e);
            throw e;
        } // end catch
    } // end deleteBpmRoles()

    /**
     * 根据ID取得流程角色
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmRoleBean doGetBpmRoleById(
        final long bpmRoleId) throws Exception;

    /**
     * 根据ID取得流程角色
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmRoleBean getBpmRoleById(
        final long bpmRoleId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmRoleBean result = doGetBpmRoleById(bpmRoleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmRoleById error", e);
            throw e;
        } // end catch
    } // end getBpmRoleById()

    /**
     * 根据模块标识取得流程角色
     *
     * @param sysModuleCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmRoleBean[] doGetBpmRolesByModuleCode(
        final String sysModuleCode) throws Exception;

    /**
     * 根据模块标识取得流程角色
     *
     * @param sysModuleCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmRoleBean[] getBpmRolesByModuleCode(
        final String sysModuleCode) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmRoleBean[] result = doGetBpmRolesByModuleCode(sysModuleCode);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmRolesByModuleCode error", e);
            throw e;
        } // end catch
    } // end getBpmRolesByModuleCode()

    /**
     * 根据业务模块标识取得用户流程角色
     *
     * @param employeeId
     * @param moduleCode
     * @param businessInstanceId
     * @param businessType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] doGetEmployeeBpmRoleRelateByModuleCode(
        final long employeeId, final String moduleCode,
        final long businessInstanceId, final String businessType)
        throws Exception;

    /**
     * 根据业务模块标识取得用户流程角色
     *
     * @param employeeId
     * @param moduleCode
     * @param businessInstanceId
     * @param businessType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getEmployeeBpmRoleRelateByModuleCode(
        final long employeeId, final String moduleCode,
        final long businessInstanceId, final String businessType)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] result = doGetEmployeeBpmRoleRelateByModuleCode(employeeId,
                    moduleCode, businessInstanceId, businessType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeBpmRoleRelateByModuleCode error", e);
            throw e;
        } // end catch
    } // end getEmployeeBpmRoleRelateByModuleCode()

    /**
     * 设置用户流程角色
     *
     * @param employeeId
     * @param moduleId
     * @param businessInstanceId
     * @param businessType
     * @param employeeRoleRelates
     *
     * @throws Exception
     */
    protected abstract void doSetEmployeeBpmRoleRelate(final long employeeId,
        final long moduleId, final long businessInstanceId,
        final String businessType,
        final com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] employeeRoleRelates)
        throws Exception;

    /**
     * 设置用户流程角色
     *
     * @param employeeId
     * @param moduleId
     * @param businessInstanceId
     * @param businessType
     * @param employeeRoleRelates
     *
     * @throws Exception
     */
    public void setEmployeeBpmRoleRelate(final long employeeId,
        final long moduleId, final long businessInstanceId,
        final String businessType,
        final com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] employeeRoleRelates)
        throws Exception {
        try {
            if (businessType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessType] Value is NULL");
            } // end if

            doSetEmployeeBpmRoleRelate(employeeId, moduleId,
                businessInstanceId, businessType, employeeRoleRelates);
        } // end try
        catch (Exception e) {
            logger.error("do setEmployeeBpmRoleRelate error", e);
            throw e;
        } // end catch
    } // end setEmployeeBpmRoleRelate()

    /**
     * 根据角色取得用户流程角色
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] doGetEmployeeBpmRoleRelateByRoleId(
        final long bpmRoleId) throws Exception;

    /**
     * 根据角色取得用户流程角色
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getEmployeeBpmRoleRelateByRoleId(
        final long bpmRoleId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] result = doGetEmployeeBpmRoleRelateByRoleId(bpmRoleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeBpmRoleRelateByRoleId error", e);
            throw e;
        } // end catch
    } // end getEmployeeBpmRoleRelateByRoleId()

    /**
     * 添加流程角色用户关联
     *
     * @param businessInstanceId
     * @param businessType
     * @param bpmRole
     * @param employeeIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] doAddBpmRoleEmployeeRelates(
        final long businessInstanceId, final String businessType,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole,
        final long[] employeeIds) throws Exception;

    /**
     * 添加流程角色用户关联
     *
     * @param businessInstanceId
     * @param businessType
     * @param bpmRole
     * @param employeeIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] addBpmRoleEmployeeRelates(
        final long businessInstanceId, final String businessType,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole,
        final long[] employeeIds) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] result = doAddBpmRoleEmployeeRelates(businessInstanceId,
                    businessType, bpmRole, employeeIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do addBpmRoleEmployeeRelates error", e);
            throw e;
        } // end catch
    } // end addBpmRoleEmployeeRelates()

    /**
     * 取得流程角色用户关联
     *
     * @param bpmRoleId
     * @param businessInstanceId
     * @param businessType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] doGetBpmRoleEmployeeRelates(
        final long bpmRoleId, final long businessInstanceId,
        final String businessType) throws Exception;

    /**
     * 取得流程角色用户关联
     *
     * @param bpmRoleId
     * @param businessInstanceId
     * @param businessType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getBpmRoleEmployeeRelates(
        final long bpmRoleId, final long businessInstanceId,
        final String businessType) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] result = doGetBpmRoleEmployeeRelates(bpmRoleId,
                    businessInstanceId, businessType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmRoleEmployeeRelates error", e);
            throw e;
        } // end catch
    } // end getBpmRoleEmployeeRelates()

    /**
     * 删除流程角色用户关联
     *
     * @param bpmRoleEmployeeRelateIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmRoleEmployeeRelates(
        final long[] bpmRoleEmployeeRelateIds) throws Exception;

    /**
     * 删除流程角色用户关联
     *
     * @param bpmRoleEmployeeRelateIds
     *
     * @throws Exception
     */
    public void deleteBpmRoleEmployeeRelates(
        final long[] bpmRoleEmployeeRelateIds) throws Exception {
        try {
            doDeleteBpmRoleEmployeeRelates(bpmRoleEmployeeRelateIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmRoleEmployeeRelates error", e);
            throw e;
        } // end catch
    } // end deleteBpmRoleEmployeeRelates()

    /**
     * 新建业务流程定义
     *
     * @param catalogId
     * @param processDefine
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessDefine(final long catalogId,
        final com.ourteam.bpm.domain.BpmProcessDefineBean processDefine)
        throws Exception;

    /**
     * 新建业务流程定义
     *
     * @param catalogId
     * @param processDefine
     *
     * @throws Exception
     */
    public void addBpmProcessDefine(final long catalogId,
        final com.ourteam.bpm.domain.BpmProcessDefineBean processDefine)
        throws Exception {
        try {
            if (processDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [processDefine] Value is NULL");
            } // end if

            doAddBpmProcessDefine(catalogId, processDefine);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessDefine error", e);
            throw e;
        } // end catch
    } // end addBpmProcessDefine()

    /**
     * 根据ID取得流程定义
     *
     * @param processDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessDefineBean doGetBpmProcessById(
        final long processDefineId) throws Exception;

    /**
     * 根据ID取得流程定义
     *
     * @param processDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessDefineBean getBpmProcessById(
        final long processDefineId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessDefineBean result = doGetBpmProcessById(processDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessById error", e);
            throw e;
        } // end catch
    } // end getBpmProcessById()

    /**
     * 修改流程定义信息
     *
     * @param catalogId
     * @param processDefine
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmProcessDefine(final long catalogId,
        final com.ourteam.bpm.domain.BpmProcessDefineBean processDefine)
        throws Exception;

    /**
     * 修改流程定义信息
     *
     * @param catalogId
     * @param processDefine
     *
     * @throws Exception
     */
    public void modifyBpmProcessDefine(final long catalogId,
        final com.ourteam.bpm.domain.BpmProcessDefineBean processDefine)
        throws Exception {
        try {
            if (processDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [processDefine] Value is NULL");
            } // end if

            doModifyBpmProcessDefine(catalogId, processDefine);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmProcessDefine error", e);
            throw e;
        } // end catch
    } // end modifyBpmProcessDefine()

    /**
     * 取得流程角色权限
     *
     * @param processDefineId
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] doGetBpmProcessRolePurviews(
        final long processDefineId, final long[] roleIds)
        throws Exception;

    /**
     * 取得流程角色权限
     *
     * @param processDefineId
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] getBpmProcessRolePurviews(
        final long processDefineId, final long[] roleIds)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] result = doGetBpmProcessRolePurviews(processDefineId,
                    roleIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessRolePurviews error", e);
            throw e;
        } // end catch
    } // end getBpmProcessRolePurviews()

    /**
     * 设置流程角色权限
     *
     * @param processDefineId
     * @param processRolePurviews
     *
     * @throws Exception
     */
    protected abstract void doSetBpmProcessRolePurviews(
        final long processDefineId,
        final com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] processRolePurviews)
        throws Exception;

    /**
     * 设置流程角色权限
     *
     * @param processDefineId
     * @param processRolePurviews
     *
     * @throws Exception
     */
    public void setBpmProcessRolePurviews(final long processDefineId,
        final com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] processRolePurviews)
        throws Exception {
        try {
            doSetBpmProcessRolePurviews(processDefineId, processRolePurviews);
        } // end try
        catch (Exception e) {
            logger.error("do setBpmProcessRolePurviews error", e);
            throw e;
        } // end catch
    } // end setBpmProcessRolePurviews()

    /**
     * 删除流程定义
     *
     * @param processDefineIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmProcessDefines(
        final long[] processDefineIds) throws Exception;

    /**
     * 删除流程定义
     *
     * @param processDefineIds
     *
     * @throws Exception
     */
    public void deleteBpmProcessDefines(final long[] processDefineIds)
        throws Exception {
        try {
            doDeleteBpmProcessDefines(processDefineIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmProcessDefines error", e);
            throw e;
        } // end catch
    } // end deleteBpmProcessDefines()

    /**
     * 取得流程表单字段定义
     *
     * @param formDefineId
     * @param parentFieldId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmFormFieldDefineBean[] doGetBpmProcessFormFieldDefines(
        final long formDefineId, final long parentFieldId)
        throws Exception;

    /**
     * 取得流程表单字段定义
     *
     * @param formDefineId
     * @param parentFieldId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmFormFieldDefineBean[] getBpmProcessFormFieldDefines(
        final long formDefineId, final long parentFieldId)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmFormFieldDefineBean[] result = doGetBpmProcessFormFieldDefines(formDefineId,
                    parentFieldId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessFormFieldDefines error", e);
            throw e;
        } // end catch
    } // end getBpmProcessFormFieldDefines()

    /**
     * 新建流程字段定义
     *
     * @param formDefineId
     * @param formFieldDefine
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessFormFieldDefine(
        final long formDefineId,
        final com.ourteam.bpm.domain.BpmFormFieldDefineBean formFieldDefine)
        throws Exception;

    /**
     * 新建流程字段定义
     *
     * @param formDefineId
     * @param formFieldDefine
     *
     * @throws Exception
     */
    public void addBpmProcessFormFieldDefine(final long formDefineId,
        final com.ourteam.bpm.domain.BpmFormFieldDefineBean formFieldDefine)
        throws Exception {
        try {
            if (formFieldDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [formFieldDefine] Value is NULL");
            } // end if

            doAddBpmProcessFormFieldDefine(formDefineId, formFieldDefine);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessFormFieldDefine error", e);
            throw e;
        } // end catch
    } // end addBpmProcessFormFieldDefine()

    /**
     * 修改流程字段定义
     *
     * @param formDefineId
     * @param formFieldDefine
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmProcessFormFieldDefine(
        final long formDefineId,
        final com.ourteam.bpm.domain.BpmFormFieldDefineBean formFieldDefine)
        throws Exception;

    /**
     * 修改流程字段定义
     *
     * @param formDefineId
     * @param formFieldDefine
     *
     * @throws Exception
     */
    public void modifyBpmProcessFormFieldDefine(final long formDefineId,
        final com.ourteam.bpm.domain.BpmFormFieldDefineBean formFieldDefine)
        throws Exception {
        try {
            if (formFieldDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [formFieldDefine] Value is NULL");
            } // end if

            doModifyBpmProcessFormFieldDefine(formDefineId, formFieldDefine);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmProcessFormFieldDefine error", e);
            throw e;
        } // end catch
    } // end modifyBpmProcessFormFieldDefine()

    /**
     * 删除流程字段定义
     *
     * @param formFieldDefineIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmProcessFormFieldDefines(
        final long[] formFieldDefineIds) throws Exception;

    /**
     * 删除流程字段定义
     *
     * @param formFieldDefineIds
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormFieldDefines(
        final long[] formFieldDefineIds) throws Exception {
        try {
            doDeleteBpmProcessFormFieldDefines(formFieldDefineIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmProcessFormFieldDefines error", e);
            throw e;
        } // end catch
    } // end deleteBpmProcessFormFieldDefines()

    /**
     * 取得过程表单字段状态
     *
     * @param fieldId
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean[] doGetBpmProcessFormFieldStatus(
        final long fieldId, final long[] roleIds) throws Exception;

    /**
     * 取得过程表单字段状态
     *
     * @param fieldId
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean[] getBpmProcessFormFieldStatus(
        final long fieldId, final long[] roleIds) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean[] result = doGetBpmProcessFormFieldStatus(fieldId,
                    roleIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessFormFieldStatus error", e);
            throw e;
        } // end catch
    } // end getBpmProcessFormFieldStatus()

    /**
     * 添加流程表单字段状态
     *
     * @param stepId
     * @param roleId
     * @param fieldStatusDefine
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessFormFieldStatus(final long stepId,
        final long roleId,
        final com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean fieldStatusDefine)
        throws Exception;

    /**
     * 添加流程表单字段状态
     *
     * @param stepId
     * @param roleId
     * @param fieldStatusDefine
     *
     * @throws Exception
     */
    public void addBpmProcessFormFieldStatus(final long stepId,
        final long roleId,
        final com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean fieldStatusDefine)
        throws Exception {
        try {
            if (fieldStatusDefine == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [fieldStatusDefine] Value is NULL");
            } // end if

            doAddBpmProcessFormFieldStatus(stepId, roleId, fieldStatusDefine);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessFormFieldStatus error", e);
            throw e;
        } // end catch
    } // end addBpmProcessFormFieldStatus()

    /**
     * 删除流程表单字段状态定义
     *
     * @param stepId
     * @param fieldId
     * @param roleID
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmProcessFormFieldStatus(
        final long stepId, final long fieldId, final long roleID)
        throws Exception;

    /**
     * 删除流程表单字段状态定义
     *
     * @param stepId
     * @param fieldId
     * @param roleID
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormFieldStatus(final long stepId,
        final long fieldId, final long roleID) throws Exception {
        try {
            doDeleteBpmProcessFormFieldStatus(stepId, fieldId, roleID);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmProcessFormFieldStatus error", e);
            throw e;
        } // end catch
    } // end deleteBpmProcessFormFieldStatus()

    /**
     * 根据用户ID取得用户流程角色
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] doGetEmployeeBpmRoleRelateByEmployeeId(
        final long employeeId) throws Exception;

    /**
     * 根据用户ID取得用户流程角色
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getEmployeeBpmRoleRelateByEmployeeId(
        final long employeeId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] result = doGetEmployeeBpmRoleRelateByEmployeeId(employeeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getEmployeeBpmRoleRelateByEmployeeId error", e);
            throw e;
        } // end catch
    } // end getEmployeeBpmRoleRelateByEmployeeId()

    /**
     * 根据流程角色取得流程权限
     *
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] doGetBpmProcessRolePurviewsByRoleId(
        final long[] roleIds) throws Exception;

    /**
     * 根据流程角色取得流程权限
     *
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] getBpmProcessRolePurviewsByRoleId(
        final long[] roleIds) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] result = doGetBpmProcessRolePurviewsByRoleId(roleIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessRolePurviewsByRoleId error", e);
            throw e;
        } // end catch
    } // end getBpmProcessRolePurviewsByRoleId()

    /**
     * 新建业务域
     *
     * @param bpmDomain
     *
     * @throws Exception
     */
    protected abstract void doAddBpmDomain(
        final com.ourteam.bpm.domain.BpmDomainBean bpmDomain)
        throws Exception;

    /**
     * 新建业务域
     *
     * @param bpmDomain
     *
     * @throws Exception
     */
    public void addBpmDomain(
        final com.ourteam.bpm.domain.BpmDomainBean bpmDomain)
        throws Exception {
        try {
            if (bpmDomain == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmDomain] Value is NULL");
            } // end if

            doAddBpmDomain(bpmDomain);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmDomain error", e);
            throw e;
        } // end catch
    } // end addBpmDomain()

    /**
     * 修改流程域
     *
     * @param bpmDomain
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmDomain(
        final com.ourteam.bpm.domain.BpmDomainBean bpmDomain)
        throws Exception;

    /**
     * 修改流程域
     *
     * @param bpmDomain
     *
     * @throws Exception
     */
    public void modifyBpmDomain(
        final com.ourteam.bpm.domain.BpmDomainBean bpmDomain)
        throws Exception {
        try {
            if (bpmDomain == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmDomain] Value is NULL");
            } // end if

            doModifyBpmDomain(bpmDomain);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmDomain error", e);
            throw e;
        } // end catch
    } // end modifyBpmDomain()

    /**
     * 删除业务域
     *
     * @param bpmDomainIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmDomains(final long[] bpmDomainIds)
        throws Exception;

    /**
     * 删除业务域
     *
     * @param bpmDomainIds
     *
     * @throws Exception
     */
    public void deleteBpmDomains(final long[] bpmDomainIds)
        throws Exception {
        try {
            doDeleteBpmDomains(bpmDomainIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmDomains error", e);
            throw e;
        } // end catch
    } // end deleteBpmDomains()

    /**
     * 根据ID取得业务域
     *
     * @param bpmDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmDomainBean doGetBpmDomainById(
        final long bpmDomainId) throws Exception;

    /**
     * 根据ID取得业务域
     *
     * @param bpmDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmDomainBean getBpmDomainById(
        final long bpmDomainId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmDomainBean result = doGetBpmDomainById(bpmDomainId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmDomainById error", e);
            throw e;
        } // end catch
    } // end getBpmDomainById()

    /**
     * 取得业务域列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmDomainBean[] doGetBpmDomains()
        throws Exception;

    /**
     * 取得业务域列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmDomainBean[] getBpmDomains()
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmDomainBean[] result = doGetBpmDomains();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmDomains error", e);
            throw e;
        } // end catch
    } // end getBpmDomains()

    /**
     * 取得业务域与系统模块关联
     *
     * @param bpmDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean[] doGetBpmDomianSysModuleRelates(
        final long bpmDomainId) throws Exception;

    /**
     * 取得业务域与系统模块关联
     *
     * @param bpmDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean[] getBpmDomianSysModuleRelates(
        final long bpmDomainId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean[] result = doGetBpmDomianSysModuleRelates(bpmDomainId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmDomianSysModuleRelates error", e);
            throw e;
        } // end catch
    } // end getBpmDomianSysModuleRelates()

    /**
     * 添加业务域与系统模块关联
     *
     * @param bpmDomainId
     * @param bpmDomainSysModuleRelate
     *
     * @throws Exception
     */
    protected abstract void doAddBpmDomainSysModuleRelate(
        final long bpmDomainId,
        final com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean bpmDomainSysModuleRelate)
        throws Exception;

    /**
     * 添加业务域与系统模块关联
     *
     * @param bpmDomainId
     * @param bpmDomainSysModuleRelate
     *
     * @throws Exception
     */
    public void addBpmDomainSysModuleRelate(final long bpmDomainId,
        final com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean bpmDomainSysModuleRelate)
        throws Exception {
        try {
            if (bpmDomainSysModuleRelate == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmDomainSysModuleRelate] Value is NULL");
            } // end if

            doAddBpmDomainSysModuleRelate(bpmDomainId, bpmDomainSysModuleRelate);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmDomainSysModuleRelate error", e);
            throw e;
        } // end catch
    } // end addBpmDomainSysModuleRelate()

    /**
     * 删除业务域与系统模块关联
     *
     * @param bpmDomainSysModuleRelateIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmDomainSysModuleRelates(
        final long[] bpmDomainSysModuleRelateIds) throws Exception;

    /**
     * 删除业务域与系统模块关联
     *
     * @param bpmDomainSysModuleRelateIds
     *
     * @throws Exception
     */
    public void deleteBpmDomainSysModuleRelates(
        final long[] bpmDomainSysModuleRelateIds) throws Exception {
        try {
            doDeleteBpmDomainSysModuleRelates(bpmDomainSysModuleRelateIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmDomainSysModuleRelates error", e);
            throw e;
        } // end catch
    } // end deleteBpmDomainSysModuleRelates()

    /**
     * 批量添加业务域与系统模块关联
     *
     * @param bpmDomainId
     * @param sysModuleIds
     *
     * @throws Exception
     */
    protected abstract void doAddBpmDomainSysModuleRelates(
        final long bpmDomainId, final long[] sysModuleIds)
        throws Exception;

    /**
     * 批量添加业务域与系统模块关联
     *
     * @param bpmDomainId
     * @param sysModuleIds
     *
     * @throws Exception
     */
    public void addBpmDomainSysModuleRelates(final long bpmDomainId,
        final long[] sysModuleIds) throws Exception {
        try {
            doAddBpmDomainSysModuleRelates(bpmDomainId, sysModuleIds);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmDomainSysModuleRelates error", e);
            throw e;
        } // end catch
    } // end addBpmDomainSysModuleRelates()

    /**
     * 根据编码取得业务域
     *
     * @param bpmDomainCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmDomainBean doGetBpmDomainByCode(
        final String bpmDomainCode) throws Exception;

    /**
     * 根据编码取得业务域
     *
     * @param bpmDomainCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmDomainBean getBpmDomainByCode(
        final String bpmDomainCode) throws Exception {
        try {
            if (bpmDomainCode == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmDomainCode] Value is NULL");
            } // end if

            com.ourteam.bpm.domain.BpmDomainBean result = doGetBpmDomainByCode(bpmDomainCode);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmDomainByCode error", e);
            throw e;
        } // end catch
    } // end getBpmDomainByCode()

    /**
     * 取得业务流程目录
     *
     * @param parentCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessCatalogBean[] doGetBpmProcessCatalogs(
        final long parentCatalogId) throws Exception;

    /**
     * 取得业务流程目录
     *
     * @param parentCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessCatalogBean[] getBpmProcessCatalogs(
        final long parentCatalogId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessCatalogBean[] result = doGetBpmProcessCatalogs(parentCatalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessCatalogs error", e);
            throw e;
        } // end catch
    } // end getBpmProcessCatalogs()

    /**
     * 添加业务流程目录
     *
     * @param bpmProcessCatalog
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessCatalog(
        final com.ourteam.bpm.domain.BpmProcessCatalogBean bpmProcessCatalog)
        throws Exception;

    /**
     * 添加业务流程目录
     *
     * @param bpmProcessCatalog
     *
     * @throws Exception
     */
    public void addBpmProcessCatalog(
        final com.ourteam.bpm.domain.BpmProcessCatalogBean bpmProcessCatalog)
        throws Exception {
        try {
            if (bpmProcessCatalog == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmProcessCatalog] Value is NULL");
            } // end if

            doAddBpmProcessCatalog(bpmProcessCatalog);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessCatalog error", e);
            throw e;
        } // end catch
    } // end addBpmProcessCatalog()

    /**
     * 更新业务流程目录
     *
     * @param bpmProcessCatalog
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmProcessCatalog(
        final com.ourteam.bpm.domain.BpmProcessCatalogBean bpmProcessCatalog)
        throws Exception;

    /**
     * 更新业务流程目录
     *
     * @param bpmProcessCatalog
     *
     * @throws Exception
     */
    public void modifyBpmProcessCatalog(
        final com.ourteam.bpm.domain.BpmProcessCatalogBean bpmProcessCatalog)
        throws Exception {
        try {
            if (bpmProcessCatalog == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmProcessCatalog] Value is NULL");
            } // end if

            doModifyBpmProcessCatalog(bpmProcessCatalog);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmProcessCatalog error", e);
            throw e;
        } // end catch
    } // end modifyBpmProcessCatalog()

    /**
     * 删除业务流程目录
     *
     * @param bpmProcessCatalogIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmProcessCatalogs(
        final long[] bpmProcessCatalogIds) throws Exception;

    /**
     * 删除业务流程目录
     *
     * @param bpmProcessCatalogIds
     *
     * @throws Exception
     */
    public void deleteBpmProcessCatalogs(final long[] bpmProcessCatalogIds)
        throws Exception {
        try {
            doDeleteBpmProcessCatalogs(bpmProcessCatalogIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmProcessCatalogs error", e);
            throw e;
        } // end catch
    } // end deleteBpmProcessCatalogs()

    /**
     * 根据ID取得业务流程目录
     *
     * @param bpmProcessCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessCatalogBean doGetBpmProcessCatalogById(
        final long bpmProcessCatalogId) throws Exception;

    /**
     * 根据ID取得业务流程目录
     *
     * @param bpmProcessCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessCatalogBean getBpmProcessCatalogById(
        final long bpmProcessCatalogId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessCatalogBean result = doGetBpmProcessCatalogById(bpmProcessCatalogId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessCatalogById error", e);
            throw e;
        } // end catch
    } // end getBpmProcessCatalogById()

    /**
     * 查询流程角色
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmRoleBean[] doQueryBpmRoles(
        final com.ourteam.bpm.dao.BpmRoleDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询流程角色
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmRoleBean[] queryBpmRoles(
        final com.ourteam.bpm.dao.BpmRoleDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmRoleBean[] result = doQueryBpmRoles(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBpmRoles error", e);
            throw e;
        } // end catch
    } // end queryBpmRoles()

    /**
     * 发布流程定义
     *
     * @param bpmProcessDefineId
     * @param resources
     *
     * @throws Exception
     */
    protected abstract void doDeployBpmProcessDefine(
        final long bpmProcessDefineId,
        final java.util.Map<String, java.io.InputStream> resources)
        throws Exception;

    /**
     * 发布流程定义
     *
     * @param bpmProcessDefineId
     * @param resources
     *
     * @throws Exception
     */
    public void deployBpmProcessDefine(final long bpmProcessDefineId,
        final java.util.Map<String, java.io.InputStream> resources)
        throws Exception {
        try {
            doDeployBpmProcessDefine(bpmProcessDefineId, resources);
        } // end try
        catch (Exception e) {
            logger.error("do deployBpmProcessDefine error", e);
            throw e;
        } // end catch
    } // end deployBpmProcessDefine()

    /**
     * 取得流程定义图资源
     *
     * @param bpmProcessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract java.io.InputStream doGetBpmProcessDiagramResource(
        final long bpmProcessDefineId) throws Exception;

    /**
     * 取得流程定义图资源
     *
     * @param bpmProcessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public java.io.InputStream getBpmProcessDiagramResource(
        final long bpmProcessDefineId) throws Exception {
        try {
            java.io.InputStream result = doGetBpmProcessDiagramResource(bpmProcessDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessDiagramResource error", e);
            throw e;
        } // end catch
    } // end getBpmProcessDiagramResource()

    /**
     * 启动流程
     *
     * @param bpmProcessDefineId
     * @param starterId
     * @param businessKey
     * @param startFormData
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessInstanceBean doStartBpmProcess(
        final long bpmProcessDefineId, final long starterId,
        final String businessKey,
        final java.util.Map<String, Object> startFormData)
        throws Exception;

    /**
     * 启动流程
     *
     * @param bpmProcessDefineId
     * @param starterId
     * @param businessKey
     * @param startFormData
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessInstanceBean startBpmProcess(
        final long bpmProcessDefineId, final long starterId,
        final String businessKey,
        final java.util.Map<String, Object> startFormData)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessInstanceBean result = doStartBpmProcess(bpmProcessDefineId,
                    starterId, businessKey, startFormData);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do startBpmProcess error", e);
            throw e;
        } // end catch
    } // end startBpmProcess()

    /**
     * 查询流程实例
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessInstanceBean[] doQueryBpmProcessInstances(
        final com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询流程实例
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessInstanceBean[] queryBpmProcessInstances(
        final com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessInstanceBean[] result = doQueryBpmProcessInstances(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBpmProcessInstances error", e);
            throw e;
        } // end catch
    } // end queryBpmProcessInstances()

    /**
     * 查询流程实例数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryBpmProcessInstanceCount(
        final com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询流程实例数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryBpmProcessInstanceCount(
        final com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryBpmProcessInstanceCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBpmProcessInstanceCount error", e);
            throw e;
        } // end catch
    } // end queryBpmProcessInstanceCount()

    /**
     * 取消业务流程
     *
     * @param bpmProcessInstanceId
     * @param operatorId
     * @param cancelReason
     *
     * @throws Exception
     */
    protected abstract void doCancelBpmProcess(
        final long bpmProcessInstanceId, final long operatorId,
        final String cancelReason) throws Exception;

    /**
     * 取消业务流程
     *
     * @param bpmProcessInstanceId
     * @param operatorId
     * @param cancelReason
     *
     * @throws Exception
     */
    public void cancelBpmProcess(final long bpmProcessInstanceId,
        final long operatorId, final String cancelReason)
        throws Exception {
        try {
            doCancelBpmProcess(bpmProcessInstanceId, operatorId, cancelReason);
        } // end try
        catch (Exception e) {
            logger.error("do cancelBpmProcess error", e);
            throw e;
        } // end catch
    } // end cancelBpmProcess()

    /**
     * 取得流程表单定义
     *
     * @param bpmProcessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmFormDefineBean[] doGetBpmProcessFormDefines(
        final long bpmProcessDefineId) throws Exception;

    /**
     * 取得流程表单定义
     *
     * @param bpmProcessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmFormDefineBean[] getBpmProcessFormDefines(
        final long bpmProcessDefineId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmFormDefineBean[] result = doGetBpmProcessFormDefines(bpmProcessDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessFormDefines error", e);
            throw e;
        } // end catch
    } // end getBpmProcessFormDefines()

    /**
     * 添加流程定义表单
     *
     * @param bpmProcessDefineId
     * @param bpmFormDefineBean
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessFormDefine(
        final long bpmProcessDefineId,
        final com.ourteam.bpm.domain.BpmFormDefineBean bpmFormDefineBean)
        throws Exception;

    /**
     * 添加流程定义表单
     *
     * @param bpmProcessDefineId
     * @param bpmFormDefineBean
     *
     * @throws Exception
     */
    public void addBpmProcessFormDefine(final long bpmProcessDefineId,
        final com.ourteam.bpm.domain.BpmFormDefineBean bpmFormDefineBean)
        throws Exception {
        try {
            if (bpmFormDefineBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmFormDefineBean] Value is NULL");
            } // end if

            doAddBpmProcessFormDefine(bpmProcessDefineId, bpmFormDefineBean);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessFormDefine error", e);
            throw e;
        } // end catch
    } // end addBpmProcessFormDefine()

    /**
     * 更新流程表单定义
     *
     * @param bpmProcessDefineId
     * @param bpmFormDefineBean
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmProcessFormDefine(
        final long bpmProcessDefineId,
        final com.ourteam.bpm.domain.BpmFormDefineBean bpmFormDefineBean)
        throws Exception;

    /**
     * 更新流程表单定义
     *
     * @param bpmProcessDefineId
     * @param bpmFormDefineBean
     *
     * @throws Exception
     */
    public void modifyBpmProcessFormDefine(final long bpmProcessDefineId,
        final com.ourteam.bpm.domain.BpmFormDefineBean bpmFormDefineBean)
        throws Exception {
        try {
            if (bpmFormDefineBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmFormDefineBean] Value is NULL");
            } // end if

            doModifyBpmProcessFormDefine(bpmProcessDefineId, bpmFormDefineBean);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmProcessFormDefine error", e);
            throw e;
        } // end catch
    } // end modifyBpmProcessFormDefine()

    /**
     * 删除流程表单定义
     *
     * @param bpmFormDefineBeanIds
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmProcessFormDefines(
        final long[] bpmFormDefineBeanIds) throws Exception;

    /**
     * 删除流程表单定义
     *
     * @param bpmFormDefineBeanIds
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormDefines(final long[] bpmFormDefineBeanIds)
        throws Exception {
        try {
            doDeleteBpmProcessFormDefines(bpmFormDefineBeanIds);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmProcessFormDefines error", e);
            throw e;
        } // end catch
    } // end deleteBpmProcessFormDefines()

    /**
     * 根据标识取得流程表单
     *
     * @param bpmProcessDefineId
     * @param formKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmFormDefineBean doGetBpmProcessFormDefineByKey(
        final long bpmProcessDefineId, final String formKey)
        throws Exception;

    /**
     * 根据标识取得流程表单
     *
     * @param bpmProcessDefineId
     * @param formKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmFormDefineBean getBpmProcessFormDefineByKey(
        final long bpmProcessDefineId, final String formKey)
        throws Exception {
        try {
            if (formKey == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [formKey] Value is NULL");
            } // end if

            com.ourteam.bpm.domain.BpmFormDefineBean result = doGetBpmProcessFormDefineByKey(bpmProcessDefineId,
                    formKey);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessFormDefineByKey error", e);
            throw e;
        } // end catch
    } // end getBpmProcessFormDefineByKey()

    /**
     * 取得业务功能UI配置
     *
     * @param uiConfigType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmPublicUiConfigBean doGetBpmPublicUIConfig(
        final String uiConfigType) throws Exception;

    /**
     * 取得业务功能UI配置
     *
     * @param uiConfigType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmPublicUiConfigBean getBpmPublicUIConfig(
        final String uiConfigType) throws Exception {
        try {
            if (uiConfigType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [uiConfigType] Value is NULL");
            } // end if

            com.ourteam.bpm.domain.BpmPublicUiConfigBean result = doGetBpmPublicUIConfig(uiConfigType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmPublicUIConfig error", e);
            throw e;
        } // end catch
    } // end getBpmPublicUIConfig()

    /**
     * 设置业务功能UI配置
     *
     * @param bpmUiConfigType
     * @param bpmPublicUiConfigBean
     *
     * @throws Exception
     */
    protected abstract void doSetBpmPublicUIConfig(
        final String bpmUiConfigType,
        final com.ourteam.bpm.domain.BpmPublicUiConfigBean bpmPublicUiConfigBean)
        throws Exception;

    /**
     * 设置业务功能UI配置
     *
     * @param bpmUiConfigType
     * @param bpmPublicUiConfigBean
     *
     * @throws Exception
     */
    public void setBpmPublicUIConfig(final String bpmUiConfigType,
        final com.ourteam.bpm.domain.BpmPublicUiConfigBean bpmPublicUiConfigBean)
        throws Exception {
        try {
            if (bpmUiConfigType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmUiConfigType] Value is NULL");
            } // end if

            if (bpmPublicUiConfigBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [bpmPublicUiConfigBean] Value is NULL");
            } // end if

            doSetBpmPublicUIConfig(bpmUiConfigType, bpmPublicUiConfigBean);
        } // end try
        catch (Exception e) {
            logger.error("do setBpmPublicUIConfig error", e);
            throw e;
        } // end catch
    } // end setBpmPublicUIConfig()

    /**
     * 查询流程任务
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmTaskBean[] doQueryBpmTasks(
        final com.ourteam.bpm.dao.BpmTaskDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询流程任务
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmTaskBean[] queryBpmTasks(
        final com.ourteam.bpm.dao.BpmTaskDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.bpm.domain.BpmTaskBean[] result = doQueryBpmTasks(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBpmTasks error", e);
            throw e;
        } // end catch
    } // end queryBpmTasks()

    /**
     * 查询流程任务数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryBpmTaskCount(
        final com.ourteam.bpm.dao.BpmTaskDAOQueryBean queryBean)
        throws Exception;

    /**
     * 查询流程任务数量
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryBpmTaskCount(
        final com.ourteam.bpm.dao.BpmTaskDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryBpmTaskCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBpmTaskCount error", e);
            throw e;
        } // end catch
    } // end queryBpmTaskCount()

    /**
     * 根据Key取得流程角色
     *
     * @param roleKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmRoleBean doGetBpmRoleByKey(
        final String roleKey) throws Exception;

    /**
     * 根据Key取得流程角色
     *
     * @param roleKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmRoleBean getBpmRoleByKey(
        final String roleKey) throws Exception {
        try {
            if (roleKey == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [roleKey] Value is NULL");
            } // end if

            com.ourteam.bpm.domain.BpmRoleBean result = doGetBpmRoleByKey(roleKey);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmRoleByKey error", e);
            throw e;
        } // end catch
    } // end getBpmRoleByKey()

    /**
     * 指派流程任务
     *
     * @param loginEmployeeId
     * @param bpmTaskId
     * @param assignerId
     * @param priority
     * @param comment
     *
     * @throws Exception
     */
    protected abstract void doSetBpmTaskAssigner(final long loginEmployeeId,
        final long bpmTaskId, final long assignerId, final int priority,
        final String comment) throws Exception;

    /**
     * 指派流程任务
     *
     * @param loginEmployeeId
     * @param bpmTaskId
     * @param assignerId
     * @param priority
     * @param comment
     *
     * @throws Exception
     */
    public void setBpmTaskAssigner(final long loginEmployeeId,
        final long bpmTaskId, final long assignerId, final int priority,
        final String comment) throws Exception {
        try {
            doSetBpmTaskAssigner(loginEmployeeId, bpmTaskId, assignerId,
                priority, comment);
        } // end try
        catch (Exception e) {
            logger.error("do setBpmTaskAssigner error", e);
            throw e;
        } // end catch
    } // end setBpmTaskAssigner()

    /**
     * 取得流程实例变量
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract java.util.Map<String, Object> doGetBpmProcessInstanceVariables(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 取得流程实例变量
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public java.util.Map<String, Object> getBpmProcessInstanceVariables(
        final long bpmProcessInstanceId) throws Exception {
        try {
            java.util.Map<String, Object> result = doGetBpmProcessInstanceVariables(bpmProcessInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessInstanceVariables error", e);
            throw e;
        } // end catch
    } // end getBpmProcessInstanceVariables()

    /**
     * 取得流程任务候选人
     *
     * @param bpmTaskId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.hr.domain.EmployeeBean[] doGetBpmTaskCandidateAssigners(
        final long bpmTaskId) throws Exception;

    /**
     * 取得流程任务候选人
     *
     * @param bpmTaskId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.hr.domain.EmployeeBean[] getBpmTaskCandidateAssigners(
        final long bpmTaskId) throws Exception {
        try {
            com.ourteam.hr.domain.EmployeeBean[] result = doGetBpmTaskCandidateAssigners(bpmTaskId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmTaskCandidateAssigners error", e);
            throw e;
        } // end catch
    } // end getBpmTaskCandidateAssigners()

    /**
     * 根据ID取得流程任务
     *
     * @param taskIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmTaskBean[] doGetBpmTaskByIds(
        final long[] taskIds) throws Exception;

    /**
     * 根据ID取得流程任务
     *
     * @param taskIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmTaskBean[] getBpmTaskByIds(
        final long[] taskIds) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmTaskBean[] result = doGetBpmTaskByIds(taskIds);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmTaskByIds error", e);
            throw e;
        } // end catch
    } // end getBpmTaskByIds()

    /**
     * 完成流程任务
     *
     * @param bpmTaskId
     * @param executorId
     * @param formData
     *
     * @throws Exception
     */
    protected abstract void doCompleteBpmTask(final long bpmTaskId,
        final long executorId, final java.util.Map<String, Object> formData)
        throws Exception;

    /**
     * 完成流程任务
     *
     * @param bpmTaskId
     * @param executorId
     * @param formData
     *
     * @throws Exception
     */
    public void completeBpmTask(final long bpmTaskId, final long executorId,
        final java.util.Map<String, Object> formData) throws Exception {
        try {
            doCompleteBpmTask(bpmTaskId, executorId, formData);
        } // end try
        catch (Exception e) {
            logger.error("do completeBpmTask error", e);
            throw e;
        } // end catch
    } // end completeBpmTask()

    /**
     * 取得流程实例附件列表
     *
     * @param bpmProcessinstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmAttachmentBean[] doGetBpmProcessInstanceAttachments(
        final long bpmProcessinstanceId) throws Exception;

    /**
     * 取得流程实例附件列表
     *
     * @param bpmProcessinstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmAttachmentBean[] getBpmProcessInstanceAttachments(
        final long bpmProcessinstanceId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmAttachmentBean[] result = doGetBpmProcessInstanceAttachments(bpmProcessinstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessInstanceAttachments error", e);
            throw e;
        } // end catch
    } // end getBpmProcessInstanceAttachments()

    /**
     * 添加流程实例附件
     *
     * @param processInstanceId
     * @param bpmAttachments
     * @param contentMap
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessInstanceAttachments(
        final long processInstanceId,
        final com.ourteam.bpm.domain.BpmAttachmentBean[] bpmAttachments,
        final java.util.Map<String, java.io.InputStream> contentMap)
        throws Exception;

    /**
     * 添加流程实例附件
     *
     * @param processInstanceId
     * @param bpmAttachments
     * @param contentMap
     *
     * @throws Exception
     */
    public void addBpmProcessInstanceAttachments(final long processInstanceId,
        final com.ourteam.bpm.domain.BpmAttachmentBean[] bpmAttachments,
        final java.util.Map<String, java.io.InputStream> contentMap)
        throws Exception {
        try {
            if (bpmAttachments == null) {
                logger.warn("The Parameter [bpmAttachments] Value is NULL,Exit");

                return;
            } // end if

            doAddBpmProcessInstanceAttachments(processInstanceId,
                bpmAttachments, contentMap);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessInstanceAttachments error", e);
            throw e;
        } // end catch
    } // end addBpmProcessInstanceAttachments()

    /**
     * 取得流程实例注释
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmCommentBean[] doGetBpmProcessInstanceComments(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 取得流程实例注释
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmCommentBean[] getBpmProcessInstanceComments(
        final long bpmProcessInstanceId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmCommentBean[] result = doGetBpmProcessInstanceComments(bpmProcessInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessInstanceComments error", e);
            throw e;
        } // end catch
    } // end getBpmProcessInstanceComments()

    /**
     * 添加流程实例注释
     *
     * @param bpmProcessInstanceId
     * @param employeeId
     * @param comment
     *
     * @throws Exception
     */
    protected abstract void doAddBpmProcessInstanceComment(
        final long bpmProcessInstanceId, final long employeeId,
        final String comment) throws Exception;

    /**
     * 添加流程实例注释
     *
     * @param bpmProcessInstanceId
     * @param employeeId
     * @param comment
     *
     * @throws Exception
     */
    public void addBpmProcessInstanceComment(final long bpmProcessInstanceId,
        final long employeeId, final String comment) throws Exception {
        try {
            if (comment == null) {
                logger.warn("The Parameter [comment] Value is NULL,Exit");

                return;
            } // end if

            doAddBpmProcessInstanceComment(bpmProcessInstanceId, employeeId,
                comment);
        } // end try
        catch (Exception e) {
            logger.error("do addBpmProcessInstanceComment error", e);
            throw e;
        } // end catch
    } // end addBpmProcessInstanceComment()

    /**
     * 根据ID取得流程实例
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessInstanceBean doGetBpmProcessInstanceById(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 根据ID取得流程实例
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessInstanceBean getBpmProcessInstanceById(
        final long bpmProcessInstanceId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessInstanceBean result = doGetBpmProcessInstanceById(bpmProcessInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessInstanceById error", e);
            throw e;
        } // end catch
    } // end getBpmProcessInstanceById()

    /**
     * 根据ID取得业务流程定义
     *
     * @param processDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmProcessDefineBean doGetBpmProcessDefineById(
        final long processDefineId) throws Exception;

    /**
     * 根据ID取得业务流程定义
     *
     * @param processDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmProcessDefineBean getBpmProcessDefineById(
        final long processDefineId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmProcessDefineBean result = doGetBpmProcessDefineById(processDefineId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessDefineById error", e);
            throw e;
        } // end catch
    } // end getBpmProcessDefineById()

    /**
     * 取得流程表单数据
     *
     * @param processInstanceId
     * @param taskId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract java.util.Map<String, Object> doGetBpmProcessFormValues(
        final long processInstanceId, final long taskId)
        throws Exception;

    /**
     * 取得流程表单数据
     *
     * @param processInstanceId
     * @param taskId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public java.util.Map<String, Object> getBpmProcessFormValues(
        final long processInstanceId, final long taskId)
        throws Exception {
        try {
            java.util.Map<String, Object> result = doGetBpmProcessFormValues(processInstanceId,
                    taskId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessFormValues error", e);
            throw e;
        } // end catch
    } // end getBpmProcessFormValues()

    /**
     * 取得流程处理过程
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmTaskBean[] doGetBpmProcessFlow(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 取得流程处理过程
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmTaskBean[] getBpmProcessFlow(
        final long bpmProcessInstanceId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmTaskBean[] result = doGetBpmProcessFlow(bpmProcessInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessFlow error", e);
            throw e;
        } // end catch
    } // end getBpmProcessFlow()

    /**
     * 取得未指派的流程任务实例
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmTaskBean[] doGetUnAssignedBpmTasks(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 取得未指派的流程任务实例
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmTaskBean[] getUnAssignedBpmTasks(
        final long bpmProcessInstanceId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmTaskBean[] result = doGetUnAssignedBpmTasks(bpmProcessInstanceId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getUnAssignedBpmTasks error", e);
            throw e;
        } // end catch
    } // end getUnAssignedBpmTasks()

    /**
     * 修改流程表单内容
     *
     * @param bpmProcessFormInstanceId
     * @param values
     *
     * @throws Exception
     */
    protected abstract void doStoreBpmProcessFormValues(
        final long bpmProcessFormInstanceId,
        final java.util.Map<String, Object> values) throws Exception;

    /**
     * 修改流程表单内容
     *
     * @param bpmProcessFormInstanceId
     * @param values
     *
     * @throws Exception
     */
    public void storeBpmProcessFormValues(final long bpmProcessFormInstanceId,
        final java.util.Map<String, Object> values) throws Exception {
        try {
            if (values == null) {
                logger.warn("The Parameter [values] Value is NULL,Exit");

                return;
            } // end if

            doStoreBpmProcessFormValues(bpmProcessFormInstanceId, values);
        } // end try
        catch (Exception e) {
            logger.error("do storeBpmProcessFormValues error", e);
            throw e;
        } // end catch
    } // end storeBpmProcessFormValues()

    /**
     * 修改流程表单内容
     *
     * @param bpmProcessInstanceId
     * @param editorId
     * @param formValues
     *
     * @throws Exception
     */
    protected abstract void doModifyBpmProcessFormValues(
        final long bpmProcessInstanceId, final long editorId,
        final java.util.Map<String, Object> formValues)
        throws Exception;

    /**
     * 修改流程表单内容
     *
     * @param bpmProcessInstanceId
     * @param editorId
     * @param formValues
     *
     * @throws Exception
     */
    public void modifyBpmProcessFormValues(final long bpmProcessInstanceId,
        final long editorId, final java.util.Map<String, Object> formValues)
        throws Exception {
        try {
            if (formValues == null) {
                logger.warn("The Parameter [formValues] Value is NULL,Exit");

                return;
            } // end if

            doModifyBpmProcessFormValues(bpmProcessInstanceId, editorId,
                formValues);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBpmProcessFormValues error", e);
            throw e;
        } // end catch
    } // end modifyBpmProcessFormValues()

    /**
     * 删除流程实例附件
     *
     * @param bpmAttachmentIds
     * @param operatorId
     *
     * @throws Exception
     */
    protected abstract void doDeleteBpmProcessInstanceAttachments(
        final long[] bpmAttachmentIds, final long operatorId)
        throws Exception;

    /**
     * 删除流程实例附件
     *
     * @param bpmAttachmentIds
     * @param operatorId
     *
     * @throws Exception
     */
    public void deleteBpmProcessInstanceAttachments(
        final long[] bpmAttachmentIds, final long operatorId)
        throws Exception {
        try {
            doDeleteBpmProcessInstanceAttachments(bpmAttachmentIds, operatorId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBpmProcessInstanceAttachments error", e);
            throw e;
        } // end catch
    } // end deleteBpmProcessInstanceAttachments()

    /**
     * 根据ID取得附件
     *
     * @param bpmAttachmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmAttachmentBean doGetBpmProcessInstanceAttachmentById(
        final long bpmAttachmentId) throws Exception;

    /**
     * 根据ID取得附件
     *
     * @param bpmAttachmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmAttachmentBean getBpmProcessInstanceAttachmentById(
        final long bpmAttachmentId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmAttachmentBean result = doGetBpmProcessInstanceAttachmentById(bpmAttachmentId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmProcessInstanceAttachmentById error", e);
            throw e;
        } // end catch
    } // end getBpmProcessInstanceAttachmentById()

    /**
     * 取得未指派的任务数量
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doGetBpmUnAssignedTaskCount(final long employeeId)
        throws Exception;

    /**
     * 取得未指派的任务数量
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int getBpmUnAssignedTaskCount(final long employeeId)
        throws Exception {
        try {
            int result = doGetBpmUnAssignedTaskCount(employeeId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmUnAssignedTaskCount error", e);
            throw e;
        } // end catch
    } // end getBpmUnAssignedTaskCount()

    /**
     * 取得未指派的任务
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.bpm.domain.BpmTaskBean[] doGetBpmUnAssignedTask(
        final long bpmRoleId) throws Exception;

    /**
     * 取得未指派的任务
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.bpm.domain.BpmTaskBean[] getBpmUnAssignedTask(
        final long bpmRoleId) throws Exception {
        try {
            com.ourteam.bpm.domain.BpmTaskBean[] result = doGetBpmUnAssignedTask(bpmRoleId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBpmUnAssignedTask error", e);
            throw e;
        } // end catch
    } // end getBpmUnAssignedTask()
} // end AbstractBPMService
