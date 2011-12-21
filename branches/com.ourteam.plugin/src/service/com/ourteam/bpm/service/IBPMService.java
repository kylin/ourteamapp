/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.service;

/**
*  流程服务接口
*  Generated Date 2011-12-20 22:33:22   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBPMService {
    /**
     * 根据目录ID取得流程定义
     *
     * @param catalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessDefineBean[] getBpmProcessDefinesByCatalogId(
        final long catalogId) throws Exception;

    /**
     * 取得流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmRoleBean[] getBpmRolesByModuleId(
        final long bpmDomainId, final long sysModuleId)
        throws Exception;

    /**
     * 新建流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     * @param bpmRole
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmRole(final long bpmDomainId, final long sysModuleId,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole)
        throws Exception;

    /**
     * 更新流程角色
     *
     * @param bpmDomainId
     * @param sysModuleId
     * @param bpmRole
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmRole(final long bpmDomainId, final long sysModuleId,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole)
        throws Exception;

    /**
     * 删除流程角色
     *
     * @param bpmRoleIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmRoles(final long[] bpmRoleIds) throws Exception;

    /**
     * 根据ID取得流程角色
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmRoleBean getBpmRoleById(final long bpmRoleId)
        throws Exception;

    /**
     * 根据模块标识取得流程角色
     *
     * @param sysModuleCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmRoleBean[] getBpmRolesByModuleCode(
        final String sysModuleCode) throws Exception;

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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getEmployeeBpmRoleRelateByModuleCode(
        final long employeeId, final String moduleCode,
        final long businessInstanceId, final String businessType)
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
     *
     * @model
     */
    void setEmployeeBpmRoleRelate(final long employeeId, final long moduleId,
        final long businessInstanceId, final String businessType,
        final com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] employeeRoleRelates)
        throws Exception;

    /**
     * 根据角色取得用户流程角色
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getEmployeeBpmRoleRelateByRoleId(
        final long bpmRoleId) throws Exception;

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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] addBpmRoleEmployeeRelates(
        final long businessInstanceId, final String businessType,
        final com.ourteam.bpm.domain.BpmRoleBean bpmRole,
        final long[] employeeIds) throws Exception;

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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getBpmRoleEmployeeRelates(
        final long bpmRoleId, final long businessInstanceId,
        final String businessType) throws Exception;

    /**
     * 删除流程角色用户关联
     *
     * @param bpmRoleEmployeeRelateIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmRoleEmployeeRelates(final long[] bpmRoleEmployeeRelateIds)
        throws Exception;

    /**
     * 新建业务流程定义
     *
     * @param catalogId
     * @param processDefine
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessDefine(final long catalogId,
        final com.ourteam.bpm.domain.BpmProcessDefineBean processDefine)
        throws Exception;

    /**
     * 根据ID取得流程定义
     *
     * @param processDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessDefineBean getBpmProcessById(
        final long processDefineId) throws Exception;

    /**
     * 修改流程定义信息
     *
     * @param catalogId
     * @param processDefine
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmProcessDefine(final long catalogId,
        final com.ourteam.bpm.domain.BpmProcessDefineBean processDefine)
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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] getBpmProcessRolePurviews(
        final long processDefineId, final long[] roleIds)
        throws Exception;

    /**
     * 设置流程角色权限
     *
     * @param processDefineId
     * @param processRolePurviews
     *
     * @throws Exception
     *
     * @model
     */
    void setBpmProcessRolePurviews(final long processDefineId,
        final com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] processRolePurviews)
        throws Exception;

    /**
     * 删除流程定义
     *
     * @param processDefineIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessDefines(final long[] processDefineIds)
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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmFormFieldDefineBean[] getBpmProcessFormFieldDefines(
        final long formDefineId, final long parentFieldId)
        throws Exception;

    /**
     * 新建流程字段定义
     *
     * @param formDefineId
     * @param formFieldDefine
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessFormFieldDefine(final long formDefineId,
        final com.ourteam.bpm.domain.BpmFormFieldDefineBean formFieldDefine)
        throws Exception;

    /**
     * 修改流程字段定义
     *
     * @param formDefineId
     * @param formFieldDefine
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmProcessFormFieldDefine(final long formDefineId,
        final com.ourteam.bpm.domain.BpmFormFieldDefineBean formFieldDefine)
        throws Exception;

    /**
     * 删除流程字段定义
     *
     * @param formFieldDefineIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormFieldDefines(final long[] formFieldDefineIds)
        throws Exception;

    /**
     * 取得过程表单字段状态
     *
     * @param fieldId
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean[] getBpmProcessFormFieldStatus(
        final long fieldId, final long[] roleIds) throws Exception;

    /**
     * 添加流程表单字段状态
     *
     * @param stepId
     * @param roleId
     * @param fieldStatusDefine
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessFormFieldStatus(final long stepId, final long roleId,
        final com.ourteam.bpm.domain.BpmFormFieldStatusDefineBean fieldStatusDefine)
        throws Exception;

    /**
     * 删除流程表单字段状态定义
     *
     * @param stepId
     * @param fieldId
     * @param roleID
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormFieldStatus(final long stepId, final long fieldId,
        final long roleID) throws Exception;

    /**
     * 根据用户ID取得用户流程角色
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmEmployeeRoleRelateBean[] getEmployeeBpmRoleRelateByEmployeeId(
        final long employeeId) throws Exception;

    /**
     * 根据流程角色取得流程权限
     *
     * @param roleIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessRolePurviewBean[] getBpmProcessRolePurviewsByRoleId(
        final long[] roleIds) throws Exception;

    /**
     * 新建业务域
     *
     * @param bpmDomain
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmDomain(final com.ourteam.bpm.domain.BpmDomainBean bpmDomain)
        throws Exception;

    /**
     * 修改流程域
     *
     * @param bpmDomain
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmDomain(final com.ourteam.bpm.domain.BpmDomainBean bpmDomain)
        throws Exception;

    /**
     * 删除业务域
     *
     * @param bpmDomainIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomains(final long[] bpmDomainIds) throws Exception;

    /**
     * 根据ID取得业务域
     *
     * @param bpmDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmDomainBean getBpmDomainById(
        final long bpmDomainId) throws Exception;

    /**
     * 取得业务域列表
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmDomainBean[] getBpmDomains()
        throws Exception;

    /**
     * 取得业务域与系统模块关联
     *
     * @param bpmDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean[] getBpmDomianSysModuleRelates(
        final long bpmDomainId) throws Exception;

    /**
     * 添加业务域与系统模块关联
     *
     * @param bpmDomainId
     * @param bpmDomainSysModuleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmDomainSysModuleRelate(final long bpmDomainId,
        final com.ourteam.bpm.domain.BpmDomainSysModuleRelateBean bpmDomainSysModuleRelate)
        throws Exception;

    /**
     * 删除业务域与系统模块关联
     *
     * @param bpmDomainSysModuleRelateIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomainSysModuleRelates(
        final long[] bpmDomainSysModuleRelateIds) throws Exception;

    /**
     * 批量添加业务域与系统模块关联
     *
     * @param bpmDomainId
     * @param sysModuleIds
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmDomainSysModuleRelates(final long bpmDomainId,
        final long[] sysModuleIds) throws Exception;

    /**
     * 根据编码取得业务域
     *
     * @param bpmDomainCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmDomainBean getBpmDomainByCode(
        final String bpmDomainCode) throws Exception;

    /**
     * 取得业务流程目录
     *
     * @param parentCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessCatalogBean[] getBpmProcessCatalogs(
        final long parentCatalogId) throws Exception;

    /**
     * 添加业务流程目录
     *
     * @param bpmProcessCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessCatalog(
        final com.ourteam.bpm.domain.BpmProcessCatalogBean bpmProcessCatalog)
        throws Exception;

    /**
     * 更新业务流程目录
     *
     * @param bpmProcessCatalog
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmProcessCatalog(
        final com.ourteam.bpm.domain.BpmProcessCatalogBean bpmProcessCatalog)
        throws Exception;

    /**
     * 删除业务流程目录
     *
     * @param bpmProcessCatalogIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessCatalogs(final long[] bpmProcessCatalogIds)
        throws Exception;

    /**
     * 根据ID取得业务流程目录
     *
     * @param bpmProcessCatalogId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessCatalogBean getBpmProcessCatalogById(
        final long bpmProcessCatalogId) throws Exception;

    /**
     * 查询流程角色
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmRoleBean[] queryBpmRoles(
        final com.ourteam.bpm.dao.BpmRoleDAOQueryBean queryBean)
        throws Exception;

    /**
     * 发布流程定义
     *
     * @param bpmProcessDefineId
     * @param resources
     *
     * @throws Exception
     *
     * @model
     */
    void deployBpmProcessDefine(final long bpmProcessDefineId,
        final java.util.Map<String, java.io.InputStream> resources)
        throws Exception;

    /**
     * 取得流程定义图资源
     *
     * @param bpmProcessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    java.io.InputStream getBpmProcessDiagramResource(
        final long bpmProcessDefineId) throws Exception;

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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessInstanceBean startBpmProcess(
        final long bpmProcessDefineId, final long starterId,
        final String businessKey,
        final java.util.Map<String, Object> startFormData)
        throws Exception;

    /**
     * 查询流程实例
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessInstanceBean[] queryBpmProcessInstances(
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
     *
     * @model
     */
    int queryBpmProcessInstanceCount(
        final com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean queryBean)
        throws Exception;

    /**
     * 取消业务流程
     *
     * @param bpmProcessInstanceId
     * @param operatorId
     * @param cancelReason
     *
     * @throws Exception
     *
     * @model
     */
    void cancelBpmProcess(final long bpmProcessInstanceId,
        final long operatorId, final String cancelReason)
        throws Exception;

    /**
     * 取得流程表单定义
     *
     * @param bpmProcessDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmFormDefineBean[] getBpmProcessFormDefines(
        final long bpmProcessDefineId) throws Exception;

    /**
     * 添加流程定义表单
     *
     * @param bpmProcessDefineId
     * @param bpmFormDefineBean
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessFormDefine(final long bpmProcessDefineId,
        final com.ourteam.bpm.domain.BpmFormDefineBean bpmFormDefineBean)
        throws Exception;

    /**
     * 更新流程表单定义
     *
     * @param bpmProcessDefineId
     * @param bpmFormDefineBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmProcessFormDefine(final long bpmProcessDefineId,
        final com.ourteam.bpm.domain.BpmFormDefineBean bpmFormDefineBean)
        throws Exception;

    /**
     * 删除流程表单定义
     *
     * @param bpmFormDefineBeanIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormDefines(final long[] bpmFormDefineBeanIds)
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
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmFormDefineBean getBpmProcessFormDefineByKey(
        final long bpmProcessDefineId, final String formKey)
        throws Exception;

    /**
     * 取得业务功能UI配置
     *
     * @param uiConfigType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmPublicUiConfigBean getBpmPublicUIConfig(
        final String uiConfigType) throws Exception;

    /**
     * 设置业务功能UI配置
     *
     * @param bpmUiConfigType
     * @param bpmPublicUiConfigBean
     *
     * @throws Exception
     *
     * @model
     */
    void setBpmPublicUIConfig(final String bpmUiConfigType,
        final com.ourteam.bpm.domain.BpmPublicUiConfigBean bpmPublicUiConfigBean)
        throws Exception;

    /**
     * 查询流程任务
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmTaskBean[] queryBpmTasks(
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
     *
     * @model
     */
    int queryBpmTaskCount(
        final com.ourteam.bpm.dao.BpmTaskDAOQueryBean queryBean)
        throws Exception;

    /**
     * 根据Key取得流程角色
     *
     * @param roleKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmRoleBean getBpmRoleByKey(final String roleKey)
        throws Exception;

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
     *
     * @model
     */
    void setBpmTaskAssigner(final long loginEmployeeId, final long bpmTaskId,
        final long assignerId, final int priority, final String comment)
        throws Exception;

    /**
     * 取得流程实例变量
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    java.util.Map<String, Object> getBpmProcessInstanceVariables(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 取得流程任务候选人
     *
     * @param bpmTaskId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.hr.domain.EmployeeBean[] getBpmTaskCandidateAssigners(
        final long bpmTaskId) throws Exception;

    /**
     * 根据ID取得流程任务
     *
     * @param taskIds
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmTaskBean[] getBpmTaskByIds(final long[] taskIds)
        throws Exception;

    /**
     * 完成流程任务
     *
     * @param bpmTaskId
     * @param executorId
     * @param formData
     *
     * @throws Exception
     *
     * @model
     */
    void completeBpmTask(final long bpmTaskId, final long executorId,
        final java.util.Map<String, Object> formData) throws Exception;

    /**
     * 取得流程实例附件列表
     *
     * @param bpmProcessinstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmAttachmentBean[] getBpmProcessInstanceAttachments(
        final long bpmProcessinstanceId) throws Exception;

    /**
     * 添加流程实例附件
     *
     * @param processInstanceId
     * @param bpmAttachments
     * @param contentMap
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessInstanceAttachments(final long processInstanceId,
        final com.ourteam.bpm.domain.BpmAttachmentBean[] bpmAttachments,
        final java.util.Map<String, java.io.InputStream> contentMap)
        throws Exception;

    /**
     * 取得流程实例注释
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmCommentBean[] getBpmProcessInstanceComments(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 添加流程实例注释
     *
     * @param bpmProcessInstanceId
     * @param employeeId
     * @param comment
     *
     * @throws Exception
     *
     * @model
     */
    void addBpmProcessInstanceComment(final long bpmProcessInstanceId,
        final long employeeId, final String comment) throws Exception;

    /**
     * 根据ID取得流程实例
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessInstanceBean getBpmProcessInstanceById(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 根据ID取得业务流程定义
     *
     * @param processDefineId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmProcessDefineBean getBpmProcessDefineById(
        final long processDefineId) throws Exception;

    /**
     * 取得流程表单数据
     *
     * @param processInstanceId
     * @param taskId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    java.util.Map<String, Object> getBpmProcessFormValues(
        final long processInstanceId, final long taskId)
        throws Exception;

    /**
     * 取得流程处理过程
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmTaskBean[] getBpmProcessFlow(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 取得未指派的流程任务实例
     *
     * @param bpmProcessInstanceId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmTaskBean[] getUnAssignedBpmTasks(
        final long bpmProcessInstanceId) throws Exception;

    /**
     * 修改流程表单内容
     *
     * @param bpmProcessFormInstanceId
     * @param values
     *
     * @throws Exception
     *
     * @model
     */
    void storeBpmProcessFormValues(final long bpmProcessFormInstanceId,
        final java.util.Map<String, Object> values) throws Exception;

    /**
     * 修改流程表单内容
     *
     * @param bpmProcessInstanceId
     * @param editorId
     * @param formValues
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBpmProcessFormValues(final long bpmProcessInstanceId,
        final long editorId, final java.util.Map<String, Object> formValues)
        throws Exception;

    /**
     * 删除流程实例附件
     *
     * @param bpmAttachmentIds
     * @param operatorId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessInstanceAttachments(final long[] bpmAttachmentIds,
        final long operatorId) throws Exception;

    /**
     * 根据ID取得附件
     *
     * @param bpmAttachmentId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmAttachmentBean getBpmProcessInstanceAttachmentById(
        final long bpmAttachmentId) throws Exception;

    /**
     * 取得未指派的任务数量
     *
     * @param employeeId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int getBpmUnAssignedTaskCount(final long employeeId)
        throws Exception;

    /**
     * 取得未指派的任务
     *
     * @param bpmRoleId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.bpm.domain.BpmTaskBean[] getBpmUnAssignedTask(
        final long bpmRoleId) throws Exception;
} // end IBPMService
