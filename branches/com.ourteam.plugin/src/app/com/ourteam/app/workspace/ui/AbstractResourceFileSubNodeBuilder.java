package com.ourteam.app.workspace.ui;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ourteam.app.utils.SCMUtils;
import com.ourteam.app.utils.VersionInfo;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

abstract public class AbstractResourceFileSubNodeBuilder<ParentObject>
		implements ISubNodeBuilder<ParentObject, WorkspaceResourceFileObject> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractResourceFileSubNodeBuilder.class);

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private static Map<String, String> UI_CONFIG_NODE_MAP = new HashMap<String, String>();

	static {
		UI_CONFIG_NODE_MAP.put("<actions>", "UI_ACTION_CONFIG");
		UI_CONFIG_NODE_MAP.put("<actions/>", "UI_ACTION_CONFIG");
		UI_CONFIG_NODE_MAP.put("<listdata>", "UI_SELECT_LIST_CONFIG");
		UI_CONFIG_NODE_MAP.put("<listdata/>", "UI_SELECT_LIST_CONFIG");
		UI_CONFIG_NODE_MAP.put("<formSet>", "UI_FORM_CONFIG");
		UI_CONFIG_NODE_MAP.put("<formSet/>", "UI_FORM_CONFIG");
		UI_CONFIG_NODE_MAP.put("<tableList>", "UI_TABLE_CONFIG");
		UI_CONFIG_NODE_MAP.put("<tableList/>", "UI_TABLE_CONFIG");
		UI_CONFIG_NODE_MAP.put("<tabbed>", "UI_TAB_CONFIG");
		UI_CONFIG_NODE_MAP.put("<tabbed/>", "UI_TAB_CONFIG");
		UI_CONFIG_NODE_MAP.put("<tree", "UI_TREE_CONFIG");
		UI_CONFIG_NODE_MAP.put("<tree/>", "UI_TREE_CONFIG");

	}

	@Override
	public String getSubNodeDefineId(WorkspaceResourceFileObject nodeObject) {
		if (nodeObject.getResourceFile().isDirectory()) {
			if (nodeObject.getResourceType() != null
					&& nodeObject.getResourceType().equals(
							WorkspaceResourceTypeEnum.SOURCE_CODE.getName())) {
				return "SOURCE_PACKAGE";
			} else {
				return "DIRECTOR";
			}

		} else if (FilenameUtils.isExtension(nodeObject.getResourceFile()
				.getName(), "java")) {

			return "JAVA_FILE";

		} else if (FilenameUtils.isExtension(nodeObject.getResourceFile()
				.getName(), "jar")) {

			return "JAR_FILE";

		} else if (FilenameUtils.isExtension(nodeObject.getResourceFile()
				.getName(), "xml")) {

			try {
				String xmlContent = FileUtils.readFileToString(
						nodeObject.getResourceFile(), "UTF-8");

				Iterator<String> iterator = UI_CONFIG_NODE_MAP.keySet()
						.iterator();

				for (; iterator.hasNext();) {
					String key = iterator.next();
					if (StringUtils.containsIgnoreCase(xmlContent, key)) {
						return UI_CONFIG_NODE_MAP.get(key);
					}
				}

				return "FILE";

			} catch (Exception e) {
				logger.error(e);
				return "FILE";
			}

		} else {
			return "FILE";
		}

	}

	abstract protected String getFileType(ParentObject parentObject, File file);

	protected List<String> getFileNameFilters(ParentObject parentObject,
			File dir, String name) {
		List<String> list = new ArrayList<String>();

		list.add("CVS");

		list.add(".svn");

		return list;
	}

	protected WorkspaceResourceFileObject[] getFileList(
			final ParentObject parentObject, File parentFileObject,
			final FilenameFilter fileNameFilter) throws Exception {

		Map<String, VersionInfo> versionInfos = SCMUtils
				.getResourceVersionInfos(parentFileObject);

		String[] fileNames = parentFileObject.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				List<String> fileNameFilters = getFileNameFilters(parentObject,
						dir, name);

				File soureceFile = new File(dir, name);

				try {
					WorkspaceBean workspaceBean = null;

					if (parentObject instanceof WorkspaceBean) {
						workspaceBean = (WorkspaceBean) parentObject;
					} else if (parentObject instanceof WorkspaceResourceBean) {
						workspaceBean = WORKSPACE_SERVICE
								.getWorkspaceById(((WorkspaceResourceBean) parentObject)
										.getWorkspaceId());
					} else if (parentObject instanceof WorkspaceResourceFileObject) {
						workspaceBean = WORKSPACE_SERVICE
								.getWorkspaceById(((WorkspaceResourceFileObject) parentObject)
										.getWorkspaceId());
					}

					File file = WORKSPACE_SERVICE
							.getWorkspaceFileObject(workspaceBean);

					WorkspaceResourceBean[] resourceBeans = WORKSPACE_SERVICE.getWorkspaceResources(
							workspaceBean.getId(),
							new WorkspaceResourceTypeEnum[] {
									WorkspaceResourceTypeEnum.SOURCE_CODE,
									WorkspaceResourceTypeEnum.DEPEND_LIBARY });

					for (int i = 0; i < resourceBeans.length; i++) {
						WorkspaceResourceBean workspaceResourceBean = resourceBeans[i];
						File resourceFile = new File(file,
								workspaceResourceBean.getResourcePath());
						if (soureceFile.equals(resourceFile)) {
							fileNameFilters.add(name);
						}

					}

				} catch (Exception e) {
					logger.error("getFileNameFilters Error", e);
				}

				boolean flag = true;

				if (fileNameFilter != null) {
					flag = fileNameFilter.accept(dir, name);
				}

				flag = flag && !fileNameFilters.contains(name);

				return flag;
			}
		});

		List<WorkspaceResourceFileObject> resourceFileObjects = new ArrayList<WorkspaceResourceFileObject>();

		List<WorkspaceResourceFileObject> resourceDirObjects = new ArrayList<WorkspaceResourceFileObject>();

		if (ArrayUtils.isNotEmpty(fileNames)) {
			WorkspaceResourceFileObject[] fileObjects = new WorkspaceResourceFileObject[fileNames.length];

			for (int i = 0; i < fileObjects.length; i++) {

				File file = new File(parentFileObject, fileNames[i]);

				WorkspaceResourceFileObject resourceFileObject = new WorkspaceResourceFileObject(
						file);

				if (parentObject instanceof WorkspaceBean) {
					resourceFileObject
							.setWorkspaceId(((WorkspaceBean) parentObject)
									.getId());
				} else if (parentObject instanceof WorkspaceResourceBean) {
					resourceFileObject
							.setWorkspaceId(((WorkspaceResourceBean) parentObject)
									.getWorkspaceId());
				} else if (parentObject instanceof WorkspaceResourceFileObject) {
					resourceFileObject
							.setWorkspaceId(((WorkspaceResourceFileObject) parentObject)
									.getWorkspaceId());
				}

				String resourceType = getFileType(parentObject, file);

				resourceFileObject.setResourceType(resourceType);

				if (file.isFile()) {
					VersionInfo versionInfo = versionInfos.get(file.getName());
					if (versionInfo != null) {
						resourceFileObject.setVersionInfo(versionInfo);
					} 
					resourceFileObjects.add(resourceFileObject);
				} else {
					resourceDirObjects.add(resourceFileObject);
				}

			}
		}

		resourceDirObjects.addAll(resourceFileObjects);

		return (WorkspaceResourceFileObject[]) resourceDirObjects
				.toArray(new WorkspaceResourceFileObject[resourceDirObjects
						.size()]);
	}

	@Override
	public String[] getSubNodeActionGroupIds(
			WorkspaceResourceFileObject nodeObject) {
		return new String[] { "resourceActionGroup" };
	}

}
