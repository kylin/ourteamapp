/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.workspace.service;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.log4j.Logger;

import com.ourteam.middleware.dao.IMiddleWareDAO;
import com.ourteam.middleware.dao.MiddleWareDAOQueryBean;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.workspace.dao.IProjectServerRelateDAO;
import com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO;
import com.ourteam.workspace.dao.IWorkspaceResourceDAO;
import com.ourteam.workspace.dao.ProjectServerRelate;
import com.ourteam.workspace.dao.ProjectServerRelateDAOQueryBean;
import com.ourteam.workspace.dao.ProjectWorkspaceRelate;
import com.ourteam.workspace.dao.ProjectWorkspaceRelateDAOQueryBean;
import com.ourteam.workspace.dao.Workspace;
import com.ourteam.workspace.dao.WorkspaceConfig;
import com.ourteam.workspace.dao.WorkspaceConfigDAOQueryBean;
import com.ourteam.workspace.dao.WorkspaceConfigProperty;
import com.ourteam.workspace.dao.WorkspaceConfigPropertyDAOQueryBean;
import com.ourteam.workspace.dao.WorkspaceDAOQueryBean;
import com.ourteam.workspace.dao.WorkspaceResource;
import com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate;
import com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelateDAOQueryBean;
import com.ourteam.workspace.dao.WorkspaceResourceDAOQueryBean;
import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceConfigBean;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean;

/**
 * impl Generated Date 2010-11-05 15:07:41
 * 
 * @author $Auto Gen
 */
