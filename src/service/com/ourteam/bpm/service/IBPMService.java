/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.service;

/**
*  ���̷���ӿ�
*  Generated Date 2011-12-20 22:33:22   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBPMService {
    /**
     * ����Ŀ¼IDȡ�����̶���
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
     * ȡ�����̽�ɫ
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
     * �½����̽�ɫ
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
     * �������̽�ɫ
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
     * ɾ�����̽�ɫ
     *
     * @param bpmRoleIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmRoles(final long[] bpmRoleIds) throws Exception;

    /**
     * ����IDȡ�����̽�ɫ
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
     * ����ģ���ʶȡ�����̽�ɫ
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
     * ����ҵ��ģ���ʶȡ���û����̽�ɫ
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
     * �����û����̽�ɫ
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
     * ���ݽ�ɫȡ���û����̽�ɫ
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
     * ������̽�ɫ�û�����
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
     * ȡ�����̽�ɫ�û�����
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
     * ɾ�����̽�ɫ�û�����
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
     * �½�ҵ�����̶���
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
     * ����IDȡ�����̶���
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
     * �޸����̶�����Ϣ
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
     * ȡ�����̽�ɫȨ��
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
     * �������̽�ɫȨ��
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
     * ɾ�����̶���
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
     * ȡ�����̱��ֶζ���
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
     * �½������ֶζ���
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
     * �޸������ֶζ���
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
     * ɾ�������ֶζ���
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
     * ȡ�ù��̱��ֶ�״̬
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
     * ������̱��ֶ�״̬
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
     * ɾ�����̱��ֶ�״̬����
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
     * �����û�IDȡ���û����̽�ɫ
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
     * �������̽�ɫȡ������Ȩ��
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
     * �½�ҵ����
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
     * �޸�������
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
     * ɾ��ҵ����
     *
     * @param bpmDomainIds
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmDomains(final long[] bpmDomainIds) throws Exception;

    /**
     * ����IDȡ��ҵ����
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
     * ȡ��ҵ�����б�
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
     * ȡ��ҵ������ϵͳģ�����
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
     * ���ҵ������ϵͳģ�����
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
     * ɾ��ҵ������ϵͳģ�����
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
     * �������ҵ������ϵͳģ�����
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
     * ���ݱ���ȡ��ҵ����
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
     * ȡ��ҵ������Ŀ¼
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
     * ���ҵ������Ŀ¼
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
     * ����ҵ������Ŀ¼
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
     * ɾ��ҵ������Ŀ¼
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
     * ����IDȡ��ҵ������Ŀ¼
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
     * ��ѯ���̽�ɫ
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
     * �������̶���
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
     * ȡ�����̶���ͼ��Դ
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
     * ��������
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
     * ��ѯ����ʵ��
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
     * ��ѯ����ʵ������
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
     * ȡ��ҵ������
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
     * ȡ�����̱�����
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
     * ������̶����
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
     * �������̱�����
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
     * ɾ�����̱�����
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
     * ���ݱ�ʶȡ�����̱�
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
     * ȡ��ҵ����UI����
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
     * ����ҵ����UI����
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
     * ��ѯ��������
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
     * ��ѯ������������
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
     * ����Keyȡ�����̽�ɫ
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
     * ָ����������
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
     * ȡ������ʵ������
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
     * ȡ�����������ѡ��
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
     * ����IDȡ����������
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
     * �����������
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
     * ȡ������ʵ�������б�
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
     * �������ʵ������
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
     * ȡ������ʵ��ע��
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
     * �������ʵ��ע��
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
     * ����IDȡ������ʵ��
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
     * ����IDȡ��ҵ�����̶���
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
     * ȡ�����̱�����
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
     * ȡ�����̴������
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
     * ȡ��δָ�ɵ���������ʵ��
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
     * �޸����̱�����
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
     * �޸����̱�����
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
     * ɾ������ʵ������
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
     * ����IDȡ�ø���
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
     * ȡ��δָ�ɵ���������
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
     * ȡ��δָ�ɵ�����
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
