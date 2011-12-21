package com.ourteam.app.workspace.editor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.editorpart.AbstractDataModelEditorInput;
import net.ui.eclipse.editorpart.AbstractDataModelMultiPageEditorInput;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.eclipse.editorpart.IEditorAgentInput;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.model.tree.NodeBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ourteam.app.modelbase.editor.AbstractModelObjectEditorProvider;
import com.ourteam.app.utils.ResourceDiffentInfomation;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class WorkspaceEditorHelper {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(WorkspaceEditorHelper.class);

	private static List<IEditorProvider<TreeNodeItem>> workspaceEditorProviderList = new ArrayList<IEditorProvider<TreeNodeItem>>();

	static {
		workspaceEditorProviderList.add(new SourceCodeResourceEditorProvider());
		workspaceEditorProviderList.add(new FileResourceEditorProvider("FILE",
				"textFileResourceEditorTab"));
		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"JAVA_FILE", "javaFileResourceEditorTab"));

		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"UI_ACTION_CONFIG", "uiActionConfigEditorTab"));

		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"UI_SELECT_LIST_CONFIG", "uiSelectListConfigEditorTab"));

		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"UI_FORM_CONFIG", "uiFormConfigEditorTab"));

		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"UI_TABLE_CONFIG", "uiTableConfigEditorTab"));

		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"UI_TAB_CONFIG", "uiTabConfigListEditorTab"));

		workspaceEditorProviderList.add(new FileResourceEditorProvider(
				"UI_TREE_CONFIG", "uiTreeConfigEditorTab"));

	}

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	public static List<IEditorProvider<TreeNodeItem>> getWorkspaceEditorProviderList() {
		return workspaceEditorProviderList;
	}

	static public class WorkspaceResourceEditorInput extends
			AbstractDataModelMultiPageEditorInput<WorkspaceResourceBean> {

		public WorkspaceResourceEditorInput(WorkspaceResourceBean dataModel) {
			super(dataModel);
		}

		@Override
		public boolean exists() {
			return this.getDataModel().getId() != 0;
		}

		@Override
		public String getName() {
			try {
				WorkspaceBean workspaceBean = WorkspaceServiceFactory
						.getWorkspaceService().getWorkspaceById(
								this.getDataModel().getWorkspaceId());

				return workspaceBean.getName() + "/"
						+ this.getDataModel().getName();

			} catch (Exception e) {
				logger.error("Get Workspace Resource Name Error", e);
				return "";
			}

		}

		@Override
		public String getToolTipText() {
			if (this.getDataModel().getDescription() != null) {
				return this.getDataModel().getDescription();
			} else {
				return "";
			}

		}

		@Override
		protected WorkspaceResourceBean doReloadDataModel() throws Exception {
			return WORKSPACE_SERVICE.getWorkspaceResourceById(this
					.getDataModel().getId());
		}

		@Override
		protected String getTabbedPaneConfigId() {
			return "workspaceSourceCodeResourceEditTab";
		}
	}

	static public class SourceCodeResourceEditorProvider extends
			AbstractModelObjectEditorProvider<WorkspaceResourceBean> {

		@Override
		public String getEditorId() {
			return MultiPageEditorPartAgent.EDITOR_ID;
		}

		@Override
		protected String getModelObjectType() {
			return WorkspaceResourceTypeEnum.SOURCE_CODE.getName();
		}

		@Override
		protected IDataModelEditorInput<WorkspaceResourceBean> getModelObjectEditorInput(
				WorkspaceResourceBean editObject, NodeBean nodeBean) {
			return new WorkspaceResourceEditorInput(editObject);
		}

	}

	static public class FileResourceEditorInput extends
			AbstractDataModelMultiPageEditorInput<WorkspaceResourceFileObject> {

		private String tabbedPaneConfigId;

		public FileResourceEditorInput(WorkspaceResourceFileObject dataModel,
				String tabbedPaneConfigId) {
			super(dataModel);
			this.tabbedPaneConfigId = tabbedPaneConfigId;
		}

		@Override
		public boolean exists() {
			return getDataModel().getResourceFile().exists();
		}

		@Override
		public String getName() {
			return getDataModel().getResourceFile().getName();
		}

		@Override
		public String getToolTipText() {
			return getDataModel().getResourceFile().getPath();
		}

		@Override
		protected WorkspaceResourceFileObject doReloadDataModel()
				throws Exception {
			File file = new File(getDataModel().getResourceFile()
					.getAbsolutePath());
			getDataModel().setResourceFile(file);
			return getDataModel();
		}

		@Override
		protected String getTabbedPaneConfigId() {
			return tabbedPaneConfigId;
		}
	}

	static public class FileResourceEditorProvider extends
			AbstractModelObjectEditorProvider<WorkspaceResourceFileObject> {

		private String modelObjectType;

		private String editorTabId;

		public FileResourceEditorProvider(String modelObjectType,
				String editorTabId) {
			super();
			this.modelObjectType = modelObjectType;
			this.editorTabId = editorTabId;
		}

		public String getModelObjectType() {
			return modelObjectType;
		}

		@Override
		public String getEditorId() {
			return MultiPageEditorPartAgent.EDITOR_ID;
		}

		@Override
		protected IDataModelEditorInput<WorkspaceResourceFileObject> getModelObjectEditorInput(
				WorkspaceResourceFileObject editObject, NodeBean nodeBean) {
			return new FileResourceEditorInput(editObject, this.editorTabId);
		}

	}

	static public class ResourceDiffentInfoEditorInput extends
			AbstractDataModelEditorInput<ResourceDiffentInfomation> implements
			IEditorAgentInput {

		public ResourceDiffentInfoEditorInput(
				ResourceDiffentInfomation dataModel) {
			super(dataModel);
		}

		@Override
		public boolean isDataModelEquals(ResourceDiffentInfomation dataModel) {
			boolean flag = getDataModel()
					.getResourceFileObject()
					.getResourceFile()
					.equals(dataModel.getResourceFileObject().getResourceFile());

			flag = flag
					&& getDataModel().getLeftVersion().equals(
							dataModel.getLeftVersion());

			flag = flag
					&& getDataModel().getRightVersion().equals(
							dataModel.getRightVersion());

			return flag;
		}

		@Override
		public boolean exists() {
			return true;
		}

		@Override
		public String getName() {
			return getDataModel().getResourceFileObject().getName() + " "
					+ getDataModel().getLeftVersion() + "和"
					+ getDataModel().getRightVersion() + "比较";
		}

		@Override
		public String getToolTipText() {
			return getName();
		}

		@Override
		protected ResourceDiffentInfomation doReloadDataModel()
				throws Exception {
			return getDataModel();
		}

		@Override
		public AbstractEditorPart<?, ?> getEditorPart() {
			return new FileResourceDiffentEditor();
		}

	}

}
