package com.ourteam.app.middleware;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.MenuBuilder;
import net.ui.eclipse.editorpart.IEditorProvider;
import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.tree.TreeBean;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.part.ViewPart;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.middleware.editor.MiddleWareManageToolExecuteBean;
import com.ourteam.app.middleware.editor.MiddleWareManageToolExecuteEditorInput;
import com.ourteam.app.middleware.editor.ServerEditorHelper;
import com.ourteam.app.middleware.ui.ServerSubNodeBuilder;
import com.ourteam.app.workspace.AbstractProjectFilterOpenEditorTreeViewPart;
import com.ourteam.app.workspace.editor.AddProjectServerWizardProvider;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolGroupBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class ServerExplorerViewPart extends
		AbstractProjectFilterOpenEditorTreeViewPart {

	@Override
	protected ITreeViewProvider getTreeViewProvider() {
		return new ServerTreeProvider();
	}

	@Override
	protected List<IEditorProvider<TreeNodeItem>> getEditorProviderList(
			TreeNodeItem item) {
		return ServerEditorHelper.getServerEditorProviderList();
	}

	@Override
	protected String[] getToolbarActionGrous() {
		return new String[] { "serverExplorerViewActionGroup" };
	}

	@Override
	protected String[] getMenuActionGrous() {
		return null;
	}

	class ServerTreeProvider extends AbstractTreeTableViewProvider {

		@Override
		public TreeBean getTreeConfig() {

			return UIConfigFactory.getInstance().getTreeConfig(
					"/ui/middleware/server_explorer.tree");
		}

		@Override
		public void initSubNodeBuilder(String id, ISubNodeBuilder builder) {
			if (builder instanceof ServerSubNodeBuilder) {
				((ServerSubNodeBuilder) builder)
						.setProjectBeans(getSelectedProjects());
			}
		}

		@Override
		public int getDefaultExpandToLevel() {
			return TreeViewer.ALL_LEVELS;
		}

		public void buildContextMenu(IMenuManager menuMgr) throws Exception {

			Object selectedObj = getSelectedUserObject();

			if (selectedObj != null && selectedObj instanceof MiddleWareBean) {
				MenuBuilder contextMenuBuilder = new MenuBuilder(
						menuMgr,
						new ActionGroupBean[] { buildActionGroup((MiddleWareBean) selectedObj) },
						getActionHandler(), null);

				contextMenuBuilder.updateActionStatus();
			}

		}

	}

	private ActionGroupBean buildActionGroup(MiddleWareBean nodeObject) {
		try {

			ActionGroupBean actionGroupBean = new ActionGroupBean();

			MiddleWareToolGroupBean[] toolGroupBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.getMiddleWareToolGroups(nodeObject.getProviderId(), 0);

			for (int i = 0; i < toolGroupBeans.length; i++) {
				MiddleWareToolGroupBean middleWareToolGroupBean = toolGroupBeans[i];

				ActionBean actionBean = new ActionBean();

				actionBean.setLabel(middleWareToolGroupBean.getGroupName());
				actionBean.setDesc(middleWareToolGroupBean.getRemarks());
				actionBean.setIcon("middle_ware_tool_group");

				buildSubToolGroup(actionBean, middleWareToolGroupBean);

				buildTool(actionBean, middleWareToolGroupBean);

				actionGroupBean.addActionBean(actionBean);

			}

			return actionGroupBean;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void buildTool(final ActionBean parentActionBean,
			final MiddleWareToolGroupBean parentMiddleWareToolGroupBean)
			throws Exception {
		MiddleWareToolBean[] middleWareToolBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareTools(parentMiddleWareToolGroupBean.getId());

		for (int j = 0; j < middleWareToolBeans.length; j++) {
			MiddleWareToolBean middleWareToolBean = middleWareToolBeans[j];
			ActionBean actionBean = new ActionBean();
			actionBean.setId(String.valueOf(middleWareToolBean.getId()));
			actionBean.setLabel(middleWareToolBean.getToolName());
			actionBean.setDesc(middleWareToolBean.getRemarks());
			actionBean.setType("radio");
			actionBean.setHandler("handlerManageTool");
			actionBean.setIcon("middle_ware_tool");

			parentActionBean.addSubActionBean(actionBean);
		}
	}

	private void buildSubToolGroup(final ActionBean parentActionBean,
			final MiddleWareToolGroupBean parentMiddleWareToolGroupBean)
			throws Exception {
		MiddleWareToolGroupBean[] toolGroupBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolGroups(
						parentMiddleWareToolGroupBean.getProviderId(),
						parentMiddleWareToolGroupBean.getId());

		for (int i = 0; i < toolGroupBeans.length; i++) {
			MiddleWareToolGroupBean middleWareToolGroupBean = toolGroupBeans[i];
			ActionBean actionBean = new ActionBean();

			actionBean.setLabel(middleWareToolGroupBean.getGroupName());
			actionBean.setDesc(middleWareToolGroupBean.getRemarks());
			actionBean.setIcon("middle_ware_tool_group");

			parentActionBean.addSubActionBean(actionBean);

			buildTool(actionBean, middleWareToolGroupBean);

			buildSubToolGroup(actionBean, middleWareToolGroupBean);
		}
	}

	@Override
	protected IActionHandler getActionHandler(ViewPart viewPart) {
		return new ServerExplorerActionHandler(this);
	}

	class ServerExplorerActionHandler extends
			ProjectFilterExplorerActionHandler {

		public ServerExplorerActionHandler(AbstractTreeViewPart treeViewPart) {
			super(treeViewPart);
		}

		public void addNewDataBaseServer(ActionEvent actionEvent)
				throws Exception {
			addNewNetServer(actionEvent);
		}

		public void addNewCVSServer(ActionEvent actionEvent) throws Exception {
			addNewNetServer(actionEvent);
		}

		public void addNewSVNServer(ActionEvent actionEvent) throws Exception {
			addNewNetServer(actionEvent);
		}

		public void addNewAppServer(ActionEvent actionEvent) throws Exception {
			addNewNetServer(actionEvent);
		}

		public void deleteDataBaseServer(ActionEvent actionEvent)
				throws Exception {
			deleteNetServer(actionEvent);
		}

		public void deleteCVSServer(ActionEvent actionEvent) throws Exception {
			deleteNetServer(actionEvent);
		}

		public void deleteSVNServer(ActionEvent actionEvent) throws Exception {
			deleteNetServer(actionEvent);
		}

		public void deleteAppServer(ActionEvent actionEvent) throws Exception {
			deleteNetServer(actionEvent);
		}

		protected void deleteNetServer(ActionEvent actionEvent)
				throws Exception {
			MiddleWareBean middleWareBean = (MiddleWareBean) getSelectedUserObject();

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.deleteMiddleWare(new long[] { middleWareBean.getId() });

			refreshSelectedParentTreeNode();
		}

		protected void addNewNetServer(ActionEvent actionEvent)
				throws Exception {
			MiddleWareTypeEnum middleWareTypeEnum = (MiddleWareTypeEnum) getSelectedUserObject();

			if (SWTUtils.openWizardDialog(getSite().getShell(),
					new AddProjectServerWizardProvider(middleWareTypeEnum, 0))) {
				getTreeComposite().refreshTree();
			}
		}

		public void handlerManageTool(ActionEvent actionEvent) throws Exception {
			long selectedToolId = Long.valueOf(actionEvent.getActionBean()
					.getId());

			MiddleWareBean middleWareBean = (MiddleWareBean) getSelectedUserObject();

			MiddleWareToolBean middleWareToolBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.getMiddleWareToolById(selectedToolId);

			MiddleWareManageToolExecuteBean dataModel = new MiddleWareManageToolExecuteBean(
					middleWareBean, middleWareToolBean);

			MiddleWareManageToolExecuteEditorInput editorInput = new MiddleWareManageToolExecuteEditorInput(
					dataModel);

			editorInput.setImageDescriptor(ImageChache
					.getImageDescriptor("middle_ware_tool"));

			getSite().getPage().openEditor(editorInput,
					MultiPageEditorPartAgent.EDITOR_ID);

		}
	}

}