public class WorkspaceServiceImpl extends AbstractWorkspaceService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(WorkspaceServiceImpl.class);

	private static final String WORKSPACE_ROOT_PATH = "/WorkspaceRoot/";

	@Override
	protected WorkspaceBean[] doGetWorkspacesByProjectIds(long[] projectIds)
			throws Exception {

		if (ArrayUtils.isEmpty(projectIds)) {
			return new WorkspaceBean[0];
		}

		ProjectWorkspaceRelateDAOQueryBean queryBean = new ProjectWorkspaceRelateDAOQueryBean();

		queryBean.createCriteria().andProjectIdIn(projectIds);

		ProjectWorkspaceRelate[] relates = this.projectWorkspaceRelateDao
				.queryProjectWorkspaceRelate(queryBean);

		if (ArrayUtils.isEmpty(relates)) {
			return new WorkspaceBean[0];
		}

		long[] workspaceIds = new long[relates.length];

		for (int i = 0; i < relates.length; i++) {
			workspaceIds[i] = relates[i].getWorkspaceId();
		}

		WorkspaceDAOQueryBean workspaceDAOQueryBean = new WorkspaceDAOQueryBean();

		workspaceDAOQueryBean.createCriteria().andIdIn(workspaceIds);

		return WorkspaceBean.toArray(this.workspaceDao
				.queryWorkspace(workspaceDAOQueryBean));
	}

	@Override
	protected WorkspaceResourceBean[] doGetWorkspaceResources(long workspaceId,
			WorkspaceResourceTypeEnum[] workspaceResourceTypeEnums)
			throws Exception {

		String[] resourceTypes;

		if (ArrayUtils.isNotEmpty(workspaceResourceTypeEnums)) {
			resourceTypes = new String[workspaceResourceTypeEnums.length];

			for (int i = 0; i < resourceTypes.length; i++) {
				resourceTypes[i] = workspaceResourceTypeEnums[i].getName();
			}

		} else {
			resourceTypes = new String[0];
		}

		WorkspaceResourceDAOQueryBean queryBean = new WorkspaceResourceDAOQueryBean();

		WorkspaceResourceDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andWorkspaceIdEqualTo(workspaceId);

		if (ArrayUtils.isNotEmpty(resourceTypes)) {
			criteria.andResourceTypeIn(resourceTypes);
		}

		queryBean.setSortProperty(IWorkspaceResourceDAO.ResourceType);

		queryBean.setSortProperty(IWorkspaceResourceDAO.OrderIndex);

		return WorkspaceResourceBean.toArray(this.workspaceResourceDao
				.queryWorkspaceResource(queryBean));
	}

	@Override
	protected void doAddNewWorkspace(long projectId, WorkspaceBean workspaceBean)
			throws Exception {

		String workspacePath = workspaceBean.getWorkspacePath();

		File rootPath = getWorkspaceRoot();

		File workspaceDir = new File(rootPath, workspacePath);

		if (workspaceDir.exists() == false) {
			FileUtils.forceMkdir(workspaceDir);
		}

		logger.debug("Workspace Path:" + workspaceDir.getPath());

		workspaceBean.setCreateDate(new Date());

		workspaceDao.insertWorkspace(workspaceBean.convertToWorkspace());

		ProjectWorkspaceRelate projectWorkspaceRelate = new ProjectWorkspaceRelate();

		projectWorkspaceRelate.setProjectId(projectId);

		projectWorkspaceRelate.setWorkspaceId(workspaceBean.getId());

		projectWorkspaceRelateDao
				.insertProjectWorkspaceRelate(projectWorkspaceRelate);

	}

	protected File getWorkspaceRoot() throws Exception {
		File rootPath = new File(WORKSPACE_ROOT_PATH);

		if (rootPath.exists() == false) {
			rootPath.mkdirs();
		}

		return rootPath;
	}

	@Override
	protected void doAddWorkspaceResource(
			WorkspaceResourceBean workspaceResourceBean) throws Exception {

		File resourcePathFile = getWorkspaceResourceFileObject(workspaceResourceBean);

		if (resourcePathFile.exists() == false) {
			FileUtils.forceMkdir(resourcePathFile);
		}

		this.workspaceResourceDao.insertWorkspaceResource(workspaceResourceBean
				.convertToWorkspaceResource());
	}

	@Override
	protected WorkspaceBean doGetWorkspaceById(long workspaceId)
			throws Exception {
		Workspace workspace = this.workspaceDao.findWorkspaceById(workspaceId);
		if (workspace == null) {
			return null;
		} else {
			return new WorkspaceBean(workspace);
		}

	}

	@Override
	protected void doAddWorkspaceResourceBusinessPackageRelate(long resourceId,
			long[] businessPackageIds) throws Exception {
		WorkspaceResourceBusinessPackageRelate[] relates = new WorkspaceResourceBusinessPackageRelate[businessPackageIds.length];

		for (int i = 0; i < relates.length; i++) {
			relates[i] = new WorkspaceResourceBusinessPackageRelate();
			relates[i].setWorkspaceResourceId(resourceId);
			relates[i].setBusinessPcakageId(businessPackageIds[i]);
		}

		this.workspaceResourceBusinessPackageRelateDao
				.batchInsertWorkspaceResourceBusinessPackageRelate(relates);
	}

	@Override
	protected void doRemoveWorkspaceResourceBusinessPackageRelates(
			long[] relateIds) throws Exception {

		WorkspaceResourceBusinessPackageRelateDAOQueryBean queryBean = new WorkspaceResourceBusinessPackageRelateDAOQueryBean();

		queryBean.createCriteria().andIdIn(relateIds);

		this.workspaceResourceBusinessPackageRelateDao
				.deleteWorkspaceResourceBusinessPackageRelate(queryBean);

	}

	@Override
	protected WorkspaceResourceBean doGetWorkspaceResourceById(
			long workspaceResourceId) throws Exception {
		WorkspaceResource workspaceResource = this.workspaceResourceDao
				.findWorkspaceResourceById(workspaceResourceId);
		return workspaceResource == null ? null : new WorkspaceResourceBean(
				workspaceResource);
	}

	@Override
	protected void doModifyWorkspaceResource(
			WorkspaceResourceBean workspaceResourceBean) throws Exception {

		WorkspaceResource workspaceResource = workspaceResourceBean
				.convertToWorkspaceResource();

		WorkspaceResourceBean oldWorkspaceResource = getWorkspaceResourceById(workspaceResource
				.getId());

		if (oldWorkspaceResource.getResourcePath().equals(
				workspaceResource.getResourcePath()) == false) {

			File resourcePathFile = getWorkspaceResourceFileObject(oldWorkspaceResource);

			File newResourcePathFile = getWorkspaceResourceFileObject(workspaceResourceBean);

			if (newResourcePathFile.exists() == false) {
				newResourcePathFile.mkdirs();
			}

			File[] srcFiles = resourcePathFile.listFiles();

			if (ArrayUtils.isNotEmpty(srcFiles)) {

				for (int i = 0; i < srcFiles.length; i++) {
					File file = srcFiles[i];
					if (file.isFile()) {
						FileUtils.moveFileToDirectory(file,
								newResourcePathFile, true);
					} else {
						FileUtils.moveDirectoryToDirectory(file,
								newResourcePathFile, true);
					}
				}

			}

			if (resourcePathFile.exists()) {
				resourcePathFile.delete();
			}

		}

		this.workspaceResourceDao.updateWorkspaceResource(workspaceResource);
	}

	@Override
	protected WorkspaceResourceBusinessPackageRelateBean[] doGetWorkspaceResourceBusinessPackageRelates(
			long resourceId) throws Exception {

		WorkspaceResourceBusinessPackageRelateDAOQueryBean queryBean = new WorkspaceResourceBusinessPackageRelateDAOQueryBean();

		queryBean.createCriteria().andWorkspaceResourceIdEqualTo(resourceId);

		queryBean
				.setSortProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageType);

		return WorkspaceResourceBusinessPackageRelateBean
				.toArray(this.workspaceResourceBusinessPackageRelateDao
						.queryWorkspaceResourceBusinessPackageRelate(queryBean));
	}

	@Override
	protected File doGetWorkspaceResourceFileObject(
			WorkspaceResourceBean workspaceResourceBean) throws Exception {
		Workspace workspace = this.workspaceDao
				.findWorkspaceById(workspaceResourceBean.getWorkspaceId());

		File rootFile = getWorkspaceRoot();

		StringBuffer resourcePath = new StringBuffer(
				workspace.getWorkspacePath());

		if (workspace.getWorkspacePath().endsWith("/") == false) {
			resourcePath.append("/");
		}

		if (workspaceResourceBean.getResourcePath().startsWith("/")) {
			resourcePath.append(workspaceResourceBean.getResourcePath()
					.substring(1));
		} else {
			resourcePath.append(workspaceResourceBean.getResourcePath());
		}

		File resourcePathFile = new File(rootFile, resourcePath.toString());

		return resourcePathFile;
	}

	@Override
	protected WorkspaceConfigBean[] doGetWorkspaceConfigs(long workspaceId,
			long parentWorkspaceConfigId) throws Exception {

		WorkspaceConfigDAOQueryBean queryBean = new WorkspaceConfigDAOQueryBean();

		queryBean.createCriteria().andParentConfigIdEqualTo(
				parentWorkspaceConfigId);

		return WorkspaceConfigBean.toArray(this.workspaceConfigDao
				.queryWorkspaceConfig(queryBean));
	}

	@Override
	protected WorkspaceConfigPropertyBean[] doGetWorkspaceConfigProperties(
			long workspaceId, long workspaceConfigId) throws Exception {

		WorkspaceConfigPropertyDAOQueryBean queryBean = new WorkspaceConfigPropertyDAOQueryBean();

		queryBean.createCriteria().andWorkspaceIdEqualTo(workspaceId)
				.andWorkspaceConfigIdEqualTo(workspaceConfigId);

		return WorkspaceConfigPropertyBean
				.toArray(this.workspaceConfigPropertyDao
						.queryWorkspaceConfigProperty(queryBean));
	}

	@Override
	protected void doSetWorkspaceConfigProperties(long workspaceId,
			long workspaceConfigId,
			WorkspaceConfigPropertyBean[] workspaceConfigPropertyBeans)
			throws Exception {

		WorkspaceConfigPropertyDAOQueryBean queryBean = new WorkspaceConfigPropertyDAOQueryBean();

		queryBean.createCriteria().andWorkspaceIdEqualTo(workspaceId)
				.andWorkspaceConfigIdEqualTo(workspaceConfigId);

		WorkspaceConfigProperty[] configProperties = new WorkspaceConfigProperty[workspaceConfigPropertyBeans.length];

		for (int i = 0; i < configProperties.length; i++) {
			configProperties[i] = workspaceConfigPropertyBeans[i]
					.convertToWorkspaceConfigProperty();
			configProperties[i].setWorkspaceId(workspaceId);
			configProperties[i].setWorkspaceConfigId(workspaceConfigId);
		}

		this.workspaceConfigPropertyDao.synchronizeWorkspaceConfigProperty(
				configProperties, queryBean);
	}

	@Override
	protected WorkspaceConfigPropertyBean[] doGetWorkspaceConfigPropertiesByConfigItem(
			long workspaceId, String configItem) throws Exception {

		WorkspaceConfigPropertyDAOQueryBean queryBean = new WorkspaceConfigPropertyDAOQueryBean();

		queryBean.createCriteria().andWorkspaceIdEqualTo(workspaceId)
				.andWorkspaceConfigItemEqualTo(configItem);

		return WorkspaceConfigPropertyBean
				.toArray(this.workspaceConfigPropertyDao
						.queryWorkspaceConfigProperty(queryBean));
	}

	@Override
	protected MiddleWareBean[] doGetServersByProjectIds(long[] projectIds,
			MiddleWareTypeEnum[] serverTypeEnums) throws Exception {

		MiddleWareDAOQueryBean queryBean = new MiddleWareDAOQueryBean();

		MiddleWareDAOQueryBean.Criteria criteria = queryBean.createCriteria();

		if (ArrayUtils.isNotEmpty(serverTypeEnums)) {
			String[] serverTypes = new String[serverTypeEnums.length];

			for (int i = 0; i < serverTypes.length; i++) {
				serverTypes[i] = serverTypeEnums[i].getName();
			}

			criteria.andTypeIn(serverTypes);
		}

		ProjectServerRelateDAOQueryBean joinQueryBean = new ProjectServerRelateDAOQueryBean();

		joinQueryBean.createCriteria().andProjectIdIn(projectIds)
				.andMiddleWareIdEqualToForeignKey(IMiddleWareDAO.Id);

		queryBean.addInnerJoin(IProjectServerRelateDAO.EntityName,
				joinQueryBean);

		return this.middleWareService.queryMiddleWare(queryBean);
	}

	@Override
	protected void doSetWorkspaceConfigPropertiesByConfigItem(long workspaceId,
			String configItem,
			WorkspaceConfigPropertyBean[] workspaceConfigPropertyBean)
			throws Exception {

		WorkspaceConfigDAOQueryBean queryBean = new WorkspaceConfigDAOQueryBean();

		queryBean.createCriteria().andConfigItemEqualTo(configItem);

		WorkspaceConfig[] workspaceConfig = this.workspaceConfigDao
				.queryWorkspaceConfig(queryBean);

		if (workspaceConfig.length > 0) {
			WorkspaceConfigProperty[] configProperties = new WorkspaceConfigProperty[workspaceConfigPropertyBean.length];
			for (int i = 0; i < workspaceConfigPropertyBean.length; i++) {
				WorkspaceConfigPropertyBean configPropertyBean = workspaceConfigPropertyBean[i];
				configPropertyBean.setWorkspaceId(workspaceId);
				configPropertyBean.setWorkspaceConfigId(workspaceConfig[0]
						.getId());

				configProperties[i] = configPropertyBean
						.convertToWorkspaceConfigProperty();
			}

			this.workspaceConfigPropertyDao
					.batchInsertWorkspaceConfigProperty(configProperties);
		}

	}

	@Override
	protected File doGetWorkspaceFileObject(WorkspaceBean workspace)
			throws Exception {

		File rootFile = getWorkspaceRoot();

		StringBuffer resourcePath = new StringBuffer(
				workspace.getWorkspacePath());

		File resourcePathFile = new File(rootFile, resourcePath.toString());

		return resourcePathFile;
	}

	@Override
	protected File doGetWorkspaceRootFileObject() throws Exception {
		return getWorkspaceRoot();
	}

	@Override
	protected void doDeleteWorkspace(long workspaceId) throws Exception {

		ProjectWorkspaceRelateDAOQueryBean queryBean = new ProjectWorkspaceRelateDAOQueryBean();

		queryBean.createCriteria().andWorkspaceIdEqualTo(workspaceId);

		this.projectWorkspaceRelateDao.deleteProjectWorkspaceRelate(queryBean);

		WorkspaceConfigPropertyDAOQueryBean configPropertyQueryBean = new WorkspaceConfigPropertyDAOQueryBean();

		configPropertyQueryBean.createCriteria().andWorkspaceIdEqualTo(
				workspaceId);

		this.workspaceConfigPropertyDao
				.deleteWorkspaceConfigProperty(configPropertyQueryBean);

		WorkspaceResourceDAOQueryBean resourceQueryBean = new WorkspaceResourceDAOQueryBean();

		resourceQueryBean.createCriteria().andWorkspaceIdEqualTo(workspaceId);

		deleteWorkspaceResource(resourceQueryBean);
		
		WorkspaceBean workspaceBean = getWorkspaceById(workspaceId);
		
		File workspaceDir = getWorkspaceFileObject(workspaceBean);
		
		FileUtils.forceDelete(workspaceDir);

		this.workspaceDao.deleteWorkspace(workspaceId);
		
		
	}

	protected void deleteWorkspaceResource(
			WorkspaceResourceDAOQueryBean queryBean) throws Exception {

		WorkspaceResource[] resources = this.workspaceResourceDao
				.queryWorkspaceResource(queryBean);

		StringBuffer resourcePath = new StringBuffer();
		for (int i = 0; i < resources.length; i++) {
			WorkspaceResource workspaceResource = resources[i];

			resourcePath.append(workspaceResource.getWorkspacePath());

			resourcePath.append(SystemUtils.FILE_SEPARATOR);

			resourcePath.append(workspaceResource.getResourcePath());

			File resourceFile = new File(getWorkspaceRoot(),
					resourcePath.toString());

			if (resourceFile.exists()) {
				resourceFile.delete();
			}

			resourcePath.delete(0, resourcePath.length());
		}

		this.workspaceResourceDao
				.deleteWorkspaceResourceBusinessPackageRelate(queryBean);

		this.workspaceResourceDao.deleteWorkspaceResource(queryBean);

	}

	@Override
	protected void doDeleteWorkspaceResource(long workspaceResourceId)
			throws Exception {

		WorkspaceResourceDAOQueryBean resourceQueryBean = new WorkspaceResourceDAOQueryBean();

		resourceQueryBean.createCriteria().andIdEqualTo(workspaceResourceId);

		deleteWorkspaceResource(resourceQueryBean);

	}

	@Override
	protected void doRemoveWorkspaceResource(long workspaceResourceId)
			throws Exception {
		WorkspaceResourceDAOQueryBean resourceQueryBean = new WorkspaceResourceDAOQueryBean();

		resourceQueryBean.createCriteria().andIdEqualTo(workspaceResourceId);

		this.workspaceResourceDao
				.deleteWorkspaceResourceBusinessPackageRelate(resourceQueryBean);

		this.workspaceResourceDao.deleteWorkspaceResource(resourceQueryBean);

	}

	@Override
	protected void doAddServerToProject(long middleWareServerId, long projectId)
			throws Exception {

		ProjectServerRelate projectServerRelate = new ProjectServerRelate();

		projectServerRelate.setProjectId(projectId);

		projectServerRelate.setMiddleWareId(middleWareServerId);

		this.projectServerRelateDao
				.insertProjectServerRelate(projectServerRelate);

	}

} // end WorkspaceServiceImpl
